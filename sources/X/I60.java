package X;

import android.content.Intent;
import kotlin.jvm.internal.AqS189S0100000_7;

/* loaded from: classes8.dex */
public final class I60 implements InterfaceC78912Uy4 {
    public final /* synthetic */ InterfaceC88471Ynr LIZ;

    public I60(AqS189S0100000_7 aqS189S0100000_7) {
        this.LIZ = aqS189S0100000_7;
    }

    @Override // X.InterfaceC78912Uy4
    public final void onResult(int i, Intent intent) {
        this.LIZ.invoke(Integer.valueOf(i), intent);
    }
}
