package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FRH extends PthreadAsyncTask<Void, Void, Void> {
    public final /* synthetic */ Context LIZ;

    public FRH(Context context) {
        this.LIZ = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] params) {
        o.LJIIIZ(params, "params");
        Context context = this.LIZ;
        HashMap hashMap = new HashMap();
        AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(hashMap);
        if (context != null) {
            Logger.debug();
            try {
                C77125UOr.LJJ(context, 1, C38354F3m.LJFF(hashMap));
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
