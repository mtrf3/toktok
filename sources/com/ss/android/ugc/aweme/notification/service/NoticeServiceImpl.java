package com.ss.android.ugc.aweme.notification.service;

import X.AX6;
import X.AbstractC53764L8e;
import X.ActivityC45651qj;
import X.C10K;
import X.C112714bb;
import X.C198517qh;
import X.C221018lt;
import X.C2307993z;
import X.C2U8;
import X.C2WG;
import X.C36089EEj;
import X.C36093EEn;
import X.C38776FJs;
import X.C40322Fs6;
import X.C46604IQu;
import X.C47261Igj;
import X.C53361Kwv;
import X.C53366Kx0;
import X.C53432Ky4;
import X.C53551Kzz;
import X.C53765L8f;
import X.C54072LKa;
import X.C54251LQx;
import X.C54287LSh;
import X.C54288LSi;
import X.C54311LTf;
import X.C55879LwR;
import X.C55882LwU;
import X.C55883LwV;
import X.C55884LwW;
import X.C55885LwX;
import X.C55896Lwi;
import X.C55897Lwj;
import X.C56678MMg;
import X.C56827MRz;
import X.C56923MVr;
import X.C58096Mr6;
import X.C61210O0o;
import X.C62822Ol8;
import X.C72504Scu;
import X.CallableC55907Lwt;
import X.DWE;
import X.EEZ;
import X.EFM;
import X.ENJ;
import X.FGR;
import X.FMX;
import X.HandlerC56918MVm;
import X.INB;
import X.InterfaceC54240LQm;
import X.InterfaceC55337Lnh;
import X.InterfaceC55887LwZ;
import X.L0U;
import X.LA1;
import X.LA9;
import X.LAB;
import X.LGR;
import X.LR8;
import X.LRV;
import X.LVB;
import X.MMI;
import X.MS3;
import X.MS5;
import X.MWC;
import X.ORZ;
import X.SI5;
import X.SIT;
import X.ViewOnClickListenerC54142LMs;
import X.ViewOnClickListenerC57173McD;
import X.X1D;
import Y.ACallableS33S1100000_6;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.InboxShellFragment;
import com.ss.android.ugc.aweme.inbox.NotificationContainer;
import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.inbox.lego.PreloadInboxTask;
import com.ss.android.ugc.aweme.inbox.newfollowerpage.InboxNewFollowerTabFragment;
import com.ss.android.ugc.aweme.notice.api.ab.GuideOutPushExperiment;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity;
import com.ss.android.ugc.aweme.notification.NotificationFragment;
import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import com.ss.android.ugc.aweme.notification.lego.FetchTutorialVideoRequest;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.m1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS45S0001000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeServiceImpl implements INoticeService {
    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final <T extends CommonPageFragment> Class<? extends T> LIZJ() {
        return InboxShellFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIIJ() {
        C54072LKa.LIZLLL = true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final int LJIIJJI() {
        if (L0U.LIZ()) {
            if (NoticePerfManager.OptimizationStrategy.LIZ().enableBootPreload || NoticePerfManager.OptimizationStrategy.LIZ().enableActivityEntranceUpdatePreload) {
                return 4;
            }
            if (NoticePerfManager.OptimizationStrategy.LIZ().enableBootLazyPreload) {
                return 3;
            }
            if (NoticePerfManager.OptimizationStrategy.LIZ().enableUnreadPostPreload) {
                return 2;
            }
            if (NoticePerfManager.OptimizationStrategy.LIZ().enableClickPreload) {
                return 1;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIILIIL() {
        C55879LwR.LIZJ(0, null);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIIZILJ() {
        LAB.LIZ.getClass();
        return LAB.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void initLegoInflate() {
    }

    public static INoticeService LJJJJJ() {
        Object LIZ = C58096Mr6.LIZ(INoticeService.class, false);
        if (LIZ != null) {
            return (INoticeService) LIZ;
        }
        if (C58096Mr6.t3 == null) {
            synchronized (INoticeService.class) {
                if (C58096Mr6.t3 == null) {
                    C58096Mr6.t3 = new NoticeServiceImpl();
                }
            }
        }
        return C58096Mr6.t3;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIJJ() {
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(new PreloadInboxTask(), true);
        LJIIIZ.LIZJ();
        MS5.LIZ(C55896Lwi.LJLIL);
        C10K.LIZJ(new Callable() { // from class: X.3IA
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C86550Xxy.LIZIZ.init();
                return C76800UCe.LIZ;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIIJ() {
        C56678MMg.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final AbstractC53764L8e LJJIIZI() {
        return new LGR();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIJIIJIL() {
        C221018lt.LJFF("InboxMovingReminderHelper", "onReminderEnd");
        C54287LSh.LIZ = false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final EFM LJJIJIL() {
        return new FetchTutorialVideoRequest();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJ() {
        MS5.LJI(C55897Lwj.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJI() {
        String str;
        C221018lt.LJFF("InboxMovingReminderHelper", "onReminderShow");
        C54288LSi LIZ = C54287LSh.LIZ();
        if (LIZ != null) {
            LIZ.LIZ.storeInt("inbox_moving_reminder_count", LIZ.LIZ.getInt("inbox_moving_reminder_count", 0) + 1);
            LIZ.LIZ.storeLong("inbox_last_reminder_show_time", System.currentTimeMillis());
        }
        if (C53765L8f.LJIIL("NOTIFICATION")) {
            str = "bottom_4tab";
        } else if (C53765L8f.LJIILJJIL()) {
            str = "top_left_tab";
        } else {
            str = "top_right_tab";
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("enter_method", str);
        FMX.LJIILJJIL("show_inbox_moving_reminder", c198517qh.LJ());
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJ() {
        if (((Boolean) m1.LIZ.getValue()).booleanValue()) {
            MS5.LIZ(C55882LwU.LJLIL);
        }
        MMI.LAUNCH_TIMESTAMP.trackTime();
        if (!C53432Ky4.LJ()) {
            C221018lt.LJFF("PreloadManager", "onApplicationCreate - PreloadExperiment no hit, return");
        } else {
            EEZ.LIZ(new ENJ());
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final <T extends AmeBaseFragment> Class<? extends T> LJIIL() {
        if (INB.LIZIZ()) {
            if (AX6.LIZIZ()) {
                return NotificationContainer.class;
            }
            return InboxFragment.class;
        }
        if (L0U.LIZ() && INB.LIZ() == 0) {
            return NotificationFragment.class;
        }
        return MusNewNotificationFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC55337Lnh LJIILJJIL() {
        HandlerC56918MVm LIZ = NoticeVideoManager.LIZ();
        if (LIZ != null) {
            return LIZ;
        }
        return new C55884LwW();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJJIZL() {
        return C53432Ky4.LJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final MWC LIZIZ() {
        return C56923MVr.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC54240LQm LJJIIJZLJL() {
        return C54311LTf.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LJJIJ() {
        return C54072LKa.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Object LJJIL() {
        return LVB.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Intent LJFF(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        return new Intent(ctx, (Class<?>) MusNotificationDetailActivity.class);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJI(InterfaceC55887LwZ callback) {
        o.LJIIIZ(callback, "callback");
        C62822Ol8 c62822Ol8 = LA9.LIZ;
        if (!((CopyOnWriteArrayList) c62822Ol8.getValue()).contains(callback)) {
            ((CopyOnWriteArrayList) c62822Ol8.getValue()).add(callback);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIIIIZZ(int i) {
        C2U8.LIZ(new C55885LwX(i));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIIIZ(int i) {
        MS5.LJI(new AqS45S0001000_9(i, 1));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIILLIIL(Context context) {
        if (C56827MRz.LIZJ(context) && C56827MRz.LIZ(context) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIJ(InterfaceC55887LwZ callback) {
        o.LJIIIZ(callback, "callback");
        ((CopyOnWriteArrayList) LA9.LIZ.getValue()).remove(callback);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final View.OnClickListener LJIJI(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        return new ViewOnClickListenerC54142LMs(ctx);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIJJLI(BaseResponse baseResponse) {
        if ((baseResponse instanceof RejectResponse) && ((RejectResponse) baseResponse).reject_status == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final LR8 LJIL(ActivityC45651qj activityC45651qj) {
        return new LRV(activityC45651qj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (new X.AnonymousClass078(r15).LIZIZ() == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce A[Catch: Exception -> 0x00ee, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ee, blocks: (B:19:0x005b, B:28:0x00b6, B:32:0x00ce), top: B:18:0x005b }] */
    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl.LJJ(android.content.Context):void");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJI(boolean z) {
        return LA9.LIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIFFI(Context context) {
        C56827MRz.LIZIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJII(C54251LQx c54251LQx) {
        C10K.LIZIZ(new ACallableS33S1100000_6(c54251LQx, 2), C10K.LJI, null);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final SIT LJJIII(SI5 si5) {
        return new C72504Scu(si5);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIIZ(BaseResponse baseResponse) {
        if ((baseResponse instanceof ApproveResponse) && ((ApproveResponse) baseResponse).approve_status == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIJL(Context context) {
        o.LJIIIZ(context, "context");
        if (((Boolean) GuideOutPushExperiment.LIZJ.getValue()).booleanValue()) {
            return true;
        }
        return C38776FJs.LJIIL().LIZ(context, "key_opt_dm_dialog_show", true);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIZ(boolean z) {
        String str;
        Object obj;
        C2WG.LIZ().storeBoolean("creator_user_setting", z);
        C2WG.LIZ().storeBoolean("creator_hack_flag", true);
        ((ConcurrentHashMap) ((LA1) LA9.LIZJ.getValue()).LIZIZ.getValue()).clear();
        C53361Kwv.LIZ.getClass();
        C53366Kx0 c53366Kx0 = C53366Kx0.LJLIL;
        int LIZIZ = C53361Kwv.LIZIZ("creator_inbox_experiment");
        synchronized (c53366Kx0) {
            List<Map<String, String>> list = C53366Kx0.LJLILLLLZI;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        Map map = (Map) obj;
                        if (map != null && o.LJ(map.get("key"), "creator_inbox_experiment")) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    List<Map<String, String>> list2 = C53366Kx0.LJLILLLLZI;
                    if (list2 != null) {
                        ((ArrayList) list2).remove(map2);
                    }
                    List<Map<String, String>> list3 = C53366Kx0.LJLILLLLZI;
                    if (list3 != null) {
                        ((ArrayList) list3).add(C53366Kx0.LIZ("creator_inbox_experiment", String.valueOf(LIZIZ)));
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("updateCacheParam: Key:");
                    LIZ.append("creator_inbox_experiment");
                    LIZ.append("  Value:");
                    LIZ.append(LIZIZ);
                    LIZ.append(' ');
                    C221018lt.LJFF("SystemNotificationExperimentListHelper", X1D.LIZIZ(LIZ));
                }
            }
        }
        LA9.LIZIZ = null;
        C2U8.LIZ(new C55883LwV(z));
        Iterator it2 = ((CopyOnWriteArrayList) LA9.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC55887LwZ) it2.next()).LIZ(z);
        }
        HashMap hashMap = new HashMap();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        hashMap.put("to_status", str);
        FMX.LJIIL("change_creator_inbox", hashMap);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJIL(NoticeList noticeList) {
        PreloadManager.LIZJ(noticeList, 1);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void notifyLocaleChange(Locale locale) {
        C56678MMg.LIZIZ(C56678MMg.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LIZ(Context context, GuideOutPushParam guideOutPushParam) {
        o.LJIIIZ(context, "context");
        C56827MRz.LJFF(context, guideOutPushParam, null);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJ(WeakHandler weakHandler, String str) {
        FollowRequestApiManager.LIZJ(weakHandler, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LJII(String str, String str2) {
        if (((Boolean) DWE.LIZ.getValue()).booleanValue() && C53551Kzz.LIZ() && NowsTabServiceImpl.LJJIIJ().LJJII()) {
            if (ORZ.LJLJJI(str, C47261Igj.LJJIJIIJI("41", "14")) && ORZ.LJLJJI(str2, C47261Igj.LJJIJIIJI("-1", CardStruct.IStatusCode.DEFAULT))) {
                return "45";
            }
            if (o.LJ(str, "19") && o.LJ(str2, "14")) {
                return "1445";
            }
            return "44";
        }
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIILL(WeakHandler weakHandler, String str) {
        FGR.LIZIZ().LIZ(weakHandler, new CallableC55907Lwt(str, 0), 1);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Intent LJJIJIIJI(Context ctx, String str) {
        Class<? extends Fragment> cls;
        o.LJIIIZ(ctx, "ctx");
        if (C46604IQu.LIZIZ() && o.LJ(str, "follow")) {
            cls = InboxNewFollowerTabFragment.class;
        } else if (L0U.LIZ()) {
            cls = NotificationFragment.class;
        } else {
            cls = MusNewNotificationFragment.class;
        }
        return C61210O0o.LIZ.LIZ(ctx, cls, null, null);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJI(Context context, GuideOutPushParam guideOutPushParam) {
        o.LJIIIZ(context, "context");
        if (C2307993z.LIZ()) {
            guideOutPushParam.panelType = "interaction";
            if (!C56827MRz.LIZJ(context) || C40322Fs6.LIZJ(context)) {
                return;
            }
            C56827MRz.LJ(context, new ViewOnClickListenerC57173McD(context, guideOutPushParam), null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Class<?> LIZLLL(Context context, GuideOutPushParam guideOutPushParam, MS3 ms3) {
        o.LJIIIZ(context, "context");
        return C56827MRz.LJFF(context, guideOutPushParam, ms3);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIJLIJ(Context context, User user, boolean z) {
        return C112714bb.LIZ(context, user, "inner_push", "", z, 16);
    }
}
