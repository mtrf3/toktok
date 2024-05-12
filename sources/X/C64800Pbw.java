package X;

import java.io.IOException;

/* renamed from: X.Pbw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64800Pbw extends IOException {
    public static final long serialVersionUID = -1606114814728652693L;
    public Object infoObj;
    public boolean needReport;
    public boolean reportMonitorError;
    public boolean reportMonitorOk;
    public String traceCode;
    public String url;

    public C64800Pbw() {
        this.url = "empty url";
        this.traceCode = "empty traceCode";
    }

    public String getTraceCode() {
        return this.traceCode;
    }

    public C64800Pbw(String str) {
        super(str);
        this.url = "empty url";
        this.traceCode = "empty traceCode";
    }

    public C64800Pbw(String str, Throwable th) {
        super(str, th);
        this.url = "empty url";
        this.traceCode = "empty traceCode";
    }

    public void setInfo(boolean z, boolean z2, boolean z3, String str, String str2, Object obj) {
        this.needReport = z;
        this.reportMonitorOk = z2;
        this.reportMonitorError = z3;
        this.url = str;
        this.traceCode = str2;
        this.infoObj = obj;
    }
}
