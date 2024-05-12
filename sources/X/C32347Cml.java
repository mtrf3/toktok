package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.GiftLeafRootWidget;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Cml, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32347Cml implements InterfaceC32521CpZ<AbstractC32349Cmn> {
    public final /* synthetic */ GiftLeafRootWidget LIZ;

    public C32347Cml(GiftLeafRootWidget giftLeafRootWidget) {
        this.LIZ = giftLeafRootWidget;
    }

    @Override // X.InterfaceC32521CpZ
    public final void LIZ(AbstractC32349Cmn abstractC32349Cmn) {
        C32506CpK<AbstractC32126CjC> c32506CpK;
        C32506CpK<AbstractC32126CjC> c32506CpK2;
        AbstractC32349Cmn data = abstractC32349Cmn;
        o.LJIIIZ(data, "data");
        if (data instanceof C32348Cmm) {
            GiftLeafRootWidget giftLeafRootWidget = this.LIZ;
            int zIndex = EnumC32750CtG.GIFT_PANEL_LEAF.getZIndex();
            C32580CqW LJZ = giftLeafRootWidget.LJZ();
            if (LJZ == null || !LJZ.LJJLL(zIndex)) {
                C32694CsM.LJIILJJIL = SystemClock.uptimeMillis();
                Context context = this.LIZ.context;
                o.LJIIIIZZ(context, "context");
                C32676Cs4 c32676Cs4 = new C32676Cs4(context);
                C32580CqW LJZ2 = this.LIZ.LJZ();
                if (LJZ2 != null) {
                    LJZ2.LJJLJLI(c32676Cs4, null);
                }
                C32694CsM.LJIILL = SystemClock.uptimeMillis();
                C32694CsM.LJIILLIIL = SystemClock.uptimeMillis();
                Context context2 = this.LIZ.context;
                o.LJIIIIZZ(context2, "context");
                c32676Cs4.LIZ(R.id.hi4, new C32500CpE(context2));
                C32694CsM.LJIIZILJ = SystemClock.uptimeMillis();
                C32694CsM.LJIJ = SystemClock.uptimeMillis();
                Context context3 = this.LIZ.context;
                o.LJIIIIZZ(context3, "context");
                c32676Cs4.LIZ(R.id.kz0, new C32553Cq5(context3));
                C32694CsM.LJIJI = SystemClock.uptimeMillis();
                GiftLeafRootViewModel LJZI = this.LIZ.LJZI();
                if (LJZI != null && (c32506CpK = LJZI.LJLJI) != null) {
                    Runnable runnable = ((C32348Cmm) data).LIZ;
                    C32094Cig c32094Cig = this.LIZ.LJLIL;
                    c32506CpK.LIZ(new C32127CjD(runnable, c32094Cig.LJLIL, c32094Cig.LJLILLLLZI));
                    return;
                }
                return;
            }
            GiftLeafRootViewModel LJZI2 = this.LIZ.LJZI();
            if (LJZI2 == null || (c32506CpK2 = LJZI2.LJLJI) == null) {
                return;
            }
            Runnable runnable2 = ((C32348Cmm) data).LIZ;
            C32094Cig c32094Cig2 = this.LIZ.LJLIL;
            c32506CpK2.LIZ(new C32127CjD(runnable2, c32094Cig2.LJLIL, c32094Cig2.LJLILLLLZI));
        }
    }
}
