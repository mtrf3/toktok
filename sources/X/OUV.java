package X;

import Y.ARunnableS29S0200000_10;
import Y.ARunnableS46S0100000_10;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OUV extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoRelationBtnAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final OUV LJLIL = new OUV();

    public OUV() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoRelationBtnAssem videoRelationBtnAssem, C43I<? extends Boolean> c43i) {
        User author;
        VideoRelationBtnAssem selectSubscribe = videoRelationBtnAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        Boolean LIZ = it.LIZ();
        if (LIZ != null) {
            boolean booleanValue = LIZ.booleanValue();
            Aweme aweme = selectSubscribe.LLIFFJFJJ;
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                if (booleanValue) {
                    selectSubscribe.getContainerView().post(new ARunnableS29S0200000_10(selectSubscribe, author, 3));
                    selectSubscribe.z4(false);
                } else {
                    selectSubscribe.getContainerView().post(new ARunnableS46S0100000_10(selectSubscribe, 8));
                    View view = selectSubscribe.LLFII;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    C239319aJ c239319aJ = selectSubscribe.LLFZ;
                    if (c239319aJ != null) {
                        c239319aJ.setVisibility(8);
                    }
                    SY4 sy4 = selectSubscribe.LLI;
                    if (sy4 != null) {
                        sy4.setVisibility(8);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
