package com.ss.android.ugc.aweme.share.downloadv2.event.provider.download;

import X.C222578oP;
import X.C225278sl;
import X.C227768wm;
import X.C3A5;
import X.C54838Lfe;
import X.C55247LmF;
import X.C62840OlQ;
import X.C62841OlR;
import X.C84763XOl;
import X.InterfaceC54035LIp;
import X.InterfaceC55251LmJ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.BaseDownloadParamsGroupProvider;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DownloadAbilityParamsGroupProvider implements BaseDownloadParamsGroupProvider<C225278sl> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        C62841OlR c62841OlR;
        InterfaceC55251LmJ LIZLLL;
        C62840OlQ c62840OlQ;
        String str;
        GScope gScope = GScope.LJLIL;
        InterfaceC55251LmJ LIZLLL2 = C55247LmF.LIZLLL(gScope, C62841OlR.class, "Download");
        if (LIZLLL2 == null || (c62841OlR = (C62841OlR) LIZLLL2.getSource()) == null || (LIZLLL = C55247LmF.LIZLLL(gScope, C62840OlQ.class, "Download")) == null || (c62840OlQ = (C62840OlQ) LIZLLL.getSource()) == null) {
            return null;
        }
        int i = c62841OlR.LJLIL;
        String str2 = c62841OlR.LJLILLLLZI;
        long j = c62841OlR.LJLJI;
        long j2 = c62841OlR.LJLJJI;
        String authorUid = c62840OlQ.LJLILLLLZI.getAuthorUid();
        o.LJIIIIZZ(authorUid, "globalConfig.aweme.authorUid");
        if (C54838Lfe.LJIIZILJ(c62840OlQ.LJLILLLLZI)) {
            str = "story";
        } else {
            str = "post";
        }
        String LJII = C222578oP.LJII(C84763XOl.LJIIIIZZ(), c62840OlQ.LJLJI, null);
        int i2 = c62840OlQ.LJLJJLL;
        long j3 = c62841OlR.LJLJJL;
        String LJIJ = C227768wm.LJIJ(c62840OlQ.LJLILLLLZI.getAuthor());
        long j4 = c62841OlR.LJLJJI - c62841OlR.LJLJI;
        int i3 = c62841OlR.LJLJJLL;
        String LIZIZ = C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(c62840OlQ.LJLILLLLZI));
        o.LJIIIIZZ(LIZIZ, "getInstance().getAwemeLo…stId(globalConfig.aweme))");
        return new InterfaceC54035LIp(i, str2, j, j2, authorUid, str, LJII, i2, j3, LJIJ, j4, i3, LIZIZ, c62841OlR.LJLJLJ, c62841OlR.LJLJLLL, c62841OlR.LJLJL) { // from class: X.8sl
            public final int LJLIL;
            public final String LJLILLLLZI;
            public final long LJLJI;
            public final long LJLJJI;
            public final String LJLJJL;
            public final String LJLJJLL;
            public final String LJLJL;
            public final int LJLJLJ;
            public final long LJLJLLL;
            public final String LJLL;
            public final long LJLLI;
            public final int LJLLILLLL;
            public final String LJLLJ;
            public final String LJLLL;
            public final String LJLLLL;
            public final int LJLLLLLL;

            @Override // X.InterfaceC54035LIp
            public final boolean LLD() {
                return true;
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLLILZ() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is_server_watermark", Integer.valueOf(this.LJLIL));
                linkedHashMap.put("download_url", this.LJLILLLLZI);
                linkedHashMap.put("start_download", Long.valueOf(this.LJLJI));
                linkedHashMap.put("end_download", Long.valueOf(this.LJLJJI));
                linkedHashMap.put("author_id", this.LJLJJL);
                linkedHashMap.put("story_type", this.LJLJJLL);
                linkedHashMap.put("enter_position", this.LJLJL);
                linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LJLJLJ));
                linkedHashMap.put("package_size", Long.valueOf(this.LJLJLLL));
                linkedHashMap.put("follow_status", this.LJLL);
                linkedHashMap.put("duration", Long.valueOf(this.LJLLI));
                linkedHashMap.put("download_result", Integer.valueOf(this.LJLLILLLL));
                linkedHashMap.put("log_pb", this.LJLLJ);
                linkedHashMap.put("error_code", this.LJLLL);
                linkedHashMap.put("error_message", this.LJLLLL);
                linkedHashMap.put("retry_failed", Integer.valueOf(this.LJLLLLLL));
                return linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C225278sl)) {
                    return false;
                }
                C225278sl c225278sl = (C225278sl) obj;
                return this.LJLIL == c225278sl.LJLIL && o.LJ(this.LJLILLLLZI, c225278sl.LJLILLLLZI) && this.LJLJI == c225278sl.LJLJI && this.LJLJJI == c225278sl.LJLJJI && o.LJ(this.LJLJJL, c225278sl.LJLJJL) && o.LJ(this.LJLJJLL, c225278sl.LJLJJLL) && o.LJ(this.LJLJL, c225278sl.LJLJL) && this.LJLJLJ == c225278sl.LJLJLJ && this.LJLJLLL == c225278sl.LJLJLLL && o.LJ(this.LJLL, c225278sl.LJLL) && this.LJLLI == c225278sl.LJLLI && this.LJLLILLLL == c225278sl.LJLLILLLL && o.LJ(this.LJLLJ, c225278sl.LJLLJ) && o.LJ(this.LJLLL, c225278sl.LJLLL) && o.LJ(this.LJLLLL, c225278sl.LJLLLL) && this.LJLLLLLL == c225278sl.LJLLLLLL;
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLJZ() {
                HashMap hashMap = new HashMap();
                hashMap.putAll(LLLILZ());
                if (this.LJLLILLLL != 0) {
                    hashMap.remove("retry_failed");
                    hashMap.remove("error_code");
                    hashMap.remove("error_message");
                }
                return hashMap;
            }

            public final int hashCode() {
                int hashCode;
                int LJ = C79062V1e.LJ(this.LJLLJ, (JBR.LIZJ(this.LJLLI, C79062V1e.LJ(this.LJLL, JBR.LIZJ(this.LJLJLLL, (C79062V1e.LJ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, C79062V1e.LJ(this.LJLJJL, JBR.LIZJ(this.LJLJJI, JBR.LIZJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL * 31, 31), 31), 31), 31), 31), 31) + this.LJLJLJ) * 31, 31), 31), 31) + this.LJLLILLLL) * 31, 31);
                String str3 = this.LJLLL;
                int i4 = 0;
                if (str3 == null) {
                    hashCode = 0;
                } else {
                    hashCode = str3.hashCode();
                }
                int i5 = (LJ + hashCode) * 31;
                String str4 = this.LJLLLL;
                if (str4 != null) {
                    i4 = str4.hashCode();
                }
                return ((i5 + i4) * 31) + this.LJLLLLLL;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DownloadAbilityParamsGroup(isServerWatermark=");
                sb.append(this.LJLIL);
                sb.append(", downloadUrl=");
                sb.append(this.LJLILLLLZI);
                sb.append(", startDownload=");
                sb.append(this.LJLJI);
                sb.append(", endDownload=");
                sb.append(this.LJLJJI);
                sb.append(", authorID=");
                sb.append(this.LJLJJL);
                sb.append(", storyType=");
                sb.append(this.LJLJJLL);
                sb.append(", enterPosition=");
                sb.append(this.LJLJL);
                sb.append(", isLandscapeScreen=");
                sb.append(this.LJLJLJ);
                sb.append(", packageSize=");
                sb.append(this.LJLJLLL);
                sb.append(", followStatus=");
                sb.append(this.LJLL);
                sb.append(", duration=");
                sb.append(this.LJLLI);
                sb.append(", downloadResult=");
                sb.append(this.LJLLILLLL);
                sb.append(", logPb=");
                sb.append(this.LJLLJ);
                sb.append(", errorCode=");
                sb.append(this.LJLLL);
                sb.append(", errorMsg=");
                sb.append(this.LJLLLL);
                sb.append(", retryFailed=");
                return UPJ.LIZLLL(sb, this.LJLLLLLL, ')');
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLLLIL() {
                return C113554cx.LJJJLIIL();
            }

            {
                o.LJIIIZ(str2, "downloadUrl");
                this.LJLIL = i;
                this.LJLILLLLZI = str2;
                this.LJLJI = j;
                this.LJLJJI = j2;
                this.LJLJJL = authorUid;
                this.LJLJJLL = str;
                this.LJLJL = LJII;
                this.LJLJLJ = i2;
                this.LJLJLLL = j3;
                this.LJLL = LJIJ;
                this.LJLLI = j4;
                this.LJLLILLLL = i3;
                this.LJLLJ = LIZIZ;
                this.LJLLL = r19;
                this.LJLLLL = r20;
                this.LJLLLLLL = r21;
            }
        };
    }
}
