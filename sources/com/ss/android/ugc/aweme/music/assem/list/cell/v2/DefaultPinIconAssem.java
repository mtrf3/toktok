package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C2068389v;
import X.C240639cR;
import X.C240719cZ;
import X.C78983UzD;
import X.C7MY;
import X.C8XO;
import X.EnumC240399c3;
import X.KL2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DefaultPinIconAssem extends ReusedUISlotAssem<DefaultPinIconAssem> implements C8XO<C240719cZ> {
    public TuxIconView LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6b;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public DefaultPinIconAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C240719cZ c240719cZ) {
        int i;
        int i2;
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        C240639cR c240639cR = item.LJLILLLLZI;
        boolean z = c240639cR.LJLJI;
        boolean z2 = c240639cR.LJLILLLLZI;
        EnumC240399c3 enumC240399c3 = c240639cR.LJLIL;
        if (z || z2) {
            C78983UzD.LJJIL(Y3());
            return;
        }
        C78983UzD.LJJLIIIJL(Y3());
        TuxIconView tuxIconView = this.LLFF;
        if (tuxIconView == null) {
            return;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = C7MY.LIZIZ(20);
        c2068389v.LIZJ = C7MY.LIZIZ(20);
        EnumC240399c3 enumC240399c32 = EnumC240399c3.PINNED;
        if (enumC240399c3 == enumC240399c32) {
            i = R.raw.icon_pin_fill;
        } else {
            i = R.raw.icon_pin;
        }
        c2068389v.LIZ = i;
        if (enumC240399c3 == enumC240399c32 || enumC240399c3 == EnumC240399c3.ENABLE_PINNED) {
            i2 = R.attr.go;
        } else {
            i2 = R.attr.gp;
        }
        c2068389v.LJ = Integer.valueOf(i2);
        tuxIconView.setTuxIcon(c2068389v);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.gr6);
        int LIZIZ = C7MY.LIZIZ(10);
        int i = -LIZIZ;
        KL2.LJII(tuxIconView, i, i, LIZIZ, LIZIZ);
        this.LLFF = tuxIconView;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
