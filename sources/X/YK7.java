package X;

import android.util.Property;

/* loaded from: classes16.dex */
public final class YK7 extends Property<YK4, Integer> {
    public final /* synthetic */ YK3 LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YK7(YK3 yk3) {
        super(Integer.TYPE, "avatar_alpha");
        this.LIZ = yk3;
    }

    @Override // android.util.Property
    public final Integer get(YK4 yk4) {
        int i;
        YK4 yk42 = yk4;
        if (yk42 != null) {
            i = yk42.LJIIJJI;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // android.util.Property
    public final void set(YK4 yk4, Integer num) {
        YK4 yk42 = yk4;
        Integer num2 = num;
        if (yk42 == null || num2 == null) {
            return;
        }
        yk42.LJIIJJI = num2.intValue();
        this.LIZ.invalidate();
    }
}
