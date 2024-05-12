package com.byted.cast.usbsource.usbdisplaysource;

import X.C90177ZaH;
import android.content.Context;
import android.os.Build;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.mediacommon.IMediaRecorder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class Utils {
    public static Config config;
    public static String mConnectId;
    public static Context mContext;
    public static final Object mMessageListenerLock = new Object();
    public static ArrayList<IMessageListener> CastMessageListeners = new ArrayList<>();
    public static final Object mMirrorListenerLock = new Object();
    public static ArrayList<IMirrorListener> CastMirrorListeners = new ArrayList<>();
    public static final Object mMonitorLock = new Object();
    public static ArrayList<CastMonitor> CastMonitors = new ArrayList<>();
    public static final Object mLoggerLock = new Object();
    public static ArrayList<CastLogger> CastLoggers = new ArrayList<>();
    public static boolean enable = false;
    public static MirrorInfo mMirrorInfo = null;
    public static ISurfaceListener mSurfaceListener = null;

    public static void onStartRecorder() {
        if (enable) {
            synchronized (mMirrorListenerLock) {
                ArrayList<IMirrorListener> arrayList = CastMirrorListeners;
                if (arrayList != null) {
                    Iterator<IMirrorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onStart(10);
                    }
                }
            }
        }
    }

    public static void onStopRecorder() {
        if (enable) {
            synchronized (mMirrorListenerLock) {
                ArrayList<IMirrorListener> arrayList = CastMirrorListeners;
                if (arrayList != null) {
                    Iterator<IMirrorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onStop(10);
                    }
                }
            }
        }
    }

    public static void initID() {
        mConnectId = UUID.randomUUID().toString();
    }

    public static void addLogger(CastLogger castLogger) {
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() == castLogger) {
                        return;
                    }
                }
                CastLoggers.add(castLogger);
            }
        }
    }

    public static void addMediaRecorderCallback(IMediaRecorder iMediaRecorder) {
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    C90177ZaH.LJJIZ(it.next());
                }
            }
        }
        synchronized (mMonitorLock) {
            ArrayList<CastMonitor> arrayList2 = CastMonitors;
            if (arrayList2 != null) {
                Iterator<CastMonitor> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C90177ZaH.LJJJ(it2.next());
                }
            }
        }
    }

    public static void addMessageListener(IMessageListener iMessageListener) {
        synchronized (mMessageListenerLock) {
            ArrayList<IMessageListener> arrayList = CastMessageListeners;
            if (arrayList != null) {
                arrayList.clear();
                Iterator<IMessageListener> it = CastMessageListeners.iterator();
                while (it.hasNext()) {
                    if (it.next() == iMessageListener) {
                        return;
                    }
                }
                CastMessageListeners.add(iMessageListener);
            }
        }
    }

    public static void addMirrorListener(IMirrorListener iMirrorListener) {
        synchronized (mMirrorListenerLock) {
            ArrayList<IMirrorListener> arrayList = CastMirrorListeners;
            if (arrayList != null) {
                arrayList.clear();
                Iterator<IMirrorListener> it = CastMirrorListeners.iterator();
                while (it.hasNext()) {
                    if (it.next() == iMirrorListener) {
                        return;
                    }
                }
                CastMirrorListeners.add(iMirrorListener);
            }
        }
    }

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

    public static void onDisconnect(int i) {
        int i2;
        if (enable) {
            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.protocols = "UsbSource";
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        i2 = 0;
                    } else {
                        i2 = 404;
                    }
                } else {
                    i2 = 406;
                }
            } else {
                i2 = 401;
            }
            synchronized (mMirrorListenerLock) {
                ArrayList<IMirrorListener> arrayList = CastMirrorListeners;
                if (arrayList != null) {
                    Iterator<IMirrorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onDisconnect(serviceInfo, i2, 10);
                    }
                }
            }
        }
    }

    public static void onMessage(String str) {
        if (enable) {
            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.protocols = "UsbSource";
            synchronized (mMessageListenerLock) {
                ArrayList<IMessageListener> arrayList = CastMessageListeners;
                if (arrayList != null) {
                    Iterator<IMessageListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onMessage(serviceInfo, str);
                    }
                }
            }
        }
    }

    public static void removeLogger(CastLogger castLogger) {
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    CastLogger next = it.next();
                    if (next == castLogger) {
                        CastLoggers.remove(next);
                        return;
                    }
                }
            }
        }
    }

    public static void removeMediaRecorderCallback(IMediaRecorder iMediaRecorder) {
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    C90177ZaH.LJJJIL(it.next());
                }
            }
        }
        synchronized (mMonitorLock) {
            ArrayList<CastMonitor> arrayList2 = CastMonitors;
            if (arrayList2 != null) {
                Iterator<CastMonitor> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C90177ZaH.LJJJJ(it2.next());
                }
            }
        }
    }

    public static void removeMessageListener(IMessageListener iMessageListener) {
        synchronized (mMessageListenerLock) {
            ArrayList<IMessageListener> arrayList = CastMessageListeners;
            if (arrayList != null) {
                Iterator<IMessageListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    IMessageListener next = it.next();
                    if (next == iMessageListener) {
                        CastMessageListeners.remove(next);
                        return;
                    }
                }
            }
        }
    }

    public static void removeMirrorListener(IMirrorListener iMirrorListener) {
        synchronized (mMirrorListenerLock) {
            ArrayList<IMirrorListener> arrayList = CastMirrorListeners;
            if (arrayList != null) {
                Iterator<IMirrorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    IMirrorListener next = it.next();
                    if (next == iMirrorListener) {
                        CastMirrorListeners.remove(next);
                        return;
                    }
                }
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

    public static void e(String str, String str2) {
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<CastLogger> it = CastLoggers.iterator();
                while (it.hasNext()) {
                    it.next().e(str, str2);
                }
            }
        }
    }

    public static String getSystemProperty(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str2 = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static void i(String str, String str2) {
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<CastLogger> it = CastLoggers.iterator();
                while (it.hasNext()) {
                    it.next().i(str, str2);
                }
            }
        }
    }

    public static void onError(int i, String str) {
        if (enable) {
            synchronized (mMirrorListenerLock) {
                ArrayList<IMirrorListener> arrayList = CastMirrorListeners;
                if (arrayList != null) {
                    Iterator<IMirrorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onError(10, i, 0, str);
                    }
                }
            }
        }
    }

    public static void sendSourceEvent(String str, String str2) {
        if (enable) {
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
                            it.next().sendCustomEvent("source", str, jSONObject.toString(), mConnectId);
                        }
                    }
                }
            } catch (NoClassDefFoundError unused) {
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static void onConnect(int i, int i2, int i3) {
        if (enable) {
            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.protocols = "UsbSource";
            serviceInfo.width = i;
            serviceInfo.height = i2;
            serviceInfo.fps = i3;
            synchronized (mMirrorListenerLock) {
                ArrayList<IMirrorListener> arrayList = CastMirrorListeners;
                if (arrayList != null) {
                    Iterator<IMirrorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onConnect(serviceInfo, 10);
                    }
                }
            }
        }
    }

    public static void sendSourceEvent(String str, int i, String str2, String str3) {
        if (enable) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("finger", Build.FINGERPRINT);
                jSONObject.put("android", Build.VERSION.SDK_INT);
                jSONObject.put("type", i);
                jSONObject.put("reason", str2);
                synchronized (mMonitorLock) {
                    ArrayList<CastMonitor> arrayList = CastMonitors;
                    if (arrayList != null) {
                        Iterator<CastMonitor> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().sendCustomEvent("source", str, jSONObject.toString(), mConnectId);
                        }
                    }
                }
            } catch (NoClassDefFoundError unused) {
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (str.equals("USB_ERROR")) {
                synchronized (mMirrorListenerLock) {
                    ArrayList<IMirrorListener> arrayList2 = CastMirrorListeners;
                    if (arrayList2 != null) {
                        Iterator<IMirrorListener> it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            it2.next().onError(10, 12000000 + i, 0, str2);
                        }
                    }
                }
            }
        }
    }
}
