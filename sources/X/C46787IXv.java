package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.IXv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46787IXv implements InterfaceC46771IXf {
    public final long LIZ;
    public final List<IY4> LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;

    @Override // X.InterfaceC46771IXf
    public final IQU LIZ(IYA iya) {
        String str;
        String str2;
        if (iya == null) {
            return null;
        }
        IQU iqu = new IQU();
        iqu.LIZ = iya.getId();
        String str3 = "";
        if (iya.getLang() == null) {
            str = "";
        } else {
            str = iya.getLang();
        }
        iqu.LIZIZ = str;
        iqu.LIZJ = iya.getLanguageId();
        if (iya.getUrl() == null) {
            str2 = "";
        } else {
            str2 = iya.getUrl();
        }
        iqu.LIZLLL = str2;
        iqu.LJ = iya.getExpire();
        if (iya.getCaptionFormat() != null) {
            str3 = iya.getCaptionFormat();
        }
        iqu.LJFF = str3;
        iqu.LJI = iya.getSubId();
        return iqu;
    }

    @Override // X.InterfaceC46771IXf
    public final IQU LIZIZ(IYA iya) {
        String str;
        String str2;
        String str3;
        if (iya == null || iya.getUrl() == null) {
            return null;
        }
        IYJ iyj = new IYJ();
        iyj.LIZIZ = String.valueOf(iya.getSubId());
        String[] strArr = new String[0];
        if (iya.getUrl() != null) {
            strArr = new String[]{iya.getUrl()};
        }
        long createTime = iya.getCreateTime();
        long expire = iya.getExpire();
        if (IXN.LIZJ.forceHttps()) {
            for (int i = 0; i < strArr.length; i++) {
                String str4 = strArr[i];
                if (str4 != null && str4.startsWith("http") && !str4.startsWith("https")) {
                    str4 = str4.replaceFirst("http", "https");
                }
                strArr[i] = str4;
            }
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC46878IaY LIZ = C1DG.LIZ();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str5 = strArr[i2];
            if (str5 != null) {
                if ((str5.contains("aweme/v1/play") || strArr[i2].contains("aweme/v2/play")) && LIZ.getConfig().getCommonConfig().getCommonParamsProcessor() != null) {
                    IPC commonParamsProcessor = LIZ.getConfig().getCommonConfig().getCommonParamsProcessor();
                    String str6 = strArr[i2];
                    commonParamsProcessor.getClass();
                    arrayList.add(C78983UzD.LJI(str6).LJ());
                } else if (expire > 0 && this.LIZJ) {
                    if (System.currentTimeMillis() / 1000 < this.LIZLLL + expire) {
                        arrayList.add(strArr[i2]);
                    }
                } else if (SystemClock.elapsedRealtime() - createTime < this.LIZ) {
                    arrayList.add(strArr[i2]);
                }
            }
        }
        iyj.LIZ = (String[]) arrayList.toArray(new String[0]);
        IQU iqu = new IQU();
        IYI iyi = new IYI(iya, iyj.LIZIZ, iyj.LIZ);
        IY0 LIZIZ = new IY5(this.LIZIZ, iyi, 0).LIZIZ(iyi);
        iqu.LIZ = iya.getId();
        String str7 = "";
        if (iya.getLang() == null) {
            str = "";
        } else {
            str = iya.getLang();
        }
        iqu.LIZIZ = str;
        iqu.LIZJ = iya.getLanguageId();
        if (LIZIZ != null && (str3 = LIZIZ.LIZIZ) != null) {
            iqu.LIZLLL = str3;
        } else {
            if (TextUtils.isEmpty(iya.getUrl())) {
                str2 = "";
            } else {
                str2 = iya.getUrl();
            }
            iqu.LIZLLL = str2;
        }
        iqu.LJ = iya.getExpire();
        if (iya.getCaptionFormat() != null) {
            str7 = iya.getCaptionFormat();
        }
        iqu.LJFF = str7;
        iqu.LJI = iya.getSubId();
        return iqu;
    }

    public C46787IXv(List<IY4> list, long j) {
        this.LIZ = 2400000L;
        this.LIZIZ = ((ArrayList) list).isEmpty() ? Collections.singletonList(IY4.LIZ) : list;
        this.LIZ = j;
        this.LIZJ = C1DG.LIZ().getConfig().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        this.LIZLLL = C1DG.LIZ().getConfig().getSimPlayerExperiment().cdnUrlExpiredOffset();
    }
}
