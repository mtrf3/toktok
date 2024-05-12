package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.TaP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74897TaP {
    public static int LIZ;

    public static void LIZ(CJ2 cj2) {
        if (cj2.size() == 0) {
            if (C74947TbD.LJIILL()) {
                LinkPlayerInfo LJIIIZ = C74947TbD.LJIIIZ();
                if (LJIIIZ != null) {
                    cj2.add(LJIIIZ);
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

    public static int LIZLLL(CJ2 cj2) {
        int i;
        ListIterator<Object> listIterator = cj2.listIterator(cj2.size());
        while (true) {
            i = 0;
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if ((previous instanceof LinkPlayerInfo) && ((LinkPlayerInfo) previous).LIZIZ == 1) {
                int nextIndex = listIterator.nextIndex();
                if (nextIndex != -1) {
                    i = nextIndex;
                }
            }
        }
        return i + LIZ;
    }

    public static int LJ(CJ2 cj2) {
        Iterator<Object> it = cj2.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C74900TaS) && ((C74900TaS) next).LJLILLLLZI == 1) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int LJFF(CJ2 cj2) {
        Iterator<Object> it = cj2.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C74900TaS) && ((C74900TaS) next).LJLILLLLZI == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static OSJ LJI(CJ2 cj2) {
        int i;
        ListIterator<Object> listIterator = cj2.listIterator(cj2.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                Object previous = listIterator.previous();
                if ((previous instanceof LinkPlayerInfo) && ((LinkPlayerInfo) previous).LIZIZ == 2) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        int LJFF = LJFF(cj2);
        if (i == -1) {
            if (LJFF == -1) {
                int LIZLLL = LIZLLL(cj2);
                return new OSJ(Integer.valueOf(LIZLLL), -1, Integer.valueOf(LIZLLL));
            }
            i = LJFF;
        }
        return new OSJ(Integer.valueOf(i), Integer.valueOf(LJFF), Integer.valueOf(i));
    }

    public static String LJIIIIZZ(LinkPlayerInfo linkPlayerInfo) {
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

    public static String LJIIJ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_MultiGuestUpdateUserInfoHelper_", LJ, LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ3, "_MultiGuestUpdateUserInfoHelper_", i, LIZ3);
    }

    public static java.util.Map LIZIZ(CJ2 cj2, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<Object> it = cj2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            o.LJII(next, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next;
            linkedHashMap2.put(LJIIIIZZ(linkPlayerInfo), new OSZ(linkPlayerInfo, 1));
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) it2.next();
                String LJIIIIZZ = LJIIIIZZ(linkPlayerInfo2);
                OSZ osz = (OSZ) linkedHashMap2.get(LJIIIIZZ);
                if (osz != null) {
                    linkedHashMap2.put(LJIIIIZZ, new OSZ(osz.getFirst(), 2));
                } else {
                    linkedHashMap.put(LJIIIIZZ, new C74875Ta3(linkPlayerInfo2, false));
                }
            }
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (((Number) ((OSZ) entry.getValue()).getSecond()).intValue() == 1) {
                linkedHashMap.put(entry.getKey(), new C74875Ta3((LinkPlayerInfo) ((OSZ) entry.getValue()).getFirst(), true));
            }
        }
        return linkedHashMap;
    }

    public static int LIZJ(int i, CJ2 cj2) {
        Iterator<Object> it = cj2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C74900TaS) && ((C74900TaS) next).LJLILLLLZI == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int LJII(int i, CJ2 cj2) {
        Iterator<Object> it = cj2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C74899TaR) && ((C74899TaR) next).LIZ == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int LJIIIZ(List list, List list2) {
        int i;
        int i2 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (list2 != null) {
            i2 = list2.size();
        }
        return i + i2;
    }

    public static void LJIIL(CJ2 cj2, int i, C31413CUn adapter) {
        o.LJIIIZ(adapter, "adapter");
        try {
            cj2.remove(i);
            adapter.LJLIL = cj2;
            adapter.notifyItemRemoved(i);
            if (i != adapter.LJLIL.size()) {
                adapter.notifyItemRangeChanged(i, adapter.LJLIL.size() - i);
            }
        } catch (Throwable th) {
            C32014ChO.LIZJ(LJIIJ(942), "notifyItemRemoved failed,", th.getMessage());
        }
    }

    public static void LJIIJJI(CJ2 cj2, int i, Object obj, C31413CUn c31413CUn) {
        try {
            LIZ(cj2);
            cj2.add(i, obj);
            c31413CUn.LJLIL = cj2;
            c31413CUn.notifyItemInserted(i);
            if (i != c31413CUn.LJLIL.size()) {
                c31413CUn.notifyItemRangeChanged(i, c31413CUn.LJLIL.size() - i);
            }
        } catch (Throwable th) {
            C32014ChO.LIZJ(LJIIJ(552), "notifyItemInserted failed,", th.getMessage());
        }
    }

    public static void LJIILJJIL(List list, List list2, CJ2 cj2, CJ2 cj22, C31413CUn c31413CUn) {
        boolean z;
        int i;
        String LJIILL;
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        int size = cj2.size();
        if (cj22 != null) {
            i = cj22.size();
        } else {
            i = 0;
        }
        int i2 = size + i;
        int LJIIIZ = LJIIIZ(list2, list);
        if (!z) {
            if (i2 != LJIIIZ) {
                List<?> list3 = c31413CUn.LJLIL;
                o.LJII(list3, "null cannot be cast to non-null type me.drakeet.multitype.Items");
                CJ2 cj23 = (CJ2) list3;
                int LJFF = LJFF(cj23);
                if (LJFF != -1) {
                    Object obj = cj23.get(LJFF);
                    o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.cohost.ui.item.TitleItem");
                    C74900TaS c74900TaS = (C74900TaS) obj;
                    if (LJIIIZ == 1) {
                        LJIILL = C15380j0.LJIILL(R.string.lsx, Integer.valueOf(LJIIIZ));
                        o.LJIIIIZZ(LJIILL, "{\n                      …  )\n                    }");
                    } else {
                        LJIILL = C15380j0.LJIILL(R.string.lsy, Integer.valueOf(LJIIIZ));
                        o.LJIIIIZZ(LJIILL, "{\n                      …  )\n                    }");
                    }
                    c74900TaS.LJLIL = LJIILL;
                    c74900TaS.LJLILLLLZI = 0;
                    cj23.set(LJFF, obj);
                    c31413CUn.LJLIL = cj23;
                    c31413CUn.notifyItemChanged(LJFF);
                    return;
                }
                return;
            }
            return;
        }
        List<?> list4 = c31413CUn.LJLIL;
        o.LJII(list4, "null cannot be cast to non-null type me.drakeet.multitype.Items");
        CJ2 cj24 = (CJ2) list4;
        int LJFF2 = LJFF(cj24);
        if (LJFF2 == -1) {
            return;
        }
        LJIIL(cj24, LJFF2, c31413CUn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x04f5, code lost:
    
        if (r1 == (-1)) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x053e, code lost:
    
        if (r0.isEmpty() != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0538, code lost:
    
        if (r0 != null) goto L244;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(boolean r25, X.C74898TaQ r26, X.C74878Ta6 r27, X.C31413CUn r28, int r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74897TaP.LJIILIIL(boolean, X.TaQ, X.Ta6, X.CUn, int, boolean, boolean):void");
    }
}
