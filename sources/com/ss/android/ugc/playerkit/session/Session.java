package com.ss.android.ugc.playerkit.session;

import X.C48339Iy7;
import X.INN;
import X.ITZ;
import X.Q89;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes9.dex */
public class Session {
    public boolean bytevc1;
    public double calcBitrate;
    public int cdnUrlCandidatesNum;
    public int codecType;
    public float duration;
    public boolean isCurrentPlayer;
    public boolean isOpenSuperResolution;
    public boolean isStub;
    public String key;
    public ITZ playerType;
    public int preSuperResolution;
    public String selectDiffStrForSDK;
    public String sourceId;
    public INN state;
    public String uri;
    public String url;
    public SimVideoUrlModel urlModel;
    public static final Queue<Session> pool = new LinkedBlockingQueue(10);
    public static final Session DEFAULT = new Session(true);
    public float speed = -1.0f;
    public int blockCnt = -1;
    public int blockTime = -1;
    public int bitrate = -1;
    public int audioBitrate = -1;
    public long timeCostForSelectSDK = -1;
    public float playBitrate = -1.0f;
    public int playTime = -1;
    public int cacheSize = -1;

    private void clear() {
        this.sourceId = null;
        this.uri = null;
        this.url = null;
        setCodecType(0);
        this.duration = 0.0f;
        this.speed = -1.0f;
        this.blockCnt = -1;
        this.blockTime = -1;
        this.bitrate = -1;
        this.playBitrate = -1.0f;
        this.playTime = -1;
        this.cacheSize = -1;
        this.playerType = null;
        this.isCurrentPlayer = false;
        this.urlModel = null;
        this.state = null;
        this.calcBitrate = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.isOpenSuperResolution = false;
        this.preSuperResolution = 0;
    }

    public static Session instance() {
        Session poll = pool.poll();
        if (poll == null) {
            return new Session();
        }
        return poll;
    }

    public Session() {
    }

    public void recycle() {
        clear();
        pool.offer(this);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Session{key='");
        Q89.LIZIZ(LIZ, this.key, '\'', ", sourceId='");
        Q89.LIZIZ(LIZ, this.sourceId, '\'', ", uri='");
        Q89.LIZIZ(LIZ, this.uri, '\'', ", url='");
        Q89.LIZIZ(LIZ, this.url, '\'', ", codecType=");
        LIZ.append(this.codecType);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", speed=");
        LIZ.append(this.speed);
        LIZ.append(", blockCnt=");
        LIZ.append(this.blockCnt);
        LIZ.append(", blockTime=");
        LIZ.append(this.blockTime);
        LIZ.append(", bitrate=");
        LIZ.append(this.bitrate);
        LIZ.append(", calcBitrate=");
        LIZ.append(this.calcBitrate);
        LIZ.append(", playBitrate=");
        LIZ.append(this.playBitrate);
        LIZ.append(", playTime=");
        LIZ.append(this.playTime);
        LIZ.append(", cacheSize=");
        LIZ.append(this.cacheSize);
        LIZ.append(", playerType=");
        LIZ.append(this.playerType);
        LIZ.append(", isCurrentPlayer=");
        LIZ.append(this.isCurrentPlayer);
        LIZ.append(", urlModel=");
        LIZ.append(this.urlModel);
        LIZ.append(", state=");
        LIZ.append(this.state);
        LIZ.append(", isOpenSuperResolution=");
        LIZ.append(this.isOpenSuperResolution);
        LIZ.append(", preSuperResolution=");
        LIZ.append(this.preSuperResolution);
        LIZ.append(", isStub=");
        return C48339Iy7.LIZJ(LIZ, this.isStub, '}', LIZ);
    }

    public int getCodecType() {
        return this.codecType;
    }

    public boolean isStub() {
        return this.isStub;
    }

    public Session(boolean z) {
        this.isStub = z;
    }

    public void setCodecType(int i) {
        this.codecType = i;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.bytevc1 = z;
    }
}
