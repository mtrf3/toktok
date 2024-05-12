package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.M9y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56358M9y extends F9E implements InterfaceC57784Mm4 {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, Integer.valueOf(this.LJLJJL)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public /* synthetic */ C56358M9y(String str, boolean z) {
        this(R.raw.icon_widget_filled, R.string.rt9, z, str, Integer.MAX_VALUE);
    }

    public static C56358M9y L(C56358M9y c56358M9y, int i) {
        boolean z = c56358M9y.LJLIL;
        int i2 = c56358M9y.LJLILLLLZI;
        int i3 = c56358M9y.LJLJI;
        String widgetType = c56358M9y.LJLJJI;
        o.LJIIIZ(widgetType, "widgetType");
        return new C56358M9y(i2, i3, z, widgetType, i);
    }

    public C56358M9y(int i, int i2, boolean z, String widgetType, int i3) {
        o.LJIIIZ(widgetType, "widgetType");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = widgetType;
        this.LJLJJL = i3;
    }
}
