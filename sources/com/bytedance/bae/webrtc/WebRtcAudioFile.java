package com.bytedance.bae.webrtc;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C59895Nf1;
import X.C65300Pk0;
import X.PPC;
import X.PPD;
import X.PPY;
import X.PY7;
import X.PYT;
import X.PYU;
import X.X1D;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.webkit.URLUtil;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.Vector;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public class WebRtcAudioFile {
    public boolean eoInputStream;
    public boolean eoOutputStream;
    public int mChannels;
    public byte[] mDecodedData;
    public MediaExtractor mExtractor;
    public long mFileLength;
    public ByteBuffer[] mInputBuffers;
    public MediaCodec mMediaCodec;
    public ByteBuffer[] mOutputBuffers;
    public int mRetryCount;
    public int mSampleRate;
    public Vector<Integer> mTrackIds;
    public MediaFormat mUsedTrackFormat;
    public int mUsedTrackIdx;
    public HttpURLConnection oc;

    private boolean checkInfoChange() {
        boolean z;
        try {
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            int integer2 = outputFormat.getInteger("channel-count");
            if (this.mSampleRate == integer && this.mChannels == integer2) {
                z = false;
                this.mSampleRate = integer;
                this.mChannels = integer2;
                return z;
            }
            z = true;
            this.mSampleRate = integer;
            this.mChannels = integer2;
            return z;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            RXLogging.e("WebRtcAudioRecordFile", "Error when checking file's new format");
            return false;
        }
    }

    public static URLConnection com_bytedance_bae_webrtc_WebRtcAudioFile_java_net_URL_openConnection(URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-2084274251756538946"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public void disConnectURL() {
        RXLogging.e("WebRtcAudioRecordFile", "disConnectURL");
        HttpURLConnection httpURLConnection = this.oc;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public int getAudioTrackCount() {
        Vector<Integer> vector = this.mTrackIds;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    public long getCurrentFilePosition() {
        try {
            return this.mExtractor.getSampleTime() / 1000;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            RXLogging.e("WebRtcAudioRecordFile", "Error when getCurrentFilePosition");
            return 0L;
        }
    }

    public long getFileLength() {
        return this.mFileLength / 1000;
    }

    public void uninit() {
        try {
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            MediaExtractor mediaExtractor = this.mExtractor;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.mExtractor = null;
            }
        } catch (Exception e) {
            StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "Error when releasing audio file stream");
            LIZIZ.append(e.getMessage());
            RXLogging.e("WebRtcAudioRecordFile", X1D.LIZIZ(LIZIZ));
        }
        this.eoOutputStream = false;
        this.eoInputStream = false;
    }

    public WebRtcAudioFile() {
        RXLogging.e("WebRtcAudioRecordFile", "AudioMix WebRtcAudioFile");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
    
        if (r1.toLowerCase().contains("vivo") == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean readAudioData() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bae.webrtc.WebRtcAudioFile.readAudioData():boolean");
    }

    public int getChannelCount() {
        return this.mChannels;
    }

    public byte[] getDecodedData() {
        return this.mDecodedData;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int getUsedTrackIdx() {
        return this.mUsedTrackIdx;
    }

    public static URLConnection INVOKEVIRTUAL_com_bytedance_bae_webrtc_WebRtcAudioFile_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return com_bytedance_bae_webrtc_WebRtcAudioFile_java_net_URL_openConnection(url);
        }
        PPC<URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
        PPD ppd = LJFF.LJFF;
        if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
            URLConnection uRLConnection2 = uRLConnection;
            if (uRLConnection2 instanceof HttpsURLConnection) {
                pyu2 = new PYT((HttpsURLConnection) uRLConnection2);
            } else {
                if (!(uRLConnection2 instanceof HttpURLConnection)) {
                    return uRLConnection2;
                }
                pyu2 = new PYU((HttpURLConnection) uRLConnection2);
            }
            return pyu2;
        }
        if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
            URLConnection com_bytedance_bae_webrtc_WebRtcAudioFile_java_net_URL_openConnection = com_bytedance_bae_webrtc_WebRtcAudioFile_java_net_URL_openConnection(url);
            if (com_bytedance_bae_webrtc_WebRtcAudioFile_java_net_URL_openConnection instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) com_bytedance_bae_webrtc_WebRtcAudioFile_java_net_URL_openConnection);
            } else {
                if (!(com_bytedance_bae_webrtc_WebRtcAudioFile_java_net_URL_openConnection instanceof HttpURLConnection)) {
                    return com_bytedance_bae_webrtc_WebRtcAudioFile_java_net_URL_openConnection;
                }
                pyu = new PYU((HttpURLConnection) com_bytedance_bae_webrtc_WebRtcAudioFile_java_net_URL_openConnection);
            }
            return pyu;
        }
        throw runtimeException;
    }

    private boolean checkUrlEncoded(String str) {
        try {
            return !TextUtils.equals(str, URLDecoder.decode(str, "UTF-8"));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            RXLogging.e("WebRtcAudioRecordFile", "Error when releasing audio file stream");
            return false;
        }
    }

    private String encodeUrl(String str) {
        RXLogging.e("WebRtcAudioRecordFile", "encodedUrl");
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return str;
        }
    }

    private boolean isAvailableOnlineURL(String str) {
        boolean z;
        RXLogging.e("WebRtcAudioRecordFile", "isAvailableOnlineURL");
        this.oc = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) INVOKEVIRTUAL_com_bytedance_bae_webrtc_WebRtcAudioFile_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(str));
                this.oc = httpURLConnection;
                httpURLConnection.setUseCaches(false);
                this.oc.setConnectTimeout(LivePlayerResourceReleaseSetting.ENABLE);
                RXLogging.e("WebRtcAudioRecordFile", "connect done....");
                int responseCode = this.oc.getResponseCode();
                if (200 == responseCode) {
                    z = true;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("url is not available, error:");
                    LIZ.append(responseCode);
                    RXLogging.e("WebRtcAudioRecordFile", X1D.LIZIZ(LIZ));
                    z = false;
                }
                InputStream inputStream = this.oc.getInputStream();
                if (inputStream != null) {
                    inputStream.close();
                }
                HttpURLConnection httpURLConnection2 = this.oc;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return z;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("++Error when test online url: ");
                LIZ2.append(e.getMessage());
                RXLogging.e("WebRtcAudioRecordFile", X1D.LIZIZ(LIZ2));
                HttpURLConnection httpURLConnection3 = this.oc;
                if (httpURLConnection3 == null) {
                    return false;
                }
                httpURLConnection3.disconnect();
                return false;
            }
        } catch (Throwable th) {
            HttpURLConnection httpURLConnection4 = this.oc;
            if (httpURLConnection4 != null) {
                httpURLConnection4.disconnect();
            }
            throw th;
        }
    }

    public void selectTrack(int i) {
        try {
            Vector<Integer> vector = this.mTrackIds;
            if (vector == null || i + 1 > vector.size() || this.mUsedTrackIdx == i) {
                return;
            }
            MediaExtractor mediaExtractor = this.mExtractor;
            if (mediaExtractor == null || this.mMediaCodec == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mExtractor or mMediaCodec is null, mExtractor = ");
                LIZ.append(this.mExtractor);
                LIZ.append(", mMediaCodec = ");
                LIZ.append(this.mMediaCodec);
                RXLogging.e("WebRtcAudioRecordFile", X1D.LIZIZ(LIZ));
                return;
            }
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(this.mTrackIds.get(i).intValue());
            if (this.mSampleRate != trackFormat.getInteger("sample-rate")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("mSampleRate = ");
                LIZ2.append(this.mSampleRate);
                LIZ2.append(", used_SampleRate = ");
                LIZ2.append(trackFormat.getInteger("sample-rate"));
                RXLogging.e("WebRtcAudioRecordFile", X1D.LIZIZ(LIZ2));
                return;
            }
            long sampleTime = this.mExtractor.getSampleTime();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("++current_postion = ");
            LIZ3.append(sampleTime);
            RXLogging.e("WebRtcAudioRecordFile", X1D.LIZIZ(LIZ3));
            this.mExtractor.unselectTrack(this.mTrackIds.get(this.mUsedTrackIdx).intValue());
            this.mMediaCodec.stop();
            trackFormat.getString("mime");
            this.mExtractor.selectTrack(this.mTrackIds.get(i).intValue());
            this.mExtractor.seekTo(sampleTime, 2);
            this.mMediaCodec.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
            this.mMediaCodec.start();
            this.mUsedTrackFormat = trackFormat;
            this.mUsedTrackIdx = i;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            RXLogging.e("WebRtcAudioRecordFile", "Error when selectTrack");
        }
    }

    public void setCurrentFilePosition(long j) {
        if (this.eoOutputStream) {
            try {
                this.mMediaCodec.flush();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                RXLogging.e("WebRtcAudioRecordFile", "Error when setCurrentFilePosition, mMediaCodec.flush");
            }
        }
        try {
            this.mExtractor.seekTo(j * 1000, 2);
            this.eoInputStream = false;
            this.eoOutputStream = false;
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
            RXLogging.e("WebRtcAudioRecordFile", "Error when setCurrentFilePosition, mExtractor.seekTo");
        }
    }

    public boolean init(String str, int i) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Try to decode audio file : ");
            LIZ.append(str);
            RXLogging.i("WebRtcAudioRecordFile", X1D.LIZIZ(LIZ));
            this.mTrackIds = new Vector<>();
            if (URLUtil.isNetworkUrl(str)) {
                if (!checkUrlEncoded(str)) {
                    str = encodeUrl(str);
                }
                if (str == null || !isAvailableOnlineURL(str)) {
                    return false;
                }
            }
            this.mRetryCount = 0;
            this.mExtractor = new MediaExtractor();
            Context applicationContext = ContextUtils.getApplicationContext();
            if (str.startsWith("/assets/") && applicationContext != null) {
                AssetFileDescriptor openFd = applicationContext.getAssets().openFd(str.substring(8));
                this.mExtractor.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            } else if (!str.startsWith("content://") || applicationContext == null) {
                this.mExtractor.setDataSource(str);
            } else {
                this.mExtractor.setDataSource(applicationContext.getContentResolver().openFileDescriptor(UriProtector.parse(str), "r").getFileDescriptor());
            }
            int trackCount = this.mExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                this.mExtractor.unselectTrack(i2);
            }
            if (i + 1 > trackCount) {
                RXLogging.e("WebRtcAudioRecordFile", "useTrack > trackCount");
                return false;
            }
            this.mChannels = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < trackCount; i4++) {
                MediaFormat trackFormat = this.mExtractor.getTrackFormat(i4);
                String string = trackFormat.getString("mime");
                if (string.contains("audio/")) {
                    if (i == i3) {
                        this.mExtractor.selectTrack(i4);
                        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
                        this.mMediaCodec = createDecoderByType;
                        createDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                        this.mUsedTrackFormat = trackFormat;
                        this.mUsedTrackIdx = i3;
                    }
                    i3++;
                    this.mTrackIds.addElement(new Integer(i4));
                    int integer = trackFormat.getInteger("channel-count");
                    if (integer > this.mChannels) {
                        this.mChannels = integer;
                    }
                }
            }
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.start();
                this.mSampleRate = this.mUsedTrackFormat.getInteger("sample-rate");
                this.mFileLength = this.mUsedTrackFormat.getLong("durationUs");
                return true;
            }
            RXLogging.e("WebRtcAudioRecordFile", "mMediaCodec is null");
            return false;
        } catch (Exception e) {
            StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "Error when creating audio file decode, error:");
            LIZIZ.append(e.getMessage());
            RXLogging.e("WebRtcAudioRecordFile", X1D.LIZIZ(LIZIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stack track: ");
            LIZ2.append(Log.getStackTraceString(e));
            RXLogging.e("WebRtcAudioRecordFile", X1D.LIZIZ(LIZ2));
            return false;
        }
    }
}
