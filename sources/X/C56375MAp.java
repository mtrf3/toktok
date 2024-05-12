package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MAp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56375MAp extends AbstractC85293Wj {
    public final /* synthetic */ RemoteViews LJLIL;
    public final /* synthetic */ int[] LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ int LJLJJI;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        Bitmap bitmap2;
        if (bitmap != null) {
            RemoteViews remoteViews = this.LJLIL;
            int[] iArr = this.LJLILLLLZI;
            Context context = this.LJLJI;
            int i = this.LJLJJI;
            if (iArr != null) {
                bitmap2 = C56374MAo.LIZIZ(iArr, bitmap);
            } else {
                bitmap2 = null;
            }
            remoteViews.setImageViewBitmap(R.id.fbs, bitmap2);
            AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
        }
    }

    public C56375MAp(RemoteViews remoteViews, int[] iArr, Context context, int i) {
        this.LJLIL = remoteViews;
        this.LJLILLLLZI = iArr;
        this.LJLJI = context;
        this.LJLJJI = i;
    }
}
