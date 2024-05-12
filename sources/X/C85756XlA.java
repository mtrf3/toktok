package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("profile_passkey_registration")
/* renamed from: X.XlA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85756XlA extends AbstractC55363Lo7 {
    public final Activity LJLIL;
    public final InterfaceC85767XlL LJLILLLLZI;
    public final InterfaceC88472Yns<InterfaceC85767XlL, C76800UCe> LJLJI;
    public final int LJLJJI;

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
    public final EnumC40513FvB getPopupType() {
        return EnumC40513FvB.POPUP;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJI;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLJI.invoke(new C85757XlB(this, wrapper));
    }

    public C85756XlA(Activity activity, InterfaceC85767XlL existingCallback, C85768XlM c85768XlM) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(existingCallback, "existingCallback");
        this.LJLIL = activity;
        this.LJLILLLLZI = existingCallback;
        this.LJLJI = c85768XlM;
        this.LJLJJI = 160;
    }
}
