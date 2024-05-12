package com.ss.android.ugc.aweme.shortvideo.stitch;

import X.C1537461q;
import X.I4M;
import X.InterfaceC61312at;
import android.content.SharedPreferences;
import com.bytedance.jedi.arch.BaseJediViewModel;

/* loaded from: classes8.dex */
public final class StitchIntroduceViewModel extends BaseJediViewModel<StitchState> {
    public final void Mv0() {
        SharedPreferences sharedPreferences = C1537461q.LIZ;
        if (!sharedPreferences.getBoolean("stitch_introduce_shown", false) || sharedPreferences.getBoolean("stitch_trimming_view_guide", false)) {
            return;
        }
        sharedPreferences.edit().putBoolean("stitch_trimming_view_guide", true).apply();
        setState(I4M.LJLIL);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new StitchState(null, null, null, null, null, 31, null);
    }
}
