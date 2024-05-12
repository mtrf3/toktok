package X;

import android.util.Property;
import android.widget.TextView;

/* loaded from: classes6.dex */
public final class CK8 extends Property<TextView, Integer> {
    public CK8(Class cls) {
        super(cls, "scrollX");
    }

    @Override // android.util.Property
    public final Integer get(TextView textView) {
        return Integer.valueOf(textView.getScrollX());
    }

    @Override // android.util.Property
    public final void set(TextView textView, Integer num) {
        textView.setScrollX(num.intValue());
    }
}
