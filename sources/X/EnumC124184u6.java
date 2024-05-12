package X;

/* renamed from: X.4u6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC124184u6 {
    TypeFps(1),
    TypeFpsDrop(2),
    TypeCpu(3),
    TypeMemory(4),
    TypePower(5),
    TypePlayerBlock(6),
    TypeEvilMethod(7),
    TypeCrash(8),
    TypeInputBlock(9),
    TypeEvilMethodV2(10),
    TypeBigJank(11),
    TypeCpuException(12),
    TypeSlowLaunch(13),
    TypeHighFever(14),
    TypeBackgroundTask(15),
    TypeBlockGc(16),
    TypeBinder(17),
    TypeLock(18),
    TypeIo(19),
    TypeRunnable(20),
    TypeLaunchTask(21);

    public final int LJLIL;

    public static EnumC124184u6 valueOf(String str) {
        return (EnumC124184u6) V0N.LJJJ(EnumC124184u6.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC124184u6(int i) {
        this.LJLIL = i;
    }
}
