package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* renamed from: X.7YV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YV {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public String LJFF;

    public C7YV(String str) {
        this.LIZ = -1;
        this.LJ = -1;
        this.LIZ = CastIntegerProtector.valueOf(str.substring(0, 1)).intValue();
        this.LJ = CastIntegerProtector.valueOf(str.substring(1, 2)).intValue();
        this.LIZJ = CastIntegerProtector.valueOf(str.substring(2, 3)).intValue();
        this.LIZLLL = CastIntegerProtector.valueOf(str.substring(3, 4)).intValue();
        this.LIZIZ = str.substring(18);
    }
}
