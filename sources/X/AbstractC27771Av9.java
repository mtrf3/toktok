package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Av9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27771Av9 implements InterfaceC57927MoN {
    public final String LJLIL;
    public final InterfaceC88472Yns<Context, View> LJLILLLLZI;
    public final boolean LJLJI;
    public boolean LJLJJI;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC57927MoN
    public final String getElementId() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC57927MoN
    public final boolean isRemoved() {
        return this.LJLJJI;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC27771Av9)) {
            return false;
        }
        return o.LJ(((AbstractC27771Av9) obj).LJLIL, this.LJLIL);
    }

    @Override // X.InterfaceC57927MoN
    public final void setRemoved(boolean z) {
        this.LJLJJI = true;
    }

    public AbstractC27771Av9(String str, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = z;
    }
}
