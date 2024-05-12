package com.ss.android.ugc.aweme.share.downloadv2.event.provider.download;

import X.C2Y4;
import X.C44938HkM;
import X.C55247LmF;
import X.C62842OlS;
import X.InterfaceC54035LIp;
import X.InterfaceC55251LmJ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.BaseDownloadParamsGroupProvider;
import defpackage.b0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DownloadChainParamsGorupProvider implements BaseDownloadParamsGroupProvider<C2Y4> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        C62842OlS c62842OlS;
        final String str;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, C62842OlS.class, "Download");
        if (LIZLLL == null || (c62842OlS = (C62842OlS) LIZLLL.getSource()) == null) {
            return null;
        }
        if (C44938HkM.LIZIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        final String valueOf = String.valueOf(c62842OlS.LJLJJLL);
        final String valueOf2 = String.valueOf(c62842OlS.LJLJL);
        final Integer num = c62842OlS.LJLJLJ;
        final String str2 = c62842OlS.LJLJLLL;
        final int i = c62842OlS.LJLL;
        return new InterfaceC54035LIp(i, str, valueOf, valueOf2, num, str2) { // from class: X.2Y4
            public final String LJLIL;
            public final String LJLILLLLZI;
            public final String LJLJI;
            public final Integer LJLJJI;
            public final String LJLJJL;
            public final int LJLJJLL;

            @Override // X.InterfaceC54035LIp
            public final boolean LLD() {
                return true;
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLLILZ() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is_downloading", this.LJLIL);
                linkedHashMap.put("duration", this.LJLILLLLZI);
                linkedHashMap.put("download_result", this.LJLJI);
                linkedHashMap.put("error_code", this.LJLJJI);
                linkedHashMap.put("error_desc", this.LJLJJL);
                linkedHashMap.put("status", Integer.valueOf(this.LJLJJLL));
                return linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2Y4)) {
                    return false;
                }
                C2Y4 c2y4 = (C2Y4) obj;
                return o.LJ(this.LJLIL, c2y4.LJLIL) && o.LJ(this.LJLILLLLZI, c2y4.LJLILLLLZI) && o.LJ(this.LJLJI, c2y4.LJLJI) && o.LJ(this.LJLJJI, c2y4.LJLJJI) && o.LJ(this.LJLJJL, c2y4.LJLJJL) && this.LJLJJLL == c2y4.LJLJJLL;
            }

            public final int hashCode() {
                int hashCode;
                int LJ = C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31);
                Integer num2 = this.LJLJJI;
                int i2 = 0;
                if (num2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = num2.hashCode();
                }
                int i3 = (LJ + hashCode) * 31;
                String str3 = this.LJLJJL;
                if (str3 != null) {
                    i2 = str3.hashCode();
                }
                return ((i3 + i2) * 31) + this.LJLJJLL;
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLJZ() {
                return LLLILZ();
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLLLIL() {
                return C113554cx.LJJJLIIL();
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DownloadChainParamsGroup(isDownloading=");
                LIZ.append(this.LJLIL);
                LIZ.append(", duration=");
                LIZ.append(this.LJLILLLLZI);
                LIZ.append(", result=");
                LIZ.append(this.LJLJI);
                LIZ.append(", errorCode=");
                LIZ.append(this.LJLJJI);
                LIZ.append(", errorDesc=");
                LIZ.append(this.LJLJJL);
                LIZ.append(", status=");
                return b0.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
            }

            {
                o.LJIIIZ(valueOf, "duration");
                o.LJIIIZ(valueOf2, "result");
                this.LJLIL = str;
                this.LJLILLLLZI = valueOf;
                this.LJLJI = valueOf2;
                this.LJLJJI = num;
                this.LJLJJL = str2;
                this.LJLJJLL = i;
            }
        };
    }
}
