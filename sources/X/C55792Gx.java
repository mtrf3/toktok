package X;

import Y.IDCListenerS135S0100000;
import Y.IDRunnableS85S0100000;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatNoticeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.2Gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55792Gx extends C45101pq implements InterfaceC266512v {
    public final InterfaceC88473Ynt<EnumC264412a, C12X, Object, C76800UCe> LJLJLJ;
    public final boolean LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public DataChannel LJZ;
    public int LJZI;
    public final int LJZL;
    public final int LL;
    public final int LLD;
    public int LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public final GradientDrawable LLFII;
    public final C47121t6 LLFZ;
    public final LiveIconView LLI;
    public final LiveIconView LLIFFJFJJ;
    public final C47121t6 LLII;
    public final View LLIIII;
    public float LLIIIILZ;
    public float LLIIIJ;
    public XKQ LLIIIL;
    public IDCListenerS135S0100000 LLIIIZ;
    public EnumC264412a LLIIJI;
    public Object LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;

    public C55792Gx() {
        this(null, 3);
    }

    @Override // X.InterfaceC266512v
    public final void LJJIIJ() {
        InterfaceC88473Ynt<EnumC264412a, C12X, Object, C76800UCe> interfaceC88473Ynt;
        if ((!this.LJLJL) && (interfaceC88473Ynt = this.LJLJLJ) != null) {
            interfaceC88473Ynt.invoke(this.LLIIJI, C12X.RETURN_APP, this.LLIIJLIL);
        }
        hide();
        EnumC264412a enumC264412a = EnumC264412a.LIVE_TIP_UNKNOWN;
        o.LJIIIZ(enumC264412a, "<set-?>");
        this.LLIIJI = enumC264412a;
        this.LLF = 2;
    }

    @Override // X.InterfaceC266512v
    public final void LJJJZ() {
        if (!this.LJLJL) {
            EnumC264412a enumC264412a = this.LLIIJI;
            hide();
            EnumC264412a enumC264412a2 = EnumC264412a.LIVE_TIP_UNKNOWN;
            o.LJIIIZ(enumC264412a2, "<set-?>");
            this.LLIIJI = enumC264412a2;
            this.LLF = 2;
            InterfaceC88473Ynt<EnumC264412a, C12X, Object, C76800UCe> interfaceC88473Ynt = this.LJLJLJ;
            if (interfaceC88473Ynt != null) {
                interfaceC88473Ynt.invoke(enumC264412a, C12X.HIDE_TIP, this.LLIIJLIL);
            }
        }
    }

    @Override // X.InterfaceC266512v
    public final void onDestroy() {
        DataChannel dataChannel = this.LJZ;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    @Override // X.InterfaceC266512v
    public final void hide() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hide(). !isShow=");
        FT5.LJ(LIZ, !(!this.LJLJL), LIZ, "FloatTipView");
        if (!(!this.LJLJL)) {
            return;
        }
        LLLZ(false, true);
    }

    @Override // X.InterfaceC266512v
    public final int LJIILLIIL() {
        return this.LLF;
    }

    @Override // X.InterfaceC266512v
    public final EnumC264412a LJJJJL() {
        return this.LLIIJI;
    }

    @Override // X.InterfaceC266512v
    public final int getWidth() {
        return this.LJLL;
    }

    @Override // X.InterfaceC266512v
    public final void LJIILJJIL(boolean z) {
        InterfaceC88473Ynt<EnumC264412a, C12X, Object, C76800UCe> interfaceC88473Ynt;
        this.LLFF = z;
        if (this.LJLJLLL) {
            this.LLFF = false;
        }
        boolean z2 = !this.LJLJL;
        hide();
        int i = this.LLF;
        if (i != 0 && i != 1) {
            EnumC264412a enumC264412a = this.LLIIJI;
            EnumC264412a enumC264412a2 = EnumC264412a.LIVE_TIP_UNKNOWN;
            o.LJIIIZ(enumC264412a2, "<set-?>");
            this.LLIIJI = enumC264412a2;
            this.LLF = 2;
            if (z2 && (interfaceC88473Ynt = this.LJLJLJ) != null) {
                interfaceC88473Ynt.invoke(enumC264412a, C12X.CHANGE_STATE, this.LLIIJLIL);
            }
        }
    }

    @Override // X.InterfaceC266512v
    public final void LJJIJIIJI(boolean z) {
        int i = this.LLF;
        if (i == 0 || i == 1) {
            if (!this.LLFFF) {
                if (this.LLFF) {
                    this.LLFII.setColor(this.LL);
                } else {
                    this.LLFII.setColor(this.LJZI);
                }
            }
            C0NB.LJIIIZ("FloatTipView", "show().");
            LLLZ(true, false);
        }
    }

    @Override // X.InterfaceC266512v
    public final void LJJJJJ(EnumC264412a enumC264412a) {
        InterfaceC88473Ynt<EnumC264412a, C12X, Object, C76800UCe> interfaceC88473Ynt = this.LJLJLJ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(enumC264412a, C12X.HIDE_TIP, this.LLIIJLIL);
        }
    }

    @Override // X.InterfaceC266512v
    public final void LJJLI(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        if (this.LJLJLLL) {
            dataChannel.mv0(GameBackgroundColorChannel.class, this, new IDqS416S0100000(this, 354));
            this.LJZ = dataChannel;
        }
    }

    public final void LLLZI(Throwable th) {
        View rootView;
        ViewParent parent;
        Thread thread;
        View view = this.LJLJJI;
        Thread thread2 = null;
        if (view != null && (rootView = view.getRootView()) != null && (parent = rootView.getParent()) != null && parent.getClass().getName().equals("android.view.ViewRootImpl")) {
            try {
                Object obj = parent.getClass().getDeclaredField("mThread").get(parent);
                o.LJII(obj, "null cannot be cast to non-null type java.lang.Thread");
                thread = (Thread) obj;
            } catch (Throwable th2) {
                th = th2;
                thread = null;
            }
            try {
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th3) {
                th = th3;
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                thread2 = thread;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("update ui error, is main = ");
                LIZ.append(o.LJ(C16880lQ.LLLLIIIILLL(), C16880lQ.LLJJJJ().getThread()));
                LIZ.append(", ViewRootImpl: thread = ");
                LIZ.append(thread2);
                LIZ.append(", wanna content = ");
                LIZ.append((Object) this.LLFZ.getText());
                C0K2.LIZ(X1D.LIZIZ(LIZ), th);
            }
            thread2 = thread;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("update ui error, is main = ");
        LIZ2.append(o.LJ(C16880lQ.LLLLIIIILLL(), C16880lQ.LLJJJJ().getThread()));
        LIZ2.append(", ViewRootImpl: thread = ");
        LIZ2.append(thread2);
        LIZ2.append(", wanna content = ");
        LIZ2.append((Object) this.LLFZ.getText());
        C0K2.LIZ(X1D.LIZIZ(LIZ2), th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C55792Gx(kotlin.jvm.internal.IDqS425S0100000 r9, int r10) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55792Gx.<init>(kotlin.jvm.internal.IDqS425S0100000, int):void");
    }

    @Override // X.InterfaceC266512v
    public final void LJFF(boolean z, boolean z2) {
        this.LJLLLLLL = z;
        this.LJLZ = z2;
    }

    public final void LLLZ(boolean z, boolean z2) {
        float f;
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        View view = this.LJLJJI;
        if (view != null) {
            f2 = view.getAlpha();
        }
        this.LLIIIILZ = f2;
        if (z2) {
            View view2 = this.LJLJJI;
            if (view2 != null) {
                view2.setAlpha(f);
            }
            if (z != (!this.LJLJL)) {
                if (z) {
                    init();
                    return;
                } else {
                    dismiss();
                    return;
                }
            }
            return;
        }
        if (((ValueAnimator) this.LLIIL.getValue()).isRunning()) {
            ((ValueAnimator) this.LLIIL.getValue()).cancel();
        }
        if (this.LJLJLLL && ((ValueAnimator) this.LLIILII.getValue()).isRunning()) {
            ((ValueAnimator) this.LLIILII.getValue()).cancel();
        }
        if (true != (!this.LJLJL)) {
            init();
        }
        this.LLIIIJ = f - this.LLIIIILZ;
        ((ValueAnimator) this.LLIIL.getValue()).start();
        if (!this.LJLJLLL) {
            return;
        }
        ((ValueAnimator) this.LLIILII.getValue()).start();
    }

    @Override // X.InterfaceC266512v
    public final void LJJJJZ(EnumC264412a floatTipType, CharSequence tipContent, boolean z, Object obj) {
        InterfaceC88473Ynt<EnumC264412a, C12X, Object, C76800UCe> interfaceC88473Ynt;
        Integer num;
        ImageModel imageModel;
        boolean z2;
        Drawable drawable;
        int i;
        View view;
        o.LJIIIZ(floatTipType, "floatTipType");
        o.LJIIIZ(tipContent, "tipContent");
        XKQ xkq = this.LLIIIL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        EnumC264412a enumC264412a = this.LLIIJI;
        this.LLIIJI = floatTipType;
        if (floatTipType != enumC264412a || C264512b.LIZIZ(floatTipType, enumC264412a)) {
            EnumC264412a enumC264412a2 = this.LLIIJI;
            EnumC264412a enumC264412a3 = EnumC264412a.LIVE_TIP_UNKNOWN;
            if (enumC264412a2 != enumC264412a3 && enumC264412a != enumC264412a3 && (!this.LJLJL) && (interfaceC88473Ynt = this.LJLJLJ) != null) {
                interfaceC88473Ynt.invoke(enumC264412a, C12X.NEW_TIP, obj);
            }
        }
        this.LLIIJLIL = obj;
        GameFloatNoticeSetting gameFloatNoticeSetting = GameFloatNoticeSetting.INSTANCE;
        if (gameFloatNoticeSetting.isExperimentGroup() && (obj instanceof C31977Cgn)) {
            C31977Cgn c31977Cgn = (C31977Cgn) obj;
            imageModel = c31977Cgn.LIZIZ;
            num = c31977Cgn.LIZJ;
            if (num == null) {
                num = null;
            }
        } else {
            num = null;
            imageModel = null;
        }
        this.LLFZ.setTextColor(this.LJZL);
        this.LLII.setTextColor(this.LJZL);
        if (floatTipType.getPriority() == 0 || (floatTipType.getPriority() == 1 && floatTipType.isRed())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLFFF = z2;
        if (num != null) {
            this.LLFII.setColor(num.intValue());
        } else if (z2) {
            this.LLFII.setColor(this.LLD);
        } else if (this.LLFF) {
            this.LLFII.setColor(this.LL);
        } else {
            this.LLFII.setColor(this.LJZI);
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            view2.setBackground(this.LLFII);
        }
        C12I leftIcon = floatTipType.getLeftIcon();
        if (leftIcon != null && leftIcon.LIZ != null) {
            this.LLIFFJFJJ.setIconTintList(leftIcon.LIZIZ);
            this.LLIFFJFJJ.setImageDrawable(leftIcon.LIZ);
            C87277YNd.LJJIJ(this.LLIFFJFJJ);
            drawable = leftIcon.LIZ;
        } else {
            C87277YNd.LJJIIZ(this.LLIFFJFJJ);
            this.LLIFFJFJJ.setIconTintList(null);
            drawable = null;
        }
        if (gameFloatNoticeSetting.isExperimentGroup() && imageModel != null) {
            C87277YNd.LJJIJ(this.LLIFFJFJJ);
            C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(imageModel);
            LJIIIZ.LIZLLL(ImageView.ScaleType.FIT_CENTER);
            if (drawable != null) {
                LJIIIZ.LJIIJ = drawable;
            }
            LJIIIZ.LJIIJJI(this.LLIFFJFJJ);
        }
        this.LLFZ.setText(tipContent);
        if (floatTipType.getRightText() != null) {
            this.LLII.setText(floatTipType.getRightText());
            C87277YNd.LJJIJ(this.LLII);
            View view3 = this.LLIIII;
            if (view3 != null) {
                C87277YNd.LJJIJ(view3);
            }
        } else {
            C87277YNd.LJJIIZ(this.LLII);
        }
        C12I rightIcon = floatTipType.getRightIcon();
        if (rightIcon != null && rightIcon.LIZ != null) {
            this.LLI.setIconTintList(rightIcon.LIZIZ);
            this.LLI.setIcon(rightIcon.LIZ);
            C87277YNd.LJJIJ(this.LLI);
            View view4 = this.LLIIII;
            if (view4 != null) {
                C87277YNd.LJJIJ(view4);
            }
            View view5 = this.LJLJJI;
            if (view5 != null) {
                view5.post(new IDRunnableS85S0100000(this, 124));
            }
        } else {
            C87277YNd.LJJIIZ(this.LLI);
            this.LLI.setIconTintList(null);
            View view6 = this.LJLJJI;
            if (view6 != null) {
                view6.setTouchDelegate(null);
            }
        }
        if (floatTipType.getRightText() == null && floatTipType.getRightIcon() == null && (view = this.LLIIII) != null) {
            C87277YNd.LJJIIZ(view);
        }
        View view7 = this.LJLJJI;
        if (view7 != null) {
            view7.measure(1073741824, 0);
        }
        int i2 = this.LJLL;
        int i3 = this.LJLLI;
        View view8 = this.LJLJJI;
        if (view8 != null) {
            i = view8.getMeasuredHeight();
        } else {
            i = 0;
        }
        LLLLZIL(i2, Math.max(i3, i));
        C0NB.LJIIIZ("FloatTipView", "show().");
        LLLZ(true, false);
        this.LLF = floatTipType.getPriority();
        if (!this.LJLJLLL) {
            XKQ xkq2 = this.LLIIIL;
            if (xkq2 != null) {
                xkq2.LIZIZ(null);
            }
            this.LLIIIL = XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C55802Gy(floatTipType, this, null), 2);
        }
    }
}
