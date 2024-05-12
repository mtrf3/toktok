package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8Gb */
/* loaded from: classes4.dex */
public final class C208458Gb {
    public static final java.util.Map<String, String> LIZ = new LinkedHashMap();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C208478Gd.LJLIL);

    public static boolean LIZ(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        Iterator<String> it = urlModel.getUrlList().iterator();
        while (it.hasNext()) {
            if (!TextUtils.isEmpty(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(SmartImageView smartImageView, Video video, String sceneTag, boolean z, int i) {
        boolean z2;
        boolean z3 = z;
        if ((i & 8) != 0) {
            z3 = true;
        }
        if ((i & 64) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        o.LJIIIZ(sceneTag, "sceneTag");
        return LIZLLL(smartImageView, video, sceneTag, z3, null, null, z2, null, false, 768);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (X.C48207Ivz.LIZ(r2) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (X.C84S.LIZIZ("use_dynamic_cover", r2) != false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.bytedance.lighten.loader.SmartImageView r11, com.ss.android.ugc.aweme.feed.model.Video r12, java.lang.String r13, boolean r14, X.C8GR r15, java.lang.String r16, boolean r17, android.graphics.Bitmap.Config r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208458Gb.LIZIZ(com.bytedance.lighten.loader.SmartImageView, com.ss.android.ugc.aweme.feed.model.Video, java.lang.String, boolean, X.8GR, java.lang.String, boolean, android.graphics.Bitmap$Config, boolean, boolean):boolean");
    }

    public static /* synthetic */ boolean LIZLLL(SmartImageView smartImageView, Video video, String str, boolean z, C8GR c8gr, String str2, boolean z2, Bitmap.Config config, boolean z3, int i) {
        C8GR c8gr2 = c8gr;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i & 8) != 0) {
            z4 = true;
        }
        String str3 = null;
        if ((i & 16) != 0) {
            c8gr2 = null;
        }
        if ((i & 32) == 0) {
            str3 = str2;
        }
        if ((i & 64) != 0) {
            z5 = true;
        }
        if ((i & 256) != 0) {
            z6 = false;
        }
        return LIZIZ(smartImageView, video, str, z4, c8gr2, str3, z5, config, z6, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(final com.bytedance.lighten.loader.SmartImageView r16, final com.ss.android.ugc.aweme.base.model.UrlModel r17, final com.ss.android.ugc.aweme.feed.model.Video r18, final boolean r19, java.lang.String r20, java.lang.String r21, final X.C8GR r22, final boolean r23, android.graphics.Bitmap.Config r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208458Gb.LJ(com.bytedance.lighten.loader.SmartImageView, com.ss.android.ugc.aweme.base.model.UrlModel, com.ss.android.ugc.aweme.feed.model.Video, boolean, java.lang.String, java.lang.String, X.8GR, boolean, android.graphics.Bitmap$Config, boolean):void");
    }
}
