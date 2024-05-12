package X;

import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.2zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76792zr implements InterfaceC86533Xxh {
    @Override // X.InterfaceC86533Xxh
    public final void LIZJ(InnerPushMessage innerPushMessage) {
    }

    @Override // X.InterfaceC86533Xxh
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC86533Xxh
    public final void LJIIJ(EnumC86518XxS trigger, boolean z) {
        o.LJIIIZ(trigger, "trigger");
    }

    public C76792zr() {
        C86550Xxy.LIZIZ.LJIIIIZZ(this, null);
    }

    public static long LIZ() {
        C105004Ae.LIZJ();
        return NetworkService.LJI().LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if ((r10 - r9.getLong(X.X1D.LIZIZ(r3), 0)) < 172800000) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if ((r10 - r9.getLong(X.X1D.LIZIZ(r3), 0)) < 2592000000L) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76792zr.LIZIZ(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC86533Xxh
    public final void LJI(InnerPushMessage innerPushMessage) {
        if (C76822zu.LIZ()) {
            C76582zW.LJII(0L);
        } else {
            C76582zW.LJFF(0L);
            C76582zW.LJI(0L);
        }
    }

    @Override // X.InterfaceC86533Xxh
    public final void LJII(InnerPushMessage innerPushMessage, boolean z, String str) {
        if (C76822zu.LIZ()) {
            C76582zW.LJII(LIZ());
            return;
        }
        if (C76582zW.LIZLLL() != 0) {
            C76582zW.LJI(LIZ());
        }
        C76582zW.LJFF(LIZ());
    }
}
