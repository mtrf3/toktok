package com.ss.android.ugc.tiktok.addyours.ui.table;

import X.C16880lQ;
import X.C214348b8;
import X.C218768iG;
import X.C218888iS;
import X.C218928iW;
import X.C3C8;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8XO;
import X.C8YN;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class InvitableCellAssem<T extends C3C8> extends ReusedUISlotAssem<T> implements C8XO<C218768iG> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFII;
    public final InterfaceC115514g7 LLFF;
    public final C55749LuL LLFFF;

    static {
        TBT tbt = new TBT(InvitableCellAssem.class, "addYoursInviteFriendsViewModel", "getAddYoursInviteFriendsViewModel()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/AddYoursInviteFriendsViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    public abstract void n4(boolean z);

    public abstract void p4();

    @Override // X.C8XO
    public final void unBind() {
    }

    public InvitableCellAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursInviteFriendsViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, C9BE.LIZ, new AqS153S0100000_3(LIZ, 1453), null, C218928iW.INSTANCE, null, null);
        this.LLFFF = new C55749LuL(C47704Ins.LIZJ(this, C218888iS.class, "InviteHierarchyData"), checkSupervisorPrepared());
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C218768iG c218768iG) {
        return true;
    }

    @Override // X.C8XO
    /* renamed from: m4, reason: merged with bridge method [inline-methods] */
    public void q4(C218768iG item) {
        o.LJIIIZ(item, "item");
        C8YN.LJIJI((AssemViewModel) this.LLFF.LIZ(this, LLFII[0]), new AqS134S0200000_3((InvitableCellAssem) this, item, (C218768iG) 182));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 184), view);
        C8YN.LJII(this, (AssemViewModel) this.LLFF.LIZ(this, LLFII[0]), new TBT() { // from class: X.8iV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C218868iQ) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 139), 6);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C218768iG c218768iG) {
    }

    public final void q4(C218768iG c218768iG, List<UserInvitee> list) {
        boolean z;
        Iterator<UserInvitee> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UserInvitee next = it.next();
            if (o.LJ(next.getUid(), c218768iG.LJLIL.getUid())) {
                if (next != null) {
                    z = true;
                }
            }
        }
        z = false;
        n4(z);
    }
}
