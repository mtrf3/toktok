package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.HashMap;

/* renamed from: X.aZJ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93961aZJ implements View.OnClickListener {
    public final /* synthetic */ DspAuthParam LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ TT2DSPSongInfo LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public ViewOnClickListenerC93961aZJ(DspAuthParam dspAuthParam, Fragment fragment, TT2DSPSongInfo tT2DSPSongInfo, boolean z) {
        this.LJLIL = dspAuthParam;
        this.LJLILLLLZI = fragment;
        this.LJLJI = tT2DSPSongInfo;
        this.LJLJJI = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", this.LJLIL.awemeId);
        hashMap.put("enter_from", this.LJLIL.enterFrom);
        hashMap.put("music_id", this.LJLIL.musicId);
        hashMap.put("music_volume", this.LJLIL.musicVolume);
        hashMap.put("button_name", "manage");
        hashMap.put("button_type", this.LJLIL.buttonType);
        FMX.LJIIL("click_tttodsp_sheet", hashMap);
        FragmentManager fragmentManager = this.LJLILLLLZI.getFragmentManager();
        if (fragmentManager != null) {
            DspAuthParam dspAuthParam = this.LJLIL;
            SWI.LIZIZ.LJIJ(null, dspAuthParam.enterFrom, dspAuthParam.awemeId, dspAuthParam.musicId, dspAuthParam.musicVolume, dspAuthParam.buttonType, fragmentManager, this.LJLILLLLZI, null, this.LJLJI, true, this.LJLJJI);
        }
    }
}
