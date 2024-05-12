package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215958dj extends C216028dq implements InterfaceC215558d5 {
    public String LJIIIIZZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public String LJIILIIL;
    public CharSequence LJIILL;
    public Integer LJIILLIIL;
    public Integer LJIIZILJ;
    public Float LJIJ;
    public InterfaceC215558d5 LJIJJ;
    public final float LJIL;
    public final float LJJ;
    public EnumC215878db LJIIIZ = EnumC215878db.NORMAL;
    public String LJIILJJIL = "";
    public Float LJIJI = Float.valueOf(0.75f);
    public int LJIJJLI = 255;

    @Override // X.InterfaceC215558d5
    public final C215958dj getData() {
        return this;
    }

    @Override // X.C216028dq
    public final int LJIIIZ() {
        float f;
        InterfaceC215558d5.LIZ.getClass();
        if (!C215688dI.LIZIZ.containsKey(this.LJIILJJIL) || this.LJIIL || this.LJIIL) {
            f = 1.0f;
        } else {
            f = 0.45f;
        }
        if (!o.LIZ(f, this.LJIJI)) {
            this.LJIJI = Float.valueOf(f);
            this.LJIJJLI = (int) (f * 255);
        }
        return this.LJIJJLI;
    }

    public C215958dj() {
        C216168e4 c216168e4;
        C216168e4 c216168e42;
        boolean z = C61447O9r.LJIIIZ;
        if (z) {
            c216168e4 = C216228eA.LJIILJJIL;
        } else {
            c216168e4 = C216068du.LJIILJJIL;
        }
        this.LJIL = c216168e4.LIZIZ();
        if (z) {
            c216168e42 = C216228eA.LJIILJJIL;
        } else {
            c216168e42 = C216068du.LJIILJJIL;
        }
        this.LJJ = c216168e42.LIZ();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" id: ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append("\n showAtTime: ");
        LIZ.append(this.LIZJ);
        LIZ.append("\n text: ");
        LIZ.append((Object) this.LJIILL);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC215558d5
    public final boolean L7() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC215558d5
    public final InterfaceC215558d5 LIZIZ() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC215558d5
    public final String LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC215558d5
    public final long LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC215558d5
    public final boolean LJFF() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC215558d5
    public final String LJI() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC215558d5
    public final String getAid() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC215558d5
    public final EnumC215878db getType() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC215558d5
    public final void LIZ(boolean z) {
        if (z) {
            InterfaceC215558d5.LIZ.getClass();
            HashMap<String, String> hashMap = C215688dI.LIZIZ;
            String str = this.LJIILJJIL;
            String str2 = this.LJIIIIZZ;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put(str, str2);
            this.LJFF = 100;
        } else {
            InterfaceC215558d5.LIZ.getClass();
            C215688dI.LIZIZ.remove(this.LJIILJJIL);
            this.LJFF = 1;
        }
        this.LJIIL = z;
        this.LJI = true;
    }

    @Override // X.InterfaceC215558d5
    public final void LJ(String str) {
        this.LJIIIIZZ = str;
        long j = -1;
        try {
            if (C78685UuP.LJJJZ(str) && str != null) {
                j = CastLongProtector.parseLong(str);
            }
        } catch (Exception unused) {
        }
        this.LIZIZ = j;
    }
}
