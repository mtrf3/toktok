package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS67S0400000_7;

/* loaded from: classes8.dex */
public final class H91 implements Runnable {
    public final /* synthetic */ W5G LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;

    public H91(ActivityC45651qj activityC45651qj, W5G w5g, VideoPublishEditModel videoPublishEditModel, String str) {
        this.LJLIL = w5g;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = str;
        this.LJLJJI = activityC45651qj;
    }

    public final void LIZ() {
        int width = this.LJLIL.getWidth();
        Bitmap LJIILIIL = C38891fp.LJIILIIL(width, (int) (width / ((this.LJLILLLLZI.videoWidth() * 1.0f) / this.LJLILLLLZI.videoHeight())), this.LJLJI);
        C44729Hgz.LJJJJJL(new AqS154S0200000_7(LJIILIIL, this.LJLJJI, 9), new AqS67S0400000_7(this.LJLILLLLZI, LJIILIIL, this.LJLJJI, this.LJLIL, 1));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
