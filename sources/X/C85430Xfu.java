package X;

import android.content.Context;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.Xfu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85430Xfu extends C72300SZc {
    public final /* synthetic */ AddFeedToMixFragment LJLIL;

    @Override // X.C72300SZc
    public final void LJIIIIZZ() {
        C73305Spp c73305Spp = (C73305Spp) this.LJLIL._$_findCachedViewById(R.id.w4);
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    public C85430Xfu(AddFeedToMixFragment addFeedToMixFragment) {
        this.LJLIL = addFeedToMixFragment;
    }

    @Override // X.C72300SZc
    public final void LJI(Exception exc) {
        boolean z;
        Context context = this.LJLIL.getContext();
        if (context != null) {
            z = C48203Ivv.LJ(context);
        } else {
            z = true;
        }
        if (C42555Gn1.LIZ() && !z) {
            AddFeedToMixFragment addFeedToMixFragment = this.LJLIL;
            addFeedToMixFragment.LJLLILLLL = true;
            addFeedToMixFragment.xl();
            return;
        }
        C73305Spp c73305Spp = (C73305Spp) this.LJLIL._$_findCachedViewById(R.id.w4);
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIJ(c73306Spq, new AqS165S0100000_15(this.LJLIL, 832));
            c73305Spp.setStatus(c73306Spq);
        }
        C73305Spp c73305Spp2 = (C73305Spp) this.LJLIL._$_findCachedViewById(R.id.w4);
        if (c73305Spp2 == null) {
            return;
        }
        c73305Spp2.setVisibility(0);
    }
}
