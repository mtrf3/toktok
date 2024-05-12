package X;

import android.content.SharedPreferences;
import com.bytedance.sync.settings.SettingsV2;
import com.google.gson.Gson;

/* loaded from: classes12.dex */
public class QUX extends AbstractC48851JFf {
    public final /* synthetic */ QUW LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QUX(QUW quw) {
        super(1);
        this.LIZJ = quw;
    }

    @Override // X.AbstractC48851JFf
    public final Object LIZIZ(Object[] objArr) {
        String string;
        SharedPreferences sharedPreferences = (SharedPreferences) this.LIZJ.LJLJI.LIZLLL(new Object[0]);
        if (sharedPreferences == null || (string = sharedPreferences.getString("server_settings", null)) == null) {
            return new SettingsV2();
        }
        try {
            return (SettingsV2) new Gson().LJI(string, SettingsV2.class);
        } catch (Throwable unused) {
            return new SettingsV2();
        }
    }
}
