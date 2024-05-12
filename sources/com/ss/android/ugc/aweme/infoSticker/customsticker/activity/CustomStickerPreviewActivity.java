package com.ss.android.ugc.aweme.infoSticker.customsticker.activity;

import X.AbstractActivityC162676Zz;
import X.C143725kW;
import X.C165616ej;
import X.C16880lQ;
import X.C170576mj;
import X.C44272HZc;
import X.C63081OpJ;
import X.C65803Ps7;
import X.C73318Sq2;
import X.C77412UZs;
import X.C82573Wav;
import X.C82580Wb2;
import X.HEP;
import X.InterfaceC80245VeT;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CustomStickerPreviewActivity extends AbstractActivityC162676Zz {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public C143725kW LJLJLLL;
    public EditPreviewStickerViewModel LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public CreativeInfo LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C143725kW c143725kW = this.LJLJLLL;
        if (c143725kW != null) {
            if (((C82573Wav) c143725kW.LJLJI.getValue()).LLIILZL == 2) {
                super.onBackPressed();
                return;
            }
            C143725kW c143725kW2 = this.LJLJLLL;
            if (c143725kW2 != null) {
                if (((C82573Wav) c143725kW2.LJLJI.getValue()).LLIIJI) {
                    return;
                }
                C143725kW c143725kW3 = this.LJLJLLL;
                if (c143725kW3 != null) {
                    if (((C82573Wav) c143725kW3.LJLJI.getValue()).LLIILZL == 1) {
                        EditPreviewStickerViewModel editPreviewStickerViewModel = this.LJLL;
                        if (editPreviewStickerViewModel != null) {
                            C73318Sq2 c73318Sq2 = editPreviewStickerViewModel.LJLJJLL;
                            if (c73318Sq2 != null) {
                                c73318Sq2.dispose();
                            }
                            editPreviewStickerViewModel.setState(C82580Wb2.LJLIL);
                            return;
                        }
                        o.LJIJI("customStickerViewModel");
                        throw null;
                    }
                    super.onBackPressed();
                    return;
                }
                o.LJIJI("rootScene");
                throw null;
            }
            o.LJIJI("rootScene");
            throw null;
        }
        o.LJIJI("rootScene");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        overridePendingTransition(0, 0);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
        int max = Math.max(C63081OpJ.LJJJJLI(this) - ((int) C170576mj.LIZ(this, 8.0f)), 0) + ((int) C170576mj.LIZ(this, 24.5f));
        View findViewById = findViewById(R.id.aeg);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = max;
        findViewById.setLayoutParams(layoutParams2);
    }

    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.dx);
        this.LJLLL = C77412UZs.LJIJI(getIntent());
        this.LJLLI = C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_way");
        this.LJLLILLLL = C16880lQ.LLJJIJIIJIL(getIntent(), "content_source");
        this.LJLLJ = C16880lQ.LLJJIJIIJIL(getIntent(), "content_type");
        MediaModel mediaModel = (MediaModel) getIntent().getParcelableExtra("preview_sticker_params");
        if (mediaModel != null) {
            Effect effect = (Effect) getIntent().getParcelableExtra("custom_sticker");
            String str = this.LJLLI;
            String str2 = this.LJLLILLLL;
            String str3 = this.LJLLJ;
            CreativeInfo creativeInfo = this.LJLLL;
            if (creativeInfo != null) {
                this.LJLJLLL = new C143725kW(mediaModel, effect, str, str2, str3, creativeInfo);
                HEP LIZ = C44272HZc.LIZ(this, C143725kW.class);
                LIZ.LJI = false;
                LIZ.LJII = new InterfaceC80245VeT() { // from class: X.6be
                    @Override // X.InterfaceC80245VeT
                    public final WM7 LIZ(ClassLoader classLoader, String className) {
                        o.LJIIIZ(classLoader, "<anonymous parameter 0>");
                        o.LJIIIZ(className, "className");
                        if (!o.LJ(C143725kW.class.getName(), className)) {
                            return null;
                        }
                        C143725kW c143725kW = CustomStickerPreviewActivity.this.LJLJLLL;
                        if (c143725kW != null) {
                            return c143725kW;
                        }
                        o.LJIJI("rootScene");
                        throw null;
                    }
                };
                LIZ.LIZLLL = false;
                LIZ.LJ = false;
                LIZ.LJFF = R.id.j5l;
                LIZ.LIZ();
            } else {
                o.LJIJI("creativeInfo");
                throw null;
            }
        }
        JediViewModel LIZ2 = C165616ej.LIZ(this).LIZ(EditPreviewStickerViewModel.class);
        o.LJIIIIZZ(LIZ2, "of(this).get(EditPreview…kerViewModel::class.java)");
        EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) LIZ2;
        this.LJLL = editPreviewStickerViewModel;
        editPreviewStickerViewModel.setState(new AqS180S0100000_14((MediaModel) getIntent().getParcelableExtra("preview_sticker_params"), 335));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onCreate", false);
    }
}
