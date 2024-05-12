package X;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: X.UEd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76851UEd extends Property<Drawable, Integer> {
    public static final C76851UEd LIZ = new C76851UEd();

    public C76851UEd() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
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
