package X;

import Y.ARunnableS16S0201000_13;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenRequestLayoutInvalidFixedSettings;

/* loaded from: classes14.dex */
public final class UJS implements View.OnLayoutChangeListener {
    public final /* synthetic */ UJP LJLIL;
    public final /* synthetic */ C1O4 LJLILLLLZI;

    public UJS(UJP ujp, C1O4 c1o4) {
        this.LJLIL = ujp;
        this.LJLILLLLZI = c1o4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ARunnableS16S0201000_13 aRunnableS16S0201000_13 = new ARunnableS16S0201000_13(i4, this.LJLIL, this.LJLILLLLZI, 8);
        if (LivePublicScreenRequestLayoutInvalidFixedSettings.INSTANCE.getValue()) {
            view.post(aRunnableS16S0201000_13);
        } else {
            aRunnableS16S0201000_13.run();
        }
    }
}
