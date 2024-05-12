package com.ss.android.ugc.aweme.cell;

import X.AIF;
import X.C116414hZ;
import X.C25859ACx;
import X.C32151Nz;
import X.O6R;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DisclosureCell extends TuxCell<C25859ACx, AIF> {
    public C116414hZ LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public final View Q() {
        View view;
        C25859ACx c25859ACx = (C25859ACx) getItem();
        if ((c25859ACx != null && (view = c25859ACx.LLFFF) != null) || (view = this.LJLILLLLZI) != null) {
            return view;
        }
        o.LJIJI("spinner");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final AIF N(Context context) {
        C116414hZ c116414hZ = new C116414hZ(context, null, 6, 0);
        c116414hZ.LIZ(R.raw.icon_spinner_thin, R.attr.gv);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        layoutParams.gravity = 17;
        c116414hZ.setLayoutParams(layoutParams);
        c116414hZ.setVisibility(8);
        this.LJLILLLLZI = c116414hZ;
        AIF aif = new AIF(context, null);
        aif.LJIILJJIL(new ACListenerS24S0100000_4(this, 331));
        return aif;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L42;
     */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C25859ACx r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cell.DisclosureCell.onBindItemView(X.ACx):void");
    }
}
