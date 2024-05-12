package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import ujb.o;

/* renamed from: X.J8p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48679J8p {
    public static final /* synthetic */ int LJII = 0;
    public final OnUIPlayListener LIZ;
    public InterfaceC46330IGg LIZIZ;
    public final C47246IgU LIZJ;
    public Aweme LIZLLL;
    public String LJ;
    public boolean LJFF;
    public final C64286PKw LJI;

    public final String LIZIZ() {
        String str = this.LJ;
        if (str == null || o.LJJJJJL(str)) {
            return null;
        }
        return this.LJ;
    }

    public final boolean LIZJ() {
        Aweme aweme;
        AwemeStatus status;
        if (!this.LIZJ.d4()) {
            return true;
        }
        Aweme aweme2 = this.LIZLLL;
        if (aweme2 != null && aweme2.getStatus() != null && (aweme = this.LIZLLL) != null && (status = aweme.getStatus()) != null && status.isDelete()) {
            return true;
        }
        return false;
    }

    public final Video LIZ() {
        Video LIZIZ;
        String LIZIZ2 = LIZIZ();
        if (LIZIZ2 == null || (LIZIZ = this.LJI.LIZIZ(String.class, LIZIZ2)) == null) {
            Aweme aweme = this.LIZLLL;
            if (aweme != null) {
                return this.LJI.LIZIZ(Aweme.class, aweme);
            }
            return null;
        }
        return LIZIZ;
    }

    public C48679J8p(C47689Ind c47689Ind, OnUIPlayListener mPlayListener) {
        kotlin.jvm.internal.o.LJIIIZ(mPlayListener, "mPlayListener");
        this.LIZ = mPlayListener;
        this.LIZJ = C47246IgU.LIZJ(c47689Ind);
        InterfaceC46330IGg interfaceC46330IGg = this.LIZIZ;
        if (interfaceC46330IGg != null) {
            interfaceC46330IGg.getDuration();
        }
        InterfaceC46330IGg interfaceC46330IGg2 = this.LIZIZ;
        if (interfaceC46330IGg2 != null) {
            interfaceC46330IGg2.getCurrentPosition();
        }
        C64286PKw c64286PKw = new C64286PKw(1);
        C48678J8o videoProvider = C48678J8o.LJLIL;
        kotlin.jvm.internal.o.LJIIIZ(videoProvider, "videoProvider");
        ((java.util.Map) c64286PKw.LIZ).put(String.class, videoProvider);
        C48677J8n videoProvider2 = C48677J8n.LJLIL;
        kotlin.jvm.internal.o.LJIIIZ(videoProvider2, "videoProvider");
        ((java.util.Map) c64286PKw.LIZ).put(Aweme.class, videoProvider2);
        this.LJI = c64286PKw;
    }
}
