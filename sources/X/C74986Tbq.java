package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.Tbq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74986Tbq implements InterfaceC75414Tik<CreateChannelResult> {
    public final /* synthetic */ InterfaceC75414Tik<CreateChannelResult> LJLIL;
    public final /* synthetic */ EnumC74990Tbu LJLILLLLZI;
    public final /* synthetic */ C74983Tbn LJLJI;
    public final /* synthetic */ C76611U4x LJLJJI;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0269, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L85;
     */
    @Override // X.InterfaceC75414Tik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult r15) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74986Tbq.onSuccess(java.lang.Object):void");
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("anchor createChannel failed, ");
        LIZ.append(X4Q.LJIILLIIL(th));
        String log = X1D.LIZIZ(LIZ);
        o.LJIIIZ(log, "log");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("OneVn_");
        LIZ2.append("OneVn_MultiGuestV3Manager");
        C0NB.LJ(X1D.LIZIZ(LIZ2), log);
        this.LJLIL.LJ(error, th);
    }

    public C74986Tbq(InterfaceC75414Tik<CreateChannelResult> interfaceC75414Tik, EnumC74990Tbu enumC74990Tbu, C74983Tbn c74983Tbn, C76611U4x c76611U4x) {
        this.LJLIL = interfaceC75414Tik;
        this.LJLILLLLZI = enumC74990Tbu;
        this.LJLJI = c74983Tbn;
        this.LJLJJI = c76611U4x;
    }
}
