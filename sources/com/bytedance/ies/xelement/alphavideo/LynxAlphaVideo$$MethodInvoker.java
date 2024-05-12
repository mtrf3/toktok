package com.bytedance.ies.xelement.alphavideo;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class LynxAlphaVideo$$MethodInvoker implements InterfaceC38231EzT<LynxAlphaVideo> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(LynxAlphaVideo lynxAlphaVideo, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1073342556:
                if (str.equals("isPlaying")) {
                    lynxAlphaVideo.isPlaying(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -934426579:
                if (str.equals("resume")) {
                    lynxAlphaVideo.resume(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxAlphaVideo.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -407658560:
                if (str.equals("unsubscribeUpdateEvent")) {
                    lynxAlphaVideo.unsubscribeUpdateEvent(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxAlphaVideo.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3443508:
                if (str.equals("play")) {
                    lynxAlphaVideo.play(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3526264:
                if (str.equals("seek")) {
                    lynxAlphaVideo.seek(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3540994:
                if (str.equals("stop")) {
                    lynxAlphaVideo.stop(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 47962023:
                if (str.equals("subscribeUpdateEvent")) {
                    lynxAlphaVideo.subscribeUpdateEvent(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 85887754:
                if (str.equals("getDuration")) {
                    lynxAlphaVideo.getDuration(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 106440182:
                if (str.equals("pause")) {
                    lynxAlphaVideo.pause(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxAlphaVideo.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxAlphaVideo.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1090594823:
                if (str.equals("release")) {
                    lynxAlphaVideo.release(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxAlphaVideo.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxAlphaVideo.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxAlphaVideo.scrollIntoView(readableMap);
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
