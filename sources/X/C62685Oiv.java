package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IInboxRepostFeedService;
import com.ss.android.ugc.aweme.InboxRepostFeedServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oiv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62685Oiv implements IInboxRepostFeedService {
    public static final C62685Oiv LIZIZ = new C62685Oiv();
    public final /* synthetic */ IInboxRepostFeedService LIZ;

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final List<String> LIZLLL(int i) {
        return this.LIZ.LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LJ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJFF() {
        this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJI() {
        this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final boolean LJII(int i) {
        return this.LIZ.LJII(i);
    }

    public C62685Oiv() {
        IInboxRepostFeedService iInboxRepostFeedService;
        Object LIZ = C58096Mr6.LIZ(IInboxRepostFeedService.class, false);
        if (LIZ != null) {
            iInboxRepostFeedService = (IInboxRepostFeedService) LIZ;
        } else {
            if (C58096Mr6.LJJLIIIJILLIZJL == null) {
                synchronized (IInboxRepostFeedService.class) {
                    if (C58096Mr6.LJJLIIIJILLIZJL == null) {
                        C58096Mr6.LJJLIIIJILLIZJL = new InboxRepostFeedServiceImpl();
                    }
                }
            }
            iInboxRepostFeedService = C58096Mr6.LJJLIIIJILLIZJL;
        }
        this.LIZ = iInboxRepostFeedService;
    }
}
