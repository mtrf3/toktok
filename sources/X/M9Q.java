package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.InboxFragmentVM;
import com.ss.android.ugc.aweme.inbox.lego.PreloadInboxTask;
import com.ss.android.ugc.aweme.inbox.monitor.InboxSampleRate;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M9Q {
    public static void LIZIZ() {
        Object obj;
        Object obj2;
        ActivityC45651qj activityC45651qj;
        Object obj3;
        ActivityC45651qj activityC45651qj2;
        if (PreloadInboxTask.LJLIL) {
            return;
        }
        PreloadInboxTask.LJLIL = true;
        java.util.Map<Integer, String> map = PreloadInboxTask.LJLJI;
        o.LJIIIZ(map, "map");
        C114304eA.LIZIZ.putAll(map);
        C221018lt.LJFF("PreloadInboxTask", "preload onBoot start");
        M9O.LIZ().LIZ();
        long uptimeMillis = SystemClock.uptimeMillis();
        ActivityC45651qj activityC45651qj3 = null;
        if (C114304eA.LIZLLL()) {
            LIZ(Boolean.valueOf(InboxSampleRate.LIZ(0.0f, null)));
            LIZ(InboxFragment.LLIILII);
            LIZ(InboxFragmentVM.LJLL);
            LIZ(Integer.valueOf(IR3.LIZIZ().dmNoUpdateDays));
            LIZ(Boolean.valueOf(C53432Ky4.LIZLLL()));
            LIZ(Boolean.valueOf(IRL.LIZ()));
            LIZ(C56625MKf.LIZ);
            LIZ(C57167Mc7.LIZIZ.getValue());
            LIZ(Boolean.valueOf(((Boolean) C52716KmW.LIZIZ.getValue()).booleanValue()));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("activity_status_");
            LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
            LIZ(Keva.getRepo(X1D.LIZIZ(LIZ)).getAll());
            ((C84343Ss) MultiViewModel.LLJ.getValue()).LIZJ("BUFFER_VM", new MultiViewModel());
            if (L2P.LIZ()) {
                Object LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ instanceof InterfaceC55058LjC) {
                    obj3 = (InterfaceC55058LjC) LJIIIIZZ;
                } else {
                    obj3 = null;
                }
                if ((obj3 instanceof ActivityC45651qj) && (activityC45651qj2 = (ActivityC45651qj) obj3) != null) {
                    new C214378bB(C65352Pkq.LIZ(SkylightListViewModel.class), M9U.LJLIL, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj2, false), C184077Kh.LJLIL, M9S.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj2), C78926UyI.LJIILL(activityC45651qj2));
                }
                C221018lt.LJFF("SkylightBridge", "preload SkylightContainerVH");
            } else {
                Object LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ2 instanceof InterfaceC55058LjC) {
                    obj2 = (InterfaceC55058LjC) LJIIIIZZ2;
                } else {
                    obj2 = null;
                }
                if ((obj2 instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) obj2) != null) {
                    new C214378bB(C65352Pkq.LIZ(InboxTopHorizontalListVM.class), M9T.LJLIL, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, M9R.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj));
                }
                C221018lt.LJFF("SkylightBridge", "preload InboxTopHorizontalListVH");
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preload onBoot finish method, cost=");
            LIZ2.append(SystemClock.uptimeMillis() - uptimeMillis);
            C221018lt.LJFF("PreloadInboxTask", X1D.LIZIZ(LIZ2));
        }
        InterfaceC109664Sc inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService();
        if (inboxAdapterService != null) {
            inboxAdapterService.LJIIL();
        }
        Object LJIIIIZZ3 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ3 instanceof InterfaceC55058LjC) {
            obj = (InterfaceC55058LjC) LJIIIIZZ3;
        } else {
            obj = null;
        }
        if (obj instanceof ActivityC45651qj) {
            activityC45651qj3 = (ActivityC45651qj) obj;
        }
        C114304eA.LJ(activityC45651qj3, R.layout.rt, R.layout.rs, R.layout.ry);
        Object[] objArr = {MMH.LIZ, C86037Xph.LIZ, Boolean.valueOf(C35564DxY.LIZ()), 100, IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel()};
        if (L08.LIZJ()) {
            C221018lt.LJFF("InboxJankOptimizationV2", "preloadInstance");
            objArr.hashCode();
        }
        C55886LwY asyncBlock = C55886LwY.LJLIL;
        o.LJIIIZ(asyncBlock, "asyncBlock");
        if (L08.LIZJ()) {
            C221018lt.LJFF("InboxJankOptimizationV2", "preInvokeMethod");
            asyncBlock.invoke();
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("preload onBoot end, cost=");
        LIZ3.append(SystemClock.uptimeMillis() - uptimeMillis);
        C221018lt.LJFF("PreloadInboxTask", X1D.LIZIZ(LIZ3));
    }

    public static void LIZJ() {
        String str;
        Object obj;
        ActivityC45651qj activityC45651qj;
        if (PreloadInboxTask.LJLILLLLZI) {
            return;
        }
        PreloadInboxTask.LJLILLLLZI = true;
        C221018lt.LJFF("PreloadInboxTask", "preload onClickInbox start");
        if (M9X.LIZ() > 0) {
            C221018lt.LJFF("InboxBoostHelper", "startBoostWhenClick");
            ArrayList arrayList = new ArrayList();
            if (((Boolean) M9X.LIZJ.getValue()).booleanValue()) {
                arrayList.add("start_gc_block");
            }
            if (((Boolean) M9X.LIZ.getValue()).booleanValue()) {
                arrayList.add("start_jit_block");
            }
            if (((Boolean) M9X.LIZIZ.getValue()).booleanValue()) {
                arrayList.add("start_log_block");
            }
            if (((Boolean) M9X.LIZLLL.getValue()).booleanValue()) {
                arrayList.add("start_boot_finish");
            }
            if (((Boolean) M9X.LJ.getValue()).booleanValue()) {
                arrayList.add("start_do_frame");
            }
            if (((Boolean) M9X.LJFF.getValue()).booleanValue()) {
                arrayList.add("thread_priority");
            }
            FNI.LIZ(arrayList);
        }
        boolean z = PreloadInboxTask.LJLIL;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("boot_finish", str);
        FMX.LJIIL("inbox_jank_opt", hashMap);
        MS5.LIZ(C53755L7v.LJLIL);
        InterfaceC109664Sc inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService();
        if (inboxAdapterService != null) {
            inboxAdapterService.LJFF();
        }
        Object LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ instanceof InterfaceC55058LjC) {
            obj = (InterfaceC55058LjC) LJIIIIZZ;
        } else {
            obj = null;
        }
        if ((obj instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) obj) != null) {
            C114304eA.LJ(activityC45651qj, R.layout.tf, R.layout.tf, R.layout.t_, R.layout.sy, R.layout.s7, R.layout.s7, R.layout.s8);
        }
        C221018lt.LJFF("PreloadInboxTask", "preload onClickInbox end");
    }

    public static void LIZ(Object obj) {
        if (obj != null) {
            obj.hashCode();
        }
    }
}
