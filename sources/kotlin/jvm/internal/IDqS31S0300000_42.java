package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC94370afu;
import X.AbstractC94372afw;
import X.ActivityC45651qj;
import X.C51029K0z;
import X.C68322mC;
import X.C76800UCe;
import X.C93407aQN;
import X.C93670aUc;
import X.C93906aYQ;
import X.C94034aaU;
import X.C94256ae4;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.K55;
import X.OHI;
import X.OSZ;
import X.X1D;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.PreviewViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.HashMap;

/* loaded from: classes34.dex */
public class IDqS31S0300000_42 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS31S0300000_42 iDqS31S0300000_42, Object obj) {
        C94256ae4 c94256ae4 = (C94256ae4) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("real true: path: ");
        LIZ.append(c94256ae4);
        C94034aaU.LIZ("ModelSelectImpl", X1D.LIZIZ(LIZ));
        if (c94256ae4 == null || c94256ae4.LJLJLJ.length() == 0) {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDqS31S0300000_42.l1;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke("", Boolean.FALSE);
            }
        } else {
            InterfaceC88471Ynr interfaceC88471Ynr2 = (InterfaceC88471Ynr) iDqS31S0300000_42.l1;
            if (interfaceC88471Ynr2 != null) {
                interfaceC88471Ynr2.invoke(c94256ae4.LJLJLJ, Boolean.TRUE);
            }
        }
        C93407aQN.LIZ("default_model_path");
        T t = ((C68322mC) iDqS31S0300000_42.l2).element;
        if (t != 0) {
            ((ModelSelectImpl) iDqS31S0300000_42.l0).selectPicPathCallbacks.remove(t);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS31S0300000_42 iDqS31S0300000_42, Object it) {
        o.LJIIIZ(it, "it");
        C93906aYQ c93906aYQ = (C93906aYQ) iDqS31S0300000_42.l0;
        HashMap hashMap = (HashMap) iDqS31S0300000_42.l1;
        c93906aYQ.getClass();
        C93906aYQ.LIZ("1", hashMap, true);
        OHI ohi = OHI.LIZ;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) iDqS31S0300000_42.l2;
        ohi.getClass();
        OHI.LJII(activityC45651qj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS31S0300000_42 iDqS31S0300000_42, Object it) {
        o.LJIIIZ(it, "it");
        C93906aYQ c93906aYQ = (C93906aYQ) iDqS31S0300000_42.l0;
        HashMap hashMap = (HashMap) iDqS31S0300000_42.l1;
        c93906aYQ.getClass();
        C93906aYQ.LIZ(CardStruct.IStatusCode.DEFAULT, hashMap, true);
        ((K55) iDqS31S0300000_42.l2).onDismiss();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS31S0300000_42 iDqS31S0300000_42, Object it) {
        o.LJIIIZ(it, "it");
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("interaction_command_action", C51029K0z.LJJIIZI(new OSZ("action_type", "delete_action_complete")));
        }
        PreviewViewModel Jl = ((BehaviourPreviewFragment) iDqS31S0300000_42.l0).Jl();
        AbstractC94370afu command = (AbstractC94370afu) iDqS31S0300000_42.l1;
        AbstractC94372afw operator = (AbstractC94372afw) iDqS31S0300000_42.l2;
        Jl.getClass();
        o.LJIIIZ(command, "command");
        o.LJIIIZ(operator, "operator");
        command.LIZLLL(operator);
        if (command.LJI().isEmpty()) {
            Jl.iv0(command);
        } else {
            Jl.jv0(command);
        }
        ((BehaviourPreviewFragment) iDqS31S0300000_42.l0).Ll((AbstractC94370afu) iDqS31S0300000_42.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS31S0300000_42 iDqS31S0300000_42, Object it) {
        o.LJIIIZ(it, "it");
        ((MusicDspSheetViewModel) iDqS31S0300000_42.l0).setState(new IDqS175S0200000_42((TT2DSPPlatformInfo) iDqS31S0300000_42.l1, (TT2DSPSongInfo) iDqS31S0300000_42.l2, 18));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS31S0300000_42(C93906aYQ c93906aYQ, C93906aYQ c93906aYQ2, HashMap<String, String> hashMap, ActivityC45651qj activityC45651qj) {
        super(1);
        this.$t = activityC45651qj;
        this.l0 = c93906aYQ;
        this.l1 = c93906aYQ2;
        this.l2 = hashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS31S0300000_42(C93906aYQ c93906aYQ, C93906aYQ c93906aYQ2, HashMap<String, String> hashMap, K55 k55) {
        super(1);
        this.$t = k55;
        this.l0 = c93906aYQ;
        this.l1 = c93906aYQ2;
        this.l2 = hashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS31S0300000_42(BehaviourPreviewFragment behaviourPreviewFragment, AbstractC94370afu abstractC94370afu, AbstractC94372afw abstractC94372afw, int i) {
        super(1);
        this.$t = i;
        this.l0 = behaviourPreviewFragment;
        this.l1 = abstractC94370afu;
        this.l2 = abstractC94372afw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS31S0300000_42(ModelSelectImpl modelSelectImpl, InterfaceC88471Ynr interfaceC88471Ynr, C68322mC c68322mC, int i) {
        super(1);
        this.$t = i;
        this.l0 = modelSelectImpl;
        this.l1 = interfaceC88471Ynr;
        this.l2 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS31S0300000_42(MusicDspSheetViewModel musicDspSheetViewModel, TT2DSPPlatformInfo tT2DSPPlatformInfo, TT2DSPSongInfo tT2DSPSongInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicDspSheetViewModel;
        this.l1 = tT2DSPPlatformInfo;
        this.l2 = tT2DSPSongInfo;
    }
}
