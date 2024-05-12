package X;

import Y.ACListenerS21S0100000_1;
import Y.IDCListenerS290S0100000_42;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aaV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC94035aaV implements View.OnClickListener {
    public final /* synthetic */ DspPlatform LJLIL;
    public final /* synthetic */ MusicAuthPlatformsSettingPage LJLILLLLZI;
    public final /* synthetic */ TT2DSPPlatformInfo LJLJI;

    public ViewOnClickListenerC94035aaV(DspPlatform dspPlatform, MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage, TT2DSPPlatformInfo tT2DSPPlatformInfo) {
        this.LJLIL = dspPlatform;
        this.LJLILLLLZI = musicAuthPlatformsSettingPage;
        this.LJLJI = tT2DSPPlatformInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        C94302aeo c94302aeo = C94302aeo.LJLIL;
        DspPlatform LJIIIIZZ = C94302aeo.LJIIIIZZ(null);
        DspPlatform dspPlatform = this.LJLIL;
        if (LJIIIIZZ == dspPlatform) {
            MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage = this.LJLILLLLZI;
            FragmentManager fragmentManager = musicAuthPlatformsSettingPage.getFragmentManager();
            if (fragmentManager == null) {
                return;
            }
            C245319jz c245319jz = new C245319jz();
            String string = musicAuthPlatformsSettingPage.getString(R.string.baw, dspPlatform.getTitle());
            o.LJIIIIZZ(string, "getString(\n             ….title,\n                )");
            c245319jz.LIZ.LJLLILLLL = string;
            C252669vq c252669vq = new C252669vq();
            String string2 = musicAuthPlatformsSettingPage.getString(R.string.bau);
            o.LJIIIIZZ(string2, "getString(R.string.addMu…e_unlinkActionSheet_cta1)");
            c252669vq.LIZ = string2;
            c252669vq.LJ = new ACListenerS21S0100000_1(new IDqS175S0200000_42(musicAuthPlatformsSettingPage, dspPlatform, 22), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            c245319jz.LIZIZ(c252669vq);
            c245319jz.LIZ.LJLIL = new IDCListenerS290S0100000_42(dspPlatform, 2);
            c245319jz.LIZJ().show(fragmentManager, "settings_music_auth_unlink_action_sheet");
            return;
        }
        if (C93922aYg.LIZLLL(dspPlatform).length() == 0) {
            MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage2 = this.LJLILLLLZI;
            TT2DSPPlatformInfo tT2DSPPlatformInfo = this.LJLJI;
            musicAuthPlatformsSettingPage2.getClass();
            int i = C93579aT9.LIZ[DspPlatform.Companion.from(Integer.valueOf(tT2DSPPlatformInfo.getDspPlatform())).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    c94302aeo.LJIJJLI(musicAuthPlatformsSettingPage2.mo49getActivity(), musicAuthPlatformsSettingPage2, null, null, "music_setting", "", "", "", "null", C9A8.ENTER_FROM_SETTINGS, false);
                    return;
                }
                c94302aeo.LJIJI(musicAuthPlatformsSettingPage2.mo49getActivity(), musicAuthPlatformsSettingPage2, null, null, "music_setting", "", "", "", "null", C9A8.ENTER_FROM_SETTINGS, false);
                return;
            }
            C94302aeo.LJIJJ(musicAuthPlatformsSettingPage2.mo49getActivity(), musicAuthPlatformsSettingPage2, tT2DSPPlatformInfo.getDeveloperToken(), null, null, "music_setting", "", "", "", "null", C9A8.ENTER_FROM_SETTINGS, false);
            return;
        }
        if (LJIIIIZZ != DspPlatform.UNKNOWN) {
            this.LJLILLLLZI.Jl(this.LJLIL, LJIIIIZZ, false);
        } else {
            this.LJLILLLLZI.Dl(this.LJLIL, LJIIIIZZ, false);
        }
    }
}
