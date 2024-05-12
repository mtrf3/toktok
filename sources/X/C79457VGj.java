package X;

/* renamed from: X.VGj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79457VGj implements InterfaceC38339F2x {
    public final /* synthetic */ C38338F2w LIZ;
    public final /* synthetic */ EnumC79456VGi LIZIZ;

    @Override // X.InterfaceC38339F2x
    public final void onDestroy() {
        EnumC79456VGi enumC79456VGi = this.LIZIZ;
        enumC79456VGi.idToPresenter.remove(enumC79456VGi.presenterToId.remove(this.LIZ));
    }

    public C79457VGj(EnumC79456VGi enumC79456VGi, C38338F2w c38338F2w) {
        this.LIZIZ = enumC79456VGi;
        this.LIZ = c38338F2w;
    }
}
