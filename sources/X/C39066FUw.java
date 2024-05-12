package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.FUw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39066FUw implements InterfaceC39061FUr {
    public final String LJLIL;
    public final int[] LJLILLLLZI;
    public final EnumC38909FOv LJLJI;
    public final EnumC39063FUt LJLJJI;
    public final EnumC38900FOm LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;

    @Override // X.InterfaceC39061FUr
    public final void LJI(View view, Activity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC39061FUr
    public final FV3 LIZLLL() {
        C16990lb c16990lb = C16970lZ.LIZ;
        if (c16990lb != null) {
            o.LJFF(c16990lb, "AsyncInflater.config");
            if (c16990lb.LIZJ) {
                return C39069FUz.LIZ;
            }
        }
        return C39067FUx.LIZ;
    }

    @Override // X.InterfaceC39061FUr
    public final EnumC38909FOv LIZ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC39061FUr
    public final int LIZIZ() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC39061FUr
    public final int[] LIZJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC39061FUr
    public final EnumC39063FUt LJFF() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC39061FUr
    public final String LJII() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC39061FUr
    public final EnumC38900FOm threadMode() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC39061FUr
    public final ViewGroup LJ(Context context) {
        o.LJIIJ(context, "context");
        return new FrameLayout(context);
    }

    public C39066FUw(String str, int[] iArr, EnumC38909FOv mSchdulerType, EnumC39063FUt mTtlType, EnumC38900FOm mThreadMode, int i, int i2) {
        o.LJIIJ(mSchdulerType, "mSchdulerType");
        o.LJIIJ(mTtlType, "mTtlType");
        o.LJIIJ(mThreadMode, "mThreadMode");
        this.LJLIL = str;
        this.LJLILLLLZI = iArr;
        this.LJLJI = mSchdulerType;
        this.LJLJJI = mTtlType;
        this.LJLJJL = mThreadMode;
        this.LJLJJLL = i;
        this.LJLJL = i2;
    }
}
