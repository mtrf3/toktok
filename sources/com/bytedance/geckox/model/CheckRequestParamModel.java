package com.bytedance.geckox.model;

import X.InterfaceC65349Pkn;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.List;

/* loaded from: classes11.dex */
public class CheckRequestParamModel {

    @InterfaceC65349Pkn("group_name")
    public String group;

    @InterfaceC65349Pkn("target_channels")
    public List<CheckRequestBodyModel.TargetChannel> targetChannels;

    public String getGroup() {
        return this.group;
    }

    public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
        return this.targetChannels;
    }

    public CheckRequestParamModel(String str) {
        this.group = str;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
        this.targetChannels = list;
    }

    public CheckRequestParamModel(String str, List<CheckRequestBodyModel.TargetChannel> list) {
        this.group = str;
        this.targetChannels = list;
    }
}
