package X;

import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveNickNameFontOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileV3Setting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUserPreviewOptPackageSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FollowBackTextSetting;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bh6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29448Bh6 implements InterfaceC29444Bh2 {
    public final C29484Bhg LIZ;
    public User LIZIZ;
    public final DataChannel LIZJ;
    public final C29292Bea LIZLLL;
    public final Context LJ;
    public final MutableLiveData<Integer> LJFF;
    public final Room LJI;
    public final MutableLiveData<C29488Bhk<FollowPair>> LJII;
    public final C2A7 LJIIIIZZ;
    public FollowInfo LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;

    public final void LJFF() {
        FollowInfo followInfo;
        if (!LiveProfileV3Setting.INSTANCE.isEnableFastFollow() || (followInfo = this.LJIIIZ) == null) {
            return;
        }
        this.LIZIZ.setFollowInfo(followInfo);
        LJII();
        this.LJFF.setValue(Integer.valueOf((int) this.LIZIZ.getFollowInfo().getFollowStatus()));
    }

    public final void LJI() {
        this.LJIIIIZZ.setIcon((Drawable) null);
        this.LJIIIIZZ.setText(C15380j0.LJIILJJIL(R.string.k1m));
        this.LJIIIIZZ.LJJLL(this.LJIIJ);
        C16880lQ.LJJIII(this.LJIIIIZZ, new ACListenerS25S0100000_5(this, 475));
    }

    public final void LJII() {
        if (this.LIZIZ.getFollowInfo() == null) {
            return;
        }
        this.LJIIIIZZ.setText("");
        this.LJIIIIZZ.LJJLL(this.LJIIJJI);
        long followStatus = this.LIZIZ.getFollowInfo().getFollowStatus();
        if (followStatus == 2) {
            this.LJIIIIZZ.setIcon(R.drawable.d_3);
            this.LJIIIIZZ.setText(R.string.ml4);
        } else if (followStatus == 1) {
            this.LJIIIIZZ.setIcon(R.drawable.d_2);
            this.LJIIIIZZ.setText(R.string.svk);
        } else if (followStatus == 3) {
            this.LJIIIIZZ.LJJLL(this.LJIIJ);
            if (FollowBackTextSetting.INSTANCE.getValue()) {
                this.LJIIIIZZ.setText(R.string.l9i);
            } else {
                this.LJIIIIZZ.setText(R.string.svj);
            }
            this.LJIIIIZZ.setIcon(C259910h.LJ(R.attr.av7, this.LJ));
            this.LIZIZ.getFollowInfo().setPushStatus(2L);
        } else {
            this.LJIIIIZZ.LJJLL(this.LJIIJ);
            this.LJIIIIZZ.setText(R.string.svj);
            this.LJIIIIZZ.setIcon(C259910h.LJ(R.attr.av7, this.LJ));
            this.LIZIZ.getFollowInfo().setPushStatus(2L);
        }
        C16880lQ.LJJIII(this.LJIIIIZZ, new ACListenerS25S0100000_5(this, 476));
    }

    @Override // X.InterfaceC29444Bh2
    public final /* bridge */ /* synthetic */ MutableLiveData LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC29444Bh2
    public final C2A7 getContentView() {
        return this.LJIIIIZZ;
    }

    public static void LJ(Throwable th) {
        if (th instanceof C29401Dk) {
            C30868C9o.LJI(((C29401Dk) th).getPrompt());
        } else {
            C30868C9o.LIZJ(R.string.svg);
        }
    }

    @Override // X.InterfaceC29444Bh2
    public final boolean LIZ(User user) {
        long followStatus;
        long followStatus2;
        User user2 = this.LIZIZ;
        if (user2.isBlock) {
            followStatus = -1;
        } else {
            followStatus = user2.getFollowInfo().getFollowStatus();
        }
        if (user.isBlock) {
            followStatus2 = -1;
        } else {
            followStatus2 = user.getFollowInfo().getFollowStatus();
        }
        this.LIZIZ = user;
        if (followStatus == followStatus2) {
            return false;
        }
        if (LiveUserPreviewOptPackageSetting.INSTANCE.isEnable()) {
            if (followStatus2 == -1) {
                LJI();
            } else {
                LJII();
            }
        } else {
            LJII();
        }
        return true;
    }

    public final void LIZLLL(String str) {
        String str2;
        BZI LIZ = C28787BRn.LIZ("livesdk_unblock_popup_click");
        LIZ.LJIILLIIL(this.LIZJ);
        LIZ.LJIJJ(Long.valueOf(this.LIZIZ.getId()), "to_user_id");
        if (this.LIZ.LIZJ.LIZ()) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        C06490Nh.LIZLLL(LIZ, str2, "user_type", str, "click_position");
    }

    public C29448Bh6(C29484Bhg cellConfig, User user, DataChannel dataChannel) {
        int i;
        int i2;
        C29292Bea c29292Bea = new C29292Bea(cellConfig.LJFF, user.getId());
        o.LJIIIZ(cellConfig, "cellConfig");
        o.LJIIIZ(user, "user");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = cellConfig;
        this.LIZIZ = user;
        this.LIZJ = dataChannel;
        this.LIZLLL = c29292Bea;
        Context context = cellConfig.LIZ;
        this.LJ = context;
        this.LJFF = new MutableLiveData<>();
        this.LJI = cellConfig.LJFF;
        this.LJII = new MutableLiveData<>();
        C2A7 c2a7 = new C2A7(context, null);
        this.LJIIIIZZ = c2a7;
        LiveNickNameFontOptSetting liveNickNameFontOptSetting = LiveNickNameFontOptSetting.INSTANCE;
        if (liveNickNameFontOptSetting.enableOptRoundCorner()) {
            i = R.style.acm;
        } else {
            i = R.style.a2z;
        }
        this.LJIIJ = i;
        if (liveNickNameFontOptSetting.enableOptRoundCorner()) {
            i2 = R.style.aco;
        } else {
            i2 = R.style.a3c;
        }
        this.LJIIJJI = i2;
        c2a7.LJJLL(i2);
        c2a7.setIconAutoMirrored(false);
        ((InterfaceC29856Bng) ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIIIZZ.LIZJ(C73933Szx.LJ(cellConfig.LIZIZ))).LIZIZ(new AfS57S0100000_5(this, 402));
        User user2 = this.LIZIZ;
        if (user2.isBlock) {
            FollowInfo followInfo = user2.getFollowInfo();
            if (followInfo != null) {
                followInfo.setFollowStatus(0L);
            }
            FollowInfo followInfo2 = this.LIZIZ.getFollowInfo();
            if (followInfo2 != null) {
                followInfo2.setPushStatus(0L);
            }
        }
        if (LiveUserPreviewOptPackageSetting.INSTANCE.isEnable()) {
            C73943T0h.LIZ().LIZJ(cellConfig.LIZIZ, BEU.class).LIZIZ(new AfS57S0100000_5(this, 403));
            if (this.LIZIZ.isBlock) {
                LJI();
                return;
            } else {
                LJII();
                return;
            }
        }
        LJII();
    }

    @Override // X.InterfaceC29444Bh2
    public final void LIZJ(int i, ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
        if (this.LJIIIIZZ.getParent() == null) {
            viewGroup.addView(this.LJIIIIZZ, i, layoutParams);
            return;
        }
        throw new RuntimeException("This button has been attached");
    }
}
