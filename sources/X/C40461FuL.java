package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("compliance_universal")
/* renamed from: X.FuL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40461FuL extends AbstractC55363Lo7 {
    public final Activity LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC40458FuI LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final EnumC40513FvB LJLJJL;
    public final int LJLJJLL;

    public /* synthetic */ C40461FuL() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        Activity activity = this.LJLIL;
        if (activity instanceof LifecycleOwner) {
            o.LJII(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            return C54081LKj.LIZ(activity, (LifecycleOwner) activity);
        }
        return null;
    }

    @Override // X.M74
    public final AY1 getPopupExtraParams() {
        return new AY1(this.LJLILLLLZI);
    }

    @Override // X.M74
    public final EnumC40513FvB getPopupType() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJLL;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        wrapper.LIZ();
    }

    @Override // X.M74
    public final void onPopupStateChanged(M7A fromState, M7A toState) {
        InterfaceC40458FuI interfaceC40458FuI;
        o.LJIIIZ(fromState, "fromState");
        o.LJIIIZ(toState, "toState");
        super.onPopupStateChanged(fromState, toState);
        if (toState == M7A.SHOWED) {
            InterfaceC40458FuI interfaceC40458FuI2 = this.LJLJI;
            if (interfaceC40458FuI2 != null) {
                interfaceC40458FuI2.LIZIZ();
                return;
            }
            return;
        }
        if (toState != M7A.DISMISSED || (interfaceC40458FuI = this.LJLJI) == null) {
            return;
        }
        interfaceC40458FuI.LIZ();
    }

    public C40461FuL(Activity activity, String contentPopupId, InterfaceC40458FuI interfaceC40458FuI, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(contentPopupId, "contentPopupId");
        this.LJLIL = activity;
        this.LJLILLLLZI = contentPopupId;
        this.LJLJI = interfaceC40458FuI;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = EnumC40513FvB.CONTAINER;
        this.LJLJJLL = 110;
    }
}
