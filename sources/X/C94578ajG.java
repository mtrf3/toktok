package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.zhiliaoapp.musically.R;

/* renamed from: X.ajG, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94578ajG extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public final /* synthetic */ MusicAuthPlatformsSettingPage LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94578ajG(MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage, DspPlatform dspPlatform, boolean z) {
        super(1);
        this.LJLIL = musicAuthPlatformsSettingPage;
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        String str;
        Integer num2 = num;
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIZ(this.LJLIL.getString(R.string.dtj));
        c26045AKb.LJIIJ();
        C94302aeo c94302aeo = C94302aeo.LJLIL;
        if (num2 == null || (str = num2.toString()) == null) {
            str = "";
        }
        DspPlatform dspPlatform = this.LJLILLLLZI;
        Long l = C94302aeo.LJLL;
        C94302aeo.LJLL = null;
        C94302aeo.LJJIII(c94302aeo, CardStruct.IStatusCode.DEFAULT, str, dspPlatform, l, Boolean.TRUE, this.LJLJI, "link", "music_setting", "null");
        return C76800UCe.LIZ;
    }
}
