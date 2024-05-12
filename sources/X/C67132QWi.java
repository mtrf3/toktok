package X;

/* renamed from: X.QWi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67132QWi implements QXK {
    @Override // X.QXK
    public final boolean LIZ() {
        try {
        } catch (Exception e) {
            C34B.LJ("OutAppPushWsReconnectOld", e);
        }
        if (QWY.LJIIIZ.LIZ().LJ) {
            C67124QWa.LIZ("DM");
            return true;
        }
        C34B.LIZJ("OutAppPushWsReconnectOld", "ws not init, call it later");
        return false;
    }

    @Override // X.QXK
    public final EnumC66933QOr LIZIZ() {
        EnumC66933QOr enumC66933QOr = QWY.LJIIIZ.LIZ().LIZLLL;
        if (enumC66933QOr == null) {
            return EnumC66933QOr.CONNECTION_UNKNOWN;
        }
        return enumC66933QOr;
    }
}
