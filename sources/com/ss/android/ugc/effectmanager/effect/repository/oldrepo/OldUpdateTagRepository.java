package com.ss.android.ugc.effectmanager.effect.repository.oldrepo;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.common.WeakHandler;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.ss.android.ugc.effectmanager.common.utils.ValueConvertUtil;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IReadUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.listener.IWriteUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.repository.IUpdateTagRepository;
import com.ss.android.ugc.effectmanager.effect.task.result.ReadTagTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.WriteTagTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.ReadUpdateTagTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.WriteUpdateTagTask;
import java.util.HashMap;

/* loaded from: classes16.dex */
public class OldUpdateTagRepository implements WeakHandler.IHandler, IUpdateTagRepository {
    public EffectContext mEffectContext;
    public HashMap<String, String> mTagsCachedMap;
    public final String TAG = "OldUpdateTagRepository";
    public Handler mHandler = new WeakHandler(this);

    public OldUpdateTagRepository(EffectContext effectContext) {
        this.mEffectContext = effectContext;
    }

    @Override // com.ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public void handleMsg(Message message) {
        int i = message.what;
        if (i != 51) {
            if (i != 52) {
                EPLog.e("OldUpdateTagRepository", "unknown error");
                return;
            }
            Object obj = message.obj;
            if (!(obj instanceof ReadTagTaskResult)) {
                return;
            }
            ReadTagTaskResult readTagTaskResult = (ReadTagTaskResult) obj;
            EffectContext effectContext = this.mEffectContext;
            if (effectContext == null) {
                return;
            }
            IReadUpdateTagListener readUpdateTagListener = effectContext.getEffectConfiguration().getListenerManger().getReadUpdateTagListener(readTagTaskResult.getTaskID());
            if (this.mTagsCachedMap == null) {
                this.mTagsCachedMap = new HashMap<>();
            }
            if (readTagTaskResult.getException() == null) {
                this.mTagsCachedMap.putAll(readTagTaskResult.getTagsCachedMap());
                if (readUpdateTagListener != null) {
                    readUpdateTagListener.onSuccess(this.mTagsCachedMap);
                }
            } else if (readUpdateTagListener != null) {
                readUpdateTagListener.onFailed(readTagTaskResult.getException());
            }
            this.mEffectContext.getEffectConfiguration().getListenerManger().removeReadUpdateTagListener(readTagTaskResult.getTaskID());
            return;
        }
        Object obj2 = message.obj;
        if (!(obj2 instanceof WriteTagTaskResult)) {
            return;
        }
        BaseTaskResult baseTaskResult = (BaseTaskResult) obj2;
        EffectContext effectContext2 = this.mEffectContext;
        if (effectContext2 == null) {
            return;
        }
        IWriteUpdateTagListener writeUpdateTagListener = effectContext2.getEffectConfiguration().getListenerManger().getWriteUpdateTagListener(baseTaskResult.getTaskID());
        if (writeUpdateTagListener != null) {
            writeUpdateTagListener.onFinally();
        }
        this.mEffectContext.getEffectConfiguration().getListenerManger().removeWriteUpdateTagListener(baseTaskResult.getTaskID());
    }

    public void checkedTagInHashMap(String str, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        if (iIsTagNeedUpdatedListener == null) {
            return;
        }
        HashMap<String, String> hashMap = this.mTagsCachedMap;
        if (hashMap == null) {
            iIsTagNeedUpdatedListener.onTagNeedUpdate();
            return;
        }
        if (hashMap.containsKey(str)) {
            if (ValueConvertUtil.ConvertStringToLong(str2, -1L) > ValueConvertUtil.ConvertStringToLong(this.mTagsCachedMap.get(str), -1L)) {
                iIsTagNeedUpdatedListener.onTagNeedUpdate();
                return;
            } else {
                iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
                return;
            }
        }
        iIsTagNeedUpdatedListener.onTagNeedUpdate();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IUpdateTagRepository
    public String isTagUpdated(final String str, final String str2, final IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        if (this.mTagsCachedMap == null) {
            EffectContext effectContext = this.mEffectContext;
            if (effectContext == null) {
                if (iIsTagNeedUpdatedListener != null) {
                    iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
                }
                return generateTaskId;
            }
            effectContext.getEffectConfiguration().getListenerManger().setReadUpdateTagListener(generateTaskId, new IReadUpdateTagListener() { // from class: com.ss.android.ugc.effectmanager.effect.repository.oldrepo.OldUpdateTagRepository.3
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IReadUpdateTagListener
                public void onFailed(ExceptionResult exceptionResult) {
                    IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener2 = iIsTagNeedUpdatedListener;
                    if (iIsTagNeedUpdatedListener2 != null) {
                        iIsTagNeedUpdatedListener2.onTagNeedUpdate();
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public void onSuccess(HashMap<String, String> hashMap) {
                    OldUpdateTagRepository.this.checkedTagInHashMap(str, str2, iIsTagNeedUpdatedListener);
                }
            });
            this.mEffectContext.getEffectConfiguration().getTaskManager().commit(new ReadUpdateTagTask(this.mHandler, this.mEffectContext, generateTaskId, str, str2));
        } else {
            checkedTagInHashMap(str, str2, iIsTagNeedUpdatedListener);
        }
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IUpdateTagRepository
    public String updateTag(final String str, final String str2, final IUpdateTagListener iUpdateTagListener) {
        final String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        if (this.mTagsCachedMap == null) {
            EffectContext effectContext = this.mEffectContext;
            if (effectContext == null) {
                if (iUpdateTagListener != null) {
                    iUpdateTagListener.onFinally();
                }
                return generateTaskId;
            }
            effectContext.getEffectConfiguration().getListenerManger().setReadUpdateTagListener(generateTaskId, new IReadUpdateTagListener() { // from class: com.ss.android.ugc.effectmanager.effect.repository.oldrepo.OldUpdateTagRepository.2
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IReadUpdateTagListener
                public void onFailed(ExceptionResult exceptionResult) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public void onSuccess(HashMap<String, String> hashMap) {
                    OldUpdateTagRepository.this.requestWriteTask(generateTaskId, str, str2, iUpdateTagListener);
                }
            });
            this.mEffectContext.getEffectConfiguration().getTaskManager().commit(new ReadUpdateTagTask(this.mHandler, this.mEffectContext, generateTaskId, str, str2));
        } else {
            requestWriteTask(generateTaskId, str, str2, iUpdateTagListener);
        }
        return generateTaskId;
    }

    public void requestWriteTask(String str, String str2, String str3, final IUpdateTagListener iUpdateTagListener) {
        if (this.mEffectContext == null) {
            if (iUpdateTagListener != null) {
                iUpdateTagListener.onFinally();
                return;
            }
            return;
        }
        HashMap<String, String> hashMap = this.mTagsCachedMap;
        if (hashMap == null) {
            iUpdateTagListener.onFinally();
            return;
        }
        hashMap.put(str2, str3);
        this.mEffectContext.getEffectConfiguration().getListenerManger().setWriteUpdateTagListener(str, new IWriteUpdateTagListener() { // from class: com.ss.android.ugc.effectmanager.effect.repository.oldrepo.OldUpdateTagRepository.1
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IWriteUpdateTagListener
            public void onFinally() {
                IUpdateTagListener iUpdateTagListener2 = iUpdateTagListener;
                if (iUpdateTagListener2 != null) {
                    iUpdateTagListener2.onFinally();
                }
            }
        });
        this.mEffectContext.getEffectConfiguration().getTaskManager().commit(new WriteUpdateTagTask(this.mHandler, this.mEffectContext, str, this.mTagsCachedMap));
    }
}
