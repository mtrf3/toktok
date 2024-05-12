package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C04270Et;
import X.C08630Vn;
import X.C45296Hq8;
import X.C45927I0t;
import X.C76800UCe;
import X.C85871Xn1;
import X.InterfaceC41771GaN;
import X.InterfaceC88472Yns;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;

/* loaded from: classes8.dex */
public class AqS31S0001000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

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
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0001000_7(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS31S0001000_7 aqS31S0001000_7, Object obj) {
        InterfaceC41771GaN invokeCallback = (InterfaceC41771GaN) obj;
        o.LJIIIZ(invokeCallback, "$this$invokeCallback");
        invokeCallback.onProgress(aqS31S0001000_7.i0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS31S0001000_7 aqS31S0001000_7, Object obj) {
        C45296Hq8 setState = (C45296Hq8) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C45296Hq8.LIZ(setState, null, null, null, false, false, aqS31S0001000_7.i0, null, false, 223);
    }

    public static final Object invoke$2(AqS31S0001000_7 aqS31S0001000_7, Object obj) {
        C85871Xn1 setState = (C85871Xn1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C85871Xn1.LIZ(setState, null, new C08630Vn(Integer.valueOf(aqS31S0001000_7.i0)), false, null, null, null, null, null, 253);
    }

    public static final Object invoke$3(AqS31S0001000_7 aqS31S0001000_7, Object obj) {
        EditAdjustClipsBottomViewState setStateImmediate = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return EditAdjustClipsBottomViewState.copy$default(setStateImmediate, 0, 0, 0, aqS31S0001000_7.i0, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063, null);
    }

    public static final Object invoke$4(AqS31S0001000_7 aqS31S0001000_7, Object obj) {
        EditAdjustClipsBottomViewState setStateImmediate = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return EditAdjustClipsBottomViewState.copy$default(setStateImmediate, 0, 0, aqS31S0001000_7.i0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 131067, null);
    }

    public static final Object invoke$5(AqS31S0001000_7 aqS31S0001000_7, Object obj) {
        EditAdjustClipsBottomViewState setState = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EditAdjustClipsBottomViewState.copy$default(setState, 0, 0, 0, 0, null, null, null, Integer.valueOf(aqS31S0001000_7.i0), null, null, null, null, null, null, null, null, null, 130943, null);
    }

    public static final Object invoke$6(AqS31S0001000_7 aqS31S0001000_7, Object obj) {
        boolean z;
        AnchorPublishStruct it = (AnchorPublishStruct) obj;
        o.LJIIIZ(it, "it");
        if (it.type == aqS31S0001000_7.i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$7(AqS31S0001000_7 aqS31S0001000_7, Object obj) {
        ImageView iv = (ImageView) obj;
        o.LJIIIZ(iv, "iv");
        iv.setImageDrawable(C04270Et.LIZIZ(iv.getContext(), aqS31S0001000_7.i0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS31S0001000_7 aqS31S0001000_7, Object obj) {
        ChangeDuetLayoutState setState = (ChangeDuetLayoutState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChangeDuetLayoutState.copy$default(setState, null, new C45927I0t(Integer.valueOf(aqS31S0001000_7.i0)), null, 5, null);
    }
}
