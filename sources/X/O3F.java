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
public final class O3F implements InterfaceC61272O2y {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r5 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fc, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r11, com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ff, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
    
        if (r4.exists() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (r24.LJ != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (kotlin.jvm.internal.o.LJ(com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r10, "onlyLocal"), "1") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (kotlin.jvm.internal.o.LJ(android.os.Looper.myLooper(), X.C16880lQ.LLJJJJ()) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r23 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0114, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0116, code lost:
    
        r1 = r9.getPath();
        kotlin.jvm.internal.o.LJFF(r1, "parent.path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0121, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0123, code lost:
    
        r10 = r9.getPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013a, code lost:
    
        if (r10 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013e, code lost:
    
        r1 = new java.io.File(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0147, code lost:
    
        if (r1.exists() != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0149, code lost:
    
        r1.mkdirs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014c, code lost:
    
        r15 = r9.getPath();
        kotlin.jvm.internal.o.LJFF(r15, "parent.path");
        LIZIZ(r12, r22, r24, r15, r6 + '.' + r5, r17, r4, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0170, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0137, code lost:
    
        if (new java.io.File(r1).exists() != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0171, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0172, code lost:
    
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0176, code lost:
    
        if (r0 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0178, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0179, code lost:
    
        r25.onFailed(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c8, code lost:
    
        r17 = true;
        r10 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r12).getDownloadInfo(r22, r9.getPath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d6, code lost:
    
        if (r11 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        if (r4.exists() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e2, code lost:
    
        if (r10.cacheExpierd() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e4, code lost:
    
        r10 = r4.getAbsolutePath();
        kotlin.jvm.internal.o.LJFF(r10, "destination.absolutePath");
        r25.LIZ(new X.O37(r10, true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010e, code lost:
    
        r25.onFailed("cdn: only local");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0106, code lost:
    
        X.C16880lQ.LLLZZIL(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009c, code lost:
    
        if ((r24 instanceof X.O1V) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a3, code lost:
    
        if (((X.O1V) r24).LJIJJ != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00a5, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0098, code lost:
    
        if (X.C38262Ezy.LIZ().LIZ == false) goto L30;
     */
    @Override // X.InterfaceC61272O2y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r22, boolean r23, X.O1M r24, X.O2V r25) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O3F.LIZ(java.lang.String, boolean, X.O1M, X.O2V):void");
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.Object, java.lang.String] */
    public final void LIZIZ(Application application, String str, O1M o1m, String str2, String str3, boolean z, File file, int i, O3K o3k) {
        O1V o1v;
        String str4;
        boolean z2;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        if (o1m instanceof O1V) {
            o1v = (O1V) o1m;
        } else {
            o1v = null;
        }
        if (o1v != null && o1v.LJIJI == 1) {
            android.net.Uri sourceUri = UriProtector.parse(str);
            if (!s.LJJJLZIJ(str, (CharSequence) ListProtector.get(o1v.LJIJ, i), false)) {
                Uri.Builder builder = new Uri.Builder();
                o.LJFF(sourceUri, "sourceUri");
                str4 = builder.scheme(sourceUri.getScheme()).authority((String) ListProtector.get(o1v.LJIJ, i)).query(sourceUri.getQuery()).path(sourceUri.getPath()).toString();
                o.LJFF(str4, "targetUri.toString()");
            } else {
                str4 = str;
            }
            if (i + 1 < o1v.LJIJ.size()) {
                Uri.Builder builder2 = new Uri.Builder();
                o.LJFF(sourceUri, "sourceUri");
                ?? builder3 = builder2.scheme(sourceUri.getScheme()).authority((String) ListProtector.get(o1v.LJIJ, i)).query(sourceUri.getQuery()).path(sourceUri.getPath()).toString();
                o.LJFF(builder3, "Uri.Builder().scheme(sou…ourceUri.path).toString()");
                c68322mC.element = builder3;
            }
        } else {
            str4 = str;
        }
        O3I o3i = new O3I(this, application, z, file, c68322mC, str, o1m, str2, str3, i, o3k);
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str4), "cdn_negotiate");
        if (C39927Flj.LIZLLL(queryParameter)) {
            z2 = o.LJ(queryParameter, "1");
        } else {
            z2 = o1m.LJIILIIL;
        }
        DownloadTask with = C84261X5d.with(application);
        with.url(str4);
        with.name(str3);
        with.savePath(str2);
        with.addListenerToSameTask(true);
        with.deleteCacheIfCheckFailed(true);
        with.retryCount(o1m.LIZIZ);
        with.autoSetHashCodeForSameTask(true);
        with.ttnetProtectTimeout(20000L);
        with.expiredRedownload(z2);
        with.mainThreadListener(o3i);
        with.download();
    }
}
