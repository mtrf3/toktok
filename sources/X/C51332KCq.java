package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.jvm.internal.o;

/* renamed from: X.KCq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51332KCq extends KL5 {
    public final /* synthetic */ C51321KCf LJLJL;
    public final /* synthetic */ View LJLJLJ;
    public final /* synthetic */ KDD LJLJLLL;

    @Override // X.KL5
    public final void LJ() {
        KDD kdd = this.LJLJLLL;
        if (kdd != null) {
            C51321KCf c51321KCf = this.LJLJL;
            kdd.LJIJJLI(c51321KCf.LJLJJL, c51321KCf.LJLJJI, "enrich_sug");
        }
    }

    @Override // X.KL6
    public final void LIZLLL(View view) {
        SearchSugEntity searchSugEntity;
        ISearchSugContextAbility LLIIIZ;
        KAN Vk0;
        int i;
        if (!C6ZT.LIZ(view)) {
            C51321KCf c51321KCf = this.LJLJL;
            if (!c51321KCf.LJLJL || (searchSugEntity = c51321KCf.LJLJJI) == null) {
                return;
            }
            Context context = this.LJLJLJ.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C50948Jz6 LIZIZ = JTO.LIZIZ(C45804HyK.LJJIFFI(context));
            String str = c51321KCf.LJLJLLL;
            int i2 = c51321KCf.LJLJJL;
            String str2 = c51321KCf.LJLJLJ;
            K75 k75 = c51321KCf.LJLILLLLZI;
            if (k75 != null) {
                InterfaceC178696zp LIZIZ2 = k75.LIZIZ();
                if (LIZIZ2 != null) {
                    i = LIZIZ2.LIZIZ();
                }
                i = 0;
            } else {
                KC6 kc6 = c51321KCf.LJLJI;
                if (kc6 != null && (LLIIIZ = kc6.LLIIIZ()) != null && (Vk0 = LLIIIZ.Vk0()) != null) {
                    i = Vk0.LIZ;
                }
                i = 0;
            }
            K7T.LIZLLL(str, i2, searchSugEntity, "enrich_sug", str2, i, LIZIZ);
            K6B k6b = c51321KCf.LJLIL;
            if (k6b != null) {
                k6b.LLIIIJ(c51321KCf.LJLJJL, searchSugEntity, c51321KCf.LJLJJLL);
            }
            KC6 kc62 = c51321KCf.LJLJI;
            if (kc62 == null) {
                return;
            }
            kc62.LLIIIJ(c51321KCf.LJLJJL, searchSugEntity, c51321KCf.LJLJJLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51332KCq(C51321KCf c51321KCf, View view, KDD kdd) {
        super(Boolean.TRUE);
        this.LJLJL = c51321KCf;
        this.LJLJLJ = view;
        this.LJLJLLL = kdd;
    }
}
