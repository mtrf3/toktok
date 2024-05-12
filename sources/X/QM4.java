package X;

import android.content.pm.Signature;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.security.MessageDigest;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QM4 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        o.LJIIIIZZ(byteArray, "sig.toByteArray()");
        try {
            StringBuffer stringBuffer = new StringBuffer();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(byteArray);
                byte[] digest = messageDigest.digest();
                int length = digest.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    if (Integer.toHexString(digest[i] & 255).length() == 1) {
                        stringBuffer.append(CardStruct.IStatusCode.DEFAULT);
                        stringBuffer.append(Integer.toHexString(digest[i] & 255));
                    } else {
                        stringBuffer.append(Integer.toHexString(digest[i] & 255));
                    }
                    i = i2;
                }
                String stringBuffer2 = stringBuffer.toString();
                o.LJIIIIZZ(stringBuffer2, "buffer.toString()");
                String upperCase = stringBuffer2.toUpperCase();
                o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase()");
                return upperCase;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            QM7 qm7 = new QM7();
            qm7.LIZJ("share_sdk_get_pkg_sign_failed");
            qm7.LIZIZ(e.getMessage(), "err_msg");
            qm7.LIZIZ(android.util.Log.getStackTraceString(e), "err_msg_stack");
            qm7.LIZLLL();
        }
        return "";
    }
}
