package com.ss.android.ugc.aweme.relation.auth.widget.fb;

import X.ActivityC45651qj;
import X.C32I;
import X.C47261Igj;
import X.C62297Ocf;
import X.C62324Od6;
import X.C62374Odu;
import X.C62387Oe7;
import X.C62394OeE;
import X.C62789Okb;
import X.C62798Okk;
import X.C63787P1r;
import X.C78613UtF;
import X.C94363n6;
import X.InterfaceC237509Tu;
import X.InterfaceC62225ObV;
import X.P1V;
import X.UTK;
import X.XIA;
import X.XKW;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.widget.ext.InviteFriendsSharePackageV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FacebookMaFWidgetVM extends AssemViewModel<C63787P1r> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final P1V LJLIL;
    public final InterfaceC237509Tu LJLILLLLZI;
    public final XKW LJLJI;
    public InviteFriendsSharePackageV2 LJLJJI;
    public C62387Oe7 LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C63787P1r defaultState() {
        return new C63787P1r(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        InviteFriendsSharePackageV2 inviteFriendsSharePackageV2 = this.LJLJJI;
        if (inviteFriendsSharePackageV2 != null) {
            inviteFriendsSharePackageV2.LJIILLIIL();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (!this.LJLIL.LJ) {
            return;
        }
        String str = this.LJLIL.LIZJ.LJLIL;
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = "text";
        InviteFriendsSharePackageV2 inviteFriendsSharePackageV2 = new InviteFriendsSharePackageV2("invitevia", str, false, c62374Odu, 12);
        this.LJLJJI = inviteFriendsSharePackageV2;
        inviteFriendsSharePackageV2.LJIJI();
    }

    public FacebookMaFWidgetVM(P1V config) {
        InterfaceC237509Tu repository = UTK.LIZIZ.LJI();
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(repository, "repository");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = config;
        this.LJLILLLLZI = repository;
        this.LJLJI = ioDispatcher;
    }

    public final List<C62798Okk> gv0(List<? extends User> list) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        int i = 0;
        for (User user : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C62798Okk(this.LJLIL, user, i));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }

    public final void hv0(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        InviteFriendsSharePackageV2 inviteFriendsSharePackageV2 = this.LJLJJI;
        if (inviteFriendsSharePackageV2 == null) {
            return;
        }
        if (this.LJLJJL == null) {
            InviteFriendsSharePackageV2.Companion.getClass();
            C62394OeE c62394OeE = new C62394OeE();
            c62394OeE.LJIIZILJ = inviteFriendsSharePackageV2;
            C62324Od6.LIZ("facebook", new C62297Ocf(new C62789Okb(activity), null), c62394OeE);
            this.LJLJJL = new C62387Oe7(c62394OeE);
        }
        C62387Oe7 c62387Oe7 = this.LJLJJL;
        if (c62387Oe7 != null) {
            inviteFriendsSharePackageV2.LIZIZ(activity, (InterfaceC62225ObV) ListProtector.get(c62387Oe7.LIZ, 0));
        }
        new C94363n6(this.LJLIL.LIZJ.LJLIL).LIZLLL(null);
    }
}
