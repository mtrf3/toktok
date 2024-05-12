package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.jvm.internal.o;

/* renamed from: X.KCo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51330KCo extends KL4 {
    public final /* synthetic */ C72242sW LJLJL;
    public final /* synthetic */ C51324KCi LJLJLJ;
    public final /* synthetic */ SearchSugEntity LJLJLLL;
    public final /* synthetic */ String LJLL;

    @Override // X.KL4
    public final void LJ() {
        SearchSugEntity searchSugEntity = this.LJLJLJ.LJLJJL;
        if (searchSugEntity != null) {
            Z9N z9n = Z9N.LIZIZ;
            String str = searchSugEntity.content;
            o.LJIIIIZZ(str, "it.content");
            z9n.LJIIIZ("cancel", str, "ACTION_CANCEL");
        }
    }

    @Override // X.KL6
    public final void LIZLLL(View view) {
        int i;
        InterfaceC178696zp LIZIZ;
        Z9N.LIZIZ.LIZ.LLLIIII(this.LJLJL.element, "search_sug", false);
        if (C6ZT.LIZ(view)) {
            return;
        }
        Context context = this.LJLJLJ.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(C45804HyK.LJJIFFI(context))));
        SearchSugEntity searchSugEntity = this.LJLJLLL;
        if (searchSugEntity != null) {
            C51324KCi c51324KCi = this.LJLJLJ;
            String str = this.LJLL;
            String str2 = c51324KCi.LJLJLLL;
            int i2 = c51324KCi.LJLJJI;
            String str3 = c51324KCi.LJLJJLL;
            String str4 = c51324KCi.LJLJLJ;
            K75 k75 = c51324KCi.LJLILLLLZI;
            if (k75 != null && (LIZIZ = k75.LIZIZ()) != null) {
                i = LIZIZ.LIZIZ();
            } else {
                i = -1;
            }
            K56.LJFF(str2, i2, searchSugEntity, str3, str4, i, LJII, C1DG.LJ(c51324KCi.itemView, "itemView.context"));
            K6B k6b = c51324KCi.LJLIL;
            if (k6b != null) {
                k6b.LLIIIJ(c51324KCi.LJLJJI, searchSugEntity, str);
            }
        }
    }

    @Override // X.KL4, X.KL6, X.KL7, android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        K6B k6b;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        boolean z = true;
        if (event.getAction() == 0) {
            this.LJLJL.element = System.currentTimeMillis();
            C51324KCi c51324KCi = this.LJLJLJ;
            SearchSugEntity searchSugEntity = c51324KCi.LJLJJL;
            if (searchSugEntity != null && (k6b = c51324KCi.LJLIL) != null) {
                k6b.xc(searchSugEntity);
            }
        } else if (event.getAction() == 3) {
            if (event.getAction() != 3) {
                z = false;
            }
            Z9N z9n = Z9N.LIZIZ;
            z9n.LLLIIII(this.LJLJL.element, "search_sug", z);
            SearchSugEntity searchSugEntity2 = this.LJLJLJ.LJLJJL;
            if (searchSugEntity2 != null) {
                String str = searchSugEntity2.content;
                o.LJIIIIZZ(str, "it.content");
                z9n.LJIIIZ("cancel", str, "ACTION_CANCEL");
            }
        }
        return super.onTouch(v, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51330KCo(C72242sW c72242sW, C51324KCi c51324KCi, SearchSugEntity searchSugEntity, String str, boolean z) {
        super(Boolean.valueOf(z));
        this.LJLJL = c72242sW;
        this.LJLJLJ = c51324KCi;
        this.LJLJLLL = searchSugEntity;
        this.LJLL = str;
    }
}
