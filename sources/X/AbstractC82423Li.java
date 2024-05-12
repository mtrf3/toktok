package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3Li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82423Li implements C3JJ {
    public C3MD LJLJJI;
    public final List<InterfaceC82123Ke> LJLJJLL;
    public final List<InterfaceC82123Ke> LJLJL;
    public final List<C3JJ> LJLJLJ;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C82663Mg.LJLIL);
    public boolean LJLILLLLZI = true;
    public final java.util.Map<String, C3L4> LJLJI = new ConcurrentHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 972));

    public abstract C81983Jq LIZJ();

    public final void LJI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZJ());
        LIZ.append(" loadMore");
        C81843Jc.LIZIZ("SessionRefactor-DefaultInboxTabHandler", X1D.LIZIZ(LIZ));
        if (!this.LJLILLLLZI) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZJ());
            LIZ2.append(" no more session");
            C81843Jc.LIZIZ("SessionRefactor-DefaultInboxTabHandler", X1D.LIZIZ(LIZ2));
            return;
        }
        C81803Iy LIZ3 = C771431a.LIZ();
        C81983Jq sessionPage = LIZJ();
        LIZ3.getClass();
        o.LJIIIZ(sessionPage, "sessionPage");
        LIZ3.LJIIJJI(new C37X(LIZ3, sessionPage, null));
    }

    public void LJIIIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZJ());
        LIZ.append(" refresh");
        C81843Jc.LIZIZ("SessionRefactor-DefaultInboxTabHandler", X1D.LIZIZ(LIZ));
        C81803Iy LIZ2 = C771431a.LIZ();
        C81983Jq sessionPage = LIZJ();
        LIZ2.getClass();
        o.LJIIIZ(sessionPage, "sessionPage");
        LIZ2.LJIIJJI(new C37Z(LIZ2, sessionPage, null));
    }

    @Override // X.C3JJ
    public void LJIIL() {
        C81803Iy LIZ = C771431a.LIZ();
        C82543Lu observer = C3K3.LIZ();
        C81983Jq sessionPage = LIZJ();
        LIZ.getClass();
        o.LJIIIZ(observer, "observer");
        o.LJIIIZ(sessionPage, "sessionPage");
        if (C3TX.LIZ()) {
            LIZ.LJIIIIZZ(observer, sessionPage);
        } else {
            LIZ.LJIIJJI(new C37W(LIZ, observer, sessionPage, null));
        }
        C81803Iy LIZ2 = C771431a.LIZ();
        C3JL observer2 = (C3JL) this.LJLJJL.getValue();
        C81983Jq sessionPage2 = LIZJ();
        LIZ2.getClass();
        o.LJIIIZ(observer2, "observer");
        o.LJIIIZ(sessionPage2, "sessionPage");
        if (C3TX.LIZ()) {
            ((ConcurrentHashMap) LIZ2.LJLLJ).put(sessionPage2, observer2);
        } else {
            LIZ2.LJIIJJI(new C37S(LIZ2, observer2, sessionPage2, null));
        }
        this.LJLILLLLZI = true;
        Iterator<C3JJ> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJIIL();
        }
        if (C3TX.LIZ()) {
            final C81983Jq LIZJ = LIZJ();
            LJII(new InterfaceC82123Ke(LIZJ) { // from class: X.3M5
                public final C81983Jq LJLIL;
                public final C62822Ol8 LJLILLLLZI;

                @Override // X.InterfaceC82123Ke
                public final C39N LIZIZ() {
                    return C39N.INBOX;
                }

                {
                    o.LJIIIZ(LIZJ, "targetPage");
                    this.LJLIL = LIZJ;
                    this.LJLILLLLZI = C221108m2.LIZIZ(C82683Mi.LJLIL);
                }

                @Override // X.InterfaceC82123Ke
                public final void LIZ(C81983Jq c81983Jq, List<? extends C3L4> sessionList) {
                    o.LJIIIZ(sessionList, "sessionList");
                }

                @Override // X.InterfaceC82123Ke
                public final void LIZJ(List<? extends C3L4> sessionList, boolean z) {
                    C3L3 c3l3;
                    IMUser iMUser;
                    String uid;
                    o.LJIIIZ(sessionList, "sessionList");
                    if (!o.LJ(C3K3.LIZ().LJLLI, this.LJLIL)) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C3L4 c3l4 : sessionList) {
                        if ((c3l4 instanceof C3L3) && (c3l3 = (C3L3) c3l4) != null && (iMUser = c3l3.LLIIIZ) != null && (uid = iMUser.getUid()) != null) {
                            arrayList.add(uid);
                        }
                    }
                    if (((java.util.Set) this.LJLILLLLZI.getValue()).containsAll(arrayList) && ((java.util.Set) this.LJLILLLLZI.getValue()).size() == arrayList.size()) {
                        C81843Jc.LIZIZ("SessionRefactor-SocPubModelObserver", "the uid has been included");
                        return;
                    }
                    ((java.util.Set) this.LJLILLLLZI.getValue()).clear();
                    ((java.util.Set) this.LJLILLLLZI.getValue()).addAll(arrayList);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(this.LJLIL);
                    LIZ3.append(": showing uid list size: ");
                    LIZ3.append(arrayList.size());
                    C81843Jc.LIZJ("SessionRefactor-SocPubModelObserver", X1D.LIZIZ(LIZ3));
                    InboxSocPubStatusViewModelImpl inboxSocPubStatusViewModelImpl = C3K3.LIZ().LJLJJL;
                    if (inboxSocPubStatusViewModelImpl != null) {
                        inboxSocPubStatusViewModelImpl.LJLJI.clear();
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        inboxSocPubStatusViewModelImpl.gv0((String[]) Arrays.copyOf(strArr, strArr.length), true);
                    }
                }
            });
        }
    }

    public final C3MD LIZ() {
        C3MD c3md = this.LJLJJI;
        if (c3md == null) {
            return new C3MD((List) null, false, LIZJ().LIZIZ.getValue(), LIZJ().LIZJ.getValue(), 0, 35);
        }
        return c3md;
    }

    public final List<C3L4> LIZIZ() {
        return ORZ.LLILII((Comparator) this.LJLIL.getValue(), new ArrayList(((ConcurrentHashMap) this.LJLJI).values()));
    }

    @Override // X.C3JJ
    public final void LIZLLL() {
        Iterator<C3JJ> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        Iterator<C3JJ> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJIIJ();
        }
        C81803Iy LIZ = C771431a.LIZ();
        C81983Jq sessionPage = LIZJ();
        LIZ.getClass();
        o.LJIIIZ(sessionPage, "sessionPage");
        if (C3TX.LIZ()) {
            LIZ.LJIILJJIL(sessionPage);
        } else {
            LIZ.LJIIJJI(new C37V(LIZ, sessionPage, null));
        }
        this.LJLJJLL.clear();
        this.LJLJL.clear();
        this.LJLILLLLZI = false;
        ((ConcurrentHashMap) this.LJLJI).clear();
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
        Iterator<C3JJ> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJIILIIL();
        }
    }

    public AbstractC82423Li() {
        List<InterfaceC82123Ke> synchronizedList = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList, "synchronizedList(mutableListOf())");
        this.LJLJJLL = synchronizedList;
        List<InterfaceC82123Ke> synchronizedList2 = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList2, "synchronizedList(mutableListOf())");
        this.LJLJL = synchronizedList2;
        List<C3JJ> synchronizedList3 = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList3, "synchronizedList(mutableListOf())");
        this.LJLJLJ = synchronizedList3;
    }

    public final boolean LJ(Object conversation) {
        C63120Opw c63120Opw;
        o.LJIIIZ(conversation, "conversation");
        if ((conversation instanceof C63120Opw) && (c63120Opw = (C63120Opw) conversation) != null && (!((C63120Opw) conversation).isFiltered() || (!C3U8.LIZ() && C82463Lm.LIZ(c63120Opw, LIZJ().LIZIZ, LIZJ().LIZJ)))) {
            return true;
        }
        return false;
    }

    public boolean LJFF(C3L4 baseSession) {
        o.LJIIIZ(baseSession, "baseSession");
        if (!(baseSession instanceof C3L2) && ((!baseSession.LLI || !C3U8.LIZ()) && C82463Lm.LIZJ(baseSession, LIZJ().LIZIZ, LIZJ().LIZJ))) {
            return true;
        }
        return false;
    }

    public final void LJII(InterfaceC82123Ke observer) {
        o.LJIIIZ(observer, "observer");
        this.LJLJJLL.add(observer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0325, code lost:
    
        if (r5 == null) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3MD LJIIIIZZ(java.util.List<? extends X.C3L4> r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC82423Li.LJIIIIZZ(java.util.List, boolean):X.3MD");
    }
}
