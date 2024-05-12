package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.settings.UploadAdWebPreloadInfoConfig;
import com.ss.android.ugc.aweme.cct.AdACTEventLoger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.NIv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59137NIv {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v15, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    public static void LIZ(final NJ2 nj2, final String str, final InterfaceC59138NIw interfaceC59138NIw, final NJ0 nj0) {
        String LJIIL;
        String LIZJ;
        IAdLandPagePreloadService LJJI;
        JSONObject LJIIJ;
        boolean z;
        ?? arrayList;
        int i;
        if (((Boolean) C35253DsX.LIZ.getValue()).booleanValue()) {
            if (interfaceC59138NIw.LJIIJ() == 4 || interfaceC59138NIw.LJIIJJI() == 1) {
                if ((!nj0.LJFF.isEmpty() || nj0.LJIIIIZZ != 0) && TextUtils.equals(nj2.LIZJ, nj0.LIZLLL)) {
                    final int LJIIIIZZ = interfaceC59138NIw.LJIIIIZZ();
                    int i2 = 0;
                    if (UploadAdWebPreloadInfoConfig.LIZ().samplingRate < 1 || new Random().nextInt(UploadAdWebPreloadInfoConfig.LIZ().samplingRate) == 0) {
                        IAdLandPagePreloadService LJJI2 = AdLandPagePreloadServiceImpl.LJJI();
                        if (LJJI2 != null && (LJIIL = LJJI2.LJIIL("feed")) != null && (LIZJ = O3U.LIZJ(LJIIL, nj0.LIZ)) != null && (LJJI = AdLandPagePreloadServiceImpl.LJJI()) != null && (LJIIJ = LJJI.LJIIJ(LIZJ)) != null) {
                            nj0.LJIIJ = AdLandPagePreloadServiceImpl.LJJI().LJ(LIZJ);
                            nj0.LJIIJJI = AdLandPagePreloadServiceImpl.LJJI().LJIJI(LIZJ);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String str2 = NJ2.LJIILLIIL;
                            if (str2 == null || str2.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i3 = 6;
                            if (z) {
                                arrayList = C61878OQg.INSTANCE;
                            } else {
                                arrayList = new ArrayList();
                                for (String str3 : s.LJLJJL(str2, new String[]{"$$"}, 0, 6)) {
                                    String LJLLLLLL = s.LJLLLLLL('.', str3, str3);
                                    Integer LJJIL = C38350F3i.LJJIL(s.LJLLILLLL('.', str3, str3));
                                    if (LJJIL != null) {
                                        i = LJJIL.intValue();
                                    } else {
                                        i = 0;
                                    }
                                    arrayList.add(new C35675DzL(LJLLLLLL, i));
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                C35675DzL c35675DzL = (C35675DzL) obj;
                                String urlHash = C82519Wa3.LJ(c35675DzL.LIZ);
                                if (LJIIJ.has(urlHash)) {
                                    String str4 = c35675DzL.LIZ;
                                    o.LJIIIIZZ(urlHash, "urlHash");
                                    linkedHashMap.put(str4, urlHash);
                                } else {
                                    String url = c35675DzL.LIZ;
                                    o.LJIIIZ(url, "url");
                                    String LIZ = C35998EAw.LIZ(url);
                                    if (LJIIJ.has(LIZ)) {
                                        linkedHashMap.put(LIZ, LIZ);
                                    }
                                }
                                arrayList2.add(obj);
                            }
                            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                C35675DzL c35675DzL2 = (C35675DzL) it.next();
                                arrayList3.add(new OSZ(c35675DzL2.LIZ, c35675DzL2));
                            }
                            for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIL(C113554cx.LJJLIIIJLJLI(arrayList3))).entrySet()) {
                                if (linkedHashMap.get(entry.getKey()) != null) {
                                    nj0.LJFF.add(new E35(i2, (String) entry.getKey(), i3));
                                }
                            }
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        final ArrayList arrayList4 = new ArrayList();
                        Iterator<E35> it2 = nj0.LJI.iterator();
                        int i4 = 0;
                        int i5 = 0;
                        int i6 = 0;
                        while (it2.hasNext()) {
                            E35 next = it2.next();
                            if (linkedHashSet.add(next.LIZ)) {
                                arrayList4.add(next);
                                if (!next.LIZIZ) {
                                    i4++;
                                }
                            }
                            int i7 = next.LIZJ;
                            if (i7 == EnumC59140NIy.DOMAIN.ordinal()) {
                                i6++;
                            } else if (i7 == EnumC59140NIy.PREFETCH.ordinal()) {
                                i5++;
                            } else {
                                EnumC59140NIy.OFFLINE.ordinal();
                            }
                        }
                        Integer valueOf = Integer.valueOf(i4);
                        final OSI osi = new OSI(arrayList4, valueOf, Integer.valueOf(i5), Integer.valueOf(i6));
                        final int intValue = valueOf.intValue();
                        CopyOnWriteArrayList<E35> copyOnWriteArrayList = nj0.LJFF;
                        HashSet hashSet = new HashSet();
                        final ArrayList arrayList5 = new ArrayList();
                        Iterator<E35> it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            E35 next2 = it3.next();
                            if (hashSet.add(next2.LIZ)) {
                                arrayList5.add(next2);
                            }
                        }
                        AdACTEventLoger.LJJIJ().LIZJ(C58685N1l.LJIILJJIL, String.valueOf(interfaceC59138NIw.LJFF()), interfaceC59138NIw.LJIIL(), null, new InterfaceC88472Yns() { // from class: X.N1p
                            @Override // X.InterfaceC88472Yns
                            public final Object invoke(Object obj2) {
                                String str5 = str;
                                NJ0 nj02 = nj0;
                                int i8 = LJIIIIZZ;
                                InterfaceC59138NIw interfaceC59138NIw2 = interfaceC59138NIw;
                                List list = arrayList4;
                                List list2 = arrayList5;
                                OSI osi2 = osi;
                                int i9 = intValue;
                                C58620MzY c58620MzY = (C58620MzY) obj2;
                                C58684N1k.LIZ.getClass();
                                c58620MzY.LJII(C58684N1k.LJJ, str5);
                                c58620MzY.LJII(C58684N1k.LJJIJL, nj02.LIZ);
                                c58620MzY.LJII(C58684N1k.LJJIJIL, Integer.valueOf(i8));
                                c58620MzY.LJII(C58684N1k.LJIIJJI, Integer.valueOf(interfaceC59138NIw2.LJIILJJIL() ? 1 : 0));
                                c58620MzY.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(interfaceC59138NIw2.LJI()));
                                C56593MIz c56593MIz = C58684N1k.LJJIJLIJ;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("{\"total_request\":");
                                LIZ2.append(list2.size() + list.size());
                                LIZ2.append(",\"successCount\":");
                                LIZ2.append(list2.size());
                                LIZ2.append(",\"prefetchCount\":");
                                LIZ2.append(osi2.LIZJ);
                                LIZ2.append(",\"domainCount\":");
                                LIZ2.append(osi2.LIZLLL);
                                LIZ2.append(",\"hitPrefetchCount\":");
                                LIZ2.append(nj02.LJIIIZ);
                                LIZ2.append(",\"failCount\":");
                                LIZ2.append(list.size());
                                LIZ2.append(",\"failResourceCount\":");
                                LIZ2.append(i9);
                                LIZ2.append(",\"package_id\":");
                                LIZ2.append(nj02.LJ);
                                LIZ2.append(",\"channel_response\":");
                                LIZ2.append(nj02.LJII);
                                LIZ2.append(",\"channel_prefetch\":");
                                LIZ2.append(nj02.LJIIJ);
                                LIZ2.append(",\"channel_domain\":");
                                LIZ2.append(nj02.LJIIJJI);
                                LIZ2.append(",\"preload_success_requests\":");
                                LIZ2.append(list2);
                                LIZ2.append(",\"preload_fail_requests\":");
                                LIZ2.append(list);
                                LIZ2.append("}");
                                c58620MzY.LJII(c56593MIz, X1D.LIZIZ(LIZ2));
                                return null;
                            }
                        });
                    }
                    if (UploadAdWebPreloadInfoConfig.LIZ().perfRate < 1 || new Random().nextInt(UploadAdWebPreloadInfoConfig.LIZ().perfRate) == 0) {
                        AdACTEventLoger.LJJIJ().LIZJ(C58685N1l.LJIILL, String.valueOf(interfaceC59138NIw.LJFF()), interfaceC59138NIw.LJIIL(), null, new InterfaceC88472Yns() { // from class: X.N1o
                            @Override // X.InterfaceC88472Yns
                            public final Object invoke(Object obj2) {
                                String str5 = str;
                                NJ0 nj02 = nj0;
                                int i8 = LJIIIIZZ;
                                InterfaceC59138NIw interfaceC59138NIw2 = interfaceC59138NIw;
                                NJ2 nj22 = nj2;
                                C58620MzY c58620MzY = (C58620MzY) obj2;
                                C58684N1k.LIZ.getClass();
                                c58620MzY.LJII(C58684N1k.LJJ, str5);
                                c58620MzY.LJII(C58684N1k.LJJIJL, nj02.LIZ);
                                c58620MzY.LJII(C58684N1k.LJJIJIL, Integer.valueOf(i8));
                                c58620MzY.LJII(C58684N1k.LJIIJJI, Integer.valueOf(interfaceC59138NIw2.LJIILJJIL() ? 1 : 0));
                                c58620MzY.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(interfaceC59138NIw2.LJI()));
                                c58620MzY.LJII(C58684N1k.LJJIL, Long.valueOf(nj22.LJIIIIZZ));
                                c58620MzY.LJII(C58684N1k.LJJIZ, Long.valueOf(nj22.LJIIIZ));
                                c58620MzY.LJII(C58684N1k.LJJJ, Long.valueOf(nj22.LJIIJ));
                                c58620MzY.LJII(C58684N1k.LJJJI, Long.valueOf(nj22.LJIIJJI));
                                c58620MzY.LJII(C58684N1k.LJJJIL, Long.valueOf(nj22.LJIIL));
                                c58620MzY.LJII(C58684N1k.LJJJJ, Long.valueOf(nj22.LJIILIIL));
                                c58620MzY.LJII(C58684N1k.LJJJJI, Long.valueOf(nj02.LJIILJJIL));
                                c58620MzY.LJII(C58684N1k.LJJJJIZL, Long.valueOf(nj02.LJIILIIL));
                                return null;
                            }
                        });
                    }
                    nj0.LJII = 0;
                    nj0.LJIIIIZZ = 0;
                    nj0.LJIIJ = 0;
                    nj0.LJIIIZ = 0;
                    nj0.LJIIJJI = 0;
                    nj0.LJFF.clear();
                    nj0.LJI.clear();
                }
            }
        }
    }
}
