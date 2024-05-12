package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.AnonymousClass391;
import X.C1FJ;
import X.C240639cR;
import X.C240719cZ;
import X.C26338AVi;
import X.C32151Nz;
import X.C8XO;
import X.O6R;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DefaultPaddingAssem extends ReusedUIContentAssem<DefaultPaddingAssem> implements C8XO<C240719cZ> {
    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public DefaultPaddingAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C240719cZ c240719cZ) {
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        C240639cR c240639cR = item.LJLILLLLZI;
        boolean z = c240639cR.LJLJI;
        boolean z2 = c240639cR.LJLJJLL;
        boolean z3 = c240639cR.LJLJL;
        if (c240639cR.LJLJLLL) {
            C26338AVi.LJIIIZ(getContainerView(), null, C1FJ.LIZIZ(8), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 21);
            return;
        }
        if (z) {
            if (z2) {
                if (z3) {
                    C26338AVi.LJIIIZ(getContainerView(), null, AnonymousClass391.LIZJ(16), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), 21);
                    return;
                } else {
                    C26338AVi.LJIIIZ(getContainerView(), null, AnonymousClass391.LIZJ(16), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 21);
                    return;
                }
            }
            if (z3) {
                C26338AVi.LJIIIZ(getContainerView(), null, C1FJ.LIZIZ(8), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), 21);
                return;
            }
        }
        C26338AVi.LJIIIZ(getContainerView(), null, C1FJ.LIZIZ(8), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 21);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
