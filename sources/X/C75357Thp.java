package X;

import Y.ACListenerS33S0100000_13;
import Y.ARunnableS14S1100000_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.AfS65S0100000_13;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.RequestSettingSuccessEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2OpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForMaskEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.TriggerListChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestDebugNetworkTipSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicAnchorBlockFollowButtonSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFollowButtonShowSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicGuestFollowButtonOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowCircleViewSettingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSoundWaveBorderSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import o53.IDdS198S0200000_13;

/* renamed from: X.Thp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75357Thp extends C75349Thh implements InterfaceC75266TgM, InterfaceC75353Thl, InterfaceC76717U8z {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public EnumC74778TWk LJLIL;
    public final Long LJLILLLLZI;
    public final InterfaceC75371Ti3 LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public EnumC75419Tip LJLJJLL;
    public int LJLJL;
    public User LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public final C31657Cbd LJLZ;
    public int LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public View LLD;
    public final C5H3 LLF;
    public final C5H3 LLFF;
    public C76846UDy LLFFF;
    public final C75362Thu LLFII;
    public final java.util.Map<Integer, View> LLFZ;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;

    static {
        TBT tbt = new TBT(C75357Thp.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C75349Thh
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // X.C75349Thh
    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LLFZ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC75353Thl
    public final void d3(C75349Thh unEmptyMask) {
        o.LJIIIZ(unEmptyMask, "unEmptyMask");
    }

    @Override // X.InterfaceC76717U8z
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.C75349Thh, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLJLLL = false;
        this.LJLL = false;
        this.LJLLI = false;
        this.LJLLILLLL = false;
        super.onDetachedFromWindow();
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel != null) {
            mDataChannel.jv0(this);
        }
        if (this.LJLLJ) {
            getTalkVolumeWaveHandler().LIZJ = true;
        }
        C75378TiA talkVolumeWaveHandler = getTalkVolumeWaveHandler();
        C73411SrX c73411SrX = talkVolumeWaveHandler.LIZLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        talkVolumeWaveHandler.LIZLLL = null;
        this.LJLJI.LIZJ(getRoundCornerBgView(), this);
        this.LLD = null;
        C76846UDy c76846UDy = this.LLFFF;
        if (c76846UDy != null) {
            c76846UDy.LIZJ(this);
        }
        C75362Thu c75362Thu = this.LLFII;
        if (c75362Thu != null) {
            C73411SrX c73411SrX2 = c75362Thu.LIZIZ;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            c75362Thu.LIZIZ = null;
        }
    }

    private final C75367Thz getAvatarImageLoadListener() {
        return (C75367Thz) this.LLF.getValue();
    }

    private final C2A4 getFollowButton() {
        if (this.LLFII != null) {
            return (C2A4) _$_findCachedViewById(R.id.dks);
        }
        return null;
    }

    private final View getFollowButtonDelegate() {
        if (this.LLFII != null) {
            return _$_findCachedViewById(R.id.dk4);
        }
        return null;
    }

    private final Animator getPauseAlphaInAnimation() {
        return (Animator) this.LJZL.getValue();
    }

    private final Animator getPauseAlphaOutAnimation() {
        return (Animator) this.LL.getValue();
    }

    private final C75368Ti0 getPrepareAvatarImageLoadListener() {
        return (C75368Ti0) this.LLFF.getValue();
    }

    private final C75378TiA getTalkVolumeWaveHandler() {
        return (C75378TiA) this.LJZI.getValue();
    }

    private final ZoomService getZoomService() {
        return (ZoomService) this.LJLZ.LIZ(this, LLI[0]);
    }

    public final void LJIJJLI() {
        Long l;
        User user = this.LJLJLJ;
        if (user != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        C74947TbD.LJJII(l, getMDataChannel(), getWindow(), (C47061t0) _$_findCachedViewById(R.id.hb1));
    }

    public final void LJIL() {
        ViewGroup.LayoutParams layoutParams;
        C018905p c018905p;
        int i;
        String str;
        View _$_findCachedViewById;
        int i2;
        String str2;
        ViewGroup.LayoutParams layoutParams2;
        C018905p c018905p2;
        int LIZ;
        int LIZ2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        C018905p c018905p3;
        C018905p c018905p4;
        if (this.LJLIL == EnumC74778TWk.NORMAL) {
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.hb2);
        if (_$_findCachedViewById2 != null) {
            layoutParams = _$_findCachedViewById2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C018905p) {
            c018905p = (C018905p) layoutParams;
        } else {
            c018905p = null;
        }
        EnumC74778TWk enumC74778TWk = this.LJLIL;
        if (enumC74778TWk == EnumC74778TWk.GRID_FIX || enumC74778TWk == EnumC74778TWk.GRID) {
            C15380j0.LIZ(8.0f);
            C15380j0.LIZ(8.0f);
            C15380j0.LIZ(4.0f);
            C15380j0.LIZ(8.0f);
            if (c018905p != null) {
                c018905p.setMarginEnd(C15380j0.LIZ(4.0f));
            }
            ViewGroup.LayoutParams layoutParams5 = getWindow().LJJIJIL().getLayoutParams();
            if (layoutParams5 != null) {
                i = layoutParams5.width;
            } else {
                i = 0;
            }
            if (i >= C15380j0.LIZ(64.0f)) {
                LJIILJJIL(_$_findCachedViewById(R.id.hb2), 12.0f);
                LJIILJJIL(_$_findCachedViewById(R.id.hb9), 10.0f);
                TextView textView = (TextView) _$_findCachedViewById(R.id.hb7);
                if (textView != null) {
                    textView.setTextSize(11.0f);
                }
                TextView textView2 = (TextView) _$_findCachedViewById(R.id.h1_);
                if (textView2 != null) {
                    textView2.setTextSize(11.0f);
                }
            } else {
                LJIILJJIL(_$_findCachedViewById(R.id.hb2), 10.0f);
                LJIILJJIL(_$_findCachedViewById(R.id.hb9), 7.0f);
                TextView textView3 = (TextView) _$_findCachedViewById(R.id.hb7);
                if (textView3 != null) {
                    textView3.setTextSize(9.0f);
                }
                TextView textView4 = (TextView) _$_findCachedViewById(R.id.h1_);
                if (textView4 != null) {
                    textView4.setTextSize(9.0f);
                }
            }
            LJIILIIL();
        } else if (enumC74778TWk == EnumC74778TWk.FLOATING || enumC74778TWk == EnumC74778TWk.FLOATING_FIX) {
            ViewGroup.LayoutParams layoutParams6 = getWindow().LJJIJIL().getLayoutParams();
            if (layoutParams6 != null) {
                i2 = layoutParams6.width;
            } else {
                i2 = 0;
            }
            if (i2 >= C15380j0.LIZ(64.0f)) {
                C15380j0.LIZ(8.0f);
                C15380j0.LIZ(8.0f);
                C15380j0.LIZ(4.0f);
                C15380j0.LIZ(8.0f);
                TextView textView5 = (TextView) _$_findCachedViewById(R.id.hb7);
                if (textView5 != null) {
                    textView5.setTextSize(10.0f);
                }
                TextView textView6 = (TextView) _$_findCachedViewById(R.id.h1_);
                if (textView6 != null) {
                    textView6.setTextSize(10.0f);
                }
                LJIILJJIL(_$_findCachedViewById(R.id.hb2), 12.0f);
                if (c018905p != null) {
                    c018905p.setMarginEnd(C15380j0.LIZ(4.0f));
                }
            } else {
                C15380j0.LIZ(4.0f);
                C15380j0.LIZ(4.0f);
                C15380j0.LIZ(2.0f);
                C15380j0.LIZ(4.0f);
                TextView textView7 = (TextView) _$_findCachedViewById(R.id.hb7);
                if (textView7 != null) {
                    textView7.setTextSize(8.0f);
                }
                TextView textView8 = (TextView) _$_findCachedViewById(R.id.h1_);
                if (textView8 != null) {
                    textView8.setTextSize(8.0f);
                }
                LJIILJJIL(_$_findCachedViewById(R.id.hb2), 10.0f);
                if (c018905p != null) {
                    c018905p.setMarginEnd(C15380j0.LIZ(4.0f));
                }
            }
            ZoomService zoomService = getZoomService();
            if (zoomService != null) {
                str2 = zoomService.LJFF();
            } else {
                str2 = null;
            }
            if (o.LJ(str2, getWindow().LJJ())) {
                View _$_findCachedViewById3 = _$_findCachedViewById(R.id.gyx);
                if (_$_findCachedViewById3 != null) {
                    layoutParams2 = _$_findCachedViewById3.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                if ((layoutParams2 instanceof C018905p) && (c018905p2 = (C018905p) layoutParams2) != null) {
                    c018905p2.startToStart = 0;
                    c018905p2.topToTop = 0;
                    c018905p2.endToEnd = 0;
                    c018905p2.bottomToBottom = -1;
                    c018905p2.bottomToTop = R.id.fmx;
                    ((ViewGroup.MarginLayoutParams) c018905p2).bottomMargin = 0;
                    if (this.LLFII == null) {
                        LIZ = C15380j0.LIZ(8.0f);
                    } else {
                        LIZ = C15380j0.LIZ(4.0f);
                    }
                    ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = LIZ;
                    c018905p2.setMarginStart(C15380j0.LIZ(4.0f));
                    c018905p2.horizontalBias = 0.0f;
                    c018905p2.horizontalChainStyle = 1;
                    View _$_findCachedViewById4 = _$_findCachedViewById(R.id.hb2);
                    if (_$_findCachedViewById4 != null && _$_findCachedViewById4.getVisibility() == 0) {
                        LIZ2 = C15380j0.LIZ(20.0f);
                    } else {
                        LIZ2 = C15380j0.LIZ(4.0f);
                    }
                    c018905p2.setMarginEnd(LIZ2);
                    View _$_findCachedViewById5 = _$_findCachedViewById(R.id.gyx);
                    if (_$_findCachedViewById5 != null) {
                        _$_findCachedViewById5.setLayoutParams(c018905p2);
                    }
                    View _$_findCachedViewById6 = _$_findCachedViewById(R.id.hb2);
                    if (_$_findCachedViewById6 != null) {
                        layoutParams3 = _$_findCachedViewById6.getLayoutParams();
                    } else {
                        layoutParams3 = null;
                    }
                    if ((layoutParams3 instanceof C018905p) && (c018905p4 = (C018905p) layoutParams3) != null) {
                        c018905p4.horizontalBias = 1.0f;
                        c018905p4.startToEnd = R.id.gyx;
                        c018905p4.endToEnd = 0;
                        c018905p4.setMarginEnd(C15380j0.LIZ(6.0f));
                        c018905p4.horizontalBias = 1.0f;
                        C1K5 c1k5 = (C1K5) _$_findCachedViewById(R.id.hb2);
                        if (c1k5 != null) {
                            c1k5.setLayoutParams(c018905p4);
                        }
                    }
                    View _$_findCachedViewById7 = _$_findCachedViewById(R.id.fmx);
                    if (_$_findCachedViewById7 != null) {
                        layoutParams4 = _$_findCachedViewById7.getLayoutParams();
                    } else {
                        layoutParams4 = null;
                    }
                    if ((layoutParams4 instanceof C018905p) && (c018905p3 = (C018905p) layoutParams4) != null) {
                        c018905p3.startToStart = 0;
                        c018905p3.topToTop = -1;
                        c018905p3.topToBottom = R.id.gyx;
                        ((ViewGroup.MarginLayoutParams) c018905p3).topMargin = C15380j0.LIZ(2.0f);
                        c018905p3.bottomToBottom = -1;
                        View _$_findCachedViewById8 = _$_findCachedViewById(R.id.fmx);
                        if (_$_findCachedViewById8 != null) {
                            _$_findCachedViewById8.setLayoutParams(c018905p3);
                        }
                    }
                }
                LJIJ();
            } else {
                LJIILIIL();
                LJIIZILJ();
            }
        }
        if (!this.LJLLL && (_$_findCachedViewById = _$_findCachedViewById(R.id.fmx)) != null) {
            _$_findCachedViewById.setVisibility(0);
        }
        if (c018905p != null) {
            c018905p.setMarginEnd(C15380j0.LIZ(6.0f));
            c018905p.bottomToBottom = R.id.gyx;
            c018905p.endToEnd = 0;
            c018905p.setMarginStart(C15380j0.LIZ(8.0f));
            c018905p.topToTop = R.id.gyx;
            c018905p.horizontalBias = 1.0f;
            C1K5 c1k52 = (C1K5) _$_findCachedViewById(R.id.hb2);
            if (c1k52 != null) {
                c1k52.setLayoutParams(c018905p);
            }
        }
        ZoomService zoomService2 = getZoomService();
        if (zoomService2 != null) {
            str = zoomService2.LJFF();
        } else {
            str = null;
        }
        if (o.LJ(str, getWindow().LJJ())) {
            LJIJ();
        } else {
            LJIIZILJ();
        }
    }

    @Override // X.InterfaceC75266TgM
    public final void LJJIIZ() {
        this.LJLJI.LIZIZ(getRoundCornerBgView(), this);
    }

    @Override // X.InterfaceC75266TgM
    public final void LJJIJIIJI() {
        U2H timeCountdownView;
        if (!MultiGuestLiveShowCircleViewSettingSetting.INSTANCE.isFix()) {
            return;
        }
        ViewGroup liveShowOrderContainer = getLiveShowOrderContainer();
        if (liveShowOrderContainer != null) {
            C87277YNd.LJJIIZ(liveShowOrderContainer);
        }
        C8I1 timeCircleView = getTimeCircleView();
        if ((timeCircleView != null && timeCircleView.getVisibility() == 0) || ((timeCountdownView = getTimeCountdownView()) != null && timeCountdownView.getVisibility() == 0)) {
            C8I1 timeCircleView2 = getTimeCircleView();
            if (timeCircleView2 != null) {
                C87277YNd.LJJIIZ(timeCircleView2);
            }
            U2H timeCountdownView2 = getTimeCountdownView();
            if (timeCountdownView2 != null) {
                C87277YNd.LJJIIZ(timeCountdownView2);
            }
        }
    }

    public final MultiGuestDataHolder getMDataHolder() {
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("mDataHolder");
        throw null;
    }

    public final View getRoundCornerBgView() {
        View view = this.LLD;
        if (view == null) {
            view = new View(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
            view.setVisibility(8);
        }
        this.LLD = view;
        return view;
    }

    @Override // X.InterfaceC76717U8z
    public Long getUid() {
        User user = this.LJLJLJ;
        if (user != null) {
            return Long.valueOf(user.getId());
        }
        return null;
    }

    public final void LIZIZ() {
        C2A4 followButton = getFollowButton();
        if (followButton != null) {
            C87277YNd.LJJIIZ(followButton);
            View followButtonDelegate = getFollowButtonDelegate();
            if (followButtonDelegate != null) {
                C87277YNd.LJJIIZ(followButtonDelegate);
            }
            View followButtonDelegate2 = getFollowButtonDelegate();
            if (followButtonDelegate2 == null) {
                return;
            }
            followButtonDelegate2.setEnabled(false);
        }
    }

    public final void LJIIIZ() {
        Integer num;
        int maxWidth;
        ViewGroup.LayoutParams layoutParams = getWindow().LJJIJIL().getLayoutParams();
        if (layoutParams != null) {
            num = Integer.valueOf(layoutParams.width);
        } else {
            num = null;
        }
        if (num != null) {
            maxWidth = num.intValue() / 2;
        } else {
            maxWidth = ((ConstraintLayout) _$_findCachedViewById(R.id.h1b)).getMaxWidth();
        }
        ((ConstraintLayout) _$_findCachedViewById(R.id.h1b)).setMaxWidth(maxWidth);
    }

    public final void LJIILIIL() {
        ViewGroup.LayoutParams layoutParams;
        C018905p c018905p;
        int LIZ;
        C018905p c018905p2;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.gyx);
        ViewGroup.LayoutParams layoutParams2 = null;
        if (_$_findCachedViewById != null) {
            layoutParams = _$_findCachedViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof C018905p) || (c018905p = (C018905p) layoutParams) == null) {
            return;
        }
        c018905p.startToStart = 0;
        c018905p.topToTop = -1;
        c018905p.endToEnd = 0;
        c018905p.bottomToTop = -1;
        c018905p.bottomToBottom = 0;
        ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = C15380j0.LIZ(4.0f);
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = 0;
        c018905p.bottomToTop = -1;
        c018905p.setMarginStart(C15380j0.LIZ(4.0f));
        c018905p.horizontalChainStyle = 1;
        c018905p.horizontalBias = 0.0f;
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.hb2);
        if (_$_findCachedViewById2 != null && _$_findCachedViewById2.getVisibility() == 0) {
            LIZ = C15380j0.LIZ(20.0f);
        } else {
            LIZ = C15380j0.LIZ(4.0f);
        }
        c018905p.setMarginEnd(LIZ);
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.gyx);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.setLayoutParams(c018905p);
        }
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.fmx);
        if (_$_findCachedViewById4 != null) {
            layoutParams2 = _$_findCachedViewById4.getLayoutParams();
        }
        if (!(layoutParams2 instanceof C018905p) || (c018905p2 = (C018905p) layoutParams2) == null) {
            return;
        }
        c018905p2.startToStart = 0;
        c018905p2.topToTop = 0;
        c018905p2.topToBottom = -1;
        ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = 0;
        View _$_findCachedViewById5 = _$_findCachedViewById(R.id.fmx);
        if (_$_findCachedViewById5 == null) {
            return;
        }
        _$_findCachedViewById5.setLayoutParams(c018905p2);
    }

    public final void LJIILL() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.e05);
        if (_$_findCachedViewById != null) {
            C87277YNd.LJJIIZ(_$_findCachedViewById);
        }
        View view = this.LLD;
        if (view != null) {
            this.LJLJI.LIZLLL(view, false);
        }
    }

    public final void LJIILLIIL() {
        User user;
        String str;
        C2A4 followButton = getFollowButton();
        if (followButton != null) {
            if (followButton.getVisibility() != 0 && (user = this.LJLJLJ) != null) {
                long id = user.getId();
                HashMap LIZLLL = C73098SmU.LIZLLL();
                LIZLLL.put("to_user_id", String.valueOf(id));
                User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
                if (LJ != null) {
                    if (TV3.LJFF(LJ)) {
                        str = "live_anchor_c_guest";
                    } else if (TV3.LJIIIIZZ(LJ)) {
                        str = "live_guest_c_guest";
                    } else {
                        str = "live_audience_c_guest";
                    }
                    LIZLLL.put("request_page", str);
                }
                C74824TYe.LJLL("livesdk_guest_window_follow_icon_show", LIZLLL);
            }
            followButton.setActualImageResource(R.drawable.d7a);
            C87277YNd.LJJIJ(followButton);
            View followButtonDelegate = getFollowButtonDelegate();
            if (followButtonDelegate != null) {
                C87277YNd.LJJIJ(followButtonDelegate);
            }
            View followButtonDelegate2 = getFollowButtonDelegate();
            if (followButtonDelegate2 != null) {
                followButtonDelegate2.setEnabled(true);
            }
            View followButtonDelegate3 = getFollowButtonDelegate();
            if (followButtonDelegate3 != null) {
                C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 1), followButtonDelegate3);
            }
        }
    }

    public final void LJIIZILJ() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hb_);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.hav);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(0);
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.hav);
        if (_$_findCachedViewById3 != null) {
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C15380j0.LIZ(30.0f);
            }
            if (_$_findCachedViewById3 == null) {
                return;
            }
            _$_findCachedViewById3.setLayoutParams(layoutParams);
        }
    }

    public final void LJIJ() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hav);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.hb_);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(0);
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.hb_);
        if (_$_findCachedViewById3 != null) {
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C15380j0.LIZ(48.0f);
            }
            if (_$_findCachedViewById3 == null) {
                return;
            }
            _$_findCachedViewById3.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC75252Tg8
    public final String LJJ() {
        return getInteractId();
    }

    public final void LJJIII() {
        int i;
        String str;
        LJIL();
        LJIJJLI();
        LJJIL();
        ViewGroup.LayoutParams layoutParams = getWindow().LJJIJIL().getLayoutParams();
        int i2 = 0;
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        ZoomService zoomService = getZoomService();
        if (zoomService != null) {
            str = zoomService.LJFF();
        } else {
            str = null;
        }
        if (o.LJ(str, getInteractId())) {
            if (C21090sD.LIZIZ()) {
                i2 = C15380j0.LIZ(240.0f);
            } else {
                EnumC74778TWk enumC74778TWk = this.LJLIL;
                if (enumC74778TWk == EnumC74778TWk.FLOATING || enumC74778TWk == EnumC74778TWk.FLOATING_FIX) {
                    i2 = C15380j0.LIZ(220.0f);
                }
            }
        }
        int i3 = i - i2;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hiw);
        if (_$_findCachedViewById != null) {
            C29306Beo.LJJJJJL(i2, _$_findCachedViewById);
        }
        TBH.LIZ(i3, (C47061t0) _$_findCachedViewById(R.id.hix), (C47121t6) _$_findCachedViewById(R.id.hj3), (C47121t6) _$_findCachedViewById(R.id.hj5));
        if (LivesdkLinkmicFollowButtonShowSetting.INSTANCE.isShowFollowButton()) {
            LivesdkLinkmicGuestFollowButtonOptSetting livesdkLinkmicGuestFollowButtonOptSetting = LivesdkLinkmicGuestFollowButtonOptSetting.INSTANCE;
            if (livesdkLinkmicGuestFollowButtonOptSetting.isV3()) {
                LJIIIZ();
            } else if (livesdkLinkmicGuestFollowButtonOptSetting.isV4()) {
                LJIIIZ();
                setFollowButtonSize(14.0f);
                _$_findCachedViewById(R.id.h1b).setBackground(null);
            }
        }
        LJJIJIIJIL(getMDataHolder().LJFF(getInteractId()));
        LIZ("updateUiLayoutParams");
        this.LJLJI.LIZIZ(getRoundCornerBgView(), this);
    }

    public final void LJJIIJ() {
        boolean z;
        Boolean LIZJ;
        LJIJJ(!LIZLLL(getInteractId()));
        MultiGuestDataHolder mDataHolder = getMDataHolder();
        if (mDataHolder != null && (LIZJ = mDataHolder.LIZJ(getInteractId())) != null) {
            z = LIZJ.booleanValue();
        } else {
            z = false;
        }
        LJIJI(!z);
    }

    @Override // X.InterfaceC75266TgM
    public final void LJJIIZI() {
        boolean z = true;
        if ((!isAnchor() && isSelf$liveinteract_impl_release()) || getHasLoadingFinished$liveinteract_impl_release()) {
            z = false;
        }
        setMNeedPrepareLoading(z);
    }

    public final void LJJIL() {
        int LJIIJJI;
        ViewGroup.LayoutParams layoutParams;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hb1);
        if (_$_findCachedViewById != null && (layoutParams = _$_findCachedViewById.getLayoutParams()) != null) {
            LJIIJJI = layoutParams.width;
        } else {
            LJIIJJI = C87277YNd.LJIIJJI(60);
        }
        LJIILJJIL(_$_findCachedViewById(R.id.hba), ((LJIIJJI * 1.6f) / C16880lQ.LLLLL(C15380j0.LIZLLL()).getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // X.InterfaceC76717U8z
    public Boolean getAudioMute() {
        MultiGuestDataHolder mDataHolder = getMDataHolder();
        if (mDataHolder != null) {
            return mDataHolder.LIZJ(getInteractId());
        }
        return null;
    }

    @Override // X.InterfaceC76717U8z
    public int getH() {
        return getHeight();
    }

    @Override // X.InterfaceC76717U8z
    public String getLinkMicId() {
        return getInteractId();
    }

    @Override // X.InterfaceC76717U8z
    public Integer getLogicPos() {
        return Integer.valueOf(getWindow().LLLFFI());
    }

    @Override // X.InterfaceC76717U8z
    public Integer getUiPos() {
        return Integer.valueOf(getWindow().LJZ());
    }

    @Override // X.InterfaceC76717U8z
    public Boolean getVideoMute() {
        MultiGuestDataHolder mDataHolder = getMDataHolder();
        if (mDataHolder != null) {
            return mDataHolder.LJIIJ(getInteractId());
        }
        return null;
    }

    @Override // X.InterfaceC76717U8z
    public int getW() {
        return getWidth();
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

    @Override // X.C75349Thh
    public final void initView() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.initView();
        if (isAnchor()) {
            C47061t0 mAvatarBackground = getMAvatarBackground();
            if (mAvatarBackground != null) {
                mAvatarBackground.setVisibility(0);
            }
        } else {
            C47061t0 mAvatarBackground2 = getMAvatarBackground();
            if (mAvatarBackground2 != null) {
                mAvatarBackground2.setVisibility(8);
            }
        }
        if (this.LLFII == null) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.h1b);
            ViewGroup.LayoutParams layoutParams = null;
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setBackground(null);
            }
            C41541k6 c41541k6 = (C41541k6) _$_findCachedViewById(R.id.h1_);
            if (c41541k6 != null) {
                ViewGroup.LayoutParams layoutParams2 = c41541k6.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.setMarginStart(0);
                    c41541k6.setLayoutParams(marginLayoutParams);
                }
            }
            ViewGroup liveShowOrderContainer = getLiveShowOrderContainer();
            if (liveShowOrderContainer != null && (layoutParams = liveShowOrderContainer.getLayoutParams()) != null) {
                layoutParams.width = C15380j0.LIZ(12.0f);
                layoutParams.height = C15380j0.LIZ(12.0f);
            }
            ViewGroup liveShowOrderContainer2 = getLiveShowOrderContainer();
            if (liveShowOrderContainer2 != null) {
                liveShowOrderContainer2.setLayoutParams(layoutParams);
            }
            C47121t6 liveShowOrderTv = getLiveShowOrderTv();
            if (liveShowOrderTv != null) {
                liveShowOrderTv.setTextSize(2, 10.0f);
            }
        }
        LJJIII();
    }

    @Override // X.C75349Thh, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Integer valueOf;
        super.onAttachedToWindow();
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel != null) {
            if (isSelf$liveinteract_impl_release()) {
                mDataChannel.mv0(MultiLiveGuestMuteAudioEvent.class, this, new AqS179S0100000_13(this, 37));
                mDataChannel.mv0(MultiLiveGuestMuteVideoEvent.class, this, new AqS179S0100000_13(this, 38));
            } else {
                mDataChannel.mv0(MultiLiveUserMediaEvent.class, this, new AqS179S0100000_13(this, 39));
                mDataChannel.mv0(PlayerPauseLiveForMaskEvent.class, this, new AqS179S0100000_13(this, 40));
                mDataChannel.mv0(RequestSettingSuccessEvent.class, this, new AqS179S0100000_13(this, 41));
            }
        }
        LJJIIJ();
        MultiGuestDataHolder mDataHolder = getMDataHolder();
        if (mDataHolder != null && (valueOf = Integer.valueOf(mDataHolder.LJI(getInteractId()))) != null && valueOf.intValue() != 1 && valueOf.intValue() != 0 && valueOf.intValue() == 2) {
            LJJI(true);
        }
        if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip() && getMDataHolder().LJFF(getInteractId()) != -1) {
            LJJIJIIJIL(getMDataHolder().LJFF(getInteractId()));
        }
        this.LJLIL = C59994Ngc.LIZJ();
        LJJIII();
        DataChannel mDataChannel2 = getMDataChannel();
        if (mDataChannel2 != null) {
            mDataChannel2.qv0(TriggerListChangeEvent.class, 3);
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C76846UDy c76846UDy = new C76846UDy(context, getWindow(), getMDataChannel());
        this.LLFFF = c76846UDy;
        c76846UDy.LIZ(this);
        C75362Thu c75362Thu = this.LLFII;
        if (c75362Thu != null) {
            c75362Thu.LIZIZ = (C73411SrX) C73943T0h.LIZ().LJ(CJ5.class).LJJJLIIL(new AfS65S0100000_13(c75362Thu, 4), new InterfaceC64592gB() { // from class: X.9CY
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
    }

    @Override // X.C75349Thh
    public final void onSingleTapConfirm() {
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        if (C74947TbD.LJIILLIIL(LJ)) {
            super.onSingleTapConfirm();
            return;
        }
        User user = this.LJLJLJ;
        if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            DataChannel mDataChannel = getMDataChannel();
            if (mDataChannel == null) {
                return;
            }
            mDataChannel.qv0(MultiGuestV3PreviewPanelV2OpenEvent.class, new C74601TPp(null, "selfie_window", "link_management_pannel"));
            return;
        }
        invokeSendGiftPanel();
    }

    @Override // X.InterfaceC75266TgM
    public final Long LJJIIJZLJL() {
        return this.LJLILLLLZI;
    }

    public int getPosition() {
        return this.LJLJL;
    }

    public EnumC75419Tip getState() {
        return this.LJLJJLL;
    }

    public static final String LJII(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_MultiGuestV3GuestMask_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_MultiGuestV3GuestMask_", i, LIZ2);
    }

    private final void setFollowButtonSize(float f) {
        int LIZ = C15380j0.LIZ(f);
        C29306Beo.LJJLIIIJJIZ(LIZ, LIZ, _$_findCachedViewById(R.id.dks));
    }

    public final void LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("source = ");
        LIZ.append(str);
        C0NB.LIZIZ("MultiGuestV3GuestMask", X1D.LIZIZ(LIZ));
        TV3.LJIILL(this, new ARunnableS14S1100000_13(this, str, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(java.lang.String r4) {
        /*
            r3 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r3.getMDataHolder()
            if (r0 == 0) goto L11
            java.lang.Boolean r0 = r0.LJIIJ(r4)
            if (r0 == 0) goto L11
            boolean r0 = r0.booleanValue()
        L10:
            return r0
        L11:
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            com.bytedance.android.live.base.model.user.User r1 = r0.LJ()
            java.lang.String r0 = "getInstance().user().currentUserOpt"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = X.C74947TbD.LJIILLIIL(r1)
            r2 = 1
            if (r0 == 0) goto L5b
            X.Tl5 r0 = X.C75559Tl5.LIZIZ
            java.util.HashMap r1 = r0.LIZJ()
            java.lang.String r0 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.InterfaceC31805Ce1
            if (r0 == 0) goto L7e
            X.Ce1 r1 = (X.InterfaceC31805Ce1) r1
            if (r1 == 0) goto L7e
            X.TUl r0 = r1.LIZ()
            if (r0 == 0) goto L7e
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = X.C76917UGr.LJJIJIIJIL(r0, r4)
            if (r0 == 0) goto L7e
            int r1 = r0.mLinkType
        L4d:
            r0 = 2
            if (r1 != r0) goto L7e
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r3.getMDataHolder()
            if (r0 == 0) goto L59
            r0.LJIILJJIL(r4, r2)
        L59:
            r0 = 1
            goto L10
        L5b:
            X.Tl5 r0 = X.C75559Tl5.LIZIZ
            java.util.HashMap r1 = r0.LIZJ()
            java.lang.String r0 = "MULTI_GUEST_V3_GUEST_USER_MANAGER"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.TQ8
            if (r0 == 0) goto L7e
            X.TQ8 r1 = (X.TQ8) r1
            if (r1 == 0) goto L7e
            X.TUl r0 = r1.LIZ()
            if (r0 == 0) goto L7e
            com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r0 = X.C76917UGr.LJJIJIL(r0, r4)
            if (r0 == 0) goto L7e
            int r1 = r0.linkType
            goto L4d
        L7e:
            boolean r0 = r3.isSelf$liveinteract_impl_release()
            if (r0 == 0) goto L8e
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r3.getMDataHolder()
            if (r0 == 0) goto L90
            boolean r0 = r0.LJ
            if (r0 != r2) goto L90
        L8e:
            r0 = 0
            goto L10
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75357Thp.LIZLLL(java.lang.String):boolean");
    }

    public final void LJ(ImageModel imageModel) {
        if (!this.LJLJLLL) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.hb1);
            if (_$_findCachedViewById != null && !C29306Beo.LJJIIJ(_$_findCachedViewById)) {
                return;
            }
            this.LJLJLLL = true;
            if (imageModel == null) {
                this.LJLJLLL = false;
            }
            C0NB.LIZIZ("MultiGuestV3GuestMask_image", "loadAvatarForMute invoke");
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(imageModel);
                LJIIIZ.LJIIIIZZ = R.drawable.cuk;
                int width = _$_findCachedViewById(R.id.hb1).getWidth();
                int height = _$_findCachedViewById(R.id.hb1).getHeight();
                LJIIIZ.LJ = width;
                LJIIIZ.LJFF = height;
                LJIIIZ.LJIIL = Boolean.TRUE;
                LJIIIZ.LJIIJJI = getAvatarImageLoadListener();
                LJIIIZ.LJIIJJI(_$_findCachedViewById(R.id.hb1));
                return;
            }
            C15640jQ.LJIIIZ((ImageView) _$_findCachedViewById(R.id.hb1), imageModel, _$_findCachedViewById(R.id.hb1).getWidth(), _$_findCachedViewById(R.id.hb1).getHeight(), R.drawable.cuk, getAvatarImageLoadListener());
        }
    }

    public final void LJI(ImageModel imageModel) {
        int i;
        int i2;
        ImageView mPrepareAvatar = getMPrepareAvatar();
        int i3 = 0;
        if ((mPrepareAvatar != null && !C29306Beo.LJJIIJ(mPrepareAvatar)) || this.LJLLI) {
            return;
        }
        this.LJLLI = true;
        if (imageModel == null) {
            this.LJLLI = false;
        }
        C0NB.LIZIZ("MultiGuestV3GuestMask_image", "loadPrepareAvatar invoke");
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(imageModel);
            LJIIIZ.LJIIIIZZ = R.drawable.cuk;
            ImageView mPrepareAvatar2 = getMPrepareAvatar();
            if (mPrepareAvatar2 != null) {
                i2 = mPrepareAvatar2.getWidth();
            } else {
                i2 = 0;
            }
            ImageView mPrepareAvatar3 = getMPrepareAvatar();
            if (mPrepareAvatar3 != null) {
                i3 = mPrepareAvatar3.getHeight();
            }
            LJIIIZ.LJ = i2;
            LJIIIZ.LJFF = i3;
            LJIIIZ.LJIIL = Boolean.TRUE;
            LJIIIZ.LJIIJJI = getPrepareAvatarImageLoadListener();
            LJIIIZ.LJIIJJI(getMPrepareAvatar());
            return;
        }
        if (getMPrepareAvatar() == null) {
            return;
        }
        ImageView mPrepareAvatar4 = getMPrepareAvatar();
        ImageView mPrepareAvatar5 = getMPrepareAvatar();
        if (mPrepareAvatar5 != null) {
            i = mPrepareAvatar5.getWidth();
        } else {
            i = 0;
        }
        ImageView mPrepareAvatar6 = getMPrepareAvatar();
        if (mPrepareAvatar6 != null) {
            i3 = mPrepareAvatar6.getHeight();
        }
        C15640jQ.LJIIIZ(mPrepareAvatar4, imageModel, i, i3, R.drawable.cuk, getPrepareAvatarImageLoadListener());
    }

    public final long LJIIJ(String str) {
        List<LinkPlayerInfo> list;
        LinkPlayerInfo linkPlayerInfo;
        User user;
        Long valueOf;
        long LJJIIJZLJL = getWindow().LJJIIJZLJL();
        if (LJJIIJZLJL == -1) {
            Long l = this.LJLILLLLZI;
            if (l != null) {
                return l.longValue();
            }
            MultiGuestDataHolder mDataHolder = getMDataHolder();
            if (mDataHolder == null || (list = mDataHolder.LJJIFFI) == null) {
                return LJJIIJZLJL;
            }
            Iterator<LinkPlayerInfo> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    linkPlayerInfo = it.next();
                    if (o.LJ(linkPlayerInfo.mInteractIdStr, str)) {
                        break;
                    }
                } else {
                    linkPlayerInfo = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
            if (linkPlayerInfo2 == null || (user = linkPlayerInfo2.mUser) == null || (valueOf = Long.valueOf(user.getId())) == null) {
                return LJJIIJZLJL;
            }
            return valueOf.longValue();
        }
        return LJJIIJZLJL;
    }

    public final void LJIIJJI(int i) {
        int i2;
        C0NB.LIZIZ("NetworkStateTips", "MultiGuestV3GuestMask_reportCurrentNetworkState");
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        if (C74947TbD.LJIILLIIL(LJ)) {
            long LJJIIJZLJL = getWindow().LJJIIJZLJL();
            if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_anchor_guest_netspeed_stuck_icon_show")) {
                return;
            }
            HashMap LIZLLL = C73098SmU.LIZLLL();
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                o.LJIIIIZZ(idStr, "room.idStr");
                LIZLLL.put("room_id", idStr);
                LIZLLL.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                LIZLLL.put("guest_id", String.valueOf(LJJIIJZLJL));
            }
            LIZLLL.put("net_speed_level", String.valueOf(i));
            C74824TYe.LJLL("livesdk_anchor_guest_netspeed_stuck_icon_show", LIZLLL);
            return;
        }
        long LJJIIJZLJL2 = getWindow().LJJIIJZLJL();
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room2 != null) {
            String idStr2 = room2.getIdStr();
            o.LJIIIIZZ(idStr2, "room.idStr");
            LIZLLL2.put("room_id", idStr2);
            LIZLLL2.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
        }
        LIZLLL2.put("show_guest_id", String.valueOf(LJJIIJZLJL2));
        if (LJJIIJZLJL2 == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        LIZLLL2.put("is_self", String.valueOf(i2));
        LIZLLL2.put("net_speed_level", String.valueOf(i));
        C74824TYe.LJLL("livesdk_guest_netspeed_stuck_icon_show", LIZLLL2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7.LJLLL
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedSettings.getValue()
            r3 = 8
            r6 = 2131372441(0x7f0a2999, float:1.8364945E38)
            r4 = 1
            r2 = 0
            if (r4 != r0) goto L87
            boolean r0 = r7.getMCurrentUserIsLinkedGuest()
            if (r0 == 0) goto L71
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r1 = r7.getMDataHolder()
            if (r1 == 0) goto L2c
            java.lang.String r0 = r7.getInteractId()
            int r0 = r1.LIZIZ(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            if (r5 != 0) goto L5b
        L2c:
            if (r8 != 0) goto L85
        L2e:
            android.view.View r1 = r7._$_findCachedViewById(r6)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 != 0) goto L4a
        L36:
            if (r4 == 0) goto L3b
            r7.LJIILL()
        L3b:
            r7.LJIL()
            r7.LJIJJLI()
            r7.LJJIL()
            java.lang.String r0 = "switchGuestAudio"
            r7.LIZ(r0)
            return
        L4a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r0.intValue()
            if (r4 == 0) goto L57
            int r3 = r0.intValue()
        L57:
            r1.setVisibility(r3)
            goto L36
        L5b:
            int r1 = r5.intValue()
            r0 = 4
            if (r1 == r0) goto L2e
            int r1 = r5.intValue()
            r0 = 2
            if (r1 == r0) goto L2e
            int r1 = r5.intValue()
            r0 = 3
            if (r1 == r0) goto L2e
            goto L2c
        L71:
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r1 = r7.getMDataHolder()
            if (r1 == 0) goto L82
            java.lang.String r0 = r7.getInteractId()
            int r0 = r1.LIZLLL(r0)
            if (r0 != r4) goto L82
            goto L2e
        L82:
            if (r8 != 0) goto L85
            goto L2e
        L85:
            r4 = 0
            goto L2e
        L87:
            android.view.View r1 = r7._$_findCachedViewById(r6)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 != 0) goto L95
        L8f:
            if (r8 != 0) goto L3b
            r7.LJIILL()
            goto L3b
        L95:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r0.intValue()
            if (r8 == 0) goto La2
            int r2 = r0.intValue()
        La2:
            r1.setVisibility(r2)
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75357Thp.LJIJI(boolean):void");
    }

    public final void LJIJJ(boolean z) {
        if (this.LJLLL) {
            return;
        }
        if (z) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.hb1);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.hb4);
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(8);
            return;
        }
        ImageView imageView3 = (ImageView) _$_findCachedViewById(R.id.hb1);
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        ImageView imageView4 = (ImageView) _$_findCachedViewById(R.id.hb4);
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        TV3.LJIILL(this, new ARunnableS49S0100000_13(this, 3));
    }

    @Override // X.InterfaceC75252Tg8
    public final void LJJI(boolean z) {
        Animator pauseAlphaOutAnimation;
        if (z == this.LJLLL || o.LJ(getLinkMicId(), C78886Uxe.LJJJJLL(C8E.LJ()))) {
            return;
        }
        this.LJLLL = z;
        if (z) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.hiw);
            if (_$_findCachedViewById != null) {
                C87277YNd.LJJIJ(_$_findCachedViewById);
            }
            Animator pauseAlphaInAnimation = getPauseAlphaInAnimation();
            if (pauseAlphaInAnimation != null) {
                pauseAlphaInAnimation.start();
            }
            if (_$_findCachedViewById(R.id.hix) != null) {
                C15540jG c15540jG = new C15540jG();
                C47061t0 pause_image = (C47061t0) _$_findCachedViewById(R.id.hix);
                o.LJIIIIZZ(pause_image, "pause_image");
                c15540jG.LIZ = pause_image;
                c15540jG.LIZIZ = CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1");
                c15540jG.LIZJ = "ttlive_pause_live_anim.webp";
                c15540jG.LJFF = true;
                C15490jB.LJI(c15540jG);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.hb1);
            if (_$_findCachedViewById2 != null) {
                C87277YNd.LJJIIZ(_$_findCachedViewById2);
            }
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.hb2);
            if (_$_findCachedViewById3 != null) {
                C87277YNd.LJJIIZ(_$_findCachedViewById3);
            }
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.fmx);
            if (_$_findCachedViewById4 != null) {
                C87277YNd.LJJIIZ(_$_findCachedViewById4);
            }
            View _$_findCachedViewById5 = _$_findCachedViewById(R.id.h1_);
            if (_$_findCachedViewById5 != null) {
                C87277YNd.LJJIIZ(_$_findCachedViewById5);
            }
            View _$_findCachedViewById6 = _$_findCachedViewById(R.id.h1b);
            if (_$_findCachedViewById6 != null) {
                C87277YNd.LJJIIZ(_$_findCachedViewById6);
            }
            TV3.LJIILL(this, new ARunnableS49S0100000_13(this, 3));
            View _$_findCachedViewById7 = _$_findCachedViewById(R.id.hb4);
            if (_$_findCachedViewById7 != null) {
                C87277YNd.LJJIJ(_$_findCachedViewById7);
            }
            LJIILL();
            return;
        }
        View _$_findCachedViewById8 = _$_findCachedViewById(R.id.hiw);
        if (_$_findCachedViewById8 != null && true == C29306Beo.LJJIIJ(_$_findCachedViewById8) && (pauseAlphaOutAnimation = getPauseAlphaOutAnimation()) != null) {
            pauseAlphaOutAnimation.start();
        }
        View _$_findCachedViewById9 = _$_findCachedViewById(R.id.fmx);
        if (_$_findCachedViewById9 != null) {
            C87277YNd.LJJIJ(_$_findCachedViewById9);
        }
        View _$_findCachedViewById10 = _$_findCachedViewById(R.id.h1_);
        if (_$_findCachedViewById10 != null) {
            C87277YNd.LJJIJ(_$_findCachedViewById10);
        }
        View _$_findCachedViewById11 = _$_findCachedViewById(R.id.h1b);
        if (_$_findCachedViewById11 != null) {
            C87277YNd.LJJIJ(_$_findCachedViewById11);
        }
        updateOnlineCloseUI();
        LJJIIJ();
    }

    @Override // X.InterfaceC75252Tg8
    public final void LJJIFFI(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[VideoState] call mask switchGuestVideo ");
        LIZ.append(z);
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "GuestMask");
        LJIJJ(!z);
    }

    @Override // X.InterfaceC75252Tg8
    public final void LJJII(int i) {
        boolean z;
        if (i == 4 || i == 2 || i == 3) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[AudioState] call mask switchGuestAudio ");
        LIZ.append(z);
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "GuestMask");
        LJIJI(!z);
    }

    @Override // X.InterfaceC75266TgM
    public final void LJJIJ(InterfaceC75179Tex linkMicWindow) {
        o.LJIIIZ(linkMicWindow, "linkMicWindow");
        TV3.LJIIJJI(this);
        setWindow(linkMicWindow);
        linkMicWindow.LJJIJIL().removeAllViews();
        linkMicWindow.LJJIJIL().addView(this);
    }

    @Override // X.InterfaceC75266TgM
    public final void LJJIJIIJIL(int i) {
        EnumC75338ThW LJJIII;
        int i2 = this.LJZ;
        if (i2 == i) {
            UC7.LIZLLL("MultiGuestV3GuestMask_updateNetworkState return as networkState is the same as old ", i);
            return;
        }
        EnumC75338ThW LJJIII2 = C77117UOj.LJJIII(i2);
        this.LJZ = i;
        if (LiveSdkMultiGuestDebugNetworkTipSetting.INSTANCE.isEnable()) {
            LJJIII = EnumC75338ThW.BAD;
        } else {
            LJJIII = C77117UOj.LJJIII(i);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestV3GuestMask_updateNetworkState linkMicId:");
        LIZ.append(getLinkMicId());
        LIZ.append(" state = ");
        LIZ.append(LJJIII);
        C0NB.LIZIZ("NetworkStateTips", X1D.LIZIZ(LIZ));
        C41081jM networkStateImageView = getNetworkStateImageView();
        if (networkStateImageView != null) {
            int i3 = C75339ThX.LIZ[LJJIII.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    C87277YNd.LJJIIZ(networkStateImageView);
                } else {
                    if (_$_findCachedViewById(R.id.h1_) == null || _$_findCachedViewById(R.id.h1_).getWidth() >= C15380j0.LIZ(18.0f)) {
                        C87277YNd.LJJIJ(networkStateImageView);
                        networkStateImageView.setImageResource(R.drawable.cxw);
                    }
                    if (LJJIII2 != LJJIII) {
                        LJIIJJI(i);
                    }
                }
            } else {
                if (_$_findCachedViewById(R.id.h1_) == null || _$_findCachedViewById(R.id.h1_).getWidth() >= C15380j0.LIZ(18.0f)) {
                    C87277YNd.LJJIJ(networkStateImageView);
                    networkStateImageView.setImageResource(R.drawable.cxv);
                }
                if (LJJIII2 != LJJIII) {
                    LJIIJJI(i);
                }
            }
        }
        LIZ("updateNetworkState");
    }

    @Override // X.InterfaceC75266TgM
    public final void LJJIJIL(boolean z) {
        C2A4 followButton;
        C2A4 followButton2;
        C2A4 followButton3;
        if (this.LJLLLLLL == z) {
            return;
        }
        if (z) {
            if (LivesdkLinkmicGuestFollowButtonOptSetting.INSTANCE.isV1()) {
                C2A4 followButton4 = getFollowButton();
                if (followButton4 != null && followButton4.LJFF() && (followButton3 = getFollowButton()) != null) {
                    followButton3.LJ();
                }
                C2A4 followButton5 = getFollowButton();
                if (followButton5 != null && !followButton5.LJFF() && (followButton = getFollowButton()) != null && followButton.getVisibility() == 0 && (followButton2 = getFollowButton()) != null) {
                    C15540jG c15540jG = new C15540jG();
                    c15540jG.LIZ = followButton2;
                    c15540jG.LJFF = true;
                    c15540jG.LIZIZ = CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1");
                    c15540jG.LIZJ = "ttlive_user_info_follow_complete_1.webp";
                    c15540jG.LJ = new C75364Thw(this);
                    C15490jB.LJI(c15540jG);
                }
            } else {
                LIZIZ();
            }
        } else if (isAnchor() && !LivesdkLinkmicAnchorBlockFollowButtonSetting.INSTANCE.isAnchorShowFollowButton()) {
            return;
        } else {
            LJIILLIIL();
        }
        this.LJLLLLLL = z;
        LIZ("onFollowStatusChange");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        super.dispatchDraw(canvas);
        if (C30922CBq.LIZIZ) {
            OSZ osz = new OSZ(Boolean.valueOf(C29306Beo.LJIILLIIL(getVideoMute())), Boolean.valueOf(C29306Beo.LJIILLIIL(getAudioMute())));
            if (canvas != null) {
                if (((Boolean) osz.getFirst()).booleanValue() == C29306Beo.LJJIIJ(_$_findCachedViewById(R.id.hb1)) || ((Boolean) osz.getSecond()).booleanValue() == C29306Beo.LJJIIJ(_$_findCachedViewById(R.id.hb2))) {
                    z = true;
                } else {
                    z = false;
                }
                TBH.LIZIZ(canvas, osz, z);
            }
        }
    }

    public final void setMDataHolder(MultiGuestDataHolder multiGuestDataHolder) {
        o.LJIIIZ(multiGuestDataHolder, "<set-?>");
        this.mDataHolder = multiGuestDataHolder;
    }

    public void setPosition(int i) {
        this.LJLJL = i;
    }

    public void setState(EnumC75419Tip state) {
        o.LJIIIZ(state, "state");
        this.LJLJJLL = state;
    }

    @Override // X.C75349Thh
    public final void updateState(int i) {
        C47061t0 mAvatarBackground;
        ImageView mPrepareAvatar;
        super.updateState(i);
        if (i == 1 && !LIZLLL(getInteractId()) && (mPrepareAvatar = getMPrepareAvatar()) != null) {
            mPrepareAvatar.setVisibility(8);
        }
        if (isAnchor() || (mAvatarBackground = getMAvatarBackground()) == null) {
            return;
        }
        mAvatarBackground.setVisibility(8);
    }

    @Override // X.C75349Thh, X.TV0
    public final void updateUserInfo(User user) {
        super.updateUserInfo(user);
        TV3.LJIILL(this, new ARunnableS32S0200000_13(user, this, 2));
        TextView mOnlineName = getMOnlineName();
        if (mOnlineName != null) {
            mOnlineName.setText(C05170If.LIZ(user));
        }
        this.LJLJLJ = user;
        if (!this.LJLJJL) {
            C75362Thu c75362Thu = this.LLFII;
            if (c75362Thu != null) {
                c75362Thu.LIZ("isTriggerUpdateFollowStatus");
            }
            this.LJLJJL = true;
            C0NB.LIZIZ("MultiGuestV3GuestMask", "Trigger UpdateFollowStatus");
        }
    }

    public static boolean LIZJ(View view, View view2) {
        if (!C29306Beo.LJJIIJ(view) || !C29306Beo.LJJIIJ(view2)) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        int i2 = iArr2[0];
        return Rect.intersects(rect, new Rect(i2, iArr2[1], view2.getWidth() + i2, view2.getHeight() + iArr2[1]));
    }

    public static void LJIILJJIL(View view, float f) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C15380j0.LIZ(f);
                layoutParams.width = C15380j0.LIZ(f);
            }
            if (view == null) {
                return;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.W5O, REQUEST] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.W5O, REQUEST] */
    public final void LJFF(ImageModel imageModel, C47061t0 c47061t0) {
        boolean z;
        String str;
        List<String> urls;
        if (c47061t0 != null && c47061t0.getId() == R.id.hb4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.LJLL) {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.hb4);
                if (_$_findCachedViewById != null && !C29306Beo.LJJIIJ(_$_findCachedViewById)) {
                    return;
                } else {
                    this.LJLL = true;
                }
            } else {
                return;
            }
        } else if (c47061t0 != null && c47061t0.getId() == R.id.i1g) {
            if (!this.LJLLILLLL) {
                C47061t0 mAvatarBackground = getMAvatarBackground();
                if (mAvatarBackground != null && !C29306Beo.LJJIIJ(mAvatarBackground)) {
                    return;
                } else {
                    this.LJLLILLLL = true;
                }
            } else {
                return;
            }
        }
        if (imageModel == null && c47061t0 != null) {
            if (c47061t0.getId() == R.id.hb4) {
                this.LJLL = false;
            } else if (c47061t0.getId() == R.id.i1g) {
                this.LJLLILLLL = false;
            }
        }
        C0NB.LIZIZ("MultiGuestV3GuestMask_image", "loadGaussianBlurBg invoke");
        C78747UvP c78747UvP = new C78747UvP(5);
        if (C15650jR.LIZIZ(imageModel)) {
            if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                str = (String) ORZ.LJLLLL(urls);
            } else {
                str = null;
            }
            W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
            LIZLLL.LJIIJ = c78747UvP;
            ?? LIZ = LIZLLL.LIZ();
            if (c47061t0 == null) {
                return;
            }
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LIZLLL = LIZ;
            LIZJ.LJIIL = c47061t0.getController();
            LIZJ.LJII = new C75361Tht(c47061t0, this, imageModel);
            c47061t0.setController(LIZJ.LIZ());
            return;
        }
        W5P LIZJ2 = W5P.LIZJ(R.drawable.cuk);
        LIZJ2.LJIIJ = c78747UvP;
        ?? LIZ2 = LIZJ2.LIZ();
        if (c47061t0 == null) {
            return;
        }
        C81705W4v LIZJ3 = W5I.LIZJ();
        LIZJ3.LIZLLL = LIZ2;
        LIZJ3.LJIIL = c47061t0.getController();
        LIZJ3.LJII = new IDdS198S0200000_13(c47061t0, this, 0);
        c47061t0.setController(LIZJ3.LIZ());
    }

    public final void LJIIIIZZ(String linkMicId, String str) {
        Boolean bool;
        boolean z;
        Boolean LIZJ;
        o.LJIIIZ(linkMicId, "linkMicId");
        MultiGuestSoundWaveBorderSetting multiGuestSoundWaveBorderSetting = MultiGuestSoundWaveBorderSetting.INSTANCE;
        String str2 = "audio";
        boolean z2 = true;
        if (!multiGuestSoundWaveBorderSetting.isBorderWithoutAvatarWave()) {
            MultiGuestDataHolder mDataHolder = getMDataHolder();
            if (mDataHolder != null && (LIZJ = mDataHolder.LIZJ(getInteractId())) != null) {
                z = LIZJ.booleanValue();
            } else {
                z = false;
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.hb1);
            if (_$_findCachedViewById != null && _$_findCachedViewById.getVisibility() == 0 && !z) {
                String interactId = getInteractId();
                if (interactId == null) {
                    interactId = linkMicId;
                }
                boolean LIZIZ = getTalkVolumeWaveHandler().LIZIZ(getMDataHolder().LJIIIZ(interactId));
                if (LIZIZ) {
                    C74787TWt LIZ = C74786TWs.LIZ(str);
                    LIZ.LIZ(LJIIJ(interactId), "guest", "audio");
                    C74786TWs.LIZIZ(LIZ);
                }
                this.LJLLJ = LIZIZ;
            } else {
                getTalkVolumeWaveHandler().LIZJ = true;
                ImageView imageView = (ImageView) _$_findCachedViewById(R.id.hba);
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                this.LJLLJ = false;
            }
        }
        if (multiGuestSoundWaveBorderSetting.isBorderWithoutAvatarWave() || multiGuestSoundWaveBorderSetting.isBorderWithAvatarWave()) {
            EnumC74778TWk LIZJ2 = C59994Ngc.LIZJ();
            String interactId2 = getInteractId();
            if (interactId2 == null) {
                interactId2 = linkMicId;
            }
            Boolean LIZJ3 = getMDataHolder().LIZJ(interactId2);
            if ((LIZJ3 != null && LIZJ3.booleanValue()) || this.LJLLL) {
                LJIILL();
                return;
            }
            int LJIIIZ = getMDataHolder().LJIIIZ(interactId2);
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.hb1);
            if (_$_findCachedViewById2 == null || _$_findCachedViewById2.getVisibility() != 0) {
                z2 = false;
            }
            ZoomService zoomService = getZoomService();
            Boolean bool2 = null;
            if (zoomService != null) {
                bool = Boolean.valueOf(zoomService.LIZJ());
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                if (LIZJ2 == EnumC74778TWk.FLOATING || LIZJ2 == EnumC74778TWk.FLOATING_FIX) {
                    ZoomService zoomService2 = getZoomService();
                    if (zoomService2 != null) {
                        String interactId3 = getInteractId();
                        if (interactId3 != null) {
                            linkMicId = interactId3;
                        }
                        bool2 = Boolean.valueOf(zoomService2.LJIIIIZZ(linkMicId));
                    }
                    if (C29306Beo.LJJIFFI(bool2)) {
                        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.e05);
                        if (_$_findCachedViewById3 == null) {
                            return;
                        }
                        C87277YNd.LJJIIZ(_$_findCachedViewById3);
                        return;
                    }
                }
            } else if (LIZJ2 == EnumC74778TWk.FLOATING && !C74740TUy.LIZLLL().LJ()) {
                View _$_findCachedViewById4 = _$_findCachedViewById(R.id.e05);
                if (_$_findCachedViewById4 != null) {
                    C87277YNd.LJJIIZ(_$_findCachedViewById4);
                }
                boolean LIZJ4 = getTalkVolumeWaveHandler().LIZJ(LJIIIZ, new AqS163S0100000_13(this, 19));
                if (!LIZJ4) {
                    return;
                }
                C74787TWt LIZ2 = C74786TWs.LIZ(str);
                long LJIIJ = LJIIJ(interactId2);
                if (!z2) {
                    str2 = "video";
                }
                LIZ2.LIZ(LJIIJ, "guest", str2);
                C74786TWs.LIZIZ(LIZ2);
                View view = this.LLD;
                if (view == null) {
                    return;
                }
                this.LJLJI.LIZLLL(view, LIZJ4);
                return;
            }
            if (!getTalkVolumeWaveHandler().LIZJ(LJIIIZ, new AqS163S0100000_13(this, 18))) {
                return;
            }
            View _$_findCachedViewById5 = _$_findCachedViewById(R.id.e05);
            if (_$_findCachedViewById5 != null) {
                C87277YNd.LJJIJ(_$_findCachedViewById5);
            }
            C74787TWt LIZ3 = C74786TWs.LIZ(str);
            long LJIIJ2 = LJIIJ(interactId2);
            if (!z2) {
                str2 = "video";
            }
            LIZ3.LIZ(LJIIJ2, "guest", str2);
            C74786TWs.LIZIZ(LIZ3);
        }
    }

    @Override // X.InterfaceC75266TgM
    public final void LJJIJL(long j, long j2) {
        Boolean bool;
        if (!MultiGuestLiveShowCircleViewSettingSetting.INSTANCE.isFix()) {
            return;
        }
        if (j == 0 && j2 == 0) {
            C8I1 timeCircleView = getTimeCircleView();
            if (timeCircleView != null) {
                C87277YNd.LJJIIZ(timeCircleView);
            }
            U2H timeCountdownView = getTimeCountdownView();
            if (timeCountdownView != null) {
                C87277YNd.LJJIIZ(timeCountdownView);
                return;
            }
            return;
        }
        ZoomService zoomService = getZoomService();
        Boolean bool2 = null;
        if (zoomService != null) {
            bool = Boolean.valueOf(zoomService.LIZJ());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            ZoomService zoomService2 = getZoomService();
            if (zoomService2 != null) {
                bool2 = Boolean.valueOf(zoomService2.LJIIIIZZ(getLinkMicId()));
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                C8I1 timeCircleView2 = getTimeCircleView();
                if (timeCircleView2 != null) {
                    C87277YNd.LJJIJ(timeCircleView2);
                }
                U2H timeCountdownView2 = getTimeCountdownView();
                if (timeCountdownView2 != null) {
                    C87277YNd.LJJIJ(timeCountdownView2);
                }
                C8I1 timeCircleView3 = getTimeCircleView();
                if (timeCircleView3 != null) {
                    timeCircleView3.setTotalTime(j);
                }
                C8I1 timeCircleView4 = getTimeCircleView();
                if (timeCircleView4 != null) {
                    timeCircleView4.setRemainTime(j2);
                }
                U2H timeCountdownView3 = getTimeCountdownView();
                if (timeCountdownView3 != null) {
                    long j3 = 60;
                    long j4 = j2 / j3;
                    long j5 = (j4 / j3) % 24;
                    long j6 = j4 % j3;
                    long j7 = j2 % j3;
                    long j8 = 10;
                    timeCountdownView3.LJLIL.LIZ((int) (j5 / j8), false);
                    timeCountdownView3.LJLILLLLZI.LIZ((int) (j5 % j8), false);
                    timeCountdownView3.LJLJI.LIZ((int) (j6 / j8), false);
                    timeCountdownView3.LJLJJI.LIZ((int) (j6 % j8), false);
                    timeCountdownView3.LJLJJL.LIZ((int) (j7 / j8), false);
                    timeCountdownView3.LJLJJLL.LIZ((int) (j7 % j8), false);
                }
            }
        }
    }

    @Override // X.InterfaceC75266TgM
    public final void LJJIJLIJ(int i, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup liveShowOrderContainer = getLiveShowOrderContainer();
        if (liveShowOrderContainer != null) {
            layoutParams = liveShowOrderContainer.getLayoutParams();
        } else {
            layoutParams = null;
        }
        int i2 = 0;
        if (i >= 10) {
            if (layoutParams != null) {
                if (layoutParams.width != -2) {
                    layoutParams.width = -2;
                }
            }
            ViewGroup liveShowOrderContainer2 = getLiveShowOrderContainer();
            if (liveShowOrderContainer2 != null) {
                liveShowOrderContainer2.setLayoutParams(layoutParams);
            }
        } else {
            int LIZ = C15380j0.LIZ(12.0f);
            if (layoutParams != null) {
                if (layoutParams.width != LIZ) {
                    layoutParams.width = LIZ;
                }
            }
            ViewGroup liveShowOrderContainer3 = getLiveShowOrderContainer();
            if (liveShowOrderContainer3 != null) {
                liveShowOrderContainer3.setLayoutParams(layoutParams);
            }
        }
        ViewGroup liveShowOrderContainer4 = getLiveShowOrderContainer();
        if (liveShowOrderContainer4 != null) {
            C87277YNd.LJJIJ(liveShowOrderContainer4);
        }
        C47121t6 liveShowOrderTv = getLiveShowOrderTv();
        if (liveShowOrderTv != null) {
            liveShowOrderTv.setText(String.valueOf(i));
        }
        if (z) {
            C47121t6 liveShowOrderTv2 = getLiveShowOrderTv();
            if (liveShowOrderTv2 != null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                Integer LJI = C79045V0n.LJI(R.attr.dm, context);
                if (LJI != null) {
                    i2 = LJI.intValue();
                }
                liveShowOrderTv2.setTextColor(i2);
            }
        } else {
            C47121t6 liveShowOrderTv3 = getLiveShowOrderTv();
            if (liveShowOrderTv3 != null) {
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                Integer LJI2 = C79045V0n.LJI(R.attr.dj, context2);
                if (LJI2 != null) {
                    i2 = LJI2.intValue();
                }
                liveShowOrderTv3.setTextColor(i2);
            }
        }
        LIZ("showLiveShowOrder");
    }

    @Override // X.C75349Thh
    public final void updateTicket(int i, long j) {
        super.updateTicket(i, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75357Thp(Context context, InterfaceC75179Tex window, String str, AbstractC74724TUi abstractC74724TUi, InterfaceC75353Thl interfaceC75353Thl, DataChannel dataChannel, EnumC74778TWk enumC74778TWk, Long l, C74719TUd roundCornerStyle) {
        super(context, window, str, abstractC74724TUi, interfaceC75353Thl, dataChannel);
        C75362Thu c75362Thu;
        o.LJIIIZ(window, "window");
        o.LJIIIZ(roundCornerStyle, "roundCornerStyle");
        this.LLFZ = new LinkedHashMap();
        this.LJLIL = enumC74778TWk;
        this.LJLILLLLZI = l;
        this.LJLJI = roundCornerStyle;
        this.LJLJJLL = window.LJJIL();
        this.LJLJL = -1;
        this.LJLLLLLL = true;
        this.LJLZ = new C31657Cbd("ZOOM_SERVICE");
        this.LJZ = -1;
        this.LJZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 17));
        this.LJZL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 14));
        this.LL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 15));
        this.LLF = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 13));
        this.LLFF = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 16));
        if (LivesdkLinkmicFollowButtonShowSetting.INSTANCE.isShowFollowButton()) {
            c75362Thu = new C75362Thu(this);
        } else {
            c75362Thu = null;
        }
        this.LLFII = c75362Thu;
        C75559Tl5.LIZIZ.LIZLLL(this);
        ActivityC45651qj LIZJ = C29306Beo.LIZJ(context);
        if (LIZJ != null) {
            o.LJII(FrameLayout.inflate(LIZJ, getWindowLayoutId(), this), "null cannot be cast to non-null type android.view.ViewGroup");
            initView();
        }
    }
}
