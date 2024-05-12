package X;

import Y.IDhS94S0100000_1;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.3Lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82543Lu implements C3JJ, MLD<C3MD>, C3JL {
    public static final C62822Ol8 LL = C221108m2.LIZIZ(C3N1.LJLIL);
    public static final C62822Ol8 LLD = C221108m2.LIZIZ(C82733Mn.LJLIL);
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C3NA.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C3N9.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C3N8.LJLIL);
    public volatile boolean LJLJJI;
    public volatile InboxSocPubStatusViewModelImpl LJLJJL;
    public volatile TuxActionSheet LJLJJLL;
    public final List<C3MX> LJLJL;
    public final List<C3JJ> LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public volatile C81983Jq LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final java.util.Map<C81983Jq, AbstractC82423Li> LJLLL;
    public volatile InterfaceC79150V4o LJLLLL;
    public final java.util.Map<String, InterfaceC82853Mz> LJLLLLLL;
    public final C82433Lj LJLZ;
    public volatile boolean LJZ;
    public volatile boolean LJZI;
    public final ConcurrentHashSet LJZL;

    @Override // X.C3JJ
    public final void LJIIL() {
        this.LJZI = true;
        C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", "hire");
        EventBus.LIZJ().LJIILJJIL(this);
        C55888Lwa.LIZIZ.LJI(this.LJLZ);
        LJIILL();
        Iterator<C3JJ> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJIIL();
        }
    }

    @Override // X.C3JJ
    public final void LIZLLL() {
        if (!this.LJZI) {
            LJIIL();
        }
        LJIIZILJ(new C82583Ly(this, null));
    }

    @Override // X.MLD
    public final void LJ() {
        LJIIZILJ(new C3M3(this, null));
    }

    public final C82513Lr LJII() {
        return (C82513Lr) this.LJLLILLLL.getValue();
    }

    public final AbstractC82423Li LJIIIIZZ() {
        C81983Jq c81983Jq = this.LJLLI;
        if (c81983Jq != null) {
            return (AbstractC82423Li) ((ConcurrentHashMap) this.LJLLL).get(c81983Jq);
        }
        return null;
    }

    public final C73849Syb<C3MD> LJIIIZ() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-inboxSubject>(...)");
        return (C73849Syb) value;
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", "finish work");
        this.LJZ = false;
        this.LJZI = false;
        EventBus.LIZJ().LJIJ(this);
        C55888Lwa.LIZIZ.LJIJ(this.LJLZ);
        this.LJLJJLL = null;
        this.LJLJJL = null;
        Iterator<C3JJ> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJIIJ();
        }
        this.LJLJLJ.clear();
        ((ConcurrentHashMap) this.LJLLL).clear();
        this.LJLLI = null;
        C3E6.LIZJ();
        C98533tp.LIZIZ();
        this.LJZL.clear();
        LJIIIZ().onNext(new C3MD((List) null, false, 0, 0, 0, 63));
    }

    @Override // X.MLD
    public final void LJIIJJI() {
        LJIIZILJ(new C3MC(this, null));
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
        LJIIZILJ(new C3M1(this, null));
    }

    public final void LJIILL() {
        if (C55888Lwa.LIZIZ.LJJI(true)) {
            LIZIZ((AbstractC82423Li) this.LJLLJ.getValue());
            if (C3KQ.LIZ().preloadSecondary) {
                LIZIZ(new C3MV());
            }
            this.LJLLI = ((C3MA) this.LJLLJ.getValue()).LJLJLLL;
            return;
        }
        LIZIZ(LJII());
        this.LJLLI = LJII().LJLJLLL;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.3Lj] */
    public C82543Lu() {
        List<C3MX> synchronizedList = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList, "synchronizedList(mutableListOf())");
        this.LJLJL = synchronizedList;
        List<C3JJ> synchronizedList2 = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList2, "synchronizedList(mutableListOf())");
        this.LJLJLJ = synchronizedList2;
        this.LJLJLLL = C221108m2.LIZIZ(C82713Ml.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C3MW.LJLIL);
        this.LJLLILLLL = C221108m2.LIZIZ(C82803Mu.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(C82813Mv.LJLIL);
        this.LJLLL = new ConcurrentHashMap();
        this.LJLLLLLL = new LinkedHashMap();
        this.LJLZ = new InterfaceC55887LwZ() { // from class: X.3Lj
            @Override // X.InterfaceC55887LwZ
            public final void LIZ(boolean z) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("creator config change: ");
                LIZ.append(z);
                C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", X1D.LIZIZ(LIZ));
                IMServiceProvider.INSTANCE.getInboxDmService().clearDMUnreadCache();
                java.util.Set keySet = ((ConcurrentHashMap) C82543Lu.this.LJLLL).keySet();
                C82543Lu c82543Lu = C82543Lu.this;
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    c82543Lu.LJIILLIIL((C81983Jq) it.next());
                }
                C82543Lu.this.LJIILL();
                Iterator it2 = ((ConcurrentHashMap) C82543Lu.this.LJLLL).values().iterator();
                while (it2.hasNext()) {
                    ((AbstractC82423Li) it2.next()).LJIIL();
                }
                C81983Jq c81983Jq = C82543Lu.this.LJLLI;
                if (c81983Jq != null) {
                    C82543Lu.this.I0(c81983Jq.LIZIZ.getValue(), c81983Jq.LIZJ.getValue());
                }
            }
        };
        this.LJZL = new ConcurrentHashSet();
    }

    @Override // X.MLD
    public final AbstractC73672Svk<C3MD> LIZJ() {
        return new C73426Srm(LJIIIZ().LJJJ((AbstractC73946T0k) this.LJLL.getValue()).LJJIJL(new IDhS94S0100000_1(this, 9))).LJIILIIL();
    }

    public static C3OZ LJFF(InterfaceC82723Mm interfaceC82723Mm) {
        C3OZ c3oz;
        if (interfaceC82723Mm instanceof C3TO) {
            c3oz = (C3OZ) ((C3N5) C3N5.LIZIZ.getValue()).LIZ.getValue();
        } else if (interfaceC82723Mm instanceof C3TQ) {
            c3oz = (C3OZ) ((C83143Oc) C83143Oc.LIZIZ.getValue()).LIZ.getValue();
        } else if (interfaceC82723Mm instanceof C3TP) {
            c3oz = (C3OZ) ((C83333Ov) C83333Ov.LIZIZ.getValue()).LIZ.getValue();
        } else if (interfaceC82723Mm instanceof C3TR) {
            c3oz = (C3OZ) ((C83213Oj) C83213Oj.LIZIZ.getValue()).LIZ.getValue();
        } else {
            c3oz = (C3OZ) ((C83373Oz) C83373Oz.LIZIZ.getValue()).LIZ.getValue();
        }
        if (c3oz instanceof C2TS) {
            return c3oz;
        }
        return null;
    }

    public static List LJI(C82543Lu c82543Lu) {
        c82543Lu.getClass();
        ArrayList arrayList = new ArrayList();
        java.util.Map<C81983Jq, AbstractC82423Li> map = c82543Lu.LJLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
            if (C55888Lwa.LIZIZ.LJJI(true)) {
                if (((C81983Jq) entry.getKey()).LIZIZ != EnumC82443Lk.ALL) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if (((C81983Jq) entry.getKey()).LIZIZ == EnumC82443Lk.ALL) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((AbstractC82423Li) it.next()).LIZIZ());
        }
        C40675Fxn.LJJLIIIJ(arrayList, (Comparator) LLD.getValue());
        return arrayList;
    }

    public static C81833Jb LJIILJJIL(C81983Jq c81983Jq) {
        if (c81983Jq != null) {
            return C81843Jc.LIZLLL(c81983Jq);
        }
        return C81843Jc.LJ();
    }

    public final void LIZIZ(AbstractC82423Li abstractC82423Li) {
        ((ConcurrentHashMap) this.LJLLL).put(abstractC82423Li.LIZJ(), abstractC82423Li);
        this.LJLJLJ.add(abstractC82423Li);
    }

    public final void LJIILLIIL(C81983Jq c81983Jq) {
        AbstractC82423Li abstractC82423Li = (AbstractC82423Li) ((ConcurrentHashMap) this.LJLLL).remove(c81983Jq);
        if (abstractC82423Li != null) {
            abstractC82423Li.LJIIJ();
            boolean remove = this.LJLJLJ.remove(abstractC82423Li);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("remove page:");
            LIZ.append(c81983Jq);
            LIZ.append(" isSuccess:");
            LIZ.append(remove);
            C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", X1D.LIZIZ(LIZ));
        }
    }

    public final XKQ LJIIZILJ(InterfaceC88471Ynr interfaceC88471Ynr) {
        return C771431a.LIZ().LJIIJJI(interfaceC88471Ynr);
    }

    @QD3
    public final void onTabChangeEvent(C209108Io event) {
        o.LJIIIZ(event, "event");
        LJIIZILJ(new C3M2(event, this, null));
    }

    public static void LJIJ(C82543Lu c82543Lu, int i) {
        String str;
        C3MD LJJZZIII;
        List<C3ML> list;
        int i2 = 0;
        if ((i & 1) != 0 && (LJJZZIII = c82543Lu.LJIIIZ().LJJZZIII()) != null && (list = LJJZZIII.LIZ) != null) {
            i2 = list.size();
        }
        String str2 = null;
        if ((i & 2) != 0) {
            str = MainPageFragmentImpl.LJI().LJJLIIIJJI();
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = "button";
        }
        c82543Lu.getClass();
        StringBuilder LIZ = C06830Op.LIZ("trackChatListEvent : ", i2, "....", str, "...");
        LIZ.append(str2);
        LIZ.append("....");
        LIZ.append(i2);
        C81843Jc.LIZIZ("SessionRefactor-InboxSessionMediator", X1D.LIZIZ(LIZ));
        C3TV.LJII(C3TV.LIZ, i2, str, str2, i2);
    }

    @Override // X.MLD
    public final void I0(int i, int i2) {
        LJIIZILJ(new C82413Lh(i, i2, this, null));
    }

    @Override // X.C3JL
    public final void LIZ(InterfaceC82043Jw interfaceC82043Jw, C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("newData come : ");
        LIZ.append(sessionPage.LIZIZ);
        LIZ.append(": ");
        LIZ.append(interfaceC82043Jw);
        C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", X1D.LIZIZ(LIZ));
        C81833Jb LJIILJJIL = LJIILJJIL(sessionPage);
        EnumC81823Ja enumC81823Ja = EnumC81823Ja.INBOX_MEDIATOR;
        C3JU c3ju = C3JU.CONVERT;
        LJIILJJIL.LIZLLL(enumC81823Ja, c3ju);
        AbstractC82423Li abstractC82423Li = (AbstractC82423Li) ((ConcurrentHashMap) this.LJLLL).get(sessionPage);
        if (abstractC82423Li != null) {
            C3MD LJIIIIZZ = abstractC82423Li.LJIIIIZZ(interfaceC82043Jw.LIZ(), interfaceC82043Jw.V());
            LJIILJJIL(sessionPage).LIZIZ(enumC81823Ja, c3ju);
            LJIIZILJ(new C82593Lz(this, null));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sessionPage: ");
            LIZ2.append(sessionPage);
            LIZ2.append("   currentSessionPage:");
            LIZ2.append(this.LJLLI);
            C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", X1D.LIZIZ(LIZ2));
            if (o.LJ(sessionPage, this.LJLLI)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("inboxSubject.onNext:");
                LIZ3.append(LJIIIIZZ);
                C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", X1D.LIZIZ(LIZ3));
                LJIILJJIL(null).LIZLLL(enumC81823Ja, C3JU.POST_TO_INBOX);
                LJIIIZ().onNext(LJIIIIZZ);
            }
        }
    }
}
