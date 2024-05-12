package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Sol, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73239Sol<VH extends JediViewHolder<? extends InterfaceC98243tM, ?>> extends AbstractC73237Soj<VH, C73242Soo<VH>> {
    public final C73242Soo<VH> LJLILLLLZI;

    @Override // X.InterfaceC73258Sp4
    /* renamed from: LJZI, reason: merged with bridge method [inline-methods] */
    public C73242Soo<VH> LJJJZ() {
        return this.LJLILLLLZI;
    }

    public AbstractC73239Sol(LifecycleOwner parent) {
        o.LJIIIZ(parent, "parent");
        C73242Soo<VH> c73242Soo = new C73242Soo<>(parent);
        LJZ(c73242Soo);
        this.LJLILLLLZI = c73242Soo;
    }
}
