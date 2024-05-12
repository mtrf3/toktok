package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel;

import X.AbstractC82553Lv;
import X.AbstractC84083Rs;
import X.C162476Zf;
import X.C221108m2;
import X.C34B;
import X.C40658FxW;
import X.C43I;
import X.C47704Ins;
import X.C55749LuL;
import X.C61878OQg;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C84283Sm;
import X.C86970YBi;
import X.C90643h6;
import X.C91383iI;
import X.C91633ih;
import X.C91643ii;
import X.C91653ij;
import X.C91693in;
import X.C91843j2;
import X.C95593p5;
import X.FMX;
import X.InterfaceC82613Mb;
import X.InterfaceC84103Ru;
import X.ORZ;
import X.OSZ;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS55S1100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ContactListViewModel extends AssemViewModel<C91843j2> implements GenericLifecycleObserver, InterfaceC82613Mb<IMContact>, InterfaceC84103Ru {
    public final IMUser LJLIL;
    public boolean LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C91693in LJLJL;

    @Override // X.InterfaceC82613Mb
    public final void L8(Throwable th) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C91843j2 defaultState() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        return new C91843j2(new C43I(c61878OQg), null, new OSZ(c61878OQg, ""));
    }

    public final C91633ih hv0() {
        return (C91633ih) this.LJLJI.getValue();
    }

    public final LinkedHashSet<IMUser> jv0() {
        return (LinkedHashSet) this.LJLJJL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        AbstractC82553Lv abstractC82553Lv = (AbstractC82553Lv) this.LJLJJLL.getValue();
        C34B.LJI(abstractC82553Lv.LJLILLLLZI, "unSubscribe");
        abstractC82553Lv.LJLJI = null;
        AbstractC84083Rs abstractC84083Rs = (AbstractC84083Rs) this.LJLJJLL.getValue();
        abstractC84083Rs.LJLLILLLL = null;
        ((C73318Sq2) abstractC84083Rs.LJLLJ.getValue()).LIZLLL();
    }

    public ContactListViewModel() {
        IMUser fromUser = IMUser.fromUser(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
        o.LJIIIIZZ(fromUser, "fromUser(ServiceManager.…:class.java).currentUser)");
        this.LJLIL = fromUser;
        this.LJLJI = new C55749LuL(C47704Ins.LIZLLL(this, C91633ih.class, "init_config"), true);
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 652));
        C221108m2.LIZIZ(new AqS151S0100000_1(this, 651));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 654));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 653));
        this.LJLJL = C91693in.LJLIL;
    }

    public final boolean gv0() {
        int i = C91383iI.LIZ[hv0().getEntry().ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (((Set) this.LJLJJI.getValue()).size() + jv0().size() >= C95593p5.LIZ()) {
                    return true;
                }
            } else {
                throw new C162476Zf();
            }
        } else {
            C84283Sm c84283Sm = C84283Sm.LIZ;
            int size = jv0().size();
            boolean contains = jv0().contains(this.LJLIL);
            c84283Sm.getClass();
            if (contains) {
                size--;
            }
            if (size >= C95593p5.LIZ() - 1) {
                return true;
            }
        }
        return false;
    }

    public final List<IMUser> iv0() {
        if (jv0().size() == 2 && jv0().contains(this.LJLIL)) {
            List<IMUser> LLJILJILJ = ORZ.LLJILJILJ(jv0());
            ((ArrayList) LLJILJILJ).remove(this.LJLIL);
            return LLJILJILJ;
        }
        return ORZ.LLJI(jv0());
    }

    @Override // X.InterfaceC84103Ru
    public final void F70(Throwable t) {
        o.LJIIIZ(t, "t");
        C34B.LJ("ContactListViewModel onSearchError", t);
        setState(C91643ii.LJLIL);
    }

    @Override // X.InterfaceC82613Mb
    public final void Y8(Throwable th) {
        C34B.LJ("ContactListViewModel onLoadError", th);
        setState(C91653ij.LJLIL);
    }

    public final boolean kv0(IMUser contact) {
        o.LJIIIZ(contact, "contact");
        if (jv0().contains(contact) || ((Set) this.LJLJJI.getValue()).contains(contact)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC82613Mb
    public final void L20(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
    }

    public final void lv0(IMUser contact, boolean z) {
        o.LJIIIZ(contact, "contact");
        if (this.LJLILLLLZI || z == jv0().contains(contact)) {
            return;
        }
        if (z) {
            jv0().add(contact);
            int i = C91383iI.LIZ[hv0().getEntry().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C90643h6.LJI(C90643h6.LIZ, "choose_add_member", new OSZ[0]);
                } else {
                    throw new C162476Zf();
                }
            } else {
                FMX.LJIILL("choose_group_member", new OSZ(C90643h6.LIZIZ, "previous_page"), new OSZ("member_list", "enter_from"));
            }
        } else {
            jv0().remove(contact);
        }
        setState(new AqS167S0100000_1(contact, 175));
    }

    @Override // X.InterfaceC82613Mb
    public final void zr0(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
        List LJJZZIII = C40658FxW.LJJZZIII(list, IMUser.class);
        Iterator it = ((ArrayList) LJJZZIII).iterator();
        while (it.hasNext()) {
            IMUser iMUser = (IMUser) it.next();
            iMUser.setInitialLetter(C86970YBi.LIZIZ.LIZIZ(iMUser.getDisplayName()));
        }
        setState(new AqS167S0100000_1(ORZ.LLILII(this.LJLJL, LJJZZIII), (List<VoucherInfoNew>) 176));
    }

    @Override // X.InterfaceC84103Ru
    public final void zs0(String keyword, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(keyword, "keyword");
        setState(new AqS55S1100000_1(list, (List<OSZ<String, String>>) keyword, (String) 11));
    }
}
