package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions;

import X.AbstractC90763hI;
import X.C110714Wd;
import X.C113554cx;
import X.C120324ns;
import X.C120464o6;
import X.C1GE;
import X.C221108m2;
import X.C3IY;
import X.C3Q9;
import X.C4WC;
import X.C4WU;
import X.C62822Ol8;
import X.C63088OpQ;
import X.C63120Opw;
import X.C63322OtC;
import X.C63378Ou6;
import X.C63623Oy3;
import X.C63685Oz3;
import X.C75782yE;
import X.C81093Gf;
import X.C85163Vw;
import X.C89453Z8v;
import X.C90643h6;
import X.C95293ob;
import X.C95383ok;
import X.C95573p3;
import X.C95683pE;
import X.C95693pF;
import X.C95783pO;
import X.C95793pP;
import X.C95803pQ;
import X.C95873pX;
import X.EF7;
import X.EnumC115774gX;
import X.EnumC96113pv;
import X.FMX;
import X.OSZ;
import X.X1D;
import Y.IDcS135S0200000_1;
import Y.IDcS364S0100000_1;
import android.os.SystemClock;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.im.core.proto.AckConversationApplyRequestBody;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public final class GroupDetailViewModel extends AssemViewModel<C95293ob> {
    public final C95573p3 LJLIL;
    public final C95683pE LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C95873pX LJLJLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C95293ob defaultState() {
        return new C95293ob(0);
    }

    public final void hv0() {
        String str = this.LJLJJL;
        if (str != null) {
            jv0();
            if (s.LJZI(str).toString().length() == 0) {
                setState(C95803pQ.LJLIL);
                return;
            } else {
                setState(C95783pO.LJLIL);
                this.LJLIL.LJLILLLLZI.LJIL(s.LJZI(str).toString(), new IDcS364S0100000_1(this, 2));
                return;
            }
        }
        o.LJIJI("editingName");
        throw null;
    }

    public final void jv0() {
        withState(new AqS167S0100000_1(this, 148));
    }

    public final String kv0() {
        return (String) this.LJLJI.getValue();
    }

    public final boolean nv0() {
        C95693pF c95693pF = this.LJLILLLLZI.LJLIL;
        if (c95693pF.LJLILLLLZI || C1GE.LJIILIIL(c95693pF.LJLIL)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((AbstractC90763hI) this.LJLJL.getValue()).LJIJI(this.LJLJLJ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        String str;
        C63088OpQ coreInfo;
        super.onPrepared();
        C95383ok model = this.LJLIL.LJLJI;
        o.LJIIIZ(model, "model");
        setState(new AqS167S0100000_1(model, 260));
        C63120Opw LIZLLL = this.LJLIL.LJLILLLLZI.LIZLLL();
        if (LIZLLL == null || (coreInfo = LIZLLL.getCoreInfo()) == null || (str = coreInfo.getName()) == null) {
            str = "";
        }
        this.LJLJJL = str;
        ((AbstractC90763hI) this.LJLJL.getValue()).LJIIL(this.LJLJLJ);
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LJIILLIIL(this.LJLIL.LJLILLLLZI.LJ(), new IDcS364S0100000_1(this, 3));
    }

    public static void mv0(C63623Oy3 c63623Oy3) {
        C85163Vw.LIZLLL(EF7.LIZIZ(), c63623Oy3, null, 4);
    }

    public final void gv0(IMUser iMUser) {
        if (iMUser == null) {
            return;
        }
        AbstractC90763hI abstractC90763hI = this.LJLIL.LJLILLLLZI;
        String uid = iMUser.getUid();
        o.LJIIIIZZ(uid, "imUser.uid");
        abstractC90763hI.LJIILLIIL(uid, EnumC96113pv.OWNER.getValue(), C113554cx.LJJJLIIL(), new IDcS364S0100000_1(this, 1));
    }

    public final void iv0(String str) {
        setState(C95793pP.LJLIL);
        C90643h6.LJI(C90643h6.LIZ, "edit_group_name", new OSZ[]{new OSZ(str, "enter_method")});
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.3pX] */
    public GroupDetailViewModel(C95573p3 detailData, C95683pE dataSource) {
        o.LJIIIZ(detailData, "detailData");
        o.LJIIIZ(dataSource, "dataSource");
        this.LJLIL = detailData;
        this.LJLILLLLZI = dataSource;
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 467));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 469));
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 468));
        this.LJLJLJ = new C4WU() { // from class: X.3pX
            @Override // X.InterfaceC120024nO
            public final void BH(List<C63089OpR> list) {
            }

            @Override // X.InterfaceC120024nO
            public final void CN(C63120Opw c63120Opw) {
            }

            @Override // X.InterfaceC120024nO
            public final void DH(List<C63089OpR> list) {
            }

            @Override // X.InterfaceC120024nO
            public final int JG() {
                return 0;
            }

            @Override // X.InterfaceC120024nO
            public final void MO(List<C63089OpR> list) {
            }

            @Override // X.InterfaceC120024nO
            public final void f3(C63120Opw c63120Opw) {
            }

            @Override // X.InterfaceC120024nO
            public final void hW(int i, String str) {
            }

            @Override // X.InterfaceC120024nO
            public final void tq0(int i, String str, List list) {
            }

            @Override // X.InterfaceC120024nO
            public final void we0(C63120Opw c63120Opw) {
            }

            @Override // X.InterfaceC120024nO
            public final void Tu(C63120Opw c63120Opw) {
                if (!C84283Sm.LJII(c63120Opw)) {
                    GroupDetailViewModel.this.setState(C95883pY.LJLIL);
                }
            }

            @Override // X.InterfaceC120024nO
            public final void Mi(String conversationId, List<C63089OpR> list) {
                o.LJIIIZ(conversationId, "conversationId");
            }

            @Override // X.InterfaceC120024nO
            public final void y9(int i, C63120Opw c63120Opw) {
                if (i == 4 && !C84283Sm.LJII(c63120Opw)) {
                    GroupDetailViewModel.this.setState(C95893pZ.LJLIL);
                }
                GroupDetailViewModel.this.setState(C95903pa.LJLIL);
            }
        };
    }

    public final void lv0(C110714Wd request, boolean z) {
        EnumC115774gX enumC115774gX;
        EnumC115774gX enumC115774gX2;
        String str;
        o.LJIIIZ(request, "request");
        C3IY LIZ = C81093Gf.LIZ();
        long j = request.LJ;
        Map<String, String> map = request.LJIIIZ;
        if (map == null) {
            map = C113554cx.LJJJLIIL();
        }
        IDcS135S0200000_1 iDcS135S0200000_1 = new IDcS135S0200000_1(request, this, 3);
        LIZ.getClass();
        C63378Ou6.LIZIZ().getClass();
        C120324ns c120324ns = new C120324ns(iDcS135S0200000_1);
        c120324ns.LIZJ.LIZIZ = SystemClock.elapsedRealtime();
        ConcurrentHashMap<String, String> concurrentHashMap = c120324ns.LIZJ.LJ;
        if (z) {
            enumC115774gX = EnumC115774gX.AGREE;
        } else {
            enumC115774gX = EnumC115774gX.DENY;
        }
        concurrentHashMap.put("apply_status", String.valueOf(enumC115774gX));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ACKConversationApplyHandler, applyId = ");
        LIZ2.append(j);
        LIZ2.append(" &status = ");
        LIZ2.append(z);
        LIZ2.append(" &bizExt = ");
        LIZ2.append(map.toString());
        C63322OtC.LIZ(X1D.LIZIZ(LIZ2));
        C120464o6 c120464o6 = new C120464o6();
        c120464o6.LIZLLL = Long.valueOf(j);
        if (z) {
            enumC115774gX2 = EnumC115774gX.AGREE;
        } else {
            enumC115774gX2 = EnumC115774gX.DENY;
        }
        c120464o6.LJ = enumC115774gX2;
        if (!map.isEmpty()) {
            C63685Oz3.LIZIZ(map);
            c120464o6.LJFF = map;
        }
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LIZIZ(2025, AckConversationApplyRequestBody.ADAPTER, c120464o6.build());
        c120324ns.LJIIJJI(0, c89453Z8v.build(), null, new Object[0]);
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", kv0());
        if (z) {
            str = "accept";
        } else {
            str = "delete";
        }
        hashMap.put("result", str);
        FMX.LJIIL("handle_group_request", hashMap);
    }
}
