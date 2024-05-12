package X;

import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.search.detail.shoot.ui.SearchInflowMusicShootButtonAssem;
import com.zhiliaoapp.musically.R;

/* renamed from: X.KLk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51560KLk extends C98T {
    public final /* synthetic */ SearchInflowMusicShootButtonAssem LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51560KLk(SearchInflowMusicShootButtonAssem searchInflowMusicShootButtonAssem) {
        super(300L);
        this.LJLJJL = searchInflowMusicShootButtonAssem;
    }

    @Override // X.C98T
    public final void LIZ(View view) {
        if (view != null) {
            Object value = this.LJLJJL.LLFII.getValue();
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LJLJJL);
            Fragment LJIIIZ = C55096Ljo.LJIIIZ(this.LJLJJL);
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLJJL)).getAweme();
            String str = ((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLJJL)).mEventType;
            value.getClass();
            if (LJIIIIZZ != null && MSAdaptionService.LJIIL().LJI(LJIIIIZZ)) {
                C16880lQ.LLZILL(Toast.makeText(LJIIIIZZ, LJIIIIZZ.getString(R.string.f1i), 0));
            } else {
                MEW.LIZ(LJIIIIZZ, LJIIIZ, aweme, str, 2);
            }
        }
    }
}
