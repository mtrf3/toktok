package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IHA {
    public final WeakReference<Aweme> LIZ;
    public IHC LIZIZ;
    public int LIZJ;
    public AbstractC48384Iyq LIZLLL;

    public final void LIZ() {
        AbstractC48384Iyq abstractC48384Iyq = this.LIZLLL;
        if (abstractC48384Iyq != null) {
            abstractC48384Iyq.close();
        }
        String str = null;
        this.LIZLLL = null;
        this.LIZIZ = null;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clear preload ");
        Aweme aweme = this.LIZ.get();
        if (aweme != null) {
            str = aweme.getAid();
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    public final void LIZIZ() {
        String str;
        Video video;
        UrlModel originCover;
        List<String> urlList;
        int i = this.LIZJ;
        String str2 = null;
        if (i == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preload ");
            Aweme aweme = this.LIZ.get();
            if (aweme != null) {
                str2 = aweme.getAid();
            }
            C0MT.LJ(LIZ, str2, " already started", LIZ);
            return;
        }
        if (i == 2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preload ");
            Aweme aweme2 = this.LIZ.get();
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            }
            C0MT.LJ(LIZ2, str2, " already finished", LIZ2);
            IHC ihc = this.LIZIZ;
            if (ihc != null) {
                Aweme aweme3 = this.LIZ.get();
                if (aweme3 != null) {
                    aweme3.getAid();
                }
                ihc.LIZ();
                return;
            }
            return;
        }
        Aweme aweme4 = this.LIZ.get();
        if (aweme4 != null && (video = aweme4.getVideo()) != null && (originCover = video.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null && (!urlList.isEmpty())) {
            str = (String) ListProtector.get(urlList, 0);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("preload ");
            Aweme aweme5 = this.LIZ.get();
            if (aweme5 != null) {
                str2 = aweme5.getAid();
            }
            C0MT.LJ(LIZ3, str2, " empty url", LIZ3);
            IHC ihc2 = this.LIZIZ;
            if (ihc2 != null) {
                Aweme aweme6 = this.LIZ.get();
                if (aweme6 != null) {
                    aweme6.getAid();
                }
                ihc2.LIZ();
                return;
            }
            return;
        }
        this.LIZLLL = W5I.LIZ().LJIILIIL(W5O.LIZIZ(str));
        this.LIZJ = 1;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("preload ");
        Aweme aweme7 = this.LIZ.get();
        if (aweme7 != null) {
            str2 = aweme7.getAid();
        }
        C0MT.LJ(LIZ4, str2, " start", LIZ4);
        AbstractC48384Iyq abstractC48384Iyq = this.LIZLLL;
        o.LJI(abstractC48384Iyq);
        abstractC48384Iyq.LJ(new IHB(this), ((IH1) IH1.LJ.getValue()).LIZJ);
    }

    public IHA(WeakReference weakReference, IH7 ih7) {
        this.LIZ = weakReference;
        this.LIZIZ = ih7;
    }
}
