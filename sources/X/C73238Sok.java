package X;

import X.AbstractC029409q;
import X.InterfaceC73258Sp4;
import kotlin.jvm.internal.o;

/* JADX WARN: Incorrect field signature: TT; */
/* renamed from: X.Sok, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73238Sok<T extends AbstractC029409q<?> & InterfaceC73258Sp4<?, ? extends C73236Soi<?>>> implements C0AK {
    public final AbstractC029409q LJLIL;
    public final InterfaceC88472Yns<Integer, Integer> LJLILLLLZI;

    public C73238Sok(AbstractC029409q adapter) {
        C2TQ positionMapper = C2TQ.LJLIL;
        o.LJIIJ(adapter, "adapter");
        o.LJIIJ(positionMapper, "positionMapper");
        this.LJLIL = adapter;
        this.LJLILLLLZI = positionMapper;
    }

    @Override // X.C0AK
    public final void LJJIJLIJ(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        this.LJLIL.notifyItemRangeRemoved(this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue(), i2);
    }

    @Override // X.C0AK
    public final void LJLIIIL(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        ((InterfaceC73258Sp4) this.LJLIL).LJJJZ().LIZLLL.LIZ();
        int intValue = this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue();
        this.LJLIL.notifyItemRangeInserted(intValue, i2);
        ((InterfaceC73258Sp4) this.LJLIL).LJJJZ().LIZLLL.LIZIZ(intValue);
    }

    @Override // X.C0AK
    public final void LJLJLLL(int i, int i2) {
        this.LJLIL.notifyItemMoved(this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue(), this.LJLILLLLZI.invoke(Integer.valueOf(i2)).intValue());
    }

    @Override // X.C0AK
    public final void LJJLIIIJILLIZJL(int i, int i2, Object obj) {
        this.LJLIL.notifyItemRangeChanged(this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue(), i2, obj);
    }
}
