package com.bytedance.android.livesdk.userinfowidget;

import X.C05170If;
import X.C15380j0;
import X.C15640jQ;
import X.C28663BMt;
import X.C29306Beo;
import X.C29717BlR;
import X.C29727Blb;
import X.C31665Cbl;
import X.C72545SdZ;
import X.C73943T0h;
import X.CN1;
import X.EnumC29732Blg;
import X.InterfaceC28658BMo;
import Y.ALAdapterS4S0100000_5;
import Y.ALAdapterS4S0200000_5;
import Y.AUListenerS97S0200000_5;
import Y.AfS36S0101000_5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class ClearScreenUserInfoWidget extends LiveRoomUserInfoWidget {
    public static final /* synthetic */ int LLLI = 0;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public boolean LLJLL;
    public ViewGroup LLJLLIL;
    public Animator LLJLLL;
    public Animator LLJZ;
    public Animator LLJZIJLIL;
    public Animator LLL;
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;
    public int LLLFZ;

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, X.InterfaceC29986Bpm
    public String A4() {
        return "ClearScreenUserInfoWidget";
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget
    public final void LLIIIJ() {
        this.LLFF = 0;
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget
    public final void LLIIII() {
        this.LLLFZ = 8;
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget
    public final void LLIIIILZ() {
        View view = this.LLJIJIL;
        if (view != null) {
            if (view == this.LJLLI) {
                this.LLLFF = 0;
            } else {
                if (view != this.LJLJL) {
                    return;
                }
                this.LLLF = 0;
            }
        }
    }

    public final void LLILLL() {
        C29727Blb c29727Blb = this.LLJILJILJ;
        if (c29727Blb != null) {
            c29727Blb.LJFF();
        }
        Animator animator = this.LLJLLL;
        if (animator != null && animator.isRunning()) {
            this.LLJLLL.end();
        }
        Animator animator2 = this.LLJZ;
        if (animator2 != null && animator2.isRunning()) {
            this.LLJZ.end();
        }
        Animator animator3 = this.LLJZIJLIL;
        if (animator3 != null && animator3.isRunning()) {
            this.LLJZIJLIL.end();
        }
        Animator animator4 = this.LLL;
        if (animator4 != null && animator4.isRunning()) {
            this.LLL.end();
        }
    }

    public final Animator LLILZ() {
        GradientDrawable gradientDrawable = (GradientDrawable) this.LLIIII.getBackground();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS97S0200000_5(this, gradientDrawable, 0));
        ofFloat.addListener(new ALAdapterS4S0200000_5(this, gradientDrawable, 12));
        ofFloat.setDuration(200L);
        return ofFloat;
    }

    public final Animator LLILZIL() {
        GradientDrawable gradientDrawable = (GradientDrawable) this.LLIIII.getBackground();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new AUListenerS97S0200000_5(this, gradientDrawable, 1));
        ofFloat.addListener(new ALAdapterS4S0200000_5(this, gradientDrawable, 11));
        ofFloat.setDuration(200L);
        return ofFloat;
    }

    public final Animator LLILZLL() {
        int LIZ;
        float f;
        ViewGroup viewGroup = this.LLJLLIL;
        if (viewGroup != null) {
            if (((View) viewGroup.getParent()) != null) {
                f = (r0.getHeight() - this.LLJLLIL.getHeight()) / 2.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LLJLLIL, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f, f);
                ofFloat.addListener(new ALAdapterS4S0100000_5(this, 37));
                ofFloat.setDuration(200L);
                return ofFloat;
            }
            LIZ = C15380j0.LIZ(8.0f);
        } else {
            LIZ = C15380j0.LIZ(8.0f);
        }
        f = LIZ;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LLJLLIL, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f, f);
        ofFloat2.addListener(new ALAdapterS4S0100000_5(this, 37));
        ofFloat2.setDuration(200L);
        return ofFloat2;
    }

    public final Animator LLIZ() {
        int LIZ;
        float f;
        ViewGroup viewGroup = this.LLJLLIL;
        if (viewGroup != null) {
            if (((View) viewGroup.getParent()) != null) {
                f = (r0.getHeight() - this.LLJLLIL.getHeight()) / 2.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LLJLLIL, (Property<ViewGroup, Float>) View.TRANSLATION_Y, f, 0.0f);
                ofFloat.addListener(new ALAdapterS4S0100000_5(this, 38));
                ofFloat.setDuration(200L);
                return ofFloat;
            }
            LIZ = C15380j0.LIZ(8.0f);
        } else {
            LIZ = C15380j0.LIZ(8.0f);
        }
        f = LIZ;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LLJLLIL, (Property<ViewGroup, Float>) View.TRANSLATION_Y, f, 0.0f);
        ofFloat2.addListener(new ALAdapterS4S0100000_5(this, 38));
        ofFloat2.setDuration(200L);
        return ofFloat2;
    }

    public void LLIZLLLIL() {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.LLLFFI == 8) {
            Animator LLILZLL = LLILZLL();
            this.LLJZIJLIL = LLILZLL;
            animatorSet.playTogether(LLILZLL);
        } else {
            this.LLJLLL = LLILZIL();
            Animator LLILZLL2 = LLILZLL();
            this.LLJZIJLIL = LLILZLL2;
            animatorSet.playTogether(this.LLJLLL, LLILZLL2);
        }
        animatorSet.addListener(new ALAdapterS4S0100000_5(this, 35));
        animatorSet.start();
    }

    public void LLJ() {
        if (this.LLJILJILJ == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C29727Blb c29727Blb = this.LLJILJILJ;
        if ((c29727Blb.LJIIL == EnumC29732Blg.FOLLOW_ANIM && !c29727Blb.LJIIIIZZ()) || this.LLJILJILJ.LJIIL == EnumC29732Blg.FOLLOWED) {
            this.LLJILJILJ.LJIIL = EnumC29732Blg.FOLLOWED;
            Animator LLIZ = LLIZ();
            this.LLL = LLIZ;
            animatorSet.playTogether(LLIZ);
        } else {
            this.LLJZ = LLILZ();
            Animator LLIZ2 = LLIZ();
            this.LLL = LLIZ2;
            animatorSet.playTogether(this.LLJZ, LLIZ2);
        }
        animatorSet.addListener(new ALAdapterS4S0100000_5(this, 36));
        animatorSet.start();
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, X.YA7
    public final void LJJJJ() {
        super.LJJJJ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            InterfaceC28658BMo.LIZ.getClass();
            C28663BMt.LIZ(dataChannel, "userinfo_widget_load");
            C72545SdZ.LJFF(this.dataChannel, "is_top_optimization", "1");
        }
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        LLILLL();
        if (this.LLJLL) {
            if (this.LLJZ == null) {
                this.LLJZ = LLILZ();
            }
            this.LLJZ.end();
            if (this.LLL == null) {
                this.LLL = LLIZ();
            }
            this.LLL.end();
            LLJI(true);
            C29306Beo.LJJLJLI(this.LJLJJLL);
            C29306Beo.LJJLJLI(this.LJLJJI);
        }
        this.LLJLL = false;
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
    }

    public final void LLILLJJLI(boolean z) {
        User user;
        IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        if (this.LLILIL != null && iMicRoomService.rk()) {
            Room room = this.LLILIL;
            try {
                if (room.officialChannelInfo.channelUser.getId() == room.getOwnerUserId()) {
                    return;
                }
            } catch (Exception unused) {
            }
            if (z) {
                if (this.LLILIL.getOwner() != null && this.LLILIL.getOwner().getAvatarThumb() != null) {
                    C31665Cbl.LJIIIZ(this.LJLJJL, this.LLILIL.getOwner().getAvatarThumb(), R.drawable.cul);
                    this.LJLJLLL.setText(C05170If.LIZ(this.LLILIL.getOwner()));
                    this.LJLJLLL.requestLayout();
                    if (this.LLILIL.getOwner().getAuthenticationInfo() != null) {
                        C29306Beo.LJJLJLI(this.LJLL);
                        C15640jQ.LJFF(this.LJLL, this.LLILIL.getOwner().getAuthenticationInfo().authenticationBadge, 0, new IDdS56S0100000_5(this, 4));
                        return;
                    } else {
                        C29306Beo.LJI(this.LJLL);
                        this.LJLL.setImageDrawable(null);
                        return;
                    }
                }
                return;
            }
            OfficialChannelInfo officialChannelInfo = this.LLILIL.officialChannelInfo;
            if (officialChannelInfo == null || (user = officialChannelInfo.channelUser) == null || user.getAvatarThumb() == null) {
                return;
            }
            C31665Cbl.LJIIIZ(this.LJLJJL, this.LLILIL.officialChannelInfo.channelUser.getAvatarThumb(), R.drawable.cul);
            this.LJLJLLL.setText(C05170If.LIZ(this.LLILIL.officialChannelInfo.channelUser));
            this.LJLJLLL.requestLayout();
            if (this.LLILIL.officialChannelInfo.channelUser.getAuthenticationInfo() != null) {
                C29306Beo.LJJLJLI(this.LJLL);
                C15640jQ.LJFF(this.LJLL, this.LLILIL.officialChannelInfo.channelUser.getAuthenticationInfo().authenticationBadge, 0, new IDdS56S0100000_5(this, 5));
            } else {
                C29306Beo.LJI(this.LJLL);
                this.LJLL.setImageDrawable(null);
            }
        }
    }

    public final void LLJI(boolean z) {
        this.LJLJI.setClickable(z);
        this.LLIIIL.setClickable(z);
        this.LLIIIJ.setClickable(z);
        this.LLIIJLIL.setClickable(z);
        this.LLIIIZ.setClickable(z);
        this.LLIIL.setClickable(z);
        this.LLIILII.setClickable(z);
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object... objArr) {
        super.onInit(objArr);
        this.LLJLLIL = (ViewGroup) findViewById(R.id.myg);
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object... objArr) {
        super.onLoad(objArr);
        show();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            InterfaceC28658BMo.LIZ.getClass();
            C28663BMt.LIZ(dataChannel, "userinfo_widget_load");
            C72545SdZ.LJFF(this.dataChannel, "is_top_optimization", CardStruct.IStatusCode.DEFAULT);
        }
        this.LLILII.LIZ(C73943T0h.LIZ().LJ(C29717BlR.class).LJJJJZI(new AfS36S0101000_5(0, this, 1)));
    }
}
