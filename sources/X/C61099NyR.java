package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.NyR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61099NyR {
    public static final C61098NyQ LIZIZ = new C61098NyQ();
    public static final LinkedList<AbstractC61106NyY> LIZJ = new LinkedList<>();
    public static final LinkedList<AbstractC61106NyY> LIZLLL = new LinkedList<>();
    public static boolean LJ;
    public final C61100NyS LIZ;

    public static final C61099NyR LIZIZ(Activity activity, Cert cert) {
        return LIZIZ.LIZIZ(activity, cert);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public final C61100NyS LIZ(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        C61100NyS c61100NyS = this.LIZ;
        c61100NyS.LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length));
        return c61100NyS;
    }

    public C61099NyR(Activity activity, Cert cert) {
        o.LJIIIZ(activity, "activity");
        C61100NyS c61100NyS = new C61100NyS(cert);
        c61100NyS.LIZIZ = new WeakReference<>(activity);
        C61101NyT c61101NyT = c61100NyS.LIZJ;
        WeakReference<Context> weakReference = new WeakReference<>(activity);
        c61101NyT.getClass();
        c61101NyT.LJ = weakReference;
        this.LIZ = c61100NyS;
    }
}
