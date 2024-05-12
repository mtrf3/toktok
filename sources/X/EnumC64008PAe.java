package X;

/* renamed from: X.PAe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64008PAe {
    OTHER_LOG_TYPE("other"),
    SERVICE_MONITOR("service_monitor");

    public final String logType;

    public static EnumC64008PAe valueOf(String str) {
        return (EnumC64008PAe) V0N.LJJJ(EnumC64008PAe.class, str);
    }

    EnumC64008PAe(String str) {
        this.logType = str;
    }
}
