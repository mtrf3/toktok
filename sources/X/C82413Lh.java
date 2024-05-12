package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.mediator.InboxSessionMediator$notifySelectionChange$1", f = "InboxSessionMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Lh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82413Lh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C82543Lu LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82413Lh(int i, int i2, C82543Lu c82543Lu, InterfaceC67352kd<? super C82413Lh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = c82543Lu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82413Lh(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AbstractC82423Li abstractC82423Li;
        C3MD LIZ;
        AbstractC82423Li abstractC82423Li2;
        C141335gf.LIZJ(obj);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tabFilter: ");
        LIZ2.append(this.LJLIL);
        LIZ2.append("  filterType:");
        LIZ2.append(this.LJLILLLLZI);
        C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", X1D.LIZIZ(LIZ2));
        java.util.Map<C81983Jq, AbstractC82423Li> map = this.LJLJI.LJLLL;
        int i = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        Iterator it = ((ConcurrentHashMap) map).entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((C81983Jq) entry.getKey()).LIZIZ.getValue() == i && ((C81983Jq) entry.getKey()).LIZJ.getValue() == i2 && (abstractC82423Li = (AbstractC82423Li) entry.getValue()) != null) {
                    break;
                }
            } else {
                C82543Lu c82543Lu = this.LJLJI;
                int i3 = this.LJLIL;
                int i4 = this.LJLILLLLZI;
                c82543Lu.getClass();
                C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", "not found the target selection");
                EnumC82443Lk.Companion.getClass();
                EnumC82443Lk LIZ3 = C82693Mj.LIZ(i3);
                EnumC82403Lg.Companion.getClass();
                EnumC82403Lg LIZ4 = C82393Lf.LIZ(i4);
                if (LIZ3 == EnumC82443Lk.ALL && LIZ4 == EnumC82403Lg.ALL) {
                    abstractC82423Li = c82543Lu.LJII();
                } else if (LIZ3 == EnumC82443Lk.PRIMARY && LIZ4 == EnumC82403Lg.ALL) {
                    abstractC82423Li = (AbstractC82423Li) c82543Lu.LJLLJ.getValue();
                } else if (LIZ3 == EnumC82443Lk.SECONDARY && LIZ4 == EnumC82403Lg.ALL) {
                    abstractC82423Li = new C3MV();
                } else {
                    final C81983Jq c81983Jq = new C81983Jq(LIZ3, LIZ4, new AqS132S0200000_1(LIZ3, LIZ4, 78), new AqS132S0200000_1(LIZ3, LIZ4, 79));
                    abstractC82423Li = new AbstractC82423Li(c81983Jq) { // from class: X.3N0
                        public final C81983Jq LJLJLLL;

                        @Override // X.AbstractC82423Li
                        public final C81983Jq LIZJ() {
                            return this.LJLJLLL;
                        }

                        {
                            this.LJLJLLL = c81983Jq;
                        }
                    };
                }
                c82543Lu.LIZIZ(abstractC82423Li);
                abstractC82423Li.LJIIL();
            }
        }
        C81983Jq sessionPage = abstractC82423Li.LIZJ();
        this.LJLJI.LJLLI = sessionPage;
        if (C3KQ.LIZ().cacheStrategy == 1) {
            java.util.Set keySet = ((ConcurrentHashMap) this.LJLJI.LJLLL).keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : keySet) {
                C81983Jq c81983Jq2 = (C81983Jq) obj2;
                if (c81983Jq2.LIZJ != EnumC82403Lg.ALL && !o.LJ(c81983Jq2.LIZ, sessionPage.LIZ)) {
                    arrayList.add(obj2);
                }
            }
            C82543Lu c82543Lu2 = this.LJLJI;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c82543Lu2.LJIILLIIL((C81983Jq) it2.next());
            }
        }
        for (AbstractC82423Li abstractC82423Li3 : ((ConcurrentHashMap) this.LJLJI.LJLLL).values()) {
            abstractC82423Li3.getClass();
            o.LJIIIZ(sessionPage, "sessionPage");
            if (o.LJ(abstractC82423Li3.LIZJ().LIZ, sessionPage.LIZ)) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("this is the target page: ");
                LIZ5.append(sessionPage);
                C81843Jc.LIZIZ("SessionRefactor-DefaultInboxTabHandler", X1D.LIZIZ(LIZ5));
                abstractC82423Li3.LIZLLL();
                C3MD c3md = abstractC82423Li3.LJLJJI;
                if (c3md == null) {
                    c3md = new C3MD((List) null, true, abstractC82423Li3.LIZJ().LIZIZ.getValue(), abstractC82423Li3.LIZJ().LIZJ.getValue(), 0, 33);
                }
                abstractC82423Li3.LJLJJI = c3md;
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("cacheData: ");
                LIZ6.append(c3md);
                C81843Jc.LIZIZ("SessionRefactor-DefaultInboxTabHandler", X1D.LIZIZ(LIZ6));
                if (c3md.LIZ.isEmpty() && c3md.LIZIZ) {
                    abstractC82423Li3.LJI();
                } else {
                    abstractC82423Li3.LJIIIZ();
                }
            } else {
                abstractC82423Li3.LJIILIIL();
                C81803Iy LIZ7 = C771431a.LIZ();
                C81983Jq sessionPage2 = abstractC82423Li3.LIZJ();
                LIZ7.getClass();
                o.LJIIIZ(sessionPage2, "sessionPage");
                LIZ7.LJIIJJI(new C37Y(LIZ7, sessionPage2, null));
            }
            Iterator<InterfaceC82123Ke> it3 = abstractC82423Li3.LJLJL.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ(sessionPage, abstractC82423Li3.LIZIZ());
            }
        }
        if (C3KQ.LIZ().initNewPageWithMemorySession && abstractC82423Li.LIZJ().LIZJ != EnumC82403Lg.ALL) {
            Iterator it4 = ((ConcurrentHashMap) this.LJLJI.LJLLL).entrySet().iterator();
            while (true) {
                if (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    C81983Jq c81983Jq3 = (C81983Jq) entry2.getKey();
                    if (c81983Jq3.LIZIZ == sessionPage.LIZIZ && c81983Jq3.LIZJ == EnumC82403Lg.ALL && (abstractC82423Li2 = (AbstractC82423Li) entry2.getValue()) != null) {
                        List<C3L4> LIZIZ = abstractC82423Li2.LIZIZ();
                        ArrayList arrayList2 = new ArrayList();
                        for (C3L4 c3l4 : LIZIZ) {
                            if (sessionPage.LIZLLL.invoke(c3l4).booleanValue()) {
                                arrayList2.add(c3l4);
                            }
                        }
                        LIZ = C3MD.LIZ(abstractC82423Li.LJIIIIZZ(arrayList2, true), null, false, false, 47);
                    }
                } else {
                    LIZ = abstractC82423Li.LIZ();
                    break;
                }
            }
        } else {
            LIZ = abstractC82423Li.LIZ();
        }
        this.LJLJI.getClass();
        C82543Lu.LJIILJJIL(null).LIZLLL(EnumC81823Ja.INBOX_MEDIATOR, C3JU.POST_TO_INBOX);
        C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", "pass data down: " + LIZ);
        this.LJLJI.LJIIIZ().onNext(LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
