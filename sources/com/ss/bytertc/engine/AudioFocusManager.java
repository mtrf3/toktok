package com.ss.bytertc.engine;

import X.C16880lQ;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes33.dex */
public class AudioFocusManager {
    public boolean isAudioFocusLoss;
    public Application.ActivityLifecycleCallbacks mActivityLifecycleCallback = new Application.ActivityLifecycleCallbacks() { // from class: com.ss.bytertc.engine.AudioFocusManager.2
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            int LLJJJJJIL;
            AudioManager audioManager = AudioFocusManager.this.getAudioManager();
            AudioFocusManager audioFocusManager = AudioFocusManager.this;
            if (audioFocusManager.isAudioFocusLoss && audioManager != null) {
                if (Build.VERSION.SDK_INT < 26) {
                    LLJJJJJIL = C16880lQ.LLJJJJLIIL(audioManager, audioFocusManager.onAudioFocusChangeListener, 3, 1);
                } else {
                    LLJJJJJIL = C16880lQ.LLJJJJJIL(audioManager, new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(AudioFocusManager.this.onAudioFocusChangeListener).build());
                }
                if (LLJJJJJIL == 1) {
                    AudioFocusManager.this.mCallback.startMicrophone();
                    AudioFocusManager.this.mCallback.startSpeakerphone();
                }
                AudioFocusManager.this.isAudioFocusLoss = false;
            }
        }
    };
    public AudioManager mAudioManager;
    public Callback mCallback;
    public Context mContext;
    public AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;

    /* loaded from: classes33.dex */
    public interface Callback {
        void higherVolume();

        void lowerVolume();

        void startMicrophone();

        void startSpeakerphone();

        void stopMicrophone();

        void stopSpeakerphone();
    }

    public void releaseAudioFocus() {
        releaseAudioFocus(false);
    }

    public AudioManager getAudioManager() {
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) C16880lQ.LLILL(C16880lQ.LLLLL(this.mContext), "audio");
        }
        return this.mAudioManager;
    }

    public void release() {
        Context context = this.mContext;
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallback);
        }
        releaseAudioFocus();
    }

    public void requestAudioFocus() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT < 26) {
                C16880lQ.LLJJJJLIIL(audioManager, this.onAudioFocusChangeListener, 3, 1);
            } else {
                C16880lQ.LLJJJJJIL(audioManager, new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this.onAudioFocusChangeListener).build());
            }
            this.isAudioFocusLoss = false;
        }
    }

    public void releaseAudioFocus(boolean z) {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT < 26) {
                audioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
            } else {
                audioManager.abandonAudioFocusRequest(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this.onAudioFocusChangeListener).build());
            }
            this.isAudioFocusLoss = z;
        }
    }

    public AudioFocusManager(Context context, Callback callback) {
        this.mContext = context;
        this.mCallback = callback;
        this.onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener(context) { // from class: com.ss.bytertc.engine.AudioFocusManager.1
            public AudioManager audioManager;
            public final /* synthetic */ Context val$context;

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                if (i == -2) {
                    AudioFocusManager.this.mCallback.stopSpeakerphone();
                    AudioFocusManager.this.mCallback.stopMicrophone();
                    return;
                }
                if (i == 1) {
                    AudioFocusManager.this.mCallback.higherVolume();
                    AudioFocusManager.this.mCallback.startSpeakerphone();
                    AudioFocusManager.this.mCallback.startMicrophone();
                } else if (i == -1) {
                    AudioFocusManager.this.mCallback.stopSpeakerphone();
                    AudioFocusManager.this.mCallback.stopMicrophone();
                    AudioFocusManager.this.releaseAudioFocus(true);
                } else {
                    if (i != -3) {
                        return;
                    }
                    AudioFocusManager.this.mCallback.lowerVolume();
                }
            }

            {
                this.val$context = context;
                this.audioManager = (AudioManager) C16880lQ.LLILL(context, "audio");
            }
        };
        Context context2 = this.mContext;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(this.mActivityLifecycleCallback);
        }
    }
}
