package X;

import com.bytedance.jedi.arch.ext.list.ListViewModel;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS99S0101000_12;

/* renamed from: X.Sn4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73134Sn4 extends AbstractC73133Sn3 {
    public final /* synthetic */ AqS162S0100000_12 LJLJJI;

    @Override // X.AbstractC73133Sn3
    public final void LIZ() {
        ((ListViewModel) this.LJLJJI.l0).LJIIJJI();
    }

    public C73134Sn4(AqS162S0100000_12 aqS162S0100000_12) {
        this.LJLJJI = aqS162S0100000_12;
    }

    @Override // X.AbstractC73133Sn3
    public final void LIZIZ(AqS99S0101000_12 aqS99S0101000_12) {
        ((ListViewModel) this.LJLJJI.l0).withState(new AqS178S0100000_12(aqS99S0101000_12, 98));
    }
}
