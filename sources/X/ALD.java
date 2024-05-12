package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ALD extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final ALD LJLIL = new ALD();

    public ALD() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String cachedKey, String originKey) {
        o.LJIIJ(cachedKey, "cachedKey");
        o.LJIIJ(originKey, "originKey");
        return Boolean.valueOf(o.LJ(cachedKey, originKey));
    }
}
