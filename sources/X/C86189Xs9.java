package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Xs9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C86189Xs9 extends TBS implements InterfaceC88472Yns<Aweme, C76800UCe> {
    public C86189Xs9(Object obj) {
        super(1, obj, TranslationStatusViewModel.class, "onPrefetchCompleted", "onPrefetchCompleted(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Aweme aweme) {
        String str;
        Aweme aweme2;
        Aweme p0 = aweme;
        o.LJIIIZ(p0, "p0");
        TranslationStatusViewModel translationStatusViewModel = (TranslationStatusViewModel) this.receiver;
        translationStatusViewModel.getClass();
        String aid = p0.getAid();
        VideoItemParams gv0 = translationStatusViewModel.gv0();
        if (gv0 != null && (aweme2 = gv0.getAweme()) != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (o.LJ(aid, str)) {
            boolean ov0 = translationStatusViewModel.ov0();
            translationStatusViewModel.tv0(false, ov0, ov0);
        }
        return C76800UCe.LIZ;
    }
}
