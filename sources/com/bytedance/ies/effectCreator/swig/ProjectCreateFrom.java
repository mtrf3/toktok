package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum ProjectCreateFrom {
    ProjectCreateFrom_EmptyDraft(0),
    ProjectCreateFrom_UserDraft,
    ProjectCreateFrom_Template;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ProjectCreateFrom swigToEnum(int i) {
        ProjectCreateFrom[] projectCreateFromArr = (ProjectCreateFrom[]) ProjectCreateFrom.class.getEnumConstants();
        if (i < projectCreateFromArr.length && i >= 0) {
            ProjectCreateFrom projectCreateFrom = projectCreateFromArr[i];
            if (projectCreateFrom.swigValue == i) {
                return projectCreateFrom;
            }
        }
        for (ProjectCreateFrom projectCreateFrom2 : projectCreateFromArr) {
            if (projectCreateFrom2.swigValue == i) {
                return projectCreateFrom2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(ProjectCreateFrom.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static ProjectCreateFrom valueOf(String str) {
        return (ProjectCreateFrom) V0N.LJJJ(ProjectCreateFrom.class, str);
    }

    ProjectCreateFrom() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ProjectCreateFrom(ProjectCreateFrom projectCreateFrom) {
        int i = projectCreateFrom.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ProjectCreateFrom(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
