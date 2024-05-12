package X;

import Y.ARunnableS28S0200000_9;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;

/* loaded from: classes10.dex */
public final class LDM extends AbstractC72439Sbr {
    public final /* synthetic */ SmartImageView LJLIL;

    public LDM(SmartImageView smartImageView) {
        this.LJLIL = smartImageView;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            OUP.LJIJJLI(smartImageView);
        }
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            smartImageView.post(new ARunnableS28S0200000_9(smartImageView, c2047581v, 50));
        }
    }
}
