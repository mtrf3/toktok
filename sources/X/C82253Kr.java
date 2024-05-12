package X;

import Y.AObserverS69S0100000_1;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastMessageProperty;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import djb.IDaS20S0000000_1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS26S0210000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.3Kr */
/* loaded from: classes2.dex */
public final class C82253Kr extends C3L0 implements InterfaceC83423Pe, C37Q {
    public static volatile C82253Kr LLFFF;
    public final C97963su LJLJJL = new C97963su();
    public final C64962gm LJLJJLL;
    public final C82153Kh LJLJL;
    public final XI8 LJLJLJ;
    public final java.util.Map<String, C3L4> LJLJLLL;
    public final AObserverS69S0100000_1 LJLL;
    public C63120Opw LJLLI;
    public C3LG LJLLILLLL;
    public final C81983Jq LJLLJ;
    public final C81983Jq LJLLL;
    public C3L2 LJLLLL;
    public final C82373Ld LJLLLLLL;
    public final C3L7 LJLZ;
    public final C81933Jl LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C37N LL;
    public final C62822Ol8 LLD;
    public String LLF;
    public final C3LC LLFF;

    public final C3M9 LJIILL() {
        return (C3M9) this.LJZL.getValue();
    }

    public final C3NQ LJIJ() {
        return (C3NQ) this.LLD.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.3L7] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.3Jl] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.37N] */
    public C82253Kr() {
        Executor LJFF;
        C64962gm LIZ = C48841JEv.LIZ(T2R.LJIIJJI().plus(C78613UtF.LIZJ).plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 20)));
        this.LJLJJLL = LIZ;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C37156Ei8.LJLIL);
        this.LJLJL = new C82153Kh(this.LJLILLLLZI, LIZ, this);
        if ((C3SX.LIZ() & 1) != 0) {
            LJFF = (Executor) LIZIZ.getValue();
            o.LJIIIIZZ(LJFF, "{\n            serialExecutorForDM\n        }");
        } else {
            LJFF = C38995FSd.LJFF();
            o.LJIIIIZZ(LJFF, "{\n            ThreadPool…erialExecutor()\n        }");
        }
        this.LJLJLJ = new XI8(LJFF);
        EnumC82443Lk enumC82443Lk = EnumC82443Lk.PRIMARY;
        EnumC82403Lg enumC82403Lg = EnumC82403Lg.ALL;
        this.LJLLJ = LJIIIZ(enumC82443Lk, enumC82403Lg, false);
        this.LJLLL = LJIIIZ(EnumC82443Lk.ALL, enumC82403Lg, true);
        this.LJLLLLLL = C82373Ld.LJLIL;
        this.LJLZ = new InterfaceC55887LwZ() { // from class: X.3L7
            @Override // X.InterfaceC55887LwZ
            public final void LIZ(boolean z) {
                ((ConcurrentHashMap) C82253Kr.this.LJLJI).clear();
                IMServiceProvider.INSTANCE.getInboxDmService().clearDMUnreadCache();
                C3K4 c3k4 = C3K4.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("11(");
                LIZ2.append(z);
                LIZ2.append(')');
                C3K4.LIZJ(c3k4, X1D.LIZIZ(LIZ2));
                C82253Kr.this.LJIJJLI();
                InterfaceC81953Jn LJ = C82253Kr.this.LJ();
                if (LJ != null) {
                    C82253Kr c82253Kr = C82253Kr.this;
                    if (LJ.LJII().isEmpty() && LJ.LJIILL()) {
                        C82253Kr.LJJI(c82253Kr);
                    } else {
                        C3L0.LJIIIIZZ(c82253Kr, 0, LJ, 3);
                    }
                }
            }
        };
        this.LJLJLLL = new ConcurrentHashMap();
        this.LJLL = new AObserverS69S0100000_1(this, 116);
        this.LJZ = new C4WS() { // from class: X.3Jl
            @Override // X.C4WS
            public final void LJI() {
            }

            @Override // X.C4WS
            public final void LJII() {
            }

            @Override // X.C4WS
            public final void LJIIJJI(C81913Jj result, C4WE onFilterResult) {
                o.LJIIIZ(result, "result");
                o.LJIIIZ(onFilterResult, "onFilterResult");
                C82253Kr c82253Kr = C82253Kr.this;
                XKX.LIZLLL(c82253Kr.LJLJJLL, c82253Kr.LJLJLJ, null, new C81943Jm(result, c82253Kr, onFilterResult, null), 2);
            }
        };
        this.LJZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 948));
        this.LJZL = C221108m2.LIZIZ(C3LT.LJLIL);
        this.LL = new C4WV() { // from class: X.37N
            @Override // X.InterfaceC120024nO
            public final void BH(List<C63089OpR> list) {
            }

            @Override // X.InterfaceC120024nO
            public final void CN(C63120Opw c63120Opw) {
            }

            @Override // X.InterfaceC120024nO
            public final void DH(List<C63089OpR> list) {
            }

            @Override // X.InterfaceC120024nO
            public final int JG() {
                return 0;
            }

            @Override // X.InterfaceC120024nO
            public final void MO(List<C63089OpR> list) {
            }

            @Override // X.InterfaceC120024nO
            public final void Mi(String str, List<C63089OpR> list) {
            }

            @Override // X.InterfaceC120024nO
            public final void Tu(C63120Opw c63120Opw) {
            }

            @Override // X.C4WP
            public final void dU(java.util.Map<String, C63120Opw> map) {
            }

            @Override // X.InterfaceC120024nO
            public final void hW(int i, String str) {
            }

            @Override // X.InterfaceC120024nO
            public final void tq0(int i, String str, List list) {
            }

            @Override // X.InterfaceC120024nO
            public final void f3(C63120Opw c63120Opw) {
                String str;
                if (c63120Opw == null) {
                    return;
                }
                for (Map.Entry entry : ((ConcurrentHashMap) C82253Kr.this.LJLJI).entrySet()) {
                    C81983Jq c81983Jq = (C81983Jq) entry.getKey();
                    InterfaceC81953Jn interfaceC81953Jn = (InterfaceC81953Jn) entry.getValue();
                    if (interfaceC81953Jn.LJII().containsKey(c63120Opw.getConversationId())) {
                        interfaceC81953Jn.LJII().remove(c63120Opw.getConversationId());
                        String str2 = c81983Jq.LIZ;
                        C81983Jq c81983Jq2 = C82253Kr.this.LJLJJI;
                        if (c81983Jq2 != null) {
                            str = c81983Jq2.LIZ;
                        } else {
                            str = null;
                        }
                        if (o.LJ(str2, str)) {
                            C76662ze c76662ze = C76662ze.LJLIL;
                            int value = EnumC76652zd.REMOVE_RECOMMENDED_FLAG.getValue();
                            c76662ze.getClass();
                            C76662ze.LJIIJJI(value, c63120Opw);
                            C82253Kr.this.LJJIIZ(interfaceC81953Jn);
                        }
                    }
                    C97963su c97963su = C82253Kr.this.LJLJJL;
                    String conversationId = c63120Opw.getConversationId();
                    o.LJIIIIZZ(conversationId, "conversation.conversationId");
                    boolean isEmpty = interfaceC81953Jn.LJII().isEmpty();
                    c97963su.getClass();
                    C97963su.LIZ(conversationId, isEmpty);
                }
            }

            @Override // X.InterfaceC120024nO
            public final void we0(C63120Opw c63120Opw) {
                if (c63120Opw == null) {
                    return;
                }
                C82253Kr c82253Kr = C82253Kr.this;
                XKX.LIZLLL(c82253Kr.LJLJJLL, c82253Kr.LJLJLJ, null, new C37M(c82253Kr, c63120Opw, null), 2);
            }

            @Override // X.InterfaceC120024nO
            public final void y9(int i, C63120Opw c63120Opw) {
                if (c63120Opw == null) {
                    return;
                }
                C82253Kr c82253Kr = C82253Kr.this;
                XKX.LIZLLL(c82253Kr.LJLJJLL, c82253Kr.LJLJLJ, null, new C37L(c63120Opw, i, c82253Kr, null), 2);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("mObserver onUpdateConversation reason: ");
                LIZ2.append(i);
                C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ2));
            }
        };
        this.LLD = C221108m2.LIZIZ(C3LQ.LJLIL);
        this.LLF = "";
        this.LLFF = new C3LC(this);
    }

    public final void LJIIJ() {
        C96423qQ.LIZ();
        if (C4Z2.LJIILJJIL() != null) {
            C95773pN c95773pN = C95773pN.LJLIL;
            c95773pN.getClass();
            C95773pN.LJLILLLLZI.clear();
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C4WC.LIZIZ.LJFF(c95773pN);
            XKX.LIZLLL(this.LJLJJLL, EXV.LIZ, null, new C37G(this, null), 2);
        }
    }

    public final void LJIJJLI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initSessionPage, isCreatorLayoutEnable=");
        LIZ.append(C3L0.LJFF());
        C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ));
        if (C3L0.LJFF()) {
            java.util.Map<C81983Jq, InterfaceC81953Jn> map = this.LJLJI;
            C81983Jq c81983Jq = this.LJLLJ;
            C81903Ji c81903Ji = InterfaceC81953Jn.LIZ;
            C82373Ld c82373Ld = this.LJLLLLLL;
            c81903Ji.getClass();
            ((ConcurrentHashMap) map).put(c81983Jq, C81903Ji.LIZ(c81983Jq, false, c82373Ld));
            if (C3KQ.LIZ().preloadSecondary) {
                C81983Jq LJIIIZ = LJIIIZ(EnumC82443Lk.SECONDARY, EnumC82403Lg.ALL, false);
                ((ConcurrentHashMap) this.LJLJI).put(LJIIIZ, C81903Ji.LIZ(LJIIIZ, false, this.LJLLLLLL));
            }
            this.LJLJJI = this.LJLLJ;
            return;
        }
        java.util.Map<C81983Jq, InterfaceC81953Jn> map2 = this.LJLJI;
        C81983Jq c81983Jq2 = this.LJLLL;
        C81903Ji c81903Ji2 = InterfaceC81953Jn.LIZ;
        C82373Ld c82373Ld2 = this.LJLLLLLL;
        c81903Ji2.getClass();
        ((ConcurrentHashMap) map2).put(c81983Jq2, C81903Ji.LIZ(c81983Jq2, true, c82373Ld2));
        this.LJLJJI = this.LJLLL;
    }

    public static List LJIIL(Collection collection) {
        boolean LIZ = C3U8.LIZ();
        C96963rI.LIZLLL().getClass();
        boolean LIZ2 = C84563To.LIZ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            C3L4 c3l4 = (C3L4) obj;
            if (!LIZ || !c3l4.LLI) {
                if (!LIZ2) {
                    C82223Ko c82223Ko = C99033ud.Companion;
                    String LJFF = c3l4.LJFF();
                    c82223Ko.getClass();
                    if (!C82223Ko.LIZ(LJFF)) {
                    }
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static OSZ LJIILJJIL(C63120Opw c63120Opw) {
        C109544Rq lastShowMessage;
        if (c63120Opw.isSingleChat()) {
            long LIZLLL = C81273Gx.LIZLLL(c63120Opw.getConversationId());
            return new OSZ(String.valueOf(LIZLLL), C79004UzY.LJIIL(c63120Opw, String.valueOf(LIZLLL)));
        }
        if (!c63120Opw.isGroupChat() || (lastShowMessage = c63120Opw.getLastShowMessage()) == null) {
            return null;
        }
        return new OSZ(String.valueOf(lastShowMessage.getSender()), lastShowMessage.getSecSender());
    }

    public static void LJJI(C82253Kr c82253Kr) {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        InterfaceC81953Jn LJ = c82253Kr.LJ();
        c82253Kr.getClass();
        if (LJ == null) {
            C34B.LJI("SessionListManagerV2", "load more can not find current pagination page");
            return;
        }
        if (!LJ.LJIILL() || LJ.isLoading()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("load more blocked: ");
            LIZ.append(LJ);
            C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ));
            Iterator it = c82253Kr.LJLIL.iterator();
            while (it.hasNext()) {
                ((C3LO) it.next()).xE(LJ.LJIILL());
            }
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("loadMore: begin, currPage=");
        LIZ2.append(c82253Kr.LJLJJI);
        LIZ2.append(", ");
        LIZ2.append(LJ);
        C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ2));
        if (C4WC.LJIJJLI(LJ.LJIILIIL(), LJ.LJIIJ().L(LJ.LIZIZ().LIZJ), new C81963Jo(LJ.LIZIZ().LIZ, LJ.LIZIZ().LIZIZ.getValue()))) {
            LJ.setLoading(true);
        }
        C3L0.LJIIIIZZ(c82253Kr, 0, LJ, 3);
    }

    @Override // X.InterfaceC83423Pe
    public final void LIZJ(C3LB c3lb) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStrangerBoxUpdate: ");
        if (c3lb != null) {
            str = c3lb.LIZ();
        } else {
            str = null;
        }
        C48690J9a.LJIIL(LIZ, str, LIZ, "SessionListManagerV2");
        XKX.LIZLLL(this.LJLJJLL, null, null, new C82263Ks(c3lb, this, null), 3);
    }

    @Override // X.C3L0
    public final void LJI(boolean z) {
        InterfaceC81953Jn LJ = LJ();
        if (LJ == null) {
            C34B.LIZJ("SessionListManagerV2", "refresh, currentPaginationData is null");
        } else {
            C3L0.LJIIIIZZ(this, 0, LJ, 3);
        }
    }

    public final List<C3L4> LJIILIIL(boolean z) {
        ArrayList arrayList = new ArrayList();
        java.util.Map<C81983Jq, InterfaceC81953Jn> map = this.LJLJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
            if (C3L0.LJFF()) {
                if (((C81983Jq) entry.getKey()).LIZIZ != EnumC82443Lk.ALL) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if (((C81983Jq) entry.getKey()).LIZIZ == EnumC82443Lk.ALL) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((InterfaceC81953Jn) it.next()).LJII().values());
        }
        if (z) {
            C40675Fxn.LJJLIIIJ(arrayList, this.LJLLLLLL);
        }
        return LJIIL(arrayList);
    }

    public final void LJJIFFI(InterfaceC81953Jn interfaceC81953Jn) {
        LJJII(false, interfaceC81953Jn.LJIIIIZZ(LJIIL(interfaceC81953Jn.LJII().values()), ((ConcurrentHashMap) this.LJLJLLL).values()), interfaceC81953Jn, true);
    }

    public final void LJJIIZ(InterfaceC81953Jn paginationData) {
        o.LJIIIZ(paginationData, "paginationData");
        C82153Kh c82153Kh = this.LJLJL;
        c82153Kh.getClass();
        Handler handler = c82153Kh.LIZ;
        Message obtainMessage = handler.obtainMessage(2);
        obtainMessage.obj = paginationData;
        handler.sendMessage(obtainMessage);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserUpdate$im_base_release(C3LP event) {
        String str;
        o.LJIIIZ(event, "event");
        if (!C84673Tz.LIZ()) {
            return;
        }
        Iterator it = ((ConcurrentHashMap) this.LJLJI).entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC81953Jn interfaceC81953Jn = (InterfaceC81953Jn) ((Map.Entry) it.next()).getValue();
            Collection<C3L4> values = interfaceC81953Jn.LJII().values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<C3L4> it2 = values.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C3L4 next = it2.next();
                        if ((next instanceof C3L3) && !(next instanceof C3L2)) {
                            IMUser iMUser = ((C3L3) next).LLIIIZ;
                            if (iMUser != null) {
                                str = iMUser.getUid();
                            } else {
                                str = null;
                            }
                            if (o.LJ(str, event.LJLIL)) {
                                ConcurrentHashSet LJIILJJIL = interfaceC81953Jn.LJIILJJIL();
                                String str2 = event.LJLIL;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                LJIILJJIL.add(str2);
                                LJJIIZ(interfaceC81953Jn);
                            }
                        }
                    }
                }
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void updateU16Settings(C3K2 c3k2) {
        C34B.LJI("SessionListManagerV2", "updateU16Settings");
        if (AV1.LJIIJJI()) {
            return;
        }
        if (C80763Ey.LIZLLL()) {
            C34B.LJI("SessionListManagerV2", "updateU16Settings is login");
            InterfaceC81953Jn LJ = LJ();
            if (LJ == null) {
                return;
            }
            C3L0.LJIIIIZZ(this, 0, LJ, 3);
            return;
        }
        if (C82903Ne.LIZ()) {
            C82213Kn.LIZ().LIZIZ();
        }
        Iterator it = ((ConcurrentHashMap) this.LJLJI).entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC81953Jn interfaceC81953Jn = (InterfaceC81953Jn) ((Map.Entry) it.next()).getValue();
            interfaceC81953Jn.LJFF(0);
            interfaceC81953Jn.LJIIIZ(0L);
            interfaceC81953Jn.LIZLLL(false);
            interfaceC81953Jn.LJII().clear();
            C3L0.LJIIIIZZ(this, 0, interfaceC81953Jn, 3);
        }
        LJJIII(0, true, C61878OQg.INSTANCE);
    }

    @Override // X.C3LS
    public final void LIZ(int i, InterfaceC81953Jn interfaceC81953Jn) {
        this.LJLJL.LIZIZ(i, interfaceC81953Jn);
    }

    @Override // X.C3L0
    public final void LIZLLL(C3LO<C3L4> observer, Handler handler) {
        o.LJIIIZ(observer, "observer");
        o.LJIIIZ(handler, "handler");
        super.LIZLLL(observer, handler);
        InterfaceC81953Jn LJ = LJ();
        if (LJ == null) {
            return;
        }
        C3L0.LJIIIIZZ(this, 0, LJ, 3);
        LJJIFFI(LJ);
        C3LU.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "im_conversation_fast_load", true) == 1 && LJ.LJII().isEmpty()) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            if (C4WC.LJIJJ()) {
                C75782yE.LIZ();
                C4WC.LJIIL();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI(C63120Opw c63120Opw, C81983Jq c81983Jq) {
        C3MY c3my;
        String str;
        UrlModel urlModel;
        int i;
        InterfaceC81953Jn interfaceC81953Jn = (InterfaceC81953Jn) ((ConcurrentHashMap) this.LJLJI).get(c81983Jq);
        if (interfaceC81953Jn != null && !interfaceC81953Jn.LJII().containsKey(c63120Opw.getConversationId())) {
            C97963su c97963su = this.LJLJJL;
            new C43001GuD();
            c97963su.getClass();
            if (LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZLLL("bookmode_dm")) {
                if (c63120Opw.isSingleChat()) {
                    long LIZLLL = C81273Gx.LIZLLL(c63120Opw.getConversationId());
                    AnonymousClass325.LIZ.getClass();
                    LastMessageProperty LJ = AnonymousClass325.LJ(c63120Opw);
                    String LJIIL = C79004UzY.LJIIL(c63120Opw, String.valueOf(LIZLLL));
                    IMUser LJIIJ = C80533Eb.LJIIJ(String.valueOf(LIZLLL), LJIIL);
                    C3L3 c3l3 = new C3L3(LJIIJ, LJIIL);
                    c3l3.LJLILLLLZI = c63120Opw.getConversationId();
                    c3l3.LJLZ = C78609UtB.LJJIL(c63120Opw);
                    c3l3.LLIIIL = C100013wD.LIZ(c63120Opw);
                    c3l3.LJLIL = c63120Opw.getSortOrder();
                    c3l3.LJLLILLLL = (int) c63120Opw.getUnreadCount();
                    c3l3.LJLJLJ = System.currentTimeMillis();
                    c3l3.LJLJLLL = -1;
                    c3l3.LJIIJJI(System.currentTimeMillis());
                    if (LJIIJ != null) {
                        str = LJIIJ.getDisplayName();
                    } else {
                        str = null;
                    }
                    c3l3.LJLJJI = str;
                    if (LJIIJ != null) {
                        urlModel = LJIIJ.getAvatarThumb();
                    } else {
                        urlModel = null;
                    }
                    c3l3.LJLJI = urlModel;
                    c3l3.LJLLJ = AnonymousClass325.LJFF(LJ);
                    c3l3.LJLLL = AnonymousClass325.LJI(LJ);
                    c3l3.LJLLLL = c63120Opw.isStickTop();
                    c3l3.LL = c63120Opw.isMute();
                    c3l3.LLF = new C82493Lp(0, 0, 3, null);
                    c3l3.LJLJJL = "";
                    c3l3.LJZI = false;
                    c3l3.LLII = EnumC96553qd.SUCCESS;
                    if (C79004UzY.LJJIIJZLJL(c63120Opw)) {
                        i = 25;
                    } else {
                        i = c3l3.LJLLLLLL;
                    }
                    c3l3.LJLLLLLL = i;
                    c3l3.LLFF = false;
                    c3l3.LLFFF = false;
                    c3my = c3l3;
                    if (c63120Opw.isStranger()) {
                        long j = c3l3.LJLJL;
                        C3LD c3ld = new C3LD();
                        c3my = c3l3;
                        if (j > c3ld.LIZ.getLong("TIMESTAMP", 0L)) {
                            c3ld.LIZ.storeLong("TIMESTAMP", j);
                            c3my = c3l3;
                        }
                    }
                } else {
                    if (!c63120Opw.isGroupChat()) {
                        return;
                    }
                    C3MY c3my2 = new C3MY();
                    c3my2.LJLILLLLZI = c63120Opw.getConversationId();
                    c3my2.LJLZ = C78609UtB.LJJIL(c63120Opw);
                    c3my2.LJLLILLLL = (int) c63120Opw.getUnreadCount();
                    c3my2.LJLJLJ = System.currentTimeMillis();
                    c3my2.LJIIJJI(System.currentTimeMillis());
                    c3my2.LJLIL = c63120Opw.getSortOrder();
                    C81093Gf.LIZ().getClass();
                    c3my2.LJLJI = C3IY.LIZIZ(c63120Opw);
                    c3my2.LLII = EnumC96553qd.SUCCESS;
                    c3my2.LJZI = false;
                    c3my2.LJLJJI = C84283Sm.LIZLLL(c63120Opw);
                    c3my2.LJLLJ = false;
                    c3my2.LJLLLL = c63120Opw.isStickTop();
                    c3my2.LL = c63120Opw.isMute();
                    c3my2.LLF = new C82493Lp(0, 0, 3, null);
                    c3my2.LJLJJL = "";
                    c3my2.LLFFF = false;
                    c3my2.LLIIIILZ = c63120Opw.getMemberCount();
                    c3my2.LLIIIJ = C84283Sm.LJII(c63120Opw);
                    c3my2.LLIIIL = C84283Sm.LJ(c63120Opw);
                    c3my = c3my2;
                }
                java.util.Map<String, C3L4> LJII = interfaceC81953Jn.LJII();
                String LJFF = c3my.LJFF();
                o.LJIIIIZZ(LJFF, "session.sessionID");
                LJII.put(LJFF, c3my);
            }
        }
    }

    public final int LJIIZILJ(List<? extends C3L4> list, boolean z) {
        int i = 0;
        if (z) {
            return 0;
        }
        int LIZJ = C81413Hl.LIZJ(list, new AqS183S0100000_1(this, 98));
        LJIJ().LJIIIIZZ();
        LJIJ().LIZ();
        Collection values = ((ConcurrentHashMap) this.LJLJLLL).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof C3L2) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i += ((C3L4) it.next()).LJLLILLLL;
        }
        if (!o.LJ(this.LLF, String.valueOf(i))) {
            this.LLF = String.valueOf(i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unreadRequestCount: ");
            LIZ.append(i);
            C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ));
        }
        return LIZJ + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(kotlin.jvm.internal.AqS33S0301000_1 r8, X.InterfaceC67352kd r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C3LE
            if (r0 == 0) goto L3e
            r6 = r9
            X.3LE r6 = (X.C3LE) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L44
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            X.3Jn r3 = r7.LJ()
            if (r3 == 0) goto L20
        L2d:
            X.UtN r2 = X.C36636EZk.LIZ
            X.3M7 r1 = new X.3M7
            r0 = 0
            r1.<init>(r8, r7, r3, r0)
            r6.LJLJI = r4
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r6)
            if (r0 != r5) goto L20
            return r5
        L3e:
            X.3LE r6 = new X.3LE
            r6.<init>(r7, r9)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82253Kr.LJIJI(kotlin.jvm.internal.AqS33S0301000_1, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJ(kotlin.jvm.internal.AqS33S0301000_1 r12, X.InterfaceC67352kd r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C3LF
            r6 = r11
            if (r0 == 0) goto L6a
            r2 = r13
            X.3LF r2 = (X.C3LF) r2
            int r3 = r2.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L6a
            int r3 = r3 - r1
            r2.LJLJI = r3
        L13:
            java.lang.Object r4 = r2.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r2.LJLJI
            r3 = 1
            if (r0 == 0) goto L24
            if (r0 != r3) goto L70
            X.C141335gf.LIZJ(r4)
        L21:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L24:
            X.C141335gf.LIZJ(r4)
            java.util.Map<X.3Jq, X.3Jn> r4 = r6.LJLJI
            boolean r0 = X.C3L0.LJFF()
            if (r0 == 0) goto L67
            X.3Jq r0 = r6.LJLLJ
        L31:
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            java.lang.Object r8 = r4.get(r0)
            X.3Jn r8 = (X.InterfaceC81953Jn) r8
            if (r8 == 0) goto L21
            java.util.Map r0 = r8.LJII()
            java.util.Collection r0 = r0.values()
            java.util.List r9 = LJIIL(r0)
            X.3LC r0 = r6.LLFF
            r0.getClass()
            boolean r0 = X.C53405Kxd.LIZJ()
            int r7 = r6.LJIIZILJ(r9, r0)
            X.UtN r0 = X.C36636EZk.LIZ
            X.3M8 r4 = new X.3M8
            r10 = 0
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r2.LJLJI = r3
            java.lang.Object r0 = X.XKX.LJI(r0, r4, r2)
            if (r0 != r1) goto L21
            return r1
        L67:
            X.3Jq r0 = r6.LJLLL
            goto L31
        L6a:
            X.3LF r2 = new X.3LF
            r2.<init>(r6, r13)
            goto L13
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82253Kr.LJIJJ(kotlin.jvm.internal.AqS33S0301000_1, X.2kd):java.lang.Object");
    }

    public static C81983Jq LJIIIZ(EnumC82443Lk enumC82443Lk, EnumC82403Lg enumC82403Lg, boolean z) {
        return new C81983Jq(enumC82443Lk, enumC82403Lg, new AqS26S0210000_1(enumC82443Lk, enumC82403Lg, z, 5), new AqS132S0200000_1(enumC82443Lk, enumC82403Lg, 82));
    }

    public static void LJJIII(int i, boolean z, List list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyNoticeManager, unreadCount:");
        LIZ.append(i);
        C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ));
        IMServiceProvider.INSTANCE.getInboxDmService().onReceiveUnreadCount(list, i, z);
    }

    public static Object LJJIIJ(List list, InterfaceC67352kd interfaceC67352kd, boolean z) {
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OSZ LJIILJJIL = LJIILJJIL((C63120Opw) it.next());
            if (LJIILJJIL != null) {
                arrayList.add(LJIILJJIL);
            }
        }
        return C80533Eb.LJIILJJIL(C80533Eb.LIZ, arrayList, null, z, interfaceC67352kd, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // X.C37Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r16, X.InterfaceC81953Jn r17, X.InterfaceC67352kd<? super X.C76800UCe> r18) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82253Kr.LIZIZ(int, X.3Jn, X.2kd):java.lang.Object");
    }

    @Override // X.C3L0
    public final void LJII(int i, Handler handler, InterfaceC81953Jn interfaceC81953Jn) {
        o.LJIIIZ(handler, "handler");
        this.LJLJL.LIZ(i, handler, interfaceC81953Jn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.3Kr, X.3L0] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.3LM] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.3L4, X.3L3] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.3L4, X.3L3] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.C3LC r14, X.InterfaceC81953Jn r15, X.InterfaceC67352kd r16) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82253Kr.LJIILLIIL(X.3LC, X.3Jn, X.2kd):java.lang.Object");
    }

    public final void LJJII(boolean z, List<? extends C3L4> data, InterfaceC81953Jn currentPaginationData, boolean z2) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(currentPaginationData, "currentPaginationData");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dispatching conversations: size: ");
        LIZ.append(data.size());
        LIZ.append(" isFastLoad: ");
        LIZ.append(z);
        LIZ.append(" observerSetSize: ");
        LIZ.append(this.LJLIL.size());
        LIZ.append(" paginationData=");
        LIZ.append(currentPaginationData);
        C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ));
        if (z2) {
            C3K4.LIZ.LIZ(data.size(), currentPaginationData.LIZIZ());
            Iterator it = this.LJLIL.iterator();
            while (it.hasNext()) {
                ((C3LO) it.next()).rn(ORZ.LLJILJILJ(data), currentPaginationData.LJIILL(), currentPaginationData.isLoading(), currentPaginationData.LIZIZ());
            }
            return;
        }
        if (!currentPaginationData.LJIIJJI() && !z) {
            return;
        }
        C3K5 c3k5 = C3K5.LJLIL;
        boolean isEmpty = data.isEmpty();
        synchronized (c3k5) {
            if (isEmpty) {
                C3K5.LJLILLLLZI.remove("refresh_start");
            } else {
                C3K5.LIZJ("refresh_end", null);
            }
        }
        C3K4.LIZ.LIZ(data.size(), currentPaginationData.LIZIZ());
        Iterator it2 = this.LJLIL.iterator();
        while (it2.hasNext()) {
            ((C3LO) it2.next()).rn(ORZ.LLJILJILJ(data), currentPaginationData.LJIILL(), currentPaginationData.isLoading(), currentPaginationData.LIZIZ());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0238 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJZLJL(X.C3LM r23, boolean r24, boolean r25, X.InterfaceC67352kd<? super X.C76800UCe> r26) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82253Kr.LJJIIJZLJL(X.3LM, boolean, boolean, X.2kd):java.lang.Object");
    }

    public static /* synthetic */ OSZ LJJ(C82253Kr c82253Kr, List list, InterfaceC81953Jn interfaceC81953Jn, boolean z, int i) {
        boolean z2;
        long j;
        boolean z3;
        boolean z4 = z;
        if ((i & 4) != 0) {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z2 = interfaceC81953Jn.LJIILL();
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            j = interfaceC81953Jn.LJIILIIL();
        } else {
            j = 0;
        }
        if ((i & 32) != 0) {
            z3 = interfaceC81953Jn.isLoading();
        } else {
            z3 = false;
        }
        return c82253Kr.LJIL(list, interfaceC81953Jn, z4, z2, j, z3);
    }

    public final OSZ<List<C63120Opw>, Boolean> LJIL(List<? extends C63120Opw> list, InterfaceC81953Jn paginationData, boolean z, boolean z2, long j, boolean z3) {
        Integer num;
        o.LJIIIZ(paginationData, "paginationData");
        C81983Jq LIZIZ = paginationData.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("insertOrUpdatePaginationData: start, sessionPage=");
        LIZ.append(LIZIZ);
        LIZ.append(", size=");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ));
        paginationData.LIZLLL(z2);
        paginationData.LJIIIZ(j);
        paginationData.setLoading(z3);
        if ((C3SX.LIZ() & 2048) != 0) {
            XKX.LJ(MBB.INSTANCE, new C37E(this, list, null));
        }
        if (list != null && (!list.isEmpty())) {
            C34K c34k = new C34K();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("insertOrUpdateSessionMap: list.size=");
            LIZ2.append(list.size());
            LIZ2.append(", hasMore=");
            LIZ2.append(paginationData.LJIILL());
            LIZ2.append(", nextCursor=");
            LIZ2.append(paginationData.LJIILIIL());
            C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ2));
            ArrayList arrayList = new ArrayList();
            for (C63120Opw c63120Opw : list) {
                if (!LIZIZ.LJ.invoke(c63120Opw).booleanValue()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("conversation not in category ");
                    LIZ3.append(LIZIZ);
                    String msg = X1D.LIZIZ(LIZ3);
                    o.LJIIIZ(msg, "msg");
                    if (paginationData.LJII().remove(c63120Opw.getConversationId()) != null) {
                        paginationData.getDebugInfo().LIZ++;
                        c34k.element = true;
                    }
                    if (z) {
                        paginationData.getDebugInfo().LIZIZ++;
                    }
                } else {
                    arrayList.add(c63120Opw);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int LJ = paginationData.LJ();
            C81603Ie c81603Ie = new C81603Ie(arrayList2, paginationData, linkedHashSet, z, LIZIZ, c34k, this);
            int i = C3KQ.LIZ().batchConvertSize;
            if (i <= 0 || arrayList.size() <= LJ) {
                c81603Ie.invoke(Boolean.FALSE, arrayList);
            } else {
                ORZ.LJLJI(arrayList, i, new AqS167S0100000_1(c81603Ie, 372));
            }
            if (z) {
                paginationData.getDebugInfo().LIZLLL += arrayList2.size();
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("insertOrUpdatePaginationData: after insert, paginationData=");
            LIZ4.append(paginationData);
            C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ4));
            return new OSZ<>(arrayList2, Boolean.valueOf(c34k.element));
        }
        C34B.LJI("SessionListManagerV2", "insertOrUpdateSessionMap conversationList is empty");
        return new OSZ<>(C61878OQg.INSTANCE, Boolean.FALSE);
    }
}
