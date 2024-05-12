package com.bytedance.geckox.model;

import X.InterfaceC65349Pkn;
import Y.IDComparatorS36S0000000_8;
import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class DeploymentModel {

    @InterfaceC65349Pkn("target_channels")
    public List<CheckRequestBodyModel.TargetChannel> targetChannels;

    public abstract void addToGroupName(Object obj);

    public abstract List<?> getGroupName();

    public abstract String getSortString();

    public String getSortStringByChannels() {
        List<CheckRequestBodyModel.TargetChannel> list = this.targetChannels;
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(this.targetChannels, new IDComparatorS36S0000000_8(1));
        StringBuffer stringBuffer = new StringBuffer();
        for (CheckRequestBodyModel.TargetChannel targetChannel : this.targetChannels) {
            if (targetChannel != null && !TextUtils.isEmpty(targetChannel.channelName)) {
                stringBuffer.append(targetChannel.channelName);
            }
        }
        return stringBuffer.toString();
    }

    public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
        return this.targetChannels;
    }

    public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
        this.targetChannels = list;
    }
}
