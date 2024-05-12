package X;

import Y.ARunnableS46S0100000_10;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.N5d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58781N5d implements N7D {
    public final InterfaceC58782N5e LJLIL;
    public JMD LJLILLLLZI;
    public final N4S LJLJI = new N4S(0);
    public final Aweme LJLJJI;
    public final SearchAdEventLogger LJLJJL;
    public InterfaceC58748N3w LJLJJLL;
    public final InterfaceC49504Jbo LJLJL;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.N7D
    public final void LJLIIL() {
        this.LJLJI.LJLJJI.clear();
        O5Y.LJJJLIIL(this.LJLJI);
    }

    @Override // X.N7D
    public final void p40() {
        C58786N5i LIZIZ;
        InterfaceC49504Jbo interfaceC49504Jbo = this.LJLJL;
        if (interfaceC49504Jbo != null && (LIZIZ = interfaceC49504Jbo.LIZIZ()) != null) {
            LIZIZ.LIZIZ(this.LJLJJI, EnumC58785N5h.HAS_TRACKED_IN_DETAIL_PAGE);
        }
    }

    @Override // X.N7D
    public final void Bl() {
        Video video;
        VideoPlayTaskManager videoPlayTaskManager;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resumePlayInDetail  searchAdItemModule = ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" eventTrackList=");
        LIZ.append(this.LJLJI.LJLJJI);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        Aweme aweme = this.LJLIL.getAweme();
        if (aweme != null && (video = aweme.getVideo()) != null) {
            long videoLength = video.getVideoLength();
            InterfaceC58748N3w interfaceC58748N3w = this.LJLJJLL;
            if (interfaceC58748N3w != null) {
                videoPlayTaskManager = interfaceC58748N3w.LIZ();
            } else {
                videoPlayTaskManager = null;
            }
            double d = videoLength;
            int i = (int) (0.25d * d);
            int i2 = (int) (0.5d * d);
            int i3 = (int) (d * 0.75d);
            if (videoLength >= 2000 && videoPlayTaskManager != null) {
                N68 LIZIZ = C1DD.LIZIZ("2sPlayProgressTrack", videoLength);
                LIZIZ.LIZJ = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                LIZIZ.LIZLLL = new ARunnableS46S0100000_10(this, 224);
                LIZIZ.LJ = true;
                videoPlayTaskManager.LJLJLJ(LIZIZ.LIZ());
            }
            if (videoLength >= 6000) {
                if (videoPlayTaskManager != null) {
                    N68 LIZIZ2 = C1DD.LIZIZ("2sPlayProgressTrack", videoLength);
                    LIZIZ2.LIZJ = LiveEffectMusicFadeDurationSetting.DEFAULT;
                    LIZIZ2.LIZLLL = new ARunnableS46S0100000_10(this, 225);
                    LIZIZ2.LJ = true;
                    videoPlayTaskManager.LJLJLJ(LIZIZ2.LIZ());
                } else {
                    return;
                }
            } else if (videoPlayTaskManager == null) {
                return;
            }
            N68 LIZIZ3 = C1DD.LIZIZ("searchVideoFirstQuartileTimingTask", videoLength);
            LIZIZ3.LIZJ = i;
            LIZIZ3.LIZLLL = new ARunnableS46S0100000_10(this, 226);
            LIZIZ3.LJ = true;
            videoPlayTaskManager.LJLJLJ(LIZIZ3.LIZ());
            N68 LIZIZ4 = C1DD.LIZIZ("searchVideoMidQuartileTimingTask", videoLength);
            LIZIZ4.LIZJ = i2;
            LIZIZ4.LIZLLL = new ARunnableS46S0100000_10(this, 227);
            LIZIZ4.LJ = true;
            videoPlayTaskManager.LJLJLJ(LIZIZ4.LIZ());
            N68 LIZIZ5 = C1DD.LIZIZ("searchVideoThirdQuartileTimingTask", videoLength);
            LIZIZ5.LIZJ = i3;
            LIZIZ5.LIZLLL = new ARunnableS46S0100000_10(this, 228);
            LIZIZ5.LJ = true;
            videoPlayTaskManager.LJLJLJ(LIZIZ5.LIZ());
        }
    }

    @Override // X.N7D
    public final void Md() {
        Integer num;
        Integer LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("transformOpen transformOpenClickType = ");
        JMD jmd = this.LJLILLLLZI;
        if (jmd != null) {
            num = jmd.LIZ();
        } else {
            num = null;
        }
        LIZ2.append(num);
        N8M.LIZ(X1D.LIZIZ(LIZ2));
        JMD jmd2 = this.LJLILLLLZI;
        if (jmd2 != null && (LIZ = jmd2.LIZ()) != null) {
            int intValue = LIZ.intValue();
            InterfaceC58748N3w interfaceC58748N3w = this.LJLJJLL;
            if (interfaceC58748N3w != null) {
                interfaceC58748N3w.LIZIZ(interfaceC58748N3w.getContext(), this.LJLJJI, intValue);
            }
            JMD jmd3 = this.LJLILLLLZI;
            if (jmd3 == null) {
                return;
            }
            jmd3.LIZLLL();
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC58782N5e L9() {
        return this.LJLIL;
    }

    @Override // X.N7D
    public final N4S getShareInfo() {
        return this.LJLJI;
    }

    public C58781N5d(C58789N5l c58789N5l) {
        this.LJLIL = c58789N5l;
        Aweme aweme = c58789N5l.LIZ;
        this.LJLJJI = aweme;
        this.LJLJJL = new SearchAdEventLogger(new Object[]{aweme});
        this.LJLJL = C58784N5g.LIZIZ.LIZIZ();
    }

    @Override // X.N7D
    public final void Ie0(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayComplete playTims=");
        LIZ.append(i);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        N4S n4s = this.LJLJI;
        n4s.LJLJI = i;
        n4s.LJLJJI.clear();
    }

    @Override // X.N7D
    public final void gq(C59120NIe c59120NIe) {
        String str;
        this.LJLJJLL = c59120NIe;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initDetailItemDepend aid = ");
        Aweme aweme = c59120NIe.LIZ;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" requestId = ");
        Aweme aweme2 = c59120NIe.LIZ;
        if (aweme2 != null) {
            str2 = aweme2.getRequestId();
        }
        LIZ.append(str2);
        N8M.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.N7D
    public final void is0(int i) {
        this.LJLJI.LJLILLLLZI = i;
    }

    @Override // X.N7D
    public final void nB(AqS157S0200000_10 aqS157S0200000_10) {
        EnumC58785N5h enumC58785N5h;
        C58786N5i LIZIZ;
        C58786N5i LIZIZ2;
        N4S shareInfo;
        JMD LJ = C58784N5g.LIZIZ.LJ(this.LJLIL.getAweme());
        this.LJLILLLLZI = LJ;
        if (LJ != null && (shareInfo = LJ.getShareInfo()) != null) {
            O5Y.LJJLIIIJILLIZJL(this.LJLJI, shareInfo);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEnterFromSearch eventTrackedList = ");
        LIZ.append(this.LJLJI.LJLJJI);
        LIZ.append(" playtims = ");
        LIZ.append(this.LJLJI.LJLJI);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        if (!C63081OpJ.LJIL(this.LJLJJI)) {
            InterfaceC49504Jbo interfaceC49504Jbo = this.LJLJL;
            if (interfaceC49504Jbo != null && (LIZIZ2 = interfaceC49504Jbo.LIZIZ()) != null) {
                enumC58785N5h = LIZIZ2.LIZ(this.LJLJJI);
            } else {
                enumC58785N5h = null;
            }
            EnumC58785N5h enumC58785N5h2 = EnumC58785N5h.HAS_TRACKED_IN_DETAIL_PAGE;
            if (enumC58785N5h != enumC58785N5h2 && !C63081OpJ.LLFFF(this.LJLJJI, "general_search")) {
                aqS157S0200000_10.invoke();
                InterfaceC49504Jbo interfaceC49504Jbo2 = this.LJLJL;
                if (interfaceC49504Jbo2 != null && (LIZIZ = interfaceC49504Jbo2.LIZIZ()) != null) {
                    LIZIZ.LIZIZ(this.LJLJJI, enumC58785N5h2);
                }
            }
        }
        SearchAdEventLogger searchAdEventLogger = this.LJLJJL;
        C58777N4z.LIZ.getClass();
        searchAdEventLogger.LJ(C58777N4z.LJIIIZ, new AqS176S0100000_10(this, 271));
        this.LJLJI.LJLJJLL = false;
    }

    @Override // X.N7D
    public final void yq(EnumC58794N5q type) {
        o.LJIIIZ(type, "type");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("appendVideoPlayTrackList type = ");
        LIZ.append(type);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        this.LJLJI.LJLJJI.add(type);
    }
}
