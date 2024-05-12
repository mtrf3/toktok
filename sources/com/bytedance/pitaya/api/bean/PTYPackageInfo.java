package com.bytedance.pitaya.api.bean;

import X.EAH;
import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class PTYPackageInfo extends F9E implements ReflectionCall {
    public static final EAH Companion = new EAH();
    public final String buildTime;
    public final String deployment;
    public final JSONObject extra;
    public final String extraStr;
    public final int from;
    public final List<PTYModelInfo> models;
    public final String name;
    public final int taskType;
    public final String version;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PTYPackageInfo copy$default(PTYPackageInfo pTYPackageInfo, String str, String str2, String str3, int i, int i2, String str4, String str5, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = pTYPackageInfo.name;
        }
        if ((i3 & 2) != 0) {
            str2 = pTYPackageInfo.version;
        }
        if ((i3 & 4) != 0) {
            str3 = pTYPackageInfo.deployment;
        }
        if ((i3 & 8) != 0) {
            i = pTYPackageInfo.taskType;
        }
        if ((i3 & 16) != 0) {
            i2 = pTYPackageInfo.from;
        }
        if ((i3 & 32) != 0) {
            str4 = pTYPackageInfo.buildTime;
        }
        if ((i3 & 64) != 0) {
            str5 = pTYPackageInfo.extraStr;
        }
        if ((i3 & 128) != 0) {
            list = pTYPackageInfo.models;
        }
        return pTYPackageInfo.copy(str, str2, str3, i, i2, str4, str5, list);
    }

    public final PTYPackageInfo copy(String name, String version, String deployment, int i, int i2, String buildTime, String str, List<PTYModelInfo> list) {
        o.LJIIJ(name, "name");
        o.LJIIJ(version, "version");
        o.LJIIJ(deployment, "deployment");
        o.LJIIJ(buildTime, "buildTime");
        return new PTYPackageInfo(name, version, deployment, i, i2, buildTime, str, list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, this.version, this.deployment, Integer.valueOf(this.taskType), Integer.valueOf(this.from), this.buildTime, this.extraStr, this.models};
    }

    public final String getBuildTime() {
        return this.buildTime;
    }

    public final String getDeployment() {
        return this.deployment;
    }

    public final JSONObject getExtra() {
        return this.extra;
    }

    public final String getExtraStr() {
        return this.extraStr;
    }

    public final int getFrom() {
        return this.from;
    }

    public final List<PTYModelInfo> getModels() {
        return this.models;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTaskType() {
        return this.taskType;
    }

    public final String getVersion() {
        return this.version;
    }

    public PTYPackageInfo(String name, String version, String deployment, int i, int i2, String buildTime, String str, List<PTYModelInfo> list) {
        JSONObject jSONObject;
        o.LJIIJ(name, "name");
        o.LJIIJ(version, "version");
        o.LJIIJ(deployment, "deployment");
        o.LJIIJ(buildTime, "buildTime");
        this.name = name;
        this.version = version;
        this.deployment = deployment;
        this.taskType = i;
        this.from = i2;
        this.buildTime = buildTime;
        this.extraStr = str;
        this.models = list;
        if (str != null) {
            jSONObject = new JSONObject(str);
        } else {
            jSONObject = null;
        }
        this.extra = jSONObject;
    }
}
