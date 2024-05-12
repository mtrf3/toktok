package X;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: X.UEe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C76852UEe extends Property<Drawable, Integer> {
    public C76852UEe(Class cls) {
        super(cls, "drawable_alpha");
    }

    @Override // android.util.Property
    public final Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
