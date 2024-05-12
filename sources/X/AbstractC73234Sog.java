package X;

import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sog, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73234Sog<T> extends AbstractC73232Soe<T, JediViewHolder<? extends InterfaceC98243tM, T>, C73242Soo<JediViewHolder<? extends InterfaceC98243tM, T>>> {
    public final C73242Soo<JediViewHolder<? extends InterfaceC98243tM, T>> LJLILLLLZI;
    public final C73231Sod<T> LJLJI;
    public final LifecycleOwner LJLJJI;

    @Override // X.InterfaceC73226SoY
    public final C73231Sod<T> LJJIIZI() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC73258Sp4
    public final /* bridge */ /* synthetic */ C73242Soo LJJJZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        RecyclerView recyclerView;
        o.LJIIJ(holder, "holder");
        C73242Soo<JediViewHolder<? extends InterfaceC98243tM, T>> c73242Soo = this.LJLILLLLZI;
        c73242Soo.getClass();
        C73240Som c73240Som = c73242Soo.LIZLLL;
        c73240Som.getClass();
        C73245Sor c73245Sor = c73240Som.LIZJ;
        if (c73245Sor != null && (recyclerView = c73240Som.LIZIZ.LJLIL) != null) {
            int itemViewType = holder.getItemViewType();
            int LIZ = C0BB.LIZ(itemViewType, recyclerView);
            int recycledViewCount = recyclerView.getRecycledViewPool().getRecycledViewCount(itemViewType);
            if (LIZ != -1 && LIZ <= recycledViewCount) {
                int itemViewType2 = holder.getItemViewType();
                List list = (List) ((SparseArray) c73245Sor.LIZ.getValue()).get(itemViewType2);
                if (list == null) {
                    list = new ArrayList();
                    ((SparseArray) c73245Sor.LIZ.getValue()).put(itemViewType2, list);
                }
                list.add(holder);
                C0BB.LIZIZ(holder);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC73234Sog(LifecycleOwner parent, C73246Sos config) {
        super(config);
        o.LJIIJ(parent, "parent");
        o.LJIIJ(config, "config");
        this.LJLJJI = parent;
        C73242Soo<JediViewHolder<? extends InterfaceC98243tM, T>> c73242Soo = new C73242Soo<>(parent);
        LJLLLLLL(c73242Soo);
        this.LJLILLLLZI = c73242Soo;
        this.LJLJI = new C73231Sod<>(new C73241Son(this, C73253Soz.LJLIL), config, null);
    }
}
