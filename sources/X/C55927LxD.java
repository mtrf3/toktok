package X;

import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LxD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55927LxD {
    public final Context LIZ;
    public final View LIZIZ;
    public final int LIZJ;
    public View LIZLLL;
    public InterfaceC82683Wch LJ;
    public EnumC55811LvL LJFF;
    public final List<InterfaceC55929LxF> LJI;
    public final float LJII;

    public final boolean LIZIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LJ;
        if (interfaceC82683Wch == null || !interfaceC82683Wch.isShowing()) {
            return false;
        }
        return true;
    }

    public final void LIZ(EnumC55811LvL disappearType) {
        String str;
        o.LJIIIZ(disappearType, "disappearType");
        if (LIZIZ()) {
            if (this.LJFF != EnumC55811LvL.CLICK_BUBBLE) {
                this.LJFF = disappearType;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ShopTab Tooltip TooltipCallback hideTooltipifShowing bubbleDisappearType: ");
                EnumC55811LvL enumC55811LvL = this.LJFF;
                if (enumC55811LvL != null) {
                    str = enumC55811LvL.getValue();
                } else {
                    str = null;
                }
                CK3.LIZIZ(LIZ, str, LIZ, 3);
            }
            InterfaceC82683Wch interfaceC82683Wch = this.LJ;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.dismiss();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.2mo] */
    public final void LIZJ(C68722mq tooltipConfig) {
        C68692mn c68692mn;
        WHL whl;
        int i;
        o.LJIIIZ(tooltipConfig, "tooltipConfig");
        String str = tooltipConfig.LIZIZ;
        if (o.LJ(str, EnumC55928LxE.SHOP_TAB_BASE_TOOLTIP.getValue())) {
            c68692mn = new C68692mn(this.LIZ);
        } else if (o.LJ(str, EnumC55928LxE.SHOP_TAB_VOUCHER_TOOLTIP.getValue())) {
            c68692mn = new C68702mo(this.LIZ);
        } else {
            c68692mn = new C68692mn(this.LIZ);
        }
        c68692mn.setContent(tooltipConfig);
        this.LIZLLL = c68692mn;
        if (this.LIZJ == L86.BOTTOM_TAB.getValue()) {
            whl = WHL.TOP;
        } else {
            whl = WHL.BOTTOM;
        }
        View view = this.LIZIZ;
        int[] iArr = {0, 0};
        try {
            if (this.LIZJ == L86.TOP_TAB.getValue() && (view instanceof TextView)) {
                float LLILZ = C63081OpJ.LLILZ(this.LIZ, ((TextView) view).getTextSize());
                float LLILZ2 = C63081OpJ.LLILZ(this.LIZ, ((TextView) view).getMeasuredHeight());
                float f = (LLILZ2 - LLILZ) / 2;
                C36746EbW.LIZ(3, "ShopTab Tooltip Offset viewHeight:" + LLILZ2 + " fontSize:" + LLILZ + " diff:" + f);
                int i2 = iArr[1];
                float f2 = this.LJII;
                if (f < f2) {
                    i = C63081OpJ.LJIJJLI(this.LIZ, f2 - f);
                } else {
                    i = -C63081OpJ.LJIJJLI(this.LIZ, f - f2);
                }
                iArr[1] = i2 + i;
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        this.LJFF = EnumC55811LvL.BEYOND_TIME_LIMIT;
        C142425iQ c142425iQ = new C142425iQ(this.LIZ);
        c142425iQ.LIZIZ(this.LIZIZ);
        c142425iQ.LJFF();
        int i3 = iArr[0];
        int i4 = iArr[1];
        C82682Wcg c82682Wcg = c142425iQ.LIZ;
        c82682Wcg.LJ = i3;
        c82682Wcg.LJFF = i4;
        c142425iQ.LJI(whl);
        c142425iQ.LIZ.LJIJ = c68692mn;
        c142425iQ.LJIIIZ(R.attr.eh);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        C82682Wcg c82682Wcg2 = c142425iQ.LIZ;
        c82682Wcg2.LJIIIIZZ = LJJIIZ;
        c82682Wcg2.LJIJJLI = false;
        c82682Wcg2.LJII = tooltipConfig.LJ;
        c142425iQ.LJIIJ(new ACListenerS29S0100000_9(this, 183), true);
        c142425iQ.LJII(new AqS159S0100000_9(this, 1019));
        c142425iQ.LJ(new AqS159S0100000_9(this, 1020));
        InterfaceC82683Wch LIZJ = c142425iQ.LIZJ();
        this.LJ = LIZJ;
        LIZJ.show();
    }

    public C55927LxD(Context context, View view, int i) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = i;
        this.LJI = new ArrayList();
        this.LJII = 4.0f;
    }
}
