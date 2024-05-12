package X;

import android.R;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import kotlin.jvm.internal.o;

/* renamed from: X.G3v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40911G3v implements G42 {
    public final Class<TextView> LIZ = TextView.class;

    @Override // X.G42
    public final View LIZ(View view, AttributeSet attrs) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(attrs, "attrs");
        if (!this.LIZ.isInstance(view)) {
            return view;
        }
        TextView textView = (TextView) view;
        Resources resources = textView.getContext().getResources();
        int attributeCount = attrs.getAttributeCount();
        int i = 0;
        while (i < attributeCount) {
            int i2 = i + 1;
            int attributeResourceValue = attrs.getAttributeResourceValue(i, 0);
            int i3 = C40905G3p.LJII;
            if (i3 != 0 && (attributeResourceValue >>> 16) == i3) {
                CharSequence text = resources.getText(attributeResourceValue);
                o.LJIIIIZZ(text, "resources.getText(id)");
                switch (attrs.getAttributeNameResource(i)) {
                    case R.attr.textOn:
                        if (textView instanceof Switch) {
                            ((Switch) textView).setTextOn(text);
                            break;
                        } else if (!(textView instanceof ToggleButton)) {
                            break;
                        } else {
                            ((ToggleButton) textView).setTextOn(text);
                            break;
                        }
                    case R.attr.textOff:
                        if (textView instanceof Switch) {
                            ((Switch) textView).setTextOff(text);
                            break;
                        } else if (!(textView instanceof ToggleButton)) {
                            break;
                        } else {
                            ((ToggleButton) textView).setTextOff(text);
                            break;
                        }
                    case R.attr.text:
                        textView.setText(text);
                        break;
                    case R.attr.hint:
                        textView.setHint(text);
                        break;
                }
            }
            i = i2;
        }
        return textView;
    }
}
