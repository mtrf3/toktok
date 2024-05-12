package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7ON, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7ON extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCommentAssem, C174046sK, C76800UCe> {
    public static final C7ON LJLIL = new C7ON();

    public C7ON() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, C174046sK c174046sK) {
        Integer num;
        Object[] objArr;
        VideoCommentAssem selectSubscribeOnAsync = videoCommentAssem;
        C174046sK c174046sK2 = c174046sK;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        Integer[] numArr = {3, 4};
        Object obj = null;
        if (c174046sK2 != null) {
            num = Integer.valueOf(c174046sK2.LJLIL);
        } else {
            num = null;
        }
        if (ORY.LJJIJIIJIL(num, numArr)) {
            if (c174046sK2 != null) {
                obj = c174046sK2.LJLILLLLZI;
            }
            if ((obj instanceof Object[]) && (objArr = (Object[]) obj) != null && objArr.length == 2) {
                VideoCommentVM u4 = selectSubscribeOnAsync.u4();
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme();
                u4.getClass();
                u4.setState(new AqS134S0200000_3(u4, aweme, 243));
            }
        }
        if (c174046sK2 != null && c174046sK2.LJLIL == 8) {
            Object obj2 = c174046sK2.LJLILLLLZI;
            if ((obj2 instanceof String) && o.LJ(obj2, ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme().getAid())) {
                VideoCommentVM u42 = selectSubscribeOnAsync.u4();
                Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme();
                u42.getClass();
                u42.setState(new AqS134S0200000_3(u42, aweme2, 243));
                VideoCommentVM u43 = selectSubscribeOnAsync.u4();
                u43.getClass();
                u43.setState(new AqS169S0100000_3(u43, 829));
            }
        }
        return C76800UCe.LIZ;
    }
}
