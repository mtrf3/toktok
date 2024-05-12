package com.ss.android.ugc.aweme.mediaplayer;

import X.C10C;
import X.C10K;
import X.C169946li;
import X.C170156m3;
import X.C170606mm;
import X.InterfaceC170196m7;
import Y.ACallableS105S0100000_2;
import Y.AObserverS59S0101000_3;
import Y.AgS107S0200000_2;
import Y.AgS120S0100000_2;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes3.dex */
public class MediaPlayerModule implements GenericLifecycleObserver, TextureView.SurfaceTextureListener {
    public String LJLIL;
    public final InterfaceC170196m7 LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final C170156m3 LJLJJLL;
    public TextureView.SurfaceTextureListener LJLJL;
    public final MutableLiveData<C170606mm> LJLJLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        ((C169946li) this.LJLILLLLZI).LIZ.pause();
        this.LJLJLJ.postValue(new C170606mm(3, true));
    }

    public final void LIZIZ() {
        if (this.LJLJI || this.LJLJJI) {
            return;
        }
        ((C169946li) this.LJLILLLLZI).LIZ.play();
        this.LJLJLJ.postValue(new C170606mm(4, true));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        ((C169946li) this.LJLILLLLZI).LIZ.pause();
        ((C169946li) this.LJLILLLLZI).LIZ.pause();
        ((C169946li) this.LJLILLLLZI).LIZ.destroy();
        this.LJLJLJ.postValue(new C170606mm(6, true));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        LIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        LIZIZ();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        ((C169946li) this.LJLILLLLZI).LIZ.pause();
        this.LJLJLJ.postValue(new C170606mm(5, true));
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLJL;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLJL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public MediaPlayerModule(C169946li c169946li, C170156m3 c170156m3) {
        MutableLiveData<C170606mm> mutableLiveData = new MutableLiveData<>();
        this.LJLJLJ = mutableLiveData;
        this.LJLILLLLZI = c169946li;
        this.LJLJJLL = c170156m3;
        mutableLiveData.observeForever(new AObserverS59S0101000_3(2, this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLJL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        C10K LIZJ = C10K.LIZJ(new ACallableS105S0100000_2(this, 19));
        AgS120S0100000_2 agS120S0100000_2 = new AgS120S0100000_2(this, 13);
        C10C c10c = C10K.LJIIIIZZ;
        LIZJ.LJ(agS120S0100000_2, c10c, null).LIZLLL(new AgS107S0200000_2(this, surfaceTexture, 6)).LJ(new AgS120S0100000_2(this, 14), c10c, null);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLJL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }
}
