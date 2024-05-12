package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.o;

/* renamed from: X.1e6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37821e6 implements C12E {
    public C266112r LIZ;
    public C266112r LIZIZ;
    public C266112r LIZJ;
    public C266012q LIZLLL;

    @Override // X.C12E
    public final void LIZ() {
        C266112r c266112r = this.LIZ;
        if (c266112r != null) {
            c266112r.LIZ();
            C266112r c266112r2 = this.LIZIZ;
            if (c266112r2 != null) {
                c266112r2.LIZ();
                C266112r c266112r3 = this.LIZJ;
                if (c266112r3 != null) {
                    c266112r3.LIZ();
                    LJFF();
                    return;
                } else {
                    o.LJIJI("small");
                    throw null;
                }
            }
            o.LJIJI("floating");
            throw null;
        }
        o.LJIJI("snapped");
        throw null;
    }

    @Override // X.C12E
    public final void LIZJ() {
        C266112r c266112r = this.LIZ;
        if (c266112r != null) {
            c266112r.LIZ();
            C266112r c266112r2 = this.LIZIZ;
            if (c266112r2 != null) {
                c266112r2.LIZ();
                C266112r c266112r3 = this.LIZJ;
                if (c266112r3 != null) {
                    EnumC264912f enumC264912f = c266112r3.LIZ;
                    EnumC264912f enumC264912f2 = EnumC264912f.STARTED;
                    if (enumC264912f != enumC264912f2) {
                        c266112r3.LIZ = enumC264912f2;
                        c266112r3.LIZJ = System.currentTimeMillis();
                    }
                    LJFF();
                    return;
                }
                o.LJIJI("small");
                throw null;
            }
            o.LJIJI("floating");
            throw null;
        }
        o.LJIJI("snapped");
        throw null;
    }

    @Override // X.C12E
    public final void LIZLLL() {
        C266112r c266112r = this.LIZ;
        if (c266112r != null) {
            EnumC264912f enumC264912f = c266112r.LIZ;
            EnumC264912f enumC264912f2 = EnumC264912f.STARTED;
            if (enumC264912f != enumC264912f2) {
                c266112r.LIZ = enumC264912f2;
                c266112r.LIZJ = System.currentTimeMillis();
            }
            C266112r c266112r2 = this.LIZIZ;
            if (c266112r2 != null) {
                c266112r2.LIZ();
                C266112r c266112r3 = this.LIZJ;
                if (c266112r3 != null) {
                    c266112r3.LIZ();
                    LJFF();
                    return;
                } else {
                    o.LJIJI("small");
                    throw null;
                }
            }
            o.LJIJI("floating");
            throw null;
        }
        o.LJIJI("snapped");
        throw null;
    }

    @Override // X.C12E
    public final void LJ() {
        C266112r c266112r = this.LIZ;
        if (c266112r != null) {
            c266112r.LIZ();
            C266112r c266112r2 = this.LIZIZ;
            if (c266112r2 != null) {
                EnumC264912f enumC264912f = c266112r2.LIZ;
                EnumC264912f enumC264912f2 = EnumC264912f.STARTED;
                if (enumC264912f != enumC264912f2) {
                    c266112r2.LIZ = enumC264912f2;
                    c266112r2.LIZJ = System.currentTimeMillis();
                }
                C266112r c266112r3 = this.LIZJ;
                if (c266112r3 != null) {
                    c266112r3.LIZ();
                    LJFF();
                    return;
                } else {
                    o.LJIJI("small");
                    throw null;
                }
            }
            o.LJIJI("floating");
            throw null;
        }
        o.LJIJI("snapped");
        throw null;
    }

    public final void LJFF() {
        C266012q c266012q = this.LIZLLL;
        if (c266012q != null) {
            C266112r c266112r = this.LIZ;
            if (c266112r != null) {
                long j = c266112r.LIZIZ;
                c266012q.LIZIZ = j;
                C266112r c266112r2 = this.LIZIZ;
                if (c266112r2 != null) {
                    long j2 = c266112r2.LIZIZ;
                    c266012q.LIZLLL = j2;
                    C266112r c266112r3 = this.LIZJ;
                    if (c266112r3 != null) {
                        long j3 = c266112r3.LIZIZ;
                        c266012q.LJFF = j3;
                        long j4 = j2 + j + j3;
                        c266012q.LIZ = j4;
                        if (j4 > 0) {
                            c266012q.LIZJ = LJI(((float) j) / ((float) j4));
                            c266012q.LJ = LJI(((float) c266012q.LIZLLL) / ((float) c266012q.LIZ));
                            LJI(((float) c266012q.LJFF) / ((float) c266012q.LIZ));
                        }
                        C0NB.LIZIZ("GameUiTimeLogger", c266012q.toString());
                        return;
                    }
                    o.LJIJI("small");
                    throw null;
                }
                o.LJIJI("floating");
                throw null;
            }
            o.LJIJI("snapped");
            throw null;
        }
    }

    @Override // X.C12E
    public final void onInit() {
        this.LIZJ = new C266112r();
        this.LIZ = new C266112r();
        this.LIZIZ = new C266112r();
        this.LIZLLL = new C266012q();
    }

    @Override // X.C12E
    public final void LIZIZ() {
        LJFF();
        C266112r c266112r = this.LIZ;
        if (c266112r != null) {
            EnumC264912f enumC264912f = EnumC264912f.RESET;
            c266112r.LIZ = enumC264912f;
            c266112r.LIZIZ = 0L;
            c266112r.LIZJ = 0L;
            C266112r c266112r2 = this.LIZIZ;
            if (c266112r2 != null) {
                c266112r2.LIZ = enumC264912f;
                c266112r2.LIZIZ = 0L;
                c266112r2.LIZJ = 0L;
                C266112r c266112r3 = this.LIZJ;
                if (c266112r3 != null) {
                    c266112r3.LIZ = enumC264912f;
                    c266112r3.LIZIZ = 0L;
                    c266112r3.LIZJ = 0L;
                    return;
                }
                o.LJIJI("small");
                throw null;
            }
            o.LJIJI("floating");
            throw null;
        }
        o.LJIJI("snapped");
        throw null;
    }

    public static float LJI(float f) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            String format = decimalFormat.format(Float.valueOf(f));
            o.LJIIIIZZ(format, "df.format(number)");
            return CastFloatProtector.parseFloat(format);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
