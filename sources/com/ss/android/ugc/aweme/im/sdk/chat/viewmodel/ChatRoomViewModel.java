package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.AbstractC65781Prl;
import X.AbstractC73672Svk;
import X.AbstractC73946T0k;
import X.AbstractC89473fD;
import X.AnonymousClass449;
import X.AnonymousClass453;
import X.AnonymousClass454;
import X.AnonymousClass455;
import X.AnonymousClass456;
import X.C1034344d;
import X.C1034544f;
import X.C1035644q;
import X.C1035744r;
import X.C106884Hk;
import X.C109544Rq;
import X.C115494g5;
import X.C221108m2;
import X.C40S;
import X.C44D;
import X.C44E;
import X.C44F;
import X.C44I;
import X.C44L;
import X.C44N;
import X.C57082Lw;
import X.C57702Og;
import X.C62822Ol8;
import X.C72402sm;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73653SvR;
import X.C73893SzJ;
import X.C76800UCe;
import X.C78588Usq;
import X.C78613UtF;
import X.C78999UzT;
import X.C80533Eb;
import X.C91613if;
import X.C91623ig;
import X.C98783uE;
import X.C99033ud;
import X.C99733vl;
import X.C99843vw;
import X.EnumC95013o9;
import X.InterfaceC65462ha;
import X.InterfaceC99713vj;
import X.PO8;
import X.T16;
import X.V1B;
import X.V8H;
import X.XIA;
import X.XKW;
import X.XLM;
import Y.IDeS150S0200000_1;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseExtra;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatRoomViewModel extends ViewModel implements GenericLifecycleObserver {
    public static final Map<String, ChatRoomViewModel> LLFII = new LinkedHashMap();
    public static final Map<String, Integer> LLFZ = new LinkedHashMap();
    public final C99033ud LJLIL;
    public final AnonymousClass454 LJLILLLLZI;
    public final C44L LJLJI;
    public final AnonymousClass455 LJLJJI;
    public final AnonymousClass453 LJLJJL;
    public final C44I LJLJJLL;
    public final C73318Sq2 LJLJL;
    public final C73318Sq2 LJLJLJ;
    public final AbstractC73946T0k LJLJLLL;
    public final InterfaceC99713vj LJLL;
    public final C80533Eb LJLLI;
    public final C99843vw LJLLILLLL;
    public final XKW LJLLJ;
    public final C44N LJLLL;
    public final C73893SzJ<AbstractC89473fD> LJLLLL;
    public final C73893SzJ<C40S> LJLLLLLL;
    public final C73893SzJ<C76800UCe> LJLZ;
    public EnumC95013o9 LJZ;
    public AbstractC65781Prl LJZI;
    public boolean LJZL;
    public final C62822Ol8 LL;
    public final XLM LLD;
    public final XLM LLF;
    public final XLM LLFF;
    public final IDeS150S0200000_1 LLFFF;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            subscribeToEvents$im_base_release();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume$im_base_release();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop$im_base_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy$im_base_release();
        }
    }

    public final void hv0() {
        C78999UzT.LJFF(C73542Ste.LIZLLL(this.LJLJI.LJ(iv0()).LJJIIJ(this.LJLJLLL), new AqS167S0100000_1(this, 142), new AqS167S0100000_1(this, 143)), this.LJLJL);
    }

    public final String iv0() {
        return this.LJLIL.getConversationId();
    }

    public final C44E jv0() {
        return (C44E) this.LL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$im_base_release() {
        if (!this.LJLIL.isReportPage()) {
            Map<String, Integer> map = LLFZ;
            Integer num = (Integer) ((LinkedHashMap) map).get(iv0());
            if (num != null && num.intValue() > 1) {
                map.put(iv0(), Integer.valueOf(num.intValue() - 1));
                C44E jv0 = jv0();
                if (jv0 != null) {
                    jv0.LIZ();
                    return;
                }
                return;
            }
            LLFII.remove(iv0());
            map.remove(iv0());
        }
        this.LJLLLL.onComplete();
        this.LJLLLLLL.onComplete();
        this.LJLJLJ.LIZLLL();
        this.LJZI = null;
        C44E jv02 = jv0();
        if (jv02 != null) {
            jv02.LIZ();
        }
        C44E jv03 = jv0();
        if (jv03 != null) {
            C1034544f c1034544f = jv03.LIZJ;
            if (c1034544f != null) {
                V1B.LJIIZILJ("remove msg fetcher delay task");
                c1034544f.LJLIL.removeCallbacksAndMessages(null);
                c1034544f.LJLJI = 0;
            }
            C1034544f c1034544f2 = jv03.LIZJ;
            if (c1034544f2 != null) {
                C57082Lw.LIZ.LIZIZ("#TakoTypingEvent").removeObserver(c1034544f2);
            }
            AnonymousClass449 anonymousClass449 = jv03.LIZIZ;
            if (anonymousClass449 != null) {
                anonymousClass449.LIZLLL();
                C57082Lw.LIZ.LIZ("#TakoTypingEvent");
            }
            C44F c44f = jv03.LJFF;
            if (c44f != null) {
                C1034344d c1034344d = c44f.LJLIL;
                if (c1034344d != null) {
                    Iterator<AnonymousClass456> it = c1034344d.LJLJLJ.iterator();
                    while (it.hasNext()) {
                        it.next().LIZIZ();
                    }
                }
                C57702Og c57702Og = C57082Lw.LIZ;
                c57702Og.LIZ("#LocateFinishWhenEnterEvent");
                c57702Og.LIZ("#DismissBotInputPanelEvent");
            }
        }
        this.LJLJJLL.LJJ(iv0());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void subscribeToEvents$im_base_release() {
        AbstractC73672Svk LIZ;
        int i;
        if (!this.LJLIL.isReportPage()) {
            Map<String, Integer> map = LLFZ;
            String iv0 = iv0();
            Integer num = (Integer) ((LinkedHashMap) map).get(iv0());
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            map.put(iv0, Integer.valueOf(i + 1));
            Integer num2 = (Integer) ((LinkedHashMap) map).get(iv0());
            if (num2 != null && num2.intValue() > 1) {
                this.LJLLLL.onNext(new C91613if(this.LJLL.LJ(), 1, "messageAdapter"));
                return;
            }
        }
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(this.LJLJI.LIZLLL(iv0()), null, null, new C1035644q(this.LJLLLLLL), 3), this.LJLJLJ);
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(this.LJLLLLLL.LJJJ(this.LJLJLLL), new AqS167S0100000_1(this, 547), null, new AqS167S0100000_1(this, 548), 2), this.LJLJLJ);
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(this.LJLLLL.LJJL(this.LJLJLLL), new AqS167S0100000_1(this, 549), null, new AqS167S0100000_1(this, 550), 2), this.LJLJLJ);
        if (C115494g5.LIZ()) {
            InterfaceC99713vj interfaceC99713vj = this.LJLL;
            o.LJIIIZ(interfaceC99713vj, "<this>");
            LIZ = new C91623ig(interfaceC99713vj);
        } else {
            LIZ = this.LJLILLLLZI.LIZ(this.LJLIL);
        }
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(LIZ, new AqS167S0100000_1(this, 551), null, new C1035744r(this.LJLLLL), 2), this.LJLJLJ);
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(this.LJLZ.LJJJ(this.LJLJLLL).LJIIJJI(100L, TimeUnit.MILLISECONDS), null, null, new AqS167S0100000_1(this, 552), 3), this.LJLJLJ);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume$im_base_release() {
        hv0();
        if (C115494g5.LIZ()) {
            this.LJLL.resume();
        } else {
            this.LJLILLLLZI.LIZIZ(iv0());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop$im_base_release() {
        String str;
        if (C115494g5.LIZ()) {
            this.LJLL.stop();
        } else {
            this.LJLILLLLZI.LIZLLL(iv0());
        }
        AnonymousClass455 anonymousClass455 = this.LJLJJI;
        String iv0 = iv0();
        if (this.LJLIL.isStrangerChat()) {
            str = "stranger";
        } else {
            str = "no_stranger";
        }
        anonymousClass455.LIZ(iv0, str);
        this.LJLJJI.reset();
        this.LJLJL.LIZLLL();
    }

    public final void gv0(List<? extends C109544Rq> messageList) {
        o.LJIIIZ(messageList, "messageList");
        C78999UzT.LJFF(C73542Ste.LJI(new C73653SvR(this.LJLJJLL.LJJIJIIJI(messageList).LJIJJ(this.LJLJLLL)), new AqS167S0100000_1(this, 141), C73542Ste.LIZJ), this.LJLJL);
    }

    public final void kv0(EnumC95013o9 enumC95013o9) {
        o.LJIIIZ(enumC95013o9, "<set-?>");
        this.LJZ = enumC95013o9;
    }

    public ChatRoomViewModel(C99033ud sessionInfo, C80533Eb userRepository) {
        InterfaceC99713vj LJ;
        C44D c44d = new C44D();
        C106884Hk c106884Hk = new C106884Hk();
        AnonymousClass455 anonymousClass455 = new AnonymousClass455() { // from class: X.4l3
            public final AtomicIntegerArray LIZ = new AtomicIntegerArray(EnumC118584l4.values().length);

            @Override // X.AnonymousClass455
            public final void reset() {
                Iterator<Integer> it = C78842Uww.LJJ(0, this.LIZ.length()).iterator();
                while (it.hasNext()) {
                    this.LIZ.set(((AbstractC118224kU) it).nextInt(), 0);
                }
            }

            @Override // X.AnonymousClass455
            public final void LIZIZ(C109544Rq c109544Rq) {
                BaseExtra baseExtra;
                int msgStatus = c109544Rq.getMsgStatus();
                if (msgStatus != 2) {
                    if (msgStatus != 3) {
                        return;
                    }
                    LIZJ(EnumC118584l4.SEND_FAIL);
                    if (c109544Rq.getMsgStatus() == 3) {
                        try {
                            baseExtra = (BaseExtra) C62070OXq.LIZ(BaseExtra.class, c109544Rq.getLocalExt().get("s:send_response_check_msg"));
                        } catch (Exception unused) {
                        }
                        if (baseExtra != null) {
                            int statusCode = baseExtra.getStatusCode();
                            if (statusCode < 0 || statusCode == 1 || statusCode == 4) {
                                LIZJ(EnumC118584l4.SEND_UNEXPECTED_FAIL);
                            }
                        } else {
                            LIZJ(EnumC118584l4.SEND_UNEXPECTED_FAIL);
                        }
                    }
                    int msgType = c109544Rq.getMsgType();
                    if (msgType != 5) {
                        if (msgType != 7) {
                            return;
                        }
                        LIZJ(EnumC118584l4.TEXT_FAIL);
                        return;
                    }
                    EnumC110124Tw.Companion.getClass();
                    BaseContent LIZJ = C110134Tx.LIZJ(c109544Rq);
                    if (LIZJ == null) {
                        return;
                    }
                    int i = LIZJ.type;
                    if (i != 501) {
                        if (i != 502) {
                            if (i != 504) {
                                LIZJ(EnumC118584l4.BIG_EMOJI_FAIL);
                                return;
                            }
                            return;
                        }
                        LIZJ(EnumC118584l4.SEARCH_GIF_FAIL);
                        return;
                    }
                    LIZJ(EnumC118584l4.SELF_EMOJI_FAIL);
                    return;
                }
                LIZJ(EnumC118584l4.SEND_SUCCESS);
                int msgType2 = c109544Rq.getMsgType();
                if (msgType2 != 5) {
                    if (msgType2 != 7) {
                        return;
                    }
                    LIZJ(EnumC118584l4.TEXT_SUCCESS);
                    return;
                }
                EnumC110124Tw.Companion.getClass();
                BaseContent LIZJ2 = C110134Tx.LIZJ(c109544Rq);
                if (LIZJ2 == null) {
                    return;
                }
                int i2 = LIZJ2.type;
                if (i2 != 501) {
                    if (i2 != 502) {
                        if (i2 != 504) {
                            LIZJ(EnumC118584l4.BIG_EMOJI_SUCCESS);
                            return;
                        }
                        return;
                    }
                    LIZJ(EnumC118584l4.SEARCH_GIF_SUCCESS);
                    return;
                }
                LIZJ(EnumC118584l4.SELF_EMOJI_SUCCESS);
            }

            public final void LIZJ(EnumC118584l4 enumC118584l4) {
                this.LIZ.incrementAndGet(enumC118584l4.ordinal());
            }

            @Override // X.AnonymousClass455
            public final void LIZ(String conversationId, String str) {
                o.LJIIIZ(conversationId, "conversationId");
                long LIZLLL = C81273Gx.LIZLLL(conversationId);
                AtomicIntegerArray stats = this.LIZ;
                String processId = C3Y4.LIZJ;
                C85323Wm onEventV3 = C772831o.LIZ();
                o.LJIIIZ(stats, "stats");
                o.LJIIIZ(processId, "processId");
                o.LJIIIZ(onEventV3, "onEventV3");
                if (stats.length() == EnumC118584l4.values().length) {
                    C1HQ c1hq = new C1HQ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('[');
                    int i = stats.get(EnumC118584l4.SEND_SUCCESS.ordinal());
                    EnumC118584l4 enumC118584l4 = EnumC118584l4.SEND_FAIL;
                    LIZ.append(stats.get(enumC118584l4.ordinal()) + i);
                    LIZ.append(", ");
                    LIZ.append(stats.get(enumC118584l4.ordinal()));
                    LIZ.append(']');
                    c1hq.put("send_message", X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('[');
                    int i2 = stats.get(EnumC118584l4.BIG_EMOJI_SUCCESS.ordinal());
                    EnumC118584l4 enumC118584l42 = EnumC118584l4.BIG_EMOJI_FAIL;
                    LIZ2.append(stats.get(enumC118584l42.ordinal()) + i2);
                    LIZ2.append(", ");
                    LIZ2.append(stats.get(enumC118584l42.ordinal()));
                    LIZ2.append(']');
                    c1hq.put("send_emoji", X1D.LIZIZ(LIZ2));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append('[');
                    int i3 = stats.get(EnumC118584l4.SELF_EMOJI_SUCCESS.ordinal());
                    EnumC118584l4 enumC118584l43 = EnumC118584l4.SELF_EMOJI_FAIL;
                    LIZ3.append(stats.get(enumC118584l43.ordinal()) + i3);
                    LIZ3.append(", ");
                    LIZ3.append(stats.get(enumC118584l43.ordinal()));
                    LIZ3.append(']');
                    c1hq.put("send_favorite_emoji", X1D.LIZIZ(LIZ3));
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append('[');
                    int i4 = stats.get(EnumC118584l4.SEARCH_GIF_SUCCESS.ordinal());
                    EnumC118584l4 enumC118584l44 = EnumC118584l4.SEARCH_GIF_FAIL;
                    LIZ4.append(stats.get(enumC118584l44.ordinal()) + i4);
                    LIZ4.append(", ");
                    LIZ4.append(stats.get(enumC118584l44.ordinal()));
                    LIZ4.append(']');
                    c1hq.put("send_giphy", X1D.LIZIZ(LIZ4));
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append('[');
                    int i5 = stats.get(EnumC118584l4.TEXT_SUCCESS.ordinal());
                    EnumC118584l4 enumC118584l45 = EnumC118584l4.TEXT_FAIL;
                    LIZ5.append(stats.get(enumC118584l45.ordinal()) + i5);
                    LIZ5.append(", ");
                    LIZ5.append(stats.get(enumC118584l45.ordinal()));
                    LIZ5.append(']');
                    c1hq.put("send_text", X1D.LIZIZ(LIZ5));
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append('[');
                    int i6 = stats.get(EnumC118584l4.VIDEO_SUCCESS.ordinal());
                    EnumC118584l4 enumC118584l46 = EnumC118584l4.VIDEO_FAIL;
                    LIZ6.append(stats.get(enumC118584l46.ordinal()) + i6);
                    LIZ6.append(", ");
                    LIZ6.append(stats.get(enumC118584l46.ordinal()));
                    LIZ6.append(']');
                    c1hq.put("send_video", X1D.LIZIZ(LIZ6));
                    c1hq.put("to_user_id", String.valueOf(LIZLLL));
                    c1hq.put("process_id", processId);
                    onEventV3.LIZIZ("chat_stats", c1hq);
                }
                long LIZLLL2 = C81273Gx.LIZLLL(conversationId);
                AtomicIntegerArray stats2 = this.LIZ;
                C118564l2 c118564l2 = C118564l2.LIZ;
                o.LJIIIZ(stats2, "stats");
                if (stats2.length() != EnumC118584l4.values().length) {
                    return;
                }
                C1HQ LIZJ = HXX.LIZJ("event", "chat_stats", "label", "message");
                LIZJ.put("success_cnt", String.valueOf(stats2.get(EnumC118584l4.SEND_SUCCESS.ordinal())));
                LIZJ.put("fail_cnt", String.valueOf(stats2.get(EnumC118584l4.SEND_UNEXPECTED_FAIL.ordinal())));
                LIZJ.put("session_id", String.valueOf(LIZLLL2));
                LIZJ.put("source_type", str);
                c118564l2.LIZ(LIZJ);
            }
        };
        PO8 po8 = new PO8("ChatRoomViewModel");
        C78588Usq c78588Usq = new C78588Usq();
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        C73318Sq2 c73318Sq22 = new C73318Sq2();
        AbstractC73946T0k LIZ = T16.LIZ();
        o.LJIIIIZZ(LIZ, "io()");
        if (C115494g5.LIZ()) {
            C99733vl LIZ2 = C98783uE.LIZ();
            LIZ2.getClass();
            o.LJIIIZ(sessionInfo, "sessionInfo");
            if (LIZ2.LJ.compareAndSet(false, true)) {
                LIZ2.LIZ.invoke(LIZ2.LJFF);
            }
            String conversationId = sessionInfo.getConversationId();
            ConcurrentHashMap<String, InterfaceC99713vj> concurrentHashMap = LIZ2.LIZLLL;
            InterfaceC99713vj interfaceC99713vj = concurrentHashMap.get(conversationId);
            InterfaceC99713vj interfaceC99713vj2 = (interfaceC99713vj == null && (interfaceC99713vj = concurrentHashMap.putIfAbsent(conversationId, (interfaceC99713vj2 = LIZ2.LIZIZ.invoke(sessionInfo.getConversationId(), Boolean.valueOf(sessionInfo.isGroupChat()), Boolean.valueOf(sessionInfo.isReportPage()), Boolean.valueOf(LIZ2.LIZJ))))) == null) ? interfaceC99713vj2 : interfaceC99713vj;
            o.LJIIIIZZ(interfaceC99713vj2, "cache.getOrPut(convId) {…teMsgModel(sessionInfo) }");
            LJ = interfaceC99713vj2;
        } else {
            LJ = c44d.LJ(sessionInfo);
        }
        C99843vw c99843vw = new C99843vw(LJ);
        XIA ioDispatcher = C78613UtF.LIZJ;
        C44N c44n = new C44N();
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(userRepository, "userRepository");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = sessionInfo;
        this.LJLILLLLZI = c44d;
        this.LJLJI = c106884Hk;
        this.LJLJJI = anonymousClass455;
        this.LJLJJL = po8;
        this.LJLJJLL = c78588Usq;
        this.LJLJL = c73318Sq2;
        this.LJLJLJ = c73318Sq22;
        this.LJLJLLL = LIZ;
        this.LJLL = LJ;
        this.LJLLI = userRepository;
        this.LJLLILLLL = c99843vw;
        this.LJLLJ = ioDispatcher;
        this.LJLLL = c44n;
        this.LJLLLL = new C73893SzJ<>();
        this.LJLLLLLL = new C73893SzJ<>();
        this.LJLZ = new C73893SzJ<>();
        this.LJZ = EnumC95013o9.FULL;
        this.LJZL = true;
        this.LL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1068));
        Boolean bool = Boolean.FALSE;
        XLM LIZ3 = V8H.LIZ(bool);
        this.LLD = LIZ3;
        XLM LIZ4 = V8H.LIZ(bool);
        this.LLF = LIZ4;
        XLM LIZ5 = V8H.LIZ(bool);
        this.LLFF = LIZ5;
        this.LLFFF = new IDeS150S0200000_1(new InterfaceC65462ha[]{LIZ3, LIZ4, LIZ5}, new C72402sm(null), 1);
    }
}
