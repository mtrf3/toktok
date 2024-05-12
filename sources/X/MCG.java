package X;

import android.content.Context;
import android.widget.RemoteViews;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS69S0400000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCG extends MCF {
    public boolean LIZ;

    @Override // X.MCF
    public final int LJFF() {
        return R.layout.h_;
    }

    @Override // X.MCF
    public final int LJI() {
        return R.layout.hc;
    }

    @Override // X.MCF
    public final int LJII() {
        return 1;
    }

    @Override // X.MCF
    public final String LJIIIIZZ() {
        return "now_m";
    }

    @Override // X.MCF
    public final MCQ LJ(MCK mck) {
        int i;
        int LIZIZ = C7MY.LIZIZ(24);
        int LIZIZ2 = C7MY.LIZIZ(1);
        if (this.LIZ) {
            i = 3;
        } else {
            i = 4;
        }
        return new MCQ(LIZIZ, LIZIZ2, (Integer) null, i, 0.0f, 0.0f, 0, 0, (Boolean) null, (EnumC86195XsF) null, false, 4084);
    }

    @Override // X.MCF
    public final void LIZ(Context context, RemoteViews remoteViews) {
        o.LJIIIZ(context, "context");
        new C56384MAy(context, "now_m", "now_camera_widget", "click_now_camera_widget").LIZIZ(remoteViews, R.id.nj1);
    }

    @Override // X.MCF
    public final void LIZIZ(Context context, RemoteViews remoteViews) {
        o.LJIIIZ(context, "context");
        remoteViews.setViewVisibility(R.id.bxv, 0);
        remoteViews.setViewVisibility(R.id.b3b, 8);
        remoteViews.setViewVisibility(R.id.lao, 8);
        remoteViews.setViewVisibility(R.id.c7z, 8);
        remoteViews.setViewVisibility(R.id.afu, 8);
        new MB0(context, "now_m").LIZIZ(remoteViews, R.id.nj1);
    }

    @Override // X.MCF
    public final void LJIIJJI(Context context, MCK mck, RemoteViews remoteViews, AqS69S0400000_9 aqS69S0400000_9) {
        boolean z;
        int i;
        int[] iArr;
        o.LJIIIZ(context, "context");
        new C56384MAy(context, "now_m", "now_camera_icon", "click_now_camera_icon").LIZIZ(remoteViews, R.id.b31);
        int i2 = R.id.byc;
        remoteViews.removeAllViews(R.id.byc);
        int i3 = 1;
        if (mck.LIZIZ.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
        if (z) {
            i = R.layout.ha;
        } else {
            i = R.layout.hb;
        }
        int size = mck.LIZIZ.size() - 1;
        while (-1 < size) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), i);
            remoteViews.addView(i2, remoteViews2);
            Aweme aweme = (Aweme) ORZ.LJLLLLLL(size, mck.LIZIZ);
            MCF.LJIIL(remoteViews2, context, aweme);
            UrlModel urlModel = (UrlModel) ORZ.LJLLLLLL(size, mck.LIZLLL);
            float LJIIZILJ = C32151Nz.LJIIZILJ(16);
            if (mck.LIZLLL.size() == i3 && size == 0) {
                iArr = new int[2];
                iArr[0] = C7MY.LIZIZ(180);
                iArr[i3] = O6R.LJJIIZ(C32151Nz.LJIIZILJ(112));
            } else {
                iArr = new int[2];
                iArr[0] = C7MY.LIZIZ(88);
                iArr[i3] = O6R.LJJIIZ(C32151Nz.LJIIZILJ(112));
            }
            MCI.LIZIZ(new MCM(context, urlModel, aqS69S0400000_9, iArr, LJIIZILJ, remoteViews2, "now_m", aweme));
            LJIIJ(context, aweme).LIZIZ(remoteViews2, R.id.bxv);
            LIZLLL(MCI.LIZLLL(aweme, mck.LIZJ), context, mck, remoteViews2, aqS69S0400000_9);
            size--;
            i2 = R.id.byc;
            i3 = 1;
        }
        new C56385MAz(context, "now_m", "").LIZIZ(remoteViews, R.id.nj1);
    }
}
