package Y;

import X.BO5;
import X.BTJ;
import X.BZI;
import X.C0A2;
import X.C0A6;
import X.C15380j0;
import X.C28787BRn;
import X.C30969CDl;
import X.C31256COm;
import X.C31453CWb;
import X.C32676Cs4;
import X.C32691CsJ;
import X.C32694CsM;
import X.CDR;
import X.CDS;
import X.CDX;
import X.CJX;
import X.EnumC31433CVh;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerDonationListDialog;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerDonationListFragmentSheet;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen.StarCommentExtendWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubsPrivilegeDetailAboutMeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDrS45S0100000_5 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 2:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 3:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            case 4:
                LJIILJJIL$4(this, i, recyclerView);
                return;
            case 5:
                LJIILJJIL$5(this, i, recyclerView);
                return;
            case 6:
                LJIILJJIL$6(this, i, recyclerView);
                return;
            case 7:
                LJIILJJIL$7(this, i, recyclerView);
                return;
            case 8:
                LJIILJJIL$8(this, i, recyclerView);
                return;
            case 9:
                LJIILJJIL$9(this, i, recyclerView);
                return;
            case 10:
                LJIILJJIL$10(this, i, recyclerView);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILJJIL$11(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
            case 2:
            case 6:
            case 7:
            case 9:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 3:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 4:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 5:
                LJIILL$3(this, recyclerView, i, i2);
                return;
            case 8:
                LJIILL$4(this, recyclerView, i, i2);
                return;
            case 10:
                LJIILL$5(this, recyclerView, i, i2);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILL$6(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS45S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[LOOP:0: B:23:0x0061->B:41:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[EDGE_INSN: B:42:0x00ae->B:43:0x00ae BREAK  A[LOOP:0: B:23:0x0061->B:41:0x009b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILJJIL$0(Y.IDrS45S0100000_5 r12, int r13, androidx.recyclerview.widget.RecyclerView r14) {
        /*
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            r0 = 1
            if (r13 != r0) goto Lbd
            java.lang.Object r0 = r12.l0
            X.Cs4 r0 = (X.C32676Cs4) r0
            r0.LJJIFFI()
        Lf:
            boolean r0 = X.C31160CKu.LIZLLL()
            r3 = 0
            if (r0 == 0) goto L48
            X.0A2 r5 = r14.getLayoutManager()
            boolean r0 = r5 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L47
            androidx.recyclerview.widget.GridLayoutManager r5 = (androidx.recyclerview.widget.GridLayoutManager) r5
            if (r5 == 0) goto L47
            java.lang.Object r0 = r12.l0
            X.Cs4 r0 = (X.C32676Cs4) r0
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.LifecycleCoroutineScope r4 = androidx.lifecycle.LifecycleKt.getCoroutineScope(r0)
            X.XIC r1 = X.C78613UtF.LIZ
            java.lang.Object r0 = r12.l0
            X.Cs4 r0 = (X.C32676Cs4) r0
            djb.IDaS22S0000000_5 r0 = r0.LLJL
            X.MBA r2 = r1.plus(r0)
            X.CsT r1 = new X.CsT
            java.lang.Object r0 = r12.l0
            X.Cs4 r0 = (X.C32676Cs4) r0
            r1.<init>(r0, r14, r5, r3)
            r0 = 2
            X.XKX.LIZLLL(r4, r2, r3, r1, r0)
        L47:
            return
        L48:
            X.0A2 r10 = r14.getLayoutManager()
            boolean r0 = r10 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto La8
            androidx.recyclerview.widget.LinearLayoutManager r10 = (androidx.recyclerview.widget.LinearLayoutManager) r10
            if (r10 == 0) goto La9
            int r9 = r10.LLILL()
            int r8 = r10.LLILLJJLI()
        L5c:
            r7 = -1
            if (r9 > r8) goto Lac
            r6 = -1
            r13 = -1
        L61:
            if (r10 == 0) goto La5
            android.view.View r3 = r10.LJJIJIL(r9)
            if (r3 == 0) goto La5
            int r2 = r3.getBottom()
            int r0 = r3.getTop()
        L71:
            int r2 = r2 - r0
            if (r3 == 0) goto La3
            int r0 = r3.getTop()
        L78:
            double r0 = (double) r0
            double r4 = (double) r2
            r11 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            double r11 = r11 * r4
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L99
            if (r3 == 0) goto L9f
            int r0 = r3.getBottom()
        L87:
            double r2 = (double) r0
            int r0 = r14.getHeight()
            double r0 = (double) r0
            r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r4 = r4 * r11
            double r4 = r4 + r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L99
            if (r6 != r7) goto L98
            r6 = r9
        L98:
            r13 = r9
        L99:
            if (r9 == r8) goto Lae
            int r9 = r9 + 1
            r3 = 0
            goto L61
        L9f:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L87
        La3:
            r0 = 0
            goto L78
        La5:
            r2 = 0
            r0 = 0
            goto L71
        La8:
            r10 = r3
        La9:
            r9 = 0
            r8 = 0
            goto L5c
        Lac:
            r13 = -1
            goto Laf
        Lae:
            r7 = r6
        Laf:
            X.CsK r2 = X.C32782Ctm.LIZ
            int r0 = r7 / 4
            int r1 = r0 + 1
            int r0 = r13 / 4
            int r0 = r0 + 1
            r2.LIZIZ(r1, r0)
            goto L47
        Lbd:
            if (r13 != 0) goto Lf
            java.lang.Object r0 = r12.l0
            X.Cs4 r0 = (X.C32676Cs4) r0
            r0.LJJJJZI()
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDrS45S0100000_5.LJIILJJIL$0(Y.IDrS45S0100000_5, int, androidx.recyclerview.widget.RecyclerView):void");
    }

    public static final void LJIILJJIL$1(IDrS45S0100000_5 iDrS45S0100000_5, int i, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.LLILLJJLI() >= linearLayoutManager.LJJJJZ() - 2) {
                ((LiveStickerDonationListDialog) iDrS45S0100000_5.l0).loadData();
            }
        }
    }

    public static final void LJIILJJIL$10(IDrS45S0100000_5 iDrS45S0100000_5, int i, RecyclerView recyclerView) {
        if (i == 0) {
            ((BO5) iDrS45S0100000_5.l0).LIZ.LLD.onNext(BTJ.LIZJ);
        } else {
            ((BO5) iDrS45S0100000_5.l0).LIZ.LLD.onNext(BTJ.LIZJ);
        }
    }

    public static final void LJIILJJIL$11(IDrS45S0100000_5 iDrS45S0100000_5, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                return;
            }
            ((C31453CWb) iDrS45S0100000_5.l0).LJIIIIZZ = false;
        } else {
            if (!(!recyclerView.canScrollVertically(1))) {
                return;
            }
            C31453CWb c31453CWb = (C31453CWb) iDrS45S0100000_5.l0;
            c31453CWb.LJII = EnumC31433CVh.NORMAL;
            c31453CWb.LIZJ(0);
        }
    }

    public static final void LJIILJJIL$2(IDrS45S0100000_5 iDrS45S0100000_5, int i, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.LLILLJJLI() >= linearLayoutManager.LJJJJZ() - 2) {
                ((LiveStickerDonationListFragmentSheet) iDrS45S0100000_5.l0).loadData();
            }
        }
    }

    public static final void LJIILJJIL$3(IDrS45S0100000_5 iDrS45S0100000_5, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0;
            subscriptionPrivilegeDetailFragment.getClass();
            BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_privilege_intro_slide");
            subscriptionPrivilegeDetailFragment.Al(LIZ);
            LIZ.LJJIIJZLJL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[LOOP:0: B:23:0x0065->B:41:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2 A[EDGE_INSN: B:42:0x00b2->B:43:0x00b2 BREAK  A[LOOP:0: B:23:0x0065->B:41:0x009f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILJJIL$4(Y.IDrS45S0100000_5 r12, int r13, androidx.recyclerview.widget.RecyclerView r14) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDrS45S0100000_5.LJIILJJIL$4(Y.IDrS45S0100000_5, int, androidx.recyclerview.widget.RecyclerView):void");
    }

    public static final void LJIILJJIL$5(IDrS45S0100000_5 iDrS45S0100000_5, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        CJX cjx = (CJX) iDrS45S0100000_5.l0;
        if (i == 1) {
            cjx.LIZ(true);
        } else {
            cjx.LIZ(false);
        }
    }

    public static final void LJIILJJIL$6(IDrS45S0100000_5 iDrS45S0100000_5, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            ((CDS) iDrS45S0100000_5.l0).LJLJI.xl(CDR.LIZ(2).LJLJJI);
        }
    }

    public static final void LJIILJJIL$7(IDrS45S0100000_5 iDrS45S0100000_5, int i, RecyclerView recyclerView) {
        View view;
        o.LJIIIZ(recyclerView, "recyclerView");
        C31256COm c31256COm = ((StarCommentExtendWidget) iDrS45S0100000_5.l0).LJLILLLLZI;
        if (c31256COm != null && !c31256COm.canScrollVertically(1)) {
            View view2 = ((StarCommentExtendWidget) iDrS45S0100000_5.l0).LJLJI;
            if (view2 == null) {
                return;
            }
            view2.setVisibility(8);
            return;
        }
        StarCommentExtendWidget starCommentExtendWidget = (StarCommentExtendWidget) iDrS45S0100000_5.l0;
        if (starCommentExtendWidget.LJLJJI || (view = starCommentExtendWidget.LJLJI) == null) {
            return;
        }
        view.setVisibility(0);
    }

    public static final void LJIILJJIL$8(IDrS45S0100000_5 iDrS45S0100000_5, int i, RecyclerView recyclerView) {
        ((LiveNewGiftPanelWidget) iDrS45S0100000_5.l0).LJZ = true;
    }

    public static final void LJIILJJIL$9(IDrS45S0100000_5 iDrS45S0100000_5, int i, RecyclerView recyclerView) {
        if (i == 0) {
            return;
        }
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) iDrS45S0100000_5.l0;
        liveNewGiftPanelWidget.LJZI(liveNewGiftPanelWidget.LJLJJI);
    }

    public static final void LJIILL$0(IDrS45S0100000_5 iDrS45S0100000_5, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        GiftPanelLeafViewModel LJJIJIL = ((C32676Cs4) iDrS45S0100000_5.l0).LJJIJIL();
        boolean z2 = false;
        if (LJJIJIL != null && !LJJIJIL.LJLLL && Math.abs(i2) > 0) {
            C32694CsM.LJJIJLIJ = SystemClock.uptimeMillis();
        }
        GiftPanelLeafViewModel LJJIJIL2 = ((C32676Cs4) iDrS45S0100000_5.l0).LJJIJIL();
        if (LJJIJIL2 != null) {
            if (Math.abs(i2) > 0) {
                z = true;
            } else {
                z = false;
            }
            LJJIJIL2.LJLLL = z;
        }
        C32676Cs4 c32676Cs4 = (C32676Cs4) iDrS45S0100000_5.l0;
        if (i2 > 0) {
            z2 = true;
        }
        c32676Cs4.LLJILJILJ = z2;
        c32676Cs4.LJJJLL();
    }

    public static final void LJIILL$1(IDrS45S0100000_5 iDrS45S0100000_5, RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        C30969CDl c30969CDl;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (LiveSubsPrivilegeDetailAboutMeSetting.INSTANCE.enableNavigation()) {
            C30969CDl c30969CDl2 = ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0).LLD;
            if (c30969CDl2 != null) {
                i3 = c30969CDl2.LLILLIZIL();
            } else {
                i3 = -1;
            }
            if (i3 < ((ArrayList) ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0).LJLLJ).size() - 2 && (c30969CDl = ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0).LLD) != null) {
                float f = c30969CDl.LJLLLLLL / 2.0f;
                int LJJJI = c30969CDl.LJJJI();
                int i5 = 0;
                while (true) {
                    if (i5 >= LJJJI) {
                        break;
                    }
                    View LJJJ = c30969CDl.LJJJ(i5);
                    if (LJJJ != null) {
                        int top = LJJJ.getTop() - C0A2.LJJLI(LJJJ);
                        int LJJIZ = C0A2.LJJIZ(LJJJ) + LJJJ.getBottom();
                        if (top <= f && f <= LJJIZ) {
                            i3 = C0A2.LJJJLL(LJJJ);
                            break;
                        }
                    }
                    i5++;
                }
            }
            if (i3 >= 0) {
                SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0;
                if (subscriptionPrivilegeDetailFragment.LJLLILLLL != i3) {
                    if (i3 == ((ArrayList) subscriptionPrivilegeDetailFragment.LJLLJ).size() - 1) {
                        i4 = Math.max((i3 - ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0).LJLZ) - 1, 0);
                    } else {
                        int i6 = ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0).LJLZ;
                        if (i3 >= i6) {
                            i4 = Math.max(i3 - i6, 0);
                        } else {
                            i4 = 0;
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0)._$_findCachedViewById(R.id.el4);
                    if (viewGroup != null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i7 = 0; i7 < childCount; i7++) {
                            View childAt = viewGroup.getChildAt(i7);
                            if (childAt != null && (childAt instanceof CDX)) {
                                CDX cdx = (CDX) childAt;
                                if (i4 == i7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                cdx.setOnChosen(z);
                            }
                        }
                    }
                }
                ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0).LJLLILLLL = i3;
            }
        }
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset <= 0 || !((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0)._$_findCachedViewById(R.id.ist).canScrollVertically(-1)) {
            ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0)._$_findCachedViewById(R.id.dj2).setVisibility(8);
        } else {
            float min = Math.min((computeVerticalScrollOffset * 1.0f) / Math.max(C15380j0.LIZ(66.0f), 1), 1.0f);
            ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0)._$_findCachedViewById(R.id.dj2).setVisibility(0);
            ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0)._$_findCachedViewById(R.id.dj2).setAlpha(min);
        }
        if (recyclerView.getScrollState() == 0) {
            ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0)._$_findCachedViewById(R.id.ist).postDelayed(new ARunnableS41S0100000_5((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0, 154), 1000L);
        } else {
            ((SubscriptionPrivilegeDetailFragment) iDrS45S0100000_5.l0).vl();
        }
    }

    public static final void LJIILL$2(IDrS45S0100000_5 iDrS45S0100000_5, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        GiftPanelLeafViewModel giftPanelLeafViewModel = ((C32691CsJ) iDrS45S0100000_5.l0).LJLJJI;
        if ((giftPanelLeafViewModel == null || Boolean.valueOf(giftPanelLeafViewModel.LJLLL) == null) && Math.abs(i2) > 0) {
            C32694CsM.LJJIJLIJ = SystemClock.uptimeMillis();
        }
        GiftPanelLeafViewModel giftPanelLeafViewModel2 = ((C32691CsJ) iDrS45S0100000_5.l0).LJLJJI;
        boolean z2 = false;
        if (giftPanelLeafViewModel2 != null) {
            if (Math.abs(i2) > 0) {
                z = true;
            } else {
                z = false;
            }
            giftPanelLeafViewModel2.LJLLL = z;
        }
        C32691CsJ c32691CsJ = (C32691CsJ) iDrS45S0100000_5.l0;
        GiftPanelLeafViewModel giftPanelLeafViewModel3 = c32691CsJ.LJLJJI;
        if (giftPanelLeafViewModel3 != null) {
            if (i2 > 0) {
                z2 = true;
            }
            giftPanelLeafViewModel3.LJLLJ = z2;
        }
        c32691CsJ.LJLILLLLZI.LJJJLL();
    }

    public static final void LJIILL$3(IDrS45S0100000_5 iDrS45S0100000_5, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        CJX cjx = (CJX) iDrS45S0100000_5.l0;
        if (cjx.LIZIZ) {
            cjx.LIZ += i;
        }
    }

    public static final void LJIILL$4(IDrS45S0100000_5 iDrS45S0100000_5, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        if (!((LiveNewGiftPanelWidget) iDrS45S0100000_5.l0).LLIIJI && Math.abs(i2) > 0) {
            C32694CsM.LJJIJLIJ = SystemClock.uptimeMillis();
        }
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) iDrS45S0100000_5.l0;
        if (Math.abs(i2) > 0) {
            z = true;
        } else {
            z = false;
        }
        liveNewGiftPanelWidget.LLIIJI = z;
    }

    public static final void LJIILL$5(IDrS45S0100000_5 iDrS45S0100000_5, RecyclerView recyclerView, int i, int i2) {
        if (i > 0 || i2 > 0) {
            ((BO5) iDrS45S0100000_5.l0).LIZ.LLD.onNext(BTJ.LIZJ);
        }
    }

    public static final void LJIILL$6(IDrS45S0100000_5 iDrS45S0100000_5, RecyclerView recyclerView, int i, int i2) {
        int LLILLJJLI;
        C31453CWb c31453CWb;
        int i3;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (recyclerView.canScrollVertically(1)) {
            C31453CWb c31453CWb2 = (C31453CWb) iDrS45S0100000_5.l0;
            if (!c31453CWb2.LJIIIIZZ && (LLILLJJLI = c31453CWb2.LJIIIZ.LLILLJJLI()) > (i3 = (c31453CWb = (C31453CWb) iDrS45S0100000_5.l0).LJI)) {
                c31453CWb.LIZJ(c31453CWb.LJFF - (LLILLJJLI - i3));
                ((C31453CWb) iDrS45S0100000_5.l0).LJI = LLILLJJLI;
                return;
            }
            return;
        }
        C31453CWb.LIZLLL((C31453CWb) iDrS45S0100000_5.l0, EnumC31433CVh.NORMAL, 2);
    }
}
