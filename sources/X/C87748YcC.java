package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.model.CDNLog;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.YcC, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87748YcC {
    public static final List<String> LJJJJJ = C46982IcE.LIZIZ().redirectHosts();
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final Long LJI;
    public final Long LJII;
    public final Long LJIIIIZZ;
    public final Long LJIIIZ;
    public final Long LJIIJ;
    public final Integer LJIIJJI;
    public final Integer LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final Long LJIJ;
    public final Long LJIJI;
    public final Long LJIJJ;
    public final Long LJIJJLI;
    public final Long LJIL;
    public final Long LJJ;
    public final Long LJJI;
    public final Long LJJIFFI;
    public final int LJJII;
    public final int LJJIII;
    public final String LJJIIJ;
    public final int LJJIIJZLJL;
    public final int LJJIIZ;
    public final String LJJIIZI;
    public final String LJJIJ;
    public final String LJJIJIIJI;
    public final String LJJIJIIJIL;
    public final String LJJIJIL;
    public final String LJJIJL;
    public final String LJJIJLIJ;
    public final String LJJIL;
    public final long LJJIZ;
    public final long LJJJ;
    public final java.util.Map<String, String> LJJJI;
    public final int LJJJIL;
    public final int LJJJJ;
    public final int LJJJJI;
    public final int LJJJJIZL;

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestInfo(type=");
        sb.append(this.LIZ);
        sb.append(", key=");
        sb.append((Object) this.LIZJ);
        sb.append(", ip=");
        sb.append((Object) this.LIZLLL);
        sb.append(", host=");
        sb.append((Object) this.LJ);
        sb.append(", is_https=");
        sb.append(this.LJFF);
        sb.append(", dl_size=");
        sb.append(this.LJI);
        sb.append(", dl_offset=");
        sb.append(this.LJII);
        sb.append(", fbb_time=");
        sb.append(this.LJIIIIZZ);
        sb.append(", rsp_time=");
        sb.append(this.LJIIIZ);
        sb.append(", file_len=");
        sb.append(this.LJIIJ);
        sb.append(", hit_code=");
        sb.append(this.LJIIJJI);
        sb.append(", hit_code_l2=");
        sb.append(this.LJIIL);
        sb.append(", cdn_hit_str=");
        sb.append((Object) this.LJIILIIL);
        sb.append(", cdn_hit=");
        sb.append((Object) this.LJIILJJIL);
        sb.append(", http_code=");
        sb.append(this.LJIILL);
        sb.append(", err_code=");
        sb.append(this.LJIILLIIL);
        sb.append(", err_stage=");
        sb.append(this.LJIIZILJ);
        sb.append(", req_st=");
        sb.append(this.LJIJ);
        sb.append(", dns_st=");
        sb.append(this.LJIJI);
        sb.append(", dns_et=");
        sb.append(this.LJIJJ);
        sb.append(", tcp_st=");
        sb.append(this.LJIJJLI);
        sb.append(", tcp_et=");
        sb.append(this.LJIL);
        sb.append(", tls_st=");
        sb.append(this.LJJ);
        sb.append(", tls_et=");
        sb.append(this.LJJI);
        sb.append(", fb_t=");
        sb.append(this.LJJIFFI);
        sb.append(", socket_reuse=");
        sb.append(this.LJJII);
        sb.append(", tls_resume=");
        sb.append(this.LJJIII);
        sb.append(", tls_ver=");
        sb.append((Object) this.LJJIIJ);
        sb.append(", url_idx=");
        sb.append(this.LJJIIJZLJL);
        sb.append(", task_type=");
        sb.append(this.LJJIIZ);
        sb.append(", server_timing=");
        sb.append((Object) this.LJJIIZI);
        sb.append(", dnsAddr=");
        sb.append((Object) this.LJJIJ);
        sb.append(", hostName=");
        sb.append((Object) this.LJJIJIIJI);
        sb.append(", originUrl=");
        sb.append((Object) this.LJJIJIIJIL);
        sb.append(", finalUrl=");
        sb.append((Object) this.LJJIJIL);
        sb.append(", localIp=");
        sb.append((Object) this.LJJIJL);
        sb.append(", remoteIp=");
        sb.append((Object) this.LJJIJLIJ);
        sb.append(", userAgent=");
        sb.append((Object) this.LJJIL);
        sb.append(", duration=");
        sb.append(this.LJJIZ);
        sb.append(", size=");
        sb.append(this.LJJJ);
        sb.append(", headers=");
        sb.append(this.LJJJI);
        sb.append(", statusCode=");
        sb.append(this.LJJJIL);
        sb.append(", urlIndex=");
        sb.append(this.LJJJJ);
        sb.append(", urlCount=");
        sb.append(this.LJJJJI);
        sb.append(", ttfb=0, isRedirect=");
        return UPJ.LIZLLL(sb, this.LJJJJIZL, ')');
    }

    public C87748YcC() {
        this.LIZ = 1;
        this.LJFF = -1;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1;
        this.LJIIL = -1;
        this.LJIILL = -1;
        this.LJIILLIIL = -1;
        this.LJIIZILJ = -100;
        this.LJIJ = -1L;
        this.LJIJI = -1L;
        this.LJIJJ = -1L;
        this.LJIJJLI = -1L;
        this.LJIL = -1L;
        this.LJJ = -1L;
        this.LJJI = -1L;
        this.LJJIFFI = -1L;
        this.LJJII = -1;
        this.LJJIII = -1;
        this.LJJIIJZLJL = -1;
        this.LJJIIZ = -1;
        this.LJJJJ = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C87748YcC(CDNLog cdnLog) {
        this();
        int i;
        String substring;
        o.LJIIIZ(cdnLog, "cdnLog");
        int i2 = cdnLog.LIZ;
        if (i2 == 1) {
            this.LIZ = 1;
            this.LIZJ = cdnLog.fileKey;
            this.LIZLLL = cdnLog.serverIp;
            this.LJ = cdnLog.host;
            this.LJFF = cdnLog.isHttps;
            this.LJI = Long.valueOf(cdnLog.dlSize);
            this.LJII = Long.valueOf(cdnLog.dlOffset);
            this.LJIIIIZZ = Long.valueOf(cdnLog.fbTimeT - cdnLog.reqStartT);
            this.LJIIIZ = Long.valueOf(cdnLog.reqEndT - cdnLog.reqStartT);
            this.LJIIJ = Long.valueOf(cdnLog.contentLength);
            String str = cdnLog.xCache;
            String str2 = cdnLog.xMCache;
            if (!TextUtils.isEmpty(str)) {
                i = C87746YcA.LIZ(str);
            } else if (!TextUtils.isEmpty(str2)) {
                i = C87746YcA.LIZ(str2);
            } else {
                i = 0;
            }
            this.LJIIJJI = Integer.valueOf(i);
            String str3 = cdnLog.xCacheRemote;
            this.LJIIL = Integer.valueOf(TextUtils.isEmpty(str3) ? C87746YcA.LIZ(str3) : 0);
            String str4 = cdnLog.xCache;
            String str5 = cdnLog.xMCache;
            if (!TextUtils.isEmpty(str4)) {
                o.LJI(str4);
                if (str4.length() >= 50) {
                    substring = str4.substring(50);
                    o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
                }
                substring = "";
            } else {
                if (!TextUtils.isEmpty(str5)) {
                    o.LJI(str5);
                    if (str5.length() >= 50) {
                        substring = str5.substring(50);
                        o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
                    }
                }
                substring = "";
            }
            this.LJIILIIL = substring;
            this.LJIILJJIL = cdnLog.cdnHit;
            this.LJJIIJ = cdnLog.tlsVer;
            this.LJIILL = cdnLog.statusCode;
            this.LJIILLIIL = cdnLog.errCode;
            this.LJIIZILJ = cdnLog.errStage;
            this.LJIJ = Long.valueOf(cdnLog.reqStartT);
            this.LJIJI = Long.valueOf(cdnLog.dnsStartT);
            this.LJIJJ = Long.valueOf(cdnLog.dnsEndT);
            this.LJIJJLI = Long.valueOf(cdnLog.tcpConStartT);
            this.LJIL = Long.valueOf(cdnLog.tcpConEndT);
            this.LJJ = Long.valueOf(cdnLog.tlsHanStartT);
            this.LJJI = Long.valueOf(cdnLog.tlsHanEndT);
            this.LJJIFFI = Long.valueOf(cdnLog.ttfb);
            this.LJJII = cdnLog.socketReuse;
            this.LJJIII = cdnLog.tlsResume;
            this.LJJIIJZLJL = cdnLog.urlIdx;
            this.LJJIIZ = cdnLog.taskType;
            this.LJJIIZI = cdnLog.serverTiming;
            this.LJJJJIZL = cdnLog.isRedirect;
            this.LIZIZ = cdnLog.url;
            return;
        }
        if (i2 != 2) {
            return;
        }
        this.LIZ = 2;
        this.LIZJ = cdnLog.fileKey;
        this.LJJIJIIJI = cdnLog.host;
        this.LJJIJ = cdnLog.LIZIZ;
        String str6 = cdnLog.LIZJ;
        this.LJJIJIIJIL = str6;
        String str7 = cdnLog.LIZLLL;
        this.LJJIJIL = str7;
        this.LJJIJL = cdnLog.LJ;
        this.LJJIJLIJ = cdnLog.serverIp;
        this.LJJIL = cdnLog.LJFF;
        this.LJJIZ = cdnLog.LJI;
        this.LJJJ = cdnLog.LJII;
        this.LJJJI = cdnLog.LJIIIIZZ;
        this.LJJJIL = cdnLog.statusCode;
        this.LJJJJ = cdnLog.LJIIIZ;
        this.LJJJJI = cdnLog.LJIIJ;
        if (TextUtils.equals(str6, str7)) {
            return;
        }
        String str8 = cdnLog.LIZJ;
        if (TextUtils.isEmpty(str8)) {
            return;
        }
        for (String host : LJJJJJ) {
            o.LJI(str8);
            o.LJIIIIZZ(host, "host");
            if (s.LJJJLZIJ(str8, host, false)) {
                this.LJJJJIZL = 1;
                return;
            }
        }
    }
}
