package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.request;

import X.C120354nv;
import X.C221108m2;
import X.C47261Igj;
import X.C4Z2;
import X.C62822Ol8;
import X.C63308Osy;
import X.C63322OtC;
import X.C63378Ou6;
import X.C72808Sho;
import X.C94613nV;
import X.C95573p3;
import X.C95663pC;
import X.C95683pE;
import X.C95693pF;
import X.C95713pH;
import X.C95773pN;
import X.C96423qQ;
import X.C97343ru;
import X.InterfaceC57784Mm4;
import X.InterfaceC63379Ou7;
import X.InterfaceC86963bA;
import Y.IDcS135S0200000_1;
import android.util.Pair;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.request.GroupDetailRequestListVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupDetailRequestListVM extends AssemViewModel<C95663pC> {
    public final C95573p3 LJLIL;
    public final C95683pE LJLILLLLZI;
    public C95693pF LJLJI;
    public C72808Sho<InterfaceC57784Mm4> LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C95713pH LJLJJLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C95663pC defaultState() {
        return new C95663pC(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C63378Ou6 LIZIZ = C63378Ou6.LIZIZ();
        C95713pH c95713pH = this.LJLJJLL;
        if (c95713pH == null) {
            LIZIZ.getClass();
        } else {
            ((CopyOnWriteArraySet) LIZIZ.LIZ).remove(c95713pH);
        }
        C95773pN.LJLIL.getClass();
        C95773pN.LJLJJL = false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C96423qQ.LIZ();
        if (C4Z2.LJIILJJIL() == null) {
            C96423qQ.LIZ();
            C4Z2.LJJIFFI(C97343ru.LIZ);
        }
        C63378Ou6 LIZIZ = C63378Ou6.LIZIZ();
        C95713pH c95713pH = this.LJLJJLL;
        if (c95713pH == null) {
            LIZIZ.getClass();
        } else {
            ((CopyOnWriteArraySet) LIZIZ.LIZ).add(c95713pH);
        }
        C95773pN.LJLIL.getClass();
        C95773pN.LJLJJL = true;
        long longValue = ((Number) this.LJLJJL.getValue()).longValue();
        C95773pN.LJLILLLLZI.put(Long.valueOf(longValue), 0);
        C95773pN.LIZ(C47261Igj.LJJIJ(Long.valueOf(longValue)));
    }

    public final void refresh() {
        C63378Ou6 LIZIZ = C63378Ou6.LIZIZ();
        long longValue = ((Number) this.LJLJJL.getValue()).longValue();
        InterfaceC86963bA<Pair<Boolean, List<? extends ConversationApplyInfo>>> interfaceC86963bA = new InterfaceC86963bA<Pair<Boolean, List<? extends ConversationApplyInfo>>>() { // from class: X.3pI
            @Override // X.InterfaceC86963bA
            public final void LIZIZ(C63623Oy3 c63623Oy3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("init group requests error: ");
                LIZ.append(c63623Oy3);
                C34B.LIZJ("GroupChatRequestListVM", X1D.LIZIZ(LIZ));
            }

            @Override // X.InterfaceC86963bA
            public final void onSuccess(Pair<Boolean, List<? extends ConversationApplyInfo>> pair) {
                boolean z;
                Pair<Boolean, List<? extends ConversationApplyInfo>> pair2 = pair;
                if (pair2 != null) {
                    Object obj = pair2.second;
                    o.LJIIIIZZ(obj, "result.second");
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((Iterable) obj).iterator();
                    while (true) {
                        z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        EnumC115774gX enumC115774gX = ((ConversationApplyInfo) next).apply_status;
                        if (enumC115774gX == EnumC115774gX.APPLYING || enumC115774gX == EnumC115774gX.INVALID) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ConversationApplyInfo conversationApplyInfo = (ConversationApplyInfo) it2.next();
                        C110714Wd c110714Wd = new C110714Wd();
                        c110714Wd.LIZ(conversationApplyInfo);
                        arrayList2.add(c110714Wd);
                    }
                    GroupDetailRequestListVM groupDetailRequestListVM = GroupDetailRequestListVM.this;
                    C95693pF c95693pF = groupDetailRequestListVM.LJLJI;
                    Object obj2 = pair2.first;
                    o.LJIIIIZZ(obj2, "result.first");
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    c95693pF.getClass();
                    groupDetailRequestListVM.LJLJI = new C95693pF(arrayList2, booleanValue);
                    int i = 5;
                    if (arrayList2.size() <= 5) {
                        Object obj3 = pair2.first;
                        o.LJIIIIZZ(obj3, "result.first");
                        if (!((Boolean) obj3).booleanValue()) {
                            z = false;
                        }
                    }
                    C95683pE c95683pE = GroupDetailRequestListVM.this.LJLILLLLZI;
                    int size = arrayList2.size();
                    if (size <= 5) {
                        i = size;
                    }
                    C95693pF c95693pF2 = new C95693pF(arrayList2.subList(0, i), z);
                    c95683pE.getClass();
                    c95683pE.LJLIL = c95693pF2;
                    GroupDetailRequestListVM.this.setState(new AqS167S0100000_1(arrayList2, (List<VoucherInfoNew>) 151));
                    C72808Sho<InterfaceC57784Mm4> c72808Sho = GroupDetailRequestListVM.this.LJLJJI;
                    if (c72808Sho != null) {
                        c72808Sho.LJFF();
                    }
                    GroupDetailRequestListVM groupDetailRequestListVM2 = GroupDetailRequestListVM.this;
                    C72808Sho<InterfaceC57784Mm4> c72808Sho2 = groupDetailRequestListVM2.LJLJJI;
                    if (c72808Sho2 != null) {
                        List<C110714Wd> list = groupDetailRequestListVM2.LJLILLLLZI.LJLIL.LJLIL;
                        ArrayList arrayList3 = new ArrayList(C32I.LJJL(list, 10));
                        Iterator<C110714Wd> it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(new C95743pK(it3.next()));
                        }
                        c72808Sho2.LJ(arrayList3);
                    }
                    GroupDetailRequestListVM groupDetailRequestListVM3 = GroupDetailRequestListVM.this;
                    C72808Sho<InterfaceC57784Mm4> c72808Sho3 = groupDetailRequestListVM3.LJLJJI;
                    if (c72808Sho3 != null) {
                        groupDetailRequestListVM3.gv0(c72808Sho3, z);
                    }
                }
            }
        };
        LIZIZ.getClass();
        C63308Osy.LJI().LIZLLL().getClass();
        C63322OtC.LIZ("getNewestAuditList");
        new C120354nv(new IDcS135S0200000_1(LIZIZ, interfaceC86963bA, 0)).LJIILIIL(0L, longValue);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.3pH] */
    public GroupDetailRequestListVM(C95573p3 detailData, C95683pE dataSource) {
        o.LJIIIZ(detailData, "detailData");
        o.LJIIIZ(dataSource, "dataSource");
        this.LJLIL = detailData;
        this.LJLILLLLZI = dataSource;
        this.LJLJI = new C95693pF();
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 523));
        this.LJLJJLL = new InterfaceC63379Ou7() { // from class: X.3pH
            @Override // X.InterfaceC63379Ou7
            public final void LIZIZ(ConversationApplyInfo conversationApplyInfo) {
            }

            @Override // X.InterfaceC63379Ou7
            public final void LIZ(ConversationApplyInfo conversationApplyInfo) {
                if (conversationApplyInfo.apply_status == EnumC115774gX.APPLYING) {
                    C34B.LIZIZ("GroupChatRequestListVM", "refresh request list on new apply");
                    GroupDetailRequestListVM.this.refresh();
                }
            }
        };
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
            c72808Sho.LIZJ(new C94613nV(R.string.gy1, null, new AqS151S0100000_1(this, 524)));
        }
    }
}
