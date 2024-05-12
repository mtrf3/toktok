package X;

import android.app.Dialog;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BeL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29277BeL implements InterfaceC62096OYq {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ LifecycleOwner LJLJI;
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
        Room room = this.LJLIL;
        C29075Bb5.LJFF(room, this.LJLILLLLZI, this.LJLJI, shareType, room.getLabels(), bundle);
        Room room2 = this.LJLIL;
        DataChannel dataChannel = this.LJLILLLLZI;
        C29930Bos shareParams = this.LJLJJI;
        o.LJIIIIZZ(shareParams, "shareParams");
        C29075Bb5.LIZJ(room2, dataChannel, platform, shareType, bundle, "share_capsule", linkedHashMap, shareParams);
        C29075Bb5.LJ(this.LJLIL, this.LJLILLLLZI, platform);
    }

    public C29277BeL(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner, C29930Bos c29930Bos) {
        this.LJLIL = room;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = c29930Bos;
    }
}
