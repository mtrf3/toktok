package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes12.dex */
public final class QZF {
    public static boolean LIZIZ(Intent intent) {
        Bundle LLJJIJI;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (LLJJIJI = C16880lQ.LLJJIJI(intent)) == null) {
            return false;
        }
        return "1".equals(LLJJIJI.getString("google.c.a.e"));
    }

    public static void LIZ(Bundle bundle, String str) {
        String str2;
        String string;
        try {
            C67195QYt.LIZIZ();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string2 = bundle.getString("google.c.a.c_id");
            if (string2 != null) {
                bundle2.putString("_nmid", string2);
            }
            String string3 = bundle.getString("google.c.a.c_l");
            if (string3 != null) {
                bundle2.putString("_nmn", string3);
            }
            String string4 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("label", string4);
            }
            String string5 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string5)) {
                bundle2.putString("message_channel", string5);
            }
            String string6 = bundle.getString("from");
            if (string6 != null && string6.startsWith("/topics/")) {
                bundle2.putString("_nt", string6);
            }
            String string7 = bundle.getString("google.c.a.ts");
            if (string7 != null) {
                try {
                    bundle2.putInt("_nmt", CastIntegerProtector.parseInt(string7));
                } catch (NumberFormatException unused) {
                }
            }
            if (bundle.containsKey("google.c.a.udt") && (string = bundle.getString("google.c.a.udt")) != null) {
                try {
                    bundle2.putInt("_ndt", CastIntegerProtector.parseInt(string));
                } catch (NumberFormatException unused2) {
                }
            }
            if (C67224QZw.LJFF(bundle)) {
                str2 = "display";
            } else {
                str2 = "data";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            C67195QYt LIZIZ = C67195QYt.LIZIZ();
            LIZIZ.LIZ();
            InterfaceC67188QYm interfaceC67188QYm = (InterfaceC67188QYm) LIZIZ.LIZLLL.LIZ(InterfaceC67188QYm.class);
            if (interfaceC67188QYm != null) {
                interfaceC67188QYm.LIZIZ(str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }
}
