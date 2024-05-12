package X;

import Y.AfS60S0100000_8;
import Y.IDhS101S0100000_8;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ItC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48034ItC implements InterfaceC29937Boz {
    public final /* synthetic */ JBQ LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ AbstractC73547Stj LIZJ;

    public C48034ItC(JBQ jbq, Aweme aweme, C73451SsB c73451SsB) {
        this.LIZ = jbq;
        this.LIZIZ = aweme;
        this.LIZJ = c73451SsB;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        UrlModel cover;
        JBQ jbq = this.LIZ;
        Aweme aweme = this.LIZIZ;
        jbq.getClass();
        if (JBQ.LIZIZ(aweme)) {
            Video video = aweme.getVideo();
            if (video != null && (cover = video.getCover()) != null) {
                jbq.LIZ(jbq.LJLILLLLZI, jbq.LJLJJI, true, true);
                W5F LIZLLL = C40084FoG.LIZLLL(cover, "AvatarStoryAnimPlaybackHelper");
                LIZLLL.LJJIIJ = jbq.LJLJI;
                LIZLLL.LIZLLL(new ARE(jbq));
            }
        } else {
            Video video2 = aweme.getVideo();
            if (video2 != null) {
                VideoUrlModel storyPlayAddress = video2.getPlayAddr();
                ((InterfaceC197777pV) jbq.LJLJJLL.getValue()).LIZIZ(jbq);
                o.LJIIIIZZ(storyPlayAddress, "storyPlayAddress");
                String aid = aweme.getAid();
                jbq.LJLJL.getValue().getClass();
                C44421Hc1 c44421Hc1 = new C44421Hc1();
                if (aid == null) {
                    aid = "";
                }
                c44421Hc1.LIZIZ = aid;
                boolean isBytevc1 = storyPlayAddress.isBytevc1();
                C44398Hbe c44398Hbe = new C44398Hbe(c44421Hc1);
                c44398Hbe.LIZIZ = storyPlayAddress.getUrlKey();
                c44398Hbe.LIZJ = isBytevc1 ? 1 : 0;
                c44398Hbe.LIZLLL = storyPlayAddress.getUrlList();
                c44398Hbe.LJ = storyPlayAddress.getSize();
                C44421Hc1 LIZ = c44398Hbe.LIZ();
                o.LJIIIIZZ(LIZ, "createPlayItem()\n       …          .addToBuilder()");
                C44412Hbs LIZ2 = LIZ.LIZ();
                C46812IYu c46812IYu = LIZ2.LIZIZ;
                c46812IYu.LJII = true;
                c46812IYu.LJIIIIZZ = true;
                c46812IYu.LIZIZ = true;
                c46812IYu.LJ = 0;
                LIZ2.LIZJ = 3500L;
                C44421Hc1 c44421Hc12 = LIZ2.LIZ;
                c44421Hc12.LJ = LIZ2;
                C78999UzT.LJFF(AbstractC73672Svk.LJJIJIL(new C44388HbU(c44421Hc12).LIZ()).LJJIJL(new IDhS101S0100000_8(jbq, 6)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS60S0100000_8(jbq, 32), new InterfaceC64592gB() { // from class: X.9FU
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }), jbq.LJLJJL);
            }
        }
        C78999UzT.LJFF(this.LIZJ.LJIIJ(C48036ItE.LJLIL, new C48035ItD(this.LIZ, this.LIZIZ)), this.LIZ.LJLJJL);
    }
}
