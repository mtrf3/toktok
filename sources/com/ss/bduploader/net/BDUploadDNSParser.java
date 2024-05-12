package com.ss.bduploader.net;

import X.C16880lQ;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.ss.bduploader.BDUploadLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class BDUploadDNSParser {
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime = 0;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalMainType;
    public static BDUploadDNSParser mInstance;
    public Handler mHandler;
    public int mRefCount;
    public int mState;
    public HandlerThread mThread;
    public int mType;
    public int mTimeOut = 5;
    public Lock mLock = new ReentrantLock();
    public Map<String, BDUploadHostProcessor> mProcessors = new HashMap();

    public void release() {
    }

    public static BDUploadDNSParser getInstance() {
        if (mInstance == null) {
            synchronized (BDUploadDNSParser.class) {
                if (mInstance == null) {
                    mInstance = new BDUploadDNSParser();
                }
            }
        }
        return mInstance;
    }

    public BDUploadDNSParser() {
        HandlerThread handlerThread = new HandlerThread("BDUploadDNSParser");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mThread.getLooper()) { // from class: com.ss.bduploader.net.BDUploadDNSParser.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                BDUploadDNSInfo bDUploadDNSInfo;
                Object obj = message.obj;
                if (obj != null) {
                    bDUploadDNSInfo = (BDUploadDNSInfo) obj;
                } else {
                    bDUploadDNSInfo = null;
                }
                BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), bDUploadDNSInfo}));
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            BDUploadDNSParser.this.proccessSucMsg(i, bDUploadDNSInfo);
                        }
                    } else {
                        BDUploadDNSParser.this.proccessFailMsg(i, bDUploadDNSInfo);
                    }
                } else {
                    BDUploadDNSParser.this.processParseMsg(i, bDUploadDNSInfo);
                }
                BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), bDUploadDNSInfo}));
            }
        };
    }

    private void addListenerInternal(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("---add listener:%s for host:%s", new Object[]{bDUploadDNSParserListener, str}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(str);
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("get processor:%s", new Object[]{bDUploadHostProcessor}));
            if (bDUploadHostProcessor == null) {
                bDUploadHostProcessor = new BDUploadHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime);
                BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("create processor:%s", new Object[]{bDUploadHostProcessor}));
                z = true;
            } else {
                z = false;
            }
            if (bDUploadDNSParserListener != null && !bDUploadHostProcessor.mListeners.containsKey(bDUploadDNSParserListener)) {
                BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("add listener", new Object[0]));
                bDUploadHostProcessor.mListeners.put(bDUploadDNSParserListener, 1);
            }
            this.mProcessors.put(str, bDUploadHostProcessor);
            if (z) {
                BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("new processor implement parse", new Object[0]));
                bDUploadHostProcessor.processMsg(0, new BDUploadDNSInfo(mGlobalMainType, str, null, 0L, null));
            }
            this.mLock.unlock();
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("****end add listener", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    private void removeListenerInternal(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        if (TextUtils.isEmpty(str) || bDUploadDNSParserListener == null) {
            return;
        }
        BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("---remove listener:%s for host:%s", new Object[]{bDUploadDNSParserListener, str}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(str);
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("get processor:%s", new Object[]{bDUploadHostProcessor}));
            if (bDUploadHostProcessor != null) {
                BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("remove listener", new Object[0]));
                bDUploadHostProcessor.mListeners.remove(bDUploadDNSParserListener);
                if (bDUploadHostProcessor.mListeners.size() == 0) {
                    BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("listeners empty remove host from processors", new Object[0]));
                    this.mProcessors.remove(str);
                }
            }
            this.mLock.unlock();
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("****end remove listener", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public static void setIntValue(int i, int i2) {
        BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("****set value:%d for key:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    mGlobalBackUpDelayedTime = i2;
                    return;
                }
                mGlobalDefaultExpiredTime = i2;
                return;
            }
            mGlobalBackType = i2;
            return;
        }
        mGlobalMainType = i2;
    }

    public void addHost(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        addListenerInternal(str, bDUploadDNSParserListener);
    }

    public void postParseHostMsg(String str, int i) {
        BDUploadDNSInfo bDUploadDNSInfo = new BDUploadDNSInfo(i, str, null, 0L, null);
        Message message = new Message();
        message.what = 0;
        message.obj = bDUploadDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public void proccessFailMsg(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        if (bDUploadDNSInfo == null || bDUploadDNSInfo.mHost == null) {
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
            if (bDUploadHostProcessor != null && bDUploadHostProcessor.isValidSourceId(bDUploadDNSInfo.mId)) {
                bDUploadHostProcessor.processResult(i, bDUploadDNSInfo);
                if (bDUploadHostProcessor.isEnd()) {
                    BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("processor end, notify result", new Object[0]));
                    for (BDUploadDNSParserListener bDUploadDNSParserListener : bDUploadHostProcessor.mListeners.keySet()) {
                        if (bDUploadDNSParserListener != null) {
                            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("listener:%s oncompletion fail", new Object[]{bDUploadDNSParserListener}));
                            bDUploadDNSParserListener.onCompletion(0, bDUploadDNSInfo.mHost, null, 0L, null);
                        }
                    }
                    bDUploadHostProcessor.mListeners.clear();
                    this.mProcessors.remove(bDUploadDNSInfo.mHost);
                } else {
                    BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public void proccessSucMsg(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        HashMap<BDUploadDNSParserListener, Integer> hashMap;
        if (bDUploadDNSInfo == null || bDUploadDNSInfo.mHost == null) {
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
            if (bDUploadHostProcessor != null && (hashMap = bDUploadHostProcessor.mListeners) != null) {
                for (BDUploadDNSParserListener bDUploadDNSParserListener : hashMap.keySet()) {
                    if (bDUploadDNSParserListener != null) {
                        BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("listener:%s oncompletion suc", new Object[]{bDUploadDNSParserListener}));
                        bDUploadDNSParserListener.onCompletion(0, bDUploadDNSInfo.mHost, bDUploadDNSInfo.mIpList, bDUploadDNSInfo.mExpiredTime, null);
                    }
                }
                bDUploadHostProcessor.mListeners.clear();
                this.mProcessors.remove(bDUploadDNSInfo.mHost);
                BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("remove all listeners and remove host", new Object[0]));
            }
            this.mLock.unlock();
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public void processParseMsg(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        if (bDUploadDNSInfo == null || bDUploadDNSInfo.mHost == null) {
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
            if (bDUploadHostProcessor != null) {
                BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("----get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
                bDUploadHostProcessor.processMsg(i, bDUploadDNSInfo);
            } else {
                BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("****get processor null for host:%s", new Object[]{bDUploadDNSInfo.mHost}));
            }
            this.mLock.unlock();
            BDUploadLog.d("BDUploadDNSParser", C16880lQ.LLLZ("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public void removeHost(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        removeListenerInternal(str, bDUploadDNSParserListener);
    }
}
