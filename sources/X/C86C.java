package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.86C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86C extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoAuthorInfoRelationAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C86C LJLIL = new C86C();

    public C86C() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, C43I<? extends Integer> c43i) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        VideoAuthorInfoRelationAssem selectSubscribe = videoAuthorInfoRelationAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)) != null && (aweme = videoItemParams.getAweme()) != null) {
            if (selectSubscribe.LLIIIL.keySet().contains(aweme.getAid())) {
                VideoAuthorInfoVM q4 = selectSubscribe.q4();
                String str = selectSubscribe.LLIIIL.get(aweme.getAid());
                if (str == null) {
                    str = "";
                }
                q4.kv0(aweme, str);
            } else if (TextUtils.isEmpty(selectSubscribe.LLIIIILZ)) {
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "aid");
                selectSubscribe.LLIIIILZ = aid;
            }
        }
        return C76800UCe.LIZ;
    }
}
