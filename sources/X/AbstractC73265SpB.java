package X;

import Y.IDCListenerS247S0100000_12;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SpB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73265SpB<ITEM> extends RecyclerView.ViewHolder {
    public static final /* synthetic */ InterfaceC74236TBo[] $$delegatedProperties;
    public final C5H3 itemViewMap$delegate;
    public ITEM latestItemInternal;
    public int latestItemPositionInternal;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(AbstractC73265SpB.class), "itemViewMap", "getItemViewMap$ext_adapter_release()Landroid/util/SparseArray;");
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
    }

    public void attachToWindow() {
    }

    public abstract void bind(ITEM item, int i);

    public void detachFromWindow() {
    }

    public final SparseArray<View> getItemViewMap$ext_adapter_release() {
        return (SparseArray) this.itemViewMap$delegate.getValue();
    }

    public final ITEM getItem() {
        ITEM item = this.latestItemInternal;
        if (item != null) {
            return item;
        }
        o.LJIIZILJ();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC73265SpB(View view) {
        super(view);
        o.LJIIJ(view, "view");
        this.itemViewMap$delegate = C221108m2.LIZIZ(C73266SpC.LJLIL);
        this.itemView.addOnAttachStateChangeListener(new IDCListenerS247S0100000_12(this, 0));
    }

    public void bind(ITEM item, int i, List<Object> list) {
        this.latestItemPositionInternal = i;
        this.latestItemInternal = item;
        bind(item, i);
    }
}
