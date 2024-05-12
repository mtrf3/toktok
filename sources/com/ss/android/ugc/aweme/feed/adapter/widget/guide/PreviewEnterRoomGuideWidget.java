package com.ss.android.ugc.aweme.feed.adapter.widget.guide;

import X.AV1;
import X.B9K;
import X.C018905p;
import X.C15380j0;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C29306Beo;
import X.C29701Eo;
import X.C47121t6;
import X.C53200KuK;
import X.C53254KvC;
import X.C53887LCx;
import X.C54740Le4;
import X.C56331M8x;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6DX;
import X.C72433Sbl;
import X.C75792yF;
import X.C76800UCe;
import X.C78685UuP;
import X.C78765Uvh;
import X.C79045V0n;
import X.C81185Vtd;
import X.C86330XuQ;
import X.C86343Xud;
import X.FMX;
import X.OU0;
import X.QZZ;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import X.XJ8;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS83S0100000_15;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PreviewEnterRoomGuideWidget extends LiveWatchPreviewWidget {
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
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

    public PreviewEnterRoomGuideWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(LivePreviewGuideEnterVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 330);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLILLLLZI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 331), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS165S0100000_15(LIZ3, 332), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 335));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 323));
        this.LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 329));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 325));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 326));
        this.LJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 322));
        this.LJLLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 333));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 334));
        this.LJLLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 328));
        this.LJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 336));
        this.LJLLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 337));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 327));
        this.LJLZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 324));
        this.LJZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 320));
        this.LJZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 321));
        this.LJZL = C221108m2.LIZIZ(C86330XuQ.LJLIL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final FeedLiveViewHolderVM LJZ() {
        return (FeedLiveViewHolderVM) this.LJLJI.getValue();
    }

    public final LivePreviewGuideEnterVM LJZI() {
        return (LivePreviewGuideEnterVM) this.LJLILLLLZI.getValue();
    }

    public final C72433Sbl LJZL() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-userAvatarView>(...)");
        return (C72433Sbl) value;
    }

    public final C47121t6 LL() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-waveTv>(...)");
        return (C47121t6) value;
    }

    public final boolean LLF() {
        return ((Boolean) this.LJZL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (LLF()) {
            return R.layout.bqd;
        }
        return R.layout.bqc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        MutableLiveData<Boolean> mutableLiveData;
        super.hide();
        if (LLF()) {
            Object value = this.LJLLLLLL.getValue();
            o.LJIIIIZZ(value, "<get-lavLivePlaying>(...)");
            ((C29701Eo) value).pauseAnimation();
        }
        LivePreviewGuideEnterVM LJZI = LJZI();
        if (LJZI != null && (mutableLiveData = LJZI.LJLJJL) != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        if (C53200KuK.LIZ()) {
            ((C53887LCx) this.LJZI.getValue()).LJ();
            ((C53887LCx) this.LJZI.getValue()).LJII();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        MutableLiveData<Boolean> mutableLiveData;
        int i;
        int i2;
        long j;
        long j2;
        C86343Xud hv0;
        String str;
        Long l;
        String str2;
        Long l2;
        String str3;
        LiveRoomStruct liveRoomStruct;
        User user;
        User user2;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        String str4;
        LiveRoomStruct liveRoomStruct4;
        LiveRoomStruct liveRoomStruct5;
        UrlModel urlModel;
        SlimRoom.LinkMic linkMic;
        String LIZJ;
        List<com.bytedance.android.live.base.model.user.User> list;
        String str5 = null;
        if (!isShowing()) {
            if (LLF()) {
                Object value = this.LJLJLLL.getValue();
                o.LJIIIIZZ(value, "<get-enterRoomTv>(...)");
                ((TextView) value).setText(C15380j0.LJIILJJIL(R.string.lz7));
            } else {
                Object value2 = this.LJLJLLL.getValue();
                o.LJIIIIZZ(value2, "<get-enterRoomTv>(...)");
                ((TextView) value2).setText(C15380j0.LJIILJJIL(R.string.m_a));
            }
            C81185Vtd.LIZLLL();
            C81185Vtd.LIZIZ();
            if (LLF()) {
                Context context = getContext();
                o.LJIIIIZZ(context, "getContext()");
                Integer LJI = C79045V0n.LJI(R.attr.d6, context);
                if (LJI != null) {
                    int intValue = LJI.intValue();
                    Object value3 = this.LJLJJLL.getValue();
                    o.LJIIIIZZ(value3, "<get-bgCover>(...)");
                    ((View) value3).setBackgroundColor(intValue);
                }
            } else {
                Object value4 = this.LJLJJLL.getValue();
                o.LJIIIIZZ(value4, "<get-bgCover>(...)");
                ((View) value4).setBackgroundColor(C15380j0.LIZIZ(R.color.a95));
            }
            Object value5 = this.LJLJJL.getValue();
            o.LJIIIIZZ(value5, "<get-userInfoContainer>(...)");
            boolean z = true;
            C29306Beo.LJJLIIIJJI((View) value5, true);
            Object value6 = this.LJLJJL.getValue();
            o.LJIIIIZZ(value6, "<get-userInfoContainer>(...)");
            ViewGroup.LayoutParams layoutParams = ((View) value6).getLayoutParams();
            if (!LLF()) {
                int LIZIZ = C81185Vtd.LIZIZ() / 5;
                if (layoutParams instanceof C018905p) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = LIZIZ + ((int) B9K.LIZ(getContext(), 48.0f));
                }
            } else {
                double LIZIZ2 = C81185Vtd.LIZIZ() * 0.32d;
                if (layoutParams instanceof C018905p) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) LIZIZ2;
                }
                if (C53254KvC.LIZ()) {
                    LivePreviewGuideEnterVM LJZI = LJZI();
                    if (LJZI != null) {
                        i2 = LJZI.LJLJJLL + LJZI.LJLJL;
                    } else {
                        i2 = 0;
                    }
                    Object value7 = this.LJLZ.getValue();
                    o.LJIIIIZZ(value7, "<get-bottomBtnContainer>(...)");
                    C29306Beo.LJJJJLI(i2, (View) value7);
                } else {
                    Object value8 = this.LJLZ.getValue();
                    o.LJIIIIZZ(value8, "<get-bottomBtnContainer>(...)");
                    View view = (View) value8;
                    LivePreviewGuideEnterVM LJZI2 = LJZI();
                    if (LJZI2 != null) {
                        i = LJZI2.LJLJJLL;
                    } else {
                        i = 0;
                    }
                    C29306Beo.LJJJJLI(i, view);
                }
            }
            Object value9 = this.LJLJL.getValue();
            o.LJIIIIZZ(value9, "<get-liveIconTag>(...)");
            C29306Beo.LJJLIIIJJI((View) value9, true);
            if (!LLF() && (LJZL().getLayoutParams() instanceof C018905p)) {
                ViewGroup.LayoutParams layoutParams2 = LJZL().getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = C15380j0.LIZ(17.0f);
            }
            C86343Xud LJLZ = LJLZ();
            if (LJLZ != null && (liveRoomStruct5 = LJLZ.LIZIZ) != null) {
                LJZL().setBackground(C15380j0.LJI(R.drawable.cul));
                C72433Sbl LJZL = LJZL();
                User user3 = liveRoomStruct5.owner;
                if (user3 != null) {
                    urlModel = user3.getAvatarThumb();
                } else {
                    urlModel = null;
                }
                C78765Uvh.LJFF(LJZL, urlModel);
                ((C53887LCx) this.LJZI.getValue()).LJIIIIZZ(null, liveRoomStruct5.getClass());
                ((C53887LCx) this.LJZI.getValue()).LIZ();
                try {
                    linkMic = (SlimRoom.LinkMic) C75792yF.LIZ(liveRoomStruct5.linkMic, SlimRoom.LinkMic.class);
                } catch (Exception unused) {
                    linkMic = null;
                }
                User user4 = liveRoomStruct5.owner;
                if (user4 == null || TextUtils.isEmpty(user4.getUniqueId())) {
                    LIZJ = AV1.LIZJ(liveRoomStruct5.owner, true);
                } else if (C6DX.LIZ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('@');
                    User user5 = liveRoomStruct5.owner;
                    o.LJIIIIZZ(user5, "liveRoomStruct.owner");
                    LIZ.append(C56331M8x.LIZIZ(user5, false, false));
                    LIZJ = X1D.LIZIZ(LIZ);
                } else {
                    User user6 = liveRoomStruct5.owner;
                    o.LJIIIIZZ(user6, "liveRoomStruct.owner");
                    LIZJ = C56331M8x.LIZIZ(user6, false, false);
                }
                if (linkMic != null && (list = linkMic.followedList) != null && list.size() > 0) {
                    String LIZJ2 = C56331M8x.LIZJ(((com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 0)).getNickName(), ((com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 0)).getUsername(), false, false);
                    if (C78685UuP.LJJJZ(LIZJ2)) {
                        if (C6DX.LIZ()) {
                            LIZJ = QZZ.LIZIZ('@', LIZJ2);
                        } else {
                            LIZJ = LIZJ2;
                        }
                    }
                }
                Object value10 = this.LJLLL.getValue();
                o.LJIIIIZZ(value10, "<get-userNameTv>(...)");
                ((TextView) value10).setText(LIZJ);
            }
            Object value11 = this.LJLLI.getValue();
            o.LJIIIIZZ(value11, "<get-strongBackToPreviewView>(...)");
            C29306Beo.LJJLIIIJJI((View) value11, true);
            if (LLF()) {
                Object value12 = this.LJLLI.getValue();
                o.LJIIIIZZ(value12, "<get-strongBackToPreviewView>(...)");
                ((TextView) value12).setText(C15380j0.LJIILJJIL(R.string.lz6));
                C86343Xud LJLZ2 = LJLZ();
                if (LJLZ2 != null && (liveRoomStruct4 = LJLZ2.LIZIZ) != null) {
                    str4 = liveRoomStruct4.title;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    LL().setText(C15380j0.LJIILJJIL(R.string.lz5));
                } else {
                    LL().setText(str4);
                }
            } else {
                Object value13 = this.LJLLI.getValue();
                o.LJIIIIZZ(value13, "<get-strongBackToPreviewView>(...)");
                ((TextView) value13).setText(C15380j0.LJIILJJIL(R.string.m_9));
                LL().setText(C15380j0.LJIILJJIL(R.string.m_b));
            }
            C86343Xud LJLZ3 = LJLZ();
            if (LJLZ3 != null && (liveRoomStruct3 = LJLZ3.LIZIZ) != null) {
                j = liveRoomStruct3.maxPreviewTime;
            } else {
                j = -1;
            }
            C86343Xud LJLZ4 = LJLZ();
            if (LJLZ4 != null && (liveRoomStruct2 = LJLZ4.LIZIZ) != null) {
                j2 = liveRoomStruct2.allowPreviewTime;
            } else {
                j2 = -1;
            }
            long j3 = 0;
            if (j2 <= 0) {
                z = false;
            }
            if (j > 0 && z) {
                LL().setText(C15380j0.LJIILJJIL(R.string.npz));
            }
            Object value14 = this.LJLLJ.getValue();
            o.LJIIIIZZ(value14, "<get-liveCircleView>(...)");
            ((View) value14).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 8)));
            Object value15 = this.LJLL.getValue();
            o.LJIIIIZZ(value15, "<get-backToPreviewContainer>(...)");
            C16880lQ.LJIILJJIL((FrameLayout) value15, new ACListenerS35S0100000_15(this, 9));
            Object value16 = this.LJLJLJ.getValue();
            o.LJIIIIZZ(value16, "<get-enterRoomBtnContainer>(...)");
            C16880lQ.LJIIL((ViewGroup) value16, new ACListenerS35S0100000_15(this, 10));
            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 11), this.contentView);
            LivePreviewGuideEnterVM LJZI3 = LJZI();
            if (LJZI3 != null && (hv0 = LJZI3.hv0()) != null) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from_merge", hv0.LIZJ);
                c188727au.LJIIIZ("action_type", "click");
                LiveRoomStruct liveRoomStruct6 = hv0.LIZIZ;
                if (liveRoomStruct6 != null && (user2 = liveRoomStruct6.owner) != null) {
                    str = user2.getUid();
                } else {
                    str = null;
                }
                c188727au.LJIIIZ("anchor_id", str);
                LiveRoomStruct liveRoomStruct7 = hv0.LIZIZ;
                if (liveRoomStruct7 != null) {
                    l = Long.valueOf(liveRoomStruct7.id);
                } else {
                    l = null;
                }
                c188727au.LJFF(l, "room_id");
                Aweme aweme = hv0.LIZ;
                if (aweme != null) {
                    str5 = aweme.getRequestId();
                }
                c188727au.LJIIIZ("request_id", str5);
                c188727au.LJIIIZ("enter_method", "live_cell");
                c188727au.LIZLLL(C54740Le4.LIZ(hv0.LIZIZ), "follow_status");
                FMX.LJIIL("livesdk_fyp_guidence_page_show", c188727au.LIZ);
                LiveRoomStruct liveRoomStruct8 = hv0.LIZIZ;
                if (liveRoomStruct8 != null && liveRoomStruct8.allowPreviewTime > 0) {
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("enter_from_merge", hv0.LIZJ);
                    LiveRoomStruct liveRoomStruct9 = hv0.LIZIZ;
                    if (liveRoomStruct9 != null && (user = liveRoomStruct9.owner) != null) {
                        str2 = user.getUid();
                    } else {
                        str2 = null;
                    }
                    c188727au2.LJIIIZ("anchor_id", str2);
                    LiveRoomStruct liveRoomStruct10 = hv0.LIZIZ;
                    if (liveRoomStruct10 != null) {
                        l2 = Long.valueOf(liveRoomStruct10.id);
                    } else {
                        l2 = null;
                    }
                    c188727au2.LJFF(l2, "room_id");
                    Aweme aweme2 = hv0.LIZ;
                    if (aweme2 != null) {
                        str3 = aweme2.getRequestId();
                    } else {
                        str3 = null;
                    }
                    c188727au2.LJIIIZ("request_id", str3);
                    c188727au2.LJIIIZ("enter_method", "live_cell");
                    c188727au2.LJIIIZ("action_type", "click");
                    C86343Xud hv02 = LJZI3.hv0();
                    if (hv02 != null && (liveRoomStruct = hv02.LIZIZ) != null) {
                        j3 = liveRoomStruct.maxPreviewTime;
                    }
                    c188727au2.LJ(j3 / 1000, "maximum_preview_duration");
                    FMX.LJIIL("livesdk_sub_only_live_enter_room_boot_show", c188727au2.LIZ);
                }
            }
            if (LLF()) {
                Object value17 = this.LJLLLLLL.getValue();
                o.LJIIIIZZ(value17, "<get-lavLivePlaying>(...)");
                ((C29701Eo) value17).resumeAnimation();
                Object value18 = this.LJZ.getValue();
                o.LJIIIIZZ(value18, "<get-animationContainer>(...)");
                ((View) value18).setAlpha(0.0f);
                Object value19 = this.LJZ.getValue();
                o.LJIIIIZZ(value19, "<get-animationContainer>(...)");
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(value19, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(600L);
                ofFloat.start();
            } else {
                this.contentView.setAlpha(0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.contentView, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(600L);
                ofFloat2.start();
            }
        }
        super.show();
        LivePreviewGuideEnterVM LJZI4 = LJZI();
        if (LJZI4 == null || (mutableLiveData = LJZI4.LJLJJL) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.TRUE);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3;
        NextLiveData<C76800UCe> nextLiveData;
        MutableLiveData<OU0> mutableLiveData4;
        NextLiveData<Boolean> nextLiveData2;
        FeedLiveViewHolderVM LJZ = LJZ();
        if (LJZ != null && (nextLiveData2 = LJZ.LJLLLL) != null) {
            nextLiveData2.observe(this, new AObserverS83S0100000_15(this, 40));
        }
        FeedLiveViewHolderVM LJZ2 = LJZ();
        if (LJZ2 != null && (mutableLiveData4 = LJZ2.LJZL) != null) {
            mutableLiveData4.observe(this, new AObserverS83S0100000_15(this, 41));
        }
        FeedLiveViewHolderVM LJZ3 = LJZ();
        if (LJZ3 != null && (nextLiveData = LJZ3.LJLLLLLL) != null) {
            nextLiveData.observe(this, new AObserverS83S0100000_15(this, 42));
        }
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData3 = viewHolderStatusVM.LJLJLJ) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 43));
        }
        ViewHolderStatusVM viewHolderStatusVM2 = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM2 != null && (mutableLiveData2 = viewHolderStatusVM2.LJLJJL) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 44));
        }
        ViewHolderStatusVM viewHolderStatusVM3 = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM3 != null && (mutableLiveData = viewHolderStatusVM3.LJLJJI) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 45));
        }
    }
}
