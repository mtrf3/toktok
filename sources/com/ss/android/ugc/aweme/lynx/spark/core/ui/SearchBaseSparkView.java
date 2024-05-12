package com.ss.android.ugc.aweme.lynx.spark.core.ui;

import X.AbstractC50848JxU;
import X.AbstractC50851JxX;
import X.AbstractC60800Ntc;
import X.C0M8;
import X.C0M9;
import X.C15280iq;
import X.C16880lQ;
import X.C1HQ;
import X.C37942Euo;
import X.C38236EzY;
import X.C47261Igj;
import X.C50433Jqn;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50847JxT;
import X.C50849JxV;
import X.C60726NsQ;
import X.C60737Nsb;
import X.EnumC38085Ex7;
import X.InterfaceC60761Nsz;
import X.InterfaceC92693kP;
import X.KFY;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.VNS;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class SearchBaseSparkView implements KFY {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public C50849JxV LIZJ;
    public AbstractC60800Ntc LIZLLL;
    public final C1HQ<String, JSONObject> LJ;
    public final ArrayList<Object> LJFF;
    public final ArrayList<AbstractC50848JxU> LJI;
    public final ArrayList<AbstractC50851JxX> LJII;
    public final ArrayList<InterfaceC92693kP> LJIIIIZZ;
    public DynamicPatch LJIIIZ;

    public final void LJII() {
        this.LJ.clear();
        this.LJFF.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ() {
        C37942Euo c37942Euo;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleAllPendingIfHave: events:");
        LIZ.append(this.LJ);
        LIZ.append(" and updates:");
        LIZ.append(this.LJFF);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
        Iterator it = ((C0M9.b) this.LJ.entrySet()).iterator();
        while (true) {
            C0M8 c0m8 = (C0M8) it;
            if (!c0m8.hasNext()) {
                break;
            }
            c0m8.next();
            K key = c0m8.getKey();
            o.LJIIIIZZ(key, "it.key");
            V value = c0m8.getValue();
            o.LJIIIIZZ(value, "it.value");
            LIZ((String) key, (JSONObject) value);
        }
        Iterator<Object> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof TemplateData) {
                LJIIJJI((TemplateData) next);
            }
            if (next instanceof String) {
                LIZJ((String) next);
            }
        }
        LJII();
        Iterator<AbstractC50848JxU> it3 = this.LJI.iterator();
        while (it3.hasNext()) {
            AbstractC50848JxU next2 = it3.next();
            C50849JxV c50849JxV = this.LIZJ;
            o.LJI(c50849JxV);
            next2.getClass();
            C50849JxV c50849JxV2 = next2.LIZ;
            if (c50849JxV2 != null) {
                Object obj = c50849JxV2.LIZ;
                o.LJII(obj, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
                ((View) obj).removeOnAttachStateChangeListener(next2.LIZIZ);
            }
            Object obj2 = c50849JxV.LIZ;
            o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            ((View) obj2).addOnAttachStateChangeListener(next2.LIZIZ);
            next2.LIZ = c50849JxV;
        }
        C50849JxV c50849JxV3 = this.LIZJ;
        if (c50849JxV3 != null) {
            InterfaceC60761Nsz interfaceC60761Nsz = c50849JxV3.LIZ;
            o.LJII(interfaceC60761Nsz, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            C60737Nsb hybridContext = ((C60726NsQ) interfaceC60761Nsz).getHybridContext();
            if (hybridContext == null || (c37942Euo = (C37942Euo) hybridContext.LIZIZ(C37942Euo.class)) == null) {
                return;
            }
            Iterator<AbstractC50851JxX> it4 = this.LJII.iterator();
            while (it4.hasNext()) {
                AbstractC50851JxX next3 = it4.next();
                next3.getClass();
                C38236EzY c38236EzY = new C38236EzY();
                c38236EzY.LIZ(next3.LIZ());
                c38236EzY.LIZJ = "";
                c38236EzY.LIZIZ(EnumC38085Ex7.PUBLIC);
                c38236EzY.LIZLLL = new C50847JxT(next3);
                c37942Euo.LJIILJJIL(c38236EzY);
            }
        }
    }

    public final void LJIIJ() {
        LJII();
        this.LIZJ = null;
    }

    public static void LJIIIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynx view is not already when ");
        LIZ.append(str);
        LIZ.append(" \nyou can use setOnLoadListener and wait it load fished then continue your operate is recommended");
        C15280iq.LIZJ("SparkViewContainer", X1D.LIZIZ(LIZ));
    }

    @Override // X.KFY
    public final void LIZJ(String data) {
        o.LJIIIZ(data, "data");
        C50849JxV c50849JxV = this.LIZJ;
        if (c50849JxV != null) {
            o.LJI(c50849JxV);
            Object obj = c50849JxV.LIZ;
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            ((VNS) obj).updateData(data);
            return;
        }
        this.LJFF.add(data);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateData:");
        LIZ.append(data);
        LJIIIZ(X1D.LIZIZ(LIZ));
    }

    public final void LJI(C1HQ c1hq) {
        String str;
        C50433Jqn searchCommonModel;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        LifecycleOwner lifecycleOwner = this.LIZIZ;
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(lifecycleOwner);
        if (LJII == null || (searchCommonModel = LJII.getSearchCommonModel()) == null || (str = searchCommonModel.getEnterFrom()) == null) {
            str = "";
        }
        c1hq.put("search_entrance", str);
    }

    public final void LJIIJJI(TemplateData data) {
        o.LJIIIZ(data, "data");
        C50849JxV c50849JxV = this.LIZJ;
        if (c50849JxV != null) {
            o.LJI(c50849JxV);
            Object obj = c50849JxV.LIZ;
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            ((VNS) obj).updateData(data);
            return;
        }
        this.LJFF.add(data);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateData:");
        LIZ.append(data);
        LJIIIZ(X1D.LIZIZ(LIZ));
    }

    public SearchBaseSparkView(Context context, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.lynx.spark.core.ui.SearchBaseSparkView.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C50849JxV c50849JxV = SearchBaseSparkView.this.LIZJ;
                        if (c50849JxV != null) {
                            c50849JxV.LIZ.LJI(true);
                        }
                        Iterator<InterfaceC92693kP> it = SearchBaseSparkView.this.LJIIIIZZ.iterator();
                        while (it.hasNext()) {
                            InterfaceC92693kP next = it.next();
                            if (!next.isDisposed()) {
                                next.dispose();
                            }
                        }
                    }
                }
            });
        }
        this.LJ = new C1HQ<>();
        this.LJFF = new ArrayList<>();
        this.LJI = new ArrayList<>();
        this.LJII = new ArrayList<>();
        this.LJIIIIZZ = new ArrayList<>();
    }

    @Override // X.KFY
    public final void LIZ(String str, JSONObject param) {
        o.LJIIIZ(param, "param");
        C50849JxV c50849JxV = this.LIZJ;
        if (c50849JxV != null) {
            o.LJI(c50849JxV);
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            Iterator<String> keys = param.keys();
            o.LJIIIIZZ(keys, "params.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                javaOnlyMap2.put(next, param.opt(next));
            }
            javaOnlyMap.put("data", javaOnlyMap2);
            c50849JxV.LIZ.LJIIJ(str, C47261Igj.LJJIJ(javaOnlyMap));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendEventToFe by spark:");
            LIZ.append(str);
            LIZ.append(" and params");
            LIZ.append(param);
            LIZ.append(" and final data： ");
            LIZ.append(javaOnlyMap);
            C15280iq.LIZIZ("SparkInfo", X1D.LIZIZ(LIZ));
            return;
        }
        this.LJ.put(str, param);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("sendEvent:");
        LIZ2.append(str);
        LIZ2.append(' ');
        LIZ2.append(param);
        LJIIIZ(X1D.LIZIZ(LIZ2));
    }

    @Override // X.KFY
    public final void LIZLLL(int i, ViewGroup.LayoutParams params, ViewGroup viewGroup) {
        o.LJIIIZ(params, "params");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = LIZIZ();
        ViewParent parent = LIZIZ.getParent();
        if (o.LJ(parent, viewGroup)) {
            return;
        }
        if (parent != null) {
            C16880lQ.LJLLL(LIZIZ, (ViewGroup) parent);
        }
        viewGroup.addView(LIZIZ, i, params);
    }

    @Override // X.KFY
    public void LJFF(DynamicPatch dynamicData, Map<String, ? extends Object> map, boolean z) {
        o.LJIIIZ(dynamicData, "dynamicData");
    }
}
