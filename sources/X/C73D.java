package X;

import Y.AfS52S0200000_3;
import com.ss.android.ugc.now.interaction.api.InteractionApiService;
import com.ss.android.ugc.now.interaction.assem.CommentItem;
import com.ss.android.ugc.now.interaction.assem.CommentListVM;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.73D, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C73D extends TBS implements InterfaceC88472Yns<CommentItem, C76800UCe> {
    public C73D(CommentListVM commentListVM) {
        super(1, commentListVM, CommentListVM.class, "deleteComment", "deleteComment(Lcom/ss/android/ugc/now/interaction/assem/CommentItem;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(CommentItem commentItem) {
        CommentItem p0 = commentItem;
        o.LJIIIZ(p0, "p0");
        CommentListVM commentListVM = (CommentListVM) this.receiver;
        commentListVM.getClass();
        try {
            InteractionApiService.LIZIZ.deleteComment(p0.getComment().getCid()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS52S0200000_3(p0, commentListVM, 21), new InterfaceC64592gB() { // from class: X.73E
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            return C76800UCe.LIZ;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }
}
