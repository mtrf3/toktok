package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.fe.method.feature.TakePhotoFeature;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.XsZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class AsyncTaskC86215XsZ extends PthreadAsyncTask<Void, Void, File> {
    public final WeakReference<Activity> LIZ;
    public final WeakReference<TakePhotoFeature> LIZIZ;

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        TakePhotoFeature takePhotoFeature = this.LIZIZ.get();
        if (takePhotoFeature == null) {
            return;
        }
        takePhotoFeature.mOnFileSelected.LIZ(0, "uploadCancel");
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Activity activity = this.LIZ.get();
        if (activity != null) {
            try {
                String format = new SimpleDateFormat("yyyy-MMdd_HHmmss").format(new Date());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Dou_fsm_");
                LIZ.append(format);
                return File.createTempFile(X1D.LIZIZ(LIZ), ".jpg", C16880lQ.LLIIJLIL(activity));
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        File file = (File) obj;
        TakePhotoFeature takePhotoFeature = this.LIZIZ.get();
        Activity activity = this.LIZ.get();
        if (takePhotoFeature == null || activity == null) {
            return;
        }
        if (file == null) {
            takePhotoFeature.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        takePhotoFeature.setFilePath(file.getAbsolutePath());
        android.net.Uri LIZ = C40680Fxs.LIZ(activity, file);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", LIZ);
        intent.addFlags(3);
        intent.putExtra("pns.sandbox.dataflow_id", 1207965441);
        C16880lQ.LJFF(activity, 1, intent);
    }

    public AsyncTaskC86215XsZ(Activity activity, TakePhotoFeature takePhotoFeature) {
        this.LIZ = new WeakReference<>(activity);
        this.LIZIZ = new WeakReference<>(takePhotoFeature);
    }
}
