package com.ss.android.ugc.aweme.search.lynx.spark.core.ui;

import X.AbstractC38911fr;
import X.AbstractC50008Jjw;
import X.AbstractC50814Jww;
import X.AbstractC60800Ntc;
import X.C15280iq;
import X.C16880lQ;
import X.C1HQ;
import X.C50340JpI;
import X.C50699Jv5;
import X.C50760Jw4;
import X.C50799Jwh;
import X.InterfaceC50067Jkt;
import X.InterfaceC50825Jx7;
import X.InterfaceC92693kP;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class SearchBaseSparkView implements InterfaceC50067Jkt {
    public final LifecycleOwner LIZ;
    public C50340JpI LIZIZ;
    public AbstractC60800Ntc LIZJ;
    public AbstractC38911fr LIZLLL;
    public final C1HQ<String, JSONObject> LJ;
    public final ArrayList<Object> LJFF;
    public final ArrayList<AbstractC50814Jww> LJI;
    public final ArrayList<AbstractC50008Jjw> LJII;
    public final ArrayList<InterfaceC92693kP> LJIIIIZZ;
    public DynamicPatch LJIIIZ;
    public InterfaceC50825Jx7 LJIIJ;

    public static void LJII(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynx view is not already when ");
        LIZ.append(str);
        LIZ.append(" \nyou can use setOnLoadListener and wait it load fished then continue your operate is recommended");
        C15280iq.LIZJ("SparkViewContainer", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC50067Jkt
    public final void LIZJ(String data) {
        boolean z;
        o.LJIIIZ(data, "data");
        if (this.LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC38911fr abstractC38911fr = this.LIZLLL;
            if (abstractC38911fr != null) {
                abstractC38911fr.LJJIZ(data);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateData");
            LIZ.append(data);
            C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
            C50340JpI c50340JpI = this.LIZIZ;
            if (c50340JpI != null) {
                c50340JpI.LIZLLL(data);
            }
            AbstractC38911fr abstractC38911fr2 = this.LIZLLL;
            if (abstractC38911fr2 != null) {
                abstractC38911fr2.LJJIL(data);
                return;
            }
            return;
        }
        this.LJFF.add(data);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("pending updateData");
        LIZ2.append(data);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("updateData:");
        LIZ3.append(data);
        LJII(X1D.LIZIZ(LIZ3));
    }

    @Override // X.InterfaceC50067Jkt
    public final void LJFF(TemplateData data) {
        boolean z;
        o.LJIIIZ(data, "data");
        if (this.LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC38911fr abstractC38911fr = this.LIZLLL;
            if (abstractC38911fr != null) {
                abstractC38911fr.LJJIZ(data);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateData");
            LIZ.append(data);
            C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
            C50340JpI c50340JpI = this.LIZIZ;
            if (c50340JpI != null) {
                c50340JpI.LIZIZ(data);
            }
            AbstractC38911fr abstractC38911fr2 = this.LIZLLL;
            if (abstractC38911fr2 != null) {
                abstractC38911fr2.LJJIL(data);
            }
            C50699Jv5 c50699Jv5 = new C50699Jv5();
            System.currentTimeMillis();
            c50699Jv5.LIZIZ(new C50760Jw4());
            return;
        }
        this.LJFF.add(data);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("pending updateData");
        LIZ2.append(data);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("updateData:");
        LIZ3.append(data);
        LJII(X1D.LIZIZ(LIZ3));
    }

    public SearchBaseSparkView(Context context, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        this.LIZ = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.search.lynx.spark.core.ui.SearchBaseSparkView.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C50340JpI c50340JpI = SearchBaseSparkView.this.LIZIZ;
                        if (c50340JpI != null) {
                            c50340JpI.LIZ.LJI(true);
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

    @Override // X.InterfaceC50067Jkt
    public final void LIZ(String str, JSONObject param) {
        o.LJIIIZ(param, "param");
        C50340JpI c50340JpI = this.LIZIZ;
        if (c50340JpI != null) {
            o.LJI(c50340JpI);
            c50340JpI.LIZ(str, param);
            return;
        }
        this.LJ.put(str, param);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendEvent:");
        LIZ.append(str);
        LIZ.append(' ');
        LIZ.append(param);
        LJII(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC50067Jkt
    public final void LIZLLL(int i, ViewGroup.LayoutParams params, ViewGroup target) {
        o.LJIIIZ(target, "target");
        o.LJIIIZ(params, "params");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = ((C50799Jwh) this).LJIIJJI;
        ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
        if (o.LJ(parent, target)) {
            return;
        }
        if (parent != null) {
            C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, (ViewGroup) parent);
        }
        target.addView(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, i, params);
    }
}
