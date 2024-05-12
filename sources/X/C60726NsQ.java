package X;

import Y.ARunnableS1S1200100_10;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import defpackage.a1;
import defpackage.b1;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.NsQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60726NsQ extends VNS implements InterfaceC60761Nsz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLLLLLL;
    public static final C62822Ol8 LJLZ;
    public static final boolean LJZ;
    public static final boolean LJZI;
    public static final boolean LJZL;
    public static final C38500F9c LL;
    public String LJLIL;
    public byte[] LJLILLLLZI;
    public final C60606NqU LJLJI;
    public final InterfaceC61488OBg LJLJJI;
    public final AbstractC60673NrZ LJLJJL;
    public final C37953Euz LJLJJLL;
    public C10H LJLJL;
    public final C60728NsS LJLJLJ;
    public Method LJLJLLL;
    public boolean LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;
    public MBA LJLLJ;
    public final C5H3 LJLLL;
    public C60737Nsb LJLLLL;

    static {
        Object LIZ;
        boolean z;
        Object LIZ2;
        boolean z2;
        Object LIZ3;
        TBT tbt = new TBT(C65352Pkq.LIZ(C60726NsQ.class), "scope", "getScope()Lkotlinx/coroutines/CoroutineScope;");
        C65352Pkq.LIZ.getClass();
        boolean z3 = false;
        LJLLLLLL = new InterfaceC74236TBo[]{tbt};
        LL = new C38500F9c();
        LJLZ = C221108m2.LIZIZ(C58312Mua.LJLIL);
        Object obj = null;
        try {
            Object obj2 = ((LinkedHashMap) C39812Fjs.LIZJ).get("unregister_lynx_monitor");
            if (!(obj2 instanceof Boolean)) {
                obj2 = null;
            }
            LIZ = (Boolean) obj2;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Boolean bool = (Boolean) LIZ;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        LJZ = z;
        try {
            Object obj3 = ((LinkedHashMap) C39812Fjs.LIZJ).get("clear_templateArray_when_detached");
            if (!(obj3 instanceof Boolean)) {
                obj3 = null;
            }
            LIZ2 = (Boolean) obj3;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        Boolean bool2 = (Boolean) LIZ2;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        LJZI = z2;
        try {
            Object obj4 = ((LinkedHashMap) C39812Fjs.LIZJ).get("unify_monitor_url");
            if (!(obj4 instanceof Boolean)) {
                obj4 = null;
            }
            LIZ3 = (Boolean) obj4;
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th3) {
            LIZ3 = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ3);
        }
        if (!C3C5.m12isFailureimpl(LIZ3)) {
            obj = LIZ3;
        }
        Boolean bool3 = (Boolean) obj;
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        }
        LJZL = z3;
    }

    @Override // X.InterfaceC60761Nsz
    public final View LIZJ() {
        return this;
    }

    @Override // X.InterfaceC60761Nsz
    public final boolean LJFF() {
        return true;
    }

    public final InterfaceC70422pa getScope() {
        return (InterfaceC70422pa) this.LJLLL.getValue();
    }

    @Override // X.InterfaceC60761Nsz
    public final void LIZIZ() {
        String str = this.LJLIL;
        if (str != null) {
            load(str);
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    @Override // X.InterfaceC60761Nsz
    public java.util.Map<String, Object> getGlobalProps() {
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null) {
            return c60606NqU.LJIL;
        }
        return null;
    }

    @Override // X.InterfaceC60761Nsz
    public final void onHide() {
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null && c60606NqU.LJIIZILJ) {
            C60748Nsm.LIZIZ(getHybridContext());
        } else {
            LJIJ("viewDisappeared", null);
        }
        onEnterBackground();
    }

    @Override // X.InterfaceC60761Nsz
    public final void onShow() {
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null && c60606NqU.LJIIZILJ) {
            C60748Nsm.LIZJ(getHybridContext());
        } else {
            LJIJ("viewAppeared", null);
        }
        onEnterForeground();
    }

    @Override // X.VNS, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (LJZI) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "LynxKitView clear templateArray when detached from window", EnumC39866Fkk.D, null, 4);
            this.LJLILLLLZI = null;
        }
    }

    @Override // X.InterfaceC60761Nsz
    public final void reload() {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        getHybridContext().LJIILIIL(System.currentTimeMillis());
        AbstractC60673NrZ abstractC60673NrZ = this.LJLJJL;
        if (abstractC60673NrZ != null) {
            String str = this.LJLIL;
            if (str == null) {
                str = "";
            }
            abstractC60673NrZ.LJJJJJL(this, str);
        }
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null && (concurrentHashMap = c60606NqU.LJIL) != null) {
            updateData(concurrentHashMap);
        }
        byte[] bArr = this.LJLILLLLZI;
        if (bArr != null) {
            LJIILIIL(this.LJLIL, bArr);
            return;
        }
        String str2 = this.LJLIL;
        if (str2 == null) {
            return;
        }
        load(str2);
    }

    @Override // X.InterfaceC60761Nsz
    public C60737Nsb getHybridContext() {
        return this.LJLLLL;
    }

    public final String getRawUrl() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC60761Nsz
    public final void LIZ(java.util.Map<String, ? extends Object> map) {
        Object LIZ;
        try {
            updateGlobalProps(map);
            C60606NqU c60606NqU = this.LJLJI;
            if (c60606NqU != null) {
                c60606NqU.LIZ(map);
            }
            LJIIIZ("globalPropsUpdated", null);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            c39048FUe.LIZ(C03090Af.LIZJ(LIZ2, "updateGlobalPropsByIncrement failed, error = ", m10exceptionOrNullimpl, LIZ2), EnumC39866Fkk.E, "LynxKit");
        }
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJI(boolean z) {
        HybridSchemaParam hybridSchemaParam;
        Forest forest;
        Forest forest2;
        String str;
        MBA mba = this.LJLLJ;
        if (mba != null) {
            C79146V4k.LJIJ(mba, null);
        }
        this.LJLL = z;
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null && c60606NqU.LJIIZILJ) {
            C60748Nsm.LIZ(getHybridContext());
        }
        C60606NqU c60606NqU2 = this.LJLJI;
        if (c60606NqU2 != null && (str = c60606NqU2.LIZJ) != null && str.length() != 0) {
            java.util.Map<String, Integer> map = C60681Nrh.LIZIZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.get(str) != null) {
                Object obj = linkedHashMap.get(str);
                if (obj != null) {
                    int intValue = ((Number) obj).intValue() - 1;
                    if (intValue <= 0) {
                        ((ConcurrentHashMap) C60681Nrh.LIZ).remove(str);
                        map.remove(str);
                    } else {
                        map.put(str, Integer.valueOf(intValue));
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        C60606NqU c60606NqU3 = this.LJLJI;
        if (c60606NqU3 != null && (hybridSchemaParam = c60606NqU3.LJIILJJIL) != null && hybridSchemaParam.getLockResource()) {
            String str2 = getHybridContext().containerId;
            LL.getClass();
            if (C38500F9c.LIZ().remove(str2) != null) {
                InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(getHybridContext(), null);
                if (!(LIZIZ instanceof C39902FlK)) {
                    LIZIZ = null;
                }
                C39902FlK c39902FlK = (C39902FlK) LIZIZ;
                if (c39902FlK != null && (forest2 = c39902FlK.LIZ) != null) {
                    forest2.closeSession(str2);
                }
            } else if (hybridSchemaParam.getSessionId() != null) {
                java.util.Map LIZ = C38500F9c.LIZ();
                String sessionId = hybridSchemaParam.getSessionId();
                if (sessionId != null) {
                    if (LIZ.containsKey(sessionId)) {
                        java.util.Map LIZ2 = C38500F9c.LIZ();
                        String sessionId2 = hybridSchemaParam.getSessionId();
                        if (sessionId2 != null) {
                            List list = (List) LIZ2.get(sessionId2);
                            if (list != null) {
                                list.remove(str2);
                            }
                            java.util.Map LIZ3 = C38500F9c.LIZ();
                            String sessionId3 = hybridSchemaParam.getSessionId();
                            if (sessionId3 != null) {
                                List list2 = (List) LIZ3.get(sessionId3);
                                if (list2 != null && list2.isEmpty()) {
                                    InterfaceC61488OBg LIZIZ2 = C60905NvJ.LIZIZ(getHybridContext(), null);
                                    if (!(LIZIZ2 instanceof C39902FlK)) {
                                        LIZIZ2 = null;
                                    }
                                    C39902FlK c39902FlK2 = (C39902FlK) LIZIZ2;
                                    if (c39902FlK2 != null && (forest = c39902FlK2.LIZ) != null) {
                                        String sessionId4 = hybridSchemaParam.getSessionId();
                                        if (sessionId4 != null) {
                                            forest.closeSession(sessionId4);
                                        } else {
                                            o.LJIIZILJ();
                                            throw null;
                                        }
                                    }
                                    java.util.Map LIZ4 = C38500F9c.LIZ();
                                    String sessionId5 = hybridSchemaParam.getSessionId();
                                    if (sessionId5 != null) {
                                        LIZ4.remove(sessionId5);
                                    } else {
                                        o.LJIIZILJ();
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        this.LJLJLLL = null;
        C10H c10h = this.LJLJL;
        if (c10h != null) {
            c10h.LIZ();
        }
        super.destroy();
        if (z) {
            this.LJLILLLLZI = null;
        }
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJII(Context context) {
        InterfaceC60614Nqc interfaceC60614Nqc;
        o.LJIIJ(context, "context");
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null && (interfaceC60614Nqc = c60606NqU.LJIILIIL) != null) {
            interfaceC60614Nqc.LJIJ(context);
        }
        C60606NqU c60606NqU2 = this.LJLJI;
        if (c60606NqU2 != null && c60606NqU2.LJIILLIIL) {
            startLynxRuntime();
            C60606NqU c60606NqU3 = this.LJLJI;
            if (c60606NqU3 != null) {
                c60606NqU3.LJIILLIIL = false;
            }
        }
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJIIJJI(SparkSchemaParam sparkSchemaParam) {
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null) {
            c60606NqU.LJIILJJIL = sparkSchemaParam;
        }
        if (!this.LJLLI) {
            Context context = getContext();
            o.LJFF(context, "context");
            String str = this.LJLIL;
            if (str != null) {
                LJIJI(context, getHybridContext(), str);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        if (!this.LJLLILLLL) {
            C60757Nsv.LJ(getHybridContext());
        }
    }

    public final java.util.Map<String, Object> LJIILL(byte[] bArr) {
        TemplateBundle templateBundle;
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null && c60606NqU.LJJIIZ == null && c60606NqU != null) {
            c60606NqU.LJJIIZ = TemplateBundle.LIZ(bArr);
        }
        C60606NqU c60606NqU2 = this.LJLJI;
        if (c60606NqU2 == null || (templateBundle = c60606NqU2.LJJIIZ) == null) {
            return null;
        }
        return templateBundle.LIZIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r6 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v72, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v77, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v83, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence, T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // X.InterfaceC60761Nsz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void load(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60726NsQ.load(java.lang.String):void");
    }

    public void setHybridContext(C60737Nsb c60737Nsb) {
        o.LJIIJ(c60737Nsb, "<set-?>");
        this.LJLLLL = c60737Nsb;
    }

    public final void setRawUrl(String str) {
        this.LJLIL = str;
    }

    @Override // X.VNS, X.InterfaceC60761Nsz
    public final void updateData(java.util.Map<String, ? extends Object> data) {
        o.LJIIJ(data, "data");
        TemplateData LJ = TemplateData.LJ(data);
        LJ.LJFF = true;
        updateData(LJ);
    }

    public static void LIZLLL(O1M o1m, RequestParams requestParams) {
        List<String> list;
        Boolean bool;
        String str;
        String str2;
        C39813Fjt c39813Fjt = C39812Fjs.LIZ;
        Boolean bool2 = null;
        if (c39813Fjt != null) {
            list = c39813Fjt.LJLJI;
            bool = Boolean.valueOf(c39813Fjt.LJLILLLLZI);
        } else {
            list = null;
            bool = null;
        }
        C39813Fjt c39813Fjt2 = C39812Fjs.LIZ;
        if (c39813Fjt2 != null) {
            bool2 = Boolean.valueOf(c39813Fjt2.LJLIL);
        }
        String str3 = "";
        if (o1m == null || !LJIIL(o1m.LJI, list)) {
            str = "";
        } else {
            Boolean bool3 = Boolean.TRUE;
            if (!o.LJ(bool, bool3)) {
                str = "";
            } else {
                OSZ[] oszArr = new OSZ[3];
                oszArr[0] = new OSZ("channel", o1m.LJFF);
                oszArr[1] = new OSZ("bundle", o1m.LJI);
                if (list != null) {
                    str = "";
                    str3 = ORZ.LLD(list, null, null, null, null, 63);
                } else {
                    str = "";
                }
                oszArr[2] = new OSZ("illegalBundleWords", str3);
                FD5.LJII("spark_lynx_illegal_bundle", C113554cx.LJJLIIIIJ(oszArr));
            }
            if (o.LJ(bool2, bool3)) {
                o1m.LJI = str;
            }
        }
        if (requestParams != null && LJIIL(requestParams.getBundle(), list)) {
            Boolean bool4 = Boolean.TRUE;
            if (o.LJ(bool, bool4)) {
                OSZ[] oszArr2 = new OSZ[3];
                String channel = requestParams.getChannel();
                if (channel == null) {
                    channel = str;
                }
                oszArr2[0] = new OSZ("channel", channel);
                String bundle = requestParams.getBundle();
                if (bundle == null) {
                    bundle = str;
                }
                oszArr2[1] = new OSZ("bundle", bundle);
                if (list != null) {
                    str2 = ORZ.LLD(list, null, null, null, null, 63);
                } else {
                    str2 = str;
                }
                oszArr2[2] = new OSZ("illegalBundleWords", str2);
                FD5.LJII("spark_lynx_illegal_bundle", C113554cx.LJJLIIIIJ(oszArr2));
            }
            if (o.LJ(bool2, bool4)) {
                requestParams.setBundle(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIIZZ(java.lang.String r18, X.O1M r19) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60726NsQ.LJIIIIZZ(java.lang.String, X.O1M):java.lang.String");
    }

    public static boolean LJIIL(String str, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str != null && s.LJJJLZIJ(str, str2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJ(String eventName, java.util.Map<String, ? extends Object> map) {
        InterfaceC60614Nqc interfaceC60614Nqc;
        o.LJIIJ(eventName, "eventName");
        C60620Nqi.LIZJ(this, eventName, map);
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null && (interfaceC60614Nqc = c60606NqU.LJIILIIL) != null) {
            interfaceC60614Nqc.LJFF(eventName);
        }
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJIIIZ(String eventName, JSONObject jSONObject) {
        InterfaceC60614Nqc interfaceC60614Nqc;
        o.LJIIJ(eventName, "eventName");
        C60620Nqi.LIZIZ(this, eventName, jSONObject);
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null && (interfaceC60614Nqc = c60606NqU.LJIILIIL) != null) {
            interfaceC60614Nqc.LIZ(eventName, jSONObject);
        }
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJIIJ(String eventName, List<? extends Object> list) {
        JavaOnlyArray javaOnlyArray;
        o.LJIIJ(eventName, "eventName");
        C60620Nqi.LIZ(this, eventName, list);
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null && c60606NqU.LJIIZILJ) {
            if (list != null) {
                javaOnlyArray = JavaOnlyArray.from(list);
            } else {
                javaOnlyArray = new JavaOnlyArray();
            }
            sendGlobalEvent(eventName, javaOnlyArray);
            return;
        }
        LJIJ(eventName, list);
    }

    public final void LJIILIIL(String str, byte[] templateArray) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        HybridSchemaParam hybridSchemaParam;
        String str2;
        o.LJIIJ(templateArray, "templateArray");
        C60606NqU c60606NqU = this.LJLJI;
        if (c60606NqU != null) {
            concurrentHashMap = c60606NqU.LJIL;
        } else {
            concurrentHashMap = null;
        }
        setGlobalProps(TemplateData.LJ(concurrentHashMap));
        this.LJLILLLLZI = templateArray;
        this.LJLIL = str;
        C60728NsS c60728NsS = this.LJLJLJ;
        if (c60728NsS != null && c60728NsS.LJ == null && c60728NsS.LIZJ != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = c60728NsS.LIZJ;
            if (l != null) {
                c60728NsS.LJ = C0EM.LIZIZ(l, currentTimeMillis);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        C60737Nsb hybridContext = getHybridContext();
        ARunnableS1S1200100_10 aRunnableS1S1200100_10 = new ARunnableS1S1200100_10(this, currentTimeMillis2, str, templateArray, 0);
        o.LJIIJ(hybridContext, "hybridContext");
        InterfaceC60710NsA interfaceC60710NsA = hybridContext.hybridParams;
        if (interfaceC60710NsA != null) {
            hybridSchemaParam = interfaceC60710NsA.LIZLLL();
        } else {
            hybridSchemaParam = null;
        }
        boolean LIZIZ = C61325O4z.LIZIZ();
        if (!C60757Nsv.LIZ || hybridSchemaParam == null) {
            aRunnableS1S1200100_10.run();
            return;
        }
        String starlingChannel = hybridSchemaParam.getStarlingChannel();
        if (starlingChannel != null) {
            StringBuilder LIZJ = b1.LIZJ(starlingChannel, "__");
            LIZJ.append(C60757Nsv.LIZIZ(hybridContext));
            str2 = X1D.LIZIZ(LIZJ);
        } else {
            str2 = null;
        }
        boolean starlingFallback = hybridSchemaParam.getStarlingFallback();
        if (str2 == null || !starlingFallback) {
            aRunnableS1S1200100_10.run();
            return;
        }
        InterfaceC61488OBg LIZIZ2 = C60905NvJ.LIZIZ(hybridContext, Boolean.TRUE);
        if (!(LIZIZ2 instanceof C39902FlK)) {
            LIZIZ2 = null;
        }
        C39902FlK c39902FlK = (C39902FlK) LIZIZ2;
        if (c39902FlK == null) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "cannot get resource service", null, "LYNX_I18N", 2);
            aRunnableS1S1200100_10.run();
            return;
        }
        C34K c34k = new C34K();
        c34k.element = false;
        AqS114S0300000_10 aqS114S0300000_10 = new AqS114S0300000_10(c34k, hybridContext, aRunnableS1S1200100_10, 25);
        if (LIZIZ) {
            ((Handler) C61325O4z.LIZ.getValue()).postDelayed(new ARunnableS44S0100000_8(aqS114S0300000_10, 169), C60757Nsv.LIZIZ);
        } else {
            C61325O4z.LIZ().postDelayed(new ARunnableS44S0100000_8(aqS114S0300000_10, 170), C60757Nsv.LIZIZ);
        }
        String LIZ = C60757Nsv.LIZ(str2);
        RequestParams requestParams = new RequestParams(EnumC61028NxI.LYNX_I18N);
        requestParams.setChannel(str2);
        requestParams.setBundle("lang.json");
        requestParams.setFetcherSequence(C61878OQg.INSTANCE);
        requestParams.setEnableRequestReuse(true);
        requestParams.setDisableCdn(true);
        requestParams.setDisableBuiltin(true);
        requestParams.setDisableOffline(true);
        requestParams.setLoadToMemory(true);
        requestParams.setNeedLocalFile(Boolean.FALSE);
        c39902FlK.LIZLLL(LIZ, requestParams, new C60752Nsq(hybridContext, LIZIZ, aqS114S0300000_10));
    }

    public final void LJIJ(String str, List<? extends Object> list) {
        Object LIZ;
        try {
            if (this.LJLJLLL == null) {
                this.LJLJLLL = VNS.class.getDeclaredMethod("triggerEventBus", String.class, List.class);
            }
            Method method = this.LJLJLLL;
            if (method != null) {
                method.setAccessible(true);
            }
            Method method2 = this.LJLJLLL;
            if (method2 != null) {
                LIZ = method2.invoke(this, str, list);
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            C39048FUe.LIZIZ.LIZ("triggerEventBus failed, please make sure lynx version is NOT less than 2.4", EnumC39866Fkk.E, "HybridKit");
        }
    }

    public static boolean LJIJI(Context context, C60737Nsb c60737Nsb, String str) {
        HybridSchemaParam LIZLLL;
        InterfaceC60710NsA interfaceC60710NsA = c60737Nsb.hybridParams;
        if (interfaceC60710NsA == null || (LIZLLL = interfaceC60710NsA.LIZLLL()) == null || LIZLLL.getEnablePrefetch() != 1) {
            return false;
        }
        C61483OBb.LIZJ.getClass();
        InterfaceC39889Fl7 interfaceC39889Fl7 = (InterfaceC39889Fl7) C61484OBc.LIZIZ().LIZIZ(InterfaceC39889Fl7.class, c60737Nsb.bidFrom);
        if (interfaceC39889Fl7 != null) {
            interfaceC39889Fl7.LIZ(context, c60737Nsb, str);
            if (C76800UCe.LIZ != null) {
                FD5.LJIIIZ(c60737Nsb.containerId, "lynx_prefetch", "prefetch", null, str, c60737Nsb.bid, null, null, 200);
                return true;
            }
        }
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IPrefetchService is null, bidFrom = ");
        LIZ.append(c60737Nsb.bidFrom);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
        return false;
    }

    public final void LJIILJJIL(C61295O3v c61295O3v, int i, String str) {
        String c61287O3n = c61295O3v.LL.toString();
        String LJ = a1.LJ(str, ", ", c61287O3n);
        String str2 = getHybridContext().containerId;
        String str3 = getHybridContext().vaid;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = getHybridContext().bid;
        if (str5 != null) {
            str4 = str5;
        }
        FD5.LJIIIIZZ(this, str2, new C61659OHv(i, LJ, str3, str4));
        C39048FUe.LIZIZ.LIZ(LJ, EnumC39866Fkk.E, "LynxKit");
        AbstractC60673NrZ abstractC60673NrZ = this.LJLJJL;
        if (abstractC60673NrZ != null) {
            String url = c61295O3v.LJZI.getUrl();
            C60704Ns4 c60704Ns4 = new C60704Ns4();
            c60704Ns4.LIZ = Integer.valueOf(i);
            c60704Ns4.LIZIZ = LJ;
            c60704Ns4.LIZLLL = c61287O3n;
            abstractC60673NrZ.LJJJJIZL(this, url, c60704Ns4);
        }
        AbstractC60673NrZ abstractC60673NrZ2 = this.LJLJJL;
        if (abstractC60673NrZ2 != null) {
            abstractC60673NrZ2.LJJJJJ(this);
        }
    }

    public final void LJIILLIIL(byte[] bArr, TemplateData templateData, String str, long j) {
        String str2 = getHybridContext().containerId;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        FD5.LIZJ(System.currentTimeMillis(), str2, "prepare_engine_load_start");
        renderTemplateWithBaseUrl(bArr, templateData, str);
        C60728NsS c60728NsS = this.LJLJLJ;
        if (c60728NsS != null) {
            c60728NsS.LJFF = C44847Hit.LIZ(j);
        }
        AbstractC60673NrZ abstractC60673NrZ = this.LJLJJL;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJJ(this);
        }
        String str4 = getHybridContext().containerId;
        if (str4 != null) {
            str3 = str4;
        }
        FD5.LIZJ(System.currentTimeMillis(), str3, "prepare_engine_load_end");
    }

    public final void LJIIZILJ(TemplateBundle templateBundle, TemplateData templateData, String str, long j) {
        if (templateBundle != null) {
            renderTemplateBundle(templateBundle, templateData, str);
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "renderTemplateWithTemplateBundle", null, "PreCodeCache", 2);
            C60728NsS c60728NsS = this.LJLJLJ;
            if (c60728NsS != null) {
                c60728NsS.LJFF = C44847Hit.LIZ(j);
            }
            AbstractC60673NrZ abstractC60673NrZ = this.LJLJJL;
            if (abstractC60673NrZ != null) {
                abstractC60673NrZ.LJJJJJ(this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60726NsQ(Context context, C60737Nsb hybridContext, C60540NpQ c60540NpQ, C60606NqU c60606NqU, C60671NrX c60671NrX) {
        super(context, c60540NpQ);
        InterfaceC60614Nqc interfaceC60614Nqc;
        C39935Flr c39935Flr;
        AbstractC39827Fk7 abstractC39827Fk7;
        java.util.Map<Class<?>, ? extends Object> map;
        PPQ ppq;
        boolean containsKey;
        o.LJIIJ(hybridContext, "hybridContext");
        this.LJLLLL = hybridContext;
        this.LJLJLJ = (C60728NsS) getHybridContext().LIZIZ(C60728NsS.class);
        this.LJLL = true;
        this.LJLLL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS160S0100000_10(this, 526));
        this.LJLJJLL = (C37953Euz) getHybridContext().LIZIZ(C37953Euz.class);
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(getHybridContext(), null);
        this.LJLJJI = LIZIZ;
        this.LJLLILLLL = C60757Nsv.LJ(getHybridContext());
        this.LJLJI = c60606NqU;
        this.LJLIL = String.valueOf(c60606NqU.LJJIIJZLJL);
        this.LJLJJL = c60671NrX;
        C60875Nup c60875Nup = new C60875Nup(this, c60606NqU, LIZIZ);
        c60875Nup.LIZLLL = c60671NrX;
        c60875Nup.LJ = getHybridContext();
        addLynxViewClient(c60875Nup);
        String str = c60606NqU.LJJIIJ;
        if (str != null && str.length() != 0) {
            for (String str2 : s.LJLJJL(str, new String[]{","}, 0, 6)) {
                synchronized (C61590OFe.class) {
                    containsKey = ((HashMap) C61590OFe.LIZ).containsKey(str2);
                }
                if (!containsKey) {
                    AssetManager assets = C39849FkT.LIZ().getAssets();
                    int i = 0;
                    do {
                        Typeface LIZLLL = C61590OFe.LIZLLL(assets, str2, i);
                        if (LIZLLL != null) {
                            C61590OFe.LIZIZ(str2, i, LIZLLL);
                        }
                        i++;
                    } while (i < 4);
                }
            }
        }
        C60538NpO c60538NpO = (C60538NpO) getHybridContext().LIZIZ(C60538NpO.class);
        if (c60538NpO != null) {
            c60538NpO.LIZ = this;
        }
        String monitorId = getHybridContext().containerId;
        o.LJIIJ(monitorId, "monitorId");
        OFH ofh = OFH.LIZLLL;
        COL col = new COL(this, "lynx");
        ofh.getClass();
        OFH.LIZ(monitorId, col);
        C39836FkG.LJII.getClass();
        FD2 fd2 = C38262Ezy.LIZ().LJ;
        if (fd2 != null && (c39935Flr = (C39935Flr) fd2) != null && (abstractC39827Fk7 = c39935Flr.LJI) != null && (map = abstractC39827Fk7.LIZ) != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                Class cls = (Class) entry.getKey();
                Object value = entry.getValue();
                try {
                    C60740Nse lynxKryptonHelper = getLynxKryptonHelper();
                    if (lynxKryptonHelper != null && (ppq = lynxKryptonHelper.LIZ) != null) {
                        ppq.registerService(cls, value);
                    }
                } catch (Throwable unused) {
                    C39048FUe.LIZIZ.LIZ("Krypton Player require Lynx >= 2.10", EnumC39866Fkk.E, "LynxKitView");
                }
            }
        }
        String str3 = this.LJLIL;
        if (str3 != null) {
            this.LJLLI = LJIJI(context, getHybridContext(), str3);
            C31999Ch9.LIZJ.getClass();
            C31999Ch9.LIZ(this);
            C60606NqU c60606NqU2 = this.LJLJI;
            if (c60606NqU2 != null && (interfaceC60614Nqc = c60606NqU2.LJIILIIL) != null) {
                interfaceC60614Nqc.LJI(context, this, this.LJLJJLL);
                interfaceC60614Nqc.LJ(context, this);
            }
            getHybridContext().LJIIL();
            return;
        }
        o.LJIIZILJ();
        throw null;
    }
}
