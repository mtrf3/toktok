package X;

import android.content.Context;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeCollectListFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.NzV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61165NzV extends AbstractC60800Ntc {
    public final /* synthetic */ ChallengeCollectListFragment LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        FRW.LIZIZ(System.currentTimeMillis() - this.LJLIL.LJLJI, "discovery_collect_hashtag_lynx_load_result");
        FRW.LIZ("discovery_collect_hashtag_load_lynx");
        ChallengeCollectListFragment challengeCollectListFragment = this.LJLIL;
        challengeCollectListFragment.LJLILLLLZI = view;
        challengeCollectListFragment.getClass();
        FRW.LIZIZ(this.LJLIL.LJLJJI, "discovery_collect_hashtag_lynx_load_result_retry");
        view.updateData(C51029K0z.LJJIIZI(new OSZ("hideIcon", Boolean.valueOf(this.LJLILLLLZI instanceof InterfaceC55058LjC))));
    }

    public C61165NzV(ChallengeCollectListFragment challengeCollectListFragment, Context context) {
        this.LJLIL = challengeCollectListFragment;
        this.LJLILLLLZI = context;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJ(view, url);
        FRW.LIZIZ(-1L, "discovery_collect_hashtag_lynx_load_result");
        ChallengeCollectListFragment challengeCollectListFragment = this.LJLIL;
        int i = challengeCollectListFragment.LJLJJI;
        if (i < 3) {
            challengeCollectListFragment.LJLJJI = i + 1;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = challengeCollectListFragment.LJLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.refresh();
                return;
            }
            return;
        }
        FRW.LIZIZ(-1L, "discovery_collect_hashtag_lynx_load_result_retry");
    }
}
