package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.q;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.o;

/* renamed from: X.8Al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206998Al {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public Throwable LJII;
    public String LJIIIIZZ = "enter_tab";

    public final void LIZ() {
        long j;
        long j2;
        final String str;
        if ((this.LIZIZ != 0 && o.LJ(this.LJIIIIZZ, "refresh")) || (this.LIZ != 0 && o.LJ(this.LJIIIIZZ, "enter_tab"))) {
            if (this.LIZLLL == 0) {
                this.LIZLLL = SystemClock.elapsedRealtime();
            }
            if (this.LJI) {
                return;
            }
            if (o.LJ(this.LJIIIIZZ, "enter_tab")) {
                j = this.LIZLLL;
                j2 = this.LIZ;
            } else {
                j = this.LIZLLL;
                j2 = this.LIZJ;
            }
            final long j3 = j - j2;
            final long j4 = this.LIZLLL - this.LIZIZ;
            final String str2 = this.LJIIIIZZ;
            final boolean z = this.LJ;
            final boolean z2 = this.LJFF;
            Throwable th = this.LJII;
            if (th == null) {
                str = "";
            } else if (th instanceof C38306F1q) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("error_code_");
                LIZ.append(((C38306F1q) th).getErrorCode());
                str = X1D.LIZIZ(LIZ);
            } else if (th instanceof C38333F2r) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("server_error_code_");
                LIZ2.append(((C38306F1q) th).getErrorCode());
                str = X1D.LIZIZ(LIZ2);
            } else if (th instanceof C38305F1p) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("local_error_code_");
                LIZ3.append(((C38306F1q) th).getErrorCode());
                str = X1D.LIZIZ(LIZ3);
            } else if (th instanceof C64698PaI) {
                str = "no_network";
            } else if (th instanceof C64802Pby) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("http_error_");
                LIZ4.append(((C64802Pby) th).getStatusCode());
                str = X1D.LIZIZ(LIZ4);
            } else if (th instanceof C38299F1j) {
                str = "cdn_cache_error";
            } else if (th instanceof C64801Pbx) {
                str = "client_protocol_error";
            } else if (th instanceof C64800Pbw) {
                str = "ttnet_error_storage";
            } else if (th instanceof TimeoutException) {
                str = "timeout_error";
            } else {
                str = "unknown error";
            }
            C207008Am.LIZ(new InterfaceC207018An(str2, z, j3, j4, z2, str) { // from class: X.8Ao
                public final String LJLIL;
                public final String LJLILLLLZI;
                public final boolean LJLJI;
                public final long LJLJJI;
                public final long LJLJJL;
                public final boolean LJLJJLL;
                public final String LJLJL;
                public final String LJLJLJ;

                @Override // X.InterfaceC207018An
                public final java.util.Map<String, String> LLIL() {
                    Object obj;
                    OSZ[] oszArr = new OSZ[7];
                    oszArr[0] = new OSZ("enter_from", this.LJLIL);
                    String str3 = this.LJLILLLLZI;
                    if (str3 == null) {
                        str3 = "";
                    }
                    oszArr[1] = new OSZ("enter_method", str3);
                    String str4 = "1";
                    if (this.LJLJI) {
                        obj = "1";
                    } else {
                        obj = CardStruct.IStatusCode.DEFAULT;
                    }
                    oszArr[2] = new OSZ("is_cache", obj);
                    oszArr[3] = new OSZ("ui_duration", String.valueOf(this.LJLJJI));
                    oszArr[4] = new OSZ("first_frame_duration", String.valueOf(this.LJLJJL));
                    if (!this.LJLJJLL) {
                        str4 = CardStruct.IStatusCode.DEFAULT;
                    }
                    oszArr[5] = new OSZ("is_load_success", str4);
                    oszArr[6] = new OSZ("failed_reason", this.LJLJL);
                    return C113554cx.LJJL(oszArr);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C207028Ao)) {
                        return false;
                    }
                    C207028Ao c207028Ao = (C207028Ao) obj;
                    return o.LJ(this.LJLIL, c207028Ao.LJLIL) && o.LJ(this.LJLILLLLZI, c207028Ao.LJLILLLLZI) && this.LJLJI == c207028Ao.LJLJI && this.LJLJJI == c207028Ao.LJLJJI && this.LJLJJL == c207028Ao.LJLJJL && this.LJLJJLL == c207028Ao.LJLJJLL && o.LJ(this.LJLJL, c207028Ao.LJLJL);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final int hashCode() {
                    int hashCode;
                    int hashCode2 = this.LJLIL.hashCode() * 31;
                    String str3 = this.LJLILLLLZI;
                    if (str3 == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str3.hashCode();
                    }
                    int i = (hashCode2 + hashCode) * 31;
                    boolean z3 = this.LJLJI;
                    int i2 = 1;
                    int i3 = z3;
                    if (z3 != 0) {
                        i3 = 1;
                    }
                    int LIZJ = JBR.LIZJ(this.LJLJJL, JBR.LIZJ(this.LJLJJI, (i + i3) * 31, 31), 31);
                    if (!this.LJLJJLL) {
                        i2 = 0;
                    }
                    return this.LJLJL.hashCode() + ((LIZJ + i2) * 31);
                }

                public final String toString() {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("ExploreFirstFrameET(enterFrom=");
                    LIZ5.append(this.LJLIL);
                    LIZ5.append(", enterMethod=");
                    LIZ5.append(this.LJLILLLLZI);
                    LIZ5.append(", isCache=");
                    LIZ5.append(this.LJLJI);
                    LIZ5.append(", uiDuration=");
                    LIZ5.append(this.LJLJJI);
                    LIZ5.append(", firstFrameDuration=");
                    LIZ5.append(this.LJLJJL);
                    LIZ5.append(", isLoadSuccess=");
                    LIZ5.append(this.LJLJJLL);
                    LIZ5.append(", failedReason=");
                    return q.LIZIZ(LIZ5, this.LJLJL, ')', LIZ5);
                }

                @Override // X.InterfaceC207018An
                public final String getEventName() {
                    return this.LJLJLJ;
                }

                {
                    o.LJIIIZ(str, "failedReason");
                    this.LJLIL = "homepage_explore";
                    this.LJLILLLLZI = str2;
                    this.LJLJI = z;
                    this.LJLJJI = j3;
                    this.LJLJJL = j4;
                    this.LJLJJLL = z2;
                    this.LJLJL = str;
                    this.LJLJLJ = "homepage_explore_first_frame";
                }
            });
            this.LIZ = 0L;
            this.LIZJ = 0L;
            this.LIZIZ = 0L;
            this.LIZLLL = 0L;
            this.LJ = false;
            this.LJFF = false;
            this.LJI = false;
            this.LJII = null;
        }
    }
}
