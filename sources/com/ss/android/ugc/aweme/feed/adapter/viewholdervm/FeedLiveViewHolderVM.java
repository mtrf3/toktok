package com.ss.android.ugc.aweme.feed.adapter.viewholdervm;

import X.AnonymousClass629;
import X.B57;
import X.B83;
import X.BZI;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C28787BRn;
import X.C29374Bfu;
import X.C2IM;
import X.C2U8;
import X.C36933EeX;
import X.C38354F3m;
import X.C54742Le6;
import X.C58655N0h;
import X.C58704N2e;
import X.C61062aU;
import X.C61072aV;
import X.C61082aW;
import X.C62046OWs;
import X.C62822Ol8;
import X.C68382mI;
import X.C73411SrX;
import X.C75574TlK;
import X.C76800UCe;
import X.C84763XOl;
import X.C84765XOn;
import X.C86340Xua;
import X.C86342Xuc;
import X.C86343Xud;
import X.C86345Xuf;
import X.C86347Xuh;
import X.EnumC79996VaS;
import X.FMX;
import X.FS8;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.OSZ;
import X.OU0;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveDrawPreviewLiveEndSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveNoStreamLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemovePauseLiveSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FeedLiveViewHolderVM extends LiveWidgetViewModel implements Handler.Callback {
    public InterfaceC92693kP LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJLL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public String LJLL;
    public long LJLLILLLL;
    public C73411SrX LJLLJ;
    public C84765XOn LJLLL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LL;
    public boolean LLFFF;
    public int LLFII;
    public int LLFZ;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 261));
    public String LJLJJL = "";
    public String LJLJL = "user_swipe";
    public final Handler LJLLI = new Handler(C16880lQ.LLJJJJ(), this);
    public final NextLiveData<Boolean> LJLLLL = new NextLiveData<>();
    public final NextLiveData<C76800UCe> LJLLLLLL = new NextLiveData<>();
    public final NextLiveData<OSZ<Boolean, Boolean>> LJLZ = new NextLiveData<>();
    public final NextLiveData<Boolean> LJZ = new NextLiveData<>(Boolean.TRUE);
    public final NextLiveData<C76800UCe> LJZI = new NextLiveData<>();
    public final MutableLiveData<OU0> LJZL = new MutableLiveData<>();
    public final NextLiveData<Boolean> LLD = new NextLiveData<>();
    public final MutableLiveData<Integer> LLF = new MutableLiveData<>();
    public final MutableLiveData<String> LLFF = new MutableLiveData<>();
    public EnumC79996VaS LLI = EnumC79996VaS.IDLE;
    public final C62822Ol8 LLIFFJFJJ = C221108m2.LIZIZ(C61062aU.LJLIL);
    public final C62822Ol8 LLII = C221108m2.LIZIZ(C61082aW.LJLIL);
    public final C62822Ol8 LLIIII = C221108m2.LIZIZ(C61072aV.LJLIL);
    public boolean LLIIIILZ = true;

    public final void sv0() {
        boolean z;
        String str;
        String str2;
        Long l;
        String str3;
        String str4;
        User user;
        User user2;
        String str5;
        Long l2;
        String str6;
        Integer num;
        User user3;
        User user4;
        C86345Xuf c86345Xuf;
        Boolean bool;
        C86340Xua.LIZ(kv0());
        C86343Xud kv0 = kv0();
        boolean z2 = this.LJLJJI;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(C75574TlK.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        C86340Xua.LIZIZ(kv0, z2, z);
        C86343Xud kv02 = kv0();
        if (kv02 != null) {
            kv02.LJIJI = 2;
        }
        C86343Xud kv03 = kv0();
        if (kv03 != null) {
            kv03.LJIJJ = this.LLFII;
        }
        C86343Xud kv04 = kv0();
        if (kv04 != null) {
            kv04.LJIJJLI = this.LLFZ;
        }
        C86340Xua.LIZLLL(kv0());
        this.LJLJLLL = false;
        C86343Xud kv05 = kv0();
        if (kv05 != null) {
            kv05.LJFF = false;
        }
        C86343Xud kv06 = kv0();
        if (kv06 != null) {
            kv06.LJIIL = false;
        }
        C86343Xud kv07 = kv0();
        Integer num2 = null;
        if (kv07 != null) {
            kv07.LJIJ = null;
        }
        C86343Xud kv08 = kv0();
        if (kv08 != null && (c86345Xuf = kv08.LJIIIIZZ) != null) {
            c86345Xuf.LJLJI = 0L;
        }
        this.LJLJLJ = false;
        this.LJLJJLL = false;
        this.LJLLI.removeMessages(100);
        this.LJLLI.removeMessages(102);
        C86343Xud kv09 = kv0();
        if (kv09 != null) {
            if (!kv09.LJ && ((Boolean) this.LLIIII.getValue()).booleanValue()) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from_merge", kv09.LIZJ);
                c188727au.LJIIIZ("action_type", "click");
                LiveRoomStruct liveRoomStruct = kv09.LIZIZ;
                if (liveRoomStruct != null && (user4 = liveRoomStruct.owner) != null) {
                    str5 = user4.getUid();
                } else {
                    str5 = null;
                }
                c188727au.LJIIIZ("anchor_id", str5);
                LiveRoomStruct liveRoomStruct2 = kv09.LIZIZ;
                if (liveRoomStruct2 != null) {
                    l2 = Long.valueOf(liveRoomStruct2.id);
                } else {
                    l2 = null;
                }
                c188727au.LJFF(l2, "room_id");
                Aweme aweme = kv09.LIZ;
                if (aweme != null) {
                    str6 = aweme.getRequestId();
                } else {
                    str6 = null;
                }
                c188727au.LJIIIZ("request_id", str6);
                c188727au.LJIIIZ("enter_method", "live_cell");
                LiveRoomStruct liveRoomStruct3 = kv09.LIZIZ;
                if (liveRoomStruct3 != null && (user3 = liveRoomStruct3.owner) != null) {
                    num = Integer.valueOf(user3.getFollowStatus());
                } else {
                    num = null;
                }
                c188727au.LJFF(num, "follow_status");
                c188727au.LJIIIZ("request_type", this.LJLJL);
                FMX.LJIIL("livesdk_finish_card_swipe", c188727au.LIZ);
            }
            LiveOuterService.LJJJLL().LJJJJIZL();
            if (C62046OWs.LIZIZ("livesdk_live_abnormal_pass") && (str = this.LJLL) != null) {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from_merge", kv09.LIZJ);
                c188727au2.LJIIIZ("enter_method", "live_cell");
                c188727au2.LJIIIZ("action_type", "click");
                LiveRoomStruct liveRoomStruct4 = kv09.LIZIZ;
                if (liveRoomStruct4 != null && (user2 = liveRoomStruct4.owner) != null) {
                    str2 = user2.getUid();
                } else {
                    str2 = null;
                }
                c188727au2.LJIIIZ("anchor_id", str2);
                LiveRoomStruct liveRoomStruct5 = kv09.LIZIZ;
                if (liveRoomStruct5 != null) {
                    l = Long.valueOf(liveRoomStruct5.id);
                } else {
                    l = null;
                }
                c188727au2.LJFF(l, "room_id");
                Aweme aweme2 = kv09.LIZ;
                if (aweme2 != null) {
                    str3 = aweme2.getRequestId();
                } else {
                    str3 = null;
                }
                c188727au2.LJIIIZ("request_id", str3);
                LiveRoomStruct liveRoomStruct6 = kv09.LIZIZ;
                if (liveRoomStruct6 != null && (user = liveRoomStruct6.owner) != null) {
                    num2 = Integer.valueOf(user.getFollowStatus());
                }
                c188727au2.LJFF(num2, "follow_status");
                c188727au2.LJIIIZ("abnormal_reason", str);
                if (C38354F3m.LIZJ(this.LJLJL, "user_swipe")) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                } else {
                    str4 = "1";
                }
                c188727au2.LJIIIZ("is_auto_pass", str4);
                FMX.LJIIL("livesdk_live_abnormal_pass", c188727au2.LIZ);
            }
        }
        C86343Xud kv010 = kv0();
        if (kv010 != null) {
            kv010.LJI = -1;
        }
        C86343Xud kv011 = kv0();
        if (kv011 == null) {
            return;
        }
        kv011.LJIILJJIL = true;
    }

    public final void iv0() {
        C73411SrX c73411SrX = this.LJLLJ;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            c73411SrX.dispose();
        }
        this.LJLLJ = null;
        this.LJLLL = null;
        InterfaceC92693kP interfaceC92693kP = this.LJLILLLLZI;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            interfaceC92693kP.dispose();
        }
        this.LJLILLLLZI = null;
    }

    public final void jv0() {
        this.LJLLI.removeMessages(100);
        if (this.LJLLILLLL > 0 && System.currentTimeMillis() - this.LJLLILLLL >= 5000) {
            this.LJLLI.sendEmptyMessageDelayed(100, 0L);
        } else {
            this.LJLLI.sendEmptyMessageDelayed(100, 5000L);
            this.LJLLILLLL = System.currentTimeMillis();
        }
    }

    public final C86343Xud kv0() {
        return (C86343Xud) this.LJLIL.getValue();
    }

    public final void mv0() {
        this.LJLJL = "auto_swipe";
        C86343Xud kv0 = kv0();
        if (kv0 != null && kv0.LJFF) {
            this.LJLLILLLL = 0L;
            this.LJLLI.removeMessages(100);
            C2U8.LIZ(new C68382mI());
        }
    }

    public final void gv0() {
        C86343Xud kv0 = kv0();
        if (kv0 != null) {
            kv0.LJFF = false;
        }
        C86343Xud kv02 = kv0();
        if (kv02 != null) {
            kv02.LJIIL = false;
        }
        C84765XOn c84765XOn = this.LJLLL;
        if (c84765XOn != null) {
            c84765XOn.LJLILLLLZI = false;
        }
        C84765XOn c84765XOn2 = new C84765XOn();
        this.LJLLL = c84765XOn2;
        if (C84763XOl.LJIIJJI) {
            c84765XOn2.LJLIL = true;
        } else if (c84765XOn2.LJLIL) {
            c84765XOn2.LJLIL = false;
            c84765XOn2.LJLILLLLZI = true;
        }
        this.LJLLJ = (C73411SrX) C84763XOl.LJIIJ.LJJJJLL().LJJJJZI(this.LJLLL);
        hv0(true, false, true);
    }

    public final void qv0() {
        boolean z;
        String str;
        C86345Xuf c86345Xuf;
        C86343Xud kv0 = kv0();
        String str2 = null;
        if (kv0 != null && (c86345Xuf = kv0.LJIIIIZZ) != null) {
            c86345Xuf.LJLIL = System.currentTimeMillis();
        }
        C86343Xud kv02 = kv0();
        EnumC79996VaS status = this.LLI;
        o.LJIIIZ(status, "status");
        if (kv02 != null) {
            kv02.LJJIII = AnonymousClass629.LIZ("randomUUID().toString()");
            if (kv02.LJJIIJZLJL) {
                kv02.LJJIIJZLJL = false;
                kv02.LJJIIJ = B57.LIZ.LIZLLL;
            } else {
                kv02.LJJIIJ = null;
            }
            LiveRoomStruct liveRoomStruct = kv02.LIZIZ;
            if (liveRoomStruct != null) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from_merge", kv02.LIZJ);
                c188727au.LJIIIZ("enter_method", "live_cell");
                c188727au.LJIIIZ("action_type", "click");
                c188727au.LJIIIZ("anchor_id", liveRoomStruct.owner.getUid());
                c188727au.LJ(liveRoomStruct.id, "room_id");
                Aweme aweme = kv02.LIZ;
                if (aweme != null) {
                    str2 = aweme.getRequestId();
                }
                c188727au.LJIIIZ("request_id", str2);
                c188727au.LIZLLL(kv02.LJI, "room_position");
                c188727au.LIZLLL(status.ordinal(), "preview_stream_status");
                c188727au.LJIIIZ("live_type", RoomStruct.getStreamType(liveRoomStruct).logStreamingType);
                c188727au.LJIIIZ("live_play_session_id", kv02.LJJIII);
                c188727au.LJIIIZ("live_session_id", kv02.LJJIIJ);
                FMX.LJIIL("livesdk_preview_live_show", c188727au.LIZ);
            }
        }
        if (this.LJLJLLL) {
            C86343Xud kv03 = kv0();
            if (kv03 != null && kv03.LJ) {
                if (RemoveDrawPreviewLiveEndSetting.INSTANCE.getValue()) {
                    hv0(false, true, false);
                }
            } else if (!this.LJLJLJ) {
                C86343Xud kv04 = kv0();
                C84765XOn c84765XOn = this.LJLLL;
                if (c84765XOn != null && c84765XOn.LJLILLLLZI) {
                    z = true;
                } else {
                    z = false;
                }
                C86340Xua.LJ(kv04, "normal", z);
            }
            this.LJZI.setValue(C76800UCe.LIZ);
            C86343Xud kv05 = kv0();
            C84765XOn c84765XOn2 = this.LJLLL;
            if (c84765XOn2 != null && c84765XOn2.LJLILLLLZI) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C86340Xua.LJFF(kv05, str);
            this.LJLJLLL = false;
        }
    }

    public final void rv0() {
        C86343Xud kv0 = kv0();
        boolean z = false;
        if (kv0 != null && kv0.LJFF && !this.LJLJJLL) {
            C86343Xud kv02 = kv0();
            String str = this.LJLJJL;
            C84765XOn c84765XOn = this.LJLLL;
            if (c84765XOn != null && c84765XOn.LJLILLLLZI) {
                z = true;
            }
            C86340Xua.LJ(kv02, str, z);
            this.LJLJJLL = true;
        }
        jv0();
        this.LJZ.setValue(Boolean.FALSE);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        C86347Xuh c86347Xuh;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i == 102) {
            C86343Xud kv0 = kv0();
            if (kv0 != null) {
                Object obj = msg.obj;
                if (obj instanceof C86347Xuh) {
                    c86347Xuh = (C86347Xuh) obj;
                } else {
                    c86347Xuh = null;
                }
                if (kv0.LJFF) {
                    this.LJLJL = "toast_swipe";
                    if (c86347Xuh != null) {
                        C2U8.LIZ(new C2IM(this.LLIIIILZ, kv0.LIZ, kv0.LIZLLL, c86347Xuh.LIZ, Integer.valueOf(c86347Xuh.LIZIZ), c86347Xuh.LIZJ, c86347Xuh.LIZLLL));
                    }
                }
            }
            return true;
        }
        if (i == 100) {
            mv0();
            return true;
        }
        return false;
    }

    public final void lv0(String str) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme2;
        String str2;
        String str3;
        Long l;
        String str4;
        Integer num;
        String str5;
        Long l2;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        User user;
        LiveRoomStruct liveRoomStruct4;
        User user2;
        Aweme aweme3;
        LiveRoomStruct liveRoomStruct5;
        LiveRoomStruct liveRoomStruct6;
        User user3;
        String str6 = null;
        if (((Boolean) this.LLII.getValue()).booleanValue()) {
            C188727au c188727au = new C188727au();
            C86343Xud kv0 = kv0();
            if (kv0 != null) {
                str2 = kv0.LIZJ;
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("enter_from_merge", str2);
            c188727au.LJIIIZ("action_type", "click");
            C86343Xud kv02 = kv0();
            if (kv02 != null && (liveRoomStruct6 = kv02.LIZIZ) != null && (user3 = liveRoomStruct6.owner) != null) {
                str3 = user3.getUid();
            } else {
                str3 = null;
            }
            c188727au.LJIIIZ("anchor_id", str3);
            C86343Xud kv03 = kv0();
            if (kv03 != null && (liveRoomStruct5 = kv03.LIZIZ) != null) {
                l = Long.valueOf(liveRoomStruct5.id);
            } else {
                l = null;
            }
            c188727au.LJFF(l, "room_id");
            C86343Xud kv04 = kv0();
            if (kv04 != null && (aweme3 = kv04.LIZ) != null) {
                str4 = aweme3.getRequestId();
            } else {
                str4 = null;
            }
            c188727au.LJIIIZ("request_id", str4);
            c188727au.LJIIIZ("enter_method", "live_cell");
            C86343Xud kv05 = kv0();
            if (kv05 != null && (liveRoomStruct4 = kv05.LIZIZ) != null && (user2 = liveRoomStruct4.owner) != null) {
                num = Integer.valueOf(user2.getFollowStatus());
            } else {
                num = null;
            }
            c188727au.LJFF(num, "follow_status");
            C86343Xud kv06 = kv0();
            if (kv06 != null && (liveRoomStruct3 = kv06.LIZIZ) != null && (user = liveRoomStruct3.owner) != null) {
                str5 = user.getUid();
            } else {
                str5 = null;
            }
            c188727au.LJIIIZ("del_anchor_id", str5);
            C86343Xud kv07 = kv0();
            if (kv07 != null && (liveRoomStruct2 = kv07.LIZIZ) != null) {
                l2 = Long.valueOf(liveRoomStruct2.id);
            } else {
                l2 = null;
            }
            c188727au.LJFF(l2, "del_room_id");
            c188727au.LJIIIZ("del_type", "live_cell");
            c188727au.LJIIIZ("del_reason", str);
            FMX.LJIIL("livesdk_live_delete", c188727au.LIZ);
        }
        C86343Xud kv08 = kv0();
        if (kv08 != null && (aweme = kv08.LIZ) != null && aweme.isAd()) {
            C86343Xud kv09 = kv0();
            if (kv09 != null && (aweme2 = kv09.LIZ) != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "live_delete", awemeRawAd);
            LIZLLL.LIZIZ(str, "delete_reason");
            C86343Xud kv010 = kv0();
            if (kv010 != null && (liveRoomStruct = kv010.LIZIZ) != null) {
                str6 = Long.valueOf(liveRoomStruct.id).toString();
            }
            LIZLLL.LIZIZ(str6, "room_id");
            LIZLLL.LJI();
        }
    }

    public final void nv0(int i) {
        String str;
        Aweme aweme;
        LiveRoomStruct newLiveRoomData;
        RoomFeedCellStruct roomFeedCellStruct;
        String str2;
        boolean z;
        String str3;
        C86345Xuf c86345Xuf;
        LiveRoomStruct liveRoomStruct;
        C86345Xuf c86345Xuf2;
        LiveRoomStruct liveRoomStruct2;
        C86343Xud kv0 = kv0();
        if (kv0 != null) {
            kv0.LJI = i;
        }
        C86343Xud kv02 = kv0();
        if (kv02 != null && (liveRoomStruct2 = kv02.LIZIZ) != null) {
            C86343Xud kv03 = kv0();
            if (kv03 != null) {
                kv03.LJIIJJI = liveRoomStruct2.isShow;
            }
            liveRoomStruct2.isShow = true;
        }
        this.LJLJL = "user_swipe";
        Long l = null;
        this.LJLL = null;
        C86343Xud kv04 = kv0();
        if (kv04 != null) {
            kv04.LJFF = true;
        }
        this.LJLLILLLL = 0L;
        C86343Xud kv05 = kv0();
        if (kv05 != null && (c86345Xuf2 = kv05.LJIIIIZZ) != null) {
            c86345Xuf2.LJLIL = System.currentTimeMillis();
        }
        this.LJLLI.removeMessages(102);
        hv0(false, true, false);
        this.LJLJLLL = false;
        C54742Le6 LJIJ = LiveOuterService.LJJJLL().LJIJ();
        C86343Xud kv06 = kv0();
        if (kv06 != null) {
            str = kv06.LIZJ;
        } else {
            str = null;
        }
        C86343Xud kv07 = kv0();
        if (kv07 != null) {
            aweme = kv07.LIZ;
        } else {
            aweme = null;
        }
        LJIJ.getClass();
        if (str != null) {
            long currentTimeMillis = System.currentTimeMillis();
            OSZ<Integer, Long> osz = LJIJ.LIZ.get(str);
            if (osz == null) {
                LJIJ.LIZ.put(str, new OSZ<>(Integer.valueOf(i), Long.valueOf(currentTimeMillis)));
            } else if (osz.getFirst().intValue() < i) {
                int intValue = i - osz.getFirst().intValue();
                long longValue = currentTimeMillis - osz.getSecond().longValue();
                LJIJ.LIZ.put(str, new OSZ<>(Integer.valueOf(i), Long.valueOf(currentTimeMillis)));
                if (aweme != null && ((newLiveRoomData = aweme.getNewLiveRoomData()) != null || ((roomFeedCellStruct = aweme.getRoomFeedCellStruct()) != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null))) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_live_gap_info");
                    LIZ.LJIJJ(Integer.valueOf(intValue), "live_gap_info_item_count");
                    LIZ.LJIJJ(Long.valueOf(longValue), "live_gap_info_time");
                    LIZ.LJIJJ(str, "enter_from_merge");
                    LIZ.LJIJJ("live_cell", "enter_method");
                    LIZ.LJIJJ("click", "action_type");
                    LIZ.LJIJJ(aweme.getRequestId(), "request_id");
                    LIZ.LJIJJ(Long.valueOf(newLiveRoomData.id), "room_id");
                    LIZ.LJIJJ(Long.valueOf(newLiveRoomData.getAnchorId()), "anchor_id");
                    LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
                    LIZ.LJIJJ(AppLog.getServerDeviceId(), "device_id");
                    LIZ.LJIJJ(Integer.valueOf(i), "order");
                    if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                        LIZ.LJJIIJZLJL();
                    } else {
                        LIZ.LJJIJ();
                        LIZ.LJJIIZI();
                    }
                }
            }
        }
        C86343Xud kv08 = kv0();
        if (kv08 != null) {
            str2 = kv08.LIZLLL;
        } else {
            str2 = null;
        }
        if (FS8.LIZ() == 1 && TextUtils.equals(str2, "homepage_hot")) {
            C36933EeX LJJIFFI = LiveOuterService.LJJJLL().LJJIFFI();
            C86343Xud kv09 = kv0();
            if (kv09 != null && (liveRoomStruct = kv09.LIZIZ) != null) {
                l = Long.valueOf(liveRoomStruct.id);
            }
            LJJIFFI.LIZ().remove(String.valueOf(l));
        }
        this.LJLJI = true;
        C86343Xud kv010 = kv0();
        if (kv010 != null && kv010.LJ) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJI = z;
        C84765XOn c84765XOn = this.LJLLL;
        if (c84765XOn != null) {
            c84765XOn.LJLILLLLZI = false;
        }
        this.LJLJLLL = false;
        C86343Xud kv011 = kv0();
        if (kv011 != null) {
            kv011.LJFF = true;
        }
        C86343Xud kv012 = kv0();
        if (kv012 != null && (c86345Xuf = kv012.LJIIIIZZ) != null) {
            c86345Xuf.LJLIL = System.currentTimeMillis();
        }
        C86343Xud kv013 = kv0();
        C84765XOn c84765XOn2 = this.LJLLL;
        if (c84765XOn2 != null && c84765XOn2.LJLILLLLZI) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C86340Xua.LJFF(kv013, str3);
    }

    public final void pv0(int i) {
        boolean z;
        int i2;
        Boolean bool;
        C86343Xud kv0 = kv0();
        boolean z2 = this.LJLJJI;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(C75574TlK.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        C86340Xua.LIZIZ(kv0, z2, z);
        C86343Xud kv02 = kv0();
        if (kv02 != null) {
            if (kv02.LJIIJ) {
                i2 = 1;
            } else {
                i2 = 4;
                if (i != 1 && i != 2) {
                    i2 = (i == 4 || i == 5) ? 3 : 2;
                }
            }
            kv02.LJIJI = i2;
        }
        C86343Xud kv03 = kv0();
        if (kv03 != null) {
            kv03.LJIJJ = this.LLFII;
        }
        C86343Xud kv04 = kv0();
        if (kv04 != null) {
            kv04.LJIJJLI = this.LLFZ;
        }
        C86340Xua.LIZLLL(kv0());
        C86343Xud kv05 = kv0();
        if (kv05 != null) {
            C86345Xuf c86345Xuf = kv05.LJIIIIZZ;
            c86345Xuf.LJLJI = (System.currentTimeMillis() - kv05.LJIIIIZZ.LJLIL) + c86345Xuf.LJLJI;
        }
        this.LJLJLLL = true;
        this.LJLLI.removeMessages(100);
    }

    public final void hv0(boolean z, boolean z2, boolean z3) {
        LiveRoomStruct liveRoomStruct;
        String str;
        C86343Xud kv0;
        Iterable arrayList;
        C86343Xud kv02 = kv0();
        if (kv02 != null && (liveRoomStruct = kv02.LIZIZ) != null) {
            if (!z3 || ((kv0 = kv0()) != null && kv0.LJI == 0)) {
                if (z2) {
                    ArrayList arrayList2 = new ArrayList();
                    if (RemovePauseLiveSetting.INSTANCE.enable()) {
                        arrayList2.add("pause");
                    }
                    if (RemoveNoStreamLiveSetting.INSTANCE.enable()) {
                        arrayList2.add("nostream");
                    }
                    str = TextUtils.join(",", arrayList2);
                } else {
                    str = null;
                }
            } else {
                C86343Xud kv03 = kv0();
                if (kv03 == null || (arrayList = kv03.LJIILIIL) == null) {
                    arrayList = new ArrayList();
                }
                str = TextUtils.join(",", arrayList);
            }
            iv0();
            this.LJLILLLLZI = LiveOuterService.LJJJLL().LJJIJIL().LJJIJL("preview_card_inspection", str, liveRoomStruct.id, new C86342Xuc(this, z2, z, z3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x041d, code lost:
    
        if (r1 == null) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ov0(com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM r20, boolean r21, android.content.Context r22, java.lang.String r23, boolean r24, boolean r25, int r26) {
        /*
            Method dump skipped, instructions count: 1463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM.ov0(com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM, boolean, android.content.Context, java.lang.String, boolean, boolean, int):void");
    }
}
