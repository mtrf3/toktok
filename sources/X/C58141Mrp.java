package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.kids.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.kids.profile.api.IProfileService;

/* renamed from: X.Mrp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58141Mrp extends AbstractC65781Prl implements InterfaceC65784Pro<Fragment> {
    public static final C58141Mrp LJLIL = new C58141Mrp();

    public C58141Mrp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Fragment invoke() {
        IProfileService iProfileService;
        Object LIZ = C58096Mr6.LIZ(IProfileService.class, false);
        if (LIZ != null) {
            iProfileService = (IProfileService) LIZ;
        } else {
            if (C58096Mr6.O1 == null) {
                synchronized (IProfileService.class) {
                    if (C58096Mr6.O1 == null) {
                        C58096Mr6.O1 = new ProfileServiceImpl();
                    }
                }
            }
            iProfileService = C58096Mr6.O1;
        }
        return iProfileService.LIZ();
    }
}
