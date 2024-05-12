package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.2So, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC58822So implements Runnable {
    public String LJLIL;
    public final /* synthetic */ IDP LJLILLLLZI;

    public final void LIZ() {
        String str;
        Aweme LJJIIZI = this.LJLILLLLZI.LJJIIZI();
        if (LJJIIZI != null && (str = this.LJLIL) != null && str.equals(LJJIIZI.getAid())) {
            if (this.LJLILLLLZI.LJJJJIZL().isPlaying()) {
                this.LJLILLLLZI.onResumePlay(this.LJLIL);
            } else {
                C57022Lq.LIZ.LJLIL.post(this);
            }
        }
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

    public RunnableC58822So(IDP idp) {
        this.LJLILLLLZI = idp;
    }
}
