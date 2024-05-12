package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99843vw implements InterfaceC1029942l {
    public final InterfaceC99713vj LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    @Override // X.InterfaceC1029942l
    public final void Hp() {
    }

    @Override // X.InterfaceC1029942l
    public final void Og() {
        int LJII = this.LJLIL.LJII();
        if (this.LJLILLLLZI == 1) {
            return;
        }
        this.LJLJI = this.LJLIL.LJII();
        this.LJLIL.LIZIZ(LJII);
        this.LJLILLLLZI = 1;
        this.LJLIL.LJFF();
    }

    public C99843vw(InterfaceC99713vj messageModel) {
        o.LJIIIZ(messageModel, "messageModel");
        this.LJLIL = messageModel;
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
    }

    @Override // X.InterfaceC1029942l
    public final void ik0(List<? extends C109544Rq> list) {
        o.LJIIIZ(list, "list");
    }

    @Override // X.InterfaceC1029942l
    public final void rD(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void zG(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // X.InterfaceC1029942l
    public final void s50(AbstractC1041546x holder, C109544Rq c109544Rq) {
        o.LJIIIZ(holder, "holder");
    }
}
