package X;

import Y.ACListenerS29S0201000_13;
import Y.ALAdapterS10S0100000_13;
import Y.ARunnableS49S0100000_13;
import Y.AUListenerS102S0200000_13;
import Y.AfS57S0100000_5;
import Y.AfS65S0100000_13;
import Y.IDAListenerS77S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.BattleBottomLayoutShowChannel;
import com.bytedance.android.live.liveinteract.api.BattleTaskGuideTipShowChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleCriticalDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemCriticalDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemGuideLayoutShowChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSmokeDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateCriticalEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateEffectEnterAnimationChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateSmokeEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multihost.core.service.MultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.WatchPauseLiveChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostEnableMatchResumeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostMuteSelfToastFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRequestLayoutSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchItemCardLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tz8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC76430Tz8 extends ConstraintLayout implements View.OnClickListener, View.OnLongClickListener, InterfaceC76717U8z {
    public final String LJLIL;
    public final DataChannel LJLILLLLZI;
    public final int LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public C75883TqJ LJLJL;
    public int LJLJLJ;
    public EnumC75419Tip LJLJLLL;
    public boolean LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public int LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public AnimatorSet LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final Room LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public final C62822Ol8 LLIILZL;
    public final C62822Ol8 LLIIZ;
    public Long LLIL;
    public boolean LLILII;
    public EnumC76178Tv4 LLILIL;
    public Rect LLILL;
    public final List<C76433TzB> LLILLIZIL;
    public final List<C76433TzB> LLILLJJLI;
    public final List<C76433TzB> LLILLL;
    public final List<C76433TzB> LLILZ;
    public final List<ObjectAnimator> LLILZIL;
    public final String LLILZLL;
    public boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final C62822Ol8 LLJ;
    public long LLJI;

    public final void LJJLL() {
        this.LLIIII = false;
        getWinningStreakIcon().setVisibility(8);
        getLoseStreakIcon().setVisibility(8);
        getNewWinningStreakIcon().setVisibility(8);
        AnimatorSet animatorSet = this.LLII;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LLII;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            this.LLII = null;
        }
        getHostScoreLayout().setVisibility(8);
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LJII((ConstraintLayout) findViewById(R.id.bcl));
        anonymousClass064.LJIJJLI(R.id.f7i, 3, C15380j0.LIZ(8.0f));
        anonymousClass064.LJIJJLI(R.id.f7i, 7, C15380j0.LIZ(5.0f));
        anonymousClass064.LIZIZ(getViewContainerRoot());
    }

    public final void LJLIL() {
        int i;
        this.LLIIIILZ = false;
        U51 winningStreakIcon = getWinningStreakIcon();
        if (this.LLILIL != EnumC76178Tv4.START) {
            i = 8;
        } else {
            i = 0;
        }
        winningStreakIcon.setVisibility(i);
        C75883TqJ c75883TqJ = this.LJLJL;
        if (c75883TqJ != null && c75883TqJ.LIZJ()) {
            C0NB.LJIIIZ("CoHostWindowView", "onMatchWinStreakTipAnimEnd cur host don't show");
        } else if (C29306Beo.LJIL(Boolean.valueOf(C29306Beo.LJIIJ(this.LJLILLLLZI))) && LJLI()) {
            getViewMuteStatus().setVisibility(8);
        } else if (C29306Beo.LJIIJ(this.LJLILLLLZI)) {
            if (LJLI()) {
                getViewMuteStatus().setVisibility(8);
            } else {
                getViewMuteStatus().setVisibility(0);
            }
        } else if (this.LJLL && !LJLI()) {
            getViewMuteStatus().setVisibility(0);
        } else {
            getViewMuteStatus().setVisibility(8);
        }
        LJJLJLI(true);
    }

    public final void LJLILLLLZI() {
        this.LLIIIILZ = true;
        getWinningStreakIcon().setVisibility(8);
        getNewWinningStreakIcon().setVisibility(8);
        getViewMuteStatus().setVisibility(8);
        getLoseStreakIcon().setVisibility(8);
    }

    @Override // X.InterfaceC76717U8z
    public final boolean isEmpty() {
        return false;
    }

    static {
        C87277YNd.LJIIJJI(133);
        C87277YNd.LJIIJJI(80);
        C87277YNd.LJIIJJI(8);
        C87277YNd.LJIIJJI(86);
        C87277YNd.LJIIJJI(52);
        C87277YNd.LJIIJJI(4);
    }

    private final C47121t6 getCrossArcTestTv() {
        Object value = this.LLJ.getValue();
        o.LJIIIIZZ(value, "<get-crossArcTestTv>(...)");
        return (C47121t6) value;
    }

    private final String getCurrentRoomAnchorDisplayName() {
        User user;
        Room room;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        String LIZ = C05170If.LIZ(user);
        if (LIZ == null) {
            return "";
        }
        return LIZ;
    }

    private final CX5 getIvTeamMateEffectSender() {
        Object value = this.LLI.getValue();
        o.LJIIIIZZ(value, "<get-ivTeamMateEffectSender>(...)");
        return (CX5) value;
    }

    private final View getLoseStreakIcon() {
        Object value = this.LLIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-loseStreakIcon>(...)");
        return (View) value;
    }

    private final C76217Tvh getProfileBTView() {
        Object value = this.LJZ.getValue();
        o.LJIIIIZZ(value, "<get-profileBTView>(...)");
        return (C76217Tvh) value;
    }

    private final ConstraintLayout getProfileContainer() {
        Object value = this.LJLZ.getValue();
        o.LJIIIIZZ(value, "<get-profileContainer>(...)");
        return (ConstraintLayout) value;
    }

    private final C47121t6 getTvTeamMateEffectEnter() {
        Object value = this.LLIFFJFJJ.getValue();
        o.LJIIIIZZ(value, "<get-tvTeamMateEffectEnter>(...)");
        return (C47121t6) value;
    }

    private final View getViewContainerBg() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-viewContainerBg>(...)");
        return (View) value;
    }

    private final View getViewContainerClickView() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-viewContainerClickView>(...)");
        return (View) value;
    }

    private final ConstraintLayout getViewContainerRoot() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-viewContainerRoot>(...)");
        return (ConstraintLayout) value;
    }

    private final CVT getViewLoading() {
        Object value = this.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-viewLoading>(...)");
        return (CVT) value;
    }

    private final AppCompatImageView getViewMuteAnchorStatus() {
        Object value = this.LLIIJLIL.getValue();
        o.LJIIIIZZ(value, "<get-viewMuteAnchorStatus>(...)");
        return (AppCompatImageView) value;
    }

    private final AppCompatImageView getViewMuteAudienceStatus() {
        Object value = this.LLIIL.getValue();
        o.LJIIIIZZ(value, "<get-viewMuteAudienceStatus>(...)");
        return (AppCompatImageView) value;
    }

    private final AppCompatImageView getViewMuteStatus() {
        Object value = this.LLIIJI.getValue();
        o.LJIIIIZZ(value, "<get-viewMuteStatus>(...)");
        return (AppCompatImageView) value;
    }

    private final View getViewPause() {
        Object value = this.LJLLLLLL.getValue();
        o.LJIIIIZZ(value, "<get-viewPause>(...)");
        return (View) value;
    }

    private final C2A4 getViewPauseAnim() {
        Object value = this.LJZI.getValue();
        o.LJIIIIZZ(value, "<get-viewPauseAnim>(...)");
        return (C2A4) value;
    }

    private final C75778Toc getViewPauseContainer() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-viewPauseContainer>(...)");
        return (C75778Toc) value;
    }

    private final C47121t6 getViewPauseDescTv() {
        Object value = this.LL.getValue();
        o.LJIIIIZZ(value, "<get-viewPauseDescTv>(...)");
        return (C47121t6) value;
    }

    private final C47121t6 getViewPauseStatusTv() {
        Object value = this.LJZL.getValue();
        o.LJIIIIZZ(value, "<get-viewPauseStatusTv>(...)");
        return (C47121t6) value;
    }

    private final C76636U5w getViewStartAnim() {
        Object value = this.LLIIIL.getValue();
        o.LJIIIIZZ(value, "<get-viewStartAnim>(...)");
        return (C76636U5w) value;
    }

    public final boolean LJJZZI() {
        C75883TqJ c75883TqJ = this.LJLJL;
        if ((c75883TqJ != null && c75883TqJ.LIZJ()) || LJLI()) {
            return false;
        }
        if (!this.LLIIII && this.LLILIL != EnumC76178Tv4.START) {
            return false;
        }
        return true;
    }

    public final boolean LJLI() {
        Long l;
        Room room;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        C75883TqJ c75883TqJ = this.LJLJL;
        if (c75883TqJ == null || !c75883TqJ.LIZLLL(l)) {
            return false;
        }
        return true;
    }

    public final void LJLJJL() {
        int i;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && !C29306Beo.LJIIJ(dataChannel)) {
            return;
        }
        this.LLILII = false;
        if (getProfileBTView().getVisibility() == 0) {
            int width = getProfileContainer().getWidth();
            ViewGroup.LayoutParams layoutParams = getViewDisplayId().getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.leftMargin;
            } else {
                i = 0;
            }
            if (getWidthState()) {
                C29306Beo.LJI(getProfileBTView());
                getProfileBTView().LIZ();
                C29306Beo.LJJJLIIL(i - C15380j0.LIZ(16.0f), getViewDisplayId());
                C78866UxK.LJJLJ(width - C15380j0.LIZ(16.0f), getProfileContainer());
                this.LJLJJI = false;
                return;
            }
            C29306Beo.LJI(getProfileBTView());
            getProfileBTView().LIZ();
            C29306Beo.LJJJLIIL(i - C15380j0.LIZ(16.0f), getViewDisplayId());
        }
    }

    public final void LJLJL() {
        if (!this.LLIZ) {
            getViewContainerBg().setVisibility(8);
            getViewLoading().setVisibility(8);
            getViewPauseContainer().LJ(new C75589TlZ(EnumC75775ToZ.NORMAL, getLinkMicId()), this.LLIZLLLIL);
        }
    }

    public final void LJLLILLLL() {
        int i;
        if (this.LLILII) {
            C75883TqJ c75883TqJ = this.LJLJL;
            if (c75883TqJ != null && !c75883TqJ.LJIJ) {
                this.LLILII = false;
                LJLJJL();
                return;
            }
            return;
        }
        C75883TqJ c75883TqJ2 = this.LJLJL;
        if (c75883TqJ2 != null && c75883TqJ2.LJIJ && getProfileBTView().getVisibility() != 0) {
            this.LLILII = true;
            int width = getProfileContainer().getWidth();
            ViewGroup.LayoutParams layoutParams = getViewDisplayId().getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.leftMargin;
            } else {
                i = 0;
            }
            if (C15380j0.LIZ(16.0f) + width < ((int) (getWidth() * 0.43f))) {
                this.LJLJJI = true;
                C78866UxK.LJJLJ(C15380j0.LIZ(16.0f) + width, getProfileContainer());
            }
            C29306Beo.LJJJLIIL(C15380j0.LIZ(16.0f) + i, getViewDisplayId());
            C76217Tvh.LIZJ(getProfileBTView());
            C29306Beo.LJJLJLI(getProfileBTView());
        }
    }

    public final void LJLLL() {
        Long valueOf;
        long j;
        C75883TqJ c75883TqJ = this.LJLJL;
        if (c75883TqJ == null || c75883TqJ.LIZJ()) {
            return;
        }
        C75883TqJ c75883TqJ2 = this.LJLJL;
        if (c75883TqJ2 != null && (valueOf = Long.valueOf(c75883TqJ2.LJIJI)) != null) {
            if (valueOf.longValue() == -1) {
                InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
                C75883TqJ c75883TqJ3 = this.LJLJL;
                if (c75883TqJ3 != null) {
                    j = c75883TqJ3.LIZ;
                } else {
                    j = 0;
                }
                ((C29374Bfu) LIZIZ).LJIILLIIL(j, "CoHostWindowView_updateFollowStatus", "coHostWindow_updateFollowStatus").LJJII(new AfS65S0100000_13(this, 231), new InterfaceC64592gB() { // from class: X.9D9
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
                return;
            }
            if (valueOf.longValue() == 1 || valueOf.longValue() == 2) {
                C29306Beo.LJJLIIIJJI(getViewFollowStatus(), false);
                return;
            }
        }
        C29306Beo.LJJLIIIJJI(getViewFollowStatus(), true);
    }

    public final void LJZ() {
        int i = C75576TlM.LIZ[this.LJLJLLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJLJL();
                return;
            }
            LJLJL();
            return;
        }
        if (this.LLIZ) {
            return;
        }
        getViewContainerBg().setVisibility(0);
        getViewLoading().setVisibility(0);
        getViewPauseContainer().LJ(new C75589TlZ(EnumC75775ToZ.PULLING_STREAM, getLinkMicId()), this.LLIZLLLIL);
    }

    public final LinearLayout getHostScoreLayout() {
        Object value = this.LLFII.getValue();
        o.LJIIIIZZ(value, "<get-hostScoreLayout>(...)");
        return (LinearLayout) value;
    }

    @Override // X.InterfaceC76717U8z
    public Integer getLogicPos() {
        return Integer.valueOf(this.LJLJI);
    }

    public final U50 getNewWinningStreakIcon() {
        Object value = this.LLFFF.getValue();
        o.LJIIIIZZ(value, "<get-newWinningStreakIcon>(...)");
        return (U50) value;
    }

    public final LinearLayout getRivalDebuffContainer() {
        Object value = this.LLD.getValue();
        o.LJIIIIZZ(value, "<get-rivalDebuffContainer>(...)");
        return (LinearLayout) value;
    }

    public final LinearLayout getTeamMateEffectEnterLayout() {
        Object value = this.LLFZ.getValue();
        o.LJIIIIZZ(value, "<get-teamMateEffectEnterLayout>(...)");
        return (LinearLayout) value;
    }

    @Override // X.InterfaceC76717U8z
    public Integer getUiPos() {
        return Integer.valueOf(this.LJLJI);
    }

    @Override // X.InterfaceC76717U8z
    public Long getUid() {
        C75883TqJ c75883TqJ = this.LJLJL;
        if (c75883TqJ != null) {
            return Long.valueOf(c75883TqJ.LIZ);
        }
        return null;
    }

    public final View getViewAnchorInfo() {
        Object value = this.LLIIZ.getValue();
        o.LJIIIIZZ(value, "<get-viewAnchorInfo>(...)");
        return (View) value;
    }

    public final C47121t6 getViewDisplayId() {
        Object value = this.LLIILII.getValue();
        o.LJIIIIZZ(value, "<get-viewDisplayId>(...)");
        return (C47121t6) value;
    }

    public final AppCompatImageView getViewFollowStatus() {
        Object value = this.LLIILZL.getValue();
        o.LJIIIIZZ(value, "<get-viewFollowStatus>(...)");
        return (AppCompatImageView) value;
    }

    public final U51 getWinningStreakIcon() {
        Object value = this.LLFF.getValue();
        o.LJIIIIZZ(value, "<get-winningStreakIcon>(...)");
        return (U51) value;
    }

    public final void LJL() {
        getLoseStreakIcon().setVisibility(8);
        getNewWinningStreakIcon().setVisibility(8);
    }

    public final boolean LJLIIIL() {
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
        if (LJJIJL != null && (LLIIJLIL = LJJIJL.LLIIJLIL()) != null) {
            return LLIIJLIL.a5(getLinkMicId());
        }
        return false;
    }

    @Override // X.InterfaceC76717U8z
    public Boolean getAudioMute() {
        return Boolean.valueOf(LJLIIIL());
    }

    @Override // X.InterfaceC76717U8z
    public int getH() {
        return getHeight();
    }

    @Override // X.InterfaceC76717U8z
    public int getW() {
        return getWidth();
    }

    public BattleComboInfo getWinStreakInfo() {
        return getWinningStreakIcon().getInfo();
    }

    @Override // android.view.View, X.InterfaceC76717U8z
    public int getX() {
        View view;
        Object parent = getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            return view.getLeft();
        }
        return -1;
    }

    @Override // android.view.View, X.InterfaceC76717U8z
    public int getY() {
        View view;
        Object parent = getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            return view.getTop();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onAttachedToWindow();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAttachedToWindow, linkMicId = ");
        LIZ.append(getLinkMicId());
        LIZ.append(", user = ");
        LIZ.append(this.LJLJL);
        LIZ.append(", ---------");
        C0NB.LJIIIZ("CoHostWindowView", X1D.LIZIZ(LIZ));
        if (C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
            getRivalDebuffContainer().setOrientation(1);
            ViewGroup.LayoutParams layoutParams = getRivalDebuffContainer().getLayoutParams();
            if (layoutParams instanceof C018905p) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = C15380j0.LIZ(28.0f);
                    marginLayoutParams.height = -2;
                }
            } else {
                marginLayoutParams = null;
            }
            getRivalDebuffContainer().setGravity(49);
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C15380j0.LIZ(8.0f);
            }
            getRivalDebuffContainer().setLayoutParams(marginLayoutParams);
        } else {
            getRivalDebuffContainer().setOrientation(0);
            getRivalDebuffContainer().setGravity(53);
        }
        getTvTeamMateEffectEnter().setTypeface(getTvTeamMateEffectEnter().getTypeface(), 3);
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(CJ5.class).LIZJ(C73933Szx.LIZJ(this))).LIZJ(new AfS65S0100000_13(this, 230), C76437TzF.LJLIL);
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.lv0(dataChannel.LJLJJI, BattleTaskGuideTipShowChannel.class, new AqS179S0100000_13(this, 639));
            dataChannel.mv0(BattleBottomLayoutShowChannel.class, this, new AqS179S0100000_13(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));
            dataChannel.mv0(BattleItemGuideLayoutShowChannel.class, this, new AqS179S0100000_13(this, 641));
            dataChannel.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 642));
            dataChannel.mv0(BattleItemSmokeDebuffTimeLeft.class, this, new AqS179S0100000_13(this, 643));
            dataChannel.mv0(BattleItemCriticalDebuffTimeLeft.class, this, new AqS179S0100000_13(this, 644));
            dataChannel.mv0(BattleItemTeamMateEffectEnterAnimationChannel.class, this, new AqS179S0100000_13(this, 645));
            dataChannel.mv0(BattleItemTeamMateCriticalEffectTimeLeft.class, this, new AqS179S0100000_13(this, 635));
            dataChannel.mv0(BattleItemTeamMateSmokeEffectTimeLeft.class, this, new AqS179S0100000_13(this, 636));
            dataChannel.mv0(BattleSmokeDebuffChannel.class, this, new AqS179S0100000_13(this, 637));
            dataChannel.mv0(BattleCriticalDebuffChannel.class, this, new AqS179S0100000_13(this, 638));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getRivalDebuffContainer().setVisibility(8);
        getRivalDebuffContainer().removeAllViews();
        ((ArrayList) this.LLILLIZIL).clear();
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILZ).clear();
        List<ObjectAnimator> list = this.LLILZIL;
        if (list != null && !list.isEmpty()) {
            Iterator<ObjectAnimator> it = this.LLILZIL.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }
        ((ArrayList) this.LLILZIL).clear();
        super.onDetachedFromWindow();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("detach from window, linkMicId=");
        LIZ.append(getLinkMicId());
        C0NB.LJIIIZ("CoHostWindowView", X1D.LIZIZ(LIZ));
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    public final EnumC75419Tip getCurrentWindowViewState() {
        return this.LJLJLLL;
    }

    public final boolean getIsPauseUIShowing() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC76717U8z
    public String getLinkMicId() {
        return this.LJLIL;
    }

    public final Rect getLocation() {
        return this.LLILL;
    }

    public final boolean getNameShowState() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC76717U8z
    public Boolean getVideoMute() {
        return Boolean.FALSE;
    }

    public final boolean getWidthState() {
        return this.LJLJJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0034, code lost:
    
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupAnchorInfo(int r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC76430Tz8.setupAnchorInfo(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
    
        if (r0 == 2) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI(boolean r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC76430Tz8.LJJLJLI(boolean):void");
    }

    public final void LJJZ(int i) {
        String LIZIZ;
        Object obj;
        boolean z = false;
        if (i == 2 && C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null) {
                obj = dataChannel.kv0(BattleStateChannel.class);
            } else {
                obj = null;
            }
            if (obj == EnumC76178Tv4.START) {
                getViewAnchorInfo().setAlpha(0.0f);
                getViewMuteAnchorStatus().setAlpha(0.0f);
            }
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.bcl);
            anonymousClass064.LJII(constraintLayout);
            anonymousClass064.LJI(R.id.j3l, 2);
            anonymousClass064.LJI(R.id.j3l, 1);
            anonymousClass064.LJIIIIZZ(R.id.j3l, 2, R.id.f7i, 1);
            anonymousClass064.LJIJJLI(R.id.dc6, 4, C15380j0.LIZ(47.0f));
            anonymousClass064.LIZIZ(constraintLayout);
        }
        if (this.LLIIII) {
            if (getHostScoreLayout().getVisibility() == 0) {
                C75622Tm6.LJIJI(EnumC76429Tz7.PERSONAL_SCORE, true, null);
                return;
            }
            return;
        }
        this.LLIIII = true;
        this.LLF = i;
        if (i != 2) {
            if (i != 4) {
                return;
            }
            TextView textView = (TextView) getHostScoreLayout().findViewById(R.id.jc5);
            long j = this.LLJI;
            if (j <= 1000) {
                LIZIZ = String.valueOf(j);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                String LLLZI = C16880lQ.LLLZI(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) j) / 1000)}, 1));
                o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                LIZ.append(LLLZI);
                LIZ.append("K");
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            textView.setText(LIZIZ);
            if (getHostScoreLayout().getVisibility() != 0) {
                LinearLayout view = getHostScoreLayout();
                o.LJIIIZ(view, "view");
                view.setAlpha(0.0f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat.setDuration(260L);
                ofFloat.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).after(1960L);
                ofFloat.addListener(new IDAListenerS77S0100000_9(view, 29));
                animatorSet.start();
                this.LLII = animatorSet;
            }
            post(RunnableC76434TzC.LJLIL);
            return;
        }
        if (getWinningStreakIcon().getVisibility() == 0) {
            z = true;
        }
        LJJLJLI(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
    
        if (r3 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZIII(float r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.getViewAnchorInfo()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.05p r1 = (X.C018905p) r1
            r1.matchConstraintPercentWidth = r5
            android.view.View r0 = r4.getViewAnchorInfo()
            r0.setLayoutParams(r1)
            X.TqJ r3 = r4.LJLJL
            java.lang.String r2 = ""
            if (r3 == 0) goto L26
            X.ToS r0 = r3.LJIIZILJ
            if (r0 == 0) goto L26
            java.lang.String r1 = r0.LIZ
            if (r1 != 0) goto L29
        L26:
            r1 = r2
            if (r3 == 0) goto L31
        L29:
            X.ToS r0 = r3.LJIIZILJ
            if (r0 == 0) goto L31
            java.lang.String r0 = r0.LIZIZ
            if (r0 != 0) goto L4c
        L31:
            java.lang.String r1 = X.C05170If.LIZIZ(r1, r2)
            if (r1 == 0) goto L44
            int r0 = r1.length()
            if (r0 <= 0) goto L44
            X.1t6 r0 = r4.getViewDisplayId()
            r0.setText(r1)
        L44:
            android.view.View r0 = r4.getViewAnchorInfo()
            r0.requestLayout()
            return
        L4c:
            r2 = r0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC76430Tz8.LJJZZIII(float):void");
    }

    public final boolean LJLIIL(ItemInfo4FE itemInfo4FE) {
        Long l;
        String str;
        Long l2;
        Long l3;
        if (itemInfo4FE == null) {
            return false;
        }
        String str2 = itemInfo4FE.sendToAnchorId;
        C75883TqJ c75883TqJ = this.LJLJL;
        if (c75883TqJ != null) {
            l = Long.valueOf(c75883TqJ.LIZ);
        } else {
            l = null;
        }
        if (o.LJ(str2, String.valueOf(l))) {
            return true;
        }
        List<? extends TeamUsersInfo> list = C76265TwT.LIZ.LJIL;
        if (list != null) {
            Iterator<? extends TeamUsersInfo> it = list.iterator();
            while (it.hasNext()) {
                List<Long> list2 = it.next().userIds;
                o.LJIIIIZZ(list2, "teamUsersInfo.userIds");
                HashSet LLIZLLLIL = ORZ.LLIZLLLIL(list2);
                if (C29306Beo.LJIJJLI(itemInfo4FE.sendToAnchorId) && (str = itemInfo4FE.sendToAnchorId) != null && C38350F3i.LJJIZ(str) != null) {
                    String str3 = itemInfo4FE.sendToAnchorId;
                    if (str3 != null) {
                        l2 = C38350F3i.LJJIZ(str3);
                    } else {
                        l2 = null;
                    }
                    if (LLIZLLLIL.contains(l2)) {
                        C75883TqJ c75883TqJ2 = this.LJLJL;
                        if (c75883TqJ2 != null) {
                            l3 = Long.valueOf(c75883TqJ2.LIZ);
                        } else {
                            l3 = null;
                        }
                        if (LLIZLLLIL.contains(l3)) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJI(com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r10) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC76430Tz8.LJLJI(com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE):void");
    }

    public final void LJLJLJ(ItemInfo4FE itemInfo4FE) {
        boolean z;
        if (itemInfo4FE == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getTeamMateEffectEnterLayout(), (Property<LinearLayout, Float>) View.TRANSLATION_X, (getTeamMateEffectEnterLayout().getWidth() * (-1.0f)) - C15380j0.LIZ(8.0f), 0.0f);
        ofFloat.setDuration(480L);
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.41f, 1.44f, 0.42f, 1.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(getTeamMateEffectEnterLayout(), (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 1.0f);
        ofFloat2.setDuration(500L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(getTeamMateEffectEnterLayout(), (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat3.setDuration(200L);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TeamMate Enter, show Teammate enter animation----visible = ");
        if (getTeamMateEffectEnterLayout().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        C0NB.LJ("CoHostWindowView", X1D.LIZIZ(LIZ));
        getIvTeamMateEffectSender().setAvatar(itemInfo4FE.avatarThumb);
        getTeamMateEffectEnterLayout().setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
        animatorSet.start();
        animatorSet.addListener(new ALAdapterS10S0100000_13(this, 52));
    }

    public final void LJLLLLLL(boolean z) {
        boolean z2;
        DataChannel dataChannel;
        int i;
        int i2;
        boolean z3;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        C75883TqJ c75883TqJ = this.LJLJL;
        if (c75883TqJ != null && c75883TqJ.LIZJ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || LJLI()) {
            C29306Beo.LJJLIIIJJI(getViewMuteStatus(), false);
            if (C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
                C29306Beo.LJJLIIIJJI(getViewMuteAnchorStatus(), false);
                setAudienceMuteState(false);
            }
        } else if (z || ((dataChannel3 = this.LJLILLLLZI) != null && C29306Beo.LJIIJ(dataChannel3))) {
            if (this.LLIIIILZ) {
                C29306Beo.LJJLIIIJJI(getViewMuteStatus(), false);
            } else {
                DataChannel dataChannel4 = this.LJLILLLLZI;
                if (dataChannel4 != null && C29306Beo.LJIIJ(dataChannel4) && LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
                    getViewMuteAnchorStatus().getVisibility();
                    C29306Beo.LJJLIIIJJI(getViewMuteAnchorStatus(), true);
                } else {
                    DataChannel dataChannel5 = this.LJLILLLLZI;
                    if ((dataChannel5 != null && C29306Beo.LJIIJ(dataChannel5)) || !LiveMatchReDesignAudienceSetting.INSTANCE.isEnabled()) {
                        getViewMuteStatus().getVisibility();
                        C29306Beo.LJJLIIIJJI(getViewMuteStatus(), true);
                        if (C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
                            C29306Beo.LJJLIIIJJI(getViewMuteAnchorStatus(), false);
                            setAudienceMuteState(false);
                        }
                    } else {
                        setAudienceMuteState(true);
                    }
                }
            }
        } else {
            C29306Beo.LJJLIIIJJI(getViewMuteStatus(), false);
            if (C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
                C29306Beo.LJJLIIIJJI(getViewMuteAnchorStatus(), false);
                setAudienceMuteState(false);
            }
        }
        if (LiveCohostMuteSelfToastFixSetting.INSTANCE.isEnable()) {
            if (this.LJLL != z && z && (dataChannel2 = this.LJLILLLLZI) != null && !C29306Beo.LJIIJ(dataChannel2) && !LJLI()) {
                String string = getContext().getString(R.string.mjl);
                o.LJIIIIZZ(string, "context.getString(R.string.pm_live_mutetip)");
                String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{getCurrentRoomAnchorDisplayName()}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                C30868C9o.LJI(LLLZ);
            }
        } else if (this.LJLL != z && z && (dataChannel = this.LJLILLLLZI) != null && !C29306Beo.LJIIJ(dataChannel)) {
            String string2 = getContext().getString(R.string.mjl);
            o.LJIIIIZZ(string2, "context.getString(R.string.pm_live_mutetip)");
            String LLLZ2 = C16880lQ.LLLZ(string2, Arrays.copyOf(new Object[]{getCurrentRoomAnchorDisplayName()}, 1));
            o.LJIIIIZZ(LLLZ2, "format(format, *args)");
            C30868C9o.LJI(LLLZ2);
        }
        if (this.LJLL != z && this.LLIIII && !LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
            if (getWinningStreakIcon().getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            LJJLJLI(z3);
        }
        this.LJLL = z;
        DataChannel dataChannel6 = this.LJLILLLLZI;
        if (dataChannel6 != null && C29306Beo.LJIIJ(dataChannel6) && LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
            AppCompatImageView viewMuteAnchorStatus = getViewMuteAnchorStatus();
            if (z) {
                i2 = R.drawable.d43;
            } else {
                i2 = R.drawable.d44;
            }
            viewMuteAnchorStatus.setImageResource(i2);
        } else {
            DataChannel dataChannel7 = this.LJLILLLLZI;
            if ((dataChannel7 != null && C29306Beo.LJIIJ(dataChannel7)) || !LiveMatchReDesignAudienceSetting.INSTANCE.isEnabled()) {
                AppCompatImageView viewMuteStatus = getViewMuteStatus();
                if (z) {
                    i = R.drawable.d41;
                } else {
                    i = R.drawable.d40;
                }
                viewMuteStatus.setImageResource(i);
            }
        }
        post(RunnableC75625Tm9.LJLIL);
    }

    public final void LJLZ(boolean z) {
        boolean z2;
        boolean z3;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        Long l = null;
        if (z) {
            if (this.LLIZLLLIL && (dataChannel2 = this.LJLILLLLZI) != null && o.LJ(dataChannel2.kv0(PauseLiveChannel.class), Boolean.TRUE)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!this.LLIZLLLIL && (dataChannel = this.LJLILLLLZI) != null && o.LJ(dataChannel.kv0(WatchPauseLiveChannel.class), Boolean.TRUE)) {
                z3 = true;
            } else {
                z3 = false;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updatePauseUIByStateManager, uid=");
            C75883TqJ c75883TqJ = this.LJLJL;
            if (c75883TqJ != null) {
                l = Long.valueOf(c75883TqJ.LIZ);
            }
            LIZ.append(l);
            LIZ.append(", isShow=");
            LIZ.append(z);
            LIZ.append(", isAnchorPauseShow=");
            LIZ.append(z2);
            LIZ.append(", isAudiencePauseShow=");
            LIZ.append(z3);
            C0NB.LJIIIZ("CoHostWindowView", X1D.LIZIZ(LIZ));
            if (!z2 && !z3) {
                if (!this.LLIZ) {
                    getViewContainerBg().setVisibility(0);
                    getViewLoading().setVisibility(8);
                    getViewPauseContainer().LJ(new C75589TlZ(EnumC75775ToZ.PAUSE, getLinkMicId()), this.LLIZLLLIL);
                }
                this.LLIZ = true;
                return;
            }
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updatePauseUIByStateManager, uid=");
        C75883TqJ c75883TqJ2 = this.LJLJL;
        if (c75883TqJ2 != null) {
            l = Long.valueOf(c75883TqJ2.LIZ);
        }
        LIZ2.append(l);
        LIZ2.append(", isShow=");
        LIZ2.append(z);
        C0NB.LJIIIZ("CoHostWindowView", X1D.LIZIZ(LIZ2));
        this.LLIZ = false;
        LJZ();
    }

    public final void LJZI(C75589TlZ statics) {
        o.LJIIIZ(statics, "statics");
        if (this.LLIZ) {
            return;
        }
        EnumC75775ToZ enumC75775ToZ = statics.LJLIL;
        if (LiveCohostEnableMatchResumeSetting.INSTANCE.isEnableCoHostResume()) {
            if (enumC75775ToZ.compareTo(EnumC75775ToZ.FORWARD_STREAM_FAILED) < 0) {
                getViewContainerBg().setVisibility(8);
            } else {
                getViewContainerBg().setVisibility(0);
            }
        }
        getViewPauseContainer().LJ(statics, this.LLIZLLLIL);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        long j;
        long j2;
        long j3;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        InterfaceC74695TTf LLIIJLIL3;
        InterfaceC74695TTf LLIIJLIL4;
        if (this.LJLJL == null) {
            return;
        }
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        long j4 = 0;
        if (num == null || num.intValue() != R.id.f0z) {
            if (num == null) {
                return;
            }
            if (num.intValue() == R.id.f7i) {
                boolean LJLIIIL = LJLIIIL();
                DataChannel dataChannel = this.LJLILLLLZI;
                if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
                    InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
                    if (LJJIJL != null && (LLIIJLIL4 = LJJIJL.LLIIJLIL()) != null) {
                        LLIIJLIL4.LJ(getLinkMicId(), "business_mute_remote_host", !LJLIIIL);
                    }
                    InterfaceC75441TjB LJJIJL2 = C8E.LIZLLL().LJJIJL();
                    if (LJJIJL2 != null && (LLIIJLIL3 = LJJIJL2.LLIIJLIL()) != null) {
                        LLIIJLIL3.LJJIIZ("CoHostWindowView onClick");
                    }
                    LJLLLLLL(!LJLIIIL);
                    if (LJLIIIL) {
                        return;
                    }
                    C30868C9o.LIZJ(R.string.mjm);
                    return;
                }
                if (!LJLIIIL) {
                    return;
                }
                String string = getContext().getString(R.string.mjl);
                o.LJIIIIZZ(string, "context.getString(R.string.pm_live_mutetip)");
                String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{getCurrentRoomAnchorDisplayName()}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                C30868C9o.LJI(LLLZ);
                return;
            }
            if (num.intValue() == R.id.f7k) {
                boolean LJLIIIL2 = LJLIIIL();
                DataChannel dataChannel2 = this.LJLILLLLZI;
                if (dataChannel2 == null || !C29306Beo.LJIIJ(dataChannel2)) {
                    return;
                }
                InterfaceC75441TjB LJJIJL3 = C8E.LIZLLL().LJJIJL();
                if (LJJIJL3 != null && (LLIIJLIL2 = LJJIJL3.LLIIJLIL()) != null) {
                    LLIIJLIL2.LJ(getLinkMicId(), "business_mute_remote_host", !LJLIIIL2);
                }
                InterfaceC75441TjB LJJIJL4 = C8E.LIZLLL().LJJIJL();
                if (LJJIJL4 != null && (LLIIJLIL = LJJIJL4.LLIIJLIL()) != null) {
                    LLIIJLIL.LJJIIZ("CoHostWindowView onClick");
                }
                LJLLLLLL(!LJLIIIL2);
                if (LJLIIIL2) {
                    return;
                }
                C30868C9o.LIZJ(R.string.mjm);
                return;
            }
            if (num.intValue() == R.id.f7j) {
                boolean LJLIIIL3 = LJLIIIL();
                DataChannel dataChannel3 = this.LJLILLLLZI;
                if ((dataChannel3 != null && C29306Beo.LJIIJ(dataChannel3)) || !LJLIIIL3) {
                    return;
                }
                String string2 = getContext().getString(R.string.mjl);
                o.LJIIIIZZ(string2, "context.getString(R.string.pm_live_mutetip)");
                String LLLZ2 = C16880lQ.LLLZ(string2, Arrays.copyOf(new Object[]{getCurrentRoomAnchorDisplayName()}, 1));
                o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                C30868C9o.LJI(LLLZ2);
                return;
            }
            if (num.intValue() != R.id.exq) {
                return;
            }
            C29306Beo.LJJLIIIJJI(getViewFollowStatus(), false);
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            C29366Bfm c29366Bfm = new C29366Bfm();
            C75883TqJ c75883TqJ = this.LJLJL;
            if (c75883TqJ != null) {
                j3 = c75883TqJ.LIZ;
            } else {
                j3 = 0;
            }
            c29366Bfm.LIZIZ(j3);
            C75883TqJ c75883TqJ2 = this.LJLJL;
            if (c75883TqJ2 != null) {
                j4 = c75883TqJ2.LIZIZ;
            }
            c29366Bfm.LJ(j4);
            c29366Bfm.getClass();
            ((C29374Bfu) LIZIZ).LJIIIIZZ(new C29363Bfj(c29366Bfm)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 357), new AfS57S0100000_5(this, 358));
            return;
        }
        C75883TqJ c75883TqJ3 = this.LJLJL;
        if ((c75883TqJ3 != null && c75883TqJ3.LIZJ()) || LJLI()) {
            return;
        }
        C75883TqJ c75883TqJ4 = this.LJLJL;
        if (c75883TqJ4 != null) {
            j = c75883TqJ4.LIZ;
        } else {
            j = 0;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(j);
        userProfileEvent.linkInRoomEnable = false;
        C75883TqJ c75883TqJ5 = this.LJLJL;
        if (c75883TqJ5 != null) {
            j2 = c75883TqJ5.LIZIZ;
        } else {
            j2 = 0;
        }
        userProfileEvent.roomId = j2;
        userProfileEvent.currentHasMultiCoHostPermission = true;
        if (c75883TqJ5 != null) {
            j4 = c75883TqJ5.LIZ;
        }
        userProfileEvent.currentMultiCoHostGuestId = j4;
        userProfileEvent.clickModule = "link_anchor_profile";
        C73943T0h.LIZ().LIZIZ(userProfileEvent);
    }

    public final void onEvent(CJ5 cj5) {
        FollowPair followPair;
        C75883TqJ c75883TqJ;
        if (cj5 != null && (followPair = cj5.LIZ) != null && (c75883TqJ = this.LJLJL) != null && followPair.LIZ == c75883TqJ.LIZ) {
            int i = followPair.followStatus;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c75883TqJ.LJIJI = 3L;
                        }
                    } else {
                        c75883TqJ.LJIJI = 2L;
                    }
                } else {
                    c75883TqJ.LJIJI = 1L;
                }
            } else {
                c75883TqJ.LJIJI = 0L;
            }
            LJLLL();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Integer valueOf;
        if (this.LJLJL == null || view == null || (valueOf = Integer.valueOf(view.getId())) == null || valueOf.intValue() != R.id.f0z) {
            return false;
        }
        C73943T0h.LIZ().LIZIZ(new C30151BsR());
        return true;
    }

    public final void setAudienceMuteState(boolean z) {
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            return;
        }
        if (z) {
            LJJZZIII(0.5f);
            C29306Beo.LJJLIIIJJI(getViewMuteAudienceStatus(), true);
        } else {
            if (getViewMuteAudienceStatus().getVisibility() != 0) {
                return;
            }
            C29306Beo.LJJLIIIJJI(getViewMuteAudienceStatus(), false);
            LJJZZIII(0.43f);
        }
    }

    public final void setLocation(Rect rect) {
        this.LLILL = rect;
    }

    public final void LJLJJLL(BattleComboInfo battleComboInfo, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        if (C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
            return;
        }
        C0NB.LJIIIZ("CoHostWindowView", "setWinningStreakData");
        getWinningStreakIcon().setVisibility(8);
        getLoseStreakIcon().setVisibility(8);
        getNewWinningStreakIcon().setVisibility(8);
        getNewWinningStreakIcon().LIZ(battleComboInfo);
        getNewWinningStreakIcon().setOnClicked(new AqS179S0100000_13(interfaceC88472Yns, (InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe>) 646));
    }

    public final void LJLJLLL(BattleComboInfo battleComboInfo, boolean z) {
        if (getNewWinningStreakIcon().getInfo() == null) {
            C0NB.LJIIIZ("CoHostWindowView", "showUpdateWinStreakAni info is null ");
            if (!getNewWinningStreakIcon().LIZ(battleComboInfo)) {
                return;
            }
        }
        LL(true, z, new AqS160S0200000_13(this, battleComboInfo, 102));
    }

    public final void LJLL(BattleComboInfo battleComboInfo, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        Long l;
        String str;
        User owner;
        boolean LIZIZ = getWinningStreakIcon().LIZIZ(battleComboInfo);
        getWinningStreakIcon().setOnClicked(new AqS179S0100000_13(interfaceC88472Yns, (InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe>) 647));
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.bcl);
        anonymousClass064.LJII(constraintLayout);
        C75883TqJ c75883TqJ = this.LJLJL;
        Long l2 = null;
        if (c75883TqJ != null) {
            l = Long.valueOf(c75883TqJ.LIZ);
        } else {
            l = null;
        }
        Room room = this.LLIIIJ;
        if (room != null && (owner = room.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        }
        if (!o.LJ(l, l2)) {
            anonymousClass064.LJIJJ(1.0f, R.id.fnw);
        } else {
            anonymousClass064.LJIJJ(0.0f, R.id.fnw);
        }
        anonymousClass064.LIZIZ(constraintLayout);
        boolean z = true;
        int i = 1;
        boolean z2 = false;
        if (LIZIZ) {
            if (getWinningStreakIcon().getVisibility() == 0) {
                z2 = true;
            }
            LJJLJLI(z2);
            if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_connection_win_show") || battleComboInfo == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            hashMap.put("connection_type", "manual_pk");
            int i2 = C75616Tm0.LIZ[B5G.LIZIZ().LJIIJ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str = LiveGiftNewGifterBadgeSetting.DEFAULT;
                    } else {
                        str = "random_match";
                    }
                } else {
                    str = "recommend";
                }
            } else {
                str = "manual_follow";
            }
            hashMap.put("invitee_list", str);
            hashMap.put("user_type", "anchor");
            hashMap.put("pk_id", String.valueOf(C76265TwT.LIZ.LIZIZ()));
            hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
            if (room2 != null) {
                String idStr = room2.getIdStr();
                o.LJIIIIZZ(idStr, "room.idStr");
                hashMap.put("room_id", idStr);
            }
            hashMap.put("win_status", String.valueOf(battleComboInfo.comboCount));
            if (room2 != null) {
                if (battleComboInfo.userId != room2.getOwnerUserId()) {
                    i = 2;
                }
                hashMap.put("anchor_type", String.valueOf(i));
            }
            C75457TjR.LJJI("livesdk_connection_win_show", hashMap);
            return;
        }
        if (getWinningStreakIcon().getVisibility() != 0) {
            z = false;
        }
        LJJLJLI(z);
    }

    public final void LJLLLL(long j, boolean z) {
        int i;
        String LIZIZ;
        ImageModel imageModel;
        Drawable LJI;
        Drawable LJI2;
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJII()) {
            ImageView imageView = (ImageView) getHostScoreLayout().findViewById(R.id.jc4);
            GiftModeMeta giftModeMeta = c76280Twi.LJIILLIIL;
            if (giftModeMeta != null) {
                imageModel = giftModeMeta.giftIconImage;
            } else {
                imageModel = null;
            }
            C15640jQ.LIZLLL(imageView, imageModel);
            if (z) {
                LinearLayout hostScoreLayout = getHostScoreLayout();
                if (C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
                    LJI2 = C15380j0.LJI(R.drawable.cir);
                } else {
                    LJI2 = C15380j0.LJI(R.drawable.ciq);
                }
                hostScoreLayout.setBackground(LJI2);
            } else {
                LinearLayout hostScoreLayout2 = getHostScoreLayout();
                if (C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
                    LJI = C15380j0.LJI(R.drawable.cip);
                } else {
                    LJI = C15380j0.LJI(R.drawable.cio);
                }
                hostScoreLayout2.setBackground(LJI);
            }
        } else {
            W5G w5g = (W5G) getHostScoreLayout().findViewById(R.id.jc4);
            if (z) {
                if (C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
                    i = R.drawable.d85;
                } else {
                    i = R.drawable.d84;
                }
            } else if (C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
                i = R.drawable.d87;
            } else {
                i = R.drawable.d86;
            }
            w5g.setActualImageResource(i);
            getHostScoreLayout().setBackground(C15380j0.LJI(R.drawable.ci6));
        }
        if (getHostScoreLayout().getVisibility() != 0 && this.LLIIII) {
            getHostScoreLayout().setVisibility(0);
        }
        TextView textView = (TextView) getHostScoreLayout().findViewById(R.id.jc5);
        if (j <= 1000) {
            LIZIZ = String.valueOf(j);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            String LLLZI = C16880lQ.LLLZI(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) j) / 1000)}, 1));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            LIZ.append(LLLZI);
            LIZ.append("K");
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        textView.setText(LIZIZ);
        this.LLJI = j;
        C16880lQ.LJIIZILJ(getHostScoreLayout(), new ViewOnClickListenerC76435TzD(this, z));
    }

    public final void LJZL(BattleComboInfo battleComboInfo, boolean z) {
        if (getWinningStreakIcon().getVisibility() != 0) {
            getWinningStreakIcon().LIZIZ(battleComboInfo);
        }
        if (getWinningStreakIcon().getInfo() == null) {
            return;
        }
        getWinningStreakIcon().LIZJ(battleComboInfo, z);
    }

    public final void LJLLJ(C75883TqJ c75883TqJ, int i, int i2) {
        C75883TqJ c75883TqJ2;
        if (!TextUtils.equals(c75883TqJ.LJII, getLinkMicId())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateCoHostUser, return, user.linkMicId != linkMicId, new_linkMicId=");
            LIZ.append(c75883TqJ.LJII);
            LIZ.append(", old_linkMicId=");
            LIZ.append(getLinkMicId());
            LIZ.append(", user = ");
            LIZ.append(c75883TqJ);
            C0NB.LJIIIZ("CoHostWindowView", X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateCoHostUser, linkMicId = ");
        LIZ2.append(getLinkMicId());
        LIZ2.append(", linkedUserSize = ");
        LIZ2.append(i);
        LIZ2.append(", user = ");
        LIZ2.append(c75883TqJ);
        C0NB.LJIIIZ("CoHostWindowView", X1D.LIZIZ(LIZ2));
        this.LJLJL = c75883TqJ;
        this.LJLJLJ = i;
        setupAnchorInfo(i2);
        if (this.LJLJJLL && (c75883TqJ2 = this.LJLJL) != null && c75883TqJ2.LIZJ() && this.LJLJLJ == 3) {
            this.LJLJJLL = false;
            C29306Beo.LJJLIIIJJI(getViewStartAnim(), true);
            C76636U5w viewStartAnim = getViewStartAnim();
            viewStartAnim.getClass();
            viewStartAnim.post(new ARunnableS49S0100000_13(viewStartAnim, 255));
        }
        C75883TqJ c75883TqJ3 = this.LJLJL;
        if ((c75883TqJ3 != null && c75883TqJ3.LIZJ()) || LJLI()) {
            C29306Beo.LJJLIIIJJI(getViewContainerClickView(), false);
        } else {
            C29306Beo.LJJLIIIJJI(getViewContainerClickView(), true);
        }
        C75778Toc viewPauseContainer = getViewPauseContainer();
        viewPauseContainer.getClass();
        viewPauseContainer.LJLJI = i;
        viewPauseContainer.LJLJJI = c75883TqJ;
    }

    public final void LL(boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        View loseStreakIcon;
        int i;
        if (!C76128TuG.LIZIZ(this.LJLILLLLZI, false, 6)) {
            return;
        }
        if (z) {
            loseStreakIcon = getNewWinningStreakIcon();
        } else {
            loseStreakIcon = getLoseStreakIcon();
        }
        if (z) {
            i = R.id.fnx;
        } else {
            i = R.id.fji;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS102S0200000_13(ofFloat, loseStreakIcon, 14));
        ofFloat.addListener(new C76432TzA(this, z2, i, loseStreakIcon, interfaceC65784Pro));
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC76430Tz8(int i, Context context, DataChannel dataChannel, String str) {
        super(context);
        Room room;
        boolean z;
        float f;
        Boolean bool;
        String str2;
        new LinkedHashMap();
        this.LJLIL = str;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = i;
        this.LJLJJLL = true;
        this.LJLJLLL = EnumC75419Tip.StateInit;
        this.LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 569));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 595));
        this.LJLLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 594));
        this.LJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 572));
        this.LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 579));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 576));
        this.LJLZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 589));
        this.LJZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 588));
        this.LJZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 578));
        this.LJZL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 583));
        this.LL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 581));
        this.LLD = C221108m2.LIZIZ(new AqS163S0100000_13(this, 590));
        this.LLF = -1;
        this.LLFF = C221108m2.LIZIZ(new AqS163S0100000_13(this, 587));
        this.LLFFF = C221108m2.LIZIZ(new AqS163S0100000_13(this, 586));
        this.LLFII = C221108m2.LIZIZ(new AqS163S0100000_13(this, 580));
        this.LLFZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 591));
        this.LLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 582));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 592));
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLIIIJ = room;
        this.LLIIIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 585));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 584));
        this.LLIIJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 575));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 573));
        this.LLIIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 574));
        this.LLIILII = C221108m2.LIZIZ(new AqS163S0100000_13(this, 570));
        this.LLIILZL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 571));
        this.LLIIZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 593));
        this.LLILIL = EnumC76178Tv4.NORMAL;
        this.LLILLIZIL = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
        this.LLILZIL = new ArrayList();
        this.LLILZLL = MatchItemCardLynxUrlSetting.INSTANCE.getMatchItemsPanel();
        this.LLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 577));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dep, this, true);
        C80955Vpv c80955Vpv = (C80955Vpv) findViewById(R.id.dcz);
        c80955Vpv.setEnableSizeChange(true);
        c80955Vpv.setEnableFixedSize(LiveMatchRequestLayoutSettings.INSTANCE.isMatchEnabled());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init, linkMicId = ");
        LIZ.append(getLinkMicId());
        C0NB.LJIIIZ("CoHostWindowView", X1D.LIZIZ(LIZ));
        setTag(getLinkMicId());
        C16880lQ.LJIIJ(this, getViewContainerClickView());
        getViewContainerClickView().setOnLongClickListener(this);
        C16880lQ.LJIJJLI(getViewMuteStatus(), this);
        C16880lQ.LJIJJLI(getViewMuteAnchorStatus(), this);
        C16880lQ.LJIJJLI(getViewMuteAudienceStatus(), this);
        C16880lQ.LJIJJLI(getViewFollowStatus(), this);
        if (C76128TuG.LIZIZ(dataChannel, false, 6)) {
            C72259SXn.LIZIZ(getViewMuteAudienceStatus(), C87277YNd.LJIIJJI(4), C87277YNd.LJIIJJI(5), C87277YNd.LJIIJJI(4), C87277YNd.LJIIJJI(5));
        }
        C72259SXn.LIZ(C87277YNd.LJIIJJI(10), getViewFollowStatus());
        C72259SXn.LIZ(C87277YNd.LJIIJJI(10), getViewMuteStatus());
        if (C76117Tu5.LIZ()) {
            C47121t6 crossArcTestTv = getCrossArcTestTv();
            if (crossArcTestTv != null) {
                C29306Beo.LJJLIIIJJI(crossArcTestTv, true);
            }
            if (C8E.LIZLLL().eU("CoHostWindowView_create")) {
                C47121t6 crossArcTestTv2 = getCrossArcTestTv();
                if (crossArcTestTv2 != null) {
                    crossArcTestTv2.setText(C15380j0.LJIILJJIL(R.string.soc));
                }
            } else {
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.sod);
                MultiHostService.LJLL.getClass();
                if (MultiHostService.LJLLI) {
                    str2 = C15380j0.LJIILJJIL(R.string.sob);
                } else {
                    str2 = "";
                }
                C47121t6 crossArcTestTv3 = getCrossArcTestTv();
                if (crossArcTestTv3 != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJIILJJIL);
                    LIZ2.append(str2);
                    crossArcTestTv3.setText(X1D.LIZIZ(LIZ2));
                }
            }
        } else {
            C47121t6 crossArcTestTv4 = getCrossArcTestTv();
            if (crossArcTestTv4 != null) {
                C29306Beo.LJJLIIIJJI(crossArcTestTv4, false);
            }
        }
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        if (C76128TuG.LIZIZ(dataChannel, false, 6)) {
            if (z) {
                LJJZZIII(0.38f);
                return;
            }
            if (getViewMuteAudienceStatus().getVisibility() == 0) {
                f = 0.5f;
            } else {
                f = 0.43f;
            }
            LJJZZIII(f);
        }
    }

    public final void LJLLI(ProgressBar progressBar, View view, int i, boolean z) {
        C76433TzB c76433TzB;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isTeamMate = ");
        LIZ.append(z);
        LIZ.append(" and cardType = ");
        LIZ.append(i);
        LIZ.append(" teamMateSmokeBuffList = ");
        LIZ.append(((ArrayList) this.LLILLL).size());
        LIZ.append(" and teamMateCriticalBuffList = ");
        LIZ.append(this.LLILZ);
        LIZ.append(" and size = ");
        LIZ.append(((ArrayList) this.LLILZ).size());
        C0NB.LJ("TeamMate", X1D.LIZIZ(LIZ));
        if (!z && 2 == i && ((ArrayList) this.LLILLIZIL).size() == 0) {
            return;
        }
        if (!z) {
            if (1 == i && ((ArrayList) this.LLILLJJLI).size() == 0) {
                return;
            }
        } else if (2 == i) {
            if (((ArrayList) this.LLILLL).size() == 0) {
                return;
            }
        } else if (1 == i && ((ArrayList) this.LLILZ).size() == 0) {
            return;
        }
        if (this.LLILIL != EnumC76178Tv4.START) {
            return;
        }
        if (i == 2) {
            if (!z) {
                c76433TzB = (C76433TzB) ORS.LJJLJ(this.LLILLIZIL);
            } else {
                c76433TzB = (C76433TzB) ORS.LJJLJ(this.LLILLL);
            }
        } else if (!z) {
            c76433TzB = (C76433TzB) ORS.LJJLJ(this.LLILLJJLI);
        } else {
            c76433TzB = (C76433TzB) ORS.LJJLJ(this.LLILZ);
        }
        long j = c76433TzB.LIZ;
        int i2 = (int) (10 * j);
        long j2 = j * 1000;
        if (j2 < 0) {
            return;
        }
        StringBuilder LJ = C7MY.LJ("start animaton down smokeDuration = ", i2, " currentId = ");
        ItemInfo4FE itemInfo4FE = c76433TzB.LIZIZ;
        if (itemInfo4FE != null) {
            str = itemInfo4FE.itemId;
        } else {
            str = null;
        }
        LJ.append(str);
        LJ.append(" linkmicId = ");
        LJ.append(getLinkMicId());
        C0NB.LJ("TeamMate", X1D.LIZIZ(LJ));
        progressBar.setProgress(i2);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", i2, 0);
        ofInt.setDuration(j2);
        ofInt.setInterpolator(new LinearInterpolator());
        C16880lQ.LJLJJLL(ofInt);
        ofInt.addListener(new C76431Tz9(this, c76433TzB, i, new C72242sW(), view, z, progressBar, ofInt));
        ofInt.start();
        ((ArrayList) this.LLILZIL).add(ofInt);
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0201000_13(c76433TzB, i, this, 5), view);
        }
    }
}
