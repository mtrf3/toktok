package com.ss.android.ugc.aweme.detail.panel;

import X.C16880lQ;
import X.C81156VtA;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TTSVoiceButtonPanel extends ShootFeedPanel {
    public final Bundle LLJLIL;
    public final String LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int LLIILII() {
        return R.string.zv;
    }

    public TTSVoiceButtonPanel(Bundle bundle) {
        String str;
        this.LLJLIL = bundle;
        if (bundle != null) {
            str = bundle.getString("feed_data_tts_voice_name");
        } else {
            str = null;
        }
        this.LLJLILLLLZIIL = str;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void LLIIL(View view) {
        Music music;
        String string;
        Music music2;
        IVoiceReuseService LIZLLL = TTSVoiceRecordService.LIZLLL();
        ComponentCallbacks2 componentCallbacks2 = this.activity;
        o.LJII(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        LifecycleOwner lifecycleOwner = (LifecycleOwner) componentCallbacks2;
        Activity activity = this.activity;
        o.LJIIIIZZ(activity, "activity");
        Aweme LJJLJ = LJJLJ();
        MusicModel musicModel = null;
        if (LJJLJ != null) {
            music = LJJLJ.getMusic();
        } else {
            music = null;
        }
        Aweme LJJLJ2 = LJJLJ();
        if (LJJLJ2 != null && (music2 = LJJLJ2.getMusic()) != null) {
            musicModel = music2.convertToMusicModel();
        }
        String str = this.LLJLILLLLZIIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Bundle bundle = this.LLJLIL;
        if (bundle != null && (string = bundle.getString("voice_id", "")) != null) {
            str2 = string;
        }
        LIZLLL.LIZIZ(lifecycleOwner, activity, music, musicModel, str, str2, "TTSVoiceButtonPanel");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View LLIILZL(RelativeLayout relativeLayout) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.alx, relativeLayout, false);
        C81156VtA c81156VtA = (C81156VtA) LLLLIILL.findViewById(R.id.d81);
        String str = this.LLJLILLLLZIIL;
        if (str != null) {
            LLIL(c81156VtA, str);
        }
        return LLLLIILL;
    }
}
