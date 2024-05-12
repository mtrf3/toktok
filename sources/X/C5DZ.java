package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5DZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DZ {
    public static volatile boolean LIZIZ;
    public static final C5DZ LIZ = new C5DZ();
    public static final HashMap<C5DY, Bitmap> LIZJ = new HashMap<>();
    public static final HashMap<C5DY, C5DX> LIZLLL = new HashMap<>();
    public static final Object LJ = new Object();
    public static volatile boolean LJFF = true;

    public static int LIZ(int i) {
        int i2 = (i / 1000) * 1000;
        if (i2 + LiveMaxRetainAlogMessageSizeSetting.DEFAULT < i) {
            return i2 + 1000;
        }
        return i2;
    }

    public static long LIZIZ(String path) {
        o.LJIIIZ(path, "path");
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            return file.lastModified();
        }
        return 0L;
    }

    public static String LIZJ(NLETrackSlot slot) {
        NLEResourceAV LJIIIIZZ;
        o.LJIIIZ(slot, "slot");
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(slot.LJI());
        String path = LJJ.LJIIJ().LIZJ();
        if (C124614un.LJIILIIL(slot) && ((LJIIIIZZ = C124614un.LJIIIIZZ(slot)) == null || (path = LJIIIIZZ.LIZJ()) == null)) {
            path = "";
        }
        o.LJIIIIZZ(path, "path");
        if (path.length() > 0) {
            return path;
        }
        String LIZJ2 = LJJ.LIZIZ().LIZJ();
        o.LJIIIIZZ(LIZJ2, "convertToSegmentVideo.resource.resourceFile");
        return LIZJ2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(2:23|(2:25|26)(2:27|(2:29|(1:31))(14:32|(2:35|33)|36|37|109|55|(2:58|56)|59|60|(2:62|(2:64|18c))|80|(1:82)|18|19)))|12|(1:16)|18|19))|88|6|7|(0)(0)|12|(2:14|16)|18|19|(1:(1:76))) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c0, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c1, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("catch exception ");
        r1.append(r3);
        X.C131935Ft.LIZLLL("FrameLoader", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r18, java.lang.String r19, java.util.List r20, android.util.Size r21, X.C131235Db r22, X.C131325Dk r23, X.InterfaceC67352kd r24) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5DZ.LIZLLL(java.lang.String, java.lang.String, java.util.List, android.util.Size, X.5Db, X.5Dk, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.5Dc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C5DZ r16, final java.lang.String r17, final java.lang.String r18, final java.util.List r19, android.util.Size r20, final X.C5DX r21, X.C131325Dk r22, boolean r23, int r24) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5DZ.LJ(X.5DZ, java.lang.String, java.lang.String, java.util.List, android.util.Size, X.5DX, X.5Dk, boolean, int):void");
    }
}
