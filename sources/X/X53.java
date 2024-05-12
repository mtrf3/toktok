package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class X53 {
    public final java.util.Set<Integer> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final java.util.Set<Integer> LIZLLL;
    public final List<Long> LJ;
    public final List<Long> LJFF;
    public final java.util.Set<Integer> LJI;
    public int LJII;
    public final List<String> LJIIIIZZ;
    public final java.util.Set<Integer> LJIIIZ;
    public int LJIIJ;
    public final List<X52> LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;

    public X53(DownloadInfo downloadInfo) {
        int i;
        StringBuilder LIZ;
        HashSet hashSet = new HashSet();
        this.LIZ = hashSet;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        HashSet hashSet2 = new HashSet();
        this.LIZLLL = hashSet2;
        ArrayList arrayList = new ArrayList();
        this.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJFF = arrayList2;
        HashSet hashSet3 = new HashSet();
        this.LJI = hashSet3;
        this.LJII = 0;
        ArrayList arrayList3 = new ArrayList();
        this.LJIIIIZZ = arrayList3;
        HashSet hashSet4 = new HashSet();
        this.LJIIIZ = hashSet4;
        this.LJIIJ = 0;
        this.LJIIJJI = new ArrayList();
        this.LJIIL = 0;
        try {
            LIZIZ(downloadInfo);
            if (C65210PiY.LIZ()) {
                int i2 = this.LJIIL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Init ttnetIsolationCount:");
                LIZ2.append(this.LIZIZ);
                LIZ2.append(" mIsolationErrorCodeSet:");
                LIZ2.append(hashSet.toString());
                LIZ2.append(" mIsolationHttpProtoType:");
                LIZ2.append(this.LIZJ);
                LIZ2.append(" ttnetTimeoutErrorCodes:");
                LIZ2.append(hashSet2.toString());
                LIZ2.append(" ttnetConnectTimeout:");
                LIZ2.append(arrayList.toString());
                LIZ2.append(" ttnetIoTimeout:");
                LIZ2.append(arrayList2.toString());
                LIZ2.append(" ipChangeCountLimit:");
                LIZ2.append(this.LJII);
                LIZ2.append(" ipChangeErrorCodeSet:");
                LIZ2.append(hashSet3);
                LIZ2.append(" host:");
                LIZ2.append(this.LJIILIIL);
                LIZ2.append(" backHostList:");
                LIZ2.append(arrayList3.toString());
                LIZ2.append(" backHostCountLimit:");
                LIZ2.append(this.LJIIJ);
                LIZ2.append(" backHostErrorCodeSet:");
                LIZ2.append(hashSet4);
                C65210PiY.LIZLLL(i2, "NetworkFailoverStrategy", "NetworkFailoverStrategy", X1D.LIZIZ(LIZ2));
            }
        } catch (Throwable th) {
            try {
                i = this.LJIIL;
                try {
                    LIZ = X1D.LIZ();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                LIZ.append("Init Error");
                LIZ.append(th.toString());
                C65210PiY.LJ(i, "NetworkFailoverStrategy", "NetworkFailoverStrategy", X1D.LIZIZ(LIZ));
                if (C65210PiY.LIZ()) {
                    int i3 = this.LJIIL;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Init ttnetIsolationCount:");
                    LIZ3.append(this.LIZIZ);
                    LIZ3.append(" mIsolationErrorCodeSet:");
                    LIZ3.append(this.LIZ.toString());
                    LIZ3.append(" mIsolationHttpProtoType:");
                    LIZ3.append(this.LIZJ);
                    LIZ3.append(" ttnetTimeoutErrorCodes:");
                    LIZ3.append(this.LIZLLL.toString());
                    LIZ3.append(" ttnetConnectTimeout:");
                    LIZ3.append(this.LJ.toString());
                    LIZ3.append(" ttnetIoTimeout:");
                    LIZ3.append(this.LJFF.toString());
                    LIZ3.append(" ipChangeCountLimit:");
                    LIZ3.append(this.LJII);
                    LIZ3.append(" ipChangeErrorCodeSet:");
                    LIZ3.append(this.LJI);
                    LIZ3.append(" host:");
                    LIZ3.append(this.LJIILIIL);
                    LIZ3.append(" backHostList:");
                    LIZ3.append(this.LJIIIIZZ.toString());
                    LIZ3.append(" backHostCountLimit:");
                    LIZ3.append(this.LJIIJ);
                    LIZ3.append(" backHostErrorCodeSet:");
                    LIZ3.append(this.LJIIIZ);
                    C65210PiY.LIZLLL(i3, "NetworkFailoverStrategy", "NetworkFailoverStrategy", X1D.LIZIZ(LIZ3));
                }
            } catch (Throwable th4) {
                th = th4;
                if (C65210PiY.LIZ()) {
                    int i4 = this.LJIIL;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Init ttnetIsolationCount:");
                    LIZ4.append(this.LIZIZ);
                    LIZ4.append(" mIsolationErrorCodeSet:");
                    LIZ4.append(this.LIZ.toString());
                    LIZ4.append(" mIsolationHttpProtoType:");
                    LIZ4.append(this.LIZJ);
                    LIZ4.append(" ttnetTimeoutErrorCodes:");
                    LIZ4.append(this.LIZLLL.toString());
                    LIZ4.append(" ttnetConnectTimeout:");
                    LIZ4.append(this.LJ.toString());
                    LIZ4.append(" ttnetIoTimeout:");
                    LIZ4.append(this.LJFF.toString());
                    LIZ4.append(" ipChangeCountLimit:");
                    LIZ4.append(this.LJII);
                    LIZ4.append(" ipChangeErrorCodeSet:");
                    LIZ4.append(this.LJI);
                    LIZ4.append(" host:");
                    LIZ4.append(this.LJIILIIL);
                    LIZ4.append(" backHostList:");
                    LIZ4.append(this.LJIIIIZZ.toString());
                    LIZ4.append(" backHostCountLimit:");
                    LIZ4.append(this.LJIIJ);
                    LIZ4.append(" backHostErrorCodeSet:");
                    LIZ4.append(this.LJIIIZ);
                    C65210PiY.LIZLLL(i4, "NetworkFailoverStrategy", "NetworkFailoverStrategy", X1D.LIZIZ(LIZ4));
                }
                throw th;
            }
        }
        this.LJIIJJI.add(new X55(this));
        this.LJIIJJI.add(new X54(this));
        this.LJIIJJI.add(new X56(this));
        this.LJIIJJI.add(new X57(this));
        this.LJIIJJI.add(new X55(this));
    }

    public final void LIZ(BaseException baseException) {
        Iterator it = ((ArrayList) this.LJIIJJI).iterator();
        while (it.hasNext()) {
            X52 x52 = (X52) it.next();
            boolean LIZJ = x52.LIZJ(baseException);
            if (x52.LIZIZ() && LIZJ) {
                return;
            }
        }
    }

    public final void LIZIZ(DownloadInfo downloadInfo) {
        JSONObject LJIIIZ;
        String[] split;
        if (downloadInfo != null) {
            this.LJIIL = downloadInfo.getId();
            this.LJIILIIL = new java.net.URL(downloadInfo.getUrl()).getHost();
            LJIIIZ = X4H.LJFF(this.LJIIL, null).LJIIIZ("network_failover_strategy");
        } else {
            LJIIIZ = X4H.LJFF.LJIIIZ("network_failover_strategy");
        }
        if (LJIIIZ == null) {
            return;
        }
        int optInt = LJIIIZ.optInt("ttnet_back_host_count_limit");
        if (optInt > 0) {
            this.LJIIJ = optInt;
        }
        JSONArray optJSONArray = LJIIIZ.optJSONArray("ttnet_back_host");
        if (!TextUtils.isEmpty(this.LJIILIIL) && optJSONArray != null && optJSONArray.length() > 0) {
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    break;
                }
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString) && (split = optString.split(":")) != null && split.length == 2 && this.LJIILIIL.equals(split[0]) && !TextUtils.isEmpty(split[1])) {
                    String[] split2 = split[1].split(",");
                    if (split2 != null && split2.length > 0) {
                        for (String str : split2) {
                            if (!TextUtils.isEmpty(str)) {
                                this.LJIIIIZZ.add(str);
                            }
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        JSONArray optJSONArray2 = LJIIIZ.optJSONArray("ttnet_back_host_error_code");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                int optInt2 = optJSONArray2.optInt(i2);
                if (optInt2 > 0) {
                    this.LJIIIZ.add(Integer.valueOf(optInt2));
                }
            }
        }
        int optInt3 = LJIIIZ.optInt("ttnet_isolation_count");
        if (optInt3 > 0) {
            this.LIZIZ = optInt3;
        }
        JSONArray optJSONArray3 = LJIIIZ.optJSONArray("ttnet_isolation_error_code");
        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                int optInt4 = optJSONArray3.optInt(i3);
                if (optInt4 > 0) {
                    this.LIZ.add(Integer.valueOf(optInt4));
                }
            }
        }
        int optInt5 = LJIIIZ.optInt("ttnet_isolation_http_proto_type");
        if (1 == optInt5 || 2 == optInt5) {
            this.LIZJ = optInt5;
        }
        JSONArray optJSONArray4 = LJIIIZ.optJSONArray("ttnet_timeout_error_code");
        if (optJSONArray4 != null && optJSONArray4.length() > 0) {
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                int optInt6 = optJSONArray4.optInt(i4);
                if (optInt6 > 0) {
                    this.LIZLLL.add(Integer.valueOf(optInt6));
                }
            }
        }
        JSONArray optJSONArray5 = LJIIIZ.optJSONArray("ttnet_timeout_connect");
        if (optJSONArray5 != null && optJSONArray5.length() > 0) {
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                long optLong = optJSONArray5.optLong(i5);
                if (optLong > 0) {
                    this.LJ.add(Long.valueOf(optLong));
                }
            }
        }
        JSONArray optJSONArray6 = LJIIIZ.optJSONArray("ttnet_timeout_io");
        if (optJSONArray6 != null && optJSONArray6.length() > 0) {
            for (int i6 = 0; i6 < optJSONArray6.length(); i6++) {
                long optLong2 = optJSONArray6.optLong(i6);
                if (optLong2 > 0) {
                    this.LJFF.add(Long.valueOf(optLong2));
                }
            }
        }
        JSONArray optJSONArray7 = LJIIIZ.optJSONArray("ttnet_ip_change_error_code");
        if (optJSONArray7 != null && optJSONArray7.length() > 0) {
            for (int i7 = 0; i7 < optJSONArray7.length(); i7++) {
                int optInt7 = optJSONArray7.optInt(i7);
                if (optInt7 > 0) {
                    this.LJI.add(Integer.valueOf(optInt7));
                }
            }
        }
        int optInt8 = LJIIIZ.optInt("ttnet_ip_change_count_limit");
        if (optInt8 > 0) {
            this.LJII = optInt8;
        }
    }
}
