package X;

import android.view.View;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import kotlin.jvm.internal.o;

/* renamed from: X.ajH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94579ajH extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ MusicAuthPlatformsSettingPage LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ DspPlatform LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94579ajH(MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage, DspPlatform dspPlatform, DspPlatform dspPlatform2, boolean z) {
        super(1);
        this.LJLIL = musicAuthPlatformsSettingPage;
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = dspPlatform2;
        this.LJLJJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        o.LJIIIZ(it, "it");
        this.LJLIL.Dl(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
