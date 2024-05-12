package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.mediarouter.app.MediaRouteChooserDialogFragment;
import androidx.mediarouter.app.MediaRouteControllerDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes29.dex */
public final class ZX9 extends View {
    public static ZX8 LJLLLLLL;
    public static final SparseArray<Drawable.ConstantState> LJLZ = new SparseArray<>(2);
    public static final int[] LJZ = {R.attr.state_checked};
    public static final int[] LJZI = {R.attr.state_checkable};
    public final ZY5 LJLIL;
    public final C90573Zgf LJLILLLLZI;
    public C90101ZXt LJLJI;
    public ZXK LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public AsyncTaskC90574Zgg LJLJL;
    public Drawable LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public final ColorStateList LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;

    public final void LIZ() {
        if (this.LJLJLLL > 0) {
            AsyncTaskC90574Zgg asyncTaskC90574Zgg = this.LJLJL;
            if (asyncTaskC90574Zgg != null) {
                asyncTaskC90574Zgg.cancel(false);
            }
            AsyncTaskC90574Zgg asyncTaskC90574Zgg2 = new AsyncTaskC90574Zgg(this, this.LJLJLLL, getContext());
            this.LJLJL = asyncTaskC90574Zgg2;
            this.LJLJLLL = 0;
            asyncTaskC90574Zgg2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (X.ZY5.LJFF(r0, 1) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r6 = this;
            X.ZY5 r0 = r6.LJLIL
            r0.getClass()
            X.ZY4 r1 = X.ZY5.LJ()
            boolean r0 = r1.LIZLLL()
            r5 = 0
            r2 = 1
            if (r0 != 0) goto L83
            X.ZXt r0 = r6.LJLJI
            boolean r0 = r1.LJII(r0)
            if (r0 == 0) goto L83
            int r4 = r1.LJII
        L1b:
            int r0 = r6.LJLL
            if (r0 == r4) goto L81
            r6.LJLL = r4
            r3 = 1
            r6.LJFF()
            r6.refreshDrawableState()
        L28:
            if (r4 != r2) goto L2d
            r6.LIZ()
        L2d:
            boolean r0 = r6.LJLJJL
            if (r0 == 0) goto L46
            boolean r0 = r6.LJLLL
            if (r0 != 0) goto L42
            X.ZY5 r1 = r6.LJLIL
            X.ZXt r0 = r6.LJLJI
            r1.getClass()
            boolean r0 = X.ZY5.LJFF(r0, r2)
            if (r0 == 0) goto L43
        L42:
            r5 = 1
        L43:
            r6.setEnabled(r5)
        L46:
            android.graphics.drawable.Drawable r0 = r6.LJLJLJ
            if (r0 == 0) goto L6b
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            boolean r0 = r0 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L6b
            android.graphics.drawable.Drawable r0 = r6.LJLJLJ
            android.graphics.drawable.Drawable r1 = r0.getCurrent()
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            boolean r0 = r6.LJLJJL
            if (r0 == 0) goto L6c
            if (r3 != 0) goto L62
            if (r4 != r2) goto L6b
        L62:
            boolean r0 = r1.isRunning()
            if (r0 != 0) goto L6b
            r1.start()
        L6b:
            return
        L6c:
            r0 = 2
            if (r4 != r0) goto L6b
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L78
            r1.stop()
        L78:
            int r0 = r1.getNumberOfFrames()
            int r0 = r0 - r2
            r1.selectDrawable(r0)
            goto L6b
        L81:
            r3 = 0
            goto L28
        L83:
            r4 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ZX9.LIZIZ():void");
    }

    public final void LIZJ() {
        boolean z;
        int i = this.LJLJJLL;
        if (i == 0 && !this.LJLLL && !LJLLLLLL.LIZIZ) {
            i = 4;
        }
        super.setVisibility(i);
        Drawable drawable = this.LJLJLJ;
        if (drawable != null) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    public final boolean LIZLLL() {
        List<ResolveInfo> queryIntentActivities;
        ApplicationInfo applicationInfo;
        if (!this.LJLJJL) {
            return false;
        }
        this.LJLIL.getClass();
        ZY5.LIZIZ();
        C90605ZhB c90605ZhB = ZY5.LIZJ;
        C90509Zfd c90509Zfd = c90605ZhB.LJIILIIL;
        if (c90509Zfd != null) {
            if (c90509Zfd.LIZ && c90605ZhB.LIZIZ) {
                Context context = getContext();
                Intent putExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
                this.LJLIL.getClass();
                Intent putExtra2 = putExtra.putExtra("key_media_session_token", ZY5.LIZLLL());
                PackageManager packageManager = context.getPackageManager();
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{putExtra2, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-7542910701170827091"));
                if (LIZJ.LIZ) {
                    queryIntentActivities = (List) LIZJ.LIZIZ;
                } else {
                    queryIntentActivities = packageManager.queryIntentActivities(putExtra2, 0);
                }
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                        context.startActivity(putExtra2);
                        return true;
                    }
                }
            }
            return LJ();
        }
        return LJ();
    }

    public final void LJFF() {
        int i;
        int i2 = this.LJLL;
        if (i2 != 1) {
            if (i2 != 2) {
                i = com.zhiliaoapp.musically.R.string.am;
            } else {
                i = com.zhiliaoapp.musically.R.string.ak;
            }
        } else {
            i = com.zhiliaoapp.musically.R.string.al;
        }
        String string = getContext().getString(i);
        setContentDescription(string);
        if (!this.LJLLLL || TextUtils.isEmpty(string)) {
            string = null;
        }
        C03E.LIZ(this, string);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof ActivityC45651qj) {
            return ((ActivityC45651qj) activity).getSupportFragmentManager();
        }
        return null;
    }

    public final boolean LJ() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            this.LJLIL.getClass();
            ZY4 LJ = ZY5.LJ();
            if (LJ.LIZLLL() || !LJ.LJII(this.LJLJI)) {
                if (fragmentManager.LJJJIL("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                    return false;
                }
                this.LJLJJI.getClass();
                MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
                C90101ZXt c90101ZXt = this.LJLJI;
                if (c90101ZXt != null) {
                    mediaRouteChooserDialogFragment.vl();
                    if (!mediaRouteChooserDialogFragment.LJLILLLLZI.equals(c90101ZXt)) {
                        mediaRouteChooserDialogFragment.LJLILLLLZI = c90101ZXt;
                        Bundle arguments = mediaRouteChooserDialogFragment.getArguments();
                        if (arguments == null) {
                            arguments = new Bundle();
                        }
                        arguments.putBundle("selector", c90101ZXt.LIZ);
                        mediaRouteChooserDialogFragment.setArguments(arguments);
                        C18Z c18z = mediaRouteChooserDialogFragment.LJLIL;
                        if (c18z != null) {
                            ((DialogC90859ZlH) c18z).LJIJJLI(c90101ZXt);
                        }
                    }
                    C1B3 c1b3 = new C1B3(fragmentManager);
                    c1b3.LJIIIIZZ(0, 1, mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
                    c1b3.LJI();
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            } else {
                if (fragmentManager.LJJJIL("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                    return false;
                }
                this.LJLJJI.getClass();
                MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
                C90101ZXt c90101ZXt2 = this.LJLJI;
                if (c90101ZXt2 != null) {
                    if (mediaRouteControllerDialogFragment.LJLILLLLZI == null) {
                        Bundle arguments2 = mediaRouteControllerDialogFragment.getArguments();
                        if (arguments2 != null) {
                            mediaRouteControllerDialogFragment.LJLILLLLZI = C90101ZXt.LIZIZ(arguments2.getBundle("selector"));
                        }
                        if (mediaRouteControllerDialogFragment.LJLILLLLZI == null) {
                            mediaRouteControllerDialogFragment.LJLILLLLZI = C90101ZXt.LIZJ;
                        }
                    }
                    if (!mediaRouteControllerDialogFragment.LJLILLLLZI.equals(c90101ZXt2)) {
                        mediaRouteControllerDialogFragment.LJLILLLLZI = c90101ZXt2;
                        Bundle arguments3 = mediaRouteControllerDialogFragment.getArguments();
                        if (arguments3 == null) {
                            arguments3 = new Bundle();
                        }
                        arguments3.putBundle("selector", c90101ZXt2.LIZ);
                        mediaRouteControllerDialogFragment.setArguments(arguments3);
                    }
                    C1B3 c1b32 = new C1B3(fragmentManager);
                    c1b32.LJIIIIZZ(0, 1, mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
                    c1b32.LJI();
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            }
            return true;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.LJLJLJ != null) {
            this.LJLJLJ.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.LJLJLJ;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.LJLJJL = true;
        if (!this.LJLJI.LIZJ()) {
            this.LJLIL.LIZ(this.LJLJI, this.LJLILLLLZI, 0);
        }
        LIZIZ();
        ZX8 zx8 = LJLLLLLL;
        if (((ArrayList) zx8.LIZJ).size() == 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C16880lQ.LJJLIIIJILLIZJL(zx8, zx8.LIZ, intentFilter);
        }
        ((ArrayList) zx8.LIZJ).add(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.LJLJJL = false;
            if (!this.LJLJI.LIZJ()) {
                this.LJLIL.LJI(this.LJLILLLLZI);
            }
            ZX8 zx8 = LJLLLLLL;
            ((ArrayList) zx8.LIZJ).remove(this);
            if (((ArrayList) zx8.LIZJ).size() == 0) {
                C16880lQ.LJJLIIIJL(zx8.LIZ, zx8);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        LIZ();
        if (!LIZLLL() && !performClick) {
            return false;
        }
        return true;
    }

    public ZXK getDialogFactory() {
        return this.LJLJJI;
    }

    public C90101ZXt getRouteSelector() {
        return this.LJLJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ZX9(android.content.Context r13) {
        /*
            r12 = this;
            android.view.ContextThemeWrapper r3 = new android.view.ContextThemeWrapper
            int r0 = X.ZXT.LJFF(r13)
            r3.<init>(r13, r0)
            r0 = 1812070461(0x6c02003d, float:6.286459E26)
            int r1 = X.ZXT.LJII(r0, r3)
            if (r1 == 0) goto L18
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r3, r1)
            r3 = r0
        L18:
            r9 = 0
            r2 = 1812070449(0x6c020031, float:6.2864504E26)
            r6 = r12
            r6.<init>(r3, r9, r2)
            X.ZXt r0 = X.C90101ZXt.LIZJ
            r6.LJLJI = r0
            X.ZXK r0 = X.ZXK.LIZ
            r6.LJLJJI = r0
            r3 = 0
            r6.LJLJJLL = r3
            android.content.Context r7 = r6.getContext()
            r1 = 5
            int[] r0 = new int[r1]
            r0 = {x00e6: FILL_ARRAY_DATA , data: [16843071, 16843072, 1812070445, 1812070446, 1812070450} // fill-array
            android.content.res.TypedArray r10 = r7.obtainStyledAttributes(r9, r0, r2, r3)
            int[] r8 = new int[r1]
            r8 = {x00f4: FILL_ARRAY_DATA , data: [16843071, 16843072, 1812070445, 1812070446, 1812070450} // fill-array
            r11 = 1812070449(0x6c020031, float:6.2864504E26)
            o3.h0.LJIJ(r6, r7, r8, r9, r10, r11)
            boolean r0 = r6.isInEditMode()
            r2 = 3
            if (r0 == 0) goto L5e
            r6.LJLIL = r9
            r6.LJLILLLLZI = r9
            int r1 = r10.getResourceId(r2, r3)
            android.content.res.Resources r0 = r6.getResources()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r6.LJLJLJ = r0
        L5d:
            return
        L5e:
            X.ZY5 r0 = X.ZY5.LIZJ(r7)
            r6.LJLIL = r0
            X.Zgf r0 = new X.Zgf
            r0.<init>(r6)
            r6.LJLILLLLZI = r0
            X.ZX8 r0 = X.ZX9.LJLLLLLL
            if (r0 != 0) goto L7a
            X.ZX8 r1 = new X.ZX8
            android.content.Context r0 = X.C16880lQ.LLLLL(r7)
            r1.<init>(r0)
            X.ZX9.LJLLLLLL = r1
        L7a:
            r0 = 4
            android.content.res.ColorStateList r0 = r10.getColorStateList(r0)
            r6.LJLLI = r0
            int r0 = r10.getDimensionPixelSize(r3, r3)
            r6.LJLLILLLL = r0
            r4 = 1
            int r0 = r10.getDimensionPixelSize(r4, r3)
            r6.LJLLJ = r0
            int r5 = r10.getResourceId(r2, r3)
            r0 = 2
            int r0 = r10.getResourceId(r0, r3)
            r6.LJLJLLL = r0
            r10.recycle()
            int r1 = r6.LJLJLLL
            if (r1 == 0) goto Lb1
            android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = X.ZX9.LJLZ
            java.lang.Object r0 = r0.get(r1)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 == 0) goto Lb1
            android.graphics.drawable.Drawable r0 = r0.newDrawable()
            r6.setRemoteIndicatorDrawable(r0)
        Lb1:
            android.graphics.drawable.Drawable r0 = r6.LJLJLJ
            if (r0 != 0) goto Lc8
            if (r5 == 0) goto Le2
            android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = X.ZX9.LJLZ
            java.lang.Object r0 = r0.get(r5)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 == 0) goto Lcf
            android.graphics.drawable.Drawable r0 = r0.newDrawable()
            r6.setRemoteIndicatorDrawableInternal(r0)
        Lc8:
            r6.LJFF()
            r6.setClickable(r4)
            goto L5d
        Lcf:
            X.Zgg r2 = new X.Zgg
            android.content.Context r0 = r6.getContext()
            r2.<init>(r6, r5, r0)
            r6.LJLJL = r2
            java.util.concurrent.Executor r1 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r0 = new java.lang.Void[r3]
            r2.executeOnExecutor(r1, r0)
            goto Lc8
        Le2:
            r6.LIZ()
            goto Lc8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ZX9.<init>(android.content.Context):void");
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.LJLIL == null) {
            return onCreateDrawableState;
        }
        ZY5.LIZIZ();
        C90509Zfd c90509Zfd = ZY5.LIZJ.LJIILIIL;
        if (c90509Zfd != null && c90509Zfd.LIZJ.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON")) {
            return onCreateDrawableState;
        }
        int i2 = this.LJLL;
        if (i2 != 1) {
            if (i2 == 2) {
                View.mergeDrawableStates(onCreateDrawableState, LJZ);
            }
        } else {
            View.mergeDrawableStates(onCreateDrawableState, LJZI);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLJLJ != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.LJLJLJ.getIntrinsicWidth();
            int intrinsicHeight = this.LJLJLJ.getIntrinsicHeight();
            int i = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i2 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.LJLJLJ.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.LJLJLJ.draw(canvas);
        }
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.LJLLL) {
            this.LJLLL = z;
            LIZJ();
            LIZIZ();
        }
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.LJLLLL) {
            this.LJLLLL = z;
            LJFF();
        }
    }

    public void setDialogFactory(ZXK zxk) {
        if (zxk != null) {
            this.LJLJJI = zxk;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.LJLJLLL = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        Drawable drawable2;
        boolean z;
        AsyncTaskC90574Zgg asyncTaskC90574Zgg = this.LJLJL;
        if (asyncTaskC90574Zgg != null) {
            asyncTaskC90574Zgg.cancel(false);
        }
        Drawable drawable3 = this.LJLJLJ;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.LJLJLJ);
        }
        if (drawable != null) {
            if (this.LJLLI != null) {
                drawable = C07840Sm.LJFF(drawable.mutate());
                C07820Sk.LJII(drawable, this.LJLLI);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
        this.LJLJLJ = drawable;
        refreshDrawableState();
        if (this.LJLJJL && (drawable2 = this.LJLJLJ) != null && (drawable2.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.LJLJLJ.getCurrent();
            int i = this.LJLL;
            if (i == 1) {
                if (!animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            } else {
                if (i != 2) {
                    return;
                }
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    public void setRouteSelector(C90101ZXt c90101ZXt) {
        if (c90101ZXt != null) {
            if (!this.LJLJI.equals(c90101ZXt)) {
                if (this.LJLJJL) {
                    if (!this.LJLJI.LIZJ()) {
                        this.LJLIL.LJI(this.LJLILLLLZI);
                    }
                    if (!c90101ZXt.LIZJ()) {
                        this.LJLIL.LIZ(c90101ZXt, this.LJLILLLLZI, 0);
                    }
                }
                this.LJLJI = c90101ZXt;
                LIZIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.LJLJJLL = i;
        LIZJ();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.LJLJLJ) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i4 = this.LJLLILLLL;
        Drawable drawable = this.LJLJLJ;
        int i5 = 0;
        if (drawable != null) {
            i3 = drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight();
        } else {
            i3 = 0;
        }
        int max = Math.max(i4, i3);
        int i6 = this.LJLLJ;
        Drawable drawable2 = this.LJLJLJ;
        if (drawable2 != null) {
            i5 = drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
        }
        int max2 = Math.max(i6, i5);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = max;
            }
        } else {
            size = Math.min(size, max);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = max2;
            }
        } else {
            size2 = Math.min(size2, max2);
        }
        setMeasuredDimension(size, size2);
    }
}
