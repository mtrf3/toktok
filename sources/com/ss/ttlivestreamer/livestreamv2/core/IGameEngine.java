package com.ss.ttlivestreamer.livestreamv2.core;

import android.content.Intent;
import android.view.View;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.game.MessageBox;

/* loaded from: classes12.dex */
public interface IGameEngine {

    /* loaded from: classes12.dex */
    public interface GameEventListener {
        void onGameFirstRemoteFrameAvailable();
    }

    /* loaded from: classes12.dex */
    public interface GameLoadCallback extends GamePreloadCallback {
        void onError(String str, Throwable th);

        void onSuccess(String str, IGameClient iGameClient);
    }

    /* loaded from: classes12.dex */
    public interface GamePreloadCallback {

        /* loaded from: classes12.dex */
        public interface GamePreloadTask {
            boolean cancel();

            String getGameId();
        }

        void onDownloadCancel(String str);

        void onDownloadError(String str, String str2, Throwable th);

        void onDownloadStart(String str, GamePreloadTask gamePreloadTask);

        void onDownloadSuccess(String str);

        void onDownloadingProgress(String str, int i);
    }

    /* loaded from: classes12.dex */
    public interface IGameClient {

        /* loaded from: classes12.dex */
        public interface Listener {
            void onGameSetMessageHandler(boolean z);

            void onReceiveGameClientMessage(MessageBox messageBox);
        }

        void destroy();

        void pause();

        boolean postMessage(MessageBox messageBox);

        void resume();

        void setListener(Listener listener);
    }

    void clearGameResource(String str);

    void disableCameraWhenPublishGame(boolean z);

    void enablePublish(boolean z);

    String getAudioLayerName();

    float getRenderFps();

    TEBundle getRtcParameter();

    String getVideoLayerName();

    void initGameEngine();

    boolean isEnablePublish();

    boolean isEnableRender();

    boolean isGamePackageDownloaded(String str);

    boolean onActivityResult(String str, int i, int i2, Intent intent);

    boolean onBackPressed(String str);

    void onMemoryWarning(String str, int i);

    void onRequestPermissionsResult(String str, int i, String[] strArr, int[] iArr);

    void preload(String str, GamePreloadCallback gamePreloadCallback);

    void release();

    void setDisplay(View view);

    void setEnableRender(boolean z);

    void setGameCallback(VideoSink videoSink, AudioSink audioSink);

    void setGameEventListener(GameEventListener gameEventListener);

    void setPublishStreamWithGameResolution(boolean z);

    void setRtcParameter(TEBundle tEBundle);

    void setUseCameraMainGameMode(boolean z);

    void startGame(String str, GameLoadCallback gameLoadCallback, GameLauncherParameter gameLauncherParameter);

    void updateCameraPosition(float f, float f2, float f3, float f4, boolean z);
}
