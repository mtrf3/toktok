package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NnE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60404NnE extends AbstractC60402NnC {
    public AbstractC60629Nqr<C60401NnB> customExtension;

    public final AbstractC60629Nqr<C60401NnB> getCustomExtension() {
        AbstractC60629Nqr<C60401NnB> abstractC60629Nqr = this.customExtension;
        if (abstractC60629Nqr != null) {
            return abstractC60629Nqr;
        }
        o.LJIJI("customExtension");
        throw null;
    }

    @Override // X.AbstractC60536NpM
    public AbstractC60629Nqr<C60401NnB> getExtension() {
        AbstractC60629Nqr<C60401NnB> abstractC60629Nqr = this.customExtension;
        if (abstractC60629Nqr != null) {
            return abstractC60629Nqr;
        }
        o.LJIJI("customExtension");
        throw null;
    }

    public final void setCustomExtension(AbstractC60629Nqr<C60401NnB> abstractC60629Nqr) {
        o.LJIIJ(abstractC60629Nqr, "<set-?>");
        this.customExtension = abstractC60629Nqr;
    }
}
