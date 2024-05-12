package com.lynx.tasm.base;

import X.C16880lQ;
import X.C61707OJr;
import X.C61708OJs;
import X.C7MY;
import X.InterfaceC61709OJt;
import X.X1D;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.os.Trace;
import android.text.TextUtils;
import android.util.JsonReader;
import android.widget.Toast;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes11.dex */
public class TraceController {
    public Context LIZ;
    public final List<InterfaceC61709OJt> LIZIZ = new ArrayList();
    public boolean LIZJ = false;
    public long LIZLLL = 0;
    public int LJ = -1;

    private native long nativeCreateTraceController();

    private native void nativeRecordClockSyncMarker(long j, String str);

    private native int nativeStartTracing(long j, int i, int i2, String[] strArr, String[] strArr2, String str, boolean z);

    private native void nativeStopTracing(long j, int i);

    private void refreshATraceTags() {
        try {
            Field declaredField = Trace.class.getDeclaredField("sEnabledTags");
            declaredField.setAccessible(true);
            declaredField.setLong(null, 134217727L);
        } catch (Throwable unused) {
        }
    }

    public final void LIZIZ() {
        File file = new File("/data/local/tmp/trace-config.json");
        if (file.exists()) {
            try {
                String str = "";
                JsonReader jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(file)));
                jsonReader.beginObject();
                int i = 10;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals("startup_duration")) {
                        i = jsonReader.nextInt();
                    } else if (nextName.equals("result_file")) {
                        str = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                if (str == null || TextUtils.isEmpty(str)) {
                    str = generateTracingFilename();
                }
                LIZJ(0, 40960, null, str);
                if (i < 0) {
                    return;
                }
                new PthreadTimer("TraceController").schedule(new C61708OJs(this), i * 1000);
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZLLL() {
        long j = this.LIZLLL;
        if (j == 0 || !this.LIZJ) {
            return;
        }
        this.LIZJ = false;
        nativeStopTracing(j, this.LJ);
    }

    public String generateTracingFilename() {
        int myPid = Process.myPid();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        File LLIIJI = C16880lQ.LLIIJI(this.LIZ, null);
        StringBuilder LJ = C7MY.LJ("lynx-profile-trace-", myPid, "-");
        LJ.append(simpleDateFormat.format(new Date()));
        return new File(LLIIJI, X1D.LIZIZ(LJ)).getPath();
    }

    /* loaded from: classes11.dex */
    public static class TraceIntentFilter extends IntentFilter {
        public TraceIntentFilter(Context context) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(context.getPackageName());
            LIZ.append(".");
            LIZ.append("LYNX_TRACE_START");
            addAction(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(context.getPackageName());
            LIZ2.append(".");
            LIZ2.append("LYNX_TRACE_STOP");
            addAction(X1D.LIZIZ(LIZ2));
        }
    }

    private boolean registerTraceBackend(long j) {
        return TraceEvent.LJIIIIZZ(j);
    }

    public final void LIZ(Context context) {
        this.LIZ = context;
        try {
            if (this.LIZLLL == 0) {
                this.LIZLLL = nativeCreateTraceController();
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        }
        if (this.LIZLLL == 0) {
            return;
        }
        C16880lQ.LJJLIIIJILLIZJL(new C61707OJr(this), this.LIZ, new TraceIntentFilter(this.LIZ));
    }

    public void onTracingComplete(String str) {
        Iterator it = ((ArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC61709OJt) it.next()).onComplete();
        }
        ((ArrayList) this.LIZIZ).clear();
    }

    public final void LIZJ(int i, int i2, String[] strArr, String str) {
        if (this.LIZJ) {
            C16880lQ.LLZILL(Toast.makeText(this.LIZ, "Trace already started, please stop it first", 0));
            return;
        }
        long j = this.LIZLLL;
        if (j == 0) {
            return;
        }
        this.LIZJ = true;
        this.LJ = nativeStartTracing(j, i, i2, strArr, null, str, false);
    }
}
