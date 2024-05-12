package X;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Map;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wuq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83808Wuq extends FrameLayout implements InterfaceC83700Wt6 {
    public C29S LJLIL;
    public boolean LJLILLLLZI;
    public final C83811Wut LJLJI;
    public final C83809Wur LJLJJI;
    public final C83807Wup LJLJJL;

    @Override // X.InterfaceC83700Wt6
    public final void onDestroy() {
        C83809Wur c83809Wur = this.LJLJJI;
        for (Map.Entry<Class<?>, InterfaceC83812Wuu<?>> entry : c83809Wur.LIZ.entrySet()) {
            Class<?> key = entry.getKey();
            InterfaceC83812Wuu<?> value = entry.getValue();
            if (!c83809Wur.LIZIZ.contains(key)) {
                value.onDestroy();
            }
        }
    }

    public InterfaceC83793Wub getCkCameraViewLikeFunction() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC83700Wt6
    public InterfaceC83810Wus getFunctionApiMgr() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC83700Wt6
    public final void LIZJ(C29S c29s) {
        this.LJLIL = c29s;
        C83807Wup c83807Wup = this.LJLJJL;
        c83807Wup.getClass();
        c83807Wup.LIZ = new FrameLayout(c83807Wup.LJ.getContext());
        c83807Wup.LIZIZ = new FrameLayout(c83807Wup.LJ.getContext());
        c83807Wup.LIZJ = new FrameLayout(c83807Wup.LJ.getContext());
        C83808Wuq c83808Wuq = c83807Wup.LJ;
        FrameLayout frameLayout = c83807Wup.LIZ;
        if (frameLayout != null) {
            c83808Wuq.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            C83808Wuq c83808Wuq2 = c83807Wup.LJ;
            FrameLayout frameLayout2 = c83807Wup.LIZIZ;
            if (frameLayout2 != null) {
                c83808Wuq2.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                C83808Wuq c83808Wuq3 = c83807Wup.LJ;
                FrameLayout frameLayout3 = c83807Wup.LIZJ;
                if (frameLayout3 != null) {
                    c83808Wuq3.addView(frameLayout3, new FrameLayout.LayoutParams(-1, -1));
                    this.LJLILLLLZI = true;
                    return;
                } else {
                    o.LJIJI("topLayer");
                    throw null;
                }
            }
            o.LJIJI("middleLayer");
            throw null;
        }
        o.LJIJI("bottomLayer");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83808Wuq(C29S context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        this.LJLJI = new C83811Wut(this);
        this.LJLJJI = new C83809Wur(new AqS164S0100000_14(this, 349), new AqS164S0100000_14(this, 350));
        this.LJLJJL = new C83807Wup(this);
    }
}
