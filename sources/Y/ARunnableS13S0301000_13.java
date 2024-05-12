package Y;

import X.AbstractC2313496c;
import X.C18950ol;
import X.C2313596d;
import X.C77731Uf1;
import X.C79045V0n;
import X.InterfaceC76622U5i;
import X.InterfaceC77737Uf7;
import X.U7F;
import X.U7T;
import X.U7V;
import X.UB4;
import X.X1D;
import Y.AUListenerS93S0100000_4;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ARunnableS13S0301000_13 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        int i2;
        RankListViewModel LJII;
        RankListV2Response.RankView rankView;
        List<RankListV2Response.RankInfo> list;
        RankListFragment rankListFragment = (RankListFragment) this.l0;
        View view = rankListFragment.LJLZ;
        if (view != null) {
            RankListV2Response.RankInfo rankInfo = (RankListV2Response.RankInfo) this.l1;
            TextView textView = (TextView) this.l2;
            final int i3 = this.i3;
            if (rankListFragment.isAdded()) {
                SparseBooleanArray sparseBooleanArray = C2313596d.LIZ;
                if (sparseBooleanArray.get(rankListFragment.LJLJJI.LIZIZ.type) && rankInfo.rank > 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    RankListController rankListController = rankListFragment.LJLJJLL;
                    if (rankListController != null && (LJII = rankListController.LJII()) != null && (rankView = LJII.LJLILLLLZI) != null && (list = rankView.ranks) != null) {
                        i = list.size();
                    } else {
                        i = 99;
                    }
                    LIZ.append(i);
                    LIZ.append('+');
                    textView.setText(X1D.LIZIZ(LIZ));
                    final View findViewById = view.findViewById(R.id.imw);
                    o.LJIIIIZZ(findViewById, "it.findViewById(R.id.rank_num_container)");
                    final View findViewById2 = view.findViewById(R.id.imv);
                    o.LJIIIIZZ(findViewById2, "it.findViewById(\n       …     R.id.rank_num_arrow)");
                    View findViewById3 = view.findViewById(R.id.imu);
                    o.LJIIIIZZ(findViewById3, "it.findViewById(R.id.rank_num)");
                    final TextView textView2 = (TextView) findViewById3;
                    final String rankStr = rankInfo.rankStr;
                    o.LJIIIIZZ(rankStr, "rankStr");
                    Context context = textView.getContext();
                    o.LJIIIIZZ(context, "context");
                    Integer LJI = C79045V0n.LJI(R.attr.gp, context);
                    if (LJI != null) {
                        i2 = LJI.intValue();
                    } else {
                        i2 = 0;
                    }
                    final int i4 = rankListFragment.LJLJJI.LIZIZ.type;
                    SparseBooleanArray sparseBooleanArray2 = C2313596d.LIZIZ;
                    if (sparseBooleanArray2.get(i4)) {
                        return;
                    }
                    sparseBooleanArray.put(i4, false);
                    sparseBooleanArray2.put(i4, true);
                    findViewById2.setVisibility(0);
                    findViewById2.setTranslationY((findViewById2.getHeight() + findViewById.getHeight()) / 2.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat((findViewById2.getHeight() + findViewById.getHeight()) / 2.0f, 0.0f);
                    ofFloat.setInterpolator(C18950ol.LIZIZ(0.7f, 0.01f, 1.0f, 1.01f));
                    ofFloat.setDuration(500L);
                    ofFloat.setStartDelay(500L);
                    ofFloat.addUpdateListener(new AUListenerS90S0100000_1(findViewById2, 22));
                    ofFloat.start();
                    textView2.setTextColor(i2);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
                    ofFloat2.setDuration(300L);
                    ofFloat2.setStartDelay(500L);
                    ofFloat2.addUpdateListener(new AUListenerS90S0100000_1(textView2, 23));
                    ofFloat2.addListener(new AbstractC2313496c() { // from class: X.96a
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animation) {
                            o.LJIIIZ(animation, "animation");
                            textView2.setText(rankStr);
                            textView2.setAlpha(1.0f);
                            textView2.setTextColor(i3);
                            textView2.setTranslationY((textView2.getHeight() + findViewById.getHeight()) / 2.0f);
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat((textView2.getHeight() + findViewById.getHeight()) / 2.0f, 0.0f);
                            ofFloat3.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
                            ofFloat3.setDuration(500L);
                            ofFloat3.setStartDelay(1000L);
                            ofFloat3.addUpdateListener(new AUListenerS93S0100000_4(textView2, 19));
                            final int i5 = i4;
                            ofFloat3.addListener(new AbstractC2313496c() { // from class: X.96b
                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animation2) {
                                    o.LJIIIZ(animation2, "animation");
                                    C2313596d.LIZIZ.put(i5, false);
                                }
                            });
                            ofFloat3.start();
                        }
                    });
                    ofFloat2.start();
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, (findViewById2.getHeight() + findViewById.getHeight()) / (-2));
                    ofInt.setInterpolator(C18950ol.LIZIZ(0.7f, 0.01f, 1.0f, 1.01f));
                    ofInt.setDuration(500L);
                    ofInt.setStartDelay(1400L);
                    ofInt.addUpdateListener(new AUListenerS90S0100000_1(findViewById2, 24));
                    ofInt.addListener(new AbstractC2313496c() { // from class: X.96e
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animation) {
                            o.LJIIIZ(animation, "animation");
                            findViewById2.setVisibility(4);
                        }
                    });
                    ofInt.start();
                }
            }
        }
    }

    public final void LIZ$1() {
        U7T u7t = (U7T) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        LinkUser linkUser = (LinkUser) this.l1;
        int i = this.i3;
        IMessage iMessage = (IMessage) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJIILJJIL(u7t, new KickOutMessage(linkUser, i, U7V.LJIILL((LinkLayerMessage) iMessage, null)));
        }
    }

    public final void LIZ$2() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkMessage linkMessage = (LinkMessage) this.l1;
        ReplyInviteData replyInviteData = (ReplyInviteData) this.l2;
        int i = this.i3;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<UB4> LJJLIIIJLJLI = it.next().LJJLIIIJLJLI(u7f);
            if (LJJLIIIJLJLI != null) {
                for (UB4 ub4 : LJJLIIIJLJLI) {
                    if (ub4 != null) {
                        ub4.LIZLLL(replyInviteData.getInviter().getUserId(), i, SystemClock.uptimeMillis(), linkMessage);
                    }
                }
            }
        }
    }

    public static final void run$0(ARunnableS13S0301000_13 aRunnableS13S0301000_13) {
        boolean LIZ;
        try {
            C77731Uf1 c77731Uf1 = C77731Uf1.LIZ;
            InterfaceC77737Uf7 interfaceC77737Uf7 = (InterfaceC77737Uf7) aRunnableS13S0301000_13.l0;
            int i = aRunnableS13S0301000_13.i3;
            Throwable th = (Throwable) aRunnableS13S0301000_13.l1;
            String str = ((Diamond) aRunnableS13S0301000_13.l2).iapId;
            o.LJIIIIZZ(str, "diamond.iapId");
            c77731Uf1.LJIIJ(interfaceC77737Uf7, -1, i, th, str);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS13S0301000_13 aRunnableS13S0301000_13) {
        boolean LIZ;
        try {
            C77731Uf1 c77731Uf1 = C77731Uf1.LIZ;
            InterfaceC77737Uf7 interfaceC77737Uf7 = (InterfaceC77737Uf7) aRunnableS13S0301000_13.l0;
            int i = aRunnableS13S0301000_13.i3;
            Throwable th = (Throwable) aRunnableS13S0301000_13.l1;
            String str = ((Diamond) aRunnableS13S0301000_13.l2).iapId;
            o.LJIIIIZZ(str, "diamond.iapId");
            c77731Uf1.LJIIJ(interfaceC77737Uf7, -1, i, th, str);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS13S0301000_13 aRunnableS13S0301000_13) {
        boolean LIZ;
        try {
            aRunnableS13S0301000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS13S0301000_13 aRunnableS13S0301000_13) {
        boolean LIZ;
        try {
            U7T u7t = (U7T) aRunnableS13S0301000_13.l0;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
            int i = aRunnableS13S0301000_13.i3;
            LinkCoreError linkCoreError = (LinkCoreError) aRunnableS13S0301000_13.l1;
            AbnormalDisconnectReason abnormalDisconnectReason = (AbnormalDisconnectReason) aRunnableS13S0301000_13.l2;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJIIZ(u7t, i, linkCoreError, abnormalDisconnectReason);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS13S0301000_13 aRunnableS13S0301000_13) {
        boolean LIZ;
        try {
            aRunnableS13S0301000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS13S0301000_13 aRunnableS13S0301000_13) {
        boolean LIZ;
        try {
            aRunnableS13S0301000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS13S0301000_13(U7T u7t, int i, LinkCoreError linkCoreError, int i2) {
        this.$t = i2;
        this.l0 = u7t;
        this.i3 = i;
        this.l1 = linkCoreError;
        this.l2 = null;
    }

    public ARunnableS13S0301000_13(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
    }
}
