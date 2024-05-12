package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C145995oB;
import X.C150575vZ;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewSwapState;

/* loaded from: classes8.dex */
public class AqS7S0002000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;
    public int i1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS7S0002000_7 aqS7S0002000_7, Object obj) {
        EditAdjustClipsBottomViewState setStateImmediate = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return EditAdjustClipsBottomViewState.copy$default(setStateImmediate, aqS7S0002000_7.i0, aqS7S0002000_7.i1, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 131068, null);
    }

    public static final Object invoke$1(AqS7S0002000_7 aqS7S0002000_7, Object obj) {
        ChooseMediaState setState = (ChooseMediaState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, new PreviewSwapState(Integer.valueOf(aqS7S0002000_7.i0), Integer.valueOf(aqS7S0002000_7.i1), setState.getPreviewSwapState().getValue() + 1), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -65537, 7, null);
    }

    public static final Object invoke$2(AqS7S0002000_7 aqS7S0002000_7, Object obj) {
        String str;
        C145995oB mob = (C145995oB) obj;
        o.LJIIIZ(mob, "$this$mob");
        mob.LJI("action_method", "drag");
        if (aqS7S0002000_7.i0 > aqS7S0002000_7.i1) {
            str = "left";
        } else {
            str = "right";
        }
        mob.LJI("action_type", str);
        return mob;
    }

    public static final Object invoke$3(AqS7S0002000_7 aqS7S0002000_7, Object obj) {
        CutVideoPreviewState setState = (CutVideoPreviewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoPreviewState.copy$default(setState, null, null, new C150575vZ(new OSZ(Integer.valueOf(aqS7S0002000_7.i0), Integer.valueOf(aqS7S0002000_7.i1))), null, null, 27, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0002000_7(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i0 = i;
        this.i1 = i2;
    }
}
