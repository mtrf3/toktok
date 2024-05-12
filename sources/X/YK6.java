package X;

import android.util.Property;

/* loaded from: classes16.dex */
public final class YK6 extends Property<YK4, Float> {
    public final /* synthetic */ YK3 LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YK6(YK3 yk3) {
        super(Float.TYPE, "icon_scale");
        this.LIZ = yk3;
    }

    @Override // android.util.Property
    public final Float get(YK4 yk4) {
        float f;
        YK4 yk42 = yk4;
        if (yk42 != null) {
            f = yk42.LJIIJ;
        } else {
            f = 0.0f;
        }
        return Float.valueOf(f);
    }

    @Override // android.util.Property
    public final void set(YK4 yk4, Float f) {
        YK4 yk42 = yk4;
        Float f2 = f;
        if (yk42 == null || f2 == null) {
            return;
        }
        yk42.LJIIJ = f2.floatValue();
        this.LIZ.invalidate();
    }
}
