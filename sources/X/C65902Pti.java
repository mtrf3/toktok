package X;

import com.bytedance.helios.network.api.service.INetworkApiService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Pti, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65902Pti extends F9E implements PYQ {
    public C65901Pth LJLIL;
    public final transient INetworkApiService LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public Object LJLLL;
    public java.util.Map<String, ? extends List<String>> LJLLLL;
    public java.util.Map<String, ? extends List<String>> LJLLLLLL;
    public java.util.Map<String, String> LJLZ;
    public java.util.Map<String, ? extends List<String>> LJZ;
    public transient C65896Ptc LJZI;
    public final C65904Ptk LJZL;
    public android.net.Uri LL;
    public android.net.Uri LLD;

    /* JADX WARN: Multi-variable type inference failed */
    public C65902Pti() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4194303);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, this.LJLLLLLL, this.LJLZ, this.LJZ, this.LJZI, this.LJZL, this.LL, this.LLD};
    }

    public final java.util.Map<String, List<String>> LJFF() {
        boolean z;
        java.util.Map<String, List<String>> map;
        java.util.Map<String, ? extends List<String>> map2 = this.LJLLLLLL;
        if (map2 == null || map2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                if (iNetworkApiService != null) {
                    map = iNetworkApiService.getHeaders(this);
                } else {
                    map = null;
                }
                this.LJLLLLLL = map;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLLLLLL;
    }

    public final String M() {
        boolean z;
        String str;
        String str2 = this.LJLJLLL;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                if (iNetworkApiService != null) {
                    str = iNetworkApiService.getContentSubType(this);
                } else {
                    str = null;
                }
                this.LJLJLLL = str;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLJLLL;
    }

    public final java.util.Map<String, String> N() {
        boolean z;
        java.util.Map<String, String> map;
        java.util.Map<String, String> map2 = this.LJLZ;
        if (map2 == null || map2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                if (iNetworkApiService != null) {
                    map = iNetworkApiService.getCookies(this);
                } else {
                    map = null;
                }
                this.LJLZ = map;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLZ;
    }

    public final java.util.Map<String, List<String>> O() {
        java.util.Map<String, List<String>> map;
        java.util.Map<String, ? extends List<String>> map2 = this.LJLLLL;
        if (map2 == null || map2.isEmpty()) {
            INetworkApiService iNetworkApiService = this.LJLILLLLZI;
            if (iNetworkApiService != null) {
                map = iNetworkApiService.getQueries(this);
            } else {
                map = null;
            }
            this.LJLLLL = map;
        }
        return this.LJLLLL;
    }

    public final String P() {
        boolean z;
        String str;
        String str2 = this.LJLL;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                if (iNetworkApiService != null) {
                    str = iNetworkApiService.getRequestBody(this);
                } else {
                    str = null;
                }
                this.LJLL = str;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLL;
    }

    public final String Q() {
        boolean z;
        String str;
        String str2 = this.LJLLJ;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                if (iNetworkApiService != null) {
                    str = iNetworkApiService.getResponseBody(this);
                } else {
                    str = null;
                }
                this.LJLLJ = str;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLLJ;
    }

    public final String R() {
        boolean z;
        String str;
        String str2 = this.LJLLILLLL;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                if (iNetworkApiService != null) {
                    str = iNetworkApiService.getResContentSubType(this);
                } else {
                    str = null;
                }
                this.LJLLILLLL = str;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLLILLLL;
    }

    public final String S() {
        boolean z;
        String str;
        String str2 = this.LJLLI;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                if (iNetworkApiService != null) {
                    str = iNetworkApiService.getResContentType(this);
                } else {
                    str = null;
                }
                this.LJLLI = str;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLLI;
    }

    public final java.util.Map<String, List<String>> T() {
        boolean z;
        java.util.Map<String, List<String>> map;
        java.util.Map<String, ? extends List<String>> map2 = this.LJZ;
        if (map2 == null || map2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                if (iNetworkApiService != null) {
                    map = iNetworkApiService.getResponseHeaders(this);
                } else {
                    map = null;
                }
                this.LJZ = map;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJZ;
    }

    public final String U() {
        boolean z;
        String str;
        String str2 = this.LJLJJL;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                android.net.Uri uri = this.LLD;
                if (uri == null || (str = uri.getScheme()) == null) {
                    INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                    if (iNetworkApiService != null) {
                        str = iNetworkApiService.getScheme(this);
                    } else {
                        str = null;
                    }
                }
                this.LJLJJL = str;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLJJL;
    }

    public final String getContentType() {
        boolean z;
        String str;
        String str2 = this.LJLJLJ;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                if (iNetworkApiService != null) {
                    str = iNetworkApiService.getContentType(this);
                } else {
                    str = null;
                }
                this.LJLJLJ = str;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLJLJ;
    }

    public final String getDomain() {
        boolean z;
        String str;
        String str2 = this.LJLJJLL;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                android.net.Uri uri = this.LLD;
                if (uri == null || (str = uri.getHost()) == null) {
                    INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                    if (iNetworkApiService != null) {
                        str = iNetworkApiService.getDomain(this);
                    } else {
                        str = null;
                    }
                }
                this.LJLJJLL = str;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLJJLL;
    }

    public final String getPath() {
        boolean z;
        String str;
        String str2 = this.LJLJL;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                android.net.Uri uri = this.LLD;
                if (uri == null || (str = uri.getPath()) == null) {
                    INetworkApiService iNetworkApiService = this.LJLILLLLZI;
                    if (iNetworkApiService != null) {
                        str = iNetworkApiService.getPath(this);
                    } else {
                        str = null;
                    }
                }
                this.LJLJL = str;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LJLJL;
    }

    public final String getUrl() {
        String str;
        List LJLJJL;
        String str2 = this.LJLJJI;
        if (str2 == null || str2.length() == 0) {
            INetworkApiService iNetworkApiService = this.LJLILLLLZI;
            String str3 = null;
            if (iNetworkApiService != null) {
                str3 = iNetworkApiService.getUrl(this);
            }
            this.LJLJJI = str3;
            android.net.Uri uri = this.LLD;
            if (uri != null) {
                if (str3 != null && (LJLJJL = s.LJLJJL(str3, new String[]{"?"}, 0, 6)) != null && LJLJJL.size() >= 2) {
                    str = (String) ListProtector.get(LJLJJL, 1);
                } else {
                    str = "";
                }
                StringBuilder LIZ = X1D.LIZ();
                String uri2 = uri.toString();
                o.LJIIIIZZ(uri2, "it.toString()");
                this.LJLJJI = JBR.LJFF(LIZ, (String) ListProtector.get(s.LJLJJL(uri2, new String[]{"?"}, 0, 6), 0), str, LIZ);
            }
        }
        return this.LJLJJI;
    }

    @Override // X.PYQ
    public final C65901Pth LJJJJL() {
        return this.LJLIL;
    }

    public final C65902Pti L(C65922Pu2 invokeContext) {
        o.LJIIIZ(invokeContext, "invokeContext");
        C65901Pth baseEvent = this.LJLIL;
        INetworkApiService iNetworkApiService = this.LJLILLLLZI;
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        String str3 = this.LJLJJL;
        String str4 = this.LJLJJLL;
        String str5 = this.LJLJL;
        String str6 = this.LJLJLJ;
        String str7 = this.LJLJLLL;
        String str8 = this.LJLL;
        String str9 = this.LJLLI;
        String str10 = this.LJLLILLLL;
        String str11 = this.LJLLJ;
        Object obj = this.LJLLL;
        java.util.Map<String, ? extends List<String>> map = this.LJLLLL;
        java.util.Map<String, ? extends List<String>> map2 = this.LJLLLLLL;
        java.util.Map<String, String> map3 = this.LJLZ;
        java.util.Map<String, ? extends List<String>> map4 = this.LJZ;
        C65896Ptc c65896Ptc = this.LJZI;
        C65904Ptk shutdownSampleRateModel = this.LJZL;
        android.net.Uri uri = this.LL;
        android.net.Uri uri2 = this.LLD;
        o.LJIIIZ(baseEvent, "baseEvent");
        o.LJIIIZ(shutdownSampleRateModel, "shutdownSampleRateModel");
        C65902Pti c65902Pti = new C65902Pti(baseEvent, iNetworkApiService, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, obj, map, map2, map3, map4, c65896Ptc, shutdownSampleRateModel, uri, uri2);
        c65902Pti.LJLJI = null;
        c65902Pti.LJLJJI = null;
        c65902Pti.LJLJJL = null;
        c65902Pti.LJLJJLL = null;
        c65902Pti.LJLJL = null;
        c65902Pti.LJLLLL = null;
        c65902Pti.LJLLLLLL = null;
        c65902Pti.LJLZ = null;
        C65901Pth L = C65901Pth.L(this.LJLIL);
        c65902Pti.LJLIL = L;
        L.M(invokeContext);
        return c65902Pti;
    }

    public /* synthetic */ C65902Pti(C65901Pth c65901Pth, INetworkApiService iNetworkApiService, C65904Ptk c65904Ptk, int i) {
        this((i & 1) != 0 ? new C65901Pth() : c65901Pth, (i & 2) != 0 ? null : iNetworkApiService, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (i & 524288) != 0 ? new C65904Ptk() : c65904Ptk, null, null);
    }

    public C65902Pti(C65901Pth baseEvent, INetworkApiService iNetworkApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Object obj, java.util.Map<String, ? extends List<String>> map, java.util.Map<String, ? extends List<String>> map2, java.util.Map<String, String> map3, java.util.Map<String, ? extends List<String>> map4, C65896Ptc c65896Ptc, C65904Ptk shutdownSampleRateModel, android.net.Uri uri, android.net.Uri uri2) {
        o.LJIIIZ(baseEvent, "baseEvent");
        o.LJIIIZ(shutdownSampleRateModel, "shutdownSampleRateModel");
        this.LJLIL = baseEvent;
        this.LJLILLLLZI = iNetworkApiService;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = str5;
        this.LJLJLJ = str6;
        this.LJLJLLL = str7;
        this.LJLL = str8;
        this.LJLLI = str9;
        this.LJLLILLLL = str10;
        this.LJLLJ = str11;
        this.LJLLL = obj;
        this.LJLLLL = map;
        this.LJLLLLLL = map2;
        this.LJLZ = map3;
        this.LJZ = map4;
        this.LJZI = c65896Ptc;
        this.LJZL = shutdownSampleRateModel;
        this.LL = uri;
        this.LLD = uri2;
    }
}
