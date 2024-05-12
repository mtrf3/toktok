package X;

import X.C39414FdS;
import X.C39415FdT;
import X.F5C;
import X.F5E;
import X.F5G;
import X.F5K;
import X.F5M;
import X.F5O;
import X.V9W;
import X.VNU;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ies.bullet.kit.lynx.ILynxKitApi;
import com.bytedance.ies.bullet.kit.lynx.LynxKitApi;
import com.bytedance.ies.bullet.kit.lynx.api.BulletLynxProp;
import com.bytedance.ies.bullet.kit.lynx.api.BulletLynxUIMethod;
import com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.lynx.lynx_adapter.annotation.LynxPropWrapper;
import com.bytedance.ies.lynx.lynx_adapter.annotation.LynxUIMethodWrapper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.zhiliaoapp.musically.R;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS13S0200100_6;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.NlQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60292NlQ extends AbstractC60239NkZ<VNS> implements InterfaceC39443Fdv, InterfaceC60493Nof {
    public final List<InterfaceC38565FBp> LLI;
    public final List<Object> LLIFFJFJJ;
    public final List<InterfaceC60298NlW> LLII;
    public android.net.Uri LLIIII;
    public java.util.Map<String, ? extends Object> LLIIIILZ;
    public InterfaceC31964Cga LLIIIJ;
    public final C60295NlT LLIIIL;
    public final java.util.Map<String, Object> LLIIIZ;
    public volatile byte[] LLIIJI;
    public android.net.Uri LLIIJLIL;
    public long LLIIL;
    public long LLIILII;
    public long LLIILZL;
    public long LLIIZ;
    public long LLIL;
    public boolean LLILII;

    @Override // X.InterfaceC60212Nk8
    public final void LIZIZ() {
    }

    @Override // X.AbstractC60240Nka
    public final void LJIIJ(List packageNames, C60251Nkl c60251Nkl) {
        o.LJIIJ(packageNames, "packageNames");
    }

    @Override // X.AbstractC60240Nka
    public final void LJIIJJI() {
        this.LLIIJI = null;
        InterfaceC60187Njj LJIJ = LJIJ();
        if (LJIJ != null) {
            LJIJ.LJIIJJI(this.LLIIIL);
        }
        C60297NlV c60297NlV = C60297NlV.LIZLLL;
        C60498Nok c60498Nok = (C60498Nok) ((WeakHashMap) c60297NlV.LIZIZ).remove(this);
        if (c60498Nok != null) {
            Iterator<C60318Nlq> it = c60498Nok.LIZIZ.iterator();
            while (it.hasNext()) {
                c60498Nok.LJ.remove(it.next());
            }
            c60498Nok.LIZIZ.clear();
            HashMap<String, Object> hashMap = c60498Nok.LIZLLL;
            if (hashMap != null) {
                hashMap.clear();
            }
            Iterator<C60498Nok> it2 = c60297NlV.LIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next() == c60498Nok) {
                    it2.remove();
                    break;
                }
            }
        }
        InterfaceC31964Cga interfaceC31964Cga = this.LLIIIJ;
        if (interfaceC31964Cga != null) {
            interfaceC31964Cga.destroy();
        }
        OFH ofh = OFH.LIZLLL;
        String str = this.LLF.LIZ;
        ofh.getClass();
        OFH.LJII(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynxview was destroy, currentUri: ");
        LIZ.append(this.LLIIII);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
    }

    @Override // X.AbstractC60239NkZ
    public final void LJIILLIIL() {
        Iterator it = ((ArrayList) this.LLFF).iterator();
        while (it.hasNext()) {
            ((VNS) ((C60213Nk9) it.next()).LIZIZ).onEnterBackground();
        }
    }

    @Override // X.AbstractC60239NkZ
    public final void LJIIZILJ() {
        Iterator it = ((ArrayList) this.LLFF).iterator();
        while (it.hasNext()) {
            ((VNS) ((C60213Nk9) it.next()).LIZIZ).onEnterForeground();
        }
    }

    @Override // X.InterfaceC60493Nof
    public final void LJIJJLI() {
        Context context = (Context) this.LLF.LIZJ(Context.class);
        if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
            ((Activity) context).finish();
        }
    }

    public final C59896Nf2 LJIL() {
        AbstractC59475NVv abstractC59475NVv = this.LJLLI;
        if (abstractC59475NVv != null) {
            return (C59896Nf2) abstractC59475NVv;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.AbstractC60239NkZ, X.AbstractC60240Nka
    public final void LJIIIZ() {
        super.LJIIIZ();
        InterfaceC60187Njj LJIJ = LJIJ();
        if (LJIJ != null) {
            LJIJ.LIZ(this.LLIIIL);
        }
    }

    @Override // X.InterfaceC40516FvE
    public final android.net.Uri rk() {
        return this.LLIIII;
    }

    @Override // X.InterfaceC60493Nof
    public final void LIZ(VNS vns) {
        ViewGroup viewGroup;
        C60213Nk9 c60213Nk9 = (C60213Nk9) ORZ.LJLLLL(this.LLFF);
        if (c60213Nk9 != null && (viewGroup = (ViewGroup) c60213Nk9.LIZIZ) != null) {
            viewGroup.addView(vns);
        }
    }

    @Override // X.InterfaceC60212Nk8
    public final void LIZJ(C60213Nk9<VNS> viewComponent) {
        o.LJIIJ(viewComponent, "viewComponent");
        C59439NUl c59439NUl = (C59439NUl) LJIL().LJIILIIL.getValue();
        if (c59439NUl != null) {
            Integer valueOf = Integer.valueOf(c59439NUl.LJLIL);
            if (valueOf.intValue() != -2) {
                viewComponent.LIZIZ.setBackgroundColor(valueOf.intValue());
            }
        }
    }

    @Override // X.InterfaceC60493Nof
    public final void LJ(VNS vns) {
        ViewGroup viewGroup;
        C60213Nk9 c60213Nk9 = (C60213Nk9) ORZ.LJLLLL(this.LLFF);
        if (c60213Nk9 != null && (viewGroup = (ViewGroup) c60213Nk9.LIZIZ) != null) {
            if (C78996UzQ.LJJIIJZLJL(vns)) {
                C78996UzQ.LJI();
            }
            viewGroup.removeView(vns);
        }
    }

    @Override // X.AbstractC60239NkZ
    public final void LJIILL(AqS141S0200000_10 aqS141S0200000_10) {
        boolean z;
        boolean z2;
        boolean z3;
        C60682Nri LIZ;
        C60537NpN c60537NpN;
        VNS vns;
        long currentTimeMillis = System.currentTimeMillis();
        C59896Nf2 LJIL = LJIL();
        F3T f3t = this.LLF;
        f3t.getClass();
        F3T f3t2 = new F3T();
        f3t2.LIZIZ(f3t);
        f3t2.LJ(InterfaceC38196Eyu.class, new C60314Nlm(this, C60313Nll.LJLIL));
        C60541NpR c60541NpR = new C60541NpR(null);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.LLI).iterator();
        while (it.hasNext()) {
            List<?> LIZ2 = ((InterfaceC38565FBp) it.next()).LIZ();
            if (LIZ2 == null) {
                LIZ2 = C61878OQg.INSTANCE;
            }
            if (true ^ LIZ2.isEmpty()) {
                if (ListProtector.get(LIZ2, 0) instanceof C40197Fq5) {
                    arrayList.addAll(LIZ2);
                } else if (ListProtector.get(LIZ2, 0) instanceof F5G) {
                    for (Object obj : LIZ2) {
                        if (obj != null) {
                            final F5G f5g = (F5G) obj;
                            arrayList.add(new C40197Fq5() { // from class: com.bytedance.ies.bullet.lynx_adapter_impl.LynxBehaviorFactory$createLynxBehavior$1
                                @Override // X.C40197Fq5
                                public final V9W LIZ() {
                                    F5G.this.getClass();
                                    return null;
                                }

                                @Override // X.C40197Fq5
                                public final ShadowNode LIZJ() {
                                    F5G.this.getClass();
                                    return new ShadowNode() { // from class: com.bytedance.ies.bullet.lynx_adapter_impl.LynxBehaviorFactoryKt$transform$2
                                    };
                                }

                                {
                                    super(null, false);
                                }

                                @Override // X.C40197Fq5
                                public final LynxFlattenUI LIZIZ(VNU vnu) {
                                    F5G.this.getClass();
                                    return null;
                                }

                                @Override // X.C40197Fq5
                                public final LynxUI<?> LIZLLL(VNU context) {
                                    o.LJIIJ(context, "context");
                                    F5G f5g2 = F5G.this;
                                    new C39414FdS(context.getBaseContext());
                                    F5E LIZ3 = f5g2.LIZ();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    Method[] declaredMethods = LIZ3.getClass().getDeclaredMethods();
                                    o.LJFF(declaredMethods, "this.javaClass.declaredMethods");
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Method it2 : declaredMethods) {
                                        o.LJFF(it2, "it");
                                        Annotation[] annotations = it2.getAnnotations();
                                        o.LJFF(annotations, "it.annotations");
                                        for (Annotation annotation : annotations) {
                                            if ((annotation instanceof LynxPropWrapper) || (annotation instanceof LynxUIMethodWrapper)) {
                                                arrayList2.add(it2);
                                                break;
                                            }
                                        }
                                    }
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        Method method = (Method) it3.next();
                                        o.LJFF(method, "method");
                                        Annotation[] annotations2 = method.getAnnotations();
                                        o.LJFF(annotations2, "method.annotations");
                                        int length = annotations2.length;
                                        int i = 0;
                                        while (true) {
                                            if (i >= length) {
                                                break;
                                            }
                                            Annotation annotation2 = annotations2[i];
                                            if (annotation2 instanceof LynxPropWrapper) {
                                                if (annotation2 != null) {
                                                    linkedHashMap.put(((LynxPropWrapper) annotation2).name(), method);
                                                }
                                            } else {
                                                i++;
                                            }
                                        }
                                        Annotation[] annotations3 = method.getAnnotations();
                                        o.LJFF(annotations3, "method.annotations");
                                        int length2 = annotations3.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < length2) {
                                                Annotation annotation3 = annotations3[i2];
                                                if (annotation3 instanceof LynxUIMethodWrapper) {
                                                    if (annotation3 != null) {
                                                        method.getName();
                                                        throw null;
                                                    }
                                                } else {
                                                    i2++;
                                                }
                                            }
                                        }
                                    }
                                    LIZ3.LIZIZ = new F5C(LIZ3, linkedHashMap);
                                    new LynxBehaviorFactoryKt$transform$3(LIZ3, context, context);
                                    throw null;
                                }
                            });
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.lynx.lynx_adapter.wrapper.LynxBehaviorWrapper");
                        }
                    }
                } else if (ListProtector.get(LIZ2, 0) instanceof F5O) {
                    for (Object obj2 : LIZ2) {
                        if (obj2 != null) {
                            final F5O f5o = (F5O) obj2;
                            arrayList.add(new C40197Fq5() { // from class: com.bytedance.ies.bullet.kit.lynx.model.LynxBehaviorFactory$createLynxBehavior$1
                                @Override // X.C40197Fq5
                                public final V9W LIZ() {
                                    F5O.this.getClass();
                                    return null;
                                }

                                @Override // X.C40197Fq5
                                public final ShadowNode LIZJ() {
                                    F5O.this.getClass();
                                    return new ShadowNode() { // from class: com.bytedance.ies.bullet.kit.lynx.model.LynxBehaviorFactoryKt$transform$2
                                    };
                                }

                                {
                                    super(null, false);
                                }

                                @Override // X.C40197Fq5
                                public final LynxFlattenUI LIZIZ(VNU vnu) {
                                    F5O.this.getClass();
                                    return null;
                                }

                                @Override // X.C40197Fq5
                                public final LynxUI<?> LIZLLL(VNU context) {
                                    o.LJIIJ(context, "context");
                                    F5O f5o2 = F5O.this;
                                    new C39415FdT(context.getBaseContext());
                                    F5M LIZ3 = f5o2.LIZ();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    Method[] declaredMethods = LIZ3.getClass().getDeclaredMethods();
                                    o.LJFF(declaredMethods, "this.javaClass.declaredMethods");
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Method it2 : declaredMethods) {
                                        o.LJFF(it2, "it");
                                        Annotation[] annotations = it2.getAnnotations();
                                        o.LJFF(annotations, "it.annotations");
                                        for (Annotation annotation : annotations) {
                                            if ((annotation instanceof BulletLynxProp) || (annotation instanceof BulletLynxUIMethod)) {
                                                arrayList2.add(it2);
                                                break;
                                            }
                                        }
                                    }
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        Method method = (Method) it3.next();
                                        o.LJFF(method, "method");
                                        Annotation[] annotations2 = method.getAnnotations();
                                        o.LJFF(annotations2, "method.annotations");
                                        int length = annotations2.length;
                                        int i = 0;
                                        while (true) {
                                            if (i >= length) {
                                                break;
                                            }
                                            Annotation annotation2 = annotations2[i];
                                            if (annotation2 instanceof BulletLynxProp) {
                                                if (annotation2 != null) {
                                                    linkedHashMap.put(((BulletLynxProp) annotation2).name(), method);
                                                }
                                            } else {
                                                i++;
                                            }
                                        }
                                        Annotation[] annotations3 = method.getAnnotations();
                                        o.LJFF(annotations3, "method.annotations");
                                        int length2 = annotations3.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < length2) {
                                                Annotation annotation3 = annotations3[i2];
                                                if (annotation3 instanceof BulletLynxUIMethod) {
                                                    if (annotation3 != null) {
                                                        method.getName();
                                                        throw null;
                                                    }
                                                } else {
                                                    i2++;
                                                }
                                            }
                                        }
                                    }
                                    LIZ3.LIZIZ = new F5K(LIZ3, linkedHashMap);
                                    new LynxBehaviorFactoryKt$transform$3(LIZ3, context, context);
                                    throw null;
                                }
                            });
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.lynx.api.LynxBehaviorWrapper");
                        }
                    }
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("not supported type ");
                    LIZ3.append(LIZ2);
                    C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ3), null, null, 6);
                }
            }
        }
        c60541NpR.LJLLJ = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bridge", new C31970Cgg((Class<? extends LynxModule>) LynxBridgeModule.class, f3t2));
        if (this.LLF.LIZJ(C60411NnL.class) != null) {
            linkedHashMap.putAll(null);
        }
        c60541NpR.LJLLILLLL = linkedHashMap;
        c60541NpR.LJLJI = (Integer) LJIL.LJJLIIIIJ.getValue();
        c60541NpR.LJLJJL = (Integer) LJIL.LJJJLZIJ.getValue();
        c60541NpR.LJLJJI = (Integer) LJIL.LJJJZ.getValue();
        Integer value = LJIL.LJJLI.getValue();
        Integer num = value;
        if (num != null && num.intValue() == 0) {
            value = null;
        }
        Integer num2 = value;
        if (num2 != null) {
            int intValue = num2.intValue();
            C60303Nlb c60303Nlb = new C60303Nlb();
            c60303Nlb.LIZ = LJIL.LJJL.getValue();
            c60303Nlb.LIZIZ = Integer.valueOf(intValue);
            c60541NpR.LJLLLL = c60303Nlb;
        }
        String str = (String) LJIL.LJJJJLI.getValue();
        new C60319Nlr();
        c60541NpR.LJLJLJ = TemplateData.LJFF(str);
        c60541NpR.LJLLLLLL = (String) LJIL.LJJLIIIJ.getValue();
        c60541NpR.LJLJJLL = LJIL.LJJLIIIJJI.getValue();
        Boolean value2 = LJIL.LJJLIIIJLJLI.getValue();
        if (value2 != null) {
            z = value2.booleanValue();
        } else {
            z = false;
        }
        c60541NpR.LJLJLLL = z;
        java.util.Map<String, ? extends Object> map = this.LLIIIILZ;
        if (map != null) {
            c60541NpR.LJLL.putAll(map);
        }
        ((ArrayList) c60541NpR.LJLLI).add(new C60293NlR(this));
        Zf().getExtra().LIZIZ(C60541NpR.class, c60541NpR);
        Object value3 = LJIL.LJJJJJ.getValue();
        if (value3 != null) {
            String str2 = (String) value3;
            Boolean value4 = LJIL.LJJJJJL.getValue();
            if (value4 != null) {
                z2 = value4.booleanValue();
            } else {
                z2 = true;
            }
            Boolean value5 = LJIL.LJJJJL.getValue();
            if (value5 != null) {
                z3 = value5.booleanValue();
            } else {
                z3 = false;
            }
            InterfaceC60284NlI interfaceC60284NlI = (InterfaceC60284NlI) C60299NlX.LIZ(this, InterfaceC60284NlI.class);
            if (interfaceC60284NlI != null) {
                interfaceC60284NlI.LJIIL();
            }
            c60541NpR.LJLILLLLZI = str2;
            if (z2) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C58311MuZ.LIZ;
                LIZ = (C60682Nri) concurrentHashMap.get(str2);
                java.util.Map<String, Integer> map2 = C58311MuZ.LIZIZ;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                Object obj3 = linkedHashMap2.get(str2);
                if (obj3 == null) {
                    obj3 = 0;
                    linkedHashMap2.put(str2, obj3);
                }
                map2.put(str2, Integer.valueOf(((Number) obj3).intValue() + 1));
                if (LIZ == null) {
                    LIZ = C60682Nri.LIZ(str2, z3);
                    concurrentHashMap.put(str2, LIZ);
                }
            } else {
                LIZ = C60682Nri.LIZ(str2, z3);
            }
            c60541NpR.LJLIL = LIZ;
            InterfaceC60316Nlo interfaceC60316Nlo = (InterfaceC60316Nlo) C60299NlX.LIZ(this, InterfaceC60316Nlo.class);
            if (interfaceC60316Nlo != null) {
                c60537NpN = interfaceC60316Nlo.LJIJI(this);
            } else {
                c60537NpN = null;
            }
            this.LLIIIJ = c60537NpN;
            if (c60537NpN != null && (vns = c60537NpN.LIZIZ) != null) {
                f3t2.LJ(VNS.class, new F26(vns));
                F3T f3t3 = this.LLF;
                f3t3.getClass();
                f3t3.LJ(VNS.class, new F26(vns));
                vns.setTag(R.id.b11, "bullet");
                OFH ofh = OFH.LIZLLL;
                String str3 = this.LLF.LIZ;
                ofh.getClass();
                OFH.LIZJ(str3, "container_name", "bullet");
                OFH.LIZ(this.LLF.LIZ, new COL(vns, "lynx"));
                C60297NlV c60297NlV = C60297NlV.LIZLLL;
                c60297NlV.getClass();
                C60498Nok c60498Nok = new C60498Nok(this, c60297NlV.LIZJ);
                c60498Nok.LIZJ = new WeakReference<>(vns);
                c60297NlV.LIZ.push(c60498Nok);
                ((WeakHashMap) c60297NlV.LIZIZ).put(this, c60498Nok);
                aqS141S0200000_10.invoke(C47261Igj.LJJIJ(new C60213Nk9(vns)));
                C39973FmT.LIZIZ(this, "create and add view component success", null, null, 6);
                this.LLIL = System.currentTimeMillis() - currentTimeMillis;
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.lynx.tasm.LynxView");
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.AbstractC60239NkZ, X.AbstractC60240Nka, X.InterfaceC40516FvE
    public void onEvent(F22 event) {
        java.util.Map LIZJ;
        String str;
        String valueOf;
        o.LJIIJ(event, "event");
        TemplateData templateData = null;
        if (o.LJ(event.getName(), "__updateData")) {
            Object params = event.getParams();
            if (params != null) {
                if ((params instanceof CharSequence) || (params instanceof JSONObject) || (params instanceof JSONArray)) {
                    valueOf = String.valueOf(params);
                } else if (params instanceof ReadableMap) {
                    C38378F4k.LIZ.getClass();
                    valueOf = String.valueOf(C38378F4k.LIZLLL((ReadableMap) params));
                } else if (params instanceof ReadableArray) {
                    C38378F4k.LIZ.getClass();
                    valueOf = String.valueOf(C38378F4k.LIZJ((ReadableArray) params));
                } else {
                    return;
                }
                if (valueOf != null) {
                    Iterator it = ((ArrayList) this.LLFF).iterator();
                    while (it.hasNext()) {
                        ((VNS) ((C60213Nk9) it.next()).LIZIZ).updateData(valueOf);
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (o.LJ(event.getName(), "__updateGlobalProps") && this.LLIIIILZ != null) {
            Object params2 = event.getParams();
            if (params2 != null && (params2 instanceof java.util.Map)) {
                java.util.Map map = (java.util.Map) params2;
                if (map.isEmpty()) {
                    C39973FmT.LIZIZ(this, "updateGlobalProps failed as diffProps is emtpy", null, null, 6);
                    return;
                }
                java.util.Map<String, ? extends Object> map2 = this.LLIIIILZ;
                if (map2 != null && C65777Prh.LJII(map2) && (LIZJ = C65777Prh.LIZJ(map2)) != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        if (key != null && (key instanceof String) && (str = (String) key) != null && str.length() > 0 && entry.getValue() != null) {
                            StringBuilder LIZIZ = C25620zW.LIZIZ("update globalProps item key: ", str, " from oldValue: ");
                            LIZIZ.append(LIZJ.get(str));
                            LIZIZ.append(" to newValue: ");
                            LIZIZ.append(entry.getValue());
                            C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZIZ), null, null, 6);
                            Object value = entry.getValue();
                            if (value != null) {
                                LIZJ.put(str, value);
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        }
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                java.util.Map<String, ? extends Object> map3 = this.LLIIIILZ;
                if (map3 != null) {
                    linkedHashMap.put("__globalProps", map3);
                    Iterator it2 = ((ArrayList) this.LLFF).iterator();
                    while (it2.hasNext()) {
                        ((VNS) ((C60213Nk9) it2.next()).LIZIZ).updateData(linkedHashMap);
                    }
                    return;
                }
                o.LJIIZILJ();
                throw null;
            }
            return;
        }
        if (o.LJ("__updateTemplateData", event.getName())) {
            Object params3 = event.getParams();
            if (params3 != null && (params3 instanceof IIQ)) {
                templateData = TemplateData.LJ(((IIQ) params3).LIZ);
            }
            Iterator it3 = ((ArrayList) this.LLFF).iterator();
            while (it3.hasNext()) {
                ((VNS) ((C60213Nk9) it3.next()).LIZIZ).updateData(templateData);
            }
            return;
        }
        Iterator it4 = ((ArrayList) this.LLFF).iterator();
        while (it4.hasNext()) {
            VNS vns = (VNS) ((C60213Nk9) it4.next()).LIZIZ;
            String name = event.getName();
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            JSONObject jSONObject = new JSONObject();
            Object params4 = event.getParams();
            if (params4 != null) {
                if ((params4 instanceof CharSequence) || (params4 instanceof JSONObject) || (params4 instanceof JSONArray)) {
                    jSONObject.put("data", params4);
                } else if (params4 instanceof ReadableMap) {
                    C38378F4k.LIZ.getClass();
                    jSONObject.put("data", C38378F4k.LIZLLL((ReadableMap) params4));
                } else if (params4 instanceof ReadableArray) {
                    C38378F4k.LIZ.getClass();
                    jSONObject.put("data", C38378F4k.LIZJ((ReadableArray) params4));
                } else {
                    jSONObject.put("data", new JSONObject());
                }
            }
            C60312Nlk c60312Nlk = new C60312Nlk(this.LLD.LJLIL);
            jSONObject.put("containerID", c60312Nlk.LJLIL);
            jSONObject.put("protocolVersion", c60312Nlk.LJLILLLLZI);
            C38378F4k.LIZ.getClass();
            javaOnlyArray.pushMap(C38378F4k.LIZIZ(jSONObject));
            vns.sendGlobalEvent(name, javaOnlyArray);
        }
    }

    @Override // X.InterfaceC60493Nof
    public final void LIZLLL(C60318Nlq c60318Nlq, C60494Nog c60494Nog) {
        InterfaceC60304Nlc interfaceC60304Nlc;
        try {
            if (c60318Nlq.LIZIZ != null) {
                if (this.LLF.LIZJ(C51587KMl.class) != null) {
                    InterfaceC60302Nla Zf = Zf();
                    Object LIZJ = this.LLF.LIZJ(C51587KMl.class);
                    if (LIZJ != null) {
                        Zf.LLLIILIL(C51587KMl.class, LIZJ);
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                InterfaceC60281NlF interfaceC60281NlF = this.LJLJJL;
                if (interfaceC60281NlF != null) {
                    if ((interfaceC60281NlF instanceof InterfaceC60304Nlc) && (interfaceC60304Nlc = (InterfaceC60304Nlc) interfaceC60281NlF) != null) {
                        interfaceC60304Nlc.LJ(this.LLF);
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("create lynxview failed with e:");
            LIZ.append(String.valueOf(e.getMessage()));
            C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
            c60494Nog.onFailed();
        }
    }

    @Override // X.AbstractC60240Nka
    public final void LJFF(android.net.Uri uri, InterfaceC88472Yns reject) {
        o.LJIIJ(uri, "uri");
        o.LJIIJ(reject, "reject");
        System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60240Nka
    public final void LJIIL(boolean z, android.net.Uri input) {
        boolean z2;
        String str;
        JSONObject jSONObject;
        Object obj;
        java.util.Map<String, Object> LJFF;
        o.LJIIJ(input, "input");
        OFH ofh = OFH.LIZLLL;
        String str2 = this.LLF.LIZ;
        String uri = input.toString();
        o.LJFF(uri, "input.toString()");
        ofh.getClass();
        OFH.LIZJ(str2, "schema", uri);
        boolean z3 = false;
        if (this.LLIIII == null || (!o.LJ(r0, input))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLIIII = input;
        JSONObject jSONObject2 = null;
        C39973FmT.LIZIZ(this, "start to load lynxview", null, null, 6);
        if (z2) {
            if (!this.LLIIIZ.isEmpty()) {
                ((LinkedHashMap) this.LLIIIZ).clear();
            }
            java.util.Map<String, Object> map = this.LLIIIZ;
            map.put("bullet_version", "2.1.4-rc.37-tiktok");
            Iterator it = ((ArrayList) this.LJLJL).iterator();
            while (it.hasNext()) {
                InterfaceC60282NlG interfaceC60282NlG = (InterfaceC60282NlG) it.next();
                if (interfaceC60282NlG != null) {
                    java.util.Map<String, Object> LJFF2 = ((InterfaceC39446Fdy) interfaceC60282NlG).LJFF(this, this.LLF);
                    if (LJFF2 != null) {
                        map.putAll(LJFF2);
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.lynx.ILynxKitSettingsProvider");
                }
            }
            InterfaceC60282NlG interfaceC60282NlG2 = this.LJLJJI;
            if (!(interfaceC60282NlG2 instanceof InterfaceC39446Fdy)) {
                interfaceC60282NlG2 = null;
            }
            InterfaceC39446Fdy interfaceC39446Fdy = (InterfaceC39446Fdy) interfaceC60282NlG2;
            if (interfaceC39446Fdy != null && (LJFF = interfaceC39446Fdy.LJFF(this, this.LLF)) != null) {
                map.putAll(LJFF);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LLIIIZ);
        C60549NpZ c60549NpZ = this.LJLLLLLL;
        if (c60549NpZ != null) {
            str = c60549NpZ.LIZIZ();
        } else {
            str = "";
        }
        linkedHashMap.put("resolvedUrl", str);
        Iterator it2 = ((ArrayList) this.LLFF).iterator();
        while (it2.hasNext()) {
            C60213Nk9<VNS> c60213Nk9 = (C60213Nk9) it2.next();
            c60213Nk9.LIZIZ(input);
            byte[] bArr = this.LLIIJI;
            if (bArr != null) {
                String str3 = (String) LJIL().LJJJJLI.getValue();
                if (str3 != null) {
                    jSONObject = new JSONObject(str3);
                } else {
                    jSONObject = jSONObject2;
                }
                TemplateData templateData = (TemplateData) this.LLF.LIZJ(TemplateData.class);
                InterfaceC60284NlI interfaceC60284NlI = (InterfaceC60284NlI) C60299NlX.LIZ(this, InterfaceC60284NlI.class);
                if (interfaceC60284NlI != null) {
                    interfaceC60284NlI.LJIIL();
                }
                C60319Nlr c60319Nlr = (C60319Nlr) this.LLF.LIZJ(C60319Nlr.class);
                C60319Nlr c60319Nlr2 = c60319Nlr;
                if (c60319Nlr == null) {
                    IIQ iiq = (IIQ) this.LLF.LIZJ(IIQ.class);
                    if (iiq == null) {
                        Boolean valueOf = Boolean.valueOf(z3);
                        if (valueOf.booleanValue() && jSONObject != null) {
                            valueOf.booleanValue();
                            String valueOf2 = String.valueOf(jSONObject);
                            C60319Nlr c60319Nlr3 = new C60319Nlr();
                            c60319Nlr3.LIZ = TemplateData.LJFF(valueOf2);
                            c60319Nlr2 = c60319Nlr3;
                        } else {
                            c60319Nlr2 = jSONObject2;
                        }
                    } else {
                        java.util.Map<String, Object> map2 = iiq.LIZ;
                        C60319Nlr c60319Nlr4 = new C60319Nlr();
                        Object LIZ = C75262xO.LIZ(map2);
                        if (!(LIZ instanceof java.util.Map)) {
                            LIZ = jSONObject2;
                        }
                        c60319Nlr4.LIZ = TemplateData.LJ((java.util.Map) LIZ);
                        c60319Nlr2 = c60319Nlr4;
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                C60312Nlk c60312Nlk = new C60312Nlk(this.LLD.LJLIL);
                linkedHashMap2.put("containerID", c60312Nlk.LJLIL);
                linkedHashMap2.put("protocolVersion", c60312Nlk.LJLILLLLZI);
                LJJ(input, linkedHashMap2);
                for (Map.Entry entry : C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap).entrySet()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                String str4 = (String) LJIL().LJJJJZ.getValue();
                if (str4 != null && str4.length() > 0) {
                    this.LLF.LIZJ(C60218NkE.class);
                }
                if (c60319Nlr2 != 0) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("containerID", this.LLD.LJLIL);
                    linkedHashMap3.put("protocolVersion", "1.0");
                    LJJ(input, linkedHashMap3);
                    for (Map.Entry entry2 : C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap).entrySet()) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                    LJJII(c60213Nk9, linkedHashMap3);
                    LJJI(c60213Nk9, bArr, c60319Nlr2.LIZ, z);
                } else if (jSONObject != null) {
                    LJJII(c60213Nk9, linkedHashMap2);
                    LJJIFFI(c60213Nk9, bArr, jSONObject, z);
                } else if (templateData != null) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    linkedHashMap4.put("containerID", this.LLD.LJLIL);
                    linkedHashMap4.put("protocolVersion", "1.0");
                    LJJ(input, linkedHashMap4);
                    for (Map.Entry entry3 : C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap).entrySet()) {
                        linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                    }
                    InterfaceC60284NlI interfaceC60284NlI2 = (InterfaceC60284NlI) C60299NlX.LIZ(this, InterfaceC60284NlI.class);
                    if (interfaceC60284NlI2 != null) {
                        interfaceC60284NlI2.LJIIL();
                    }
                    LJJII(c60213Nk9, linkedHashMap4);
                    LJJI(c60213Nk9, bArr, templateData, z);
                } else {
                    InterfaceC60260Nku interfaceC60260Nku = (InterfaceC60260Nku) C60299NlX.LIZ(this, InterfaceC60260Nku.class);
                    if (interfaceC60260Nku != null) {
                        obj = interfaceC60260Nku.LJJIIJ(input);
                    } else {
                        obj = null;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    if (obj != null) {
                        jSONObject3.put("prefetchInitData", obj);
                    }
                    C60549NpZ c60549NpZ2 = this.LJLLLLLL;
                    if (c60549NpZ2 != null) {
                        android.net.Uri uri2 = UriProtector.parse(c60549NpZ2.LIZIZ());
                        InterfaceC60260Nku interfaceC60260Nku2 = (InterfaceC60260Nku) C60299NlX.LIZ(this, InterfaceC60260Nku.class);
                        if (interfaceC60260Nku2 != null) {
                            o.LJFF(uri2, "uri");
                            Object LJJIIJ = interfaceC60260Nku2.LJJIIJ(uri2);
                            if (LJJIIJ != null) {
                                jSONObject3.put("localInitData", LJJIIJ);
                            }
                        }
                    }
                    LJJII(c60213Nk9, linkedHashMap2);
                    LJJIFFI(c60213Nk9, bArr, jSONObject3, z);
                }
                if (z) {
                    c60213Nk9.LIZJ(input);
                }
            }
            z3 = false;
            jSONObject2 = null;
        }
        this.LLIIII = input;
    }

    @Override // X.AbstractC60240Nka
    public final void LJIILJJIL(List<String> packageNames, InterfaceC60246Nkg kitPackageRegistryBundle) {
        InterfaceC60304Nlc interfaceC60304Nlc;
        o.LJIIJ(packageNames, "packageNames");
        o.LJIIJ(kitPackageRegistryBundle, "kitPackageRegistryBundle");
        super.LJIILJJIL(packageNames, kitPackageRegistryBundle);
        ((ArrayList) this.LLI).clear();
        ((ArrayList) this.LLII).clear();
        ((ArrayList) this.LLIFFJFJJ).clear();
        Iterator it = ((ArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            InterfaceC60281NlF interfaceC60281NlF = (InterfaceC60281NlF) it.next();
            if (interfaceC60281NlF != null) {
                InterfaceC60304Nlc interfaceC60304Nlc2 = (InterfaceC60304Nlc) interfaceC60281NlF;
                InterfaceC60298NlW LIZJ = interfaceC60304Nlc2.LIZJ(this.LLF);
                if (LIZJ != null) {
                    ((ArrayList) this.LLII).add(LIZJ);
                }
                InterfaceC38565FBp LIZLLL = interfaceC60304Nlc2.LIZLLL(this.LLF);
                if (LIZLLL != null) {
                    ((ArrayList) this.LLI).add(LIZLLL);
                }
                interfaceC60304Nlc2.LIZ(this.LLF);
                interfaceC60304Nlc2.LIZIZ(this.LLF);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.lynx.ILynxKitDelegatesProvider");
            }
        }
        InterfaceC60281NlF interfaceC60281NlF2 = this.LJLJJL;
        if (interfaceC60281NlF2 != null && (interfaceC60281NlF2 instanceof InterfaceC60304Nlc) && (interfaceC60304Nlc = (InterfaceC60304Nlc) interfaceC60281NlF2) != null) {
            InterfaceC60298NlW LIZJ2 = interfaceC60304Nlc.LIZJ(this.LLF);
            if (LIZJ2 != null) {
                ((ArrayList) this.LLII).add(LIZJ2);
            }
            InterfaceC38565FBp LIZLLL2 = interfaceC60304Nlc.LIZLLL(this.LLF);
            if (LIZLLL2 != null) {
                ((ArrayList) this.LLI).add(LIZLLL2);
            }
            interfaceC60304Nlc.LIZ(this.LLF);
            interfaceC60304Nlc.LIZIZ(this.LLF);
        }
        Object LIZJ3 = this.LLF.LIZJ(InterfaceC60298NlW.class);
        if (LIZJ3 != null) {
            ((ArrayList) this.LLII).add(LIZJ3);
        }
    }

    public final void LJJ(android.net.Uri uri, java.util.Map map) {
        String str;
        Long l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        o.LJFF(queryParameterNames, "input.queryParameterNames");
        for (String it : queryParameterNames) {
            o.LJFF(it, "it");
            linkedHashMap.put(it, UriProtector.getQueryParameter(uri, it));
        }
        C60203Njz c60203Njz = (C60203Njz) this.LLF.LIZJ(C60203Njz.class);
        if (c60203Njz != null && (l = c60203Njz.LIZIZ) != null) {
            str = String.valueOf(l.longValue());
        } else {
            str = null;
        }
        linkedHashMap.put("containerInitTime", str);
        map.put("queryItems", linkedHashMap);
    }

    public final void LJJII(C60213Nk9<VNS> c60213Nk9, java.util.Map<String, ? extends Object> map) {
        Object obj;
        this.LLIIIILZ = map;
        c60213Nk9.LIZIZ.setGlobalProps(map);
        if (o.LJ(LJIL().LJJLIIIJJIZ.getValue(), Boolean.TRUE)) {
            NW2 nw2 = LJIL().LJJLIIIJJI;
            nw2.getValue();
            if (!nw2.LIZLLL && (obj = ((LinkedHashMap) map).get("font_scale")) != null) {
                c60213Nk9.LIZIZ.updateFontScacle(((Float) obj).floatValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60240Nka
    public final void LJIIIIZZ(android.net.Uri input, AqS137S0200000_6 aqS137S0200000_6, InterfaceC88472Yns reject) {
        Long value;
        o.LJIIJ(input, "input");
        o.LJIIJ(reject, "reject");
        InterfaceC60250Nkk<?, ?, ?, ?> interfaceC60250Nkk = this.LL;
        if (interfaceC60250Nkk != null) {
            ILynxKitApi iLynxKitApi = (ILynxKitApi) interfaceC60250Nkk;
            if (!iLynxKitApi.LIZ()) {
                reject.invoke(new IllegalStateException("Lynx has not inited", iLynxKitApi.LIZIZ()));
                return;
            }
            Boolean value2 = LJIL().LJJJLL.getValue();
            Boolean bool = Boolean.TRUE;
            if (o.LJ(value2, bool)) {
                reject.invoke(new E97(this, input, null, 4, 0 == true ? 1 : 0));
                return;
            }
            Integer value3 = LJIL().LJJJLIIL.getValue();
            if (value3 != null) {
                value3.intValue();
            }
            System.currentTimeMillis();
            IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) C60299NlX.LIZ(this, IResourceLoaderService.class);
            if (iResourceLoaderService == null) {
                reject.invoke(new RuntimeException("loader service is null"));
                return;
            }
            this.LLILII = true;
            long nanoTime = System.nanoTime();
            if (o.LJ(LJIL().LJJIJL.getValue(), bool) && (value = LJIL().LJJIJLIJ.getValue()) != null) {
                long longValue = value.longValue();
                if (longValue > 0) {
                    Thread.sleep(longValue);
                }
            }
            String uri = input.toString();
            o.LJFF(uri, "input.toString()");
            int i = 0;
            O1L o1l = new O1L(i);
            C51587KMl c51587KMl = (C51587KMl) this.LLF.LIZJ(C51587KMl.class);
            if (c51587KMl == null) {
                c51587KMl = new C51587KMl(false);
            }
            o1l.LIZ = c51587KMl;
            String value4 = LJIL().LJJJJI.getValue();
            String str = "";
            if (value4 == null) {
                value4 = "";
            }
            o1l.LJ = value4;
            String value5 = LJIL().LJJJJIZL.getValue();
            if (value5 == null) {
                value5 = "";
            }
            o1l.LJFF = value5;
            C59896Nf2 LJIL = LJIL();
            String str2 = (String) LJIL.LJJLIIIJL.getValue();
            if (str2 != null || (str2 = (String) LJIL.LJJJJLL.getValue()) != null || (str2 = (String) LJIL.LJJJJZI.getValue()) != null) {
                str = str2;
            }
            o1l.LJII = str;
            o1l.LJIIJ = this;
            Integer value6 = LJIL().LJJJLIIL.getValue();
            if (value6 != null) {
                i = value6.intValue();
            }
            o1l.LIZJ = Integer.valueOf(i);
            o1l.LJIIJJI = "template";
            o1l.LJIIL = this.LJLLLLLL;
            iResourceLoaderService.loadAsync(uri, o1l, new C60294NlS(this, nanoTime, reject, aqS137S0200000_6, input), new AqS13S0200100_6(this, nanoTime, reject, 1));
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.lynx.ILynxKitApi<*>");
    }

    public final void LJJI(C60213Nk9<VNS> c60213Nk9, byte[] bArr, TemplateData templateData, boolean z) {
        String valueOf = String.valueOf(this.LLIIJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start to render js, templateUrl: ");
        LIZ.append(valueOf);
        LIZ.append(", reload: ");
        LIZ.append(z);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        if (z) {
            c60213Nk9.LIZIZ.updateData(templateData);
            return;
        }
        this.LLIIL = System.currentTimeMillis();
        C60203Njz c60203Njz = (C60203Njz) this.LLF.LIZJ(C60203Njz.class);
        if (c60203Njz != null && c60203Njz.LIZLLL == null && c60203Njz.LIZIZ != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = c60203Njz.LIZIZ;
            if (l != null) {
                c60203Njz.LIZLLL = C0EM.LIZIZ(l, currentTimeMillis);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        c60213Nk9.LIZIZ.renderTemplateWithBaseUrl(bArr, templateData, valueOf);
        this.LLIILZL = System.currentTimeMillis() - this.LLIIL;
    }

    public final void LJJIFFI(C60213Nk9<VNS> c60213Nk9, byte[] bArr, JSONObject jSONObject, boolean z) {
        String valueOf = String.valueOf(this.LLIIJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start to render js, templateUrl: ");
        LIZ.append(valueOf);
        LIZ.append(", reload: ");
        LIZ.append(z);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        if (z) {
            c60213Nk9.LIZIZ.updateData(String.valueOf(jSONObject));
            return;
        }
        this.LLIIL = System.currentTimeMillis();
        C60203Njz c60203Njz = (C60203Njz) this.LLF.LIZJ(C60203Njz.class);
        if (c60203Njz != null && c60203Njz.LIZLLL == null && c60203Njz.LIZIZ != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = c60203Njz.LIZIZ;
            if (l != null) {
                c60203Njz.LIZLLL = C0EM.LIZIZ(l, currentTimeMillis);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        c60213Nk9.LIZIZ.renderTemplateWithBaseUrl(bArr, String.valueOf(jSONObject), valueOf);
        this.LLIILZL = System.currentTimeMillis() - this.LLIIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60292NlQ(LynxKitApi kitApi, F21 sessionInfo, List packageNames, C60251Nkl c60251Nkl, F3T providerFactory) {
        super(kitApi, sessionInfo, packageNames, c60251Nkl, providerFactory);
        o.LJIIJ(kitApi, "kitApi");
        o.LJIIJ(sessionInfo, "sessionInfo");
        o.LJIIJ(packageNames, "packageNames");
        o.LJIIJ(providerFactory, "providerFactory");
        this.LLI = new ArrayList();
        this.LLIFFJFJJ = new ArrayList();
        this.LLII = new ArrayList();
        this.LLIIIL = new C60295NlT(this);
        this.LLIIIZ = new LinkedHashMap();
        C221108m2.LIZIZ(new AqS160S0100000_10(providerFactory, 595));
    }
}
