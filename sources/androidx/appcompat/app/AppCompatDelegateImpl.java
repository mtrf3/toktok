package androidx.appcompat.app;

import X.AbstractC009301x;
import X.AbstractC25580zS;
import X.AnonymousClass021;
import X.AnonymousClass022;
import X.AnonymousClass026;
import X.AnonymousClass027;
import X.AnonymousClass033;
import X.AnonymousClass037;
import X.C011902x;
import X.C021806s;
import X.C02A;
import X.C02E;
import X.C02J;
import X.C03R;
import X.C06700Oc;
import X.C06710Od;
import X.C07W;
import X.C0MA;
import X.C16300kU;
import X.C16330kX;
import X.C16340kY;
import X.C16650l3;
import X.C16880lQ;
import X.C18M;
import X.C18N;
import X.C18O;
import X.C18P;
import X.C18Q;
import X.C18R;
import X.C18S;
import X.C25600zU;
import X.C25650zZ;
import X.C280418e;
import X.C280718h;
import X.C281218m;
import X.C281318n;
import X.C281718r;
import X.C29S;
import X.C31309CQn;
import X.C36421bq;
import X.C51639KOl;
import X.InterfaceC25570zR;
import Y.IDRunnableS85S0100000;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import o3.h0;

/* loaded from: classes.dex */
public final class AppCompatDelegateImpl extends AnonymousClass027 implements C02J, LayoutInflater.Factory2 {
    public static final C0MA<String, Integer> LLIZLLLIL = new C0MA<>();
    public static final int[] LLJ = {R.attr.windowBackground};
    public static final boolean LLJI = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean LLJIJIL = true;
    public final Object LJLJJI;
    public final Context LJLJJL;
    public Window LJLJJLL;
    public C18O LJLJL;
    public final AnonymousClass026 LJLJLJ;
    public AnonymousClass021 LJLJLLL;
    public C25650zZ LJLL;
    public CharSequence LJLLI;
    public AnonymousClass037 LJLLILLLL;
    public C18M LJLLJ;
    public C18S LJLLL;
    public AbstractC25580zS LJLLLL;
    public C281718r LJLLLLLL;
    public PopupWindow LJLZ;
    public IDRunnableS85S0100000 LJZ;
    public C16650l3 LJZI;
    public boolean LL;
    public ViewGroup LLD;
    public TextView LLF;
    public View LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public PanelFeatureState[] LLIIIJ;
    public PanelFeatureState LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public Configuration LLIILII;
    public final int LLIILZL;
    public int LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public C18Q LLILIL;
    public C18P LLILL;
    public boolean LLILLIZIL;
    public int LLILLJJLI;
    public boolean LLILZ;
    public Rect LLILZIL;
    public Rect LLILZLL;
    public C02A LLIZ;
    public final boolean LJZL = true;
    public final IDRunnableS85S0100000 LLILLL = new IDRunnableS85S0100000(this, 2);

    @Override // X.AnonymousClass027
    public final boolean LJ() {
        return LJJIJ(true);
    }

    @Override // X.AnonymousClass027
    public final void LJIJI(Bundle bundle) {
    }

    @Override // X.AnonymousClass027
    public final AnonymousClass022 LJIIIIZZ() {
        return new AnonymousClass022() { // from class: X.18L
        };
    }

    @Override // X.AnonymousClass027
    public final MenuInflater LJIIJ() {
        Context context;
        if (this.LJLL == null) {
            LJJJJIZL();
            AnonymousClass021 anonymousClass021 = this.LJLJLLL;
            if (anonymousClass021 != null) {
                context = anonymousClass021.LJ();
            } else {
                context = this.LJLJJL;
            }
            this.LJLL = new C25650zZ(context);
        }
        return this.LJLL;
    }

    @Override // X.AnonymousClass027
    public final void LJIIL() {
        LayoutInflater LLZIL = C16880lQ.LLZIL(this.LJLJJL);
        if (LLZIL.getFactory() == null) {
            LLZIL.setFactory2(this);
        } else {
            LLZIL.getFactory2();
        }
    }

    @Override // X.AnonymousClass027
    public final void LJIILIIL() {
        if (this.LJLJLLL != null) {
            LJJJJIZL();
            if (this.LJLJLLL.LJI()) {
                return;
            }
            this.LLILLJJLI |= 1;
            if (this.LLILLIZIL) {
                return;
            }
            C16300kU.LJIIL(this.LJLJJLL.getDecorView(), this.LLILLL);
            this.LLILLIZIL = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // X.AnonymousClass027
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.LJLJJI
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r1 = X.AnonymousClass027.LJLJI
            monitor-enter(r1)
            X.AnonymousClass027.LJIL(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
        L11:
            boolean r0 = r3.LLILLIZIL
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.LJLJJLL
            android.view.View r1 = r0.getDecorView()
            Y.IDRunnableS85S0100000 r0 = r3.LLILLL
            r1.removeCallbacks(r0)
        L20:
            r0 = 1
            r3.LLIIL = r0
            int r1 = r3.LLIILZL
            r0 = -100
            if (r1 == r0) goto L62
            java.lang.Object r1 = r3.LJLJJI
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L62
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            if (r0 == 0) goto L62
            X.0MA<java.lang.String, java.lang.Integer> r2 = androidx.appcompat.app.AppCompatDelegateImpl.LLIZLLLIL
            java.lang.Object r0 = r3.LJLJJI
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getName()
            int r0 = r3.LLIILZL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
        L4c:
            X.021 r0 = r3.LJLJLLL
            if (r0 == 0) goto L53
            r0.LJIIIIZZ()
        L53:
            X.18Q r0 = r3.LLILIL
            if (r0 == 0) goto L5a
            r0.LIZ()
        L5a:
            X.18P r0 = r3.LLILL
            if (r0 == 0) goto L61
            r0.LIZ()
        L61:
            return
        L62:
            X.0MA<java.lang.String, java.lang.Integer> r1 = androidx.appcompat.app.AppCompatDelegateImpl.LLIZLLLIL
            java.lang.Object r0 = r3.LJLJJI
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJIILLIIL():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r6 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ() {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJJ():void");
    }

    public final void LJJJI() {
        if (this.LJLJJLL == null) {
            Object obj = this.LJLJJI;
            if (obj instanceof Activity) {
                LJJIJIIJI(((Activity) obj).getWindow());
            }
        }
        if (this.LJLJJLL != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Window.Callback LJJJJI() {
        return this.LJLJJLL.getCallback();
    }

    public final void LJJJJLL() {
        if (!this.LL) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // X.AnonymousClass027
    public final AnonymousClass021 LJIIJJI() {
        LJJJJIZL();
        return this.LJLJLLL;
    }

    @Override // X.AnonymousClass027
    public final void LJIJ() {
        LJJJJIZL();
        AnonymousClass021 anonymousClass021 = this.LJLJLLL;
        if (anonymousClass021 != null) {
            anonymousClass021.LJIILL(true);
        }
    }

    @Override // X.AnonymousClass027
    public final void LJIJJLI() {
        LJJJJIZL();
        AnonymousClass021 anonymousClass021 = this.LJLJLLL;
        if (anonymousClass021 != null) {
            anonymousClass021.LJIILL(false);
        }
    }

    public final void LJJJJIZL() {
        LJJJ();
        if (!this.LLFZ || this.LJLJLLL != null) {
            return;
        }
        Object obj = this.LJLJJI;
        if (obj instanceof Activity) {
            this.LJLJLLL = new C280718h((Activity) this.LJLJJI, this.LLI);
        } else if (obj instanceof Dialog) {
            this.LJLJLLL = new C280718h((Dialog) this.LJLJJI);
        }
        AnonymousClass021 anonymousClass021 = this.LJLJLLL;
        if (anonymousClass021 == null) {
            return;
        }
        anonymousClass021.LJIIL(this.LLILZ);
    }

    @Override // X.AnonymousClass027
    public final int LJIIIZ() {
        return this.LLIILZL;
    }

    @Override // X.AnonymousClass027
    public final void LJIJJ() {
        LJ();
    }

    /* loaded from: classes.dex */
    public static final class PanelFeatureState {
        public final int LIZ;
        public int LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public C18R LJ;
        public View LJFF;
        public View LJI;
        public C281318n LJII;
        public C281218m LJIIIIZZ;
        public C25600zU LJIIIZ;
        public boolean LJIIJ;
        public boolean LJIIJJI;
        public boolean LJIIL;
        public boolean LJIILIIL;
        public boolean LJIILJJIL;
        public Bundle LJIILL;

        public PanelFeatureState(int i) {
            this.LIZ = i;
        }

        /* loaded from: classes.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.01w
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return AppCompatDelegateImpl.PanelFeatureState.SavedState.LIZ(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AppCompatDelegateImpl.PanelFeatureState.SavedState[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return AppCompatDelegateImpl.PanelFeatureState.SavedState.LIZ(parcel, classLoader);
                }
            };
            public int LJLIL;
            public boolean LJLILLLLZI;
            public Bundle LJLJI;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public static SavedState LIZ(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.LJLIL = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.LJLILLLLZI = z;
                if (z) {
                    savedState.LJLJI = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.LJLIL);
                parcel.writeInt(this.LJLILLLLZI ? 1 : 0);
                if (this.LJLILLLLZI) {
                    parcel.writeBundle(this.LJLJI);
                }
            }
        }
    }

    @Override // X.C02J
    public final void LIZ(C281318n c281318n) {
        AnonymousClass037 anonymousClass037 = this.LJLLILLLL;
        if (anonymousClass037 != null && anonymousClass037.LIZJ() && (!ViewConfiguration.get(this.LJLJJL).hasPermanentMenuKey() || this.LJLLILLLL.LIZIZ())) {
            Window.Callback LJJJJI = LJJJJI();
            if (this.LJLLILLLL.LJFF()) {
                this.LJLLILLLL.LIZ();
                if (!this.LLIIL) {
                    LJJJJI.onPanelClosed(108, LJJJJ(0).LJII);
                    return;
                }
                return;
            }
            if (LJJJJI == null || this.LLIIL) {
                return;
            }
            if (this.LLILLIZIL && (1 & this.LLILLJJLI) != 0) {
                this.LJLJJLL.getDecorView().removeCallbacks(this.LLILLL);
                this.LLILLL.run();
            }
            PanelFeatureState LJJJJ = LJJJJ(0);
            C281318n c281318n2 = LJJJJ.LJII;
            if (c281318n2 == null || LJJJJ.LJIILJJIL || !LJJJJI.onPreparePanel(0, LJJJJ.LJI, c281318n2)) {
                return;
            }
            LJJJJI.onMenuOpened(108, LJJJJ.LJII);
            this.LJLLILLLL.LJ();
            return;
        }
        PanelFeatureState LJJJJ2 = LJJJJ(0);
        LJJJJ2.LJIILIIL = true;
        LJJIJL(LJJJJ2, false);
        LJJJJJL(LJJJJ2, null);
    }

    @Override // X.AnonymousClass027
    public final Context LJFF(Context context) {
        Configuration configuration;
        this.LLIIJI = true;
        int i = this.LLIILZL;
        if (i == -100) {
            i = AnonymousClass027.LJLIL;
        }
        int LJJJJJ = LJJJJJ(i, context);
        if (LLJIJIL && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LJJIJLIJ(context, LJJJJJ, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C25600zU) {
            try {
                ((C25600zU) context).LIZ(LJJIJLIJ(context, LJJJJJ, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!LLJI) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i2 = configuration3.mcc;
                int i3 = configuration4.mcc;
                if (i2 != i3) {
                    configuration.mcc = i3;
                }
                int i4 = configuration3.mnc;
                int i5 = configuration4.mnc;
                if (i4 != i5) {
                    configuration.mnc = i5;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 24) {
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i7 = configuration3.touchscreen;
                int i8 = configuration4.touchscreen;
                if (i7 != i8) {
                    configuration.touchscreen = i8;
                }
                int i9 = configuration3.keyboard;
                int i10 = configuration4.keyboard;
                if (i9 != i10) {
                    configuration.keyboard = i10;
                }
                int i11 = configuration3.keyboardHidden;
                int i12 = configuration4.keyboardHidden;
                if (i11 != i12) {
                    configuration.keyboardHidden = i12;
                }
                int i13 = configuration3.navigation;
                int i14 = configuration4.navigation;
                if (i13 != i14) {
                    configuration.navigation = i14;
                }
                int i15 = configuration3.navigationHidden;
                int i16 = configuration4.navigationHidden;
                if (i15 != i16) {
                    configuration.navigationHidden = i16;
                }
                int i17 = configuration3.orientation;
                int i18 = configuration4.orientation;
                if (i17 != i18) {
                    configuration.orientation = i18;
                }
                int i19 = configuration3.screenLayout & 15;
                int i20 = configuration4.screenLayout & 15;
                if (i19 != i20) {
                    configuration.screenLayout |= i20;
                }
                int i21 = configuration3.screenLayout & 192;
                int i22 = configuration4.screenLayout & 192;
                if (i21 != i22) {
                    configuration.screenLayout |= i22;
                }
                int i23 = configuration3.screenLayout & 48;
                int i24 = configuration4.screenLayout & 48;
                if (i23 != i24) {
                    configuration.screenLayout |= i24;
                }
                int i25 = configuration3.screenLayout & 768;
                int i26 = configuration4.screenLayout & 768;
                if (i25 != i26) {
                    configuration.screenLayout |= i26;
                }
                if (i6 >= 26) {
                    int i27 = configuration3.colorMode & 3;
                    int i28 = configuration4.colorMode & 3;
                    if (i27 != i28) {
                        configuration.colorMode |= i28;
                    }
                    int i29 = configuration3.colorMode & 12;
                    int i30 = configuration4.colorMode & 12;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                }
                int i31 = configuration3.uiMode & 15;
                int i32 = configuration4.uiMode & 15;
                if (i31 != i32) {
                    configuration.uiMode |= i32;
                }
                int i33 = configuration3.uiMode & 48;
                int i34 = configuration4.uiMode & 48;
                if (i33 != i34) {
                    configuration.uiMode |= i34;
                }
                int i35 = configuration3.screenWidthDp;
                int i36 = configuration4.screenWidthDp;
                if (i35 != i36) {
                    configuration.screenWidthDp = i36;
                }
                int i37 = configuration3.screenHeightDp;
                int i38 = configuration4.screenHeightDp;
                if (i37 != i38) {
                    configuration.screenHeightDp = i38;
                }
                int i39 = configuration3.smallestScreenWidthDp;
                int i40 = configuration4.smallestScreenWidthDp;
                if (i39 != i40) {
                    configuration.smallestScreenWidthDp = i40;
                }
                int i41 = configuration3.densityDpi;
                int i42 = configuration4.densityDpi;
                if (i41 != i42) {
                    configuration.densityDpi = i42;
                }
            }
        } else {
            configuration = null;
        }
        Configuration LJJIJLIJ = LJJIJLIJ(context, LJJJJJ, configuration);
        C25600zU c25600zU = new C25600zU(context, com.zhiliaoapp.musically.R.style.pk);
        c25600zU.LIZ(LJJIJLIJ);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = c25600zU.getTheme();
                int i43 = Build.VERSION.SDK_INT;
                if (i43 >= 29) {
                    C06710Od.LIZ(theme);
                } else if (i43 >= 23) {
                    synchronized (C06700Oc.LIZ) {
                        if (!C06700Oc.LIZJ) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                C06700Oc.LIZIZ = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException unused3) {
                            }
                            C06700Oc.LIZJ = true;
                        }
                        Method method = C06700Oc.LIZIZ;
                        if (method != null) {
                            try {
                                method.invoke(theme, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                C06700Oc.LIZIZ = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused5) {
        }
        return c25600zU;
    }

    @Override // X.AnonymousClass027
    public final <T extends View> T LJII(int i) {
        LJJJ();
        return (T) this.LJLJJLL.findViewById(i);
    }

    @Override // X.AnonymousClass027
    public final void LJIILJJIL(Configuration configuration) {
        if (this.LLFZ && this.LL) {
            LJJJJIZL();
            AnonymousClass021 anonymousClass021 = this.LJLJLLL;
            if (anonymousClass021 != null) {
                anonymousClass021.LJII();
            }
        }
        C03R LIZ = C03R.LIZ();
        Context context = this.LJLJJL;
        synchronized (LIZ) {
            LIZ.LIZ.LJIIJJI(context);
        }
        this.LLIILII = new Configuration(this.LJLJJL.getResources().getConfiguration());
        LJJIJ(false);
    }

    @Override // X.AnonymousClass027
    public final void LJIILL(Bundle bundle) {
        this.LLIIJI = true;
        LJJIJ(false);
        LJJJI();
        Object obj = this.LJLJJI;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    if (C021806s.LIZJ(activity, activity.getComponentName()) != null) {
                        AnonymousClass021 anonymousClass021 = this.LJLJLLL;
                        if (anonymousClass021 == null) {
                            this.LLILZ = true;
                        } else {
                            anonymousClass021.LJIIL(true);
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
            }
            synchronized (AnonymousClass027.LJLJI) {
                AnonymousClass027.LJIL(this);
                AnonymousClass027.LJLILLLLZI.add(new WeakReference<>(this));
            }
        }
        this.LLIILII = new Configuration(this.LJLJJL.getResources().getConfiguration());
        this.LLIIJLIL = true;
    }

    @Override // X.AnonymousClass027
    public final void LJIIZILJ(Bundle bundle) {
        LJJJ();
    }

    @Override // X.AnonymousClass027
    public final boolean LJJ(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.LLIIII && i == 108) {
            return false;
        }
        if (this.LLFZ && i == 1) {
            this.LLFZ = false;
        } else if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.LJLJJLL.requestFeature(i);
                            }
                            LJJJJLL();
                            this.LLI = true;
                            return true;
                        }
                        LJJJJLL();
                        this.LLFZ = true;
                        return true;
                    }
                    LJJJJLL();
                    this.LLIFFJFJJ = true;
                    return true;
                }
                LJJJJLL();
                this.LLFII = true;
                return true;
            }
            LJJJJLL();
            this.LLFFF = true;
            return true;
        }
        LJJJJLL();
        this.LLIIII = true;
        return true;
    }

    @Override // X.AnonymousClass027
    public final void LJJI(int i) {
        LJJJ();
        ViewGroup viewGroup = (ViewGroup) this.LLD.findViewById(R.id.content);
        viewGroup.removeAllViews();
        C16880lQ.LLLZIIL(i, C16880lQ.LLZIL(this.LJLJJL), viewGroup);
        this.LJLJL.LJLIL.onContentChanged();
    }

    @Override // X.AnonymousClass027
    public final void LJJIFFI(View view) {
        LJJJ();
        ViewGroup viewGroup = (ViewGroup) this.LLD.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.LJLJL.LJLIL.onContentChanged();
    }

    @Override // X.AnonymousClass027
    public final void LJJIIJ(C011902x c011902x) {
        CharSequence charSequence;
        if (!(this.LJLJJI instanceof Activity)) {
            return;
        }
        LJJJJIZL();
        AnonymousClass021 anonymousClass021 = this.LJLJLLL;
        if (!(anonymousClass021 instanceof C280718h)) {
            this.LJLL = null;
            if (anonymousClass021 != null) {
                anonymousClass021.LJIIIIZZ();
            }
            this.LJLJLLL = null;
            if (c011902x != null) {
                Object obj = this.LJLJJI;
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = this.LJLLI;
                }
                C280418e c280418e = new C280418e(c011902x, charSequence, this.LJLJL);
                this.LJLJLLL = c280418e;
                this.LJLJL.LJLILLLLZI = c280418e.LIZJ;
            } else {
                this.LJLJL.LJLILLLLZI = null;
            }
            LJIILIIL();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // X.AnonymousClass027
    public final void LJJIIJZLJL(int i) {
        this.LLIIZ = i;
    }

    @Override // X.AnonymousClass027
    public final void LJJIIZ(CharSequence charSequence) {
        this.LJLLI = charSequence;
        AnonymousClass037 anonymousClass037 = this.LJLLILLLL;
        if (anonymousClass037 != null) {
            anonymousClass037.setWindowTitle(charSequence);
            return;
        }
        AnonymousClass021 anonymousClass021 = this.LJLJLLL;
        if (anonymousClass021 != null) {
            anonymousClass021.LJIILLIIL(charSequence);
            return;
        }
        TextView textView = this.LLF;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // X.AnonymousClass027
    public final AbstractC25580zS LJJIIZI(InterfaceC25570zR interfaceC25570zR) {
        ViewGroup viewGroup;
        Context context;
        Context context2;
        AbstractC25580zS abstractC25580zS;
        AnonymousClass026 anonymousClass026;
        AbstractC25580zS onWindowStartingSupportActionMode;
        AnonymousClass026 anonymousClass0262;
        if (interfaceC25570zR != null) {
            AbstractC25580zS abstractC25580zS2 = this.LJLLLL;
            if (abstractC25580zS2 != null) {
                abstractC25580zS2.LIZJ();
            }
            C18N c18n = new C18N(this, interfaceC25570zR);
            LJJJJIZL();
            AnonymousClass021 anonymousClass021 = this.LJLJLLL;
            if (anonymousClass021 != null) {
                AbstractC25580zS LJIIZILJ = anonymousClass021.LJIIZILJ(c18n);
                this.LJLLLL = LJIIZILJ;
                if (LJIIZILJ != null && (anonymousClass0262 = this.LJLJLJ) != null) {
                    anonymousClass0262.onSupportActionModeStarted(LJIIZILJ);
                }
            }
            if (this.LJLLLL == null) {
                C16650l3 c16650l3 = this.LJZI;
                if (c16650l3 != null) {
                    c16650l3.LIZIZ();
                }
                AbstractC25580zS abstractC25580zS3 = this.LJLLLL;
                if (abstractC25580zS3 != null) {
                    abstractC25580zS3.LIZJ();
                }
                AnonymousClass026 anonymousClass0263 = this.LJLJLJ;
                if (anonymousClass0263 != null && !this.LLIIL) {
                    try {
                        onWindowStartingSupportActionMode = anonymousClass0263.onWindowStartingSupportActionMode(c18n);
                    } catch (AbstractMethodError unused) {
                    }
                    if (onWindowStartingSupportActionMode != null) {
                        this.LJLLLL = onWindowStartingSupportActionMode;
                        abstractC25580zS = this.LJLLLL;
                        if (abstractC25580zS != null && (anonymousClass026 = this.LJLJLJ) != null) {
                            anonymousClass026.onSupportActionModeStarted(abstractC25580zS);
                        }
                        this.LJLLLL = this.LJLLLL;
                    }
                }
                boolean z = true;
                if (this.LJLLLLLL == null) {
                    if (this.LLII) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.LJLJJL.getTheme();
                        theme.resolveAttribute(com.zhiliaoapp.musically.R.attr.u7, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.LJLJJL.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context2 = new C25600zU(this.LJLJJL, 0);
                            context2.getTheme().setTo(newTheme);
                        } else {
                            context2 = this.LJLJJL;
                        }
                        this.LJLLLLLL = new C281718r(context2, null);
                        PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, com.zhiliaoapp.musically.R.attr.um);
                        this.LJLZ = popupWindow;
                        C07W.LIZIZ(popupWindow, 2);
                        this.LJLZ.setContentView(this.LJLLLLLL);
                        this.LJLZ.setWidth(-1);
                        context2.getTheme().resolveAttribute(com.zhiliaoapp.musically.R.attr.u1, typedValue, true);
                        this.LJLLLLLL.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                        this.LJLZ.setHeight(-2);
                        this.LJZ = new IDRunnableS85S0100000(this, 3);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.LLD.findViewById(com.zhiliaoapp.musically.R.id.oj);
                        if (viewStubCompat != null) {
                            LJJJJIZL();
                            AnonymousClass021 anonymousClass0212 = this.LJLJLLL;
                            if (anonymousClass0212 == null || (context = anonymousClass0212.LJ()) == null) {
                                context = this.LJLJJL;
                            }
                            viewStubCompat.setLayoutInflater(C16880lQ.LLZIL(context));
                            this.LJLLLLLL = (C281718r) viewStubCompat.LIZ();
                        }
                    }
                }
                if (this.LJLLLLLL != null) {
                    C16650l3 c16650l32 = this.LJZI;
                    if (c16650l32 != null) {
                        c16650l32.LIZIZ();
                    }
                    this.LJLLLLLL.LJII();
                    C36421bq c36421bq = new C36421bq(this.LJLLLLLL.getContext(), this.LJLLLLLL, c18n);
                    if (c18n.LIZ(c36421bq, c36421bq.LJLJLJ)) {
                        c36421bq.LJIIIIZZ();
                        this.LJLLLLLL.LJFF(c36421bq);
                        this.LJLLLL = c36421bq;
                        if (!this.LL || (viewGroup = this.LLD) == null || !C16330kX.LIZJ(viewGroup)) {
                            z = false;
                        }
                        if (z) {
                            this.LJLLLLLL.setAlpha(0.0f);
                            C16650l3 LIZ = h0.LIZ(this.LJLLLLLL);
                            LIZ.LIZ(1.0f);
                            this.LJZI = LIZ;
                            LIZ.LIZLLL(new C31309CQn() { // from class: X.1hH
                                @Override // X.InterfaceC16660l4
                                public final void LIZ() {
                                    AppCompatDelegateImpl.this.LJLLLLLL.setAlpha(1.0f);
                                    AppCompatDelegateImpl.this.LJZI.LIZLLL(null);
                                    AppCompatDelegateImpl.this.LJZI = null;
                                }

                                @Override // X.C31309CQn, X.InterfaceC16660l4
                                public final void LJIIJ() {
                                    AppCompatDelegateImpl.this.LJLLLLLL.setVisibility(0);
                                    if (AppCompatDelegateImpl.this.LJLLLLLL.getParent() instanceof View) {
                                        C16340kY.LIZJ((View) AppCompatDelegateImpl.this.LJLLLLLL.getParent());
                                    }
                                }
                            });
                        } else {
                            this.LJLLLLLL.setAlpha(1.0f);
                            this.LJLLLLLL.setVisibility(0);
                            if (this.LJLLLLLL.getParent() instanceof View) {
                                C16340kY.LIZJ((View) this.LJLLLLLL.getParent());
                            }
                        }
                        if (this.LJLZ != null) {
                            this.LJLJJLL.getDecorView().post(this.LJZ);
                        }
                    } else {
                        this.LJLLLL = null;
                    }
                }
                abstractC25580zS = this.LJLLLL;
                if (abstractC25580zS != null) {
                    anonymousClass026.onSupportActionModeStarted(abstractC25580zS);
                }
                this.LJLLLL = this.LJLLLL;
            }
            return this.LJLLLL;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        if (r8 == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJ(boolean r12) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJIJ(boolean):boolean");
    }

    public final void LJJIJIIJI(Window window) {
        if (this.LJLJJLL == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C18O)) {
                C18O c18o = new C18O(this, callback);
                this.LJLJL = c18o;
                window.setCallback(c18o);
                AnonymousClass033 LJIIL = AnonymousClass033.LJIIL(this.LJLJJL, null, LLJ);
                Drawable LJFF = LJIIL.LJFF(0);
                if (LJFF != null) {
                    window.setBackgroundDrawable(LJFF);
                }
                LJIIL.LJIILJJIL();
                this.LJLJJLL = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void LJJIJIL(C281318n c281318n) {
        if (this.LLIIIILZ) {
            return;
        }
        this.LLIIIILZ = true;
        this.LJLLILLLL.LJIIIIZZ();
        Window.Callback LJJJJI = LJJJJI();
        if (LJJJJI != null && !this.LLIIL) {
            LJJJJI.onPanelClosed(108, c281318n);
        }
        this.LLIIIILZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIL(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJIL(android.view.KeyEvent):boolean");
    }

    public final void LJJIZ(int i) {
        PanelFeatureState LJJJJ = LJJJJ(i);
        if (LJJJJ.LJII != null) {
            Bundle bundle = new Bundle();
            LJJJJ.LJII.LJIJJ(bundle);
            if (bundle.size() > 0) {
                LJJJJ.LJIILL = bundle;
            }
            LJJJJ.LJII.LJJI();
            LJJJJ.LJII.clear();
        }
        LJJJJ.LJIILJJIL = true;
        LJJJJ.LJIILIIL = true;
        if ((i == 108 || i == 0) && this.LJLLILLLL != null) {
            PanelFeatureState LJJJJ2 = LJJJJ(0);
            LJJJJ2.LJIIJ = false;
            LJJJJLI(LJJJJ2, null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.18Q] */
    public final AbstractC009301x LJJJIL(Context context) {
        if (this.LLILIL == null) {
            if (C02E.LIZLLL == null) {
                Context LLLLL = C16880lQ.LLLLL(context);
                C02E.LIZLLL = new C02E(LLLLL, (LocationManager) C16880lQ.LLILL(LLLLL, "location"));
            }
            final C02E c02e = C02E.LIZLLL;
            this.LLILIL = new AbstractC009301x(c02e) { // from class: X.18Q
                public final C02E LIZJ;

                @Override // X.AbstractC009301x
                public final IntentFilter LIZIZ() {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.TIME_SET");
                    intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                    intentFilter.addAction("android.intent.action.TIME_TICK");
                    return intentFilter;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:5:0x0016 A[ORIG_RETURN, RETURN] */
                @Override // X.AbstractC009301x
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final int LIZJ() {
                    /*
                        Method dump skipped, instructions count: 235
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C18Q.LIZJ():int");
                }

                @Override // X.AbstractC009301x
                public final void LIZLLL() {
                    AppCompatDelegateImpl.this.LJ();
                }

                {
                    super(AppCompatDelegateImpl.this);
                    this.LIZJ = c02e;
                }
            };
        }
        return this.LLILIL;
    }

    public final PanelFeatureState LJJJJ(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.LLIIIJ;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.LLIIIJ = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
            panelFeatureStateArr[i] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    @Override // X.C02J
    public final boolean LIZIZ(C281318n c281318n, MenuItem menuItem) {
        Window.Callback LJJJJI = LJJJJI();
        if (LJJJJI != null && !this.LLIIL) {
            C281318n LJIIJ = c281318n.LJIIJ();
            PanelFeatureState[] panelFeatureStateArr = this.LLIIIJ;
            if (panelFeatureStateArr != null) {
                for (PanelFeatureState panelFeatureState : panelFeatureStateArr) {
                    if (panelFeatureState != null && panelFeatureState.LJII == LJIIJ) {
                        return LJJJJI.onMenuItemSelected(panelFeatureState.LIZ, menuItem);
                    }
                }
            }
        }
        return false;
    }

    @Override // X.AnonymousClass027
    public final void LIZLLL(View view, ViewGroup.LayoutParams layoutParams) {
        LJJJ();
        ((ViewGroup) this.LLD.findViewById(R.id.content)).addView(view, layoutParams);
        this.LJLJL.LJLIL.onContentChanged();
    }

    @Override // X.AnonymousClass027
    public final void LJJII(View view, ViewGroup.LayoutParams layoutParams) {
        LJJJ();
        ViewGroup viewGroup = (ViewGroup) this.LLD.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.LJLJL.LJLIL.onContentChanged();
    }

    public final void LJJIJL(PanelFeatureState panelFeatureState, boolean z) {
        C18R c18r;
        AnonymousClass037 anonymousClass037;
        if (z && panelFeatureState.LIZ == 0 && (anonymousClass037 = this.LJLLILLLL) != null && anonymousClass037.LJFF()) {
            LJJIJIL(panelFeatureState.LJII);
            return;
        }
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(this.LJLJJL, "window");
        if (windowManager != null && panelFeatureState.LJIIL && (c18r = panelFeatureState.LJ) != null) {
            C51639KOl.LIZIZ(new Object[]{c18r});
            windowManager.removeView(c18r);
            if (z) {
                LJJIJIIJIL(panelFeatureState.LIZ, panelFeatureState, null);
            }
        }
        panelFeatureState.LJIIJ = false;
        panelFeatureState.LJIIJJI = false;
        panelFeatureState.LJIIL = false;
        panelFeatureState.LJFF = null;
        panelFeatureState.LJIILIIL = true;
        if (this.LLIIIL == panelFeatureState) {
            this.LLIIIL = null;
        }
    }

    public final int LJJJJJ(int i, Context context) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        if (this.LLILL == null) {
                            this.LLILL = new C18P(this, context);
                        }
                        return this.LLILL.LIZJ();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                return i;
            }
            if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "uimode")).getNightMode() == 0) {
                return -1;
            }
            return LJJJIL(context).LIZJ();
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        if (r1.LJLJJLL.getCount() > 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c6, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.18S] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.18R] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJL(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJJJJL(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r12.LJIILJJIL != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0102, code lost:
    
        if (r6 != null) goto L60;
     */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.18M] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJJLI(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJJJLI(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):boolean");
    }

    public static Configuration LJJIJLIJ(Context context, int i, Configuration configuration) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                i2 = C16880lQ.LLLLL(context).getResources().getConfiguration().uiMode & 48;
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0016, code lost:
    
        if (r4 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if (r4 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(int r3, androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r4, X.C281318n r5) {
        /*
            r2 = this;
            if (r5 != 0) goto L16
            if (r4 != 0) goto Lf
            if (r3 < 0) goto L19
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r1 = r2.LLIIIJ
            int r0 = r1.length
            if (r3 >= r0) goto L19
            r4 = r1[r3]
            if (r4 == 0) goto L19
        Lf:
            X.18n r5 = r4.LJII
        L11:
            boolean r0 = r4.LJIIL
            if (r0 != 0) goto L19
            return
        L16:
            if (r4 == 0) goto L19
            goto L11
        L19:
            boolean r0 = r2.LLIIL
            if (r0 != 0) goto L24
            X.18O r0 = r2.LJLJL
            android.view.Window$Callback r0 = r0.LJLIL
            r0.onPanelClosed(r3, r5)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJIJIIJIL(int, androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, X.18n):void");
    }

    public final boolean LJJJJL(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        C281318n c281318n;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!panelFeatureState.LJIIJ && !LJJJJLI(panelFeatureState, keyEvent)) || (c281318n = panelFeatureState.LJII) == null) {
            return false;
        }
        return c281318n.performShortcut(i, keyEvent, 1);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return LJI(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, AnonymousClass026 anonymousClass026, Object obj) {
        C0MA<String, Integer> c0ma;
        Integer orDefault;
        this.LLIILZL = -100;
        this.LJLJJL = context;
        this.LJLJLJ = anonymousClass026;
        this.LJLJJI = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof C29S) {
                        C29S c29s = (C29S) context;
                        if (c29s != null) {
                            this.LLIILZL = c29s.getDelegate().LJIIIZ();
                        }
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
        }
        if (this.LLIILZL == -100 && (orDefault = (c0ma = LLIZLLLIL).getOrDefault(this.LJLJJI.getClass().getName(), null)) != null) {
            this.LLIILZL = orDefault.intValue();
            c0ma.remove(this.LJLJJI.getClass().getName());
        }
        if (window != null) {
            LJJIJIIJI(window);
        }
        C03R.LIZLLL();
    }

    @Override // X.AnonymousClass027
    public final View LJI(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.LLIZ == null) {
            String LLLZLZ = C16880lQ.LLLZLZ(this.LJLJJL.obtainStyledAttributes(new int[]{R.attr.windowIsFloating, R.attr.windowAnimationStyle, com.zhiliaoapp.musically.R.attr.ty, com.zhiliaoapp.musically.R.attr.tz, com.zhiliaoapp.musically.R.attr.u0, com.zhiliaoapp.musically.R.attr.u1, com.zhiliaoapp.musically.R.attr.u2, com.zhiliaoapp.musically.R.attr.u3, com.zhiliaoapp.musically.R.attr.u4, com.zhiliaoapp.musically.R.attr.u5, com.zhiliaoapp.musically.R.attr.u6, com.zhiliaoapp.musically.R.attr.u7, com.zhiliaoapp.musically.R.attr.u8, com.zhiliaoapp.musically.R.attr.u9, com.zhiliaoapp.musically.R.attr.ua, com.zhiliaoapp.musically.R.attr.uc, com.zhiliaoapp.musically.R.attr.ud, com.zhiliaoapp.musically.R.attr.ue, com.zhiliaoapp.musically.R.attr.uf, com.zhiliaoapp.musically.R.attr.ug, com.zhiliaoapp.musically.R.attr.uh, com.zhiliaoapp.musically.R.attr.ui, com.zhiliaoapp.musically.R.attr.uj, com.zhiliaoapp.musically.R.attr.uk, com.zhiliaoapp.musically.R.attr.ul, com.zhiliaoapp.musically.R.attr.um, com.zhiliaoapp.musically.R.attr.un, com.zhiliaoapp.musically.R.attr.uo, com.zhiliaoapp.musically.R.attr.up, com.zhiliaoapp.musically.R.attr.uq, com.zhiliaoapp.musically.R.attr.ur, com.zhiliaoapp.musically.R.attr.us, com.zhiliaoapp.musically.R.attr.ut, com.zhiliaoapp.musically.R.attr.uu, com.zhiliaoapp.musically.R.attr.v1, com.zhiliaoapp.musically.R.attr.vd, com.zhiliaoapp.musically.R.attr.ve, com.zhiliaoapp.musically.R.attr.vf, com.zhiliaoapp.musically.R.attr.vg, com.zhiliaoapp.musically.R.attr.wf, com.zhiliaoapp.musically.R.attr.z3, com.zhiliaoapp.musically.R.attr.a08, com.zhiliaoapp.musically.R.attr.a09, com.zhiliaoapp.musically.R.attr.a0_, com.zhiliaoapp.musically.R.attr.a0a, com.zhiliaoapp.musically.R.attr.a0b, com.zhiliaoapp.musically.R.attr.a0k, com.zhiliaoapp.musically.R.attr.a0l, com.zhiliaoapp.musically.R.attr.a1v, com.zhiliaoapp.musically.R.attr.a24, com.zhiliaoapp.musically.R.attr.a4e, com.zhiliaoapp.musically.R.attr.a4f, com.zhiliaoapp.musically.R.attr.a4g, com.zhiliaoapp.musically.R.attr.a4h, com.zhiliaoapp.musically.R.attr.a4i, com.zhiliaoapp.musically.R.attr.a4j, com.zhiliaoapp.musically.R.attr.a4k, com.zhiliaoapp.musically.R.attr.a4r, com.zhiliaoapp.musically.R.attr.a4s, com.zhiliaoapp.musically.R.attr.a4z, com.zhiliaoapp.musically.R.attr.a7g, com.zhiliaoapp.musically.R.attr.a9y, com.zhiliaoapp.musically.R.attr.a9z, com.zhiliaoapp.musically.R.attr.a_0, com.zhiliaoapp.musically.R.attr.a_g, com.zhiliaoapp.musically.R.attr.a_q, com.zhiliaoapp.musically.R.attr.aad, com.zhiliaoapp.musically.R.attr.aae, com.zhiliaoapp.musically.R.attr.aap, com.zhiliaoapp.musically.R.attr.aaq, com.zhiliaoapp.musically.R.attr.aar, com.zhiliaoapp.musically.R.attr.ag1, com.zhiliaoapp.musically.R.attr.ahc, com.zhiliaoapp.musically.R.attr.aor, com.zhiliaoapp.musically.R.attr.aot, com.zhiliaoapp.musically.R.attr.aov, com.zhiliaoapp.musically.R.attr.aow, com.zhiliaoapp.musically.R.attr.aoz, com.zhiliaoapp.musically.R.attr.ap0, com.zhiliaoapp.musically.R.attr.ap1, com.zhiliaoapp.musically.R.attr.ap2, com.zhiliaoapp.musically.R.attr.ap3, com.zhiliaoapp.musically.R.attr.ap4, com.zhiliaoapp.musically.R.attr.ap5, com.zhiliaoapp.musically.R.attr.ap6, com.zhiliaoapp.musically.R.attr.ap7, com.zhiliaoapp.musically.R.attr.b3v, com.zhiliaoapp.musically.R.attr.b3w, com.zhiliaoapp.musically.R.attr.b3x, com.zhiliaoapp.musically.R.attr.b51, com.zhiliaoapp.musically.R.attr.b53, com.zhiliaoapp.musically.R.attr.b6g, com.zhiliaoapp.musically.R.attr.b6t, com.zhiliaoapp.musically.R.attr.b6u, com.zhiliaoapp.musically.R.attr.b6v, com.zhiliaoapp.musically.R.attr.b_b, com.zhiliaoapp.musically.R.attr.b_h, com.zhiliaoapp.musically.R.attr.b_r, com.zhiliaoapp.musically.R.attr.b_s, com.zhiliaoapp.musically.R.attr.bc3, com.zhiliaoapp.musically.R.attr.bc4, com.zhiliaoapp.musically.R.attr.bfw, com.zhiliaoapp.musically.R.attr.bhx, com.zhiliaoapp.musically.R.attr.bhz, com.zhiliaoapp.musically.R.attr.bi0, com.zhiliaoapp.musically.R.attr.bi1, com.zhiliaoapp.musically.R.attr.bi3, com.zhiliaoapp.musically.R.attr.bi4, com.zhiliaoapp.musically.R.attr.bi5, com.zhiliaoapp.musically.R.attr.bi6, com.zhiliaoapp.musically.R.attr.bib, com.zhiliaoapp.musically.R.attr.bic, com.zhiliaoapp.musically.R.attr.bjx, com.zhiliaoapp.musically.R.attr.bjy, com.zhiliaoapp.musically.R.attr.bk7, com.zhiliaoapp.musically.R.attr.bk8, com.zhiliaoapp.musically.R.attr.bw_, com.zhiliaoapp.musically.R.attr.bxp, com.zhiliaoapp.musically.R.attr.bxq, com.zhiliaoapp.musically.R.attr.bxr, com.zhiliaoapp.musically.R.attr.bxs, com.zhiliaoapp.musically.R.attr.bxt, com.zhiliaoapp.musically.R.attr.bxu, com.zhiliaoapp.musically.R.attr.bxv, com.zhiliaoapp.musically.R.attr.bxx, com.zhiliaoapp.musically.R.attr.bxy, com.zhiliaoapp.musically.R.attr.bxz}), 116);
            if (LLLZLZ == null) {
                this.LLIZ = new C02A();
            } else {
                try {
                    this.LLIZ = (C02A) this.LJLJJL.getClassLoader().loadClass(LLLZLZ).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.LLIZ = new C02A();
                }
            }
        }
        return this.LLIZ.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return LJI(view, str, context, attributeSet);
    }
}
