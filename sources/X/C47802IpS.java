package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.mediakit.fetcher.AVMDLFetcherMakerInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import java.util.Hashtable;

/* renamed from: X.IpS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47802IpS implements AVMDLFetcherMakerInterface {
    public static final Hashtable<String, C47875Iqd> LIZIZ = new Hashtable<>();
    public final Context LIZ;

    public C47802IpS() {
    }

    public C47802IpS(Context context) {
        this.LIZ = context;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLFetcherMakerInterface
    public final AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("getFetcher rawKey ", str, ", fileKey ", str2, ", oldURL ");
        JBR.LJIIIZ(LIZLLL, str3, LIZLLL, "FetcherMaker");
        C47875Iqd c47875Iqd = LIZIZ.get(str);
        if (c47875Iqd == null) {
            C78253UnR.LJI("FetcherMaker", "getFetcher FetcherBase is null");
            return null;
        }
        String str4 = c47875Iqd.LIZ;
        String str5 = c47875Iqd.LIZIZ;
        int i = c47875Iqd.LIZJ;
        if (TextUtils.isEmpty(str5) || (i != 3 && TextUtils.isEmpty(str4))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getFetcher FetcherBase is error ");
            LIZ.append(c47875Iqd);
            C78253UnR.LJI("FetcherMaker", X1D.LIZIZ(LIZ));
            return null;
        }
        C47803IpT c47803IpT = new C47803IpT(this.LIZ, str5, str4);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("return fetcher to mdl ");
        LIZ2.append(c47803IpT);
        C78253UnR.LJI("FetcherMaker", X1D.LIZIZ(LIZ2));
        return c47803IpT;
    }
}
