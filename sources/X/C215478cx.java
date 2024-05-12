package X;

import com.ss.android.ugc.aweme.DanmakuCreateEntranceAssem;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215478cx extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuCreateEntranceAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C215478cx LJLIL = new C215478cx();

    public C215478cx() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuCreateEntranceAssem danmakuCreateEntranceAssem, C43I<? extends Integer> c43i) {
        Aweme aweme;
        String str;
        DanmakuCreateEntranceAssem selectSubscribe = danmakuCreateEntranceAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            C62623Ohv c62623Ohv = C62623Ohv.LIZIZ;
            VideoItemParams gv0 = selectSubscribe.q4().gv0();
            Aweme aweme2 = null;
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            selectSubscribe.LLIIJI(c62623Ohv.LJIIIZ(aweme));
            DanmakuViewModel q4 = selectSubscribe.q4();
            q4.LJLLLLLL = true;
            q4.LJLLLL = false;
            C215488cy c215488cy = q4.LJLLL;
            if (c215488cy != null) {
                c215488cy.LJLILLLLZI = 0;
                c215488cy.LJLJI = 0;
                c215488cy.LJLJJLL.clear();
                c215488cy.LJLJJI = 0;
                c215488cy.LJLJJL = 0;
                c215488cy.LJLJL.clear();
            }
            if (selectSubscribe.F1()) {
                VideoItemParams gv02 = selectSubscribe.q4().gv0();
                if (gv02 != null) {
                    aweme2 = gv02.getAweme();
                }
                VideoItemParams gv03 = selectSubscribe.q4().gv0();
                if (gv03 == null || (str = gv03.mEventType) == null) {
                    str = "";
                }
                C214788bq.LIZIZ(aweme2, str, EnumC214808bs.ADD, EnumC214798br.VIDEO);
            }
        }
        return C76800UCe.LIZ;
    }
}
