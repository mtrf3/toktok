package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

/* renamed from: X.Lwp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55903Lwp extends AbstractC85293Wj {
    public final /* synthetic */ RemoteViews LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ Context LJLJJLL;
    public final /* synthetic */ int LJLJL;

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap != null) {
            RemoteViews remoteViews = this.LJLIL;
            int i = this.LJLILLLLZI;
            int i2 = this.LJLJI;
            int i3 = this.LJLJJI;
            float f = this.LJLJJL;
            Context context = this.LJLJJLL;
            int i4 = this.LJLJL;
            try {
                remoteViews.setImageViewBitmap(i, C55902Lwo.LJFF(i2, i3, bitmap, f));
                AppWidgetManager.getInstance(context).updateAppWidget(i4, remoteViews);
            } catch (Throwable th) {
                C0NB.LJI("FollowAddWidgetGuideUtil", th);
            }
        }
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        C0NB.LJI("FollowAddWidgetGuideUtil", th);
    }

    public C55903Lwp(RemoteViews remoteViews, int i, int i2, int i3, float f, Context context, int i4) {
        this.LJLIL = remoteViews;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = f;
        this.LJLJJLL = context;
        this.LJLJL = i4;
    }
}
