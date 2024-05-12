package X;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;

/* loaded from: classes12.dex */
public final class QKE {
    public static JFL LIZ;
    public static String LIZIZ;
    public static Account LIZJ;

    public static JFL LIZ(Context context) {
        QKS qks;
        if (DeviceRegisterManager.hasInit()) {
            if (LIZ == null) {
                synchronized (QKE.class) {
                    if (LIZ == null) {
                        if (context == null) {
                            throw new IllegalArgumentException("context == null");
                        }
                        if (TextUtils.isEmpty(LIZIZ)) {
                            LIZIZ = QK9.LIZ;
                        }
                        if ("local_test".equals(LIZIZ) && (qks = (QKS) C58318Mug.LIZ(QKS.class)) != null && qks.LIZIZ()) {
                            try {
                                QKS qks2 = (QKS) C58318Mug.LIZ(QKS.class);
                                if (qks2.LJ()) {
                                    qks2.clearCache();
                                }
                                LIZ = qks2.LIZLLL();
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                        if (LIZ == null) {
                            JFQ jfq = new JFQ(context, DeviceRegisterManager.isLocalTest());
                            LIZ = jfq;
                            Account account = LIZJ;
                            if (account != null) {
                                jfq.LJ(account);
                            }
                        }
                    }
                }
            }
            return LIZ;
        }
        throw new IllegalStateException("please init TeaAgent first");
    }
}
