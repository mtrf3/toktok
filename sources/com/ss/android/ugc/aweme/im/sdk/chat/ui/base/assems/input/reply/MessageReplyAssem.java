package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply;

import X.C214298b3;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C91963jE;
import X.C93063l0;
import X.C93153l9;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import Y.AObserverS69S0100000_1;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageReplyAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageReplyAssem extends UIContentAssem {
    public C91963jE LJLIL;
    public final String LJLILLLLZI;
    public final C214298b3 LJLJI;

    public MessageReplyAssem() {
        new LinkedHashMap();
        this.LJLILLLLZI = "MessageReplyAssem";
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageReplyVM.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 384), C93153l9.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C91963jE c91963jE;
        MutableLiveData<C93063l0> mutableLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (view instanceof C91963jE) {
            c91963jE = (C91963jE) view;
        } else {
            c91963jE = null;
        }
        this.LJLIL = c91963jE;
        if (c91963jE != null) {
            c91963jE.setCloseButtonOnClick(new ACListenerS21S0100000_1(this, 78));
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.3l8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C93053kz) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 24), 6);
        MessageReplyAbility messageReplyAbility = (MessageReplyAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MessageReplyAbility.class, null);
        if (messageReplyAbility != null && (mutableLiveData = messageReplyAbility.LJLIL.LLD) != null) {
            mutableLiveData.observe(this, new AObserverS69S0100000_1(this, 41));
        }
    }
}
