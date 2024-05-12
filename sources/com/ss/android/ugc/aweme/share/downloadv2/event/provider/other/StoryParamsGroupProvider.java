package com.ss.android.ugc.aweme.share.downloadv2.event.provider.other;

import X.C55247LmF;
import X.C60202Xw;
import X.C62840OlQ;
import X.InterfaceC54035LIp;
import X.InterfaceC55251LmJ;
import android.content.Context;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.BaseDownloadParamsGroupProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class StoryParamsGroupProvider implements BaseDownloadParamsGroupProvider<C60202Xw> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        C62840OlQ c62840OlQ;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, C62840OlQ.class, "Download");
        if (LIZLLL != null && (c62840OlQ = (C62840OlQ) LIZLLL.getSource()) != null) {
            return new InterfaceC54035LIp(c62840OlQ.LJLILLLLZI) { // from class: X.2Xw
                public final Aweme LJLIL;
                public final String LJLILLLLZI = null;
                public final String LJLJI = null;
                public final Context LJLJJI = null;

                @Override // X.InterfaceC54035LIp
                public final boolean LLD() {
                    return false;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C60202Xw)) {
                        return false;
                    }
                    C60202Xw c60202Xw = (C60202Xw) obj;
                    return o.LJ(this.LJLIL, c60202Xw.LJLIL) && o.LJ(this.LJLILLLLZI, c60202Xw.LJLILLLLZI) && o.LJ(this.LJLJI, c60202Xw.LJLJI) && o.LJ(this.LJLJJI, c60202Xw.LJLJJI);
                }

                public final int hashCode() {
                    Aweme aweme = this.LJLIL;
                    int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
                    String str = this.LJLILLLLZI;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.LJLJI;
                    int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Context context = this.LJLJJI;
                    return hashCode3 + (context != null ? context.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("StoryParamsGroup(aweme=");
                    LIZ.append(this.LJLIL);
                    LIZ.append(", eventType=");
                    LIZ.append(this.LJLILLLLZI);
                    LIZ.append(", from=");
                    LIZ.append(this.LJLJI);
                    LIZ.append(", ctx=");
                    LIZ.append(this.LJLJJI);
                    LIZ.append(')');
                    return X1D.LIZIZ(LIZ);
                }

                @Override // X.InterfaceC54035LIp
                public final java.util.Map<String, Object> LLLLIL() {
                    C188727au c188727au = new C188727au();
                    C222578oP.LIZIZ(c188727au, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
                    java.util.Map<String, String> map = c188727au.LIZ;
                    o.LJIIIIZZ(map, "EventMapBuilder().append…ype, from, ctx).builder()");
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

                {
                    this.LJLIL = r2;
                }
            };
        }
        return null;
    }
}
