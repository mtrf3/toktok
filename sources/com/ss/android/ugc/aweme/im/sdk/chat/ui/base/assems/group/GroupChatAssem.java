package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group;

import X.AnonymousClass325;
import X.C214298b3;
import X.C40K;
import X.C47261Igj;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C89333ez;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import X.TBT;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;

    public GroupChatAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C89333ez.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GroupChatVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 368), C40K.INSTANCE, null);
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        C89333ez c89333ez = (C89333ez) this.LJLIL.getValue();
        if (c89333ez != null) {
            AnonymousClass325 anonymousClass325 = AnonymousClass325.LIZ;
            String conversationId = c89333ez.LJLIL.getConversationId();
            anonymousClass325.getClass();
            AnonymousClass325.LJII(conversationId);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        final InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        final GroupChatProtocolImpl groupChatProtocolImpl = new GroupChatProtocolImpl((GroupChatVM) this.LJLILLLLZI.getValue());
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, GroupChatProtocol.class, C47261Igj.LJJIJIL(groupChatProtocolImpl));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatAssem$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C62814Ol0.LJJIJL(InterfaceC55235Lm3.this, GroupChatProtocol.class, groupChatProtocolImpl);
                    }
                }
            });
        }
        C8VV.LIZJ(this, new AqS132S0200000_1(this, view, 19));
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.40J
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C40B) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 16), 6);
    }
}
