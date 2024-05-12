package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* loaded from: classes16.dex */
public class FetchPanelInfoTaskResult extends BaseTaskResult {
    public ExceptionResult exception;
    public PanelInfoModel panelInfoModel;

    public ExceptionResult getException() {
        return this.exception;
    }

    public PanelInfoModel getPanelInfoModel() {
        return this.panelInfoModel;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public void setPanelInfoModel(PanelInfoModel panelInfoModel) {
        this.panelInfoModel = panelInfoModel;
    }

    public FetchPanelInfoTaskResult(PanelInfoModel panelInfoModel, ExceptionResult exceptionResult) {
        this.panelInfoModel = panelInfoModel;
        this.exception = exceptionResult;
    }
}
