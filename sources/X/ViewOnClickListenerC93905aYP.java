package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.ui.VoiceSearchFragment;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.ui.VoiceSearchLanguageSettingFragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.aYP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93905aYP implements View.OnClickListener {
    public final /* synthetic */ VoiceSearchFragment LJLIL;

    public ViewOnClickListenerC93905aYP(VoiceSearchFragment voiceSearchFragment) {
        this.LJLIL = voiceSearchFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!C6ZT.LIZ(view)) {
            VoiceSearchFragment voiceSearchFragment = this.LJLIL;
            VoiceSearchViewModel Dl = voiceSearchFragment.Dl();
            XKQ xkq = Dl.LJLILLLLZI;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            Dl.LJLIL.LIZIZ(1);
            Dl.setState(C94708alM.LJLIL);
            C29701Eo c29701Eo = voiceSearchFragment.LJLJLJ;
            if (c29701Eo != null) {
                c29701Eo.pauseAnimation();
            }
            C188727au c188727au = new C188727au();
            c188727au.LJII(voiceSearchFragment.xl());
            FMX.LJIIL("voice_language_button_click", c188727au.LIZ);
            voiceSearchFragment.Gl();
            FragmentManager fragmentManager = voiceSearchFragment.getFragmentManager();
            HashMap<String, String> xl = voiceSearchFragment.xl();
            String randomKey = voiceSearchFragment.LJLJI;
            String currentCluster = voiceSearchFragment.vl();
            o.LJIIIZ(randomKey, "randomKey");
            o.LJIIIZ(currentCluster, "currentCluster");
            if (fragmentManager != null) {
                ASL asl = new ASL();
                VoiceSearchLanguageSettingFragment voiceSearchLanguageSettingFragment = new VoiceSearchLanguageSettingFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("mob", xl);
                bundle.putBoolean("from_tux_fragment", true);
                bundle.putString("key_random", randomKey);
                bundle.putString("current_cluster", currentCluster);
                voiceSearchLanguageSettingFragment.setArguments(bundle);
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLILLLL = voiceSearchLanguageSettingFragment;
                tuxSheet.LJZL = false;
                tuxSheet.LJZI = false;
                asl.LJI(0);
                asl.LIZ.show(fragmentManager, "TuxSheetVoiceSearchLanguageSetting");
            }
        }
    }
}
