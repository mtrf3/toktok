package com.ss.android.ugc.aweme.commercialize.media.impl.utils;

import X.C36922EeM;
import X.C39579Fg7;
import X.C44416Hbw;
import X.C48203Ivv;
import X.C58753N4b;
import X.C58754N4c;
import X.C58755N4d;
import X.C59021NEj;
import X.C5S1;
import X.C60148Nj6;
import X.C60152NjA;
import X.C78496UrM;
import X.InterfaceC60149Nj7;
import X.V8H;
import X.X1D;
import X.XLM;
import X.XU2;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ScopedMusicPlayer implements LifecycleEventObserver, InterfaceC60149Nj7 {
    public final LifecycleOwner LJLIL;
    public final boolean LJLILLLLZI;
    public final XLM LJLJI;
    public final XU2 LJLJJI;
    public final C60148Nj6 LJLJJL;
    public final AtomicBoolean LJLJJLL;
    public boolean LJLJL;

    public final void pause() {
        this.LJLJI.setValue(C58754N4c.LIZ);
        this.LJLJJI.pause();
    }

    public final void LIZIZ(MusicModel musicModel) {
        if (!this.LJLJJLL.getAndSet(true)) {
            this.LJLIL.getLifecycle().addObserver(this);
            this.LJLJJI.LIZJ(new C59021NEj(this));
        }
        String localPath = musicModel.getLocalPath();
        if (localPath != null && localPath.length() != 0) {
            String LIZJ = MusicService.LJJLIIIJJI().LIZJ(musicModel);
            if (!TextUtils.isEmpty(LIZJ) && C39579Fg7.LIZIZ(LIZJ) && C78496UrM.LIZ(LIZJ) > 0 && LIZJ != null) {
                this.LJLJI.setValue(new C58755N4d(musicModel));
                this.LJLJJI.LIZLLL(C44416Hbw.LIZJ(musicModel));
                return;
            }
        }
        this.LJLJI.setValue(new C58753N4b(musicModel));
        C60148Nj6 c60148Nj6 = this.LJLJJL;
        c60148Nj6.getClass();
        c60148Nj6.LIZ.pause();
        Context context = c60148Nj6.LIZJ;
        if (context != null) {
            if (!C48203Ivv.LJ(context)) {
                C5S1 c5s1 = new C5S1(c60148Nj6.LIZJ);
                c5s1.LIZJ(R.string.img);
                c5s1.LJ();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ID：");
                LIZ.append(musicModel.getId());
                C36922EeM.LIZLLL(4, "Music Download", X1D.LIZIZ(LIZ));
                c60148Nj6.LIZIZ.LIZJ(musicModel, new C60152NjA(c60148Nj6, musicModel), true, true);
            }
        }
        this.LJLJJI.pause();
    }

    public ScopedMusicPlayer(Context context, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = true;
        this.LJLJI = V8H.LIZ(C58754N4c.LIZ);
        this.LJLJJI = new XU2("music_detail_page_ai_recommend_music");
        this.LJLJJL = new C60148Nj6(context, this);
        this.LJLJJLL = new AtomicBoolean(false);
    }

    @Override // X.InterfaceC60149Nj7
    public final void LIZ(MusicModel musicModel, String musicFile) {
        o.LJIIIZ(musicFile, "musicFile");
        o.LJIIIZ(musicModel, "musicModel");
        if (!this.LJLJL) {
            this.LJLJI.setValue(C58754N4c.LIZ);
        } else {
            this.LJLJJI.LIZLLL(C44416Hbw.LIZJ(musicModel));
            this.LJLJI.setValue(new C58755N4d(musicModel));
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_PAUSE) {
            this.LJLJL = false;
            pause();
        } else {
            if (event != Lifecycle.Event.ON_RESUME) {
                return;
            }
            this.LJLJL = true;
        }
    }
}
