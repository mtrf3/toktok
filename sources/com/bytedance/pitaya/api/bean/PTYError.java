package com.bytedance.pitaya.api.bean;

import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;

/* loaded from: classes4.dex */
public final class PTYError extends F9E implements ReflectionCall {
    public final int code;
    public final String domain;
    public final List<String> stacks;
    public final int subCode;
    public final String summary;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PTYError copy$default(PTYError pTYError, String str, int i, int i2, String str2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = pTYError.domain;
        }
        if ((i3 & 2) != 0) {
            i = pTYError.code;
        }
        if ((i3 & 4) != 0) {
            i2 = pTYError.subCode;
        }
        if ((i3 & 8) != 0) {
            str2 = pTYError.summary;
        }
        if ((i3 & 16) != 0) {
            list = pTYError.stacks;
        }
        return pTYError.copy(str, i, i2, str2, list);
    }

    public final PTYError copy(String str, int i, int i2, String str2, List<String> list) {
        return new PTYError(str, i, i2, str2, list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.domain, Integer.valueOf(this.code), Integer.valueOf(this.subCode), this.summary, this.stacks};
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final List<String> getStacks() {
        return this.stacks;
    }

    public final int getSubCode() {
        return this.subCode;
    }

    public final String getSummary() {
        return this.summary;
    }

    public PTYError(String str, int i, int i2, String str2, List<String> list) {
        this.domain = str;
        this.code = i;
        this.subCode = i2;
        this.summary = str2;
        this.stacks = list;
    }
}
