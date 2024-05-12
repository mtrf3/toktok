package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C76800UCe;
import X.C78897Uxp;
import X.IDM;
import X.InterfaceC65784Pro;
import X.InterfaceC82199WNv;
import X.VN8;
import android.content.Intent;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import com.ss.android.ugc.gamora.recorder.voicechange.sticker.SVCStickerHandler;

/* loaded from: classes15.dex */
public class AqS81S1100000_14 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS81S1100000_14 aqS81S1100000_14) {
        SVCStickerHandler sVCStickerHandler = (SVCStickerHandler) aqS81S1100000_14.l1;
        sVCStickerHandler.LJLJJI = true;
        InterfaceC82199WNv interfaceC82199WNv = (InterfaceC82199WNv) sVCStickerHandler.LJLL.getValue();
        if (interfaceC82199WNv != null) {
            interfaceC82199WNv.sf(aqS81S1100000_14.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS81S1100000_14 aqS81S1100000_14) {
        Intent LIZIZ = ((BackgroundVideoStickerPresenter) aqS81S1100000_14.l1).LL.LIZIZ(aqS81S1100000_14.s0, null);
        ((BackgroundVideoStickerPresenter) aqS81S1100000_14.l1).LJZI.LIZ();
        ActivityC45651qj activityC45651qj = ((BackgroundVideoStickerPresenter) aqS81S1100000_14.l1).LJLLJ;
        IDM.LIZ().LIZ(((BackgroundVideoStickerPresenter) aqS81S1100000_14.l1).LJLLJ, LIZIZ);
        C78897Uxp.LJJJLZIJ(activityC45651qj, LIZIZ, new IDqS438S0100000_14(aqS81S1100000_14, 4));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS81S1100000_14 aqS81S1100000_14) {
        DiyPropVideoStickerHandler diyPropVideoStickerHandler = (DiyPropVideoStickerHandler) aqS81S1100000_14.l1;
        Intent LIZIZ = diyPropVideoStickerHandler.LJZ.LIZIZ(aqS81S1100000_14.s0, diyPropVideoStickerHandler.LLF.invoke(diyPropVideoStickerHandler.LJLJL));
        ActivityC45651qj activityC45651qj = ((DiyPropVideoStickerHandler) aqS81S1100000_14.l1).LJLL;
        IDM.LIZ().LIZ(((DiyPropVideoStickerHandler) aqS81S1100000_14.l1).LJLL, LIZIZ);
        C78897Uxp.LJJJLZIJ(activityC45651qj, LIZIZ, new IDqS438S0100000_14(aqS81S1100000_14, 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS81S1100000_14 aqS81S1100000_14) {
        ((VN8) aqS81S1100000_14.l1).LJLILLLLZI.LJII(aqS81S1100000_14.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS81S1100000_14(VN8 vn8, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = vn8;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS81S1100000_14(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = backgroundVideoStickerPresenter;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS81S1100000_14(DiyPropVideoStickerHandler diyPropVideoStickerHandler, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = diyPropVideoStickerHandler;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS81S1100000_14(SVCStickerHandler sVCStickerHandler, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = sVCStickerHandler;
        this.s0 = str;
    }
}
