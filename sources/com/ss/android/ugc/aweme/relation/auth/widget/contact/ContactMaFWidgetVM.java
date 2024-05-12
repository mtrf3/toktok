package com.ss.android.ugc.aweme.relation.auth.widget.contact;

import X.C62374Odu;
import X.C62792Oke;
import X.C63772P1c;
import X.C78613UtF;
import X.HG3;
import X.InterfaceC237529Tw;
import X.ORZ;
import X.OSZ;
import X.P1U;
import X.RBX;
import X.UTK;
import X.X1D;
import X.XIA;
import X.XKW;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.auth.widget.ext.InviteFriendsSharePackageV2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ContactMaFWidgetVM extends AssemViewModel<C63772P1c> {
    public static C63772P1c LJLJJLL;
    public static C63772P1c LJLJL;
    public final P1U LJLIL;
    public final InterfaceC237529Tw LJLILLLLZI;
    public final InviteFriendsSharePackageV2 LJLJI;
    public final Keva LJLJJI;
    public final XKW LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C63772P1c defaultState() {
        return new C63772P1c(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLJI.LJIILLIIL();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        this.LJLJI.LJIJI();
    }

    public ContactMaFWidgetVM(P1U config) {
        InterfaceC237529Tw contactRepository = UTK.LIZIZ.LIZJ();
        String str = config.LIZJ.LJLIL;
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = "text";
        InviteFriendsSharePackageV2 inviteFriendsSharePackageV2 = new InviteFriendsSharePackageV2("invitesinglesms", str, true, c62374Odu, 8);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        LIZ.append("_friends_state_repo");
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(\"${AccountProxyS…rId}_friends_state_repo\")");
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(contactRepository, "contactRepository");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = config;
        this.LJLILLLLZI = contactRepository;
        this.LJLJI = inviteFriendsSharePackageV2;
        this.LJLJJI = repo;
        this.LJLJJL = ioDispatcher;
    }

    public static OSZ gv0(List list) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C62792Oke c62792Oke = (C62792Oke) it.next();
            Integer num = (Integer) linkedHashMap.get(c62792Oke.LJLIL);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            linkedHashMap.put(c62792Oke.LJLIL, Integer.valueOf(i + 1));
        }
        return new OSZ(ORZ.LLJI(linkedHashMap.keySet()), ORZ.LLJI(linkedHashMap.values()));
    }
}
