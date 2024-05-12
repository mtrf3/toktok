package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherListener;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.IpV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47805IpV implements AVMDLURLFetcherInterface {
    public WeakReference<InterfaceC47822Ipm> LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String[] LIZLLL;
    public C47804IpU LJ;
    public AVMDLURLFetcherListener LJFF;
    public String LJI;
    public C47164IfA LJII;

    public final InterfaceC47822Ipm LIZ() {
        WeakReference<InterfaceC47822Ipm> weakReference = this.LIZ;
        if (weakReference == null) {
            TTVideoEngineLog.d("MDLFetcherNew", "getMDLFetcherListener is null");
            return null;
        }
        return weakReference.get();
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final void close() {
        C47804IpU c47804IpU = this.LJ;
        if (c47804IpU != null) {
            c47804IpU.LJI();
            this.LJ = null;
        }
        this.LIZ = null;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final String[] getURLs() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mdl getURLs ");
        JBR.LJIIIZ(LIZ, Arrays.toString(this.LIZLLL), LIZ, "MDLFetcherNew");
        return this.LIZLLL;
    }

    public C47805IpV(InterfaceC47822Ipm interfaceC47822Ipm) {
        this.LIZ = new WeakReference<>(interfaceC47822Ipm);
    }

    public static String[] LIZIZ(String str, C47164IfA c47164IfA) {
        if (c47164IfA == null || TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getUrlsFromVideoModelByFileHash videoModel is null or fileHash is empty ");
            LIZ.append(str);
            C78253UnR.LJI("MDLFetcherNew", X1D.LIZIZ(LIZ));
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(15, str);
        if (str.startsWith("fileid")) {
            try {
                hashMap.put(28, str.substring(6));
            } catch (IndexOutOfBoundsException unused) {
                C78253UnR.LIZLLL("MDLFetcherNew", "fileid index out of bounds");
            }
        }
        C47160If6 LJJIIZ = c47164IfA.LJJIIZ(hashMap);
        if (LJJIIZ == null) {
            C78253UnR.LJI("MDLFetcherNew", "getUrlsFromVideoModelByFileHash videoInfo is null");
            return null;
        }
        String[] LJIIIZ = LJJIIZ.LJIIIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getUrlsFromVideoModelByFileHash ");
        JBR.LJIIIZ(LIZ2, Arrays.toString(LJIIIZ), LIZ2, "MDLFetcherNew");
        return LJIIIZ;
    }

    public static boolean LIZJ(String str, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                TTVideoEngineLog.d("MDLFetcherNew", "new urls is invalid");
                return false;
            }
        }
        return true;
    }

    public final void LIZLLL(C47789IpF c47789IpF, boolean z) {
        C47164IfA LJFF;
        JSONObject LJIILL;
        if (z) {
            this.LJFF.onCompletion(c47789IpF.LIZ, this.LIZIZ, this.LIZJ, null);
        }
        InterfaceC47822Ipm LIZ = LIZ();
        if (LIZ != null) {
            LIZ.LJ(c47789IpF, this.LIZJ);
            if (c47789IpF.LIZ == -10003 && (LJFF = LIZ.LJFF()) != null && (LJIILL = LJFF.LJIILL()) != null) {
                C78253UnR.LJI("MDLFetcherNew", C16880lQ.LLLZ("old video model: %s", new Object[]{LJIILL.toString()}));
            }
        }
        close();
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener) {
        boolean z;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("start rawKey ", str, ", fileKey ", str2, ", olderUrl ");
        LIZLLL.append(str3);
        LIZLLL.append(", listener ");
        LIZLLL.append(aVMDLURLFetcherListener);
        C78253UnR.LJI("MDLFetcherNew", X1D.LIZIZ(LIZLLL));
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJFF = aVMDLURLFetcherListener;
        this.LJI = str3;
        InterfaceC47822Ipm LIZ = LIZ();
        if (LIZ == null) {
            C78253UnR.LJI("MDLFetcherNew", "start MDLFetcherListener is null return MDL_GET_URLS");
            LIZLLL(new C47789IpF("kTTVideoErrorDomainMDLRetry", -10001, 0, "MDLFetcherListener is empty"), false);
            return 1;
        }
        String LIZJ = LIZ.LIZJ();
        if (TextUtils.isEmpty(LIZJ)) {
            C78253UnR.LJI("MDLFetcherNew", "start fallbackApi is empty return MDL_GET_URLS");
            LIZLLL(new C47789IpF("kTTVideoErrorDomainMDLRetry", -10002, 0, "fallbackApi is empty"), false);
            return 1;
        }
        C47749Iob LIZ2 = C47748Ioa.LIZIZ().LIZ(this.LIZIZ, LIZJ);
        if (LIZ2 == null || LIZ2.LIZJ) {
            C78253UnR.LJI("MDLFetcherNew", "getURLsFromCache cacheInfo is null or isExpired");
        } else {
            C47164IfA c47164IfA = LIZ2.LIZ;
            this.LJII = c47164IfA;
            String[] LIZIZ = LIZIZ(this.LIZJ, c47164IfA);
            if (LIZIZ == null || LIZIZ.length <= 0) {
                C78253UnR.LJI("MDLFetcherNew", "getURLsFromCache temUrls is null");
            } else if (!LIZJ(str3, LIZIZ)) {
                C47748Ioa.LIZIZ().LJFF(this.LIZIZ, LIZJ);
                C78253UnR.LJI("MDLFetcherNew", "getURLsFromCache urls is invalid");
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("getURLsFromCache ");
                JBR.LJIIIZ(LIZ3, Arrays.toString(LIZIZ), LIZ3, "MDLFetcherNew");
                if (LIZIZ.length > 0) {
                    this.LIZLLL = LIZIZ;
                    C78253UnR.LJI("MDLFetcherNew", "start return MDL_GET_URLS");
                    C47164IfA c47164IfA2 = this.LJII;
                    InterfaceC47822Ipm LIZ4 = LIZ();
                    if (LIZ4 != null) {
                        LIZ4.LIZLLL(c47164IfA2, false, this.LIZJ);
                    }
                    close();
                    return 1;
                }
            }
        }
        Context context = LIZ.getContext();
        C47804IpU c47804IpU = new C47804IpU(context);
        this.LJ = c47804IpU;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        c47804IpU.LJIILIIL = z;
        if (z) {
            C47903Ir5.LIZ(context);
        }
        C47804IpU c47804IpU2 = this.LJ;
        c47804IpU2.LJIIL = str;
        c47804IpU2.LJII = new C47806IpW(this);
        C47804IpU c47804IpU3 = this.LJ;
        c47804IpU3.getClass();
        c47804IpU3.LJI = true;
        this.LJ.LJII(0, LIZJ, null, null);
        C78253UnR.LJI("MDLFetcherNew", "start return CALLBACK_URLS_TO_MDL");
        return 0;
    }
}
