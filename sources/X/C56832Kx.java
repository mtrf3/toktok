package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.2Kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56832Kx implements InterfaceC56305M7x {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ Activity LIZJ;

    @Override // X.InterfaceC56305M7x
    public final void LIZ(int i, boolean z) {
        if (z) {
            if (i == 0) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("key_mix_add_aweme_info", this.LIZ);
                MixFeedService.LJJIJIIJIL().LJIILJJIL(this.LIZIZ, bundle, 3, "graphic_detail", "long_press");
                return;
            }
            MixFeedService.LJJIJIIJIL().LIZLLL(this.LIZJ, this.LIZ, "", "", "graphic_detail", "long_press");
            return;
        }
        C5S1 c5s1 = new C5S1(this.LIZIZ);
        c5s1.LIZJ(R.string.im9);
        c5s1.LJ();
    }

    public C56832Kx(Aweme aweme, ActivityC45651qj activityC45651qj, ActivityC45651qj activityC45651qj2) {
        this.LIZ = aweme;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = activityC45651qj2;
    }
}
