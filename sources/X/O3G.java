package X;

import android.app.Application;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class O3G implements InterfaceC61239O1r {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r5 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d A[Catch: IOException -> 0x0190, TryCatch #1 {IOException -> 0x0190, blocks: (B:43:0x0135, B:45:0x0142, B:50:0x015d, B:52:0x0168, B:57:0x014d), top: B:42:0x0135 }] */
    @Override // X.InterfaceC61239O1r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r22, boolean r23, X.O1L r24, X.C61229O1h r25) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O3G.LIZ(java.lang.String, boolean, X.O1L, X.O1h):void");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object, java.lang.String] */
    public final void LIZIZ(Application application, String str, O1L o1l, String str2, String str3, boolean z, File file, int i, O3J o3j) {
        O1U o1u;
        String str4;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        if (o1l instanceof O1U) {
            o1u = (O1U) o1l;
        } else {
            o1u = null;
        }
        if (o1u != null && o1u.LJIILLIIL == 1) {
            android.net.Uri sourceUri = UriProtector.parse(str);
            if (!s.LJJJLZIJ(str, (CharSequence) ListProtector.get(o1u.LJIILL, i), false)) {
                Uri.Builder builder = new Uri.Builder();
                o.LJFF(sourceUri, "sourceUri");
                str4 = builder.scheme(sourceUri.getScheme()).authority((String) ListProtector.get(o1u.LJIILL, i)).query(sourceUri.getQuery()).path(sourceUri.getPath()).toString();
                o.LJFF(str4, "targetUri.toString()");
            } else {
                str4 = str;
            }
            if (i + 1 < o1u.LJIILL.size()) {
                Uri.Builder builder2 = new Uri.Builder();
                o.LJFF(sourceUri, "sourceUri");
                ?? builder3 = builder2.scheme(sourceUri.getScheme()).authority((String) ListProtector.get(o1u.LJIILL, i)).query(sourceUri.getQuery()).path(sourceUri.getPath()).toString();
                o.LJFF(builder3, "Uri.Builder().scheme(sou…ourceUri.path).toString()");
                c68322mC.element = builder3;
            }
        } else {
            str4 = str;
        }
        O3H o3h = new O3H(this, application, z, file, c68322mC, str, o1l, str2, str3, i, o3j);
        DownloadTask with = C84261X5d.with(application);
        with.url(str4);
        with.name(str3);
        with.savePath(str2);
        with.addListenerToSameTask(true);
        with.deleteCacheIfCheckFailed(true);
        o1l.getClass();
        with.retryCount(0);
        with.autoSetHashCodeForSameTask(true);
        with.ttnetProtectTimeout(20000L);
        with.expiredRedownload(true);
        with.mainThreadListener(o3h);
        with.download();
    }
}
