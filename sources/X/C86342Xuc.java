package X;

import android.os.Message;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.android.livesdk.livesetting.watchlive.DisableAdsNRDeleteSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveDrawPreviewLiveEndSetting;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xuc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86342Xuc implements BOM {
    public final /* synthetic */ FeedLiveViewHolderVM LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    @Override // X.BOM
    public final void onFailed() {
    }

    @Override // X.BOM
    public final void LIZ(FilterInfoData filterInfoData, boolean z) {
        boolean z2;
        String str;
        boolean z3;
        LiveRoomStruct liveRoomStruct;
        String str2;
        Aweme aweme;
        C86343Xud kv0;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        C86343Xud kv02;
        Aweme aweme5;
        String str3;
        Aweme aweme6;
        AwemeRawAd awemeRawAd;
        LiveRoomStruct liveRoomStruct2;
        Aweme aweme7;
        String str4;
        String str5;
        Long l;
        String str6;
        Integer num;
        String str7;
        Long l2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        User user;
        LiveRoomStruct liveRoomStruct5;
        User user2;
        Aweme aweme8;
        LiveRoomStruct liveRoomStruct6;
        LiveRoomStruct liveRoomStruct7;
        User user3;
        FeedLiveViewHolderVM feedLiveViewHolderVM = this.LIZ;
        if (feedLiveViewHolderVM.LJLJI) {
            feedLiveViewHolderVM.LJLJI = false;
            feedLiveViewHolderVM.LJLJJI = z;
        }
        C86343Xud kv03 = feedLiveViewHolderVM.kv0();
        if (kv03 != null && kv03.LJ == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = !z2;
        C86343Xud kv04 = this.LIZ.kv0();
        if (kv04 != null) {
            kv04.LJ = z;
        }
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LIZ.LL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM2 = this.LIZ;
        if (this.LIZIZ) {
            str = "abnormal";
        } else {
            str = "normal";
        }
        feedLiveViewHolderVM2.getClass();
        feedLiveViewHolderVM2.LJLJJL = str;
        this.LIZ.LJLZ.setValue(new OSZ<>(Boolean.valueOf(z4), Boolean.valueOf(z)));
        if (this.LIZIZ) {
            this.LIZ.LJZL.setValue(new OU0(filterInfoData, 3));
        }
        C86343Xud kv05 = this.LIZ.kv0();
        if (kv05 != null && kv05.LJ) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str8 = null;
        if (!z3) {
            this.LIZ.LJLLLL.setValue(Boolean.FALSE);
            if (RemoveDrawPreviewLiveEndSetting.INSTANCE.getValue()) {
                if (this.LIZJ && ((kv02 = this.LIZ.kv0()) == null || !kv02.LJFF)) {
                    C86343Xud kv06 = this.LIZ.kv0();
                    if (kv06 != null) {
                        aweme5 = kv06.LIZ;
                    } else {
                        aweme5 = null;
                    }
                    C86343Xud kv07 = this.LIZ.kv0();
                    if (kv07 != null) {
                        str3 = kv07.LIZLLL;
                    } else {
                        str3 = null;
                    }
                    C2U8.LIZ(new C55045Liz(aweme5, str3));
                    FeedLiveViewHolderVM feedLiveViewHolderVM3 = this.LIZ;
                    if (((Boolean) feedLiveViewHolderVM3.LLIFFJFJJ.getValue()).booleanValue()) {
                        C188727au c188727au = new C188727au();
                        C86343Xud kv08 = feedLiveViewHolderVM3.kv0();
                        if (kv08 != null) {
                            str4 = kv08.LIZJ;
                        } else {
                            str4 = null;
                        }
                        c188727au.LJIIIZ("enter_from_merge", str4);
                        c188727au.LJIIIZ("action_type", "click");
                        C86343Xud kv09 = feedLiveViewHolderVM3.kv0();
                        if (kv09 != null && (liveRoomStruct7 = kv09.LIZIZ) != null && (user3 = liveRoomStruct7.owner) != null) {
                            str5 = user3.getUid();
                        } else {
                            str5 = null;
                        }
                        c188727au.LJIIIZ("anchor_id", str5);
                        C86343Xud kv010 = feedLiveViewHolderVM3.kv0();
                        if (kv010 != null && (liveRoomStruct6 = kv010.LIZIZ) != null) {
                            l = Long.valueOf(liveRoomStruct6.id);
                        } else {
                            l = null;
                        }
                        c188727au.LJFF(l, "room_id");
                        C86343Xud kv011 = feedLiveViewHolderVM3.kv0();
                        if (kv011 != null && (aweme8 = kv011.LIZ) != null) {
                            str6 = aweme8.getRequestId();
                        } else {
                            str6 = null;
                        }
                        c188727au.LJIIIZ("request_id", str6);
                        c188727au.LJIIIZ("enter_method", "live_cell");
                        C86343Xud kv012 = feedLiveViewHolderVM3.kv0();
                        if (kv012 != null && (liveRoomStruct5 = kv012.LIZIZ) != null && (user2 = liveRoomStruct5.owner) != null) {
                            num = Integer.valueOf(user2.getFollowStatus());
                        } else {
                            num = null;
                        }
                        c188727au.LJFF(num, "follow_status");
                        C86343Xud kv013 = feedLiveViewHolderVM3.kv0();
                        if (kv013 != null && (liveRoomStruct4 = kv013.LIZIZ) != null && (user = liveRoomStruct4.owner) != null) {
                            str7 = user.getUid();
                        } else {
                            str7 = null;
                        }
                        c188727au.LJIIIZ("delete_anchor_id", str7);
                        C86343Xud kv014 = feedLiveViewHolderVM3.kv0();
                        if (kv014 != null && (liveRoomStruct3 = kv014.LIZIZ) != null) {
                            l2 = Long.valueOf(liveRoomStruct3.id);
                        } else {
                            l2 = null;
                        }
                        c188727au.LJFF(l2, "delete_room_id");
                        c188727au.LJIIIZ("delete_type", "inspection");
                        FMX.LJIIL("livesdk_finish_card_delete", c188727au.LIZ);
                    }
                    C86343Xud kv015 = feedLiveViewHolderVM3.kv0();
                    if (kv015 != null && (aweme6 = kv015.LIZ) != null && aweme6.isAd()) {
                        C86343Xud kv016 = feedLiveViewHolderVM3.kv0();
                        if (kv016 != null && (aweme7 = kv016.LIZ) != null) {
                            awemeRawAd = aweme7.getAwemeRawAd();
                        } else {
                            awemeRawAd = null;
                        }
                        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "live_delete", awemeRawAd);
                        LIZLLL.LIZIZ("finish", "delete_reason");
                        C86343Xud kv017 = feedLiveViewHolderVM3.kv0();
                        if (kv017 != null && (liveRoomStruct2 = kv017.LIZIZ) != null) {
                            str8 = Long.valueOf(liveRoomStruct2.id).toString();
                        }
                        LIZLLL.LIZIZ(str8, "room_id");
                        LIZLLL.LJI();
                    }
                }
                if (this.LIZIZ) {
                    this.LIZ.LJLLI.removeMessages(102);
                    Message obtain = Message.obtain(this.LIZ.LJLLI, 102);
                    obtain.obj = new C86347Xuh(R.string.mqr, "end", 12);
                    this.LIZ.LJLLI.sendMessageDelayed(obtain, 500L);
                    return;
                }
                return;
            }
            this.LIZ.jv0();
            return;
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM4 = this.LIZ;
        boolean z5 = this.LIZLLL;
        if (filterInfoData != null) {
            C86343Xud kv018 = feedLiveViewHolderVM4.kv0();
            if (kv018 == null || (liveRoomStruct = kv018.LIZIZ) == null || !filterInfoData.isFiltered || (str2 = filterInfoData.reason) == null) {
                return;
            }
            int hashCode = str2.hashCode();
            if (hashCode != 3524) {
                if (hashCode != 106440182) {
                    if (hashCode != 1567246465 || !str2.equals("nostream")) {
                        return;
                    }
                    if (z5) {
                        C86343Xud kv019 = feedLiveViewHolderVM4.kv0();
                        if (kv019 == null || kv019.LJFF) {
                            return;
                        }
                        C86343Xud kv020 = feedLiveViewHolderVM4.kv0();
                        if (kv020 != null) {
                            aweme4 = kv020.LIZ;
                        } else {
                            aweme4 = null;
                        }
                        C86343Xud kv021 = feedLiveViewHolderVM4.kv0();
                        if (kv021 != null) {
                            str8 = kv021.LIZLLL;
                        }
                        C2U8.LIZ(new C55045Liz(aweme4, str8));
                        feedLiveViewHolderVM4.lv0("disconnected");
                        return;
                    }
                    feedLiveViewHolderVM4.LJZL.setValue(new OU0(filterInfoData, 1));
                    feedLiveViewHolderVM4.LJLLI.removeMessages(102);
                    feedLiveViewHolderVM4.LJLL = "disconnected";
                    Message obtain2 = Message.obtain(feedLiveViewHolderVM4.LJLLI, 102);
                    obtain2.obj = new C86347Xuh(R.string.kcj, "disconnected", 12);
                    feedLiveViewHolderVM4.LJLLI.sendMessageDelayed(obtain2, 500L);
                    return;
                }
                if (!str2.equals("pause")) {
                    return;
                }
                if (z5) {
                    if (liveRoomStruct.isShow) {
                        return;
                    }
                    C86343Xud kv022 = feedLiveViewHolderVM4.kv0();
                    if (kv022 != null) {
                        aweme3 = kv022.LIZ;
                    } else {
                        aweme3 = null;
                    }
                    C86343Xud kv023 = feedLiveViewHolderVM4.kv0();
                    if (kv023 != null) {
                        str8 = kv023.LIZLLL;
                    }
                    C2U8.LIZ(new C55045Liz(aweme3, str8));
                    feedLiveViewHolderVM4.lv0("paused");
                    return;
                }
                feedLiveViewHolderVM4.LJZL.setValue(new OU0(filterInfoData, 2));
                feedLiveViewHolderVM4.LJLL = "paused";
                C86343Xud kv024 = feedLiveViewHolderVM4.kv0();
                if (kv024 == null || kv024.LJIIL) {
                    return;
                }
                C86343Xud kv025 = feedLiveViewHolderVM4.kv0();
                if (kv025 != null && kv025.LJIIJJI) {
                    return;
                }
                C86343Xud kv026 = feedLiveViewHolderVM4.kv0();
                if (kv026 != null) {
                    str8 = kv026.LIZLLL;
                }
                if (!C38354F3m.LIZJ(str8, "homepage_hot")) {
                    return;
                }
                feedLiveViewHolderVM4.LJLLI.removeMessages(102);
                Message obtain3 = Message.obtain(feedLiveViewHolderVM4.LJLLI, 102);
                obtain3.obj = new C86347Xuh(R.string.kck, "paused", true, false);
                feedLiveViewHolderVM4.LJLLI.sendMessageDelayed(obtain3, 2000L);
                return;
            }
            if (!str2.equals("nr")) {
                return;
            }
            if ((DisableAdsNRDeleteSetting.INSTANCE.getValue() && (kv0 = feedLiveViewHolderVM4.kv0()) != null && (aweme2 = kv0.LIZ) != null && aweme2.isAd()) || liveRoomStruct.isShow || !z5) {
                return;
            }
            C86343Xud kv027 = feedLiveViewHolderVM4.kv0();
            if (kv027 != null) {
                aweme = kv027.LIZ;
            } else {
                aweme = null;
            }
            C86343Xud kv028 = feedLiveViewHolderVM4.kv0();
            if (kv028 != null) {
                str8 = kv028.LIZLLL;
            }
            C2U8.LIZ(new C55045Liz(aweme, str8));
            feedLiveViewHolderVM4.lv0("nr");
            return;
        }
        feedLiveViewHolderVM4.getClass();
    }

    public C86342Xuc(FeedLiveViewHolderVM feedLiveViewHolderVM, boolean z, boolean z2, boolean z3) {
        this.LIZ = feedLiveViewHolderVM;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}
