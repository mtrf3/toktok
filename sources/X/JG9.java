package X;

import android.database.ContentObserver;
import android.os.Handler;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class JG9 extends ContentObserver {
    public final /* synthetic */ JG8 LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JG9(JG8 jg8, Handler handler) {
        super(handler);
        this.LIZ = jg8;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        onChange(z);
        synchronized (this.LIZ) {
            String queryParameter = uri.getQueryParameter("key");
            String queryParameter2 = uri.getQueryParameter("value");
            String queryParameter3 = uri.getQueryParameter("aid");
            if (!TextUtils.isEmpty(queryParameter)) {
                ((ConcurrentHashMap) JG8.LIZJ).put(queryParameter, queryParameter2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("install_info send to child process onUpdate ");
                LIZ.append(queryParameter2);
                LIZ.append(" aid ：");
                LIZ.append(queryParameter3);
                X1D.LIZIZ(LIZ);
                List<JGB> list = (List) ((ConcurrentHashMap) JG8.LIZLLL).get(queryParameter);
                if (list != null) {
                    for (JGB jgb : list) {
                        if (jgb != null) {
                            jgb.LIZIZ(queryParameter2, queryParameter3);
                        }
                    }
                }
            }
        }
    }
}
