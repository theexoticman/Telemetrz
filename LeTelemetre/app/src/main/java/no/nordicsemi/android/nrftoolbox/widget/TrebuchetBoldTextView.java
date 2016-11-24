package no.nordicsemi.android.nrftoolbox.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import no.nordicsemi.android.nrftoolbox.C0063R;

public class TrebuchetBoldTextView extends TextView {
    public TrebuchetBoldTextView(Context context) {
        super(context);
        init();
    }

    public TrebuchetBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TrebuchetBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private final void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), getContext().getString(C0063R.string.font_path)));
        }
    }
}
