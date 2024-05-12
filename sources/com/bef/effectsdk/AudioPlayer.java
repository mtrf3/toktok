package com.bef.effectsdk;

import X.C16880lQ;
import android.media.MediaPlayer;

/* loaded from: classes.dex */
public class AudioPlayer {
    public static final String TAG = C16880lQ.LJLLJ(AudioPlayer.class);
    public String mFilename;
    public boolean mIsPrepared;
    public MediaPlayer mMediaPlayer;
    public long mNativePtr;

    public int init() {
        this.mIsPrepared = false;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer2;
        mediaPlayer2.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.bef.effectsdk.AudioPlayer.1
            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer3, int i, int i2) {
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnInfo(audioPlayer.mNativePtr, i, i2);
                return false;
            }
        });
        this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.bef.effectsdk.AudioPlayer.2
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer3, int i, int i2) {
                try {
                    AudioPlayer.this.mMediaPlayer.stop();
                    AudioPlayer.this.mMediaPlayer.release();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.mMediaPlayer = null;
                audioPlayer.nativeOnError(audioPlayer.mNativePtr, i, i2);
                return false;
            }
        });
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.bef.effectsdk.AudioPlayer.3
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer3) {
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.mIsPrepared = true;
                audioPlayer.nativeOnPrepared(audioPlayer.mNativePtr);
            }
        });
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.bef.effectsdk.AudioPlayer.4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer3) {
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnCompletion(audioPlayer.mNativePtr);
            }
        });
        return 0;
    }

    public native void nativeOnCompletion(long j);

    public native void nativeOnError(long j, int i, int i2);

    public native void nativeOnInfo(long j, int i, int i2);

    public native void nativeOnPrepared(long j);

    public float getCurrentPlayTime() {
        if (this.mMediaPlayer == null) {
            return 0.0f;
        }
        return r0.getCurrentPosition() / 1000.0f;
    }

    public float getTotalPlayTime() {
        if (this.mMediaPlayer == null) {
            return 0.0f;
        }
        return r0.getDuration() / 1000.0f;
    }

    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        boolean z = false;
        if (mediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        try {
            z = mediaPlayer.isPlaying();
            return z;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return z;
        }
    }

    public boolean pause() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        mediaPlayer.pause();
        return true;
    }

    public int release() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
                this.mMediaPlayer.release();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            this.mMediaPlayer = null;
            return 0;
        }
        return 0;
    }

    public boolean resume() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        mediaPlayer.start();
        return true;
    }

    public void startPlay() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        try {
            if (!this.mIsPrepared) {
                mediaPlayer.prepare();
                this.mIsPrepared = true;
            }
            this.mMediaPlayer.start();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void stopPlay() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && this.mIsPrepared) {
            try {
                mediaPlayer.stop();
                this.mMediaPlayer.release();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            this.mMediaPlayer = null;
            this.mIsPrepared = false;
        }
    }

    public boolean seek(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        try {
            mediaPlayer.seekTo(i);
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return true;
        }
    }

    public void setDataSource(String str) {
        if (this.mMediaPlayer == null) {
            init();
        }
        if (str.equals(this.mFilename) && this.mIsPrepared && this.mMediaPlayer.isPlaying()) {
            return;
        }
        try {
            this.mMediaPlayer.reset();
            this.mMediaPlayer.setDataSource(str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        this.mFilename = str;
    }

    public boolean setLoop(boolean z) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return false;
        }
        mediaPlayer.setLooping(z);
        return true;
    }

    public void setNativePtr(long j) {
        this.mNativePtr = j;
    }

    public boolean setVolume(float f) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        mediaPlayer.setVolume(f, f);
        return true;
    }
}
