package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment$onCommentEvent$1$1", f = "PostModeCommentListFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C181897Bx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PostModeCommentListFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C181897Bx(PostModeCommentListFragment postModeCommentListFragment, InterfaceC67352kd<? super C181897Bx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = postModeCommentListFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C181897Bx(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        View findViewById;
        boolean globalVisibleRect;
        C141335gf.LIZJ(obj);
        View view = this.LJLIL.LLLZIIL;
        if (view != null && (findViewById = view.findViewById(R.id.hp0)) != null) {
            if (!findViewById.isShown()) {
                globalVisibleRect = false;
            } else {
                globalVisibleRect = findViewById.getGlobalVisibleRect(new Rect());
            }
            PostModeCommentListFragment postModeCommentListFragment = this.LJLIL;
            if (!globalVisibleRect) {
                postModeCommentListFragment.op().LLIIL.setValue(new Integer(0));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
