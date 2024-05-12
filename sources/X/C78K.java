package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.78K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C78K extends F9E implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C78K(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C78K)) {
            return false;
        }
        return o.LJ(this.LJLIL.getAid(), ((C78K) interfaceC57784Mm4).LJLIL.getAid());
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C78K)) {
            return false;
        }
        return o.LJ(this.LJLIL.getAid(), ((C78K) interfaceC57784Mm4).LJLIL.getAid());
    }
}
