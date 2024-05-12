package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.ILynxSearchList;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JR4 extends C49113JPh {
    public final RecyclerView LJLLILLLL;
    public final View LJLLJ;
    public JR3 LJLLL;
    public ILynxSearchList.ActiveArea LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public boolean LJZ;
    public final C62822Ol8 LJZI;

    @Override // X.C49113JPh, X.JR0
    public final boolean LJLILLLLZI() {
        return true;
    }

    @Override // X.C49113JPh
    public final C49153JQv LIZIZ() {
        return (C49153JQv) this.LJZI.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JR4(RecyclerView listView, View view, JGU jgu) {
        super(listView, view, jgu, null, true);
        o.LJIIIZ(listView, "listView");
        this.LJLLILLLL = listView;
        this.LJLLJ = view;
        this.LJLLLL = new ILynxSearchList.ActiveArea(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.LJLLLLLL = C221108m2.LIZIZ(JRO.LJLIL);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(JR8.LJLIL);
        this.LJLZ = LIZIZ;
        this.LJZ = true;
        ((AbstractC28951Br) LIZIZ.getValue()).LIZIZ(listView);
        this.LJZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 713));
    }
}
