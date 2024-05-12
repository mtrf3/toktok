package com.ss.android.ugc.aweme.im.sdk.share.viewmodel;

import X.C101163y4;
import X.C14Q;
import X.C1HQ;
import X.C221108m2;
import X.C3S2;
import X.C4KZ;
import X.C4OT;
import X.C62822Ol8;
import X.C772831o;
import X.C77800Ug8;
import X.C84283Sm;
import X.C85323Wm;
import X.C90643h6;
import X.InterfaceC101153y3;
import X.X1D;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareDialogViewModel extends ViewModel {
    public final SharePackage LJLIL;
    public final InterfaceC101153y3 LJLILLLLZI;
    public final C4OT LJLJI;
    public final C62822Ol8 LJLJJI;
    public final LiveData<String> LJLJJL;
    public final LiveData<List<IMContact>> LJLJJLL;
    public final LiveData<List<IMContact>> LJLJL;
    public final LiveData<C3S2> LJLJLJ;
    public final MutableLiveData<List<IMContact>> LJLJLLL;
    public final MutableLiveData<Boolean> LJLL;
    public final MutableLiveData<Boolean> LJLLI;
    public final MutableLiveData<Boolean> LJLLILLLL;
    public final LiveData<Boolean> LJLLJ;
    public final MutableLiveData<Boolean> LJLLL;
    public final MutableLiveData<Integer> LJLLLL;
    public final List<IMContact> LJLLLLLL;

    public final boolean gv0() {
        Integer value = this.LJLLLL.getValue();
        if (value == null || value.intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLILLLLZI.onCleared();
    }

    public final void hv0(List<? extends IMContact> contactList) {
        String str;
        IMUser iMUser;
        int i;
        o.LJIIIZ(contactList, "contactList");
        this.LJLJLLL.setValue(contactList);
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : contactList) {
            if (!((ArrayList) this.LJLLLLLL).contains(iMContact)) {
                arrayList.add(iMContact);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IMContact iMContact2 = (IMContact) it.next();
            SharePackage sharePackage = this.LJLIL;
            if (!gv0()) {
                List<IMContact> value = this.LJLJL.getValue();
                if (value != null) {
                    i = value.indexOf(iMContact2);
                } else {
                    i = 0;
                }
                sharePackage.extras.putInt("rank_num", i);
            }
            Bundle bundle = sharePackage.extras;
            StringBuilder LIZ = X1D.LIZ();
            boolean z = iMContact2 instanceof IMUser;
            Integer num = null;
            if (z && (iMUser = (IMUser) iMContact2) != null) {
                num = Integer.valueOf(iMUser.getFollowStatus());
            }
            LIZ.append(num);
            LIZ.append("");
            bundle.putString("relation_tag", X1D.LIZIZ(LIZ));
            sharePackage.extras.remove("rank_num");
            C4OT c4ot = this.LJLJI;
            if (c4ot != null) {
                c4ot.LJI(sharePackage, "chat_mergeIM");
            }
            C4KZ.LIZLLL(sharePackage, iMContact2, false, "chat_list", 112);
            if (C84283Sm.LJIIJ(this.LJLIL)) {
                if (z) {
                    str = "user";
                } else {
                    str = "group";
                }
                C85323Wm LIZ2 = C772831o.LIZ();
                C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "onEventV3");
                LIZ3.put("conversation_id", C90643h6.LIZLLL);
                LIZ3.put("is_master", String.valueOf(C90643h6.LJ));
                LIZ3.put("member_type", str);
                LIZ3.put("enter_from", C90643h6.LIZJ);
                LIZ2.LIZIZ("choose_group_inv", LIZ3);
            }
        }
        ((ArrayList) this.LJLLLLLL).clear();
        ((ArrayList) this.LJLLLLLL).addAll(contactList);
    }

    public ShareDialogViewModel(SharePackage sharePackage, InterfaceC101153y3 interfaceC101153y3) {
        o.LJIIIZ(sharePackage, "sharePackage");
        this.LJLIL = sharePackage;
        this.LJLILLLLZI = interfaceC101153y3;
        this.LJLJI = null;
        this.LJLJJI = C221108m2.LIZIZ(C101163y4.LJLIL);
        this.LJLJJL = interfaceC101153y3.LIZJ();
        this.LJLJJLL = interfaceC101153y3.LIZIZ();
        MutableLiveData LIZLLL = interfaceC101153y3.LIZLLL();
        this.LJLJL = LIZLLL;
        this.LJLJLJ = interfaceC101153y3.getState();
        this.LJLJLLL = new MutableLiveData<>();
        this.LJLL = new MutableLiveData<>();
        this.LJLLI = new MutableLiveData<>();
        this.LJLLILLLL = new MutableLiveData<>();
        LiveData<Boolean> map = Transformations.map(LIZLLL, new C14Q() { // from class: X.3y2
            /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
            
                r0 = r4.size();
             */
            @Override // X.C14Q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.util.List r8 = (java.util.List) r8
                    com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel r1 = com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel.this
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.o.LJIIIIZZ(r8, r0)
                    r1.getClass()
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    java.util.Iterator r3 = r8.iterator()
                L15:
                    boolean r0 = r3.hasNext()
                    r6 = 0
                    r5 = 1
                    if (r0 == 0) goto L35
                    java.lang.Object r2 = r3.next()
                    r1 = r2
                    com.ss.android.ugc.aweme.im.service.model.IMContact r1 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r1
                    boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.service.model.IMUser
                    if (r0 == 0) goto L15
                    com.ss.android.ugc.aweme.im.service.model.IMUser r1 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r1
                    int r1 = r1.getFollowStatus()
                    r0 = 2
                    if (r1 != r0) goto L15
                    r4.add(r2)
                    goto L15
                L35:
                    java.util.List r4 = X.ORZ.LJLJJL(r4)
                    java.util.Iterator r3 = r4.iterator()
                L3d:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L5c
                    java.lang.Object r2 = r3.next()
                    r1 = r2
                    com.ss.android.ugc.aweme.im.service.model.IMContact r1 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r1
                    boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.service.model.IMUser
                    if (r0 == 0) goto L3d
                    com.ss.android.ugc.aweme.im.service.model.IMUser r1 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r1
                    java.lang.String r0 = r1.getUid()
                    boolean r0 = com.ss.android.ugc.aweme.im.service.model.IMUser.isSelf(r0)
                    if (r0 == 0) goto L3d
                    if (r2 != 0) goto L71
                L5c:
                    int r0 = r4.size()
                L60:
                    r1 = 3
                    if (r0 <= r1) goto L68
                L63:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
                    return r0
                L68:
                    X.UUc r0 = X.C77266UUc.LIZIZ
                    boolean r0 = r0.LJJIZ()
                    r6 = r0 ^ 1
                    goto L63
                L71:
                    int r0 = r4.size()
                    int r0 = r0 - r5
                    goto L60
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C101143y2.apply(java.lang.Object):java.lang.Object");
            }
        });
        o.LJIIIIZZ(map, "map(fullContactList) {\n …ndFriendsLayout(it)\n    }");
        this.LJLLJ = map;
        this.LJLLL = new MutableLiveData<>();
        this.LJLLLL = new MutableLiveData<>();
        this.LJLLLLLL = new ArrayList();
    }
}
