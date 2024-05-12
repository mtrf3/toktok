package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import X.C162476Zf;
import X.C90643h6;
import X.C91383iI;
import X.C91773iv;
import X.FMX;
import X.InterfaceC57784Mm4;
import X.OSZ;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ContactListCell extends BaseContactListCell<C91773iv> {
    @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell
    /* renamed from: M */
    public final void onBindItemView(C91773iv item) {
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        ContactListViewModel L = L();
        String uid = item.LJLIL.getUid();
        o.LJIIIIZZ(uid, "item.contact.uid");
        L.getClass();
        int i = C91383iI.LIZ[L.hv0().getEntry().ordinal()];
        if (i != 1) {
            if (i == 2) {
                C90643h6.LJI(C90643h6.LIZ, "show_add_member", new OSZ[]{new OSZ(uid, "to_user_id")});
                return;
            }
            throw new C162476Zf();
        }
        FMX.LJIILL("show_group_member", new OSZ(C90643h6.LIZIZ, "previous_page"), new OSZ("member_list", "enter_from"), new OSZ(uid, "to_user_id"));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        onBindItemView((C91773iv) interfaceC57784Mm4);
    }
}
