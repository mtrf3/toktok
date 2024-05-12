package X;

import X.C0JU;
import X.C61145NzB;
import X.C61146NzC;
import X.InterfaceC60761Nsz;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.ARunnableS9S0201000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ql1.IDbS498S0100000_10;

/* renamed from: X.NzB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61145NzB implements InterfaceC61155NzL {
    public static final /* synthetic */ int LJLLI = 0;
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public View LJLJJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJJL;
    public long LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;

    @Override // X.InterfaceC61155NzL
    public final void Yi() {
        this.LJLJL = true;
        C61146NzC.LIZIZ.LIZIZ(this.LJLILLLLZI, "subtitle_panel_click_button", C65232Piu.LIZJ("button_type", "setting"));
    }

    public final View LIZIZ() {
        View view = this.LJLJJI;
        if (view != null) {
            C79081V1x.LJJIIJ(EnumC61143Nz9.STEP_START, this.LJLILLLLZI, "CaptionView.create view!=null", null);
            return view;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.aw7, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…aption_list, null, false)");
        LIZ(LLLLIILL);
        this.LJLJJI = LLLLIILL;
        return LLLLIILL;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [T, X.Nz9] */
    public final void LIZ(View view) {
        boolean z;
        String str;
        VNS vns;
        int i;
        boolean z2;
        String LIZ = C61151NzH.LIZ(this.LJLILLLLZI);
        if (!this.LJLL) {
            EnumC61143Nz9 enumC61143Nz9 = EnumC61143Nz9.STEP_ROMA;
            String str2 = this.LJLILLLLZI;
            if (LIZ.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C79081V1x.LJJIII(enumC61143Nz9, str2, z2, 0L, LIZ, null, null, null, 488);
        }
        if (LIZ.length() == 0 && 1 != 0 && (i = this.LJLJLLL) <= -1) {
            this.LJLJLLL = i + 1;
            view.postDelayed(new ARunnableS9S0201000_6(1, this, view, 8), 200L);
            return;
        }
        this.LJLL = true;
        C61152NzI c61152NzI = new C61152NzI(this.LJLIL, this.LJLJI, this.LJLILLLLZI);
        String uniqueId = this.LJLILLLLZI;
        o.LJIIIZ(uniqueId, "uniqueId");
        String LIZ2 = C61151NzH.LIZ(uniqueId);
        if (LIZ2.length() == 0) {
            LIZ2 = "aweme://lynxview?channel=tiktok_lingo_dictionary_panel&bundle=pages%2Fstudy%2Fcomponents%2Fcaption-list%2Ftemplate.js&use_spark=1&dynamic=1&surl=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F10%2Fgecko%2Fresource%2Ftiktok_lingo_dictionary_panel%2Fpages%2Fstudy%2Fcomponents%2Fcaption-list%2Ftemplate.js&bdhm_bid=tiktok_lingo&use_forest=1";
        }
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context context = c61152NzI.LIZ;
        SparkContext sparkContext = new SparkContext();
        C60439Nnn c60439Nnn = new C60439Nnn();
        c60439Nnn.LIZ("awemeId", c61152NzI.LIZIZ);
        C61146NzC c61146NzC = C61146NzC.LIZIZ;
        C61150NzG LIZLLL = c61146NzC.LIZLLL(c61152NzI.LIZIZ);
        if (LIZLLL != null) {
            c60439Nnn.LIZ("fromLanguage", LIZLLL.LJLILLLLZI);
            c60439Nnn.LIZ("toLanguage", LIZLLL.LJLJI);
            c60439Nnn.LIZ("initProgress", Integer.valueOf(LIZLLL.LJLJJI));
            c60439Nnn.LIZ("fromLanguageCaptionVersion", LIZLLL.LJLJJL.LJLIL);
            c60439Nnn.LIZ("fromLanguageCaptionId", LIZLLL.LJLJJL.LJLILLLLZI);
        }
        C60606NqU c60606NqU = new C60606NqU(c60439Nnn, null, 27);
        C61150NzG LIZLLL2 = c61146NzC.LIZLLL(c61152NzI.LIZIZ);
        if (LIZLLL2 != null) {
            c60606NqU.LJIL.put("fromLanguage", LIZLLL2.LJLILLLLZI);
            c60606NqU.LJIL.put("toLanguage", LIZLLL2.LJLJI);
        }
        ACZ LJIIIIZZ = c61146NzC.LJIIIIZZ(c61152NzI.LIZIZ);
        if (LJIIIIZZ != null) {
            c60606NqU.LJIL.put("useTranslatedLanguage", LJIIIIZZ.LJLILLLLZI);
            c60606NqU.LJIL.put("captionType", LJIIIIZZ.LJLJI);
            c60606NqU.LJIL.put("captionSourceLanguage", LJIIIIZZ.LJLJJI);
            c60606NqU.LJIL.put("groupId", LJIIIIZZ.LJLJJL);
            c60606NqU.LJIL.put("authorId", LJIIIIZZ.LJLJJLL);
            c60606NqU.LJIL.put("itemDuration", LJIIIIZZ.LJLJJLL);
            c60606NqU.LJIL.put("enterMethod", LJIIIIZZ.LJLJLJ);
            c60606NqU.LJIL.put("enterFrom", LJIIIIZZ.LJLIL);
            c60606NqU.LJIL.put("pageStartTime", String.valueOf(c61152NzI.LIZJ));
        }
        c60606NqU.LJIL.put("pageStartTime", String.valueOf(System.currentTimeMillis()));
        c60606NqU.LJFF(ORZ.LLJILJILJ(C58207Mst.LIZIZ.LIZ()));
        sparkContext.hybridParams = c60606NqU;
        sparkContext.LJJIJLIJ(LIZ2);
        sparkContext.LJJI(new IDbS498S0100000_10(c61152NzI, 1));
        C25836ACa LIZJ = c61146NzC.LIZJ(c61152NzI.LIZIZ);
        if (LIZJ != null && LIZJ.LJLJI) {
            sparkContext.LJJIFFI(1, "enable_prefetch");
        }
        Y7M LJII = c61146NzC.LJII(c61152NzI.LIZIZ);
        if (LJII != null) {
            sparkContext.LJII(C37944Euq.class, new C37950Euw(LJII));
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ2 = KMP.LIZJ(c40342FsQ, context, sparkContext);
        C25836ACa LIZJ3 = c61146NzC.LIZJ(c61152NzI.LIZIZ);
        if (LIZJ3 != null) {
            boolean z3 = LIZJ3.LJLIL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z3) {
                str = "dark";
            } else {
                str = "light";
            }
            linkedHashMap.put("appTheme", str);
            InterfaceC60761Nsz interfaceC60761Nsz = LIZJ2.LJLIL;
            if (interfaceC60761Nsz != null) {
                interfaceC60761Nsz.LIZ(linkedHashMap);
            }
            float f = LIZJ3.LJLILLLLZI;
            Object kitView = LIZJ2.getKitView();
            if ((kitView instanceof C60726NsQ) && (vns = (VNS) kitView) != null) {
                vns.updateFontScacle(f);
            }
        }
        String materialId = c61152NzI.LIZIZ;
        o.LJIIIZ(materialId, "materialId");
        Object kitView2 = LIZJ2.getKitView();
        if (kitView2 == null) {
            C79081V1x.LJJIIJ(EnumC61143Nz9.STEP_SPARK, materialId, "kitView == null", null);
        } else if (!(kitView2 instanceof C60726NsQ)) {
            C79081V1x.LJJIIJ(EnumC61143Nz9.STEP_SPARK, materialId, "kitView !is LynxKitView", null);
        } else {
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = EnumC61143Nz9.STEP_SPARK;
            ((VNS) kitView2).addLynxViewClient(new C61142Nz8(c68322mC, materialId, LIZ2));
        }
        LIZJ2.LIZIZ();
        if (LIZJ2.getKitView() == null && this.LJLJLLL <= -1) {
            C79081V1x.LJJIII(EnumC61143Nz9.STEP_SPARK, this.LJLILLLLZI, false, 0L, null, null, null, null, 472);
            LIZJ2.LJFF(true);
            this.LJLJLLL++;
            view.postDelayed(new ARunnableS9S0201000_6(2, this, view, 10), 200L);
            return;
        }
        EnumC61143Nz9 enumC61143Nz92 = EnumC61143Nz9.STEP_SPARK;
        String str3 = this.LJLILLLLZI;
        if (LIZJ2.getKitView() != null) {
            z = true;
        } else {
            z = false;
        }
        C79081V1x.LJJIII(enumC61143Nz92, str3, z, 0L, null, null, null, null, 504);
        this.LJLJJL = LIZJ2;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bs8);
        if (viewGroup == null) {
            return;
        }
        viewGroup.addView(LIZJ2, new ViewGroup.LayoutParams(-1, -1));
    }

    public C61145NzB(Context context, Lifecycle lifecycle, String uniqueId) {
        o.LJIIIZ(uniqueId, "uniqueId");
        this.LJLIL = context;
        this.LJLILLLLZI = uniqueId;
        this.LJLJI = System.currentTimeMillis();
        this.LJLJLJ = true;
        lifecycle.addObserver(new LifecycleObserver() { // from class: com.lingo.caption.ui.CaptionView$observeLifecycle$1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                C61146NzC.LIZIZ.LJI(C61145NzB.this.LJLILLLLZI);
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = C61145NzB.this.LJLJJL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJFF(true);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                InterfaceC60761Nsz kitView;
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = C61145NzB.this.LJLJJL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                    kitView.onHide();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                InterfaceC60761Nsz kitView;
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = C61145NzB.this.LJLJJL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                    kitView.onShow();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onStart() {
                InterfaceC60761Nsz kitView;
                InterfaceC60761Nsz kitView2;
                C61145NzB.this.LJLJJLL = System.currentTimeMillis();
                C61145NzB c61145NzB = C61145NzB.this;
                if (c61145NzB.LJLJLJ) {
                    c61145NzB.LJLJLJ = false;
                    return;
                }
                if (c61145NzB.LJLJL) {
                    c61145NzB.LJLJL = false;
                    LinkedHashMap LIZ = C0JU.LIZ("enterMethod", "caption_setting");
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c61145NzB.LJLJJL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                        kitView2.LIZ(LIZ);
                    }
                } else {
                    LinkedHashMap LIZ2 = C0JU.LIZ("enterMethod", "others");
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c61145NzB.LJLJJL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) != null) {
                        kitView.LIZ(LIZ2);
                    }
                }
                C61145NzB c61145NzB2 = C61145NzB.this;
                c61145NzB2.getClass();
                C61146NzC.LIZIZ.LIZIZ(c61145NzB2.LJLILLLLZI, "subtitle_panel_show", null);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onStop() {
                C61145NzB c61145NzB = C61145NzB.this;
                c61145NzB.getClass();
                C61146NzC c61146NzC = C61146NzC.LIZIZ;
                String str = c61145NzB.LJLILLLLZI;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stay_time", System.currentTimeMillis() - c61145NzB.LJLJJLL);
                c61146NzC.LIZIZ(str, "subtitle_panel_exit", jSONObject);
            }
        });
    }
}
