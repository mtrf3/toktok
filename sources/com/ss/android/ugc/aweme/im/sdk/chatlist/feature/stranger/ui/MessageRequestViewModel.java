package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui;

import X.AbstractC108304Mw;
import X.AbstractC78621UtN;
import X.C109774Sn;
import X.C188727au;
import X.C1GE;
import X.C221108m2;
import X.C32I;
import X.C34B;
import X.C36636EZk;
import X.C47704Ins;
import X.C48841JEv;
import X.C4T1;
import X.C4T8;
import X.C4TC;
import X.C4TO;
import X.C4TQ;
import X.C4TR;
import X.C4TT;
import X.C4TU;
import X.C4W9;
import X.C55749LuL;
import X.C61878OQg;
import X.C62822Ol8;
import X.C63120Opw;
import X.C63623Oy3;
import X.C64962gm;
import X.C78613UtF;
import X.C97383ry;
import X.EXV;
import X.EnumC109754Sl;
import X.FMX;
import X.X1D;
import X.XIC;
import X.XKW;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS26S0210000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageRequestViewModel extends AssemViewModel<C4T8> implements C4W9 {
    public final XKW LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C64962gm LJLJJL;
    public final C64962gm LJLJJLL;
    public final List<C97383ry> LJLJL;

    public MessageRequestViewModel() {
        XIC backgroundDispatcher = C78613UtF.LIZ;
        AbstractC78621UtN mainThreadDispatcher = C36636EZk.LIZ;
        o.LJIIIZ(backgroundDispatcher, "backgroundDispatcher");
        o.LJIIIZ(mainThreadDispatcher, "mainThreadDispatcher");
        this.LJLIL = mainThreadDispatcher;
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJFF(this, C109774Sn.class, "message_request_fragment_config"), true);
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 998));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 999));
        C47704Ins.LJFF(this, C109774Sn.class, "message_request_fragment_config");
        this.LJLJJL = C48841JEv.LIZ(EXV.LIZ);
        this.LJLJJLL = C48841JEv.LIZ(backgroundDispatcher);
        this.LJLJL = new ArrayList();
    }

    @Override // X.C4W9
    public final void Gy() {
        setState(C4TC.LJLIL);
        lv0(EnumC109754Sl.NONE);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C4T8 defaultState() {
        return new C4T8(0);
    }

    public final AbstractC108304Mw hv0() {
        return (AbstractC108304Mw) this.LJLJJI.getValue();
    }

    @Override // X.C4W9
    public final void vq0() {
        lv0(EnumC109754Sl.NONE);
    }

    public final List<C63120Opw> gv0() {
        List<C97383ry> list = getState().LJLJJL;
        ArrayList arrayList = new ArrayList();
        for (C97383ry c97383ry : list) {
            if (c97383ry.LJLIL) {
                arrayList.add(c97383ry);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C97383ry) it.next()).LJLILLLLZI);
        }
        return arrayList2;
    }

    public final boolean jv0() {
        if (o.LJ(getState().LJLIL, C4T1.LIZ) && C1GE.LJIILIIL(getState().LJLJJL)) {
            return true;
        }
        return false;
    }

    @Override // X.C4W9
    public final void ZS(C63623Oy3 c63623Oy3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadMoreFailed: ");
        LIZ.append(getState().LJLJJL.size());
        LIZ.append(", ");
        LIZ.append(c63623Oy3);
        C34B.LIZJ("MessageRequestViewModel", X1D.LIZIZ(LIZ));
        mv0(C4TT.LIZ);
    }

    @Override // X.C4W9
    public final void f3(C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        withState(new AqS132S0200000_1(conversation, this, 25));
    }

    public final void iv0(View view) {
        o.LJIIIZ(view, "view");
        hv0().LIZJ(this);
        if (hv0().LJ()) {
            return;
        }
        withState(new AqS132S0200000_1(view, this, 26));
    }

    public final void kv0(boolean z) {
        if (!z) {
            mv0(C4TQ.LIZ);
            List<C97383ry> list = getState().LJLJJL;
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(list.size(), "chat_cnt");
            ArrayList arrayList = new ArrayList();
            for (C97383ry c97383ry : list) {
                if (c97383ry.LJLJI.LJLLILLLL > 0) {
                    arrayList.add(c97383ry);
                }
            }
            c188727au.LIZLLL(arrayList.size(), "unread_chat_cnt");
            FMX.LJIIL("message_box_status", c188727au.LIZ);
            return;
        }
        mv0(C4TU.LIZ);
    }

    public final void lv0(EnumC109754Sl action) {
        o.LJIIIZ(action, "action");
        withState(new AqS132S0200000_1(this, action, 27));
    }

    public final void mv0(C4TO c4to) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("footer status = ");
        LIZ.append(c4to);
        LIZ.append(", type = ");
        LIZ.append(this.LJLJI.getValue());
        C34B.LJI("MessageRequestViewModel", X1D.LIZIZ(LIZ));
        setState(new AqS167S0100000_1(c4to, 160));
    }

    @Override // X.C4W9
    public final void nS(List<? extends C63120Opw> list) {
        o.LJIIIZ(list, "list");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onQuery: ");
        LIZ.append(getState().LJLJJL.size());
        LIZ.append(", ");
        LIZ.append(list.size());
        C34B.LJI("MessageRequestViewModel", X1D.LIZIZ(LIZ));
        kc(list, false);
    }

    public final void nv0(C4TO status) {
        o.LJIIIZ(status, "status");
        setState(new AqS167S0100000_1(status, 161));
    }

    @Override // X.C4W9
    public final void ri(C63623Oy3 error) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRefreshFailed: ");
        LIZ.append(error);
        LIZ.append(", localSize=");
        LIZ.append(((ArrayList) this.LJLJL).size());
        C34B.LJI("MessageRequestViewModel", X1D.LIZIZ(LIZ));
        kc(C61878OQg.INSTANCE, false);
        mv0(C4TR.LIZ);
        nv0(C4TT.LIZ);
    }

    @Override // X.C4W9
    public final void FA(List<? extends C63120Opw> list, boolean z) {
        o.LJIIIZ(list, "list");
        withState(new AqS26S0210000_1(this, list, z, 0));
    }

    @Override // X.C4W9
    public final void kc(List<? extends C63120Opw> list, boolean z) {
        o.LJIIIZ(list, "list");
        withState(new AqS26S0210000_1(this, list, z, 1));
    }

    @Override // X.C4W9
    public final void y9(int i, C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        withState(new AqS132S0200000_1(conversation, this, 94));
    }
}
