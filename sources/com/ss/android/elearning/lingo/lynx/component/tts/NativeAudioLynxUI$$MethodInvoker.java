package com.ss.android.elearning.lingo.lynx.component.tts;

import X.InterfaceC38231EzT;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class NativeAudioLynxUI$$MethodInvoker implements InterfaceC38231EzT<NativeAudioLynxUI> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC38231EzT
    public void invoke(NativeAudioLynxUI nativeAudioLynxUI, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    nativeAudioLynxUI.boundingClientRect(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 3540994:
                if (str.equals("stop")) {
                    nativeAudioLynxUI.stop();
                    return;
                }
                callback.invoke(3);
                return;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    nativeAudioLynxUI.takeScreenshot(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 292303834:
                if (str.equals("playByBase64")) {
                    nativeAudioLynxUI.playByBase64(readableMap);
                    return;
                }
                callback.invoke(3);
                return;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    nativeAudioLynxUI.requestUIInfo(readableMap, callback);
                    return;
                }
                callback.invoke(3);
                return;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    nativeAudioLynxUI.scrollIntoView(readableMap);
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
