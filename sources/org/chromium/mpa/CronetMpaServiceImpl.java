package org.chromium.mpa;

import X.InterfaceC66682QFa;
import X.QEK;
import X.QFS;
import X.QFV;
import X.QFW;
import X.QFY;
import com.bytedance.common.utility.reflect.Reflect;
import java.util.List;
import org.chromium.CronetClient;

/* loaded from: classes12.dex */
public class CronetMpaServiceImpl {
    public QEK mCronetEngine;
    public InterfaceC66682QFa mOuterAccAddressCallback;
    public InterfaceC66682QFa mOuterInitCallback;
    public QFS mTTNetMpaService;
    public QFY mCronetInitCallback = new QFV(this);
    public QFY mCronetAccAddressCallback = new QFW(this);

    private boolean loadCronetKernel() {
        if (this.mCronetEngine != null) {
            return true;
        }
        try {
            Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("preInitCronetKernel");
            QEK cronetEngine = CronetClient.getCronetEngine();
            this.mCronetEngine = cronetEngine;
            if (cronetEngine != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void start() {
        QFS qfs = this.mTTNetMpaService;
        if (qfs != null) {
            qfs.LIZLLL();
        }
    }

    public void stop() {
        QFS qfs = this.mTTNetMpaService;
        if (qfs != null) {
            qfs.LJ();
        }
    }

    private boolean createMpaService() {
        if (!loadCronetKernel()) {
            return false;
        }
        if (this.mTTNetMpaService == null) {
            this.mTTNetMpaService = this.mCronetEngine.LIZ();
            return true;
        }
        return true;
    }

    public void init(InterfaceC66682QFa interfaceC66682QFa) {
        if (!createMpaService()) {
            interfaceC66682QFa.LIZ();
        } else {
            this.mTTNetMpaService.LIZIZ(this.mCronetInitCallback);
        }
    }

    public void command(String str, String str2) {
        QFS qfs = this.mTTNetMpaService;
        if (qfs != null) {
            qfs.LIZ(str, str2);
        }
    }

    public void setAccAddress(List<String> list, InterfaceC66682QFa interfaceC66682QFa) {
        if (this.mTTNetMpaService != null) {
            synchronized (CronetMpaServiceImpl.class) {
            }
            this.mTTNetMpaService.LIZJ(list, this.mCronetAccAddressCallback);
        } else if (interfaceC66682QFa != null) {
            interfaceC66682QFa.LIZ();
        }
    }
}
