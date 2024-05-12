package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class MessageResponse extends BaseMessage {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.actionai.jni.BaseMessage
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                ActionAIJniJNI.delete_MessageResponse(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public ActionNodeList getActionDAG() {
        long MessageResponse_actionDAG_get = ActionAIJniJNI.MessageResponse_actionDAG_get(this.swigCPtr, this);
        if (MessageResponse_actionDAG_get == 0) {
            return null;
        }
        return new ActionNodeList(MessageResponse_actionDAG_get, false);
    }

    public String getConversationId() {
        return ActionAIJniJNI.MessageResponse_conversationId_get(this.swigCPtr, this);
    }

    public ActionAIErrorCode getErrorCode() {
        return ActionAIErrorCode.swigToEnum(ActionAIJniJNI.MessageResponse_errorCode_get(this.swigCPtr, this));
    }

    public String getErrorMsg() {
        return ActionAIJniJNI.MessageResponse_errorMsg_get(this.swigCPtr, this);
    }

    public String getMessage() {
        return ActionAIJniJNI.MessageResponse_message_get(this.swigCPtr, this);
    }

    public ServerErrorInfo getServerErrorInfo() {
        return new ServerErrorInfo(ActionAIJniJNI.MessageResponse_serverErrorInfo_get(this.swigCPtr, this), true);
    }

    public MessageResponse() {
        this(ActionAIJniJNI.new_MessageResponse(), true);
    }

    @Override // com.bytedance.ies.actionai.jni.BaseMessage
    public void finalize() {
        delete();
    }

    public static long getCPtr(MessageResponse messageResponse) {
        if (messageResponse == null) {
            return 0L;
        }
        return messageResponse.swigCPtr;
    }

    public void setActionDAG(ActionNodeList actionNodeList) {
        ActionAIJniJNI.MessageResponse_actionDAG_set(this.swigCPtr, this, ActionNodeList.getCPtr(actionNodeList), actionNodeList);
    }

    public void setConversationId(String str) {
        ActionAIJniJNI.MessageResponse_conversationId_set(this.swigCPtr, this, str);
    }

    public void setErrorCode(ActionAIErrorCode actionAIErrorCode) {
        ActionAIJniJNI.MessageResponse_errorCode_set(this.swigCPtr, this, actionAIErrorCode.swigValue());
    }

    public void setErrorMsg(String str) {
        ActionAIJniJNI.MessageResponse_errorMsg_set(this.swigCPtr, this, str);
    }

    public void setMessage(String str) {
        ActionAIJniJNI.MessageResponse_message_set(this.swigCPtr, this, str);
    }

    public void setServerErrorInfo(ServerErrorInfo serverErrorInfo) {
        ActionAIJniJNI.MessageResponse_serverErrorInfo_set(this.swigCPtr, this, ServerErrorInfo.getCPtr(serverErrorInfo), serverErrorInfo);
    }

    @Override // com.bytedance.ies.actionai.jni.BaseMessage
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public MessageResponse(long j, boolean z) {
        super(ActionAIJniJNI.MessageResponse_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
