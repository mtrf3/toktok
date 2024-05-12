package X;

import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.83e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2051083e extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDescAssem, C43I<? extends OSZ<? extends Aweme, ? extends PostModeEntranceMechanism>>, C76800UCe> {
    public static final C2051083e LJLIL = new C2051083e();

    public C2051083e() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDescAssem videoDescAssem, C43I<? extends OSZ<? extends Aweme, ? extends PostModeEntranceMechanism>> c43i) {
        String str;
        VideoDescAssem selectSubscribe = videoDescAssem;
        C43I<? extends OSZ<? extends Aweme, ? extends PostModeEntranceMechanism>> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            OSZ osz = (OSZ) c43i2.LIZ;
            Aweme aweme = (Aweme) osz.getFirst();
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            }
            if (o.LJ(str, str2)) {
                AssemViewModel assemViewModel = (AssemViewModel) selectSubscribe.LLIIIILZ.getValue();
                assemViewModel.getClass();
                assemViewModel.setState(new AqS169S0100000_3(osz, (OSZ<? extends InterfaceC65350Pko<? extends UISlotAssem>, Integer>) 904));
            }
        }
        return C76800UCe.LIZ;
    }
}
