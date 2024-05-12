package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import java.util.HashMap;

/* loaded from: classes16.dex */
public class ReadTagTaskResult extends BaseTaskResult {
    public ExceptionResult exception;
    public String mId;
    public HashMap<String, String> mTagsCachedMap;
    public String mUpdateTime;

    public ExceptionResult getException() {
        return this.exception;
    }

    public String getId() {
        return this.mId;
    }

    public HashMap<String, String> getTagsCachedMap() {
        return this.mTagsCachedMap;
    }

    public String getUpdateTime() {
        return this.mUpdateTime;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setTagsCachedMap(HashMap<String, String> hashMap) {
        this.mTagsCachedMap = hashMap;
    }

    public void setUpdateTime(String str) {
        this.mUpdateTime = str;
    }

    public ReadTagTaskResult(String str, String str2, HashMap<String, String> hashMap, ExceptionResult exceptionResult) {
        this.mTagsCachedMap = hashMap;
        this.exception = exceptionResult;
        this.mId = str;
        this.mUpdateTime = str2;
    }
}
