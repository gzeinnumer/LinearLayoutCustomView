package com.gzeinnumer.linearlayoutcustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class LinearLayoutCustomView extends LinearLayout {
    private final Context _context;
    private TextView textView;

    public LinearLayoutCustomView(Context context) {
        this(context, null);
    }

    public LinearLayoutCustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this._context = context;
        initView();
    }

    private void initView() {
        inflate(_context, R.layout.linear_layout_custom_view, this);

        textView = findViewById(R.id.textView);
    }
}
