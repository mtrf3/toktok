package X;

/* loaded from: classes8.dex */
public enum HBR {
    MAIN_BUSINESS("main_business_data_in_tools_line"),
    SOCIAL("social_data_in_tools_line"),
    COMMERCE("commerce_data_in_tools_line"),
    UG("ug_data_in_tools_line"),
    TECH("tech_data_in_tools_line"),
    GLOBAL("global_data_in_tools_line");

    public final String intentKey;

    public static HBR valueOf(String str) {
        return (HBR) V0N.LJJJ(HBR.class, str);
    }

    HBR(String str) {
        this.intentKey = str;
    }
}
