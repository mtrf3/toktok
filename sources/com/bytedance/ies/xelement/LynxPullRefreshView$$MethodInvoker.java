package com.bytedance.ies.xelement;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class LynxPullRefreshView$$MethodInvoker implements InterfaceC38231EzT<LynxPullRefreshView> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(LynxPullRefreshView lynxPullRefreshView, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1890175128:
                if (str.equals("autoStartRefresh")) {
                    lynxPullRefreshView.autoStartRefresh(readableMap);
                    return;
                }
                callback.invoke(3);
                return;
            case -1662894322:
                if (str.equals("finishLoadMore")) {
                    lynxPullRefreshView.finishLoadMore(readableMap);
                    return;
                }
                callback.invoke(3);
                return;
            case -828841272:
                if (str.equals("finishRefresh")) {
                    lynxPullRefreshView.finishRefresh(readableMap);
                    return;
                }
                callback.invoke(3);
                return;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxPullRefreshView.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxPullRefreshView.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxPullRefreshView.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxPullRefreshView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxPullRefreshView.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxPullRefreshView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxPullRefreshView.scrollIntoView(readableMap);
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
