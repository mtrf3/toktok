package X;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class M74 implements InterfaceC56321M8n {
    public final InterfaceC55643Lsd scene;
    public final M78 stateWrapper;

    public /* synthetic */ M74(InterfaceC55643Lsd interfaceC55643Lsd, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC55643Lsd);
    }

    public boolean canShow() {
        return true;
    }

    public AY1 getPopupExtraParams() {
        return null;
    }

    public void onConflict() {
    }

    public final String getId() {
        return getClass().getName();
    }

    public M7A getState() {
        return getStateWrapper().LIZ;
    }

    public M76 getDependency() {
        return M75.LIZ;
    }

    public EnumC40513FvB getPopupType() {
        return EnumC40513FvB.POPUP;
    }

    @Override // X.InterfaceC56321M8n
    public M78 getStateWrapper() {
        return this.stateWrapper;
    }

    public M74(InterfaceC55643Lsd interfaceC55643Lsd) {
        this.scene = interfaceC55643Lsd;
        M78 m78 = new M78(M7A.PENDING);
        M73 m73 = new M73(this);
        synchronized (m78) {
            ((ArrayList) m78.LIZIZ).add(m73);
        }
        this.stateWrapper = m78;
    }

    public void onPopupStateChanged(M7A fromState, M7A toState) {
        o.LJIIIZ(fromState, "fromState");
        o.LJIIIZ(toState, "toState");
    }

    public void showPopupFailed(int i, String errMsg) {
        o.LJIIIZ(errMsg, "errMsg");
    }
}
