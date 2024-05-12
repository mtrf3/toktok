package X;

import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS39S1000000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3yC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101243yC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(SharePackage sharePackage, SendMessageTemplateTask sendMessageTemplateTask, List contactList) {
        boolean z;
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(contactList, "contactList");
        IMContact iMContact = (IMContact) ORZ.LJLLLL(contactList);
        int size = contactList.size();
        if (contactList.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        C107794Kx c107794Kx = new C107794Kx(contactList, iMContact, size, z, sharePackage.itemType, sendMessageTemplateTask.sendMessageEventParcel.enterFrom, sharePackage.extras.getString("enter_method"), sharePackage.extras.getString("aid"), null, sharePackage.extras.getBoolean("is_new_group", false));
        c107794Kx.LJLLILLLL = sharePackage.extras.getBoolean("show_tips_until_cancel", false);
        c107794Kx.LJLLI = sharePackage.extras.getInt("context_id", 0);
        C2U8.LIZ(c107794Kx);
    }

    public static void LIZ(final C4OT c4ot, final SharePackage sharePackage, final String str, final List list) {
        final String LIZ2 = C3Y4.LIZ();
        SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
        if (sendMessageTemplateTask != null) {
            C101203y8.LIZIZ.LIZ(list, sendMessageTemplateTask, str, new C4NZ(c4ot, sharePackage, str, list));
            LIZLLL(sharePackage, sendMessageTemplateTask, list);
            C84943Va.LIZ().LIZIZ(list);
            if (o.LJ(sendMessageTemplateTask.scene, "now_post")) {
                C57428MgK.LJFF(sharePackage, str, ORZ.LLJILJILJ(list), 0, 56);
                return;
            }
            return;
        }
        if (c4ot != null) {
            c4ot.LIZ(sharePackage);
        }
        C4J3 c4j3 = new C4J3() { // from class: X.3m5
            @Override // X.C4J3
            public final void LIZIZ() {
                C3VT.LIZIZ(sharePackage, LIZ2, list);
                C4OT c4ot2 = c4ot;
                if (c4ot2 != null) {
                    SharePackage sharePackage2 = sharePackage;
                    list.size();
                    c4ot2.LJIIIIZZ(sharePackage2);
                }
                C4OT c4ot3 = c4ot;
                if (c4ot3 != null) {
                    c4ot3.LIZJ(sharePackage);
                }
                C57428MgK.LJFF(sharePackage, str, ORZ.LLJILJILJ(list), 0, 56);
                C84943Va.LIZ().LIZIZ(list);
            }
        };
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof IMConversation) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            C107274Ix.LJ(list, str, sharePackage, null, null, null, LIZ2, null, c4j3);
        } else {
            C107274Ix.LJI(list, str, sharePackage, null, null, null, LIZ2, false, c4j3);
        }
    }

    public static void LIZIZ(final SharePackage sharePackage, final List list, final C4OT c4ot, final EnumC84133Rx sortType) {
        o.LJIIIZ(sortType, "sortType");
        final String LIZ2 = C3Y4.LIZ();
        SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
        if (sendMessageTemplateTask != null) {
            C101203y8.LIZIZ.LIZ(list, sendMessageTemplateTask, null, new C4NZ(c4ot, sharePackage, null, list));
            LIZLLL(sharePackage, sendMessageTemplateTask, list);
            if (sortType == EnumC84133Rx.RECENT_SHARED) {
                C84943Va.LIZ().LIZJ("recent share", list);
                return;
            } else {
                C84943Va.LIZ().LIZIZ(list);
                return;
            }
        }
        if (c4ot != null) {
            c4ot.LIZ(sharePackage);
        }
        C107274Ix.LJI(list, null, sharePackage, null, null, null, LIZ2, false, new C4J3() { // from class: X.3m3
            public final /* synthetic */ String LJ = null;

            @Override // X.C4J3
            public final void LIZIZ() {
                C3VT.LIZIZ(sharePackage, LIZ2, list);
                C4OT c4ot2 = c4ot;
                if (c4ot2 != null) {
                    SharePackage sharePackage2 = sharePackage;
                    list.size();
                    c4ot2.LJIIIIZZ(sharePackage2);
                }
                C4OT c4ot3 = c4ot;
                if (c4ot3 != null) {
                    c4ot3.LIZJ(sharePackage);
                }
                C57428MgK.LJFF(sharePackage, this.LJ, ORZ.LLJILJILJ(list), 0, 56);
                if (sortType == EnumC84133Rx.RECENT_SHARED) {
                    C84943Va.LIZ().LIZJ("recent share", list);
                } else {
                    C84943Va.LIZ().LIZIZ(list);
                }
            }
        });
    }

    public static void LIZJ(final SharePackage sharePackage, String str, final List contactList, final C4OT c4ot, BaseContent baseContent, java.util.Map map, java.util.Map map2, int i) {
        BaseContent baseContent2 = baseContent;
        java.util.Map map3 = map;
        java.util.Map map4 = null;
        if ((i & 16) != 0) {
            baseContent2 = null;
        }
        if ((i & 32) != 0) {
            map3 = null;
        }
        if ((i & 64) == 0) {
            map4 = map2;
        }
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(contactList, "contactList");
        final String LIZ2 = C3Y4.LIZ();
        SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
        if (sendMessageTemplateTask != null) {
            if (c4ot != null) {
                contactList.size();
                c4ot.LJIIIIZZ(sharePackage);
            }
            C101203y8.LIZIZ.LIZ(contactList, sendMessageTemplateTask, str, new C4NZ(c4ot, sharePackage, str, contactList));
            LIZLLL(sharePackage, sendMessageTemplateTask, contactList);
        } else {
            if (c4ot != null) {
                c4ot.LIZ(sharePackage);
            }
            C107274Ix.LJ(contactList, str, sharePackage, baseContent2, map3, map4, LIZ2, null, new C4J3() { // from class: X.3m4
                @Override // X.C4J3
                public final void LIZIZ() {
                    C3VT.LIZIZ(sharePackage, LIZ2, contactList);
                    C4OT c4ot2 = c4ot;
                    if (c4ot2 != null) {
                        SharePackage sharePackage2 = sharePackage;
                        contactList.size();
                        c4ot2.LJIIIIZZ(sharePackage2);
                    }
                    C4OT c4ot3 = c4ot;
                    if (c4ot3 != null) {
                        c4ot3.LIZJ(sharePackage);
                    }
                    C84943Va.LIZ().LIZIZ(contactList);
                }
            });
        }
        if (C183317Hj.LIZ() != 0) {
            String string = sharePackage.extras.getString("panel_source", "");
            String string2 = sharePackage.extras.getString("aid", "");
            if (!o.LJ(string, "share_panel") && !o.LJ(string, "long_press")) {
                return;
            }
            C43045Guv.LIZLLL(new AqS39S1000000_1(string2, 2), 0L);
        }
    }
}
