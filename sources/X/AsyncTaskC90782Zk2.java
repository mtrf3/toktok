package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;

/* renamed from: X.Zk2, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class AsyncTaskC90782Zk2 extends PthreadAsyncTask<android.net.Uri, Long, Bitmap> {
    public static final C90469Zez LIZJ = new C90469Zez("FetchBitmapTask");
    public final InterfaceC90425ZeH LIZ;
    public final C90423ZeF LIZIZ;

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        android.net.Uri uri;
        InterfaceC90425ZeH interfaceC90425ZeH;
        android.net.Uri[] uriArr = (android.net.Uri[]) objArr;
        Bitmap bitmap = null;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (interfaceC90425ZeH = this.LIZ) == null) {
            return null;
        }
        try {
            bitmap = interfaceC90425ZeH.LLIIJI(uri);
            return bitmap;
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = LIZJ;
            C16880lQ.LJLLJ(InterfaceC90425ZeH.class);
            c90469Zez.getClass();
            return bitmap;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C90423ZeF c90423ZeF = this.LIZIZ;
        if (c90423ZeF != null) {
            c90423ZeF.getClass();
            InterfaceC90422ZeE interfaceC90422ZeE = c90423ZeF.LJ;
            if (interfaceC90422ZeE != null) {
                interfaceC90422ZeE.LIZ(bitmap);
            }
            c90423ZeF.LIZLLL = null;
        }
    }

    public AsyncTaskC90782Zk2(Context context, int i, int i2, C90423ZeF c90423ZeF) {
        InterfaceC90425ZeH interfaceC90425ZeH;
        this.LIZIZ = c90423ZeF;
        Context LLLLL = C16880lQ.LLLLL(context);
        try {
            interfaceC90425ZeH = C90282Zby.LIZ(C16880lQ.LLLLL(LLLLL)).LLLII(new BinderC68153Qov(this), new BinderC90781Zk1(this), i, i2);
        } catch (C90113ZYf | RemoteException unused) {
            C90469Zez c90469Zez = C90282Zby.LIZ;
            C16880lQ.LJLLJ(InterfaceC90294ZcA.class);
            c90469Zez.getClass();
            interfaceC90425ZeH = null;
        }
        this.LIZ = interfaceC90425ZeH;
    }
}
