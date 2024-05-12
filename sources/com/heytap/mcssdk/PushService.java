package com.heytap.mcssdk;

import X.C16880lQ;
import X.C39248Fam;
import X.EF7;
import X.X1D;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.heytap.mcssdk.d.d;
import com.heytap.mcssdk.e.c;
import com.heytap.mcssdk.utils.StatUtil;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.MessageStat;
import com.mcs.aidl.IMcsSdkService;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes28.dex */
public class PushService implements com.heytap.mcssdk.a {
    public static final String TYPE = "type";
    public static int sCount;
    public static boolean sIsNewMcsPkg;
    public static String sMcsPkgName;
    public ConcurrentHashMap<Integer, com.heytap.mcssdk.c.a> mAppLimitMap;
    public String mAuthCode;
    public Context mContext;
    public ICallBackResultService mICallBackResultService;
    public IGetAppNotificationCallBackService mIGetAppNotificationCallBackService;
    public ISetAppNotificationCallBackService mISetAppNotificationCallBackService;
    public List<d> mParsers;
    public List<c> mProcessors;
    public String mRegisterID;
    public String mVerifyCode;
    public static final int[] OLD_MCS_PACKAGE = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115};
    public static final int[] OLD_MCS_RECEIVE_SDK_ACTION = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115, 115, 100, 107, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 67, 69, 73, 86, 69, 95, 83, 68, 75, 95, 77, 69, 83, 83, 65, 71, 69};
    public static String NEW_MCS_RECEIVE_SDK_ACTION = "";

    /* loaded from: classes28.dex */
    public static class a {
        public static final PushService a = new PushService();
    }

    public PushService() {
        this.mProcessors = new ArrayList();
        this.mParsers = new ArrayList();
        this.mRegisterID = null;
        synchronized (PushService.class) {
            int i = sCount;
            if (i > 0) {
                throw new RuntimeException("PushService can't create again!");
            }
            sCount = i + 1;
        }
        addParser(new com.heytap.mcssdk.d.b());
        addParser(new com.heytap.mcssdk.d.a());
        addProcessor(new com.heytap.mcssdk.e.b());
        addProcessor(new com.heytap.mcssdk.e.a());
        this.mAppLimitMap = new ConcurrentHashMap<>();
    }

    private com.heytap.mcssdk.c.a addCommandToMap(int i) {
        String str;
        if (!this.mAppLimitMap.containsKey(Integer.valueOf(i))) {
            com.heytap.mcssdk.c.a aVar = new com.heytap.mcssdk.c.a(System.currentTimeMillis(), 1);
            this.mAppLimitMap.put(Integer.valueOf(i), aVar);
            com.heytap.mcssdk.utils.d.b("addCommandToMap :appBean is null");
            return aVar;
        }
        com.heytap.mcssdk.c.a aVar2 = this.mAppLimitMap.get(Integer.valueOf(i));
        if (checkTimeNeedUpdate(aVar2)) {
            aVar2.a(1);
            aVar2.a(System.currentTimeMillis());
            str = "addCommandToMap : appLimitBean.setCount(1)";
        } else {
            aVar2.a(aVar2.b() + 1);
            str = "addCommandToMap :appLimitBean.getCount() + 1";
        }
        com.heytap.mcssdk.utils.d.b(str);
        return aVar2;
    }

    private synchronized void addParser(d dVar) {
        if (dVar != null) {
            this.mParsers.add(dVar);
        }
    }

    private synchronized void addProcessor(c cVar) {
        if (cVar != null) {
            this.mProcessors.add(cVar);
        }
    }

    private boolean checkAll() {
        return checkContext() && checkRegisterID();
    }

    private boolean checkContext() {
        return this.mContext != null;
    }

    private boolean checkRegisterID() {
        return this.mRegisterID != null;
    }

    private boolean checkTimeNeedUpdate(com.heytap.mcssdk.c.a aVar) {
        long a2 = aVar.a();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkTimeNeedUpdate : lastedTime ");
        LIZ.append(a2);
        LIZ.append(" currentTime:");
        LIZ.append(currentTimeMillis);
        com.heytap.mcssdk.utils.d.b(X1D.LIZIZ(LIZ));
        return currentTimeMillis - a2 > 1000;
    }

    public static PushService getInstance() {
        return a.a;
    }

    private Intent getIntent(int i, String str, JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setAction(getReceiveSdkAction(this.mContext));
        intent.setPackage(getMcsPackageName(this.mContext));
        intent.putExtra("type", i);
        JSONObject jSONObject2 = new JSONObject();
        try {
            Context context = this.mContext;
            jSONObject2.putOpt("versionName", Utils.getVersionName(context, context.getPackageName()));
            Context context2 = this.mContext;
            jSONObject2.putOpt("versionCode", Integer.valueOf(Utils.getVersionCode(context2, context2.getPackageName())));
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.get(next));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            intent.putExtra("extra", jSONObject2.toString());
            throw th;
        }
        intent.putExtra("extra", jSONObject2.toString());
        intent.putExtra("params", str);
        intent.putExtra("appPackage", this.mContext.getPackageName());
        intent.putExtra("appKey", this.mAuthCode);
        intent.putExtra("appSecret", this.mVerifyCode);
        intent.putExtra("registerID", this.mRegisterID);
        intent.putExtra("sdkVersion", getSDKVersionName());
        return intent;
    }

    private String getNewMcsPackageName(Context context) {
        boolean z;
        boolean z2;
        if (TextUtils.isEmpty(NEW_MCS_RECEIVE_SDK_ACTION)) {
            NEW_MCS_RECEIVE_SDK_ACTION = new String(com.heytap.mcssdk.a.a.b("Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ=="));
        }
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(NEW_MCS_RECEIVE_SDK_ACTION), FileUtils.BUFFER_SIZE);
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            String str = it.next().serviceInfo.packageName;
            try {
                z = (C16880lQ.LLLLLLLLL(context.getPackageManager(), str, 0).flags & 1) == 1;
                z2 = INVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageUid(context.getPackageManager(), str, 0) == INVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageUid(context.getPackageManager(), "android", 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (z || z2) {
                return str;
            }
        }
        return null;
    }

    public static int getSDKVersionCode() {
        return 3000;
    }

    public static String getSDKVersionName() {
        return "3.0.0";
    }

    private boolean isSupportPushInner(Context context) {
        if (this.mContext == null) {
            this.mContext = C16880lQ.LLLLL(context);
        }
        String mcsPackageName = getMcsPackageName(this.mContext);
        return Utils.isExistPackage(this.mContext, mcsPackageName) && Utils.getVersionCode(this.mContext, mcsPackageName) >= 1019 && Utils.isSupportPush(this.mContext, mcsPackageName, "supportOpenPush");
    }

    public static void onAppStart(Context context) {
        StatUtil.statisticMessage(context, new MessageStat(context.getPackageName(), "app_start", null));
    }

    private void startMcsService(int i, String str, JSONObject jSONObject) {
        if (checkCommandLimit(i)) {
            ICallBackResultService iCallBackResultService = this.mICallBackResultService;
            if (iCallBackResultService != null) {
                iCallBackResultService.onError(getErrorCode(i), "api_call_too_frequently");
                return;
            }
            return;
        }
        try {
            C16880lQ.LLLL(this.mContext, getIntent(i, str, jSONObject));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startMcsService--Exception");
            LIZ.append(e.getMessage());
            com.heytap.mcssdk.utils.d.e(X1D.LIZIZ(LIZ));
        }
    }

    private void startMcsService(int i, JSONObject jSONObject) {
        startMcsService(i, "", jSONObject);
    }

    public void bindMcsService(int i) {
        if (!checkCommandLimit(i)) {
            final Intent intent = getIntent(i, "", null);
            C16880lQ.LLLJL(this.mContext, intent, new ServiceConnection() { // from class: com.heytap.mcssdk.PushService.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    Bundle bundle = new Bundle();
                    bundle.putAll(C16880lQ.LLJJIJI(intent));
                    try {
                        IMcsSdkService.Stub.asInterface(iBinder).process(bundle);
                    } catch (Exception e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("bindMcsService exception:");
                        LIZ.append(e);
                        com.heytap.mcssdk.utils.d.b(X1D.LIZIZ(LIZ));
                    }
                    PushService.this.mContext.unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }
            }, 1);
        } else {
            ICallBackResultService iCallBackResultService = this.mICallBackResultService;
            if (iCallBackResultService != null) {
                iCallBackResultService.onError(getErrorCode(i), "api_call_too_frequently");
            }
        }
    }

    public boolean checkCommandLimit(int i) {
        return (i == 12291 || i == 12312 || addCommandToMap(i).b() <= 2) ? false : true;
    }

    @Override // com.heytap.mcssdk.a
    public void clearNotificationType() {
        clearNotificationType(null);
    }

    @Override // com.heytap.mcssdk.a
    public void clearNotificationType(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12308, jSONObject);
        } else {
            com.heytap.mcssdk.utils.d.e("mcssdk---", "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void clearNotifications() {
        clearNotifications(null);
    }

    @Override // com.heytap.mcssdk.a
    public void clearNotifications(JSONObject jSONObject) {
        if (checkContext()) {
            startMcsService(12311, jSONObject);
        } else {
            com.heytap.mcssdk.utils.d.e("mcssdk---", "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (checkContext()) {
            this.mISetAppNotificationCallBackService = iSetAppNotificationCallBackService;
            startMcsService(12317, null);
        } else if (getPushCallback() != null) {
            this.mISetAppNotificationCallBackService.onSetAppNotificationSwitch(-2);
        }
    }

    @Override // com.heytap.mcssdk.a
    public void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (checkContext()) {
            this.mISetAppNotificationCallBackService = iSetAppNotificationCallBackService;
            startMcsService(12316, null);
        } else {
            ISetAppNotificationCallBackService iSetAppNotificationCallBackService2 = this.mISetAppNotificationCallBackService;
            if (iSetAppNotificationCallBackService2 != null) {
                iSetAppNotificationCallBackService2.onSetAppNotificationSwitch(-2);
            }
        }
    }

    public Map<Integer, com.heytap.mcssdk.c.a> getAppLimitMap() {
        return this.mAppLimitMap;
    }

    @Override // com.heytap.mcssdk.a
    public void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        if (checkContext()) {
            this.mIGetAppNotificationCallBackService = iGetAppNotificationCallBackService;
            startMcsService(12318, null);
        } else {
            IGetAppNotificationCallBackService iGetAppNotificationCallBackService2 = this.mIGetAppNotificationCallBackService;
            if (iGetAppNotificationCallBackService2 != null) {
                iGetAppNotificationCallBackService2.onGetAppNotificationSwitch(-2, 0);
            }
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getErrorCode(int i) {
        switch (i) {
            case 12289:
                return -1;
            case 12290:
                return -2;
            case 12291:
                return -14;
            default:
                switch (i) {
                    case 12298:
                        return -11;
                    case 12299:
                        return -3;
                    case 12300:
                        return -4;
                    default:
                        switch (i) {
                            case 12306:
                                return -10;
                            case 12307:
                                return -6;
                            case 12308:
                                return -7;
                            case 12309:
                                return -5;
                            case 12310:
                                return -8;
                            case 12311:
                                return -9;
                            case 12312:
                                return -13;
                            case 12313:
                                return -12;
                            default:
                                switch (i) {
                                    case 12316:
                                        return -15;
                                    case 12317:
                                        return -16;
                                    case 12318:
                                        return -17;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    public String getMcsPackageName(Context context) {
        boolean z;
        if (sMcsPkgName == null) {
            String newMcsPackageName = getNewMcsPackageName(context);
            if (newMcsPackageName == null) {
                sMcsPkgName = Utils.getString(OLD_MCS_PACKAGE);
                z = false;
            } else {
                sMcsPkgName = newMcsPackageName;
                z = true;
            }
            sIsNewMcsPkg = z;
        }
        return sMcsPkgName;
    }

    @Override // com.heytap.mcssdk.a
    public void getNotificationStatus() {
        getNotificationStatus(null);
    }

    @Override // com.heytap.mcssdk.a
    public void getNotificationStatus(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12309, jSONObject);
        } else if (getPushCallback() != null) {
            getPushCallback().onGetNotificationStatus(-2, 0);
        }
    }

    public List<d> getParsers() {
        return this.mParsers;
    }

    public List<c> getProcessors() {
        return this.mProcessors;
    }

    public ICallBackResultService getPushCallback() {
        return this.mICallBackResultService;
    }

    public IGetAppNotificationCallBackService getPushGetAppNotificationCallBack() {
        return this.mIGetAppNotificationCallBackService;
    }

    public ISetAppNotificationCallBackService getPushSetAppNotificationCallBack() {
        return this.mISetAppNotificationCallBackService;
    }

    public void getPushStatus() {
        if (checkAll()) {
            startMcsService(12306, null);
        } else if (getPushCallback() != null) {
            getPushCallback().onGetPushStatus(-2, 0);
        }
    }

    public int getPushVersionCode() {
        if (!checkContext()) {
            return 0;
        }
        Context context = this.mContext;
        return Utils.getVersionCode(context, getMcsPackageName(context));
    }

    public String getPushVersionName() {
        if (!checkContext()) {
            return "";
        }
        Context context = this.mContext;
        return Utils.getVersionName(context, getMcsPackageName(context));
    }

    public String getReceiveSdkAction(Context context) {
        if (sMcsPkgName == null) {
            getNewMcsPackageName(context);
        }
        if (!sIsNewMcsPkg) {
            return Utils.getString(OLD_MCS_RECEIVE_SDK_ACTION);
        }
        if (TextUtils.isEmpty(NEW_MCS_RECEIVE_SDK_ACTION)) {
            NEW_MCS_RECEIVE_SDK_ACTION = new String(com.heytap.mcssdk.a.a.b("Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ=="));
        }
        return NEW_MCS_RECEIVE_SDK_ACTION;
    }

    @Override // com.heytap.mcssdk.a
    public void getRegister() {
        getRegister(null);
    }

    @Override // com.heytap.mcssdk.a
    public void getRegister(JSONObject jSONObject) {
        if (checkContext()) {
            startMcsService(12289, jSONObject);
        } else if (getPushCallback() != null) {
            getPushCallback().onRegister(-2, null);
        }
    }

    @Override // com.heytap.mcssdk.a
    public String getRegisterID() {
        return this.mRegisterID;
    }

    public PushService init(Context context, boolean z) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        innerInit(context);
        new com.heytap.mcssdk.b.a().a(this.mContext);
        com.heytap.mcssdk.utils.d.f(z);
        return this;
    }

    public void innerInit(Context context) {
        boolean z;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.mContext = LLLLL;
        if (sMcsPkgName == null) {
            String newMcsPackageName = getNewMcsPackageName(LLLLL);
            if (newMcsPackageName == null) {
                sMcsPkgName = Utils.getString(OLD_MCS_PACKAGE);
                z = false;
            } else {
                sMcsPkgName = newMcsPackageName;
                z = true;
            }
            sIsNewMcsPkg = z;
        }
    }

    public boolean isSupportPushByClient(Context context) {
        return isSupportPushInner(context);
    }

    @Override // com.heytap.mcssdk.a
    public void openNotificationSettings() {
        openNotificationSettings(null);
    }

    @Override // com.heytap.mcssdk.a
    public void openNotificationSettings(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12310, jSONObject);
        } else {
            com.heytap.mcssdk.utils.d.e("mcssdk---", "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void pausePush() {
        pausePush(null);
    }

    @Override // com.heytap.mcssdk.a
    public void pausePush(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12299, jSONObject);
        } else {
            com.heytap.mcssdk.utils.d.e("mcssdk---", "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        register(context, str, str2, null, iCallBackResultService);
    }

    @Override // com.heytap.mcssdk.a
    public void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        if (context == null) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null);
                return;
            }
            return;
        }
        if (this.mContext == null) {
            this.mContext = C16880lQ.LLLLL(context);
        }
        if (!Utils.isSupportPushByClient(this.mContext)) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null);
                return;
            }
            return;
        }
        this.mAuthCode = str;
        this.mVerifyCode = str2;
        this.mICallBackResultService = iCallBackResultService;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.putOpt("appVersionCode", Integer.valueOf(Utils.getVersionCode(context)));
            jSONObject.putOpt("appVersionName", Utils.getVersionName(context));
        } catch (JSONException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("register-Exception:");
            LIZ.append(e.getMessage());
            com.heytap.mcssdk.utils.d.e(X1D.LIZIZ(LIZ));
        }
        startMcsService(12289, jSONObject);
    }

    @Override // com.heytap.mcssdk.a
    public void requestNotificationPermission() {
        if (checkContext()) {
            bindMcsService(12313);
        } else {
            com.heytap.mcssdk.utils.d.e("mcssdk---", "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void resumePush() {
        resumePush(null);
    }

    @Override // com.heytap.mcssdk.a
    public void resumePush(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12300, jSONObject);
        } else {
            com.heytap.mcssdk.utils.d.e("mcssdk---", "please call the register first!");
        }
    }

    public void setAppKeySecret(String str, String str2) {
        this.mAuthCode = str;
        this.mVerifyCode = str2;
    }

    @Override // com.heytap.mcssdk.a
    public void setNotificationType(int i) {
        setNotificationType(i, null);
    }

    @Override // com.heytap.mcssdk.a
    public void setNotificationType(int i, JSONObject jSONObject) {
        if (!checkAll()) {
            com.heytap.mcssdk.utils.d.e("mcssdk---", "please call the register first!");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append("");
        startMcsService(12307, X1D.LIZIZ(LIZ), jSONObject);
    }

    public void setPushCallback(ICallBackResultService iCallBackResultService) {
        this.mICallBackResultService = iCallBackResultService;
    }

    @Override // com.heytap.mcssdk.a
    public void setPushTime(List<Integer> list, int i, int i2, int i3, int i4) {
        setPushTime(list, i, i2, i3, i4, null);
    }

    @Override // com.heytap.mcssdk.a
    public void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) {
        if (!checkAll()) {
            if (getPushCallback() != null) {
                getPushCallback().onSetPushTime(-2, "please call the register first!");
                return;
            }
            return;
        }
        if (list == null || list.size() <= 0 || i < 0 || i2 < 0 || i3 < i || i3 > 23 || i4 < i2 || i4 > 59) {
            throw new IllegalArgumentException("params are not all right,please check params");
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("weekDays", com.heytap.mcssdk.c.b.a(list));
            jSONObject2.put("startHour", i);
            jSONObject2.put("startMin", i2);
            jSONObject2.put("endHour", i3);
            jSONObject2.put("endMin", i4);
            startMcsService(12298, jSONObject2.toString(), jSONObject);
        } catch (JSONException e) {
            com.heytap.mcssdk.utils.d.e("mcssdk---", e.getLocalizedMessage());
        }
    }

    @Override // com.heytap.mcssdk.a
    public void setRegisterID(String str) {
        this.mRegisterID = str;
    }

    @Override // com.heytap.mcssdk.a
    public void unRegister() {
        unRegister(null);
    }

    public void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        this.mAuthCode = str;
        this.mVerifyCode = str2;
        this.mContext = C16880lQ.LLLLL(context);
        this.mICallBackResultService = iCallBackResultService;
        unRegister(jSONObject);
    }

    @Override // com.heytap.mcssdk.a
    public void unRegister(JSONObject jSONObject) {
        if (checkContext()) {
            startMcsService(12290, jSONObject);
        } else if (getPushCallback() != null) {
            getPushCallback().onUnRegister(-2);
        }
    }

    public static int INVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageUid(PackageManager packageManager, String str, int i) {
        Context LIZIZ = EF7.LIZIZ();
        if (C39248Fam.LJIIIZ && TextUtils.equals(str, LIZIZ.getPackageName())) {
            if (i != 0) {
                if (i != 8) {
                    if (i != 64) {
                        if (i != 128) {
                            return packageManager.getPackageUid(str, i);
                        }
                        if (C39248Fam.LJIILIIL == 0) {
                            C39248Fam.LJIILIIL = packageManager.getPackageUid(str, i);
                        }
                        return C39248Fam.LJIILIIL;
                    }
                    if (C39248Fam.LJIILL == 0) {
                        C39248Fam.LJIILL = packageManager.getPackageUid(str, i);
                    }
                    return C39248Fam.LJIILL;
                }
                if (C39248Fam.LJIILLIIL == 0) {
                    C39248Fam.LJIILLIIL = packageManager.getPackageUid(str, i);
                }
                return C39248Fam.LJIILLIIL;
            }
            if (C39248Fam.LJIILJJIL == 0) {
                C39248Fam.LJIILJJIL = packageManager.getPackageUid(str, i);
            }
            return C39248Fam.LJIILJJIL;
        }
        return packageManager.getPackageUid(str, i);
    }
}
