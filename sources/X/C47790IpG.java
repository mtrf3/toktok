package X;

import android.text.TextUtils;
import com.ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IpG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47790IpG implements AVMDLNewFetcherMakerInterface {
    public static C47790IpG LIZ;
    public static final List<WeakReference<InterfaceC47822Ipm>> LIZIZ = new ArrayList();

    public static synchronized void LIZ(InterfaceC47822Ipm interfaceC47822Ipm) {
        synchronized (C47790IpG.class) {
            if (interfaceC47822Ipm == null) {
                C78253UnR.LJI("FetcherMakerNew", "removeListener fetcherListener is null");
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("removeListener ");
            LIZ2.append(interfaceC47822Ipm);
            C78253UnR.LJI("FetcherMakerNew", X1D.LIZIZ(LIZ2));
            Iterator it = ((ArrayList) LIZIZ).iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference == null || weakReference.get() == null) {
                    it.remove();
                } else if (((InterfaceC47822Ipm) weakReference.get()) == interfaceC47822Ipm) {
                    it.remove();
                }
            }
        }
    }

    public static synchronized void LIZIZ(InterfaceC47822Ipm interfaceC47822Ipm) {
        synchronized (C47790IpG.class) {
            if (interfaceC47822Ipm == null) {
                C78253UnR.LJI("FetcherMakerNew", "storeListener fetcherListener is null");
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("storeListener ");
            LIZ2.append(interfaceC47822Ipm);
            C78253UnR.LJI("FetcherMakerNew", X1D.LIZIZ(LIZ2));
            ((ArrayList) LIZIZ).add(new WeakReference(interfaceC47822Ipm));
        }
    }

    @Override // com.ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface
    public final AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3, String str4) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("getFetcher rawKey ", str, ", fileKey ", str2, ", engineId ");
        JBR.LJIIIZ(LIZLLL, str4, LIZLLL, "FetcherMakerNew");
        synchronized (C47790IpG.class) {
            Iterator it = ((ArrayList) LIZIZ).iterator();
            while (it.hasNext()) {
                InterfaceC47822Ipm interfaceC47822Ipm = (InterfaceC47822Ipm) ((WeakReference) it.next()).get();
                if (interfaceC47822Ipm != null && TextUtils.equals(str4, interfaceC47822Ipm.getId())) {
                    C47805IpV c47805IpV = new C47805IpV(interfaceC47822Ipm);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("return fetcher to mdl ");
                    LIZ2.append(c47805IpV);
                    C78253UnR.LJI("FetcherMakerNew", X1D.LIZIZ(LIZ2));
                    return c47805IpV;
                }
            }
            C78253UnR.LIZLLL("FetcherMakerNew", "getFetcher MDLFetcherListener is null");
            return null;
        }
    }
}
