package X;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* renamed from: X.Zu9, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91409Zu9 implements InterfaceC91212Zqy {
    public final ASL LJLIL;
    public final FragmentManager LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final LifecycleOwner LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;
    public TuxSheet LJLJLJ;

    @Override // X.InterfaceC91212Zqy
    public final void dismiss() {
        try {
            TuxSheet tuxSheet = this.LJLJLJ;
            if (tuxSheet != null) {
                tuxSheet.dismissAllowingStateLoss();
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dismissTuxSheet() error ");
            LIZ.append(e);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC91212Zqy
    public final void show() {
        ASL asl = this.LJLIL;
        DialogInterfaceOnDismissListenerC91214Zr0 dialogInterfaceOnDismissListenerC91214Zr0 = new DialogInterfaceOnDismissListenerC91214Zr0(this);
        asl.getClass();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLILLLLZI = dialogInterfaceOnDismissListenerC91214Zr0;
        this.LJLJLJ = tuxSheet;
        tuxSheet.show(this.LJLILLLLZI, this.LJLJI);
        this.LJLJJLL.invoke();
    }

    @Override // X.InterfaceC91212Zqy
    public final int LLLLZLL() {
        return this.LJLJJI;
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC91212Zqy interfaceC91212Zqy) {
        InterfaceC91212Zqy other = interfaceC91212Zqy;
        o.LJIIIZ(other, "other");
        return LLLLZLL() - other.LLLLZLL();
    }

    public /* synthetic */ C91409Zu9(ASL asl, FragmentManager fragmentManager, String str, int i, LifecycleOwner lifecycleOwner) {
        this(asl, fragmentManager, str, i, lifecycleOwner, C91585Zwz.LJLIL, C91586Zx0.LJLIL);
    }

    public C91409Zu9(ASL asl, FragmentManager fragmentManager, String str, int i, LifecycleOwner lifecycleOwner, InterfaceC65784Pro<C76800UCe> onShow, InterfaceC65784Pro<C76800UCe> onDismiss) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(onShow, "onShow");
        o.LJIIIZ(onDismiss, "onDismiss");
        this.LJLIL = asl;
        this.LJLILLLLZI = fragmentManager;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = lifecycleOwner;
        this.LJLJJLL = onShow;
        this.LJLJL = onDismiss;
    }
}
