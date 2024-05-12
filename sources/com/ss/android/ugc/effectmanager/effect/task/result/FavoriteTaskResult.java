package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class FavoriteTaskResult extends BaseTaskResult {
    public List<String> mEffectIds;
    public ExceptionResult mException;
    public boolean mIsSuccess;

    public List<String> getEffectIds() {
        return this.mEffectIds;
    }

    public ExceptionResult getException() {
        return this.mException;
    }

    public boolean isSuccess() {
        return this.mIsSuccess;
    }

    public FavoriteTaskResult(boolean z, List<String> list, ExceptionResult exceptionResult) {
        ArrayList arrayList = new ArrayList();
        this.mEffectIds = arrayList;
        this.mIsSuccess = z;
        arrayList.clear();
        this.mEffectIds.addAll(list);
        this.mException = exceptionResult;
    }
}
