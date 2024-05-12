package X;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Fmw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40002Fmw {
    public static boolean LIZ(Context context, String phoneNumber, String content) {
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(content, "content");
        if (phoneNumber.length() > 0 && content.length() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("smsto:");
            LIZ.append(phoneNumber);
            Intent intent = new Intent("android.intent.action.SENDTO", UriProtector.parse(X1D.LIZIZ(LIZ)));
            intent.putExtra("sms_body", content);
            intent.setPackage(Telephony.Sms.getDefaultSmsPackage(context));
            try {
                if (V0N.LJIIL(context.getPackageManager(), intent).size() > 0) {
                    intent.putExtra("pns.sandbox.dataflow_id", 1207960578);
                    C16880lQ.LIZJ(context, intent);
                    return true;
                }
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            C40328FsC.LIZLLL(LJJIFFI, R.string.hip);
        }
        return false;
    }
}
