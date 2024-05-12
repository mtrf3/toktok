package com.benchmark.runtime.nativePort;

import X.C09590Zf;
import X.C32771Qj;
import com.benchmark.ByteBenchBundle;
import java.util.Map;

/* loaded from: classes.dex */
public class ByteBenchContextPort {
    private native void native_init(long j);

    public final void LIZ(C09590Zf c09590Zf) {
        if (!C32771Qj.LIZIZ) {
            return;
        }
        ByteBenchBundle obtain = ByteBenchBundle.obtain();
        obtain.setString("device_model", c09590Zf.LIZIZ);
        obtain.setInt("status", 0);
        obtain.setInt("appid", c09590Zf.LIZJ);
        obtain.setString("app_name", c09590Zf.LIZLLL);
        obtain.setLong("update_version_code", c09590Zf.LJFF);
        obtain.setString("app_version", c09590Zf.LJ);
        obtain.setString("did", c09590Zf.LJI);
        obtain.setString("uid", c09590Zf.LJII);
        obtain.setBool("is_open_runtime_decision", c09590Zf.LJIIL);
        obtain.setString("workspace", c09590Zf.LJIILJJIL);
        obtain.setString("base_url", c09590Zf.LJIILL);
        obtain.setBool("is_low_disk_memory", false);
        ByteBenchBundle obtain2 = ByteBenchBundle.obtain();
        Map<String, String> map = c09590Zf.LJIIIIZZ;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                obtain2.setString(entry.getKey(), entry.getValue());
            }
            obtain.setBundle("libraInfo", obtain2);
        }
        native_init(obtain.getHandle());
        obtain.recycle();
        obtain2.recycle();
    }
}
