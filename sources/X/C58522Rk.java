package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.2Rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58522Rk implements InterfaceC56305M7x {
    public final /* synthetic */ C200987ug LIZ;
    public final /* synthetic */ Activity LIZIZ;

    public C58522Rk(C200987ug c200987ug, Activity activity) {
        this.LIZ = c200987ug;
        this.LIZIZ = activity;
    }

    @Override // X.InterfaceC56305M7x
    public final void LIZ(int i, boolean z) {
        if (z) {
            if (i == 0) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("key_mix_add_aweme_info", this.LIZ.LIZ);
                MixFeedService.LJJIJIIJIL().LJIILJJIL(this.LIZ.LIZJ, bundle, 3, "graphic_detail", "long_press");
                return;
            }
            MixFeedService.LJJIJIIJIL().LIZLLL(this.LIZIZ, this.LIZ.LIZ, "", "", "graphic_detail", "long_press");
            return;
        }
        C5S1 c5s1 = new C5S1(this.LIZ.LIZJ);
        c5s1.LIZJ(R.string.im9);
        c5s1.LJ();
    }
}
