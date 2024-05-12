package X;

import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O6F extends AbstractC60800Ntc {
    public final /* synthetic */ MusicCollectionFragment LJLIL;

    public O6F(MusicCollectionFragment musicCollectionFragment) {
        this.LJLIL = musicCollectionFragment;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        InterfaceC60761Nsz kitView;
        o.LJIIIZ(view, "view");
        MusicCollectionFragment musicCollectionFragment = this.LJLIL;
        musicCollectionFragment.getClass();
        C38236EzY c38236EzY = new C38236EzY();
        c38236EzY.LIZ = "getCookieStringForMusic";
        c38236EzY.LIZLLL = new F9M();
        C38236EzY c38236EzY2 = new C38236EzY();
        c38236EzY2.LIZ = "getMusicCollectionScene";
        c38236EzY2.LIZLLL = new KMQ();
        C38236EzY c38236EzY3 = new C38236EzY();
        c38236EzY3.LIZ = "reportFirstScreen";
        c38236EzY3.LIZLLL = new O6K(view);
        C38236EzY c38236EzY4 = new C38236EzY();
        c38236EzY4.LIZ = "play";
        c38236EzY4.LIZLLL = new O6I(musicCollectionFragment);
        C38236EzY c38236EzY5 = new C38236EzY();
        c38236EzY5.LIZ = "pause";
        c38236EzY5.LIZLLL = new O6H(musicCollectionFragment);
        C37942Euo c37942Euo = (C37942Euo) view.getHybridContext().LIZIZ(C37942Euo.class);
        if (c37942Euo != null) {
            c37942Euo.LJIILJJIL(c38236EzY);
            c37942Euo.LJIILJJIL(c38236EzY2);
            c37942Euo.LJIILJJIL(c38236EzY3);
            c37942Euo.LJIILJJIL(c38236EzY4);
            c37942Euo.LJIILJJIL(c38236EzY5);
        }
        FRW.LIZ("discovery_favorite_sounds_lynx_load");
        FRW.LIZIZ(this.LJLIL.LJLJI, "discovery_favorite_sounds_lynx_load_retry");
        MusicCollectionFragment musicCollectionFragment2 = this.LJLIL;
        musicCollectionFragment2.getClass();
        view.updateData(C113554cx.LJJL(new OSZ("isRTL", Boolean.valueOf(C90193gN.LIZ())), new OSZ("isInProfileTab", Boolean.valueOf(musicCollectionFragment2.getContext() instanceof InterfaceC55058LjC))));
        MusicCollectionFragment musicCollectionFragment3 = this.LJLIL;
        if (musicCollectionFragment3.LJLJJI) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = musicCollectionFragment3.LJLJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.LJIIJ("onTabSelected", C61878OQg.INSTANCE);
                return;
            }
            return;
        }
        view.LJIIJ("onTabSelected", C61878OQg.INSTANCE);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        MusicCollectionFragment musicCollectionFragment = this.LJLIL;
        long j = musicCollectionFragment.LJLJI;
        if (j < 3) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = musicCollectionFragment.LJLJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                musicCollectionFragment.LJLJI = j + 1;
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.refresh();
                return;
            }
            return;
        }
        if (j != 3) {
            return;
        }
        FRW.LIZIZ(-1L, "discovery_favorite_sounds_lynx_load");
    }
}
