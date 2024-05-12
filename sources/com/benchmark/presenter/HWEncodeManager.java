package com.benchmark.presenter;

import X.AbstractC89987ZTj;
import X.C38901fq;
import X.C47261Igj;
import X.C89979ZTb;
import X.C89985ZTh;
import X.C89989ZTl;
import X.C89991ZTn;
import X.C89992ZTo;
import X.CallableC89978ZTa;
import X.EnumC89986ZTi;
import X.X1D;
import X.ZTX;
import X.ZTZ;
import X.ZUG;
import android.os.ConditionVariable;
import android.os.Message;
import com.benchmark.mediacodec.TEMediaCodecEncodeSettings;
import com.benchmark.settings.HWEncoderStrategyWrapper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes19.dex */
public class HWEncodeManager {
    public AbstractC89987ZTj mEncode;
    public int mFrameRate;
    public C89991ZTn mMuxer;
    public TEMediaCodecEncodeSettings mSettings;
    public HWEncoderStrategyWrapper mStrategy;
    public String mVideoOutputPath;
    public String mYUVPath;
    public FutureTask<Integer> muxerTask;
    public C89992ZTo yuvTextureDrawer;
    public LinkedBlockingQueue<C89989ZTl> mOutputFrames = new LinkedBlockingQueue<>();
    public boolean mStart = false;
    public volatile int encodeRet = 0;
    public int mNewFrameRate = 0;
    public int mChangeFPSIndex = 15;
    public HashMap<Long, C89989ZTl> mInputFrames = new HashMap<>();
    public Runnable feedTask = new ZTZ(this);
    public Callable<Integer> muxerinnerTask = new CallableC89978ZTa(this);

    public byte[] getCSData() {
        AbstractC89987ZTj abstractC89987ZTj = this.mEncode;
        if (abstractC89987ZTj == null) {
            return new byte[1];
        }
        return abstractC89987ZTj.LJIJ;
    }

    public long getFirstFrameCost() {
        AbstractC89987ZTj abstractC89987ZTj = this.mEncode;
        if (abstractC89987ZTj == null) {
            return 0L;
        }
        return abstractC89987ZTj.LJIIL;
    }

    public int getHoardFrames() {
        AbstractC89987ZTj abstractC89987ZTj = this.mEncode;
        if (abstractC89987ZTj == null) {
            return 0;
        }
        return abstractC89987ZTj.LJIIIIZZ - abstractC89987ZTj.LJII;
    }

    public long getMediaCodecInitCost() {
        AbstractC89987ZTj abstractC89987ZTj = this.mEncode;
        if (abstractC89987ZTj == null) {
            return 0L;
        }
        return abstractC89987ZTj.LJIIJJI;
    }

    public int getProfile() {
        AbstractC89987ZTj abstractC89987ZTj = this.mEncode;
        if (abstractC89987ZTj == null) {
            return 0;
        }
        return abstractC89987ZTj.LJIIJ;
    }

    public int getResult() {
        try {
            int intValue = this.muxerTask.get().intValue();
            if (intValue != 0 && this.encodeRet != -608) {
                this.encodeRet = intValue;
            }
            return this.encodeRet;
        } catch (InterruptedException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("thread wait is error: ");
            LIZ.append(e.getMessage());
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("HWEncodeManager");
            return -1;
        } catch (ExecutionException e2) {
            C38901fq.LJIIIZ(e2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("get muxer thread ret is error: ");
            LIZ2.append(e2.getMessage());
            X1D.LIZIZ(LIZ2);
            C47261Igj.LJIILL("HWEncodeManager");
            return -1;
        }
    }

    public int init() {
        int i;
        ZUG zug = new ZUG();
        this.mEncode = zug;
        TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings = this.mSettings;
        if (tEMediaCodecEncodeSettings.getBitRateMode() < 0 || tEMediaCodecEncodeSettings.getBitRateMode() > 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Do not support bitrate mode ");
            LIZ.append(tEMediaCodecEncodeSettings.getBitRateMode());
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXMediaCodecEncoder");
            i = -100;
        } else if (tEMediaCodecEncodeSettings.getWidth() <= 0 || tEMediaCodecEncodeSettings.getHeight() <= 0) {
            i = -604;
        } else {
            Message message = new Message();
            message.what = 1;
            ConditionVariable conditionVariable = new ConditionVariable();
            conditionVariable.close();
            message.obj = new C89985ZTh(tEMediaCodecEncodeSettings, conditionVariable);
            zug.LJI.sendMessage(message);
            boolean block = conditionVariable.block(500000L);
            i = -600;
            if (!block) {
                C47261Igj.LJIILL("BXMediaCodecEncoder");
            } else if (zug.LJIIZILJ == EnumC89986ZTi.INITED) {
                i = 0;
            }
        }
        this.mChangeFPSIndex = this.mSettings.getChangeFPSIndex();
        if (i < 0) {
            return i;
        }
        this.mMuxer = new C89991ZTn(this.mVideoOutputPath);
        return 0;
    }

    public int start() {
        try {
            int LJI = this.mEncode.LJI();
            if (LJI == 0) {
                this.mStart = true;
                new PthreadThread(this.feedTask, "HWEncodeManager").start();
                this.muxerTask = new FutureTask<>(this.muxerinnerTask);
                new PthreadThread(this.muxerTask, "HWEncodeManager").start();
            }
            return LJI;
        } catch (Exception e) {
            C38901fq.LJIIIZ(e);
            C47261Igj.LJIILL("HWEncodeManager");
            return -218;
        }
    }

    private void changeFrameRate(int i) {
        this.mNewFrameRate = i;
    }

    public int initStrategyWrapper(long j) {
        HWEncoderStrategyWrapper hWEncoderStrategyWrapper = new HWEncoderStrategyWrapper(j);
        this.mStrategy = hWEncoderStrategyWrapper;
        this.mSettings = hWEncoderStrategyWrapper.getSettings();
        this.mYUVPath = this.mStrategy.getYUVPath();
        String videoOutputPath = this.mStrategy.getVideoOutputPath();
        this.mVideoOutputPath = videoOutputPath;
        if (this.mYUVPath == null || videoOutputPath == null) {
            return -205;
        }
        return 0;
    }

    public void setParams(int i, int i2) {
        if (i == 303 && i2 > 0) {
            changeFrameRate(i2);
            return;
        }
        AbstractC89987ZTj abstractC89987ZTj = this.mEncode;
        if (abstractC89987ZTj.LIZIZ == null) {
            return;
        }
        try {
            if (i != 301) {
                if (i != 302) {
                } else {
                    abstractC89987ZTj.LJIILJJIL = i2;
                }
            } else {
                abstractC89987ZTj.LJIILL = i2;
            }
        } catch (Exception unused) {
            C47261Igj.LJIILL("BXMediaCodecEncoder");
        }
    }

    public int init(String str, String str2, C89979ZTb c89979ZTb) {
        new ZTX();
        throw null;
    }
}
