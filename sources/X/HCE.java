package X;

import android.os.Bundle;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCE<T> implements InterfaceC29911Fj<HYN> {
    public final /* synthetic */ AqS173S0100000_7 LJLIL;

    public HCE(AqS173S0100000_7 aqS173S0100000_7) {
        this.LJLIL = aqS173S0100000_7;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        HYN event = (HYN) obj;
        HCC LLIIZ = ((AbstractC46244ICy) this.LJLIL.l0).LLIIZ();
        o.LJIIIIZZ(event, "event");
        Bundle bundle = event.LIZJ;
        bundle.putParcelable("currentSticker", LLIIZ.LJLIL);
        bundle.putBoolean("is_uploadtype_sticker", LLIIZ.LJLJI);
        bundle.putBoolean("is_texttype_sticker", LLIIZ.LJLJJI);
        bundle.putParcelableArrayList("currentChallenge", LLIIZ.LJLILLLLZI);
        ((AbstractC46244ICy) this.LJLIL.l0).LLILZIL();
    }
}
