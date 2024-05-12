package com.bytedance.pitaya.api.mutilinstance;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.J9Q;
import X.Y7H;
import android.content.Context;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.api.bean.PTYNativeTaskConfig;
import com.bytedance.pitaya.api.bean.PTYNativeTaskData;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.inner.thridpart.DelegateCoreEventReport;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AqS75S0400000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DelegateCore implements IPitayaCore {
    public String aid;
    public final ConcurrentHashMap<String, PTYTaskResultCallback> appLogTaskCallback;
    public InterfaceC65784Pro<C76800UCe> cleanAction;
    public final PTYError hostNotReadyError;
    public final ConcurrentHashMap<String, PTYMessageHandler> messageHandlers;
    public final ReentrantReadWriteLock.ReadLock rLock;
    public volatile IPitayaCore realCore;
    public final ReentrantReadWriteLock rwLock;
    public final ReentrantReadWriteLock.WriteLock wLock;

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public boolean isReady() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            return iPitayaCore.isReady();
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void preDownloadAllPackage() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.preDownloadAllPackage();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void releaseAllEngines() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.releaseAllEngines();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void requestUpdateAll() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.requestUpdateAll();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void stopAllDownloadTask() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.stopAllDownloadTask();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public String getAid() {
        return this.aid;
    }

    public final IPitayaCore getRealCore$pitayacore_release() {
        return this.realCore;
    }

    public DelegateCore(String aid) {
        o.LJIIJ(aid, "aid");
        this.aid = aid;
        this.messageHandlers = new ConcurrentHashMap<>();
        this.appLogTaskCallback = new ConcurrentHashMap<>();
        PTYErrorCode pTYErrorCode = PTYErrorCode.PITAYA_IMPL_NOT_READY;
        this.hostNotReadyError = new PTYError("Multi-Instance", pTYErrorCode.getCode(), pTYErrorCode.getCode(), "Method invoked before host setup!", null);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.rwLock = reentrantReadWriteLock;
        this.rLock = reentrantReadWriteLock.readLock();
        this.wLock = reentrantReadWriteLock.writeLock();
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void releaseEngine(String businessName) {
        o.LJIIJ(businessName, "businessName");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.releaseEngine(businessName);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void releaseNativeEngine(String businessName) {
        o.LJIIJ(businessName, "businessName");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.releaseNativeEngine(businessName);
        }
    }

    @Override // com.bytedance.pitaya.api.PitayaFE
    public void removeApplogRunEventCallback(String business) {
        o.LJIIJ(business, "business");
        this.rLock.lock();
        try {
            if (getRealCore$pitayacore_release() != null) {
                IPitayaCore iPitayaCore = this.realCore;
                if (iPitayaCore != null) {
                    iPitayaCore.removeApplogRunEventCallback(business);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                this.appLogTaskCallback.remove(business);
            }
        } finally {
            this.rLock.unlock();
        }
    }

    @Override // com.bytedance.pitaya.api.PitayaFE
    public void removeMessageHandler(String business) {
        o.LJIIJ(business, "business");
        this.rLock.lock();
        try {
            if (getRealCore$pitayacore_release() != null) {
                IPitayaCore iPitayaCore = this.realCore;
                if (iPitayaCore != null) {
                    iPitayaCore.removeMessageHandler(business);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                this.messageHandlers.remove(business);
            }
        } finally {
            this.rLock.unlock();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void setAid(String str) {
        o.LJIIJ(str, "<set-?>");
        this.aid = str;
    }

    public final void setRealCore$pitayacore_release(IPitayaCore iPitayaCore) {
        this.wLock.lock();
        if (iPitayaCore != null) {
            try {
                if (this.realCore == null) {
                    this.realCore = iPitayaCore;
                    this.wLock.unlock();
                    for (Map.Entry<String, PTYMessageHandler> entry : this.messageHandlers.entrySet()) {
                        IPitayaCore iPitayaCore2 = this.realCore;
                        if (iPitayaCore2 != null) {
                            iPitayaCore2.registerMessageHandler(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry<String, PTYTaskResultCallback> entry2 : this.appLogTaskCallback.entrySet()) {
                        IPitayaCore iPitayaCore3 = this.realCore;
                        if (iPitayaCore3 != null) {
                            iPitayaCore3.registerApplogRunEventCallback(entry2.getKey(), entry2.getValue());
                        }
                    }
                    this.messageHandlers.clear();
                    this.appLogTaskCallback.clear();
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.cleanAction;
                    if (interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                    }
                }
            } finally {
                this.wLock.unlock();
            }
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void socketLogError(String content) {
        o.LJIIJ(content, "content");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.socketLogError(content);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void socketLogInfo(String content) {
        o.LJIIJ(content, "content");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.socketLogInfo(content);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void socketLogWarn(String content) {
        o.LJIIJ(content, "content");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.socketLogWarn(content);
        }
    }

    private final <T> T safeCall(InterfaceC65784Pro<? extends T> interfaceC65784Pro, InterfaceC65784Pro<? extends T> interfaceC65784Pro2) {
        T invoke;
        this.rLock.lock();
        try {
            if (getRealCore$pitayacore_release() != null) {
                invoke = interfaceC65784Pro.invoke();
            } else {
                invoke = interfaceC65784Pro2.invoke();
            }
            return invoke;
        } finally {
            this.rLock.unlock();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void downloadPackage(String businessName, PTYPackageCallback packageCallback) {
        o.LJIIJ(businessName, "businessName");
        o.LJIIJ(packageCallback, "packageCallback");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.downloadPackage(businessName, packageCallback);
        } else {
            packageCallback.onResult(false, this.hostNotReadyError, null);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void queryPackage(String businessName, PTYPackageCallback packageCallback) {
        o.LJIIJ(businessName, "businessName");
        o.LJIIJ(packageCallback, "packageCallback");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.queryPackage(businessName, packageCallback);
        } else {
            packageCallback.onResult(false, this.hostNotReadyError, null);
        }
    }

    @Override // com.bytedance.pitaya.api.PitayaFE
    public void registerApplogRunEventCallback(String business, PTYTaskResultCallback callback) {
        o.LJIIJ(business, "business");
        o.LJIIJ(callback, "callback");
        this.rLock.lock();
        try {
            if (getRealCore$pitayacore_release() != null) {
                IPitayaCore iPitayaCore = this.realCore;
                if (iPitayaCore != null) {
                    iPitayaCore.registerApplogRunEventCallback(business, callback);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                this.appLogTaskCallback.put(business, callback);
            }
        } finally {
            this.rLock.unlock();
        }
    }

    @Override // com.bytedance.pitaya.api.PitayaFE
    public void registerMessageHandler(String businessName, PTYMessageHandler handler) {
        o.LJIIJ(businessName, "businessName");
        o.LJIIJ(handler, "handler");
        this.rLock.lock();
        try {
            if (getRealCore$pitayacore_release() != null) {
                IPitayaCore iPitayaCore = this.realCore;
                if (iPitayaCore != null) {
                    iPitayaCore.registerMessageHandler(businessName, handler);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                this.messageHandlers.put(businessName, handler);
            }
        } finally {
            this.rLock.unlock();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void cleanStorage(Context context, List<String> reserveBusiness, PTYNormalCallback callback) {
        o.LJIIJ(context, "context");
        o.LJIIJ(reserveBusiness, "reserveBusiness");
        o.LJIIJ(callback, "callback");
        this.rLock.lock();
        try {
            if (getRealCore$pitayacore_release() != null) {
                IPitayaCore iPitayaCore = this.realCore;
                if (iPitayaCore != null) {
                    iPitayaCore.cleanStorage(context, reserveBusiness, callback);
                }
            } else {
                synchronized (Y7H.LIZJ) {
                    if (Y7H.LIZ) {
                        this.cleanAction = new AqS75S0400000_15(this, context, reserveBusiness, callback, 0);
                    } else {
                        Y7H.LIZIZ = true;
                        J9Q.LIZJ(context, reserveBusiness, callback);
                    }
                }
            }
        } finally {
            this.rLock.unlock();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void requestUpdate(String businessName, PTYRequestConfig pTYRequestConfig, PTYPackageCallback pTYPackageCallback) {
        o.LJIIJ(businessName, "businessName");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.requestUpdate(businessName, pTYRequestConfig, pTYPackageCallback);
        } else {
            if (pTYPackageCallback == null) {
                return;
            }
            pTYPackageCallback.onResult(false, this.hostNotReadyError, null);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void setup(Context context, PTYSetupInfo ptySetupInfo, PTYSetupCallback pTYSetupCallback) {
        o.LJIIJ(context, "context");
        o.LJIIJ(ptySetupInfo, "ptySetupInfo");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.setup(context, ptySetupInfo, pTYSetupCallback);
        } else {
            if (pTYSetupCallback == null) {
                return;
            }
            pTYSetupCallback.onResult(false, this.hostNotReadyError);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void runNativeTask(String businessName, PTYNativeTaskData pTYNativeTaskData, PTYNativeTaskConfig taskConfig, PTYTaskResultCallback resultCallback) {
        o.LJIIJ(businessName, "businessName");
        o.LJIIJ(taskConfig, "taskConfig");
        o.LJIIJ(resultCallback, "resultCallback");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.runNativeTask(businessName, pTYNativeTaskData, taskConfig, resultCallback);
        } else {
            DelegateCoreEventReport.INSTANCE.notReadyCall$pitayacore_release(getAid(), businessName);
            resultCallback.onResult(false, this.hostNotReadyError, null, null);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void runTask(String businessName, PTYTaskData pTYTaskData, PTYTaskConfig taskConfig, PTYTaskResultCallback resultCallback) {
        o.LJIIJ(businessName, "businessName");
        o.LJIIJ(taskConfig, "taskConfig");
        o.LJIIJ(resultCallback, "resultCallback");
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.runTask(businessName, pTYTaskData, taskConfig, resultCallback);
        } else {
            DelegateCoreEventReport.INSTANCE.notReadyCall$pitayacore_release(getAid(), businessName);
            resultCallback.onResult(false, this.hostNotReadyError, null, null);
        }
    }
}
