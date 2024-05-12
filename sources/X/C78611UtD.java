package X;

/* renamed from: X.UtD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78611UtD extends XKW {
    public static final C78611UtD LJLIL = new C78611UtD();

    @Override // X.XKW
    public final boolean isDispatchNeeded(MBA mba) {
        return false;
    }

    @Override // X.XKW
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // X.XKW
    public final void dispatch(MBA mba, Runnable runnable) {
        C78610UtC c78610UtC = (C78610UtC) mba.get(C78610UtC.LJLILLLLZI);
        if (c78610UtC != null) {
            c78610UtC.LJLIL = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
