package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Oal, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62179Oal extends GKC {
    public final com.ss.android.ugc.aweme.qna.model.Qna LJLILLLLZI;

    public C62179Oal(com.ss.android.ugc.aweme.qna.model.Qna qna) {
        this.LJLILLLLZI = qna;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Bundle bundle = new Bundle();
        bundle.putString("display_name", this.LJLILLLLZI.questionName);
        bundle.putLong("display_count", this.LJLILLLLZI.userCount);
        bundle.putString("enter_from", "qna");
        String string = sharePackage.extras.getString("enter_from");
        String string2 = sharePackage.extras.getString("enter_method");
        C62188Oau c62188Oau = new C62188Oau(51, String.valueOf(this.LJLILLLLZI.questionId), bundle);
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ != null) {
            C4LD.LIZ.LJJJI(LJJLIIIJ, sharePackage.itemType, c62188Oau, string, string2);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "qa_detail");
        c188727au.LJIIIZ("qr_code_type", "question");
        c188727au.LJ(this.LJLILLLLZI.questionId, "question_id");
        FMX.LJIIL("click_qr_code", c188727au.LIZ);
    }
}
