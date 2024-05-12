package com.bytedance.apm.agent.instrumentation.okhttp3;

import X.C39745Fin;
import X.C64533PUj;
import X.C64597PWv;
import X.C64598PWw;
import X.InterfaceC48121Iub;
import X.PU7;
import X.PUC;
import X.PUD;
import X.PVM;
import X.PW3;
import X.PXZ;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.transaction.TxState;
import java.io.IOException;
import okhttp3.Request;

/* loaded from: classes.dex */
public class InterceptorImpl implements InterfaceC48121Iub {

    /* loaded from: classes.dex */
    public class ResponseBodyWrapper extends PVM {
        public PW3 bufferedSource;
        public final C64598PWw response;
        public final PVM responseBody;
        public long totalBytesRead;
        public final TxState transactionState;

        @Override // X.PVM, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.responseBody.close();
            end();
        }

        @Override // X.PVM
        public long contentLength() {
            return this.responseBody.contentLength();
        }

        @Override // X.PVM
        public C39745Fin contentType() {
            return this.responseBody.contentType();
        }

        public void end() {
            if (this.transactionState.isComplete()) {
                return;
            }
            this.transactionState.setBytesReceived(this.totalBytesRead);
            MonitorRecorder.reportMonitorData(this.transactionState, this.response);
        }

        @Override // X.PVM
        public PW3 source() {
            if (this.bufferedSource == null) {
                this.bufferedSource = PU7.LIZ(source(this.responseBody.source()));
            }
            return this.bufferedSource;
        }

        private PUC source(PUC puc) {
            return new PUD(puc) { // from class: com.bytedance.apm.agent.instrumentation.okhttp3.InterceptorImpl.ResponseBodyWrapper.1
                @Override // X.PUD, X.PUC, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    ResponseBodyWrapper.this.end();
                }

                @Override // X.PUD, X.PUC
                public long read(C64533PUj c64533PUj, long j) {
                    long read = super.read(c64533PUj, j);
                    if (read >= 0) {
                        ResponseBodyWrapper.this.totalBytesRead += read;
                    }
                    return read;
                }
            };
        }

        public ResponseBodyWrapper(C64598PWw c64598PWw, TxState txState) {
            this.response = c64598PWw;
            this.responseBody = c64598PWw.LJLJL;
            this.transactionState = txState;
        }
    }

    @Override // X.InterfaceC48121Iub
    public C64598PWw intercept(PXZ pxz) {
        Request request = pxz.request();
        String header = request.header("User-Agent");
        if (header != null && header.contains("tt")) {
            return pxz.LIZ(request);
        }
        TxState txState = new TxState();
        MonitorRecorder.recordRequest(request, txState);
        try {
            C64598PWw LIZ = pxz.LIZ(request);
            MonitorRecorder.recordResponse(LIZ, txState);
            if (txState.getReceivedBytes() < 0 && !TextUtils.isEmpty(LIZ.LIZ("Transfer-Encoding", null))) {
                txState.addAssistData("Transfer-Encoding", LIZ.LIZ("Transfer-Encoding", null));
                C64597PWv c64597PWv = new C64597PWv(LIZ);
                c64597PWv.LJI = new ResponseBodyWrapper(LIZ, txState);
                return c64597PWv.LIZ();
            }
            MonitorRecorder.reportMonitorData(txState, LIZ);
            return LIZ;
        } catch (IOException e) {
            MonitorRecorder.reportExceptionMonitor(txState, e);
            throw e;
        }
    }
}
