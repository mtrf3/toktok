package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AfE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC26784AfE<T> extends AbstractC73230Soc<T> {
    public final java.util.Map<String, Object> LJLJJI;
    public final C73242Soo<JediViewHolder<? extends InterfaceC98243tM, ?>> LJLJJL;

    @Override // X.AbstractC73237Soj
    public final void LJZ(C73242Soo c73242Soo) {
    }

    public abstract void LL(C73242Soo c73242Soo);

    @Override // X.AbstractC73239Sol, X.InterfaceC73258Sp4
    public final C73242Soo LJJJZ() {
        return this.LJLJJL;
    }

    @Override // X.AbstractC73239Sol
    /* renamed from: LJZI */
    public final C73242Soo<JediViewHolder<? extends InterfaceC98243tM, ?>> LJJJZ() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC26784AfE(LifecycleOwner parent, AbstractC03160Am<T> abstractC03160Am, InterfaceC61500OBs interfaceC61500OBs, java.util.Map<String, ? extends Object> map) {
        super(parent, abstractC03160Am, interfaceC61500OBs);
        o.LJIIIZ(parent, "parent");
        this.LJLJJI = map;
        C73242Soo<JediViewHolder<? extends InterfaceC98243tM, ?>> c73242Soo = new C73242Soo<>(parent);
        LL(c73242Soo);
        this.LJLJJL = c73242Soo;
    }
}
