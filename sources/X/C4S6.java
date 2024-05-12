package X;

import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.4S6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4S6 extends C18Z implements View.OnTouchListener {
    public final Context LJLJI;
    public final SharePackage LJLJJI;
    public final int[] LJLJJL;
    public final InterfaceC88472Yns<IMContact, C76800UCe> LJLJJLL;
    public final InterfaceC88472Yns<InterfaceC62225ObV, C76800UCe> LJLJL;
    public LinearLayout LJLJLJ;
    public int LJLJLLL;
    public List<? extends C4SB> LJLL;
    public List<? extends RectF> LJLLI;
    public List<? extends RectF> LJLLILLLL;
    public final float LJLLJ;
    public final float LJLLL;
    public final ARunnableS37S0100000_1 LJLLLL;
    public final ARunnableS37S0100000_1 LJLLLLLL;

    public final void LJIJJLI() {
        List<? extends C4SB> list;
        C4SB c4sb;
        int i = this.LJLJLLL;
        if (i != -1) {
            if (i != -1 && (list = this.LJLL) != null && (c4sb = (C4SB) ListProtector.get(list, i)) != null) {
                if (c4sb instanceof C4S9) {
                    C4S9 c4s9 = (C4S9) c4sb;
                    this.LJLJJLL.invoke(c4s9.LIZ);
                    SharePackage sharePackage = this.LJLJJI;
                    if (sharePackage != null) {
                        int i2 = this.LJLJLLL;
                        C85323Wm eventSender = C772831o.LIZ();
                        o.LJIIIZ(eventSender, "eventSender");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (o.LJ(sharePackage.itemType, "aweme") || o.LJ(sharePackage.itemType, "aweme_photo")) {
                            linkedHashMap.put("author_follow_status", String.valueOf(sharePackage.extras.getInt("follow_status", -1)));
                            C132805Jc.LJFF(linkedHashMap, "panel_source", "share_button_long_press", i2, "rank_index");
                            eventSender.LIZIZ("share_head_click", linkedHashMap);
                        }
                    }
                    C57428MgK.LJI(this.LJLJJI, c4s9.LIZ, false, "chat", System.currentTimeMillis(), C772831o.LIZ(), this.LJLJLLL);
                    C57428MgK.LJFF(this.LJLJJI, null, C47261Igj.LJJIJ(c4s9.LIZ), this.LJLJLLL, 24);
                } else if (c4sb instanceof C4SA) {
                    C4SA c4sa = (C4SA) c4sb;
                    if (o.LJ(c4sa.LIZ.key(), "repost")) {
                        SharePackage sharePackage2 = this.LJLJJI;
                        if (sharePackage2 != null) {
                            InterfaceC62225ObV interfaceC62225ObV = c4sa.LIZ;
                            interfaceC62225ObV.LJIIJ(sharePackage2.LJIIJJI(interfaceC62225ObV), this.LJLJI, null);
                        }
                    } else {
                        this.LJLJL.invoke(c4sa.LIZ);
                    }
                }
                new C61996OUu(this.LJLJI).LIZ(0);
            }
            LJIL(-1);
            dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r8 == (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(int r8) {
        /*
            r7 = this;
            r3 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r5 = "QuickSharePanelDialog"
            r2 = 0
            r1 = -1
            if (r8 == r1) goto Lac
            int r0 = r7.LJLJLLL
            if (r8 == r0) goto Laa
            java.lang.String r1 = "  highlight item"
            java.lang.String r0 = ", resetHighLight item"
            java.lang.StringBuilder r1 = X.C7MY.LJ(r1, r8, r0)
            int r0 = r7.LJLJLLL
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C34B.LIZIZ(r5, r0)
            int r1 = r7.LJLJLLL
            android.widget.LinearLayout r0 = r7.LJLJLJ
            if (r0 == 0) goto La8
            android.view.View r1 = r0.getChildAt(r1)
        L2b:
            boolean r0 = r1 instanceof X.C4S7
            if (r0 == 0) goto L45
            X.4S7 r1 = (X.C4S7) r1
            if (r1 == 0) goto L45
            android.widget.FrameLayout r0 = r1.LJLILLLLZI
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r4)
            r0.scaleY(r4)
            android.widget.TextView r0 = r1.LJLIL
            r0.setVisibility(r3)
        L45:
            android.widget.LinearLayout r0 = r7.LJLJLJ
            if (r0 == 0) goto L4d
            android.view.View r2 = r0.getChildAt(r8)
        L4d:
            boolean r0 = r2 instanceof X.C4S7
            if (r0 == 0) goto La5
            X.4S7 r2 = (X.C4S7) r2
            if (r2 == 0) goto La5
            X.OUu r3 = new X.OUu
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.<init>(r1)
            r6 = 0
            r3.LIZ(r6)
            android.widget.FrameLayout r0 = r2.LJLILLLLZI
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1068708659(0x3fb33333, float:1.4)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            r0.scaleY(r1)
            android.widget.TextView r0 = r2.LJLIL
            r0.setVisibility(r6)
            android.widget.TextView r5 = r2.LJLIL
            r4 = 2
            float[] r3 = new float[r4]
            int r0 = r5.getHeight()
            float r0 = (float) r0
            r3[r6] = r0
            r1 = 1
            r0 = 0
            r3[r1] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r0, r3)
            r0.start()
            android.widget.TextView r2 = r2.LJLIL
            float[] r1 = new float[r4]
            r1 = {x00ea: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r0 = "alpha"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r2, r0, r1)
            r0.start()
        La5:
            r7.LJLJLLL = r8
            return
        La8:
            r1 = r2
            goto L2b
        Laa:
            if (r8 != r1) goto La5
        Lac:
            int r0 = r7.LJLJLLL
            if (r0 == r1) goto La5
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "  resetHighlight item"
            r1.append(r0)
            int r0 = r7.LJLJLLL
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C34B.LIZIZ(r5, r0)
            int r1 = r7.LJLJLLL
            android.widget.LinearLayout r0 = r7.LJLJLJ
            if (r0 == 0) goto Lcf
            android.view.View r2 = r0.getChildAt(r1)
        Lcf:
            boolean r0 = r2 instanceof X.C4S7
            if (r0 == 0) goto La5
            X.4S7 r2 = (X.C4S7) r2
            if (r2 == 0) goto La5
            android.widget.FrameLayout r0 = r2.LJLILLLLZI
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r4)
            r0.scaleY(r4)
            android.widget.TextView r0 = r2.LJLIL
            r0.setVisibility(r3)
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4S6.LJIL(int):void");
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        LinearLayout linearLayout = this.LJLJLJ;
        if (linearLayout != null) {
            linearLayout.removeCallbacks(this.LJLLLL);
            linearLayout.removeCallbacks(this.LJLLLLLL);
        }
        super.setOnDismissListener(onDismissListener);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                }
            }
            LJIJJLI();
            return true;
        }
        LJIJJ(this.LJLLILLLL, event.getX(), event.getY());
        return true;
    }

    public final void LJIJJ(List list, float f, float f2) {
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((RectF) it.next()).contains(f, f2)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            LJIL(i);
        }
    }

    public C4S6(Context context, AwemeSharePackage awemeSharePackage, int[] iArr, C107784Kw c107784Kw, AqS141S0200000_10 aqS141S0200000_10) {
        super(context, R.style.a8e);
        this.LJLJI = context;
        this.LJLJJI = awemeSharePackage;
        this.LJLJJL = iArr;
        this.LJLJJLL = c107784Kw;
        this.LJLJL = aqS141S0200000_10;
        this.LJLJLLL = -1;
        this.LJLLJ = C1DF.LJIIIIZZ(22);
        float LJIIIIZZ = C1DF.LJIIIIZZ(8);
        this.LJLLL = LJIIIIZZ;
        float LJIIIIZZ2 = C1DF.LJIIIIZZ(87);
        this.LJLLLL = new ARunnableS37S0100000_1(this, 73);
        this.LJLLLLLL = new ARunnableS37S0100000_1(this, 72);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.setDimAmount(0.3f);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.gravity = 8388661;
                int i = window.getContext().getResources().getConfiguration().orientation;
                if (i == 1) {
                    attributes.x = (int) (((KL2.LJIIJJI(context) > KL2.LJIIIZ(context) ? r0 : r1) - iArr[0]) - LJIIIIZZ);
                    attributes.y = (int) ((iArr[1] - KL2.LJIIL(window.getContext())) - LJIIIIZZ2);
                    return;
                }
                if (i != 2) {
                    return;
                }
                int LJIIL = KL2.LJIIL(window.getContext());
                int LJIIJJI = KL2.LJIIJJI(context);
                int LJIIIZ = KL2.LJIIIZ(context);
                attributes.x = ((LJIIJJI > LJIIIZ ? LJIIIZ : LJIIJJI) - iArr[0]) + LJIIL;
                attributes.y = (int) ((iArr[1] - LJIIL) - LJIIIIZZ2);
            }
        }
    }
}
