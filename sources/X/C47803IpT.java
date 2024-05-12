package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherListener;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.IpT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47803IpT implements AVMDLURLFetcherInterface {
    public final String LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String[] LJ;
    public C47804IpU LJFF;
    public AVMDLURLFetcherListener LJI;
    public final Context LJII;
    public String LJIIIIZZ;

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final void close() {
        C47804IpU c47804IpU = this.LJFF;
        if (c47804IpU != null) {
            c47804IpU.LJI();
            this.LJFF = null;
        }
        this.LJ = null;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final String[] getURLs() {
        String[] strArr = this.LJ;
        if (strArr != null && strArr.length > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get urls from cache. + urls.length = ");
            C47956Irw.LIZIZ(LIZ, this.LJ.length, LIZ, "MDLFetcher");
            return this.LJ;
        }
        return null;
    }

    public static String[] LIZ(String str, C47164IfA c47164IfA) {
        if (c47164IfA == null || TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("_getUrlsFromVideoModel videoModel is null or fileHash is empty ");
            LIZ.append(str);
            TTVideoEngineLog.d("MDLFetcher", X1D.LIZIZ(LIZ));
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(15, str);
        C47160If6 LJJIIZ = c47164IfA.LJJIIZ(hashMap);
        if (LJJIIZ != null) {
            String[] LJIIIZ = LJJIIZ.LJIIIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("_getUrlsFromVideoModel ");
            LIZ2.append(Arrays.toString(LJIIIZ));
            TTVideoEngineLog.d("MDLFetcher", X1D.LIZIZ(LIZ2));
            if (LJIIIZ == null || LJIIIZ.length <= 0) {
                return null;
            }
            return LJIIIZ;
        }
        TTVideoEngineLog.d("MDLFetcher", "_getUrlsFromVideoModel videoInfo is null");
        return null;
    }

    public C47803IpT(Context context, String str, String str2) {
        this.LJII = context;
        this.LIZ = C77117UOj.LIZ(str);
        this.LIZIZ = str2;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener) {
        C47749Iob LIZ;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("start rawKey ", str, ", fileKey ", str2, ", olderUrl ");
        LIZLLL.append(str3);
        LIZLLL.append(", listener ");
        LIZLLL.append(aVMDLURLFetcherListener);
        C78253UnR.LJI("MDLFetcher", X1D.LIZIZ(LIZLLL));
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJI = aVMDLURLFetcherListener;
        this.LJIIIIZZ = str3;
        synchronized (C47803IpT.class) {
            LIZ = C47748Ioa.LIZIZ().LIZ(this.LIZJ, this.LIZ);
        }
        if (LIZ != null && !LIZ.LIZJ) {
            C78253UnR.LJI("MDLFetcher", C16880lQ.LLLZ("get videoModel from cache,key is %s; videoId = %s", new Object[]{this.LIZLLL, this.LIZJ}));
            String[] LIZ2 = LIZ(this.LIZLLL, LIZ.LIZ);
            if (!TextUtils.isEmpty(str3) && LIZ2 != null && LIZ2.length > 0) {
                this.LJ = LIZ2;
                for (String str4 : LIZ2) {
                    if (str4.equals(str3)) {
                        this.LJ = null;
                        synchronized (C47803IpT.class) {
                            C47748Ioa.LIZIZ().LJFF(this.LIZJ, this.LIZ);
                        }
                        break;
                    }
                }
            }
            if (this.LJ != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("start get urls from cache ");
                JBR.LJIIIZ(LIZ3, Arrays.toString(this.LJ), LIZ3, "MDLFetcher");
                return 1;
            }
        }
        Context context = this.LJII;
        C47804IpU c47804IpU = new C47804IpU(context);
        this.LJFF = c47804IpU;
        if (this.LJII != null) {
            c47804IpU.LJIILIIL = true;
            C47903Ir5.LIZ(context);
        }
        C47804IpU c47804IpU2 = this.LJFF;
        c47804IpU2.LJIIL = str;
        c47804IpU2.LJII = new C47807IpX(this);
        C47804IpU c47804IpU3 = this.LJFF;
        Boolean valueOf = Boolean.valueOf(true ^ TextUtils.isEmpty(this.LIZ));
        c47804IpU3.getClass();
        c47804IpU3.LJI = valueOf.booleanValue();
        this.LJFF.LJII(0, this.LIZ, null, this.LIZIZ);
        return 0;
    }
}
