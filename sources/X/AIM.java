package X;

/* loaded from: classes5.dex */
public final class AIM implements AIE {
    public final /* synthetic */ int LIZ;

    @Override // X.AIE
    public final void onDismiss() {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(this.LIZ + 1, "clicked_content");
        FMX.LJIIL("tiktok_beta_FAQ_page_click", c188727au.LIZ);
    }

    @Override // X.AIE
    public final void onShow() {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(this.LIZ + 1, "clicked_content");
        FMX.LJIIL("tiktok_beta_FAQ_page_click", c188727au.LIZ);
    }

    public AIM(int i) {
        this.LIZ = i;
    }
}
