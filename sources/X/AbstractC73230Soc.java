package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Soc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73230Soc<T> extends AbstractC73239Sol<JediViewHolder<? extends InterfaceC98243tM, ?>> implements InterfaceC73226SoY<T> {
    public final C73231Sod<T> LJLJI;

    @Override // X.C4II
    public final int getBasicItemCount() {
        return LJLLLLLL() + this.LJLJI.LIZJ.size();
    }

    public final List<T> getCurrentList() {
        return this.LJLJI.LIZJ;
    }

    @Override // X.MK7, X.C4II, X.AbstractC029409q
    public final int getItemCount() {
        return super.getItemCount();
    }

    @Override // X.InterfaceC73226SoY
    public final C73231Sod<T> LJJIIZI() {
        return this.LJLJI;
    }

    @Override // X.AbstractC73237Soj
    public final Object LJLZ(int i) {
        return this.LJLJI.LIZ(i - LJLLLLLL(), true);
    }

    @Override // X.InterfaceC73226SoY
    public final void LJJIIJ(List<? extends T> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C73227SoZ.LIZIZ(this, list, interfaceC65784Pro);
    }

    public final T LJZL(int i, boolean z) {
        return this.LJLJI.LIZ(i, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC73230Soc(LifecycleOwner parent, AbstractC03160Am<T> diffCallback, InterfaceC61500OBs interfaceC61500OBs) {
        super(parent);
        C60930Nvi c60930Nvi;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(diffCallback, "diffCallback");
        if (interfaceC61500OBs != null) {
            c60930Nvi = C60903NvH.LIZJ(interfaceC61500OBs);
        } else {
            c60930Nvi = null;
        }
        C73246Sos LJIIIIZZ = C73340SqO.LJIIIIZZ(diffCallback);
        this.LJLJI = new C73231Sod<>(new C73241Son(this, new AqS170S0100000_4(this, (AbstractC73230Soc<Object>) 1429)), LJIIIIZZ, c60930Nvi);
    }

    public /* synthetic */ AbstractC73230Soc(LifecycleOwner lifecycleOwner, AbstractC03160Am abstractC03160Am, int i) {
        this(lifecycleOwner, (i & 2) != 0 ? new C73257Sp3() : abstractC03160Am, (InterfaceC61500OBs) null);
    }
}
