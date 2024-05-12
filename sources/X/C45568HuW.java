package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState;
import kotlin.jvm.internal.o;

/* renamed from: X.HuW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45568HuW extends AbstractC65781Prl implements InterfaceC88472Yns<ChooseMediaState, ChooseMediaState> {
    public static final C45568HuW LJLIL = new C45568HuW();

    public C45568HuW() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
        ChooseMediaState setState = chooseMediaState;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, MediaListState.copy$default(setState.getMediaListState(), setState.getMediaListState().getMediaList(), setState.getMediaListState().getValue() + 1, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -2, 7, null);
    }
}
