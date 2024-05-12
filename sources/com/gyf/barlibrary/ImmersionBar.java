package com.gyf.barlibrary;

import X.ActivityC45651qj;
import X.C025107z;
import X.C04330Ez;
import X.C07290Qj;
import X.X1D;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public class ImmersionBar {
    public static final int IMMERSION_NAVIGATION_BAR_VIEW = 2131368671;
    public static final int IMMERSION_STATUS_BAR_VIEW = 2131368672;
    public static Map<String, ImmersionBar> mImmersionBarMap = new HashMap();
    public Activity mActivity;
    public BarConfig mBarConfig;
    public BarParams mBarParams;
    public ViewGroup mContentView;
    public ViewGroup mDecorView;
    public Dialog mDialog;
    public FitsKeyboard mFitsKeyboard;
    public int mFitsStatusBarType;
    public Fragment mFragment;
    public boolean mHasNavigationBarColor;
    public String mImmersionBarName;
    public boolean mIsFitsLayoutOverlap;
    public boolean mIsFitsNotch;
    public boolean mIsFragment;
    public int mNavigationBarHeight;
    public int mNavigationBarWidth;
    public ContentObserver mNavigationObserver;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public Map<String, BarParams> mTagMap;
    public Window mWindow;

    /* renamed from: com.gyf.barlibrary.ImmersionBar$3, reason: invalid class name */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$gyf$barlibrary$BarHide;

        static {
            int[] iArr = new int[BarHide.values().length];
            $SwitchMap$com$gyf$barlibrary$BarHide = iArr;
            try {
                iArr[BarHide.FLAG_HIDE_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$gyf$barlibrary$BarHide[BarHide.FLAG_HIDE_STATUS_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$gyf$barlibrary$BarHide[BarHide.FLAG_HIDE_NAVIGATION_BAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$gyf$barlibrary$BarHide[BarHide.FLAG_SHOW_BAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void adjustDarkModeParams() {
        boolean z;
        BarParams barParams = this.mBarParams;
        boolean z2 = true;
        if (barParams.autoStatusBarDarkModeEnable) {
            int i = barParams.statusBarColor;
            if (i != 0 && i > -4539718) {
                z = true;
            } else {
                z = false;
            }
            statusBarDarkFont(z, barParams.autoStatusBarDarkModeAlpha);
        }
        BarParams barParams2 = this.mBarParams;
        if (barParams2.autoNavigationBarDarkModeEnable) {
            int i2 = barParams2.navigationBarColor;
            if (i2 == 0 || i2 <= -4539718) {
                z2 = false;
            }
            navigationBarDarkIcon(z2, barParams2.autoNavigationBarDarkModeAlpha);
        }
    }

    private void cancelListener() {
        Activity activity = this.mActivity;
        if (activity != null) {
            if (this.mNavigationObserver != null) {
                activity.getContentResolver().unregisterContentObserver(this.mNavigationObserver);
                this.mNavigationObserver = null;
            }
            FitsKeyboard fitsKeyboard = this.mFitsKeyboard;
            if (fitsKeyboard != null) {
                fitsKeyboard.cancel();
                this.mFitsKeyboard = null;
            }
        }
    }

    private void checkNavigationBarFlag() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 26) {
            BarParams barParams = this.mBarParams;
            if (barParams.useDefaultNavigationBarColor) {
                if ((this.mWindow.getDecorView().getSystemUiVisibility() & 16) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                barParams.navigationBarDarkIcon = z;
            }
        }
    }

    private void checkNavigationBarInitialized() {
        if (this.mBarParams.useDefaultNavigationBarColor) {
            this.mBarParams.navigationBarColor = this.mWindow.getNavigationBarColor();
        }
    }

    private void fitsKeyboard() {
        if (!this.mIsFragment) {
            if (this.mBarParams.keyboardEnable) {
                if (this.mFitsKeyboard == null) {
                    this.mFitsKeyboard = new FitsKeyboard(this, this.mActivity, this.mWindow);
                }
                this.mFitsKeyboard.enable(this.mBarParams.keyboardMode);
                return;
            } else {
                FitsKeyboard fitsKeyboard = this.mFitsKeyboard;
                if (fitsKeyboard == null) {
                    return;
                }
                fitsKeyboard.disable();
                return;
            }
        }
        ImmersionBar immersionBar = mImmersionBarMap.get(this.mActivity.toString());
        if (immersionBar == null) {
            return;
        }
        if (immersionBar.mBarParams.keyboardEnable) {
            if (immersionBar.mFitsKeyboard == null) {
                immersionBar.mFitsKeyboard = new FitsKeyboard(immersionBar, immersionBar.mActivity, immersionBar.mWindow);
            }
            immersionBar.mFitsKeyboard.enable(immersionBar.mBarParams.keyboardMode);
        } else {
            FitsKeyboard fitsKeyboard2 = immersionBar.mFitsKeyboard;
            if (fitsKeyboard2 == null) {
                return;
            }
            fitsKeyboard2.disable();
        }
    }

    private void fitsLayoutOverlap() {
        if (!this.mIsFitsLayoutOverlap) {
            int i = this.mFitsStatusBarType;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    setStatusBarView(this.mActivity, this.mBarParams.statusBarView);
                    this.mIsFitsLayoutOverlap = true;
                    return;
                }
                setTitleBarMarginTop(this.mActivity, this.mBarParams.titleBarView);
                this.mIsFitsLayoutOverlap = true;
                return;
            }
            setTitleBar(this.mActivity, this.mBarParams.titleBarView);
            this.mIsFitsLayoutOverlap = true;
        }
    }

    private void fitsNotchScreen() {
        if (Build.VERSION.SDK_INT >= 28 && !this.mIsFitsNotch) {
            WindowManager.LayoutParams attributes = this.mWindow.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.mWindow.setAttributes(attributes);
            this.mIsFitsNotch = true;
        }
    }

    private void fitsWindowsAboveLOLLIPOP() {
        int i;
        if (checkFitsSystemWindows(this.mDecorView.findViewById(R.id.content))) {
            if (this.mBarParams.isSupportActionBar) {
                setPadding(0, this.mBarConfig.getActionBarHeight(), 0, 0);
                return;
            }
            return;
        }
        if (this.mBarParams.fits && this.mFitsStatusBarType == 4) {
            i = this.mBarConfig.getStatusBarHeight();
        } else {
            i = 0;
        }
        if (this.mBarParams.isSupportActionBar) {
            i = this.mBarConfig.getStatusBarHeight() + this.mBarConfig.getActionBarHeight();
        }
        setPadding(0, i, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void fitsWindowsBelowLOLLIPOP() {
        /*
            r5 = this;
            android.view.ViewGroup r1 = r5.mDecorView
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
            boolean r0 = checkFitsSystemWindows(r0)
            r4 = 0
            if (r0 == 0) goto L20
            com.gyf.barlibrary.BarParams r0 = r5.mBarParams
            boolean r0 = r0.isSupportActionBar
            if (r0 == 0) goto L1f
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            int r0 = r0.getActionBarHeight()
            r5.setPadding(r4, r0, r4, r4)
        L1f:
            return
        L20:
            com.gyf.barlibrary.BarParams r0 = r5.mBarParams
            boolean r0 = r0.fits
            if (r0 == 0) goto L99
            int r1 = r5.mFitsStatusBarType
            r0 = 4
            if (r1 != r0) goto L99
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            int r3 = r0.getStatusBarHeight()
        L31:
            com.gyf.barlibrary.BarParams r0 = r5.mBarParams
            boolean r0 = r0.isSupportActionBar
            if (r0 == 0) goto L44
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            int r3 = r0.getStatusBarHeight()
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            int r0 = r0.getActionBarHeight()
            int r3 = r3 + r0
        L44:
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            boolean r0 = r0.hasNavigationBar()
            if (r0 == 0) goto L97
            com.gyf.barlibrary.BarParams r1 = r5.mBarParams
            boolean r0 = r1.navigationBarEnable
            if (r0 == 0) goto L97
            boolean r0 = r1.navigationBarWithKitkatEnable
            if (r0 == 0) goto L97
            boolean r0 = r1.fullScreen
            if (r0 != 0) goto L8d
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            boolean r0 = r0.isNavigationAtBottom()
            if (r0 == 0) goto L8f
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            int r2 = r0.getNavigationBarHeight()
            r1 = 0
        L69:
            com.gyf.barlibrary.BarParams r0 = r5.mBarParams
            boolean r0 = r0.hideNavigationBar
            if (r0 == 0) goto L7e
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            boolean r0 = r0.isNavigationAtBottom()
            if (r0 == 0) goto L7c
        L77:
            r2 = 0
        L78:
            r5.setPadding(r4, r3, r1, r2)
            return
        L7c:
            r1 = 0
            goto L78
        L7e:
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            boolean r0 = r0.isNavigationAtBottom()
            if (r0 != 0) goto L78
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            int r1 = r0.getNavigationBarWidth()
            goto L78
        L8d:
            r1 = 0
            goto L95
        L8f:
            com.gyf.barlibrary.BarConfig r0 = r5.mBarConfig
            int r1 = r0.getNavigationBarWidth()
        L95:
            r2 = 0
            goto L69
        L97:
            r1 = 0
            goto L77
        L99:
            r3 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.barlibrary.ImmersionBar.fitsWindowsBelowLOLLIPOP():void");
    }

    private void fitsWindowsEMUI() {
        final View findViewById = this.mDecorView.findViewById(IMMERSION_NAVIGATION_BAR_VIEW);
        BarParams barParams = this.mBarParams;
        if (barParams.navigationBarEnable && barParams.navigationBarWithKitkatEnable) {
            if (findViewById != null && this.mNavigationObserver == null) {
                this.mNavigationObserver = new ContentObserver(new Handler()) { // from class: com.gyf.barlibrary.ImmersionBar.1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z) {
                        ImmersionBar immersionBar = ImmersionBar.this;
                        immersionBar.mBarConfig = new BarConfig(immersionBar.mActivity);
                        int paddingBottom = ImmersionBar.this.mContentView.getPaddingBottom();
                        int paddingRight = ImmersionBar.this.mContentView.getPaddingRight();
                        Activity activity = ImmersionBar.this.mActivity;
                        if (activity != null && activity.getContentResolver() != null) {
                            if (Settings.System.getInt(ImmersionBar.this.mActivity.getContentResolver(), "navigationbar_is_min", 0) == 1) {
                                findViewById.setVisibility(8);
                            } else {
                                findViewById.setVisibility(0);
                                if (!ImmersionBar.checkFitsSystemWindows(ImmersionBar.this.mDecorView.findViewById(R.id.content))) {
                                    ImmersionBar immersionBar2 = ImmersionBar.this;
                                    if (immersionBar2.mNavigationBarHeight == 0) {
                                        immersionBar2.mNavigationBarHeight = immersionBar2.mBarConfig.getNavigationBarHeight();
                                    }
                                    ImmersionBar immersionBar3 = ImmersionBar.this;
                                    if (immersionBar3.mNavigationBarWidth == 0) {
                                        immersionBar3.mNavigationBarWidth = immersionBar3.mBarConfig.getNavigationBarWidth();
                                    }
                                    if (!ImmersionBar.this.mBarParams.hideNavigationBar) {
                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                                        if (ImmersionBar.this.mBarConfig.isNavigationAtBottom()) {
                                            layoutParams.gravity = 80;
                                            ImmersionBar immersionBar4 = ImmersionBar.this;
                                            paddingBottom = immersionBar4.mNavigationBarHeight;
                                            layoutParams.height = paddingBottom;
                                            if (immersionBar4.mBarParams.fullScreen) {
                                                paddingBottom = 0;
                                            }
                                            paddingRight = 0;
                                        } else {
                                            layoutParams.gravity = 8388613;
                                            ImmersionBar immersionBar5 = ImmersionBar.this;
                                            paddingRight = immersionBar5.mNavigationBarWidth;
                                            layoutParams.width = paddingRight;
                                            if (immersionBar5.mBarParams.fullScreen) {
                                                paddingRight = 0;
                                            }
                                            paddingBottom = 0;
                                        }
                                        findViewById.setLayoutParams(layoutParams);
                                    }
                                }
                            }
                            paddingBottom = 0;
                            paddingRight = 0;
                        }
                        ImmersionBar immersionBar6 = ImmersionBar.this;
                        immersionBar6.setPadding(0, immersionBar6.mContentView.getPaddingTop(), paddingRight, paddingBottom);
                    }
                };
                Activity activity = this.mActivity;
                if (activity != null && activity.getContentResolver() != null && this.mNavigationObserver != null) {
                    this.mActivity.getContentResolver().registerContentObserver(Settings.System.getUriFor("navigationbar_is_min"), true, this.mNavigationObserver);
                    return;
                }
                return;
            }
            return;
        }
        findViewById.setVisibility(8);
    }

    private void initBarBelowLOLLIPOP() {
        this.mWindow.addFlags(67108864);
        setupStatusBarView();
        if (this.mBarConfig.hasNavigationBar() || OSUtils.isEMUI3_x()) {
            BarParams barParams = this.mBarParams;
            if (barParams.navigationBarEnable && barParams.navigationBarWithKitkatEnable) {
                this.mWindow.addFlags(134217728);
            } else {
                this.mWindow.clearFlags(134217728);
            }
            if (this.mNavigationBarHeight == 0) {
                this.mNavigationBarHeight = this.mBarConfig.getNavigationBarHeight();
            }
            if (this.mNavigationBarWidth == 0) {
                this.mNavigationBarWidth = this.mBarConfig.getNavigationBarWidth();
            }
            setupNavBarView();
        }
    }

    private void initParams() {
        this.mBarParams = new BarParams();
        ViewGroup viewGroup = (ViewGroup) this.mWindow.getDecorView();
        this.mDecorView = viewGroup;
        this.mContentView = (ViewGroup) viewGroup.findViewById(R.id.content);
    }

    private void setupNavBarView() {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup viewGroup = this.mDecorView;
        int i = IMMERSION_NAVIGATION_BAR_VIEW;
        View findViewById = viewGroup.findViewById(i);
        if (findViewById == null) {
            findViewById = new View(this.mActivity);
            findViewById.setId(i);
            this.mDecorView.addView(findViewById);
        }
        if (this.mBarConfig.isNavigationAtBottom()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.mBarConfig.getNavigationBarHeight());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.mBarConfig.getNavigationBarWidth(), -1);
            layoutParams.gravity = 8388613;
        }
        findViewById.setLayoutParams(layoutParams);
        BarParams barParams = this.mBarParams;
        findViewById.setBackgroundColor(C07290Qj.LJFF(barParams.navigationBarAlpha, barParams.navigationBarColor, barParams.navigationBarColorTransform));
        BarParams barParams2 = this.mBarParams;
        if (barParams2.navigationBarEnable && barParams2.navigationBarWithKitkatEnable && !barParams2.hideNavigationBar) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
    }

    private void setupStatusBarView() {
        ViewGroup viewGroup = this.mDecorView;
        int i = IMMERSION_STATUS_BAR_VIEW;
        View findViewById = viewGroup.findViewById(i);
        if (findViewById == null) {
            findViewById = new View(this.mActivity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.mBarConfig.getStatusBarHeight());
            layoutParams.gravity = 48;
            findViewById.setLayoutParams(layoutParams);
            findViewById.setVisibility(0);
            findViewById.setId(i);
            this.mDecorView.addView(findViewById);
        }
        BarParams barParams = this.mBarParams;
        if (barParams.statusBarColorEnabled) {
            findViewById.setBackgroundColor(C07290Qj.LJFF(barParams.statusBarAlpha, barParams.statusBarColor, barParams.statusBarColorTransform));
        } else {
            findViewById.setBackgroundColor(C07290Qj.LJFF(barParams.statusBarAlpha, barParams.statusBarColor, 0));
        }
    }

    private void transformView() {
        if (this.mBarParams.viewMap.size() != 0) {
            for (Map.Entry<View, Map<Integer, Integer>> entry : this.mBarParams.viewMap.entrySet()) {
                View key = entry.getKey();
                Map<Integer, Integer> value = entry.getValue();
                Integer valueOf = Integer.valueOf(this.mBarParams.statusBarColor);
                Integer valueOf2 = Integer.valueOf(this.mBarParams.statusBarColorTransform);
                for (Map.Entry<Integer, Integer> entry2 : value.entrySet()) {
                    valueOf = entry2.getKey();
                    valueOf2 = entry2.getValue();
                }
                if (key != null) {
                    if (Math.abs(this.mBarParams.viewAlpha - 0.0f) == 0.0f) {
                        key.setBackgroundColor(C07290Qj.LJFF(this.mBarParams.statusBarAlpha, valueOf.intValue(), valueOf2.intValue()));
                    } else {
                        key.setBackgroundColor(C07290Qj.LJFF(this.mBarParams.viewAlpha, valueOf.intValue(), valueOf2.intValue()));
                    }
                }
            }
        }
    }

    public ImmersionBar removeSupportAllView() {
        if (this.mBarParams.viewMap.size() != 0) {
            this.mBarParams.viewMap.clear();
        }
        return this;
    }

    public ImmersionBar reset() {
        this.mBarParams = new BarParams();
        this.mFitsStatusBarType = 0;
        return this;
    }

    public ImmersionBar transparentBar() {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = 0;
        barParams.navigationBarColor = 0;
        barParams.useDefaultNavigationBarColor = false;
        barParams.fullScreen = true;
        return this;
    }

    public ImmersionBar transparentNavigationBar() {
        BarParams barParams = this.mBarParams;
        barParams.navigationBarColor = 0;
        barParams.useDefaultNavigationBarColor = false;
        barParams.fullScreen = true;
        return this;
    }

    public ImmersionBar transparentStatusBar() {
        this.mBarParams.statusBarColor = 0;
        return this;
    }

    private void fitsWindows() {
        if (!OSUtils.isEMUI3_x()) {
            fitsWindowsAboveLOLLIPOP();
            return;
        }
        fitsWindowsBelowLOLLIPOP();
        if (this.mIsFragment || !OSUtils.isEMUI3_x()) {
            return;
        }
        fitsWindowsEMUI();
    }

    public static boolean isSupportNavigationIconDark() {
        if (OSUtils.isMIUI6Later() || Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean isSupportStatusBarDarkFont() {
        if (OSUtils.isMIUI6Later() || OSUtils.isFlymeOS4Later() || Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    private void setBar() {
        checkNavigationBarInitialized();
        int i = 256;
        if (!OSUtils.isEMUI3_x()) {
            fitsNotchScreen();
            int statusBarDarkFont = setStatusBarDarkFont(initBarAboveLOLLIPOP(256));
            checkNavigationBarFlag();
            i = setNavigationIconDark(statusBarDarkFont);
        } else {
            initBarBelowLOLLIPOP();
        }
        int hideBar = hideBar(i);
        fitsWindows();
        this.mDecorView.setSystemUiVisibility(hideBar);
        if (OSUtils.isMIUI6Later()) {
            setMIUIBarDark(this.mWindow, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", this.mBarParams.statusBarDarkFont);
            BarParams barParams = this.mBarParams;
            if (barParams.navigationBarEnable) {
                setMIUIBarDark(this.mWindow, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", barParams.navigationBarDarkIcon);
            }
        }
        if (OSUtils.isFlymeOS4Later()) {
            BarParams barParams2 = this.mBarParams;
            int i2 = barParams2.flymeOSStatusBarFontColor;
            if (i2 != 0) {
                FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(this.mActivity, i2);
            } else {
                FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(this.mActivity, barParams2.statusBarDarkFont);
            }
        }
    }

    private void updateBarParams() {
        ImmersionBar immersionBar;
        adjustDarkModeParams();
        if (OSUtils.isEMUI3_x()) {
            BarParams barParams = this.mBarParams;
            if (barParams.navigationBarWithKitkatEnable) {
                barParams.navigationBarWithKitkatEnable = barParams.navigationBarWithEMUI3Enable;
            }
        }
        this.mBarConfig = new BarConfig(this.mActivity);
        if (this.mIsFragment && (immersionBar = mImmersionBarMap.get(this.mActivity.toString())) != null) {
            immersionBar.mBarParams = this.mBarParams;
        }
    }

    public void destroy() {
        cancelListener();
        Iterator<Map.Entry<String, ImmersionBar>> it = mImmersionBarMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, ImmersionBar> next = it.next();
            if (next.getKey().contains(this.mImmersionBarName) || next.getKey().equals(this.mImmersionBarName)) {
                it.remove();
            }
        }
    }

    public void init() {
        updateBarParams();
        setBar();
        fitsLayoutOverlap();
        fitsKeyboard();
        transformView();
    }

    public BarParams getBarParams() {
        return this.mBarParams;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public ImmersionBar(Activity activity) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mActivity = activity;
        this.mWindow = activity.getWindow();
        this.mImmersionBarName = this.mActivity.toString();
        this.mBarParams = new BarParams();
        ViewGroup viewGroup = (ViewGroup) this.mWindow.getDecorView();
        this.mDecorView = viewGroup;
        this.mContentView = (ViewGroup) viewGroup.findViewById(R.id.content);
    }

    public static boolean checkFitsSystemWindows(View view) {
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (((childAt instanceof C025107z) && checkFitsSystemWindows(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getActionBarHeight(Activity activity) {
        return new BarConfig(activity).getActionBarHeight();
    }

    public static int getNavigationBarHeight(Activity activity) {
        return new BarConfig(activity).getNavigationBarHeight();
    }

    public static int getNavigationBarWidth(Activity activity) {
        return new BarConfig(activity).getNavigationBarWidth();
    }

    public static int getStatusBarHeight(Activity activity) {
        return new BarConfig(activity).getStatusBarHeight();
    }

    public static boolean hasNavigationBar(Activity activity) {
        return new BarConfig(activity).hasNavigationBar();
    }

    public static boolean hasNotchScreen(Activity activity) {
        return new BarConfig(activity).hasNotchScreen();
    }

    private int hideBar(int i) {
        int i2 = AnonymousClass3.$SwitchMap$com$gyf$barlibrary$BarHide[this.mBarParams.barHide.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i |= 514;
                }
            } else {
                i |= 1028;
            }
        } else {
            i |= 518;
        }
        return i | 4096;
    }

    public static void hideStatusBar(Window window) {
        window.setFlags(1024, 1024);
    }

    private int initBarAboveLOLLIPOP(int i) {
        if (!this.mHasNavigationBarColor) {
            this.mBarParams.defaultNavigationBarColor = this.mWindow.getNavigationBarColor();
            this.mHasNavigationBarColor = true;
        }
        int i2 = i | 1024;
        BarParams barParams = this.mBarParams;
        if (barParams.fullScreen && barParams.navigationBarEnable) {
            i2 |= 512;
        }
        this.mWindow.clearFlags(67108864);
        if (this.mBarConfig.hasNavigationBar()) {
            this.mWindow.clearFlags(134217728);
        }
        this.mWindow.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        BarParams barParams2 = this.mBarParams;
        if (barParams2.statusBarColorEnabled) {
            this.mWindow.setStatusBarColor(C07290Qj.LJFF(barParams2.statusBarAlpha, barParams2.statusBarColor, barParams2.statusBarColorTransform));
        } else {
            this.mWindow.setStatusBarColor(C07290Qj.LJFF(barParams2.statusBarAlpha, barParams2.statusBarColor, 0));
        }
        BarParams barParams3 = this.mBarParams;
        if (barParams3.navigationBarEnable) {
            this.mWindow.setNavigationBarColor(C07290Qj.LJFF(barParams3.navigationBarAlpha, barParams3.navigationBarColor, barParams3.navigationBarColorTransform));
        } else {
            this.mWindow.setNavigationBarColor(barParams3.defaultNavigationBarColor);
        }
        return i2;
    }

    public static boolean isEmpty(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNavigationAtBottom(Activity activity) {
        return new BarConfig(activity).isNavigationAtBottom();
    }

    public static void setFitsSystemWindows(Activity activity) {
        if (activity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ViewGroup) && !(childAt instanceof C025107z)) {
                childAt.setFitsSystemWindows(true);
                ((ViewGroup) childAt).setClipToPadding(true);
            }
        }
    }

    private int setNavigationIconDark(int i) {
        if (Build.VERSION.SDK_INT >= 26 && this.mBarParams.navigationBarDarkIcon) {
            return i | 16;
        }
        return i;
    }

    private int setStatusBarDarkFont(int i) {
        if (Build.VERSION.SDK_INT >= 23 && this.mBarParams.statusBarDarkFont) {
            return i | FileUtils.BUFFER_SIZE;
        }
        return i;
    }

    public static ImmersionBar with(DialogFragment dialogFragment) {
        if (dialogFragment.mo49getActivity() != null) {
            Map<String, ImmersionBar> map = mImmersionBarMap;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(dialogFragment.mo49getActivity().toString());
            LIZ.append(dialogFragment.toString());
            ImmersionBar immersionBar = map.get(X1D.LIZIZ(LIZ));
            if (immersionBar == null) {
                ImmersionBar immersionBar2 = new ImmersionBar(dialogFragment);
                Map<String, ImmersionBar> map2 = mImmersionBarMap;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(dialogFragment.mo49getActivity().toString());
                LIZ2.append(dialogFragment.toString());
                map2.put(X1D.LIZIZ(LIZ2), immersionBar2);
                return immersionBar2;
            }
            return immersionBar;
        }
        throw new IllegalArgumentException("Activity cannot be null!!!");
    }

    public ImmersionBar addTag(String str) {
        if (!isEmpty(str)) {
            this.mTagMap.put(str, this.mBarParams.m91clone());
            return this;
        }
        throw new IllegalArgumentException("tag cannot be null");
    }

    public ImmersionBar addViewSupportTransformColor(View view) {
        addViewSupportTransformColorInt(view, this.mBarParams.statusBarColorTransform);
        return this;
    }

    public ImmersionBar autoDarkModeEnable(boolean z) {
        autoDarkModeEnable(z, 0.2f);
        return this;
    }

    public ImmersionBar autoNavigationBarDarkModeEnable(boolean z) {
        autoNavigationBarDarkModeEnable(z, 0.2f);
        return this;
    }

    public ImmersionBar autoStatusBarDarkModeEnable(boolean z) {
        autoStatusBarDarkModeEnable(z, 0.2f);
        return this;
    }

    public ImmersionBar barAlpha(float f) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarAlpha = f;
        barParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar barColor(int i) {
        barColorInt(C04330Ez.LIZIZ(this.mActivity, i));
        return this;
    }

    public ImmersionBar barColorInt(int i) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = i;
        barParams.navigationBarColor = i;
        barParams.useDefaultNavigationBarColor = false;
        return this;
    }

    public ImmersionBar barColorTransform(int i) {
        barColorTransformInt(C04330Ez.LIZIZ(this.mActivity, i));
        return this;
    }

    public ImmersionBar barColorTransformInt(int i) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColorTransform = i;
        barParams.navigationBarColorTransform = i;
        return this;
    }

    public ImmersionBar fitsSystemWindows(boolean z) {
        this.mBarParams.fits = z;
        if (z) {
            if (this.mFitsStatusBarType == 0) {
                this.mFitsStatusBarType = 4;
            }
        } else {
            this.mFitsStatusBarType = 0;
        }
        return this;
    }

    public ImmersionBar fixMarginAtBottom(boolean z) {
        this.mBarParams.fixMarginAtBottom = z;
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColor(int i) {
        this.mBarParams.flymeOSStatusBarFontColor = C04330Ez.LIZIZ(this.mActivity, i);
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColorInt(int i) {
        this.mBarParams.flymeOSStatusBarFontColor = i;
        return this;
    }

    public ImmersionBar fullScreen(boolean z) {
        this.mBarParams.fullScreen = z;
        return this;
    }

    public ImmersionBar getTag(String str) {
        if (!isEmpty(str)) {
            BarParams barParams = this.mTagMap.get(str);
            if (barParams != null) {
                this.mBarParams = barParams.m91clone();
            }
            return this;
        }
        throw new IllegalArgumentException("tag cannot be null");
    }

    public ImmersionBar keyboardEnable(boolean z) {
        keyboardEnable(z, this.mBarParams.keyboardMode);
        return this;
    }

    public ImmersionBar keyboardMode(int i) {
        this.mBarParams.keyboardMode = i;
        return this;
    }

    public ImmersionBar navigationBarAlpha(float f) {
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar navigationBarColor(int i) {
        navigationBarColorInt(C04330Ez.LIZIZ(this.mActivity, i));
        return this;
    }

    public ImmersionBar navigationBarColorInt(int i) {
        BarParams barParams = this.mBarParams;
        barParams.navigationBarColor = i;
        barParams.useDefaultNavigationBarColor = false;
        return this;
    }

    public ImmersionBar navigationBarColorTransform(int i) {
        navigationBarColorTransformInt(C04330Ez.LIZIZ(this.mActivity, i));
        return this;
    }

    public ImmersionBar navigationBarColorTransformInt(int i) {
        this.mBarParams.navigationBarColorTransform = i;
        return this;
    }

    public ImmersionBar navigationBarDarkIcon(boolean z) {
        navigationBarDarkIcon(z, 0.2f);
        return this;
    }

    public ImmersionBar navigationBarEnable(boolean z) {
        this.mBarParams.navigationBarEnable = z;
        return this;
    }

    public ImmersionBar navigationBarWithEMUI3Enable(boolean z) {
        this.mBarParams.navigationBarWithEMUI3Enable = z;
        return this;
    }

    public ImmersionBar navigationBarWithKitkatEnable(boolean z) {
        this.mBarParams.navigationBarWithKitkatEnable = z;
        return this;
    }

    public ImmersionBar removeSupportView(View view) {
        if (view != null) {
            Map<Integer, Integer> map = this.mBarParams.viewMap.get(view);
            if (map != null && map.size() != 0) {
                this.mBarParams.viewMap.remove(view);
            }
            return this;
        }
        throw new IllegalArgumentException("view cannot be null");
    }

    public ImmersionBar setOnKeyboardListener(OnKeyboardListener onKeyboardListener) {
        BarParams barParams = this.mBarParams;
        if (barParams.onKeyboardListener == null) {
            barParams.onKeyboardListener = onKeyboardListener;
        }
        return this;
    }

    public ImmersionBar statusBarAlpha(float f) {
        this.mBarParams.statusBarAlpha = f;
        return this;
    }

    public ImmersionBar statusBarColor(int i) {
        statusBarColorInt(C04330Ez.LIZIZ(this.mActivity, i));
        return this;
    }

    public ImmersionBar statusBarColorInt(int i) {
        this.mBarParams.statusBarColor = i;
        return this;
    }

    public ImmersionBar statusBarColorTransform(int i) {
        statusBarColorTransformInt(C04330Ez.LIZIZ(this.mActivity, i));
        return this;
    }

    public ImmersionBar statusBarColorTransformEnable(boolean z) {
        this.mBarParams.statusBarColorEnabled = z;
        return this;
    }

    public ImmersionBar statusBarColorTransformInt(int i) {
        this.mBarParams.statusBarColorTransform = i;
        return this;
    }

    public ImmersionBar statusBarDarkFont(boolean z) {
        statusBarDarkFont(z, 0.2f);
        return this;
    }

    public ImmersionBar statusBarView(View view) {
        if (view == null) {
            return this;
        }
        this.mBarParams.statusBarView = view;
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 3;
        }
        return this;
    }

    public ImmersionBar supportActionBar(boolean z) {
        this.mBarParams.isSupportActionBar = z;
        return this;
    }

    public ImmersionBar titleBar(View view) {
        if (view == null) {
            return this;
        }
        titleBar(view, true);
        return this;
    }

    public ImmersionBar titleBarMarginTop(int i) {
        Fragment fragment = this.mFragment;
        if (fragment != null && fragment.getView() != null) {
            titleBarMarginTop(this.mFragment.getView().findViewById(i));
            return this;
        }
        titleBarMarginTop(this.mActivity.findViewById(i));
        return this;
    }

    public ImmersionBar viewAlpha(float f) {
        this.mBarParams.viewAlpha = f;
        return this;
    }

    public ImmersionBar(DialogFragment dialogFragment) {
        this(dialogFragment, dialogFragment.getDialog());
    }

    public static boolean hasNotchScreen(View view) {
        return NotchUtils.hasNotchScreen(view);
    }

    public static ImmersionBar with(Fragment fragment) {
        if (fragment.mo49getActivity() != null) {
            Map<String, ImmersionBar> map = mImmersionBarMap;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(fragment.mo49getActivity().toString());
            LIZ.append(fragment.toString());
            ImmersionBar immersionBar = map.get(X1D.LIZIZ(LIZ));
            if (immersionBar == null) {
                ImmersionBar immersionBar2 = new ImmersionBar(fragment);
                Map<String, ImmersionBar> map2 = mImmersionBarMap;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(fragment.mo49getActivity().toString());
                LIZ2.append(fragment.toString());
                map2.put(X1D.LIZIZ(LIZ2), immersionBar2);
                return immersionBar2;
            }
            return immersionBar;
        }
        throw new IllegalArgumentException("Activity cannot be null!!!");
    }

    public ImmersionBar barColor(String str) {
        barColorInt(ColorProtector.parseColor(str));
        return this;
    }

    public ImmersionBar barColorTransform(String str) {
        barColorTransformInt(ColorProtector.parseColor(str));
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColor(String str) {
        this.mBarParams.flymeOSStatusBarFontColor = ColorProtector.parseColor(str);
        return this;
    }

    public ImmersionBar hideBar(BarHide barHide) {
        this.mBarParams.barHide = barHide;
        if (OSUtils.isEMUI3_x()) {
            BarParams barParams = this.mBarParams;
            barParams.useDefaultNavigationBarColor = false;
            BarHide barHide2 = barParams.barHide;
            if (barHide2 == BarHide.FLAG_HIDE_NAVIGATION_BAR || barHide2 == BarHide.FLAG_HIDE_BAR) {
                barParams.hideNavigationBar = true;
            } else {
                barParams.hideNavigationBar = false;
            }
        }
        return this;
    }

    public ImmersionBar navigationBarColor(String str) {
        navigationBarColorInt(ColorProtector.parseColor(str));
        return this;
    }

    public ImmersionBar navigationBarColorTransform(String str) {
        navigationBarColorTransformInt(ColorProtector.parseColor(str));
        return this;
    }

    public ImmersionBar statusBarColor(String str) {
        statusBarColorInt(ColorProtector.parseColor(str));
        return this;
    }

    public ImmersionBar statusBarColorTransform(String str) {
        statusBarColorTransformInt(ColorProtector.parseColor(str));
        return this;
    }

    public ImmersionBar statusBarView(int i) {
        statusBarView(this.mActivity.findViewById(i));
        return this;
    }

    public ImmersionBar titleBar(int i) {
        titleBar(i, true);
        return this;
    }

    public ImmersionBar titleBarMarginTop(View view) {
        if (view == null) {
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 2;
        }
        this.mBarParams.titleBarView = view;
        return this;
    }

    public ImmersionBar(Fragment fragment) {
        this(fragment.mo49getActivity(), fragment);
    }

    public static ImmersionBar with(Activity activity) {
        ImmersionBar immersionBar = mImmersionBarMap.get(activity.toString());
        if (immersionBar == null) {
            ImmersionBar immersionBar2 = new ImmersionBar(activity);
            mImmersionBarMap.put(activity.toString(), immersionBar2);
            return immersionBar2;
        }
        return immersionBar;
    }

    public ImmersionBar(DialogFragment dialogFragment, Dialog dialog) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        ActivityC45651qj mo49getActivity = dialogFragment.mo49getActivity();
        this.mActivity = mo49getActivity;
        this.mFragment = dialogFragment;
        this.mDialog = dialog;
        if (mo49getActivity != null) {
            if (dialog != null) {
                if (mImmersionBarMap.get(mo49getActivity.toString()) != null) {
                    this.mWindow = this.mDialog.getWindow();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(this.mActivity.toString());
                    LIZ.append(dialogFragment.toString());
                    this.mImmersionBarName = X1D.LIZIZ(LIZ);
                    initParams();
                    return;
                }
                throw new IllegalArgumentException("you should initialize ImmersionBar in Activity first if used in Fragment");
            }
            throw new IllegalArgumentException("dialog in DialogFragment cannot be null");
        }
        throw new IllegalArgumentException("Activity cannot be null!!!");
    }

    public static void setStatusBarView(Activity activity, View view) {
        if (activity == null || view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = getStatusBarHeight(activity);
        view.setLayoutParams(layoutParams);
    }

    public static void setTitleBar(final Activity activity, final View view) {
        if (activity == null || view == null) {
            return;
        }
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = layoutParams.height;
        if (i == -2 || i == -1) {
            view.post(new Runnable() { // from class: com.gyf.barlibrary.ImmersionBar.2
                @Override // java.lang.Runnable
                public void run() {
                    com_gyf_barlibrary_ImmersionBar$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_gyf_barlibrary_ImmersionBar$2__run$___twin___() {
                    layoutParams.height = ImmersionBar.getStatusBarHeight(activity) + view.getHeight();
                    View view2 = view;
                    view2.setPadding(view2.getPaddingLeft(), ImmersionBar.getStatusBarHeight(activity) + view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                }

                public static void com_gyf_barlibrary_ImmersionBar$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_gyf_barlibrary_ImmersionBar$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return;
        }
        layoutParams.height = getStatusBarHeight(activity) + i;
        view.setPadding(view.getPaddingLeft(), getStatusBarHeight(activity) + view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void setTitleBarMarginTop(Activity activity, View view) {
        if (activity == null || view == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, getStatusBarHeight(activity) + marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    public static ImmersionBar with(DialogFragment dialogFragment, Dialog dialog) {
        if (dialogFragment.mo49getActivity() != null) {
            Map<String, ImmersionBar> map = mImmersionBarMap;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(dialogFragment.mo49getActivity().toString());
            LIZ.append(dialogFragment.toString());
            ImmersionBar immersionBar = map.get(X1D.LIZIZ(LIZ));
            if (immersionBar == null) {
                ImmersionBar immersionBar2 = new ImmersionBar(dialogFragment, dialog);
                Map<String, ImmersionBar> map2 = mImmersionBarMap;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(dialogFragment.mo49getActivity().toString());
                LIZ2.append(dialogFragment.toString());
                map2.put(X1D.LIZIZ(LIZ2), immersionBar2);
                return immersionBar2;
            }
            return immersionBar;
        }
        throw new IllegalArgumentException("Activity cannot be null!!!");
    }

    public ImmersionBar addViewSupportTransformColor(View view, int i) {
        addViewSupportTransformColorInt(view, C04330Ez.LIZIZ(this.mActivity, i));
        return this;
    }

    public ImmersionBar addViewSupportTransformColorInt(View view, int i) {
        if (view != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(this.mBarParams.statusBarColor), Integer.valueOf(i));
            this.mBarParams.viewMap.put(view, hashMap);
            return this;
        }
        throw new IllegalArgumentException("view cannot be null");
    }

    public ImmersionBar autoDarkModeEnable(boolean z, float f) {
        BarParams barParams = this.mBarParams;
        barParams.autoStatusBarDarkModeEnable = z;
        barParams.autoStatusBarDarkModeAlpha = f;
        barParams.autoNavigationBarDarkModeEnable = z;
        barParams.autoNavigationBarDarkModeAlpha = f;
        return this;
    }

    public ImmersionBar autoNavigationBarDarkModeEnable(boolean z, float f) {
        BarParams barParams = this.mBarParams;
        barParams.autoNavigationBarDarkModeEnable = z;
        barParams.autoNavigationBarDarkModeAlpha = f;
        return this;
    }

    public ImmersionBar autoStatusBarDarkModeEnable(boolean z, float f) {
        BarParams barParams = this.mBarParams;
        barParams.autoStatusBarDarkModeEnable = z;
        barParams.autoStatusBarDarkModeAlpha = f;
        return this;
    }

    public ImmersionBar barColor(int i, float f) {
        barColorInt(C04330Ez.LIZIZ(this.mActivity, i), i);
        return this;
    }

    public ImmersionBar barColorInt(int i, float f) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = i;
        barParams.navigationBarColor = i;
        barParams.useDefaultNavigationBarColor = false;
        barParams.statusBarAlpha = f;
        barParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar fitsSystemWindows(boolean z, int i) {
        fitsSystemWindowsInt(z, C04330Ez.LIZIZ(this.mActivity, i));
        return this;
    }

    public ImmersionBar fitsSystemWindowsInt(boolean z, int i) {
        fitsSystemWindowsInt(z, i, -16777216, 0.0f);
        return this;
    }

    public ImmersionBar keyboardEnable(boolean z, int i) {
        BarParams barParams = this.mBarParams;
        barParams.keyboardEnable = z;
        barParams.keyboardMode = i;
        return this;
    }

    public ImmersionBar navigationBarColor(int i, float f) {
        navigationBarColorInt(C04330Ez.LIZIZ(this.mActivity, i), f);
        return this;
    }

    public ImmersionBar navigationBarColorInt(int i, float f) {
        BarParams barParams = this.mBarParams;
        barParams.navigationBarColor = i;
        barParams.useDefaultNavigationBarColor = false;
        barParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar navigationBarDarkIcon(boolean z, float f) {
        this.mBarParams.navigationBarDarkIcon = z;
        if (z && !isSupportNavigationIconDark()) {
            this.mBarParams.navigationBarAlpha = f;
        } else {
            this.mBarParams.navigationBarAlpha = 0.0f;
        }
        return this;
    }

    public ImmersionBar statusBarColor(int i, float f) {
        statusBarColorInt(C04330Ez.LIZIZ(this.mActivity, i), f);
        return this;
    }

    public ImmersionBar statusBarColorInt(int i, float f) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = i;
        barParams.statusBarAlpha = f;
        return this;
    }

    public ImmersionBar statusBarDarkFont(boolean z, float f) {
        this.mBarParams.statusBarDarkFont = z;
        if (z && !isSupportStatusBarDarkFont()) {
            this.mBarParams.statusBarAlpha = f;
        } else {
            BarParams barParams = this.mBarParams;
            barParams.flymeOSStatusBarFontColor = 0;
            barParams.statusBarAlpha = 0.0f;
        }
        return this;
    }

    public ImmersionBar statusBarView(int i, View view) {
        statusBarView(view.findViewById(i));
        return this;
    }

    public ImmersionBar titleBar(int i, boolean z) {
        Fragment fragment = this.mFragment;
        if (fragment != null && fragment.getView() != null) {
            titleBar(this.mFragment.getView().findViewById(i), z);
            return this;
        }
        titleBar(this.mActivity.findViewById(i), z);
        return this;
    }

    public ImmersionBar titleBarMarginTop(int i, View view) {
        titleBarMarginTop(view.findViewById(i));
        return this;
    }

    public ImmersionBar(Activity activity, Fragment fragment) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mActivity = activity;
        this.mFragment = fragment;
        if (activity != null) {
            if (mImmersionBarMap.get(activity.toString()) != null) {
                this.mIsFragment = true;
                this.mWindow = this.mActivity.getWindow();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(activity.toString());
                LIZ.append(fragment.toString());
                this.mImmersionBarName = X1D.LIZIZ(LIZ);
                initParams();
                return;
            }
            throw new IllegalArgumentException("you should initialize ImmersionBar in Activity first if used in Fragment");
        }
        throw new IllegalArgumentException("Activity cannot be null!!!");
    }

    public static ImmersionBar with(Activity activity, Dialog dialog) {
        Map<String, ImmersionBar> map = mImmersionBarMap;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(activity.toString());
        LIZ.append(dialog.toString());
        ImmersionBar immersionBar = map.get(X1D.LIZIZ(LIZ));
        if (immersionBar == null) {
            ImmersionBar immersionBar2 = new ImmersionBar(activity, dialog);
            Map<String, ImmersionBar> map2 = mImmersionBarMap;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(activity.toString());
            LIZ2.append(dialog.toString());
            map2.put(X1D.LIZIZ(LIZ2), immersionBar2);
            return immersionBar2;
        }
        return immersionBar;
    }

    public ImmersionBar addViewSupportTransformColor(View view, String str) {
        addViewSupportTransformColorInt(view, ColorProtector.parseColor(str));
        return this;
    }

    public ImmersionBar barColor(String str, float f) {
        barColorInt(ColorProtector.parseColor(str), f);
        return this;
    }

    public ImmersionBar navigationBarColor(String str, float f) {
        navigationBarColorInt(ColorProtector.parseColor(str), f);
        return this;
    }

    public ImmersionBar statusBarColor(String str, float f) {
        statusBarColorInt(ColorProtector.parseColor(str), f);
        return this;
    }

    public ImmersionBar titleBar(View view, boolean z) {
        if (view == null) {
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 1;
        }
        BarParams barParams = this.mBarParams;
        barParams.titleBarView = view;
        barParams.statusBarColorEnabled = z;
        return this;
    }

    public ImmersionBar(Activity activity, Dialog dialog) {
        this(activity, dialog, "");
    }

    public static ImmersionBar with(Activity activity, Fragment fragment) {
        Map<String, ImmersionBar> map = mImmersionBarMap;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(activity.toString());
        LIZ.append(fragment.toString());
        ImmersionBar immersionBar = map.get(X1D.LIZIZ(LIZ));
        if (immersionBar == null) {
            ImmersionBar immersionBar2 = new ImmersionBar(activity, fragment);
            Map<String, ImmersionBar> map2 = mImmersionBarMap;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(activity.toString());
            LIZ2.append(fragment.toString());
            map2.put(X1D.LIZIZ(LIZ2), immersionBar2);
            return immersionBar2;
        }
        return immersionBar;
    }

    public ImmersionBar titleBar(int i, View view) {
        titleBar(view.findViewById(i), true);
        return this;
    }

    public ImmersionBar(Activity activity, Dialog dialog, String str) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mActivity = activity;
        this.mDialog = dialog;
        if (activity != null) {
            if (dialog != null) {
                if (mImmersionBarMap.get(activity.toString()) != null) {
                    this.mWindow = this.mDialog.getWindow();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(activity.toString());
                    LIZ.append(dialog.toString());
                    LIZ.append(str);
                    this.mImmersionBarName = X1D.LIZIZ(LIZ);
                    initParams();
                    return;
                }
                throw new IllegalArgumentException("you should initialize ImmersionBar in Activity first if used in Fragment");
            }
            throw new IllegalArgumentException("dialog cannot be null");
        }
        throw new IllegalArgumentException("Activity cannot be null!!!");
    }

    private void setMIUIBarDark(Window window, String str, boolean z) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField(str).getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i));
                }
            } catch (Exception unused) {
            }
        }
    }

    public static ImmersionBar with(Activity activity, Dialog dialog, String str) {
        Map<String, ImmersionBar> map = mImmersionBarMap;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(activity.toString());
        LIZ.append(dialog.toString());
        LIZ.append(str);
        ImmersionBar immersionBar = map.get(X1D.LIZIZ(LIZ));
        if (immersionBar == null) {
            ImmersionBar immersionBar2 = new ImmersionBar(activity, dialog, str);
            Map<String, ImmersionBar> map2 = mImmersionBarMap;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(activity.toString());
            LIZ2.append(dialog.toString());
            LIZ2.append(str);
            map2.put(X1D.LIZIZ(LIZ2), immersionBar2);
            return immersionBar2;
        }
        return immersionBar;
    }

    public ImmersionBar addViewSupportTransformColor(View view, int i, int i2) {
        addViewSupportTransformColorInt(view, C04330Ez.LIZIZ(this.mActivity, i), C04330Ez.LIZIZ(this.mActivity, i2));
        return this;
    }

    public ImmersionBar addViewSupportTransformColorInt(View view, int i, int i2) {
        if (view != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
            this.mBarParams.viewMap.put(view, hashMap);
            return this;
        }
        throw new IllegalArgumentException("view cannot be null");
    }

    public ImmersionBar barColor(int i, int i2, float f) {
        barColorInt(C04330Ez.LIZIZ(this.mActivity, i), C04330Ez.LIZIZ(this.mActivity, i2), f);
        return this;
    }

    public ImmersionBar barColorInt(int i, int i2, float f) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = i;
        barParams.navigationBarColor = i;
        barParams.useDefaultNavigationBarColor = false;
        barParams.statusBarColorTransform = i2;
        barParams.navigationBarColorTransform = i2;
        barParams.statusBarAlpha = f;
        barParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar navigationBarColor(int i, int i2, float f) {
        navigationBarColorInt(C04330Ez.LIZIZ(this.mActivity, i), C04330Ez.LIZIZ(this.mActivity, i2), f);
        return this;
    }

    public ImmersionBar navigationBarColorInt(int i, int i2, float f) {
        BarParams barParams = this.mBarParams;
        barParams.navigationBarColor = i;
        barParams.useDefaultNavigationBarColor = false;
        barParams.navigationBarColorTransform = i2;
        barParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar statusBarColor(int i, int i2, float f) {
        statusBarColorInt(C04330Ez.LIZIZ(this.mActivity, i), C04330Ez.LIZIZ(this.mActivity, i2), f);
        return this;
    }

    public ImmersionBar statusBarColorInt(int i, int i2, float f) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = i;
        barParams.statusBarColorTransform = i2;
        barParams.statusBarAlpha = f;
        return this;
    }

    public ImmersionBar titleBar(int i, View view, boolean z) {
        titleBar(view.findViewById(i), z);
        return this;
    }

    public ImmersionBar addViewSupportTransformColor(View view, String str, String str2) {
        addViewSupportTransformColorInt(view, ColorProtector.parseColor(str), ColorProtector.parseColor(str2));
        return this;
    }

    public ImmersionBar barColor(String str, String str2, float f) {
        barColorInt(ColorProtector.parseColor(str), ColorProtector.parseColor(str2), f);
        return this;
    }

    public ImmersionBar navigationBarColor(String str, String str2, float f) {
        navigationBarColorInt(ColorProtector.parseColor(str), ColorProtector.parseColor(str2), f);
        return this;
    }

    public ImmersionBar statusBarColor(String str, String str2, float f) {
        statusBarColorInt(ColorProtector.parseColor(str), ColorProtector.parseColor(str2), f);
        return this;
    }

    public ImmersionBar fitsSystemWindows(boolean z, int i, int i2, float f) {
        fitsSystemWindowsInt(z, C04330Ez.LIZIZ(this.mActivity, i), C04330Ez.LIZIZ(this.mActivity, i2), f);
        return this;
    }

    public ImmersionBar fitsSystemWindowsInt(boolean z, int i, int i2, float f) {
        BarParams barParams = this.mBarParams;
        barParams.fits = z;
        barParams.contentColor = i;
        barParams.contentColorTransform = i2;
        barParams.contentAlpha = f;
        if (z) {
            if (this.mFitsStatusBarType == 0) {
                this.mFitsStatusBarType = 4;
            }
        } else {
            this.mFitsStatusBarType = 0;
        }
        this.mContentView.setBackgroundColor(C07290Qj.LJFF(f, i, i2));
        return this;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup != null) {
            viewGroup.setPadding(i, i2, i3, i4);
        }
        this.mPaddingLeft = i;
        this.mPaddingTop = i2;
        this.mPaddingRight = i3;
        this.mPaddingBottom = i4;
    }
}
