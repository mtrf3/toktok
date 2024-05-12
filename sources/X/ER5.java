package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ER5 implements ERB {
    public final WLT LIZ;
    public final ER6 LIZIZ;

    @Override // X.ERB
    public final UploadableMobileEffect2 LIZ(List<UploadableMobileEffect2> exportEffects) {
        o.LJIIIZ(exportEffects, "exportEffects");
        return null;
    }

    public ER5(WLT cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZ = cameraApiComponent;
        this.LIZIZ = new ER6();
    }

    @Override // X.ERB
    public final ERF LIZJ(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2) {
        FaceStickerBean faceStickerBean;
        AqS156S0100000_6 aqS156S0100000_6 = new AqS156S0100000_6(this, 153);
        if (o.LJ("recordStop", V3N.LJII(effect.getSdk_extra(), "exportTiming"))) {
            return new ERF(aqS156S0100000_6, 1, C56509MFt.LIZJ(effect, uploadableMobileEffect2));
        }
        if (((Boolean) aqS156S0100000_6.invoke()).booleanValue()) {
            faceStickerBean = C56509MFt.LIZJ(effect, uploadableMobileEffect2);
        } else {
            faceStickerBean = FaceStickerBean.NONE;
        }
        return new ERF(aqS156S0100000_6, 0, faceStickerBean);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.ERB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r12, com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2 r13, X.InterfaceC67352kd r14) {
        /*
            r11 = this;
            r6 = r12
            r9 = r13
            boolean r0 = r14 instanceof X.ER4
            if (r0 == 0) goto L62
            r4 = r14
            X.ER4 r4 = (X.ER4) r4
            int r2 = r4.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r4.LJLJJLL = r2
        L14:
            java.lang.Object r8 = r4.LJLJJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJLL
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 == r0) goto L28
            if (r1 != r2) goto L68
            X.C141335gf.LIZJ(r8)
        L25:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L28:
            com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2 r9 = r4.LJLJI
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r4.LJLILLLLZI
            X.ER5 r7 = r4.LJLIL
            X.C141335gf.LIZJ(r8)
            goto L49
        L32:
            X.C141335gf.LIZJ(r8)
            r4.LJLIL = r11
            r4.LJLILLLLZI = r6
            r4.LJLJI = r9
            r4.LJLJJLL = r0
            r1 = 1280(0x500, float:1.794E-42)
            r0 = 720(0x2d0, float:1.009E-42)
            java.lang.Object r8 = X.C84005Wy1.LIZ(r0, r1, r4)
            if (r8 != r3) goto L48
            return r3
        L48:
            r7 = r11
        L49:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            X.XIA r0 = X.C78613UtF.LIZJ
            X.ER2 r5 = new X.ER2
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LJLIL = r10
            r4.LJLILLLLZI = r10
            r4.LJLJI = r10
            r4.LJLJJLL = r2
            java.lang.Object r0 = X.XKX.LJI(r0, r5, r4)
            if (r0 != r3) goto L25
            return r3
        L62:
            X.ER4 r4 = new X.ER4
            r4.<init>(r11, r14)
            goto L14
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ER5.LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2, X.2kd):java.lang.Object");
    }

    @Override // X.ERB
    public final Object LIZLLL(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        this.LIZIZ.LJLIL.setValue(Boolean.FALSE);
        Object LJI = XKX.LJI(C78613UtF.LIZJ, new ER1(effect, uploadableMobileEffect2, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.ERB
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        this.LIZIZ.onMessageReceived(i, i2, i3, str);
    }
}
