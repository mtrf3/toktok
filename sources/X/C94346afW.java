package X;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.InputDspPlaylistSheetFragment;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS423S0100000_42;

/* renamed from: X.afW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94346afW extends C98T {
    public final /* synthetic */ InputDspPlaylistSheetFragment LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94346afW(InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment) {
        super(300L);
        this.LJLJJL = inputDspPlaylistSheetFragment;
    }

    @Override // X.C98T
    public final void LIZ(View view) {
        InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment;
        TT2DSPSongInfo tT2DSPSongInfo;
        if (view == null || ((SY4) this.LJLJJL._$_findCachedViewById(R.id.kpl)).LLI || (tT2DSPSongInfo = (inputDspPlaylistSheetFragment = this.LJLJJL).LJLJLJ) == null) {
            return;
        }
        ((SY4) inputDspPlaylistSheetFragment._$_findCachedViewById(R.id.kpl)).setLoading(true);
        C94302aeo.LIZJ(new DspAuthParam(DspPlatform.UNKNOWN, inputDspPlaylistSheetFragment, tT2DSPSongInfo, inputDspPlaylistSheetFragment.LJLIL, inputDspPlaylistSheetFragment.LJLILLLLZI, inputDspPlaylistSheetFragment.LJLJI, inputDspPlaylistSheetFragment.LJLJJI, inputDspPlaylistSheetFragment.LJLJJL, inputDspPlaylistSheetFragment.LJLJJLL, inputDspPlaylistSheetFragment.LJLJL), inputDspPlaylistSheetFragment.LJLJLLL, inputDspPlaylistSheetFragment.mo49getActivity(), false, SystemClock.elapsedRealtime(), new IDqS423S0100000_42(inputDspPlaylistSheetFragment, 149), new IDqS423S0100000_42(inputDspPlaylistSheetFragment, 150));
    }
}
