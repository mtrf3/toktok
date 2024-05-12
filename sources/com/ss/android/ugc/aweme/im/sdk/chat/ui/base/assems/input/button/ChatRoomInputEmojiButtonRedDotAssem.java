package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button;

import X.AVS;
import X.C1046448u;
import X.C105214Az;
import X.C146035oF;
import X.C214298b3;
import X.C221108m2;
import X.C42625Go9;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72092sH;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.QD3;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class ChatRoomInputEmojiButtonRedDotAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public AVS LJLILLLLZI;
    public boolean LJLJI;
    public final C62822Ol8 LJLJJI;

    public ChatRoomInputEmojiButtonRedDotAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChatRoomInputVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 375), C105214Az.INSTANCE, null);
        this.LJLJJI = C221108m2.LIZIZ(C1046448u.LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowRedDot(C72092sH event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL) {
            withState((AssemViewModel) this.LJLIL.getValue(), new AqS167S0100000_1(this, 127));
            return;
        }
        AVS avs = this.LJLILLLLZI;
        if (avs == null) {
            return;
        }
        C146035oF.LIZIZ(avs);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AVS avs;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (view instanceof AVS) {
            avs = (AVS) view;
        } else {
            avs = null;
        }
        this.LJLILLLLZI = avs;
        if (avs != null) {
            C146035oF.LIZIZ(avs);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.4Ax
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C105044Ai) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 18), 6);
    }
}
