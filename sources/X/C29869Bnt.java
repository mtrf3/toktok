package X;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.share.ShareApi;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ShareEffectShowIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bnt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29869Bnt implements InterfaceC62096OYq {
    public final /* synthetic */ C29935Box LJLIL;
    public final /* synthetic */ C29930Bos LJLILLLLZI;

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void onDismiss() {
    }

    public C29869Bnt(C29935Box c29935Box, C29930Bos c29930Bos) {
        this.LJLIL = c29935Box;
        this.LJLILLLLZI = c29930Bos;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String platform, String shareType, Bundle bundle) {
        String[] stringArray;
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(shareType, "shareType");
        C30868C9o.LIZJ(R.string.o1n);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (o.LJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "manual_pk")) {
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                linkedHashMap.put("match_status", "pk_phase");
            } else {
                linkedHashMap.put("match_status", "punish");
            }
        }
        C29935Box c29935Box = this.LJLIL;
        Room room = c29935Box.LIZ;
        C29075Bb5.LJFF(room, c29935Box.LJ, c29935Box.LIZIZ, shareType, room.getLabels(), bundle);
        C29935Box c29935Box2 = this.LJLIL;
        Room room2 = c29935Box2.LIZ;
        DataChannel dataChannel = c29935Box2.LJ;
        String str = this.LJLILLLLZI.LJJ;
        o.LJIIIIZZ(str, "shareParams.requestPage");
        C29930Bos shareParams = this.LJLILLLLZI;
        o.LJIIIIZZ(shareParams, "shareParams");
        C29075Bb5.LIZJ(room2, dataChannel, platform, shareType, bundle, str, linkedHashMap, shareParams);
        C29935Box c29935Box3 = this.LJLIL;
        C29075Bb5.LJ(c29935Box3.LIZ, c29935Box3.LJ, platform);
        long id = this.LJLIL.LIZ.getId();
        if (bundle != null && (stringArray = bundle.getStringArray(((IHostShare) CN1.LIZ(IHostShare.class)).getBundleKey(0))) != null && stringArray.length != 0) {
            C1EW.LIZ(((ShareApi) Q7L.LIZIZ(ShareApi.class)).submitShare(id, ORY.LJJJJLL(stringArray, ",", null, null, null, 62))).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9D2
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }, new InterfaceC64592gB() { // from class: X.9D3
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        if (ShareEffectShowIntervalSetting.INSTANCE.getValue().showShareEffect) {
            InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LJLIL.LIZ.getId());
            if (hq0 != null) {
                hq0.LJII();
            }
            if (C29306Beo.LJIIJ(this.LJLIL.LJ)) {
                if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_shared_anchor_share_special_effect_show")) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_shared_anchor_share_special_effect_show");
                    LIZ.LJIILLIIL(this.LJLIL.LJ);
                    LIZ.LJJIIJZLJL();
                    return;
                }
                return;
            }
            if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_share_special_effect_shared_audience_show")) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_share_special_effect_shared_audience_show");
            LIZ2.LJIILLIIL(this.LJLIL.LJ);
            LIZ2.LJJIIJZLJL();
        }
    }
}
