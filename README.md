# LinearLayoutCustomView

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    android:orientation="vertical" xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/textView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

</LinearLayout>
```

```java
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
```

---

```
Copyright 2021 M. Fadli Zein
```