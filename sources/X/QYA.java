package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.regex.Matcher;

/* loaded from: classes12.dex */
public final class QYA extends QYM {
    public final /* synthetic */ QY9 LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        QY9 qy9 = this.LIZ;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new QYG());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        qy9.LJI = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        qy9.LJFF = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (android.util.Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            "Unexpected response action: ".concat(valueOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent2, "registration_id");
                if (LLJJIJIIJIL == null) {
                    LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent2, "unregistered");
                }
                if (LLJJIJIIJIL == null) {
                    String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent2, "error");
                    if (LLJJIJIIJIL2 == null) {
                        new StringBuilder(String.valueOf(C16880lQ.LLJJIJI(intent2)).length() + 49);
                        return;
                    }
                    if (android.util.Log.isLoggable("Rpc", 3) && LLJJIJIIJIL2.length() != 0) {
                        "Received InstanceID error ".concat(LLJJIJIIJIL2);
                    }
                    if (LLJJIJIIJIL2.startsWith("|")) {
                        String[] split = LLJJIJIIJIL2.split("\\|");
                        if (split.length <= 2 || !"ID".equals(split[1])) {
                            if (LLJJIJIIJIL2.length() == 0) {
                                return;
                            }
                            "Unexpected structured response ".concat(LLJJIJIIJIL2);
                            return;
                        } else {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            qy9.LIZLLL(C16880lQ.LLJJIJI(intent2.putExtra("error", str2)), str);
                            return;
                        }
                    }
                    synchronized (qy9.LIZ) {
                        int i = 0;
                        while (true) {
                            C0MA<String, C67649Qgn<Bundle>> c0ma = qy9.LIZ;
                            if (i < c0ma.LJLJI) {
                                qy9.LIZLLL(C16880lQ.LLJJIJI(intent2), c0ma.LJIIIIZZ(i));
                                i++;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = QY9.LJIIJ.matcher(LLJJIJIIJIL);
                if (!matcher.matches()) {
                    if (!android.util.Log.isLoggable("Rpc", 3) || LLJJIJIIJIL.length() == 0) {
                        return;
                    }
                    "Unexpected response string: ".concat(LLJJIJIIJIL);
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group == null) {
                    return;
                }
                Bundle LLJJIJI = C16880lQ.LLJJIJI(intent2);
                LLJJIJI.putString("registration_id", group2);
                qy9.LIZLLL(LLJJIJI, group);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QYA(QY9 qy9, Looper looper) {
        super(looper);
        this.LIZ = qy9;
    }
}
