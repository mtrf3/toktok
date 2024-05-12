package X;

import android.content.Context;
import android.widget.RemoteViews;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS69S0400000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MCJ extends MCF {
    public abstract int[] LJIILIIL();

    @Override // X.MCF
    public final void LIZ(Context context, RemoteViews remoteViews) {
        o.LJIIIZ(context, "context");
        new C56384MAy(context, LJIIIIZZ(), "now_camera_widget", "click_now_camera_widget").LIZIZ(remoteViews, R.id.nj1);
    }

    @Override // X.MCF
    public final void LIZIZ(Context context, RemoteViews remoteViews) {
        o.LJIIIZ(context, "context");
        remoteViews.setViewVisibility(R.id.bxv, 0);
        new MB0(context, LJIIIIZZ()).LIZIZ(remoteViews, R.id.bxv);
    }

    @Override // X.MCF
    public final void LJIIJJI(Context context, MCK mck, RemoteViews remoteViews, AqS69S0400000_9 aqS69S0400000_9) {
        o.LJIIIZ(context, "context");
        Aweme aweme = (Aweme) ORZ.LJLLLL(mck.LIZIZ);
        MCF.LJIIL(remoteViews, context, aweme);
        if (mck.LJ) {
            new C56384MAy(context, LJIIIIZZ(), "now_camera_icon", "click_now_camera_icon").LIZIZ(remoteViews, R.id.b31);
        } else {
            remoteViews.setViewVisibility(R.id.b31, 8);
        }
        MCI.LIZIZ(new MCM(context, (UrlModel) ORZ.LJLLLL(mck.LIZLLL), aqS69S0400000_9, LJIILIIL(), C32151Nz.LJIIZILJ(22), remoteViews, LJIIIIZZ(), aweme));
        LJIIJ(context, aweme).LIZIZ(remoteViews, R.id.bxv);
        LIZLLL(MCI.LIZLLL(aweme, mck.LIZJ), context, mck, remoteViews, aqS69S0400000_9);
    }
}
