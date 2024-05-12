package com.bytedance.ies.safemode;

import X.C16880lQ;
import X.C66460Q6m;
import X.C66461Q6n;
import X.InterfaceC65349Pkn;
import X.PSY;
import X.X1D;
import android.content.Context;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class SafeModeReporter {
    public static final Gson LIZ = new Gson();

    /* loaded from: classes12.dex */
    public static class CrashInfo {

        @InterfaceC65349Pkn("crashStack")
        public String crashStack;

        @InterfaceC65349Pkn("crashType")
        public int crashType;

        public final String LIZLLL() {
            return GsonProtectorUtils.toJson(SafeModeReporter.LIZ, this);
        }

        public static CrashInfo LIZ(ExceptionManager.ExceptionRecord exceptionRecord) {
            if (exceptionRecord == null) {
                return new CrashInfo(0, "null stack");
            }
            return LIZIZ(exceptionRecord.getCrashType(), exceptionRecord.getCrashReason());
        }

        public static CrashInfo[] LIZJ(Iterable<ExceptionManager.ExceptionRecord> iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator<ExceptionManager.ExceptionRecord> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(LIZ(it.next()));
            }
            return (CrashInfo[]) arrayList.toArray(new CrashInfo[arrayList.size()]);
        }

        public CrashInfo(int i, String str) {
            this.crashType = i;
            this.crashStack = str;
        }

        public static CrashInfo LIZIZ(String str, String str2) {
            int i;
            if ("java".equals(str)) {
                i = 1;
            } else {
                i = 2;
            }
            return new CrashInfo(i, str2);
        }
    }

    public static void LIZ(Context context, JSONObject jSONObject) {
        ExceptionManager.ExceptionRecord LIZLLL = ExceptionManager.LIZJ(context).LIZLLL();
        if (LIZLLL != null) {
            try {
                jSONObject.put("rType", LIZLLL.getCrashCode());
                jSONObject.put("rStack", LIZLLL.getCrashReason());
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("addEnterRollBackStack rType ");
                LIZ2.append(LIZLLL.getCrashCode());
                PSY.LJFF("SafeModeReporter", X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("addEnterRollBackStack rStack ");
                LIZ3.append(LIZLLL.getCrashReason());
                PSY.LJFF("SafeModeReporter", X1D.LIZIZ(LIZ3));
                return;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        PSY.LIZLLL("SafeModeReporter", "can't find last enter roll back stack");
    }

    public static void LIZIZ(CrashInfo crashInfo, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", crashInfo.LIZLLL());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        LIZJ("safemode_handle_exception_error", jSONObject);
        PSY.LIZ(C16880lQ.LLLZ("reportHandleExceptionError reachType:%d", new Object[]{Integer.valueOf(i)}));
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("recordTime", System.currentTimeMillis());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        Context context = C66460Q6m.LIZIZ().LJ;
        if (context != null) {
            File file = new File(C16880lQ.LLIIJLIL(context).getAbsolutePath(), "SafeModeReporter");
            File file2 = new File(file, str);
            try {
                FileUtils.forceMkdir(file);
                FileUtils.forceMkdir(file2);
                File file3 = new File(file2, C16880lQ.LLLZ("%d.json", new Object[]{Long.valueOf(System.currentTimeMillis())}));
                FileUtils.writeStringToFile(file3, jSONObject.toString(), Charset.forName("UTF-8"));
                PSY.LJ(C16880lQ.LLLZ("storeInFile write to file %s", new Object[]{file3.getAbsolutePath()}));
            } catch (IOException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        PSY.LJ(C16880lQ.LLLZ("record <%s> in file", new Object[]{str}));
    }

    public static void LIZLLL(CrashInfo crashInfo, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", crashInfo.LIZLLL());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        LIZJ("safemode_trigger_handle_exception", jSONObject);
        PSY.LIZ(C16880lQ.LLLZ("reportTriggerHandleException reachType:%d", new Object[]{Integer.valueOf(i)}));
    }

    public static void LJ(String str, ExceptionManager.ExceptionRecord exceptionRecord, String str2) {
        String str3;
        try {
            int hashCode = str2.hashCode();
            if (hashCode != -1097757094) {
                if (hashCode != -906531337) {
                    if (hashCode == 61279884 && str2.equals("LOG_TYPE_PROTECTOR_REACH_EXCEPTION")) {
                        str3 = "REACH";
                        String LLLZ = C16880lQ.LLLZ("%s PROTECTOR %s", new Object[]{str3, str});
                        C66461Q6n LJ = C66461Q6n.LJ("safe_mode_exception_repo");
                        LJ.LJII("log_tye", str2);
                        LJ.LJII("exception_msg", LLLZ);
                        LJ.LJII("exception_type", exceptionRecord.getCrashType());
                        LJ.LJII("exception_stack", exceptionRecord.getCrashReason());
                        return;
                    }
                    str3 = "default";
                    String LLLZ2 = C16880lQ.LLLZ("%s PROTECTOR %s", new Object[]{str3, str});
                    C66461Q6n LJ2 = C66461Q6n.LJ("safe_mode_exception_repo");
                    LJ2.LJII("log_tye", str2);
                    LJ2.LJII("exception_msg", LLLZ2);
                    LJ2.LJII("exception_type", exceptionRecord.getCrashType());
                    LJ2.LJII("exception_stack", exceptionRecord.getCrashReason());
                    return;
                }
                if (str2.equals("LOG_TYPE_SMART_PROTECTOR_SUCCESSFUL_EXCEPTION")) {
                    str3 = "SUCCESSFUL";
                    String LLLZ22 = C16880lQ.LLLZ("%s PROTECTOR %s", new Object[]{str3, str});
                    C66461Q6n LJ22 = C66461Q6n.LJ("safe_mode_exception_repo");
                    LJ22.LJII("log_tye", str2);
                    LJ22.LJII("exception_msg", LLLZ22);
                    LJ22.LJII("exception_type", exceptionRecord.getCrashType());
                    LJ22.LJII("exception_stack", exceptionRecord.getCrashReason());
                    return;
                }
                str3 = "default";
                String LLLZ222 = C16880lQ.LLLZ("%s PROTECTOR %s", new Object[]{str3, str});
                C66461Q6n LJ222 = C66461Q6n.LJ("safe_mode_exception_repo");
                LJ222.LJII("log_tye", str2);
                LJ222.LJII("exception_msg", LLLZ222);
                LJ222.LJII("exception_type", exceptionRecord.getCrashType());
                LJ222.LJII("exception_stack", exceptionRecord.getCrashReason());
                return;
            }
            if (str2.equals("LOG_TYPE_SMART_PROTECTOR_FAILED_EXCEPTION")) {
                str3 = "FAILED";
                String LLLZ2222 = C16880lQ.LLLZ("%s PROTECTOR %s", new Object[]{str3, str});
                C66461Q6n LJ2222 = C66461Q6n.LJ("safe_mode_exception_repo");
                LJ2222.LJII("log_tye", str2);
                LJ2222.LJII("exception_msg", LLLZ2222);
                LJ2222.LJII("exception_type", exceptionRecord.getCrashType());
                LJ2222.LJII("exception_stack", exceptionRecord.getCrashReason());
                return;
            }
            str3 = "default";
            String LLLZ22222 = C16880lQ.LLLZ("%s PROTECTOR %s", new Object[]{str3, str});
            C66461Q6n LJ22222 = C66461Q6n.LJ("safe_mode_exception_repo");
            LJ22222.LJII("log_tye", str2);
            LJ22222.LJII("exception_msg", LLLZ22222);
            LJ22222.LJII("exception_type", exceptionRecord.getCrashType());
            LJ22222.LJII("exception_stack", exceptionRecord.getCrashReason());
            return;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C16880lQ.LLLLIIL(e);
    }
}
