package X;

import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wcp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82691Wcp implements InterfaceC82702Wd0 {
    public final Context LIZ;
    public InterfaceC82683Wch LIZIZ;
    public View LIZJ;
    public final View LIZLLL;
    public boolean LJ;
    public final ArrayList<InterfaceC82692Wcq> LJFF;

    @Override // X.InterfaceC82702Wd0
    public final void LIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LIZIZ;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
        TuxIconView LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.setVisibility(8);
        }
        TuxIconView LJ = LJ();
        if (LJ == null) {
            return;
        }
        LJ.setVisibility(8);
    }

    @Override // X.InterfaceC82702Wd0
    public final TuxIconView LIZJ() {
        return (TuxIconView) this.LIZLLL.findViewById(R.id.lue);
    }

    @Override // X.InterfaceC82702Wd0
    public final TuxIconView LIZLLL() {
        return (TuxIconView) this.LIZLLL.findViewById(R.id.luf);
    }

    @Override // X.InterfaceC82702Wd0
    public final TuxIconView LJ() {
        return (TuxIconView) this.LIZLLL.findViewById(R.id.lug);
    }

    @Override // X.InterfaceC82702Wd0
    public final boolean isShowing() {
        InterfaceC82683Wch interfaceC82683Wch = this.LIZIZ;
        if (interfaceC82683Wch != null) {
            return interfaceC82683Wch.isShowing();
        }
        return false;
    }

    public C82691Wcp(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.br0, C16880lQ.LLZIL(activityC45651qj), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…e_following_bubble, null)");
        this.LIZLLL = LLLZIIL;
        this.LJ = true;
        this.LJFF = new ArrayList<>();
    }

    @Override // X.InterfaceC82702Wd0
    public final void LJFF(boolean z) {
        int i;
        TextView textView = (TextView) this.LIZLLL.findViewById(R.id.luh);
        if (textView != null) {
            if (z) {
                i = R.string.kd1;
            } else {
                i = R.string.kcz;
            }
            textView.setText(i);
        }
    }

    @Override // X.InterfaceC82702Wd0
    public final void LJI(InterfaceC82692Wcq interfaceC82692Wcq) {
        this.LJFF.add(interfaceC82692Wcq);
    }

    @Override // X.InterfaceC82702Wd0
    public final void LIZIZ(int i, int i2) {
        int i3;
        View view = this.LIZJ;
        if (view != null) {
            int[] iArr = {0, 0};
            if (!this.LJ) {
                if (view instanceof TextView) {
                    float LLILZ = (C63081OpJ.LLILZ(this.LIZ, r4.getMeasuredHeight()) - C63081OpJ.LLILZ(this.LIZ, ((TextView) view).getTextSize())) / 2;
                    int i4 = iArr[1];
                    if (LLILZ < 8.0f) {
                        i3 = C63081OpJ.LJIJJLI(this.LIZ, 8 - LLILZ);
                    } else {
                        i3 = -C63081OpJ.LJIJJLI(this.LIZ, LLILZ - 8);
                    }
                    iArr[1] = i4 + i3;
                } else {
                    iArr[1] = C63081OpJ.LJIJJLI(this.LIZ, 8.0f) + iArr[1];
                }
            }
            C142425iQ c142425iQ = new C142425iQ(this.LIZ);
            C82682Wcg c82682Wcg = c142425iQ.LIZ;
            c82682Wcg.LIZIZ = view;
            int i5 = iArr[0] + i;
            int i6 = iArr[1] + i2;
            c82682Wcg.LJ = i5;
            c82682Wcg.LJFF = i6;
            c142425iQ.LJI(WHL.BOTTOM);
            c142425iQ.LIZLLL(this.LIZLLL);
            c142425iQ.LJIIIZ(R.attr.d7);
            C82682Wcg c82682Wcg2 = c142425iQ.LIZ;
            c82682Wcg2.LJII = 5600L;
            c82682Wcg2.LJIJJLI = false;
            c142425iQ.LJIIJ(new ACListenerS34S0100000_14(this, 114), true);
            c142425iQ.LJII(new AqS164S0100000_14(this, 484));
            c142425iQ.LJ(new AqS164S0100000_14(this, 485));
            this.LIZIZ = c142425iQ.LIZJ();
        }
        InterfaceC82683Wch interfaceC82683Wch = this.LIZIZ;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.show();
        }
    }
}
