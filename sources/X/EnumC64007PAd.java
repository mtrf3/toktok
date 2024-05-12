package X;

/* renamed from: X.PAd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64007PAd {
    OTHER_LOG_TYPE("other"),
    SERVICE_MONITOR("service_monitor");

    public final String logType;

    public static EnumC64007PAd valueOf(String str) {
        return (EnumC64007PAd) V0N.LJJJ(EnumC64007PAd.class, str);
    }

    EnumC64007PAd(String str) {
        this.logType = str;
    }
}
