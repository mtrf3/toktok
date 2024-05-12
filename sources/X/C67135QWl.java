package X;

/* renamed from: X.QWl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67135QWl implements QXK {
    @Override // X.QXK
    public final boolean LIZ() {
        try {
            C67128QWe.LIZIZ.LJII("DM");
            return true;
        } catch (Exception e) {
            C34B.LJ("OutAppPushWsReconnectNew", e);
            return false;
        }
    }

    @Override // X.QXK
    public final EnumC66933QOr LIZIZ() {
        return C67128QWe.LIZIZ.getState();
    }
}
