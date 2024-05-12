package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import defpackage.a1;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OA0 extends FrameLayout implements GenericLifecycleObserver, InterfaceC40159FpT {
    public final Handler LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public C60878Nus LJLJJI;
    public C60824Nu0 LJLJJL;
    public SparkContext LJLJJLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public OA2 LJLL;
    public boolean LJLLI;

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    @Override // X.InterfaceC40159FpT
    public final void close() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.NV7
    public final void refresh() {
    }

    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.removeAllViews();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            this.LJLJL = null;
        }
        C60824Nu0 c60824Nu0 = this.LJLJJL;
        if (c60824Nu0 != null) {
            c60824Nu0.LJLJI = true;
            this.LJLJJL = null;
        }
        OA2 oa2 = this.LJLL;
        if (oa2 != null) {
            oa2.LIZ = 0L;
            oa2.LIZIZ = 0L;
            oa2.LIZJ = 0L;
        }
        this.LJLL = null;
        this.LJLJJI = null;
        this.LJLJJLL = null;
        setVisibility(8);
        this.LJLJLJ = "";
    }

    public final void LIZJ() {
        InterfaceC60761Nsz kitView;
        C60606NqU c60606NqU;
        if (TextUtils.isEmpty(this.LJLJLLL)) {
            return;
        }
        SparkContext sparkContext = this.LJLJJLL;
        String str = "";
        if (sparkContext != null) {
            sparkContext.LJJIJLIJ("");
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null && (kitView instanceof C60726NsQ)) {
            C60726NsQ c60726NsQ = (C60726NsQ) kitView;
            String str2 = this.LJLJLLL;
            C60439Nnn c60439Nnn = new C60439Nnn();
            c60439Nnn.LIZ = TemplateData.LJFF(str2);
            c60439Nnn.LIZ("initial_data", new JSONObject(this.LJLJLLL));
            TemplateData templateData = c60439Nnn.LIZ;
            String str3 = this.LJLJLJ;
            if (str3 != null) {
                str = str3;
            }
            if (templateData != null && (c60606NqU = c60726NsQ.LJLJI) != null) {
                c60606NqU.LJIIIIZZ = templateData;
            }
            c60726NsQ.load(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLLI = false;
        LIZIZ();
    }

    public final Handler getMainHandler() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OA0(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLIL = new Handler(C16880lQ.LLJJJJ());
        this.LJLJLJ = "";
        this.LJLJLLL = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OA0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = new Handler(C16880lQ.LLJJJJ());
        this.LJLJLJ = "";
        this.LJLJLLL = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OA0.LIZ(int, java.lang.String, java.lang.String):void");
    }
}
