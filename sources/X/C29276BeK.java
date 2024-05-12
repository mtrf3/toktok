package X;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BeK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29276BeK implements InterfaceC62096OYq {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ CQQ LJLJI;
    public final /* synthetic */ C29930Bos LJLJJI;

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

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String platform, String shareType, Bundle bundle) {
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(shareType, "shareType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (o.LJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "manual_pk")) {
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                linkedHashMap.put("match_status", "pk_phase");
            } else {
                linkedHashMap.put("match_status", "punish");
            }
        }
        C30868C9o.LIZJ(R.string.o1n);
        Room room = this.LJLIL;
        C29075Bb5.LJFF(room, this.LJLILLLLZI, this.LJLJI.LIZIZ, shareType, room.getLabels(), bundle);
        Room room2 = this.LJLIL;
        DataChannel dataChannel = this.LJLILLLLZI;
        C29930Bos shareParams = this.LJLJJI;
        o.LJIIIIZZ(shareParams, "shareParams");
        C29075Bb5.LIZJ(room2, dataChannel, platform, shareType, bundle, "share_capsule", linkedHashMap, shareParams);
        C29075Bb5.LJ(this.LJLIL, this.LJLILLLLZI, platform);
    }

    public C29276BeK(Room room, DataChannel dataChannel, CQQ cqq, C29930Bos c29930Bos) {
        this.LJLIL = room;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = cqq;
        this.LJLJJI = c29930Bos;
    }
}
