package com.ss.android.ugc.aweme.ecommercelive.business.player.audio;

import X.C48423IzT;
import X.C48424IzU;
import android.media.MediaPlayer;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcAudioPlayer implements GenericLifecycleObserver {
    public static final HashMap<LifecycleOwner, EcAudioPlayer> LJLJJL = new HashMap<>();
    public final LifecycleOwner LJLIL;
    public final HashMap<String, MediaPlayer> LJLILLLLZI = new HashMap<>();
    public final LinkedList<MediaPlayer> LJLJI = new LinkedList<>();
    public boolean LJLJJI;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LJLJJI = true;
        Iterator<Map.Entry<String, MediaPlayer>> it = this.LJLILLLLZI.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().pause();
            } catch (Throwable unused) {
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LJLJJI = false;
        Iterator<Map.Entry<String, MediaPlayer>> it = this.LJLILLLLZI.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().start();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
    }

    public final void LIZIZ() {
        Iterator<Map.Entry<String, MediaPlayer>> it = this.LJLILLLLZI.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().release();
            } catch (Throwable unused) {
            }
        }
        this.LJLILLLLZI.clear();
        Iterator<MediaPlayer> it2 = this.LJLJI.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().release();
            } catch (Throwable unused2) {
            }
        }
        this.LJLJI.clear();
        LJLJJL.remove(this.LJLIL);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZIZ();
    }

    public EcAudioPlayer(LifecycleOwner lifecycleOwner) {
        this.LJLIL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public final void LIZJ(String str) {
        if (str == null || str.length() == 0) {
            for (Map.Entry<String, MediaPlayer> entry : this.LJLILLLLZI.entrySet()) {
                try {
                    entry.getValue().stop();
                    this.LJLJI.addLast(entry.getValue());
                } catch (Throwable unused) {
                }
            }
            this.LJLILLLLZI.clear();
            return;
        }
        if (this.LJLILLLLZI.get(str) != null) {
            MediaPlayer mediaPlayer = this.LJLILLLLZI.get(str);
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.stop();
                    this.LJLJI.addLast(mediaPlayer);
                } catch (Throwable unused2) {
                }
            }
            this.LJLILLLLZI.remove(str);
        }
    }

    public final void LIZ(String url, String filepath, boolean z) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(filepath, "filepath");
        MediaPlayer pollFirst = this.LJLJI.pollFirst();
        if (pollFirst == null) {
            pollFirst = new MediaPlayer();
            pollFirst.setAudioStreamType(3);
        }
        this.LJLILLLLZI.put(url, pollFirst);
        try {
            pollFirst.reset();
        } catch (Throwable unused) {
        }
        pollFirst.setDataSource(filepath);
        pollFirst.setLooping(z);
        pollFirst.prepareAsync();
        pollFirst.setOnPreparedListener(new C48424IzU(this));
        if (!z) {
            pollFirst.setOnCompletionListener(new C48423IzT(this, url));
        }
    }
}
