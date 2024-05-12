package com.bytedance.ies.xelement;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class LynxAudio$$MethodInvoker implements InterfaceC38231EzT<LynxAudio> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(LynxAudio lynxAudio, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1992012396:
                if (str.equals("duration")) {
                    lynxAudio.duration(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -892481550:
                if (str.equals("status")) {
                    lynxAudio.status(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -679066215:
                if (str.equals("playBitrate")) {
                    lynxAudio.playBitrate(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -553589393:
                if (str.equals("cacheTime")) {
                    lynxAudio.cacheTime(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxAudio.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxAudio.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3443508:
                if (str.equals("play")) {
                    lynxAudio.play(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3526264:
                if (str.equals("seek")) {
                    lynxAudio.seek(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3540994:
                if (str.equals("stop")) {
                    lynxAudio.stop(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 106440182:
                if (str.equals("pause")) {
                    lynxAudio.pause(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxAudio.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 601235430:
                if (str.equals("currentTime")) {
                    lynxAudio.currentTime(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxAudio.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxAudio.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1457763334:
                if (str.equals("currentSrcID")) {
                    lynxAudio.currentSrcID(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxAudio.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxAudio.scrollIntoView(readableMap);
                    return;
                }
                callback.invoke(3);
                return;
            default:
                callback.invoke(3);
                return;
        }
    }
}
