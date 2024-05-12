package X;

import Y.ARunnableS41S0100000_5;
import Y.AfS65S0100000_13;
import Y.IDDListenerS152S0100000_13;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.MultiGuestGiftSwitchTargetDialog;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.GiftTargetUserChangeEvent;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGiftToolbarRememberSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC75104Tdk extends AbstractC32579CqV implements View.OnClickListener {
    public final AbstractC73672Svk<User> LJLJL;
    public final DataChannel LJLJLJ;
    public final Runnable LJLJLLL;
    public User LJLL;
    public C47121t6 LJLLI;
    public C73116Smm LJLLILLLL;
    public ViewGroup LJLLJ;
    public ViewGroup LJLLL;
    public final C73318Sq2 LJLLLL;
    public User LJLLLLLL;
    public MultiGuestGiftSwitchTargetDialog LJLZ;
    public String LJZ;
    public boolean LJZI;
    public final TRD LJZL;

    @Override // X.AbstractC32579CqV
    public final void LJIILJJIL() {
    }

    @Override // X.AbstractC32579CqV
    public final void LJIILIIL() {
        this.LJLLLL.LIZLLL();
        DataChannel dataChannel = this.LJLJLJ;
        dataChannel.getClass();
        dataChannel.jv0(this);
        MultiGuestGiftSwitchTargetDialog multiGuestGiftSwitchTargetDialog = this.LJLZ;
        if (multiGuestGiftSwitchTargetDialog != null && multiGuestGiftSwitchTargetDialog.isShowing()) {
            MultiGuestGiftSwitchTargetDialog multiGuestGiftSwitchTargetDialog2 = this.LJLZ;
            if (multiGuestGiftSwitchTargetDialog2 != null) {
                multiGuestGiftSwitchTargetDialog2.dismiss();
            }
            this.LJLZ = null;
        }
    }

    @Override // X.AbstractC32579CqV
    public final void LJIILL() {
        C8E.LJ().e3(this.LJZL);
    }

    @Override // X.AbstractC32579CqV
    public final void LJIJJ() {
        super.LJIJJ();
        C8E.LJ().X3(this.LJZL);
    }

    @Override // X.AbstractC32579CqV
    public final void onStart() {
        this.LJLL = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        ViewGroup viewGroup = this.LJLLJ;
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, this);
        }
        ViewGroup viewGroup2 = this.LJLLL;
        if (viewGroup2 != null) {
            C16880lQ.LJIIL(viewGroup2, this);
        }
        this.LJLLLL.LIZ(this.LJLJL.LJJJLIIL(new AfS65S0100000_13(this, 133), new AfS65S0100000_13(this, 134)));
        this.LJLJLJ.mv0(GiftTargetUserChangeEvent.class, this, new AqS179S0100000_13(this, 441));
    }

    public static final String LJJI(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_MultiGuestGiftSwitchTargetLeaf_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_MultiGuestGiftSwitchTargetLeaf_", i, LIZ2);
    }

    public final void LJJIFFI(User user) {
        List<String> list;
        this.LJLLLLLL = user;
        C74824TYe.LJIILL = "gift_panel";
        ImageModel avatarThumb = user.getAvatarThumb();
        if (avatarThumb != null && avatarThumb.getUrls() != null) {
            BQO LIZ = C15650jR.LIZ();
            ImageModel avatarThumb2 = user.getAvatarThumb();
            if (avatarThumb2 != null) {
                list = avatarThumb2.getUrls();
            } else {
                list = null;
            }
            C78720Uuy LIZ2 = LIZ.LIZ(list);
            LIZ2.LJIIL = Boolean.TRUE;
            LIZ2.LJIIIIZZ = R.drawable.cul;
            LIZ2.LJIIJJI(this.LJLLILLLL);
        } else {
            C73116Smm c73116Smm = this.LJLLILLLL;
            if (c73116Smm != null) {
                c73116Smm.setActualImageResource(R.drawable.cul);
            }
        }
        C47121t6 c47121t6 = this.LJLLI;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setText(C05170If.LIZ(user));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Long l;
        MultiGuestGiftSwitchTargetDialog multiGuestGiftSwitchTargetDialog;
        MultiGuestGiftSwitchTargetDialog multiGuestGiftSwitchTargetDialog2;
        if (C74947TbD.LJIJ()) {
            String LJJI = LJJI(232);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fast click ");
            LIZ.append(view);
            LIZ.append(", so return");
            C32014ChO.LJIIJ(LJJI, X1D.LIZIZ(LIZ));
            return;
        }
        if (o.LJ(view, this.LJLLJ)) {
            DataChannel dataChannel = this.LJLJLJ;
            if (dataChannel != null) {
                dataChannel.qv0(GiftDialogDismissEvent.class, Boolean.TRUE);
            }
            if (this.LJLZ == null) {
                User user = this.LJLLLLLL;
                boolean z = this.LJZI;
                String str2 = this.LJZ;
                MultiGuestGiftSwitchTargetDialog.LJLJJL = user;
                MultiGuestGiftSwitchTargetDialog.LJLJJLL = z;
                MultiGuestGiftSwitchTargetDialog.LJLJL = str2;
                this.LJLZ = new MultiGuestGiftSwitchTargetDialog();
            }
            if (MultiGuestGiftToolbarRememberSetting.INSTANCE.isEnable() && (multiGuestGiftSwitchTargetDialog2 = this.LJLZ) != null) {
                multiGuestGiftSwitchTargetDialog2.setOnDismissListener(new IDDListenerS152S0100000_13(this, 14));
            }
            FragmentManager fragmentManager = (FragmentManager) this.LJLJLJ.kv0(C29494Bhq.class);
            if (fragmentManager != null && (multiGuestGiftSwitchTargetDialog = this.LJLZ) != null) {
                multiGuestGiftSwitchTargetDialog.show(fragmentManager, ViewOnClickListenerC75104Tdk.class.getName());
            }
            User user2 = this.LJLLLLLL;
            String str3 = this.LJZ;
            HashMap LIZLLL = C73098SmU.LIZLLL();
            if (str3 != null) {
                LIZLLL.put("gift_enter_from", str3);
            }
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            LIZLLL.put("user_type", C74824TYe.LJIILL(LJ));
            if (user2 != null) {
                LIZLLL.put("to_user_type", C74824TYe.LJIILL(user2));
                l = Long.valueOf(user2.getId());
            } else {
                l = null;
            }
            LIZLLL.put("to_user_id", String.valueOf(l));
            C74824TYe.LJLL("livesdk_gift_recipient_switch_entrance_click", LIZLLL);
            return;
        }
        if (!o.LJ(view, this.LJLLL) || !C74947TbD.LJ("openUserProfile", this.LJLIL, this.LJLLLL)) {
            return;
        }
        if (C74947TbD.LJIIZILJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()))) {
            str = "live_anchor_c_audience";
        } else {
            str = "live_audience_c_audience";
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(this.LJLLLLLL, str);
        userProfileEvent.mReportType = "report_user";
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mClickUserPosition = "gift_panel";
        C73943T0h.LIZ().LIZIZ(userProfileEvent);
    }

    @Override // X.AbstractC32579CqV
    public final void LJIJI(User user, String str, boolean z) {
        this.LJZ = str;
        this.LJZI = z;
        C74824TYe.LJJIJLIJ(user, str, false);
    }

    @Override // X.AbstractC32579CqV
    public final OSZ<View, C018905p> LJIJJLI(Context context, ViewGroup parent, LayoutInflater layoutInflater) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dlc, parent, false);
        this.LJLLI = (C47121t6) LLLLIILL.findViewById(R.id.lbj);
        this.LJLLILLLL = (C73116Smm) LLLLIILL.findViewById(R.id.eye);
        this.LJLLJ = (ViewGroup) LLLLIILL.findViewById(R.id.dsi);
        this.LJLLL = (ViewGroup) LLLLIILL.findViewById(R.id.lbi);
        return new OSZ<>(LLLLIILL, null);
    }

    public ViewOnClickListenerC75104Tdk(Context context, C73893SzJ c73893SzJ, int i, DataChannel dataChannel, ARunnableS41S0100000_5 aRunnableS41S0100000_5) {
        super(context, i);
        this.LJLJL = c73893SzJ;
        this.LJLJLJ = dataChannel;
        this.LJLJLLL = aRunnableS41S0100000_5;
        this.LJLLLL = new C73318Sq2();
        this.LJZL = new TRD(this);
    }
}
