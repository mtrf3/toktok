package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.BannerList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import defpackage.a1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38901fq implements InterfaceC48038ItG, InterfaceC73592SuS {
    public static InterfaceC12340e6 LJLIL;
    public static final C38901fq LJLILLLLZI = new C38901fq();
    public static final C38901fq LJLJI = new C38901fq();
    public static final C38901fq LJLJJI = new C38901fq();
    public static final char[] LJLJJL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final C0YV LIZIZ(InterfaceC274115t interfaceC274115t) {
        Object LJIIJJI = interfaceC274115t.LJIIJJI();
        if (LJIIJJI instanceof C0YV) {
            return (C0YV) LJIIJJI;
        }
        return null;
    }

    public static String LIZJ(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                char[] cArr = LJLJJL;
                stringBuffer.append(cArr[(b & 240) >> 4]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static String LIZLLL(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                java.net.URI uri = new java.net.URI(str);
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(uri.getHost())) {
                    sb.append(uri.getHost());
                }
                if (!TextUtils.isEmpty(uri.getPath())) {
                    sb.append(uri.getPath());
                }
                return sb.toString();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return str;
    }

    public static final float LJ(C0YV c0yv) {
        if (c0yv != null) {
            return c0yv.LIZ;
        }
        return 0.0f;
    }

    public static void LJI(Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_msg", th.getMessage());
            jSONObject.put("exception_stack_trace", android.util.Log.getStackTraceString(th));
            C79146V4k.LJJLI("tt_token_exception", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJIIIZ(Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onException: ");
        LIZ.append(th.toString());
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("ByteBench SladarCenter");
        InterfaceC12340e6 interfaceC12340e6 = LJLIL;
        if (interfaceC12340e6 != null) {
            interfaceC12340e6.onException(th);
        } else {
            C47261Igj.LJJJJZ("ByteBench SladarCenter");
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        String str;
        BannerList it = (BannerList) obj;
        o.LJIIIZ(it, "it");
        LogPbBean logPbBean = it.logPb;
        if (logPbBean != null) {
            str = logPbBean.getImprId();
        } else {
            str = null;
        }
        Iterator<Banner> it2 = it.items.iterator();
        while (it2.hasNext()) {
            it2.next().setRequestId(str);
        }
        return AbstractC73638SvC.LJIJ(it.items);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIZ(it, "it");
        return it.booleanValue();
    }

    public static void LJIIIIZZ(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i);
            jSONObject.put("error_code_msg", str);
            jSONObject.put("extra", new StringBuilder().toString());
            C79146V4k.LJJLI("tt_token_beat", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.String r2, java.lang.String r3, org.json.JSONObject r4) {
        /*
            if (r4 != 0) goto L7
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L48
            r4.<init>()     // Catch: java.lang.Exception -> L48
        L7:
            java.lang.String r0 = "error_name"
            r4.put(r0, r2)     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = "error_message"
            r4.put(r0, r3)     // Catch: java.lang.Exception -> L48
            java.lang.String r3 = "network_available"
            X.FX5 r0 = X.C66960QPs.LIZ()     // Catch: java.lang.Exception -> L48
            X.QWR r0 = (X.QWR) r0     // Catch: java.lang.Exception -> L48
            android.content.Context r1 = X.QWR.LIZ()     // Catch: java.lang.Exception -> L48
            r2 = 0
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r1, r0)     // Catch: java.lang.Exception -> L34
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L34
            android.net.NetworkInfo r0 = X.C16880lQ.LJJLI(r0)     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L34
            boolean r0 = r0.isConnected()     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r4.put(r3, r0)     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = "app_in_foreground"
            int r0 = X.C66962QPu.LJLIL     // Catch: java.lang.Exception -> L48
            if (r0 <= 0) goto L3f
            r2 = 1
        L3f:
            r4.put(r1, r2)     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = "token_config_err_v2"
            X.C79146V4k.LJJLI(r0, r4)     // Catch: java.lang.Exception -> L48
            goto L4c
        L48:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38901fq.LJFF(java.lang.String, java.lang.String, org.json.JSONObject):void");
    }

    public static void LJII(String str, List list, boolean z) {
        try {
            String str2 = "";
            StringBuilder sb = new StringBuilder();
            if (list != null && !list.isEmpty()) {
                for (Object obj : list) {
                    if (obj instanceof FBY) {
                        if ("X-TT-LOGID".equalsIgnoreCase(((FBY) obj).LIZ)) {
                            str2 = ((FBY) obj).LIZIZ;
                        }
                    } else if (obj != null) {
                        sb.append(obj.toString());
                        sb.append(";");
                    }
                }
            }
            C79146V4k.LJJL(LIZLLL(str), str2, sb.toString(), z);
        } catch (Exception e) {
            LJI(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1PA] */
    public static final C1PA LJIIJ(final float f, final AbstractC09380Yk abstractC09380Yk, final EnumC09360Yi orientation, final EnumC09310Yd crossAxisSize, final InterfaceC88475Ynv arrangement) {
        o.LJIIIZ(orientation, "orientation");
        o.LJIIIZ(arrangement, "arrangement");
        o.LJIIIZ(crossAxisSize, "crossAxisSize");
        return new InterfaceC273215k() { // from class: X.1PA
            @Override // X.InterfaceC273215k
            public final int LIZ(AbstractC538029g abstractC538029g, List list, int i) {
                InterfaceC88473Ynt interfaceC88473Ynt;
                o.LJIIIZ(abstractC538029g, "<this>");
                if (orientation == EnumC09360Yi.Horizontal) {
                    interfaceC88473Ynt = C09430Yp.LJ;
                } else {
                    interfaceC88473Ynt = C09430Yp.LJFF;
                }
                return ((Number) interfaceC88473Ynt.invoke(list, Integer.valueOf(i), Integer.valueOf(a1.LIZ(f, abstractC538029g)))).intValue();
            }

            @Override // X.InterfaceC273215k
            public final int LIZIZ(AbstractC538029g abstractC538029g, List list, int i) {
                InterfaceC88473Ynt interfaceC88473Ynt;
                o.LJIIIZ(abstractC538029g, "<this>");
                if (orientation == EnumC09360Yi.Horizontal) {
                    interfaceC88473Ynt = C09430Yp.LIZ;
                } else {
                    interfaceC88473Ynt = C09430Yp.LIZIZ;
                }
                return ((Number) interfaceC88473Ynt.invoke(list, Integer.valueOf(i), Integer.valueOf(a1.LIZ(f, abstractC538029g)))).intValue();
            }

            @Override // X.InterfaceC273215k
            public final InterfaceC273515n LIZJ(InterfaceC44861pS measure, List<? extends InterfaceC39071g7> measurables, long j) {
                int LJIIIIZZ;
                int LJI;
                int LJIIIZ;
                int LJII;
                int i;
                float f2;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                InterfaceC273515n LJJLIL;
                int i9;
                int i10;
                int i11;
                o.LJIIIZ(measure, "$this$measure");
                o.LJIIIZ(measurables, "measurables");
                EnumC09360Yi enumC09360Yi = orientation;
                EnumC09360Yi enumC09360Yi2 = EnumC09360Yi.Horizontal;
                if (enumC09360Yi == enumC09360Yi2) {
                    LJIIIIZZ = C23360vs.LJIIIZ(j);
                } else {
                    LJIIIIZZ = C23360vs.LJIIIIZZ(j);
                }
                if (enumC09360Yi == enumC09360Yi2) {
                    LJI = C23360vs.LJII(j);
                } else {
                    LJI = C23360vs.LJI(j);
                }
                if (enumC09360Yi == enumC09360Yi2) {
                    LJIIIZ = C23360vs.LJIIIIZZ(j);
                } else {
                    LJIIIZ = C23360vs.LJIIIZ(j);
                }
                if (enumC09360Yi == enumC09360Yi2) {
                    LJII = C23360vs.LJI(j);
                } else {
                    LJII = C23360vs.LJII(j);
                }
                C1P8 c1p8 = new C1P8(LJIIIIZZ, LJI, LJIIIZ, LJII);
                int LJJIJ = measure.LJJIJ(f);
                AbstractC39201gK[] abstractC39201gKArr = new AbstractC39201gK[measurables.size()];
                int size = measurables.size();
                C0YV[] c0yvArr = new C0YV[size];
                for (int i12 = 0; i12 < size; i12++) {
                    c0yvArr[i12] = C38901fq.LIZIZ((InterfaceC274115t) ListProtector.get(measurables, i12));
                }
                int size2 = measurables.size();
                float f3 = 0.0f;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                float f4 = 0.0f;
                int i16 = 0;
                int i17 = 0;
                while (i13 < size2) {
                    InterfaceC39071g7 interfaceC39071g7 = (InterfaceC39071g7) ListProtector.get(measurables, i13);
                    float LJ = C38901fq.LJ(c0yvArr[i13]);
                    if (LJ > f3) {
                        f4 += LJ;
                        i15++;
                    } else {
                        int i18 = c1p8.LJLILLLLZI;
                        int i19 = Integer.MAX_VALUE;
                        if (i18 != Integer.MAX_VALUE) {
                            i19 = i18 - i16;
                        }
                        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(new C1P8(0, i19, 0, c1p8.LJLJJI).L(orientation));
                        int i20 = i18 - i16;
                        EnumC09360Yi enumC09360Yi3 = orientation;
                        EnumC09360Yi enumC09360Yi4 = EnumC09360Yi.Horizontal;
                        if (enumC09360Yi3 == enumC09360Yi4) {
                            i9 = LJJJIL.LJLIL;
                        } else {
                            i9 = LJJJIL.LJLILLLLZI;
                        }
                        i17 = Math.min(LJJIJ, i20 - i9);
                        EnumC09360Yi enumC09360Yi5 = orientation;
                        if (enumC09360Yi5 == enumC09360Yi4) {
                            i10 = LJJJIL.LJLIL;
                        } else {
                            i10 = LJJJIL.LJLILLLLZI;
                        }
                        i16 += i10 + i17;
                        if (enumC09360Yi5 == enumC09360Yi4) {
                            i11 = LJJJIL.LJLILLLLZI;
                        } else {
                            i11 = LJJJIL.LJLIL;
                        }
                        i14 = Math.max(i14, i11);
                        abstractC39201gKArr[i13] = LJJJIL;
                    }
                    i13++;
                    f3 = 0.0f;
                }
                if (i15 == 0) {
                    i16 -= i17;
                    i2 = 0;
                } else {
                    if (f4 <= f3 || (i = c1p8.LJLILLLLZI) == Integer.MAX_VALUE) {
                        i = c1p8.LJLIL;
                    }
                    int i21 = (i15 - 1) * LJJIJ;
                    int i22 = (i - i16) - i21;
                    if (f4 > f3) {
                        f2 = i22 / f4;
                    } else {
                        f2 = 0.0f;
                    }
                    int i23 = 0;
                    for (int i24 = 0; i24 < size; i24++) {
                        i23 += O6R.LJJIIZ(C38901fq.LJ(c0yvArr[i24]) * f2);
                    }
                    int i25 = i22 - i23;
                    int size3 = measurables.size();
                    int i26 = 0;
                    for (int i27 = 0; i27 < size3; i27++) {
                        if (abstractC39201gKArr[i27] == null) {
                            InterfaceC39071g7 interfaceC39071g72 = (InterfaceC39071g7) ListProtector.get(measurables, i27);
                            C0YV c0yv = c0yvArr[i27];
                            float LJ2 = C38901fq.LJ(c0yv);
                            if (LJ2 > 0.0f) {
                                if (i25 < 0) {
                                    i3 = -1;
                                } else if (i25 > 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                i25 -= i3;
                                int max = Math.max(0, O6R.LJJIIZ(LJ2 * f2) + i3);
                                if ((c0yv == null || c0yv.LIZIZ) && max != Integer.MAX_VALUE) {
                                    i4 = max;
                                } else {
                                    i4 = 0;
                                }
                                AbstractC39201gK LJJJIL2 = interfaceC39071g72.LJJJIL(new C1P8(i4, max, 0, c1p8.LJLJJI).L(orientation));
                                EnumC09360Yi enumC09360Yi6 = orientation;
                                EnumC09360Yi enumC09360Yi7 = EnumC09360Yi.Horizontal;
                                if (enumC09360Yi6 == enumC09360Yi7) {
                                    i5 = LJJJIL2.LJLIL;
                                } else {
                                    i5 = LJJJIL2.LJLILLLLZI;
                                }
                                int i28 = i5 + i26;
                                if (enumC09360Yi6 == enumC09360Yi7) {
                                    i6 = LJJJIL2.LJLILLLLZI;
                                } else {
                                    i6 = LJJJIL2.LJLIL;
                                }
                                i14 = Math.max(i14, i6);
                                abstractC39201gKArr[i27] = LJJJIL2;
                                i26 = i28;
                            } else {
                                "All weights <= 0 should have placeables".toString();
                                throw new IllegalStateException("All weights <= 0 should have placeables");
                            }
                        }
                    }
                    int i29 = i26 + i21;
                    i2 = c1p8.LJLILLLLZI - i16;
                    if (i29 <= i2) {
                        i2 = i29;
                    }
                }
                C76732zl c76732zl = new C76732zl();
                int max2 = Math.max(i16 + i2, c1p8.LJLIL);
                int i30 = c1p8.LJLJJI;
                if (i30 == Integer.MAX_VALUE || crossAxisSize != EnumC09310Yd.Expand) {
                    i30 = Math.max(i14, Math.max(c1p8.LJLJI, c76732zl.element));
                }
                EnumC09360Yi enumC09360Yi8 = orientation;
                EnumC09360Yi enumC09360Yi9 = EnumC09360Yi.Horizontal;
                if (enumC09360Yi8 == enumC09360Yi9) {
                    i7 = max2;
                } else {
                    i7 = i30;
                }
                if (enumC09360Yi8 == enumC09360Yi9) {
                    i8 = i30;
                } else {
                    i8 = max2;
                }
                int size4 = measurables.size();
                int[] iArr = new int[size4];
                for (int i31 = 0; i31 < size4; i31++) {
                    iArr[i31] = 0;
                }
                LJJLIL = measure.LJJLIL(i7, i8, C113554cx.LJJJLIIL(), new C51091zV(measurables, abstractC39201gKArr, arrangement, max2, measure, iArr, orientation, c0yvArr, abstractC09380Yk, i30, c76732zl));
                return LJJLIL;
            }

            @Override // X.InterfaceC273215k
            public final int LIZLLL(AbstractC538029g abstractC538029g, List list, int i) {
                InterfaceC88473Ynt interfaceC88473Ynt;
                o.LJIIIZ(abstractC538029g, "<this>");
                if (orientation == EnumC09360Yi.Horizontal) {
                    interfaceC88473Ynt = C09430Yp.LJI;
                } else {
                    interfaceC88473Ynt = C09430Yp.LJII;
                }
                return ((Number) interfaceC88473Ynt.invoke(list, Integer.valueOf(i), Integer.valueOf(a1.LIZ(f, abstractC538029g)))).intValue();
            }

            @Override // X.InterfaceC273215k
            public final int LJ(AbstractC538029g abstractC538029g, List list, int i) {
                InterfaceC88473Ynt interfaceC88473Ynt;
                o.LJIIIZ(abstractC538029g, "<this>");
                if (orientation == EnumC09360Yi.Horizontal) {
                    interfaceC88473Ynt = C09430Yp.LIZJ;
                } else {
                    interfaceC88473Ynt = C09430Yp.LIZLLL;
                }
                return ((Number) interfaceC88473Ynt.invoke(list, Integer.valueOf(i), Integer.valueOf(a1.LIZ(f, abstractC538029g)))).intValue();
            }
        };
    }

    public static final int LIZ(List list, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr interfaceC88471Ynr2, int i, int i2, EnumC09360Yi enumC09360Yi, EnumC09360Yi enumC09360Yi2) {
        int LJJIIZ;
        int i3;
        if (enumC09360Yi == enumC09360Yi2) {
            int size = list.size();
            int i4 = 0;
            float f = 0.0f;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC274115t interfaceC274115t = (InterfaceC274115t) ListProtector.get(list, i6);
                float LJ = LJ(LIZIZ(interfaceC274115t));
                int intValue = ((Number) interfaceC88471Ynr.invoke(interfaceC274115t, Integer.valueOf(i))).intValue();
                if (LJ == 0.0f) {
                    i5 += intValue;
                } else if (LJ > 0.0f) {
                    f += LJ;
                    i4 = Math.max(i4, O6R.LJJIIZ(intValue / LJ));
                }
            }
            return ((list.size() - 1) * i2) + O6R.LJJIIZ(i4 * f) + i5;
        }
        int min = Math.min((list.size() - 1) * i2, i);
        int size2 = list.size();
        float f2 = 0.0f;
        int i7 = 0;
        for (int i8 = 0; i8 < size2; i8++) {
            InterfaceC274115t interfaceC274115t2 = (InterfaceC274115t) ListProtector.get(list, i8);
            float LJ2 = LJ(LIZIZ(interfaceC274115t2));
            if (LJ2 == 0.0f) {
                int min2 = Math.min(((Number) interfaceC88471Ynr2.invoke(interfaceC274115t2, Integer.MAX_VALUE)).intValue(), i - min);
                min += min2;
                i7 = Math.max(i7, ((Number) interfaceC88471Ynr.invoke(interfaceC274115t2, Integer.valueOf(min2))).intValue());
            } else if (LJ2 > 0.0f) {
                f2 += LJ2;
            }
        }
        if (f2 == 0.0f) {
            LJJIIZ = 0;
        } else if (i == Integer.MAX_VALUE) {
            LJJIIZ = Integer.MAX_VALUE;
        } else {
            LJJIIZ = O6R.LJJIIZ(Math.max(i - min, 0) / f2);
        }
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            InterfaceC274115t interfaceC274115t3 = (InterfaceC274115t) ListProtector.get(list, i9);
            float LJ3 = LJ(LIZIZ(interfaceC274115t3));
            if (LJ3 > 0.0f) {
                if (LJJIIZ != Integer.MAX_VALUE) {
                    i3 = O6R.LJJIIZ(LJJIIZ * LJ3);
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                i7 = Math.max(i7, ((Number) interfaceC88471Ynr.invoke(interfaceC274115t3, Integer.valueOf(i3))).intValue());
            }
        }
        return i7;
    }
}
