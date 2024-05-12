package X;

import com.bytedance.touchpoint.core.coinbottomtab.CoinBottomTabViewModel;
import com.bytedance.touchpoint.core.crossplatform.IncentivePreloadViewModel;
import com.bytedance.touchpoint.core.homepageicon.HomePageIconViewModel;
import com.bytedance.touchpoint.core.inapppush.InAppPushViewModel;
import com.bytedance.touchpoint.core.invitecode.TTInviteCodeViewModel;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.Bubble;
import com.bytedance.touchpoint.core.model.CoinBottomTab;
import com.bytedance.touchpoint.core.model.DynamicDialog;
import com.bytedance.touchpoint.core.model.HomePageIcon;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.bytedance.touchpoint.core.model.IncentiveCommon;
import com.bytedance.touchpoint.core.model.IncentivePreload;
import com.bytedance.touchpoint.core.model.NowTabIcon;
import com.bytedance.touchpoint.core.model.ProfileActivityIcon;
import com.bytedance.touchpoint.core.model.RedPacketPendant;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.bytedance.touchpoint.core.nowtabicon.NowTabIconViewModel;
import com.bytedance.touchpoint.core.popup.PopupViewModel;
import com.bytedance.touchpoint.core.profileicon.ProfileIconViewModel;
import com.bytedance.touchpoint.core.redpacketpendant.RedPacketPendantViewModel;
import com.bytedance.touchpoint.core.task.TasksViewModel;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import com.google.gson.j;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9O7, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9O7 {
    public static final C5H3 LJIIIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C9OD.LJLIL);
    public List<TouchPoint> LIZ;
    public List<TouchPoint> LIZLLL;
    public C9OT LJ;
    public final HashMap<Integer, TouchPoint> LIZIZ = new HashMap<>();
    public final List<TouchPoint> LIZJ = new ArrayList();
    public final HashMap<Integer, C95U> LJFF = new HashMap<>();
    public final HashMap<Integer, List<C95U>> LJI = new HashMap<>();
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C9MT.LJLIL);
    public final ArrayList<C94Y> LJIIIIZZ = C47261Igj.LJII(new C94Y() { // from class: X.9OO
        /* JADX WARN: Removed duplicated region for block: B:38:0x0078 A[Catch: Exception -> 0x013b, TryCatch #0 {Exception -> 0x013b, blocks: (B:3:0x0006, B:6:0x0017, B:8:0x001f, B:10:0x0029, B:12:0x0036, B:13:0x003a, B:15:0x0044, B:18:0x004a, B:21:0x005e, B:23:0x0062, B:26:0x00a8, B:28:0x00ac, B:32:0x00b5, B:34:0x00b9, B:36:0x006b, B:38:0x0078, B:40:0x0080, B:42:0x008a, B:44:0x0097, B:45:0x009b, B:49:0x00c1, B:50:0x00c7, B:52:0x00d3, B:54:0x00d7, B:57:0x00e3, B:59:0x00e7, B:63:0x00f0, B:65:0x00f4, B:69:0x00fd, B:71:0x0101, B:74:0x00dd, B:79:0x010c, B:83:0x0068), top: B:2:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x010a A[ADDED_TO_REGION] */
        @Override // X.C94Y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZ(java.util.HashMap<java.lang.Integer, com.bytedance.touchpoint.core.model.TouchPoint> r13) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C9OO.LIZ(java.util.HashMap):void");
        }
    }, new C95X<ProfileActivityIcon>() { // from class: X.9OI
        @Override // X.C95X
        public final int LIZJ() {
            return 15;
        }

        @Override // X.C95X
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(ProfileIconViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9OK.INSTANCE, null, null).getValue();
        }

        @Override // X.C95X
        public final Class<ProfileActivityIcon> LIZIZ() {
            return ProfileActivityIcon.class;
        }
    }, new C95X<ProfileActivityIcon>() { // from class: X.9OJ
        @Override // X.C95X
        public final int LIZJ() {
            return 3;
        }

        @Override // X.C95X
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(ProfileIconViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9OL.INSTANCE, null, null).getValue();
        }

        @Override // X.C95X
        public final Class<ProfileActivityIcon> LIZIZ() {
            return ProfileActivityIcon.class;
        }
    }, new C95Y<InAppPush>() { // from class: X.9OB
        @Override // X.C95Y
        public final int LIZJ() {
            return 6;
        }

        @Override // X.C95Y
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(InAppPushViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9OC.INSTANCE, null, null).getValue();
        }

        @Override // X.C95Y
        public final Class<InAppPush[]> LIZIZ() {
            return InAppPush[].class;
        }
    }, new C95Y<Bubble>() { // from class: X.9OA
        @Override // X.C95Y
        public final int LIZJ() {
            return 7;
        }

        @Override // X.C95Y
        public final BaseTouchPointDataVM LIZLLL() {
            return null;
        }

        @Override // X.C95Y
        public final Class<Bubble[]> LIZIZ() {
            return Bubble[].class;
        }
    }, new C95Y<ActivityTask>() { // from class: X.9OQ
        @Override // X.C95Y
        public final int LIZJ() {
            return 11;
        }

        @Override // X.C95Y
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(TasksViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9OR.INSTANCE, null, null).getValue();
        }

        @Override // X.C95Y
        public final Class<ActivityTask[]> LIZIZ() {
            return ActivityTask[].class;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.C95Y
        public final List<C95U> LJ(HashMap<Integer, TouchPoint> touchPointMap, List<? extends C95U> list) {
            o.LJIIIZ(touchPointMap, "touchPointMap");
            if (touchPointMap.get(30) == null) {
                return list;
            }
            C248109oU.LJLZ.getClass();
            C9OS.LIZ().getClass();
            Boolean bool = Boolean.FALSE;
            Object[] objArr = null == true ? 1 : 0;
            Object[] objArr2 = null == true ? 1 : 0;
            ActivityTask activityTask = new ActivityTask("red_packet_fake_task", 999, false, "", -1, null, null == true ? 1 : 0, objArr, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, objArr2, null == true ? 1 : 0, bool, bool, null == true ? 1 : 0, 1536, null == true ? 1 : 0);
            ArrayList arrayList = new ArrayList();
            if (list != 0) {
                arrayList.addAll(list);
            }
            arrayList.add(activityTask);
            return arrayList;
        }
    }, new C95X<NowTabIcon>() { // from class: X.9O8
        @Override // X.C95X
        public final int LIZJ() {
            return 20;
        }

        @Override // X.C95X
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(NowTabIconViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9O9.INSTANCE, null, null).getValue();
        }

        @Override // X.C95X
        public final Class<NowTabIcon> LIZIZ() {
            return NowTabIcon.class;
        }
    }, new C9MI(), new C94Y() { // from class: X.94X
        public final List<Integer> LIZ = C47261Igj.LJJIJIIJI(21, 19, 24, 25);

        @Override // X.C94Y
        public final void LIZ(HashMap<Integer, TouchPoint> touchPointsMap) {
            o.LJIIIZ(touchPointsMap, "touchPointsMap");
            try {
                List<Integer> list = this.LIZ;
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    TouchPoint touchPoint = touchPointsMap.get(Integer.valueOf(it.next().intValue()));
                    if (touchPoint != null) {
                        arrayList.add(touchPoint);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    TouchPoint it3 = (TouchPoint) it2.next();
                    o.LJIIIIZZ(it3, "it");
                    C95O.LIZ(it3);
                }
            } catch (Exception unused) {
            }
        }
    }, new C95N(), new C95X<HomePageIcon>() { // from class: X.9O5
        @Override // X.C95X
        public final int LIZJ() {
            return 16;
        }

        @Override // X.C95X
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(HomePageIconViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9O6.INSTANCE, null, null).getValue();
        }

        @Override // X.C95X
        public final Class<HomePageIcon> LIZIZ() {
            return HomePageIcon.class;
        }
    }, new C95X<RedPacketPendant>() { // from class: X.9OM
        @Override // X.C95X
        public final int LIZJ() {
            return 30;
        }

        @Override // X.C95X
        public final boolean LJFF() {
            return true;
        }

        @Override // X.C95X
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(RedPacketPendantViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9ON.INSTANCE, null, null).getValue();
        }

        @Override // X.C95X
        public final Class<RedPacketPendant> LIZIZ() {
            return RedPacketPendant.class;
        }

        @Override // X.C95X
        public final RedPacketPendant LJ(RedPacketPendant redPacketPendant) {
            j LJJIJ;
            RedPacketPendant redPacketPendant2 = redPacketPendant;
            C76800UCe c76800UCe = null;
            r2 = null;
            String str = null;
            c76800UCe = null;
            if (redPacketPendant2 != null) {
                try {
                    String str2 = redPacketPendant2.LJFF;
                    if (str2 != null) {
                        m mVar = (m) C62819Ol5.LJIIL(str2, m.class);
                        if (mVar != null && (LJJIJ = mVar.LJJIJ("popup_view")) != null) {
                            str = LJJIJ.toString();
                        }
                        redPacketPendant2.LJI = str;
                        c76800UCe = C76800UCe.LIZ;
                    }
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            C3C5.m7constructorimpl(c76800UCe);
            return redPacketPendant2;
        }
    }, new C95X<DynamicDialog>() { // from class: X.9OG
        @Override // X.C95X
        public final int LIZJ() {
            return 4;
        }

        @Override // X.C95X
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(PopupViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9OH.INSTANCE, null, null).getValue();
        }

        @Override // X.C95X
        public final Class<DynamicDialog> LIZIZ() {
            return DynamicDialog.class;
        }
    }, new C95X<IncentiveCommon>() { // from class: X.9OE
        @Override // X.C95X
        public final int LIZJ() {
            return 23;
        }

        @Override // X.C95X
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(TTInviteCodeViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9OF.INSTANCE, null, null).getValue();
        }

        @Override // X.C95X
        public final Class<IncentiveCommon> LIZIZ() {
            return IncentiveCommon.class;
        }
    }, new C95X<CoinBottomTab>() { // from class: X.9NK
        @Override // X.C95X
        public final int LIZJ() {
            return 29;
        }

        @Override // X.C95X
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(CoinBottomTabViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9NL.INSTANCE, null, null).getValue();
        }

        @Override // X.C95X
        public final Class<CoinBottomTab> LIZIZ() {
            return CoinBottomTab.class;
        }
    }, new C95X<IncentivePreload>() { // from class: X.9Ms
        @Override // X.C95X
        public final int LIZJ() {
            return 31;
        }

        @Override // X.C95X
        public final BaseTouchPointDataVM LIZLLL() {
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(IncentivePreloadViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C235679Mt.INSTANCE, null, null).getValue();
        }

        @Override // X.C95X
        public final Class<IncentivePreload> LIZIZ() {
            return IncentivePreload.class;
        }
    });

    public final void LIZIZ() {
        this.LIZ = null;
        this.LJ = null;
        this.LIZLLL = null;
        this.LIZIZ.clear();
        this.LJFF.clear();
        this.LJI.clear();
        ((ArrayList) this.LIZJ).clear();
    }

    public final <T extends C95U> T LIZLLL(int i) {
        C95U c95u = this.LJFF.get(Integer.valueOf(i));
        if (!(c95u instanceof C95U)) {
            c95u = null;
        }
        return (T) c95u;
    }

    public final <T extends C95U> List<T> LJ(int i) {
        Collection collection = this.LJI.get(Integer.valueOf(i));
        if (!(collection instanceof List)) {
            collection = null;
        }
        return (List) collection;
    }

    public final void LIZ(int i, C95U c95u) {
        this.LJFF.put(Integer.valueOf(i), c95u);
    }

    public final TouchPoint LIZJ(int i, Integer num) {
        Object obj;
        if (i == 5) {
            Iterator<TouchPoint> it = this.LIZJ.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                TouchPoint next = it.next();
                TouchPoint touchPoint = next;
                if (touchPoint != null) {
                    obj = touchPoint.launchPlanId;
                }
                if (o.LJ(obj, num)) {
                    obj = next;
                    break;
                }
            }
            return (TouchPoint) obj;
        }
        return this.LIZIZ.get(Integer.valueOf(i));
    }
}
