package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.g1;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.IDqS11S0101000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30021Fu extends C04D {
    public final ParcelableSnapshotMutableState LJLJLJ;
    public final long LJLJLLL;
    public final long LJLL;
    public long LJLLI;
    public float LJLLILLLL;
    public final ParcelableSnapshotMutableState LJLLJ;

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowStaticImage() {
        return ((Boolean) this.LJLLJ.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC05330Iv getGearType() {
        return (EnumC05330Iv) this.LJLJLJ.getValue();
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m1getBackgroundColor0d7_KjU() {
        return this.LJLLI;
    }

    /* renamed from: setBackgroundColor-8_81llA, reason: not valid java name */
    public final void m2setBackgroundColor8_81llA(long j) {
        this.LJLLI = j;
    }

    public final void setGear(EnumC05330Iv gear) {
        float f;
        o.LJIIIZ(gear, "gear");
        if (getGearType() != gear) {
            setShowStaticImage(true);
            setGearType(gear);
            if (getGearType() == EnumC05330Iv.HIGH) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.LJLLILLLL = f;
        }
    }

    public final void setGearType(EnumC05330Iv enumC05330Iv) {
        o.LJIIIZ(enumC05330Iv, "<set-?>");
        this.LJLJLJ.setValue(enumC05330Iv);
    }

    public final void setShowStaticImage(boolean z) {
        this.LJLLJ.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30021Fu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJLJ = C78966Uyw.LJJJIL(EnumC05330Iv.LOW);
        this.LJLJLLL = C78897Uxp.LJ(224, 206, 248, 122);
        this.LJLL = C78897Uxp.LJ(221, 245, 253, 36);
        this.LJLLI = C78897Uxp.LJFF(4281348405L);
        this.LJLLJ = C78966Uyw.LJJJIL(Boolean.TRUE);
    }

    @Override // X.C04D
    public final void LIZ(InterfaceC24520xk interfaceC24520xk, int i) {
        InterfaceC07790Sh LIZLLL;
        int i2;
        InterfaceC07790Sh LIZ;
        float f;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1425439252);
        C1JK LIZIZ = C07110Pr.LIZIZ(this.LJLLILLLL, new C48371v7(0), LJIL, 64);
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        float f2 = 6;
        LIZLLL = C78996UzQ.LIZLLL(C78840Uwu.LJI(C17N.LJJJLIIL(C09290Yb.LJFF(C09290Yb.LJII(c1m1)), 4, null, C78897Uxp.LIZLLL(1291845632), C78897Uxp.LIZLLL(1291845632), 6), C17480mO.LIZ(f2)), this.LJLLI, C11710d5.LIZ);
        EnumC05330Iv gearType = getGearType();
        EnumC05330Iv enumC05330Iv = EnumC05330Iv.HIGH;
        if (gearType == enumC05330Iv) {
            LIZLLL = C78999UzT.LJII(1, LIZLLL, C11720d6.LIZ(C47261Igj.LJJIJIIJI(new C11850dJ(C11850dJ.LIZIZ(this.LJLJLLL, C11850dJ.LIZLLL(this.LJLJLLL) * ((Number) LIZIZ.getValue()).floatValue())), new C11850dJ(C11850dJ.LIZIZ(this.LJLL, C11850dJ.LIZLLL(this.LJLL) * ((Number) LIZIZ.getValue()).floatValue())))), C17480mO.LIZ(f2));
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
            LJIL.LJJIIJ(1419638149);
            if (getShowStaticImage()) {
                if (getGearType() == enumC05330Iv) {
                    i2 = R.drawable.av8;
                } else {
                    i2 = R.drawable.bqd;
                }
                AbstractC16010k1 LJJIIZ = C79081V1x.LJJIIZ(i2, LJIL);
                LIZ = C07770Sf.LIZ(c1m1, g1.LIZ, C48781vm.LJLIL);
                InterfaceC07790Sh LIZ2 = C09280Ya.LIZ(LIZ, C07730Sb.LIZLLL);
                float f3 = 30;
                if (getGearType() == enumC05330Iv) {
                    f = 40;
                } else {
                    f = f3;
                }
                InterfaceC07790Sh LJIIL2 = C09290Yb.LJIIL(LIZ2, f, f3);
                InterfaceC273615o.LJLIIIL.getClass();
                C0SR.LIZ(LJJIIZ, "icon", LJIIL2, null, C273415m.LIZJ, 0.0f, null, LJIL, 24632, 104);
            }
            LJIL.LJJJJJ(false);
            getGearType();
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            LJIL.LJIJ();
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new IDqS11S0101000(this, i, 1);
            return;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }
}
