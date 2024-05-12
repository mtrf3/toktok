package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.89v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2068389v {
    public int LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public Integer LIZLLL;
    public Integer LJ;
    public boolean LJFF;
    public CharSequence LJI;

    public final SY9 LIZ(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        SY9 sy9 = new SY9(ctx, this.LIZ);
        int i = this.LIZIZ;
        if (i >= 0) {
            sy9.LJI(i);
        }
        int i2 = this.LIZJ;
        if (i2 >= 0) {
            sy9.LIZLLL(i2);
        }
        Integer num = this.LIZLLL;
        if (num != null) {
            sy9.LJ(num.intValue());
        }
        Integer num2 = this.LJ;
        if (num2 != null) {
            sy9.LJFF(num2.intValue(), ctx);
        }
        sy9.LIZJ(this.LJFF);
        sy9.LJIILL = this.LJI;
        return sy9;
    }

    public final C8FR LIZIZ(int i, Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        SY9 LIZ = LIZ(ctx);
        LIZ.setBounds(0, 0, LIZ.LIZIZ(), LIZ.LIZ());
        return new C8FR(LIZ, i);
    }
}
