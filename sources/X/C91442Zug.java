package X;

/* renamed from: X.Zug, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91442Zug implements InterfaceC87433YTd {
    public final /* synthetic */ C91443Zuh LIZ;
    public final /* synthetic */ com.bytedance.hox.Hox LIZIZ;

    @Override // X.InterfaceC87433YTd
    public final String LIZIZ() {
        return "music";
    }

    @Override // X.InterfaceC87433YTd
    public final void LIZ() {
        String str;
        C91301ZsP eventData;
        if (this.LIZ.LIZIZ.LJIJI().isPauseState() && this.LIZIZ.wv0("MUSIC_DSP_XTAB")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "homepage_music");
            InterfaceC91296ZsK LIZ = this.LIZ.LIZIZ.LIZ();
            if (LIZ != null && (eventData = LIZ.getEventData()) != null) {
                str = eventData.LIZ;
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            FMX.LJIIL("earphone_play_continue", c188727au.LIZ);
            YTW.LIZLLL("music");
            this.LIZ.LIZIZ.LJJ(new C91299ZsN("RESUME_FROM_EARPHONE_RECONNECT"));
            YTW.LIZJ(Boolean.valueOf(this.LIZ.LIZIZ.LJIJI().isPlayingState()), "music");
        }
    }

    public C91442Zug(C91443Zuh c91443Zuh, com.bytedance.hox.Hox hox) {
        this.LIZ = c91443Zuh;
        this.LIZIZ = hox;
    }
}
