package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PR8 {
    public final String LIZ;
    public final String LIZIZ;
    public float LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public int LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public int LJIIIZ;
    public final int LJIIJ;
    public double LJIIJJI;
    public double LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public double LJIJI;
    public long LJIJJ;
    public long LJIJJLI;

    public final String toString() {
        return "PowerCollectInfo(scene='" + this.LIZ + "', activityName='" + this.LIZIZ + "', current=" + this.LIZJ + ", reportIndex=" + this.LIZLLL + ", isLowPowerMode=" + this.LJ + ", batteryState=" + this.LJFF + ", startBatteryLevel=" + this.LJI + ", endBatteryLevel=" + this.LJII + ", batteryTemperature=" + this.LJIIIIZZ + ", thermalStatus=" + this.LJIIIZ + ", extraThermalStatus=" + this.LJIIJ + ", cpuUsage=" + this.LJIIJJI + ", cpuSpeed=" + this.LJIIL + ", vss=" + this.LJIILIIL + ", nativeHeapSize=" + this.LJIILJJIL + ", nativeHeapAllocatedSize=" + this.LJIILL + ", nativeHeapFreeSize=" + this.LJIILLIIL + ", javaUsedMemory=" + this.LJIIZILJ + ", freeJavaMemory=" + this.LJIJ + ", javaUsedRate=" + this.LJIJI + ", pss=" + this.LJIJJ + ", freePhysicalMemory=" + this.LJIJJLI + ')';
    }

    public PR8(String scene, String activityName) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(activityName, "activityName");
        this.LIZ = scene;
        this.LIZIZ = activityName;
        this.LJIIJ = -1;
    }
}
