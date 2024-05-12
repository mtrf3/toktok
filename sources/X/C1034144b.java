package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.44b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1034144b {
    public final ChatRoomViewModel LIZ;
    public final C99033ud LIZIZ;
    public final C1034344d LIZJ;
    public Long LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final C62822Ol8 LJI;

    public final void LIZ(C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        Long l;
        Long l2;
        Integer num = null;
        if (c109544Rq != null) {
            l = Long.valueOf(c109544Rq.getOrderIndex());
        } else {
            l = null;
        }
        LIZIZ(l, false);
        if (c109544Rq2 != null) {
            c109544Rq2.getOrderIndex();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeAnchor: orderIndex:");
        if (c109544Rq != null) {
            l2 = Long.valueOf(c109544Rq.getOrderIndex());
        } else {
            l2 = null;
        }
        LIZ.append(l2);
        LIZ.append(" type:");
        if (c109544Rq != null) {
            num = Integer.valueOf(c109544Rq.getMsgType());
        }
        LIZ.append(num);
        V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
    }

    public final void LIZIZ(Long l, boolean z) {
        if (z || this.LIZLLL == null) {
            this.LIZLLL = l;
            this.LJ = false;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("changeAnchor: orderIndex:");
            LIZ.append(l);
            LIZ.append(" force:");
            LIZ.append(z);
            V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
        }
    }

    public C1034144b(ChatRoomViewModel chatRoomViewModel, C99033ud c99033ud, C1034344d mediator) {
        o.LJIIIZ(mediator, "mediator");
        this.LIZ = chatRoomViewModel;
        this.LIZIZ = c99033ud;
        this.LIZJ = mediator;
        C221108m2.LIZIZ(C1034044a.LJLIL);
        this.LJI = C221108m2.LIZIZ(AnonymousClass450.LJLIL);
    }
}
