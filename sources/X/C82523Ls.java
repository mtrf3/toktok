package X;

import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS71S0110000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82523Ls extends C3M6 {
    public final C62822Ol8 LJLJJLL;

    public final C3NQ LJI() {
        return (C3NQ) this.LJLJJLL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82523Ls(C3MP c3mp, C81983Jq targetSessionPage) {
        super(c3mp, targetSessionPage, "SessionRefactor-UnreadCountInTabObserver");
        o.LJIIIZ(targetSessionPage, "targetSessionPage");
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 947));
    }

    @Override // X.InterfaceC82123Ke
    public final void LIZJ(List<? extends C3L4> sessionList, boolean z) {
        o.LJIIIZ(sessionList, "sessionList");
        if (!this.LJLIL.invoke().booleanValue()) {
            return;
        }
        String str = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSessionListChange: sessionList: ");
        LIZ.append(sessionList.size());
        C81843Jc.LIZJ(str, X1D.LIZIZ(LIZ));
        C81843Jc.LJ().LIZJ("getUnreadCount");
        C81843Jc.LIZJ(this.LJLJI, "unread count of the all page");
        int LIZJ = C81413Hl.LIZJ(sessionList, new AqS71S0110000_1(C3U8.LIZ(), this, 0));
        LJI().LJIIIIZZ();
        LJI().LIZ();
        C81843Jc.LJ().LIZ("getUnreadCount");
        this.LJLJJL = LIZJ;
        String str2 = this.LJLJI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("unreadCount : ");
        LIZ2.append(LIZJ);
        C81843Jc.LIZJ(str2, X1D.LIZIZ(LIZ2));
        C81843Jc.LJ().LIZJ("upload unread count");
        LJ(LIZJ, sessionList);
        C3M6.LJFF(LIZJ);
        C81843Jc.LJ().LIZ("upload unread count");
    }
}
