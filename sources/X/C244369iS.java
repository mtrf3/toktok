package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9iS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244369iS {
    public static boolean LIZIZ(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUri() == null) {
            return false;
        }
        String uri = urlModel.getUri();
        o.LJIIIIZZ(uri, "urlModel.uri");
        if (uri.length() == 0) {
            return false;
        }
        return true;
    }

    public static void LIZ(C119634ml c119634ml, TuxIconView tuxIconView, C72434Sbm c72434Sbm) {
        if (C238309Ww.LIZJ()) {
            c119634ml.setVisibility(8);
            tuxIconView.setVisibility(0);
            return;
        }
        c119634ml.setVisibility(8);
        tuxIconView.setTintColorRes(R.attr.go);
        Context context = c72434Sbm.getContext();
        o.LJIIIIZZ(context, "iconOverlay.context");
        Integer LJI = C79045V0n.LJI(R.attr.cj, C78605Ut7.LJIIIIZZ(context));
        if (LJI != null) {
            W5F LJII = W5U.LJII(new ColorDrawable(LJI.intValue()));
            LJII.LJIILIIL = new ColorDrawable(LJI.intValue());
            LJII.LJJIIJ = c72434Sbm;
            C16880lQ.LLJJJ(LJII);
        }
    }

    public static void LIZJ(C119634ml c119634ml, TuxIconView tuxIconView, C72434Sbm c72434Sbm) {
        if (C238309Ww.LIZJ()) {
            c119634ml.setVisibility(0);
            tuxIconView.setVisibility(8);
            return;
        }
        c119634ml.setVisibility(0);
        tuxIconView.setTintColorRes(R.attr.dj);
        Context context = c72434Sbm.getContext();
        o.LJIIIIZZ(context, "iconOverlay.context");
        Integer LJI = C79045V0n.LJI(R.attr.gw, C78605Ut7.LJII(context, false));
        if (LJI != null) {
            W5F LJII = W5U.LJII(new ColorDrawable(LJI.intValue()));
            LJII.LJIILIIL = new ColorDrawable(LJI.intValue());
            LJII.LJJIIJ = c72434Sbm;
            C16880lQ.LLJJJ(LJII);
        }
    }
}
