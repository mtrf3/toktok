package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C2068389v;
import X.C240639cR;
import X.C240719cZ;
import X.C78983UzD;
import X.C7MY;
import X.C8XO;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DefaultSimilarSoundsAssem extends ReusedUISlotAssem<DefaultSimilarSoundsAssem> implements C8XO<C240719cZ> {
    public TuxIconView LLFF;
    public TuxTextView LLFFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6n;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public DefaultSimilarSoundsAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    public void m4(C240719cZ item) {
        String str;
        Resources resources;
        int i;
        o.LJIIIZ(item, "item");
        C240639cR c240639cR = item.LJLILLLLZI;
        if (c240639cR.LJLJJI <= 0) {
            C78983UzD.LJJIL(Y3());
            return;
        }
        C78983UzD.LJJLIIIJL(Y3());
        TuxIconView tuxIconView = this.LLFF;
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZIZ = C7MY.LIZIZ(12);
            c2068389v.LIZJ = C7MY.LIZIZ(12);
            if (c240639cR.LJLJJL) {
                i = R.raw.icon_chevron_up_fill;
            } else {
                i = R.raw.icon_chevron_down_fill;
            }
            c2068389v.LIZ = i;
            c2068389v.LJ = Integer.valueOf(R.attr.gv);
            tuxIconView.setTuxIcon(c2068389v);
        }
        TuxTextView tuxTextView = this.LLFFF;
        if (tuxTextView == null) {
            return;
        }
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            int i2 = c240639cR.LJLJJI;
            str = resources.getQuantityString(R.plurals.qt, i2, Integer.valueOf(i2));
        } else {
            str = null;
        }
        tuxTextView.setText(str);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
