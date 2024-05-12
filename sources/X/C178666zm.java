package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;

/* renamed from: X.6zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178666zm extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ CommonCommentKeyboard LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C178666zm(CommonCommentKeyboard commonCommentKeyboard, int i, float f) {
        super(0);
        this.LJLIL = commonCommentKeyboard;
        this.LJLILLLLZI = i;
        this.LJLJI = f;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        View containerView = this.LJLIL.getContainerView();
        int i = this.LJLILLLLZI;
        float f = this.LJLJI;
        if (C72704Sg8.LIZIZ(containerView, "context")) {
            if (i == 0) {
                containerView.setTranslationX(containerView.getMeasuredWidth() * f);
            } else {
                containerView.setTranslationX(containerView.getMeasuredWidth());
            }
        } else if (i == 0) {
            containerView.setTranslationX((-containerView.getMeasuredWidth()) * f);
        } else {
            containerView.setTranslationX(-containerView.getMeasuredWidth());
        }
        return C76800UCe.LIZ;
    }
}
