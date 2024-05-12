package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public abstract class XWF {
    public final BaseChooseMusicFragment LIZ;
    public final ConstraintLayout LIZIZ;
    public final C119894nB LIZJ;
    public final OJV LIZLLL;
    public final FrameLayout LJ;

    public final void LIZ(boolean z) {
        int i;
        ConstraintLayout constraintLayout = this.LIZIZ;
        if (constraintLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            constraintLayout.setVisibility(i);
        }
    }

    public XWF(View view, BaseChooseMusicFragment baseChooseMusicFragment) {
        this.LIZ = baseChooseMusicFragment;
        this.LIZIZ = (ConstraintLayout) view.findViewById(R.id.j5p);
        this.LIZJ = (C119894nB) view.findViewById(R.id.ev8);
        this.LIZLLL = (OJV) view.findViewById(R.id.etf);
        this.LJ = (FrameLayout) view.findViewById(R.id.btu);
    }
}
