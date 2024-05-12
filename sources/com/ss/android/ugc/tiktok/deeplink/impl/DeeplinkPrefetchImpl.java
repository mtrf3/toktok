package com.ss.android.ugc.tiktok.deeplink.impl;

import X.C10K;
import X.C19N;
import X.C34900Dmq;
import X.C37090Eh4;
import X.C38596FCu;
import X.C58096Mr6;
import X.FCC;
import X.FDM;
import X.FDN;
import X.FDO;
import X.FDP;
import X.FDQ;
import X.FDR;
import X.X1D;
import Y.ACallableS23S0210000_6;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ujb.o;

/* loaded from: classes7.dex */
public final class DeeplinkPrefetchImpl implements IDeepLinkSecurityService {
    public static IDeepLinkSecurityService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IDeepLinkSecurityService.class, false);
        if (LIZ != null) {
            return (IDeepLinkSecurityService) LIZ;
        }
        if (C58096Mr6.P8 == null) {
            synchronized (IDeepLinkSecurityService.class) {
                if (C58096Mr6.P8 == null) {
                    C58096Mr6.P8 = new DeeplinkPrefetchImpl();
                }
            }
        }
        return C58096Mr6.P8;
    }

    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    public final FDQ LIZ(FDP fdp) {
        LocalTestApi localTestApi;
        boolean z;
        List<FDN> list;
        String str;
        String str2;
        Set<String> set;
        boolean z2;
        List<C38596FCu> list2;
        String str3;
        FCC fcc;
        List<String> list3;
        boolean z3;
        String str4;
        String str5;
        String scheme;
        FDQ fdq = new FDQ();
        boolean z4 = false;
        if (C19N.LJ("roma_schema_interceptor_enabled", false) && (localTestApi = C37090Eh4.LIZ.LIZ) != null && localTestApi.enableDeeplinkIntercept()) {
            fdq.LJLJLJ = true;
            Uri uri = fdp.LIZ;
            if ((uri != null && (scheme = uri.getScheme()) != null && o.LJJJLIIL(scheme, "http", false)) || kotlin.jvm.internal.o.LJ(fdp.LIZIZ, Boolean.TRUE)) {
                fdq.LJLJI = true;
            } else {
                FDO fdo = FDR.LIZ;
                if (fdo != null && (list = fdo.LIZJ) != null) {
                    ArrayList arrayList = (ArrayList) list;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            FDN fdn = (FDN) it.next();
                            if (fdn.LIZ.length() > 0) {
                                String str6 = fdn.LIZ;
                                StringBuilder LIZ = X1D.LIZ();
                                Uri uri2 = fdp.LIZ;
                                if (uri2 != null) {
                                    str = uri2.getHost();
                                } else {
                                    str = null;
                                }
                                LIZ.append(str);
                                Uri uri3 = fdp.LIZ;
                                if (uri3 != null) {
                                    str2 = uri3.getPath();
                                } else {
                                    str2 = null;
                                }
                                LIZ.append(str2);
                                if (C34900Dmq.LIZ(str6, X1D.LIZIZ(LIZ))) {
                                    fdq.LJLIL = true;
                                    fdq.LJLILLLLZI = true;
                                    FDM fdm = fdn.LIZIZ;
                                    if (fdm != null) {
                                        Uri uri4 = fdp.LIZ;
                                        List<String> list4 = fdm.LIZ;
                                        if (uri4 != null) {
                                            set = UriProtector.getQueryParameterNames(uri4);
                                        } else {
                                            set = null;
                                        }
                                        if (list4 != null) {
                                            ArrayList arrayList2 = (ArrayList) list4;
                                            if (arrayList2.size() > 0) {
                                                Iterator it2 = arrayList2.iterator();
                                                while (it2.hasNext()) {
                                                    Object next = it2.next();
                                                    if (set != null && !set.contains(next)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (!fdq.LJLJJL) {
                                            List<String> list5 = fdm.LIZIZ;
                                            if (list5 != null) {
                                                ArrayList arrayList3 = (ArrayList) list5;
                                                if (arrayList3.size() > 0) {
                                                    Iterator it3 = arrayList3.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            break;
                                                        }
                                                        Object next2 = it3.next();
                                                        if (set != null && set.contains(next2)) {
                                                            fdq.LJLJJLL = true;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!fdq.LJLJJLL && (list2 = fdm.LIZJ) != null) {
                                                ArrayList arrayList4 = (ArrayList) list2;
                                                if (arrayList4.size() > 0) {
                                                    Iterator it4 = arrayList4.iterator();
                                                    while (it4.hasNext()) {
                                                        C38596FCu c38596FCu = (C38596FCu) it4.next();
                                                        if (c38596FCu != null) {
                                                            String str7 = c38596FCu.LIZ;
                                                            if (uri4 != null) {
                                                                str3 = UriProtector.getQueryParameter(uri4, str7);
                                                            } else {
                                                                str3 = null;
                                                            }
                                                            if (!TextUtils.isEmpty(str3) && (fcc = c38596FCu.LIZIZ) != null) {
                                                                List<String> list6 = fcc.LIZIZ;
                                                                if (list6 != null) {
                                                                    ArrayList arrayList5 = (ArrayList) list6;
                                                                    if (arrayList5.size() > 0) {
                                                                        Iterator it5 = arrayList5.iterator();
                                                                        while (it5.hasNext()) {
                                                                            boolean LIZ2 = C34900Dmq.LIZ((String) it5.next(), str3);
                                                                            fdq.LJLJL = LIZ2;
                                                                            if (LIZ2) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!fdq.LJLJL && (list3 = fcc.LIZ) != null) {
                                                                    ArrayList arrayList6 = (ArrayList) list3;
                                                                    if (arrayList6.size() > 0) {
                                                                        Iterator it6 = arrayList6.iterator();
                                                                        while (true) {
                                                                            if (it6.hasNext()) {
                                                                                if (C34900Dmq.LIZ((String) it6.next(), str3)) {
                                                                                    z3 = false;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                z3 = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                        fdq.LJLJL = z3;
                                                                    }
                                                                }
                                                                if (fdq.LJLJL) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!fdq.LJLJJL && !fdq.LJLJJLL && !fdq.LJLJL) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        fdq.LJLILLLLZI = z2;
                                    }
                                }
                            }
                        }
                        fdq.LJLJJI = false;
                    }
                }
                if (fdq.LJLIL && fdq.LJLILLLLZI) {
                    z = true;
                } else {
                    z = false;
                }
                fdq.LJLJI = z;
            }
            if (fdq.LJLJI || fdq.LJLJJI) {
                z4 = true;
            }
            fdq.LJLJLLL = z4;
            if (!z4) {
                C10K.LIZJ(new ACallableS23S0210000_6(fdp, fdq, true, 0));
                if (!fdq.LJLIL) {
                    str4 = "Illegal Link Host";
                    str5 = "You can either open [DebugPanel] and find [DeeplinkSecGuard] to skip this validation or configure on the [Roma] platform";
                } else if (!fdq.LJLILLLLZI) {
                    if (fdq.LJLJJL) {
                        str5 = "required params not present, please check [Roma] config";
                    } else if (fdq.LJLJJLL) {
                        str5 = "contains exclude params, please check [Roma] config";
                    } else if (fdq.LJLJL) {
                        str5 = "params value invalid, please check [Roma] config";
                    } else {
                        str5 = "Params illegal, please check [Roma] config";
                    }
                    str4 = "Illegal Link Params";
                } else {
                    str4 = "Unknown Link";
                    str5 = "illegal link, please check [Roma] config";
                }
                LocalTestApi localTestApi2 = C37090Eh4.LIZ.LIZ;
                if (localTestApi2 != null) {
                    localTestApi2.showDeeplinkInterceptorRemind(str4, str5);
                }
            }
        }
        return fdq;
    }

    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    public final boolean LIZIZ(String str) {
        return C34900Dmq.LIZ("[0-9]", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0128, code lost:
    
        if (r9 != null) goto L56;
     */
    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl.LIZJ(android.content.Context):void");
    }
}
