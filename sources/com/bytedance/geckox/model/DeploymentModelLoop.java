package com.bytedance.geckox.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class DeploymentModelLoop extends DeploymentModel {

    @InterfaceC65349Pkn("group_name")
    public List<String> groupName;

    private String getSortStringByGroup() {
        List<String> list = this.groupName;
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(this.groupName);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : this.groupName) {
            if (str != null && !TextUtils.isEmpty(str)) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    public DeploymentModelLoop() {
        this.groupName = new ArrayList();
        this.targetChannels = new ArrayList();
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public String getSortString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getSortStringByGroup());
        LIZ.append("-");
        LIZ.append(getSortStringByChannels());
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public List<String> getGroupName() {
        return this.groupName;
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public void addToGroupName(Object obj) {
        this.groupName.add(obj);
    }

    public DeploymentModelLoop(List<String> list, List<CheckRequestBodyModel.TargetChannel> list2) {
        this.groupName = list;
        this.targetChannels = list2;
    }
}
