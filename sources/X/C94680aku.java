package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.aku, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94680aku extends AbstractC65781Prl implements InterfaceC88472Yns<AKT, C76800UCe> {
    public final /* synthetic */ TT2DSPSongInfo LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ DspAuthParam LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94680aku(TT2DSPSongInfo tT2DSPSongInfo, Fragment fragment, DspAuthParam dspAuthParam, String str, boolean z, boolean z2) {
        super(1);
        this.LJLIL = tT2DSPSongInfo;
        this.LJLILLLLZI = fragment;
        this.LJLJI = dspAuthParam;
        this.LJLJJI = str;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AKT akt) {
        AKT showAddToPlaylistsBottomToast = akt;
        o.LJIIIZ(showAddToPlaylistsBottomToast, "$this$showAddToPlaylistsBottomToast");
        C93962aZK.LIZ(showAddToPlaylistsBottomToast, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, true);
        return C76800UCe.LIZ;
    }
}
