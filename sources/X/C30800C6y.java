package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.PreviewSubscriptionSettingDialog;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubCreateToolsEntranceNewSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.C6y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30800C6y extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ C30799C6x LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30800C6y(C30799C6x c30799C6x, String str) {
        super(1);
        this.LJLIL = c30799C6x;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        C30799C6x c30799C6x;
        Context context;
        String str2;
        FragmentManager fragmentManager;
        String lynxPage = str;
        o.LJIIIZ(lynxPage, "lynxPage");
        if (!TextUtils.isEmpty(lynxPage) && (context = (c30799C6x = this.LJLIL).LIZ) != null) {
            String str3 = this.LJLILLLLZI;
            if (o.LJ(lynxPage, "native_click_entrance")) {
                str2 = C79.LIZ(c30799C6x.LIZJ, c30799C6x.LIZ, c30799C6x.LJI, "live_take_page", LiveSubCreateToolsEntranceNewSetting.INSTANCE.getEnable(), C7M.LJLIL);
            } else if (o.LJ(lynxPage, "native_letter_cover")) {
                DataChannel dataChannel = c30799C6x.LIZIZ;
                str2 = null;
                if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
                    InterfaceC06390Mx LIZ = CN1.LIZ(ISubscribeService.class);
                    o.LJIIIIZZ(LIZ, "getService(ISubscribeService::class.java)");
                    PreviewSubscriptionSettingDialog Xr0 = ((ISubscribeService) LIZ).Xr0(1, c30799C6x.LJI, null);
                    if (Xr0 != null) {
                        C1XY.LJJIIJZLJL(Xr0, fragmentManager, "SubscribeInviteLetterFragment");
                    }
                }
            } else {
                C32364Cn2 c32364Cn2 = new C32364Cn2(lynxPage);
                c32364Cn2.LIZJ("code", str3);
                C75 c75 = c30799C6x.LIZJ;
                String LIZLLL = c32364Cn2.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "urlBuilder.build()");
                C79.LIZIZ(c75, context, LIZLLL, c30799C6x.LJI, "live_take_page");
                str2 = lynxPage;
            }
            c30799C6x.LIZ(c30799C6x.LJI, str2, !o.LJ("error", lynxPage));
        }
        return C76800UCe.LIZ;
    }
}
