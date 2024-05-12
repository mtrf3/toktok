package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBag;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ShareEffectShowIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;

/* renamed from: X.Bns, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29868Bns implements InterfaceC62096OYq {
    public final C29930Bos LJLIL;
    public C29874Bny LJLILLLLZI;
    public final /* synthetic */ C29867Bnr LJLJI;

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
    }

    @Override // X.InterfaceC62096OYq
    public final void onDismiss() {
        C29874Bny c29874Bny = this.LJLILLLLZI;
        if (c29874Bny != null) {
            c29874Bny.invoke();
        }
    }

    @Override // X.InterfaceC62096OYq
    public final void LJI(Dialog dialog) {
        AnonymousClass149.LIZ.LJ(dialog);
    }

    @Override // X.InterfaceC62096OYq
    public final void LJIIIZ(Dialog dialog) {
        AnonymousClass149.LIZ.LIZ(dialog);
    }

    public C29868Bns(C29867Bnr c29867Bnr, C29930Bos c29930Bos) {
        this.LJLJI = c29867Bnr;
        this.LJLIL = c29930Bos;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String str, String str2, Bundle bundle) {
        C29889BoD LIZIZ;
        if (this.LJLJI.LJLJJL == null) {
            return;
        }
        ISubscribeService iSubscribeService = (ISubscribeService) CN1.LIZ(ISubscribeService.class);
        C29867Bnr c29867Bnr = this.LJLJI;
        iSubscribeService.CF(c29867Bnr.LJLL, c29867Bnr.LJLJJL, c29867Bnr.LJLLI);
        C29867Bnr c29867Bnr2 = this.LJLJI;
        Room room = c29867Bnr2.LJLJJL;
        C29075Bb5.LJFF(room, c29867Bnr2.LJLLI, c29867Bnr2.LJLLILLLL, str2, room.getLabels(), bundle);
        this.LJLJI.LJLLI.qv0(ShareJoinInGoodyBag.class, str);
        HashMap hashMap = null;
        if (!this.LJLJI.LJLJJI && ((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
            hashMap = C03660Ck.LIZJ("connection_type", "manual_pk");
            hashMap.put("pk_id", String.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).eq()));
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                hashMap.put("match_status", "pk_phase");
            } else {
                hashMap.put("match_status", "punish");
            }
        }
        C29867Bnr c29867Bnr3 = this.LJLJI;
        Room room2 = c29867Bnr3.LJLJJL;
        DataChannel dataChannel = c29867Bnr3.LJLLI;
        C29930Bos c29930Bos = this.LJLIL;
        C29075Bb5.LIZJ(room2, dataChannel, str, str2, bundle, c29930Bos.LJJ, hashMap, c29930Bos);
        C29867Bnr c29867Bnr4 = this.LJLJI;
        C29075Bb5.LJ(c29867Bnr4.LJLJJL, c29867Bnr4.LJLLI, str);
        Context context = this.LJLJI.LJLL;
        if (context != null && (LIZIZ = C29889BoD.LIZIZ(context)) != null) {
            LIZIZ.LJIIIIZZ(str, "live.mt.lastest.share.channel");
        }
        if (ShareEffectShowIntervalSetting.INSTANCE.getValue().showShareEffect) {
            InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LJLJI.LJLJJL.getId());
            if (hq0 != null) {
                hq0.LJII();
            }
            if (this.LJLJI.LJLJJI) {
                if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_shared_anchor_share_special_effect_show")) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_shared_anchor_share_special_effect_show");
                    LIZ.LJIILLIIL(this.LJLJI.LJLLI);
                    LIZ.LJJIIJZLJL();
                    return;
                }
                return;
            }
            if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_share_special_effect_shared_audience_show")) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_share_special_effect_shared_audience_show");
            LIZ2.LJIILLIIL(this.LJLJI.LJLLI);
            LIZ2.LJJIIJZLJL();
        }
    }
}
