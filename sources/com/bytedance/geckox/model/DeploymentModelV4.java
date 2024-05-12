package com.bytedance.geckox.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import Y.IDComparatorS36S0000000_8;
import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class DeploymentModelV4 extends DeploymentModel {

    @InterfaceC65349Pkn("group_name")
    public List<V4Group> groupName;

    private String getSortStringByV4Group() {
        List<V4Group> list = this.groupName;
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(this.groupName, new IDComparatorS36S0000000_8(2));
        StringBuffer stringBuffer = new StringBuffer();
        for (V4Group v4Group : this.groupName) {
            if (v4Group != null && !TextUtils.isEmpty(v4Group.name)) {
                stringBuffer.append(v4Group.name);
            }
        }
        return stringBuffer.toString();
    }

    public DeploymentModelV4() {
        this.groupName = new ArrayList();
        this.targetChannels = new ArrayList();
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public String getSortString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getSortStringByV4Group());
        LIZ.append("-");
        LIZ.append(getSortStringByChannels());
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes9.dex */
    public static class V4Group {

        @InterfaceC65349Pkn("from")
        public String from;

        @InterfaceC65349Pkn("name")
        public String name;

        public V4Group() {
        }

        public V4Group(String str) {
            this.name = str;
        }

        public V4Group(String str, String str2) {
            this.name = str;
            this.from = str2;
        }
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public List<V4Group> getGroupName() {
        return this.groupName;
    }

    @Override // com.bytedance.geckox.model.DeploymentModel
    public void addToGroupName(Object obj) {
        this.groupName.add(obj);
    }

    public DeploymentModelV4(List<V4Group> list, List<CheckRequestBodyModel.TargetChannel> list2) {
        this.groupName = list;
        this.targetChannels = list2;
    }
}
