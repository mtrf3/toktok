package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.BoE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29890BoE implements InterfaceC62096OYq {
    public final /* synthetic */ C29930Bos LJLIL;
    public final /* synthetic */ AbsAudienceInteractionFragment LJLILLLLZI;

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void onDismiss() {
    }

    @Override // X.InterfaceC62096OYq
    public final void LJI(Dialog dialog) {
        AnonymousClass149.LIZ.LJ(dialog);
    }

    @Override // X.InterfaceC62096OYq
    public final void LJIIIZ(Dialog dialog) {
        AnonymousClass149.LIZ.LIZ(dialog);
    }

    public C29890BoE(AbsAudienceInteractionFragment absAudienceInteractionFragment, C29930Bos c29930Bos) {
        this.LJLILLLLZI = absAudienceInteractionFragment;
        this.LJLIL = c29930Bos;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String str, String str2, Bundle bundle) {
        Dialog dialog = (Dialog) this.LJLILLLLZI.mLongPressDialog;
        if (dialog == null) {
            C30868C9o.LIZJ(R.string.o1n);
        } else {
            Activity topActivity = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
            C26045AKb c26045AKb = new C26045AKb(dialog);
            if (topActivity != null && C29306Beo.LJIIZILJ(topActivity.getRequestedOrientation())) {
                topActivity.getWindowManager().getDefaultDisplay().getRealMetrics(new DisplayMetrics());
                c26045AKb.LIZ.LJLILLLLZI = (int) (r1.widthPixels * 0.66f);
            }
            c26045AKb.LJIIIIZZ(R.string.o1n);
            c26045AKb.LJIIJ();
        }
        AbsAudienceInteractionFragment absAudienceInteractionFragment = this.LJLILLLLZI;
        Room room = absAudienceInteractionFragment.mRoom;
        C29075Bb5.LJFF(room, absAudienceInteractionFragment.mDataChannel, absAudienceInteractionFragment, str2, room.getLabels(), bundle);
        HashMap hashMap = new HashMap();
        if (((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
            hashMap.put("connection_type", "manual_pk");
            hashMap.put("pk_id", String.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).eq()));
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                hashMap.put("match_status", "pk_phase");
            } else {
                hashMap.put("match_status", "punish");
            }
        }
        AbsAudienceInteractionFragment absAudienceInteractionFragment2 = this.LJLILLLLZI;
        Room room2 = absAudienceInteractionFragment2.mRoom;
        DataChannel dataChannel = absAudienceInteractionFragment2.mDataChannel;
        C29930Bos c29930Bos = this.LJLIL;
        C29075Bb5.LIZJ(room2, dataChannel, str, str2, bundle, c29930Bos.LJJ, hashMap, c29930Bos);
        AbsAudienceInteractionFragment absAudienceInteractionFragment3 = this.LJLILLLLZI;
        C29075Bb5.LJ(absAudienceInteractionFragment3.mRoom, absAudienceInteractionFragment3.mDataChannel, str);
    }
}
