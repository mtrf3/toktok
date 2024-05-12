package Y;

import X.ActivityC45651qj;
import X.C10K;
import X.M5G;
import X.ProgressDialogC173686rk;
import android.app.ProgressDialog;
import android.content.Context;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import java.util.concurrent.Callable;

/* loaded from: classes16.dex */
public class ACallableS0S1410000_15 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public boolean z5;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS0S1410000_15 aCallableS0S1410000_15) {
        MusicService musicService = (MusicService) aCallableS0S1410000_15.l1;
        String str = aCallableS0S1410000_15.s0;
        Context context = (Context) aCallableS0S1410000_15.l2;
        boolean z = aCallableS0S1410000_15.z5;
        ProgressDialog progressDialog = (ProgressDialog) aCallableS0S1410000_15.l3;
        M5G m5g = (M5G) aCallableS0S1410000_15.l4;
        musicService.getClass();
        try {
            musicService.LJJLIIIJJIZ(context, MusicApi.LIZ.queryMusicByTemplateId(str).get().music, z, progressDialog, m5g);
        } catch (Exception e) {
            if (m5g != null) {
                C10K.LIZIZ(new ACallableS92S0200000_15(e, m5g, 6), C10K.LJIIIIZZ, null);
            }
        }
        return null;
    }

    public static final Object call$1(ACallableS0S1410000_15 aCallableS0S1410000_15) {
        MusicService musicService = (MusicService) aCallableS0S1410000_15.l1;
        String str = aCallableS0S1410000_15.s0;
        Context context = (Context) aCallableS0S1410000_15.l2;
        boolean z = aCallableS0S1410000_15.z5;
        ProgressDialog progressDialog = (ProgressDialog) aCallableS0S1410000_15.l3;
        M5G m5g = (M5G) aCallableS0S1410000_15.l4;
        musicService.getClass();
        try {
            musicService.LJJLIIIJJIZ(context, MusicApi.LIZIZ(str).music, z, progressDialog, m5g);
        } catch (Exception e) {
            if (m5g != null) {
                C10K.LIZIZ(new ACallableS92S0200000_15(e, m5g, 7), C10K.LJIIIIZZ, null);
            }
        }
        return null;
    }

    public ACallableS0S1410000_15(MusicService musicService, String str, ActivityC45651qj activityC45651qj, M5G m5g, int i) {
        this.$t = i;
        this.l1 = musicService;
        this.s0 = str;
        this.l2 = activityC45651qj;
        this.z5 = false;
        this.l3 = null;
        this.l4 = m5g;
    }

    public ACallableS0S1410000_15(MusicService musicService, String str, Context context, boolean z, ProgressDialogC173686rk progressDialogC173686rk, M5G m5g, int i) {
        this.$t = i;
        this.l1 = musicService;
        this.s0 = str;
        this.l2 = context;
        this.z5 = z;
        this.l3 = progressDialogC173686rk;
        this.l4 = m5g;
    }
}
