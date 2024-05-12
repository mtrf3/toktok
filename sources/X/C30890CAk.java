package X;

import android.view.View;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;

/* renamed from: X.CAk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30890CAk extends C30891CAl {
    public final /* synthetic */ HybridDialogFragment LIZ;

    public C30890CAk(HybridDialogFragment hybridDialogFragment) {
        this.LIZ = hybridDialogFragment;
    }

    @Override // X.C0KA
    public final void LIZIZ(int i, View view) {
        if (i == 5) {
            this.LIZ.dismissAllowingStateLoss();
        }
    }
}
