package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MH4 implements IChallengeDetailService {
    public static final MH4 LIZJ = new MH4();
    public final /* synthetic */ IChallengeDetailService LIZIZ = ChallengeDetailServiceImpl.LIZLLL();

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final Fragment LIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        return this.LIZIZ.LIZ(intent);
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final void LIZIZ(AbstractC51036K1g<Aweme, ?> abstractC51036K1g, List<? extends Aweme> list) {
        this.LIZIZ.LIZIZ(abstractC51036K1g, list);
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final AbstractC51036K1g<Aweme, ?> LIZJ() {
        return this.LIZIZ.LIZJ();
    }
}
