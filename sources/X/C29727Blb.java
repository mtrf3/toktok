package X;

import Y.ALAdapterS4S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.room.FollowAnchorStateChangeEvent;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconNeedHideTextSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscribeEnhanceIconSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionAudienceEntranceEnhanceSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.Blb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29727Blb implements InterfaceC29736Blk {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final ViewGroup LIZLLL;
    public final View LJ;
    public final LiveIconView LJFF;
    public final View LJI;
    public final C2A4 LJII;
    public final ImageView LJIIIIZZ;
    public final ImageView LJIIIZ;
    public final TextView LJIIJ;
    public final ViewGroup LJIIJJI;
    public EnumC29732Blg LJIIL;
    public final IMicRoomService LJIILIIL;
    public final IProgrammedLiveService LJIILJJIL;
    public final DataChannel LJIILL;
    public final boolean LJIILLIIL;
    public final Room LJIIZILJ;
    public ValueAnimator LJIJI;
    public AnimatorSet LJIJJ;
    public final Context LJIL;
    public final int LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public ImageView LJJII;
    public ViewGroup LJJIII;
    public ViewGroup LJJIIJ;
    public InterfaceC29734Bli LJJIIJZLJL;
    public InterfaceC29734Bli LJJIIZ;
    public final boolean LJJIJIIJI;
    public ValueAnimator LJJIJIIJIL;
    public final C73318Sq2 LJIJ = new C73318Sq2();
    public final Boolean LJIJJLI = Boolean.valueOf(SubscribeEnhanceIconSetting.INSTANCE.getValue());
    public boolean LJJIIZI = false;
    public boolean LJJIJ = false;

    public final void LIZIZ() {
        C2A4 c2a4 = this.LJII;
        if (c2a4 != null && c2a4.LJFF()) {
            this.LJII.LJ();
        }
        ValueAnimator valueAnimator = this.LJIJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJIJI.cancel();
        }
        AnimatorSet animatorSet = this.LJIJJ;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.LJIJJ.cancel();
        }
        ValueAnimator valueAnimator2 = this.LJJIJIIJIL;
        if (valueAnimator2 != null) {
            C16880lQ.LJLJL(valueAnimator2);
            if (this.LJJIJIIJIL.isRunning()) {
                this.LJJIJIIJIL.cancel();
            }
        }
    }

    public final void LIZJ() {
        ViewGroup.LayoutParams layoutParams = this.LIZJ.getLayoutParams();
        layoutParams.width = this.LIZLLL.getMeasuredWidth();
        layoutParams.height = this.LIZLLL.getMeasuredHeight();
        this.LIZJ.setLayoutParams(layoutParams);
        KL2.LJIILLIIL(0, this.LIZJ);
        ViewGroup.LayoutParams layoutParams2 = this.LIZLLL.getLayoutParams();
        if (layoutParams2 instanceof C018905p) {
            ((C018905p) layoutParams2).startToEnd = R.id.e35;
        }
        this.LIZLLL.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.LIZ.getLayoutParams();
        if (layoutParams3 instanceof C018905p) {
            ((C018905p) layoutParams3).endToStart = R.id.d3d;
        }
        this.LIZ.setLayoutParams(layoutParams3);
    }

    public final void LJ() {
        ViewGroup.LayoutParams layoutParams = this.LIZLLL.getLayoutParams();
        if (layoutParams instanceof C018905p) {
            ((C018905p) layoutParams).startToEnd = R.id.gw3;
        }
        this.LIZLLL.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.LIZ.getLayoutParams();
        if (layoutParams2 instanceof C018905p) {
            ((C018905p) layoutParams2).endToStart = R.id.dkh;
        }
        this.LIZ.setLayoutParams(layoutParams2);
        KL2.LJIILLIIL(8, this.LIZJ);
    }

    public final void LJFF() {
        C2A4 c2a4 = this.LJII;
        if (c2a4 != null && c2a4.LJFF()) {
            this.LJII.LJ();
        }
        ValueAnimator valueAnimator = this.LJIJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJIJI.end();
        }
        AnimatorSet animatorSet = this.LJIJJ;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.LJIJJ.end();
        }
        ValueAnimator valueAnimator2 = this.LJJIJIIJIL;
        if (valueAnimator2 != null) {
            C16880lQ.LJLJL(valueAnimator2);
            if (this.LJJIJIIJIL.isRunning()) {
                this.LJJIJIIJIL.end();
            }
        }
    }

    public final ImageModel LJI() {
        OfficialChannelInfo officialChannelInfo;
        User user;
        IMicRoomService iMicRoomService = this.LJIILIIL;
        if (iMicRoomService != null && iMicRoomService.rk() && this.LJJ == 1) {
            Room room = this.LJIIZILJ;
            if (room != null && (officialChannelInfo = room.officialChannelInfo) != null && (user = officialChannelInfo.channelUser) != null && user.getSubscribeInfo() != null && this.LJIIZILJ.officialChannelInfo.channelUser.getSubscribeInfo().getSubscribeBadge() != null) {
                return this.LJIIZILJ.officialChannelInfo.channelUser.getSubscribeInfo().getSubscribeBadge().getOriginImage();
            }
            return null;
        }
        Room room2 = this.LJIIZILJ;
        if (room2 != null && room2.getOwner() != null && this.LJIIZILJ.getOwner().getSubscribeInfo() != null && this.LJIIZILJ.getOwner().getSubscribeInfo().getSubscribeBadge() != null) {
            return this.LJIIZILJ.getOwner().getSubscribeInfo().getSubscribeBadge().getOriginImage();
        }
        return null;
    }

    public final boolean LJIIIIZZ() {
        Room room;
        if (!this.LJJI || LIZLLL() || C29232Bdc.LJIILJJIL() || !C78609UtB.LJJJZ(this.LJIILLIIL)) {
            return false;
        }
        IMicRoomService iMicRoomService = this.LJIILIIL;
        if ((iMicRoomService != null && iMicRoomService.rk() && this.LJJ == 1) || this.LJIILLIIL || (room = this.LJIIZILJ) == null || room.getOwner() == null || this.LJIIZILJ.getOwner().getSubscribeInfo() == null || !this.LJIIZILJ.getOwner().getSubscribeInfo().isAnchorQualified()) {
            return false;
        }
        return true;
    }

    public final boolean LJIIIZ() {
        Room room;
        IMicRoomService iMicRoomService;
        OfficialChannelInfo officialChannelInfo;
        if (!this.LJIILLIIL && (room = this.LJIIZILJ) != null && (iMicRoomService = this.LJIILIIL) != null && (officialChannelInfo = room.officialChannelInfo) != null && officialChannelInfo.channelUser != null && iMicRoomService.rk()) {
            if (this.LJIIZILJ.officialChannelInfo.channelUser.getFollowInfo().getFollowStatus() == 1 || this.LJIIZILJ.officialChannelInfo.channelUser.getFollowInfo().getFollowStatus() == 2) {
                return true;
            }
            return false;
        }
        Room room2 = this.LJIIZILJ;
        if (room2 != null && room2.getOwner() != null && this.LJIIZILJ.getOwner().isFollowing()) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ() {
        if (!this.LJJI) {
            return false;
        }
        if (this.LJIILLIIL) {
            return true;
        }
        InterfaceC29734Bli interfaceC29734Bli = this.LJJIIZ;
        if (interfaceC29734Bli == null || !interfaceC29734Bli.LJIIIIZZ()) {
            return false;
        }
        return true;
    }

    public final boolean LJIIJJI() {
        IMicRoomService iMicRoomService = this.LJIILIIL;
        if ((iMicRoomService != null && iMicRoomService.rk()) || this.LJJ == 2) {
            return true;
        }
        return false;
    }

    public final boolean LJIIL() {
        IProgrammedLiveService iProgrammedLiveService;
        if (this.LJJ == 3 || ((iProgrammedLiveService = this.LJIILJJIL) != null && iProgrammedLiveService.lj())) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL() {
        Room room;
        if (!this.LJJI || C29232Bdc.LJIILJJIL()) {
            return false;
        }
        IMicRoomService iMicRoomService = this.LJIILIIL;
        if ((iMicRoomService != null && iMicRoomService.rk() && this.LJJ == 1) || this.LJIILLIIL || (room = this.LJIIZILJ) == null || room.getOwner() == null || this.LJIIZILJ.getOwner().getSubscribeInfo() == null || !this.LJIIZILJ.getOwner().isSubscribed()) {
            return false;
        }
        return true;
    }

    public final void LJIILJJIL() {
        String str;
        Room room = this.LJIIZILJ;
        if (room == null || room.getOwner() == null || this.LJIIZILJ.getOwner().getSubscribeInfo() == null) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_click");
        LIZ.LJIILLIIL(this.LJIILL);
        LIZ.LJIJJ(Long.valueOf(this.LJIIZILJ.getOwnerUserId()), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(this.LJIIZILJ.getId()), "room_id");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        LIZ.LJIJJ("click", "action_type");
        LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ.LJIJJ(BJM.LJIJ(), "video_id");
        if (this.LJIILLIIL) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJIJJ("live_left_corner", "click_position");
        LIZ.LJJIFFI(C29232Bdc.LJIJJ(this.LJIILL));
        LIZ.LJJIIJZLJL();
    }

    public final void LJIILL() {
        String str;
        long j;
        long j2;
        Room room = this.LJIIZILJ;
        if (room == null || room.getOwner() == null || this.LJIIZILJ.getOwner().getSubscribeInfo() == null) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_show");
        LIZ.LJIJJ(Long.valueOf(this.LJIIZILJ.getOwnerUserId()), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(this.LJIIZILJ.getId()), "room_id");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        LIZ.LJIJJ("click", "action_type");
        LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ.LJIJJ(BJM.LJIJ(), "video_id");
        if (this.LJIILLIIL) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJIJJ("live_left_corner", "show_entrance");
        LIZ.LJJIFFI(C29232Bdc.LJIJJ(this.LJIILL));
        LIZ.LJIILLIIL(this.LJIILL);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZ();
            LIZ.LJJIIZI();
        }
        C30929CBx.LJIILLIIL("live_left_corner");
        RecyclableWidgetManager recyclableWidgetManager = (RecyclableWidgetManager) this.LJIILL.kv0(C29738Blm.class);
        long j3 = 0;
        if (recyclableWidgetManager != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Long l = (Long) ((LinkedHashMap) C30317Bv7.LIZJ).get(recyclableWidgetManager);
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            j = uptimeMillis - j2;
            j3 = C30317Bv7.LIZLLL(recyclableWidgetManager);
        } else {
            j = 0;
        }
        JSONObject jSONObject = new JSONObject();
        C29830BnG.LJIIIIZZ(jSONObject);
        Long valueOf = Long.valueOf(j);
        if (valueOf != null) {
            jSONObject.put("subs_btn_load_self_duration", valueOf);
        }
        Long valueOf2 = Long.valueOf(j3);
        if (valueOf2 != null) {
            jSONObject.put("subs_btn_load_total_duration", valueOf2);
        }
        C0K2.LJIIIIZZ("ttlive_subscription_perf_entrance_show", 0, jSONObject);
    }

    public final boolean LIZLLL() {
        if (!LJIIJJI() && !LJIIL()) {
            Room room = this.LJIIZILJ;
            if (room == null) {
                room = null;
            }
            if (C29720BlU.LIZ(this.LJIILLIIL, room)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZ(EnumC29732Blg enumC29732Blg) {
        float f;
        float f2;
        long j;
        long j2;
        EnumC29732Blg enumC29732Blg2;
        ViewGroup viewGroup;
        EnumC29732Blg enumC29732Blg3 = this.LJIIL;
        if (enumC29732Blg3 == enumC29732Blg) {
            return;
        }
        if (enumC29732Blg == EnumC29732Blg.FOLLOW_ANIM && enumC29732Blg3 != EnumC29732Blg.UNFOLLOW) {
            return;
        }
        if (!this.LJIILLIIL && enumC29732Blg == EnumC29732Blg.UNFOLLOW && (viewGroup = this.LJJIII) != null && viewGroup.getVisibility() == 0 && LJIIJ()) {
            return;
        }
        this.LJIIL = enumC29732Blg;
        LIZIZ();
        LJ();
        int i = 8;
        KL2.LJIILLIIL(8, this.LIZLLL);
        KL2.LJIILLIIL(8, this.LJ);
        if (!this.LJIILLIIL) {
            KL2.LJIILLIIL(8, this.LJFF);
        }
        KL2.LJIILLIIL(8, this.LJII);
        KL2.LJIILLIIL(8, this.LJIIIIZZ);
        KL2.LJIILLIIL(8, this.LJIIJ);
        switch (C29731Blf.LIZ[enumC29732Blg.ordinal()]) {
            case 1:
                KL2.LJIILLIIL(8, this.LJJIII);
                KL2.LJIILLIIL(8, this.LJJIIJ);
                ((GradientDrawable) this.LIZLLL.getBackground()).setColor(this.LJIL.getResources().getColor(R.color.a09));
                LJIJ(4.0f);
                if (!this.LJJIJIIJI && (this.LJIIIIZZ.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJIIIIZZ.getLayoutParams();
                    marginLayoutParams.setMarginEnd(C15380j0.LIZ(0.0f));
                    if (this.LJJ != 2) {
                        marginLayoutParams.setMarginStart(C15380j0.LIZ(8.0f));
                    }
                    this.LJIIIIZZ.setLayoutParams(marginLayoutParams);
                }
                if (!this.LJJIFFI) {
                    KL2.LJIILLIIL(0, this.LIZLLL);
                }
                if (!LJIIJJI() || !LJIIL()) {
                    KL2.LJIILLIIL(0, this.LJ);
                }
                if (!this.LJIILLIIL) {
                    KL2.LJIILLIIL(0, this.LJFF);
                }
                KL2.LJIILLIIL(8, this.LJIIIZ);
                if (!this.LJIJJLI.booleanValue()) {
                    return;
                }
                this.LJI.setVisibility(8);
                return;
            case 2:
                if (!this.LJJIFFI) {
                    KL2.LJIILLIIL(0, this.LIZLLL);
                }
                if (!LJIIJJI() || !LJIIL()) {
                    KL2.LJIILLIIL(0, this.LJ);
                }
                if (!this.LJIILLIIL) {
                    KL2.LJIILLIIL(0, this.LJFF);
                }
                KL2.LJIILLIIL(8, this.LJIIIZ);
                View view = this.LJ;
                if (!LJIIJJI() || !LJIIL()) {
                    i = 4;
                }
                KL2.LJIILLIIL(i, view);
                if (!this.LJIILLIIL) {
                    KL2.LJIILLIIL(4, this.LJFF);
                }
                KL2.LJIILLIIL(0, this.LJII);
                C2A4 c2a4 = this.LJII;
                if (c2a4 == null || c2a4.LJFF()) {
                    return;
                }
                if (LJIIIIZZ() && !LJIILIIL()) {
                    this.LJII.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_user_info_follow_complete_1.webp"));
                    this.LJII.LLIIJLIL = new C29728Blc(this);
                } else {
                    this.LJII.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_user_info_follow_complete_1.webp"));
                    this.LJII.LLIIJLIL = new C29729Bld(this);
                }
                this.LJII.LJII();
                return;
            case 3:
                ((GradientDrawable) this.LIZLLL.getBackground()).setColor(this.LJIL.getResources().getColor(R.color.abc));
                if (!this.LJJIFFI) {
                    KL2.LJIILLIIL(0, this.LIZLLL);
                }
                LJIJ(4.0f);
                if (this.LJJIJIIJI) {
                    KL2.LJIILLIIL(0, this.LJIIJ);
                } else if ((this.LJIIIIZZ.getLayoutParams() instanceof FrameLayout.LayoutParams) && this.LJJ != 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LJIIIIZZ.getLayoutParams();
                    if (this.LJJ == 3) {
                        f = 6.0f;
                        f2 = 6.0f;
                    } else {
                        f = 11.0f;
                        f2 = 10.0f;
                    }
                    marginLayoutParams2.setMarginEnd(C15380j0.LIZ(f));
                    marginLayoutParams2.setMarginStart(C15380j0.LIZ(f2));
                    this.LJIIIIZZ.setLayoutParams(marginLayoutParams2);
                }
                KL2.LJIILLIIL(0, this.LJIIIIZZ);
                KL2.LJIILLIIL(8, this.LJIIIZ);
                LJIILL();
                if (!this.LJIJJLI.booleanValue()) {
                    return;
                }
                this.LJI.setVisibility(0);
                return;
            case 4:
                if (!this.LJJIFFI) {
                    KL2.LJIILLIIL(0, this.LIZLLL);
                }
                KL2.LJIILLIIL(0, this.LJIIIIZZ);
                KL2.LJIILLIIL(0, this.LJIIJ);
                this.LJIIIZ.setScaleX(0.0f);
                this.LJIIIZ.setScaleY(0.0f);
                KL2.LJIILLIIL(0, this.LJIIIZ);
                if (LiveImageLoaderModuleSetting.useImageModule()) {
                    C78720Uuy LIZ = C15650jR.LIZ().LIZ(LJI().getUrls());
                    LIZ.LIZLLL(ImageView.ScaleType.CENTER_INSIDE);
                    LIZ.LJIIJJI(this.LJIIIZ);
                } else {
                    C17190lv LJII = C17190lv.LJII(this.LJIIIZ.getContext());
                    LJII.LIZ(ImageView.ScaleType.CENTER_INSIDE);
                    LJII.LJFF = LJI();
                    LJII.LIZJ(this.LJIIIZ);
                }
                if (this.LIZIZ == null || this.LJIIL != EnumC29732Blg.SUBSCRIBE_ANIM) {
                    return;
                }
                if (!this.LJJIJIIJI) {
                    LIZ(EnumC29732Blg.SUBSCRIBED);
                    return;
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition((ViewGroup) this.LIZIZ, changeBounds);
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.LJIIIIZZ, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f).setDuration(300L);
                duration.setInterpolator(C18950ol.LIZIZ(1.0f, -0.62f, 0.63f, 0.9f));
                duration.addListener(new ALAdapterS4S0100000_5(this, 8));
                duration.setStartDelay(200L);
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LJIIIIZZ, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f).setDuration(300L);
                duration2.setInterpolator(C18950ol.LIZIZ(1.0f, -0.62f, 0.63f, 0.9f));
                duration2.setStartDelay(200L);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f).setDuration(300L);
                duration3.setInterpolator(C18950ol.LIZIZ(0.17f, 0.89f, 0.32f, 1.77f));
                duration3.addListener(new ALAdapterS4S0100000_5(this, 10));
                duration3.setStartDelay(200L);
                ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f).setDuration(300L);
                duration4.setInterpolator(C18950ol.LIZIZ(0.17f, 0.89f, 0.32f, 1.77f));
                duration4.setStartDelay(200L);
                ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.LJIIJ, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(150L);
                duration5.setStartDelay(3200L);
                duration5.addListener(new ALAdapterS4S0100000_5(this, 11));
                AnimatorSet animatorSet = new AnimatorSet();
                this.LJIJJ = animatorSet;
                animatorSet.playTogether(duration, duration2, duration3, duration4, duration5);
                this.LJIJJ.start();
                return;
            case 5:
                ((GradientDrawable) this.LIZLLL.getBackground()).setColor(this.LJIL.getResources().getColor(R.color.abc));
                LJIJ(12.0f);
                ImageView imageView = this.LJIIIZ;
                if (imageView != null && imageView.getVisibility() == 8) {
                    Room room = this.LJIIZILJ;
                    if (room != null && room.getOwner() != null && this.LJIIZILJ.getOwner().getSubscribeInfo() != null) {
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_privilege_badge_show");
                        LIZ2.LJIILLIIL(this.LJIILL);
                        LIZ2.LJIJJ(Long.valueOf(this.LJIIZILJ.getOwnerUserId()), "anchor_id");
                        LIZ2.LJIJJ(Long.valueOf(this.LJIIZILJ.getId()), "room_id");
                        LIZ2.LJIJJ(BJM.LJFF(), "enter_from_merge");
                        LIZ2.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
                        LIZ2.LJIJJ("click", "action_type");
                        LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
                        LIZ2.LJIJJ(BJM.LJIJ(), "video_id");
                        LIZ2.LJIJJ("live_left_corner", "show_entrance");
                        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                            LIZ2.LJJIIJZLJL();
                        } else {
                            LIZ2.LJJIJ();
                            LIZ2.LJJIIZI();
                        }
                        JSONObject jSONObject = new JSONObject();
                        C05630Jz.LJI(jSONObject, "show_entrance", "live_left_corner");
                        C30929CBx.LJIIZILJ("subscription_badge_userinfo_show", jSONObject);
                        RecyclableWidgetManager recyclableWidgetManager = (RecyclableWidgetManager) this.LJIILL.kv0(C29738Blm.class);
                        long j3 = 0;
                        if (recyclableWidgetManager != null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            Long l = (Long) ((LinkedHashMap) C30317Bv7.LIZJ).get(recyclableWidgetManager);
                            if (l != null) {
                                j2 = l.longValue();
                            } else {
                                j2 = 0;
                            }
                            j = uptimeMillis - j2;
                            j3 = C30317Bv7.LIZLLL(recyclableWidgetManager);
                        } else {
                            j = 0;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        C29830BnG.LJIIIIZZ(jSONObject2);
                        Long valueOf = Long.valueOf(j);
                        if (valueOf != null) {
                            jSONObject2.put("subs_btn_load_self_duration", valueOf);
                        }
                        Long valueOf2 = Long.valueOf(j3);
                        if (valueOf2 != null) {
                            jSONObject2.put("subs_btn_load_total_duration", valueOf2);
                        }
                        C0K2.LJIIIIZZ("ttlive_subscription_perf_badge_show", 0, jSONObject2);
                    }
                    LJIILL();
                }
                if (!this.LJJIFFI) {
                    KL2.LJIILLIIL(0, this.LIZLLL);
                }
                KL2.LJIILLIIL(0, this.LJIIIZ);
                if (LiveImageLoaderModuleSetting.useImageModule()) {
                    C78720Uuy LIZ3 = C15650jR.LIZ().LIZ(LJI().getUrls());
                    LIZ3.LIZLLL(ImageView.ScaleType.CENTER_INSIDE);
                    LIZ3.LJIIJJI(this.LJIIIZ);
                } else {
                    C17190lv LJII2 = C17190lv.LJII(this.LJIIIZ.getContext());
                    LJII2.LIZ(ImageView.ScaleType.CENTER_INSIDE);
                    LJII2.LJFF = LJI();
                    LJII2.LIZJ(this.LJIIIZ);
                }
                if ((this.LJIIIZ.getLayoutParams() instanceof FrameLayout.LayoutParams) && this.LJJ != 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.LJIIIZ.getLayoutParams();
                    marginLayoutParams3.setMarginEnd(C15380j0.LIZ(9.0f));
                    this.LJIIIZ.setLayoutParams(marginLayoutParams3);
                }
                if (!this.LJIJJLI.booleanValue()) {
                    return;
                }
                this.LJI.setVisibility(8);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIJ(4.0f);
                ((GradientDrawable) this.LIZLLL.getBackground()).setColor(this.LJIL.getResources().getColor(R.color.abc));
                if (!this.LJJIFFI) {
                    KL2.LJIILLIIL(0, this.LIZLLL);
                }
                if (!this.LJIILLIIL) {
                    if (this.LJJIIZ == null) {
                        return;
                    }
                    KL2.LJIILLIIL(0, this.LJJIII);
                    this.LJJIIZ.LJII(enumC29732Blg);
                    return;
                }
                if (this.LJJIIJZLJL == null) {
                    return;
                }
                KL2.LJIILLIIL(0, this.LJJIIJ);
                this.LJJIIJZLJL.LJII(enumC29732Blg);
                return;
            default:
                if (LIZLLL()) {
                    if (this.LJJIIZI) {
                        LIZ(EnumC29732Blg.FANS_CLUB_JOINED_PUSH_FOLLOWED);
                    } else if (LJIIJ()) {
                        if (this.LJIILLIIL) {
                            ViewGroup viewGroup2 = this.LJIIJJI;
                            viewGroup2.setPadding(viewGroup2.getPaddingStart(), this.LJIIJJI.getPaddingTop(), this.LJIIJJI.getPaddingStart(), this.LJIIJJI.getPaddingBottom());
                        }
                        if (this.LJIILLIIL) {
                            enumC29732Blg2 = EnumC29732Blg.FANS_CLUB_JOINED_ANIM;
                        } else {
                            enumC29732Blg2 = EnumC29732Blg.FANS_CLUB_JOINED;
                        }
                        LIZ(enumC29732Blg2);
                    } else if (this.LJJIJ) {
                        LIZ(EnumC29732Blg.FANS_CLUB_UNJOIN);
                    } else {
                        LIZ(EnumC29732Blg.FANS_CLUB_UNJOIN_DELAY_ANIM);
                    }
                    this.LJJIIZI = false;
                    return;
                }
                if (LJIIIIZZ()) {
                    if (LJIILIIL()) {
                        LIZ(EnumC29732Blg.SUBSCRIBED);
                        return;
                    } else {
                        LIZ(EnumC29732Blg.UNSUBSCRIBE);
                        return;
                    }
                }
                LJIJ(12.0f);
                KL2.LJIILLIIL(8, this.LIZLLL);
                return;
        }
    }

    public final void LJII(View view) {
        DataChannel dataChannel = this.LJIILL;
        if (dataChannel != null && dataChannel.kv0(BCW.class) != null && !((Boolean) this.LJIILL.kv0(BCW.class)).booleanValue()) {
            C73943T0h.LIZ().LIZIZ(new B3N("subscribe_live_left_corner"));
            return;
        }
        if (view.getId() == R.id.i58) {
            ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).Ee(C15380j0.LIZLLL(), this.LJIIZILJ, "live_left_corner");
        } else {
            if (view.getId() != R.id.kpy && view.getId() != R.id.kpw && view.getId() != R.id.kq7) {
                return;
            }
            ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).kg0(C15380j0.LIZLLL(), this.LJIIZILJ, "live_left_corner", null);
        }
    }

    public final void LJIIZILJ(boolean z) {
        this.LJJI = z;
        if (z) {
            InterfaceC29734Bli interfaceC29734Bli = this.LJJIIZ;
            if (interfaceC29734Bli != null) {
                interfaceC29734Bli.LJ();
            }
            InterfaceC29734Bli interfaceC29734Bli2 = this.LJJIIJZLJL;
            if (interfaceC29734Bli2 != null) {
                interfaceC29734Bli2.LJ();
            }
        }
    }

    public final void LJIJ(float f) {
        if ((this.LIZ.getLayoutParams() instanceof C018905p) && this.LJJ != 2) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            ViewGroup viewGroup = this.LJIIJJI;
            if (viewGroup instanceof ConstraintLayout) {
                anonymousClass064.LJII((ConstraintLayout) viewGroup);
                anonymousClass064.LJIJJLI(this.LIZ.getId(), 2, C15380j0.LIZ(f));
                anonymousClass064.LJIJJLI(this.LIZ.getId(), 7, C15380j0.LIZ(f));
                anonymousClass064.LIZIZ((ConstraintLayout) this.LJIIJJI);
            }
        }
    }

    public final void LJIILLIIL(FollowPair followPair, boolean z) {
        if (!this.LJJI) {
            return;
        }
        IMicRoomService iMicRoomService = this.LJIILIIL;
        if (iMicRoomService != null && iMicRoomService.rk() && (this.LJJ == 1 || (LJIIL() && this.LJJ == 3))) {
            Room room = (Room) this.LJIILL.kv0(RoomChannel.class);
            if (room != null) {
                room.officialChannelInfo.channelUser.setFollowStatus(followPair.LIZ());
            }
            this.LJIILL.rv0(RoomChannel.class, room);
        } else {
            Room room2 = (Room) this.LJIILL.kv0(RoomChannel.class);
            room2.getOwner().setFollowStatus(followPair.LIZ());
            this.LJIILL.rv0(RoomChannel.class, room2);
        }
        if (followPair.LIZ() == 0) {
            LIZ(EnumC29732Blg.UNFOLLOW);
        } else if (z) {
            LIZ(EnumC29732Blg.FOLLOW_ANIM);
        }
        this.LJIILL.qv0(FollowAnchorStateChangeEvent.class, Integer.valueOf(followPair.LIZ()));
        Room room3 = ((C28246B6s) this.LJIILL.kv0(BJO.class)).LIZIZ;
        if (room3 != null && room3.getOwner() != null && room3.getOwner().getFollowInfo() != null && room3.getOwner().getId() == followPair.LIZ) {
            room3.getOwner().getFollowInfo().setFollowStatus(followPair.LIZJ);
        }
    }

    public C29727Blb(LiveIconView liveIconView, View view, View view2, ViewGroup viewGroup, C47121t6 c47121t6, View view3, C2A4 c2a4, ImageView imageView, ImageView imageView2, TextView textView, ViewGroup viewGroup2, DataChannel dataChannel, Context context, View view4, int i, LifecycleOwner lifecycleOwner) {
        boolean z;
        ViewGroup viewGroup3;
        IFansClubService iFansClubService;
        ViewGroup.LayoutParams layoutParams;
        this.LJJIIJ = null;
        if (SubscriptionAudienceEntranceEnhanceSetting.INSTANCE.getValue() && C15380j0.LJIJ(C15380j0.LJIIL()) > SubscriptionIconHideTextMinimumDimensionSetting.INSTANCE.getValue() && !SubscriptionIconNeedHideTextSetting.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LJJIJIIJI = z;
        this.LJFF = liveIconView;
        this.LIZ = view;
        this.LIZJ = view2;
        this.LIZLLL = viewGroup;
        this.LJ = c47121t6;
        this.LJI = view3;
        this.LJII = c2a4;
        this.LJIIIIZZ = imageView;
        this.LJIIIZ = imageView2;
        this.LJIIJ = textView;
        this.LJIIJJI = viewGroup2;
        this.LJIILIIL = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        this.LJIILJJIL = (IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class);
        this.LJIILL = dataChannel;
        boolean booleanValue = ((Boolean) dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        this.LJIILLIIL = booleanValue;
        this.LJIIZILJ = (Room) dataChannel.kv0(RoomChannel.class);
        this.LJIL = context;
        this.LIZIZ = view4;
        this.LJJ = i;
        if ((view4 instanceof ViewGroup) && LIZLLL() && (viewGroup3 = (ViewGroup) view4) != null && (iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class)) != null) {
            if (!booleanValue) {
                this.LJJII = (ImageView) viewGroup3.findViewById(R.id.m6k);
                ViewGroup viewGroup4 = (ViewGroup) viewGroup3.findViewById(R.id.d5o);
                this.LJJIII = viewGroup4;
                this.LJJIIZ = iFansClubService.ef(booleanValue, viewGroup3, viewGroup4, this, lifecycleOwner, dataChannel);
            } else {
                ViewGroup viewGroup5 = (ViewGroup) viewGroup3.findViewById(R.id.d5n);
                this.LJJIIJ = viewGroup5;
                this.LJJIIJZLJL = iFansClubService.ef(booleanValue, viewGroup3, viewGroup5, this, lifecycleOwner, dataChannel);
                if (viewGroup2 != null && (viewGroup2 instanceof ConstraintLayout)) {
                    ((ConstraintLayout) viewGroup2).setMaxWidth(viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.ac0));
                }
                if (C15380j0.LJIIZILJ() && view != null) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof C018905p) {
                        ((C018905p) layoutParams2).endToEnd = -1;
                    }
                }
                if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null && (layoutParams instanceof C018905p)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C15380j0.LIZ(2.0f));
                }
            }
        }
        if (!LJIIJJI() || !LJIIL()) {
            c2a4.setPadding(0, 0, 0, 0);
        } else {
            int LIZ = C15380j0.LIZ(3.0f);
            c2a4.setPadding(LIZ, LIZ, LIZ, LIZ);
        }
    }
}
