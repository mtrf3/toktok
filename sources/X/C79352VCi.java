package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.Serializable;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* renamed from: X.VCi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79352VCi implements Serializable {
    public boolean isValid;
    public int m302;
    public long mAudioBuffer;
    public int mBitrate;
    public int mChannel;
    public int mConnectCost;
    public long mDownloadSpeed;
    public long mDuration;
    public long mEndTs;
    public float mFPS;
    public long mFirstFrame;
    public long mFirstFrameAudioBuffer;
    public long mFirstFrameDownloadSpeed;
    public long mFirstFrameVideoBuffer;
    public int mGop;
    public int mHeight;
    public int mIsPreview;
    public long mPlayTime;
    public int mRetryTotalCount;
    public int mSampleRate;
    public JSONObject mSession_time_series;
    public long mStallTime;
    public int mStallTotalCount;
    public long mStallTotalTime;
    public int mStallType;
    public long mStartTs;
    public long mStopTimestamp;
    public int mSuccess;
    public long mVideoBuffer;
    public int mWidth;
    public String mSessionId = "";
    public String mDomain = "";
    public String mNetwork = "";
    public String mUpdate = "";
    public String mCreate = "";
    public String mEnterMethod = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String mEnterAction = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String mNeptuneName = "";
    public String mStreamSuffix = "";
    public String mProtocol = "";
    public ConcurrentLinkedQueue<Long> mVideoBufferList = new ConcurrentLinkedQueue<>();
    public ConcurrentLinkedQueue<Long> mAudioBufferList = new ConcurrentLinkedQueue<>();
    public ConcurrentLinkedQueue<Long> mRenderAudioSeries = new ConcurrentLinkedQueue<>();
    public ConcurrentLinkedQueue<Long> mRenderVideoSeries = new ConcurrentLinkedQueue<>();
    public ConcurrentLinkedQueue<Long> mStallSeries = new ConcurrentLinkedQueue<>();

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionCacheInfos{mSessionId='");
        Q89.LIZIZ(LIZ, this.mSessionId, '\'', ", mDomain='");
        Q89.LIZIZ(LIZ, this.mDomain, '\'', ", mPlayTime=");
        LIZ.append(this.mPlayTime);
        LIZ.append(", mDownloadSpeed=");
        LIZ.append(this.mDownloadSpeed);
        LIZ.append(", mNetwork='");
        Q89.LIZIZ(LIZ, this.mNetwork, '\'', ", mUpdate='");
        Q89.LIZIZ(LIZ, this.mUpdate, '\'', ", mCreate='");
        return C77800Ug8.LIZJ(LIZ, this.mCreate, '\'', '}', LIZ);
    }

    public <T> T getValue(String str, T t) {
        char c;
        try {
            switch (str.hashCode()) {
                case -1927368268:
                    if (str.equals("Duration")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1754979095:
                    if (str.equals("Update")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case -1683202543:
                    if (str.equals("SessionID")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -1656530148:
                    if (str.equals("NeptuneName")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -1348421033:
                    if (str.equals("RenderAudioSeries")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -1266030831:
                    if (str.equals("StreamSuffix")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case -1157606636:
                    if (str.equals("StopTimestamp")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -924519752:
                    if (str.equals("Protocol")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case -903626825:
                    if (str.equals("ConnectCost")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -786828786:
                    if (str.equals("Network")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case -747805892:
                    if (str.equals("RenderVideoSeries")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case -709528236:
                    if (str.equals("AudioBufferList")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -589160937:
                    if (str.equals("StallSeries")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -304489875:
                    if (str.equals("StallTime")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -304474406:
                    if (str.equals("StallType")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -232532383:
                    if (str.equals("StartTs")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -202516509:
                    if (str.equals("Success")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 50549:
                    if (str.equals("302")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 69833:
                    if (str.equals("FPS")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 67098778:
                    if (str.equals("EndTs")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 84113122:
                    if (str.equals("FirstFrameDownloadSpeed")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 278230227:
                    if (str.equals("RetryTotalCount")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 568537785:
                    if (str.equals("FirstFrameAudioBuffer")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 819629183:
                    if (str.equals("DownloadSpeed")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 888094667:
                    if (str.equals("StallTotalCount")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1106004766:
                    if (str.equals("IsPreview")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1169152926:
                    if (str.equals("FirstFrameVideoBuffer")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1193711374:
                    if (str.equals("EnterAction")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 1539107257:
                    if (str.equals("EnterMethod")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 1809510589:
                    if (str.equals("FirstFrame")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 1830263953:
                    if (str.equals("StallTotalTime")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1943403585:
                    if (str.equals("PlayTime")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 2052636900:
                    if (str.equals("Domain")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case 2073378034:
                    if (str.equals("isValid")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2139694009:
                    if (str.equals("VideoBufferList")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return (T) Boolean.valueOf(this.isValid);
                case 1:
                    return (T) Integer.valueOf(this.mSuccess);
                case 2:
                    return (T) Integer.valueOf(this.m302);
                case 3:
                    return (T) Integer.valueOf(this.mConnectCost);
                case 4:
                    return (T) Integer.valueOf(this.mStallType);
                case 5:
                    return (T) Integer.valueOf(this.mStallTotalCount);
                case 6:
                    return (T) Integer.valueOf(this.mRetryTotalCount);
                case 7:
                    return (T) Integer.valueOf(this.mIsPreview);
                case '\b':
                    return (T) Long.valueOf(this.mStartTs);
                case '\t':
                    return (T) Long.valueOf(this.mStallTime);
                case '\n':
                    return (T) Long.valueOf(this.mEndTs);
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    return (T) Long.valueOf(this.mDuration);
                case '\f':
                    return (T) Long.valueOf(this.mStallTotalTime);
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    return (T) Long.valueOf(this.mFirstFrameAudioBuffer);
                case 14:
                    return (T) Long.valueOf(this.mFirstFrameVideoBuffer);
                case 15:
                    return (T) Long.valueOf(this.mFirstFrameDownloadSpeed);
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    return (T) Long.valueOf(this.mFirstFrame);
                case 17:
                    return (T) Long.valueOf(this.mStopTimestamp);
                case 18:
                    return (T) Long.valueOf(this.mPlayTime);
                case 19:
                    return (T) Long.valueOf(this.mDownloadSpeed);
                case 20:
                    return (T) Float.valueOf(this.mFPS);
                case 21:
                    return (T) this.mStallSeries;
                case 22:
                    return (T) this.mVideoBufferList;
                case 23:
                    return (T) this.mAudioBufferList;
                case 24:
                    return (T) this.mRenderVideoSeries;
                case 25:
                    return (T) this.mRenderAudioSeries;
                case 26:
                    return (T) this.mNeptuneName;
                case 27:
                    return (T) this.mStreamSuffix;
                case 28:
                    return (T) this.mEnterAction;
                case 29:
                    return (T) this.mEnterMethod;
                case 30:
                    return (T) this.mSessionId;
                case 31:
                    return (T) this.mProtocol;
                case ' ':
                    return (T) this.mNetwork;
                case '!':
                    return (T) this.mUpdate;
                case '\"':
                    return (T) this.mDomain;
                default:
                    return t;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return t;
        }
    }
}
