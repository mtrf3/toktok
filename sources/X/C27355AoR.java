package X;

import Y.IDHandlerS17S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchResultAdapter;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AoR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27355AoR<T> implements InterfaceC27363AoZ {
    public final Context LIZ;
    public final View LIZIZ;
    public final InterfaceC27360AoW LIZJ;
    public Boolean LIZLLL;
    public boolean LJ;
    public final View LJFF;
    public RecyclerView LJI;
    public PopupWindow LJII;
    public SearchResultAdapter LJIIIIZZ;
    public WeakReference<InterfaceC27359AoV<T>> LJIIIZ;
    public List<C27356AoS<T>> LJIIJ;
    public boolean LJIIJJI;
    public final IDHandlerS17S0100000_4 LJIIL;

    public final void LIZ() {
        this.LJIIL.removeMessages(2);
        this.LJIIL.removeMessages(3);
        this.LJIIL.sendEmptyMessage(2);
    }

    @Override // X.InterfaceC27363AoZ
    public final void onItemClick(int i) {
        InterfaceC27359AoV<T> interfaceC27359AoV;
        List<C27356AoS<T>> list = this.LJIIJ;
        if (list != null) {
            C27356AoS<T> c27356AoS = (C27356AoS) ORZ.LJLLLLLL(i, list);
            int i2 = 0;
            if (c27356AoS != null && c27356AoS.LJ) {
                LIZ();
                WeakReference<InterfaceC27359AoV<T>> weakReference = this.LJIIIZ;
                if (weakReference != null && (interfaceC27359AoV = weakReference.get()) != null) {
                    List<C27356AoS<T>> list2 = this.LJIIJ;
                    if (list2 != null) {
                        i2 = list2.size();
                    }
                    interfaceC27359AoV.ke(c27356AoS, i2, i + 1);
                }
            }
        }
    }

    public C27355AoR(Context context, View anchorView, InterfaceC27360AoW searchProxy) {
        o.LJIIIZ(anchorView, "anchorView");
        o.LJIIIZ(searchProxy, "searchProxy");
        this.LIZ = context;
        this.LIZIZ = anchorView;
        this.LIZJ = searchProxy;
        this.LJ = true;
        this.LJFF = C27531ArH.LIZ(R.layout.a6z, context, null, false);
        this.LJIIL = new IDHandlerS17S0100000_4(this, C16880lQ.LLJJJJ(), 2);
    }
}
