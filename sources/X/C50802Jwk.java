package X;

import Y.AfS60S0100000_8;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Jwk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50802Jwk {
    public static final C50802Jwk LIZ = new C50802Jwk();
    public static final C5H3 LIZIZ = V16.LJJJJLL(C50817Jwz.LJLIL);

    public static boolean LIZ(View view) {
        if (view == null) {
            return true;
        }
        Object context = view.getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return true;
            }
        }
        if ((context instanceof LifecycleOwner) && ((LifecycleOwner) context).getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return true;
        }
        return false;
    }

    public static void LJ(C50799Jwh c50799Jwh, C50811Jwt c50811Jwt, AbstractC60800Ntc abstractC60800Ntc, DynamicPatch dynamicPatch, TemplateData templateData) {
        String str;
        TextView textView;
        String str2;
        ISearchContextAbility iSearchContextAbility;
        c50799Jwh.LJIIL = true;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50811Jwt.LJLILLLLZI;
        o.LJIIIZ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "<set-?>");
        c50799Jwh.LJIIJJI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c50811Jwt.LJLILLLLZI;
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            C2U8.LIZ(new C50774JwI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, IM2.SPARK_VIEW_LOAD_FINISH));
        }
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getSparkContext();
        if (sparkContext != null && (iSearchContextAbility = (ISearchContextAbility) sparkContext.LIZIZ(ISearchContextAbility.class)) != null) {
            iSearchContextAbility.j4(new C50807Jwp(0));
        }
        C50102JlS c50102JlS = new C50102JlS();
        c50102JlS.LJIIZILJ("type", "preload_hit");
        c50102JlS.LJIL(1);
        if (dynamicPatch != null) {
            str = dynamicPatch.schema;
        } else {
            str = null;
        }
        c50102JlS.LJIIZILJ("schema", str);
        c50102JlS.LJIILIIL();
        View childAt = c50799Jwh.LJIIJJI.getChildAt(0);
        o.LJII(childAt, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
        C60726NsQ c60726NsQ = (C60726NsQ) childAt;
        if (templateData != null) {
            c60726NsQ.updateData(templateData);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = c50799Jwh.LJIIJJI;
        if (o.LJ(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE) && (textView = (TextView) sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.findViewById(R.id.c3y)) != null) {
            CharSequence text = textView.getText();
            if (text == null || (str2 = text.toString()) == null) {
                str2 = "";
            }
            if (!s.LJJJLZIJ(str2, "fromCache", false)) {
                textView.setText(str2.concat(" fromCache"));
            }
        }
        abstractC60800Ntc.LJJJJJ(c60726NsQ);
    }

    public static void LIZLLL(C50098JlO c50098JlO, C50811Jwt c50811Jwt, C50107JlX c50107JlX, AbstractC60800Ntc abstractC60800Ntc, DynamicPatch dynamicPatch, java.util.Map map) {
        c50098JlO.LJLILLLLZI = true;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50811Jwt.LJLILLLLZI;
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
        if (sparkContext != null) {
            sparkContext.LJII(ISearchContextAbility.class, C17N.LJJJJJ(c50107JlX));
            ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) sparkContext.LIZIZ(ISearchContextAbility.class);
            if (iSearchContextAbility != null) {
                iSearchContextAbility.j4(new C50807Jwp(0));
            }
        }
        try {
            c50107JlX.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            C50102JlS c50102JlS = new C50102JlS();
            c50102JlS.LJIIZILJ("type", "preload_hit");
            c50102JlS.LJIL(1);
            c50102JlS.LJIIZILJ("schema", dynamicPatch.schema);
            c50102JlS.LJIILIIL();
            View childAt = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getChildAt(0);
            o.LJII(childAt, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            C60726NsQ c60726NsQ = (C60726NsQ) childAt;
            if (c50811Jwt.LJLJJI) {
                c50098JlO.LJLJI = true;
                AbstractC73745Swv.LJFF(dynamicPatch.getRawData()).LJI(new C50372Jpo(dynamicPatch, map, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext())).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS60S0100000_8(c60726NsQ, 20));
            } else {
                SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
                C50336JpE.LJI.getClass();
                c60726NsQ.updateData(C50336JpE.LIZIZ(dynamicPatch, map, sparkContext2));
            }
            abstractC60800Ntc.LJJJJJ(c60726NsQ);
        } catch (Exception e) {
            C50102JlS c50102JlS2 = new C50102JlS();
            c50102JlS2.LJIIZILJ("schema", dynamicPatch.schema);
            c50102JlS2.LJIIZILJ("type", "spark_replace_error");
            c50102JlS2.LJIIZILJ("error", e.getMessage());
            c50102JlS2.LJIILIIL();
        }
    }

    public final void LIZJ(C50107JlX c50107JlX, C50098JlO c50098JlO, DynamicPatch dynamicPatch, JTD jtd, java.util.Map<String, ? extends Object> map, AbstractC60800Ntc callback) {
        TemplateData templateData;
        if (LIZ(c50107JlX)) {
            C50102JlS c50102JlS = new C50102JlS();
            c50102JlS.LJIIZILJ("type", "spark_container_destroyed");
            c50102JlS.LJIIZILJ("schema", dynamicPatch.schema);
            c50102JlS.LJIILIIL();
            return;
        }
        if (c50107JlX.getChildAt(0) != null) {
            View hybirdContainerView = c50107JlX.getHybirdContainerView();
            o.LJII(hybirdContainerView, "null cannot be cast to non-null type com.bytedance.hybrid.spark.page.SparkView");
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) hybirdContainerView;
            c50098JlO.LJLILLLLZI = false;
            o.LJIIIZ(dynamicPatch, "dynamicPatch");
            o.LJIIIZ(callback, "callback");
            if (C78857UxB.LJJJIL(dynamicPatch.getRawData())) {
                SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
                C50336JpE.LJI.getClass();
                templateData = C50336JpE.LIZIZ(dynamicPatch, map, sparkContext);
            } else {
                templateData = null;
            }
            String str = dynamicPatch.schema;
            o.LJIIIIZZ(str, "dynamicPatch.schema");
            LIZIZ(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, str, templateData, false, callback, null, jtd, 32);
            return;
        }
        C50102JlS c50102JlS2 = new C50102JlS();
        c50102JlS2.LJIIZILJ("type", "spark_view_miss");
        c50102JlS2.LJIIZILJ("schema", dynamicPatch.schema);
        c50102JlS2.LJIILIIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C50802Jwk r15, X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS r16, java.lang.String r17, com.lynx.tasm.TemplateData r18, boolean r19, X.AbstractC60800Ntc r20, com.lynx.tasm.LynxViewClient r21, X.JTD r22, int r23) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50802Jwk.LIZIZ(X.Jwk, X.NtS, java.lang.String, com.lynx.tasm.TemplateData, boolean, X.Ntc, com.lynx.tasm.LynxViewClient, X.JTD, int):void");
    }
}
