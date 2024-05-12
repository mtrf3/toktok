package com.byted.cast.mediacommon;

import X.X1D;
import android.os.Build;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Monitor;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class MediaMonitor {
    public static final Object mMonitorLock = new Object();
    public static ArrayList<CastMonitor> CastMonitors = new ArrayList<>();

    public static void addMonitor(CastMonitor castMonitor) {
        synchronized (mMonitorLock) {
            ArrayList<CastMonitor> arrayList = CastMonitors;
            if (arrayList != null) {
                Iterator<CastMonitor> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() == castMonitor) {
                        return;
                    }
                }
                CastMonitors.add(castMonitor);
            }
        }
    }

    public static void removeMonitor(CastMonitor castMonitor) {
        synchronized (mMonitorLock) {
            ArrayList<CastMonitor> arrayList = CastMonitors;
            if (arrayList != null) {
                Iterator<CastMonitor> it = arrayList.iterator();
                while (it.hasNext()) {
                    CastMonitor next = it.next();
                    if (next == castMonitor) {
                        CastMonitors.remove(next);
                        return;
                    }
                }
            }
        }
    }

    public static void onMonitor(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("finger", Build.FINGERPRINT);
            jSONObject.put("android", Build.VERSION.SDK_INT);
            jSONObject.put("content", str2);
            synchronized (mMonitorLock) {
                ArrayList<CastMonitor> arrayList = CastMonitors;
                if (arrayList != null) {
                    Iterator<CastMonitor> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().sendSourceEvent(str, jSONObject.toString());
                    }
                }
            }
        } catch (NoClassDefFoundError unused) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void onSinkMonitor(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FINGERPRINT:");
        LIZ.append(Build.FINGERPRINT);
        LIZ.append("\nandroid:");
        LIZ.append(Build.VERSION.SDK_INT);
        LIZ.append("\ncontent:");
        LIZ.append(str2);
        try {
            Monitor.sendSinkEvent(str, X1D.LIZIZ(LIZ));
        } catch (NoClassDefFoundError unused) {
        }
    }

    public static void onMonitor(String str, int i, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("finger", Build.FINGERPRINT);
            jSONObject.put("android", Build.VERSION.SDK_INT);
            jSONObject.put("type", i);
            jSONObject.put("reason", str2);
            jSONObject.put("trace", str3);
            synchronized (mMonitorLock) {
                ArrayList<CastMonitor> arrayList = CastMonitors;
                if (arrayList != null) {
                    Iterator<CastMonitor> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().sendSourceEvent(str, jSONObject.toString());
                    }
                }
            }
        } catch (NoClassDefFoundError unused) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void onSinkMonitor(String str, int i, String str2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FINGERPRINT:");
        LIZ.append(Build.FINGERPRINT);
        LIZ.append("\nandroid:");
        LIZ.append(Build.VERSION.SDK_INT);
        LIZ.append("\ntype:");
        LIZ.append(i);
        LIZ.append("\nreason:");
        LIZ.append(str2);
        LIZ.append("\ntrace:");
        LIZ.append(str3);
        try {
            Monitor.sendSinkEvent(str, X1D.LIZIZ(LIZ));
        } catch (NoClassDefFoundError unused) {
        }
    }
}
