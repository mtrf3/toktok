package com.bytedance.ies.xelement.audiott;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class LynxAudioTTView$$MethodInvoker implements InterfaceC38231EzT<LynxAudioTTView> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(LynxAudioTTView lynxAudioTTView, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1988613871:
                if (str.equals("releaseFocus")) {
                    lynxAudioTTView.releaseFocus(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -934426579:
                if (str.equals("resume")) {
                    lynxAudioTTView.resume(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxAudioTTView.innerText(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxAudioTTView.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3363353:
                if (str.equals("mute")) {
                    lynxAudioTTView.mute(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3443508:
                if (str.equals("play")) {
                    lynxAudioTTView.play(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3526264:
                if (str.equals("seek")) {
                    lynxAudioTTView.seek(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3540994:
                if (str.equals("stop")) {
                    lynxAudioTTView.stop(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 106440182:
                if (str.equals("pause")) {
                    lynxAudioTTView.pause(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxAudioTTView.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxAudioTTView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1280029577:
                if (str.equals("requestFocus")) {
                    lynxAudioTTView.requestFocus(callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxAudioTTView.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxAudioTTView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxAudioTTView.scrollIntoView(readableMap);
                    return;
                }
                callback.invoke(3);
                return;
            case 2095520559:
                if (str.equals("playerInfo")) {
                    lynxAudioTTView.playerInfo(callback);
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
