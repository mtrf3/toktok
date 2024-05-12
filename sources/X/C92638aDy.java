package X;

import com.bytedance.pipo.checkout.api.network.model.response.District;

/* renamed from: X.aDy, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92638aDy extends AbstractC65781Prl implements InterfaceC88472Yns<District, CharSequence> {
    public static final C92638aDy LJLIL = new C92638aDy();

    public C92638aDy() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(District district) {
        String name;
        District district2 = district;
        if (district2 == null || (name = district2.getName()) == null) {
            return "";
        }
        return name;
    }
}
