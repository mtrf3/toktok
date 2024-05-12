package com.bytedance.ies.xelement.video.pro;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class LynxVideoUI$$MethodInvoker implements InterfaceC38231EzT<LynxVideoUI> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(LynxVideoUI lynxVideoUI, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -802181223:
                if (str.equals("exitFullScreen")) {
                    lynxVideoUI.exitFullScreen(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxVideoUI.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxVideoUI.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3443508:
                if (str.equals("play")) {
                    lynxVideoUI.play(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3526264:
                if (str.equals("seek")) {
                    lynxVideoUI.seek(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3540994:
                if (str.equals("stop")) {
                    lynxVideoUI.stop(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 85887754:
                if (str.equals("getDuration")) {
                    lynxVideoUI.getDuration(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 106440182:
                if (str.equals("pause")) {
                    lynxVideoUI.pause(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxVideoUI.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 458133450:
                if (str.equals("requestFullScreen")) {
                    lynxVideoUI.requestFullScreen(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxVideoUI.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxVideoUI.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxVideoUI.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxVideoUI.scrollIntoView(readableMap);
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
