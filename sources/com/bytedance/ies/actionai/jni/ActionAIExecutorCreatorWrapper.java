package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionAIExecutorCreatorWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionAIExecutorCreatorWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ActionAIExecutorCreatorWrapper() {
        this(ActionAIJniJNI.new_ActionAIExecutorCreatorWrapper(), true);
    }

    public static IActionAIExecutorCreator getDefaultExecutorCreator() {
        long ActionAIExecutorCreatorWrapper_getDefaultExecutorCreator = ActionAIJniJNI.ActionAIExecutorCreatorWrapper_getDefaultExecutorCreator();
        if (ActionAIExecutorCreatorWrapper_getDefaultExecutorCreator == 0) {
            return null;
        }
        return new IActionAIExecutorCreator(ActionAIExecutorCreatorWrapper_getDefaultExecutorCreator, true);
    }

    public static ActionAIExecutorCreatorWrapper obtain() {
        long ActionAIExecutorCreatorWrapper_obtain = ActionAIJniJNI.ActionAIExecutorCreatorWrapper_obtain();
        if (ActionAIExecutorCreatorWrapper_obtain == 0) {
            return null;
        }
        return new ActionAIExecutorCreatorWrapper(ActionAIExecutorCreatorWrapper_obtain, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionAIExecutorCreatorWrapper actionAIExecutorCreatorWrapper) {
        if (actionAIExecutorCreatorWrapper == null) {
            return 0L;
        }
        return actionAIExecutorCreatorWrapper.swigCPtr;
    }

    public static void setDefaultActionExecutorCreator(IActionAIExecutorCreator iActionAIExecutorCreator) {
        ActionAIJniJNI.ActionAIExecutorCreatorWrapper_setDefaultActionExecutorCreator(IActionAIExecutorCreator.getCPtr(iActionAIExecutorCreator), iActionAIExecutorCreator);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionAIExecutorCreatorWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
