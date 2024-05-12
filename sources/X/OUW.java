package X;

import Y.ALAdapterS8S0100000_10;
import android.animation.AnimatorSet;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OUW extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoRelationBtnAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final OUW LJLIL = new OUW();

    public OUW() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoRelationBtnAssem videoRelationBtnAssem, C43I<? extends Boolean> c43i) {
        Aweme aweme;
        User author;
        VideoRelationBtnAssem selectSubscribe = videoRelationBtnAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (selectSubscribe.LLFII != null && (aweme = selectSubscribe.LLIFFJFJJ) != null && (author = aweme.getAuthor()) != null && o.LJ(it.LIZ(), Boolean.TRUE)) {
            C239319aJ c239319aJ = selectSubscribe.LLFZ;
            if (c239319aJ != null) {
                c239319aJ.LJJI(author.getFollowStatus(), author.getFollowerStatus());
            }
            C239319aJ c239319aJ2 = selectSubscribe.LLFZ;
            if (c239319aJ2 != null) {
                c239319aJ2.setButtonVariant(2);
            }
            if (!C56602Ka.LIZIZ(selectSubscribe.LLIFFJFJJ) && selectSubscribe.LLIFFJFJJ != null && selectSubscribe.LLFII != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(C55953Lxd.LIZIZ());
                animatorSet.play(selectSubscribe.r4(0, selectSubscribe.LLFZ, selectSubscribe.LLIIII, selectSubscribe.LLII)).with(selectSubscribe.r4(2, selectSubscribe.LLI, 1.0f, 0.0f));
                animatorSet.start();
                selectSubscribe.q4("othershow", true);
            }
            if (selectSubscribe.LLIFFJFJJ != null && selectSubscribe.LLFII != null) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                View view = selectSubscribe.LLFII;
                VideoRelationBtnAssem.LLIILZL.getClass();
                animatorSet2.play(selectSubscribe.r4(1, view, ((Number) VideoRelationBtnAssem.LLILII.getValue()).floatValue(), 0.0f)).with(selectSubscribe.r4(2, selectSubscribe.LLFII, 1.0f, 0.0f));
                animatorSet2.setStartDelay(500L);
                animatorSet2.addListener(new ALAdapterS8S0100000_10(selectSubscribe, 0));
                animatorSet2.start();
            }
        }
        return C76800UCe.LIZ;
    }
}
