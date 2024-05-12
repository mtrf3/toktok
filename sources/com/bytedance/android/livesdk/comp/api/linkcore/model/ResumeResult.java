package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C15890jp;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ResumeResult {
    public final Map<String, byte[]> extraItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResumeResult copy$default(ResumeResult resumeResult, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = resumeResult.extraItems;
        }
        return resumeResult.copy(map);
    }

    public final Map<String, byte[]> component1() {
        return this.extraItems;
    }

    public final ResumeResult copy(Map<String, byte[]> map) {
        return new ResumeResult(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResumeResult) && o.LJ(this.extraItems, ((ResumeResult) obj).extraItems);
    }

    public int hashCode() {
        Map<String, byte[]> map = this.extraItems;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResumeResult(extraItems=");
        return C15890jp.LIZ(LIZ, this.extraItems, ')', LIZ);
    }

    public ResumeResult(Map<String, byte[]> map) {
        this.extraItems = map;
    }
}
