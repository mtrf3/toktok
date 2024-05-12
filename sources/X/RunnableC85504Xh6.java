package X;

import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;

/* renamed from: X.Xh6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC85504Xh6 implements Runnable {
    public final /* synthetic */ CreatorCaptionEditActivity LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            CreatorCaptionEditActivity creatorCaptionEditActivity = this.LJLIL;
            creatorCaptionEditActivity.onPlayProgressChange((((float) creatorCaptionEditActivity.LLILIL().LIZLLL()) * 1.0f) / ((float) this.LJLIL.LLILIL().LJ()));
            this.LJLIL.LLIIJI().post(this);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC85504Xh6(CreatorCaptionEditActivity creatorCaptionEditActivity) {
        this.LJLIL = creatorCaptionEditActivity;
    }
}
