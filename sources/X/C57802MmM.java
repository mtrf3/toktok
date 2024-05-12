package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.MmM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57802MmM extends F9E implements InterfaceC57784Mm4 {
    public final EnumC72483ScZ LJLIL;
    public final IMUser LJLILLLLZI;

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
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C57802MmM(EnumC72483ScZ scene, IMUser imUser) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(imUser, "imUser");
        this.LJLIL = scene;
        this.LJLILLLLZI = imUser;
    }
}
