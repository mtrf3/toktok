package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.jvm.internal.o;

/* renamed from: X.KCm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51328KCm extends KL4 {
    public final /* synthetic */ C72242sW LJLJL;
    public final /* synthetic */ C51327KCl LJLJLJ;

    @Override // X.KL4
    public final void LJ() {
        C51327KCl c51327KCl = this.LJLJLJ;
        KDY kdy = c51327KCl.LJLILLLLZI;
        if (kdy != null) {
            K5C k5c = (K5C) kdy;
            k5c.LIZ(c51327KCl.LJLJJL, c51327KCl.LJLJJI, "enrich_sug");
        }
    }

    @Override // X.KL6
    public final void LIZLLL(View view) {
        int i;
        InterfaceC178696zp LIZIZ;
        Z9N.LIZIZ.LIZ.LLLIIII(this.LJLJL.element, "search_sug", false);
        if (!C6ZT.LIZ(view)) {
            C51327KCl c51327KCl = this.LJLJLJ;
            if (!c51327KCl.LJLJL) {
                return;
            }
            Context context = c51327KCl.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(C45804HyK.LJJIFFI(context))));
            C51327KCl c51327KCl2 = this.LJLJLJ;
            SearchSugEntity searchSugEntity = c51327KCl2.LJLJJI;
            if (searchSugEntity == null) {
                return;
            }
            String str = c51327KCl2.LJLL;
            int i2 = c51327KCl2.LJLJJL;
            String str2 = c51327KCl2.LJLJLJ;
            K75 k75 = c51327KCl2.LJLJI;
            if (k75 != null && (LIZIZ = k75.LIZIZ()) != null) {
                i = LIZIZ.LIZIZ();
            } else {
                i = -1;
            }
            K56.LJFF(str, i2, searchSugEntity, "enrich_sug", str2, i, LJII, C1DG.LJ(c51327KCl2.itemView, "itemView.context"));
            K6B k6b = c51327KCl2.LJLIL;
            if (k6b == null) {
                return;
            }
            k6b.LLIIIJ(c51327KCl2.LJLJJL, searchSugEntity, c51327KCl2.LJLJJLL);
        }
    }

    @Override // X.KL4, X.KL6, X.KL7, android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        K6B k6b;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        if (event.getAction() == 0) {
            this.LJLJL.element = System.currentTimeMillis();
            C51327KCl c51327KCl = this.LJLJLJ;
            SearchSugEntity searchSugEntity = c51327KCl.LJLJJI;
            if (searchSugEntity != null && (k6b = c51327KCl.LJLIL) != null) {
                k6b.xc(searchSugEntity);
            }
        } else if (event.getAction() == 3) {
            Z9N z9n = Z9N.LIZIZ;
            z9n.LLLIIII(this.LJLJL.element, "search_sug", true);
            SearchSugEntity searchSugEntity2 = this.LJLJLJ.LJLJJI;
            if (searchSugEntity2 != null) {
                String str = searchSugEntity2.content;
                o.LJIIIIZZ(str, "it.content");
                z9n.LJIIIZ("cancel", str, "ACTION_CANCEL");
            }
        }
        return super.onTouch(v, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51328KCm(C72242sW c72242sW, C51327KCl c51327KCl, boolean z) {
        super(Boolean.valueOf(z));
        this.LJLJL = c72242sW;
        this.LJLJLJ = c51327KCl;
    }
}
