package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Xsl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class AsyncTaskC86227Xsl extends PthreadAsyncTask<C76800UCe, C76800UCe, android.net.Uri> {
    public final boolean LIZ;
    public final WeakReference<Activity> LIZIZ;
    public final WeakReference<C86225Xsj> LIZJ;

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        C86225Xsj c86225Xsj = this.LIZJ.get();
        if (c86225Xsj == null) {
            return;
        }
        c86225Xsj.LIZIZ.LIZ(-7, "Take photo cancelled");
    }

    public final android.net.Uri LIZ(Context context) {
        String LJFF = i0.LJFF("Dou_fsm_", new SimpleDateFormat("yyyy-MMdd_HHmmss", Locale.ENGLISH).format(new Date()));
        if (this.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJFF);
            LIZ.append(".jpg");
            return C268613q.LIZJ(context, X1D.LIZIZ(LIZ));
        }
        File createTempFile = File.createTempFile(LJFF, ".jpg", new C268313n(EnumC46497IMr.CACHE.getToken()));
        C86225Xsj c86225Xsj = this.LIZJ.get();
        if (c86225Xsj != null) {
            String absolutePath = createTempFile.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "file.absolutePath");
            c86225Xsj.LJFF = absolutePath;
        }
        return C40680Fxs.LIZ(context, createTempFile);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] params) {
        o.LJIIIZ(params, "params");
        Activity activity = this.LIZIZ.get();
        if (activity != null) {
            try {
                return LIZ(activity);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        android.net.Uri uri = (android.net.Uri) obj;
        C86225Xsj c86225Xsj = this.LIZJ.get();
        Activity activity = this.LIZIZ.get();
        if (c86225Xsj == null || activity == null) {
            return;
        }
        if (uri == null) {
            c86225Xsj.LIZIZ.LIZ(0, "Take photo failed");
            return;
        }
        c86225Xsj.LJ = uri;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (o.LJ(c86225Xsj.LJI, "front")) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            intent.putExtra("default_camera", "1");
            intent.putExtra("default_mode", "com.huawei.camera2.mode.photo.PhotoMode");
            intent.putExtra("camerafacing", "front");
            intent.putExtra("previous_mode", "front");
        }
        intent.putExtra("output", uri);
        intent.putExtra("pns.sandbox.dataflow_id", 1207965441);
        intent.addFlags(3);
        C16880lQ.LJFF(activity, 1, intent);
    }

    public AsyncTaskC86227Xsl(Activity activity, C86225Xsj feature, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(feature, "feature");
        this.LIZ = z;
        this.LIZIZ = new WeakReference<>(activity);
        this.LIZJ = new WeakReference<>(feature);
    }
}
