package X;

import Y.AfS54S0200000_5;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileV3Setting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.jvm.internal.AqS171S0100000_5;

/* renamed from: X.Bh7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC29449Bh7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C29448Bh6 LJLIL;
    public final /* synthetic */ UserProfileEvent LJLILLLLZI;
    public final /* synthetic */ C29456BhE LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ DataChannel LJLJJL;

    public DialogInterfaceOnClickListenerC29449Bh7(C29448Bh6 c29448Bh6, String str, UserProfileEvent userProfileEvent, C29456BhE c29456BhE, int i, DataChannel dataChannel) {
        this.LJLIL = c29448Bh6;
        this.LJLILLLLZI = userProfileEvent;
        this.LJLJI = c29456BhE;
        this.LJLJJI = i;
        this.LJLJJL = dataChannel;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        long j;
        FollowInfo followInfo;
        dialogInterface.dismiss();
        if (this.LJLIL.LIZIZ.getFollowInfo() == null) {
            return;
        }
        C29448Bh6 c29448Bh6 = this.LJLIL;
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(c29448Bh6.LJ);
        int followStatus = (int) this.LJLIL.LIZIZ.getFollowInfo().getFollowStatus();
        long id = this.LJLIL.LIZIZ.getId();
        long id2 = this.LJLIL.LJI.getId();
        AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(this.LJLIL, 907);
        c29448Bh6.LJII.setValue(new C29488Bhk<>(null, 1, null));
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        C29359Bff c29359Bff = new C29359Bff();
        c29359Bff.LIZJ = LIZIZ;
        c29359Bff.LIZIZ(id);
        c29359Bff.LIZIZ = followStatus;
        c29359Bff.LJI = true;
        c29359Bff.LIZLLL = id2;
        ((InterfaceC29856Bng) ((C29374Bfu) LIZIZ2).LJIJJ(new C29360Bfg(c29359Bff)).LIZJ(C73933Szx.LJ(c29448Bh6.LIZ.LIZIZ))).LIZJ(new AfS54S0200000_5(c29448Bh6, aqS171S0100000_5, 83), new AfS54S0200000_5(c29448Bh6, aqS171S0100000_5, 84));
        C29448Bh6 c29448Bh62 = this.LJLIL;
        C29292Bea c29292Bea = c29448Bh62.LIZLLL;
        User user = c29448Bh62.LIZIZ;
        long id3 = user.getId();
        String str = this.LJLILLLLZI.interactLogLabel;
        boolean LIZ = this.LJLJI.LIZ();
        int i2 = this.LJLJJI;
        boolean LJ = this.LJLJI.LJ();
        long followStatus2 = this.LJLIL.LIZIZ.getFollowInfo().getFollowStatus();
        C29448Bh6 c29448Bh63 = this.LJLIL;
        boolean z = c29448Bh63.LIZ.LJ;
        UserProfileEvent userProfileEvent = this.LJLILLLLZI;
        String str2 = userProfileEvent.mEventPage;
        boolean z2 = userProfileEvent.isFromProgrammedLiveMenu;
        boolean z3 = userProfileEvent.isFromProgrammedLiveFollowCard;
        FollowInfo followInfo2 = c29448Bh63.LJIIIZ;
        if (followInfo2 != null) {
            j = followInfo2.getFollowStatus();
        } else {
            j = 0;
        }
        c29292Bea.LIZLLL(user, false, id3, str, LIZ, i2, LJ, followStatus2, z, str2, z2, z3, Long.valueOf(j));
        if (C28835BTj.LJFF(this.LJLJJL) && this.LJLIL.LJI.getOwner() != null && this.LJLJI.LIZJ()) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(this.LJLIL.LJI.getOwner().getId()));
            hashMap.put("room_id", String.valueOf(this.LJLIL.LJI.getId()));
            C28835BTj.LIZ("live_ad", "unfollow", null, hashMap);
        }
        C29448Bh6 c29448Bh64 = this.LJLIL;
        c29448Bh64.getClass();
        if (!LiveProfileV3Setting.INSTANCE.isEnableFastFollow() || (followInfo = c29448Bh64.LIZIZ.getFollowInfo()) == null) {
            return;
        }
        if (followInfo.getFollowStatus() == 2) {
            followInfo.setFollowStatus(3L);
        } else {
            followInfo.setFollowStatus(0L);
        }
        c29448Bh64.LJII();
        c29448Bh64.LJFF.setValue(Integer.valueOf((int) followInfo.getFollowStatus()));
    }
}
