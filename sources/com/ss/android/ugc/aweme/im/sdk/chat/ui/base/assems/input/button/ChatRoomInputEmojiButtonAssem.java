package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C4B4;
import X.C4BB;
import X.C4BD;
import X.C4LS;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatRoomInputEmojiButtonAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public TuxIconView LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    public ChatRoomInputEmojiButtonAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChatRoomInputVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 374), C4BB.INSTANCE, null);
        this.LJLJI = C221108m2.LIZIZ(C4B4.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(C4BD.LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (view instanceof TuxIconView) {
            tuxIconView = (TuxIconView) view;
        } else {
            tuxIconView = null;
        }
        this.LJLILLLLZI = tuxIconView;
        if (C4LS.LIZ() && (tuxIconView2 = this.LJLILLLLZI) != null) {
            tuxIconView2.setVisibility(8);
        }
        TuxIconView tuxIconView3 = this.LJLILLLLZI;
        if (tuxIconView3 != null) {
            C16880lQ.LJJJ(tuxIconView3, new ACListenerS21S0100000_1(this, 70));
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.4B5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C105044Ai) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 17), 6);
    }
}
