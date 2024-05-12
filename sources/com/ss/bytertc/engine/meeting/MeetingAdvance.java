package com.ss.bytertc.engine.meeting;

import com.ss.bytertc.engine.NativeFunctions;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.reflect.Method;

/* loaded from: classes33.dex */
public abstract class MeetingAdvance {
    public static Method mGetNativeMethod;

    public static long getNativeRoomHandle(RTCRoom rTCRoom) {
        if (mGetNativeMethod == null) {
            try {
                mGetNativeMethod = Class.forName("com.ss.bytertc.engine.RTCRoomImpl").getMethod("getNativeHandle", new Class[0]);
            } catch (Exception unused) {
                LogUtil.e("MeetingAdvance", "fail to find method getNativeHandle");
            }
        }
        Method method = mGetNativeMethod;
        if (method == null) {
            return -1L;
        }
        try {
            return ((Long) method.invoke(rTCRoom, new Object[0])).longValue();
        } catch (Exception unused2) {
            LogUtil.e("MeetingAdvance", "fail to invoke method getNativeHandle");
            return -1L;
        }
    }

    public static int enableRescaleAudioVolume(RTCRoom rTCRoom, boolean z) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle <= 0) {
            LogUtil.e("MeetingAdvance", "room native handle is invalid, enableRescaleAudioVolume failed.");
            return -1;
        }
        return NativeFunctions.nativeEenableRescaleAudioVolume(nativeRoomHandle, z);
    }

    public static int setPublishChannel(RTCRoom rTCRoom, String str) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle <= 0) {
            LogUtil.e("MeetingAdvance", "room native handle is invalid, setPublishChannel failed.");
            return -1;
        }
        return NativeFunctions.nativeSetPublishChannel(nativeRoomHandle, str);
    }

    public static int setPublishSpecialStream(RTCRoom rTCRoom, int i) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle <= 0) {
            LogUtil.e("MeetingAdvance", "room native handle is invalid, setPublishSpecialStream failed.");
            return -1;
        }
        return NativeFunctions.nativeSetPublishSpecialStream(nativeRoomHandle, i);
    }

    public static int setSubscribeSpecialStream(RTCRoom rTCRoom, int[] iArr) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle <= 0) {
            LogUtil.e("MeetingAdvance", "room native handle is invalid, setSubscribeSpecialStream failed.");
            return -1;
        }
        return NativeFunctions.nativeSetSubscribeSpecialStream(nativeRoomHandle, iArr);
    }

    public static int setSubscribeChannels(RTCRoom rTCRoom, String[] strArr, boolean z) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle <= 0) {
            LogUtil.e("MeetingAdvance", "room native handle is invalid, setSubscribeChannels failed.");
            return -1;
        }
        return NativeFunctions.nativeSetSubscribeChannels(nativeRoomHandle, strArr, z);
    }
}
