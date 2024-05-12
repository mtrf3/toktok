package com.bytedance.ies.xelement.input;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class LynxInputView$$MethodInvoker implements InterfaceC38231EzT<LynxInputView> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(LynxInputView lynxInputView, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1904435132:
                if (str.equals("controlKeyBoard")) {
                    lynxInputView.controlKeyBoard(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -1725570346:
                if (str.equals("getSelection")) {
                    lynxInputView.getSelection(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -1148585618:
                if (str.equals("addText")) {
                    lynxInputView.addText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -906021636:
                if (str.equals("select")) {
                    lynxInputView.select(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxInputView.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxInputView.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3027047:
                if (str.equals("blur")) {
                    lynxInputView.blur(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 97604824:
                if (str.equals("focus")) {
                    lynxInputView.focus(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxInputView.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxInputView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 923542547:
                if (str.equals("setSelectionRange")) {
                    lynxInputView.setSelectionRange(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1194478112:
                if (str.equals("setInputFilter")) {
                    lynxInputView.setInputFilter(readableMap);
                    return;
                }
                callback.invoke(3);
                return;
            case 1212545271:
                if (str.equals("sendDelEvent")) {
                    lynxInputView.sendDelEvent(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1406685743:
                if (str.equals("setValue")) {
                    lynxInputView.setValue(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxInputView.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxInputView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxInputView.scrollIntoView(readableMap);
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
