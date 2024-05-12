package X;

import Y.ACListenerS33S0100000_13;
import Y.AUListenerS100S0100000_13;
import Y.AfS65S0100000_13;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorSendPositionUpdateRTCMsgWhenUserLeaveEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.rank.MultiGuestGiftContributeRankDialog;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkInGuestCountDownFinishChannel;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowCircleViewSettingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Thh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C75349Thh extends FrameLayout implements TV0, WeakHandler.IHandler, InterfaceC30716C3s {
    public static final C75354Thm Companion = new C75354Thm();
    public java.util.Map<Integer, View> _$_findViewCache;
    public boolean adjustParent;
    public C73318Sq2 compositeDisposable;
    public int currentState;
    public View fanTicketContainer;
    public View fanTicketContainerInner;
    public boolean hasInit;
    public boolean hasLoadingFinished;
    public final String interactId;
    public String lastTicketIconUrl;
    public ViewGroup liveShowOrderContainer;
    public C47121t6 liveShowOrderTv;
    public boolean mAttachedToWindow;
    public C47061t0 mAvatarBackground;
    public InterfaceC75353Thl mCallback;
    public boolean mCurrentUserIsLinkedGuest;
    public final DataChannel mDataChannel;
    public final WeakHandler mHandler;
    public boolean mHasCountDownFinished;
    public CVT mLoadingView;
    public boolean mNeedPrepareLoading;
    public TextView mOnlineName;
    public View mOnlinePlayerClose;
    public TextView mOnlineTicket;
    public ImageView mOnlineTicketIcon;
    public ViewGroup mOnlineViewContainer;
    public ImageView mPrepareAvatar;
    public ViewGroup mPrepareViewContainer;
    public AbstractC74724TUi mPresenter;
    public C41081jM networkStateImageView;
    public TextView onlineTicketAnimation;
    public boolean ticketIconLoaded;
    public C8I1 timeCircleView;
    public U2H timeCountdownView;
    public InterfaceC75179Tex window;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this._$_findViewCache;
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

    public final int getWindowLayoutId() {
        return R.layout.dlf;
    }

    public void needPrepareCountDown() {
        this.mNeedPrepareLoading = true;
    }

    public void switch2TimeLimited(int i, boolean z) {
    }

    @Override // X.TV0
    public void switchMode(boolean z) {
    }

    public void updateTicket(int i, long j) {
    }

    @Override // X.TV0
    public void updateUserInfo(User user) {
    }

    private final void closeInteraction() {
        DataChannel dataChannel = this.mDataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(InteractStateChangeEvent.class, new TW6(5));
        }
    }

    private final void initOnlineWindow() {
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS33S0100000_13(this, 35)));
    }

    private final void openGiftRankDialog() {
        Room room;
        User user;
        DataChannel dataChannel = this.mDataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return;
        }
        AbstractC74724TUi abstractC74724TUi = this.mPresenter;
        Long l = null;
        if (abstractC74724TUi != null) {
            user = abstractC74724TUi.LJ();
        } else {
            user = null;
        }
        EnumC74877Ta5 enumC74877Ta5 = EnumC74877Ta5.MASK_CLICK;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            l = LIZ.LJIIJ();
        }
        MultiGuestGiftContributeRankDialog LIZ2 = C74876Ta4.LIZ(user, room, enumC74877Ta5, l);
        FragmentManager fragmentManager = (FragmentManager) this.mDataChannel.kv0(C29494Bhq.class);
        if (fragmentManager == null) {
            return;
        }
        LIZ2.show(fragmentManager, getClass().getName());
    }

    public final C47061t0 getMAvatarBackground() {
        C47061t0 c47061t0 = this.mAvatarBackground;
        if (c47061t0 != null) {
            return c47061t0;
        }
        o.LJIJI("mAvatarBackground");
        throw null;
    }

    public final CVT getMLoadingView() {
        CVT cvt = this.mLoadingView;
        if (cvt != null) {
            return cvt;
        }
        o.LJIJI("mLoadingView");
        throw null;
    }

    public final TextView getMOnlineName() {
        TextView textView = this.mOnlineName;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("mOnlineName");
        throw null;
    }

    public final ImageView getMPrepareAvatar() {
        ImageView imageView = this.mPrepareAvatar;
        if (imageView != null) {
            return imageView;
        }
        o.LJIJI("mPrepareAvatar");
        throw null;
    }

    public final C41081jM getNetworkStateImageView() {
        C41081jM c41081jM = this.networkStateImageView;
        if (c41081jM != null) {
            return c41081jM;
        }
        o.LJIJI("networkStateImageView");
        throw null;
    }

    public final void invokeSendGiftPanel() {
        Room room;
        boolean z;
        boolean z2;
        boolean z3;
        User user;
        boolean z4;
        String str;
        AbstractC74727TUl LIZ;
        Long LJJIZ;
        DataChannel dataChannel = this.mDataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return;
        }
        boolean z5 = true;
        if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().isEnableGift()) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = (Boolean) this.mDataChannel.kv0(UserIsAnchorChannel.class);
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        long j = 0;
        if (((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        EnumC31154CKo LIZIZ = C31153CKn.LIZIZ(z2, z3, z);
        if (LIZIZ == EnumC31154CKo.GREY || LIZIZ == EnumC31154CKo.HIDE) {
            if (room.getRoomAuthStatus() == null || room.getRoomAuthStatus().getRoomAuthOffReasons() == null || room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() == null) {
                return;
            }
            C30868C9o.LJI(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
            this.mDataChannel.qv0(LogGiftCloseToastShowEvent.class, Boolean.TRUE);
            return;
        }
        AbstractC74724TUi abstractC74724TUi = this.mPresenter;
        InterfaceC31805Ce1 interfaceC31805Ce1 = null;
        if (abstractC74724TUi != null && abstractC74724TUi.LJ() != null) {
            AbstractC74724TUi abstractC74724TUi2 = this.mPresenter;
            if (abstractC74724TUi2 != null) {
                user = abstractC74724TUi2.LJ();
            } else {
                user = null;
            }
            C32004ChE c32004ChE = new C32004ChE(user);
            c32004ChE.LIZIZ = "anchor_link_guest";
            if (C74947TbD.LJJI() || C74789TWv.LIZIZ()) {
                z4 = true;
            } else {
                z4 = false;
            }
            c32004ChE.LJFF = z4;
            if (isAnchor()) {
                Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if ((obj instanceof InterfaceC31805Ce1) && (interfaceC31805Ce1 = (InterfaceC31805Ce1) obj) != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJJIZ = C76917UGr.LJJIZ(LIZ, this.interactId)) != null) {
                    j = LJJIZ.longValue();
                }
                HashMap hashMap = new HashMap();
                EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
                hashMap.put("layout_setting", C74824TYe.LJI(LIZJ).getFirst());
                hashMap.put("window_setting", C74824TYe.LJI(LIZJ).getSecond());
                hashMap.put("link_id", this.interactId);
                if (interfaceC31805Ce1 == null || (str = interfaceC31805Ce1.LIZIZ(j)) == null) {
                    str = "guest_apply_anchor";
                }
                hashMap.put("guest_invite_type", str);
                c32004ChE.LJ = hashMap;
            } else {
                if (!C74934Tb0.LIZ() || C74789TWv.LIZIZ()) {
                    z5 = false;
                }
                c32004ChE.LJI = z5;
            }
            this.mDataChannel.qv0(SendGiftEvent.class, c32004ChE);
        }
    }

    public final boolean isAnchor() {
        long j;
        Room room;
        DataChannel dataChannel = this.mDataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        if (j == C025908h.LIZ()) {
            return true;
        }
        return false;
    }

    public final boolean isSelf$liveinteract_impl_release() {
        AbstractC74724TUi abstractC74724TUi = this.mPresenter;
        if ((abstractC74724TUi != null && abstractC74724TUi.LJI()) || this.window.LJJIIJZLJL() == C025908h.LIZ()) {
            return true;
        }
        return false;
    }

    public final void move2Finish() {
        if (!this.mAttachedToWindow) {
            return;
        }
        updateState(3);
    }

    public final void onCoinsClickInUS() {
        DataChannel dataChannel = this.mDataChannel;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C74738TUw.LIZIZ(context, dataChannel);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.adjustParent) {
            super.onDetachedFromWindow();
            return;
        }
        this.mAttachedToWindow = false;
        this.mHandler.removeCallbacksAndMessages(null);
        this.hasInit = false;
        AbstractC74724TUi abstractC74724TUi = this.mPresenter;
        if (abstractC74724TUi != null) {
            abstractC74724TUi.LIZJ();
        }
        this.compositeDisposable.LIZLLL();
        this.mCallback = null;
        this.ticketIconLoaded = false;
        this.lastTicketIconUrl = null;
        super.onDetachedFromWindow();
    }

    public final void switchCamera() {
        if (this.window.LJLJJLL() != null && (this.window.LJLJJLL() instanceof InterfaceC24140x8)) {
            KeyEvent.Callback LJLJJLL = this.window.LJLJJLL();
            o.LJII(LJLJJLL, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.api.widget.IInteractVideoView");
            ((InterfaceC24140x8) LJLJJLL).LIZIZ(C78857UxB.LJJIIJ(1476788233, "bpea-linkmic_basemask_switchCamera"));
        }
    }

    public final void switchToOnline() {
        if (this.currentState == 1) {
            updateState(2);
        }
    }

    public final void updateOnlineCloseUI() {
        View view;
        if (this.mOnlinePlayerClose == null) {
            return;
        }
        if (this.mCurrentUserIsLinkedGuest && isSelf$liveinteract_impl_release()) {
            View view2 = this.mOnlinePlayerClose;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View view3 = this.mOnlinePlayerClose;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        if (isAnchor() && (view = this.mOnlinePlayerClose) != null) {
            view.setVisibility(8);
        }
        View view4 = this.mOnlinePlayerClose;
        if (view4 == null) {
            return;
        }
        view4.setVisibility(8);
    }

    public void initView() {
        View findViewById = findViewById(R.id.i1g);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.prepare_background)");
        setMAvatarBackground((C47061t0) findViewById);
        View findViewById2 = findViewById(R.id.i1f);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.prepare_avatar)");
        setMPrepareAvatar((ImageView) findViewById2);
        this.mPrepareViewContainer = (ViewGroup) findViewById(R.id.i1h);
        View findViewById3 = findViewById(R.id.g94);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.loading_view)");
        setMLoadingView((CVT) findViewById3);
        View findViewById4 = findViewById(R.id.f7o);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.iv_network_state)");
        setNetworkStateImageView((C41081jM) findViewById4);
        View findViewById5 = findViewById(R.id.h1_);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.nick_name)");
        setMOnlineName((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.hb7);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.online_ticket)");
        this.mOnlineTicket = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.hb8);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.online_ticket_animation)");
        this.onlineTicketAnimation = (TextView) findViewById7;
        View findViewById8 = findViewById(R.id.hb9);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.online_ticket_icon)");
        this.mOnlineTicketIcon = (ImageView) findViewById8;
        this.mOnlineViewContainer = (ViewGroup) findViewById(R.id.hax);
        this.fanTicketContainer = findViewById(R.id.fmx);
        this.fanTicketContainerInner = findViewById(R.id.fmy);
        if (MultiGuestLiveShowCircleViewSettingSetting.INSTANCE.isFix()) {
            this.timeCircleView = (C8I1) findViewById(R.id.fz4);
            U2H u2h = (U2H) findViewById(R.id.fz5);
            this.timeCountdownView = u2h;
            if (u2h != null) {
                u2h.setTextSize(14.0f);
            }
            C8I1 c8i1 = this.timeCircleView;
            if (c8i1 != null) {
                C87277YNd.LJJIIZ(c8i1);
            }
            U2H u2h2 = this.timeCountdownView;
            if (u2h2 != null) {
                C87277YNd.LJJIIZ(u2h2);
            }
        }
        this.liveShowOrderContainer = (ViewGroup) findViewById(R.id.fyz);
        this.liveShowOrderTv = (C47121t6) findViewById(R.id.fz0);
        this.hasInit = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initOnlineWindow();
        this.mAttachedToWindow = true;
        AbstractC74724TUi abstractC74724TUi = this.mPresenter;
        if (abstractC74724TUi != null) {
            abstractC74724TUi.LIZ(this);
        }
        AbstractC74724TUi abstractC74724TUi2 = this.mPresenter;
        if (abstractC74724TUi2 != null) {
            abstractC74724TUi2.LJII();
        }
        if (this.mNeedPrepareLoading && !this.hasLoadingFinished) {
            updateState(1);
        } else {
            updateState(2);
            DataChannel dataChannel = this.mDataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(LinkInGuestCountDownFinishChannel.class, this.interactId);
            }
        }
        if (CCJ.LIZ(getContext())) {
            getMOnlineName().setLayoutDirection(1);
            getMOnlineName().setTextDirection(4);
            _$_findCachedViewById(R.id.hax).setLayoutDirection(1);
            _$_findCachedViewById(R.id.hax).setTextDirection(4);
        }
        this.compositeDisposable.LIZ(C73943T0h.LIZ().LJ(C28268B7o.class).LJJJJZI(new AfS65S0100000_13(this, 42)));
        View view = this.fanTicketContainer;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 36), view);
        }
    }

    public final boolean getAdjustParent() {
        return this.adjustParent;
    }

    public final boolean getHasInit() {
        return this.hasInit;
    }

    public final boolean getHasLoadingFinished$liveinteract_impl_release() {
        return this.hasLoadingFinished;
    }

    public final String getInteractId() {
        return this.interactId;
    }

    public final ViewGroup getLiveShowOrderContainer() {
        return this.liveShowOrderContainer;
    }

    public final C47121t6 getLiveShowOrderTv() {
        return this.liveShowOrderTv;
    }

    public final boolean getMAttachedToWindow$liveinteract_impl_release() {
        return this.mAttachedToWindow;
    }

    public final boolean getMCurrentUserIsLinkedGuest() {
        return this.mCurrentUserIsLinkedGuest;
    }

    public final DataChannel getMDataChannel() {
        return this.mDataChannel;
    }

    public final boolean getMHasCountDownFinished$liveinteract_impl_release() {
        return this.mHasCountDownFinished;
    }

    public final boolean getMNeedPrepareLoading() {
        return this.mNeedPrepareLoading;
    }

    public final ViewGroup getMPrepareViewContainer$liveinteract_impl_release() {
        return this.mPrepareViewContainer;
    }

    public final AbstractC74724TUi getMPresenter() {
        return this.mPresenter;
    }

    public final C8I1 getTimeCircleView() {
        return this.timeCircleView;
    }

    public final U2H getTimeCountdownView() {
        return this.timeCountdownView;
    }

    public final InterfaceC75179Tex getWindow() {
        return this.window;
    }

    @Override // X.InterfaceC30716C3s
    public boolean isAdjustParent() {
        return this.adjustParent;
    }

    public final void onCoinsClickNotInUS() {
        openGiftRankDialog();
    }

    public void onSingleTapConfirm() {
        invokeSendGiftPanel();
    }

    private final void preMeasure(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private final void updateTicketCountWithAnimation(String str) {
        int height;
        View view;
        TextView textView = this.mOnlineTicket;
        if (textView != null) {
            Object parent = textView.getParent();
            if ((parent instanceof View) && (view = (View) parent) != null) {
                height = view.getHeight();
            } else {
                TextView textView2 = this.mOnlineTicket;
                if (textView2 != null) {
                    height = textView2.getHeight();
                } else {
                    o.LJIJI("mOnlineTicket");
                    throw null;
                }
            }
            float f = height;
            TextView textView3 = this.mOnlineTicket;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                TextView textView4 = this.mOnlineTicket;
                if (textView4 != null) {
                    int measuredWidth = textView4.getMeasuredWidth();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (-1.0f) * f);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.setDuration(250L);
                    ofFloat.addUpdateListener(new AUListenerS100S0100000_13(this, 21));
                    ofFloat.start();
                    TextView textView5 = this.onlineTicketAnimation;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                        TextView textView6 = this.onlineTicketAnimation;
                        if (textView6 != null) {
                            textView6.setText(str);
                            TextView textView7 = this.onlineTicketAnimation;
                            if (textView7 != null) {
                                preMeasure(textView7);
                                TextView textView8 = this.onlineTicketAnimation;
                                if (textView8 != null) {
                                    int measuredWidth2 = textView8.getMeasuredWidth();
                                    TextView textView9 = this.onlineTicketAnimation;
                                    if (textView9 != null) {
                                        int measuredWidth3 = textView9.getMeasuredWidth();
                                        if (measuredWidth3 >= measuredWidth) {
                                            measuredWidth = measuredWidth3;
                                        }
                                        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
                                            TextView textView10 = this.mOnlineTicket;
                                            if (textView10 != null) {
                                                setWidth(textView10, measuredWidth);
                                            } else {
                                                o.LJIJI("mOnlineTicket");
                                                throw null;
                                            }
                                        }
                                        TextView textView11 = this.onlineTicketAnimation;
                                        if (textView11 != null) {
                                            textView11.setTranslationY(f);
                                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f, 0.0f);
                                            ofFloat2.setInterpolator(new LinearInterpolator());
                                            ofFloat2.setDuration(250L);
                                            ofFloat2.addUpdateListener(new AUListenerS100S0100000_13(this, 22));
                                            ofFloat2.addListener(new C75350Thi(this, str, measuredWidth, measuredWidth2));
                                            ofFloat2.start();
                                            return;
                                        }
                                        o.LJIJI("onlineTicketAnimation");
                                        throw null;
                                    }
                                    o.LJIJI("onlineTicketAnimation");
                                    throw null;
                                }
                                o.LJIJI("onlineTicketAnimation");
                                throw null;
                            }
                            o.LJIJI("onlineTicketAnimation");
                            throw null;
                        }
                        o.LJIJI("onlineTicketAnimation");
                        throw null;
                    }
                    o.LJIJI("onlineTicketAnimation");
                    throw null;
                }
                o.LJIJI("mOnlineTicket");
                throw null;
            }
            o.LJIJI("mOnlineTicket");
            throw null;
        }
        o.LJIJI("mOnlineTicket");
        throw null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message msg) {
        Object obj;
        java.util.Map map;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            if (isSelf$liveinteract_impl_release()) {
                closeInteraction();
                updateState(4);
                return;
            }
            updateState(4);
            InterfaceC75353Thl interfaceC75353Thl = this.mCallback;
            if (interfaceC75353Thl != null) {
                interfaceC75353Thl.d3(this);
            }
            TYR tyr = TS8.LIZ;
            String str = this.interactId;
            tyr.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("removeMicPosition  ");
            LIZ.append(str);
            C0NB.LIZIZ("InteractALog_UserInteractIdDataHolder", X1D.LIZIZ(LIZ));
            tyr.LIZJ();
            if (!TextUtils.isEmpty(str) && !((HashMap) tyr.LIZIZ).isEmpty()) {
                Iterator it = ((HashMap) tyr.LIZIZ).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((String) ((Map.Entry) it.next()).getValue()).equals(str)) {
                        it.remove();
                        break;
                    }
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= ((ArrayList) tyr.LIZJ).size()) {
                        break;
                    }
                    if (str.equals(ListProtector.get(tyr.LIZJ, i2))) {
                        ListProtector.remove(tyr.LIZJ, i2);
                        break;
                    }
                    i2++;
                }
                tyr.LIZJ();
            }
            DataChannel dataChannel = this.mDataChannel;
            if (dataChannel == null) {
                return;
            }
            dataChannel.pv0(AnchorSendPositionUpdateRTCMsgWhenUserLeaveEvent.class);
            return;
        }
        this.mHasCountDownFinished = true;
        DataChannel dataChannel2 = this.mDataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(LinkInGuestCountDownFinishChannel.class, this.interactId);
        }
        DataChannel dataChannel3 = this.mDataChannel;
        if (dataChannel3 != null && (map = (java.util.Map) dataChannel3.kv0(BD9.class)) != null) {
            obj = map.get(this.window.LJJ());
        } else {
            obj = null;
        }
        if (!o.LJ(obj, Boolean.TRUE)) {
            updateState(1);
        } else {
            updateState(2);
        }
    }

    public final void setAdjustParent(boolean z) {
        this.adjustParent = z;
    }

    public final void setCurrentUserIsLinkedGuest(boolean z) {
        this.mCurrentUserIsLinkedGuest = z;
    }

    public final void setHasInit(boolean z) {
        this.hasInit = z;
    }

    public final void setHasLoadingFinished$liveinteract_impl_release(boolean z) {
        this.hasLoadingFinished = z;
    }

    public final void setLiveShowOrderContainer(ViewGroup viewGroup) {
        this.liveShowOrderContainer = viewGroup;
    }

    public final void setLiveShowOrderTv(C47121t6 c47121t6) {
        this.liveShowOrderTv = c47121t6;
    }

    public final void setMAttachedToWindow$liveinteract_impl_release(boolean z) {
        this.mAttachedToWindow = z;
    }

    public final void setMAvatarBackground(C47061t0 c47061t0) {
        o.LJIIIZ(c47061t0, "<set-?>");
        this.mAvatarBackground = c47061t0;
    }

    public final void setMCurrentUserIsLinkedGuest(boolean z) {
        this.mCurrentUserIsLinkedGuest = z;
    }

    public final void setMHasCountDownFinished$liveinteract_impl_release(boolean z) {
        this.mHasCountDownFinished = z;
    }

    public final void setMLoadingView(CVT cvt) {
        o.LJIIIZ(cvt, "<set-?>");
        this.mLoadingView = cvt;
    }

    public final void setMNeedPrepareLoading(boolean z) {
        this.mNeedPrepareLoading = z;
    }

    public final void setMOnlineName(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.mOnlineName = textView;
    }

    public final void setMPrepareAvatar(ImageView imageView) {
        o.LJIIIZ(imageView, "<set-?>");
        this.mPrepareAvatar = imageView;
    }

    public final void setMPrepareViewContainer$liveinteract_impl_release(ViewGroup viewGroup) {
        this.mPrepareViewContainer = viewGroup;
    }

    public final void setMPresenter(AbstractC74724TUi abstractC74724TUi) {
        this.mPresenter = abstractC74724TUi;
    }

    public final void setNetworkStateImageView(C41081jM c41081jM) {
        o.LJIIIZ(c41081jM, "<set-?>");
        this.networkStateImageView = c41081jM;
    }

    public final void setTimeCircleView(C8I1 c8i1) {
        this.timeCircleView = c8i1;
    }

    public final void setTimeCountdownView(U2H u2h) {
        this.timeCountdownView = u2h;
    }

    @Override // X.TV0
    public void setVisibility(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        setVisibility(i);
    }

    public final void setWindow(InterfaceC75179Tex interfaceC75179Tex) {
        o.LJIIIZ(interfaceC75179Tex, "<set-?>");
        this.window = interfaceC75179Tex;
    }

    public void updateState(int i) {
        DataChannel dataChannel;
        java.util.Map map;
        this.currentState = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    ViewGroup viewGroup = this.mOnlineViewContainer;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                    ViewGroup viewGroup2 = this.mPrepareViewContainer;
                    if (viewGroup2 == null) {
                        return;
                    }
                    viewGroup2.setVisibility(8);
                    return;
                }
                ViewGroup viewGroup3 = this.mPrepareViewContainer;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                }
                ViewGroup viewGroup4 = this.mOnlineViewContainer;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(8);
                }
                this.mHandler.sendEmptyMessage(1);
                String LJJ = this.window.LJJ();
                if (LJJ == null || (dataChannel = this.mDataChannel) == null || (map = (java.util.Map) dataChannel.kv0(BD9.class)) == null) {
                    return;
                }
                map.put(LJJ, Boolean.FALSE);
                return;
            }
            ViewGroup viewGroup5 = this.mOnlineViewContainer;
            if (viewGroup5 != null) {
                viewGroup5.setVisibility(0);
            }
            ViewGroup viewGroup6 = this.mPrepareViewContainer;
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
            }
            this.hasLoadingFinished = true;
            CVT mLoadingView = getMLoadingView();
            if (mLoadingView == null) {
                return;
            }
            C87277YNd.LJJIIZ(mLoadingView);
            return;
        }
        ViewGroup viewGroup7 = this.mPrepareViewContainer;
        if (viewGroup7 != null) {
            viewGroup7.setVisibility(0);
        }
        ViewGroup viewGroup8 = this.mOnlineViewContainer;
        if (viewGroup8 != null) {
            viewGroup8.setVisibility(8);
        }
        getMLoadingView().setVisibility(0);
        this.mHandler.sendEmptyMessageDelayed(0, 1000L);
    }

    @Override // X.TV0
    public void updateTicket(long j) {
        String LJIILJJIL = b.LJIILJJIL(j);
        o.LJIIIIZZ(LJIILJJIL, "getDisplayCountForCoin(ticketCount)");
        Locale locale = Locale.ROOT;
        String LIZJ = OKG.LIZJ(locale, "ROOT", LJIILJJIL, locale, "this as java.lang.String).toUpperCase(locale)");
        TextView textView = this.mOnlineTicket;
        if (textView != null) {
            if (o.LJ(LIZJ, textView.getText().toString())) {
                return;
            }
            updateTicketCountWithAnimation(LIZJ);
            return;
        }
        o.LJIJI("mOnlineTicket");
        throw null;
    }

    public final void setWidth(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L19;
     */
    @Override // X.TV0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateTicket(java.lang.String r6, long r7) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = "MULTI_GUEST_DATA_HOLDER"
            r4 = 0
            if (r0 != 0) goto L88
        L9:
            java.lang.String r3 = "mOnlineTicketIcon"
            r2 = 2131235227(0x7f08119b, float:1.8086642E38)
            if (r6 == 0) goto L3d
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L20
            X.Tl5 r0 = X.C75559Tl5.LIZIZ
            java.lang.Object r0 = r0.LIZIZ(r1)
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder) r0
            if (r0 != 0) goto L85
        L20:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L6a
            java.lang.String r0 = r5.lastTicketIconUrl
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L6a
            boolean r0 = r5.ticketIconLoaded
            if (r0 == 0) goto L6a
            java.lang.String r1 = "BaseMultiGuestV3Mask"
            java.lang.String r0 = "same url and loaded successfully, so return"
            X.C0NB.LIZIZ(r1, r0)
        L39:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L44
        L3d:
            android.widget.ImageView r0 = r5.mOnlineTicketIcon
            if (r0 == 0) goto La3
            r0.setImageResource(r2)
        L44:
            java.lang.String r3 = com.google.gson.internal.b.LJIILJJIL(r7)
            java.lang.String r0 = "getDisplayCountForCoin(ticketCount)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = "ROOT"
            java.lang.String r0 = "this as java.lang.String).toUpperCase(locale)"
            java.lang.String r1 = X.OKG.LIZJ(r2, r1, r3, r2, r0)
            android.widget.TextView r0 = r5.mOnlineTicket
            if (r0 == 0) goto L9d
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L99
            return
        L6a:
            r5.lastTicketIconUrl = r6
            X.BQO r0 = X.C15650jR.LIZ()
            X.Uuy r1 = r0.setUrl(r6)
            r1.LJIIIIZZ = r2
            X.Thj r0 = new X.Thj
            r0.<init>(r5)
            r1.LJIIJJI = r0
            android.widget.ImageView r0 = r5.mOnlineTicketIcon
            if (r0 == 0) goto La7
            r1.LJIIJJI(r0)
            goto L39
        L85:
            r0.LJJIL = r6
            goto L20
        L88:
            X.Tl5 r0 = X.C75559Tl5.LIZIZ
            java.lang.Object r0 = r0.LIZIZ(r1)
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder) r0
            if (r0 == 0) goto L96
            java.lang.String r6 = r0.LJJIL
            goto L9
        L96:
            r6 = r4
            goto L9
        L99:
            r5.updateTicketCountWithAnimation(r1)
            return
        L9d:
            java.lang.String r0 = "mOnlineTicket"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r4
        La3:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        La7:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75349Thh.updateTicket(java.lang.String, long):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75349Thh(Context context, InterfaceC75179Tex window, String interactId, AbstractC74724TUi abstractC74724TUi, InterfaceC75353Thl interfaceC75353Thl, DataChannel dataChannel) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(window, "window");
        o.LJIIIZ(interactId, "interactId");
        this._$_findViewCache = new LinkedHashMap();
        this.window = window;
        this.interactId = interactId;
        this.mPresenter = abstractC74724TUi;
        this.mCallback = interfaceC75353Thl;
        this.mDataChannel = dataChannel;
        this.mHandler = new WeakHandler(this);
        this.currentState = 4;
        this.compositeDisposable = new C73318Sq2();
    }
}
