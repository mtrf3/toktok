package kotlin.jvm.internal;

import X.AbstractC143185je;
import X.AbstractC65781Prl;
import X.C142295iD;
import X.C164066cE;
import X.C45470Hsw;
import X.C45507HtX;
import X.C48841JEv;
import X.C62814Ol0;
import X.C76800UCe;
import X.C78613UtF;
import X.HI4;
import X.HIC;
import X.HO7;
import X.InterfaceC147355qN;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.XIC;
import X.XKX;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;

/* loaded from: classes8.dex */
public class AqS20S0310000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS20S0310000_7 aqS20S0310000_7, Object obj) {
        HIC json = (HIC) obj;
        o.LJIIIZ(json, "$this$json");
        json.LIZ(C62814Ol0.LJJII(new AqS12S0010000_7(aqS20S0310000_7.z3, 12)), "prepare_source");
        json.LIZ(C62814Ol0.LJJII(new AqS29S0210000_7(aqS20S0310000_7.z3, (VideoPublishEditModel) aqS20S0310000_7.l0, (InterfaceC147355qN) aqS20S0310000_7.l1, 2)), "render");
        json.LIZ(C62814Ol0.LJJII(new AqS173S0100000_7((HI4) aqS20S0310000_7.l2, 171)), "compile");
        json.LIZ(C62814Ol0.LJJII(new AqS173S0100000_7((HI4) aqS20S0310000_7.l2, 172)), "save");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS20S0310000_7 aqS20S0310000_7, Object obj) {
        HIC json = (HIC) obj;
        o.LJIIIZ(json, "$this$json");
        json.LIZ(C62814Ol0.LJJII(new AqS20S0310000_7(aqS20S0310000_7.z3, (VideoPublishEditModel) aqS20S0310000_7.l0, (InterfaceC147355qN) aqS20S0310000_7.l1, (HI4) aqS20S0310000_7.l2, 0)), "output");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS20S0310000_7 aqS20S0310000_7, Object obj) {
        C164066cE c164066cE;
        Bitmap bitmap = (Bitmap) obj;
        InterfaceC92693kP interfaceC92693kP = ((C45507HtX) aqS20S0310000_7.l0).LJZ;
        if (interfaceC92693kP != null) {
            if (!interfaceC92693kP.isDisposed()) {
                interfaceC92693kP.dispose();
            }
            ((C45507HtX) aqS20S0310000_7.l0).LJZ = null;
        }
        if (bitmap != null) {
            ((C45470Hsw) ((HO7) aqS20S0310000_7.l1)).LIZ();
            if (aqS20S0310000_7.z3 && ((MyMediaModel) aqS20S0310000_7.l2).LJ()) {
                if (bitmap.getWidth() / bitmap.getHeight() > 0.5625d && (c164066cE = ((C45507HtX) aqS20S0310000_7.l0).LJLIL) != null) {
                    MyMediaModel mediaModel = (MyMediaModel) aqS20S0310000_7.l2;
                    o.LJIIIZ(mediaModel, "mediaModel");
                    XIC xic = C78613UtF.LIZ;
                    XKX.LIZLLL(C48841JEv.LIZ(xic), null, null, new C142295iD(bitmap, mediaModel, c164066cE, null), 3).LIZIZ(null);
                    XKX.LIZLLL(C48841JEv.LIZ(xic), null, null, new C142295iD(bitmap, mediaModel, c164066cE, null), 3);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S0310000_7(C45507HtX c45507HtX, C45470Hsw c45470Hsw, boolean z, MyMediaModel myMediaModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c45507HtX;
        this.l1 = c45470Hsw;
        this.z3 = z;
        this.l2 = myMediaModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S0310000_7(boolean z, VideoPublishEditModel videoPublishEditModel, AbstractC143185je abstractC143185je, HI4 hi4, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l0 = videoPublishEditModel;
        this.l1 = abstractC143185je;
        this.l2 = hi4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S0310000_7(boolean z, VideoPublishEditModel videoPublishEditModel, InterfaceC147355qN interfaceC147355qN, HI4 hi4, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l0 = videoPublishEditModel;
        this.l1 = interfaceC147355qN;
        this.l2 = hi4;
    }
}
