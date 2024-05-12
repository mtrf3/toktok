package com.bytedance.ies.ugc.statisticlogger.btm;

import X.C12400eC;
import X.C12420eE;
import X.C12450eH;
import X.C12460eI;
import X.C17980nC;
import X.C18080nM;
import X.C18090nN;
import X.C39560Ffo;
import X.C39561Ffp;
import X.C58096Mr6;
import X.C75792yF;
import X.EnumC12440eG;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BTMTrackerServiceImpl implements IBTMTrackerService {

    /* loaded from: classes2.dex */
    public static final class PageRecordSimpleForSpark {

        @InterfaceC65349Pkn("btm_pre")
        public final String btmPre;

        @InterfaceC65349Pkn("data")
        public final Map<String, String> data;

        @InterfaceC65349Pkn("page_code")
        public final String pageCode;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageRecordSimpleForSpark)) {
                return false;
            }
            PageRecordSimpleForSpark pageRecordSimpleForSpark = (PageRecordSimpleForSpark) obj;
            return o.LJ(this.pageCode, pageRecordSimpleForSpark.pageCode) && o.LJ(this.data, pageRecordSimpleForSpark.data) && o.LJ(this.btmPre, pageRecordSimpleForSpark.btmPre);
        }

        public final int hashCode() {
            int hashCode;
            int LIZ = C12400eC.LIZ(this.data, this.pageCode.hashCode() * 31, 31);
            String str = this.btmPre;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return LIZ + hashCode;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PageRecordSimpleForSpark(pageCode=");
            LIZ.append(this.pageCode);
            LIZ.append(", data=");
            LIZ.append(this.data);
            LIZ.append(", btmPre=");
            return q.LIZIZ(LIZ, this.btmPre, ')', LIZ);
        }

        public PageRecordSimpleForSpark(String pageCode, Map<String, String> data, String str) {
            o.LJIIIZ(pageCode, "pageCode");
            o.LJIIIZ(data, "data");
            this.pageCode = pageCode;
            this.data = data;
            this.btmPre = str;
        }
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final Map<String, String> LIZIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        Map<String, String> map = C39560Ffo.LIZ;
        Map<String, String> map2 = (Map) LIZLLL.LJIIIIZZ("lynx_channel_page_map", Map.class, map);
        if (map2 == null) {
            return map;
        }
        return map2;
    }

    public static IBTMTrackerService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IBTMTrackerService.class, false);
        if (LIZ != null) {
            return (IBTMTrackerService) LIZ;
        }
        if (C58096Mr6.LJJIII == null) {
            synchronized (IBTMTrackerService.class) {
                if (C58096Mr6.LJJIII == null) {
                    C58096Mr6.LJJIII = new BTMTrackerServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJIII;
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final List<C18090nN> LIZ() {
        C18080nM.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        for (C18090nN c18090nN = C18080nM.LIZJ; c18090nN != null; c18090nN = c18090nN.LJIILLIIL) {
            ListProtector.add(arrayList, 0, c18090nN);
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final String LIZJ() {
        C18080nM.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        for (C18090nN c18090nN = C18080nM.LIZJ; c18090nN != null; c18090nN = c18090nN.LJIILLIIL) {
            ListProtector.add(arrayList, 0, c18090nN);
        }
        return LJI(arrayList);
    }

    public static String LJI(List list) {
        Map<String, String> map;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C18090nN c18090nN = (C18090nN) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> map2 = c18090nN.LJJIL;
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
            C17980nC c17980nC = c18090nN.LJJIJLIJ;
            if (c17980nC != null && (map = c17980nC.LIZLLL) != null) {
                linkedHashMap.putAll(map);
            }
            arrayList.add(new PageRecordSimpleForSpark(c18090nN.LIZIZ(), linkedHashMap, c18090nN.LJ));
        }
        String LIZJ = C75792yF.LIZJ(arrayList);
        o.LJIIIIZZ(LIZJ, "toJson(result)");
        return LIZJ;
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final String LIZLLL(View view) {
        C18080nM.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        for (C18090nN LIZLLL = C18080nM.LIZLLL(view, null); LIZLLL != null; LIZLLL = LIZLLL.LJIILLIIL) {
            ListProtector.add(arrayList, 0, LIZLLL);
        }
        return LJI(arrayList);
    }

    @Override // com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService
    public final void LJ(String btmPageCode, Fragment fragmentOfPage) {
        o.LJIIIZ(btmPageCode, "btmPageCode");
        o.LJIIIZ(fragmentOfPage, "fragmentOfPage");
        C39561Ffp c39561Ffp = new C39561Ffp(btmPageCode);
        C12420eE c12420eE = new C12420eE();
        c12420eE.LIZ(c39561Ffp.LLZIL());
        String btmPageCode2 = c39561Ffp.getBtmPageCode();
        o.LJIIIZ(btmPageCode2, "<set-?>");
        c12420eE.LIZJ = btmPageCode2;
        c12420eE.LJIIJJI = null;
        c12420eE.LIZIZ(EnumC12440eG.FRAGMENT);
        c12420eE.LJFF = new WeakReference<>(fragmentOfPage);
        c12420eE.LJI = new WeakReference<>(fragmentOfPage.mo49getActivity());
        C12460eI.LJII(new C12450eH(c12420eE));
    }
}
