package X;

import Y.ALAdapterS7S0100000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MUm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56892MUm {
    public C5FU LIZ;
    public C119624mk LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public ValueAnimator LJFF;
    public ValueAnimator LJI;
    public final List<UrlModel> LJII = new ArrayList();

    public final void LIZ() {
        if (this.LIZIZ == null || this.LIZ == null || this.LIZJ) {
            return;
        }
        ValueAnimator valueAnimator = this.LJFF;
        if (valueAnimator != null) {
            valueAnimator.start();
            return;
        }
        this.LIZLLL = 1;
        this.LJFF = ValueAnimator.ofInt(0, 800);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 800);
        this.LJI = ofInt;
        ofInt.setRepeatCount(-1);
        this.LJI.setRepeatMode(1);
        this.LJI.setDuration(800L);
        this.LJFF.setRepeatCount(-1);
        this.LJFF.setRepeatMode(1);
        this.LJFF.setDuration(800L);
        this.LJFF.start();
        this.LJI.addUpdateListener(new AUListenerS97S0100000_9(this, 32));
        this.LJFF.addUpdateListener(new AUListenerS97S0100000_9(this, 33));
        this.LJFF.addListener(new ALAdapterS7S0100000_9(this, 11));
    }
}
