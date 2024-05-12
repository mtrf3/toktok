package com.ss.android.vesdk;

/* loaded from: classes16.dex */
public class VESensorInfoHolder {
    public static volatile VESensorInfoHolder instance;
    public boolean isSensorMode;
    public double sensorTimestamp;
    public static float[] DEFAULT_QUATERNION = {0.0f, 0.0f, 0.0f, 0.0f};
    public static float[] DEFAULT_FOV = {-2.0f, -2.0f};
    public float[] quaternion = DEFAULT_QUATERNION;
    public float[] fov = DEFAULT_FOV;

    public static VESensorInfoHolder getInstance() {
        if (instance == null) {
            synchronized (VESensorInfoHolder.class) {
                if (instance == null) {
                    instance = new VESensorInfoHolder();
                }
            }
        }
        return instance;
    }

    public float[] getFov() {
        return this.fov;
    }

    public float[] getQuaternion() {
        return this.quaternion;
    }

    public double getRotationSensorTimestamp() {
        return this.sensorTimestamp;
    }

    public boolean isSensorMode() {
        return this.isSensorMode;
    }

    private void setQuaternion(float[] fArr) {
        if (fArr == null || fArr.length != 4) {
            this.quaternion = DEFAULT_QUATERNION;
        } else {
            this.quaternion = fArr;
        }
    }

    private void setRotationSensorTimestamp(double d) {
        this.sensorTimestamp = d;
    }

    public void setFov(float[] fArr) {
        this.fov = fArr;
    }

    public void setSensorMode(boolean z) {
        this.isSensorMode = z;
    }

    public void setRotationSensorInfo(float[] fArr, double d) {
        setQuaternion(fArr);
        setRotationSensorTimestamp(d);
    }
}
