package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;

/* renamed from: X.KCp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51331KCp extends KL4 {
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ SearchSugEntity LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ C51325KCj LJLL;

    @Override // X.KL4
    public final void LJ() {
        C51325KCj c51325KCj = this.LJLL;
        KDY kdy = c51325KCj.LJLLL;
        K5C k5c = (K5C) kdy;
        k5c.LIZ(c51325KCj.LJZ, c51325KCj.LJLLLLLL, "normal_sug");
    }

    @Override // X.KL6
    public final void LIZLLL(View view) {
        int i;
        Z9N z9n = Z9N.LIZIZ;
        z9n.LIZ.LLLIIII(this.LJLL.LJLLILLLL.longValue(), "search_sug", false);
        long currentTimeMillis = System.currentTimeMillis();
        C51325KCj c51325KCj = this.LJLL;
        if (currentTimeMillis - c51325KCj.LJLIL < 500) {
            return;
        }
        K75 k75 = c51325KCj.LJLLLL;
        if (k75 != null && k75.LIZIZ() != null) {
            i = this.LJLL.LJLLLL.LIZIZ().LIZIZ();
        } else {
            i = -1;
        }
        boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(C45804HyK.LJJIFFI(this.LJLL.itemView.getContext()))));
        String str = this.LJLJL;
        C51325KCj c51325KCj2 = this.LJLL;
        K56.LJFF(str, c51325KCj2.LL, this.LJLJLJ, "normal_sug", c51325KCj2.LJLZ, i, LJII, C45804HyK.LJJIFFI(c51325KCj2.itemView.getContext()));
        this.LJLL.LJLIL = System.currentTimeMillis();
        C51325KCj c51325KCj3 = this.LJLL;
        K6B k6b = c51325KCj3.LJLLJ;
        if (k6b != null) {
            k6b.LLIIIJ(c51325KCj3.LL, this.LJLJLJ, this.LJLJLLL);
        }
    }

    @Override // X.KL4, X.KL6, X.KL7, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LJLL.LJLLILLLL = Long.valueOf(System.currentTimeMillis());
            K6B k6b = this.LJLL.LJLLJ;
            if (k6b != null) {
                k6b.xc(this.LJLJLJ);
            }
        } else if (motionEvent.getAction() == 3) {
            Z9N z9n = Z9N.LIZIZ;
            z9n.LLLIIII(this.LJLL.LJLLILLLL.longValue(), "search_sug", true);
            z9n.LJIIIZ("cancel", this.LJLJLJ.content, "ACTION_CANCEL");
        }
        return super.onTouch(view, motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51331KCp(C51325KCj c51325KCj, Boolean bool, String str, SearchSugEntity searchSugEntity, String str2) {
        super(bool);
        this.LJLL = c51325KCj;
        this.LJLJL = str;
        this.LJLJLJ = searchSugEntity;
        this.LJLJLLL = str2;
    }
}
