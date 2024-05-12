package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.mention.service.IMentionViewService;
import com.ss.android.ugc.aweme.mention.service.MentionViewServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.8WN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8WN implements IMentionViewService {
    public static final C8WN LIZIZ = new C8WN();
    public final /* synthetic */ IMentionViewService LIZ;

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final void LIZJ(boolean z) {
        this.LIZ.LIZJ(z);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final C6CL LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final void LJ(int i) {
        this.LIZ.LJ(i);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final void LJFF(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LJFF(fragment);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final View LJI(Context context, ViewGroup container, C70R c70r) {
        o.LJIIIZ(container, "container");
        return this.LIZ.LJI(context, container, c70r);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final void LJII(Context context) {
        this.LIZ.LJII(context);
    }

    public C8WN() {
        IMentionViewService iMentionViewService;
        Object LIZ = C58096Mr6.LIZ(IMentionViewService.class, false);
        if (LIZ != null) {
            iMentionViewService = (IMentionViewService) LIZ;
        } else {
            if (C58096Mr6.K2 == null) {
                synchronized (IMentionViewService.class) {
                    if (C58096Mr6.K2 == null) {
                        C58096Mr6.K2 = new MentionViewServiceImpl();
                    }
                }
            }
            iMentionViewService = C58096Mr6.K2;
        }
        this.LIZ = iMentionViewService;
    }
}
