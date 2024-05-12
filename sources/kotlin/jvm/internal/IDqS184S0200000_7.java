package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C29S;
import X.C43342Gzi;
import X.C43344Gzk;
import X.C5V2;
import X.C76800UCe;
import X.C87618Ya6;
import X.H78;
import X.ICJ;
import X.ICO;
import X.InterfaceC43346Gzm;
import X.InterfaceC43351Gzr;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import Y.ARunnableS2S2100000_7;
import android.os.Handler;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.i0;

/* loaded from: classes8.dex */
public class IDqS184S0200000_7 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS184S0200000_7(C43344Gzk c43344Gzk, C87618Ya6 c87618Ya6, int i) {
        super(3);
        this.$t = i;
        this.l0 = c43344Gzk;
        this.l1 = c87618Ya6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS184S0200000_7(ICJ icj, Effect effect, int i) {
        super(3);
        this.$t = i;
        this.l0 = icj;
        this.l1 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS184S0200000_7(AqS96S0300000_7 aqS96S0300000_7, AqS170S0200000_7 aqS170S0200000_7, int i) {
        super(3);
        this.$t = i;
        this.l0 = aqS170S0200000_7;
        this.l1 = aqS96S0300000_7;
    }

    public static final Object invoke$0(IDqS184S0200000_7 iDqS184S0200000_7, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            ((InterfaceC88471Ynr) iDqS184S0200000_7.l0).invoke(Boolean.valueOf(booleanValue2), obj3);
        }
        ((InterfaceC65784Pro) iDqS184S0200000_7.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS184S0200000_7 iDqS184S0200000_7, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            ((InterfaceC88471Ynr) iDqS184S0200000_7.l0).invoke(Boolean.valueOf(booleanValue2), obj3);
        }
        ((InterfaceC65784Pro) iDqS184S0200000_7.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS184S0200000_7 iDqS184S0200000_7, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            ((InterfaceC88471Ynr) iDqS184S0200000_7.l0).invoke(Boolean.valueOf(booleanValue2), obj3);
        }
        ((InterfaceC65784Pro) iDqS184S0200000_7.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS184S0200000_7 iDqS184S0200000_7, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String defaultVideoPath = (String) obj2;
        String defaultAudioPath = (String) obj3;
        o.LJIIIZ(defaultVideoPath, "defaultVideoPath");
        o.LJIIIZ(defaultAudioPath, "defaultAudioPath");
        C29S c29s = ((ICJ) iDqS184S0200000_7.l0).LIZ;
        if (c29s != null && !c29s.isFinishing()) {
            ((C5V2) ((ICJ) iDqS184S0200000_7.l0).LJIILIIL.getValue()).dismiss();
            if (booleanValue) {
                ((ICJ) iDqS184S0200000_7.l0).LJIIJ = ICO.LIZ((Effect) iDqS184S0200000_7.l1);
                ((Handler) ((ICJ) iDqS184S0200000_7.l0).LJIILLIIL.getValue()).post(new ARunnableS2S2100000_7((ICJ) iDqS184S0200000_7.l0, defaultVideoPath, defaultAudioPath, 1));
            } else {
                H78.LIZJ("BackgroundVideo default video parse fail");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS184S0200000_7 iDqS184S0200000_7, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String defaultVideoPath = (String) obj2;
        String defaultAudioPath = (String) obj3;
        o.LJIIIZ(defaultVideoPath, "defaultVideoPath");
        o.LJIIIZ(defaultAudioPath, "defaultAudioPath");
        C29S c29s = ((ICJ) iDqS184S0200000_7.l0).LIZ;
        if (c29s != null && !c29s.isFinishing()) {
            ((C5V2) ((ICJ) iDqS184S0200000_7.l0).LJIILIIL.getValue()).dismiss();
            if (booleanValue) {
                ((ICJ) iDqS184S0200000_7.l0).LJIIJ = ICO.LIZ((Effect) iDqS184S0200000_7.l1);
                ((Handler) ((ICJ) iDqS184S0200000_7.l0).LJIILLIIL.getValue()).post(new ARunnableS2S2100000_7((ICJ) iDqS184S0200000_7.l0, defaultVideoPath, defaultAudioPath, 2));
            } else {
                H78.LIZJ("BackgroundVideo default video parse fail");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS184S0200000_7 iDqS184S0200000_7, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        String msg = (String) obj3;
        o.LJIIIZ(msg, "msg");
        ((C43344Gzk) iDqS184S0200000_7.l0).LJIIIIZZ = true;
        ((C43344Gzk) iDqS184S0200000_7.l0).LJIIL().ret = intValue;
        if (!((C43344Gzk) iDqS184S0200000_7.l0).LJIILJJIL) {
            ((C43344Gzk) iDqS184S0200000_7.l0).LJIILJJIL = true;
            InterfaceC43351Gzr interfaceC43351Gzr = (InterfaceC43351Gzr) iDqS184S0200000_7.l1;
            C43342Gzi c43342Gzi = new C43342Gzi();
            SynthetiseResult LJIIL = ((C43344Gzk) iDqS184S0200000_7.l0).LJIIL();
            if (LJIIL != null) {
                c43342Gzi.LIZ = LJIIL;
            }
            String LJFF = i0.LJFF("VEImagePublishEditPresenterError:", msg);
            if (LJFF != null) {
                c43342Gzi.LIZJ = LJFF;
            }
            interfaceC43351Gzr.LIZIZ(intValue, c43342Gzi.LIZ());
            InterfaceC43346Gzm interfaceC43346Gzm = ((C43344Gzk) iDqS184S0200000_7.l0).LJIIJ;
            if (interfaceC43346Gzm != null) {
                interfaceC43346Gzm.cancel();
            } else {
                o.LJIJI("imageEditor");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
