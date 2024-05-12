package com.ss.android.ugc.aweme.music.assem;

import X.C16880lQ;
import X.C188727au;
import X.C213688a4;
import X.C214298b3;
import X.C240309bu;
import X.C240319bv;
import X.C240369c0;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C99W;
import X.C9BE;
import X.FMX;
import X.InterfaceC241869eQ;
import X.OUP;
import X.TBT;
import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.MusicSearchViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicHeaderAssem extends UISlotAssem {
    public final C55749LuL LJLJLLL;
    public LinearLayout LJLL;
    public View LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final C214298b3 LJLLL;
    public final C214298b3 LJLLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c6p;
    }

    public MusicHeaderAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 399);
        C65776Prg LIZ = C65352Pkq.LIZ(OriginMusicListViewModel.class);
        this.LJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 401), C240309bu.INSTANCE, aqS154S0100000_4);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(this, LiveChatShowDelayForHotLiveSetting.DEFAULT);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MusicSearchViewModel.class);
        this.LJLLLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 402), C240319bv.INSTANCE, aqS154S0100000_42);
    }

    public final OriginMusicListViewModel H3() {
        return (OriginMusicListViewModel) this.LJLLL.getValue();
    }

    public final void I3() {
        String str;
        if (this.LJLLJ && this.LJLLILLLL) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LJLLLL.getValue();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(assemViewModel, C65352Pkq.LIZ(InterfaceC241869eQ.class));
            if (c240369c0 != null) {
                str = c240369c0.LIZ;
            } else {
                str = null;
            }
            c188727au.LJIIIZ("user_id", str);
            FMX.LJIIL("homepage_music_search_show", c188727au.LIZ);
            this.LJLLJ = false;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.LJLL = (LinearLayout) view.findViewById(R.id.gu1);
        this.LJLLI = view.findViewById(R.id.gu3);
        if (C99W.LIZ) {
            OUP.LJJJJLI(this.LJLL, Float.valueOf(C32151Nz.LJIIZILJ(6)), null, null, 30);
        }
        LinearLayout linearLayout = this.LJLL;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS39S0200000_4(this, context, 18));
        }
        C8YN.LJII(this, H3(), new TBT() { // from class: X.9b7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZ(c239829b8);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 109), 4);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC241869eQ.class), new TBT() { // from class: X.9b6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240369c0) obj).LJFF;
            }
        }, new AqS170S0100000_4(this, 415));
    }
}
