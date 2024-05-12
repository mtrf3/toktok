package com.ss.mediakit.downloader;

import X.C16880lQ;
import X.C64598PWw;
import X.InterfaceC48133Iun;
import X.PVM;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes9.dex */
public class AVMDLResponse {
    public InterfaceC48133Iun call;
    public boolean isReadErr;
    public long readOff;
    public AVMDLRequest request;
    public C64598PWw response;
    public long contentlength = -1;
    public int statusCode = -1;

    public void reset() {
        this.response = null;
        this.call = null;
        this.contentlength = -1L;
        this.statusCode = -1;
        this.isReadErr = false;
    }

    private void parseResponse() {
        int lastIndexOf;
        C64598PWw c64598PWw = this.response;
        if (c64598PWw == null) {
            return;
        }
        int i = c64598PWw.LJLJI;
        this.statusCode = i;
        if (i == 200) {
            this.contentlength = toInt(c64598PWw.LIZ("Content-Length", null));
            return;
        }
        if (i == 206) {
            String LIZ = c64598PWw.LIZ("Content-Range", null);
            if (!TextUtils.isEmpty(LIZ) && (lastIndexOf = LIZ.lastIndexOf("/")) >= 0 && lastIndexOf < LIZ.length() - 1) {
                this.contentlength = toInt(LIZ.substring(lastIndexOf + 1), -1);
            }
        }
    }

    public void cancel() {
        InterfaceC48133Iun interfaceC48133Iun = this.call;
        if (interfaceC48133Iun != null) {
            interfaceC48133Iun.cancel();
        }
    }

    public boolean isFinish() {
        long j;
        AVMDLRequest aVMDLRequest = this.request;
        long j2 = aVMDLRequest.size;
        if (j2 >= 0) {
            j = aVMDLRequest.reqOff + j2;
        } else {
            j = this.contentlength;
        }
        long j3 = this.contentlength;
        if (j > j3) {
            j = j3;
        }
        AVMDLLog.d("AVMDLResponse", C16880lQ.LLLZI(Locale.US, "check readoff:%d reqoff:%d reqsize:%d contentlen:%d endoff:%d", new Object[]{Long.valueOf(this.readOff), Long.valueOf(this.request.reqOff), Long.valueOf(this.request.size), Long.valueOf(this.contentlength), Long.valueOf(j)}));
        if (this.readOff < j) {
            return false;
        }
        return true;
    }

    public boolean isOpenSuccessful() {
        int i = this.statusCode;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    public boolean isReadSuccessful() {
        return !this.isReadErr;
    }

    public static int toInt(String str) {
        return toInt(str, 0);
    }

    public int readData(byte[] bArr) {
        PVM pvm = this.response.LJLJL;
        if (pvm == null) {
            return 0;
        }
        try {
            int read = pvm.byteStream().read(bArr);
            if (read > 0) {
                Locale locale = Locale.US;
                AVMDLLog.d("AVMDLResponse", C16880lQ.LLLZI(locale, "before read off:%d reqoff:%d req size:%d", new Object[]{Long.valueOf(this.readOff), Long.valueOf(this.request.reqOff), Long.valueOf(this.request.size)}));
                long j = read;
                this.readOff += j;
                AVMDLRequest aVMDLRequest = this.request;
                aVMDLRequest.reqOff += j;
                long j2 = aVMDLRequest.size;
                if (j2 > 0) {
                    aVMDLRequest.size = j2 - j;
                }
                AVMDLLog.d("AVMDLResponse", C16880lQ.LLLZI(locale, "after read,ret:%d off:%d reqoff:%d req size:%d", new Object[]{Integer.valueOf(read), Long.valueOf(this.readOff), Long.valueOf(this.request.reqOff), Long.valueOf(this.request.size)}));
                return read;
            }
            return -1;
        } catch (IOException e) {
            this.isReadErr = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("read data exception:");
            LIZ.append(e.getLocalizedMessage());
            AVMDLLog.e("AVMDLResponse", X1D.LIZIZ(LIZ));
            return -1;
        }
    }

    public static int toInt(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public AVMDLResponse(AVMDLRequest aVMDLRequest, C64598PWw c64598PWw, InterfaceC48133Iun interfaceC48133Iun) {
        this.request = aVMDLRequest;
        this.response = c64598PWw;
        this.call = interfaceC48133Iun;
        this.readOff = aVMDLRequest.reqOff;
        parseResponse();
    }
}
