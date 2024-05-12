package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;

/* renamed from: X.KCr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51333KCr extends KL5 {
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ SearchSugEntity LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ C51322KCg LJLLI;

    @Override // X.KL5
    public final void LJ() {
        C51322KCg c51322KCg = this.LJLLI;
        c51322KCg.LJLLJ.LJIJJLI(c51322KCg.LJZ, c51322KCg.LJLLLLLL, "normal_sug");
    }

    @Override // X.KL6
    public final void LIZLLL(View view) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        C51322KCg c51322KCg = this.LJLLI;
        if (currentTimeMillis - c51322KCg.LJLIL < 500) {
            return;
        }
        K75 k75 = c51322KCg.LJLLL;
        if (k75 != null && k75.LIZIZ() != null) {
            i = this.LJLLI.LJLLL.LIZIZ().LIZIZ();
        } else {
            i = 0;
        }
        KC6 kc6 = this.LJLLI.LJLLLL;
        if (kc6 != null && kc6.LLIIIZ() != null && this.LJLLI.LJLLLL.LLIIIZ().Vk0() != null) {
            i = this.LJLLI.LJLLLL.LLIIIZ().Vk0().LIZ;
        }
        C50948Jz6 LIZIZ = JTO.LIZIZ(C45804HyK.LJJIFFI(this.LJLLI.itemView.getContext()));
        String str = this.LJLJL;
        C51322KCg c51322KCg2 = this.LJLLI;
        K7T.LIZLLL(str, c51322KCg2.LL, this.LJLJLJ, "normal_sug", c51322KCg2.LJLZ, i, LIZIZ);
        this.LJLLI.LJLIL = System.currentTimeMillis();
        C51322KCg c51322KCg3 = this.LJLLI;
        K6B k6b = c51322KCg3.LJLLILLLL;
        if (k6b != null) {
            k6b.LLIIIJ(c51322KCg3.LL, this.LJLJLJ, this.LJLJLLL);
        }
        KC6 kc62 = this.LJLLI.LJLLLL;
        if (kc62 != null) {
            kc62.LLIIIJ(this.LJLL, this.LJLJLJ, this.LJLJLLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51333KCr(C51322KCg c51322KCg, Boolean bool, String str, SearchSugEntity searchSugEntity, String str2, int i) {
        super(bool);
        this.LJLLI = c51322KCg;
        this.LJLJL = str;
        this.LJLJLJ = searchSugEntity;
        this.LJLJLLL = str2;
        this.LJLL = i;
    }
}
