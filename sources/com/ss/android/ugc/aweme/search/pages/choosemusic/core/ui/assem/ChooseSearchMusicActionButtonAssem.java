package com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.assem;

import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.KJ7;
import X.SYD;
import X.TBT;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ChooseSearchMusicActionButtonAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public LinearLayout LJLJL;

    public ChooseSearchMusicActionButtonAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChooseSearchMusicViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 909), SYD.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, KJ7.class, null), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 908));
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 907));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJJL = (TuxTextView) view.findViewById(R.id.mit);
        this.LJLJJLL = (TuxTextView) view.findViewById(R.id.mir);
        this.LJLJL = (LinearLayout) view.findViewById(R.id.gti);
        C8YN.LJII(this, this.LJLIL.getValue(), new TBT() { // from class: X.KIL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((KI0) obj).LJLIL);
            }
        }, null, new AqS194S0100000_12(this, 210), 6);
    }
}
