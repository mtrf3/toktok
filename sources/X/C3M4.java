package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3M4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3M4 extends C3M6 implements C3JJ {
    public volatile boolean LJLJJLL;
    public final C82533Lt LJLJL;

    @Override // X.C3JJ
    public final void LIZLLL() {
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        this.LJLJJLL = false;
        C82213Kn.LIZ().LJ(this.LJLJL);
        this.LJLJJL = -1;
    }

    @Override // X.C3JJ
    public final void LJIIL() {
        this.LJLJJLL = false;
        C82213Kn.LIZ().LIZ(this.LJLJL);
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3Lt] */
    public C3M4(final C3MR c3mr, final C81983Jq targetSessionPage) {
        super(c3mr, targetSessionPage, "SessionRefactor-UnreadCountOfAllConversationObserver");
        o.LJIIIZ(targetSessionPage, "targetSessionPage");
        this.LJLJL = new InterfaceC83073Nv() { // from class: X.3Lt
            @Override // X.InterfaceC83073Nv
            public final void LIZ(java.util.Map<String, Long> map, java.util.Map<String, Boolean> map2) {
                List<C3L4> LIZIZ;
                if (map == null) {
                    return;
                }
                C3M4.this.LJLJJLL = true;
                if (!c3mr.invoke().booleanValue()) {
                    return;
                }
                String str = C3M4.this.LJLJI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unreadMap: ");
                LIZ.append(((ConcurrentHashMap) map).size());
                LIZ.append("  notifyMap:");
                Integer num = null;
                if (map2 != null) {
                    num = Integer.valueOf(((ConcurrentHashMap) map2).size());
                }
                LIZ.append(num);
                C81843Jc.LIZJ(str, X1D.LIZIZ(LIZ));
                C81833Jb LJ = C81843Jc.LJ();
                EnumC81823Ja enumC81823Ja = EnumC81823Ja.INBOX_MEDIATOR;
                C3JU c3ju = C3JU.UNREAD_COUNT;
                LJ.LIZLLL(enumC81823Ja, c3ju);
                int LIZJ = C82213Kn.LIZ().LIZJ();
                C3M4.this.LJLJJL = LIZJ;
                C82543Lu LIZ2 = C3K3.LIZ();
                C81983Jq sessionPage = targetSessionPage;
                LIZ2.getClass();
                o.LJIIIZ(sessionPage, "sessionPage");
                AbstractC82423Li abstractC82423Li = (AbstractC82423Li) ((ConcurrentHashMap) LIZ2.LJLLL).get(sessionPage);
                if (abstractC82423Li == null || (LIZIZ = abstractC82423Li.LIZIZ()) == null) {
                    LIZIZ = C61878OQg.INSTANCE;
                }
                C3M4.this.LJ(LIZJ, LIZIZ);
                C3M4.this.getClass();
                C3M6.LJFF(LIZJ);
                C81843Jc.LJ().LIZIZ(enumC81823Ja, c3ju);
                String str2 = C3M4.this.LJLJI;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("PrimaryUnreadCountObserver onUpdate: ");
                LIZ3.append(LIZJ);
                C81843Jc.LIZJ(str2, X1D.LIZIZ(LIZ3));
            }
        };
    }

    @Override // X.C3M6, X.InterfaceC82123Ke
    public final void LIZ(C81983Jq c81983Jq, List<? extends C3L4> sessionList) {
        o.LJIIIZ(sessionList, "sessionList");
        if (!o.LJ(c81983Jq.LIZ, this.LJLILLLLZI.LIZ)) {
            String str = this.LJLJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sessionPage: ");
            LIZ.append(c81983Jq);
            LIZ.append(" targetPage: ");
            LIZ.append(this.LJLILLLLZI);
            C81843Jc.LIZIZ(str, X1D.LIZIZ(LIZ));
            return;
        }
        if (!this.LJLJJLL) {
            C81843Jc.LIZJ(this.LJLJI, "unread count of all conversation not ready");
        } else {
            this.LJLJJL = C82213Kn.LIZ().LIZJ();
            super.LIZ(c81983Jq, sessionList);
        }
    }

    @Override // X.InterfaceC82123Ke
    public final void LIZJ(List<? extends C3L4> sessionList, boolean z) {
        o.LJIIIZ(sessionList, "sessionList");
        String str = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSessionListChange: ");
        LIZ.append(sessionList.size());
        C81843Jc.LIZIZ(str, X1D.LIZIZ(LIZ));
        this.LJLJJLL = true;
    }
}
