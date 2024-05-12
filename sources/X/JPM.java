package X;

import Y.ARunnableS44S0100000_8;
import Y.ARunnableS7S1200000_8;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS68S0400000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JPM extends JPO implements JQX, JP7 {
    public static final /* synthetic */ int LJLZ = 0;
    public final SearchResultParam LJLJLLL;
    public final ViewGroup LJLL;
    public final TextView LJLLI;
    public SearchSpot LJLLILLLL;
    public boolean LJLLJ;
    public Integer LJLLL;
    public final JPQ LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    @Override // X.JP7
    public final int LIZ() {
        return 70;
    }

    @Override // X.JQX
    public final C49128JPw LJJLJ() {
        return null;
    }

    @Override // X.JP7
    public final Aweme LJLLILLLL(int i, String str) {
        return null;
    }

    @Override // X.JQX
    public final void LJLLLL() {
    }

    @Override // X.JP7
    public final boolean LLFZ() {
        return false;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.JP7
    public final void LLIIL() {
    }

    @Override // X.JP7
    public final void LLJIJIL() {
    }

    @Override // X.JQX
    public final JP7 LLLLIIL() {
        return this;
    }

    @Override // X.JP7
    public final boolean LLLLILI() {
        return false;
    }

    @Override // X.JQX
    public final boolean LLZL() {
        return true;
    }

    @Override // X.JP7
    public final Aweme getCurrentAweme() {
        return null;
    }

    @Override // X.JQX
    public final InterfaceC48907JHj getPlayerView() {
        return null;
    }

    @Override // X.JP7
    public final View LJIIIIZZ() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.JP7
    public final int LJLLI() {
        if (this.itemView.getLayoutParams() instanceof C1BU) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            return ((C1BU) layoutParams).LJLIL;
        }
        return -1;
    }

    public final JPJ T() {
        return (JPJ) this.LJLLLLLL.getValue();
    }

    @Override // X.JP7
    public final int LJLL() {
        return getAdapterPosition();
    }

    @Override // X.JP7
    public final int LLJJJ() {
        return getAdapterPosition();
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return C48984JKi.LIZIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return T().isPlaying();
    }

    @Override // X.JP7
    public final boolean LIZLLL() {
        return this.LJLJI;
    }

    @Override // X.JP7
    public final SearchResultParam LJLJLLL() {
        return this.LJLJLLL;
    }

    @Override // X.JP7
    public final Integer LLILLL() {
        return this.LJLLL;
    }

    @Override // X.JP7
    public final boolean LLIZLLLIL() {
        return this.LJLLJ;
    }

    @Override // X.JP7
    public final void LJLZ(int i) {
        this.LJLLL = Integer.valueOf(i);
    }

    @Override // X.JP7
    public final void LLLIIL(MotionEvent event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.JQX
    public final void f(C49128JPw info) {
        o.LJIIIZ(info, "info");
    }

    @Override // X.JPO, X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        JJK jjk;
        o.LJIIIZ(v, "v");
        super.onViewAttachedToWindow(v);
        C49618Jde.LIZ(this.itemView, new ARunnableS44S0100000_8(this, 4));
        if (!this.LJLLJ) {
            RecyclerView LJIIJJI = T().LJIIJJI();
            ArrayList arrayList = new ArrayList();
            int childCount = LJIIJJI.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.ViewHolder LJJJJJL = LJIIJJI.LJJJJJL(LJIIJJI.getChildAt(i));
                o.LJII(LJJJJJL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.result.topsearch.hotspot.core.ui.SearchHotSpotWithVideoItemHolder");
                arrayList.add(LJJJJJL);
            }
            SearchSpot searchSpot = this.LJLLILLLL;
            o.LJI(searchSpot);
            List<? extends Aweme> list = searchSpot.awemeCards;
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JKB jkb = (JKB) it.next();
                int bindingAdapterPosition = jkb.getBindingAdapterPosition();
                Aweme aweme = (Aweme) ListProtector.get(list, bindingAdapterPosition);
                if (bindingAdapterPosition != -1 && (jjk = jkb.LJLL) != null) {
                    View view = jkb.itemView;
                    o.LJIIIIZZ(view, "it.itemView");
                    jjk.LIZIZ(bindingAdapterPosition, view, aweme, list);
                }
            }
        }
    }

    @Override // X.JPO, X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        super.onViewDetachedFromWindow(v);
        this.LJLLJ = false;
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd c49187JSd) {
        C48984JKi.LIZ(this, c49187JSd);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd c49187JSd) {
        C48984JKi.LIZJ(this, c49187JSd);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(X.JQA r15, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r16) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JPM.Q(X.JQA, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed):void");
    }

    public final void U(String str, SearchSpot searchSpot) {
        if (TextUtils.equals(str, "search_result_show")) {
            C49618Jde.LIZ(this.itemView, new ARunnableS7S1200000_8(searchSpot, this, str, 0));
        } else {
            this.LJLLLL.LIZ(str, searchSpot);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JPM(SearchResultParam searchResultParam, View itemView, JIB containerStatusProvider, JGU jgu) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(containerStatusProvider, "containerStatusProvider");
        this.LJLJLLL = searchResultParam;
        View findViewById = itemView.findViewById(R.id.je8);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…rch_aweme_card_container)");
        this.LJLL = (ViewGroup) findViewById;
        View findViewById2 = itemView.findViewById(R.id.b03);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.btn_trendings)");
        this.LJLLI = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.e4j);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.header_stub)");
        this.LJLLLL = new JPQ((ViewStub) findViewById3, new AqS158S0100000_8(this, 14));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS68S0400000_8(this, itemView, containerStatusProvider, jgu, 0));
    }
}
