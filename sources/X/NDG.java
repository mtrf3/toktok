package X;

import android.graphics.PointF;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NDG extends F9E {
    public final /* synthetic */ int LJLIL = 0;
    public final Object LJLILLLLZI;
    public final Object LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
            case 1:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
            case 2:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
            default:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
        }
    }

    public NDG(AwemeDraft draft, GLI extraInfo) {
        o.LJIIIZ(draft, "draft");
        o.LJIIIZ(extraInfo, "extraInfo");
        this.LJLILLLLZI = draft;
        this.LJLJI = extraInfo;
    }

    public NDG(String pageSessionId, String pageName) {
        o.LJIIIZ(pageSessionId, "pageSessionId");
        o.LJIIIZ(pageName, "pageName");
        this.LJLILLLLZI = pageSessionId;
        this.LJLJI = pageName;
    }

    public NDG(C58958NBy c58958NBy, PointF pointF) {
        this.LJLILLLLZI = c58958NBy;
        this.LJLJI = pointF;
    }

    public NDG(AbstractC83672Wse abstractC83672Wse, Cert cert) {
        this.LJLILLLLZI = abstractC83672Wse;
        this.LJLJI = cert;
    }
}
