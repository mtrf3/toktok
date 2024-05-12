package X;

import Y.ALAdapterS1S0100000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC156286Bk<T> extends C6BL implements InterfaceC83564Wqu, InterfaceC156326Bo<T> {
    public final VideoPublishEditModel LLI;
    public final C82622Wbi LLIFFJFJJ;
    public String LLII;
    public AbstractC156316Bn<T> LLIIII;
    public C83547Wqd LLIIIILZ;
    public C156426By LLIIIJ;

    @Override // X.C6BL
    public final boolean LJ() {
        return true;
    }

    @Override // X.C6BL
    public final int LJIIJ() {
        return R.string.e42;
    }

    public abstract List<InteractStickerStruct> LJJIJLIJ(List<? extends StickerItemModel> list);

    public abstract List<String> LJJIL();

    public abstract void LJJIZ(InteractStickerStruct interactStickerStruct);

    public abstract void LJJJI(InteractStickerStruct interactStickerStruct);

    @Override // X.C6BL
    public final boolean LJIILLIIL() {
        boolean z;
        List<C156426By> list = this.LJLLI;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // X.C6BL
    public final C6BN LJIJI() {
        return new C6BN() { // from class: X.6BS
            /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
            
                if (r4 != null) goto L5;
             */
            @Override // X.C6BN, X.AbstractC1552267i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String LIZIZ(int r3, java.lang.String r4) {
                /*
                    r2 = this;
                    if (r4 == 0) goto L2f
                    java.lang.String r1 = java.io.File.separator
                    java.lang.String r0 = "separator"
                    kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                    r0 = 0
                    boolean r0 = ujb.o.LJJJJ(r4, r1, r0)
                    if (r0 == 0) goto L29
                L10:
                    java.lang.StringBuilder r1 = X.X1D.LIZ()
                    r1.append(r4)
                    java.lang.String r0 = "interact_sticker_"
                    r1.append(r0)
                    r1.append(r3)
                    java.lang.String r0 = ".png"
                    r1.append(r0)
                    java.lang.String r0 = X.X1D.LIZIZ(r1)
                    return r0
                L29:
                    java.lang.String r4 = defpackage.i0.LJFF(r4, r1)
                    if (r4 != 0) goto L10
                L2f:
                    java.lang.String r4 = ""
                    goto L10
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6BS.LIZIZ(int, java.lang.String):java.lang.String");
            }
        };
    }

    @Override // X.InterfaceC156096Ar
    public final InteractStickerStruct getInteractStickerStruct() {
        return LJIIL(LJIILIIL());
    }

    @Override // X.C6BL
    public final void LIZJ(C156426By c156426By) {
        this.LJLIL.addView(this.LJLL);
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        AbstractC156316Bn<T> abstractC156316Bn = this.LLIIII;
        if (abstractC156316Bn != null) {
            boolean z = true;
            if (abstractC156316Bn.getVisibility() == 0 && !abstractC156316Bn.getMIsDismissing() && 1 != 0) {
                if (this.LJLL != null) {
                    z = false;
                }
                if (abstractC156316Bn.LJLJJI != null) {
                    if (z) {
                        abstractC156316Bn.LJLJJL.LJLJJI = (abstractC156316Bn.getWidth() - r5.getWidth()) / 2;
                        abstractC156316Bn.LJLJJL.LJLJJL = ((abstractC156316Bn.LJLJLLL.x - r5.getHeight()) / 2) + abstractC156316Bn.LJLJLLL.y;
                    }
                    abstractC156316Bn.LJLJJLL.LJLJJI = (abstractC156316Bn.getWidth() - r5.getWidth()) / 2;
                    abstractC156316Bn.LJLJJLL.LJLJJL = ((abstractC156316Bn.getHeight() - i) - r5.getHeight()) / 2;
                }
                C156426By c156426By = this.LJLL;
                if (c156426By != null) {
                    if (c156426By instanceof C156396Bv) {
                        float newLayoutHeight = ((C156396Bv) c156426By).getNewLayoutHeight();
                        AbstractC156316Bn<T> abstractC156316Bn2 = this.LLIIII;
                        if (abstractC156316Bn2 != null) {
                            abstractC156316Bn2.LJLJJL.LJLJJL += newLayoutHeight;
                            abstractC156316Bn2.LIZLLL();
                        }
                    }
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                abstractC156316Bn.LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardModify(int i) {
        AbstractC156316Bn<T> abstractC156316Bn = this.LLIIII;
        if (abstractC156316Bn != null && abstractC156316Bn.getVisibility() == 0) {
            int i2 = abstractC156316Bn.LJLLJ + i;
            abstractC156316Bn.LJLLJ = i2;
            abstractC156316Bn.setSearchListMarginBottom(i2);
        }
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        float f;
        AbstractC156316Bn<T> abstractC156316Bn = this.LLIIII;
        if (abstractC156316Bn != null && abstractC156316Bn.getVisibility() == 0 && !abstractC156316Bn.getMIsEditing()) {
            abstractC156316Bn.LJLLJ = i;
            abstractC156316Bn.setSearchListMarginBottom(i);
            if (abstractC156316Bn.LJLJJI != null) {
                abstractC156316Bn.LJLJJLL.LJLJJI = (abstractC156316Bn.getWidth() - r4.getWidth()) / 2;
                abstractC156316Bn.LJLJJLL.LJLJJL = ((abstractC156316Bn.getHeight() - i) - r4.getHeight()) / 2;
            }
            abstractC156316Bn.LJLLI = false;
            if (abstractC156316Bn.LJLL) {
                return;
            }
            abstractC156316Bn.LJLL = true;
            int i2 = abstractC156316Bn.LJLLILLLL;
            if (i2 == 2) {
                abstractC156316Bn.LJLLILLLL = 0;
                AbstractC156406Bw<T> abstractC156406Bw = abstractC156316Bn.LJLJJI;
                if (abstractC156406Bw == null) {
                    return;
                }
                abstractC156406Bw.setVisibility(0);
                ALAdapterS1S0100000_2 aLAdapterS1S0100000_2 = new ALAdapterS1S0100000_2(abstractC156316Bn, 3);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(abstractC156406Bw, "scaleX", abstractC156316Bn.LJLJJL.LJLIL, abstractC156316Bn.LJLJJLL.LJLIL);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(abstractC156406Bw, "scaleY", abstractC156316Bn.LJLJJL.LJLILLLLZI, abstractC156316Bn.LJLJJLL.LJLILLLLZI);
                float[] fArr = new float[2];
                float f2 = abstractC156316Bn.LJLJJL.LJLJI;
                fArr[0] = f2;
                if (f2 > 180.0f) {
                    f = 360.0f;
                } else {
                    f = abstractC156316Bn.LJLJJLL.LJLJI;
                }
                fArr[1] = f;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(abstractC156406Bw, "rotation", fArr);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(abstractC156406Bw, "x", abstractC156316Bn.LJLJJL.LJLJJI, abstractC156316Bn.LJLJJLL.LJLJJI);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(abstractC156406Bw, "y", abstractC156316Bn.LJLJJL.LJLJJL, abstractC156316Bn.LJLJJLL.LJLJJL);
                AnimatorSet LIZ = C1DD.LIZ(300L);
                LIZ.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
                LIZ.addListener(aLAdapterS1S0100000_2);
                LIZ.start();
                abstractC156316Bn.LJLJL = LIZ;
                return;
            }
            if (i2 != 1) {
                return;
            }
            abstractC156316Bn.LJLLILLLL = 0;
            AbstractC156406Bw<T> abstractC156406Bw2 = abstractC156316Bn.LJLJJI;
            if (abstractC156406Bw2 == null) {
                return;
            }
            abstractC156406Bw2.setX(abstractC156316Bn.LJLJJLL.LJLJJI);
            abstractC156406Bw2.setY(abstractC156316Bn.LJLJJLL.LJLJJL);
            abstractC156406Bw2.setVisibility(0);
            abstractC156316Bn.requestLayout();
            ALAdapterS1S0100000_2 aLAdapterS1S0100000_22 = new ALAdapterS1S0100000_2(abstractC156316Bn, 4);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(abstractC156406Bw2, "scaleX", 0.0f, 1.0f);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(abstractC156406Bw2, "scaleY", 0.0f, 1.0f);
            AnimatorSet LIZ2 = C1DD.LIZ(300L);
            LIZ2.playTogether(ofFloat6, ofFloat7);
            LIZ2.addListener(aLAdapterS1S0100000_22);
            LIZ2.start();
        }
    }

    public AbstractC156286Bk(VideoPublishEditModel mModel, C82622Wbi diContainer) {
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(diContainer, "diContainer");
        this.LLI = mModel;
        this.LLIFFJFJJ = diContainer;
    }

    @Override // X.C6BL
    public final void LJIJ(Context context, FrameLayout frameLayout) {
        super.LJIJ(context, frameLayout);
        o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C83547Wqd c83547Wqd = new C83547Wqd((Activity) context, null);
        this.LLIIIILZ = c83547Wqd;
        c83547Wqd.LIZIZ(this);
        this.LJLJI = H7R.LJJJJI(this.LLI);
    }

    public final void LJJJ(C156426By c156426By, InteractStickerStruct interactStickerStruct) {
        NormalTrackTimeStamp LIZIZ;
        if (c156426By == null || interactStickerStruct == null || (LIZIZ = C164826dS.LIZIZ(interactStickerStruct)) == null) {
            return;
        }
        Point LJJI = LJJI(new PointF(LIZIZ.getX(), LIZIZ.getY()));
        PointF centerViewPoint = c156426By.getCenterViewPoint();
        float f = LJJI.x - centerViewPoint.x;
        float f2 = LJJI.y - centerViewPoint.y;
        Boolean bool = Boolean.FALSE;
        c156426By.LJIL(f, f2, bool);
        c156426By.LJIJJLI();
        c156426By.LJIJI(-LIZIZ.getRotation(), bool);
        Float scale = LIZIZ.getScale();
        o.LJII(scale, "null cannot be cast to non-null type kotlin.Float");
        c156426By.LJIJJ(scale.floatValue());
    }
}
