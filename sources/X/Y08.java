package X;

import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y08 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, Boolean, C76800UCe> {
    public static final Y08 LJLIL = new Y08();

    public Y08() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, Boolean bool) {
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C86675Xzz c86675Xzz = selectSubscribe.LLIIIILZ;
            if (c86675Xzz != null) {
                C86652Xzc c86652Xzc = c86675Xzz.LIZJ().LJ;
                c86652Xzc.getClass();
                if (C52280KfU.LIZ()) {
                    ImageView imageView = (ImageView) c86652Xzc.LIZ(R.id.bgr);
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    View LIZ = c86652Xzc.LIZ(R.id.e1t);
                    if (LIZ != null) {
                        LIZ.setVisibility(0);
                    }
                    View LIZ2 = c86652Xzc.LIZ(R.id.e1t);
                    if (LIZ2 != null) {
                        LIZ2.setAlpha(1.0f);
                    }
                    if (C41032G8m.LIZ()) {
                        ((ImageView) c86652Xzc.LIZ(R.id.e1s)).setVisibility(8);
                        ((ImageView) c86652Xzc.LIZ(R.id.e1r)).setVisibility(0);
                    } else {
                        ((ImageView) c86652Xzc.LIZ(R.id.e1s)).setVisibility(0);
                        ((ImageView) c86652Xzc.LIZ(R.id.e1r)).setVisibility(8);
                    }
                    C7GV.LIZ(20, c86652Xzc.LIZ(R.id.e1t));
                    c86652Xzc.LJLJJLL = true;
                }
                Y00 y00 = c86675Xzz.LIZIZ().LIZIZ;
                y00.getClass();
                if (C52280KfU.LIZ()) {
                    ((ImageView) y00.LIZ(R.id.b4m)).setVisibility(8);
                    View LIZ3 = y00.LIZ(R.id.c4q);
                    if (LIZ3 != null) {
                        LIZ3.setVisibility(0);
                    }
                    View LIZ4 = y00.LIZ(R.id.c4q);
                    if (LIZ4 != null) {
                        LIZ4.setAlpha(1.0f);
                    }
                    y00.LJLJJI = true;
                }
            }
        } else {
            C86675Xzz c86675Xzz2 = selectSubscribe.LLIIIILZ;
            if (c86675Xzz2 != null) {
                C86652Xzc c86652Xzc2 = c86675Xzz2.LIZJ().LJ;
                View LIZ5 = c86652Xzc2.LIZ(R.id.e1t);
                if (LIZ5 != null) {
                    LIZ5.setVisibility(8);
                }
                c86652Xzc2.LJLJJLL = false;
                Y00 y002 = c86675Xzz2.LIZIZ().LIZIZ;
                View LIZ6 = y002.LIZ(R.id.c4q);
                if (LIZ6 != null) {
                    LIZ6.setVisibility(8);
                }
                y002.LJLJJI = false;
            }
        }
        return C76800UCe.LIZ;
    }
}
