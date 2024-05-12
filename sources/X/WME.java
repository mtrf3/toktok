package X;

/* loaded from: classes15.dex */
public enum WME {
    NONE(0, "NONE"),
    VIEW_CREATED(1, "VIEW_CREATED"),
    ACTIVITY_CREATED(2, "ACTIVITY_CREATED"),
    STARTED(3, "STARTED"),
    RESUMED(4, "RESUMED");

    public final String name;
    public final int value;

    public String getName() {
        return this.name;
    }

    public static WME valueOf(String str) {
        return (WME) V0N.LJJJ(WME.class, str);
    }

    WME(int i, String str) {
        this.value = i;
        this.name = str;
    }
}
