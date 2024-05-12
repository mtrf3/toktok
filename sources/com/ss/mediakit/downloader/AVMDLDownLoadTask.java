package com.ss.mediakit.downloader;

import X.C16880lQ;
import X.X1D;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLThreadPool;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class AVMDLDownLoadTask {
    public File file;
    public FileOutputStream fos;
    public Future mFuture;
    public long mHandle;
    public boolean mIsRunning;
    public AVMDLRequest mRequest;
    public AVMDLResponse mResponse;
    public int mStep = -1;
    public Lock mHandleLock = new ReentrantLock();
    public Lock mResonseLock = new ReentrantLock();

    public static native void _notifyLoadInfo(long j, int i, long j2, long j3, String str);

    public static native int _onRecvData(long j, byte[] bArr, int i);

    private void cancelResponse() {
        try {
            this.mResonseLock.lock();
            if (this.mResponse != null) {
                AVMDLLog.d("AVMDLDownLoadTask", "start cancel response");
                long currentTimeMillis = System.currentTimeMillis();
                this.mResponse.cancel();
                AVMDLLog.d("AVMDLDownLoadTask", C16880lQ.LLLZI(Locale.US, "end cancel cost time:%d", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
            }
        } finally {
            this.mResonseLock.unlock();
        }
    }

    public void close() {
        setHandle(0L);
        this.mIsRunning = false;
        cancelResponse();
    }

    private void setHandle(long j) {
        try {
            this.mHandleLock.lock();
            this.mHandle = j;
            AVMDLLog.d("AVMDLDownLoadTask", C16880lQ.LLLZI(Locale.US, "set handle:%d", new Object[]{Long.valueOf(j)}));
        } finally {
            this.mHandleLock.unlock();
        }
    }

    private void setResponse(AVMDLResponse aVMDLResponse) {
        this.mResonseLock.lock();
        this.mResponse = aVMDLResponse;
        this.mResonseLock.unlock();
    }

    public AVMDLResponse httOpen(AVMDLRequest aVMDLRequest) {
        int i;
        AVMDLResponse aVMDLResponse;
        int i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start http open, url:");
        LIZ.append(aVMDLRequest.urls[aVMDLRequest.mCurlUrlIndex]);
        LIZ.append("object:");
        LIZ.append(this);
        LIZ.append("handle:");
        LIZ.append(this.mHandle);
        AVMDLLog.d("AVMDLDownLoadTask", X1D.LIZIZ(LIZ));
        int i3 = aVMDLRequest.mCurlUrlIndex;
        setResponse(null);
        int i4 = i3;
        do {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLLZI(Locale.US, "http open index:%d state:%d trycount:%d maxTry:%d", new Object[]{Integer.valueOf(i4), Integer.valueOf(aVMDLRequest.mUrlState[i4]), Integer.valueOf(aVMDLRequest.mUrlErrCount[i4]), Integer.valueOf(aVMDLRequest.mMaxTryCout)}));
            LIZ2.append(" url:");
            LIZ2.append(aVMDLRequest.urls[i4]);
            AVMDLLog.d("AVMDLDownLoadTask", X1D.LIZIZ(LIZ2));
            if (aVMDLRequest.mUrlState[i4] == 0 && ((i = aVMDLRequest.mMaxTryCout) <= 0 || aVMDLRequest.mUrlErrCount[i4] < i)) {
                try {
                    aVMDLResponse = AVMDLHttpExcutor.excute(aVMDLRequest, i4);
                    if (aVMDLResponse != null && aVMDLResponse.isOpenSuccessful()) {
                        AVMDLLog.d("AVMDLDownLoadTask", "http open suc");
                        setResponse(aVMDLResponse);
                        notifyToNative(0, aVMDLResponse.statusCode, aVMDLResponse.contentlength, null);
                        AVMDLLog.d("AVMDLDownLoadTask", "end http open");
                        aVMDLResponse.request = aVMDLRequest;
                        return aVMDLResponse;
                    }
                } catch (IOException e) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("io exception:");
                    LIZ3.append(e.getLocalizedMessage());
                    LIZ3.append("for url:");
                    LIZ3.append(aVMDLRequest.urls[i4]);
                    AVMDLLog.d("AVMDLDownLoadTask", X1D.LIZIZ(LIZ3));
                    aVMDLResponse = null;
                }
                int[] iArr = aVMDLRequest.mUrlErrCount;
                iArr[i4] = iArr[i4] + 1;
                if (aVMDLResponse != null && (i2 = aVMDLResponse.statusCode) >= 400 && i2 < 600) {
                    aVMDLRequest.mUrlState[i4] = 1;
                    AVMDLLog.d("AVMDLDownLoadTask", C16880lQ.LLLZI(Locale.US, "set url state forbidden index:%d", new Object[]{Integer.valueOf(i4)}));
                }
            }
            i4 = (i4 + 1) % aVMDLRequest.urls.length;
        } while (i4 != i3);
        AVMDLLog.d("AVMDLDownLoadTask", "end http open");
        return null;
    }

    public AVMDLResponse httpRead(AVMDLResponse aVMDLResponse, byte[] bArr) {
        int readData = aVMDLResponse.readData(bArr);
        if (readData > 0) {
            try {
                this.mHandleLock.lock();
                long j = this.mHandle;
                if (j != 0) {
                    _onRecvData(j, bArr, readData);
                }
            } finally {
                this.mHandleLock.unlock();
            }
        }
        return aVMDLResponse;
    }

    public void notifyToNative(int i, long j, long j2, String str) {
        AVMDLLog.d("AVMDLDownLoadTask", C16880lQ.LLLZI(Locale.US, "notify type:%d code:%d param:%d ", new Object[]{Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2)}));
        try {
            this.mHandleLock.lock();
            long j3 = this.mHandle;
            if (j3 != 0) {
                _notifyLoadInfo(j3, i, j, j2, str);
            }
        } finally {
            this.mHandleLock.unlock();
        }
    }

    public int open(long j, Object obj, Object obj2, int i, int i2, int i3) {
        if (j == 0 || obj == null) {
            AVMDLLog.e("AVMDLDownLoadTask", "handle zero err");
            return -1;
        }
        AVMDLRequest aVMDLRequest = (AVMDLRequest) obj;
        String[] strArr = aVMDLRequest.urls;
        if (strArr == null || strArr.length == 0) {
            AVMDLLog.e("AVMDLDownLoadTask", "no url err");
            return -2;
        }
        this.mRequest = aVMDLRequest;
        setHandle(j);
        this.mStep = 0;
        this.mIsRunning = true;
        this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.mediakit.downloader.AVMDLDownLoadTask.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_mediakit_downloader_AVMDLDownLoadTask$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
            
                r12.this$0.notifyToNative(2, -777, 0, null);
                com.ss.mediakit.medialoader.AVMDLLog.d("AVMDLDownLoadTask", "request is error http open fail");
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
            
                return;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void com_ss_mediakit_downloader_AVMDLDownLoadTask$1__run$___twin___() {
                /*
                    r12 = this;
                    java.lang.StringBuilder r1 = X.X1D.LIZ()
                    java.lang.String r0 = "request start:"
                    r1.append(r0)
                    com.ss.mediakit.downloader.AVMDLDownLoadTask r0 = com.ss.mediakit.downloader.AVMDLDownLoadTask.this
                    com.ss.mediakit.downloader.AVMDLRequest r0 = r0.mRequest
                    java.lang.String[] r0 = r0.urls
                    r3 = 0
                    r0 = r0[r3]
                    r1.append(r0)
                    java.lang.String r0 = X.X1D.LIZIZ(r1)
                    if (r0 == 0) goto L93
                    com.ss.mediakit.downloader.AVMDLDownLoadTask r0 = com.ss.mediakit.downloader.AVMDLDownLoadTask.this
                    com.ss.mediakit.downloader.AVMDLRequest r0 = r0.mRequest
                    java.lang.String[] r0 = r0.urls
                    r1 = r0[r3]
                L23:
                    java.lang.String r0 = "AVMDLDownLoadTask"
                    com.ss.mediakit.medialoader.AVMDLLog.d(r0, r1)
                    com.ss.mediakit.downloader.AVMDLResponse r4 = new com.ss.mediakit.downloader.AVMDLResponse
                    com.ss.mediakit.downloader.AVMDLDownLoadTask r1 = com.ss.mediakit.downloader.AVMDLDownLoadTask.this
                    com.ss.mediakit.downloader.AVMDLRequest r2 = r1.mRequest
                    r1 = 0
                    r4.<init>(r2, r1, r1)
                    r1 = 32768(0x8000, float:4.5918E-41)
                    byte[] r6 = new byte[r1]
                L37:
                    com.ss.mediakit.downloader.AVMDLDownLoadTask r5 = com.ss.mediakit.downloader.AVMDLDownLoadTask.this
                    boolean r1 = r5.mIsRunning
                    if (r1 == 0) goto L96
                    int r1 = r5.mStep
                    r2 = 1
                    if (r1 == 0) goto L6f
                    if (r1 == r2) goto L45
                    goto L37
                L45:
                    r5.httpRead(r4, r6)
                    boolean r1 = r4.isReadSuccessful()
                    if (r1 != 0) goto L58
                    java.lang.String r1 = "read fail try http open"
                    com.ss.mediakit.medialoader.AVMDLLog.d(r0, r1)
                    com.ss.mediakit.downloader.AVMDLDownLoadTask r1 = com.ss.mediakit.downloader.AVMDLDownLoadTask.this
                    r1.mStep = r3
                    goto L37
                L58:
                    boolean r1 = r4.isFinish()
                    if (r1 == 0) goto L37
                    com.ss.mediakit.downloader.AVMDLDownLoadTask r5 = com.ss.mediakit.downloader.AVMDLDownLoadTask.this
                    r6 = 3
                    r7 = 0
                    long r9 = r4.contentlength
                    r11 = 0
                    r5.notifyToNative(r6, r7, r9, r11)
                    java.lang.String r1 = "request is finish"
                    com.ss.mediakit.medialoader.AVMDLLog.d(r0, r1)
                    return
                L6f:
                    com.ss.mediakit.downloader.AVMDLRequest r1 = r4.request
                    com.ss.mediakit.downloader.AVMDLResponse r4 = r5.httOpen(r1)
                    if (r4 == 0) goto L7d
                    boolean r1 = r4.isOpenSuccessful()
                    if (r1 != 0) goto L8e
                L7d:
                    com.ss.mediakit.downloader.AVMDLDownLoadTask r1 = com.ss.mediakit.downloader.AVMDLDownLoadTask.this
                    r2 = 2
                    r3 = -777(0xfffffffffffffcf7, double:NaN)
                    r5 = 0
                    r7 = 0
                    r1.notifyToNative(r2, r3, r5, r7)
                    java.lang.String r1 = "request is error http open fail"
                    com.ss.mediakit.medialoader.AVMDLLog.d(r0, r1)
                    return
                L8e:
                    com.ss.mediakit.downloader.AVMDLDownLoadTask r1 = com.ss.mediakit.downloader.AVMDLDownLoadTask.this
                    r1.mStep = r2
                    goto L37
                L93:
                    java.lang.String r1 = "url is null"
                    goto L23
                L96:
                    java.lang.StringBuilder r2 = X.X1D.LIZ()
                    java.lang.String r1 = "request is interrupt end url:"
                    r2.append(r1)
                    com.ss.mediakit.downloader.AVMDLDownLoadTask r1 = com.ss.mediakit.downloader.AVMDLDownLoadTask.this
                    com.ss.mediakit.downloader.AVMDLRequest r1 = r1.mRequest
                    java.lang.String[] r1 = r1.urls
                    r1 = r1[r3]
                    r2.append(r1)
                    java.lang.String r1 = X.X1D.LIZIZ(r2)
                    com.ss.mediakit.medialoader.AVMDLLog.d(r0, r1)
                    com.ss.mediakit.downloader.AVMDLDownLoadTask r0 = com.ss.mediakit.downloader.AVMDLDownLoadTask.this
                    r1 = 5
                    r2 = 0
                    r6 = 0
                    r4 = r2
                    r0.notifyToNative(r1, r2, r4, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.downloader.AVMDLDownLoadTask.AnonymousClass1.com_ss_mediakit_downloader_AVMDLDownLoadTask$1__run$___twin___():void");
            }

            public static void com_ss_mediakit_downloader_AVMDLDownLoadTask$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_mediakit_downloader_AVMDLDownLoadTask$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }
}
