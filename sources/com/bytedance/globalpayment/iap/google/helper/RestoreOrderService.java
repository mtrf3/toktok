package com.bytedance.globalpayment.iap.google.helper;

import X.C16880lQ;
import X.C25620zW;
import X.C28833BTh;
import X.C39670Fha;
import X.C78261UnZ;
import X.C78273Unl;
import X.C78301UoD;
import X.C78353Up3;
import X.InterfaceC78382UpW;
import X.X1D;
import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class RestoreOrderService implements RestoreGoogleOrderService, WeakHandler.IHandler {
    public static volatile RestoreOrderService ins;
    public Context mContext;
    public boolean mEnableRestoreOrder;
    public Set<String> mHasCalledBackOrders;
    public long mMaxRestoreOrderTimeInMill;
    public Map<String, Long> mNeedRestoreOrderMap;
    public Set<String> mProcessingOrders;
    public long mRestoreOrderIntervalInMill;
    public long mTryToStartRestoreTaskDelayAfterGpDismissInMill;
    public WeakHandler mWeakHandler;
    public final String TAG = "RestoreOrderService";
    public final String THREAD_NAME = "restore_order_thread";
    public final int MSG_WHAT_START_MONITOR_GP_CALLBACK = 101;
    public final int MSG_WHAT_RESTORE_ORDER = 102;
    public final int MSG_WHAT_ADD_NEW_ORDER = 103;
    public final int MSG_WHAT_REMOVE_ORDER = 104;
    public InterfaceC78382UpW mBillingQueryListener = new C78353Up3(this);
    public AtomicBoolean mHasInitEd = new AtomicBoolean(false);

    public void updateSettings() {
        initOnlineSettings(false);
    }

    public void init() {
        if (!this.mHasInitEd.compareAndSet(false, true)) {
            return;
        }
        checkThread();
        C78273Unl.LJIIIZ().LJIIIIZZ();
        String LJIJI = C78301UoD.LIZIZ().LJIJI();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(LJIJI)) {
            for (String str : LJIJI.split(",")) {
                String[] split = str.split(":");
                if (split.length == 2) {
                    hashMap.put(split[0], CastLongProtector.valueOf(split[1]));
                }
            }
        }
        this.mNeedRestoreOrderMap = hashMap;
        this.mHasCalledBackOrders = new HashSet();
        this.mProcessingOrders = new HashSet();
        Looper.prepare();
        this.mWeakHandler = new WeakHandler(Looper.myLooper(), this);
        initOnlineSettings(true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init RestoreOrderService, mEnableRestoreOrder is ");
        LIZ.append(this.mEnableRestoreOrder);
        LIZ.append(" mTryToStartRestoreTaskDelayAfterGpDismissInMill is ");
        LIZ.append(this.mTryToStartRestoreTaskDelayAfterGpDismissInMill);
        LIZ.append(" mRestoreOrderIntervalInMill is ");
        LIZ.append(this.mRestoreOrderIntervalInMill);
        LIZ.append(" mMaxRestoreOrderTimeInMill is ");
        LIZ.append(this.mMaxRestoreOrderTimeInMill);
        LIZ.append(" mNeedRestoreOrderMap is ");
        C78273Unl.LJIIIZ().LJIIIIZZ();
        LIZ.append(C78301UoD.LIZIZ().LJIJI());
        showLog(X1D.LIZIZ(LIZ));
        Looper.loop();
    }

    private void checkThread() {
        if (!((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIIIIZZ || TextUtils.equals(C16880lQ.LLLLIIIILLL().getName(), "restore_order_thread")) {
        } else {
            throw new RuntimeException("function run on a error thread!");
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public boolean isEnableRestoreOrder() {
        return this.mEnableRestoreOrder;
    }

    public RestoreOrderService(Context context) {
        this.mContext = context;
        new PthreadThread(new ARunnableS49S0100000_13(this, 74), "restore_order_thread").start();
    }

    private void addOrderInHandlerThread(String str) {
        checkThread();
        this.mNeedRestoreOrderMap.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        C78273Unl.LJIIIZ().LJIIIIZZ();
        C78301UoD.LIZIZ().LJIJJLI(C28833BTh.LIZIZ(this.mNeedRestoreOrderMap));
    }

    private void doRestoreOrderInHandlerThread(boolean z) {
        if (!z && this.mNeedRestoreOrderMap.isEmpty()) {
            showLog("doRestoreOrderInHandlerThread: mNeedRestoreOrderMap is empty, stop restore");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doRestoreOrderInHandlerThread: mNeedRestoreOrderMap.size()  is ");
        LIZ.append(this.mNeedRestoreOrderMap.size());
        LIZ.append(" forceQuery is ");
        LIZ.append(z);
        LIZ.append(" do restore");
        showLog(X1D.LIZIZ(LIZ));
        PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(this.mBillingQueryListener);
    }

    public static RestoreOrderService getIns(Context context) {
        if (ins == null) {
            synchronized (RestoreOrderService.class) {
                if (ins == null) {
                    ins = new RestoreOrderService(context);
                }
            }
        }
        return ins;
    }

    private void initOnlineSettings(boolean z) {
        if (this.mHasInitEd.get() || z) {
            boolean z2 = this.mEnableRestoreOrder;
            C78273Unl.LJIIIZ().LJIIIIZZ();
            JSONObject LIZ = C78301UoD.LIZJ().LIZ();
            long j = 2000;
            if (LIZ != null) {
                j = LIZ.optLong("try_to_start_restore_task_delay", 2000L);
            }
            this.mTryToStartRestoreTaskDelayAfterGpDismissInMill = j;
            C78273Unl.LJIIIZ().LJIIIIZZ();
            JSONObject LIZ2 = C78301UoD.LIZJ().LIZ();
            long j2 = 5000;
            if (LIZ2 != null) {
                j2 = LIZ2.optLong("try_to_start_restore_task_delay", 5000L);
            }
            this.mRestoreOrderIntervalInMill = j2;
            C78273Unl.LJIIIZ().LJIIIIZZ();
            JSONObject LIZ3 = C78301UoD.LIZJ().LIZ();
            long j3 = 259200000;
            if (LIZ3 != null) {
                j3 = LIZ3.optLong("max_restore_order_time", 259200000L);
            }
            this.mMaxRestoreOrderTimeInMill = j3;
            boolean LIZLLL = ((C78301UoD) C78273Unl.LJIIIZ().LJIIIIZZ()).LIZLLL();
            this.mEnableRestoreOrder = LIZLLL;
            if (!z2 && LIZLLL) {
                showLog("[init] start restore");
                WeakHandler weakHandler = this.mWeakHandler;
                weakHandler.sendMessage(weakHandler.obtainMessage(102, Boolean.TRUE));
            }
        }
    }

    private void onFinishedTokenUploadInHandlerThread(String str) {
        checkThread();
        removeOrderInHandlerThread(str);
    }

    private void onGpCallbackTimeOutInHandlerThread(String str) {
        checkThread();
        if (!this.mNeedRestoreOrderMap.containsKey(str)) {
            addOrderInHandlerThread(str);
            this.mWeakHandler.sendEmptyMessage(102);
        }
    }

    private void removeOrderInHandlerThread(String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("removeOrderInHandlerThread: orderId ", str, ", before remove, map.size is ");
        LIZIZ.append(this.mNeedRestoreOrderMap.size());
        LIZIZ.append(". Does map contain this orderId ? : ");
        LIZIZ.append(this.mNeedRestoreOrderMap.containsKey(str));
        showLog(X1D.LIZIZ(LIZIZ));
        checkThread();
        if (this.mNeedRestoreOrderMap.remove(str) == null) {
            return;
        }
        C78273Unl.LJIIIZ().LJIIIIZZ();
        C78301UoD.LIZIZ().LJIJJLI(C28833BTh.LIZIZ(this.mNeedRestoreOrderMap));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        boolean z;
        if (!this.mEnableRestoreOrder) {
            return;
        }
        int i = message.what;
        if (i == 101) {
            showLog("handle Msg for MSG_WHAT_START_MONITOR_GP_CALLBACK");
            onGpCallbackTimeOutInHandlerThread((String) message.obj);
            return;
        }
        if (i == 102) {
            showLog("handle Msg for MSG_WHAT_RESTORE_ORDER");
            Object obj = message.obj;
            if (obj instanceof Boolean) {
                z = ((Boolean) obj).booleanValue();
            } else {
                z = false;
            }
            doRestoreOrderInHandlerThread(z);
            return;
        }
        if (i == 103) {
            showLog("handle Msg for MSG_WHAT_ADD_NEW_ORDER");
            addOrderInHandlerThread((String) message.obj);
        } else {
            if (i != 104) {
                return;
            }
            showLog("handle Msg for MSG_WHAT_REMOVE_ORDER");
            onFinishedTokenUploadInHandlerThread((String) message.obj);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public void onFailedFinishedTokenUpload(String str) {
        Set<String> set;
        if (!this.mEnableRestoreOrder || (set = this.mProcessingOrders) == null) {
            return;
        }
        set.remove(str);
        WeakHandler weakHandler = this.mWeakHandler;
        weakHandler.sendMessageDelayed(weakHandler.obtainMessage(102, Boolean.TRUE), this.mRestoreOrderIntervalInMill);
    }

    public void onGoogleCallback(AbsIapChannelOrderData absIapChannelOrderData) {
        if (!this.mEnableRestoreOrder) {
            return;
        }
        String selfOrderId = absIapChannelOrderData.getSelfOrderId();
        if (absIapChannelOrderData.getOrderState() != 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onGoogleCallback: ");
            LIZ.append(selfOrderId);
            LIZ.append(" purchase state is not pending ,remove add restore delay task");
            showLog(X1D.LIZIZ(LIZ));
            this.mHasCalledBackOrders.add(selfOrderId);
            this.mWeakHandler.removeMessages(101, selfOrderId);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onGoogleCallback: ");
        LIZ2.append(selfOrderId);
        LIZ2.append(" purchase state is pending ,try add it to unfinished order map");
        showLog(X1D.LIZIZ(LIZ2));
        this.mWeakHandler.removeMessages(103, selfOrderId);
    }

    public void onGooglePanelDismiss(OrderData orderData) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGooglePanelDismiss: ");
        LIZ.append(orderData.getOrderId());
        showLog(X1D.LIZIZ(LIZ));
        if (!this.mEnableRestoreOrder) {
            return;
        }
        if (this.mHasCalledBackOrders.contains(orderData.getOrderId())) {
            showLog("onGooglePanelDismiss: order has callback ,do noting");
        } else {
            this.mWeakHandler.sendMessageDelayed(this.mWeakHandler.obtainMessage(101, orderData.getOrderId()), this.mTryToStartRestoreTaskDelayAfterGpDismissInMill);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public void onSuccessFinishedTokenUpload(String str) {
        if (!this.mEnableRestoreOrder) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFinishedTokenUpload: ");
        LIZ.append(str);
        LIZ.append(" remove it from restoreOrders");
        showLog(X1D.LIZIZ(LIZ));
        WeakHandler weakHandler = this.mWeakHandler;
        weakHandler.sendMessage(weakHandler.obtainMessage(104, str));
    }

    public void showLog(String str) {
        String name = C16880lQ.LLLLIIIILLL().getName();
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        LIZ.append(name);
        LIZ.append("]:");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
    }
}
