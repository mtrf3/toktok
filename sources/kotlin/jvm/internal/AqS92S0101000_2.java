package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.AnonymousClass509;
import X.C143285jo;
import X.C150575vZ;
import X.C156906Du;
import X.C159706Oo;
import X.C50F;
import X.C5IG;
import X.C6QO;
import X.C6R1;
import X.C76800UCe;
import X.InterfaceC132055Gf;
import X.InterfaceC142545ic;
import X.InterfaceC150095un;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.animation.ObjectAnimator;
import android.view.View;
import com.ss.android.ugc.gamora.editor.audioservice.businessui.soundremixfilter.SoundFilterViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public class AqS92S0101000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS92S0101000_2 aqS92S0101000_2, Object obj) {
        EditToolbarState setState = (EditToolbarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EditToolbarState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, new C150575vZ(new OSZ(Integer.valueOf(aqS92S0101000_2.i1), (InterfaceC88472Yns) aqS92S0101000_2.l0)), null, null, null, null, false, 258047, null);
    }

    public static final Object invoke$1(AqS92S0101000_2 aqS92S0101000_2, Object view) {
        o.LJIIIZ(view, "view");
        ((C156906Du) aqS92S0101000_2.l0).getClass();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.7f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.7f);
        ofFloat.setDuration(200L);
        ofFloat2.setDuration(200L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 0.7f, 1.1f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 0.7f, 1.1f);
        ofFloat3.setDuration(250L);
        ofFloat4.setDuration(250L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleX", 1.1f, 0.98f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, "scaleY", 1.1f, 0.98f);
        ofFloat5.setDuration(200L);
        ofFloat6.setDuration(200L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, "scaleX", 0.98f, 1.1f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, "scaleY", 0.98f, 1.1f);
        ofFloat7.setDuration(150L);
        ofFloat8.setDuration(150L);
        ofFloat.start();
        ofFloat2.start();
        ofFloat3.setStartDelay(200L);
        ofFloat3.start();
        ofFloat4.setStartDelay(200L);
        ofFloat4.start();
        ofFloat5.setStartDelay(450L);
        ofFloat5.start();
        ofFloat6.setStartDelay(450L);
        ofFloat6.start();
        ofFloat7.setStartDelay(650L);
        ofFloat7.start();
        ofFloat8.setStartDelay(650L);
        ofFloat8.start();
        ((C156906Du) aqS92S0101000_2.l0).LIZIZ().bb0(aqS92S0101000_2.i1, ((C156906Du) aqS92S0101000_2.l0).LJLJJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS92S0101000_2 aqS92S0101000_2, Object obj) {
        InterfaceC150095un interfaceC150095un = ((SoundFilterViewModel) aqS92S0101000_2.l0).LJLJJL;
        if (interfaceC150095un != null) {
            interfaceC150095un.LIZJ(aqS92S0101000_2.i1, 3);
        }
        InterfaceC150095un interfaceC150095un2 = ((SoundFilterViewModel) aqS92S0101000_2.l0).LJLJJL;
        if (interfaceC150095un2 != null) {
            interfaceC150095un2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS92S0101000_2 aqS92S0101000_2, Object offerPendingAction) {
        o.LJIIIZ(offerPendingAction, "$this$offerPendingAction");
        InterfaceC142545ic interfaceC142545ic = ((C143285jo) aqS92S0101000_2.l0).LJLILLLLZI;
        if (interfaceC142545ic != null) {
            interfaceC142545ic.YM(aqS92S0101000_2.i1);
            return C76800UCe.LIZ;
        }
        o.LJIJI("realTiktokEditPreviewApi");
        throw null;
    }

    public static final Object invoke$4(AqS92S0101000_2 aqS92S0101000_2, Object offerPendingAction) {
        o.LJIIIZ(offerPendingAction, "$this$offerPendingAction");
        InterfaceC142545ic interfaceC142545ic = ((C143285jo) aqS92S0101000_2.l0).LJLILLLLZI;
        if (interfaceC142545ic != null) {
            interfaceC142545ic.gw(aqS92S0101000_2.i1);
            return C76800UCe.LIZ;
        }
        o.LJIJI("realTiktokEditPreviewApi");
        throw null;
    }

    public static final Object invoke$5(AqS92S0101000_2 aqS92S0101000_2, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC132055Gf interfaceC132055Gf = (InterfaceC132055Gf) ((AnonymousClass509) aqS92S0101000_2.l0).LJIIJJI.getValue();
        if (interfaceC132055Gf != null) {
            final AnonymousClass509 anonymousClass509 = (AnonymousClass509) aqS92S0101000_2.l0;
            final int i = aqS92S0101000_2.i1;
            interfaceC132055Gf.LJII(null, false, false, new C5IG() { // from class: X.50B
                @Override // X.C5IG
                public final void onFailed() {
                }

                @Override // X.C5IG
                public final void onSuccess() {
                    AnonymousClass509.this.LJIIL(AnonymousClass509.this.LJI().getMainTrack().LJIILLIIL().get(i));
                    C78920UyC.LIZLLL(R.string.sah, AnonymousClass509.this.LIZ, 1063);
                }
            });
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS92S0101000_2 aqS92S0101000_2, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.fmk, new AqS92S0101000_2((AnonymousClass509) aqS92S0101000_2.l0, aqS92S0101000_2.i1, 5));
        actionGroup.LJIIIIZZ(R.string.fm7, C50F.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS92S0101000_2 aqS92S0101000_2, Object obj) {
        C6R1 setState = (C6R1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6R1.LIZ(setState, aqS92S0101000_2.i1, false, false, Boolean.FALSE, ((C159706Oo) aqS92S0101000_2.l0).LJIJJ().getStartTime(), ((C159706Oo) aqS92S0101000_2.l0).LJIJJ().getEndTime(), false, 0, 454);
    }

    public static final Object invoke$8(AqS92S0101000_2 aqS92S0101000_2, Object obj) {
        C6R1 setState = (C6R1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6R1.LIZ(setState, aqS92S0101000_2.i1, false, false, Boolean.FALSE, ((C6QO) aqS92S0101000_2.l0).LJIJJ().getStartTime(), ((C6QO) aqS92S0101000_2.l0).LJIJJ().getEndTime(), false, 0, 454);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS92S0101000_2(int i, int i2, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0101000_2(AnonymousClass509 anonymousClass509, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = anonymousClass509;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0101000_2(C143285jo c143285jo, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c143285jo;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0101000_2(C156906Du c156906Du, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c156906Du;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0101000_2(C159706Oo c159706Oo, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c159706Oo;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0101000_2(C6QO c6qo, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c6qo;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0101000_2(SoundFilterViewModel soundFilterViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = soundFilterViewModel;
        this.i1 = i;
    }
}
