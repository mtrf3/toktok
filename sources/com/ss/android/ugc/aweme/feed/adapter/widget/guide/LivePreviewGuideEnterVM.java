package com.ss.android.ugc.aweme.feed.adapter.widget.guide;

import X.AbstractC73672Svk;
import X.C012403c;
import X.C188727au;
import X.C221108m2;
import X.C29306Beo;
import X.C51029K0z;
import X.C54740Le4;
import X.C59406NTe;
import X.C62822Ol8;
import X.C73411SrX;
import X.C73969T1h;
import X.C77699UeV;
import X.C78963Uyt;
import X.C86332XuS;
import X.C86334XuU;
import X.C86337XuX;
import X.C86338XuY;
import X.C86343Xud;
import X.FMX;
import X.InterfaceC92693kP;
import X.ORZ;
import X.T16;
import Y.AfS67S0100000_15;
import Y.AfS9S0100100_15;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.ss.android.ugc.aweme.ab.PreviewGuideData;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import defpackage.e1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LivePreviewGuideEnterVM extends LiveWidgetViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 319));
    public final MutableLiveData<Boolean> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJL = new MutableLiveData<>();
    public int LJLJJLL;
    public int LJLJL;
    public C73411SrX LJLJLJ;
    public InterfaceC92693kP LJLJLLL;
    public C73411SrX LJLL;
    public InterfaceC92693kP LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;

    public final C86343Xud hv0() {
        return (C86343Xud) this.LJLIL.getValue();
    }

    public final void mv0() {
        C73411SrX c73411SrX = this.LJLJLJ;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            c73411SrX.dispose();
            this.LJLJLJ = null;
            this.LJLLILLLL = false;
        }
        InterfaceC92693kP interfaceC92693kP = this.LJLJLLL;
        if (interfaceC92693kP != null && (!interfaceC92693kP.isDisposed())) {
            interfaceC92693kP.dispose();
        }
    }

    public final void nv0() {
        C73411SrX c73411SrX = this.LJLL;
        if (c73411SrX != null && (!c73411SrX.isDisposed())) {
            c73411SrX.dispose();
            lv0("exit");
        }
        this.LJLL = null;
        InterfaceC92693kP interfaceC92693kP = this.LJLLI;
        if (interfaceC92693kP != null && (!interfaceC92693kP.isDisposed())) {
            interfaceC92693kP.dispose();
        }
        this.LJLLI = null;
    }

    public final void ov0() {
        C73411SrX c73411SrX = this.LJLJLJ;
        if (c73411SrX != null && (!c73411SrX.isDisposed())) {
            c73411SrX.dispose();
        }
        this.LJLJLJ = null;
        InterfaceC92693kP interfaceC92693kP = this.LJLJLLL;
        if (interfaceC92693kP != null && (!interfaceC92693kP.isDisposed())) {
            interfaceC92693kP.dispose();
        }
        this.LJLJLLL = null;
        C73411SrX c73411SrX2 = this.LJLL;
        if (c73411SrX2 != null && (!c73411SrX2.isDisposed())) {
            c73411SrX2.dispose();
        }
        this.LJLL = null;
        InterfaceC92693kP interfaceC92693kP2 = this.LJLLI;
        if (interfaceC92693kP2 != null && (!interfaceC92693kP2.isDisposed())) {
            interfaceC92693kP2.dispose();
        }
        this.LJLLI = null;
        this.LJLLILLLL = false;
        this.LJLLJ = false;
        this.LJLLL = false;
        this.LJLLLL = false;
    }

    public final void pv0() {
        boolean z;
        long j;
        if (this.LJLLILLLL || this.LJLLJ) {
            return;
        }
        this.LJLLILLLL = true;
        nv0();
        C86343Xud hv0 = hv0();
        if (hv0 != null && C78963Uyt.LJIIIIZZ(hv0)) {
            z = true;
        } else {
            z = false;
        }
        if (z && !e1.LIZ(31744, "live_preview_page_enable_auto_entering_guide", true, false)) {
            return;
        }
        C86343Xud hv02 = hv0();
        if (hv02 != null && C78963Uyt.LJII(hv02)) {
            C86332XuS.LIZ.getClass();
            if (((PreviewGuideData) C86332XuS.LIZJ.getValue()).style <= 0) {
                return;
            }
        }
        C86343Xud hv03 = hv0();
        if (hv03 != null && C78963Uyt.LJIIIIZZ(hv03)) {
            j = C012403c.LIZIZ(31744, 10000L, "live_preview_page_auto_entering_request_delay");
        } else {
            C86332XuS.LIZ.getClass();
            j = ((PreviewGuideData) C86332XuS.LIZJ.getValue()).guideShowTime;
        }
        this.LJLJLJ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS9S0100100_15(this, j, 0), C86337XuX.LJLIL);
    }

    public final void qv0() {
        if (this.LJLL != null) {
            return;
        }
        this.LJLL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(3000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS67S0100000_15(this, 37), C86334XuU.LJLIL, C86338XuY.LIZ);
    }

    public final boolean gv0(boolean z) {
        boolean z2;
        LiveRoomStruct liveRoomStruct;
        long j;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        Aweme aweme;
        C86343Xud hv0 = hv0();
        if (hv0 != null && C78963Uyt.LJII(hv0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        MaskLayer maskLayer = null;
        Aweme aweme2 = null;
        maskLayer = null;
        if (z2) {
            C86343Xud hv02 = hv0();
            if (hv02 != null && (aweme = hv02.LIZ) != null && aweme.isAd()) {
                return true;
            }
            C86343Xud hv03 = hv0();
            if (hv03 != null) {
                aweme2 = hv03.LIZ;
            }
            if (C59406NTe.LJIILIIL(aweme2)) {
                return true;
            }
            C86343Xud hv04 = hv0();
            if (hv04 != null && (liveRoomStruct4 = hv04.LIZIZ) != null && liveRoomStruct4.hasCommerceGoods) {
                return true;
            }
        } else {
            C86343Xud hv05 = hv0();
            if (hv05 != null && C78963Uyt.LJIIIIZZ(hv05)) {
                C86343Xud hv06 = hv0();
                if (hv06 != null && (liveRoomStruct = hv06.LIZIZ) != null) {
                    maskLayer = liveRoomStruct.maskLayer;
                }
                if (C51029K0z.LJJIJL(maskLayer, false)) {
                    return true;
                }
                FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
                if (LJIIZILJ != null && LJIIZILJ.LIZIZ()) {
                    return true;
                }
            }
            return true;
        }
        C86343Xud hv07 = hv0();
        if (hv07 != null && (liveRoomStruct3 = hv07.LIZIZ) != null && liveRoomStruct3.liveSubOnly == 1 && liveRoomStruct3.maxPreviewTime > 60000) {
            return true;
        }
        C86343Xud hv08 = hv0();
        if ((hv08 != null && !hv08.LJ) || this.LJLLL || this.LJLLLL) {
            return true;
        }
        if (!z) {
            C86343Xud hv09 = hv0();
            if (hv09 != null && (liveRoomStruct2 = hv09.LIZIZ) != null) {
                j = liveRoomStruct2.id;
            } else {
                j = 0;
            }
            if (C77699UeV.LIZ.get(Long.valueOf(j)) != null) {
                return true;
            }
        }
        return false;
    }

    public final void jv0(String str) {
        Boolean bool;
        String str2;
        User user;
        String str3;
        String str4;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> subTags;
        FeedRoomTag feedRoomTag;
        User user2;
        C86343Xud hv0 = hv0();
        if (hv0 != null) {
            C86343Xud hv02 = hv0();
            Long l = null;
            if (hv02 != null) {
                bool = Boolean.valueOf(C78963Uyt.LJIIIIZZ(hv02));
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from_merge", hv0.LIZJ);
                c188727au.LJIIIZ("action_type", "click");
                LiveRoomStruct liveRoomStruct = hv0.LIZIZ;
                if (liveRoomStruct != null && (user2 = liveRoomStruct.owner) != null) {
                    str3 = user2.getUid();
                } else {
                    str3 = null;
                }
                c188727au.LJIIIZ("anchor_id", str3);
                LiveRoomStruct liveRoomStruct2 = hv0.LIZIZ;
                if (liveRoomStruct2 != null) {
                    l = Long.valueOf(liveRoomStruct2.id);
                }
                c188727au.LJFF(l, "room_id");
                c188727au.LJIIIZ("enter_method", "live_cell");
                c188727au.LIZLLL(C54740Le4.LIZ(hv0.LIZIZ), "follow_status");
                c188727au.LIZLLL(hv0.LJI, "room_position");
                LiveRoomStruct liveRoomStruct3 = hv0.LIZIZ;
                if (liveRoomStruct3 == null || (feedRoomTagList = liveRoomStruct3.feedRoomTagList) == null || (subTags = feedRoomTagList.getSubTags()) == null || (feedRoomTag = (FeedRoomTag) ORZ.LJLLLL(subTags)) == null || (str4 = feedRoomTag.getContent()) == null) {
                    str4 = "";
                }
                c188727au.LJIIIZ("label", str4);
                c188727au.LJIIIZ("avoid_reason", str);
                FMX.LJIIL("livesdk_auto_guidance_page_avoid", c188727au.LIZ);
                return;
            }
            C188727au c188727au2 = new C188727au();
            LiveRoomStruct liveRoomStruct4 = hv0.LIZIZ;
            if (liveRoomStruct4 != null && (user = liveRoomStruct4.owner) != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            c188727au2.LJIIIZ("anchor_id", str2);
            LiveRoomStruct liveRoomStruct5 = hv0.LIZIZ;
            if (liveRoomStruct5 != null) {
                l = Long.valueOf(liveRoomStruct5.id);
            }
            c188727au2.LJFF(l, "room_id");
            c188727au2.LIZLLL(C54740Le4.LIZ(hv0.LIZIZ), "follow_status");
            c188727au2.LJIIIZ("avoid_reason", str);
            FMX.LJIIL("livesdk_fyp_guidence_page_avoid", c188727au2.LIZ);
        }
    }

    public final void kv0(String str) {
        String str2;
        Long l;
        String str3;
        String str4;
        Long l2;
        String str5;
        long j;
        LiveRoomStruct liveRoomStruct;
        User user;
        User user2;
        C86343Xud hv0 = hv0();
        if (hv0 != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from_merge", hv0.LIZJ);
            c188727au.LJIIIZ("action_type", "click");
            LiveRoomStruct liveRoomStruct2 = hv0.LIZIZ;
            String str6 = null;
            if (liveRoomStruct2 != null && (user2 = liveRoomStruct2.owner) != null) {
                str2 = user2.getUid();
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("anchor_id", str2);
            LiveRoomStruct liveRoomStruct3 = hv0.LIZIZ;
            if (liveRoomStruct3 != null) {
                l = Long.valueOf(liveRoomStruct3.id);
            } else {
                l = null;
            }
            c188727au.LJFF(l, "room_id");
            Aweme aweme = hv0.LIZ;
            if (aweme != null) {
                str3 = aweme.getRequestId();
            } else {
                str3 = null;
            }
            c188727au.LJIIIZ("request_id", str3);
            c188727au.LJIIIZ("enter_method", "live_cell");
            c188727au.LIZLLL(C54740Le4.LIZ(hv0.LIZIZ), "follow_status");
            c188727au.LJIIIZ("click_position", str);
            FMX.LJIIL("livesdk_fyp_guidence_page_click", c188727au.LIZ);
            if (o.LJ(str, "enter") || o.LJ(str, "back")) {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from_merge", hv0.LIZJ);
                c188727au2.LJIIIZ("action_type", "click");
                LiveRoomStruct liveRoomStruct4 = hv0.LIZIZ;
                if (liveRoomStruct4 != null && (user = liveRoomStruct4.owner) != null) {
                    str4 = user.getUid();
                } else {
                    str4 = null;
                }
                c188727au2.LJIIIZ("anchor_id", str4);
                LiveRoomStruct liveRoomStruct5 = hv0.LIZIZ;
                if (liveRoomStruct5 != null) {
                    l2 = Long.valueOf(liveRoomStruct5.id);
                } else {
                    l2 = null;
                }
                c188727au2.LJFF(l2, "room_id");
                Aweme aweme2 = hv0.LIZ;
                if (aweme2 != null) {
                    str6 = aweme2.getRequestId();
                }
                c188727au2.LJIIIZ("request_id", str6);
                c188727au2.LJIIIZ("enter_method", "live_cell");
                if (o.LJ(str, "enter")) {
                    str5 = "watch_now";
                } else {
                    str5 = "not_now";
                }
                c188727au2.LJIIIZ("click_type", str5);
                c188727au2.LJIIIZ("action_type", "click");
                C86343Xud hv02 = hv0();
                if (hv02 != null && (liveRoomStruct = hv02.LIZIZ) != null) {
                    j = liveRoomStruct.maxPreviewTime;
                } else {
                    j = 0;
                }
                c188727au2.LJ(j / 1000, "maximum_preview_duration");
                FMX.LJIIL("livesdk_sub_only_live_enter_room_boot_click", c188727au2.LIZ);
            }
        }
    }

    public final void lv0(String str) {
        Boolean bool;
        String str2;
        User user;
        String str3;
        String str4;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> subTags;
        FeedRoomTag feedRoomTag;
        User user2;
        C86343Xud hv0 = hv0();
        if (hv0 != null) {
            C86343Xud hv02 = hv0();
            Long l = null;
            if (hv02 != null) {
                bool = Boolean.valueOf(C78963Uyt.LJIIIIZZ(hv02));
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from_merge", hv0.LIZJ);
                c188727au.LJIIIZ("action_type", "click");
                LiveRoomStruct liveRoomStruct = hv0.LIZIZ;
                if (liveRoomStruct != null && (user2 = liveRoomStruct.owner) != null) {
                    str3 = user2.getUid();
                } else {
                    str3 = null;
                }
                c188727au.LJIIIZ("anchor_id", str3);
                LiveRoomStruct liveRoomStruct2 = hv0.LIZIZ;
                if (liveRoomStruct2 != null) {
                    l = Long.valueOf(liveRoomStruct2.id);
                }
                c188727au.LJFF(l, "room_id");
                c188727au.LJIIIZ("enter_method", "live_cell");
                c188727au.LIZLLL(C54740Le4.LIZ(hv0.LIZIZ), "follow_status");
                c188727au.LIZLLL(hv0.LJI, "room_position");
                LiveRoomStruct liveRoomStruct3 = hv0.LIZIZ;
                if (liveRoomStruct3 == null || (feedRoomTagList = liveRoomStruct3.feedRoomTagList) == null || (subTags = feedRoomTagList.getSubTags()) == null || (feedRoomTag = (FeedRoomTag) ORZ.LJLLLL(subTags)) == null || (str4 = feedRoomTag.getContent()) == null) {
                    str4 = "";
                }
                c188727au.LJIIIZ("label", str4);
                c188727au.LJIIIZ("type", str);
                FMX.LJIIL("livesdk_auto_guidance_negative_feedback", c188727au.LIZ);
                return;
            }
            C188727au c188727au2 = new C188727au();
            LiveRoomStruct liveRoomStruct4 = hv0.LIZIZ;
            if (liveRoomStruct4 != null && (user = liveRoomStruct4.owner) != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            c188727au2.LJIIIZ("anchor_id", str2);
            LiveRoomStruct liveRoomStruct5 = hv0.LIZIZ;
            if (liveRoomStruct5 != null) {
                l = Long.valueOf(liveRoomStruct5.id);
            }
            c188727au2.LJFF(l, "room_id");
            c188727au2.LJIIIZ("type", str);
            FMX.LJIIL("livesdk_fyp_guidence_negative_feedback", c188727au2.LIZ);
        }
    }

    public final void iv0(long j, String str) {
        Boolean bool;
        String str2;
        String str3;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> subTags;
        FeedRoomTag feedRoomTag;
        User user;
        C86343Xud hv0 = hv0();
        Long l = null;
        if (hv0 != null) {
            bool = Boolean.valueOf(C78963Uyt.LJIIIIZZ(hv0));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C86343Xud hv02 = hv0();
            if (hv02 != null) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from_merge", hv02.LIZJ);
                c188727au.LJIIIZ("action_type", "click");
                LiveRoomStruct liveRoomStruct = hv02.LIZIZ;
                if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
                    str2 = user.getUid();
                } else {
                    str2 = null;
                }
                c188727au.LJIIIZ("anchor_id", str2);
                LiveRoomStruct liveRoomStruct2 = hv02.LIZIZ;
                if (liveRoomStruct2 != null) {
                    l = Long.valueOf(liveRoomStruct2.id);
                }
                c188727au.LJFF(l, "room_id");
                c188727au.LJIIIZ("enter_method", "live_cell");
                c188727au.LIZLLL(C54740Le4.LIZ(hv02.LIZIZ), "follow_status");
                c188727au.LIZLLL(hv02.LJI, "room_position");
                LiveRoomStruct liveRoomStruct3 = hv02.LIZIZ;
                if (liveRoomStruct3 == null || (feedRoomTagList = liveRoomStruct3.feedRoomTagList) == null || (subTags = feedRoomTagList.getSubTags()) == null || (feedRoomTag = (FeedRoomTag) ORZ.LJLLLL(subTags)) == null || (str3 = feedRoomTag.getContent()) == null) {
                    str3 = "";
                }
                c188727au.LJIIIZ("label", str3);
                c188727au.LJIIIZ("process", str);
                c188727au.LJ(j / 1000, "duration");
                FMX.LJIIL("livesdk_auto_guidance_notify_time", c188727au.LIZ);
                return;
            }
            return;
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJ(j / 1000, "duration");
        FMX.LJIIL("livesdk_live_show_notify_time_v2", c188727au2.LIZ);
    }
}
