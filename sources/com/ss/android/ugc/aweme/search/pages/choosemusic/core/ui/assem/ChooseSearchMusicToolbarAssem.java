package com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.assem;

import X.AnonymousClass391;
import X.C1295656q;
import X.C214298b3;
import X.C26338AVi;
import X.C47704Ins;
import X.C48966JJq;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C79043V0l;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.KJ7;
import X.KJ9;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ChooseSearchMusicToolbarAssem extends UIContentAssem {
    public TuxIconView LJLIL;
    public TuxIconView LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C55749LuL LJLJJI;

    public ChooseSearchMusicToolbarAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChooseSearchMusicViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 192), KJ9.INSTANCE, null);
        this.LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, KJ7.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLIL = (TuxIconView) view.findViewById(R.id.ndv);
        this.LJLILLLLZI = (TuxIconView) view.findViewById(R.id.jfn);
        boolean z = ((KJ7) this.LJLJJI.getValue()).LJLILLLLZI;
        boolean z2 = ((KJ7) this.LJLJJI.getValue()).LJLJI;
        if (!z) {
            if (z2) {
                C79043V0l.LJJIIZI(this.LJLIL);
                TuxIconView tuxIconView = this.LJLIL;
                if (tuxIconView != null) {
                    C26338AVi.LJI(tuxIconView, AnonymousClass391.LIZJ(8), null, AnonymousClass391.LIZJ(8), null, false, 26);
                }
                C79043V0l.LJIIJ(this.LJLILLLLZI);
            }
        } else if (z2) {
            C79043V0l.LJJIIZI(this.LJLIL);
            C79043V0l.LJJIIZI(this.LJLILLLLZI);
            TuxIconView tuxIconView2 = this.LJLIL;
            if (tuxIconView2 != null) {
                C26338AVi.LJI(tuxIconView2, AnonymousClass391.LIZJ(6), null, null, null, false, 30);
            }
            TuxIconView tuxIconView3 = this.LJLILLLLZI;
            if (tuxIconView3 != null) {
                C26338AVi.LJI(tuxIconView3, AnonymousClass391.LIZJ(2), null, AnonymousClass391.LIZJ(10), null, false, 26);
            }
        } else {
            C79043V0l.LJJIIZI(this.LJLILLLLZI);
            C79043V0l.LJIIJ(this.LJLIL);
            C48966JJq.LIZIZ(this.LJLILLLLZI, C1295656q.LJLIL);
        }
        if (((KJ7) this.LJLJJI.getValue()).LJLJI) {
            C8YN.LJII(this, this.LJLJI.getValue(), new TBT() { // from class: X.KIN
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((KI0) obj).LJLIL);
                }
            }, null, new AqS190S0100000_8(this, 59), 6);
        }
    }
}
