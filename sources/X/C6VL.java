package X;

import Y.AObjectS120S0200000_2;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS35S0210000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6VL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VL implements C6VO {
    public C157766Hc LIZ;
    public final C6VM LIZIZ = new C6VM(null);

    @Override // X.C6VO
    public final void init() {
        C6YM.LIZ();
        C69B.LIZ();
        C69B.LIZJ();
    }

    @Override // X.C6VO
    public final C157766Hc LJ() {
        return this.LIZ;
    }

    @Override // X.C6VO
    public final void LIZJ(boolean z, AObjectS120S0200000_2 aObjectS120S0200000_2) {
        AqS133S0200000_2 aqS133S0200000_2 = new AqS133S0200000_2(this, aObjectS120S0200000_2, 141);
        C157766Hc c157766Hc = this.LIZ;
        if (c157766Hc != null) {
            if (z) {
                AqS168S0100000_2 aqS168S0100000_2 = c157766Hc.LJIILLIIL;
                if (aqS168S0100000_2 != null) {
                    aqS168S0100000_2.invoke(new AqS133S0200000_2(c157766Hc, aqS133S0200000_2, 102));
                }
            } else {
                c157766Hc.LJI().LJJIJL(false);
                aqS133S0200000_2.invoke(Boolean.TRUE);
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        aqS133S0200000_2.invoke(Boolean.TRUE);
    }

    @Override // X.C6VO
    public final void LIZLLL(C29S appCompatActivity, C6VK c6vk) {
        o.LJIIIZ(appCompatActivity, "appCompatActivity");
        C1554768h c1554768h = new C1554768h();
        c1554768h.LIZ = c6vk.LJII;
        C157766Hc c157766Hc = new C157766Hc(appCompatActivity, c6vk.LIZJ, c6vk.LIZLLL, c6vk.LJ, c6vk.LJFF, c1554768h);
        c157766Hc.LIZLLL(c6vk.LIZ, c6vk.LIZIZ, C48189Ivh.LJI(appCompatActivity), new AqS152S0100000_2(c6vk, c157766Hc, 982));
        c157766Hc.LJIIJJI.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ViewParent parent = c157766Hc.LJIIJJI.getParent();
        if (parent != null) {
            C16880lQ.LJLLL(c157766Hc.LJIIJJI, (ViewGroup) parent);
        }
        c157766Hc.LIZIZ.addView(c157766Hc.LJIIJJI);
        c157766Hc.LJIILL = new C6VM(c6vk.LJI);
        c157766Hc.LJI().LLIZ = c157766Hc.LJIILL;
        c157766Hc.LJIIZILJ = c157766Hc.LJIIZILJ;
        c157766Hc.LJIILLIIL = new AqS168S0100000_2(appCompatActivity, 622);
        this.LIZ = c157766Hc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if ((!kotlin.jvm.internal.o.LJ(r0.LLJJI, new X.C142485iW(r0.LJIILIIL(), r0.LLJILJILJ))) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    @Override // X.C6VO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.InterfaceC88472Yns r7, boolean r8) {
        /*
            r6 = this;
            kotlin.jvm.internal.AqS133S0200000_2 r3 = new kotlin.jvm.internal.AqS133S0200000_2
            r0 = 140(0x8c, float:1.96E-43)
            r3.<init>(r6, r7, r0)
            X.6Hc r5 = r6.LIZ
            if (r5 == 0) goto L42
            if (r8 != 0) goto L30
            X.67S r0 = r5.LJI()
            boolean r0 = r0.LJJIJLIJ()
            if (r0 == 0) goto L48
            X.67S r0 = r5.LJI()
            X.5iW r4 = r0.LLJJI
            X.5iW r2 = new X.5iW
            java.util.List r1 = r0.LJIILIIL()
            java.lang.String r0 = r0.LLJILJILJ
            r2.<init>(r1, r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L48
        L30:
            kotlin.jvm.internal.AqS168S0100000_2 r2 = r5.LJIILLIIL
            if (r2 == 0) goto L3e
            kotlin.jvm.internal.AqS133S0200000_2 r1 = new kotlin.jvm.internal.AqS133S0200000_2
            r0 = 101(0x65, float:1.42E-43)
            r1.<init>(r5, r3, r0)
            r2.invoke(r1)
        L3e:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L47
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.invoke(r0)
        L47:
            return
        L48:
            X.67S r1 = r5.LJI()
            r0 = 0
            r1.LJJIJL(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.invoke(r0)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6VL.LJFF(X.Yns, boolean):void");
    }

    @Override // X.C6VO
    public final void LIZ(VideoPublishEditModel baseShortVideoContext, EffectTextModel effectTextModel, boolean z, boolean z2, InterfaceC65784Pro interfaceC65784Pro) {
        boolean z3;
        boolean z4;
        Integer num;
        o.LJIIIZ(baseShortVideoContext, "baseShortVideoContext");
        AqS35S0210000_2 aqS35S0210000_2 = new AqS35S0210000_2(z2, (boolean) this, (C6VL) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 6);
        int[] LIZJ = C44526Hdi.LIZJ(baseShortVideoContext);
        C157766Hc c157766Hc = this.LIZ;
        Integer num2 = null;
        if (c157766Hc != null) {
            String LJIIJJI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIIJJI(baseShortVideoContext, "");
            OSZ<Integer, Integer> osz = new OSZ<>(Integer.valueOf(LIZJ[0]), Integer.valueOf(LIZJ[1]));
            if (baseShortVideoContext.creativeModel.editPostModel != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            GVN gvn = G9Z.LIZ;
            if (gvn != null) {
                num = gvn.LIZLLL;
            } else {
                num = null;
            }
            c157766Hc.LIZJ(effectTextModel, LJIIJJI, osz, z, z4, num, aqS35S0210000_2);
        }
        if (this.LIZ == null) {
            aqS35S0210000_2.invoke();
            C6VM c6vm = this.LIZIZ;
            if (baseShortVideoContext.creativeModel.editPostModel != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            GVN gvn2 = G9Z.LIZ;
            if (gvn2 != null) {
                num2 = gvn2.LIZLLL;
            }
            c6vm.LJII(new C6VN(z3, null, null, null, null, null, 0, z ? 1 : 0, 0, num2, 382));
        }
    }

    @Override // X.C6VO
    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel, int i, int i2, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        boolean z2;
        boolean z3;
        Integer num;
        AqS149S0200000_2 aqS149S0200000_2 = new AqS149S0200000_2(this, (C6VL) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 103);
        int[] iArr = new int[2];
        if (H7R.LJJJJL(videoPublishEditModel)) {
            iArr[0] = i;
            iArr[1] = i2;
        } else {
            C44526Hdi.LIZJ(videoPublishEditModel);
        }
        C157766Hc c157766Hc = this.LIZ;
        Integer num2 = null;
        if (c157766Hc != null) {
            EffectTextModel effectTextModel = videoPublishEditModel.getCoverPublishModel().getEffectTextModel();
            String LJIILIIL = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIILIIL(videoPublishEditModel, "");
            OSZ<Integer, Integer> osz = new OSZ<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            if (videoPublishEditModel.creativeModel.editPostModel != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            GVN gvn = G9Z.LIZ;
            if (gvn != null) {
                num = gvn.LIZLLL;
            } else {
                num = null;
            }
            c157766Hc.LIZJ(effectTextModel, LJIILIIL, osz, z, z3, num, aqS149S0200000_2);
        }
        if (this.LIZ == null) {
            aqS149S0200000_2.invoke();
            C6VM c6vm = this.LIZIZ;
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel != null && creativeModel.editPostModel != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            GVN gvn2 = G9Z.LIZ;
            if (gvn2 != null) {
                num2 = gvn2.LIZLLL;
            }
            c6vm.LJII(new C6VN(z2, null, null, null, null, null, 0, z ? 1 : 0, 0, num2, 382));
        }
    }
}
