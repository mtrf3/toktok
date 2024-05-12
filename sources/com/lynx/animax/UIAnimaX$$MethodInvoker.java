package com.lynx.animax;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class UIAnimaX$$MethodInvoker implements InterfaceC38231EzT<UIAnimaX> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(UIAnimaX uIAnimaX, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1998037676:
                if (str.equals("isAnimating")) {
                    uIAnimaX.isAnimating(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -1222700566:
                if (str.equals("getCurrentFrame")) {
                    uIAnimaX.getCurrentFrame(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -934426579:
                if (str.equals("resume")) {
                    uIAnimaX.resume(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -929558362:
                if (str.equals("listenAnimationUpdate")) {
                    uIAnimaX.listenAnimationUpdate(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -527962973:
                if (str.equals("innerText")) {
                    uIAnimaX.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -407658560:
                if (str.equals("unsubscribeUpdateEvent")) {
                    uIAnimaX.unsubscribeUpdateEvent(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    uIAnimaX.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3443508:
                if (str.equals("play")) {
                    uIAnimaX.play(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3526264:
                if (str.equals("seek")) {
                    uIAnimaX.seek(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3540994:
                if (str.equals("stop")) {
                    uIAnimaX.stop(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 47962023:
                if (str.equals("subscribeUpdateEvent")) {
                    uIAnimaX.subscribeUpdateEvent(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 85887754:
                if (str.equals("getDuration")) {
                    uIAnimaX.getDuration(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 106440182:
                if (str.equals("pause")) {
                    uIAnimaX.pause(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    uIAnimaX.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    uIAnimaX.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    uIAnimaX.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    uIAnimaX.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    uIAnimaX.scrollIntoView(readableMap);
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
