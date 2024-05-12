package com.ss.android.ugc.aweme.tools.draft.music;

import X.C123244sa;
import X.C169066kI;
import X.C43882HKc;
import X.C6BK;
import X.InterfaceC169156kR;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class DraftSoundEffectProcessor implements GenericLifecycleObserver {
    public final AwemeDraft LJLIL;
    public InterfaceC169156kR LJLILLLLZI;
    public final List<SoundEffect> LJLJI = new ArrayList();
    public final List<C123244sa> LJLJJI = new ArrayList();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LJLILLLLZI = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public DraftSoundEffectProcessor(AwemeDraft awemeDraft, C169066kI c169066kI) {
        this.LJLIL = awemeDraft;
        this.LJLILLLLZI = c169066kI;
    }

    public static void LIZ(int i, String str, List list) {
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("is_sound_effect", Boolean.TRUE);
        c6bk.LIZ.put("errorDesc", str);
        c6bk.LIZ.put("sound_effect", list.toString());
        C43882HKc.LIZLLL(i, "draft_music_permission_check_rate", c6bk.LJ(), true);
    }
}
