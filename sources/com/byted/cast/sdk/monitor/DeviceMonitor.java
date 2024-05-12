package com.byted.cast.sdk.monitor;

import X.V0N;
import android.content.Context;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.monitor.AudioMonitor;
import com.byted.cast.sdk.monitor.NetworkMonitor;
import com.byted.cast.sdk.monitor.PerformanceMonitor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes29.dex */
public class DeviceMonitor {
    public AudioMonitor mAudioMonitor;
    public ContextManager.CastContext mCastContext;
    public Context mContext;
    public DeviceMonitorListener mDeviceMonitorListener;
    public CastLogger mLogger;
    public NetworkMonitor mNetworkMonitor;
    public PerformanceMonitor mPerformanceMonitor;

    /* loaded from: classes29.dex */
    public interface DeviceMonitorListener {
        void onAudioChanged(AudioMonitor.AudioDevice audioDevice, boolean z, int i);

        void onNetworkChanged(NetworkMonitor.NetworkType networkType, NetworkMonitor.NetworkType networkType2);

        void onPerformanceUpdated(PerformanceMonitor.Performance performance);
    }

    /* renamed from: com.byted.cast.sdk.monitor.DeviceMonitor$4, reason: invalid class name */
    /* loaded from: classes29.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$byted$cast$sdk$monitor$DeviceMonitor$DeviceEvent;

        static {
            int[] iArr = new int[DeviceEvent.values().length];
            $SwitchMap$com$byted$cast$sdk$monitor$DeviceMonitor$DeviceEvent = iArr;
            try {
                iArr[DeviceEvent.EVENT_AP_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$monitor$DeviceMonitor$DeviceEvent[DeviceEvent.EVENT_NETWORK_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$monitor$DeviceMonitor$DeviceEvent[DeviceEvent.EVENT_AUDIO_DEVICE_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$monitor$DeviceMonitor$DeviceEvent[DeviceEvent.EVENT_PERFORMANCE_UPDATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void registerAudioMonitor() {
        if (this.mAudioMonitor != null) {
            this.mLogger.w("DeviceMonitor", "AudioMonitor already registered");
            return;
        }
        AudioMonitor audioMonitor = new AudioMonitor(this.mCastContext);
        this.mAudioMonitor = audioMonitor;
        audioMonitor.setOnAudioChangeListener(new AudioMonitor.OnAudioChangeListener() { // from class: com.byted.cast.sdk.monitor.DeviceMonitor.3
            @Override // com.byted.cast.sdk.monitor.AudioMonitor.OnAudioChangeListener
            public void onAudioChanged(AudioMonitor.AudioDevice audioDevice, boolean z, int i) {
                DeviceMonitorListener deviceMonitorListener = DeviceMonitor.this.mDeviceMonitorListener;
                if (deviceMonitorListener != null) {
                    deviceMonitorListener.onAudioChanged(audioDevice, z, i);
                }
            }
        });
    }

    private void registerPerformanceMonitor() {
        if (this.mPerformanceMonitor != null) {
            this.mLogger.w("DeviceMonitor", "PerformanceMonitor already registered");
            return;
        }
        PerformanceMonitor performanceMonitor = new PerformanceMonitor(this.mCastContext);
        this.mPerformanceMonitor = performanceMonitor;
        performanceMonitor.setOnPerformanceUpdateListener(new PerformanceMonitor.OnPerformanceUpdateListener() { // from class: com.byted.cast.sdk.monitor.DeviceMonitor.2
            @Override // com.byted.cast.sdk.monitor.PerformanceMonitor.OnPerformanceUpdateListener
            public void onPerformanceUpdated(PerformanceMonitor.Performance performance) {
                DeviceMonitorListener deviceMonitorListener = DeviceMonitor.this.mDeviceMonitorListener;
                if (deviceMonitorListener != null) {
                    deviceMonitorListener.onPerformanceUpdated(performance);
                }
            }
        });
        this.mPerformanceMonitor.start(this.mContext);
    }

    private void unregisterAudioMonitor() {
        AudioMonitor audioMonitor = this.mAudioMonitor;
        if (audioMonitor != null) {
            audioMonitor.setOnAudioChangeListener(null);
            this.mAudioMonitor = null;
        }
    }

    private void unregisterNetworkMonitor() {
        NetworkMonitor networkMonitor = this.mNetworkMonitor;
        if (networkMonitor != null) {
            networkMonitor.setOnNetworkChangeListener(null);
            this.mNetworkMonitor.stop();
            this.mNetworkMonitor = null;
        }
    }

    private void unregisterPerformanceMonitor() {
        PerformanceMonitor performanceMonitor = this.mPerformanceMonitor;
        if (performanceMonitor != null) {
            performanceMonitor.setOnPerformanceUpdateListener(null);
            this.mPerformanceMonitor.stop();
            this.mPerformanceMonitor = null;
        }
    }

    /* loaded from: classes29.dex */
    public enum DeviceEvent {
        EVENT_NETWORK_CHANGED,
        EVENT_AP_CHANGED,
        EVENT_AUDIO_DEVICE_CHANGED,
        EVENT_PERFORMANCE_UPDATED;

        public static DeviceEvent valueOf(String str) {
            return (DeviceEvent) V0N.LJJJ(DeviceEvent.class, str);
        }
    }

    private void registerNetworkMonitor(DeviceEvent deviceEvent) {
        this.mLogger.w("DeviceMonitor", "NetworkMonitor registered");
        if (this.mNetworkMonitor != null) {
            this.mLogger.w("DeviceMonitor", "NetworkMonitor already registered");
            return;
        }
        NetworkMonitor networkMonitor = new NetworkMonitor(this.mCastContext);
        this.mNetworkMonitor = networkMonitor;
        networkMonitor.setOnNetworkChangeListener(new NetworkMonitor.OnNetworkChangeListener() { // from class: com.byted.cast.sdk.monitor.DeviceMonitor.1
            @Override // com.byted.cast.sdk.monitor.NetworkMonitor.OnNetworkChangeListener
            public void onNetworkChanged(NetworkMonitor.NetworkType networkType, NetworkMonitor.NetworkType networkType2) {
                DeviceMonitorListener deviceMonitorListener = DeviceMonitor.this.mDeviceMonitorListener;
                if (deviceMonitorListener != null) {
                    deviceMonitorListener.onNetworkChanged(networkType, networkType2);
                }
            }
        });
        if (deviceEvent == DeviceEvent.EVENT_AP_CHANGED) {
            this.mNetworkMonitor.start(this.mContext, NetworkMonitor.NetworkType.HOTSPOT);
        }
        if (deviceEvent == DeviceEvent.EVENT_NETWORK_CHANGED) {
            this.mNetworkMonitor.start(this.mContext, NetworkMonitor.NetworkType.WIFI);
        }
    }

    public void unmonitor(List list) {
        for (int i = 0; i < list.size(); i++) {
            int i2 = AnonymousClass4.$SwitchMap$com$byted$cast$sdk$monitor$DeviceMonitor$DeviceEvent[((DeviceEvent) ListProtector.get(list, i)).ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        unregisterPerformanceMonitor();
                    }
                } else {
                    unregisterAudioMonitor();
                }
            } else {
                unregisterNetworkMonitor();
            }
        }
    }

    public DeviceMonitor(Context context, ContextManager.CastContext castContext) {
        this.mContext = context;
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    public void monitor(DeviceMonitorListener deviceMonitorListener, List list) {
        this.mDeviceMonitorListener = deviceMonitorListener;
        for (int i = 0; i < list.size(); i++) {
            int i2 = AnonymousClass4.$SwitchMap$com$byted$cast$sdk$monitor$DeviceMonitor$DeviceEvent[((DeviceEvent) ListProtector.get(list, i)).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            registerPerformanceMonitor();
                        }
                    } else {
                        registerAudioMonitor();
                    }
                } else {
                    registerNetworkMonitor(DeviceEvent.EVENT_NETWORK_CHANGED);
                }
            } else {
                registerNetworkMonitor(DeviceEvent.EVENT_AP_CHANGED);
            }
        }
    }
}
