package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sync.settings.SettingsV2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QUW implements InterfaceC67072QUa {
    public static final QUZ LJLJJL = new QUZ();
    public final Context LJLIL;
    public QUX LJLILLLLZI = new QUX(this);
    public final QUY LJLJI;
    public final List<InterfaceC67072QUa> LJLJJI;

    public final SettingsV2 LIZIZ() {
        return (SettingsV2) this.LJLILLLLZI.LIZLLL(new Object[0]);
    }

    public QUW(Context context) {
        QUY quy = new QUY(this);
        this.LJLJI = quy;
        this.LJLJJI = new ArrayList();
        this.LJLIL = context;
        quy.LIZLLL(new Object[0]);
    }

    public static QUW LIZJ(Context context) {
        return (QUW) LJLJJL.LIZLLL(context);
    }

    @Override // X.InterfaceC67072QUa
    public final void LIZ(C67074QUc c67074QUc) {
        if (c67074QUc == null) {
            return;
        }
        String str = null;
        try {
            byte[] bArr = c67074QUc.LIZ;
            if (bArr == null) {
                QUU.LIZJ().LIZ(null, "data is null");
                return;
            }
            String str2 = new String(bArr);
            try {
                new JSONObject(str2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("update local settings : ");
                LIZ.append(str2);
                C66629QCz.LIZ(X1D.LIZIZ(LIZ));
                SharedPreferences sharedPreferences = (SharedPreferences) this.LJLJI.LIZLLL(new Object[0]);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("server_settings", str2).apply();
                }
                this.LJLILLLLZI = new QUX(this);
                synchronized (this.LJLJJI) {
                    int size = ((ArrayList) this.LJLJJI).size();
                    InterfaceC67072QUa[] interfaceC67072QUaArr = new InterfaceC67072QUa[size];
                    ((ArrayList) this.LJLJJI).toArray(interfaceC67072QUaArr);
                    for (int i = 0; i < size; i++) {
                        interfaceC67072QUaArr[i].LIZ(c67074QUc);
                    }
                }
            } catch (Exception e) {
                e = e;
                str = str2;
                C16880lQ.LLLLIIL(e);
                QUU.LIZJ().LIZ(str, android.util.Log.getStackTraceString(e));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void LIZLLL(InterfaceC67072QUa interfaceC67072QUa) {
        synchronized (this.LJLJJI) {
            ((ArrayList) this.LJLJJI).remove(interfaceC67072QUa);
        }
    }
}
