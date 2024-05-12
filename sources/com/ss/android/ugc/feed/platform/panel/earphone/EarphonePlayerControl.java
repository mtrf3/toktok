package com.ss.android.ugc.feed.platform.panel.earphone;

import X.C16880lQ;
import X.C221108m2;
import X.C2LV;
import X.C2YX;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C87434YTe;
import X.InterfaceC87433YTd;
import X.JFA;
import X.L9S;
import X.X1D;
import X.YTU;
import X.YTV;
import X.YTW;
import X.YTX;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EarphonePlayerControl implements IEarphonePlayerControlService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(JFA.INSTANCE);
    public boolean LIZIZ = LJIIJ();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new YTX(this));

    public static IEarphonePlayerControlService LJII() {
        Object LIZ = C58096Mr6.LIZ(IEarphonePlayerControlService.class, false);
        if (LIZ != null) {
            return (IEarphonePlayerControlService) LIZ;
        }
        if (C58096Mr6.s8 == null) {
            synchronized (IEarphonePlayerControlService.class) {
                if (C58096Mr6.s8 == null) {
                    C58096Mr6.s8 = new EarphonePlayerControl();
                }
            }
        }
        return C58096Mr6.s8;
    }

    public final Object LJIIIIZZ() {
        return this.LIZJ.getValue();
    }

    public final AudioManager LJIIIZ() {
        return (AudioManager) this.LIZ.getValue();
    }

    public final boolean LJIIJ() {
        AudioDeviceInfo[] devices;
        if (Build.VERSION.SDK_INT >= 23) {
            AudioManager LJIIIZ = LJIIIZ();
            if (LJIIIZ == null || (devices = LJIIIZ.getDevices(2)) == null) {
                return false;
            }
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (((List) C2YX.LIZ.getValue()).contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
        } else {
            AudioManager LJIIIZ2 = LJIIIZ();
            if (LJIIIZ2 != null && LJIIIZ2.isWiredHeadsetOn()) {
                return true;
            }
            AudioManager LJIIIZ3 = LJIIIZ();
            if (LJIIIZ3 != null && LJIIIZ3.isBluetoothScoOn()) {
                return true;
            }
            AudioManager LJIIIZ4 = LJIIIZ();
            if (LJIIIZ4 != null && LJIIIZ4.isBluetoothA2dpOn()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final boolean LIZIZ() {
        return C2LV.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final boolean LIZJ() {
        if (!LJIIJ()) {
            return false;
        }
        return !this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final void LIZ(Context context) {
        AudioDeviceCallback audioDeviceCallback;
        YTW.LIZ().LJIIIIZZ("registered earphone audio device callback/broadcast receiver");
        if (Build.VERSION.SDK_INT >= 23) {
            L9S.LIZ.getClass();
            if (L9S.LIZ()) {
                AudioManager LJIIIZ = LJIIIZ();
                if (LJIIIZ != null) {
                    Object LJIIIIZZ = LJIIIIZZ();
                    if (LJIIIIZZ instanceof YTV) {
                        audioDeviceCallback = (AudioDeviceCallback) LJIIIIZZ;
                    } else {
                        audioDeviceCallback = null;
                    }
                    LJIIIZ.registerAudioDeviceCallback(audioDeviceCallback, null);
                    return;
                }
                return;
            }
            LJIIJJI(context);
            return;
        }
        LJIIJJI(context);
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final void LIZLLL(Context context) {
        YTW.LIZ().LJIIIIZZ("unregistered earphone audio device callback/broadcast receiver");
        BroadcastReceiver broadcastReceiver = null;
        AudioDeviceCallback audioDeviceCallback = null;
        BroadcastReceiver broadcastReceiver2 = null;
        if (Build.VERSION.SDK_INT >= 23) {
            L9S.LIZ.getClass();
            if (L9S.LIZ()) {
                AudioManager LJIIIZ = LJIIIZ();
                if (LJIIIZ != null) {
                    Object LJIIIIZZ = LJIIIIZZ();
                    if (LJIIIIZZ instanceof YTV) {
                        audioDeviceCallback = (AudioDeviceCallback) LJIIIIZZ;
                    }
                    LJIIIZ.unregisterAudioDeviceCallback(audioDeviceCallback);
                    return;
                }
                return;
            }
            Object LJIIIIZZ2 = LJIIIIZZ();
            if (LJIIIIZZ2 instanceof YTU) {
                broadcastReceiver2 = (BroadcastReceiver) LJIIIIZZ2;
            }
            C16880lQ.LJJLIIIJL(context, broadcastReceiver2);
            return;
        }
        Object LJIIIIZZ3 = LJIIIIZZ();
        if (LJIIIIZZ3 instanceof YTU) {
            broadcastReceiver = (BroadcastReceiver) LJIIIIZZ3;
        }
        C16880lQ.LJJLIIIJL(context, broadcastReceiver);
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final void LJFF(boolean z) {
        this.LIZIZ = z;
    }

    public final void LJIIJJI(Context context) {
        BroadcastReceiver broadcastReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        Object LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ instanceof YTU) {
            broadcastReceiver = (BroadcastReceiver) LJIIIIZZ;
        } else {
            broadcastReceiver = null;
        }
        C16880lQ.LJJLIIIJJI(context, broadcastReceiver, intentFilter, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final void LJ(String str, boolean z) {
        YTU ytu;
        YTU ytu2;
        YTV ytv;
        C87434YTe LIZ = YTW.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("audio disconnected, scenario: ");
        LIZ2.append(str);
        LIZ2.append(", isPausedByDisconnection is updated to: ");
        LIZ2.append(z);
        LIZ.LJIIIIZZ(X1D.LIZIZ(LIZ2));
        if (Build.VERSION.SDK_INT >= 23) {
            L9S.LIZ.getClass();
            if (L9S.LIZ()) {
                Object LJIIIIZZ = LJIIIIZZ();
                if ((LJIIIIZZ instanceof YTV) && (ytv = (YTV) LJIIIIZZ) != null) {
                    ytv.LIZ().put(str, Boolean.valueOf(z));
                    return;
                }
                return;
            }
            Object LJIIIIZZ2 = LJIIIIZZ();
            if (!(LJIIIIZZ2 instanceof YTU) || (ytu2 = (YTU) LJIIIIZZ2) == null) {
                return;
            }
            ytu2.LIZLLL().put(str, Boolean.valueOf(z));
            return;
        }
        Object LJIIIIZZ3 = LJIIIIZZ();
        if (!(LJIIIIZZ3 instanceof YTU) || (ytu = (YTU) LJIIIIZZ3) == null) {
            return;
        }
        ytu.LIZLLL().put(str, Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService
    public final void LJI(LifecycleOwner lifecycleOwner, final InterfaceC87433YTd interfaceC87433YTd) {
        YTU ytu;
        YTU ytu2;
        YTV ytv;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        String scenario = interfaceC87433YTd.LIZIZ();
        o.LJIIIZ(scenario, "scenario");
        C87434YTe LIZ = YTW.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("scenario: ");
        LIZ2.append(scenario);
        LIZ2.append(", add earphone callback");
        LIZ.LJIIIIZZ(X1D.LIZIZ(LIZ2));
        if (Build.VERSION.SDK_INT >= 23) {
            L9S.LIZ.getClass();
            if (L9S.LIZ()) {
                Object LJIIIIZZ = LJIIIIZZ();
                if ((LJIIIIZZ instanceof YTV) && (ytv = (YTV) LJIIIIZZ) != null) {
                    ((Set) ytv.LIZIZ.getValue()).add(interfaceC87433YTd);
                    if (ytv.LIZ().get(interfaceC87433YTd.LIZIZ()) == null) {
                        ytv.LIZ().put(interfaceC87433YTd.LIZIZ(), Boolean.FALSE);
                    }
                }
            } else {
                Object LJIIIIZZ2 = LJIIIIZZ();
                if ((LJIIIIZZ2 instanceof YTU) && (ytu2 = (YTU) LJIIIIZZ2) != null) {
                    ytu2.LIZ(interfaceC87433YTd);
                }
            }
        } else {
            Object LJIIIIZZ3 = LJIIIIZZ();
            if ((LJIIIIZZ3 instanceof YTU) && (ytu = (YTU) LJIIIIZZ3) != null) {
                ytu.LIZ(interfaceC87433YTd);
            }
        }
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl$addCallback$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                YTU ytu3;
                YTU ytu4;
                YTV ytv2;
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    String scenario2 = InterfaceC87433YTd.this.LIZIZ();
                    o.LJIIIZ(scenario2, "scenario");
                    C87434YTe LIZ3 = YTW.LIZ();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("scenario: ");
                    LIZ4.append(scenario2);
                    LIZ4.append(", automatically removed earphone callback on destroy");
                    LIZ3.LJIIIIZZ(X1D.LIZIZ(LIZ4));
                    if (Build.VERSION.SDK_INT >= 23) {
                        L9S.LIZ.getClass();
                        if (L9S.LIZ()) {
                            Object LJIIIIZZ4 = this.LJIIIIZZ();
                            if ((LJIIIIZZ4 instanceof YTV) && (ytv2 = (YTV) LJIIIIZZ4) != null) {
                                InterfaceC87433YTd callback = InterfaceC87433YTd.this;
                                o.LJIIIZ(callback, "callback");
                                ((Set) ytv2.LIZIZ.getValue()).remove(callback);
                                ytv2.LIZ().remove(callback.LIZIZ());
                                return;
                            }
                            return;
                        }
                        Object LJIIIIZZ5 = this.LJIIIIZZ();
                        if (!(LJIIIIZZ5 instanceof YTU) || (ytu4 = (YTU) LJIIIIZZ5) == null) {
                            return;
                        }
                        InterfaceC87433YTd callback2 = InterfaceC87433YTd.this;
                        o.LJIIIZ(callback2, "callback");
                        ytu4.LIZJ().remove(callback2);
                        ytu4.LIZLLL().remove(callback2.LIZIZ());
                        return;
                    }
                    Object LJIIIIZZ6 = this.LJIIIIZZ();
                    if (!(LJIIIIZZ6 instanceof YTU) || (ytu3 = (YTU) LJIIIIZZ6) == null) {
                        return;
                    }
                    InterfaceC87433YTd callback3 = InterfaceC87433YTd.this;
                    o.LJIIIZ(callback3, "callback");
                    ytu3.LIZJ().remove(callback3);
                    ytu3.LIZLLL().remove(callback3.LIZIZ());
                }
            }
        });
    }
}
