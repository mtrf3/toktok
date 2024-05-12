package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C93672aUe;
import X.C93797aWf;
import X.C94033aaT;
import X.C94092abQ;
import X.C94618aju;
import X.C94620ajw;
import X.C94724alc;
import X.C94725ald;
import X.EnumC93674aUg;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment;

/* loaded from: classes34.dex */
public class IDqS191S0200000_42 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS191S0200000_42(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC65784Pro;
        this.l1 = interfaceC65784Pro2;
    }

    public static final Object invoke$0(IDqS191S0200000_42 iDqS191S0200000_42, Object obj, Object obj2) {
        int[] iArr = (int[]) obj2;
        if (iArr == null || iArr.length == 0 || iArr[0] != 0) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDqS191S0200000_42.l1;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } else {
            ((InterfaceC65784Pro) iDqS191S0200000_42.l0).invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS191S0200000_42 iDqS191S0200000_42, Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        if (booleanValue) {
            ((InterfaceC65784Pro) iDqS191S0200000_42.l1).invoke();
        } else {
            FaceDistortionFragment faceDistortionFragment = (FaceDistortionFragment) iDqS191S0200000_42.l0;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDqS191S0200000_42.l1;
            faceDistortionFragment.getClass();
            C93797aWf.LIZ().fetchDefaultModel(new IDqS191S0200000_42(faceDistortionFragment, interfaceC65784Pro, 1));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS191S0200000_42 iDqS191S0200000_42, Object obj, Object obj2) {
        C94033aaT it = (C94033aaT) obj;
        C94620ajw adapter = (C94620ajw) obj2;
        o.LJIIIZ(it, "it");
        o.LJIIIZ(adapter, "adapter");
        ((C94092abQ) iDqS191S0200000_42.l1).LJLJI.onEventClickTemplateItem(it);
        adapter.LJLLLLLL(it, EnumC93674aUg.Loading);
        ((C94092abQ) iDqS191S0200000_42.l1).LJLILLLLZI = it.LJ;
        ((C94092abQ) iDqS191S0200000_42.l1).LJLJI.wl().iv0(it.LJ, new C94724alc(iDqS191S0200000_42, System.currentTimeMillis(), it, adapter));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS191S0200000_42 iDqS191S0200000_42, Object obj, Object obj2) {
        C94033aaT it = (C94033aaT) obj;
        C94618aju adapter = (C94618aju) obj2;
        o.LJIIIZ(it, "it");
        o.LJIIIZ(adapter, "adapter");
        ((C94092abQ) iDqS191S0200000_42.l1).LJLJI.onEventClickFeatureItem(it);
        adapter.LJLLLLLL(it, EnumC93674aUg.Loading);
        ((C94092abQ) iDqS191S0200000_42.l1).LJLILLLLZI = it.LJ;
        ((C94092abQ) iDqS191S0200000_42.l1).LJLJI.wl().iv0(it.LJ, new C94725ald(iDqS191S0200000_42, System.currentTimeMillis(), it, adapter));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS191S0200000_42(C93672aUe c93672aUe, C94092abQ c94092abQ, int i) {
        super(2);
        this.$t = i;
        this.l0 = c93672aUe;
        this.l1 = c94092abQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS191S0200000_42(FaceDistortionFragment faceDistortionFragment, InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(2);
        this.$t = i;
        this.l0 = faceDistortionFragment;
        this.l1 = interfaceC65784Pro;
    }
}
