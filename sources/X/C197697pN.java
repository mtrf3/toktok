package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7pN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197697pN extends F9E implements InterfaceC57784Mm4 {
    public final EnumC198697qz LJLIL;
    public final EnumC198137q5 LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C197697pN)) {
            return false;
        }
        C197697pN c197697pN = (C197697pN) interfaceC57784Mm4;
        if (this.LJLIL != c197697pN.LJLIL || this.LJLILLLLZI != c197697pN.LJLILLLLZI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C197697pN)) {
            return false;
        }
        C197697pN c197697pN = (C197697pN) interfaceC57784Mm4;
        if (this.LJLIL != c197697pN.LJLIL || this.LJLILLLLZI != c197697pN.LJLILLLLZI) {
            return false;
        }
        return true;
    }

    public C197697pN(EnumC198697qz scene, EnumC198137q5 newYearEventType) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(newYearEventType, "newYearEventType");
        this.LJLIL = scene;
        this.LJLILLLLZI = newYearEventType;
    }
}
