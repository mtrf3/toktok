package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.BEm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28448BEm implements Serializable {
    public long LJLIL;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJLJ;
    public String LJLILLLLZI = "";
    public boolean LJLJI = true;
    public String LJLJJI = "";
    public String LJLJL = "";
    public String LJLJLLL = "";

    public final String getMsgContent() {
        return this.LJLILLLLZI;
    }

    public final long getMsgId() {
        return this.LJLIL;
    }

    public final long getPinId() {
        return this.LJLJJL;
    }

    public final long getPinMsgId() {
        return this.LJLJJLL;
    }

    public final long getReleaseId() {
        return this.LJLJLJ;
    }

    public final String getReportContent() {
        return this.LJLJL;
    }

    public final String getReportType() {
        return this.LJLJJI;
    }

    public final String getSource() {
        return this.LJLJLLL;
    }

    public final boolean isVertical() {
        return this.LJLJI;
    }

    public final void setMsgContent(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    public final void setMsgId(long j) {
        this.LJLIL = j;
    }

    public final void setPinId(long j) {
        this.LJLJJL = j;
    }

    public final void setPinMsgId(long j) {
        this.LJLJJLL = j;
    }

    public final void setReleaseId(long j) {
        this.LJLJLJ = j;
    }

    public final void setReportContent(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJL = str;
    }

    public final void setReportType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJI = str;
    }

    public final void setSource(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJLLL = str;
    }

    public final void setVertical(boolean z) {
        this.LJLJI = z;
    }
}
