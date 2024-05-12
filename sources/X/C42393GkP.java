package X;

import Y.ACallableS110S0100000_7;
import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OriginalAudioStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import defpackage.b1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GkP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42393GkP {
    public Activity LIZ;
    public ProgressDialogC43241Gy5 LIZJ;
    public C42278GiY LIZLLL;
    public int LJ;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LIZIZ = "";
    public final List<String> LJFF = new ArrayList();
    public final String LJIIJ = AVExternalServiceImpl.LIZ().configService().cacheConfig().cacheDir();
    public final Handler LJIIJJI = new Handler(C16880lQ.LLJJJJ());
    public int LJIIL = 20;
    public final ACallableS110S0100000_7 LJIILIIL = new ACallableS110S0100000_7(this, 50);
    public final C42400GkW LJIILJJIL = new C42400GkW(this);

    public final void LIZJ() {
        C10K.LIZIZ(new ACallableS110S0100000_7(this, 48), C10K.LJIIIIZZ, null);
    }

    public final void LIZ(boolean z) {
        ProgressDialogC43241Gy5 progressDialogC43241Gy5;
        C42278GiY c42278GiY;
        if (z) {
            try {
                Activity activity = this.LIZ;
                if (activity == null) {
                    o.LJIJI("mContext");
                    throw null;
                }
                activity.finish();
            } catch (Exception unused) {
            }
        }
        C42278GiY c42278GiY2 = this.LIZLLL;
        if (c42278GiY2 != null && c42278GiY2.isShowing() && (c42278GiY = this.LIZLLL) != null) {
            c42278GiY.dismiss();
        }
        ProgressDialogC43241Gy5 progressDialogC43241Gy52 = this.LIZJ;
        if (progressDialogC43241Gy52 != null && progressDialogC43241Gy52.isShowing() && (progressDialogC43241Gy5 = this.LIZJ) != null) {
            progressDialogC43241Gy5.dismiss();
        }
        this.LIZJ = null;
    }

    public final void LIZIZ(Aweme aweme) {
        List<String> list;
        String str;
        UrlModel urlModel;
        UrlModel urlModel2;
        OriginalAudioStruct originalAudioStruct = aweme.originalAudio;
        String str2 = null;
        if (originalAudioStruct != null && (urlModel2 = originalAudioStruct.playUrl) != null) {
            list = urlModel2.getUrlList();
        } else {
            list = null;
        }
        if (list != null) {
            str = (String) ListProtector.get(list, 0);
        } else {
            str = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        OriginalAudioStruct originalAudioStruct2 = aweme.originalAudio;
        if (originalAudioStruct2 != null && (urlModel = originalAudioStruct2.playUrl) != null) {
            str2 = urlModel.getUri();
        }
        String LIZIZ = b1.LIZIZ(str2, LIZ, ".wav", LIZ);
        if (str == null || str.length() == 0 || TextUtils.equals(this.LIZIZ, "from_promote") || CommerceMediaServiceImpl.LIZJ().LJIIZILJ()) {
            LIZLLL(aweme);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIJ);
        LIZ2.append(LIZIZ);
        if (C39579Fg7.LIZIZ(X1D.LIZIZ(LIZ2))) {
            StringBuilder LIZ3 = X1D.LIZ();
            this.LJIIIZ = JBR.LJFF(LIZ3, this.LJIIJ, LIZIZ, LIZ3);
            LIZLLL(aweme);
            return;
        }
        C42403GkZ.LIZ(list, this.LJIIJ, LIZIZ, new C42396GkS(aweme, this, list));
    }

    public final void LIZLLL(Aweme aweme) {
        if (this.LIZ != null) {
            AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel("replace_music", new C42394GkQ(aweme, this, AnonymousClass629.LIZ("randomUUID().toString()")));
        } else {
            o.LJIJI("mContext");
            throw null;
        }
    }
}
