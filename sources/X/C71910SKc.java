package X;

import Y.ACListenerS32S0100000_12;
import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.SKc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71910SKc extends AbstractC71915SKh {
    public final SK9 LIZIZ;

    @Override // X.SKZ
    public final Class<? extends SKZ> LJFF() {
        return C71910SKc.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71910SKc(SK9 builder) {
        super(builder);
        o.LJIIIZ(builder, "builder");
        this.LIZIZ = builder;
    }

    @Override // X.AbstractC71915SKh
    public final void LJIIIIZZ(AI8 ai8) {
        boolean z;
        CharSequence charSequence = null;
        if (!(ai8.getAccessory() instanceof AIF)) {
            Context context = ai8.getContext();
            o.LJIIIIZZ(context, "tuxTextCell.context");
            ai8.setAccessory(new AIF(context, null));
        }
        InterfaceC71919SKl interfaceC71919SKl = this.LIZ.LJII;
        if (interfaceC71919SKl != null) {
            z = interfaceC71919SKl.isEnabled();
        } else {
            z = true;
        }
        ai8.setCellEnabled(z);
        AI9 accessory = ai8.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
        AIF aif = (AIF) accessory;
        InterfaceC65784Pro<? extends CharSequence> interfaceC65784Pro = this.LIZIZ.LJIILIIL;
        if (interfaceC65784Pro != null) {
            charSequence = interfaceC65784Pro.invoke();
        }
        aif.LJIILIIL(charSequence);
        aif.LJFF(this.LIZIZ.LJIIIZ);
        aif.LJIILJJIL(new ACListenerS32S0100000_12(this, 159));
    }
}
