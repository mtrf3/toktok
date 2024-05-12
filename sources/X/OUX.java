package X;

import Y.ALAdapterS8S0100000_10;
import android.animation.AnimatorSet;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OUX extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoRelationBtnAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final OUX LJLIL = new OUX();

    public OUX() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoRelationBtnAssem videoRelationBtnAssem, C43I<? extends Boolean> c43i) {
        VideoRelationBtnAssem selectSubscribe = videoRelationBtnAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (selectSubscribe.LLIFFJFJJ != null && selectSubscribe.LLFII != null && o.LJ(it.LIZ(), Boolean.TRUE)) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(selectSubscribe.r4(0, selectSubscribe.LLFZ, selectSubscribe.LLIIII, selectSubscribe.LLII)).with(selectSubscribe.r4(0, selectSubscribe.LLI, selectSubscribe.LLIIII, 0.0f));
            animatorSet.addListener(new ALAdapterS8S0100000_10(selectSubscribe, 1));
            animatorSet.start();
            selectSubscribe.q4("othershow", true);
        }
        return C76800UCe.LIZ;
    }
}
