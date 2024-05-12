package X;

import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.zhiliaoapp.musically.R;

/* renamed from: X.ajF, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94577ajF extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ MusicAuthPlatformsSettingPage LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ DspPlatform LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94577ajF(MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage, DspPlatform dspPlatform, DspPlatform dspPlatform2, boolean z) {
        super(0);
        this.LJLIL = musicAuthPlatformsSettingPage;
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = dspPlatform2;
        this.LJLJJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.Il(this.LJLILLLLZI);
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIZ(this.LJLIL.getString(R.string.baq, this.LJLILLLLZI.getTitle()));
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LJIIJ();
        DspPlatform dspPlatform = this.LJLJI;
        if (dspPlatform != DspPlatform.UNKNOWN && dspPlatform != this.LJLILLLLZI) {
            C94302aeo.LJJIII(C94302aeo.LJLIL, "1", "", dspPlatform, null, Boolean.TRUE, this.LJLJJI, "unlink", "music_setting", "null");
        }
        C94302aeo c94302aeo = C94302aeo.LJLIL;
        DspPlatform dspPlatform2 = this.LJLILLLLZI;
        Long l = C94302aeo.LJLL;
        C94302aeo.LJLL = null;
        C94302aeo.LJJIII(c94302aeo, "1", "", dspPlatform2, l, Boolean.TRUE, this.LJLJJI, "link", "music_setting", "null");
        return C76800UCe.LIZ;
    }
}
