package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.IDqS175S0200000_42;

/* renamed from: X.aWc, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93794aWc extends FrameLayout {
    public AppCompatImageView LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    private final float getTextSizePixel() {
        return (float) (((this.LJLILLLLZI - this.LJLJI) / 2) * Math.sqrt(2.0d));
    }

    public C93794aWc(Context context) {
        super(context, null, 0);
        this.LJLILLLLZI = C93742aVm.LIZIZ(20);
        this.LJLJI = C93742aVm.LIZIZ(1);
        Math.sqrt(2.0d);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(C93902aYM.LIZIZ(this, C93742aVm.LIZIZ(60), C93742aVm.LIZIZ(60), C93742aVm.LIZIZ(4), C93742aVm.LIZIZ(4), null, null, 496));
        new IDqS175S0200000_42(this, context, 13).invoke(appCompatImageView);
        C93902aYM.LIZ(appCompatImageView, this);
    }
}
