package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sob, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73229Sob<T> extends AbstractC73239Sol<JediViewHolder<? extends InterfaceC98243tM, T>> implements InterfaceC73226SoY<T> {
    public final C73231Sod<T> LJLJI;

    @Override // X.C4II
    public final int getBasicItemCount() {
        return LJLLLLLL() + this.LJLJI.LIZJ.size();
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

    @Override // X.AbstractC73237Soj
    public final void LJZ(C73242Soo c73242Soo) {
        c73242Soo.LJI(null, new AqS178S0100000_12(this, (AbstractC73229Sob<Object>) 697));
    }

    @Override // X.InterfaceC73226SoY
    public final void LJJIIJ(List<? extends T> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C73227SoZ.LIZIZ(this, list, interfaceC65784Pro);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC73229Sob(LifecycleOwner parent, C56603MJj c56603MJj, InterfaceC61500OBs interfaceC61500OBs) {
        super(parent);
        C60930Nvi c60930Nvi;
        o.LJIIIZ(parent, "parent");
        if (interfaceC61500OBs != null) {
            c60930Nvi = C60903NvH.LIZJ(interfaceC61500OBs);
        } else {
            c60930Nvi = null;
        }
        C73246Sos LJIIIIZZ = C73340SqO.LJIIIIZZ(c56603MJj);
        this.LJLJI = new C73231Sod<>(new C73241Son(this, new AqS178S0100000_12(this, (AbstractC73229Sob<Object>) 696)), LJIIIIZZ, c60930Nvi);
    }
}
