package com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.moderator;

import X.AbstractC74727TUl;
import X.C00F;
import X.C221108m2;
import X.C62822Ol8;
import X.C74736TUu;
import X.InterfaceC74853TZh;
import X.InterfaceC75560Tl6;
import X.TRT;
import X.TUR;
import X.TUU;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "MULTI_GUEST_V3_MODERATOR_USER_MANAGER")
/* loaded from: classes14.dex */
public final class ModeratorBusinessUserManager extends TUU implements InterfaceC74853TZh {
    public final C62822Ol8 LJLLL;

    @Override // X.TUU
    public final void LJIILL(LinkMessage linkMessage) {
    }

    @Override // X.InterfaceC75402TiY
    public final void LJJJJI() {
    }

    @Override // X.InterfaceC75402TiY
    public final Class<Object> LLIIJI() {
        return InterfaceC74853TZh.class;
    }

    @Override // X.TUU, X.TRS
    public final void init() {
        super.init();
        TRT.LIZ(this, "fetch_on_moderator_init", 1003, null, null, 12);
    }

    @Override // X.InterfaceC74853TZh
    public final AbstractC74727TUl LIZ() {
        return (AbstractC74727TUl) this.LJLLL.getValue();
    }

    @Override // X.TUU
    public final AbstractC74727TUl LJIIJ() {
        return (AbstractC74727TUl) this.LJLLL.getValue();
    }

    @Override // X.TUU
    public final void LJIIL(Throwable t) {
        o.LJIIIZ(t, "t");
        super.LJIIL(t);
        C74736TUu.LJIJI(t);
    }

    @Override // X.TUU
    public final List<Integer> LJIIZILJ(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        return arrayList;
    }

    @Override // X.TUU
    public final void LJIILIIL(MultiLiveGuestInfoList multiLiveGuestInfoList, String source) {
        o.LJIIIZ(source, "source");
        super.LJIILIIL(multiLiveGuestInfoList, source);
        C74736TUu.LJIJJ(((AbstractC74727TUl) this.LJLLL.getValue()).LJIJI());
    }

    @Override // X.TUU
    public final void LJIILJJIL(List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3) {
        C00F.LJ(list, "linkedUsers", list2, "applicants", list3, "invitees");
        TRT.LIZ(this, "fetch_on_moderator_by_message", 1000, null, null, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeratorBusinessUserManager(Room room, long j, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        super(room, j, iMessageManager, lifecycleOwner);
        o.LJIIIZ(room, "room");
        this.LJLLL = C221108m2.LIZIZ(TUR.LJLIL);
    }
}
