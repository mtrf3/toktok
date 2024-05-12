package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.handler.GreenScreenReuseHandler;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ES0 {
    public final ActivityC45651qj LIZ;
    public final LifecycleOwner LIZIZ;
    public final ShortVideoContext LIZJ;
    public final TEZ LIZLLL;
    public final InterfaceC84497XEf LJ;
    public XKQ LJFF;
    public ES5 LJI;
    public UploadableDraftEffect LJII;
    public final ET4 LJIIIIZZ;
    public final ES8 LJIIIZ;
    public final C36443ERz LJIIJ;

    public final void LIZJ() {
        boolean z;
        Effect LLJJIJIIJIL;
        C15280iq.LJ("DiyProp", "onRecordStart()");
        XKQ xkq = this.LJFF;
        if (xkq != null && xkq.isActive()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (LLJJIJIIJIL = this.LIZLLL.LLJJIJIIJIL()) != null && V0N.LJJI(LLJJIJIIJIL)) {
            this.LJFF = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZIZ), EXT.LIZ, null, new ERK(this, this.LIZJ, null), 2);
        } else {
            this.LJFF = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZIZ), EXT.LIZ, null, new ERJ(this, this.LIZJ, null), 2);
        }
    }

    public static boolean LIZ(Effect isAMEMobileEffect) {
        o.LJIIIZ(isAMEMobileEffect, "$this$isAMEMobileEffect");
        if (isAMEMobileEffect.getSource() == 102) {
            return false;
        }
        if (V0N.LJJIIJ(isAMEMobileEffect) || DiyPropParser.LJII(isAMEMobileEffect)) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ(Effect effect) {
        Integer num;
        String localPath;
        if (!V0N.LJJI(effect)) {
            return false;
        }
        GreenScreenMaterial greenScreenMaterial = this.LIZJ.curGreenScreenMaterial;
        if (greenScreenMaterial != null) {
            num = Integer.valueOf(greenScreenMaterial.getType());
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 1) {
            return true;
        }
        GreenScreenMaterial greenScreenMaterial2 = this.LIZJ.curGreenScreenMaterial;
        if (greenScreenMaterial2 != null && (localPath = greenScreenMaterial2.getLocalPath()) != null && localPath.length() == 0) {
            return false;
        }
        return C45593Huv.LIZ();
    }

    public ES0(C29S activity, C46193IAz lifecycleOwner, ShortVideoContext shortVideoContext, TEZ stickerDataManager, InterfaceC84497XEf effectPlatform) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZ = activity;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = shortVideoContext;
        this.LIZLLL = stickerDataManager;
        this.LJ = effectPlatform;
        this.LJIIIIZZ = new ET4(effectPlatform);
        this.LJIIIZ = new ES8(new AqS172S0100000_6(this, 143), new AqS156S0100000_6(this, 161));
        new GreenScreenReuseHandler(lifecycleOwner, new AqS156S0100000_6(this, 162), shortVideoContext);
        this.LJIIJ = new C36443ERz(this);
    }
}
