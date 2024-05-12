package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C12800eq;
import X.C15380j0;
import X.C18200nY;
import X.C28509BGv;
import X.C29105BbZ;
import X.C29162BcU;
import X.C29164BcW;
import X.C29306Beo;
import X.C29697Bl7;
import X.C31767CdP;
import X.C38995FSd;
import X.C76800UCe;
import X.C76907UGh;
import X.C87277YNd;
import X.CQO;
import X.CR6;
import X.CSH;
import X.CUH;
import X.DialogC31813Ce9;
import X.EnumC12790ep;
import X.HandlerC28345BAn;
import X.InterfaceC28916BWm;
import X.InterfaceC30359Bvn;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.T4Y;
import Y.ARunnableS11S0110000_5;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class AqS62S0110000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS62S0110000_5 aqS62S0110000_5) {
        ((CUH) aqS62S0110000_5.l0).V().setMeasureListener(null);
        ((CUH) aqS62S0110000_5.l0).V().post(new ARunnableS11S0110000_5((CUH) aqS62S0110000_5.l0, aqS62S0110000_5.z1, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS62S0110000_5 aqS62S0110000_5) {
        Context context = ((T4Y) aqS62S0110000_5.l0).getContext();
        o.LJIIIIZZ(context, "context");
        C76907UGh.LIZLLL(context, "gift_pannel_banner", aqS62S0110000_5.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS62S0110000_5 aqS62S0110000_5) {
        InterfaceC30359Bvn LJIILIIL;
        Integer num;
        if (!((PreviewStartLiveWidget) aqS62S0110000_5.l0).LLFF()) {
            PreviewStartLiveWidget previewStartLiveWidget = (PreviewStartLiveWidget) aqS62S0110000_5.l0;
            if (previewStartLiveWidget.LJLL == null) {
                C31767CdP c31767CdP = new C31767CdP(previewStartLiveWidget.context);
                c31767CdP.LIZIZ = C15380j0.LJIILJJIL(R.string.sur);
                previewStartLiveWidget.LJLL = c31767CdP.LIZ();
            }
        }
        DialogC31813Ce9 dialogC31813Ce9 = ((PreviewStartLiveWidget) aqS62S0110000_5.l0).LJLL;
        if (dialogC31813Ce9 != null) {
            C29306Beo.LJJJJIZL(dialogC31813Ce9);
        }
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5((PreviewStartLiveWidget) aqS62S0110000_5.l0, 76));
        } else {
            C29697Bl7.LJIIJ(((PreviewStartLiveWidget) aqS62S0110000_5.l0).LLF());
        }
        DataChannel dataChannel = ((PreviewStartLiveWidget) aqS62S0110000_5.l0).dataChannel;
        boolean z = true;
        if (dataChannel != null && (num = (Integer) dataChannel.kv0(GiftFeatureChannel.class)) != null && num.intValue() != 1) {
            z = false;
        }
        C29105BbZ.LIZ(z);
        C12800eq.LJFF(EnumC12790ep.CreateLive);
        C18200nY.LIZ("live_action", String.valueOf(System.currentTimeMillis()));
        if (((PreviewStartLiveWidget) aqS62S0110000_5.l0).LLFF() && C28509BGv.LJI(((PreviewStartLiveWidget) aqS62S0110000_5.l0).LLF()) && aqS62S0110000_5.z1 && (LJIILIIL = C87277YNd.LJIILIIL(((PreviewStartLiveWidget) aqS62S0110000_5.l0).dataChannel)) != null) {
            LJIILIIL.LJIILLIIL();
        }
        PreviewStartLiveWidget previewStartLiveWidget2 = (PreviewStartLiveWidget) aqS62S0110000_5.l0;
        InterfaceC28916BWm interfaceC28916BWm = previewStartLiveWidget2.LJLJI;
        if (interfaceC28916BWm != null) {
            Context context = previewStartLiveWidget2.context;
            o.LJIIIIZZ(context, "context");
            PreviewStartLiveWidget previewStartLiveWidget3 = (PreviewStartLiveWidget) aqS62S0110000_5.l0;
            C29164BcW LIZ = interfaceC28916BWm.LIZ(context, previewStartLiveWidget3.dataChannel, (HandlerC28345BAn) previewStartLiveWidget3.LJLJLLL.getValue());
            if (LIZ != null) {
                C29162BcU.LIZJ.LIZ(LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS62S0110000_5 aqS62S0110000_5) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS62S0110000_5.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(aqS62S0110000_5.z1));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS62S0110000_5(CUH cuh, CUH<CQO<? extends CR6>, CSH<Object>> cuh2, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = cuh;
        this.z1 = cuh2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S0110000_5(T4Y t4y, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = t4y;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS62S0110000_5(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = interfaceC88472Yns;
        this.z1 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S0110000_5(PreviewStartLiveWidget previewStartLiveWidget, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = previewStartLiveWidget;
        this.z1 = z;
    }
}
