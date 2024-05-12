package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.R9y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69098R9y extends F9E implements InterfaceC54035LIp {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mobile_num", this.LJLIL);
        linkedHashMap.put("sms_country_code", this.LJLILLLLZI);
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C69098R9y(String mobileNum, String smsCountryCode) {
        o.LJIIIZ(mobileNum, "mobileNum");
        o.LJIIIZ(smsCountryCode, "smsCountryCode");
        this.LJLIL = mobileNum;
        this.LJLILLLLZI = smsCountryCode;
    }
}
