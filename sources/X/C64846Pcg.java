package X;

import com.bytedance.crash.Npth;
import com.ss.android.agilelogger.ALog;

/* renamed from: X.Pcg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64846Pcg implements InterfaceC66023Pvf {
    @Override // X.InterfaceC66023Pvf
    public final void LIZ(long j) {
        Npth.setAlogFlushV2Addr(ALog.getAlogNativeFlushV2FuncAddr());
        Npth.setAlogLogDirAddr(ALog.getAlogNativeLogStoreDirFuncAddr());
        C64841Pcb.LIZ().LIZIZ(j);
    }
}
