package com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.assem;

import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.KJ7;
import X.KJ8;
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
public final class ChooseSearchMusicEditTextAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public TuxIconView LJLJI;
    public TuxIconView LJLJJI;

    public ChooseSearchMusicEditTextAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChooseSearchMusicViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 191), KJ8.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, KJ7.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJI = (TuxIconView) view.findViewById(R.id.f0d);
        this.LJLJJI = (TuxIconView) view.findViewById(R.id.ndu);
        C8YN.LJII(this, this.LJLIL.getValue(), new TBT() { // from class: X.KIM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((KI0) obj).LJLIL);
            }
        }, null, new AqS190S0100000_8(this, 58), 6);
    }
}
