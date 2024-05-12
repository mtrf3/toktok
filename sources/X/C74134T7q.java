package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.T7q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74134T7q extends C0A6 {
    public final /* synthetic */ C74140T7w LJLIL;
    public final /* synthetic */ C74135T7r LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        T8F t8f;
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = this.LJLIL.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int LLILLJJLI = ((LinearLayoutManager) layoutManager).LLILLJJLI();
        int itemCount = this.LJLILLLLZI.getItemCount();
        if (LLILLJJLI >= itemCount - 1 && i == 0 && this.LJLIL.getPrevDragDir() == T80.UP) {
            RecyclerView.ViewHolder LJJIZ = this.LJLIL.LJJIZ(itemCount - 2);
            if ((LJJIZ instanceof T8L) && (t8f = (T8F) LJJIZ) != null) {
                ((T4V) t8f.LJLIL.findViewById(R.id.chz)).setVisibility(0);
            }
            this.LJLJI.invoke();
        }
    }

    public C74134T7q(C74140T7w c74140T7w, C74135T7r c74135T7r, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = c74140T7w;
        this.LJLILLLLZI = c74135T7r;
        this.LJLJI = interfaceC65784Pro;
    }
}
