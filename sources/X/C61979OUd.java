package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.OUd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61979OUd extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoRelationBtnAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C61979OUd LJLIL = new C61979OUd();

    public C61979OUd() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoRelationBtnAssem videoRelationBtnAssem, C43I<? extends Integer> c43i) {
        View view;
        boolean kv0;
        VideoRelationBtnAssem selectSubscribe = videoRelationBtnAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if ((!C53324KwK.LIZ() || c43i != null) && selectSubscribe.u4().LJLJLLL != null && (((view = selectSubscribe.LLFII) == null || view.getVisibility() != 0) && (kv0 = selectSubscribe.u4().kv0(selectSubscribe.u4().LJLJLLL)))) {
            selectSubscribe.u4().mv0(kv0);
        }
        return C76800UCe.LIZ;
    }
}
