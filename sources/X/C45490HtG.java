package X;

import android.view.View;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.HtG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45490HtG extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C45473Hsz LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45490HtG(C45473Hsz c45473Hsz) {
        super(1100, 2);
        this.LJLJJLL = c45473Hsz;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        CreativeModel creativeModel;
        o.LJIIIZ(v, "v");
        ShortVideoContext shortVideoContext = this.LJLJJLL.LIZ;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            creativeModel.autoCutModel = new AutoCutModel(null, null, null, 0, 0, null, null, 0, false, null, null, null, null, null, null, null, null, 131071, null);
        }
        this.LJLJJLL.LJIL(v, false);
    }
}
