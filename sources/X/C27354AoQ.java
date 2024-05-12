package X;

import Y.IDCListenerS373S0100000_4;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchResultAdapter;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* renamed from: X.AoQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27354AoQ<T> extends LinearLayout implements InterfaceC27360AoW {
    public static final /* synthetic */ int LJLJJL = 0;
    public final List<InterfaceC27330Ao2> LJLIL;
    public final C27355AoR<T> LJLILLLLZI;
    public int LJLJI;
    public final java.util.Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC27360AoW
    public final void LIZ() {
        String str;
        View LIZIZ = LIZIZ(R.id.jdi);
        if (LIZIZ != null && LIZIZ.hasFocus()) {
            Editable text = ((C19K) LIZIZ(R.id.jdi)).getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            if (LJ(str)) {
                Iterator it = ((ArrayList) this.LJLIL).iterator();
                while (it.hasNext()) {
                    ((InterfaceC27330Ao2) it.next()).Rb(str);
                }
                return;
            }
            this.LJLILLLLZI.LIZ();
            return;
        }
        this.LJLILLLLZI.LIZ();
    }

    public final void LIZLLL() {
        ((TextView) LIZIZ(R.id.jdi)).setText("");
    }

    public C27354AoQ(Context context) {
        super(context, null, 0);
        PopupWindow popupWindow;
        this.LJLIL = new ArrayList();
        C27355AoR<T> c27355AoR = new C27355AoR<>(context, this, this);
        this.LJLILLLLZI = c27355AoR;
        this.LJLJI = 4;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a6w, this, true);
        TextView textView = (TextView) LIZIZ(R.id.jdi);
        if (textView != null) {
            textView.addTextChangedListener(new C27357AoT(this));
        }
        View LIZIZ = LIZIZ(R.id.jdi);
        if (LIZIZ != null) {
            LIZIZ.setOnFocusChangeListener(new IDCListenerS373S0100000_4(this, 3));
        }
        View LIZIZ2 = LIZIZ(R.id.be8);
        if (LIZIZ2 != null) {
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 55, 42), LIZIZ2);
        }
        RecyclerView recyclerView = (RecyclerView) c27355AoR.LJFF.findViewById(R.id.izk);
        c27355AoR.LJI = recyclerView;
        if (recyclerView != null) {
            recyclerView.LJII(new C71312Rym(KL2.LIZJ(c27355AoR.LIZ, 16.0f), AnonymousClass636.LJIIIIZZ(R.attr.dz, c27355AoR.LIZ), 2, 0), -1);
        }
        RecyclerView recyclerView2 = c27355AoR.LJI;
        if (recyclerView2 != null) {
            recyclerView2.setVerticalScrollBarEnabled(false);
        }
        PopupWindow popupWindow2 = new PopupWindow(c27355AoR.LJFF, -2, -2, false);
        c27355AoR.LJII = popupWindow2;
        popupWindow2.setInputMethodMode(1);
        PopupWindow popupWindow3 = c27355AoR.LJII;
        if (popupWindow3 != null) {
            popupWindow3.setSoftInputMode(16);
        }
        SearchResultAdapter searchResultAdapter = new SearchResultAdapter(true);
        c27355AoR.LJIIIIZZ = searchResultAdapter;
        RecyclerView recyclerView3 = c27355AoR.LJI;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(searchResultAdapter);
        }
        RecyclerView recyclerView4 = c27355AoR.LJI;
        if (recyclerView4 != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.LLJJIII(1);
            recyclerView4.setLayoutManager(linearLayoutManager);
        }
        c27355AoR.LJFF.setBackgroundResource(R.drawable.acd);
        Boolean bool = c27355AoR.LIZLLL;
        if (bool != null && bool.booleanValue() && (popupWindow = c27355AoR.LJII) != null) {
            popupWindow.setOutsideTouchable(true);
        }
        View findViewById = c27355AoR.LJFF.findViewById(R.id.jh4);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new IDaS484S0100000_4(c27355AoR, 14), findViewById);
        }
        SearchResultAdapter searchResultAdapter2 = c27355AoR.LJIIIIZZ;
        if (searchResultAdapter2 != null) {
            searchResultAdapter2.LJLJI = c27355AoR;
        }
        PopupWindow popupWindow4 = c27355AoR.LJII;
        if (popupWindow4 != null) {
            popupWindow4.setOnDismissListener(new C27358AoU(c27355AoR));
        }
    }

    public final void LIZJ(InterfaceC27330Ao2 listener) {
        o.LJIIIZ(listener, "listener");
        if (!((ArrayList) this.LJLIL).contains(listener)) {
            ((ArrayList) this.LJLIL).add(listener);
        }
    }

    public final boolean LJ(String str) {
        if (str == null || ujb.o.LJJJJJL(str) || str.length() < this.LJLJI) {
            return false;
        }
        return true;
    }

    public final void setHint(String hint) {
        o.LJIIIZ(hint, "hint");
        ((TextView) LIZIZ(R.id.jdi)).setHint(hint);
    }

    public final void setSearchLenLimit(int i) {
        this.LJLJI = i;
    }

    public final void LJFF(boolean z, List<C27356AoS<T>> list, InterfaceC27359AoV<T> listener, boolean z2, boolean z3) {
        String str;
        PopupWindow popupWindow;
        o.LJIIIZ(listener, "listener");
        Editable text = ((C19K) LIZIZ(R.id.jdi)).getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        if (LJ(str)) {
            C27355AoR<T> c27355AoR = this.LJLILLLLZI;
            c27355AoR.getClass();
            c27355AoR.LJIIJJI = z;
            c27355AoR.LJIIIZ = new WeakReference<>(listener);
            c27355AoR.LJIIJ = list;
            c27355AoR.LIZLLL = Boolean.valueOf(z2);
            c27355AoR.LJ = z3;
            if (z2 && (popupWindow = c27355AoR.LJII) != null) {
                popupWindow.setOutsideTouchable(true);
            }
            c27355AoR.LJIIL.removeMessages(2);
            c27355AoR.LJIIL.removeMessages(3);
            c27355AoR.LJIIL.sendEmptyMessage(3);
        }
    }
}
