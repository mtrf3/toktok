package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C150575vZ;
import X.C25848ACm;
import X.C76800UCe;
import X.C85799Xlr;
import X.C85800Xls;
import X.C85918Xnm;
import X.C85938Xo6;
import X.C86768Y3o;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.VIT;
import X.Y0Y;
import X.Y24;
import X.Y2B;
import X.Z9N;
import Y.ACListenerS35S0100000_15;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewState;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;

/* loaded from: classes16.dex */
public class AqS57S0110000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS57S0110000_15 aqS57S0110000_15, Object obj) {
        EditTextStickerViewState setStateImmediate = (EditTextStickerViewState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return EditTextStickerViewState.copy$default(setStateImmediate, null, false, null, null, new C150575vZ(new OSZ((TextStickerData) aqS57S0110000_15.l0, Boolean.valueOf(aqS57S0110000_15.z1))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17, 63, null);
    }

    public static final Object invoke$1(AqS57S0110000_15 aqS57S0110000_15, Object obj) {
        Aweme aweme;
        Fragment fragment;
        Y24 it = (Y24) obj;
        o.LJIIIZ(it, "it");
        if (it.LJLIL instanceof Y0Y) {
            if (aqS57S0110000_15.z1) {
                VIT.LIZ().LJIIJJI(aqS57S0110000_15.z1);
                TranslationStatusViewModel translationStatusViewModel = (TranslationStatusViewModel) aqS57S0110000_15.l0;
                translationStatusViewModel.LJLZ = true;
                translationStatusViewModel.LJZI = Y2B.LAND_ON_ITEM;
                translationStatusViewModel.onEvent(C86768Y3o.LIZIZ);
            } else {
                Z9N z9n = Z9N.LIZIZ;
                VideoItemParams gv0 = ((TranslationStatusViewModel) aqS57S0110000_15.l0).gv0();
                Context context = null;
                if (gv0 != null) {
                    aweme = gv0.getAweme();
                } else {
                    aweme = null;
                }
                VideoItemParams gv02 = ((TranslationStatusViewModel) aqS57S0110000_15.l0).gv0();
                if (gv02 != null && (fragment = gv02.fragment) != null) {
                    context = fragment.getContext();
                }
                if (z9n.LLJILLL(context, aweme)) {
                    TranslationStatusViewModel translationStatusViewModel2 = (TranslationStatusViewModel) aqS57S0110000_15.l0;
                    translationStatusViewModel2.LJLZ = false;
                    translationStatusViewModel2.onEvent(C86768Y3o.LIZIZ);
                } else {
                    TranslationStatusViewModel translationStatusViewModel3 = (TranslationStatusViewModel) aqS57S0110000_15.l0;
                    translationStatusViewModel3.setState(new AqS181S0100000_15(translationStatusViewModel3, 162));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS57S0110000_15 aqS57S0110000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C25848ACm.LJIILJJIL(((C85918Xnm) aqS57S0110000_15.l0).LJFF(), false, null, null, false, null, null, null, aqS57S0110000_15.z1, false, false, 63487);
    }

    public static final Object invoke$3(AqS57S0110000_15 aqS57S0110000_15, Object it) {
        ACListenerS35S0100000_15 aCListenerS35S0100000_15;
        o.LJIIIZ(it, "it");
        C25848ACm LJFF = ((C85918Xnm) aqS57S0110000_15.l0).LJFF();
        boolean z = aqS57S0110000_15.z1;
        if (z) {
            aCListenerS35S0100000_15 = ((C85918Xnm) aqS57S0110000_15.l0).LJLJLLL;
        } else {
            aCListenerS35S0100000_15 = null;
        }
        return C25848ACm.LJIILJJIL(LJFF, false, null, null, false, null, aCListenerS35S0100000_15, null, z, false, false, 63423);
    }

    public static final Object invoke$4(AqS57S0110000_15 aqS57S0110000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C25848ACm.LJIILJJIL(((C85938Xo6) aqS57S0110000_15.l0).LJFF(), aqS57S0110000_15.z1, null, null, false, null, null, null, false, false, false, 65534);
    }

    public static final Object invoke$5(AqS57S0110000_15 aqS57S0110000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C25848ACm.LJIILJJIL(((C85938Xo6) aqS57S0110000_15.l0).LJFF(), false, null, null, false, null, null, null, aqS57S0110000_15.z1, false, false, 63487);
    }

    public static final Object invoke$6(AqS57S0110000_15 aqS57S0110000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C25848ACm.LJIILJJIL(((C85938Xo6) aqS57S0110000_15.l0).LJFF(), false, null, null, aqS57S0110000_15.z1, null, null, null, false, false, false, 65527);
    }

    public static final Object invoke$7(AqS57S0110000_15 aqS57S0110000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C85800Xls.LIZJ(((C85799Xlr) aqS57S0110000_15.l0).LJFF(), 0, null, 0, null, aqS57S0110000_15.z1, 767);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0110000_15(C85799Xlr c85799Xlr, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c85799Xlr;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0110000_15(C85918Xnm c85918Xnm, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c85918Xnm;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0110000_15(C85938Xo6 c85938Xo6, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c85938Xo6;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0110000_15(TextStickerData textStickerData, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = textStickerData;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0110000_15(boolean z, TranslationStatusViewModel translationStatusViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = translationStatusViewModel;
    }
}
