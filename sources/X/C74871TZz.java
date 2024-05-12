package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.TZz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74871TZz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(CJ2 cj2) {
        if (cj2.size() == 0) {
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            if (TV2.LJIIIZ(LJ)) {
                LinkPlayerInfo LJ2 = TV2.LJ();
                if (LJ2 != null) {
                    cj2.add(LJ2);
                    return;
                }
                return;
            }
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null) {
                return;
            }
            LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
            linkPlayerInfo.LIZ = 2;
            User owner = room.getOwner();
            if (owner == null) {
                return;
            }
            linkPlayerInfo.mUser = owner;
            cj2.add(linkPlayerInfo);
        }
    }

    public static int LIZJ(CJ2 cj2) {
        ListIterator<Object> listIterator = cj2.listIterator(cj2.size());
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            if ((previous instanceof LinkPlayerInfo) && ((LinkPlayerInfo) previous).LIZ == 2) {
                int nextIndex = listIterator.nextIndex();
                if (nextIndex == -1) {
                    return 0;
                }
                return nextIndex;
            }
        }
        return 0;
    }

    public static String LIZLLL(LinkPlayerInfo linkPlayerInfo) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(linkPlayerInfo.mUser.getId());
        LIZ2.append('_');
        LIZ2.append(linkPlayerInfo.LIZ);
        LIZ2.append('_');
        LIZ2.append(linkPlayerInfo.mRoleType);
        LIZ2.append('_');
        LIZ2.append(linkPlayerInfo.mModifyTime);
        return X1D.LIZIZ(LIZ2);
    }

    public static java.util.Map LIZIZ(CJ2 cj2, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<Object> it = cj2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            o.LJII(next, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next;
            linkedHashMap2.put(LIZLLL(linkPlayerInfo), new OSZ(linkPlayerInfo, 1));
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) it2.next();
                String LIZLLL = LIZLLL(linkPlayerInfo2);
                OSZ osz = (OSZ) linkedHashMap2.get(LIZLLL);
                if (osz != null) {
                    linkedHashMap2.put(LIZLLL, new OSZ(osz.getFirst(), 2));
                } else {
                    linkedHashMap.put(LIZLLL, new C74873Ta1(linkPlayerInfo2, false));
                }
            }
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (((Number) ((OSZ) entry.getValue()).getSecond()).intValue() == 1) {
                linkedHashMap.put(entry.getKey(), new C74873Ta1((LinkPlayerInfo) ((OSZ) entry.getValue()).getFirst(), true));
            }
        }
        return linkedHashMap;
    }

    public static void LJFF(CJ2 cj2, int i, C31413CUn c31413CUn) {
        try {
            cj2.remove(i);
            c31413CUn.LJLIL = cj2;
            c31413CUn.notifyItemRemoved(i);
            if (i != c31413CUn.LJLIL.size()) {
                c31413CUn.notifyItemRangeChanged(i, c31413CUn.LJLIL.size() - i);
            }
        } catch (Throwable th) {
            C0NB.LJFF("GameLinkUpdateUserInfoHelper", "notifyItemRemoved failed,", th);
        }
    }

    public static void LJ(CJ2 cj2, int i, Object obj, C31413CUn c31413CUn) {
        try {
            LIZ(cj2);
            cj2.add(i, obj);
            c31413CUn.LJLIL = cj2;
            c31413CUn.notifyItemInserted(i);
            if (i != c31413CUn.LJLIL.size()) {
                c31413CUn.notifyItemRangeChanged(i, c31413CUn.LJLIL.size() - i);
            }
        } catch (Throwable th) {
            C0NB.LJFF("GameLinkUpdateUserInfoHelper", "notifyItemInserted failed,", th);
        }
    }
}
