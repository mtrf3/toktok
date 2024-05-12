package X;

/* loaded from: classes9.dex */
public final class K3S {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(Integer num, String str, String str2) {
        String num2;
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("enter_from", "homepage_hot");
        String str3 = "";
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("prop_list", str);
        if (num != null && (num2 = num.toString()) != null) {
            str3 = num2;
        }
        oszArr[2] = new OSZ("card_position", str3);
        oszArr[3] = new OSZ("card_type", "prop_card");
        oszArr[4] = new OSZ("UI_type", str2);
        return C113554cx.LJJLIIIIJ(oszArr);
    }
}
