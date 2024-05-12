package com.bytedance.ies.xelement.input;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class LynxTextAreaView$$MethodInvoker implements InterfaceC38231EzT<LynxTextAreaView> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(LynxTextAreaView lynxTextAreaView, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1904435132:
                if (str.equals("controlKeyBoard")) {
                    lynxTextAreaView.controlKeyBoard(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -1725570346:
                if (str.equals("getSelection")) {
                    lynxTextAreaView.getSelection(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -1436387831:
                if (str.equals("addMention")) {
                    lynxTextAreaView.addMention(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -1148585618:
                if (str.equals("addText")) {
                    lynxTextAreaView.addText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -906021636:
                if (str.equals("select")) {
                    lynxTextAreaView.select(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxTextAreaView.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -366821380:
                if (str.equals("resetSelectionMenu")) {
                    lynxTextAreaView.resetSelectionMenu();
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxTextAreaView.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3027047:
                if (str.equals("blur")) {
                    lynxTextAreaView.blur(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 97604824:
                if (str.equals("focus")) {
                    lynxTextAreaView.focus(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxTextAreaView.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxTextAreaView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 923542547:
                if (str.equals("setSelectionRange")) {
                    lynxTextAreaView.setSelectionRange(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1073937649:
                if (str.equals("getTextInfo")) {
                    lynxTextAreaView.getTextInfo(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1194478112:
                if (str.equals("setInputFilter")) {
                    lynxTextAreaView.setInputFilter(readableMap);
                    return;
                }
                callback.invoke(3);
                return;
            case 1212545271:
                if (str.equals("sendDelEvent")) {
                    lynxTextAreaView.sendDelEvent(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1406685743:
                if (str.equals("setValue")) {
                    lynxTextAreaView.setValue(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxTextAreaView.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxTextAreaView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxTextAreaView.scrollIntoView(readableMap);
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
