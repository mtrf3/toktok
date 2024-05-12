package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalInnerContainer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K0X implements InterfaceC1794272k {
    public final /* synthetic */ SearchHorizontalInnerContainer LIZ;
    public final /* synthetic */ C49217JTh LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1794272k
    public final void LIZ(Comment comment) {
        o.LJIIIZ(comment, "comment");
        View view = this.LIZ.itemView;
        o.LJIIIIZZ(view, "this@SearchHorizontalInnerContainer.itemView");
        C26045AKb c26045AKb = new C26045AKb(view);
        c26045AKb.LJIIIIZZ(R.string.dl4);
        c26045AKb.LJIIJ();
        CompletionBlock<K8S> completionBlock = this.LIZIZ.LJLILLLLZI;
        if (completionBlock != 0) {
            XBaseModel LIZJ = ED5.LIZJ(K8S.class, null);
            K8S k8s = (K8S) LIZJ;
            k8s.setCommentStr(comment.getText());
            k8s.setCommentID(comment.getCid());
            completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
        }
    }

    public K0X(SearchHorizontalInnerContainer searchHorizontalInnerContainer, C49217JTh c49217JTh) {
        this.LIZ = searchHorizontalInnerContainer;
        this.LIZIZ = c49217JTh;
    }

    @Override // X.InterfaceC1794272k
    public final void LIZIZ(Exception exc, String extraData) {
        o.LJIIIZ(extraData, "extraData");
        CompletionBlock<K8S> completionBlock = this.LIZIZ.LJLILLLLZI;
        if (completionBlock != null) {
            C31626Cb8.LIZ(completionBlock, 0, String.valueOf(exc), 4);
        }
    }
}
