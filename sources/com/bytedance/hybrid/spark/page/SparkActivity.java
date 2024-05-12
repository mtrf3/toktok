package com.bytedance.hybrid.spark.page;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C37682Eqc;
import X.C39386Fd0;
import X.C39647FhD;
import X.C40176Fpk;
import X.C60605NqT;
import X.C60806Nti;
import X.C60842NuI;
import X.C60843NuJ;
import X.C60848NuO;
import X.C60851NuR;
import X.C60853NuT;
import X.C60854NuU;
import X.C60855NuV;
import X.C60856NuW;
import X.C60857NuX;
import X.C60858NuY;
import X.C60859NuZ;
import X.C60860Nua;
import X.C60861Nub;
import X.C60862Nuc;
import X.C60863Nud;
import X.C60864Nue;
import X.C60869Nuj;
import X.C60908NvM;
import X.C60963NwF;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C76965UIn;
import X.C85999Xp5;
import X.F1T;
import X.InterfaceC32055Ci3;
import X.InterfaceC40159FpT;
import X.InterfaceC58316Mue;
import X.InterfaceC60761Nsz;
import X.InterfaceC60850NuQ;
import X.L7N;
import X.M2K;
import X.NZ1;
import X.OK0;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.AqS63S0000000_10;
import kotlin.jvm.internal.AqS74S0201000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class SparkActivity extends ActivityC45651qj implements InterfaceC40159FpT, InterfaceC32055Ci3, ViewTreeObserver.OnGlobalLayoutListener {
    public SparkContext LJLIL;
    public InterfaceC58316Mue LJLILLLLZI;
    public final AppCompatDelegateImpl LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public Integer LJLJJLL;
    public L7N LJLJL;
    public boolean LJLJLJ;
    public ImmersionBar LJLJLLL;
    public SparkPageSchemaParam LJLL;
    public SparkFragment LJLLI;
    public boolean LJLLILLLL;
    public M2K LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public String LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C60842NuI LLF;
    public C60869Nuj LLFF;
    public NZ1 LLFFF;

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
        this.LJLZ = false;
        finish();
        this.LJLZ = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLIIIZ(true);
        if (LLII()) {
            return;
        }
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        C60848NuO c60848NuO = C60848NuO.LJLIL;
        Iterator<InterfaceC60850NuQ> it = c60842NuI.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC60850NuQ cb = it.next();
            o.LJFF(cb, "cb");
            if (((Boolean) c60848NuO.invoke(cb, this)).booleanValue()) {
                return;
            }
        }
        super.onBackPressed();
    }

    public final SparkFragment LLFZ() {
        SparkFragment sparkFragment = this.LJLLI;
        if (sparkFragment != null) {
            return sparkFragment;
        }
        o.LJIJI("sparkFragment");
        throw null;
    }

    public final void LLIIIILZ() {
        String str;
        boolean z;
        boolean z2;
        C37682Eqc.LIZIZ(this.LJLIL, "SparkActivity", "initStatusBar");
        ImmersionBar LJIILIIL = ImmersionBar.LJIILIIL(this);
        this.LJLJLLL = LJIILIIL;
        if (this.LJLJJL) {
            LJIILIIL.LIZLLL(OK0.FLAG_HIDE_STATUS_BAR);
        } else {
            LJIILIIL.LIZLLL(OK0.FLAG_SHOW_BAR);
        }
        Integer num = this.LJLJJLL;
        if (num != null) {
            int intValue = num.intValue();
            ImmersionBar immersionBar = this.LJLJLLL;
            if (immersionBar != null) {
                immersionBar.LJFF.LJLIL = intValue;
            }
        }
        L7N l7n = this.LJLJL;
        boolean z3 = false;
        if (l7n != null) {
            ImmersionBar immersionBar2 = this.LJLJLLL;
            if (immersionBar2 != null) {
                if (l7n == L7N.DARK) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                immersionBar2.LJIIJ(z2);
            }
            ImmersionBar immersionBar3 = this.LJLJLLL;
            if (immersionBar3 != null) {
                if (l7n == L7N.DARK) {
                    z = true;
                } else {
                    z = false;
                }
                immersionBar3.LJII(z);
            }
        }
        if (this.LJLJLJ) {
            ImmersionBar immersionBar4 = this.LJLJLLL;
            if (immersionBar4 != null) {
                immersionBar4.LJIIL();
            }
        } else {
            Integer num2 = this.LJLJJLL;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                ImmersionBar immersionBar5 = this.LJLJLLL;
                if (immersionBar5 != null) {
                    immersionBar5.LJFF.LJLIL = intValue2;
                }
            }
        }
        SparkPageSchemaParam sparkPageSchemaParam = this.LJLL;
        if (sparkPageSchemaParam != null) {
            if (sparkPageSchemaParam.getTransNavigationBar()) {
                ImmersionBar immersionBar6 = this.LJLJLLL;
                if (immersionBar6 != null) {
                    immersionBar6.LJIIJJI();
                }
            } else {
                SparkPageSchemaParam sparkPageSchemaParam2 = this.LJLL;
                if (sparkPageSchemaParam2 != null) {
                    C60908NvM navigationBarBgColor = sparkPageSchemaParam2.getNavigationBarBgColor();
                    if (navigationBarBgColor != null) {
                        SparkContext sparkContext = this.LJLIL;
                        if (sparkContext != null) {
                            str = sparkContext.LJIJ();
                        } else {
                            str = null;
                        }
                        int color = navigationBarBgColor.getColor(this, str);
                        ImmersionBar immersionBar7 = this.LJLJLLL;
                        if (immersionBar7 != null) {
                            immersionBar7.LJFF.LJLILLLLZI = color;
                        }
                    }
                } else {
                    o.LJIJI("schemaParams");
                    throw null;
                }
            }
            View view = (View) this.LJZI.getValue();
            if (!this.LJLJLJ) {
                SparkPageSchemaParam sparkPageSchemaParam3 = this.LJLL;
                if (sparkPageSchemaParam3 != null) {
                    if (!sparkPageSchemaParam3.getTransNavigationBar()) {
                        z3 = true;
                    }
                } else {
                    o.LJIJI("schemaParams");
                    throw null;
                }
            }
            view.setFitsSystemWindows(z3);
            ImmersionBar immersionBar8 = this.LJLJLLL;
            if (immersionBar8 != null) {
                immersionBar8.LJ();
                return;
            }
            return;
        }
        o.LJIJI("schemaParams");
        throw null;
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl == null) {
            MenuInflater menuInflater = super.getMenuInflater();
            o.LJFF(menuInflater, "super.getMenuInflater()");
            return menuInflater;
        }
        MenuInflater LJIIJ = appCompatDelegateImpl.LJIIJ();
        o.LJFF(LJIIJ, "it.menuInflater");
        return LJIIJ;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJIILIIL();
        } else {
            super.invalidateOptionsMenu();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View decorView;
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int i = rect.bottom;
        int i2 = this.LJLLLLLL;
        if (i2 == 0) {
            this.LJLLLLLL = i;
            return;
        }
        if (i2 == i) {
            return;
        }
        if (i2 - i > 100) {
            LLIIIJ(Math.abs(i - i2));
            this.LJLLLLLL = i;
        } else if (i - i2 > 100) {
            LLIIIJ(-Math.abs(i - i2));
            this.LJLLLLLL = i;
        }
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPostResume() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJIJ();
        }
        super.onPostResume();
    }

    @Override // X.NV7
    public final void refresh() {
        C37682Eqc.LIZIZ(this.LJLIL, "SparkActivity", "refresh");
        SparkFragment sparkFragment = this.LJLLI;
        if (sparkFragment != null) {
            sparkFragment.refresh();
        } else {
            o.LJIJI("sparkFragment");
            throw null;
        }
    }

    public SparkActivity() {
        this.LJLJI = C60806Nti.LIZ ? new AppCompatDelegateImpl(this, null, null, this) : null;
        this.LJLZ = true;
        this.LJZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 20));
        this.LJZL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 23));
        this.LL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 22));
        this.LLD = C221108m2.LIZIZ(new AqS160S0100000_10(this, 19));
        this.LLF = new C60842NuI();
        this.LLFFF = new C60843NuJ(this);
    }

    public final boolean LLII() {
        String str;
        InterfaceC60761Nsz interfaceC60761Nsz;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("disableBackPress:");
        C76965UIn.LIZJ(LIZ, this.LJLJJI, ", disableHardwareBackPress:", false, ", disableNavitageBackPress:");
        LIZ.append(this.LJLLILLLL);
        C37682Eqc.LIZIZ(this.LJLIL, "SparkActivity", X1D.LIZIZ(LIZ));
        SparkContext sparkContext = this.LJLIL;
        if (sparkContext == null || (str = sparkContext.containerId) == null) {
            str = "";
        }
        boolean LIZIZ = F1T.LIZIZ(str);
        SparkFragment sparkFragment = this.LJLLI;
        if (sparkFragment != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
            } else {
                interfaceC60761Nsz = null;
            }
            SparkPageSchemaParam sparkPageSchemaParam = this.LJLL;
            if (sparkPageSchemaParam != null) {
                if (F1T.LIZ(interfaceC60761Nsz, LIZIZ, sparkPageSchemaParam.getBlockBackPress())) {
                    return true;
                }
                SparkFragment sparkFragment2 = this.LJLLI;
                if (sparkFragment2 != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = sparkFragment2.LJLJI;
                    if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 == null || !sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LJIIIIZZ()) && !this.LJLJJI) {
                        return false;
                    }
                    return true;
                }
                o.LJIJI("sparkFragment");
                throw null;
            }
            o.LJIJI("schemaParams");
            throw null;
        }
        o.LJIJI("sparkFragment");
        throw null;
    }

    @Override // android.app.Activity
    public final void finish() {
        C40176Fpk c40176Fpk;
        if (isFinishing()) {
            return;
        }
        super.finish();
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, C60864Nue.LJLIL);
        C60842NuI c60842NuI2 = this.LLF;
        boolean z = this.LJLZ;
        c60842NuI2.getClass();
        c60842NuI2.LIZ(this, new AqS63S0000000_10(z, 16));
        M2K m2k = this.LJLLJ;
        if (m2k != null) {
            c40176Fpk = m2k.LJIJI();
        } else {
            c40176Fpk = null;
        }
        SparkPageSchemaParam sparkPageSchemaParam = this.LJLL;
        if (sparkPageSchemaParam != null) {
            if (sparkPageSchemaParam.getForbiddenAnim()) {
                overridePendingTransition(0, 0);
            } else if (c40176Fpk == null) {
                if (C60963NwF.LIZ(this)) {
                    overridePendingTransition(R.anim.g6, R.anim.g7);
                } else {
                    overridePendingTransition(R.anim.g5, R.anim.g8);
                }
            } else {
                overridePendingTransition(c40176Fpk.LJLIL, c40176Fpk.LJLILLLLZI);
            }
            SparkFragment sparkFragment = this.LJLLI;
            if (sparkFragment != null) {
                sparkFragment.finish();
                return;
            } else {
                o.LJIJI("sparkFragment");
                throw null;
            }
        }
        o.LJIJI("schemaParams");
        throw null;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = super.getResources();
        o.LJFF(resources, "super.getResources()");
        return resources;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, C60856NuW.LJLIL);
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        List<InterfaceC60850NuQ> list;
        C65803Ps7.LIZIZ(this);
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJIILLIIL();
        }
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, C60862Nuc.LJLIL);
        super.onDestroy();
        C60842NuI c60842NuI2 = this.LLF;
        c60842NuI2.getClass();
        c60842NuI2.LIZ(this, C60857NuX.LJLIL);
        C60869Nuj c60869Nuj = this.LLFF;
        if (c60869Nuj != null && (list = c60869Nuj.LIZ) != null) {
            for (InterfaceC60850NuQ callback : list) {
                C60842NuI c60842NuI3 = this.LLF;
                c60842NuI3.getClass();
                o.LJIIJ(callback, "callback");
                c60842NuI3.LIZ.remove(callback);
            }
        }
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        InterfaceC60761Nsz kitView;
        C65803Ps7.LIZJ(this);
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, C60863Nud.LJLIL);
        super.onPause();
        C60842NuI c60842NuI2 = this.LLF;
        c60842NuI2.getClass();
        c60842NuI2.LIZ(this, C60858NuY.LJLIL);
        SparkFragment sparkFragment = this.LJLLI;
        if (sparkFragment != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.onHide();
                return;
            }
            return;
        }
        o.LJIJI("sparkFragment");
        throw null;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        InterfaceC60761Nsz kitView;
        C65803Ps7.LIZLLL(this);
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, C60853NuT.LJLIL);
        super.onResume();
        C60842NuI c60842NuI2 = this.LLF;
        c60842NuI2.getClass();
        c60842NuI2.LIZ(this, C60859NuZ.LJLIL);
        SparkFragment sparkFragment = this.LJLLI;
        if (sparkFragment != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.onShow();
                return;
            }
            return;
        }
        o.LJIJI("sparkFragment");
        throw null;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJ();
        }
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, C60854NuU.LJLIL);
        super.onStart();
        C60842NuI c60842NuI2 = this.LLF;
        c60842NuI2.getClass();
        c60842NuI2.LIZ(this, C60860Nua.LJLIL);
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJIJJLI();
        }
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, C60855NuV.LJLIL);
        super.onStop();
        C60842NuI c60842NuI2 = this.LLF;
        c60842NuI2.getClass();
        c60842NuI2.LIZ(this, C60861Nub.LJLIL);
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

    @Override // X.InterfaceC40159FpT
    public final void close() {
        finish();
    }

    public static final /* synthetic */ SparkPageSchemaParam LLFII(SparkActivity sparkActivity) {
        SparkPageSchemaParam sparkPageSchemaParam = sparkActivity.LJLL;
        if (sparkPageSchemaParam != null) {
            return sparkPageSchemaParam;
        }
        o.LJIJI("schemaParams");
        throw null;
    }

    public final void LLIIIJ(int i) {
        boolean z;
        InterfaceC60761Nsz kitView;
        if (i > 0) {
            z = true;
        } else {
            z = false;
            i = 0;
        }
        int LJIIJ = C60605NqT.LJIIJ(i, this);
        SparkFragment sparkFragment = this.LJLLI;
        if (sparkFragment != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("visible", z);
                jSONObject.put("height", LJIIJ);
                kitView.LJIIIZ("keyboardStatusChange", jSONObject);
                return;
            }
            return;
        }
        o.LJIJI("sparkFragment");
        throw null;
    }

    public final void LLIIIZ(boolean z) {
        String str;
        String str2;
        InterfaceC60761Nsz kitView;
        InterfaceC60761Nsz kitView2;
        if (z) {
            str = "hardwareBackPress";
        } else {
            str = "navBarBackPress";
        }
        JSONObject jSONObject = new JSONObject();
        SparkContext sparkContext = this.LJLIL;
        if (sparkContext != null) {
            str2 = sparkContext.containerId;
        } else {
            str2 = null;
        }
        jSONObject.put("containerId", str2);
        jSONObject.put("actionFrom", str);
        SparkFragment sparkFragment = this.LJLLI;
        if (sparkFragment != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView2.LJIIIZ("sparkPageBackEvent", jSONObject);
            }
            SparkFragment sparkFragment2 = this.LJLLI;
            if (sparkFragment2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = sparkFragment2.LJLJI;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) != null) {
                    kitView.LJIIIZ("pageFinishBackEvent", jSONObject);
                    return;
                }
                return;
            }
            o.LJIJI("sparkFragment");
            throw null;
        }
        o.LJIJI("sparkFragment");
        throw null;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        CrashSdkImpl.LJ().LIZLLL(context);
        Context LIZ = C39386Fd0.LIZ(context);
        C39647FhD.LIZLLL(LIZ);
        Iterator<InterfaceC60850NuQ> it = this.LLF.LIZ.iterator();
        while (it.hasNext()) {
            it.next().attachPreBaseContext(this);
        }
        super.attachBaseContext(LIZ);
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        Iterator<InterfaceC60850NuQ> it2 = c60842NuI.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().attachBaseContext(LIZ, this);
        }
    }

    @Override // X.InterfaceC32055Ci3
    public final void ec(InterfaceC58316Mue interfaceC58316Mue) {
        this.LJLILLLLZI = interfaceC58316Mue;
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl == null) {
            return (T) super.findViewById(i);
        }
        return (T) appCompatDelegateImpl.LJII(i);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIJ(newConfig, "newConfig");
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJIILJJIL(newConfig);
        }
        super.onConfigurationChanged(newConfig);
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, new AqS192S0100000_10(newConfig, 44));
        C85999Xp5.LJFF(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x02b9, code lost:
    
        if (r0.getShowNavBarInTransStatusBar() != false) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJJJ();
        }
        super.onPostCreate(bundle);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIJ(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, new AqS192S0100000_10(savedInstanceState, 46));
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIJ(outState, "outState");
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, new AqS192S0100000_10(outState, 41));
        super.onSaveInstanceState(outState);
        outState.putString("sparkInsureUrl", this.LJZ);
        C60842NuI c60842NuI2 = this.LLF;
        c60842NuI2.getClass();
        c60842NuI2.LIZ(this, new AqS192S0100000_10(outState, 49));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, new C60851NuR(z));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJJI(i);
        } else {
            super.setContentView(i);
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJJIIZ(charSequence);
        }
        super.setTitle(charSequence);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJJIFFI(view);
        } else {
            super.setContentView(view);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LIZLLL(view, layoutParams);
        } else {
            super.addContentView(view, layoutParams);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl != null) {
            appCompatDelegateImpl.LJJII(view, layoutParams);
        } else {
            super.setContentView(view, layoutParams);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1.onActivityResult(r3, r4, r5);
        r1 = r1.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if ((r1 instanceof X.AbstractC60817Ntt) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r1 = (X.AbstractC60817Ntt) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            X.Mue r0 = r2.LJLILLLLZI
            if (r0 == 0) goto L7
            r0.onActivityResult(r3, r4, r5)
        L7:
            com.bytedance.hybrid.spark.SparkContext r1 = r2.LJLIL
            if (r1 == 0) goto L18
            java.lang.Class<X.NjY> r0 = X.InterfaceC60176NjY.class
            java.lang.Object r0 = r1.LIZIZ(r0)
            X.NjY r0 = (X.InterfaceC60176NjY) r0
            if (r0 == 0) goto L18
            r0.onActivityResult(r3, r4, r5)
        L18:
            com.bytedance.hybrid.spark.SparkContext r1 = r2.LJLIL
            if (r1 == 0) goto L36
            java.lang.Class<X.Ntt> r0 = X.AbstractC60817Ntt.class
            java.lang.Object r1 = r1.LIZIZ(r0)
            X.Ntt r1 = (X.AbstractC60817Ntt) r1
            if (r1 == 0) goto L36
        L26:
            r1.onActivityResult(r3, r4, r5)
            T r1 = r1.LJLIL
            if (r1 == 0) goto L36
            boolean r0 = r1 instanceof X.AbstractC60817Ntt
            if (r0 == 0) goto L36
            X.Ntt r1 = (X.AbstractC60817Ntt) r1
            if (r1 == 0) goto L36
            goto L26
        L36:
            X.NuI r1 = r2.LLF
            r1.getClass()
            X.NuS r0 = new X.NuS
            r0.<init>(r3, r4, r5)
            r1.LIZ(r2, r0)
            super.onActivityResult(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        o.LJIIJ(permissions, "permissions");
        o.LJIIJ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        C60842NuI c60842NuI = this.LLF;
        c60842NuI.getClass();
        c60842NuI.LIZ(this, new AqS74S0201000_10(i, permissions, grantResults, 0));
    }
}
