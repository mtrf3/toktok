package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.jvm.internal.o;

/* renamed from: X.KCn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51329KCn extends KL4 {
    public final /* synthetic */ C72242sW LJLJL;
    public final /* synthetic */ C51326KCk LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    @Override // X.KL4
    public final void LJ() {
        C51326KCk c51326KCk = this.LJLJLJ;
        KDY kdy = c51326KCk.LJLJI;
        if (kdy != null) {
            K5C k5c = (K5C) kdy;
            k5c.LIZ(this.LJLJLLL, c51326KCk.LJLJLJ, "enrich_sug");
        }
    }

    @Override // X.KL6
    public final void LIZLLL(View view) {
        String str;
        int i;
        InterfaceC178696zp LIZIZ;
        Z9N.LIZIZ.LIZ.LLLIIII(this.LJLJL.element, "search_sug", false);
        if (!C6ZT.LIZ(view)) {
            C51326KCk c51326KCk = this.LJLJLJ;
            if (!c51326KCk.LJLLI) {
                return;
            }
            Context context = c51326KCk.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(C45804HyK.LJJIFFI(context))));
            C51326KCk c51326KCk2 = this.LJLJLJ;
            SearchSugEntity searchSugEntity = c51326KCk2.LJLJLJ;
            if (searchSugEntity == null) {
                return;
            }
            String str2 = c51326KCk2.LJLLJ;
            int i2 = c51326KCk2.LJLJLLL;
            if (C78841Uwv.LJIL(searchSugEntity)) {
                str = "enrich_sug";
            } else {
                str = "normal_sug";
            }
            String str3 = c51326KCk2.LJLIL;
            K75 k75 = c51326KCk2.LJLJJI;
            if (k75 != null && (LIZIZ = k75.LIZIZ()) != null) {
                i = LIZIZ.LIZIZ();
            } else {
                i = -1;
            }
            K56.LJFF(str2, i2, searchSugEntity, str, str3, i, LJII, C1DG.LJ(c51326KCk2.itemView, "itemView.context"));
            K6B k6b = c51326KCk2.LJLILLLLZI;
            if (k6b == null) {
                return;
            }
            k6b.LLIIIJ(c51326KCk2.LJLJLLL, searchSugEntity, c51326KCk2.LJLL);
        }
    }

    @Override // X.KL4, X.KL6, X.KL7, android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        K6B k6b;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        if (event.getAction() == 0) {
            this.LJLJL.element = System.currentTimeMillis();
            C51326KCk c51326KCk = this.LJLJLJ;
            SearchSugEntity searchSugEntity = c51326KCk.LJLJLJ;
            if (searchSugEntity != null && (k6b = c51326KCk.LJLILLLLZI) != null) {
                k6b.xc(searchSugEntity);
            }
        } else if (event.getAction() == 3) {
            Z9N.LIZIZ.LLLIIII(this.LJLJL.element, "search_sug", true);
        }
        return super.onTouch(v, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51329KCn(C72242sW c72242sW, C51326KCk c51326KCk, int i, boolean z) {
        super(Boolean.valueOf(z));
        this.LJLJL = c72242sW;
        this.LJLJLJ = c51326KCk;
        this.LJLJLLL = i;
    }
}
