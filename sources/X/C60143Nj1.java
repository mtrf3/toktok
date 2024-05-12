package X;

import Y.ARunnableS46S0100000_10;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment;
import org.json.JSONObject;

/* renamed from: X.Nj1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60143Nj1 extends C1CZ {
    public int LJLIL;
    public final /* synthetic */ T6D LJLILLLLZI;

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        C59232NMm vl;
        Fragment LJJIII = this.LJLILLLLZI.LJFF().LJJIII(i);
        if ((LJJIII instanceof CommerceChallengeFragment) && LJJIII != null) {
            new Handler().postDelayed(new ARunnableS46S0100000_10((CommerceChallengeFragment) LJJIII, 158), 100L);
        }
        Fragment LJJIII2 = this.LJLILLLLZI.LJFF().LJJIII(this.LJLIL);
        if ((LJJIII2 instanceof CommerceChallengeFragment) && LJJIII2 != null && (vl = ((CommerceChallengeFragment) LJJIII2).vl()) != null) {
            vl.LIZIZ("brand_room_left", new JSONObject());
        }
        this.LJLIL = i;
    }

    public C60143Nj1(C76732zl c76732zl, T6D t6d) {
        this.LJLILLLLZI = t6d;
        this.LJLIL = c76732zl.element;
    }
}
