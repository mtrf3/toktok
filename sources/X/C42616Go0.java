package X;

import defpackage.e1;

/* renamed from: X.Go0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42616Go0 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C42616Go0 LJLIL = new C42616Go0();

    public C42616Go0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (!((Boolean) C42620Go4.LIZ.getValue()).booleanValue()) {
            z = e1.LIZ(31744, "creative_tools_enable_preload_album_xml", true, false);
        } else if (IJJ.LIZ()) {
            z = e1.LIZ(31744, "creative_tools_enable_preload_album_xml", true, false);
        }
        return Boolean.valueOf(z);
    }
}
