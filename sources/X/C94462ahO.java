package X;

import android.widget.EditText;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import kotlin.jvm.internal.IDqS179S0200000_42;

/* renamed from: X.ahO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94462ahO extends C94254ae2 {
    public final /* synthetic */ IDqS179S0200000_42 LIZ;

    public C94462ahO(IDqS179S0200000_42 iDqS179S0200000_42) {
        this.LIZ = iDqS179S0200000_42;
    }

    @Override // X.InterfaceC93791aWZ
    public final boolean LLZIL(boolean z, boolean z2, boolean z3) {
        if (z && ((EditText) this.LIZ.l1).hasFocus()) {
            ((EditText) this.LIZ.l1).clearFocus();
            ((BehaviourEditFragment) this.LIZ.l0).Ll().jv0();
            return true;
        }
        return false;
    }
}
