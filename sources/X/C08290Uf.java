package X;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.o;

/* renamed from: X.0Uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08290Uf extends AutofillManager.AutofillCallback {
    public static final C08290Uf LIZ = new C08290Uf();

    public final void LIZ(C1N8 autofill) {
        o.LJIIIZ(autofill, "autofill");
        autofill.LIZJ.registerCallback(this);
    }

    public final void LIZIZ(C1N8 autofill) {
        o.LJIIIZ(autofill, "autofill");
        autofill.LIZJ.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i, int i2) {
        o.LJIIIZ(view, "view");
        super.onAutofillEvent(view, i, i2);
    }
}
