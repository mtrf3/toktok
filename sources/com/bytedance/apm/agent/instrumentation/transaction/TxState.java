package com.bytedance.apm.agent.instrumentation.transaction;

import X.C0H1;
import X.V0N;
import X.X1D;
import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class TxState {
    public static final AgentLog AGENT_LOG = AgentLogManager.getAgentLog();
    public long mBytesReceived;
    public long mBytesSent;
    public long mEndTime;
    public int mErrorCode;
    public String mHttpMethod;
    public String mRawUrl;
    public long mStartTime;
    public int mStatusCode;
    public TransactionData mTransactionData;
    public String mUrl;
    public String mCarrier = "unknown";
    public String mWanType = "unknown";
    public State mState = State.IS_READY;
    public JSONObject mExtraData = new JSONObject();

    private TransactionData toTransactionData() {
        if (!isComplete()) {
            AGENT_LOG.warning("toTransactionData is called on incomplete TransactionState");
        }
        String str = this.mUrl;
        if (str == null) {
            AGENT_LOG.error("Attempts to convert TransactionData TransactionState instance without URL into TransactionData TransactionData");
            return null;
        }
        if (this.mTransactionData == null) {
            TransactionData transactionData = new TransactionData(str, this.mCarrier, this.mEndTime - this.mStartTime, this.mStatusCode, this.mErrorCode, this.mBytesSent, this.mBytesReceived, this.mWanType, this.mHttpMethod, this.mExtraData);
            this.mTransactionData = transactionData;
            transactionData.setErrorCode(this.mErrorCode);
            this.mTransactionData.setRequestEnd(this.mEndTime);
        }
        return this.mTransactionData;
    }

    public boolean isComplete() {
        if (this.mState.ordinal() >= State.IS_COMPLETE.ordinal()) {
            return true;
        }
        return false;
    }

    public boolean isSent() {
        if (this.mState.ordinal() >= State.IS_SENT.ordinal()) {
            return true;
        }
        return false;
    }

    public TransactionData end() {
        StringBuilder LIZ = X1D.LIZ();
        addAssistData("startTime", C0H1.LIZJ(LIZ, this.mStartTime, "", LIZ));
        if (isComplete()) {
            return toTransactionData();
        }
        this.mState = State.IS_COMPLETE;
        this.mEndTime = System.currentTimeMillis();
        return toTransactionData();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" StartTime ");
        LIZ.append(this.mStartTime);
        LIZ.append(" BytesReceived ");
        LIZ.append(this.mBytesReceived);
        LIZ.append(" BytesSent ");
        LIZ.append(this.mBytesSent);
        LIZ.append(" Url ");
        LIZ.append(this.mUrl);
        return X1D.LIZIZ(LIZ);
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public long getReceivedBytes() {
        return this.mBytesReceived;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public String getUrl() {
        return this.mUrl;
    }

    /* loaded from: classes.dex */
    public enum State {
        IS_READY,
        IS_SENT,
        IS_COMPLETE;

        public static State valueOf(String str) {
            return (State) V0N.LJJJ(State.class, str);
        }
    }

    public void setBytesReceived(long j) {
        if (isComplete()) {
            AgentLog agentLog = AGENT_LOG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setBytesReceived is called on TransactionState in ");
            LIZ.append(this.mState);
            LIZ.append(" state");
            agentLog.warning(X1D.LIZIZ(LIZ));
            return;
        }
        this.mBytesReceived = j;
    }

    public void setBytesSent(long j) {
        if (isComplete()) {
            AgentLog agentLog = AGENT_LOG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setBytesSent(...) called on TransactionState in ");
            LIZ.append(this.mState.toString());
            LIZ.append(" state");
            agentLog.warning(X1D.LIZIZ(LIZ));
            return;
        }
        this.mBytesSent = j;
        this.mState = State.IS_SENT;
    }

    public void setCarrier(String str) {
        if (!isSent()) {
            this.mCarrier = str;
            return;
        }
        AgentLog agentLog = AGENT_LOG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setCarrier is called on TransactionState in ");
        LIZ.append(this.mState);
        LIZ.append(" state");
        agentLog.warning(X1D.LIZIZ(LIZ));
    }

    public void setErrorCode(int i) {
        if (isComplete()) {
            TransactionData transactionData = this.mTransactionData;
            if (transactionData != null) {
                transactionData.setErrorCode(i);
            }
            AgentLog agentLog = AGENT_LOG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setErrorCode(...) called on TransactionState in ");
            LIZ.append(this.mState.toString());
            LIZ.append(" state");
            agentLog.warning(X1D.LIZIZ(LIZ));
            return;
        }
        this.mErrorCode = i;
    }

    public void setMethod(String str) {
        if (!isSent()) {
            this.mHttpMethod = str;
            return;
        }
        AgentLog agentLog = AGENT_LOG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setHttpMethod(...) called on TransactionState in ");
        LIZ.append(this.mState.toString());
        LIZ.append(" state");
        agentLog.warning(X1D.LIZIZ(LIZ));
    }

    public void setStartTime(long j) {
        this.mStartTime = j;
    }

    public void setStatusCode(int i) {
        if (isComplete()) {
            if (this.mStatusCode == 0 && i != 0) {
                this.mStatusCode = i;
            }
            AgentLog agentLog = AGENT_LOG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setStatusCode(...) called on TransactionState in ");
            LIZ.append(this.mState.toString());
            LIZ.append(" state");
            agentLog.warning(X1D.LIZIZ(LIZ));
            return;
        }
        this.mStatusCode = i;
    }

    public void setUrl(String str) {
        if (this.mRawUrl == null) {
            this.mRawUrl = str;
        }
        String str2 = null;
        if (str == null) {
            return;
        }
        try {
            URL url = new URL(str);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(url.getProtocol());
            stringBuffer.append("://");
            stringBuffer.append(url.getHost());
            if (url.getPort() != -1) {
                stringBuffer.append(":");
                stringBuffer.append(url.getPort());
            }
            stringBuffer.append(url.getPath());
            str2 = stringBuffer.toString();
        } catch (MalformedURLException unused) {
        }
        if (str2 == null) {
            return;
        }
        if (isSent()) {
            AgentLog agentLog = AGENT_LOG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setUrl is called on TransactionState in ");
            LIZ.append(this.mState);
            LIZ.append(" state");
            agentLog.warning(X1D.LIZIZ(LIZ));
            return;
        }
        this.mUrl = str2;
    }

    public void setWanType(String str) {
        if (!isSent()) {
            this.mWanType = str;
            return;
        }
        AgentLog agentLog = AGENT_LOG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setWanType(...) called on TransactionState in ");
        LIZ.append(this.mState.toString());
        LIZ.append(" state");
        agentLog.warning(X1D.LIZIZ(LIZ));
    }

    public void addAssistData(String str, String str2) {
        if (isComplete()) {
            AgentLog agentLog = AGENT_LOG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addAssistData(...) called on TransactionState in ");
            LIZ.append(this.mState.toString());
            LIZ.append(" state");
            agentLog.warning(X1D.LIZIZ(LIZ));
        }
        try {
            this.mExtraData.put(str, str2);
        } catch (JSONException e) {
            AGENT_LOG.error("Caught error while addAssistData: ", e);
        }
    }
}
