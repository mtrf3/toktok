package com.ss.android.ugc.aweme.feed.adapter;

import X.C0IF;
import X.C16880lQ;
import X.C207668Da;
import X.C222588oQ;
import X.C30018BqI;
import X.C31608Caq;
import X.C50420Jqa;
import X.C75792yF;
import X.C86188Xs8;
import X.C86358Xus;
import X.C86393XvR;
import X.C90193gN;
import X.InterfaceC92693kP;
import Y.ALAdapterS12S0200000_15;
import Y.AObjectS133S0100000_3;
import Y.IDHandlerS25S0100000_15;
import Y.IDLListenerS200S0100000_15;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.cell.FullFollowRootAssem;
import com.ss.android.ugc.aweme.feed.feedwidget.FeedLiveWindowWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes16.dex */
public class FollowLiveVideoViewHolder extends FullFeedVideoViewHolder {
    public static final /* synthetic */ int m = 0;
    public RoomStruct LLZZZIL;
    public boolean LLZZZZ;
    public boolean a;
    public FeedLiveWindowWidget b;
    public final View c;
    public View d;
    public Animator e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Room j;
    public InterfaceC92693kP k;
    public final IDHandlerS25S0100000_15 l;

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LJLJJLL() {
        return 3;
    }

    public final void LLLLL() {
        Object obj;
        RoomStruct roomStruct;
        boolean z;
        StreamUrl streamUrl;
        String str;
        this.LLZZZIL = null;
        Room room = this.j;
        if (room != null) {
            this.LLZZZIL = C31608Caq.LIZ(room);
        }
        Aweme aweme = this.LJLLL;
        boolean z2 = false;
        if (aweme != null && aweme.getAuthor() != null) {
            String str2 = this.LJLLL.getAuthor().roomData;
            if (str2 != null) {
                SlimRoom slimRoom = (SlimRoom) C75792yF.LIZ(str2, SlimRoom.class);
                if (slimRoom != null) {
                    roomStruct = new RoomStruct();
                    roomStruct.id = slimRoom.getId();
                    roomStruct.ownerUserId = slimRoom.getOwnerUserId();
                    StreamUrlStruct LIZIZ = C31608Caq.LIZIZ(slimRoom.getStreamUrl(), slimRoom.getMultiStreamDefaultQualitySdkKey());
                    if (LIZIZ != null) {
                        if (slimRoom.multiStreamScene == 1 && (streamUrl = slimRoom.multiStreamUrl) != null) {
                            LiveCoreSDKData liveCoreSDKData = streamUrl.liveCoreSDKData;
                            if (liveCoreSDKData != null && liveCoreSDKData.getDefaultQuality() != null) {
                                str = slimRoom.multiStreamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
                            } else {
                                str = null;
                            }
                            roomStruct.multiStreamUrl = C31608Caq.LIZIZ(slimRoom.multiStreamUrl, str);
                            roomStruct.multiStreamId = slimRoom.multiStreamId;
                            roomStruct.multiStreamIdStr = slimRoom.multiStreamIdStr;
                            roomStruct.multiStreamScene = slimRoom.multiStreamScene;
                        }
                        roomStruct.stream_url = LIZIZ;
                        roomStruct.isThirdParty = slimRoom.isThirdParty;
                        roomStruct.isScreenshot = slimRoom.isScreenshot;
                        if (slimRoom.getStreamType() == LiveMode.AUDIO) {
                            z = true;
                        } else {
                            z = false;
                        }
                        roomStruct.liveTypeAudio = z;
                        if (slimRoom.getStreamType() == LiveMode.LIVE_VOICE) {
                            roomStruct.liveRoomMode = 7;
                        }
                        this.LLZZZIL = roomStruct;
                    }
                }
                roomStruct = null;
                this.LLZZZIL = roomStruct;
            }
            if (this.LLZZZIL == null) {
                long j = this.LJLLL.getAuthor().roomId;
                if (!this.i && j > 0) {
                    this.i = true;
                    LiveOuterService.LJJJLL().LJJIJIL().LJL(j, new C30018BqI(this));
                }
            }
        }
        if (this.d.getVisibility() == 0) {
            this.d.setVisibility(4);
        }
        if (this.LLZZZZ) {
            User author = this.LJLLL.getAuthor();
            if (author != null) {
                long j2 = author.roomId;
                if (j2 > 0 && (obj = this.LLLILZ.get("key_open_live_aweme_list", null)) != null && (obj instanceof Set)) {
                    z2 = ((Set) obj).contains(Long.valueOf(j2));
                }
            }
            this.g = z2;
        }
        LLLLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void LJLJJL() {
        if (this.LJLZ != null) {
            return;
        }
        this.LJLZ = new FullFollowRootAssem(this.LLLLZLLIL, new AObjectS133S0100000_3(this, 0), this.LLZLL);
    }

    public final void LLLLLILLIL() {
        long liveWindowShowTime = this.LJLLL.getLiveWindowShowTime() * 1000;
        if (liveWindowShowTime <= 0) {
            return;
        }
        if (liveWindowShowTime < 2000) {
            liveWindowShowTime = 2000;
        }
        IDHandlerS25S0100000_15 iDHandlerS25S0100000_15 = this.l;
        iDHandlerS25S0100000_15.sendMessageDelayed(iDHandlerS25S0100000_15.obtainMessage(100), liveWindowShowTime);
    }

    public final boolean LLLLLLLZIL() {
        RoomStruct roomStruct = this.LLZZZIL;
        if (roomStruct != null && roomStruct.isPullUrlValid()) {
            return true;
        }
        return false;
    }

    public final void LLLLLZ() {
        C86188Xs8 c86188Xs8;
        if (!this.LLZZZZ || !this.a || this.g) {
            return;
        }
        FeedLiveWindowWidget feedLiveWindowWidget = this.b;
        if ((feedLiveWindowWidget != null && ((c86188Xs8 = feedLiveWindowWidget.LJLJLLL) == null || c86188Xs8.LJLJL == null)) || !LLLLLLLZIL() || this.f) {
            return;
        }
        this.f = true;
        View view = this.d;
        if (view == null) {
            return;
        }
        if (view.getVisibility() == 8) {
            this.d.setVisibility(0);
            this.d.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS200S0100000_15(this, 1));
        } else {
            this.d.setVisibility(0);
            View view2 = this.d;
            view2.setTranslationX(LLLLLLL(view2));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJZ() {
        super.LJZ();
        LLLLL();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LL() {
        super.LL();
        DataCenter dataCenter = this.LLLILZ;
        dataCenter.iv0("dismiss_live_window", this, false);
        dataCenter.iv0("live_window_clicked", this, false);
        this.b = new FeedLiveWindowWidget();
        C0IF.LIZIZ(this.LLLLIL, null, R.id.arz, R.id.nex);
        this.LLLILZJ.vl(R.id.fjg, this.b);
        this.d = this.b.LJLL;
    }

    public final void LLLLLLZ() {
        C86393XvR LJJIJIL;
        if (!LLLLLLLZIL() || (LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL()) == null) {
            return;
        }
        InterfaceC92693kP interfaceC92693kP = this.k;
        if (interfaceC92693kP != null) {
            if (!interfaceC92693kP.isDisposed()) {
                this.k.dispose();
            }
            this.k = null;
        }
        RoomStruct roomStruct = this.LLZZZIL;
        if (roomStruct == null) {
            return;
        }
        this.k = LJJIJIL.LJJIJL("", "", roomStruct.id, new C86358Xus(this));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        this.l.removeMessages(100);
        Animator animator = this.e;
        if (animator != null) {
            animator.cancel();
            this.e = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onPause() {
        super.onPause();
        this.f = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onResume() {
        super.onResume();
        LLLLLLZ();
        if (this.h) {
            LLLLLILLIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void unBind() {
        super.unBind();
        this.LLZZZZ = false;
        this.j = null;
        this.i = false;
        Animator animator = this.e;
        if (animator != null) {
            animator.cancel();
            this.e = null;
        }
        InterfaceC92693kP interfaceC92693kP = this.k;
        if (interfaceC92693kP != null) {
            if (!interfaceC92693kP.isDisposed()) {
                this.k.dispose();
            }
            this.k = null;
        }
        View view = this.d;
        if (view != null && view.getVisibility() == 0) {
            this.d.setVisibility(4);
            this.d.setTranslationX(0.0f);
        }
        if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
            this.c.setTranslationX(0.0f);
        }
    }

    public FollowLiveVideoViewHolder(C222588oQ c222588oQ) {
        super(c222588oQ);
        this.l = new IDHandlerS25S0100000_15(this, C16880lQ.LLJJJJ(), 0);
        this.c = c222588oQ.LIZ.findViewById(R.id.adq);
    }

    public static float LLLLLLL(View view) {
        if (view.getContext() != null && C90193gN.LIZIZ(view.getContext())) {
            return view.getContext().getResources().getDisplayMetrics().widthPixels;
        }
        float f = -view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return f;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return (f - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: LLJJ */
    public final void onChanged(C207668Da c207668Da) {
        char c;
        String aid;
        super.onChanged(c207668Da);
        if (c207668Da != null) {
            String str = c207668Da.LIZ;
            str.getClass();
            int hashCode = str.hashCode();
            if (hashCode != -906007925) {
                if (hashCode != -162745511) {
                    if (hashCode != 1471092846 || !str.equals("dismiss_live_window")) {
                        return;
                    }
                    LLLLLLLLLL(true);
                    return;
                }
                if (!str.equals("feed_internal_event")) {
                    return;
                } else {
                    c = 1;
                }
            } else if (!str.equals("live_window_clicked")) {
                return;
            } else {
                c = 0;
            }
            Object obj = null;
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        return;
                    }
                    LLLLLLLLLL(true);
                    return;
                }
                Object obj2 = c207668Da.LIZIZ;
                if (obj2 != null) {
                    obj = obj2;
                }
                C50420Jqa c50420Jqa = (C50420Jqa) obj;
                if (c50420Jqa == null || c50420Jqa.LJLIL != 19) {
                    return;
                }
                LLLLLLLLLL(false);
                this.h = true;
                return;
            }
            View view = this.d;
            if (view != null && view.getVisibility() == 0) {
                LLLLLLLLLL(true);
            }
            Aweme aweme = this.LJLLL;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                return;
            }
            this.g = true;
            Object obj3 = this.LLLILZ.get("key_open_live_aweme_list", null);
            if (obj3 == null) {
                HashSet hashSet = new HashSet();
                hashSet.add(aid);
                this.LLLILZ.jv0(hashSet, "key_open_live_aweme_list");
            } else {
                if (!(obj3 instanceof Set)) {
                    return;
                }
                ((Set) obj3).add(aid);
            }
        }
    }

    public final void LLLLLLLLLL(boolean z) {
        View view = this.d;
        if (view == null) {
            return;
        }
        if (z) {
            View view2 = this.c;
            Animator animator = this.e;
            if (animator != null) {
                animator.cancel();
                this.e = null;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.e = animatorSet;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationX", LLLLLLL(view2), 0.0f);
            ofFloat.setDuration(300L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", 0.0f, LLLLLLL(view));
            ofFloat2.setDuration(300L);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new ALAdapterS12S0200000_15(view, view2, 3));
            animatorSet.start();
            return;
        }
        view.setVisibility(8);
        this.c.setVisibility(0);
        this.c.setTranslationX(0.0f);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void l8(int i) {
        super.l8(i);
        this.a = true;
        LLLLLLZ();
        if (LLLLLLLZIL() && !this.g) {
            LLLLLILLIL();
        } else {
            LLLLLLLLLL(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C207668Da) obj);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void t7(boolean z) {
        super.t7(z);
        this.a = false;
        LLLLLLLLLL(false);
        this.f = false;
        this.h = false;
        this.l.removeMessages(100);
        Animator animator = this.e;
        if (animator != null) {
            animator.cancel();
            this.e = null;
        }
    }
}
