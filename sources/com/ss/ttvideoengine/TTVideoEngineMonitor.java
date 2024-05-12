package com.ss.ttvideoengine;

import X.C10760bY;
import X.C16880lQ;
import X.C47829Ipt;
import X.C47847IqB;
import X.C47865IqT;
import X.C78253UnR;
import X.X1D;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes9.dex */
public final class TTVideoEngineMonitor {
    public static volatile boolean enableCheck;
    public static volatile TTVideoEngineMonitor instance;
    public final Context mContext;
    public C47847IqB mCrosstalkReceiver;
    public Handler mainHandler;
    public HashMap<String, C47829Ipt> allEngineWrapper = new HashMap<>();
    public int playingCount = 0;
    public HashMap<String, C47865IqT> playingLivePLayerInfos = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public void crosstalkCheck() {
        boolean z;
        ArrayList<TTVideoEngine> arrayList;
        HashMap<String, C47865IqT> hashMap;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        ArrayList<TTVideoEngine> arrayList2;
        synchronized (this) {
            int size = this.playingLivePLayerInfos.size();
            int i3 = this.playingCount;
            z = false;
            arrayList = null;
            HashMap<String, C47865IqT> hashMap2 = null;
            if (i3 + size >= 2) {
                if (i3 > 0) {
                    arrayList2 = new ArrayList<>();
                    ArrayList arrayList3 = new ArrayList();
                    for (String str : this.allEngineWrapper.keySet()) {
                        C47829Ipt c47829Ipt = this.allEngineWrapper.get(str);
                        if (c47829Ipt != null) {
                            TTVideoEngine tTVideoEngine = c47829Ipt.LIZ.get();
                            if (tTVideoEngine != null) {
                                if (c47829Ipt.LIZIZ) {
                                    arrayList2.add(tTVideoEngine);
                                }
                            } else {
                                arrayList3.add(str);
                            }
                        }
                    }
                    if (arrayList3.size() > 0) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            this.allEngineWrapper.remove((String) it.next());
                        }
                    }
                    z3 = true;
                } else {
                    arrayList2 = null;
                    z3 = false;
                }
                if (size > 0) {
                    hashMap2 = new HashMap<>(this.playingLivePLayerInfos);
                    z2 = true;
                } else {
                    z2 = false;
                }
                z4 = true;
                hashMap = hashMap2;
                arrayList = arrayList2;
            } else {
                hashMap = null;
                z2 = false;
                z3 = false;
                z4 = false;
            }
        }
        if (!z4) {
            return;
        }
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (hashMap != null) {
            i2 = hashMap.size();
        } else {
            i2 = 0;
        }
        if (i + i2 < 2) {
            return;
        }
        if (arrayList == null || arrayList.size() <= 0) {
            z3 = false;
        }
        if (hashMap == null || hashMap.size() <= 0) {
            z2 = false;
        }
        ArrayList arrayList4 = new ArrayList();
        if (z3 && arrayList != null && arrayList.size() > 0) {
            Iterator<TTVideoEngine> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ArrayList<HashMap<String, Object>> LJIIIZ = it2.next().LJIIIZ(arrayList, hashMap);
                if (z2 && !z && LJIIIZ.size() > 0) {
                    arrayList4.addAll(LJIIIZ);
                    z = true;
                }
            }
        }
        if (z2 && hashMap != null && hashMap.size() > 0) {
            for (String str2 : hashMap.keySet()) {
                C47865IqT c47865IqT = hashMap.get(str2);
                if (c47865IqT != null) {
                    arrayList4.add(generateCrosstalkMap(c47865IqT.LIZ, c47865IqT.LIZIZ, 1, str2));
                }
            }
            String generateCrosstalkCallbackStr = generateCrosstalkCallbackStr(arrayList4);
            if (!TextUtils.isEmpty(generateCrosstalkCallbackStr)) {
                Intent intent = new Intent("com.bytedance.android.vodsdk.player.monitor.ACTION_CROSSTALK_DIDHAPPEN");
                intent.putExtra("crosstalk_info_list", generateCrosstalkCallbackStr);
                try {
                    C10760bY.LIZ(this.mContext).LIZJ(intent);
                } catch (Exception e) {
                    TTVideoEngineLog.w("TTVideoEngineMonitor", e.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ void lambda$semisugar$crosstalkCheck$0(TTVideoEngineMonitor tTVideoEngineMonitor) {
        tTVideoEngineMonitor.crosstalkCheck();
    }

    public synchronized void postRunCrosstalkCheck() {
        if (this.mainHandler == null) {
            this.mainHandler = new Handler(C16880lQ.LLJJJJ());
        }
        this.mainHandler.postDelayed(new IDRunnableS6S0101000(7, this, 12), 100L);
    }

    public void start() {
        if (enableCheck && this.mCrosstalkReceiver == null) {
            registerBroadcastReceiver(this.mContext);
        }
    }

    public void stop() {
        unregisterBroadcastReceiver(this.mContext);
    }

    public TTVideoEngineMonitor(Context context) {
        this.mContext = C16880lQ.LLLLL(context);
        start();
    }

    public static String generateCrosstalkCallbackStr(ArrayList<HashMap<String, Object>> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            try {
                return new JSONArray((Collection) arrayList).toString();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        return null;
    }

    public static TTVideoEngineMonitor getInstance(Context context) {
        if (instance == null) {
            synchronized (TTVideoEngineMonitor.class) {
                if (instance == null) {
                    instance = new TTVideoEngineMonitor(context);
                    C78253UnR.LJI("TTVideoEngineMonitor", "Construct TTVideoEngineMonitor");
                }
            }
        }
        return instance;
    }

    private void registerBroadcastReceiver(Context context) {
        IntentFilter intentFilter = new IntentFilter("com.bytedance.android.livesdk.player.monitor.ACTION_LIVE_PLAYER_PLAYING");
        intentFilter.addAction("com.bytedance.android.livesdk.player.monitor.ACTION_LIVE_PLAYER_STOP_OR_RELEASE");
        this.mCrosstalkReceiver = new C47847IqB(this);
        C10760bY.LIZ(context).LIZIZ(this.mCrosstalkReceiver, intentFilter);
    }

    private void unregisterBroadcastReceiver(Context context) {
        if (this.mCrosstalkReceiver != null) {
            try {
                C10760bY.LIZ(context).LIZLLL(this.mCrosstalkReceiver);
            } catch (Exception e) {
                TTVideoEngineLog.w("TTVideoEngineMonitor", e.getMessage());
            }
            this.mCrosstalkReceiver = null;
        }
    }

    public void stopObserve(int i) {
        synchronized (this) {
            HashMap<String, C47829Ipt> hashMap = this.allEngineWrapper;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append("");
            hashMap.remove(X1D.LIZIZ(LIZ));
        }
    }

    public static void enableCrosstalkCheck(Context context, boolean z) {
        enableCheck = z;
        getInstance(context);
    }

    public void engineStateChange(int i, boolean z) {
        if (!TTVideoEngine.LJIILLIIL) {
            return;
        }
        boolean z2 = false;
        if (!z) {
            synchronized (this) {
                HashMap<String, C47829Ipt> hashMap = this.allEngineWrapper;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append("");
                C47829Ipt c47829Ipt = hashMap.get(X1D.LIZIZ(LIZ));
                if (c47829Ipt != null && c47829Ipt.LIZIZ) {
                    c47829Ipt.LIZIZ = false;
                    this.playingCount--;
                }
            }
            return;
        }
        synchronized (this) {
            HashMap<String, C47829Ipt> hashMap2 = this.allEngineWrapper;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(i);
            LIZ2.append("");
            C47829Ipt c47829Ipt2 = hashMap2.get(X1D.LIZIZ(LIZ2));
            if (c47829Ipt2 != null && !c47829Ipt2.LIZIZ) {
                c47829Ipt2.LIZIZ = true;
                this.playingCount++;
                if (this.playingCount + this.playingLivePLayerInfos.size() >= 2) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            postRunCrosstalkCheck();
        }
    }

    public void startObserve(int i, TTVideoEngine tTVideoEngine) {
        if (tTVideoEngine == null) {
            return;
        }
        C47829Ipt c47829Ipt = new C47829Ipt(tTVideoEngine);
        synchronized (this) {
            HashMap<String, C47829Ipt> hashMap = this.allEngineWrapper;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append("");
            hashMap.put(X1D.LIZIZ(LIZ), c47829Ipt);
        }
    }

    public static HashMap<String, Object> generateCrosstalkMap(String str, String str2, int i, String str3) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("tag", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("subtag", str2);
        }
        hashMap.put("islive", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("enginehash", str3);
        }
        return hashMap;
    }
}
