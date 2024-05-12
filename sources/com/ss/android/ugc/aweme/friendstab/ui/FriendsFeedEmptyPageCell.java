package com.ss.android.ugc.aweme.friendstab.ui;

import X.AAI;
import X.ActivityC45651qj;
import X.C10K;
import X.C113914dX;
import X.C16880lQ;
import X.C16970lZ;
import X.C1791471i;
import X.C188727au;
import X.C1DG;
import X.C221108m2;
import X.C234549Ik;
import X.C26338AVi;
import X.C28289B8j;
import X.C32151Nz;
import X.C35971E9v;
import X.C45804HyK;
import X.C4LD;
import X.C54502LaE;
import X.C54503LaF;
import X.C57560MiS;
import X.C57561MiT;
import X.C62374Odu;
import X.C62387Oe7;
import X.C62394OeE;
import X.C62822Ol8;
import X.EnumC1804076e;
import X.FMX;
import X.HG3;
import X.InterfaceC62225ObV;
import X.O6R;
import X.RBX;
import Y.ACallableS112S0100000_9;
import Y.AObserverS77S0100000_9;
import Y.AgS112S0200000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2;
import com.ss.android.ugc.aweme.friendstab.helper.FriendsEmptyPageSharePackage;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.channel.UserQrCodeChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsFeedEmptyPageCell extends PowerCell<C54503LaF> {
    public boolean LJLJI;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 252));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 254));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 253));

    public final FriendsEmptyPageMainSectionVM M() {
        return (FriendsEmptyPageMainSectionVM) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        C54502LaE.LIZLLL("friends_tab_empty", EnumC1804076e.CANCEL, 4);
        if (!this.LJLJI) {
            return;
        }
        super.unBind();
        this.LJLJI = false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View findViewById;
        String nickname;
        String string;
        super.onItemViewCreated();
        FriendsEmptyPageRootVM friendsEmptyPageRootVM = (FriendsEmptyPageRootVM) this.LJLILLLLZI.getValue();
        if (friendsEmptyPageRootVM != null) {
            FriendsEmptyPageMainSectionVM emptyPageMainSectionVM = M();
            o.LJIIIZ(emptyPageMainSectionVM, "emptyPageMainSectionVM");
            friendsEmptyPageRootVM.LJLILLLLZI = emptyPageMainSectionVM;
            friendsEmptyPageRootVM.gv0();
        }
        ActivityC45651qj LJ = C1DG.LJ(this.itemView, "itemView.context");
        if (LJ != null) {
            C57561MiT c57561MiT = FriendsEmptyPageSharePackage.Companion;
            FriendsEmptyPageMainSectionVM vm = M();
            c57561MiT.getClass();
            o.LJIIIZ(vm, "vm");
            C62374Odu c62374Odu = new C62374Odu();
            c62374Odu.LIZLLL = "";
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            if (curUser == null) {
                nickname = "";
            } else {
                nickname = curUser.getNickname();
            }
            try {
                String string2 = C1791471i.LIZ.getString(R.string.dv9);
                o.LJIIIIZZ(string2, "getApp().getString(R.str…acts_invite_friends_text)");
                string = C16880lQ.LLLZ(string2, Arrays.copyOf(new Object[]{nickname}, 1));
                o.LJIIIIZZ(string, "format(format, *args)");
            } catch (Throwable unused) {
                string = C1791471i.LIZ.getString(R.string.dv9);
                o.LJIIIIZZ(string, "{\n                AppPro…iends_text)\n            }");
            }
            c62374Odu.LJ = string;
            c62374Odu.LJFF = "";
            c62374Odu.LIZ = "text";
            FriendsEmptyPageSharePackage friendsEmptyPageSharePackage = new FriendsEmptyPageSharePackage(c62374Odu, vm);
            C62394OeE c62394OeE = new C62394OeE();
            C4LD.LIZ.LJJJJ(c62394OeE, LJ, true);
            c62394OeE.LJIIZILJ = friendsEmptyPageSharePackage;
            c62394OeE.LIZIZ(new CopyLinkChannel(true));
            C234549Ik.LIZ.getClass();
            if (C234549Ik.LIZ() == 3) {
                c62394OeE.LIZIZ(new UserQrCodeChannel());
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "homepage_friends");
                c188727au.LJIIIZ("action_type", "show");
                FMX.LJIIL("qr_code_icon", c188727au.LIZ);
            }
            if (FriendsTabPerfOptPhase2.LIZ().viewInflateOpt) {
                C10K.LIZJ(new ACallableS112S0100000_9(c62394OeE, 20)).LIZLLL(new AgS112S0200000_9(friendsEmptyPageSharePackage, this, 1));
            } else {
                L(new C62387Oe7(c62394OeE), friendsEmptyPageSharePackage);
            }
        }
        View findViewById2 = this.itemView.findViewById(R.id.do_);
        o.LJIIIIZZ(findViewById2, "itemView.friends_feed_button_section");
        C26338AVi.LJI(findViewById2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20))), null, null, false, 29);
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner == null) {
            return;
        }
        FriendsEmptyPageMainSectionVM M = M();
        M.LJLJJLL.observe(currentLifecycleOwner, new AObserverS77S0100000_9(this, 67));
        M.LJLJLJ.observe(currentLifecycleOwner, new AObserverS77S0100000_9(this, 68));
        if (!C35971E9v.LIZ() || (findViewById = this.itemView.findViewById(R.id.doa)) == null) {
            return;
        }
        findViewById.setOnLongClickListener((View.OnLongClickListener) this.LJLJJI.getValue());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C54503LaF item) {
        o.LJIIIZ(item, "item");
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        C54502LaE.LIZLLL("friends_tab_empty", null, 6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        View containerView;
        o.LJIIIZ(parent, "parent");
        if (FriendsTabPerfOptPhase2.LIZ().viewInflateOpt) {
            Context context = parent.getContext();
            o.LJIIIIZZ(context, "parent.context");
            containerView = C16970lZ.LIZLLL(C45804HyK.LJIJJ(context), R.layout.ays);
        } else {
            containerView = C28289B8j.LIZ(parent, R.layout.ays, parent, false);
        }
        double height = parent.getHeight();
        AAI.LIZLLL((int) (0.074d * height), containerView);
        AAI.LIZIZ((int) (height * 0.05d), containerView);
        o.LJIIIIZZ(containerView, "containerView");
        return containerView;
    }

    public final void L(C62387Oe7 c62387Oe7, FriendsEmptyPageSharePackage friendsEmptyPageSharePackage) {
        if (c62387Oe7.LJFF) {
            Iterator<InterfaceC62225ObV> it = c62387Oe7.LIZ.iterator();
            while (it.hasNext()) {
                InterfaceC62225ObV next = it.next();
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                if (!next.LIZLLL(context)) {
                    it.remove();
                }
            }
        }
        C113914dX c113914dX = (C113914dX) this.itemView.findViewById(R.id.g62);
        o.LJIIIIZZ(c113914dX, "itemView.ll_share_container");
        c113914dX.LJIIJ(c62387Oe7.LIZ, false);
        C113914dX c113914dX2 = (C113914dX) this.itemView.findViewById(R.id.g62);
        C57560MiS c57560MiS = new C57560MiS(friendsEmptyPageSharePackage, this);
        c113914dX2.getClass();
        c113914dX2.LJLJJL = c57560MiS;
    }
}
