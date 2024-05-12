package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Mnw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57900Mnw implements InterfaceC57927MoN {
    public final EnumC58046MqI LJLIL;
    public final AbstractC57896Mns LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public boolean LJLJJL;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthCard(platform=");
        LIZ.append(this.LJLIL);
        LIZ.append(", strategy=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", showWhenHasDataOnly=");
        LIZ.append(this.LJLJI);
        LIZ.append(", elementId=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC57927MoN
    public final String getElementId() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC57927MoN
    public final boolean isRemoved() {
        return this.LJLJJL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C57900Mnw) || this.LJLIL != ((C57900Mnw) obj).LJLIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57927MoN
    public final void setRemoved(boolean z) {
        this.LJLJJL = true;
    }

    public C57900Mnw(EnumC58046MqI platform, AbstractC57896Mns strategy, boolean z) {
        String elementId = platform.name();
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(elementId, "elementId");
        this.LJLIL = platform;
        this.LJLILLLLZI = strategy;
        this.LJLJI = z;
        this.LJLJJI = elementId;
    }
}
