package com.bytedance.realx.video.camera;

import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.Camera1Enumerator;
import java.util.ArrayList;

/* loaded from: classes33.dex */
public class RXVideoCameraInfo {
    public ArrayList<DeviceInfo> deviceInfos;

    public int getDeviceNumbers() {
        return this.deviceInfos.size();
    }

    public RXVideoCameraInfo() {
        RXLogging.i("RXVideoCameraInfo", "RXVideoCameraInfo Created...");
        this.deviceInfos = new ArrayList<>();
        try {
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(true, false);
            for (String str : camera1Enumerator.getDeviceNames()) {
                DeviceInfo deviceInfo = new DeviceInfo();
                deviceInfo.name = str;
                if (camera1Enumerator.isFrontFacing(str)) {
                    deviceInfo.cameraId = 0;
                } else if (camera1Enumerator.isBackFacing(str)) {
                    deviceInfo.cameraId = 1;
                } else {
                    deviceInfo.cameraId = 2;
                }
                this.deviceInfos.add(deviceInfo);
            }
        } catch (IllegalArgumentException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Create VideoCapture failed : ");
            LIZ.append(e.getMessage());
            RXLogging.i("RXVideoCameraInfo", X1D.LIZIZ(LIZ));
        }
    }

    /* loaded from: classes33.dex */
    public class DeviceInfo {
        public int cameraId;
        public String name;

        public DeviceInfo() {
        }
    }

    public int getCameraId(int i) {
        if (i >= this.deviceInfos.size()) {
            return 3;
        }
        return ((DeviceInfo) ListProtector.get(this.deviceInfos, i)).cameraId;
    }

    public String getDeviceName(int i) {
        if (i >= this.deviceInfos.size()) {
            return null;
        }
        return ((DeviceInfo) ListProtector.get(this.deviceInfos, i)).name;
    }
}
