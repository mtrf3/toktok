package com.bytedance.ies.nle.editor_jni;

import X.AnonymousClass073;
import X.C5OI;
import X.V0N;

/* loaded from: classes3.dex */
public enum NLERenderAction {
    ACTION_UNKNOWN(-1),
    ACTION_INSERT(0),
    ACTION_UPDATE(1),
    ACTION_DELETE(2);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLERenderAction swigToEnum(int i) {
        NLERenderAction[] nLERenderActionArr = (NLERenderAction[]) NLERenderAction.class.getEnumConstants();
        if (i < nLERenderActionArr.length && i >= 0) {
            NLERenderAction nLERenderAction = nLERenderActionArr[i];
            if (nLERenderAction.swigValue == i) {
                return nLERenderAction;
            }
        }
        for (NLERenderAction nLERenderAction2 : nLERenderActionArr) {
            if (nLERenderAction2.swigValue == i) {
                return nLERenderAction2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", NLERenderAction.class, " with value ", i));
    }

    public static NLERenderAction valueOf(String str) {
        return (NLERenderAction) V0N.LJJJ(NLERenderAction.class, str);
    }

    NLERenderAction() {
        int i = C5OI.LIZ;
        C5OI.LIZ = i + 1;
        this.swigValue = i;
    }

    NLERenderAction(NLERenderAction nLERenderAction) {
        int i = nLERenderAction.swigValue;
        this.swigValue = i;
        C5OI.LIZ = i + 1;
    }

    NLERenderAction(int i) {
        this.swigValue = i;
        C5OI.LIZ = i + 1;
    }
}
