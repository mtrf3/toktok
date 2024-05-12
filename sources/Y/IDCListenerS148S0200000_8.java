package Y;

import X.C141335gf;
import X.C3C5;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.JRB;
import X.JSH;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDCListenerS148S0200000_8 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDCListenerS148S0200000_8(Object obj, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.l1 = view;
    }

    public static final void onLayoutChange$0(IDCListenerS148S0200000_8 iDCListenerS148S0200000_8, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((View) iDCListenerS148S0200000_8.l0).removeOnLayoutChangeListener(iDCListenerS148S0200000_8);
        ((InterfaceC65784Pro) iDCListenerS148S0200000_8.l1).invoke();
    }

    public static final void onLayoutChange$1(IDCListenerS148S0200000_8 iDCListenerS148S0200000_8, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS148S0200000_8);
        try {
            ((RecyclerView) iDCListenerS148S0200000_8.l0).LJLI(((SearchHubTabsComponent) iDCListenerS148S0200000_8.l1).H3().getState().LJLJJLL);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void onLayoutChange$2(IDCListenerS148S0200000_8 iDCListenerS148S0200000_8, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        JSH jsh;
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS148S0200000_8);
        RecyclerView.ViewHolder LJJIZ = ((JRB) iDCListenerS148S0200000_8.l0).LJIIJJI().LJJIZ(((JRB) iDCListenerS148S0200000_8.l0).LJIIZILJ(((Aweme) iDCListenerS148S0200000_8.l1).getAid()));
        if ((LJJIZ instanceof JSH) && (jsh = (JSH) LJJIZ) != null) {
            jsh.LLLJIL();
        }
    }
}
