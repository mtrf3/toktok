package X;

import Y.AfS60S0100000_8;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import com.ss.android.ugc.aweme.vision.background.CropImageWindowViewModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KHM {
    public static final /* synthetic */ int LJIIJ = 0;
    public final View LIZ;
    public final CropImageWindowViewModel LIZIZ;
    public final PhotoSearchViewModel LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public String LJI = "";
    public final C62822Ol8 LJII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 707));
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 706));
    public final C62822Ol8 LJIIIZ;

    public final W5G LIZIZ() {
        Object value = this.LJII.getValue();
        o.LJIIIIZZ(value, "<get-imageView>(...)");
        return (W5G) value;
    }

    public final void LIZ(String detection) {
        PhotoSearchEnterParams photoSearchEnterParams;
        o.LJIIIZ(detection, "detection");
        this.LJI = detection;
        Object value = this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-imageErrorView>(...)");
        ((ImageView) value).setVisibility(8);
        CropImageWindowViewModel cropImageWindowViewModel = this.LIZIZ;
        if (cropImageWindowViewModel != null) {
            PhotoSearchViewModel photoSearchViewModel = this.LIZJ;
            if (photoSearchViewModel != null) {
                photoSearchEnterParams = photoSearchViewModel.LJLILLLLZI;
            } else {
                photoSearchEnterParams = null;
            }
            AbstractC73672Svk.LJIIJ(new C80931VpX(photoSearchEnterParams, this.LIZ.getContext(), cropImageWindowViewModel, detection, (int) KL2.LIZJ(this.LIZ.getContext(), 40.0f))).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS60S0100000_8(this, 29), new AfS60S0100000_8(this, 30));
        }
    }

    public KHM(View view, CropImageWindowViewModel cropImageWindowViewModel, PhotoSearchViewModel photoSearchViewModel) {
        this.LIZ = view;
        this.LIZIZ = cropImageWindowViewModel;
        this.LIZJ = photoSearchViewModel;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 705));
        this.LJIIIZ = LIZIZ;
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-backgroundView>(...)");
        ((C131775Fd) value).setColor(-1);
    }
}
