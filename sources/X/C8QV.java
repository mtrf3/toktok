package X;

import Y.ACListenerS25S1200000_3;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.HybridLabelTagType;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8QV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8QV {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C8QZ.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C211048Qa.LJLIL);

    static {
        C221108m2.LIZIZ(C8QY.LJLIL);
        C221108m2.LIZIZ(C8QX.LJLIL);
        C221108m2.LIZIZ(C8QW.LJLIL);
    }

    public static boolean LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (aweme.isAd() && C63081OpJ.LLJLLIL(aweme)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (LIZIZ(aweme)) {
            return true;
        }
        if (!aweme.isAd()) {
            if ((C53326KwM.LIZ() || C211258Qv.LIZ()) && !AV1.LJIJ(aweme.getAuthor())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZ(View view, Aweme aweme, String str) {
        AwemeHybridLabelModel awemeHybridLabelModel;
        List<AwemeHybridLabelModel> hybridLabels = aweme.getHybridLabels();
        if (hybridLabels != null && (awemeHybridLabelModel = (AwemeHybridLabelModel) ORZ.LJLLLLLL(0, hybridLabels)) != null && awemeHybridLabelModel.getLabelType() == HybridLabelTagType.PRIVACY.getValue()) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS25S1200000_3(aweme, view, str, 0), view);
    }
}
