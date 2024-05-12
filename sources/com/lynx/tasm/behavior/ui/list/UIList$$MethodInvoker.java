package com.lynx.tasm.behavior.ui.list;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class UIList$$MethodInvoker implements InterfaceC38231EzT<UIList> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(UIList uIList, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -980170895:
                if (str.equals("scrollToPosition")) {
                    uIList.scrollToPosition(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -527962973:
                if (str.equals("innerText")) {
                    uIList.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -398364324:
                if (str.equals("autoScroll")) {
                    uIList.autoScroll(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    uIList.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -142621742:
                if (str.equals("removeStickyView")) {
                    uIList.removeStickyView();
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    uIList.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    uIList.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1363070069:
                if (str.equals("getVisibleCells")) {
                    uIList.getVisibleCells(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    uIList.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    uIList.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    uIList.scrollIntoView(readableMap);
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
