package com.byted.cast.usbsource.usbdisplaysource;

import X.C03880Dg;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C65300Pk0;
import X.C84763XOl;
import X.OHQ;
import X.X1D;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import android.media.projection.MediaProjection;
import android.os.ParcelFileDescriptor;
import android.view.Display;
import com.byted.cast.usbsource.usbcommon.Logger;
import com.byted.cast.usbsource.usbdisplaysource.DisplaySourceService;
import com.byted.cast.usbsource.usbdisplaysource.presentation.DemoPresentation;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public class UsbSourceServer {
    public static boolean mConnected;
    public static volatile UsbSourceServer mUsbSourceServer;
    public Activity mActivity;
    public Context mContext;
    public DisplaySourceService mDisplaySourceService;
    public Logger mLogger;
    public Presenter mPresenter;
    public AccessoryReceiver mReceiver;
    public UsbManager mUsbManager;

    /* loaded from: classes29.dex */
    public class Presenter implements DisplaySourceService.Callbacks {
        public DemoPresentation mPresentation;

        public static void com_byted_cast_usbsource_usbdisplaysource_UsbSourceServer$Presenter_com_byted_cast_usbsource_usbdisplaysource_presentation_DemoPresentation_show(DemoPresentation demoPresentation) {
            if (new C03880Dg(2).LIZJ(300000, "com/byted/cast/usbsource/usbdisplaysource/presentation/DemoPresentation", "show", demoPresentation, new Object[0], "void", new C65300Pk0(false, "()V", "7148837049035741579")).LIZ) {
                return;
            }
            demoPresentation.show();
        }

        @Override // com.byted.cast.usbsource.usbdisplaysource.DisplaySourceService.Callbacks
        public void onDisconnect() {
            UsbSourceServer.this.onAccessoryDetached(null);
        }

        public Presenter() {
        }

        @Override // com.byted.cast.usbsource.usbdisplaysource.DisplaySourceService.Callbacks
        public void onDisplayAdded(Display display) {
            Logger logger = UsbSourceServer.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Accessory display added: ");
            LIZ.append(display);
            logger.log(X1D.LIZIZ(LIZ));
            UsbSourceServer usbSourceServer = UsbSourceServer.this;
            DemoPresentation demoPresentation = new DemoPresentation(usbSourceServer.mContext, display, usbSourceServer.mLogger);
            this.mPresentation = demoPresentation;
            com_byted_cast_usbsource_usbdisplaysource_UsbSourceServer$Presenter_com_byted_cast_usbsource_usbdisplaysource_presentation_DemoPresentation_show(demoPresentation);
        }

        @Override // com.byted.cast.usbsource.usbdisplaysource.DisplaySourceService.Callbacks
        public void onDisplayRemoved(Display display) {
            Logger logger = UsbSourceServer.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Accessory display removed: ");
            LIZ.append(display);
            logger.log(X1D.LIZIZ(LIZ));
            DemoPresentation demoPresentation = this.mPresentation;
            if (demoPresentation != null) {
                demoPresentation.dismiss();
                this.mPresentation = null;
            }
        }
    }

    private void disconnect() {
        this.mLogger.log("Disconnecting from accessory: ");
        DisplaySourceService displaySourceService = this.mDisplaySourceService;
        if (displaySourceService != null) {
            displaySourceService.stopService();
        }
        this.mLogger.log("Disconnected.");
        mConnected = false;
    }

    public void checkAccessory() {
        UsbAccessory[] accessoryList;
        Activity activity = this.mActivity;
        if (activity == null || this.mContext == null) {
            return;
        }
        this.mUsbManager = (UsbManager) C16880lQ.LLILIL(activity, "usb");
        Intent intent = this.mActivity.getIntent();
        if (intent.getAction().equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED")) {
            UsbAccessory usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
            if (usbAccessory == null) {
                return;
            }
            this.mLogger.log("onAccessoryAttached 1 start...");
            onAccessoryAttached(usbAccessory);
            return;
        }
        UsbManager usbManager = this.mUsbManager;
        if (usbManager == null || (accessoryList = usbManager.getAccessoryList()) == null) {
            return;
        }
        for (UsbAccessory usbAccessory2 : accessoryList) {
            this.mLogger.log("onAccessoryAttached 2 start...");
            onAccessoryAttached(usbAccessory2);
        }
    }

    public void destroy() {
        if (mConnected) {
            disconnect();
        }
        if (this.mReceiver != null) {
            Logger logger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unregisterReceiver");
            LIZ.append(this.mReceiver);
            logger.log(X1D.LIZIZ(LIZ));
            C16880lQ.LJJLIIIJL(this.mContext, this.mReceiver);
            this.mReceiver = null;
        }
        this.mPresenter = null;
        this.mDisplaySourceService = null;
        this.mLogger = null;
        mUsbSourceServer = null;
    }

    public void pause() {
        this.mLogger.log("pause");
        DisplaySourceService displaySourceService = this.mDisplaySourceService;
        if (displaySourceService != null) {
            displaySourceService.pause();
        }
    }

    public void resume() {
        this.mLogger.log("resume");
        DisplaySourceService displaySourceService = this.mDisplaySourceService;
        if (displaySourceService != null) {
            displaySourceService.resume();
        }
    }

    public void sendQuery() {
        this.mLogger.log("sendQuery");
        DisplaySourceService displaySourceService = this.mDisplaySourceService;
        if (displaySourceService != null) {
            displaySourceService.sendQuery();
        }
    }

    public void startRecorder() {
        this.mLogger.log("startRecorder");
        DisplaySourceService displaySourceService = this.mDisplaySourceService;
        if (displaySourceService != null) {
            displaySourceService.startRecorder();
        }
    }

    public void stopRecorder() {
        this.mLogger.log("stopRecorder");
        DisplaySourceService displaySourceService = this.mDisplaySourceService;
        if (displaySourceService != null) {
            displaySourceService.stopRecorder();
        }
    }

    /* loaded from: classes29.dex */
    public class AccessoryReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_byted_cast_usbsource_usbdisplaysource_UsbSourceServer$AccessoryReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public AccessoryReceiver() {
        }

        public void com_byted_cast_usbsource_usbdisplaysource_UsbSourceServer$AccessoryReceiver__onReceive$___twin___(Context context, Intent intent) {
            String action = intent.getAction();
            UsbAccessory usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
            if (action.equals("android.hardware.usb.action.USB_STATE")) {
                boolean z = C16880lQ.LLJJIJI(intent).getBoolean("connected");
                if (!z) {
                    Logger logger = UsbSourceServer.this.mLogger;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("USB_STATE:");
                    LIZ.append(z);
                    logger.log(X1D.LIZIZ(LIZ));
                    UsbSourceServer.this.onAccessoryDetached(null);
                    return;
                }
                return;
            }
            if (action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
                Logger logger2 = UsbSourceServer.this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("detached: ");
                LIZ2.append(usbAccessory);
                logger2.log(X1D.LIZIZ(LIZ2));
                UsbSourceServer.this.onAccessoryDetached(usbAccessory);
                return;
            }
            if (!action.equals("com.android.accessorydisplay.source.ACTION_USB_ACCESSORY_PERMISSION")) {
                return;
            }
            if (intent.getBooleanExtra(OHQ.LIZ, false)) {
                Logger logger3 = UsbSourceServer.this.mLogger;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("permission granted: ");
                LIZ3.append(usbAccessory);
                logger3.log(X1D.LIZIZ(LIZ3));
                UsbSourceServer.this.onAccessoryAttached(usbAccessory);
                return;
            }
            Logger logger4 = UsbSourceServer.this.mLogger;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("permission denied: ");
            LIZ4.append(usbAccessory);
            logger4.logError(X1D.LIZIZ(LIZ4));
        }

        public static void com_byted_cast_usbsource_usbdisplaysource_UsbSourceServer$AccessoryReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(AccessoryReceiver accessoryReceiver, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                accessoryReceiver.com_byted_cast_usbsource_usbdisplaysource_UsbSourceServer$AccessoryReceiver__onReceive$___twin___(context, intent);
            } else {
                C38523F9z.LIZ();
                accessoryReceiver.com_byted_cast_usbsource_usbdisplaysource_UsbSourceServer$AccessoryReceiver__onReceive$___twin___(context, intent);
            }
        }

        public static void com_byted_cast_usbsource_usbdisplaysource_UsbSourceServer$AccessoryReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(AccessoryReceiver accessoryReceiver, Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            com_byted_cast_usbsource_usbdisplaysource_UsbSourceServer$AccessoryReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(accessoryReceiver, context, intent);
        }
    }

    /* loaded from: classes29.dex */
    public class TextLogger extends Logger {
        public TextLogger() {
        }

        @Override // com.byted.cast.usbsource.usbcommon.Logger
        public void log(String str) {
            Utils.i("UsbSourceServer", str);
        }

        @Override // com.byted.cast.usbsource.usbcommon.Logger
        public void logError(String str) {
            Utils.e("UsbSourceServer", str);
        }
    }

    private void connect(UsbAccessory usbAccessory) {
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("connect accessory: ");
        LIZ.append(usbAccessory);
        LIZ.append(" mConnected:");
        LIZ.append(mConnected);
        logger.log(X1D.LIZIZ(LIZ));
        if (!isSink(usbAccessory)) {
            Utils.sendSourceEvent("USB_ERROR", 300002, "it is not an accessory display sink", "");
            Logger logger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Not connecting to USB accessory because it is not an accessory display sink: ");
            LIZ2.append(usbAccessory);
            logger2.log(X1D.LIZIZ(LIZ2));
            return;
        }
        if (mConnected) {
            disconnect();
        }
        if (!this.mUsbManager.hasPermission(usbAccessory)) {
            this.mLogger.log("Prompting the user for access to the accessory.");
            return;
        }
        ParcelFileDescriptor openAccessory = this.mUsbManager.openAccessory(usbAccessory);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("ParcelFileDescriptor");
        LIZ3.append(openAccessory);
        Utils.sendSourceEvent("USB_Start_Service", X1D.LIZIZ(LIZ3));
        if (openAccessory == null) {
            this.mLogger.logError("Could not obtain accessory connection.");
            Utils.sendSourceEvent("USB_ERROR", 300003, "Could not obtain accessory connection", "");
            return;
        }
        this.mLogger.log("Connected.");
        mConnected = true;
        this.mDisplaySourceService.startService(openAccessory);
        Logger logger3 = this.mLogger;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("mDisplaySourceService startTransport: ");
        LIZ4.append(openAccessory);
        logger3.log(X1D.LIZIZ(LIZ4));
    }

    public static boolean isSink(UsbAccessory usbAccessory) {
        if ("Android".equals(usbAccessory.getManufacturer()) && "Accessory Display".equals(usbAccessory.getModel())) {
            return true;
        }
        return false;
    }

    public void onAccessoryAttached(UsbAccessory usbAccessory) {
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("USB accessory attached: ");
        LIZ.append(usbAccessory);
        LIZ.append("state:");
        LIZ.append(mConnected);
        logger.log(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(usbAccessory);
        LIZ2.append("state:");
        LIZ2.append(mConnected);
        Utils.sendSourceEvent("USB_Accessory_Attached", X1D.LIZIZ(LIZ2));
        if (mConnected && this.mDisplaySourceService != null) {
            this.mLogger.logError("USB has mConnected !!!");
            Utils.onDisconnect(0);
            DisplaySourceService displaySourceService = this.mDisplaySourceService;
            if (displaySourceService != null) {
                displaySourceService.sendQuery();
            }
        }
        if (!mConnected) {
            connect(usbAccessory);
        } else {
            Utils.sendSourceEvent("USB_ERROR", 300002, "has mConnected", "");
        }
    }

    public void onAccessoryDetached(UsbAccessory usbAccessory) {
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("USB accessory detached: ");
        LIZ.append(usbAccessory);
        LIZ.append("state:");
        LIZ.append(mConnected);
        logger.log(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(usbAccessory);
        LIZ2.append("state:");
        LIZ2.append(mConnected);
        Utils.sendSourceEvent("USB_Accessory_Detached", X1D.LIZIZ(LIZ2));
        if (mConnected) {
            disconnect();
        }
    }

    public void setAudioCert(Object obj) {
        this.mLogger.log("setAudioCert");
        DisplaySourceService displaySourceService = this.mDisplaySourceService;
        if (displaySourceService != null) {
            displaySourceService.setAudioCert(obj);
        }
    }

    public void setAudioStopCert(Object obj) {
        this.mLogger.log("setAudioStopCert");
        DisplaySourceService displaySourceService = this.mDisplaySourceService;
        if (displaySourceService != null) {
            displaySourceService.setAudioStopCert(obj);
        }
    }

    public void setMediaProjection(MediaProjection mediaProjection) {
        this.mLogger.log("setMediaProjection");
        DisplaySourceService displaySourceService = this.mDisplaySourceService;
        if (displaySourceService != null) {
            displaySourceService.setMediaProjection(mediaProjection);
        }
    }

    public UsbSourceServer(Activity activity, Context context) {
        Utils.initID();
        TextLogger textLogger = new TextLogger();
        this.mLogger = textLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UsbSourceServer init activity:");
        LIZ.append(activity);
        LIZ.append(" context:");
        LIZ.append(context);
        textLogger.log(X1D.LIZIZ(LIZ));
        this.mActivity = activity;
        this.mContext = context;
        Utils.mContext = context;
        String systemProperty = Utils.getSystemProperty("persist.sys.usb.config", "");
        Logger logger = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("get persist.sys.usb.config ");
        LIZ2.append(systemProperty);
        logger.log(X1D.LIZIZ(LIZ2));
        if (systemProperty.contains("adb")) {
            Utils.sendSourceEvent("USB_ERROR", 300001, "adb not close", "");
        }
        this.mPresenter = new Presenter();
        this.mDisplaySourceService = new DisplaySourceService(this.mContext, this.mPresenter, this.mLogger);
        this.mReceiver = new AccessoryReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_STATE");
        intentFilter.addAction("com.byted.cast.usbsource.ACTION");
        C16880lQ.LJJLIIIJILLIZJL(this.mReceiver, this.mContext, intentFilter);
        Logger logger2 = this.mLogger;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("registerReceiver");
        LIZ3.append(this.mReceiver);
        logger2.log(X1D.LIZIZ(LIZ3));
    }

    public static UsbSourceServer getInstance(Activity activity, Context context) {
        if (activity == null || context == null) {
            return mUsbSourceServer;
        }
        if (mUsbSourceServer == null) {
            synchronized (UsbSourceServer.class) {
                if (mUsbSourceServer == null) {
                    mUsbSourceServer = new UsbSourceServer(activity, context);
                }
            }
        }
        return mUsbSourceServer;
    }
}
