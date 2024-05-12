package X;

/* renamed from: X.UrG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78490UrG implements InterfaceC78491UrH<Boolean> {
    public final /* synthetic */ Runnable LIZ;

    public C78490UrG(Runnable runnable) {
        this.LIZ = runnable;
    }

    @Override // X.InterfaceC78491UrH
    public final void onSuccess(Boolean bool) {
        Runnable runnable = this.LIZ;
        if (runnable != null) {
            runnable.run();
        }
    }
}
