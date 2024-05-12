package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.g1;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS116S0101000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2J extends C04D {
    public final ParcelableSnapshotMutableState LJLJLJ;
    public final long LJLJLLL;
    public final long LJLL;
    public long LJLLI;
    public boolean LJLLILLLL;
    public float LJLLJ;
    public final ParcelableSnapshotMutableState LJLLL;

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowStaticImage() {
        return ((Boolean) this.LJLLL.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC31545CZp getGearType() {
        return (EnumC31545CZp) this.LJLJLJ.getValue();
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m43getBackgroundColor0d7_KjU() {
        return this.LJLLI;
    }

    /* renamed from: setBackgroundColor-8_81llA, reason: not valid java name */
    public final void m44setBackgroundColor8_81llA(long j) {
        this.LJLLI = j;
    }

    public final void setGear(EnumC31545CZp gear) {
        float f;
        o.LJIIIZ(gear, "gear");
        this.LJLLILLLL = false;
        if (getGearType() != gear) {
            setShowStaticImage(true);
            setGearType(gear);
            if (getGearType() == EnumC31545CZp.HIGH) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.LJLLJ = f;
        }
    }

    public final void setGearType(EnumC31545CZp enumC31545CZp) {
        o.LJIIIZ(enumC31545CZp, "<set-?>");
        this.LJLJLJ.setValue(enumC31545CZp);
    }

    public final void setGearWithAnimation(EnumC31545CZp gear) {
        float f;
        o.LJIIIZ(gear, "gear");
        this.LJLLILLLL = true;
        if (getGearType() != gear) {
            setShowStaticImage(true);
            setGearType(gear);
            if (getGearType() == EnumC31545CZp.HIGH) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.LJLLJ = f;
        }
    }

    public final void setShowStaticImage(boolean z) {
        this.LJLLL.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJLJ = C78966Uyw.LJJJIL(EnumC31545CZp.LOW);
        this.LJLJLLL = C78897Uxp.LJ(224, 206, 248, 122);
        this.LJLL = C78897Uxp.LJ(221, 245, 253, 36);
        this.LJLLI = C11850dJ.LJFF;
        this.LJLLL = C78966Uyw.LJJJIL(Boolean.TRUE);
    }

    @Override // X.C04D
    public final void LIZ(InterfaceC24520xk interfaceC24520xk, int i) {
        InterfaceC41451jx c48371v7;
        InterfaceC07790Sh LIZLLL;
        InterfaceC07790Sh LIZ;
        int i2;
        InterfaceC07790Sh LIZ2;
        float f;
        C35931b3 LJIL = interfaceC24520xk.LJIL(2080956664);
        float f2 = this.LJLLJ;
        if (this.LJLLILLLL) {
            c48371v7 = C1JI.LJJIJIIJIL(300, 0, null, 6);
        } else {
            c48371v7 = new C48371v7(0);
        }
        C1JK LIZIZ = C07110Pr.LIZIZ(f2, c48371v7, LJIL, 64);
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        float f3 = 8;
        LIZLLL = C78996UzQ.LIZLLL(C78840Uwu.LJI(C09290Yb.LJFF(C09290Yb.LJII(c1m1)), C17480mO.LIZ(f3)), this.LJLLI, C11710d5.LIZ);
        EnumC31545CZp gearType = getGearType();
        EnumC31545CZp enumC31545CZp = EnumC31545CZp.HIGH;
        if (gearType == enumC31545CZp) {
            LIZLLL = C78999UzT.LJII(1, LIZLLL, C11720d6.LIZ(C47261Igj.LJJIJIIJI(new C11850dJ(C11850dJ.LIZIZ(this.LJLJLLL, C11850dJ.LIZLLL(this.LJLJLLL) * ((Number) LIZIZ.getValue()).floatValue())), new C11850dJ(C11850dJ.LIZIZ(this.LJLL, C11850dJ.LIZLLL(this.LJLL) * ((Number) LIZIZ.getValue()).floatValue())))), C17480mO.LIZ(f3));
        }
        LJIL.LJJIIJ(733328855);
        InterfaceC07760Se.LJJJ.getClass();
        InterfaceC273215k LIZJ = C0YZ.LIZJ(C07730Sb.LIZIZ, false, LJIL);
        LJIL.LJJIIJ(-1323940314);
        Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
        Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
        InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        InterfaceC03730Cr.LJ.getClass();
        C46041rM c46041rM = C03720Cq.LIZIZ;
        C40431iJ LJIIL = C56509MFt.LJIIL(LIZLLL);
        if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
            LJIL.LJIJI();
            if (LJIL.LJJIL) {
                LJIL.LJJI(c46041rM);
            } else {
                LJIL.LIZIZ();
            }
            LJIL.LJJI = false;
            C24830yF.LIZ(LJIL, LIZJ, C03720Cq.LJ);
            C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
            C06460Ne.LIZLLL(0, LJIIL, V10.LIZLLL(LJIL, interfaceC015404g, C03720Cq.LJI, LJIL), LJIL, 2058660585, -2137368960);
            LJIL.LJJIIJ(635749475);
            if (getShowStaticImage()) {
                if (getGearType() == enumC31545CZp && !this.LJLLILLLL) {
                    i2 = R.drawable.av8;
                } else {
                    i2 = R.drawable.bqd;
                }
                AbstractC16010k1 LJJIIZ = C79081V1x.LJJIIZ(i2, LJIL);
                LIZ2 = C07770Sf.LIZ(c1m1, g1.LIZ, V15.LJLIL);
                InterfaceC07790Sh LIZ3 = C09280Ya.LIZ(LIZ2, C07730Sb.LIZLLL);
                float f4 = 30;
                if (getGearType() == enumC31545CZp && !this.LJLLILLLL) {
                    f = 40;
                } else {
                    f = f4;
                }
                InterfaceC07790Sh LJIIL2 = C09290Yb.LJIIL(LIZ3, f, f4);
                InterfaceC273615o.LJLIIIL.getClass();
                C0SR.LIZ(LJJIIZ, "icon", LJIIL2, null, C273415m.LIZJ, 0.0f, null, LJIL, 24632, 104);
            }
            LJIL.LJJJJJ(false);
            if (getGearType() == enumC31545CZp && this.LJLLILLLL) {
                LIZ = C07770Sf.LIZ(c1m1, g1.LIZ, V15.LJLIL);
                C24920yO.LIZ(new AqS179S0100000_13(this, 326), C09290Yb.LJIIL(C09280Ya.LIZ(LIZ, C07730Sb.LIZLLL), 40, 30), null, LJIL, 0, 4);
            }
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            LJIL.LJIJ();
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new AqS116S0101000_13(this, i, 0);
            return;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }
}
