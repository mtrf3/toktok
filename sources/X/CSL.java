package X;

import android.text.style.ClickableSpan;

/* loaded from: classes6.dex */
public final class CSL implements CTX {
    public final /* synthetic */ C68322mC<String> LIZ;

    public CSL(C68322mC<String> c68322mC) {
        this.LIZ = c68322mC;
    }

    @Override // X.CTX
    public final void onEventDown(ClickableSpan clickableSpan) {
        if (clickableSpan instanceof C30777C6b) {
            this.LIZ.element = "user_name";
        } else {
            if (!(clickableSpan instanceof C30778C6c)) {
                return;
            }
            this.LIZ.element = "comment";
        }
    }
}
