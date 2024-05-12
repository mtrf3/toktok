package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* JADX WARN: Incorrect field signature: TVH; */
/* renamed from: X.53c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1286453c extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ AbstractC1286553d<VH> LJLIL;
    public final /* synthetic */ AnonymousClass523 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ RecyclerView.ViewHolder LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/53d<TVH;>;LX/523;ITVH;)V */
    public C1286453c(AbstractC1286553d abstractC1286553d, AnonymousClass523 anonymousClass523, int i, RecyclerView.ViewHolder viewHolder) {
        super(1);
        this.LJLIL = abstractC1286553d;
        this.LJLILLLLZI = anonymousClass523;
        this.LJLJI = i;
        this.LJLJJI = viewHolder;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        C53D c53d;
        o.LJIIIZ(it, "it");
        if (this.LJLIL.LJLILLLLZI) {
            boolean booleanValue = ((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_CLICK_WHEN_DISABLE_FUNCTION_ITEM, Boolean.FALSE)).booleanValue();
            AnonymousClass523 anonymousClass523 = this.LJLILLLLZI;
            if ((anonymousClass523.LJFF || booleanValue) && (c53d = this.LJLIL.LJLJI) != null) {
                int i = this.LJLJI;
                View view = this.LJLJJI.itemView;
                o.LJIIIIZZ(view, "holder.itemView");
                c53d.LIZ(anonymousClass523, i, view);
            }
        }
        return C76800UCe.LIZ;
    }
}
