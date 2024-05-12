package com.bytedance.ies.xelement.input;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class LynxBaseInputView$$MethodInvoker implements InterfaceC38231EzT<LynxBaseInputView> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(LynxBaseInputView lynxBaseInputView, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1904435132:
                if (str.equals("controlKeyBoard")) {
                    lynxBaseInputView.controlKeyBoard(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -1725570346:
                if (str.equals("getSelection")) {
                    lynxBaseInputView.getSelection(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -1148585618:
                if (str.equals("addText")) {
                    lynxBaseInputView.addText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -906021636:
                if (str.equals("select")) {
                    lynxBaseInputView.select(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxBaseInputView.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxBaseInputView.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3027047:
                if (str.equals("blur")) {
                    lynxBaseInputView.blur(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 97604824:
                if (str.equals("focus")) {
                    lynxBaseInputView.focus(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxBaseInputView.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxBaseInputView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 923542547:
                if (str.equals("setSelectionRange")) {
                    lynxBaseInputView.setSelectionRange(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1194478112:
                if (str.equals("setInputFilter")) {
                    lynxBaseInputView.setInputFilter(readableMap);
                    return;
                }
                callback.invoke(3);
                return;
            case 1212545271:
                if (str.equals("sendDelEvent")) {
                    lynxBaseInputView.sendDelEvent(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1406685743:
                if (str.equals("setValue")) {
                    lynxBaseInputView.setValue(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxBaseInputView.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxBaseInputView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxBaseInputView.scrollIntoView(readableMap);
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
