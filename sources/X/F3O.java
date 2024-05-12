package X;

import android.content.Context;
import android.os.Debug;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.tailor.Tailor;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F3O {
    public static File LIZ;

    public static void LIZ(Context context, final ArrayList<String> arrayList) {
        File LLIIJI = C16880lQ.LLIIJI(context, "dumpCrashFileDir");
        LLIIJI.mkdirs();
        final File file = new File(LLIIJI, "dump.hprof");
        if (file.exists()) {
            try {
                File LLIIJI2 = C16880lQ.LLIIJI(context, "dumpCrashFileDir");
                LLIIJI2.mkdirs();
                File file2 = new File(LLIIJI2, "dump.hprof");
                String absolutePath = file2.getAbsolutePath();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LLIIJI2.getAbsolutePath());
                LIZ2.append("/.mini.hprof");
                String LIZIZ = X1D.LIZIZ(LIZ2);
                Tailor.tailorHprof(absolutePath, LIZIZ);
                File file3 = new File(LIZIZ);
                ArrayList arrayList2 = new ArrayList();
                if (file3.exists()) {
                    C16880lQ.LLLZZIL(file2);
                    absolutePath = file3.getAbsolutePath();
                    arrayList2.add(LIZIZ);
                } else {
                    arrayList2.add(absolutePath);
                }
                C38976FRk.LIZ(LLIIJI2.getAbsolutePath(), arrayList2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LLIIJI2.getAbsolutePath());
                LIZ3.append("/dump.xzip");
                File file4 = new File(X1D.LIZIZ(LIZ3));
                LIZ = file4;
                if (file4.exists()) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(LLIIJI2.getAbsolutePath());
                    LIZ4.append("/dump.xzip");
                    absolutePath = X1D.LIZIZ(LIZ4);
                    C16880lQ.LLLZZIL(file3);
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : C09970aH.LJ().entrySet()) {
                    try {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    } catch (Throwable unused) {
                    }
                }
                UCH uch = new UCH();
                String serverDeviceId = AppLog.getServerDeviceId();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(DeviceRegisterManager.getAppId());
                LIZ5.append("");
                F9U.LIZ.LJII(new F3H(uch, X1D.LIZIZ(LIZ5), serverDeviceId, "test_hprof_dump", Collections.singletonList(absolutePath), "dump.hprof", jSONObject, new C1A7()));
            } catch (Throwable unused2) {
            }
        }
        Npth.registerCrashCallback(new ICrashCallback() { // from class: X.EPY
            @Override // com.bytedance.crash.ICrashCallback
            public final void onCrash(CrashType crashType, String str, Thread thread) {
                ArrayList arrayList3 = arrayList;
                File file5 = file;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        Iterator it = arrayList3.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            if (str.contains((String) it.next())) {
                                z = true;
                            }
                        }
                        if (z) {
                            Debug.dumpHprofData(file5.getAbsolutePath());
                        }
                    }
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }, CrashType.ALL);
    }
}
