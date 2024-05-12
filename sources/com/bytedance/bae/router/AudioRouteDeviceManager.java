package com.bytedance.bae.router;

import X.C04330Ez;
import X.C06460Ne;
import X.C06540Nm;
import X.C16880lQ;
import X.C19U;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C48690J9a;
import X.C7MY;
import X.C84763XOl;
import X.HZD;
import X.Q8V;
import X.RunnableC47136Iei;
import X.RunnableC65317PkH;
import X.X1D;
import Y.ARunnableS11S0101000_7;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS15S0101000_11;
import Y.IDRunnableS6S0101000;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbConfiguration;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class AudioRouteDeviceManager extends BroadcastReceiver {
    public BluetoothAdapter mBluetoothAdapter;
    public MyBluetoothDevice mBluetoothDevice;
    public AudioDeviceCallback mBluetoothDeviceCallback;
    public int mBluetoothScoRestartTimes;
    public IAudioRouteCallback mCallback;
    public boolean mEnableSkipBluetoothConnectPermission;
    public Handler mHandler;
    public int mInitDeviceState;
    public IntentFilter mIntentFilter;
    public boolean mScoHasStarted;
    public boolean mSkipBluetoothConnectPermission;
    public UsbDevice mUsbHeadsetDevice;
    public String mWiredHeadsetDevice;
    public volatile boolean registered;
    public int mBluetoothScoConnectCheckTimes = -1;
    public String mBluetoothPermissionDesp = "NULL";
    public int currentRouting = -1;

    /* loaded from: classes12.dex */
    public class MyBluetoothDevice {
        public boolean a2dpConnected;
        public BluetoothDevice bluetoothDevice;
        public boolean headsetConnected;
        public String name;

        public String getName() {
            if (this.bluetoothDevice == null) {
                return this.name;
            }
            return "bluetooth-headset";
        }

        public String toString() {
            return getName();
        }

        public boolean getBluetoothConnected(int i) {
            if (i == 1) {
                return this.headsetConnected;
            }
            if (i == 2) {
                return this.a2dpConnected;
            }
            return false;
        }

        public MyBluetoothDevice(BluetoothDevice bluetoothDevice) {
            this.bluetoothDevice = bluetoothDevice;
        }

        public void setBluetoothConnected(int i, boolean z) {
            if (i == 1) {
                this.headsetConnected = z;
            } else {
                if (i != 2) {
                    return;
                }
                this.a2dpConnected = z;
            }
        }

        public MyBluetoothDevice(String str) {
            this.name = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4 */
    private void initBluetooth() {
        boolean z;
        boolean z2;
        Context applicationContext;
        AudioManager audioManager;
        this.mBluetoothDevice = null;
        int i = 0;
        if (!checkPermission()) {
            if (!this.mSkipBluetoothConnectPermission || (applicationContext = ContextUtils.getApplicationContext()) == null || (audioManager = (AudioManager) C16880lQ.LLILL(applicationContext, "audio")) == null) {
                return;
            }
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            int length = devices.length;
            z = false;
            z2 = 0;
            while (i < length) {
                AudioDeviceInfo audioDeviceInfo = devices[i];
                if (!audioDeviceInfo.isSource()) {
                    if (7 == audioDeviceInfo.getType()) {
                        z = true;
                    } else if (8 == audioDeviceInfo.getType()) {
                        z2 = 1;
                    }
                }
                i++;
                z2 = z2;
            }
        } else {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.mBluetoothAdapter = defaultAdapter;
            if (defaultAdapter == null) {
                return;
            }
            if (2 == defaultAdapter.getProfileConnectionState(1)) {
                z = true;
            } else {
                z = false;
            }
            if (2 == this.mBluetoothAdapter.getProfileConnectionState(2)) {
                i = 1;
            }
            this.mIntentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            this.mIntentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
            this.mIntentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            z2 = i;
        }
        if (z || z2 != 0) {
            MyBluetoothDevice myBluetoothDevice = new MyBluetoothDevice("bluetooth-headset[init]");
            this.mBluetoothDevice = myBluetoothDevice;
            myBluetoothDevice.setBluetoothConnected(1, z);
            this.mBluetoothDevice.setBluetoothConnected(2, z2);
        }
    }

    public static /* synthetic */ void lambda$semisugar$bluetoothScoConnectionCheck$0(AudioRouteDeviceManager audioRouteDeviceManager) {
        audioRouteDeviceManager.bluetoothScoConnectionCheck();
    }

    public static /* synthetic */ void lambda$semisugar$bluetoothScoDisconnectionForNormalMode$0(AudioRouteDeviceManager audioRouteDeviceManager) {
        audioRouteDeviceManager.bluetoothScoDisconnectionForNormalMode();
    }

    public static /* synthetic */ void lambda$semisugar$restartBluetoothScoAsynTask$0(AudioRouteDeviceManager audioRouteDeviceManager) {
        audioRouteDeviceManager.restartBluetoothScoAsynTask();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_bytedance_bae_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public int release() {
        int i;
        AudioManager audioManager;
        this.mCallback = null;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext != null && (audioManager = (AudioManager) C16880lQ.LLILL(applicationContext, "audio")) != null && (audioManager.isBluetoothScoOn() || this.mScoHasStarted)) {
            stopSystemBluetoothSco(audioManager);
        }
        if (unregisterReceiver() != 0) {
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: unregisterReceiver failed.");
            i = -1;
        } else {
            i = 0;
        }
        if (this.mHandler != null) {
            this.mHandler = null;
        }
        this.mBluetoothAdapter = null;
        this.mIntentFilter = null;
        this.mInitDeviceState = 0;
        this.mBluetoothDevice = null;
        this.mUsbHeadsetDevice = null;
        this.mWiredHeadsetDevice = null;
        this.currentRouting = -1;
        this.mEnableSkipBluetoothConnectPermission = false;
        this.mSkipBluetoothConnectPermission = false;
        return i;
    }

    public void bluetoothScoConnectionCheck() {
        if (this.mCallback == null) {
            return;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: bluetoothScoConnectionCheck failed. Context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) C16880lQ.LLILL(applicationContext, "audio");
        if (audioManager == null) {
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: bluetoothScoConnectionCheck failed. AudioManager is null.");
            return;
        }
        if (this.mBluetoothScoConnectCheckTimes >= 3) {
            if (this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManager);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bluetoothScoConnectionCheck timeout, time: ");
            LIZ.append(this.mBluetoothScoConnectCheckTimes);
            RXLogging.e("AudioRouteDeviceManager", X1D.LIZIZ(LIZ));
            this.mBluetoothScoConnectCheckTimes = -1;
            this.mHandler.removeCallbacks(new IDRunnableS6S0101000(1, this, 30));
            this.mCallback.onError(AudioRouteController.EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE, "change to normal mode due to sco started timeout");
            return;
        }
        if (audioManager.isBluetoothScoOn()) {
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: bluetoothScoConnectionCheck success.");
            this.mBluetoothScoConnectCheckTimes = -1;
            this.mHandler.removeCallbacks(new IDRunnableS6S0101000(4, this, 31));
            return;
        }
        this.mBluetoothScoConnectCheckTimes++;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AudioRouteDeviceManager: bluetoothScoConnectionCheck failed. retry again, time: ");
        LIZ2.append(this.mBluetoothScoConnectCheckTimes);
        RXLogging.e("AudioRouteDeviceManager", X1D.LIZIZ(LIZ2));
        startSystemBluetoothSco(audioManager);
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new Q8V(0, this), 3000L);
    }

    private boolean bluetoothScoIsStarting() {
        if (this.mHandler == null || this.mBluetoothScoConnectCheckTimes < 0) {
            return false;
        }
        return true;
    }

    private boolean initUsbHeadset() {
        Context applicationContext;
        try {
            applicationContext = ContextUtils.getApplicationContext();
        } catch (Throwable th) {
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: initUsbHeadset failed.", th);
        }
        if (applicationContext == null) {
            return false;
        }
        HashMap<String, UsbDevice> deviceList = ((UsbManager) C16880lQ.LLILL(applicationContext, "usb")).getDeviceList();
        Iterator<String> it = deviceList.keySet().iterator();
        while (it.hasNext()) {
            UsbDevice usbDevice = deviceList.get(it.next());
            if (hasAudioForUsbDevice(usbDevice)) {
                this.mUsbHeadsetDevice = usbDevice;
                RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: initUsbHeadset finished.");
                return true;
            }
        }
        return false;
    }

    public void restartBluetoothScoAsynTask() {
        RXLogging.w("AudioRouteDeviceManager", "restartBluetoothScoAsynTask enter.");
        if (this.mBluetoothDevice != null) {
            if (bluetoothScoIsStarting()) {
                RXLogging.w("AudioRouteDeviceManager", "restartBluetoothScoAsynTask skip. sco is starting.");
                return;
            }
            Context applicationContext = ContextUtils.getApplicationContext();
            if (applicationContext == null) {
                RXLogging.e("AudioRouteDeviceManager", "restartBluetoothScoAsynTask failed. Context is null.");
                return;
            }
            AudioManager audioManager = (AudioManager) C16880lQ.LLILL(applicationContext, "audio");
            if (audioManager == null) {
                RXLogging.e("AudioRouteDeviceManager", "restartBluetoothScoAsynTask failed. AudioManager is null.");
                return;
            } else {
                startSystemBluetoothSco(audioManager);
                RXLogging.w("AudioRouteDeviceManager", "restartBluetoothScoAsynTask has start bluetooth.");
                return;
            }
        }
        RXLogging.w("AudioRouteDeviceManager", "restartBluetoothScoAsynTask skip, no bluetooth device now.");
    }

    public String getRenderDeviceName() {
        int i = this.currentRouting;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 32) {
                                return "failed_device_name";
                            }
                            UsbDevice usbDevice = this.mUsbHeadsetDevice;
                            if (usbDevice != null) {
                                return usbDevice.getDeviceName();
                            }
                            return "failed_usb-headset";
                        }
                        MyBluetoothDevice myBluetoothDevice = this.mBluetoothDevice;
                        if (myBluetoothDevice != null) {
                            return myBluetoothDevice.getName();
                        }
                        return "failed_bluetooth-a2dp";
                    }
                    MyBluetoothDevice myBluetoothDevice2 = this.mBluetoothDevice;
                    if (myBluetoothDevice2 != null) {
                        return myBluetoothDevice2.getName();
                    }
                    return "failed_bluetooth-headset";
                }
                String str = this.mWiredHeadsetDevice;
                if (str != null) {
                    return str;
                }
                return "failed_wired-headset";
            }
            return "built-in speaker";
        }
        return "earpiece";
    }

    public int init() {
        IntentFilter intentFilter = new IntentFilter();
        this.mIntentFilter = intentFilter;
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.mIntentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        this.mIntentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        initHandler();
        if (initHeadset()) {
            this.mInitDeviceState += 4;
        }
        if (initUsbHeadset()) {
            this.mInitDeviceState += 32;
        }
        initBluetooth();
        MyBluetoothDevice myBluetoothDevice = this.mBluetoothDevice;
        if (myBluetoothDevice != null) {
            if (myBluetoothDevice.getBluetoothConnected(1)) {
                this.mInitDeviceState += 8;
            }
            if (this.mBluetoothDevice.getBluetoothConnected(2)) {
                this.mInitDeviceState += 16;
            }
        }
        if (registerReceiver() != 0) {
            release();
            return -2;
        }
        return 0;
    }

    public void restartBluetoothSco() {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 32) {
            RXLogging.w("AudioRouteDeviceManager", "restartBluetoothSco ignored, since android 13 will start bluetooth sco itself after sco disconnected.");
            return;
        }
        RXLogging.w("AudioRouteDeviceManager", "restartBluetoothSco enter.");
        int i = 1;
        if (this.mBluetoothDevice != null) {
            Context applicationContext = ContextUtils.getApplicationContext();
            if (applicationContext == null) {
                RXLogging.e("AudioRouteDeviceManager", "restartBluetoothSco failed. Context is null.");
                return;
            }
            AudioManager audioManager = (AudioManager) C16880lQ.LLILL(applicationContext, "audio");
            if (audioManager == null) {
                RXLogging.e("AudioRouteDeviceManager", "restartBluetoothSco failed. AudioManager is null.");
                return;
            }
            if (3 != audioManager.getMode()) {
                RXLogging.e("AudioRouteDeviceManager", "restartBluetoothSco failed. Not in communication mode.");
                return;
            }
            if (bluetoothScoIsStarting()) {
                RXLogging.w("AudioRouteDeviceManager", "restartBluetoothSco skip. sco is starting.");
                return;
            }
            int i2 = this.mBluetoothScoRestartTimes + 1;
            this.mBluetoothScoRestartTimes = i2;
            if (i2 <= 3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("restartBluetoothScoAsynTask, restart time: ");
                LIZ.append(this.mBluetoothScoRestartTimes);
                RXLogging.w("AudioRouteDeviceManager", X1D.LIZIZ(LIZ));
                if (!audioManager.isBluetoothScoOn() && (handler = this.mHandler) != null) {
                    handler.postDelayed(new HZD(i, this), 3000L);
                }
            } else {
                if (this.mScoHasStarted) {
                    stopSystemBluetoothSco(audioManager);
                }
                IAudioRouteCallback iAudioRouteCallback = this.mCallback;
                if (iAudioRouteCallback != null) {
                    iAudioRouteCallback.onError(AudioRouteController.EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE, "change to normal mode due to sco restart timeout");
                }
            }
            RXLogging.w("AudioRouteDeviceManager", "restartBluetoothSco leave.");
            return;
        }
        RXLogging.w("AudioRouteDeviceManager", "restartBluetoothSco skip, no bluetooth device now.");
        this.mHandler.removeCallbacks(new ARunnableS11S0101000_7(1, this, 3));
    }

    public void bluetoothScoDisconnectionForNormalMode() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: bluetoothScoDisconnectionForNormalMode failed. Context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) C16880lQ.LLILL(applicationContext, "audio");
        if (audioManager == null) {
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: bluetoothScoDisconnectionForNormalMode failed. AudioManager is null.");
            return;
        }
        int mode = audioManager.getMode();
        boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioRouteDeviceManager: bluetoothScoDisconnectionForNormalMode mode(");
        LIZ.append(mode);
        LIZ.append("), bluetoothScoOn(");
        LIZ.append(isBluetoothScoOn);
        LIZ.append(")");
        RXLogging.e("AudioRouteDeviceManager", X1D.LIZIZ(LIZ));
        if (mode == 0) {
            if (isBluetoothScoOn || this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManager);
            }
        }
    }

    private boolean checkPermission() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = applicationContext.getApplicationInfo().targetSdkVersion;
        if (i >= 31 && i2 >= 31) {
            if (applicationContext.checkCallingOrSelfPermission("android.permission.BLUETOOTH_CONNECT") != 0) {
                this.mSkipBluetoothConnectPermission = this.mEnableSkipBluetoothConnectPermission;
                StringBuilder LIZJ = C06460Ne.LIZJ("[permission android.permission.BLUETOOTH_CONNECT not be granted. osVersion:", i, ", targetVersion:", i2, ", EnableSkipBluetoothConnectBroadcast:");
                String LIZ = C19U.LIZ(LIZJ, this.mEnableSkipBluetoothConnectPermission, " ]", LIZJ);
                this.mBluetoothPermissionDesp = LIZ;
                RXLogging.e("AudioRouteDeviceManager", LIZ);
                return false;
            }
            String LJIIJJI = C48690J9a.LJIIJJI("[permission android.permission.BLUETOOTH_CONNECT granted. osVersion:", i, ", targetVersion:", i2, " ]");
            this.mBluetoothPermissionDesp = LJIIJJI;
            RXLogging.i("AudioRouteDeviceManager", LJIIJJI);
            return true;
        }
        if (applicationContext.checkCallingOrSelfPermission("android.permission.BLUETOOTH") != 0) {
            String LJIIJJI2 = C48690J9a.LJIIJJI("[permission android.permission.BLUETOOTH not be granted. osVersion:", i, ", targetVersion:", i2, " ]");
            this.mBluetoothPermissionDesp = LJIIJJI2;
            RXLogging.e("AudioRouteDeviceManager", LJIIJJI2);
            return false;
        }
        String LJIIJJI3 = C48690J9a.LJIIJJI("[permission android.permission.BLUETOOTH granted. osVersion:", i, ", targetVersion:", i2, " ]");
        this.mBluetoothPermissionDesp = LJIIJJI3;
        RXLogging.i("AudioRouteDeviceManager", LJIIJJI3);
        return true;
    }

    private void initHandler() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null || (myLooper = C16880lQ.LLJJJJ()) != null) {
            Handler handler = new Handler(myLooper);
            this.mHandler = handler;
            handler.removeCallbacks(new ARunnableS12S0101000_8(1, this, 1));
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: initHandler success");
            return;
        }
        RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: initHandler failed");
    }

    private boolean initHeadset() {
        Intent LJJLIIIJILLIZJL;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(this, applicationContext, new IntentFilter("android.intent.action.HEADSET_PLUG"))) == null || headsetPlugActionIsFromUsbHeadset(LJJLIIIJILLIZJL) || 1 != LJJLIIIJILLIZJL.getIntExtra("state", -99)) {
            return false;
        }
        return true;
    }

    private int registerReceiver() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return -1;
        }
        if (this.registered) {
            return 0;
        }
        this.registered = true;
        C16880lQ.LJJLIIIJILLIZJL(this, applicationContext, this.mIntentFilter);
        if (this.mSkipBluetoothConnectPermission) {
            AudioManager audioManager = (AudioManager) C16880lQ.LLILL(applicationContext, "audio");
            if (audioManager == null) {
                return -2;
            }
            BluetoothConnectCallback bluetoothConnectCallback = new BluetoothConnectCallback();
            this.mBluetoothDeviceCallback = bluetoothConnectCallback;
            audioManager.registerAudioDeviceCallback(bluetoothConnectCallback, null);
        }
        return 0;
    }

    private int unregisterReceiver() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return -1;
        }
        if (!this.registered) {
            return 0;
        }
        this.registered = false;
        C16880lQ.LJJLIIIJL(applicationContext, this);
        clearAbortBroadcast();
        if (this.mSkipBluetoothConnectPermission) {
            AudioManager audioManager = (AudioManager) C16880lQ.LLILL(applicationContext, "audio");
            if (audioManager == null) {
                return -2;
            }
            audioManager.unregisterAudioDeviceCallback(this.mBluetoothDeviceCallback);
            this.mBluetoothDeviceCallback = null;
        }
        return 0;
    }

    public String getCaptureDeviceName() {
        return getRenderDeviceName();
    }

    public String getSessionInfo() {
        boolean z;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return "Context is null";
        }
        AudioManager audioManager = (AudioManager) C16880lQ.LLILL(applicationContext, "audio");
        if (audioManager == null) {
            return "AudioManager is null";
        }
        if (this.mCallback == null) {
            return "mCallback is null";
        }
        boolean hasSystemFeature = applicationContext.getPackageManager().hasSystemFeature("android.hardware.microphone");
        if (C04330Ez.LIZ(applicationContext, "android.permission.RECORD_AUDIO") == 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("{ Audio State: audio_mode:");
            LIZ.append(AudioRouteUtil.modeString(audioManager.getMode()));
            LIZ.append(", has_mic:");
            LIZ.append(hasSystemFeature);
            LIZ.append(", mic_muted:");
            LIZ.append(audioManager.isMicrophoneMute());
            LIZ.append(", speakerphone:");
            LIZ.append(audioManager.isSpeakerphoneOn());
            LIZ.append(", headset:");
            LIZ.append(audioManager.isWiredHeadsetOn());
            LIZ.append(", bt_sco:");
            LIZ.append(audioManager.isBluetoothScoOn());
            LIZ.append(", permission:");
            LIZ.append(z);
            LIZ.append(", bluetoothPermission:");
            LIZ.append(this.mBluetoothPermissionDesp);
            LIZ.append(" }");
            return X1D.LIZIZ(LIZ);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getSessionInfo failed, exception: ");
            LIZ2.append(e.toString());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            RXLogging.e("AudioRouteDeviceManager", LIZIZ);
            return LIZIZ;
        }
    }

    public int getDeviceState() {
        return this.mInitDeviceState;
    }

    /* loaded from: classes12.dex */
    public class BluetoothConnectCallback extends AudioDeviceCallback {
        public BluetoothConnectCallback() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (!audioDeviceInfo.isSource()) {
                    int type = audioDeviceInfo.getType();
                    if (type == 7) {
                        if (AudioRouteDeviceManager.this.mCallback != null) {
                            String charSequence = audioDeviceInfo.getProductName().toString();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("addedDevices: ");
                            LIZ.append(type);
                            LIZ.append(", name: ");
                            LIZ.append(charSequence);
                            RXLogging.i("AudioRouteDeviceManager", X1D.LIZIZ(LIZ));
                            AudioRouteDeviceManager audioRouteDeviceManager = AudioRouteDeviceManager.this;
                            if (audioRouteDeviceManager.mBluetoothDevice == null) {
                                audioRouteDeviceManager.mBluetoothDevice = new MyBluetoothDevice("bluetooth-headset");
                            }
                            AudioRouteDeviceManager.this.mBluetoothDevice.setBluetoothConnected(1, true);
                            AudioRouteDeviceManager audioRouteDeviceManager2 = AudioRouteDeviceManager.this;
                            audioRouteDeviceManager2.mBluetoothDevice = new MyBluetoothDevice("bluetooth-headset");
                            AudioRouteDeviceManager audioRouteDeviceManager3 = AudioRouteDeviceManager.this;
                            audioRouteDeviceManager3.mBluetoothScoRestartTimes = 0;
                            audioRouteDeviceManager3.mCallback.onDeviceEvent(8, true);
                        }
                    } else if (type == 8 && AudioRouteDeviceManager.this.mCallback != null) {
                        String charSequence2 = audioDeviceInfo.getProductName().toString();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("addedDevices: ");
                        LIZ2.append(type);
                        LIZ2.append(", name: ");
                        LIZ2.append(charSequence2);
                        RXLogging.i("AudioRouteDeviceManager", X1D.LIZIZ(LIZ2));
                        AudioRouteDeviceManager audioRouteDeviceManager4 = AudioRouteDeviceManager.this;
                        if (audioRouteDeviceManager4.mBluetoothDevice == null) {
                            audioRouteDeviceManager4.mBluetoothDevice = new MyBluetoothDevice("bluetooth-headset");
                        }
                        AudioRouteDeviceManager.this.mBluetoothDevice.setBluetoothConnected(2, true);
                        AudioRouteDeviceManager.this.mCallback.onDeviceEvent(16, true);
                    }
                }
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (!audioDeviceInfo.isSource()) {
                    int type = audioDeviceInfo.getType();
                    if (type == 7) {
                        if (AudioRouteDeviceManager.this.mCallback != null) {
                            StringBuilder LJ = C7MY.LJ("removedDevices: ", type, ", name: ");
                            LJ.append((Object) audioDeviceInfo.getProductName());
                            RXLogging.i("AudioRouteDeviceManager", X1D.LIZIZ(LJ));
                            MyBluetoothDevice myBluetoothDevice = AudioRouteDeviceManager.this.mBluetoothDevice;
                            if (myBluetoothDevice != null) {
                                myBluetoothDevice.setBluetoothConnected(1, false);
                                if (!AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(1) && !AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(2)) {
                                    RXLogging.i("AudioRouteDeviceManager", "AudioRouteDeviceManager: destroy mBluetoothDevice due to headset & a2dp disconncected");
                                    AudioRouteDeviceManager.this.mBluetoothDevice = null;
                                }
                            }
                            AudioRouteDeviceManager audioRouteDeviceManager = AudioRouteDeviceManager.this;
                            audioRouteDeviceManager.mBluetoothDevice = null;
                            audioRouteDeviceManager.mCallback.onDeviceEvent(8, false);
                            return;
                        }
                    } else if (type == 8 && AudioRouteDeviceManager.this.mCallback != null) {
                        StringBuilder LJ2 = C7MY.LJ("removedDevices: ", type, ", name: ");
                        LJ2.append((Object) audioDeviceInfo.getProductName());
                        RXLogging.i("AudioRouteDeviceManager", X1D.LIZIZ(LJ2));
                        MyBluetoothDevice myBluetoothDevice2 = AudioRouteDeviceManager.this.mBluetoothDevice;
                        if (myBluetoothDevice2 != null) {
                            myBluetoothDevice2.setBluetoothConnected(2, false);
                            if (!AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(1) && !AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(2)) {
                                RXLogging.i("AudioRouteDeviceManager", "AudioRouteDeviceManager: destroy mBluetoothDevice due to headset & a2dp disconncected");
                                AudioRouteDeviceManager.this.mBluetoothDevice = null;
                            }
                        }
                        AudioRouteDeviceManager.this.mCallback.onDeviceEvent(16, false);
                        return;
                    }
                }
            }
        }

        public /* synthetic */ BluetoothConnectCallback(AudioRouteDeviceManager audioRouteDeviceManager, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public AudioRouteDeviceManager(IAudioRouteCallback iAudioRouteCallback) {
        this.mCallback = iAudioRouteCallback;
    }

    private boolean hasAudioForUsbDevice(UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        for (int i = 0; i < usbDevice.getConfigurationCount(); i++) {
            UsbConfiguration configuration = usbDevice.getConfiguration(i);
            if (configuration != null) {
                for (int i2 = 0; i2 < configuration.getInterfaceCount(); i2++) {
                    UsbInterface usbInterface = configuration.getInterface(i2);
                    if (usbInterface != null && usbInterface.getInterfaceClass() == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean headsetPlugActionIsFromUsbHeadset(Intent intent) {
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "address");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "portName");
        int intExtra = intent.getIntExtra("state", -99);
        int intExtra2 = intent.getIntExtra("microphone", -99);
        StringBuilder LIZLLL = C06540Nm.LIZLLL("ACTION_HEADSET_PLUG info, address: ", LLJJIJIIJIL, ", portName: ", LLJJIJIIJIL2, ", connected: ");
        LIZLLL.append(intExtra);
        LIZLLL.append(", hasMic: ");
        LIZLLL.append(intExtra2);
        RXLogging.i("AudioRouteDeviceManager", X1D.LIZIZ(LIZLLL));
        if (!"".equals(LLJJIJIIJIL) && !"".equals(LLJJIJIIJIL2) && LLJJIJIIJIL2 != null) {
            if (LLJJIJIIJIL2.startsWith("USB") || LLJJIJIIJIL2.startsWith("usb")) {
                RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: received ACTION_HEADSET_PLUG, may be is a usb device");
                return true;
            }
            return false;
        }
        return false;
    }

    private void startSystemBluetoothSco(AudioManager audioManager) {
        if (audioManager != null) {
            try {
                audioManager.startBluetoothSco();
                this.mScoHasStarted = true;
                return;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startSystemBluetoothSco failed, Exception: ");
                LIZ.append(e.toString());
                RXLogging.e("AudioRouteDeviceManager", X1D.LIZIZ(LIZ));
                return;
            }
        }
        RXLogging.e("AudioRouteDeviceManager", "startSystemBluetoothSco skipped, audioManager is null");
    }

    private void stopSystemBluetoothSco(AudioManager audioManager) {
        if (audioManager != null) {
            try {
                audioManager.stopBluetoothSco();
                audioManager.setBluetoothScoOn(false);
                this.mScoHasStarted = false;
                return;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("stopSystemBluetoothSco failed, Exception: ");
                LIZ.append(e.toString());
                RXLogging.e("AudioRouteDeviceManager", X1D.LIZIZ(LIZ));
                return;
            }
        }
        RXLogging.e("AudioRouteDeviceManager", "stopSystemBluetoothSco skipped, audioManager is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void com_bytedance_bae_router_AudioRouteDeviceManager__onReceive$___twin___(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bae.router.AudioRouteDeviceManager.com_bytedance_bae_router_AudioRouteDeviceManager__onReceive$___twin___(android.content.Context, android.content.Intent):void");
    }

    public int setAudioRoute(int i, boolean z) {
        int i2;
        String str;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: setAudioRoute failed. Context is null.");
            return -1;
        }
        AudioManager audioManager = (AudioManager) C16880lQ.LLILL(applicationContext, "audio");
        if (audioManager == null) {
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: setAudioRoute failed. AudioManager is null.");
            return -2;
        }
        if (this.mCallback == null) {
            RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: setAudioRoute failed. mCallback is null.");
            return -6;
        }
        int mode = audioManager.getMode();
        int i3 = 0;
        if (z) {
            i2 = 0;
        } else {
            i2 = 3;
        }
        if (i2 != mode) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioRouteDeviceManager: isMediaMode:");
            LIZ.append(z);
            LIZ.append(", cacheMode:");
            LIZ.append(i2);
            LIZ.append(", systemMode: ");
            LIZ.append(mode);
            LIZ.append(" not matched with system!!!");
            RXLogging.e("AudioRouteDeviceManager", X1D.LIZIZ(LIZ));
            audioManager.setMode(i2);
            mode = audioManager.getMode();
        }
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        StringBuilder LIZJ = C06460Ne.LIZJ("AudioRouteDeviceManager: setAudioRoute, deviceType: ", i, ", cacheMode:", i2, ", systemMode: ");
        LIZJ.append(mode);
        LIZJ.append(", speakerPhoneOn: ");
        LIZJ.append(isSpeakerphoneOn);
        LIZJ.append(", bluetoothScoOn: ");
        LIZJ.append(isBluetoothScoOn);
        RXLogging.e("AudioRouteDeviceManager", X1D.LIZIZ(LIZJ));
        if (mode == 3) {
            if (i == 8) {
                boolean bluetoothScoIsStarting = bluetoothScoIsStarting();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("need to start bluetooth sco in communication mode, sco is starting: ");
                LIZ2.append(bluetoothScoIsStarting);
                if (bluetoothScoIsStarting) {
                    str = ", skip start sco";
                } else {
                    str = ", continue start sco";
                }
                LIZ2.append(str);
                RXLogging.w("AudioRouteDeviceManager", X1D.LIZIZ(LIZ2));
                if (!isBluetoothScoOn && !bluetoothScoIsStarting) {
                    RXLogging.w("AudioRouteDeviceManager", "ready to start sco");
                    this.mBluetoothScoConnectCheckTimes = 0;
                    startSystemBluetoothSco(audioManager);
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.removeCallbacks(new ARunnableS15S0101000_11(1, this, 15));
                        this.mHandler.postDelayed(new IDRunnableS6S0101000(2, this, 7), 3000L);
                    }
                }
            } else {
                if (isBluetoothScoOn || this.mScoHasStarted) {
                    stopSystemBluetoothSco(audioManager);
                }
                if (i == 2) {
                    if (!isSpeakerphoneOn) {
                        audioManager.setSpeakerphoneOn(true);
                    }
                } else if (i == 1 || i == 4 || i == 32) {
                    if (isSpeakerphoneOn) {
                        audioManager.setSpeakerphoneOn(false);
                    }
                } else {
                    if (i == 16) {
                        RXLogging.e("AudioRouteDeviceManager", "AudioRouteDeviceManager: Error: setAudioRoute to a2dp in communication mode");
                        return -7;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("AudioRouteDeviceManager: setAudioRoute failed. deviceType(");
                    LIZ3.append(i);
                    LIZ3.append(") invalid.");
                    RXLogging.e("AudioRouteDeviceManager", X1D.LIZIZ(LIZ3));
                    return -3;
                }
            }
            this.currentRouting = i;
            return 0;
        }
        if (mode == 0) {
            if (isBluetoothScoOn || this.mScoHasStarted) {
                RXLogging.w("AudioRouteDeviceManager", "AudioRouteDeviceManager: MODE_NORMAL,but BluetoothScoOn is true, force to close sco.");
                stopSystemBluetoothSco(audioManager);
            }
            Handler handler2 = this.mHandler;
            if (handler2 != null) {
                handler2.removeCallbacks(new RunnableC65317PkH(i3, this));
                this.mHandler.postDelayed(new RunnableC47136Iei(i3, this), 6000L);
            }
            if (i == 2) {
                if (!isSpeakerphoneOn) {
                    audioManager.setSpeakerphoneOn(true);
                }
            } else if (i == 1 && isSpeakerphoneOn) {
                audioManager.setSpeakerphoneOn(false);
            }
            return 0;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("AudioRouteDeviceManager: mode(");
        LIZ4.append(mode);
        LIZ4.append(") is not support to setAudioRoute");
        RXLogging.e("AudioRouteDeviceManager", X1D.LIZIZ(LIZ4));
        return -4;
    }

    public void setSkipBluetoothConnectPermissionAbility(boolean z, IAudioRouteCallback iAudioRouteCallback) {
        this.mEnableSkipBluetoothConnectPermission = z;
        this.mCallback = iAudioRouteCallback;
    }

    public static void com_bytedance_bae_router_AudioRouteDeviceManager_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(AudioRouteDeviceManager audioRouteDeviceManager, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            audioRouteDeviceManager.com_bytedance_bae_router_AudioRouteDeviceManager__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            audioRouteDeviceManager.com_bytedance_bae_router_AudioRouteDeviceManager__onReceive$___twin___(context, intent);
        }
    }

    public static void com_bytedance_bae_router_AudioRouteDeviceManager_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(AudioRouteDeviceManager audioRouteDeviceManager, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_bytedance_bae_router_AudioRouteDeviceManager_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(audioRouteDeviceManager, context, intent);
    }
}
