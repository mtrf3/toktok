package com.ss.android.ugc.effectmanager.effect.repository.oldrepo;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.WeakHandler;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.ITask;
import com.ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectChannelTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectCheckUpdateResult;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchCategoryEffectTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchPanelInfoTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.ProviderEffectTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.ScanQRCodeTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.CheckUpdateTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchCategoryEffectCacheTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchCategoryEffectTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectChannelCacheTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectChannelTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectInfoByQRCodeTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchExistEffectListTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchPanelInfoCacheTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchPanelInfoTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchProviderEffectTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.SearchProviderEffectTask;
import java.util.Map;

/* loaded from: classes16.dex */
public class OldEffectListRepository implements WeakHandler.IHandler, IEffectListRepository {
    public EffectConfiguration mConfiguration;
    public EffectContext mEffectContext;
    public EffectListListener mEffectListListener;
    public Handler mHandler = new WeakHandler(this);

    /* loaded from: classes16.dex */
    public interface EffectListListener {
        void updateEffectChannel(String str, EffectChannelResponse effectChannelResponse, int i, ExceptionResult exceptionResult);
    }

    public OldEffectListRepository(EffectContext effectContext) {
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
    }

    @Override // com.ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (this.mEffectListListener == null) {
            return;
        }
        if (message.what == 14) {
            Object obj = message.obj;
            if (obj instanceof EffectChannelTaskResult) {
                EffectChannelTaskResult effectChannelTaskResult = (EffectChannelTaskResult) obj;
                ExceptionResult exception = effectChannelTaskResult.getException();
                if (exception == null) {
                    this.mEffectListListener.updateEffectChannel(effectChannelTaskResult.getTaskID(), effectChannelTaskResult.getEffectChannels(), 23, null);
                } else {
                    this.mEffectListListener.updateEffectChannel(effectChannelTaskResult.getTaskID(), effectChannelTaskResult.getEffectChannels(), 27, exception);
                }
            }
        }
        if (message.what == 22) {
            Object obj2 = message.obj;
            if (obj2 instanceof FetchPanelInfoTaskResult) {
                FetchPanelInfoTaskResult fetchPanelInfoTaskResult = (FetchPanelInfoTaskResult) obj2;
                IFetchPanelInfoListener fetchPanelInfoListener = this.mConfiguration.getListenerManger().getFetchPanelInfoListener(fetchPanelInfoTaskResult.getTaskID());
                if (fetchPanelInfoListener != null) {
                    ExceptionResult exception2 = fetchPanelInfoTaskResult.getException();
                    if (exception2 == null) {
                        fetchPanelInfoListener.onSuccess(fetchPanelInfoTaskResult.getPanelInfoModel());
                    } else {
                        fetchPanelInfoListener.onFail(exception2);
                    }
                    this.mConfiguration.getListenerManger().removeFetchPanelInfoListener(fetchPanelInfoTaskResult.getTaskID());
                }
            }
        }
        if (message.what == 18) {
            Object obj3 = message.obj;
            if (obj3 instanceof ProviderEffectTaskResult) {
                ProviderEffectTaskResult providerEffectTaskResult = (ProviderEffectTaskResult) obj3;
                ExceptionResult exception3 = providerEffectTaskResult.getException();
                IFetchProviderEffect fetchProviderEffectListener = this.mConfiguration.getListenerManger().getFetchProviderEffectListener(providerEffectTaskResult.getTaskID());
                if (fetchProviderEffectListener != null) {
                    if (exception3 == null) {
                        fetchProviderEffectListener.onSuccess(providerEffectTaskResult.getEffectListResponse());
                    } else {
                        fetchProviderEffectListener.onFail(providerEffectTaskResult.getException());
                    }
                    this.mConfiguration.getListenerManger().removeFetchProviderEffectListener(providerEffectTaskResult.getTaskID());
                }
            }
        }
        if (message.what == 21) {
            Object obj4 = message.obj;
            if (obj4 instanceof FetchCategoryEffectTaskResult) {
                FetchCategoryEffectTaskResult fetchCategoryEffectTaskResult = (FetchCategoryEffectTaskResult) obj4;
                ExceptionResult exception4 = fetchCategoryEffectTaskResult.getException();
                IFetchCategoryEffectListener fetchCategoryEffectListener = this.mConfiguration.getListenerManger().getFetchCategoryEffectListener(fetchCategoryEffectTaskResult.getTaskID());
                if (fetchCategoryEffectListener != null) {
                    if (exception4 == null) {
                        fetchCategoryEffectListener.onSuccess(fetchCategoryEffectTaskResult.getEffectChannels());
                    } else {
                        fetchCategoryEffectListener.onFail(exception4);
                    }
                    this.mConfiguration.getListenerManger().removeFetchCategoryEffectListener(fetchCategoryEffectTaskResult.getTaskID());
                }
            }
        }
        if (message.what == 13) {
            Object obj5 = message.obj;
            if (obj5 instanceof EffectCheckUpdateResult) {
                EffectCheckUpdateResult effectCheckUpdateResult = (EffectCheckUpdateResult) obj5;
                ExceptionResult exception5 = effectCheckUpdateResult.getException();
                ICheckChannelListener checkChannelListener = this.mConfiguration.getListenerManger().getCheckChannelListener(effectCheckUpdateResult.getTaskID());
                if (checkChannelListener != null) {
                    if (exception5 == null) {
                        checkChannelListener.checkChannelSuccess(effectCheckUpdateResult.isUpdate());
                    } else {
                        checkChannelListener.checkChannelFailed(exception5);
                    }
                    this.mConfiguration.getListenerManger().removeCheckChannelListener(effectCheckUpdateResult.getTaskID());
                }
            }
        }
        if (message.what == 25) {
            Object obj6 = message.obj;
            if (obj6 instanceof ScanQRCodeTaskResult) {
                ScanQRCodeTaskResult scanQRCodeTaskResult = (ScanQRCodeTaskResult) obj6;
                ExceptionResult exceptionResult = scanQRCodeTaskResult.exception;
                IScanQRCodeListener scanQRCodeListener = this.mConfiguration.getListenerManger().getScanQRCodeListener(scanQRCodeTaskResult.getTaskID());
                if (scanQRCodeListener != null) {
                    if (exceptionResult == null) {
                        scanQRCodeListener.onSuccess(scanQRCodeTaskResult.effect);
                    } else {
                        scanQRCodeListener.onFail(exceptionResult);
                    }
                    this.mConfiguration.getListenerManger().removeScanQRCodeListener(scanQRCodeTaskResult.getTaskID());
                }
            }
        }
    }

    public void setOnEffectListListener(EffectListListener effectListListener) {
        this.mEffectListListener = effectListListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchEffectInfoByQRCode(EffectQRCode effectQRCode, IScanQRCodeListener iScanQRCodeListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setScanQRCodeListener(generateTaskId, iScanQRCodeListener);
        this.mConfiguration.getTaskManager().commit(new FetchEffectInfoByQRCodeTask(this.mEffectContext, effectQRCode, generateTaskId, this.mHandler));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchExistEffectList(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchEffectChannelListener(generateTaskId, iFetchEffectChannelListener);
        this.mConfiguration.getTaskManager().commit(new FetchExistEffectListTask(str, generateTaskId, this.mEffectContext, this.mHandler));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchList(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        ITask fetchEffectChannelTask;
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchEffectChannelListener(generateTaskId, iFetchEffectChannelListener);
        if (z) {
            fetchEffectChannelTask = new FetchEffectChannelCacheTask(this.mEffectContext, str, generateTaskId, this.mHandler, false);
        } else {
            fetchEffectChannelTask = new FetchEffectChannelTask(this.mEffectContext, str, generateTaskId, this.mHandler);
        }
        this.mConfiguration.getTaskManager().commit(fetchEffectChannelTask);
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchProviderEffectList(String str, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchProviderEffectListener(generateTaskId, iFetchProviderEffect);
        this.mConfiguration.getTaskManager().commit(new FetchProviderEffectTask(this.mEffectContext, generateTaskId, str, i, i2, this.mHandler));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String checkUpdate(String str, String str2, int i, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setCheckChannelListener(generateTaskId, iCheckChannelListener);
        this.mConfiguration.getTaskManager().commit(new CheckUpdateTask(this.mEffectContext, generateTaskId, this.mHandler, str, str2, i, map));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String searchProviderEffectList(String str, String str2, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchProviderEffectListener(generateTaskId, iFetchProviderEffect);
        this.mConfiguration.getTaskManager().commit(new SearchProviderEffectTask(this.mEffectContext, generateTaskId, str, str2, i, i2, this.mHandler));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchPanelInfo(String str, boolean z, String str2, int i, int i2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        ITask fetchPanelInfoTask;
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchPanelInfoListener(generateTaskId, iFetchPanelInfoListener);
        if (z2) {
            fetchPanelInfoTask = new FetchPanelInfoCacheTask(this.mEffectContext, str, generateTaskId, this.mHandler);
        } else {
            fetchPanelInfoTask = new FetchPanelInfoTask(this.mEffectContext, str, generateTaskId, z, str2, i, i2, this.mHandler);
        }
        this.mConfiguration.getTaskManager().commit(fetchPanelInfoTask);
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchCategoryEffect(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        ITask fetchCategoryEffectTask;
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchCategoryEffectListener(generateTaskId, iFetchCategoryEffectListener);
        if (z) {
            fetchCategoryEffectTask = new FetchCategoryEffectCacheTask(this.mEffectContext, str, generateTaskId, str2, i, i2, i3, str3, this.mHandler);
        } else {
            fetchCategoryEffectTask = new FetchCategoryEffectTask(this.mEffectContext, str, generateTaskId, str2, i, i2, i3, str3, this.mHandler);
        }
        this.mConfiguration.getTaskManager().commit(fetchCategoryEffectTask);
        return generateTaskId;
    }
}
