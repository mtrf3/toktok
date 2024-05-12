package com.ss.android.ugc.aweme.profile.aigc;

import X.C16880lQ;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72148STg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.STZ;
import X.SYL;
import X.TBT;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileAigcStyleAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public SYL LJLILLLLZI;

    public ProfileAigcStyleAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcStyleViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 838), STZ.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL syl = (SYL) getContainerView().findViewById(R.id.btw);
        o.LJIIIIZZ(syl, "containerView.content_list");
        this.LJLILLLLZI = syl;
        syl.setItemAnimator(null);
        syl.LLLF.LJZL(ChooseStyleCell.class);
        syl.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.LLIILII = new C72148STg();
        syl.setLayoutManager(gridLayoutManager);
        LayoutInflater LLZIL = C16880lQ.LLZIL(syl.getContext());
        SYL syl2 = this.LJLILLLLZI;
        if (syl2 != null) {
            View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.c35, syl2, false);
            o.LJIIIIZZ(LLLLIILL, "from(context)\n          …header, powerList, false)");
            ((TextView) LLLLIILL.findViewById(R.id.title)).setText(syl.getResources().getString(R.string.en));
            ((TuxTextView) LLLLIILL.findViewById(R.id.title)).LJJJ(32.0f);
            ((TextView) LLLLIILL.findViewById(R.id.krt)).setText(syl.getResources().getString(R.string.em));
            SYL syl3 = this.LJLILLLLZI;
            if (syl3 != null) {
                syl3.LJLJL(0, LLLLIILL);
                C8YN.LJII(this, this.LJLIL.getValue(), new TBT() { // from class: X.STX
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((EL9) obj).LJLIL;
                    }
                }, null, new AqS194S0100000_12(this, 137), 6);
                return;
            } else {
                o.LJIJI("powerList");
                throw null;
            }
        }
        o.LJIJI("powerList");
        throw null;
    }
}
