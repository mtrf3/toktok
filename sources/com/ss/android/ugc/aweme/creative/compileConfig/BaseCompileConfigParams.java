package com.ss.android.ugc.aweme.creative.compileConfig;

import X.InterfaceC74236TBo;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class BaseCompileConfigParams {
    public int curPriority;
    public String curStrategyName = "default";
    public String curStage = "common";

    public final int getCurPriority() {
        return this.curPriority;
    }

    public final String getCurStage() {
        return this.curStage;
    }

    public final String getCurStrategyName() {
        return this.curStrategyName;
    }

    public final void setCurPriority(int i) {
        this.curPriority = i;
    }

    public final void setCurStage(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.curStage = str;
    }

    public final void setCurStrategyName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.curStrategyName = str;
    }

    public final <T> void logInfo(InterfaceC74236TBo<?> property, T t, T t2) {
        o.LJIIIZ(property, "property");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\nStrategyName : ");
        LIZ.append(getCurStage());
        LIZ.append('-');
        LIZ.append(getCurStrategyName());
        LIZ.append('-');
        LIZ.append(getCurPriority());
        LIZ.append(" ; \n--- property : ");
        LIZ.append(property.getName());
        LIZ.append(" ; \n------ oldValue : ");
        o.LJIJ();
        throw null;
    }
}
