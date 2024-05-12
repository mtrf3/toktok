package X;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.o;

/* renamed from: X.1N8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1N8 implements InterfaceC08260Uc {
    public final View LIZ;
    public final C08320Ui LIZIZ;
    public final AutofillManager LIZJ;

    public C1N8(View view, C08320Ui autofillTree) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(autofillTree, "autofillTree");
        this.LIZ = view;
        this.LIZIZ = autofillTree;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.LIZJ = autofillManager;
            view.setImportantForAutofill(1);
        } else {
            "Autofill service could not be located.".toString();
            throw new IllegalStateException("Autofill service could not be located.");
        }
    }
}
