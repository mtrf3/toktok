package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.search.pages.voice.core.ui.ChooseMusicVoiceSearchContainerFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.adb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94227adb implements KJB {
    public static final C94227adb LIZ = new C94227adb();

    @Override // X.KJB
    public final void LIZ(ActivityC45651qj activityC45651qj) {
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        if (activityC45651qj != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null && (LJJJIL = supportFragmentManager.LJJJIL("choose_music_fragment_tag")) != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJIFFI(LJJJIL, Lifecycle.State.STARTED);
            c1b3.LJI();
        }
    }

    @Override // X.KJB
    public final void LIZIZ(ActivityC45651qj activityC45651qj) {
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        if (activityC45651qj != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null && (LJJJIL = supportFragmentManager.LJJJIL("choose_music_fragment_tag")) != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJIFFI(LJJJIL, Lifecycle.State.RESUMED);
            c1b3.LJI();
        }
    }

    @Override // X.KJB
    public final void LIZJ(ActivityC45651qj activityC45651qj, Fragment fragment) {
        FragmentManager supportFragmentManager;
        o.LJIIIZ(fragment, "fragment");
        if (activityC45651qj == null || (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) == null) {
            return;
        }
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJJI(R.anim.eg, R.anim.hr, 0, 0);
        c1b3.LJJI(fragment);
        Fragment LJJJIL = supportFragmentManager.LJJJIL("choose_music_fragment_tag");
        if (LJJJIL != null) {
            c1b3.LJIIL(LJJJIL);
        }
        c1b3.LJI();
    }

    @Override // X.KJB
    public final void LIZLLL(ActivityC45651qj activityC45651qj, HashMap<String, String> mobParams, String sourcePage, int i, K55 callback) {
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        o.LJIIIZ(mobParams, "mobParams");
        o.LJIIIZ(sourcePage, "sourcePage");
        o.LJIIIZ(callback, "callback");
        if (activityC45651qj == null || (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) == null || supportFragmentManager.LJJJIL("voice_search_contaienr") != null || (LJJJIL = supportFragmentManager.LJJJIL("choose_music_fragment_tag")) == null) {
            return;
        }
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJJI(R.anim.hq, R.anim.eg, 0, 0);
        c1b3.LJIIIZ(LJJJIL);
        ChooseMusicVoiceSearchContainerFragment chooseMusicVoiceSearchContainerFragment = new ChooseMusicVoiceSearchContainerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("mob", mobParams);
        bundle.putString("key_from", sourcePage);
        bundle.putInt("enter_page", i);
        chooseMusicVoiceSearchContainerFragment.setArguments(bundle);
        chooseMusicVoiceSearchContainerFragment.LJLJJLL = callback;
        c1b3.LJIIIIZZ(R.id.ndw, 1, chooseMusicVoiceSearchContainerFragment, "voice_search_contaienr");
        c1b3.LJI();
    }
}
