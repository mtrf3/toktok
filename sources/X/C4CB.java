package X;

import Y.ARunnableS20S0200000_1;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4CB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CB {
    public final InterfaceC70422pa LIZ;
    public final InterfaceC88472Yns<Long, C76800UCe> LIZIZ;
    public float LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJI;
    public float LJIIJ;
    public float LJIIJJI;
    public C4CI LJIIL;
    public RecyclerView LJIJJ;
    public VWD LJIJJLI;
    public Integer LJJ;
    public boolean LJFF = true;
    public int LJII = -1;
    public final Handler LJIIIIZZ = new Handler(C16880lQ.LLJJJJ());
    public final int LJIIIZ = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    public final int LJIILIIL = 9;
    public final int LJIILJJIL = LiveTryModeCountDownThresholdSetting.DEFAULT;
    public final int LJIILL = 56;
    public final int LJIILLIIL = 27;
    public final float LJIIZILJ = 0.32f;
    public final float LJIJ = 1.42f;
    public final List<View> LJIJI = new ArrayList();
    public List<? extends C105454Bx> LJIL = C61878OQg.INSTANCE;

    public final boolean LIZIZ() {
        Integer num;
        final RecyclerView recyclerView = this.LJIJJ;
        if (recyclerView == null) {
            return false;
        }
        C34B.LJI("PopHelper", "doOnActionCancelOrUp");
        this.LJIIIIZZ.removeCallbacksAndMessages(null);
        Integer num2 = this.LJJ;
        if ((num2 == null || num2.intValue() != 7) && (!C88963eO.LJFF() || (num = this.LJJ) == null || num.intValue() != 9)) {
            C4CI c4ci = this.LJIIL;
            if (c4ci != null && c4ci.isShowing()) {
                C4CI c4ci2 = this.LJIIL;
                o.LJI(c4ci2);
                c4ci2.dismiss();
            }
            LJ(this.LJIJI, this.LJIJJLI, recyclerView);
        } else {
            C4CI c4ci3 = this.LJIIL;
            if (c4ci3 != null) {
                c4ci3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.4CE
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        C4CB c4cb = C4CB.this;
                        c4cb.LJ(c4cb.LJIJI, c4cb.LJIJJLI, recyclerView);
                    }
                });
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJ;
        this.LIZLLL = currentTimeMillis;
        if (currentTimeMillis < this.LJIIIZ) {
            return false;
        }
        return true;
    }

    public final boolean LIZJ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        RecyclerView recyclerView = this.LJIJJ;
        if (recyclerView == null) {
            return false;
        }
        this.LJ = System.currentTimeMillis();
        this.LIZLLL = 0L;
        this.LJI = System.currentTimeMillis();
        this.LIZJ = event.getX();
        ((ArrayList) this.LJIJI).clear();
        this.LJIIJ = event.getX();
        this.LJIIJJI = event.getY();
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            List<View> list = this.LJIJI;
            View childAt = recyclerView.getChildAt(i);
            o.LJIIIIZZ(childAt, "viewGroup.getChildAt(i)");
            ((ArrayList) list).add(childAt);
        }
        this.LJIIIIZZ.removeCallbacksAndMessages(null);
        this.LJIIIIZZ.postDelayed(new ARunnableS20S0200000_1(this, recyclerView, 45), this.LJIIIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doOnActionDown mTouchStartXPosition=");
        LIZ.append(this.LIZJ);
        LIZ.append(" mLastTimeTouch=");
        LIZ.append(this.LJI);
        C34B.LJI("PopHelper", X1D.LIZIZ(LIZ));
        if (this.LIZLLL < this.LJIIIZ) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL(MotionEvent event) {
        o.LJIIIZ(event, "event");
        RecyclerView recyclerView = this.LJIJJ;
        if (recyclerView == null) {
            return false;
        }
        C34B.LJI("PopHelper", "doOnActionMove");
        LJFF(event.getX(), event.getY(), recyclerView, this.LJIJI, this.LJIL, recyclerView, this.LJIJJLI, this.LJJ, "move");
        if (this.LIZLLL < this.LJIIIZ) {
            return false;
        }
        return true;
    }

    public C4CB(InterfaceC88472Yns interfaceC88472Yns, InterfaceC70422pa interfaceC70422pa) {
        this.LIZ = interfaceC70422pa;
        this.LIZIZ = interfaceC88472Yns;
    }

    public final void LJ(List<? extends View> list, VWD vwd, RecyclerView recyclerView) {
        View findViewById;
        int i = this.LJII;
        if (i >= 0) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size() && (findViewById = ((View) ListProtector.get(arrayList, this.LJII)).findViewById(R.id.cud)) != null) {
                findViewById.setBackground(new ColorDrawable(0));
            }
        }
        this.LJII = -1;
        this.LJFF = true;
        if (vwd != null) {
            vwd.setSwipeEnabled(true);
        }
        if (recyclerView instanceof C4CM) {
            ((C4CM) recyclerView).setSwipeEnabled(true);
        }
        if (recyclerView instanceof C4CL) {
            ((C4CL) recyclerView).setSwipeEnabled(true);
        }
        this.LJI = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(float r26, float r27, androidx.recyclerview.widget.RecyclerView r28, java.util.List r29, java.util.List r30, androidx.recyclerview.widget.RecyclerView r31, X.VWD r32, java.lang.Integer r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4CB.LJFF(float, float, androidx.recyclerview.widget.RecyclerView, java.util.List, java.util.List, androidx.recyclerview.widget.RecyclerView, X.VWD, java.lang.Integer, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(final X.C4CB r23, int r24, int r25, com.ss.android.ugc.aweme.base.model.UrlModel r26, android.view.View r27, android.content.Context r28, final androidx.recyclerview.widget.RecyclerView r29, final boolean r30, java.lang.Integer r31, com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker r32, com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r33, boolean r34, int r35) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4CB.LIZ(X.4CB, int, int, com.ss.android.ugc.aweme.base.model.UrlModel, android.view.View, android.content.Context, androidx.recyclerview.widget.RecyclerView, boolean, java.lang.Integer, com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker, com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker, boolean, int):void");
    }
}
