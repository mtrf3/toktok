package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager;
import kotlin.jvm.internal.o;

/* renamed from: X.44h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1034744h {
    public final C1034344d LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public C1034744h(C1034344d mediator) {
        o.LJIIIZ(mediator, "mediator");
        this.LIZ = mediator;
    }

    public final void LIZIZ(EnumC1035144l type) {
        ChatLinearLayoutManager chatLinearLayoutManager;
        o.LJIIIZ(type, "type");
        RecyclerView recyclerView = this.LIZ.LJLJLLL;
        boolean z = false;
        if (recyclerView != null) {
            recyclerView.LJLIL(0);
        }
        RecyclerView recyclerView2 = this.LIZ.LJLJLLL;
        C0A2 c0a2 = null;
        if (recyclerView2 != null) {
            c0a2 = recyclerView2.getLayoutManager();
        }
        if ((c0a2 instanceof ChatLinearLayoutManager) && (chatLinearLayoutManager = (ChatLinearLayoutManager) c0a2) != null) {
            if (type == EnumC1035144l.SEND_MSG || type == EnumC1035144l.SCROLL_TO_SUG_WHEN_ENTER) {
                z = true;
            }
            chatLinearLayoutManager.LLIIJLIL = z;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("smoothScrollToBottom:");
        LIZ.append(type);
        V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
    }

    public final void LIZ(int i, int i2, EnumC1035144l type) {
        LinearLayoutManager linearLayoutManager;
        o.LJIIIZ(type, "type");
        RecyclerView recyclerView = this.LIZ.LJLJLLL;
        C0A2 c0a2 = null;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        }
        if (!(c0a2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) c0a2) == null) {
            return;
        }
        linearLayoutManager.LJFF(i, i2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scrollToBottomWithOffset: position:");
        LIZ.append(i);
        LIZ.append(" offset:");
        LIZ.append(i2);
        LIZ.append(", type:");
        LIZ.append(type);
        V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
    }
}
