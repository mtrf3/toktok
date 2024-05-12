package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import kotlin.jvm.internal.o;

/* renamed from: X.GVw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41640GVw implements IDraftListener {
    public final /* synthetic */ C41641GVx LIZ;

    public C41640GVw(C41641GVx c41641GVx) {
        this.LIZ = c41641GVx;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onDeleted(AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
        if (TextUtils.equals(draft.LIZJ(), this.LIZ.LJZ.LIZJ())) {
            this.LIZ.LJLJI.LIZJ(false, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
        IDraftListener.DefaultImpls.onUpdated(this, updateParams);
    }
}
