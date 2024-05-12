package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class FollowUpQuestionMsgResponse extends MessageResponse {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.actionai.jni.MessageResponse, com.bytedance.ies.actionai.jni.BaseMessage
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                ActionAIJniJNI.delete_FollowUpQuestionMsgResponse(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public StringList getFollowUpQuestionList() {
        long FollowUpQuestionMsgResponse_followUpQuestionList_get = ActionAIJniJNI.FollowUpQuestionMsgResponse_followUpQuestionList_get(this.swigCPtr, this);
        if (FollowUpQuestionMsgResponse_followUpQuestionList_get == 0) {
            return null;
        }
        return new StringList(FollowUpQuestionMsgResponse_followUpQuestionList_get, false);
    }

    public FollowUpQuestionMsgResponse() {
        this(ActionAIJniJNI.new_FollowUpQuestionMsgResponse(), true);
    }

    @Override // com.bytedance.ies.actionai.jni.MessageResponse, com.bytedance.ies.actionai.jni.BaseMessage
    public void finalize() {
        delete();
    }

    public static FollowUpQuestionMsgResponse dynamicCast(MessageResponse messageResponse) {
        long FollowUpQuestionMsgResponse_dynamicCast = ActionAIJniJNI.FollowUpQuestionMsgResponse_dynamicCast(MessageResponse.getCPtr(messageResponse), messageResponse);
        if (FollowUpQuestionMsgResponse_dynamicCast == 0) {
            return null;
        }
        return new FollowUpQuestionMsgResponse(FollowUpQuestionMsgResponse_dynamicCast, true);
    }

    public static long getCPtr(FollowUpQuestionMsgResponse followUpQuestionMsgResponse) {
        if (followUpQuestionMsgResponse == null) {
            return 0L;
        }
        return followUpQuestionMsgResponse.swigCPtr;
    }

    public void setFollowUpQuestionList(StringList stringList) {
        ActionAIJniJNI.FollowUpQuestionMsgResponse_followUpQuestionList_set(this.swigCPtr, this, StringList.getCPtr(stringList), stringList);
    }

    @Override // com.bytedance.ies.actionai.jni.MessageResponse, com.bytedance.ies.actionai.jni.BaseMessage
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public FollowUpQuestionMsgResponse(long j, boolean z) {
        super(ActionAIJniJNI.FollowUpQuestionMsgResponse_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
