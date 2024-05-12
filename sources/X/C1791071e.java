package X;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.mention.service.IMentionDataService;
import com.ss.android.ugc.aweme.mention.service.MentionDataServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.71e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1791071e implements IMentionDataService {
    public static final C1791071e LIZIZ = new C1791071e();
    public final /* synthetic */ IMentionDataService LIZ;

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final void LIZ(int i, Editable editable) {
        this.LIZ.LIZ(i, editable);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final String LIZIZ(int i, Editable editable, boolean z) {
        return this.LIZ.LIZIZ(i, editable, z);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final void LIZLLL(java.util.Set<String> set) {
        this.LIZ.LIZLLL(set);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final void LJ(Context context, Fragment fragment, java.util.Set set, ViewOnClickListenerC1790971d viewOnClickListenerC1790971d, C70C c70c, C70E c70e, C70F c70f) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LJ(context, fragment, set, viewOnClickListenerC1790971d, c70c, c70e, c70f);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final void LJFF(C8W2 lifeCycle) {
        o.LJIIIZ(lifeCycle, "lifeCycle");
        this.LIZ.LJFF(lifeCycle);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final User LJI(Intent intent) {
        return this.LIZ.LJI(intent);
    }

    public C1791071e() {
        IMentionDataService iMentionDataService;
        Object LIZ = C58096Mr6.LIZ(IMentionDataService.class, false);
        if (LIZ != null) {
            iMentionDataService = (IMentionDataService) LIZ;
        } else {
            if (C58096Mr6.J2 == null) {
                synchronized (IMentionDataService.class) {
                    if (C58096Mr6.J2 == null) {
                        C58096Mr6.J2 = new MentionDataServiceImpl();
                    }
                }
            }
            iMentionDataService = C58096Mr6.J2;
        }
        this.LIZ = iMentionDataService;
    }
}
