package Y;

import X.C26045AKb;
import X.C69084R9k;
import X.C76800UCe;
import X.C85649XjR;
import X.C85711XkR;
import X.C85766XlK;
import X.C86343Xud;
import X.C86362Xuw;
import X.InterfaceC64592gB;
import X.InterfaceC85767XlL;
import android.os.Bundle;
import com.bytedance.android.live.network.response.BaseResponse;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BindEmailWithoutVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import webcast.api.room.PreviewTimeReportResponse;
import yq4.a;

/* loaded from: classes16.dex */
public class AfS30S0110000_15 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS30S0110000_15 afS30S0110000_15, Object obj) {
        Throwable th = (Throwable) obj;
        if ((th instanceof C69084R9k) && th != null) {
            C85766XlK.LIZ((InterfaceC85767XlL) afS30S0110000_15.l0, th, true, Boolean.valueOf(afS30S0110000_15.z1), 8);
        }
    }

    public static final void accept$1(AfS30S0110000_15 afS30S0110000_15, Object obj) {
        if (o.LJ(((BindEmailWithoutVerifyFragment) afS30S0110000_15.l0).LLI, "signup")) {
            C26045AKb c26045AKb = new C26045AKb((BindEmailWithoutVerifyFragment) afS30S0110000_15.l0);
            c26045AKb.LJIIIZ(((BindEmailWithoutVerifyFragment) afS30S0110000_15.l0).getString(R.string.hxt));
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LIZ(true);
            c26045AKb.LJIIJ();
        } else {
            Bundle arguments = ((BindEmailWithoutVerifyFragment) afS30S0110000_15.l0).getArguments();
            if (arguments != null) {
                BindEmailWithoutVerifyFragment bindEmailWithoutVerifyFragment = (BindEmailWithoutVerifyFragment) afS30S0110000_15.l0;
                arguments.putString("bind_pii_success_toast_text", bindEmailWithoutVerifyFragment.getString(R.string.hxt));
                bindEmailWithoutVerifyFragment.rh(arguments);
            }
        }
        C85711XkR.LIZJ(((BindEmailWithoutVerifyFragment) afS30S0110000_15.l0).LJJLIIIJJI(), "1", "email", "phone", CardStruct.IStatusCode.DEFAULT);
        C85711XkR.LIZLLL(((BindEmailWithoutVerifyFragment) afS30S0110000_15.l0).LJJLIIIJJI(), "email", "phone");
        ((BindEmailWithoutVerifyFragment) afS30S0110000_15.l0).fm();
        if (afS30S0110000_15.z1) {
            a.LJIILIIL().LJI("email_consent");
        }
    }

    public static final void accept$2(AfS30S0110000_15 afS30S0110000_15, Object obj) {
        String enterMethod = ((PhoneLoginFragment) afS30S0110000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        C85649XjR.LIZ(true, enterMethod, null, 0, null, 28);
        ((PhoneLoginFragment) afS30S0110000_15.l0).Sl(false, true, afS30S0110000_15.z1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS30S0110000_15 afS30S0110000_15, Object obj) {
        long j;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (afS30S0110000_15.z1) {
            PreviewTimeReportResponse.ResponseData responseData = (PreviewTimeReportResponse.ResponseData) baseResponse.data;
            if (responseData != null) {
                j = responseData.remainPreviewTimeMs;
            } else {
                j = 0;
            }
            SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) afS30S0110000_15.l0;
            subscribeMaskLayerVM.LJLJJI = j;
            if (j > 0) {
                C86343Xud c86343Xud = (C86343Xud) subscribeMaskLayerVM.LJLIL.getValue();
                if (c86343Xud != null && (liveRoomStruct2 = c86343Xud.LIZIZ) != null) {
                    liveRoomStruct2.allowPreviewTime = j;
                }
                C86343Xud c86343Xud2 = (C86343Xud) ((SubscribeMaskLayerVM) afS30S0110000_15.l0).LJLIL.getValue();
                if (c86343Xud2 != null && (liveRoomStruct = c86343Xud2.LIZIZ) != null) {
                    liveRoomStruct.liveSubOnly = 1L;
                }
                ((SubscribeMaskLayerVM) afS30S0110000_15.l0).LJLJI.setValue(new C86362Xuw(true, j));
                return;
            }
            subscribeMaskLayerVM.LJLILLLLZI.setValue(C76800UCe.LIZ);
        }
    }

    public static final void accept$4(AfS30S0110000_15 afS30S0110000_15, Object obj) {
        if (afS30S0110000_15.z1) {
            ((SubscribeMaskLayerVM) afS30S0110000_15.l0).LJLILLLLZI.setValue(C76800UCe.LIZ);
        }
    }

    public AfS30S0110000_15(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
