package com.bytedance.ies.xelement.viewpager.childitem;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class LynxFoldHeader$$MethodInvoker implements InterfaceC38231EzT<LynxFoldHeader> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(LynxFoldHeader lynxFoldHeader, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -527962973:
                if (str.equals("innerText")) {
                    lynxFoldHeader.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxFoldHeader.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxFoldHeader.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxFoldHeader.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxFoldHeader.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxFoldHeader.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxFoldHeader.scrollIntoView(readableMap);
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