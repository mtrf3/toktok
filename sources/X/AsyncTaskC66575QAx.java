package X;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* renamed from: X.QAx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class AsyncTaskC66575QAx extends PthreadAsyncTask<android.net.Uri, C76800UCe, Integer> {
    public final /* synthetic */ UGO LIZ;
    public final /* synthetic */ android.net.Uri LIZIZ;
    public final /* synthetic */ Bitmap LIZJ;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] url) {
        boolean z;
        FileDescriptor fileDescriptor;
        o.LJIIIZ(url, "url");
        String LIZJ = C31950CgM.LIZJ(this.LIZ.getContext(), this.LIZIZ);
        UGO ugo = this.LIZ;
        android.net.Uri uri = this.LIZIZ;
        int i = 0;
        if (LIZJ == null || ujb.o.LJJJJJL(LIZJ)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = BitmapUtils.readPictureDegree(LIZJ);
        } else if (Build.VERSION.SDK_INT >= 24) {
            ugo.getClass();
            try {
                ParcelFileDescriptor openFileDescriptor = ugo.getContext().getContentResolver().openFileDescriptor(uri, "r");
                if (openFileDescriptor != null) {
                    fileDescriptor = openFileDescriptor.getFileDescriptor();
                } else {
                    fileDescriptor = null;
                }
                if (fileDescriptor != null) {
                    int attributeInt = new ExifInterface(fileDescriptor).getAttributeInt("Orientation", 1);
                    if (attributeInt != 3) {
                        if (attributeInt != 6) {
                            if (attributeInt == 8) {
                                i = 270;
                            }
                        } else {
                            i = 90;
                        }
                    } else {
                        i = 180;
                    }
                }
            } catch (IOException unused) {
            }
        } else {
            i = BitmapUtils.readPictureDegree(uri.getPath());
        }
        return Integer.valueOf(i);
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            this.LIZ.LIZ(num.intValue(), this.LIZJ);
        }
    }

    public AsyncTaskC66575QAx(UGO ugo, android.net.Uri uri, Bitmap bitmap) {
        this.LIZ = ugo;
        this.LIZIZ = uri;
        this.LIZJ = bitmap;
    }
}
