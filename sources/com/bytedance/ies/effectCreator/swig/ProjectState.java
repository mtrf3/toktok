package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum ProjectState {
    ProjectState_Canvas(0),
    ProjectState_Preview(1);

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ProjectState swigToEnum(int i) {
        ProjectState[] projectStateArr = (ProjectState[]) ProjectState.class.getEnumConstants();
        if (i < projectStateArr.length && i >= 0) {
            ProjectState projectState = projectStateArr[i];
            if (projectState.swigValue == i) {
                return projectState;
            }
        }
        for (ProjectState projectState2 : projectStateArr) {
            if (projectState2.swigValue == i) {
                return projectState2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(ProjectState.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static ProjectState valueOf(String str) {
        return (ProjectState) V0N.LJJJ(ProjectState.class, str);
    }

    ProjectState() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ProjectState(ProjectState projectState) {
        int i = projectState.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ProjectState(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
