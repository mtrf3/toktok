package com.ss.android.ugc.aweme.feed.api;

import X.ActivityC45651qj;
import X.C188727au;
import X.C1DH;
import X.C36922EeM;
import X.C77317UWb;
import X.FMX;
import X.FVH;
import X.FW5;
import X.InterfaceC64592gB;
import X.LAL;
import X.LAO;
import X.LAP;
import X.LCP;
import X.RBY;
import X.T16;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.experiment.InterestGroupSetting;
import com.ss.android.ugc.aweme.feed.interest.InterestApi;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class FeedModuleServiceCommonImpl implements IFeedModuleService {
    public abstract /* synthetic */ void attachActivityToGlobalAcViewModel(ActivityC45651qj activityC45651qj);

    public abstract /* synthetic */ LCP createData(Context context);

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public boolean fullscreenShowLive() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public abstract /* synthetic */ void initLegoInflate();

    public abstract /* synthetic */ void initPosterSRProcessorOnHotStart();

    public abstract /* synthetic */ void posterSRProcessorOnDestroy();

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public abstract /* synthetic */ void refreshComment(Fragment fragment);

    public void requestInterestSelect() {
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public boolean canResumePlay() {
        String str = LAL.LIZ;
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public void maybeRequestAfterFirstFrame() {
        String str;
        if (!((Boolean) LAL.LIZLLL.getValue()).booleanValue()) {
            return;
        }
        boolean z = false;
        try {
            InterestGroupSetting interestGroupSetting = LAL.LIZJ;
            if (interestGroupSetting == null) {
                return;
            }
            if (interestGroupSetting.group == 0 || LAL.LJII) {
                return;
            }
            LAL.LJII = true;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "homepage_hot");
            RBY LJFF = AccountService.LJIJ().LJFF();
            if (LJFF != null) {
                str = LJFF.getCurUserId();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("user_id", str);
            FMX.LJIIL("ask_interest_lable", c188727au.LIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start to request,current expr is group1:");
            try {
                InterestGroupSetting interestGroupSetting2 = LAL.LIZJ;
                if (interestGroupSetting2 != null) {
                    if (interestGroupSetting2.group == 1) {
                        z = true;
                    }
                }
            } catch (Throwable unused) {
            }
            LIZ.append(z);
            C36922EeM.LIZLLL(4, "InterestSelectExperiment", X1D.LIZIZ(LIZ));
            ((InterestApi) LAL.LJ.getValue()).getInterestList().LJJL(T16.LIZ()).LJJJLIIL(LAP.LJLIL, new InterfaceC64592gB() { // from class: X.2O6
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    C36922EeM.LJFF((Throwable) obj);
                }
            });
        } catch (Throwable unused2) {
        }
    }

    public String getFeedRequstParam() {
        return LAL.LIZ;
    }

    public void setFeedRequstParam(String str) {
        if (o.LJ(str, LAL.LIZ)) {
            return;
        }
        LAL.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0016  */
    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer getInsertIndex(int r4, com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L5
        L3:
            r0 = 0
        L4:
            return r0
        L5:
            r2 = 0
            com.ss.android.ugc.aweme.experiment.InterestGroupSetting r0 = X.LAL.LIZJ     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Ld
            int r1 = r0.group     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            r0 = 1
            if (r1 != r0) goto L16
            r0 = 1
        L12:
            r1 = 2
            if (r0 == 0) goto L2c
            goto L18
        L16:
            r0 = 0
            goto L12
        L18:
            com.ss.android.ugc.aweme.experiment.InterestGroupSetting r0 = X.LAL.LIZJ     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1f
            int r0 = r0.startIndex     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r0 = 4
        L20:
            int r1 = r0 + (-1)
            int r0 = r4 + 2
            if (r0 < r1) goto L27
            r1 = r0
        L27:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L4
        L2c:
            com.ss.android.ugc.aweme.experiment.InterestGroupSetting r0 = X.LAL.LIZJ     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L33
            int r0 = r0.group     // Catch: java.lang.Throwable -> L33
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 != r1) goto L37
            r2 = 1
        L37:
            if (r2 == 0) goto L3
            int r0 = r4 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl.getInsertIndex(int, com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.Integer");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void maybeMonitorTimeSpend(com.ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.Long r10) {
        /*
            r8 = this;
            long r2 = r10.longValue()
            boolean r0 = X.LAL.LJI
            if (r0 != 0) goto L9
        L8:
            return
        L9:
            X.Ol8 r0 = X.LAL.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8
            r7 = 0
            com.ss.android.ugc.aweme.experiment.InterestGroupSetting r0 = X.LAL.LIZJ     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L8
            int r1 = r0.group     // Catch: java.lang.Throwable -> L8
            r0 = 2
            if (r1 != r0) goto L8
            if (r9 == 0) goto L8
            boolean r0 = r9.isAd()
            if (r0 == 0) goto L2a
            goto L8
        L2a:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r2
            r4 = 3
            com.ss.android.ugc.aweme.experiment.InterestGroupSetting r0 = X.LAL.LIZJ     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L37
            int r0 = r0.skip_s     // Catch: java.lang.Throwable -> L37
            goto L38
        L37:
            r0 = 3
        L38:
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L65
            int r0 = X.LAL.LJFF
            int r1 = r0 + 1
            X.LAL.LJFF = r1
            com.ss.android.ugc.aweme.experiment.InterestGroupSetting r0 = X.LAL.LIZJ     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4c
            int r4 = r0.skip_n     // Catch: java.lang.Throwable -> L4c
        L4c:
            if (r1 < r4) goto L8
            android.app.Activity r1 = X.C84763XOl.LJIIIIZZ()
            boolean r0 = r1 instanceof X.InterfaceC55058LjC
            if (r0 == 0) goto L5c
            X.LAL.LIZ(r1)
            X.LAL.LJI = r7
            goto L8
        L5c:
            r2 = 4
            java.lang.String r1 = "InterestSelectExperiment"
            java.lang.String r0 = "not insert cause not IMainActivity"
            X.C36922EeM.LIZLLL(r2, r1, r0)
            goto L8
        L65:
            X.LAL.LJFF = r7
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl.maybeMonitorTimeSpend(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Long):void");
    }

    public void mobStartRequest(Fragment fragment, String str) {
        new FVH(fragment).LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public LAO newTopNoticeFeedManager(Activity activity, View view) {
        if (C1DH.LJIL()) {
            return new C77317UWb(activity, view);
        }
        return null;
    }

    public void commitFeedRequest(int i, WeakHandler weakHandler, Callable callable, int i2, boolean z) {
        FW5.LIZLLL(i, -1, weakHandler, callable, i2, z, null);
    }
}
