package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum ActionType {
    ActionType_NoAction(0),
    ActionType_None,
    ActionType_General,
    ActionType_Sticker,
    ActionType_AppearAnimation,
    ActionType_DisappearAnimation,
    ActionType_Group;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ActionType swigToEnum(int i) {
        ActionType[] actionTypeArr = (ActionType[]) ActionType.class.getEnumConstants();
        if (i < actionTypeArr.length && i >= 0) {
            ActionType actionType = actionTypeArr[i];
            if (actionType.swigValue == i) {
                return actionType;
            }
        }
        for (ActionType actionType2 : actionTypeArr) {
            if (actionType2.swigValue == i) {
                return actionType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(ActionType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static ActionType valueOf(String str) {
        return (ActionType) V0N.LJJJ(ActionType.class, str);
    }

    ActionType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ActionType(ActionType actionType) {
        int i = actionType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ActionType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
