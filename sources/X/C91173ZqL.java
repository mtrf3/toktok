package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZqL, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91173ZqL {
    public final InterfaceC65784Pro<List<InterfaceC91177ZqP>> LIZ;
    public final InterfaceC65784Pro<InterfaceC91178ZqQ> LIZIZ;
    public final InterfaceC88476Ynw<Boolean, String, String, String, String, Context, C76800UCe> LIZJ;
    public final C91171ZqJ LIZLLL;
    public final C91373ZtZ LJ;
    public InterfaceC91159Zq7 LJFF;
    public boolean LJI;
    public final ActivityC45651qj LJII;
    public C91169ZqH LJIIIIZZ;
    public final HashMap<String, InterfaceC91177ZqP> LJIIIZ = new HashMap<>();

    public C91173ZqL(FrameLayout frameLayout, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC88476Ynw interfaceC88476Ynw) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = interfaceC65784Pro2;
        this.LIZJ = interfaceC88476Ynw;
        Context context = frameLayout.getContext();
        o.LJIIIIZZ(context, "viewGroup.context");
        C91171ZqJ c91171ZqJ = new C91171ZqJ(context);
        c91171ZqJ.setXTabStyle(true);
        this.LIZLLL = c91171ZqJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c91171ZqJ.setLayoutParams(layoutParams);
        c91171ZqJ.setBackgroundColor(frameLayout.getContext().getResources().getColor(R.color.cz));
        frameLayout.addView(c91171ZqJ, 0);
        Context context2 = c91171ZqJ.getContext();
        o.LJIIIIZZ(context2, "host.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
        o.LJI(LJJIFFI);
        this.LJII = LJJIFFI;
        c91171ZqJ.setVisibility(0);
        if (c91171ZqJ.LJLLJ == null) {
            c91171ZqJ.LJLLJ = new C91373ZtZ(c91171ZqJ);
        }
        C91373ZtZ c91373ZtZ = c91171ZqJ.LJLLJ;
        o.LJI(c91373ZtZ);
        this.LJ = c91373ZtZ;
    }
}
