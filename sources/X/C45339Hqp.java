package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Hqp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45339Hqp {
    public UrlModel LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public String LJ;

    public final void LIZLLL(Aweme aweme) {
        String str;
        UrlModel urlModel;
        UrlModel urlModel2;
        List<SharePlatform> sharePlatformsList;
        String str2 = this.LJ;
        String str3 = null;
        if (str2 != null) {
            Locale locale = Locale.US;
            str = C141415gn.LIZIZ(locale, "US", str2, locale, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str = null;
        }
        o.LJIIIZ(aweme, "aweme");
        if (str != null) {
            List<SharePlatform> list = C62397OeH.LIZJ().LIZ;
            if (list == null || list.isEmpty()) {
                sharePlatformsList = C62759Ok7.LIZIZ();
            } else {
                sharePlatformsList = C62397OeH.LIZJ().LIZ;
            }
            o.LJIIIIZZ(sharePlatformsList, "sharePlatformsList");
            ArrayList arrayList = new ArrayList(C32I.LJJL(sharePlatformsList, 10));
            Iterator<SharePlatform> it = sharePlatformsList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().platformId);
            }
            java.util.Set LLJJ = ORZ.LLJJ(arrayList);
            java.util.Map map = (java.util.Map) GsonProtectorUtils.fromJson(C45340Hqq.LIZ, aweme.getVideo().getMiscDownloadAddrs(), new C41973Gdd().getType());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (LLJJ.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            urlModel = (UrlModel) linkedHashMap.get(str);
        } else {
            urlModel = null;
        }
        this.LIZ = urlModel;
        if (urlModel == null) {
            java.util.Map map2 = (java.util.Map) GsonProtectorUtils.fromJson(C45340Hqq.LIZ, aweme.getVideo().getMiscDownloadAddrs(), new C41973Gdd().getType());
            if (map2 != null) {
                urlModel2 = (UrlModel) map2.get("suffix_scene");
            } else {
                urlModel2 = null;
            }
            this.LIZ = urlModel2;
            if (urlModel2 == null) {
                if (this.LIZLLL && !Z89.LIZIZ.LIZIZ(aweme)) {
                    LIZJ(aweme, false);
                    this.LIZJ = this.LIZLLL;
                } else {
                    this.LIZ = aweme.getVideo().getDownloadAddr();
                }
            }
        }
        UrlModel urlModel3 = this.LIZ;
        if (urlModel3 != null) {
            str3 = urlModel3.getUri();
        }
        this.LIZIZ = C38352F3k.LIZJ(str3);
    }

    public final void LIZJ(Aweme aweme, boolean z) {
        VideoUrlModel playAddrH264 = aweme.getVideo().getPlayAddrH264();
        this.LIZ = playAddrH264;
        if (playAddrH264 != null) {
            String LIZLLL = AV1.LIZLLL(aweme.getAuthor());
            String str = null;
            if (z) {
                this.LIZJ = false;
                StringBuilder LIZ = X1D.LIZ();
                UrlModel urlModel = this.LIZ;
                if (urlModel != null) {
                    str = urlModel.getUri();
                }
                LIZ.append(str);
                LIZ.append(LIZLLL);
                LIZ.append("tag_no_water");
                this.LIZIZ = C38352F3k.LIZJ(X1D.LIZIZ(LIZ));
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            UrlModel urlModel2 = this.LIZ;
            if (urlModel2 != null) {
                str = urlModel2.getUri();
            }
            LIZ2.append(str);
            LIZ2.append(LIZLLL);
            this.LIZIZ = C38352F3k.LIZJ(X1D.LIZIZ(LIZ2));
        }
    }

    public final void LIZIZ(Aweme aweme, boolean z, boolean z2) {
        if (z || C62814Ol0.LJJIIZ(aweme) || C62814Ol0.LJIIIZ(aweme) || ((aweme != null && C62814Ol0.LJIL(aweme)) || z2)) {
            LIZJ(aweme, z2);
        } else {
            LIZLLL(aweme);
        }
    }

    public final void LIZ(Aweme aweme, boolean z, boolean z2, boolean z3, ACLCommonShare aCLCommonShare, boolean z4) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZJ = z;
        this.LIZLLL = z2;
        if (z3) {
            if (aCLCommonShare != null) {
                if (z || z4) {
                    LIZJ(aweme, z4);
                    return;
                } else {
                    LIZLLL(aweme);
                    return;
                }
            }
            LIZIZ(aweme, z, z4);
            return;
        }
        LIZIZ(aweme, z, z4);
    }
}
