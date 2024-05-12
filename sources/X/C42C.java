package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.42C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42C {
    public final String LIZ;
    public final C1047549f LIZIZ;
    public final C1047549f LIZJ;

    public final void LIZ() {
        C34B.LIZIZ("UnreadIndicatorStateMachine", "initIndicatorStateMachine");
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(this.LIZ);
        if (LIZ == null) {
            return;
        }
        if (LIZ.getUnreadCount() > 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("unreadCount: ");
            LIZ2.append(LIZ.getUnreadCount());
            C34B.LIZIZ("UnreadIndicatorStateMachine", X1D.LIZIZ(LIZ2));
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C42B(this, LIZ, null), 3);
            return;
        }
        AnonymousClass325.LIZ.getClass();
        boolean LJFF = AnonymousClass325.LJFF(AnonymousClass325.LJ(LIZ));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("shouldShowUnreadReaction: ");
        LIZ3.append(LJFF);
        LIZ3.append(' ');
        C34B.LIZIZ("UnreadIndicatorStateMachine", X1D.LIZIZ(LIZ3));
        if (!LJFF) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C42D(this, null), 3);
    }

    public C42C(View rootView, RecyclerView recyclerView, final AbstractC1038245q adapter, final ChatRoomViewModel chatRoomViewModel, C99033ud sessionInfo, String conversationId) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(chatRoomViewModel, "chatRoomViewModel");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(conversationId, "conversationId");
        this.LIZ = conversationId;
        C1047549f c1047549f = new C1047549f(rootView, recyclerView, adapter, sessionInfo, chatRoomViewModel, new InterfaceC1047349d() { // from class: X.43u
            @Override // X.InterfaceC1047349d
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1047349d
            public final int LJ() {
                return R.plurals.r_;
            }

            @Override // X.InterfaceC1047349d
            public final InterfaceC88472Yns<Long, Integer> LIZ() {
                return new AqS167S0100000_1(AbstractC1029742j.this, 219);
            }

            @Override // X.InterfaceC1047349d
            public final InterfaceC88472Yns<Long, C1033643w> LIZIZ() {
                return new AqS132S0200000_1(AbstractC1029742j.this, chatRoomViewModel, 41);
            }

            @Override // X.InterfaceC1047349d
            public final Object LIZJ(String str, InterfaceC67352kd<? super C32M> interfaceC67352kd) {
                return C32K.LIZ(str, interfaceC67352kd);
            }
        });
        this.LIZIZ = c1047549f;
        C1047549f c1047549f2 = new C1047549f(rootView, recyclerView, adapter, sessionInfo, chatRoomViewModel, new InterfaceC1047349d() { // from class: X.43v
            @Override // X.InterfaceC1047349d
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1047349d
            public final int LJ() {
                return R.plurals.ra;
            }

            @Override // X.InterfaceC1047349d
            public final InterfaceC88472Yns<Long, Integer> LIZ() {
                return new AqS167S0100000_1(AbstractC1029742j.this, 220);
            }

            @Override // X.InterfaceC1047349d
            public final InterfaceC88472Yns<Long, C1033643w> LIZIZ() {
                return new AqS132S0200000_1(AbstractC1029742j.this, chatRoomViewModel, 42);
            }

            @Override // X.InterfaceC1047349d
            public final Object LIZJ(String str, InterfaceC67352kd<? super C32M> interfaceC67352kd) {
                return C32D.LIZ(str, interfaceC67352kd);
            }
        });
        this.LIZJ = c1047549f2;
        adapter.LJLLLLLL(c1047549f);
        adapter.LJLLLLLL(c1047549f2);
    }
}
