package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEducationGuideSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import kotlin.jvm.internal.o;

/* renamed from: X.Clo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32288Clo<T> implements InterfaceC64592gB {
    public static final C32288Clo<T> LJLIL = new C32288Clo<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        GuideInfoResponse.Data data = (GuideInfoResponse.Data) ((BaseResponse) obj).data;
        if (data != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("success, it.data?.guideType: ");
            C31811Ce7.LJ(LIZ, data.guideType, LIZ, "LiveEducationHelper");
            boolean LJ = o.LJ(data.guideType, "gift_guide_popup_education");
            C32696CsO.LIZLLL = data.schemaUrl;
            C32696CsO.LJ = data.userStats;
            if (LiveGiftEducationGuideSetting.INSTANCE.isEnable()) {
                C32696CsO.LIZ = LJ;
                IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
                if (iHostResource != null && !iHostResource.Br0("tiktok_live_revenue_gift_education")) {
                    iHostResource.K00("tiktok_live_revenue_gift_education");
                    C0NB.LIZIZ("LiveEducationHelper", "updateChannelByLazy");
                }
            } else {
                C32696CsO.LIZ = false;
            }
            C32696CsO.LIZJ = false;
        }
    }
}
