package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import kotlin.jvm.internal.o;

/* renamed from: X.MAq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56376MAq extends AbstractC85293Wj {
    public final /* synthetic */ Float LJLIL;
    public final /* synthetic */ RemoteViews LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int[] LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        float f;
        int width;
        int i;
        int height;
        if (bitmap != null) {
            Float f2 = this.LJLIL;
            RemoteViews remoteViews = this.LJLILLLLZI;
            int i2 = this.LJLJI;
            int[] iArr = this.LJLJJI;
            Context context = this.LJLJJL;
            int i3 = this.LJLJJLL;
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                f = 1.0f;
            }
            int i4 = 0;
            if ((bitmap.getHeight() * 1.0f) / bitmap.getWidth() < f) {
                i = bitmap.getHeight();
                width = (int) (i / f);
                i4 = (bitmap.getWidth() - width) / 2;
                height = 0;
            } else {
                width = bitmap.getWidth();
                i = (int) (width * f);
                height = (bitmap.getHeight() - i) / 2;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, i4, height, width, i);
            o.LJIIIIZZ(createBitmap, "createBitmap(originBitma…argetWidth, targetHeight)");
            remoteViews.setImageViewBitmap(i2, C56374MAo.LIZIZ(iArr, createBitmap));
            try {
                AppWidgetManager.getInstance(context).updateAppWidget(i3, remoteViews);
            } catch (Throwable unused) {
            }
        }
    }

    public C56376MAq(Float f, RemoteViews remoteViews, int i, int[] iArr, Context context, int i2) {
        this.LJLIL = f;
        this.LJLILLLLZI = remoteViews;
        this.LJLJI = i;
        this.LJLJJI = iArr;
        this.LJLJJL = context;
        this.LJLJJLL = i2;
    }
}
