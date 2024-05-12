package X;

import android.view.View;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Lpo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55468Lpo {
    public final View LIZ;
    public final EdgeSpeedupAbility LIZIZ;
    public final C77869UhF LIZJ;
    public boolean LIZLLL;
    public InterfaceC65784Pro<C76800UCe> LJ;
    public final View LJFF;
    public final HandlerC55467Lpn LJI;

    public final boolean LIZ() {
        if (this.LIZIZ.sM() || this.LIZLLL) {
            return true;
        }
        return false;
    }

    public C55468Lpo(VideoSeekBarMaskView videoSeekBarMaskView, EdgeSpeedupAbility edgeSpeedupAbility) {
        View findViewById;
        C77869UhF c77869UhF;
        this.LIZ = videoSeekBarMaskView;
        this.LIZIZ = edgeSpeedupAbility;
        ViewStub viewStub = (ViewStub) videoSeekBarMaskView.findViewById(R.id.nf4);
        if (viewStub != null) {
            findViewById = viewStub.inflate();
        } else {
            findViewById = videoSeekBarMaskView.findViewById(R.id.cn5);
        }
        this.LJFF = findViewById;
        if (findViewById != null) {
            c77869UhF = (C77869UhF) findViewById.findViewById(R.id.d_s);
        } else {
            c77869UhF = null;
        }
        this.LIZJ = c77869UhF;
        this.LJI = new HandlerC55467Lpn(this, C16880lQ.LLJJJJ());
    }
}
