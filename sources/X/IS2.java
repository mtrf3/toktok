package X;

/* loaded from: classes9.dex */
public final class IS2 {
    public static final IS2 LIZJ = new IS2();
    public boolean LIZ;
    public final IS3 LIZIZ = new IS3();

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AssistConfig{enableProcessCpuUsageStat=");
        C76965UIn.LIZJ(LIZ, this.LIZ, ", enableThreadCpuUsageStat=", false, ", enableSystemCpuUsageStat=");
        C76965UIn.LIZJ(LIZ, false, ", enableProcessTimeFreqPercent=", false, ", enableSystemCpuTimeFreqPercent=");
        C1FL.LJFF(LIZ, false, ", cpuSampleBatteryTemp=", 37, ", cpuSampleBatteryLevel=");
        LIZ.append(30);
        LIZ.append(", cpuAbnormalConfig=");
        LIZ.append(this.LIZIZ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
