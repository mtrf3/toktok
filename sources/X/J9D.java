package X;

/* loaded from: classes9.dex */
public final class J9D extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ AbstractC36569EWv LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9D(int i, AbstractC36569EWv abstractC36569EWv, String str, int i2, float f, String str2) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = abstractC36569EWv;
        this.LJLJI = str;
        this.LJLJJI = i2;
        this.LJLJJL = f;
        this.LJLJJLL = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLIL == E0V.DOWNLOAD_INFO_READ_TIMEOUT.ordinal()) {
            this.LJLILLLLZI.LIZ(this.LJLJI, this.LJLIL, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
            if (H6X.LIZIZ != null) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("play_type", ILO.AUDIO.name());
                c188727au.LIZLLL(J9C.LIZJ, "is_audio_streaming");
                String str = J9C.LIZIZ;
                if (str == null) {
                    str = "";
                }
                c188727au.LJIIIZ("meta_song_id", str);
                c188727au.LJIIIZ("enter_from", "video_edit_page");
                FMX.LJIIL("video_block", c188727au.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }
}
