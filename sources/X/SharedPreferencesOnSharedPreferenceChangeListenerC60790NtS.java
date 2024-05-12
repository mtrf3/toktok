package X;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.lynx.tasm.LynxEnv;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NtS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS extends FrameLayout implements NV7, InterfaceC60833Nu9, SharedPreferences.OnSharedPreferenceChangeListener {
    public static final boolean LLIIIZ;
    public InterfaceC60761Nsz LJLIL;
    public SparkContext LJLILLLLZI;
    public SparkContext LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public AbstractC60800Ntc LJLJJLL;
    public InterfaceC60816Nts LJLJL;
    public AbstractC60811Ntn LJLJLJ;
    public InterfaceC60814Ntq LJLJLLL;
    public InterfaceC60812Nto LJLL;
    public View LJLLI;
    public InterfaceC60721NsL LJLLILLLL;
    public SparkSchemaParam LJLLJ;
    public Integer LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final FrameLayout LJLZ;
    public final TextView LJZ;
    public EnumC60794NtW LJZI;
    public long LJZL;
    public boolean LL;
    public long LLD;
    public long LLF;
    public String LLFF;
    public final boolean LLFFF;
    public final boolean LLFII;
    public final boolean LLFZ;
    public final boolean LLI;
    public final String LLIFFJFJJ;
    public int LLII;
    public long LLIIII;
    public int LLIIIILZ;
    public boolean LLIIIJ;
    public HashMap LLIIIL;
    public boolean forceDowngradeWebView;

    static {
        Object LIZ;
        boolean z;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("reduce_reload_global_props_update");
            if (config != null) {
                LIZ = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Boolean bool = (Boolean) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        LLIIIZ = z;
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 60);
    }

    @Override // X.InterfaceC60831Nu7
    public final void release() {
        LJI(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        r1.LJJJLL(r7.LJLILLLLZI);
        r1 = r1.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r1 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        r1 = getSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r1 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        r2 = (X.AbstractC60800Ntc) r1.LIZIZ(X.AbstractC60800Ntc.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        r1 = getSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        r1 = (X.AbstractC60811Ntn) r1.LIZIZ(X.AbstractC60811Ntn.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r2.LJJJLL(r7.LJLILLLLZI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        r1.LJJJLL(r7.LJLILLLLZI);
        r1 = r1.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        r0 = r7.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        r0.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        r2 = r7.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        r0 = r7.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r1 = r0.url;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        if (r1 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        LJIILLIIL("start", r2, r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ba, code lost:
    
        r2 = null;
     */
    @Override // X.InterfaceC60831Nu7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ():void");
    }

    @Override // X.InterfaceC60833Nu9
    public final boolean LIZLLL() {
        if (this.LJZI == EnumC60794NtW.SUCCESS) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ() {
        C37682Eqc.LIZIZ(this.LJLILLLLZI, "SparkView", "goBack");
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
        if (interfaceC60761Nsz != null && (interfaceC60761Nsz instanceof WebKitView)) {
            WebKitView webKitView = (WebKitView) interfaceC60761Nsz;
            if (webKitView.canGoBack()) {
                webKitView.goBack();
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LJIIJ() {
        InterfaceC40159FpT interfaceC40159FpT;
        InterfaceC40159FpT interfaceC40159FpT2;
        SparkContext sparkContext = this.LJLILLLLZI;
        InterfaceC40159FpT interfaceC40159FpT3 = null;
        if (sparkContext != null) {
            interfaceC40159FpT = sparkContext.LJIILL();
        } else {
            interfaceC40159FpT = null;
        }
        if (!(interfaceC40159FpT instanceof SparkActivity)) {
            SparkContext sparkContext2 = this.LJLILLLLZI;
            if (sparkContext2 != null) {
                interfaceC40159FpT2 = sparkContext2.LJIILL();
            } else {
                interfaceC40159FpT2 = null;
            }
            if (!(interfaceC40159FpT2 instanceof SparkPopup)) {
                SparkContext sparkContext3 = this.LJLILLLLZI;
                if (sparkContext3 != null) {
                    interfaceC40159FpT3 = sparkContext3.LJIILL();
                }
                if (!(interfaceC40159FpT3 instanceof SparkFragment)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final EnumC39924Flg getHybridKitType() {
        EnumC39924Flg enumC39924Flg;
        String str;
        SparkSchemaParam sparkSchemaParam = this.LJLLJ;
        if (sparkSchemaParam == null || (enumC39924Flg = sparkSchemaParam.getEngineType()) == null) {
            enumC39924Flg = EnumC39924Flg.UNKNOWN;
        }
        if (this.forceDowngradeWebView) {
            SparkContext sparkContext = this.LJLILLLLZI;
            if (sparkContext == null || (str = sparkContext.containerId) == null) {
                str = "";
            }
            FD5.LIZ(str, "is_fallback");
            return EnumC39924Flg.WEB;
        }
        return enumC39924Flg;
    }

    public final InterfaceC60812Nto getLoadingProvider() {
        InterfaceC60812Nto interfaceC60812Nto;
        SparkContext sparkContext = this.LJLILLLLZI;
        InterfaceC60812Nto interfaceC60812Nto2 = null;
        if (sparkContext == null || (interfaceC60812Nto = (InterfaceC60812Nto) sparkContext.LIZIZ(InterfaceC60812Nto.class)) == null) {
            C60809Ntl.LIZIZ.getClass();
            InterfaceC60799Ntb interfaceC60799Ntb = C60809Ntl.LIZ;
            if (interfaceC60799Ntb != null) {
                interfaceC60812Nto2 = interfaceC60799Ntb.LIZJ();
            }
            return interfaceC60812Nto2;
        }
        return interfaceC60812Nto;
    }

    public final InterfaceC60814Ntq getStatusViewProvider() {
        InterfaceC60814Ntq interfaceC60814Ntq;
        SparkContext sparkContext = this.LJLILLLLZI;
        InterfaceC60814Ntq interfaceC60814Ntq2 = null;
        if (sparkContext == null || (interfaceC60814Ntq = (InterfaceC60814Ntq) sparkContext.LIZIZ(InterfaceC60814Ntq.class)) == null) {
            C60809Ntl.LIZIZ.getClass();
            InterfaceC60799Ntb interfaceC60799Ntb = C60809Ntl.LIZ;
            if (interfaceC60799Ntb != null) {
                interfaceC60814Ntq2 = interfaceC60799Ntb.LJI();
            }
            return interfaceC60814Ntq2;
        }
        return interfaceC60814Ntq;
    }

    public final String getUrl() {
        SparkContext sparkContext = this.LJLILLLLZI;
        if (sparkContext != null) {
            return sparkContext.url;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        String str;
        String str2;
        View view = this.LJLLI;
        if (view != null) {
            C16880lQ.LJZ(view, this);
        }
        super.onDetachedFromWindow();
        if (this.LL) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJZL;
        int i = C60793NtV.LJI[this.LJZI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "cancel";
            } else {
                str = "failure";
            }
        } else {
            str = "success";
        }
        SparkContext sparkContext = this.LJLILLLLZI;
        String str3 = null;
        if (sparkContext != null) {
            str2 = sparkContext.containerId;
        } else {
            str2 = null;
        }
        C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_container_exit");
        if (sparkContext != null) {
            str3 = sparkContext.bid;
        }
        c79605VMb.LIZIZ = str3;
        c79605VMb.LIZ = this.LLFF;
        c79605VMb.LIZLLL = C65232Piu.LIZJ("status", str);
        c79605VMb.LJ = Q7K.LIZLLL("stay_duration", currentTimeMillis);
        FD5.LJ(str2, c79605VMb.LIZ());
    }

    @Override // X.NV7
    public final void refresh() {
        String str;
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
        if (interfaceC60761Nsz instanceof WebKitView) {
            if (interfaceC60761Nsz != null) {
                interfaceC60761Nsz.reload();
            }
            InterfaceC60761Nsz interfaceC60761Nsz2 = this.LJLIL;
            if (interfaceC60761Nsz2 != null) {
                SparkContext sparkContext = this.LJLILLLLZI;
                if (sparkContext == null || (str = sparkContext.url) == null) {
                    str = "";
                }
                LJIILLIIL("start", interfaceC60761Nsz2, str, null);
                return;
            }
            return;
        }
        LIZIZ();
    }

    @Override // X.InterfaceC60831Nu7
    public Context getHybridViewContext() {
        Context context = getContext();
        o.LJFF(context, "context");
        return context;
    }

    @Override // X.InterfaceC60831Nu7
    public C60737Nsb getHybridContext() {
        return this.LJLILLLLZI;
    }

    public boolean getKeepAlive() {
        return this.LLIIIJ;
    }

    public final InterfaceC60761Nsz getKitView() {
        return this.LJLIL;
    }

    public int getOptimization() {
        return this.LLIIIILZ;
    }

    public final SparkContext getOriginalSparkContext() {
        return this.LJLJI;
    }

    public final SparkContext getSparkContext() {
        return this.LJLILLLLZI;
    }

    public final SparkSchemaParam getSparkSchemaParam() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC60831Nu7
    public long getViewCreatedTime() {
        return this.LLIIII;
    }

    public static void LJ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        String str;
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getClass();
        C60792NtU c60792NtU = C60792NtU.LIZ;
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLILLLLZI;
        SparkSchemaParam sparkSchemaParam = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLLJ;
        c60792NtU.getClass();
        String LIZIZ = C60792NtU.LIZIZ(sparkContext, sparkSchemaParam);
        if (LIZIZ != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getContext() instanceof MutableContextWrapper)) {
            SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLILLLLZI;
            if (sparkContext2 == null || (str = sparkContext2.url) == null) {
                str = "";
            }
            C37724ErI.LIZIZ.getClass();
            if (C60828Nu4.LIZ(str, LIZIZ, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
                ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, (ViewGroup) parent);
                }
                Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
                if (kitView != null && (kitView instanceof WebKitView)) {
                    ((OM1) kitView).onPause();
                }
                C37682Eqc.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLILLLLZI, "SparkView", "SparkView need reuse, add it to cache pool");
                return;
            }
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJI(true);
    }

    @Override // X.InterfaceC60831Nu7
    public final void LIZ(java.util.Map<String, ? extends Object> map) {
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LIZ(map);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (X.C60828Nu4.LIZ(r1, r2, r5) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.getKeepAlive()
            r4 = 0
            if (r0 == 0) goto L4f
            X.Ezy r0 = X.C39836FkG.LJII
            r0.getClass()
            X.FkG r0 = X.C38262Ezy.LIZ()
            android.app.Application r0 = r0.LIZIZ()
            X.C60797NtZ.LIZIZ(r5, r0)
            r0 = 4
            r5.setOptimization(r0)
        L1b:
            android.view.ViewParent r1 = r5.getParent()
            r3 = 0
            if (r1 == 0) goto L2b
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.C16880lQ.LJLLL(r5, r1)
        L2b:
            X.Nsz r1 = r5.getKitView()
            if (r1 == 0) goto L3a
            boolean r0 = r1 instanceof com.bytedance.lynx.hybrid.webkit.WebKitView
            if (r0 == 0) goto L3a
            X.OM1 r1 = (X.OM1) r1
            r1.onPause()
        L3a:
            com.bytedance.hybrid.spark.SparkContext r2 = r5.LJLILLLLZI
            java.lang.String r1 = "SparkView"
            java.lang.String r0 = "SparkView need reuse, add it to cache pool"
            X.C37682Eqc.LIZIZ(r2, r1, r0)
            boolean r0 = r5.LLFZ
            if (r0 == 0) goto L4e
            com.bytedance.hybrid.spark.SparkContext r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L4e
            r0.LJIJJ(r3)
        L4e:
            return r4
        L4f:
            X.NtU r2 = X.C60792NtU.LIZ
            com.bytedance.hybrid.spark.SparkContext r1 = r5.LJLILLLLZI
            com.bytedance.lynx.spark.schema.model.SparkSchemaParam r0 = r5.LJLLJ
            r2.getClass()
            java.lang.String r2 = X.C60792NtU.LIZIZ(r1, r0)
            if (r2 == 0) goto L7d
            android.content.Context r0 = r5.getContext()
            boolean r0 = r0 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto L7d
            com.bytedance.hybrid.spark.SparkContext r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L7a
            java.lang.String r1 = r0.url
            if (r1 == 0) goto L7a
        L6e:
            X.Nu4 r0 = X.C37724ErI.LIZIZ
            r0.getClass()
            boolean r0 = X.C60828Nu4.LIZ(r1, r2, r5)
            if (r0 == 0) goto L7d
            goto L1b
        L7a:
            java.lang.String r1 = ""
            goto L6e
        L7d:
            r5.LJI(r6)
            r4 = 1
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJFF(boolean):boolean");
    }

    public final void LJI(boolean z) {
        String str;
        String str2;
        if (this.LL) {
            return;
        }
        SparkContext sparkContext = this.LJLILLLLZI;
        if (sparkContext != null && (str2 = sparkContext.containerId) != null) {
            SparkContext.Companion.getClass();
            SparkContext.hybridContextMap.remove(str2);
        }
        SparkContext sparkContext2 = this.LJLJI;
        if (sparkContext2 != null && (str = sparkContext2.containerId) != null) {
            F1U.LIZ.remove(str);
        }
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LJI(z);
        }
        C39836FkG.LJII.getClass();
        if (C38262Ezy.LIZ().LIZ) {
            ((SharedPreferences) C38332F2q.LIZ.getValue()).unregisterOnSharedPreferenceChangeListener(this);
        }
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LL = true;
    }

    public final C38518F9u LJII(SparkContext sparkContext) {
        String str;
        C38518F9u c38518F9u = sparkContext.extraRuntimeInfo;
        if (LJIIJ() || (sparkContext.LJIILL() instanceof SparkFragment)) {
            this.LJLLJ = sparkContext.LJIIZILJ(3);
        } else {
            this.LJLLJ = sparkContext.LJIIZILJ(-1);
        }
        String containerId = sparkContext.containerId;
        o.LJIIJ(containerId, "containerId");
        java.util.Map<String, String> LIZJ = C75252xN.LIZJ(containerId);
        if (this.LJLLJ != null) {
            c38518F9u.put((Object) "queryItems", (Object) LIZJ);
            if (LIZJ.containsKey("ab_params")) {
                c38518F9u.put((Object) "abParams", (Object) String.valueOf(LIZJ.get("ab_params")));
            }
        }
        Context context = getContext();
        o.LJFF(context, "context");
        double LJJIJ = C45804HyK.LJJIJ(context);
        FCH.LIZIZ.getClass();
        Activity LIZIZ = FCG.LIZIZ();
        JSONObject jSONObject = HybridSettings.INSTANCE.get("safe_area_height_double");
        int i = 1;
        if (jSONObject == null || jSONObject.optBoolean("enable", true)) {
            c38518F9u.put((Object) "statusBarHeight", (Object) Double.valueOf(LJJIJ));
            c38518F9u.put((Object) "status_bar_height", (Object) Double.valueOf(LJJIJ));
            if (LIZIZ != null) {
                c38518F9u.put((Object) "safeAreaHeight", (Object) Double.valueOf(C45804HyK.LJJJLIIL(LIZIZ, Double.valueOf(LJJIJ))));
            }
        } else {
            int LJJIIJZLJL = O6R.LJJIIJZLJL(LJJIJ);
            c38518F9u.put((Object) "statusBarHeight", (Object) Integer.valueOf(LJJIIJZLJL));
            c38518F9u.put((Object) "status_bar_height", (Object) Double.valueOf(LJJIJ));
            if (LIZIZ != null) {
                c38518F9u.put((Object) "safeAreaHeight", (Object) Integer.valueOf(C60605NqT.LJIIJJI(LIZIZ, LJJIIJZLJL)));
            }
        }
        c38518F9u.put((Object) "spark_version", (Object) "1.4.2.6-bugfix");
        String LJIILLIIL = sparkContext.LJIILLIIL();
        if (LJIILLIIL == null) {
            LJIILLIIL = "";
        }
        c38518F9u.put((Object) "originUrl", (Object) LJIILLIIL);
        c38518F9u.putAll(sparkContext.runtimeInfo);
        Resources resources = getResources();
        o.LJFF(resources, "resources");
        int i2 = resources.getConfiguration().orientation;
        this.LLII = i2;
        if (i2 == 1 || i2 != 2) {
            str = "Portrait";
        } else {
            str = "Landscape";
        }
        c38518F9u.put((Object) "screenOrientation", (Object) str);
        if (this.LLII != 2) {
            i = 0;
        }
        c38518F9u.put((Object) "orientation", (Object) Integer.valueOf(i));
        return c38518F9u;
    }

    public final void LJIIJJI(SparkContext sparkContext) {
        o.LJIIJ(sparkContext, "sparkContext");
        LJIIL(sparkContext);
        this.forceDowngradeWebView = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0385, code lost:
    
        if (r1 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0387, code lost:
    
        X.C37682Eqc.LIZIZ(r21, "SparkView", "prepareInner  HybridKit.createKitView hybridKitType:" + r5);
        r12 = java.lang.System.currentTimeMillis();
        r0 = X.FCH.LIZIZ;
        r10 = getContext();
        kotlin.jvm.internal.o.LJFF(r10, "context");
        r14 = new X.C60791NtT(r20, r21, r5, r11, r2);
        r0.getClass();
        r8 = 0;
        r7 = (X.InterfaceC60701Ns1[]) X.FCH.LIZ.getValue();
        r3 = r7.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03c1, code lost:
    
        if (r8 >= r3) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03c3, code lost:
    
        r2 = r7[r8];
        r1 = r2.LIZ();
        r0 = r21.hybridParams;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03cb, code lost:
    
        if (r0 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03cd, code lost:
    
        r0 = r0.getType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03d1, code lost:
    
        if (r1 != r0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0420, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03d3, code lost:
    
        r0 = r2.LIZIZ(r9, r21, r10, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03d7, code lost:
    
        r20.LJLIL = r0;
        r1 = (X.C60728NsS) r21.LIZIZ(X.C60728NsS.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03e1, code lost:
    
        if (r1 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03e3, code lost:
    
        r1.LJII = X.C44847Hit.LIZ(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03e9, code lost:
    
        LJIIIZ(r20.LJLLJ, r21, false);
        r0 = r20.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03f1, code lost:
    
        if (r0 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03f3, code lost:
    
        r2 = r0.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03f7, code lost:
    
        if (r2 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03f9, code lost:
    
        addView(r2, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0402, code lost:
    
        LJIILJJIL(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0409, code lost:
    
        if (r21.LJIILL() != null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x040b, code lost:
    
        X.FD5.LIZJ(java.lang.System.currentTimeMillis(), r21.containerId, "container_init_end");
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x041c, code lost:
    
        if (r21.LIZIZ(X.C60728NsS.class) == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0423, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0425, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0429, code lost:
    
        r1.LJIL(r12);
        r1 = r1.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x042e, code lost:
    
        if (r1 == 0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0432, code lost:
    
        if ((r1 instanceof X.AbstractC60815Ntr) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0434, code lost:
    
        r1 = (X.AbstractC60815Ntr) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0427, code lost:
    
        if (r1 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0170, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0172, code lost:
    
        r1.LJJJJIZL(X.C60622Nqk.LIZ, r2, r3);
        r1 = r1.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0179, code lost:
    
        if (r1 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b1, code lost:
    
        if ((r21.LJIILL() instanceof com.bytedance.hybrid.spark.page.SparkActivity) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b3, code lost:
    
        X.C60809Ntl.LIZIZ.getClass();
        r0 = X.C60809Ntl.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ba, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bc, code lost:
    
        r0 = r0.LJFF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c0, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c4, code lost:
    
        if (r0.LIZJ != true) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c6, code lost:
    
        r0 = (X.InterfaceC60721NsL) r21.LIZIZ(X.InterfaceC60721NsL.class);
        r20.LJLLILLLL = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d0, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d2, code lost:
    
        r0.LIZ(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d5, code lost:
    
        r0 = r20.LJLJLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d7, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d9, code lost:
    
        LJIJJLI(r0, r21);
        r1 = r0.LJIJJLI(r20);
        r20.LJLJJL = r1;
        X.C60792NtU.LIZ.getClass();
        X.C60792NtU.LJ(r1);
        r1 = r20.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ec, code lost:
    
        if (r1 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ee, code lost:
    
        r20.LJLZ.removeAllViews();
        r20.LJLZ.addView(r1);
        r20.LJLZ.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01fd, code lost:
    
        X.FD5.LJIIIIZZ(null, r21.containerId, new X.C61659OHv(100, "SparkView init failed, not support engine. schema = " + r21.url, "", ""));
        X.C37682Eqc.LIZIZ(r21, "SparkView", "HybridKit Init do nothing type:" + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022a, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.bytedance.hybrid.spark.SparkContext r21) {
        /*
            Method dump skipped, instructions count: 1141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIIL(com.bytedance.hybrid.spark.SparkContext):void");
    }

    public final void LJIILJJIL(EnumC39924Flg enumC39924Flg) {
        int i;
        String str;
        String LIZIZ;
        String str2;
        InterfaceC40155FpP interfaceC40155FpP;
        C62822Ol8 c62822Ol8 = C38332F2q.LIZ;
        boolean z = ((SharedPreferences) c62822Ol8.getValue()).getBoolean("enable_spark_debug_label", true);
        ((SharedPreferences) c62822Ol8.getValue()).getBoolean("enable_resource_info_in_spark_debug_label", false);
        TextView textView = this.LJZ;
        C39836FkG.LJII.getClass();
        if (C38262Ezy.LIZ().LIZ && z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (C38262Ezy.LIZ().LIZ) {
            int i2 = C60793NtV.LIZLLL[enumC39924Flg.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        str = "unknown";
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    str = "webview";
                }
            } else {
                str = "lynxview";
            }
            int i3 = C60793NtV.LJ[enumC39924Flg.ordinal()];
            String str3 = "";
            if (i3 != 1) {
                if (i3 == 2 || i3 == 3) {
                    LIZIZ = "";
                } else {
                    throw new C162476Zf();
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('(');
                o.LJFF(LynxEnv.LJIIIZ(), "LynxEnv.inst()");
                LIZ.append("2.10.16-rc.10");
                LIZ.append(')');
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            if ((getOptimization() & 2) == 2) {
                str2 = "Preload - ";
            } else if ((getOptimization() & 4) != 4) {
                str2 = "";
            } else {
                str2 = "ReUse - ";
            }
            SparkContext sparkContext = this.LJLILLLLZI;
            if (sparkContext != null && (interfaceC40155FpP = (InterfaceC40155FpP) sparkContext.LIZIZ(InterfaceC40155FpP.class)) != null && interfaceC40155FpP.LIZJ()) {
                str3 = " - Pure";
            }
            this.LJZ.setText(UPJ.LIZIZ(str2, "Spark - ", str, LIZIZ, str3));
            C60809Ntl.LIZIZ.getClass();
        }
    }

    public final void LJIJJ(SparkContext sparkContext) {
        FD3 fd3;
        FD3 fd32;
        String str;
        String str2;
        C61156NzM c61156NzM;
        C61157NzN c61157NzN;
        String str3;
        String str4;
        String str5;
        File file;
        Boolean bool;
        Float f;
        Float f2;
        Integer skeletonDuration;
        String skeletonToAlpha;
        String skeletonFromAlpha;
        String str6;
        String bundle;
        GeckoConfig geckoConfig;
        InterfaceC60721NsL interfaceC60721NsL = this.LJLLILLLL;
        if (interfaceC60721NsL != null) {
            interfaceC60721NsL.LIZIZ(10);
        }
        InterfaceC60814Ntq interfaceC60814Ntq = this.LJLJLLL;
        if (interfaceC60814Ntq != null) {
            LJIJJLI(interfaceC60814Ntq, sparkContext);
            this.LJLZ.removeAllViews();
            this.LJLZ.setVisibility(8);
            if (sparkContext != null) {
                C39811Fjr c39811Fjr = C39890Fl8.LIZ;
                Long l = null;
                if (c39811Fjr != null) {
                    fd3 = c39811Fjr.LIZLLL;
                } else {
                    fd3 = null;
                }
                if (!(fd3 instanceof O2J)) {
                    fd32 = null;
                } else {
                    fd32 = fd3;
                }
                O2J o2j = (O2J) fd32;
                if (o2j != null && (geckoConfig = o2j.LIZJ) != null) {
                    str = geckoConfig.getOfflineDir();
                    str2 = geckoConfig.getAccessKey();
                } else {
                    if (!(fd3 instanceof C39917FlZ)) {
                        fd3 = null;
                    }
                    C39917FlZ c39917FlZ = (C39917FlZ) fd3;
                    if (c39917FlZ == null || (c61156NzM = c39917FlZ.LIZ) == null || (c61157NzN = c61156NzM.LJFF) == null) {
                        str = "";
                        str2 = "";
                    } else {
                        str = c61157NzN.LIZIZ;
                        str2 = c61157NzN.LIZ;
                    }
                }
                Context context = getContext();
                o.LJFF(context, "context");
                new File(C16880lQ.LLIIJLIL(context), str);
                SparkSchemaParam sparkSchemaParam = this.LJLLJ;
                if (sparkSchemaParam == null || (str3 = sparkSchemaParam.getChannel()) == null) {
                    str3 = "";
                }
                StringBuilder LIZJ = b1.LIZJ(C70657RoD.LJIIIZ(str2, str3), "/");
                SparkSchemaParam sparkSchemaParam2 = this.LJLLJ;
                if (sparkSchemaParam2 != null && (bundle = sparkSchemaParam2.getBundle()) != null) {
                    str4 = ujb.o.LJJJJZ(bundle, "template.js", "", false);
                } else {
                    str4 = null;
                }
                LIZJ.append(str4);
                String LIZIZ = X1D.LIZIZ(LIZJ);
                o.LJIIJ(LIZIZ, "<set-?>");
                sparkContext.resourcePath = LIZIZ;
                SparkSchemaParam sparkSchemaParam3 = this.LJLLJ;
                if (sparkSchemaParam3 != null) {
                    str5 = sparkSchemaParam3.getSkeletonPath();
                } else {
                    str5 = null;
                }
                if (C96Q.LIZ(str5)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LIZIZ);
                    SparkSchemaParam sparkSchemaParam4 = this.LJLLJ;
                    if (sparkSchemaParam4 != null) {
                        str6 = sparkSchemaParam4.getSkeletonPath();
                    } else {
                        str6 = null;
                    }
                    LIZ.append(str6);
                    file = new File(X1D.LIZIZ(LIZ));
                } else {
                    file = null;
                }
                if (!this.LJLLLL) {
                    if ((interfaceC60814Ntq instanceof AbstractC60796NtY) && file != null && file.exists() && file.canRead()) {
                        AbstractC60796NtY abstractC60796NtY = (AbstractC60796NtY) interfaceC60814Ntq;
                        SparkSchemaParam sparkSchemaParam5 = this.LJLLJ;
                        if (sparkSchemaParam5 != null) {
                            bool = Boolean.valueOf(sparkSchemaParam5.getSkeletonWithAnimation());
                        } else {
                            bool = null;
                        }
                        SparkSchemaParam sparkSchemaParam6 = this.LJLLJ;
                        if (sparkSchemaParam6 != null && (skeletonFromAlpha = sparkSchemaParam6.getSkeletonFromAlpha()) != null) {
                            f = Float.valueOf(CastFloatProtector.parseFloat(skeletonFromAlpha));
                        } else {
                            f = null;
                        }
                        SparkSchemaParam sparkSchemaParam7 = this.LJLLJ;
                        if (sparkSchemaParam7 != null && (skeletonToAlpha = sparkSchemaParam7.getSkeletonToAlpha()) != null) {
                            f2 = Float.valueOf(CastFloatProtector.parseFloat(skeletonToAlpha));
                        } else {
                            f2 = null;
                        }
                        SparkSchemaParam sparkSchemaParam8 = this.LJLLJ;
                        if (sparkSchemaParam8 != null && (skeletonDuration = sparkSchemaParam8.getSkeletonDuration()) != null) {
                            l = Long.valueOf(skeletonDuration.intValue());
                        }
                        this.LJLJJI = abstractC60796NtY.LIZJ(file, bool, f, f2, l);
                        FD5.LJIIIZ(sparkContext.containerId, "container_skeleton", "use", null, getUrl(), sparkContext.bid, null, null, 200);
                    } else {
                        this.LJLJJI = interfaceC60814Ntq.LJIJ();
                    }
                    C60792NtU c60792NtU = C60792NtU.LIZ;
                    View view = this.LJLJJI;
                    c60792NtU.getClass();
                    C60792NtU.LJ(view);
                    View view2 = this.LJLJJI;
                    if (view2 != null) {
                        this.LJLZ.addView(view2);
                        this.LJLZ.setVisibility(0);
                        Integer num = this.LJLLL;
                        if (num != null) {
                            view2.setBackgroundColor(num.intValue());
                        }
                    }
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.param.HybridContext");
            }
        }
        InterfaceC60812Nto interfaceC60812Nto = this.LJLL;
        if (interfaceC60812Nto != null) {
            Context context2 = getContext();
            o.LJFF(context2, "context");
            interfaceC60812Nto.LIZ(context2);
            View view3 = this.LJLLI;
            if (view3 != null) {
                C16880lQ.LJZ(view3, this);
            }
            View view4 = interfaceC60812Nto.getView();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            view4.setLayoutParams(layoutParams);
            view4.setVisibility(8);
            addView(view4);
            this.LJLLI = view4;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        String str;
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            i = configuration.orientation;
        } else {
            i = 1;
        }
        if (i != this.LLII) {
            OSZ[] oszArr = new OSZ[1];
            if (i == 1 || i != 2) {
                str = "Portrait";
            } else {
                str = "Landscape";
            }
            oszArr[0] = new OSZ("screenOrientation", str);
            java.util.Map<String, ? extends Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
            InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
            if (interfaceC60761Nsz != null) {
                interfaceC60761Nsz.LIZ(LJJLIIIIJ);
            }
            this.LLII = i;
        }
    }

    @Override // X.InterfaceC60831Nu7
    public void setKeepAlive(boolean z) {
        this.LLIIIJ = z;
    }

    @Override // X.InterfaceC60831Nu7
    public void setOptimization(int i) {
        this.LLIIIILZ = i;
    }

    public final void setSparkContext(SparkContext sparkContext) {
        o.LJIIJ(sparkContext, "sparkContext");
        this.LJLILLLLZI = sparkContext;
        this.LJLJI = sparkContext;
    }

    public void setViewCreatedTime(long j) {
        this.LLIIII = j;
    }

    @Override // X.InterfaceC60831Nu7
    public final void LIZJ(Context context, C60737Nsb c60737Nsb) {
        SparkSchemaParam LJIIZILJ;
        InterfaceC60761Nsz interfaceC60761Nsz;
        o.LJIIJ(context, "context");
        InterfaceC60761Nsz interfaceC60761Nsz2 = this.LJLIL;
        if (interfaceC60761Nsz2 != null) {
            interfaceC60761Nsz2.LJII(context);
        }
        if (!(c60737Nsb instanceof SparkContext)) {
            c60737Nsb = null;
        }
        SparkContext sparkContext = (SparkContext) c60737Nsb;
        if (sparkContext != null && (LJIIZILJ = sparkContext.LJIIZILJ(-1)) != null && (interfaceC60761Nsz = this.LJLIL) != null) {
            interfaceC60761Nsz.LJIIJJI(LJIIZILJ);
        }
        if (this.LJZI == EnumC60794NtW.SUCCESS) {
            LJIL(this, Long.valueOf(System.currentTimeMillis()), null, 2);
        } else {
            this.LLF = System.currentTimeMillis();
        }
    }

    public final void LJIILIIL(SparkContext sparkContext, SparkSchemaParam sparkSchemaParam) {
        String str;
        String str2;
        Object kitView;
        LJIIIZ(sparkSchemaParam, sparkContext, true);
        SparkContext originalSparkContext = getOriginalSparkContext();
        if (originalSparkContext != null) {
            str = originalSparkContext.containerId;
        } else {
            str = null;
        }
        if (sparkContext != null) {
            str2 = sparkContext.containerId;
        } else {
            str2 = null;
        }
        F1U.LIZ.put(str, str2);
        if (sparkContext != null) {
            SparkContext.Companion.getClass();
            SparkContext.hybridContextMap.put(sparkContext.containerId, sparkContext);
            sparkContext.runtimeInfo = LJII(sparkContext);
            C38518F9u c38518F9u = sparkContext.runtimeInfo;
            if (c38518F9u != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(c38518F9u);
                LIZ(linkedHashMap);
            }
        }
        if (getOptimization() == 4 && (kitView = getKitView()) != null && (kitView instanceof WebKitView)) {
            ((OM1) kitView).onResume();
        }
        if (this.LJZI == EnumC60794NtW.SUCCESS) {
            LJIIZILJ("hybridViewCacheUsed", null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b1, code lost:
    
        r1 = (X.C60726NsQ) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b3, code lost:
    
        if (r15 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b5, code lost:
    
        r0 = r1.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b7, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b9, code lost:
    
        r0.LJIIIIZZ = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01bb, code lost:
    
        r1.load(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01be, code lost:
    
        r1 = r13.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c0, code lost:
    
        if (r1 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c2, code lost:
    
        r0 = r13.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c4, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c6, code lost:
    
        r0 = r0.url;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ca, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cb, code lost:
    
        LJIILLIIL("start", r1, r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e2, code lost:
    
        throw new X.C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d1, code lost:
    
        r0 = r13.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d3, code lost:
    
        if (r0 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d5, code lost:
    
        r0.load(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d9, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x019d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x019f, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cc, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ce, code lost:
    
        r1.LJJJZ(r13.LJLILLLLZI);
        r1 = r1.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d5, code lost:
    
        if (r1 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016e, code lost:
    
        r1 = getSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0172, code lost:
    
        if (r1 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0174, code lost:
    
        r4 = (X.AbstractC60800Ntc) r1.LIZIZ(X.AbstractC60800Ntc.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017c, code lost:
    
        r1 = getSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0180, code lost:
    
        if (r1 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0182, code lost:
    
        r1 = (X.AbstractC60811Ntn) r1.LIZIZ(X.AbstractC60811Ntn.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018a, code lost:
    
        if (r4 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018c, code lost:
    
        r4.LJJJZ(r13.LJLILLLLZI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0191, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0193, code lost:
    
        r1.LJJJZ(r13.LJLILLLLZI);
        r1 = r1.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019a, code lost:
    
        if (r1 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a1, code lost:
    
        r0 = r13.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a3, code lost:
    
        if (r0 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a5, code lost:
    
        r0 = r0.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ab, code lost:
    
        if ((r0 instanceof X.VNS) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ad, code lost:
    
        r1 = r13.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01af, code lost:
    
        if (r1 == null) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r14, com.lynx.tasm.TemplateData r15) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIILL(java.lang.String, com.lynx.tasm.TemplateData):void");
    }

    public final void LJIIZILJ(String str, JSONObject jSONObject) {
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LJIIIZ(str, jSONObject);
        }
    }

    public final void LJIJ(SparkContext sparkContext, boolean z) {
        InterfaceC60814Ntq interfaceC60814Ntq = this.LJLJLLL;
        if (interfaceC60814Ntq != null) {
            LJIJJLI(interfaceC60814Ntq, sparkContext);
            if (!z) {
                InterfaceC60814Ntq interfaceC60814Ntq2 = this.LJLJLLL;
                if (interfaceC60814Ntq2 != null) {
                    View LJIJJLI = interfaceC60814Ntq2.LJIJJLI(this);
                    this.LJLJJL = LJIJJLI;
                    C60792NtU.LIZ.getClass();
                    C60792NtU.LJ(LJIJJLI);
                    View view = this.LJLJJL;
                    if (view != null) {
                        this.LJLZ.removeAllViews();
                        this.LJLZ.addView(view);
                        this.LJLZ.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            this.LJLZ.removeAllViews();
            this.LJLZ.setVisibility(8);
        }
    }

    public final void LJIJJLI(InterfaceC60814Ntq interfaceC60814Ntq, SparkContext sparkContext) {
        AtomicBoolean atomicBoolean;
        boolean z = interfaceC60814Ntq instanceof AbstractC60796NtY;
        if (z) {
            AbstractC60796NtY abstractC60796NtY = (AbstractC60796NtY) interfaceC60814Ntq;
            if (abstractC60796NtY.LJLIL.get()) {
                return;
            } else {
                abstractC60796NtY.LIZIZ(sparkContext);
            }
        }
        Context context = getContext();
        o.LJFF(context, "context");
        interfaceC60814Ntq.LIZ(context);
        if (!z) {
            interfaceC60814Ntq = null;
        }
        AbstractC60796NtY abstractC60796NtY2 = (AbstractC60796NtY) interfaceC60814Ntq;
        if (abstractC60796NtY2 != null && (atomicBoolean = abstractC60796NtY2.LJLIL) != null) {
            atomicBoolean.set(true);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (o.LJ(str, "enable_spark_debug_label")) {
            LJIILJJIL(getHybridKitType());
        }
        if (o.LJ(str, "enable_resource_info_in_spark_debug_label")) {
            LJIILJJIL(getHybridKitType());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r2 = r10
            r0 = r11 & 2
            if (r0 == 0) goto L6
            r2 = 0
        L6:
            r3 = 0
            r0 = r11 & 8
            if (r0 == 0) goto L17
            long r4 = java.lang.System.currentTimeMillis()
        Lf:
            r1 = r9
            r0 = r8
            r6 = r3
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return
        L17:
            r4 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c0, code lost:
    
        r0 = r11.url;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c2, code lost:
    
        if (r0 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c4, code lost:
    
        r1.LJJJJJL(r2, r0);
        r1.LJJJJZ(r3);
        r1.LJJJJJ(r2);
        r1 = r1.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cf, code lost:
    
        if (r1 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d2, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bc, code lost:
    
        if (r1 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01be, code lost:
    
        if (r11 == null) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.bytedance.lynx.spark.schema.model.SparkSchemaParam r10, com.bytedance.hybrid.spark.SparkContext r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIIIZ(com.bytedance.lynx.spark.schema.model.SparkSchemaParam, com.bytedance.hybrid.spark.SparkContext, boolean):void");
    }

    public final void LJIJI(SparkContext sparkContext, boolean z, boolean z2) {
        InterfaceC60721NsL interfaceC60721NsL;
        InterfaceC60814Ntq interfaceC60814Ntq = this.LJLJLLL;
        if (interfaceC60814Ntq != null) {
            LJIJJLI(interfaceC60814Ntq, sparkContext);
            if (!z) {
                SparkSchemaParam sparkSchemaParam = this.LJLLJ;
                if (sparkSchemaParam != null && !sparkSchemaParam.getDisableAutoRemoveLoading()) {
                    this.LJLZ.removeAllViews();
                    this.LJLZ.setVisibility(8);
                }
                InterfaceC60721NsL interfaceC60721NsL2 = this.LJLLILLLL;
                if (interfaceC60721NsL2 != null) {
                    interfaceC60721NsL2.LIZIZ(100);
                }
            }
            if (z2 && (interfaceC60721NsL = this.LJLLILLLL) != null) {
                interfaceC60721NsL.LIZ(false);
            }
        }
    }

    public static void LJIL(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, Long l, java.util.Map map, int i) {
        long j;
        C38518F9u c38518F9u;
        C38518F9u c38518F9u2;
        FB9 fb9;
        int i2;
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        if (l != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getClass();
            j = l.longValue();
        } else {
            j = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJZL;
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LLFII && l != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJZL = l.longValue();
        }
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLILLLLZI;
        if (sparkContext != null && (c38518F9u2 = sparkContext.runtimeInfo) != null) {
            c38518F9u2.put("containerInitTime", (Object) String.valueOf(j));
            Object obj = c38518F9u2.get((Object) "queryItems");
            if (!C65777Prh.LJII(obj)) {
                obj = null;
            }
            java.util.Map map2 = (java.util.Map) obj;
            if (map2 != null) {
                map2.put("containerInitTime", String.valueOf(j));
            }
            Integer num = FBA.LIZIZ;
            if (num != null || ((fb9 = FBA.LIZ) != null && (num = Integer.valueOf(fb9.LIZ())) != null)) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            c38518F9u2.put("networkLevel", (Object) Integer.valueOf(i2));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLILLLLZI;
        if (sparkContext2 != null && (c38518F9u = sparkContext2.runtimeInfo) != null) {
            linkedHashMap.putAll(c38518F9u);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        InterfaceC60761Nsz interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLIL;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LIZ(linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(java.lang.String r8, X.InterfaceC60761Nsz r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIJ(r9, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIJ(r10, r0)
            com.bytedance.lynx.spark.schema.model.SparkSchemaParam r0 = r7.LJLLJ
            if (r0 == 0) goto L6f
            X.Flg r1 = r0.getEngineType()
            if (r1 == 0) goto L6f
        L14:
            X.Flg r0 = X.EnumC39924Flg.LYNX
            r6 = 0
            r2 = 0
            if (r1 != r0) goto L6d
            com.bytedance.lynx.spark.schema.model.SparkSchemaParam r0 = r7.LJLLJ
            if (r0 == 0) goto L6b
            java.lang.String r0 = r0.getFallbackUrl()
        L22:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6d
            r5 = 1
        L29:
            com.bytedance.hybrid.spark.SparkContext r1 = r7.LJLILLLLZI
            if (r1 == 0) goto L69
            java.lang.String r4 = r1.containerId
        L2f:
            X.VMb r3 = new X.VMb
            java.lang.String r0 = "hybrid_monitor_container_load_url"
            r3.<init>(r0)
            if (r1 == 0) goto L3a
            java.lang.String r2 = r1.bid
        L3a:
            r3.LIZIZ = r2
            java.lang.String r0 = r7.LLFF
            r3.LIZ = r0
            X.Fo5 r0 = X.EnumC40073Fo5.Both
            r3.LJIIJJI = r0
            java.lang.String r1 = "status"
            java.lang.String r0 = "fail_reason"
            org.json.JSONObject r2 = X.C47135Ieh.LJ(r1, r8, r0, r11)
            java.lang.String r0 = "fallback"
            r2.put(r0, r5)
            android.view.View r0 = r7.LJLJJL
            if (r0 == 0) goto L56
            r6 = 1
        L56:
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "has_error_view"
            r2.put(r0, r1)
            r3.LIZLLL = r2
            X.VMa r0 = r3.LIZ()
            X.FD5.LJ(r4, r0)
            return
        L69:
            r4 = r2
            goto L2f
        L6b:
            r0 = r2
            goto L22
        L6d:
            r5 = 0
            goto L29
        L6f:
            X.Flg r1 = X.EnumC39924Flg.UNKNOWN
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIILLIIL(java.lang.String, X.Nsz, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS(Context context, AttributeSet attributeSet, int i, long j, int i2, boolean z) {
        super(context, attributeSet, i);
        Object LIZ;
        boolean z2;
        Object LIZ2;
        boolean z3;
        Object LIZ3;
        boolean z4;
        Object LIZ4;
        boolean z5;
        Object LIZ5;
        o.LJIIJ(context, "context");
        this.LLIIII = j;
        this.LLIIIILZ = i2;
        this.LLIIIJ = z;
        this.LJZI = EnumC60794NtW.INIT;
        this.LJZL = System.currentTimeMillis();
        this.LLF = -1L;
        this.LLFF = "";
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("spark_reload_abparams");
            if (config != null) {
                LIZ = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Boolean bool = (Boolean) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        this.LLFFF = z2;
        try {
            JSONObject config2 = HybridSettings.INSTANCE.getConfig("update_runtime_info_after_reload");
            if (config2 != null) {
                LIZ2 = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config2, "enable"));
            } else {
                LIZ2 = null;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        Boolean bool2 = (Boolean) (C3C5.m12isFailureimpl(LIZ2) ? null : LIZ2);
        if (bool2 != null) {
            z3 = bool2.booleanValue();
        } else {
            z3 = true;
        }
        this.LLFII = z3;
        try {
            Object obj = ((LinkedHashMap) C39812Fjs.LIZJ).get("spark_clear_container_when_reused");
            LIZ3 = (Boolean) (obj instanceof Boolean ? obj : null);
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th3) {
            LIZ3 = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ3);
        }
        Boolean bool3 = (Boolean) (C3C5.m12isFailureimpl(LIZ3) ? null : LIZ3);
        if (bool3 != null) {
            z4 = bool3.booleanValue();
        } else {
            z4 = false;
        }
        this.LLFZ = z4;
        try {
            JSONObject config3 = HybridSettings.INSTANCE.getConfig("self_adaptive_height_on_page_update");
            if (config3 != null) {
                LIZ4 = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config3, "enable"));
            } else {
                LIZ4 = null;
            }
            C3C5.m7constructorimpl(LIZ4);
        } catch (Throwable th4) {
            LIZ4 = C141335gf.LIZ(th4);
            C3C5.m7constructorimpl(LIZ4);
        }
        Boolean bool4 = (Boolean) (C3C5.m12isFailureimpl(LIZ4) ? null : LIZ4);
        if (bool4 != null) {
            z5 = bool4.booleanValue();
        } else {
            z5 = true;
        }
        this.LLI = z5;
        try {
            Object obj2 = ((LinkedHashMap) C39812Fjs.LIZJ).get("spark_hide_loading_js");
            LIZ5 = (String) (obj2 instanceof String ? obj2 : null);
            C3C5.m7constructorimpl(LIZ5);
        } catch (Throwable th5) {
            LIZ5 = C141335gf.LIZ(th5);
            C3C5.m7constructorimpl(LIZ5);
        }
        String str = (String) (C3C5.m12isFailureimpl(LIZ5) ? null : LIZ5);
        this.LLIFFJFJJ = str != null ? str : "";
        this.LLII = 1;
        C16880lQ.LLLZIIL(R.layout.cnf, C16880lQ.LLZIL(context), this);
        View findViewById = findViewById(R.id.kef);
        o.LJFF(findViewById, "this.findViewById<FrameLayout>(R.id.statusLayout)");
        this.LJLZ = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.c3y);
        o.LJFF(findViewById2, "this.findViewById<TextView>(R.id.debug_info_tag)");
        this.LJZ = (TextView) findViewById2;
        C40343FsR.LJIILJJIL.getClass();
        C40342FsQ.LJFF();
        C39836FkG.LJII.getClass();
        if (C38262Ezy.LIZ().LIZ) {
            ((SharedPreferences) C38332F2q.LIZ.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
    }
}
