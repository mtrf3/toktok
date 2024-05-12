package X;

import android.content.Context;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wf4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82830Wf4 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final ViewGroup LIZ;
    public C53878LCo LIZIZ;
    public InterfaceC82683Wch LIZJ;
    public WHL LIZLLL;
    public int LJ;
    public boolean LJFF = true;
    public InterfaceC65784Pro<C76800UCe> LJI = C82843WfH.LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJII = C82844WfI.LJLIL;

    public final void LIZ(EnumC82835Wf9 reuseType) {
        int i;
        o.LJIIIZ(reuseType, "reuseType");
        int i2 = C82837WfB.LIZ[reuseType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                i = R.string.q6l;
            } else {
                i = R.string.q6q;
            }
        } else {
            i = R.string.q6m;
        }
        C53878LCo c53878LCo = this.LIZIZ;
        if (c53878LCo != null) {
            c53878LCo.setText(i);
        } else {
            o.LJIJI("bubbleView");
            throw null;
        }
    }

    public C82830Wf4(Context context, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }
}
