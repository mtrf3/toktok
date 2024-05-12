package androidx.compose.ui.platform;

import X.C04D;
import X.C35931b3;
import X.C35991b9;
import X.C76800UCe;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.IDqS11S0101000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ComposeView extends C04D {
    public static final /* synthetic */ int LJLL = 0;
    public final ParcelableSnapshotMutableState LJLJLJ;
    public boolean LJLJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // X.C04D
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.LJLJLLL;
    }

    public final void setContent(InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content) {
        o.LJIIIZ(content, "content");
        this.LJLJLLL = true;
        this.LJLJLJ.setValue(content);
        if (isAttachedToWindow()) {
            LIZJ();
        }
    }

    @Override // X.C04D
    public final void LIZ(InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(420213850);
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) this.LJLJLJ.getValue();
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(LJIL, 0);
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS11S0101000(this, i, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ComposeView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C78966Uyw.LJJJIL(r1)
            r2.LJLJLJ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ComposeView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
