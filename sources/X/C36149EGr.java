package X;

import Y.ACallableS11S0102000_6;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.port.internal.IMediaCacheService;
import com.ss.android.vesdk.VEMediaParser;
import java.util.HashMap;
import ujb.o;

/* renamed from: X.EGr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36149EGr implements IMediaCacheService {
    @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
    public final void cacheImageSize(String str) {
        if (str == null || o.LJJJJJL(str)) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C36147EGp(str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
    public final OSZ<Integer, Integer> getImageColorCache(String str) {
        boolean z;
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        HashMap<String, OSZ<Integer, Integer>> hashMap = C37335El1.LIZJ;
        if (hashMap.containsKey(str)) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("getImageColorCache ", str, "-->:");
            LIZIZ.append(hashMap.get(str));
            H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZIZ));
            return hashMap.get(str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getImageColorCache ");
        LIZ.append(str);
        LIZ.append("-->null");
        H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
    public final OSZ<Integer, Integer> getImageSizeCache(String str) {
        boolean z;
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        HashMap<String, OSZ<Integer, Integer>> hashMap = C37335El1.LIZIZ;
        if (hashMap.containsKey(str)) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("getImageSizeCache ", str, "-->:");
            LIZIZ.append(hashMap.get(str));
            H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZIZ));
            return hashMap.get(str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getImageSizeCache ");
        LIZ.append(str);
        LIZ.append("-->null");
        H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
    public final Bitmap getMediaBlurThumbnail(String str) {
        boolean z;
        Bitmap bitmap;
        if (str == null) {
            return null;
        }
        C37336El2 c37336El2 = C37335El1.LJFF;
        synchronized (c37336El2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getMediaBlurThumbnail cached ");
            LIZ.append(str);
            LIZ.append(": ");
            if (c37336El2.get(str) != null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
            bitmap = c37336El2.get(str);
        }
        return bitmap;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
    public final Boolean getMediaTypeCache(String str) {
        boolean z;
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        HashMap<String, Boolean> hashMap = C37335El1.LIZ;
        if (hashMap.containsKey(str)) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("get ", str, "-->isImage:");
            LIZIZ.append(hashMap.get(str));
            H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZIZ));
            return hashMap.get(str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get ");
        LIZ.append(str);
        LIZ.append("-->isImage:null");
        H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
    public final void removeTargetMediaBlurThumbnailCache(String path) {
        kotlin.jvm.internal.o.LJIIIZ(path, "path");
        C37336El2 c37336El2 = C37335El1.LJFF;
        if (c37336El2.get(path) != null) {
            c37336El2.remove(path);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
    public final void updateMediaTypeCache(String str) {
        if (str == null || o.LJJJJJL(str)) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C36148EGq(str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
    public final void cacheImageColor(String str, int i) {
        if (str == null || o.LJJJJJL(str)) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C45282Hpu(str, i, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
    public final void cacheMediaBlurThumbnail(String str, int i, Integer num) {
        if (str == null || o.LJJJJJL(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (num != null) {
            int intValue = num.intValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("new cacheMediaBlurThumbnail ");
            LIZ.append(str);
            LIZ.append(' ');
            H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
            VEMediaParser vEMediaParser = new VEMediaParser();
            vEMediaParser.init(str);
            C10K.LIZJ(new ACallableS11S0102000_6(intValue, i, vEMediaParser, 0)).LJ(new C37334El0(vEMediaParser, str, currentTimeMillis), C10K.LJI, null);
        }
        if (C37335El1.LJFF.get(str) != null) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C37341El7(i, currentTimeMillis, str, null), 3);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("new cacheMediaBlurThumbnail ");
        LIZ2.append(str);
        LIZ2.append(' ');
        H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ2));
    }
}
