package com.bytedance.common.wschannel;

import X.C66918QOc;
import X.EnumC66933QOr;
import X.InterfaceC58321Muj;
import X.InterfaceC66922QOg;
import X.InterfaceC66923QOh;
import X.QOQ;
import X.QOU;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class WsConstants {
    public static InterfaceC66922QOg sAckListener;
    public static QOU sBindWsChannelServiceListener;
    public static QOQ sListener;
    public static InterfaceC66923QOh sServiceListener;
    public static Map<Integer, EnumC66933QOr> sStates = new ConcurrentHashMap();
    public static Map<Integer, Boolean> sPrivateProtocolState = new ConcurrentHashMap();
    public static Map<Integer, Map<Integer, Boolean>> sServiceState = new HashMap();
    public static final Object sServiceLock = new Object();
    public static volatile InterfaceC58321Muj<Boolean> optLogic = C66918QOc.LIZ;

    public static QOU getBindWsChannelServiceListener() {
        return null;
    }

    public static InterfaceC66922QOg getMessageAckListener() {
        return null;
    }

    public static InterfaceC66923QOh getServiceConnectListener() {
        return null;
    }

    public static void setBindWsChannelServiceListener(QOU qou) {
    }

    public static void setMessageAckListener(InterfaceC66922QOg interfaceC66922QOg) {
    }

    public static void setServiceConnectListener(InterfaceC66923QOh interfaceC66923QOh) {
    }

    public static InterfaceC58321Muj<Boolean> getOptLogic() {
        return optLogic;
    }

    public static QOQ getListener(int i) {
        return sListener;
    }

    public static boolean isPrivateProtocolEnabled(int i) {
        if (!sPrivateProtocolState.containsKey(Integer.valueOf(i)) || !sPrivateProtocolState.get(Integer.valueOf(i)).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean isWsChannelConnected(int i) {
        if (sStates.get(Integer.valueOf(i)) == EnumC66933QOr.CONNECTED) {
            return true;
        }
        return false;
    }

    public static void remove(int i) {
        sStates.remove(Integer.valueOf(i));
        synchronized (sServiceLock) {
            sServiceState.remove(Integer.valueOf(i));
        }
    }

    public static void setOnMessageReceiveListener(QOQ qoq) {
        sListener = qoq;
    }

    public static void setOptLogic(InterfaceC58321Muj<Boolean> interfaceC58321Muj) {
        if (interfaceC58321Muj == null) {
            return;
        }
        optLogic = interfaceC58321Muj;
    }

    public static void setServiceState(ServiceConnectEvent serviceConnectEvent) {
        synchronized (sServiceLock) {
            Map<Integer, Boolean> map = sServiceState.get(Integer.valueOf(serviceConnectEvent.mChannelId));
            if (map == null) {
                return;
            }
            map.put(Integer.valueOf(serviceConnectEvent.mServiceId), Boolean.valueOf(serviceConnectEvent.mConnected));
        }
    }

    public static void initServiceState(int i, List<Integer> list) {
        synchronized (sServiceLock) {
            HashMap hashMap = new HashMap();
            if (list == null) {
                sServiceState.put(Integer.valueOf(i), hashMap);
                return;
            }
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                hashMap.put(it.next(), Boolean.FALSE);
            }
            sServiceState.put(Integer.valueOf(i), hashMap);
        }
    }

    public static boolean isServiceConnected(int i, int i2) {
        synchronized (sServiceLock) {
            Map<Integer, Boolean> map = sServiceState.get(Integer.valueOf(i));
            if (map == null) {
                return false;
            }
            Boolean bool = map.get(Integer.valueOf(i2));
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
    }

    public static void removeService(int i, int i2) {
        synchronized (sServiceLock) {
            Map<Integer, Boolean> map = sServiceState.get(Integer.valueOf(i));
            if (map == null) {
                return;
            }
            map.remove(Integer.valueOf(i2));
        }
    }

    public static void setConnectionState(int i, EnumC66933QOr enumC66933QOr, boolean z) {
        sStates.put(Integer.valueOf(i), enumC66933QOr);
        sPrivateProtocolState.put(Integer.valueOf(i), Boolean.valueOf(z));
    }
}
