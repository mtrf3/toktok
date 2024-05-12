package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* renamed from: X.QiE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67738QiE extends BroadcastReceiver {
    public final Context LIZ;
    public final MutableLiveData<String> LIZIZ;

    public final void LIZ(Intent intent) {
        String str;
        boolean z;
        Status status;
        if (TextUtils.equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI != null && (status = (Status) C16880lQ.LLJJIII(LLJJIJI, "com.google.android.gms.auth.api.phone.EXTRA_STATUS")) != null) {
                if (status.zzc == 0) {
                    Matcher matcher = PatternProtector.compile("[0-9]{4,}").matcher((String) C16880lQ.LLJJIII(LLJJIJI, "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"));
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        if (!TextUtils.isEmpty(group)) {
                            this.LIZIZ.postValue(group);
                            z = true;
                            str = String.valueOf(status.zzc);
                        }
                    }
                }
                z = false;
                str = String.valueOf(status.zzc);
            } else {
                str = null;
                z = false;
            }
            boolean LIZ = C48479J0x.LIZ(this.LIZ);
            int LJIJI = C78555UsJ.LJIJI(this.LIZ);
            if (z) {
                LIZIZ(LJIJI, "", true, LIZ);
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Failed to get SMS data from Broadcast Receiver, status code = ");
            LIZ2.append(str);
            LIZIZ(LJIJI, X1D.LIZIZ(LIZ2), false, LIZ);
        }
    }

    public C67738QiE(Context context, MutableLiveData<String> mutableLiveData) {
        this.LIZ = context;
        this.LIZIZ = mutableLiveData;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }

    public static void LIZIZ(int i, String str, boolean z, boolean z2) {
        C40467FuR.LIZLLL(i, str, z, z2);
        C67737QiD.LIZ(i, str, z, z2);
        if (z) {
            C35936E8m c35936E8m = new C35936E8m();
            int i2 = 1;
            c35936E8m.LIZ(1, "is_successful");
            c35936E8m.LIZLLL("error_desc", str);
            if (!z2) {
                i2 = 0;
            }
            c35936E8m.LIZ(i2, "has_sim_card");
            c35936E8m.LIZ(i, "google_availability");
            FMX.LJIIL("sms_auto_fill", c35936E8m.LIZ);
        }
    }
}
