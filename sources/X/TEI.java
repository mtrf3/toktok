package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TEI extends C0A6 {
    public final /* synthetic */ TKR LJLIL;
    public final /* synthetic */ RecyclerView LJLILLLLZI;
    public final /* synthetic */ AbstractStickerFragment LJLJI;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJI.LJLLILLLL.onNext(Integer.valueOf(i));
        TKR tkr = this.LJLIL;
        if (tkr != null && tkr.LLIIIJ && i == 0 && !this.LJLILLLLZI.canScrollVertically(-1) && (interfaceC65784Pro = this.LJLIL.LLIILII) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public TEI(TKR tkr, RecyclerView recyclerView, AbstractStickerFragment abstractStickerFragment) {
        this.LJLIL = tkr;
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = abstractStickerFragment;
    }
}
