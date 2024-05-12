package Y;

import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C23010vJ;
import X.C29306Beo;
import X.C32676Cs4;
import X.C32694CsM;
import X.C32792Ctw;
import X.C47121t6;
import X.KL2;
import X.OSZ;
import X.RunnableC31065CHd;
import X.X1D;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.broadcast.preview.widget.livevoice.PreviewLiveVoiceMicListWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionGiftSendDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.TryModeUserInfoWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDLListenerS193S0100000_5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            case 6:
                onGlobalLayout$6(this);
                return;
            case 7:
                onGlobalLayout$7(this);
                return;
            case 8:
                onGlobalLayout$8(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS193S0100000_5 iDLListenerS193S0100000_5) {
        ViewTreeObserver viewTreeObserver;
        RunnableC31065CHd runnableC31065CHd = ((C32676Cs4) iDLListenerS193S0100000_5.l0).LJLZ;
        if (runnableC31065CHd != null && (viewTreeObserver = runnableC31065CHd.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS193S0100000_5);
        }
        C32676Cs4 c32676Cs4 = (C32676Cs4) iDLListenerS193S0100000_5.l0;
        if (!c32676Cs4.LLJJ && c32676Cs4.LLJJIII) {
            c32676Cs4.LLJJIII = false;
            long uptimeMillis = SystemClock.uptimeMillis() - ((C32676Cs4) iDLListenerS193S0100000_5.l0).LLJJIJI;
            C32694CsM.LJJIJIL = SystemClock.uptimeMillis();
            C32694CsM.LJIL = uptimeMillis;
            C32792Ctw.LIZIZ(uptimeMillis, ((C32676Cs4) iDLListenerS193S0100000_5.l0).LLJJIJIIJIL);
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS193S0100000_5 iDLListenerS193S0100000_5) {
        Object obj;
        View findViewById;
        C0NB.LIZIZ("PreviewLiveVoiceMicListWidget", "onGlobalLayout");
        PreviewLiveVoiceMicListWidget previewLiveVoiceMicListWidget = (PreviewLiveVoiceMicListWidget) iDLListenerS193S0100000_5.l0;
        View view = previewLiveVoiceMicListWidget.getView();
        Object obj2 = null;
        if (view != null) {
            obj = view.getParent();
        } else {
            obj = null;
        }
        View view2 = (View) obj;
        int i = 0;
        if (view2 != null) {
            View view3 = previewLiveVoiceMicListWidget.getView();
            if (view3 != null) {
                obj2 = view3.getParent();
            }
            View view4 = (View) obj2;
            if (view4 != null && (findViewById = view4.findViewById(R.id.na_)) != null) {
                int height = (int) (findViewById.getHeight() / 1.2f);
                int max = Math.max(findViewById.getWidth(), height);
                i = Math.min(max, view2.getWidth());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C16880lQ.LJLLJ(PreviewLiveVoiceMicListWidget.class));
                LIZ.append("_getOriginalWidth originalWidth:");
                LIZ.append(height);
                LIZ.append(" minValue:");
                LIZ.append(i);
                LIZ.append(" maxValue:");
                LIZ.append(max);
                C0NB.LIZIZ("voice_chat", X1D.LIZIZ(LIZ));
            }
        }
        OSZ<Integer, Integer> osz = new OSZ<>(Integer.valueOf(i), Integer.valueOf((int) (i / 1.2f)));
        if (o.LJ(osz, ((PreviewLiveVoiceMicListWidget) iDLListenerS193S0100000_5.l0).LJLJLJ)) {
            return;
        }
        PreviewLiveVoiceMicListWidget previewLiveVoiceMicListWidget2 = (PreviewLiveVoiceMicListWidget) iDLListenerS193S0100000_5.l0;
        previewLiveVoiceMicListWidget2.LJLJLJ = osz;
        previewLiveVoiceMicListWidget2.LLF(previewLiveVoiceMicListWidget2.LJLJL);
    }

    public static final void onGlobalLayout$2(IDLListenerS193S0100000_5 iDLListenerS193S0100000_5) {
        ViewTreeObserver viewTreeObserver;
        View _$_findCachedViewById = ((SubscriptionPrivilegeDetailFragment) iDLListenerS193S0100000_5.l0)._$_findCachedViewById(R.id.j83);
        if (_$_findCachedViewById != null && (viewTreeObserver = _$_findCachedViewById.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS193S0100000_5);
        }
        float measuredHeight = ((SubscriptionPrivilegeDetailFragment) iDLListenerS193S0100000_5.l0)._$_findCachedViewById(R.id.j83).getMeasuredHeight();
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) iDLListenerS193S0100000_5.l0;
        float f = (subscriptionPrivilegeDetailFragment.LJLJI - subscriptionPrivilegeDetailFragment.LJLJJI) * measuredHeight;
        View _$_findCachedViewById2 = subscriptionPrivilegeDetailFragment._$_findCachedViewById(R.id.fml);
        if (_$_findCachedViewById2 != null) {
            C29306Beo.LJJJJJL((int) f, _$_findCachedViewById2);
        }
    }

    public static final void onGlobalLayout$3(IDLListenerS193S0100000_5 iDLListenerS193S0100000_5) {
        if (((LiveRoomUserInfoWidget) iDLListenerS193S0100000_5.l0).getView() == null) {
            return;
        }
        ((LiveRoomUserInfoWidget) iDLListenerS193S0100000_5.l0).getView().getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS193S0100000_5);
        ((LiveRoomUserInfoWidget) iDLListenerS193S0100000_5.l0).getView().getLocationOnScreen(new int[2]);
        ((LiveRoomUserInfoWidget) iDLListenerS193S0100000_5.l0).getView().getHeight();
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        KL2.LJIIL(LIZLLL);
        KL2.LIZJ(LIZLLL, 52.0f);
    }

    public static final void onGlobalLayout$4(IDLListenerS193S0100000_5 iDLListenerS193S0100000_5) {
        View view = ((TryModeUserInfoWidget) iDLListenerS193S0100000_5.l0).getView();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS193S0100000_5);
            }
            view.getLocationOnScreen(new int[2]);
            view.getHeight();
            Context LIZLLL = C15380j0.LIZLLL();
            if (LIZLLL == null) {
                return;
            }
            KL2.LJIIL(LIZLLL);
            KL2.LIZJ(LIZLLL, 52.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        if (r5 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onGlobalLayout$5(Y.IDLListenerS193S0100000_5 r9) {
        /*
            java.lang.Object r0 = r9.l0
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment r0 = (com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment) r0
            X.1t6 r0 = r0.LJLJLLL
            if (r0 == 0) goto Lbc
            int r1 = r0.getLineCount()
        Lc:
            java.lang.Object r0 = r9.l0
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment r0 = (com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment) r0
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r0.LJLL
            r4 = 0
            if (r0 == 0) goto Lb9
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
        L19:
            boolean r0 = r5 instanceof X.C018905p
            if (r0 == 0) goto Lb6
            X.05p r5 = (X.C018905p) r5
        L1f:
            r0 = 2
            r7 = -1
            r6 = 2131377816(0x7f0a3e98, float:1.8375847E38)
            r8 = 1101004800(0x41a00000, float:20.0)
            if (r1 != r0) goto L59
            if (r5 != 0) goto L48
        L2a:
            java.lang.Object r0 = r9.l0
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment r0 = (com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment) r0
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r0.LJLL
            if (r0 != 0) goto L44
        L32:
            java.lang.Object r0 = r9.l0
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment r0 = (com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment) r0
            X.1t6 r0 = r0.LJLJLLL
            if (r0 == 0) goto L43
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L43
            r0.removeOnGlobalLayoutListener(r9)
        L43:
            return
        L44:
            r0.setLayoutParams(r5)
            goto L32
        L48:
            r5.topToTop = r6
            r5.bottomToBottom = r7
            int r0 = X.C15380j0.LIZ(r8)
            r5.width = r0
            int r0 = X.C15380j0.LIZ(r8)
            r5.height = r0
            goto L2a
        L59:
            r0 = 3
            if (r1 < r0) goto L32
            java.lang.Object r0 = r9.l0
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment r0 = (com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment) r0
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r9.l0
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment r0 = (com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment) r0
            X.1t6 r0 = r0.LJLJLLL
            if (r0 == 0) goto L72
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
        L72:
            boolean r0 = r4 instanceof X.C018905p
            if (r0 == 0) goto L92
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            if (r4 == 0) goto L92
            r0 = 4
            float r0 = (float) r0
            int r3 = X.C15380j0.LIZ(r0)
            r0 = 8
            float r0 = (float) r0
            int r2 = X.C15380j0.LIZ(r0)
            int r1 = X.C15380j0.LIZ(r0)
            int r0 = X.C15380j0.LIZ(r0)
            r4.setMargins(r3, r2, r1, r0)
        L92:
            if (r5 != 0) goto La0
        L94:
            java.lang.Object r0 = r9.l0
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment r0 = (com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment) r0
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r0.LJLL
            if (r0 != 0) goto Lb1
            goto L32
        L9d:
            if (r5 != 0) goto Lac
            goto L94
        La0:
            int r0 = X.C15380j0.LIZ(r8)
            r5.width = r0
            int r0 = X.C15380j0.LIZ(r8)
            r5.height = r0
        Lac:
            r5.topToTop = r6
            r5.bottomToBottom = r7
            goto L94
        Lb1:
            r0.setLayoutParams(r5)
            goto L32
        Lb6:
            r5 = r4
            goto L1f
        Lb9:
            r5 = r4
            goto L19
        Lbc:
            r1 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDLListenerS193S0100000_5.onGlobalLayout$5(Y.IDLListenerS193S0100000_5):void");
    }

    public static final void onGlobalLayout$6(IDLListenerS193S0100000_5 iDLListenerS193S0100000_5) {
        ViewTreeObserver viewTreeObserver;
        ConstraintLayout constraintLayout = ((SubscriptionGiftSendDialog) iDLListenerS193S0100000_5.l0).LJLILLLLZI;
        if (constraintLayout != null) {
            C29306Beo.LJJJJLI(constraintLayout.getHeight(), ((SubscriptionGiftSendDialog) iDLListenerS193S0100000_5.l0).LJLIL);
        }
        View view = ((SubscriptionGiftSendDialog) iDLListenerS193S0100000_5.l0).getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS193S0100000_5);
        }
    }

    public static final void onGlobalLayout$7(IDLListenerS193S0100000_5 iDLListenerS193S0100000_5) {
        ViewTreeObserver viewTreeObserver;
        View _$_findCachedViewById = ((SubscriptionPrivilegeDetailFragment) iDLListenerS193S0100000_5.l0)._$_findCachedViewById(R.id.ist);
        if (_$_findCachedViewById != null && (viewTreeObserver = _$_findCachedViewById.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS193S0100000_5);
        }
        View _$_findCachedViewById2 = ((SubscriptionPrivilegeDetailFragment) iDLListenerS193S0100000_5.l0)._$_findCachedViewById(R.id.ist);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.postDelayed(new ARunnableS41S0100000_5((SubscriptionPrivilegeDetailFragment) iDLListenerS193S0100000_5.l0, 281), 1000L);
        }
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) iDLListenerS193S0100000_5.l0;
        subscriptionPrivilegeDetailFragment.LLF = subscriptionPrivilegeDetailFragment._$_findCachedViewById(R.id.fml).getMeasuredHeight();
        View _$_findCachedViewById3 = ((SubscriptionPrivilegeDetailFragment) iDLListenerS193S0100000_5.l0)._$_findCachedViewById(R.id.ist);
        if (_$_findCachedViewById3 != null) {
            C29306Beo.LJJJJJL(((SubscriptionPrivilegeDetailFragment) iDLListenerS193S0100000_5.l0)._$_findCachedViewById(R.id.fml).getMeasuredHeight(), _$_findCachedViewById3);
        }
    }

    public static final void onGlobalLayout$8(IDLListenerS193S0100000_5 iDLListenerS193S0100000_5) {
        C47121t6 c47121t6 = (C47121t6) iDLListenerS193S0100000_5.l0;
        if (c47121t6.getLineCount() > 2) {
            C23010vJ.LIZLLL(c47121t6, 3, 700);
            c47121t6.setMaxLines(2);
            c47121t6.setEllipsize(TextUtils.TruncateAt.END);
        }
        c47121t6.setVisibility(0);
    }

    public IDLListenerS193S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
