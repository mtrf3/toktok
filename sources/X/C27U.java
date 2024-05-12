package X;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.27U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27U extends DialogC39751hD {
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public C25860zu LJLJJI;
    public final View LJLJJL;
    public final C36531c1 LJLJJLL;
    public final int LJLJL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public static final void LIZJ(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C36531c1) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ViewGroup) && (viewGroup2 = (ViewGroup) childAt) != null) {
                LIZJ(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent && this.LJLJJI.LIZIZ) {
            this.LJLJI.invoke();
        }
        return onTouchEvent;
    }

    public final void LIZLLL(InterfaceC65784Pro<C76800UCe> onDismissRequest, C25860zu properties, EnumC23500w6 layoutDirection) {
        int i;
        o.LJIIIZ(onDismissRequest, "onDismissRequest");
        o.LJIIIZ(properties, "properties");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        this.LJLJI = onDismissRequest;
        this.LJLJJI = properties;
        boolean LIZ = C25810zp.LIZ(properties.LIZJ, C25830zr.LIZJ(this.LJLJJL));
        Window window = getWindow();
        o.LJI(window);
        if (LIZ) {
            i = FileUtils.BUFFER_SIZE;
        } else {
            i = -8193;
        }
        window.setFlags(i, FileUtils.BUFFER_SIZE);
        C36531c1 c36531c1 = this.LJLJJLL;
        int i2 = C25890zx.LIZ[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new C162476Zf();
            }
        } else {
            i3 = 0;
        }
        c36531c1.setLayoutDirection(i3);
        this.LJLJJLL.LJLL = properties.LIZLLL;
        if (Build.VERSION.SDK_INT < 31) {
            if (properties.LJ) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.LJLJL);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 == null) {
                return;
            }
            window3.setSoftInputMode(16);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C27U(X.InterfaceC65784Pro<X.C76800UCe> r7, X.C25860zu r8, android.view.View r9, X.EnumC23500w6 r10, X.InterfaceC23370vt r11, java.util.UUID r12) {
        /*
            r6 = this;
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "layoutDirection"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            android.view.ContextThemeWrapper r3 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r2 >= r0) goto L29
            boolean r0 = r8.LJ
            if (r0 == 0) goto Le3
        L29:
            r0 = 2131886361(0x7f120119, float:1.9407299E38)
        L2c:
            r3.<init>(r1, r0)
            r6.<init>(r3)
            r6.LJLJI = r7
            r6.LJLJJI = r8
            r6.LJLJJL = r9
            r0 = 8
            float r5 = (float) r0
            android.view.Window r4 = r6.getWindow()
            if (r4 == 0) goto Le8
            android.view.WindowManager$LayoutParams r0 = r4.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r6.LJLJL = r0
            r3 = 1
            r4.requestFeature(r3)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r4.setBackgroundDrawableResource(r0)
            X.0zu r0 = r6.LJLJJI
            boolean r1 = r0.LJ
            r0 = 30
            if (r2 < r0) goto Lde
            X.C16720lA.LIZ(r4, r1)
        L60:
            X.1c1 r2 = new X.1c1
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1, r4)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Dialog:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            r0 = 2131364799(0x7f0a0bbf, float:1.8349445E38)
            r2.setTag(r0, r1)
            r0 = 0
            r2.setClipChildren(r0)
            float r0 = r11.LJJJJIZL(r5)
            r2.setElevation(r0)
            X.0zw r0 = new X.0zw
            r0.<init>()
            r2.setOutlineProvider(r0)
            r6.LJLJJLL = r2
            android.view.View r1 = r4.getDecorView()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto La8
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto La8
            LIZJ(r1)
        La8:
            r6.setContentView(r2)
            androidx.lifecycle.LifecycleOwner r0 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r9)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r2, r0)
            androidx.lifecycle.ViewModelStoreOwner r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r9)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r2, r0)
            X.1c5 r0 = X.C10A.LIZ(r9)
            X.C10A.LIZIZ(r2, r0)
            X.Pro<X.UCe> r1 = r6.LJLJI
            X.0zu r0 = r6.LJLJJI
            r6.LIZLLL(r1, r0, r10)
            androidx.activity.OnBackPressedDispatcher r2 = r6.LJLILLLLZI
            kotlin.jvm.internal.IDqS416S0100000 r1 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 330(0x14a, float:4.62E-43)
            r1.<init>(r6, r0)
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            X.18H r0 = new X.18H
            r0.<init>(r3)
            r2.LIZ(r6, r0)
            return
        Lde:
            X.C16700l8.LIZ(r4, r1)
            goto L60
        Le3:
            r0 = 2131886367(0x7f12011f, float:1.940731E38)
            goto L2c
        Le8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Dialog has no window"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27U.<init>(X.Pro, X.0zu, android.view.View, X.0w6, X.0vt, java.util.UUID):void");
    }
}
