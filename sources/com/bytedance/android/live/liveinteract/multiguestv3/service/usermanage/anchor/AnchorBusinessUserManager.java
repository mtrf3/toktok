package com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor;

import X.AbstractC74727TUl;
import X.C00F;
import X.C0NB;
import X.C221108m2;
import X.C279017q;
import X.C62822Ol8;
import X.C74726TUk;
import X.C74736TUu;
import X.InterfaceC31805Ce1;
import X.InterfaceC65784Pro;
import X.InterfaceC75560Tl6;
import X.TRT;
import X.TUS;
import X.TUT;
import X.TUU;
import X.TV3;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER")
/* loaded from: classes14.dex */
public final class AnchorBusinessUserManager extends TUU implements InterfaceC31805Ce1 {
    public final C62822Ol8 LJLLL;

    @Override // X.TUU
    public final void LJIILL(LinkMessage linkMessage) {
    }

    @Override // X.InterfaceC75402TiY
    public final void LJJJJI() {
    }

    @Override // X.InterfaceC75402TiY
    public final Class<Object> LLIIJI() {
        return InterfaceC31805Ce1.class;
    }

    @Override // X.TUU, X.TRS
    public final void init() {
        super.init();
        TRT.LIZ(this, "enter_room", 8, null, null, 12);
    }

    @Override // X.InterfaceC31805Ce1
    public final AbstractC74727TUl LIZ() {
        return (AbstractC74727TUl) this.LJLLL.getValue();
    }

    @Override // X.TUU
    public final AbstractC74727TUl LJIIJ() {
        return (AbstractC74727TUl) this.LJLLL.getValue();
    }

    @Override // X.TRS
    public final void LJIIIIZZ(int i) {
        LJIJ(i);
    }

    @Override // X.TUU
    public final void LJIIL(Throwable t) {
        o.LJIIIZ(t, "t");
        super.LJIIL(t);
        C74736TUu.LJIJI(t);
    }

    @Override // X.TUU
    public final List<Integer> LJIIZILJ(String str) {
        ArrayList arrayList;
        Integer num;
        MultiGuestDataHolder multiGuestDataHolder;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        ArrayList arrayList2;
        int i = this.LJLJL;
        if (i != 0) {
            if (i != 1) {
                arrayList = new ArrayList();
                arrayList.add(1);
                arrayList.add(2);
                arrayList.add(3);
                C0NB.LIZIZ("LinkUserInfoCenter", "listType else");
            } else {
                arrayList = new ArrayList();
                arrayList.add(5);
                arrayList.add(3);
                C0NB.LIZIZ("LinkUserInfoCenter", "listType SCENE_CO_HOST");
            }
        } else {
            arrayList = new ArrayList();
            arrayList.add(1);
            if (!TV3.LJIIJ() && ((TUT.LIZ() || TUT.LIZIZ()) && (multiGuestDataHolder = this.LJLLILLLL) != null && (multiLiveAnchorPanelSettings = multiGuestDataHolder.LJIIJ) != null && multiLiveAnchorPanelSettings.applierSortSetting == 1)) {
                arrayList.add(6);
            } else {
                arrayList.add(2);
            }
            arrayList.add(3);
            if (C74726TUk.LIZ()) {
                arrayList.add(5);
            }
            C279017q.LJ("listType source:", str, "LinkUserInfoCenter");
            InterfaceC65784Pro<Integer> interfaceC65784Pro = this.LJLJLJ;
            if (interfaceC65784Pro != null) {
                num = interfaceC65784Pro.invoke();
            } else {
                num = null;
            }
            if (o.LJ(str, "FETCH_ON_ADD_FRIENDS_LIST")) {
                if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isInLabGroup()) {
                    arrayList.add(4);
                    C0NB.LIZIZ("LinkUserInfoCenter", "listType add NOT_VIEWER_FRIENDS");
                }
            } else if (num == null || num.intValue() != 1) {
                if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isTwoTabType()) {
                    arrayList.add(4);
                    C0NB.LIZIZ("LinkUserInfoCenter", "listType else add NOT_VIEWER_FRIENDS ");
                }
            } else {
                arrayList.clear();
                arrayList.add(1);
                arrayList.add(4);
                C0NB.LIZIZ("LinkUserInfoCenter", "listType only NOT_VIEWER_FRIENDS");
            }
        }
        AbstractC74727TUl abstractC74727TUl = (AbstractC74727TUl) this.LJLLL.getValue();
        if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isInLabGroup()) {
            arrayList2 = arrayList;
        } else {
            arrayList2 = new ArrayList();
        }
        abstractC74727TUl.getClass();
        ((ArrayList) abstractC74727TUl.LJIIIZ).clear();
        ((ArrayList) abstractC74727TUl.LJIIIZ).addAll(arrayList2);
        return arrayList;
    }

    @Override // X.TUU
    public final void LJIILIIL(MultiLiveGuestInfoList multiLiveGuestInfoList, String source) {
        o.LJIIIZ(source, "source");
        super.LJIILIIL(multiLiveGuestInfoList, source);
        C74736TUu.LJIJJ(((AbstractC74727TUl) this.LJLLL.getValue()).LJIJI());
    }

    public /* synthetic */ AnchorBusinessUserManager(Room room, long j, IMessageManager iMessageManager) {
        this(room, j, iMessageManager, null);
    }

    @Override // X.TUU
    public final void LJIILJJIL(List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3) {
        C00F.LJ(list, "linkedUsers", list2, "applicants", list3, "invitees");
        TRT.LIZ(this, "message_linked_list_change", 1, null, null, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorBusinessUserManager(Room room, long j, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        super(room, j, iMessageManager, lifecycleOwner);
        o.LJIIIZ(room, "room");
        this.LJLLL = C221108m2.LIZIZ(TUS.LJLIL);
    }
}
