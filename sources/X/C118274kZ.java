package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4kZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118274kZ extends C0A6 implements InterfaceC1029942l {
    public final int LJLIL;
    public final List<C109544Rq> LJLILLLLZI = new ArrayList();
    public XKQ LJLJI;
    public final /* synthetic */ ChatRoomAlphaVideoComponent LJLJJI;

    @Override // X.InterfaceC1029942l
    public final void Hp() {
    }

    @Override // X.InterfaceC1029942l
    public final void Og() {
    }

    @Override // X.InterfaceC1029942l
    public final void Ah(AbstractC89473fD event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.InterfaceC1029942l
    public final void IP(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void QG(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void Vj(List<? extends C109544Rq> list) {
        o.LJIIIZ(list, "list");
        if (list.isEmpty()) {
            return;
        }
        ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = this.LJLJJI;
        if (!chatRoomAlphaVideoComponent.LJLJJLL && (this.LJLIL & 2) > 0) {
            if (chatRoomAlphaVideoComponent.LJLJL) {
                LJIIZILJ(list, false);
                return;
            }
            ((ArrayList) this.LJLILLLLZI).clear();
            ((ArrayList) this.LJLILLLLZI).addAll(list);
            this.LJLJJI.LJLLILLLL = true;
        }
    }

    @Override // X.InterfaceC1029942l
    public final void ik0(List<? extends C109544Rq> list) {
        o.LJIIIZ(list, "list");
        if (list.isEmpty()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trigger check for animated emoji in onDataChanged size=");
        LIZ.append(list.size());
        LIZ.append(" isFirstCheck=");
        LIZ.append(this.LJLJJI.LJLJJLL);
        LIZ.append(" isResumed=");
        LIZ.append(this.LJLJJI.LJLJL);
        C34B.LIZIZ("ChatRoomAlphaVideoComponent", X1D.LIZIZ(LIZ));
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLILLLLZI).addAll(list);
        ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = this.LJLJJI;
        if (chatRoomAlphaVideoComponent.LJLJJLL) {
            if ((this.LJLIL & 4) > 0) {
                LJIILLIIL(this.LJLILLLLZI, true);
            }
            if ((this.LJLIL & 2) > 0) {
                LJIIZILJ(this.LJLILLLLZI, true);
            }
            this.LJLJJI.LJLJJLL = false;
            return;
        }
        if (!chatRoomAlphaVideoComponent.LJLJL || (this.LJLIL & 4) <= 0) {
            return;
        }
        LJIILLIIL(this.LJLILLLLZI, false);
    }

    @Override // X.InterfaceC1029942l
    public final void rD(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void zG(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    public C118274kZ(ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent, int i) {
        this.LJLJJI = chatRoomAlphaVideoComponent;
        this.LJLIL = i;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && (this.LJLIL & 4) > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("trigger check for animated emoji in onScrollStateChanged size=");
            LIZ.append(((ArrayList) this.LJLILLLLZI).size());
            C34B.LIZIZ("ChatRoomAlphaVideoComponent", X1D.LIZIZ(LIZ));
            LJIILLIIL(this.LJLILLLLZI, false);
        }
    }

    public final void LJIILLIIL(List<? extends C109544Rq> list, boolean z) {
        XKQ xkq = this.LJLJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = this.LJLJJI;
        this.LJLJI = XKX.LIZLLL(chatRoomAlphaVideoComponent, C78613UtF.LIZJ, null, new C118284ka(chatRoomAlphaVideoComponent, z, list, null), 2);
    }

    public final void LJIIZILJ(List<? extends C109544Rq> list, boolean z) {
        ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = this.LJLJJI;
        XKX.LIZLLL(chatRoomAlphaVideoComponent, C78613UtF.LIZJ, null, new C118294kb(chatRoomAlphaVideoComponent, z, list, null), 2);
    }

    @Override // X.InterfaceC1029942l
    public final void s50(AbstractC1041546x holder, C109544Rq c109544Rq) {
        o.LJIIIZ(holder, "holder");
    }
}
