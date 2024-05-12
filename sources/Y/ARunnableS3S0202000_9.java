package Y;

import X.C26336AVg;
import X.C8HI;
import X.MFT;
import X.MK5;
import X.X1D;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAssem;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes10.dex */
public class ARunnableS3S0202000_9 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS3S0202000_9 aRunnableS3S0202000_9) {
        boolean LIZ;
        try {
            MainPageSeekAssem mainPageSeekAssem = (MainPageSeekAssem) aRunnableS3S0202000_9.l0;
            List list = (List) aRunnableS3S0202000_9.l1;
            int i = aRunnableS3S0202000_9.i2;
            int i2 = aRunnableS3S0202000_9.i3;
            mainPageSeekAssem.getClass();
            MainPageSeekAssem.x3(i, i2, list);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0202000_9 aRunnableS3S0202000_9) {
        switch (aRunnableS3S0202000_9.i2) {
            case 0:
                EnterRoomLinkSession.LIZ((EnterRoomLinkSession) aRunnableS3S0202000_9.l0, (EnterRoomLinkSession) aRunnableS3S0202000_9.l1, aRunnableS3S0202000_9.i3);
                return;
            default:
                MFT mft = (MFT) aRunnableS3S0202000_9.l0;
                C26336AVg c26336AVg = (C26336AVg) aRunnableS3S0202000_9.l1;
                mft.getClass();
                AwemeDraft awemeDraft = c26336AVg.LIZIZ;
                if (awemeDraft != null) {
                    AVExternalServiceImpl.LIZ().draftService().loadThumbCover(awemeDraft, null, new MK5(mft, awemeDraft));
                }
                if (mft.LJLJL != null) {
                    mft.LJLJL.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
                    String string = mft.LJLJJLL.getResources().getString(R.string.qx8);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(": ");
                    LIZ.append(c26336AVg.LIZ);
                    mft.LJLJL.setText(string.concat(X1D.LIZIZ(LIZ)));
                    return;
                }
                return;
        }
    }

    public ARunnableS3S0202000_9(int i, int i2, Object obj, Object obj2, int i3) {
        this.$t = i3;
        this.i2 = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
    }
}
