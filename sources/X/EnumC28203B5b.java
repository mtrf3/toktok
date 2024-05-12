package X;

/* renamed from: X.B5b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC28203B5b {
    ServerApiCall("server_api_call"),
    MessageReceived("message_received"),
    SdkInterfaceCall("sdk_interface_call"),
    SdkCallback("sdk_callback"),
    BussinessApiCall("bussiness_api_call");

    public final String LJLIL;

    public static EnumC28203B5b valueOf(String str) {
        return (EnumC28203B5b) V0N.LJJJ(EnumC28203B5b.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC28203B5b(String str) {
        this.LJLIL = str;
    }
}
