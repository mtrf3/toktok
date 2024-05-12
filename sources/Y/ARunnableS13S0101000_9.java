package Y;

import X.AYY;
import X.AbstractC32698CsQ;
import X.AbstractViewOnClickListenerC55470Lpq;
import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.C06460Ne;
import X.C0A2;
import X.C0AC;
import X.C15380j0;
import X.C16880lQ;
import X.C221018lt;
import X.C29162BcU;
import X.C2MA;
import X.C30896CAq;
import X.C32129CjF;
import X.C32151Nz;
import X.C32694CsM;
import X.C32792Ctw;
import X.C36922EeM;
import X.C38449F7d;
import X.C38965FQz;
import X.C47135Ieh;
import X.C51421KGb;
import X.C55366LoA;
import X.C55369LoD;
import X.C57381MfZ;
import X.C57596Mj2;
import X.C57626MjW;
import X.C57780Mm0;
import X.C57939MoZ;
import X.C71162qm;
import X.C7MY;
import X.C82104WKe;
import X.DP0;
import X.EF7;
import X.EnumC38440F6u;
import X.FFI;
import X.LNH;
import X.M4D;
import X.MS5;
import X.O6R;
import X.SYL;
import X.X1D;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailFragment;
import com.ss.android.ugc.aweme.notification.creator.assem.CreatorNoticeTabsAssem;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ARunnableS13S0101000_9 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        CreatorNoticeTabsAssem creatorNoticeTabsAssem = (CreatorNoticeTabsAssem) this.l0;
        int i = this.i1;
        if (i >= 0 && i < ((SYL) creatorNoticeTabsAssem.LJLJJI.getValue()).getState().LJIIIIZZ()) {
            LinearLayoutManager linearLayoutManager = creatorNoticeTabsAssem.LJLJI;
            if (linearLayoutManager != null) {
                if (linearLayoutManager.LJJJ(i) == null) {
                    LinearLayoutManager linearLayoutManager2 = creatorNoticeTabsAssem.LJLJI;
                    if (linearLayoutManager2 != null) {
                        linearLayoutManager2.LJZL(i);
                        return;
                    } else {
                        o.LJIJI("tabLayoutManager");
                        throw null;
                    }
                }
                LinearLayoutManager linearLayoutManager3 = creatorNoticeTabsAssem.LJLJI;
                if (linearLayoutManager3 != null) {
                    linearLayoutManager3.LLIIII((RecyclerView) creatorNoticeTabsAssem.LJLJJI.getValue(), new C0AC(), i);
                    return;
                } else {
                    o.LJIJI("tabLayoutManager");
                    throw null;
                }
            }
            o.LJIJI("tabLayoutManager");
            throw null;
        }
        creatorNoticeTabsAssem.getClass();
    }

    public final void LIZ$1() {
        C57780Mm0 c57780Mm0 = (C57780Mm0) this.l0;
        C57939MoZ c57939MoZ = c57780Mm0.LJLJJI;
        if (c57939MoZ != null) {
            int i = c57939MoZ.LIZ;
            int itemCount = c57780Mm0.getItemCount();
            if (itemCount - this.i1 <= i + 1) {
                AYY ayy = AYY.LIZ;
                StringBuilder LJ = C7MY.LJ("trigger loadMore, total: ", itemCount, ", position: ");
                LJ.append(this.i1);
                LJ.append(", preloadCnt: ");
                LJ.append(i);
                String msg = X1D.LIZIZ(LJ);
                ayy.getClass();
                o.LJIIIZ(msg, "msg");
                ((C57780Mm0) this.l0).o1();
                return;
            }
            return;
        }
        o.LJIJI("listConfig");
        throw null;
    }

    public final void LIZ$2() {
        int i;
        int width = ((C57596Mj2) this.l0).LIZ(R.id.akm).getWidth();
        int height = ((C57596Mj2) this.l0).LIZ(R.id.akm).getHeight();
        int LJJIIZ = ((width - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) * 2)) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)) * 2)) / 3;
        int i2 = (LJJIIZ * 4) / 3;
        StringBuilder LIZJ = C06460Ne.LIZJ("[initCardView]\n bigCardContentWidth = ", width, "\n bigCardContentHeight = ", height, "\n coverWidth = ");
        LIZJ.append(LJJIIZ);
        LIZJ.append("\n coverHeight = ");
        LIZJ.append(i2);
        C221018lt.LIZ("TTRecUserBigCardView", X1D.LIZIZ(LIZJ));
        C57381MfZ c57381MfZ = (C57381MfZ) ((C57596Mj2) this.l0).LIZ(R.id.akn);
        C57381MfZ big_card_cover_group = (C57381MfZ) ((C57596Mj2) this.l0).LIZ(R.id.akn);
        o.LJIIIIZZ(big_card_cover_group, "big_card_cover_group");
        c57381MfZ.LJI(LJJIIZ, i2, big_card_cover_group);
        ViewGroup.LayoutParams layoutParams = ((C57596Mj2) this.l0).LIZ(R.id.akm).getLayoutParams();
        if (C57626MjW.LJ()) {
            i = C7MY.LIZIZ(10);
        } else {
            i = 0;
        }
        layoutParams.height = height + i2 + i;
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        C57596Mj2 c57596Mj2 = (C57596Mj2) this.l0;
        int i3 = this.i1;
        anonymousClass064.LJII((ConstraintLayout) c57596Mj2.LIZ(R.id.j76));
        anonymousClass064.LJIILL(R.id.ako).LIZLLL.LJI = (C47135Ieh.LIZ(67, ((c57596Mj2.LIZ(R.id.j76).getHeight() - c57596Mj2.LIZ(R.id.akm).getMeasuredHeight()) - i3) - c57596Mj2.LIZ(R.id.akk).getHeight()) / 2) / c57596Mj2.LIZ(R.id.j76).getHeight();
        anonymousClass064.LJIILL(R.id.ako).LIZLLL.LJFF = -1;
        anonymousClass064.LJIILL(R.id.ako).LIZLLL.LJ = -1;
        anonymousClass064.LIZIZ((ConstraintLayout) c57596Mj2.LIZ(R.id.j76));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r3 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r5.LJFF != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r1 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r2 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r4.getScrollState() != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        r5.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        if (r2 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        if (r1 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r4.getScrollState() != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        if (r1 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        if (r4.getScrollState() != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0049, code lost:
    
        r5.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r7.LJJJJZI(r6 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0020, code lost:
    
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$0(Y.ARunnableS13S0101000_9 r8) {
        /*
            java.lang.Object r7 = r8.l0
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r7 = (com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel) r7
            int r6 = r8.i1
            X.LnJ r5 = r7.LLJILLL
            if (r5 != 0) goto Lb
        La:
            return
        Lb:
            X.VnM r4 = r7.mViewPager
            if (r4 != 0) goto L10
            goto La
        L10:
            boolean r3 = r5.LJ
            r2 = 0
            if (r3 == 0) goto La
            boolean r0 = r5.LJI
            if (r0 == 0) goto L2f
            r1 = 1
            if (r3 == 0) goto L20
        L1c:
            boolean r0 = r5.LJFF
            if (r0 == 0) goto L21
        L20:
            r2 = 1
        L21:
            if (r1 == 0) goto L31
            if (r2 != 0) goto La
            int r0 = r4.getScrollState()
            if (r0 != 0) goto La
            r5.LIZ()
            goto La
        L2f:
            r1 = 0
            goto L1c
        L31:
            if (r2 == 0) goto L3f
            if (r1 != 0) goto La
            int r0 = r4.getScrollState()
            if (r0 != 0) goto La
            r5.LIZIZ()
            goto La
        L3f:
            if (r1 != 0) goto La
            if (r2 != 0) goto La
            int r0 = r4.getScrollState()
            if (r0 != 0) goto L4c
            r5.LIZIZ()
        L4c:
            int r0 = r6 + 1
            r7.LJJJJZI(r0)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS13S0101000_9.run$0(Y.ARunnableS13S0101000_9):void");
    }

    public static final void run$1(ARunnableS13S0101000_9 aRunnableS13S0101000_9) {
        switch (aRunnableS13S0101000_9.i1) {
            case 0:
                BaseListFragmentPanel baseListFragmentPanel = (BaseListFragmentPanel) aRunnableS13S0101000_9.l0;
                if (!baseListFragmentPanel.isViewValid()) {
                    return;
                }
                C2MA curViewHolder = baseListFragmentPanel.getCurViewHolder();
                if (curViewHolder != null) {
                    curViewHolder.LIZLLL(curViewHolder.getAweme());
                    LNH.LIZLLL((ActivityC45651qj) baseListFragmentPanel.activity, curViewHolder.getAweme());
                    if (curViewHolder.getAwemeType() == 2) {
                        return;
                    }
                }
                baseListFragmentPanel.hideIvPlay();
                baseListFragmentPanel.tryPlay();
                if (!baseListFragmentPanel.isUseSurfaceView() || curViewHolder == null) {
                    return;
                }
                curViewHolder.B7();
                return;
            case 1:
                EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew = (EcBaseDiscoverAndSearchFragmentNew) aRunnableS13S0101000_9.l0;
                if (ecBaseDiscoverAndSearchFragmentNew.isViewValid()) {
                    ecBaseDiscoverAndSearchFragmentNew.LJLJI.requestFocus();
                    ecBaseDiscoverAndSearchFragmentNew.LJLJI.setCursorVisible(true);
                    KeyboardUtils.LIZLLL(ecBaseDiscoverAndSearchFragmentNew.LJLJI);
                    C51421KGb.LIZ();
                    return;
                }
                return;
            default:
                Object obj = aRunnableS13S0101000_9.l0;
                obj.getClass();
                C38449F7d.LJI();
                C36922EeM.LIZLLL(4, "InterestSelectExperiment", "ab value refresh success,start to notify");
                ARunnableS15S0101000_11 aRunnableS15S0101000_11 = new ARunnableS15S0101000_11(5, obj, 4);
                FFI.LJIIIIZZ = true;
                Handler handler = new Handler(C16880lQ.LLJJJJ());
                if (((Boolean) DP0.LIZIZ.getValue()).booleanValue()) {
                    handler.postAtFrontOfQueue(aRunnableS15S0101000_11);
                } else {
                    handler.post(aRunnableS15S0101000_11);
                }
                SettingsManager.LIZLLL().getClass();
                C38965FQz.LIZ(SettingsManager.LIZ("enable_safe_view_checker", false));
                SettingsRequestServiceImpl.LJIILLIIL().LIZ(EF7.LIZIZ());
                return;
        }
    }

    public static final void run$2(ARunnableS13S0101000_9 aRunnableS13S0101000_9) {
        boolean LIZ;
        try {
            int i = aRunnableS13S0101000_9.i1;
            HashMap commonParams = (HashMap) ((MusNotificationDetailFragment) aRunnableS13S0101000_9.l0).LJLLLL.getValue();
            long j = ((MusNotificationDetailFragment) aRunnableS13S0101000_9.l0).vl().startClickTime;
            o.LJIIIZ(commonParams, "commonParams");
            MS5.LIZ(new C71162qm(j, i, commonParams));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS13S0101000_9 aRunnableS13S0101000_9) {
        boolean LIZ;
        try {
            int i = aRunnableS13S0101000_9.i1;
            MusNotificationDetailFragment musNotificationDetailFragment = (MusNotificationDetailFragment) aRunnableS13S0101000_9.l0;
            boolean z = musNotificationDetailFragment.LJLLILLLL;
            String quitType = musNotificationDetailFragment.LJLLL;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MusNotificationDetailFragment musNotificationDetailFragment2 = (MusNotificationDetailFragment) aRunnableS13S0101000_9.l0;
            long j = elapsedRealtime - musNotificationDetailFragment2.LJLLJ;
            HashMap commonParams = (HashMap) musNotificationDetailFragment2.LJLLLL.getValue();
            o.LJIIIZ(quitType, "quitType");
            o.LJIIIZ(commonParams, "commonParams");
            MS5.LIZ(new M4D(i, j, quitType, commonParams, z));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS13S0101000_9 aRunnableS13S0101000_9) {
        boolean LIZ;
        try {
            aRunnableS13S0101000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS13S0101000_9 aRunnableS13S0101000_9) {
        boolean LIZ;
        try {
            C82104WKe.LLJLILLLLZIIL(aRunnableS13S0101000_9.i1, (C82104WKe) aRunnableS13S0101000_9.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS13S0101000_9 aRunnableS13S0101000_9) {
        C55366LoA c55366LoA;
        String str;
        String str2 = "";
        switch (aRunnableS13S0101000_9.i1) {
            case 0:
                C29162BcU c29162BcU = (C29162BcU) aRunnableS13S0101000_9.l0;
                if (c29162BcU.LIZ) {
                    return;
                }
                LiveAppBundleUtils.ensurePluginAvailable(EnumC38440F6u.CMAF);
                LiveAppBundleUtils.ensurePluginAvailable(EnumC38440F6u.QUIC);
                LiveAppBundleUtils.ensurePluginAvailable(EnumC38440F6u.RTS);
                c29162BcU.LIZ = true;
                return;
            case 1:
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) aRunnableS13S0101000_9.l0;
                int i = 0;
                if (liveNewGiftPanelWidget.LLIIIZ.compareAndSet(true, false)) {
                    Hashtag hashtag = (Hashtag) liveNewGiftPanelWidget.dataChannel.kv0(HashtagChangedChannel.class);
                    if (liveNewGiftPanelWidget.dataChannel == null || hashtag == null) {
                        str = "";
                    } else {
                        str = hashtag.title;
                        Long l = hashtag.id;
                        if (l != null) {
                            str2 = l.toString();
                        }
                    }
                    LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList = liveNewGiftPanelWidget.LJLLJ;
                    if (linkedList != null) {
                        i = linkedList.size();
                    }
                    C32792Ctw.LIZJ(liveNewGiftPanelWidget.LJLLL, C15380j0.LJIILLIIL(), str, str2, null, liveNewGiftPanelWidget.LLF, i);
                    C32694CsM.LJJ = SystemClock.uptimeMillis() - C32129CjF.LIZ.LJIIJ;
                    C0A2 layoutManager = liveNewGiftPanelWidget.LJLIL.getLayoutManager();
                    if (layoutManager == null) {
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int LLILLJJLI = (linearLayoutManager.LLILLJJLI() - linearLayoutManager.LLILL()) + 1;
                    if (Math.max(C32694CsM.LJJIIJ, C32694CsM.LJJII) >= LLILLJJLI) {
                        C32694CsM.LJJIJL = SystemClock.uptimeMillis();
                    }
                    C32694CsM.LJJI = LLILLJJLI;
                    liveNewGiftPanelWidget.LJLIL.postDelayed(new ARunnableS9S0101000_5(liveNewGiftPanelWidget, LLILLJJLI, 18), 100L);
                    return;
                }
                return;
            case 2:
                DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) aRunnableS13S0101000_9.l0;
                VideoSeekBarMaskView videoSeekBarMaskView = detailFragmentPanel.LLIFFJFJJ;
                if (videoSeekBarMaskView != null && (c55366LoA = detailFragmentPanel.LLIIIL) != null) {
                    videoSeekBarMaskView.setSeekBarView(c55366LoA.getVideoSeekBar());
                    detailFragmentPanel.LLIFFJFJJ.setSeekBarController(detailFragmentPanel.LLIIIL.getVideoSeekBarController());
                    try {
                        Aweme LJJLJ = detailFragmentPanel.LJJLJ();
                        if (LJJLJ != null) {
                            String eventType = detailFragmentPanel.param.getEventType();
                            if (eventType == null) {
                                eventType = "";
                            }
                            int pageType = detailFragmentPanel.param.getPageType();
                            String searchId = detailFragmentPanel.param.getSearchId();
                            if (searchId != null) {
                                str2 = searchId;
                            }
                            C55366LoA c55366LoA2 = detailFragmentPanel.LLIIIL;
                            c55366LoA2.getClass();
                            C55369LoD c55369LoD = c55366LoA2.LJLIL;
                            if (c55369LoD != null) {
                                c55369LoD.LIZ.LJ(LJJLJ, eventType, str2, pageType);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 3:
                FullFeedFragmentPanel.LJJJJIZL((FullFeedFragmentPanel) aRunnableS13S0101000_9.l0);
                return;
            case 4:
                ((ProfilePageFragment) aRunnableS13S0101000_9.l0).nm();
                return;
            case 5:
                ((AbstractViewOnClickListenerC55470Lpq) aRunnableS13S0101000_9.l0).LJLILLLLZI = true;
                return;
            default:
                LiveCoreImpl.lambda$semisugar$unregisterScreenAudioPlayBack$0((LiveCoreImpl) aRunnableS13S0101000_9.l0);
                return;
        }
    }

    public static final void run$7(ARunnableS13S0101000_9 aRunnableS13S0101000_9) {
        boolean LIZ;
        try {
            aRunnableS13S0101000_9.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS13S0101000_9 aRunnableS13S0101000_9) {
        boolean LIZ;
        try {
            aRunnableS13S0101000_9.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS13S0101000_9(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
