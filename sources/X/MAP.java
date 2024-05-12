package X;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

/* loaded from: classes10.dex */
public final class MAP implements InterfaceC78660Uu0 {
    public final /* synthetic */ RemoteViews LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ AppWidgetManager LJLJI;
    public final /* synthetic */ int[] LJLJJI;
    public final /* synthetic */ int LJLJJL;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.LJLIL.setImageViewBitmap(this.LJLILLLLZI, bitmap);
        this.LJLJI.partiallyUpdateAppWidget(this.LJLJJI, this.LJLIL);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        this.LJLIL.setImageViewResource(this.LJLILLLLZI, this.LJLJJL);
        this.LJLJI.partiallyUpdateAppWidget(this.LJLJJI, this.LJLIL);
    }

    public MAP(int i, int i2, AppWidgetManager appWidgetManager, RemoteViews remoteViews, int[] iArr) {
        this.LJLIL = remoteViews;
        this.LJLILLLLZI = i;
        this.LJLJI = appWidgetManager;
        this.LJLJJI = iArr;
        this.LJLJJL = i2;
    }
}
