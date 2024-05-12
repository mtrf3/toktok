package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;

/* loaded from: classes8.dex */
public class AqS2S0000001_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S0000001_7(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AqS2S0000001_7 aqS2S0000001_7, Object obj) {
        CutVideoBottomBarState setState = (CutVideoBottomBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoBottomBarState.copy$default(setState, Float.valueOf(aqS2S0000001_7.f0), null, null, null, null, null, null, null, 254, null);
    }

    public static final Object invoke$1(AqS2S0000001_7 aqS2S0000001_7, Object obj) {
        EditAdjustClipsBottomViewState setState = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EditAdjustClipsBottomViewState.copy$default(setState, 0, 0, 0, 0, null, null, Float.valueOf(aqS2S0000001_7.f0), null, null, null, null, null, null, null, null, null, null, 131007, null);
    }

    public static final Object invoke$2(AqS2S0000001_7 aqS2S0000001_7, Object obj) {
        EditAdjustClipsBottomViewState setState = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EditAdjustClipsBottomViewState.copy$default(setState, 0, 0, 0, 0, null, Float.valueOf(aqS2S0000001_7.f0), null, null, null, null, null, null, null, null, null, null, null, 131039, null);
    }
}
