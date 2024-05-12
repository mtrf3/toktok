package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.FUu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39064FUu implements InterfaceC39061FUr {
    public final ArrayList<Integer> LJLIL = new ArrayList<>();

    @Override // X.InterfaceC39061FUr
    public void LJI(View view, Activity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC39061FUr
    public final int[] LIZJ() {
        return ORZ.LLJ(this.LJLIL);
    }

    @Override // X.InterfaceC39061FUr
    public FV3 LIZLLL() {
        return C39067FUx.LIZ;
    }

    @Override // X.InterfaceC39061FUr
    public final EnumC39063FUt LJFF() {
        return EnumC39063FUt.ACTIVITY_DESTORY;
    }

    @Override // X.InterfaceC39061FUr
    public final EnumC38900FOm threadMode() {
        return EnumC38900FOm.SINGLE;
    }

    @Override // X.InterfaceC39061FUr
    public final ViewGroup LJ(Context context) {
        o.LJIIJ(context, "context");
        return new FrameLayout(context);
    }
}
