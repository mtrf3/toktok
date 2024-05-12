package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import kotlin.jvm.internal.o;

/* renamed from: X.GVv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41639GVv implements IDraftListener {
    public final /* synthetic */ C41642GVy LIZ;

    public C41639GVv(C41642GVy c41642GVy) {
        this.LIZ = c41642GVy;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onDeleted(AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
        if (TextUtils.equals(draft.LIZJ(), this.LIZ.LJLJJLL.LIZJ())) {
            this.LIZ.LIZJ(false, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
        IDraftListener.DefaultImpls.onUpdated(this, updateParams);
    }
}
