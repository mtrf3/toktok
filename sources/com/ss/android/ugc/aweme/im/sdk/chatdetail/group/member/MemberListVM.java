package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.member;

import X.C32I;
import X.C34B;
import X.C72808Sho;
import X.C81143Gk;
import X.C81243Gu;
import X.C90703hC;
import X.C94453nF;
import X.C94463nG;
import X.C94523nM;
import X.C94613nV;
import X.C95573p3;
import X.C95683pE;
import X.InterfaceC57784Mm4;
import X.InterfaceC81223Gs;
import X.ORZ;
import X.X1D;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.member.MemberListVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MemberListVM extends AssemViewModel<C94453nF> {
    public final String LJLIL;
    public final C95683pE LJLILLLLZI;
    public final C95573p3 LJLJI;
    public C72808Sho<InterfaceC57784Mm4> LJLJJI;
    public final C94463nG LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C94453nF defaultState() {
        return new C94453nF(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C81143Gk.LIZJ(C81143Gk.LIZ, this.LJLIL, this.LJLJJL, null, 28);
    }

    public final void refresh() {
        C72808Sho<InterfaceC57784Mm4> c72808Sho = this.LJLJJI;
        boolean z = false;
        if (c72808Sho != null) {
            List LLILLL = ORZ.LLILLL(this.LJLILLLLZI.LJLILLLLZI, getState().LJLIL);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LLILLL, 10));
            Iterator it = LLILLL.iterator();
            while (it.hasNext()) {
                arrayList.add(new C90703hC((C81243Gu) it.next()));
            }
            List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
            ListProtector.add(LLJILJILJ, 0, new C94523nM());
            c72808Sho.LJIILLIIL(LLJILJILJ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("listState=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", members=");
        LIZ.append(this.LJLILLLLZI.LJLILLLLZI.size());
        C34B.LIZIZ("OutPushCompensate", X1D.LIZIZ(LIZ));
        C72808Sho<InterfaceC57784Mm4> c72808Sho2 = this.LJLJJI;
        if (c72808Sho2 != null) {
            if (this.LJLILLLLZI.LJLILLLLZI.size() > getState().LJLIL) {
                z = true;
            }
            gv0(c72808Sho2, z);
        }
    }

    public final void gv0(C72808Sho<InterfaceC57784Mm4> c72808Sho, boolean z) {
        Object obj;
        Iterator it = ((ArrayList) c72808Sho.LJII()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof C94613nV) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) obj;
        if (interfaceC57784Mm4 != null) {
            c72808Sho.LJIIL(interfaceC57784Mm4);
        }
        if (z) {
            c72808Sho.LIZJ(new C94613nV(R.plurals.g_, Integer.valueOf(this.LJLILLLLZI.LJLILLLLZI.size() - getState().LJLIL), new AqS151S0100000_1(this, 510)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.3nG] */
    public MemberListVM(String convId, C95683pE dataSource, C95573p3 detailData) {
        o.LJIIIZ(convId, "convId");
        o.LJIIIZ(dataSource, "dataSource");
        o.LJIIIZ(detailData, "detailData");
        this.LJLIL = convId;
        this.LJLILLLLZI = dataSource;
        this.LJLJI = detailData;
        this.LJLJJL = new InterfaceC81223Gs() { // from class: X.3nG
            @Override // X.InterfaceC81223Gs
            public final void Qj0(String str) {
            }

            @Override // X.InterfaceC81223Gs
            public final void QK(EnumC81123Gi reason, String conversationId, List memberList) {
                o.LJIIIZ(conversationId, "conversationId");
                o.LJIIIZ(memberList, "memberList");
                o.LJIIIZ(reason, "reason");
                if (C84283Sm.LIZ(MemberListVM.this.LJLILLLLZI.LJLILLLLZI) != C84283Sm.LIZ(memberList)) {
                    MemberListVM.this.setState(C94483nI.LJLIL);
                }
                C95683pE c95683pE = MemberListVM.this.LJLILLLLZI;
                c95683pE.getClass();
                c95683pE.LJLILLLLZI = memberList;
                MemberListVM.this.setState(C94493nJ.LJLIL);
                MemberListVM memberListVM = MemberListVM.this;
                if (memberListVM.LJLJI.LJLJJI) {
                    memberListVM.setState(C94503nK.LJLIL);
                } else {
                    memberListVM.refresh();
                }
            }
        };
    }
}
