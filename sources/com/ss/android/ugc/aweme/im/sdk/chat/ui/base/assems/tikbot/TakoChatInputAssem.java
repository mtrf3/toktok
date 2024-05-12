package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.tikbot;

import X.C113754dH;
import X.C214298b3;
import X.C47704Ins;
import X.C4BC;
import X.C55749LuL;
import X.C57082Lw;
import X.C57702Og;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78886Uxe;
import X.C78926UyI;
import X.C89333ez;
import X.C8VV;
import X.C9BE;
import X.InterfaceC65350Pko;
import Y.AObserverS69S0100000_1;
import Y.IDCListenerS251S0100000_1;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputBaseAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoChatInputAssem extends ChatRoomInputBaseAssem {
    public final C214298b3 LJLLLL;
    public final C55749LuL LJLLLLLL;
    public final long LJLZ;

    public TakoChatInputAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChatRoomInputVM.class);
        this.LJLLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 442), C4BC.INSTANCE, null);
        this.LJLLLLLL = new C55749LuL(C47704Ins.LJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLZ = 100L;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputBaseAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS167S0100000_1(this, 139));
        C78886Uxe.LJJIIJZLJL(this, C113754dH.LJLIL);
        View findViewById = getContainerView().findViewById(R.id.cow);
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new IDCListenerS251S0100000_1(this, 3));
        }
        AObserverS69S0100000_1 aObserverS69S0100000_1 = new AObserverS69S0100000_1(this, 149);
        C57702Og c57702Og = C57082Lw.LIZ;
        c57702Og.LIZIZ("#LocateFinishWhenEnterEvent").observe(this, aObserverS69S0100000_1);
        c57702Og.LIZIZ("#DismissBotInputPanelEvent").observe(this, new AObserverS69S0100000_1(this, 150));
    }
}
