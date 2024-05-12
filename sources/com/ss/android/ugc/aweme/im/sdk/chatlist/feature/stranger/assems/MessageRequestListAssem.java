package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems;

import X.AbstractC029409q;
import X.C109774Sn;
import X.C214298b3;
import X.C221108m2;
import X.C28871Bj;
import X.C47704Ins;
import X.C48841JEv;
import X.C4TJ;
import X.C4TS;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73379Sr1;
import X.C78926UyI;
import X.C8YN;
import X.C97413s1;
import X.C9BE;
import X.InterfaceC191547fS;
import X.InterfaceC65350Pko;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageRequestListAssem extends UIContentAssem implements InterfaceC191547fS {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public MessageRequestListAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageRequestViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 569), C4TJ.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C109774Sn.class, "message_request_fragment_config"), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 566));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 565));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 568));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 567));
    }

    public final C97413s1 v3() {
        return (C97413s1) this.LJLJJI.getValue();
    }

    public final MessageRequestViewModel x3() {
        return (MessageRequestViewModel) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        if (x3().hv0().LJ()) {
            return;
        }
        MessageRequestViewModel x3 = x3();
        x3.getClass();
        x3.mv0(C4TS.LIZ);
        x3.hv0().LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-recyclerView>(...)");
        RecyclerView recyclerView = (RecyclerView) value;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(new C28871Bj((AbstractC029409q<? extends RecyclerView.ViewHolder>[]) new AbstractC029409q[]{this.LJLJJL.getValue(), v3()}));
        recyclerView.LJIIJJI(new C73379Sr1(recyclerView.getContext()));
        v3().setLoadMoreListener(this);
        v3().setShowFooter(false);
        x3().iv0(getContainerView());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        MessageRequestViewModel x3 = x3();
        x3.hv0().LJII();
        C48841JEv.LIZJ(x3.LJLJJLL, null);
        C48841JEv.LIZJ(x3.LJLJJL, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJIIJ(this, x3(), new TBT() { // from class: X.4TI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C4T8) obj).LJLJJL;
            }
        }, new TBT() { // from class: X.4TF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C4T8) obj).LJLJJLL);
            }
        }, null, new IDqS426S0100000_1(this, 5), 12);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.4TG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C4T8) obj).LJLJI;
            }
        }, null, new AqS183S0100000_1(this, 36), 6);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.4TD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C4T8) obj).LJLIL;
            }
        }, null, new AqS183S0100000_1(this, 37), 6);
    }
}
