package com.ss.android.ugc.aweme.share.downloadv2.event.provider.other;

import X.C55247LmF;
import X.C60142Xq;
import X.C62840OlQ;
import X.InterfaceC54035LIp;
import X.InterfaceC55251LmJ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.BaseDownloadParamsGroupProvider;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PushParamsGroupProvider implements BaseDownloadParamsGroupProvider<C60142Xq> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        C62840OlQ c62840OlQ;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, C62840OlQ.class, "Download");
        if (LIZLLL != null && (c62840OlQ = (C62840OlQ) LIZLLL.getSource()) != null) {
            return new InterfaceC54035LIp(c62840OlQ.LJLILLLLZI.getAid()) { // from class: X.2Xq
                public final String LJLIL;

                @Override // X.InterfaceC54035LIp
                public final boolean LLD() {
                    return false;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C60142Xq) && o.LJ(this.LJLIL, ((C60142Xq) obj).LJLIL);
                }

                public final int hashCode() {
                    String str = this.LJLIL;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @Override // X.InterfaceC54035LIp
                public final java.util.Map<String, Object> LLLLIL() {
                    C188727au c188727au = new C188727au();
                    AnonymousClass636.LIZIZ(c188727au, this.LJLIL);
                    java.util.Map<String, String> map = c188727au.LIZ;
                    o.LJIIIIZZ(map, "EventMapBuilder().checkT…aidTobeChecked).builder()");
                    return map;
                }

                @Override // X.InterfaceC54035LIp
                public final java.util.Map<String, Object> LLJZ() {
                    return LLLILZ();
                }

                @Override // X.InterfaceC54035LIp
                public final java.util.Map<String, Object> LLLILZ() {
                    return C113554cx.LJJJLIIL();
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PushParamsGroup(aidTobeChecked=");
                    return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
                }

                {
                    this.LJLIL = r1;
                }
            };
        }
        return null;
    }
}
