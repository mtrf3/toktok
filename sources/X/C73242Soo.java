package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.ext.adapter.JediInvisibleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.widget.Widget;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Soo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73242Soo<VH extends JediViewHolder<? extends InterfaceC98243tM, ?>> extends C73236Soi<VH> {
    public final C73254Sp0 LJ;
    public final LifecycleOwner LJFF;

    public C73242Soo(LifecycleOwner owner) {
        JediViewHolderProxyHost LIZ;
        C73250Sow LIZ2;
        o.LJIIJ(owner, "owner");
        this.LJFF = owner;
        if (owner instanceof Fragment) {
            C73250Sow.LJ.getClass();
            JediViewHolderProxyHost.LJLJJL.getClass();
            JediViewHolderProxyHost LIZ3 = C73252Soy.LIZ(null, (Fragment) owner);
            Lifecycle lifecycle = LIZ3.getLifecycle();
            o.LJFF(lifecycle, "proxyHost.lifecycle");
            LIZ2 = C73249Sov.LIZ(lifecycle, LIZ3);
        } else if (owner instanceof ActivityC45651qj) {
            C73250Sow.LJ.getClass();
            JediViewHolderProxyHost.LJLJJL.getClass();
            JediViewHolderProxyHost LIZ4 = C73252Soy.LIZ((ActivityC45651qj) owner, null);
            Lifecycle lifecycle2 = LIZ4.getLifecycle();
            o.LJFF(lifecycle2, "proxyHost.lifecycle");
            LIZ2 = C73249Sov.LIZ(lifecycle2, LIZ4);
        } else if (owner instanceof Widget) {
            Widget widget = (Widget) owner;
            C73250Sow.LJ.getClass();
            Lifecycle lifecycle3 = widget.getLifecycle();
            JediViewHolderProxyHost.LJLJJL.getClass();
            Object host = widget.getHost();
            if (host instanceof Fragment) {
                LIZ = C73252Soy.LIZ(null, (Fragment) host);
            } else if (host instanceof ActivityC45651qj) {
                LIZ = C73252Soy.LIZ((ActivityC45651qj) host, null);
            } else {
                throw new IllegalStateException();
            }
            LIZ2 = C73249Sov.LIZ(lifecycle3, LIZ);
        } else {
            if (owner instanceof JediViewHolder) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("JediViewHolder:");
                LIZ5.append(owner);
                LIZ5.append(" is not support for now");
                throw new IllegalStateException(X1D.LIZIZ(LIZ5));
            }
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("owner:");
            LIZ6.append(owner);
            LIZ6.append(" is not in support list ([FragmentActivity, Fragment, Widget])");
            throw new IllegalStateException(X1D.LIZIZ(LIZ6));
        }
        this.LJ = new C73254Sp0(LIZ2);
    }

    @Override // X.C73236Soi
    public final void LIZJ(AbstractC73265SpB abstractC73265SpB) {
        JediViewHolder holder = (JediViewHolder) abstractC73265SpB;
        o.LJIIJ(holder, "holder");
        holder.setParent$ext_adapter_release(this.LJFF);
        holder.setProvider$ext_adapter_release(this.LJ);
        holder.prepare$ext_adapter_release();
    }

    @Override // X.C73236Soi
    public final AbstractC73265SpB LIZLLL(ViewGroup parent) {
        o.LJIIJ(parent, "parent");
        return new JediInvisibleViewHolder(parent);
    }

    @Override // X.C73236Soi
    public final AbstractC73265SpB LJII(int i) {
        C73245Sor c73245Sor = this.LIZLLL.LIZJ;
        Object obj = null;
        if (c73245Sor == null) {
            return null;
        }
        List list = (List) ((SparseArray) c73245Sor.LIZ.getValue()).get(i);
        if (list != null && (!list.isEmpty())) {
            Object obj2 = (RecyclerView.ViewHolder) ListProtector.remove(list, list.size() - 1);
            if (obj2 instanceof Object) {
                obj = obj2;
            }
        }
        return (AbstractC73265SpB) obj;
    }
}
