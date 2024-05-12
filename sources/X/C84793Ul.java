package X;

import Y.AObserverS69S0100000_1;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84793Ul {
    public final C73305Spp LIZ;
    public final View LIZIZ;
    public final ShareDialogViewModel LIZJ;
    public final boolean LIZLLL;

    public final void LIZ(boolean z) {
        if (this.LIZLLL) {
            if (z) {
                this.LIZ.setVisibility(0);
                this.LIZ.LJFF();
                this.LIZIZ.setVisibility(0);
                this.LIZIZ.setEnabled(false);
                return;
            }
            this.LIZIZ.setEnabled(true);
            this.LIZ.setVisibility(8);
        }
    }

    public C84793Ul(C73305Spp c73305Spp, C4NJ c4nj, ShareDialogViewModel viewModel, boolean z, ActivityC45651qj lifecycleOwner) {
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = c73305Spp;
        this.LIZIZ = c4nj;
        this.LIZJ = viewModel;
        this.LIZLLL = z;
        viewModel.LJLJL.observe(lifecycleOwner, new AObserverS69S0100000_1(this, 8));
        viewModel.LJLJJLL.observe(lifecycleOwner, new AObserverS69S0100000_1(this, 9));
        viewModel.LJLJLJ.observe(lifecycleOwner, new AObserverS69S0100000_1(this, 10));
    }
}
