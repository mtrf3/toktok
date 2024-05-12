package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61342aw extends AbstractC65781Prl implements InterfaceC88472Yns<String, EnumC61762bc> {
    public static final C61342aw LJLIL = new C61342aw();

    public C61342aw() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final EnumC61762bc invoke(String it) {
        o.LJIIIZ(it, "it");
        if (((Boolean) C61682bU.LIZ.getValue()).booleanValue()) {
            return EnumC61762bc.BEFORE_SEARCH_USE_UNIQUE_CACHE;
        }
        return EnumC61762bc.BEFORE_SEARCH_NO_CACHE;
    }
}
