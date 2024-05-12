package com.ss.videoarch.strategy;

import X.C0ON;
import X.C16880lQ;
import X.C47988IsS;
import X.C48189Ivh;
import X.C48262Iws;
import X.C63832P3k;
import X.C64316PMa;
import X.C79318VBa;
import X.C79319VBb;
import X.C79320VBc;
import X.C79321VBd;
import X.C79322VBe;
import X.C79326VBi;
import X.C79330VBm;
import X.C79331VBn;
import X.C79332VBo;
import X.C79344VCa;
import X.C79346VCc;
import X.C79349VCf;
import X.C79350VCg;
import X.C79352VCi;
import X.C79354VCk;
import X.C79355VCl;
import X.C79366VCw;
import X.C79367VCx;
import X.C79368VCy;
import X.C79369VCz;
import X.CallableC79327VBj;
import X.EnumC79338VBu;
import X.F9J;
import X.InterfaceC63814P2s;
import X.InterfaceC79323VBf;
import X.InterfaceC79328VBk;
import X.PDR;
import X.PMX;
import X.R2K;
import X.RunnableC47915IrH;
import X.ThreadFactoryC38889FOb;
import X.VBC;
import X.VBW;
import X.VBX;
import X.VBY;
import X.VBZ;
import X.VD1;
import X.VD5;
import X.VD6;
import X.VD8;
import X.VD9;
import X.VDA;
import X.VDB;
import X.VDC;
import X.VDD;
import X.VDE;
import X.VDF;
import X.VDH;
import X.VDI;
import X.X1D;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS20S0110000_14;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDBReceiverS10S0100000_14;
import Y.IDHandlerS24S0100000_14;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Base64;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.texturerender.VideoSurface;
import com.ss.videoarch.strategy.dataCenter.config.PlatformDataFetcher;
import com.ss.videoarch.strategy.dataCenter.strategyData.DataWarehouse;
import com.ss.videoarch.strategy.strategy.mpdPreload.MpdPreloadManager;
import com.ss.videoarch.strategy.strategy.networkStrategy.NetworkProber;
import com.ss.videoarch.strategy.strategy.networkStrategy.SettingsManager;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;
import com.ss.videoarch.strategy.strategy.smartStrategy.TopNHostStrategy;
import com.ss.videoarch.strategy.utils.JniTask;
import com.ss.videoarch.strategy.utils.smartStrategy.PitayaWrapper;
import defpackage.a1;
import defpackage.i0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class LiveStrategyManager extends NativeObject {
    public static List<String> mLibraryList = null;
    public static C79349VCf mLiveIOEngine = null;
    public static long mLoadLibraryTime = -1;
    public static boolean mLoadSoSuccess = false;
    public static C79320VBc mSRPredictEngine = null;
    public static long mStartStrategyTime = -1;
    public static volatile LiveStrategyManager sInstance;
    public Intent mBatteryIntent;
    public Handler mChildHandler;
    public Context mContext;
    public String mDeviceId;
    public boolean mDidLocalDNS;
    public VDI mEngine;
    public boolean mFirstStart;
    public boolean mFirstUpdate;
    public VDF mFunctionStartPTYInit;
    public Handler mHandler;
    public Map<Integer, InterfaceC79328VBk> mHashCodeToBundleMap;
    public JSONObject mInitInfo;
    public boolean mIsRunning;
    public InterfaceC79323VBf mLSPreconnListener;
    public long mLastEndTS;
    public Map<String, InterfaceC79328VBk> mListenerMap;
    public VDD mOnDoPreconnectListener;
    public VDE mOnParseDnsCompletionListener;
    public Boolean mPTYSetUpAlready;
    public int mReceiveMessage;
    public Boolean mRetryFlag;
    public VDA mSettingsListener;
    public long mTTLMs = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
    public ThreadPoolExecutor mThreadPool;
    public final BroadcastReceiver networkReceiver;

    private native void nativeCreate();

    private native void nativeSetStreamInfo(String str);

    private native void nativeStart();

    private native void nativeStop();

    private native void nativeStopSession(JSONObject jSONObject);

    public <T> T getInfo(String str, T t) {
        return null;
    }

    public native String nativeExecuteCommand(int i, int i2, int i3, String str);

    static {
        List asList = Arrays.asList("livestrategy");
        ArrayList arrayList = new ArrayList();
        mLibraryList = arrayList;
        arrayList.addAll(asList);
        Iterator<String> it = mLibraryList.iterator();
        while (it.hasNext()) {
            mLoadSoSuccess = loadLibrary(it.next());
        }
        if (mLoadLibraryTime == -1) {
            mLoadLibraryTime = System.currentTimeMillis();
        }
        boolean z = mLoadSoSuccess;
        synchronized (C79326VBi.class) {
            C79326VBi.LIZ = z;
        }
    }

    public static LiveStrategyManager inst() {
        if (sInstance == null) {
            synchronized (LiveStrategyManager.class) {
                if (sInstance == null) {
                    sInstance = new LiveStrategyManager();
                }
            }
        }
        return sInstance;
    }

    private void loadQuicLibrary() {
        if (!loadLibrary("vcbasekit")) {
            return;
        }
        loadLibrary("ttquic");
    }

    public void createHandleForChildThread() {
        this.mHandler = new IDHandlerS24S0100000_14(this, Looper.myLooper(), 1);
    }

    public void start() {
        boolean z;
        String optString;
        if (this.mIsRunning) {
            return;
        }
        this.mIsRunning = true;
        C16880lQ.LJJLIIIJILLIZJL(this.networkReceiver, this.mContext, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.mBatteryIntent = C16880lQ.LJJLIIIJILLIZJL(null, this.mContext, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z2 = false;
        if (C79346VCc.LIZLLL().LJIILIIL.LIZ == 1 && C79346VCc.LIZLLL().LJIILIIL.LJ == 1) {
            C79354VCk.LJLZ = this.mContext;
            ArrayList arrayList = new ArrayList();
            Context context = C79354VCk.LJLZ;
            if (context != null) {
                if (C79354VCk.LJLLL == null) {
                    C79354VCk.LJLLL = F9J.LIZIZ(context, 0, C79354VCk.LJLLLL);
                }
                SharedPreferences sharedPreferences = C79354VCk.LJLLL;
                if (sharedPreferences != null) {
                    Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next().getValue();
                        if (!TextUtils.isEmpty(str)) {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.getBytes(), 0));
                            new C79352VCi();
                            try {
                                C79352VCi c79352VCi = (C79352VCi) new ObjectInputStream(byteArrayInputStream).readObject();
                                if (c79352VCi != null) {
                                    arrayList.add(c79352VCi);
                                }
                            } catch (IOException e) {
                                C16880lQ.LLLLIIL(e);
                            } catch (ClassNotFoundException e2) {
                                C16880lQ.LLLLIIL(e2);
                            } catch (Exception e3) {
                                C16880lQ.LLLLIIL(e3);
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                C79354VCk.LJJLI(arrayList);
                C79354VCk.LJJL();
            }
        }
        VDC.LIZ().LIZ = System.currentTimeMillis() - mLoadLibraryTime;
        if (C79346VCc.LIZLLL().LJIIZILJ == 1) {
            DnsOptimizer.LJFF().LIZIZ = this.mOnDoPreconnectListener;
            if (C79346VCc.LIZLLL().LJIJ == 1 && C79346VCc.LIZLLL().LJIJI == 1) {
                C79349VCf c79349VCf = new C79349VCf();
                mLiveIOEngine = c79349VCf;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C16880lQ.LLIIJLIL(this.mContext).getAbsolutePath());
                LIZ.append("/pullstream.scfg");
                String LIZIZ = X1D.LIZIZ(LIZ);
                String str2 = (String) C79346VCc.LIZLLL().LIZ("live_stream_strategy_preconnect_protocol", "{}");
                c79349VCf.LIZ = (List) C79346VCc.LIZLLL().LIZ("live_stream_strategy_preconnect_domains", new ArrayList());
                String str3 = (String) C79346VCc.LIZLLL().LIZ("live_stream_strategy_peconnect_params", "{}");
                c79349VCf.LJ = ((Long) C79346VCc.LIZLLL().LIZ("live_stream_strategy_peconnect_result_ttl", Long.valueOf(LivePreviewNetworkSpeedThresholdSetting.DEFAULT))).longValue();
                c79349VCf.LJFF = ((Integer) C79346VCc.LIZLLL().LIZ("live_stream_strategy_peconnect_result_capacity", 50)).intValue();
                c79349VCf.LIZLLL = new ArrayMap(c79349VCf.LJFF);
                if (str2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            ((ArrayMap) c79349VCf.LIZIZ).put(next, Integer.valueOf(jSONObject.optInt(next)));
                            if (str3 != null && (optString = new JSONObject(str3).optString(next)) != null) {
                                JSONObject jSONObject2 = new JSONObject(optString);
                                if (next.equals("quic") && !TextUtils.isEmpty(LIZIZ)) {
                                    jSONObject2.put("scfg_address", LIZIZ);
                                }
                                ((ArrayMap) c79349VCf.LIZJ).put(next, jSONObject2);
                            }
                        }
                    } catch (JSONException e4) {
                        C16880lQ.LLLLIIL(e4);
                    }
                }
            }
            if (C79346VCc.LIZLLL().LJIL == 1 || C79346VCc.LIZLLL().LJJIIJZLJL == 1) {
                C79321VBd c79321VBd = VBC.LIZ;
                c79321VBd.LJI = this.mLSPreconnListener;
                c79321VBd.LIZIZ = this.mContext;
                c79321VBd.LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(C16880lQ.LLIIJLIL(c79321VBd.LIZIZ).getAbsolutePath());
                LIZ2.append("/pullstream.scfg");
                c79321VBd.LIZ = X1D.LIZIZ(LIZ2);
                loadQuicLibrary();
                if (mLoadSoSuccess) {
                    VD5 vd5 = new VD5();
                    if (C79346VCc.LIZLLL().LJJIIZ == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    vd5.LIZ = z;
                    vd5.LIZIZ = C79346VCc.LIZLLL().LJJIIZI;
                    vd5.LIZJ = C79346VCc.LIZLLL().LJJIJIIJI;
                    vd5.LIZLLL = C79346VCc.LIZLLL().LJJIJIL;
                    c79321VBd.LJ.LIZIZ(vd5);
                }
            }
        }
        if (C79346VCc.LIZLLL().LJJ == 1) {
            C79320VBc c79320VBc = new C79320VBc();
            mSRPredictEngine = c79320VBc;
            String str4 = (String) C79346VCc.LIZLLL().LIZ("SCREEN_RESOLTION", "{}");
            if (!TextUtils.isEmpty(str4)) {
                try {
                    JSONObject jSONObject3 = new JSONObject(str4);
                    c79320VBc.LJIILL = jSONObject3.optInt("width");
                    c79320VBc.LJIILLIIL = jSONObject3.optInt("height");
                } catch (JSONException e5) {
                    C16880lQ.LLLLIIL(e5);
                }
            }
            c79320VBc.LIZIZ = ((Integer) C79346VCc.LIZLLL().LIZ("live_stream_strategy_enable_sr_asyncinit", 0)).intValue();
            c79320VBc.LIZJ = ((Integer) C79346VCc.LIZLLL().LIZ("live_stream_strategy_enable_dynamic_sr", 0)).intValue();
            String str5 = (String) C79346VCc.LIZLLL().LIZ("live_stream_strategy_sr_config", "{}");
            try {
                if (!TextUtils.isEmpty(str5)) {
                    c79320VBc.LIZIZ(new JSONObject(str5));
                }
            } catch (JSONException e6) {
                C16880lQ.LLLLIIL(e6);
            }
            if (c79320VBc.LIZIZ == 1) {
                String str6 = (String) C79346VCc.LIZLLL().LIZ("live_stream_strategy_sr_kernal_bin_path", LiveGiftNewGifterBadgeSetting.DEFAULT);
                C47988IsS LIZLLL = C47988IsS.LIZLLL();
                c79320VBc.LJIILJJIL = LIZLLL;
                int i = c79320VBc.LJIIIZ;
                int i2 = c79320VBc.LJII;
                int i3 = c79320VBc.LJIIIIZZ;
                int i4 = c79320VBc.LJIIJ;
                if (LIZLLL != null) {
                    C48262Iws c48262Iws = new C48262Iws(1);
                    c48262Iws.LIZLLL(true);
                    if (!c79320VBc.LJIILJJIL.LJ(c48262Iws, 1)) {
                        c79320VBc.LJIIL.LIZ.execute(new RunnableC47915IrH(c79320VBc, i, i2, i3, str6, i4, c48262Iws));
                    }
                }
            }
            c79320VBc.LJIIJJI = true;
        }
        if (C79346VCc.LIZLLL().LJIILLIIL == 1) {
            this.mThreadPool.execute(new ARunnableS50S0100000_14(this, 132));
        } else {
            PMX.LIZIZ().LIZIZ.LIZIZ(null, false);
        }
        if (mLoadSoSuccess) {
            nativeStart();
            JniTask jniTask = VD8.LIZ;
            jniTask.getClass();
            if (C79346VCc.LIZLLL().LJJJI == 1) {
                z2 = true;
            }
            jniTask.LIZ.LIZ.execute(new ARunnableS20S0110000_14(jniTask, z2, 7));
            if (C79346VCc.LIZLLL().LJIILIIL.LIZ == 1) {
                SettingsManager.getInstance().loadDB();
                if (!this.mDidLocalDNS) {
                    DnsOptimizer.LJFF().LIZLLL(TopNHostStrategy.LIZJ().runStrategy());
                }
            }
        }
    }

    public void stop() {
        if (!this.mIsRunning) {
            return;
        }
        this.mIsRunning = false;
        this.mHandler.removeMessages(1024);
        this.mHandler.removeMessages(1025);
        this.mHandler.removeMessages(1026);
        C16880lQ.LJJLIIIJL(this.mContext, this.networkReceiver);
        this.mHandler.post(new ARunnableS50S0100000_14(this, 129));
        if (this.mSettingsListener != null) {
            C79355VCl c79355VCl = PMX.LIZIZ().LIZIZ;
            ((HashSet) c79355VCl.LIZLLL).remove(this.mSettingsListener);
            this.mSettingsListener = null;
        }
        if (mLoadSoSuccess) {
            nativeStop();
        }
    }

    public void updateGlobalSettings() {
        if (this.mFirstUpdate) {
            this.mFirstUpdate = false;
            if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableDnsOptimizer == 1) {
                DnsOptimizer.LJFF().LIZ = this.mOnParseDnsCompletionListener;
            }
            C79331VBn.LIZIZ().LIZ();
            Handler handler = this.mChildHandler;
            if (handler != null) {
                initPitaya(handler);
            } else {
                initPitaya(this.mHandler);
            }
        }
        C79320VBc c79320VBc = mSRPredictEngine;
        if (c79320VBc != null) {
            c79320VBc.getClass();
            JSONObject jSONObject = C79346VCc.LIZLLL().LIZ;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("BatchSettingsParams")) {
                        String optString = jSONObject.optJSONObject("BatchSettingsParams").optJSONObject("live_stream_strategy_engine").optString("2");
                        if (optString != null && optString.startsWith("\ufeff")) {
                            optString = optString.substring(1);
                        }
                        JSONObject optJSONObject = new JSONObject(optString).optJSONObject("SRConfig");
                        if (optJSONObject != null) {
                            c79320VBc.LIZIZ(optJSONObject);
                        }
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        long j = C79346VCc.LIZLLL().LJJIFFI * 1000;
        long j2 = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        if (j >= LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            j2 = C79346VCc.LIZLLL().LJJIFFI * 1000;
        }
        this.mTTLMs = j2;
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableDnsOptimizer == 1) {
            DnsOptimizer.LJFF().LJIIJJI(null);
        }
        this.mHandler.removeMessages(1024);
        this.mHandler.sendEmptyMessageDelayed(1024, this.mTTLMs);
    }

    public LiveStrategyManager() {
        Boolean bool = Boolean.FALSE;
        this.mRetryFlag = bool;
        this.mPTYSetUpAlready = bool;
        this.mListenerMap = new ConcurrentHashMap();
        this.mHashCodeToBundleMap = new ConcurrentHashMap();
        this.mFirstStart = true;
        this.mFirstUpdate = true;
        this.mChildHandler = null;
        this.mDeviceId = "";
        this.mDidLocalDNS = false;
        this.mOnParseDnsCompletionListener = new C79367VCx(this);
        this.mOnDoPreconnectListener = new VD9(this);
        this.mLSPreconnListener = new C79344VCa(this);
        this.mHandler = new IDHandlerS24S0100000_14(this, C16880lQ.LLJJJJ(), 0);
        this.networkReceiver = new IDBReceiverS10S0100000_14(this, 1);
    }

    private String getStringNetworkType() {
        String str;
        int networkType = getNetworkType();
        if (networkType != 1) {
            if (networkType != 2) {
                if (networkType != 3) {
                    if (networkType != 4) {
                        if (networkType != 5) {
                            str = "NONE";
                        } else {
                            str = "4g";
                        }
                    } else {
                        str = "wifi";
                    }
                } else {
                    str = "3g";
                }
            } else {
                str = "2g";
            }
        } else {
            str = "mobile";
        }
        return str.toUpperCase();
    }

    private int getSuggestSendingRate() {
        int i = 0;
        JSONObject jSONObject = (JSONObject) inst().getConfigAndStrategyByKeyInt(0, 20, null, new JSONObject());
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            String str = "";
            while (keys.hasNext()) {
                String valueOf = String.valueOf(keys.next());
                String optString = jSONObject.optString(valueOf);
                if (!TextUtils.equals(valueOf, "BandwidthDecision")) {
                    if (TextUtils.equals(valueOf, "Bandwidth")) {
                        i = CastIntegerProtector.valueOf(optString).intValue();
                    }
                    if (!str.equals("")) {
                        str = i0.LJFF(str, "&");
                    }
                    str = C0ON.LIZJ(str, valueOf, "=", optString);
                }
            }
        }
        return i;
    }

    public int getNetworkType() {
        VDC.LIZ();
        return C48189Ivh.LJ(SDKMonitorUtils.LIZIZ(VDC.LIZIZ).LIZ).getValue();
    }

    private String getStrategyConfigByName(String str) {
        if (C79346VCc.LIZLLL().LJIIIIZZ == null) {
            return "";
        }
        return SettingsManager.getInstance().getStrategyConfigByName(C79346VCc.LIZLLL().LJIIIIZZ.toString(), str);
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo LJJLI;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
            if (connectivityManager == null || (LJJLI = C16880lQ.LJJLI(connectivityManager)) == null) {
                return false;
            }
            if (!LJJLI.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean loadLibrary(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C16880lQ.LLJJJIL(str);
                return true;
            }
            throw new Exception("Invalid library name.");
        } catch (Throwable unused) {
            return false;
        }
    }

    private void releaseHashCodeToBundleMap(String str) {
        InterfaceC79328VBk interfaceC79328VBk;
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableSetConfigToLiveIO == 1 && (interfaceC79328VBk = this.mListenerMap.get(str)) != null) {
            this.mHashCodeToBundleMap.remove(interfaceC79328VBk.LIZ("HashCode", 0));
        }
    }

    private void sendEmptyMsg(int i) {
        ThreadPoolExecutor threadPoolExecutor;
        if (C79346VCc.LIZLLL().LJIILLIIL == 1 && (threadPoolExecutor = this.mThreadPool) != null) {
            threadPoolExecutor.execute(new ARunnableS18S0101000_14(i, this, 14));
        } else {
            this.mHandler.removeMessages(i);
            this.mHandler.sendEmptyMessage(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setHashCodeToBundleMap(InterfaceC79328VBk interfaceC79328VBk) {
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableSetConfigToLiveIO == 1 && interfaceC79328VBk != null) {
            this.mHashCodeToBundleMap.put(interfaceC79328VBk.LIZ("HashCode", 0), interfaceC79328VBk);
        }
    }

    public void doLocalDnsOperator(Context context) {
        this.mDidLocalDNS = true;
        if (VD1.LJLIL == null) {
            VD1.LJLIL = new VD1(context);
        }
        DataWarehouse.init(context);
        SettingsManager.getInstance().loadDB();
        DnsOptimizer.LJFF().LIZLLL(TopNHostStrategy.LIZJ().runStrategy());
    }

    public String getPreconnResult(String str) {
        if (!mLoadSoSuccess || C79346VCc.LIZLLL().LJJIIJZLJL != 1 || C79346VCc.LIZLLL().LJJIJIIJIL != 1) {
            return "";
        }
        return VBC.LIZ.LJ.LIZ(str);
    }

    public void initPitaya(Handler handler) {
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUsePTY == 1) {
            PitayaWrapper.LIZIZ().LIZ = this.mHandler;
            PitayaWrapper.LIZIZ().LJII = C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableInitPtyByStrategy;
            PitayaWrapper LIZIZ = PitayaWrapper.LIZIZ();
            Context context = this.mContext;
            JSONObject jSONObject = this.mInitInfo;
            VDC.LIZ();
            LIZIZ.LIZ(context, VDC.LIZIZ, jSONObject);
            if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableRegisterPtyFeatureCenter == 1) {
                PitayaWrapper.LIZIZ().LIZJ();
            }
        }
    }

    public void releaseFeatureDataBundle(String str) {
        releaseHashCodeToBundleMap(str);
        this.mListenerMap.remove(str);
    }

    public void setAppInfoBundle(InterfaceC79328VBk interfaceC79328VBk) {
        String str;
        C79346VCc LIZLLL = C79346VCc.LIZLLL();
        if (interfaceC79328VBk == null) {
            LIZLLL.getClass();
        } else {
            LIZLLL.LJJJJI = interfaceC79328VBk;
            LIZLLL.LJIIZILJ = ((Integer) interfaceC79328VBk.LIZ("live_stream_strategy_enable_open_preconnect", 0)).intValue();
            LIZLLL.LJIILLIIL = ((Integer) LIZLLL.LJJJJI.LIZ("live_stream_strategy_enable_performance_optimization", 0)).intValue();
            LIZLLL.LJJII = ((Long) LIZLLL.LJJJJI.LIZ("live_stream_strategy_start_up_delay", 0L)).longValue();
            LIZLLL.LJIJ = ((Integer) LIZLLL.LJJJJI.LIZ("live_sdk_enable_liveio", 0)).intValue();
            LIZLLL.LJIJI = ((Integer) LIZLLL.LJJJJI.LIZ("live_sdk_enable_liveio_engine", 0)).intValue();
            LIZLLL.LJIJJLI = ((Integer) LIZLLL.LJJJJI.LIZ("live_stream_strategy_enable_thread_timeout", 1)).intValue();
            LIZLLL.LJIL = ((Integer) LIZLLL.LJJJJI.LIZ("live_stream_strategy_enable_hot_domain_precnn", 0)).intValue();
            LIZLLL.LJJIIJZLJL = ((Integer) LIZLLL.LJJJJI.LIZ("live_stream_strategy_enable_room_info_precnn", 0)).intValue();
            LIZLLL.LJJIIZ = ((Integer) LIZLLL.LJJJJI.LIZ("live_stream_strategy_enable_H2Q_precnn", 0)).intValue();
            LIZLLL.LJJIIZI = ((Integer) LIZLLL.LJJJJI.LIZ("live_stream_strategy_socket_idle_timeout", 0)).intValue();
            LIZLLL.LJJIJ = ((Integer) LIZLLL.LJJJJI.LIZ("live_stream_strategy_enable_precnn_probe", 0)).intValue();
            LIZLLL.LJJIJIIJI = ((Integer) LIZLLL.LJJJJI.LIZ("live_get_precnn_ip_timeout", 0)).intValue();
            LIZLLL.LJJIJIIJIL = ((Integer) LIZLLL.LJJJJI.LIZ("live_stream_strategy_enable_get_precnn_ip", 0)).intValue();
            LIZLLL.LJJIJIL = ((Integer) LIZLLL.LJJJJI.LIZ("live_enable_pre_created_player", 0)).intValue();
            LIZLLL.LJJ = ((Integer) LIZLLL.LJJJJI.LIZ("live_sdk_super_resolution_enable", 0)).intValue();
            C79368VCy c79368VCy = LIZLLL.LJIILIIL;
            String str2 = (String) LIZLLL.LJJJJI.LIZ("live_stream_strategy_enable_persistence", "");
            c79368VCy.getClass();
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject = new JSONObject(str2);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                c79368VCy.LIZ = jSONObject.optInt("enable");
                c79368VCy.LJIIJ = jSONObject.optString("node_table");
                c79368VCy.LJIIJJI = jSONObject.optString("his_table");
                c79368VCy.LJIIL = jSONObject.optString("config_table");
                if (!TextUtils.isEmpty(c79368VCy.LJIIJJI)) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2 = new JSONObject(c79368VCy.LJIIJJI);
                    } catch (JSONException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                    c79368VCy.LJ = jSONObject2.optInt("enable");
                    if (jSONObject2.has("update_limit")) {
                        c79368VCy.LJFF = jSONObject2.optInt("update_limit");
                    }
                    if (jSONObject2.has("record_limit")) {
                        c79368VCy.LJI = jSONObject2.optInt("record_limit");
                    }
                }
                if (!TextUtils.isEmpty(c79368VCy.LJIIJ)) {
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3 = new JSONObject(c79368VCy.LJIIJ);
                    } catch (JSONException e3) {
                        C16880lQ.LLLLIIL(e3);
                    }
                    c79368VCy.LIZIZ = jSONObject3.optInt("enable");
                    if (jSONObject3.has("cache_time")) {
                        c79368VCy.LIZJ = jSONObject3.optInt("cache_time");
                    }
                    if (jSONObject3.has("update_limit")) {
                        c79368VCy.LIZLLL = jSONObject3.optInt("update_limit");
                    }
                }
                if (!TextUtils.isEmpty(c79368VCy.LJIIL)) {
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4 = new JSONObject(c79368VCy.LJIIL);
                    } catch (JSONException e4) {
                        C16880lQ.LLLLIIL(e4);
                    }
                    c79368VCy.LJII = jSONObject4.optInt("enable");
                    if (jSONObject4.has("update_limit")) {
                        c79368VCy.LJIIIIZZ = jSONObject4.optInt("update_limit");
                    }
                    if (jSONObject4.has("delay_time")) {
                        c79368VCy.LJIIIZ = jSONObject4.optInt("delay_time");
                    }
                }
            }
            LIZLLL.LJJI = ((Integer) LIZLLL.LJJJJI.LIZ("live_stream_strategy_enable_get_httpdns_ip_first", 0)).intValue();
            LIZLLL.LJJIJL = ((Integer) LIZLLL.LJJJJI.LIZ("live_sdk_enable_settingmgr_char", 0)).intValue();
            LIZLLL.LJJIJLIJ = ((Integer) LIZLLL.LJJJJI.LIZ("live_sdk_enable_settingmgr_topn", 0)).intValue();
            LIZLLL.LJJIL = ((Integer) LIZLLL.LJJJJI.LIZ("live_sdk_enable_data_warehouse", 0)).intValue();
            ((Integer) LIZLLL.LJJJJI.LIZ("live_sdk_enable_get_ipv6_httpdns_ip_first", 0)).intValue();
            LIZLLL.LJJIZ = ((Integer) LIZLLL.LJJJJI.LIZ("live_sdk_request_max_retry_times", 5)).intValue();
            LIZLLL.LJJJ = ((Integer) LIZLLL.LJJJJI.LIZ("live_sdk_request_retry_sync_interval", 10000)).intValue();
            LIZLLL.LJJJI = ((Integer) LIZLLL.LJJJJI.LIZ("live_sdk_enable_new_thread", 0)).intValue();
        }
        if (C79346VCc.LIZLLL().LJIILIIL.LIZ == 1) {
            Context context = this.mContext;
            if (VD1.LJLIL == null) {
                VD1.LJLIL = new VD1(context);
            }
            DataWarehouse.init(this.mContext);
        }
        Context context2 = this.mContext;
        JSONObject jSONObject5 = this.mInitInfo;
        String str3 = (String) C79346VCc.LIZLLL().LIZ("live_stream_strategy_slardar_host", "");
        if (jSONObject5 != null && context2 != null && !TextUtils.isEmpty(str3)) {
            HashMap hashMap = new HashMap();
            if (jSONObject5.has("oversea") && jSONObject5.optInt("oversea") == 1) {
                hashMap.put("oversea", "1");
            }
            try {
                VDC.LIZ();
                jSONObject5.put("sdk_version", "1.4.115.4");
            } catch (JSONException e5) {
                C16880lQ.LLLLIIL(e5);
            }
            if (jSONObject5.has("app_session_id")) {
                str = jSONObject5.optString("app_session_id");
            } else {
                str = null;
            }
            List asList = Arrays.asList(a1.LJ("https://", str3, "/monitor/appmonitor/v2/settings"));
            List asList2 = Arrays.asList(a1.LJ("https://", str3, "/monitor/collect/"));
            VDC.LIZ();
            SDKMonitorUtils.LIZLLL(VDC.LIZIZ, asList);
            VDC.LIZ();
            SDKMonitorUtils.LJ(VDC.LIZIZ, asList2);
            Context LLLLL = C16880lQ.LLLLL(context2);
            VDC.LIZ();
            SDKMonitorUtils.LIZJ(LLLLL, VDC.LIZIZ, jSONObject5, new PDR(str, hashMap));
            VDH.LIZ = true;
        }
        PlatformDataFetcher.init(interfaceC79328VBk);
        if (interfaceC79328VBk != null && ((Integer) interfaceC79328VBk.LIZ("live_sdk_enable_mpd_prelaod", 0)).intValue() == 1) {
            MpdPreloadManager.getInstance().init(this.mContext);
        }
    }

    public void setFunctionStartPTYInit(VDF vdf) {
        this.mFunctionStartPTYInit = vdf;
    }

    public void setIFunctionCalledByStrategyEngine(VDI vdi) {
        C79349VCf c79349VCf = mLiveIOEngine;
        if (c79349VCf != null) {
            c79349VCf.getClass();
        }
    }

    public void setSupportSRScene(boolean z) {
        if (mSRPredictEngine != null && VBW.LIZIZ().LIZIZ != 1) {
            C79320VBc c79320VBc = mSRPredictEngine;
            if (c79320VBc.LJJIJIIJIL == 0 && z && c79320VBc.LJJIIJ != 0 && !((CopyOnWriteArrayList) c79320VBc.LJIILIIL).isEmpty()) {
                Iterator it = ((CopyOnWriteArrayList) c79320VBc.LJIILIIL).iterator();
                while (it.hasNext()) {
                    VideoSurface videoSurface = (VideoSurface) it.next();
                    if (videoSurface != null) {
                        videoSurface.LJJIIJ(1);
                    }
                }
            }
            c79320VBc.LJJIJIIJIL = z ? 1 : 0;
        }
        VBW LIZIZ = VBW.LIZIZ();
        if (LIZIZ.LJJ == 0 && z && LIZIZ.LJIJ != 0 && !((CopyOnWriteArrayList) LIZIZ.LJII).isEmpty()) {
            Iterator it2 = ((CopyOnWriteArrayList) LIZIZ.LJII).iterator();
            while (it2.hasNext()) {
                VideoSurface videoSurface2 = (VideoSurface) it2.next();
                if (videoSurface2 != null) {
                    videoSurface2.LJJIIJ(1);
                }
            }
        }
        LIZIZ.LJJ = z ? 1 : 0;
    }

    public void stopSession(JSONObject jSONObject) {
        if (mLoadSoSuccess) {
            nativeStopSession(jSONObject);
        }
        if (mSRPredictEngine == null || VBW.LIZIZ().LIZIZ == 1) {
            if (C79320VBc.LJJIJIL == null) {
                synchronized (C79320VBc.class) {
                    if (C79320VBc.LJJIJIL == null) {
                        C79320VBc.LJJIJIL = new C79320VBc();
                    }
                }
            }
            C79320VBc.LJJIJIL.stopSession(jSONObject);
            return;
        }
        mSRPredictEngine.stopSession(jSONObject);
    }

    public void triggerSRPredict(JSONObject jSONObject) {
        if (mSRPredictEngine == null || VBW.LIZIZ().LIZIZ == 1) {
            VBW LIZIZ = VBW.LIZIZ();
            if (LIZIZ.LIZIZ == 0 || jSONObject == null || !LIZIZ.LJI) {
                return;
            }
            LIZIZ.LJIJI = LIZIZ.LJIJ;
            ((ArrayList) LIZIZ.LJIL).clear();
            Handler handler = LIZIZ.LIZLLL;
            if (handler != null) {
                handler.removeMessages(1025);
            }
            Object opt = jSONObject.opt("textureSurface");
            if (opt != null && (opt instanceof VideoSurface)) {
                ((CopyOnWriteArrayList) LIZIZ.LJII).add(opt);
            }
            ((ArrayList) LIZIZ.LJIL).addAll(LIZIZ.LJ);
            if (!((ArrayList) LIZIZ.LJIL).isEmpty()) {
                LIZIZ.LJIJJLI = ((Integer) ListProtector.get(LIZIZ.LJIL, 0)).intValue();
                ListProtector.remove(LIZIZ.LJIL, 0);
            }
            Handler handler2 = LIZIZ.LIZLLL;
            if (handler2 == null) {
                return;
            }
            int i = LIZIZ.LJIJJLI;
            if (i > 0) {
                LIZIZ.LJIJ = 0;
            }
            handler2.postDelayed(new ARunnableS50S0100000_14(LIZIZ, 138), i);
            return;
        }
        C79320VBc c79320VBc = mSRPredictEngine;
        if (c79320VBc.LIZJ == 0 || jSONObject == null || !c79320VBc.LJIIJJI) {
            return;
        }
        c79320VBc.LJJIIJZLJL = c79320VBc.LJJIIJ;
        ((ArrayList) c79320VBc.LJJIJIIJI).clear();
        Handler handler3 = c79320VBc.LJ;
        if (handler3 != null) {
            handler3.removeMessages(1025);
        }
        Object opt2 = jSONObject.opt("textureSurface");
        if (opt2 != null && (opt2 instanceof VideoSurface)) {
            ((CopyOnWriteArrayList) c79320VBc.LJIILIIL).add(opt2);
        }
        c79320VBc.LJJIIZI = c79320VBc.LJIIIZ;
        if (c79320VBc.LIZLLL == 1) {
            if (c79320VBc.LJIILL <= 0 || c79320VBc.LJIILLIIL <= 0) {
                String str = (String) C79346VCc.LIZLLL().LIZ("SCREEN_RESOLTION", "{}");
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str);
                        c79320VBc.LJIILL = jSONObject2.optInt("width");
                        c79320VBc.LJIILLIIL = jSONObject2.optInt("height");
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            if (c79320VBc.LJIILL > 0 && c79320VBc.LJIILLIIL > 0) {
                int optInt = jSONObject.optInt("width");
                int optInt2 = jSONObject.optInt("height");
                if (optInt > 0 && optInt2 > 0) {
                    int i2 = c79320VBc.LJIIIZ;
                    if (i2 == 0) {
                        if (optInt * 2 > c79320VBc.LJIILL || optInt2 * 2 > c79320VBc.LJIILLIIL) {
                            c79320VBc.LJJIIJ = 0;
                            return;
                        }
                    } else if (i2 == 4 && ((optInt * 3) / 2 > c79320VBc.LJIILL || (optInt2 * 3) / 2 > c79320VBc.LJIILLIIL)) {
                        c79320VBc.LJJIIJ = 0;
                        return;
                    }
                }
            }
        }
        ((ArrayList) c79320VBc.LJJIJIIJI).addAll(c79320VBc.LJFF);
        if (!((ArrayList) c79320VBc.LJJIJIIJI).isEmpty()) {
            c79320VBc.LJJIJ = ((Integer) ListProtector.get(c79320VBc.LJJIJIIJI, 0)).intValue();
            ListProtector.remove(c79320VBc.LJJIJIIJI, 0);
        }
        Handler handler4 = c79320VBc.LJ;
        if (handler4 == null) {
            return;
        }
        if (c79320VBc.LJJIJ > 0) {
            c79320VBc.LJJIIJ = 0;
        }
        handler4.postDelayed(new ARunnableS50S0100000_14(c79320VBc, 137), r1 * 1000);
    }

    public <T> T getAppInfoForKey(String str, T t) {
        if (str != null) {
            return (T) C79346VCc.LIZLLL().LIZ(str, t);
        }
        return t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000c, code lost:
    
        if (r4 != 3) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getConfigAndStrategyBundle(int r4, org.json.JSONObject r5) {
        /*
            r3 = this;
            boolean r0 = r3.mIsRunning
            r2 = 0
            if (r0 != 0) goto L6
            return r2
        L6:
            if (r4 == 0) goto L18
            r0 = 1
            if (r4 == r0) goto Lf
            r0 = 3
            if (r4 == r0) goto L18
        Le:
            return r2
        Lf:
            X.PMa r0 = X.C64316PMa.LIZLLL()
            r0.LIZJ = r5
            java.lang.String r1 = "1"
            goto L2a
        L18:
            X.VCg r1 = X.C79350VCg.LJ()
            java.util.concurrent.locks.ReentrantLock r0 = r1.LJI
            r0.lock()
            r1.LJFF = r5
            java.util.concurrent.locks.ReentrantLock r0 = r1.LJI
            r0.unlock()
            java.lang.String r1 = "2"
        L2a:
            X.VCc r0 = X.C79346VCc.LIZLLL()
            org.json.JSONObject r0 = r0.LIZIZ(r4, r1)
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.LiveStrategyManager.getConfigAndStrategyBundle(int, org.json.JSONObject):java.lang.String");
    }

    public float getFloatValue(int i, float f) {
        String str;
        if (i != 12) {
            str = null;
        } else {
            str = "attenuation_coefficient";
        }
        try {
            return ((Float) getAppInfoForKey(str, Float.valueOf(f))).floatValue();
        } catch (Exception unused) {
            return f;
        }
    }

    public long getInt64Value(String str, long j) {
        return ((Long) getAppInfoForKey(str, Long.valueOf(j))).longValue();
    }

    public int getIntValue(int i, int i2) {
        String str;
        switch (i) {
            case 9:
                str = "min_start_play_buffer";
                break;
            case 10:
                str = "max_start_play_buffer";
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                str = "attenuation_time_offset";
                break;
            default:
                str = null;
                break;
        }
        return ((Integer) getAppInfoForKey(str, Integer.valueOf(i2))).intValue();
    }

    public void init(Context context, JSONObject jSONObject) {
        this.mContext = context;
        if (mLoadSoSuccess) {
            nativeCreate();
        }
        if (jSONObject != null) {
            this.mInitInfo = jSONObject;
            if (jSONObject.has("host_aid") && (jSONObject.optString("host_aid").equals("1233") || jSONObject.optString("host_aid").equals("1180"))) {
                VDC.LIZ();
                VDC.LIZIZ = "330360";
            }
            if (jSONObject.has("device_id")) {
                this.mDeviceId = jSONObject.optString("device_id");
            }
        }
        if (this.mSettingsListener == null) {
            this.mSettingsListener = new C79366VCw(this);
            C79355VCl c79355VCl = PMX.LIZIZ().LIZIZ;
            ((HashSet) c79355VCl.LIZLLL).add(this.mSettingsListener);
        }
        PMX.LIZIZ().getClass();
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38889FOb());
        this.mThreadPool = pThreadPoolExecutor;
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public void registerStrategyConfigUpdate(String str, VDB vdb) {
        SettingsManager.getInstance().registerStrategyConfigUpdate(str, vdb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setEventInfo(int r6, org.json.JSONObject r7) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.LiveStrategyManager.setEventInfo(int, org.json.JSONObject):void");
    }

    public void setFeatureDataBundle(String str, InterfaceC79328VBk interfaceC79328VBk) {
        if (this.mListenerMap.size() > C79346VCc.LIZLLL().LJIIL.LIZLLL.mDataBundleCount) {
            this.mListenerMap.clear();
            this.mHashCodeToBundleMap.clear();
        }
        this.mListenerMap.put(str, interfaceC79328VBk);
        setHashCodeToBundleMap(interfaceC79328VBk);
    }

    private void uploadNodeOptimizeService(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableDnsOptimizer == 1) {
            DnsOptimizer.LJFF().LJII.LIZIZ++;
            if (jSONObject2.has("hostList")) {
                DnsOptimizer.LJFF().LJII.LIZJ = -1;
            } else if (jSONObject2.has("host")) {
                DnsOptimizer.LJFF().LJII.LIZJ = i;
                DnsOptimizer.LJFF().LJII.LJIIJJI = jSONObject2.optString("host");
                DnsOptimizer.LJFF().LJII.LJIILIIL = jSONObject2.optString("stream_session_vv_id", LiveGiftNewGifterBadgeSetting.DEFAULT);
                if (jSONObject != null) {
                    String optString = jSONObject.optString("Ip", LiveGiftNewGifterBadgeSetting.DEFAULT);
                    DnsOptimizer.LJFF().LJII.LIZ = !optString.equals(LiveGiftNewGifterBadgeSetting.DEFAULT) ? 1 : 0;
                    DnsOptimizer.LJFF().LJII.LJIIL = optString;
                    DnsOptimizer.LJFF().LJII.LJIIJ = jSONObject.optString("EvaluatorSymbol", LiveGiftNewGifterBadgeSetting.DEFAULT);
                    DnsOptimizer.LJFF().LJII.LIZLLL = VDC.LIZ().LIZ;
                    if (DnsOptimizer.LJFF().LJII.LIZ == 0) {
                        DnsOptimizer.LJFF().LJII.LJ = jSONObject.optBoolean("HasGetDomainInfos", false) ? 1 : 0;
                        DnsOptimizer.LJFF().LJII.LJFF = jSONObject.optBoolean("IsHostContained", false) ? 1 : 0;
                        DnsOptimizer.LJFF().LJII.LJI = jSONObject.optBoolean("HasLocalDNSResult", false) ? 1 : 0;
                        DnsOptimizer.LJFF().LJII.LJII = jSONObject.optBoolean("HasResetDNSResults", false) ? 1 : 0;
                        DnsOptimizer.LJFF().LJII.LJIIIIZZ = jSONObject.optBoolean("RetryFailStopSchedule", false) ? 1 : 0;
                    }
                }
            }
            DnsOptimizer.LJFF().LJII.uploadMonitorLog();
        }
    }

    public void notifyInfo(int i, int i2, String str) {
        C79349VCf c79349VCf;
        if (i != 2 || i2 != 0 || (c79349VCf = mLiveIOEngine) == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str2 = "";
            if (jSONObject.has(C63832P3k.LIZ)) {
                str2 = jSONObject.optString(C63832P3k.LIZ);
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
            }
            Map<String, VD6> map = c79349VCf.LIZLLL;
            if (map == null) {
                return;
            }
            if (((ArrayMap) map).size() >= c79349VCf.LJFF) {
                c79349VCf.LIZ();
            }
            ((ArrayMap) c79349VCf.LIZLLL).put(str2, new VD6(jSONObject, System.currentTimeMillis()));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setRoomInfo(String str, int i, long j) {
        boolean z;
        String str2;
        int i2;
        JSONObject optJSONObject;
        String str3;
        int i3;
        String str4;
        if (!mLoadSoSuccess) {
            return;
        }
        if (i == 50) {
            boolean z2 = true;
            if (C79346VCc.LIZLLL().LJJIIJZLJL == 1) {
                C79321VBd c79321VBd = VBC.LIZ;
                int suggestSendingRate = getSuggestSendingRate();
                String stringNetworkType = getStringNetworkType();
                c79321VBd.getClass();
                String str5 = null;
                if (!TextUtils.isEmpty(str)) {
                    C79369VCz c79369VCz = new C79369VCz();
                    c79369VCz.LJ = suggestSendingRate;
                    c79369VCz.LJFF = stringNetworkType;
                    try {
                        JSONObject jSONObject = new JSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(new JSONObject(new JSONObject(str).optString("stream_info")), "data"), "origin"), "main").optString("sdk_params"));
                        if (jSONObject.has("EnableLiveStartingOpt")) {
                            if (jSONObject.optInt("EnableLiveStartingOpt") == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = c79369VCz.LIZ;
                        }
                        c79369VCz.LIZ = z;
                        if (jSONObject.has("EnableNetworkClass")) {
                            str2 = jSONObject.optString("EnableNetworkClass");
                        } else {
                            str2 = c79369VCz.LIZIZ;
                        }
                        c79369VCz.LIZIZ = str2;
                        if (jSONObject.has("EnableSuggestSendingRate")) {
                            i2 = jSONObject.optInt("EnableSuggestSendingRate");
                        } else {
                            i2 = c79369VCz.LIZJ;
                        }
                        c79369VCz.LIZJ = i2;
                        if (jSONObject.has("httpx") && (optJSONObject = jSONObject.optJSONObject("httpx")) != null) {
                            if (optJSONObject.has("HttpConfigJson")) {
                                str3 = optJSONObject.optString("HttpConfigJson");
                            } else {
                                str3 = c79369VCz.LIZLLL;
                            }
                            c79369VCz.LIZLLL = str3;
                            if (optJSONObject.has("UseLSQUIC")) {
                                i3 = optJSONObject.optInt("UseLSQUIC");
                            } else {
                                i3 = c79369VCz.LJI;
                            }
                            c79369VCz.LJI = i3;
                            if (optJSONObject.has("LSEngineParamJson")) {
                                str4 = optJSONObject.optString("LSEngineParamJson");
                            } else {
                                str4 = c79369VCz.LJII;
                            }
                            c79369VCz.LJII = str4;
                        }
                        c79321VBd.LJ.LIZJ(c79369VCz);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                C79321VBd c79321VBd2 = VBC.LIZ;
                c79321VBd2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        C79322VBe LIZJ = C79321VBd.LIZJ(new JSONObject(new JSONObject(str).optString("stream_info")));
                        if (!TextUtils.isEmpty(LIZJ.LIZ) && c79321VBd2.LJI != null) {
                            String str6 = LIZJ.LIZ;
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2 = new JSONObject().put("host", str6);
                            } catch (JSONException e2) {
                                C16880lQ.LLLLIIL(e2);
                            }
                            JSONObject LJ = DnsOptimizer.LJFF().LJ(jSONObject2, null);
                            if (LJ != null) {
                                if (LJ.has("Ip")) {
                                    str5 = LJ.optString("Ip");
                                } else {
                                    str5 = "";
                                }
                            }
                            String str7 = LIZJ.LIZ;
                            if (LIZJ.LIZIZ != EnumC79338VBu.QUIC) {
                                z2 = false;
                            }
                            c79321VBd2.LIZIZ(str7, str5, z2);
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        SettingsManager.getInstance().SetSDKParams(str);
    }

    public void setStreamInfo(String str, String str2, String str3) {
        if (mLoadSoSuccess) {
            nativeSetStreamInfo(str3);
        }
    }

    public JSONObject executeCommand(int i, int i2, int i3, JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (!mLoadSoSuccess) {
            return null;
        }
        try {
            String str = (String) this.mThreadPool.submit(new CallableC79327VBj(this, i2, i3, jSONObject, i)).get();
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                jSONObject2 = new JSONObject(str);
                return jSONObject2;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return jSONObject2;
            }
        } catch (InterruptedException | ExecutionException e2) {
            C16880lQ.LLLLIIL(e2);
            return jSONObject2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v18, types: [org.json.JSONObject, T] */
    /* JADX WARN: Type inference failed for: r15v19, types: [org.json.JSONObject, T] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.util.List, T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v26, types: [java.util.List, T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v7, types: [org.json.JSONObject, T] */
    public <T> T getConfigAndStrategyByKeyInt(int i, int i2, T t, JSONObject jSONObject) {
        String str;
        ?? r15;
        Object obj;
        T t2;
        VD6 vd6;
        boolean z;
        R2K r2k;
        if (!this.mIsRunning && i2 == 13) {
            try {
                new JSONObject().put("StartStrategySDKCost", -1);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        boolean z2 = true;
        Object obj2 = null;
        if (i != 0) {
            if (i != 1) {
                str = null;
            } else {
                str = "1";
                C64316PMa.LIZLLL().LIZJ = jSONObject;
            }
        } else {
            str = "2";
            C79350VCg LJ = C79350VCg.LJ();
            LJ.LJI.lock();
            LJ.LJFF = jSONObject;
            LJ.LJI.unlock();
        }
        if (str != null) {
            C79346VCc.LIZLLL().LIZIZ(-1, str);
        }
        T t3 = (T) C79346VCc.LIZLLL().LIZ("TTNet_NQE_INFO", "");
        if (i2 != 51) {
            if (i2 != 52) {
                int i3 = 0;
                switch (i2) {
                    case 12:
                        JSONObject runStrategy = C79331VBn.LIZIZ().runStrategy();
                        if (runStrategy == null) {
                            return t;
                        }
                        return (T) Long.valueOf(runStrategy.optLong("result"));
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        if (jSONObject == null) {
                            return t;
                        }
                        if (jSONObject.has("hostList")) {
                            JSONArray optJSONArray = jSONObject.optJSONArray("hostList");
                            DnsOptimizer LJFF = DnsOptimizer.LJFF();
                            LJFF.getClass();
                            if (optJSONArray != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                ArrayList arrayList = new ArrayList();
                                while (i3 < optJSONArray.length()) {
                                    String optString = optJSONArray.optString(i3);
                                    R2K r2k2 = (R2K) ((ConcurrentHashMap) DnsOptimizer.LJJJI).get(optString);
                                    if (r2k2 != null) {
                                        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUseNewOptRecordStruct == 1) {
                                            obj2 = r2k2.LJFF(LJFF.LJJIJL, LJFF.LJIIIIZZ());
                                        } else {
                                            obj2 = r2k2.LJ(LJFF.LJIIIIZZ());
                                        }
                                        if (obj2 == null) {
                                            arrayList.add(optString);
                                        }
                                    } else {
                                        arrayList.add(optString);
                                    }
                                    if (obj2 != null) {
                                        obj = obj2;
                                    } else {
                                        obj = LiveGiftNewGifterBadgeSetting.DEFAULT;
                                    }
                                    try {
                                        jSONObject2.put(optString, obj);
                                    } catch (JSONException e2) {
                                        C16880lQ.LLLLIIL(e2);
                                    }
                                    LJFF.LJIIIZ(optString);
                                    i3++;
                                }
                                if (arrayList.size() > 0) {
                                    LJFF.LJIIIZ.post(new ARunnableS33S0200000_14(LJFF, arrayList, 99));
                                }
                                LJFF.LJII.LJIIIZ = arrayList;
                                obj2 = jSONObject2;
                            }
                            r15 = (T) obj2;
                        } else {
                            boolean z3 = (T) DnsOptimizer.LJFF().LJ(jSONObject, (InterfaceC63814P2s) t);
                            r15 = z3;
                            if (C79346VCc.LIZLLL().LJIILIIL.LIZ == 1) {
                                r15 = z3;
                                if (C79346VCc.LIZLLL().LJIILIIL.LJ == 1) {
                                    r15 = z3;
                                    if (jSONObject.has("host")) {
                                        r15 = z3;
                                        if (jSONObject.has("stream_session_vv_id")) {
                                            String optString2 = jSONObject.optString("host");
                                            String optString3 = jSONObject.optString("stream_session_vv_id");
                                            C79352VCi c79352VCi = new C79352VCi();
                                            c79352VCi.mDomain = optString2;
                                            c79352VCi.mSessionId = optString3;
                                            ((ConcurrentHashMap) C79354VCk.LJLLJ).put(optString3, c79352VCi);
                                            r15 = z3;
                                        }
                                    }
                                }
                            }
                        }
                        uploadNodeOptimizeService((JSONObject) r15, jSONObject, i);
                        return (T) r15;
                    case 14:
                        return (T) C79319VBb.LIZ().runStrategy();
                    case 15:
                        C79349VCf c79349VCf = mLiveIOEngine;
                        if (c79349VCf == null || jSONObject == null) {
                            return t;
                        }
                        String optString4 = jSONObject.optString(C63832P3k.LIZ);
                        Map<String, VD6> map = c79349VCf.LIZLLL;
                        if (map == null || ((ArrayMap) map).isEmpty() || !((ArrayMap) c79349VCf.LIZLLL).containsKey(optString4) || (vd6 = (VD6) ((ArrayMap) c79349VCf.LIZLLL).get(optString4)) == null) {
                            t2 = null;
                        } else {
                            t2 = (T) vd6.LIZ;
                        }
                        if (C79346VCc.LIZLLL().LJIJJ) {
                            return t2;
                        }
                        C79346VCc.LIZLLL().LJIJJ = true;
                        return t2;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        DnsOptimizer LJFF2 = DnsOptimizer.LJFF();
                        ((Integer) t).intValue();
                        return (T) Integer.valueOf(LJFF2.LJJII);
                    case 17:
                        if (jSONObject != null && jSONObject.has("domain") && jSONObject.has("ipCount")) {
                            if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUDPProbe != 2) {
                                return t;
                            }
                            return (T) NetworkProber.LIZJ().LIZ(jSONObject.optInt("ipCount"), jSONObject.optString("domain"));
                        }
                        if (C79346VCc.LIZLLL().LJJIJ != 1) {
                            return t;
                        }
                        C79321VBd c79321VBd = VBC.LIZ;
                        c79321VBd.getClass();
                        synchronized (C79321VBd.class) {
                            z = c79321VBd.LIZLLL;
                        }
                        return (T) Integer.valueOf(z ? 1 : 0);
                    case 18:
                        return t3;
                    case 19:
                        if (mSRPredictEngine != null) {
                            if (VBW.LIZIZ().LIZIZ != 1) {
                                z2 = false;
                            }
                            if (!z2) {
                                C79320VBc c79320VBc = mSRPredictEngine;
                                c79320VBc.getClass();
                                ?? r152 = (T) new JSONObject();
                                try {
                                    r152.put("enable_sr", c79320VBc.LJJIIJ);
                                    r152.put("sr_type", c79320VBc.LJJIIZ);
                                    return r152;
                                } catch (Exception e3) {
                                    C16880lQ.LLLLIIL(e3);
                                    return r152;
                                }
                            }
                        }
                        VBW LIZIZ = VBW.LIZIZ();
                        LIZIZ.getClass();
                        ?? r153 = (T) new JSONObject();
                        try {
                            r153.put("enable_sr", LIZIZ.LJIJ);
                            r153.put("sr_type", LIZIZ.LJIJJ);
                            return r153;
                        } catch (Exception e4) {
                            C16880lQ.LLLLIIL(e4);
                            return r153;
                        }
                    case 20:
                        return (T) C79318VBa.LIZ().runStrategy();
                    case 21:
                        return (T) VBX.LIZ().runStrategy();
                    case 22:
                        return (T) VBZ.LIZ().runStrategy();
                    case 23:
                        return (T) VBY.LIZ().runStrategy();
                    case 24:
                        if (jSONObject == null || !jSONObject.has("host") || !jSONObject.has("protocolType")) {
                            return t;
                        }
                        String optString5 = jSONObject.optString("host");
                        int optInt = jSONObject.optInt("protocolType");
                        DnsOptimizer LJFF3 = DnsOptimizer.LJFF();
                        LJFF3.getClass();
                        T t4 = (T) new ArrayList();
                        if (optInt != 0) {
                            if (optInt == 1) {
                                i3 = C79346VCc.LIZLLL().LJIIL.LIZLLL.mRequiredIpv4IpCount;
                            }
                        } else {
                            i3 = C79346VCc.LIZLLL().LJIIL.LIZLLL.mRequiredIpv6IpCount;
                        }
                        if (!LJFF3.LJIILJJIL || !C79346VCc.LIZLLL().LJIILL || i3 <= 0 || (r2k = (R2K) ((ConcurrentHashMap) DnsOptimizer.LJJJI).get(optString5)) == null) {
                            return t4;
                        }
                        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUseNewOptRecordStruct == 1) {
                            int i4 = LJFF3.LJJIJL;
                            ?? r154 = (T) new ArrayList();
                            HashSet hashSet = new HashSet();
                            r2k.LJIIIIZZ.lock();
                            int i5 = C79346VCc.LIZLLL().LJIIL.LIZLLL.mRequiredHttpIpCount;
                            int i6 = C79346VCc.LIZLLL().LJIIL.LIZLLL.mRequiredLocalIpCount;
                            List<String> LIZIZ2 = r2k.LIZIZ(i4, 1);
                            List<String> LIZIZ3 = r2k.LIZIZ(i4, 3);
                            R2K.LIZJ(optInt, i3, LIZIZ2, r154, hashSet, i5);
                            R2K.LIZJ(optInt, i3, LIZIZ3, r154, hashSet, i6);
                            r2k.LJIIIIZZ.unlock();
                            return r154;
                        }
                        ?? r155 = (T) new ArrayList();
                        HashSet hashSet2 = new HashSet();
                        r2k.LJIIIIZZ.lock();
                        List<String> list = r2k.LIZJ;
                        List<String> list2 = r2k.LIZLLL;
                        int i7 = C79346VCc.LIZLLL().LJIIL.LIZLLL.mRequiredHttpIpCount;
                        int i8 = C79346VCc.LIZLLL().LJIIL.LIZLLL.mRequiredLocalIpCount;
                        R2K.LIZJ(optInt, i3, list, r155, hashSet2, i7);
                        R2K.LIZJ(optInt, i3, list2, r155, hashSet2, i8);
                        r2k.LJIIIIZZ.unlock();
                        return r155;
                    case 25:
                        return (T) C79330VBm.LIZ().runStrategy();
                    default:
                        return t;
                }
            }
            if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUpdateCharToLiveIO != 1) {
                return t;
            }
            JSONObject runStrategy2 = C79332VBo.LIZ().runStrategy();
            if (runStrategy2 == null) {
                return "";
            }
            return (T) runStrategy2.toString();
        }
        if (jSONObject == null || !jSONObject.has("strategyName")) {
            return t;
        }
        return (T) getStrategyConfigByName(jSONObject.optString("strategyName"));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T getConfigAndStrategyByKeyStr(int r6, java.lang.String r7, T r8, org.json.JSONObject r9) {
        /*
            r5 = this;
            r2 = 0
            if (r6 == 0) goto L9d
            r0 = 1
            if (r6 == r0) goto L93
            r4 = r2
        L7:
            if (r9 == 0) goto L20
            java.lang.String r3 = "host"
            boolean r0 = r9.has(r3)
            if (r0 == 0) goto L20
            java.lang.String r1 = "stream_session_vv_id"
            boolean r0 = r9.has(r1)
            if (r0 == 0) goto L20
            r9.optString(r3)
            java.lang.String r2 = r9.optString(r1)
        L20:
            if (r4 == 0) goto Lc2
            java.util.Map<java.lang.String, X.VBk> r0 = r5.mListenerMap
            if (r0 == 0) goto L71
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L71
            X.VCc r0 = X.C79346VCc.LIZLLL()
            java.util.List<java.lang.String> r0 = r0.LJJJIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L71
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.VCc r0 = X.C79346VCc.LIZLLL()
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r0.LJJJJ
            if (r0 == 0) goto L63
            X.VCc r0 = X.C79346VCc.LIZLLL()
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r0.LJJJJ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L63
            X.VCc r0 = X.C79346VCc.LIZLLL()
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r0.LJJJJ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r1 = r0.get(r2)
            java.util.List r1 = (java.util.List) r1
        L63:
            r1.add(r7)
            X.VCc r0 = X.C79346VCc.LIZLLL()
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r0.LJJJJ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r2, r1)
        L71:
            X.VCc r1 = X.C79346VCc.LIZLLL()
            org.json.JSONObject r0 = r1.LJIIJ
            if (r0 != 0) goto L86
            int r0 = r1.LJIILJJIL
            if (r0 != 0) goto L85
            java.lang.String r0 = X.C79353VCj.LJLLL
            org.json.JSONObject r2 = X.C79353VCj.LJJLI(r0, r7)
        L83:
            if (r2 != 0) goto Lb1
        L85:
            return r8
        L86:
            boolean r0 = r0.has(r7)
            if (r0 == 0) goto L85
            org.json.JSONObject r0 = r1.LJIIJ
            org.json.JSONObject r2 = r0.optJSONObject(r7)
            goto L83
        L93:
            X.PMa r0 = X.C64316PMa.LIZLLL()
            r0.LIZJ = r9
            java.lang.String r4 = "1"
            goto L7
        L9d:
            X.VCg r1 = X.C79350VCg.LJ()
            java.util.concurrent.locks.ReentrantLock r0 = r1.LJI
            r0.lock()
            r1.LJFF = r9
            java.util.concurrent.locks.ReentrantLock r0 = r1.LJI
            r0.unlock()
            java.lang.String r4 = "2"
            goto L7
        Lb1:
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc1
            java.lang.String r2 = r2.toString()
        Lc1:
            return r2
        Lc2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.LiveStrategyManager.getConfigAndStrategyByKeyStr(int, java.lang.String, java.lang.Object, org.json.JSONObject):java.lang.Object");
    }
}
