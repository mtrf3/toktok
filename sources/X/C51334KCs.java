package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.jvm.internal.o;

/* renamed from: X.KCs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51334KCs extends KL5 {
    public final /* synthetic */ C51320KCe LJLJL;
    public final /* synthetic */ SearchSugEntity LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ int LJLL;

    @Override // X.KL5
    public final void LJ() {
    }

    @Override // X.KL6
    public final void LIZLLL(View view) {
        ISearchSugContextAbility LLIIIZ;
        KAN Vk0;
        int i;
        if (C6ZT.LIZ(view)) {
            return;
        }
        Context context = this.LJLJL.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C50948Jz6 LIZIZ = JTO.LIZIZ(C45804HyK.LJJIFFI(context));
        SearchSugEntity searchSugEntity = this.LJLJLJ;
        C51320KCe c51320KCe = this.LJLJL;
        String str = this.LJLJLLL;
        int i2 = this.LJLL;
        String str2 = c51320KCe.LJLLI;
        int i3 = c51320KCe.LJLJJLL;
        String str3 = c51320KCe.LJLJLJ;
        String str4 = c51320KCe.LJLL;
        K75 k75 = c51320KCe.LJLILLLLZI;
        if (k75 != null) {
            InterfaceC178696zp LIZIZ2 = k75.LIZIZ();
            if (LIZIZ2 != null) {
                i = LIZIZ2.LIZIZ();
            }
            i = 0;
        } else {
            KC6 kc6 = c51320KCe.LJLJI;
            if (kc6 != null && (LLIIIZ = kc6.LLIIIZ()) != null && (Vk0 = LLIIIZ.Vk0()) != null) {
                i = Vk0.LIZ;
            }
            i = 0;
        }
        K7T.LIZLLL(str2, i3, searchSugEntity, str3, str4, i, LIZIZ);
        K6B k6b = c51320KCe.LJLIL;
        if (k6b != null) {
            k6b.LLIIIJ(c51320KCe.LJLJJLL, searchSugEntity, str);
        }
        KC6 kc62 = c51320KCe.LJLJI;
        if (kc62 != null) {
            kc62.LLIIIJ(i2, searchSugEntity, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51334KCs(C51320KCe c51320KCe, SearchSugEntity searchSugEntity, String str, int i) {
        super(Boolean.TRUE);
        this.LJLJL = c51320KCe;
        this.LJLJLJ = searchSugEntity;
        this.LJLJLLL = str;
        this.LJLL = i;
    }
}
