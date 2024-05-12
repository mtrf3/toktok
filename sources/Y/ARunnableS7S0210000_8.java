package Y;

import X.AbstractC65189PiD;
import X.C09900aA;
import X.C10K;
import X.C165256e9;
import X.C16880lQ;
import X.C2IY;
import X.C2U8;
import X.C39579Fg7;
import X.C46367IHr;
import X.C46728IVo;
import X.C46748IWi;
import X.C47483IkJ;
import X.C48135Iup;
import X.C56662Kg;
import X.C65191PiF;
import X.C78841Uwv;
import X.FMX;
import X.IDP;
import X.IFH;
import X.IFN;
import X.IWF;
import X.JVQ;
import X.KL2;
import X.LFH;
import X.X1D;
import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.feed.platform.panel.speed.TabletPlaybackSpeedComponent;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ARunnableS7S0210000_8 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    public static final void run$8(ARunnableS7S0210000_8 aRunnableS7S0210000_8) {
        C46748IWi.LJJIL((C46748IWi) aRunnableS7S0210000_8.l0, (Surface) aRunnableS7S0210000_8.l1, aRunnableS7S0210000_8.z2);
    }

    public final void LIZ$1() {
        if (!C56662Kg.LIZ().LJIIIIZZ("feed_video_preload_method_end_to_prepare")) {
            C56662Kg.LIZ().LJFF("feed_video_preload_method_end_to_prepare", false);
        }
        if (!C56662Kg.LIZ().LJII("player_prepare_duration")) {
            C56662Kg.LIZ().LIZJ("player_prepare_duration", false);
        }
        if (this.z2) {
            IWF.LJJLIIIIJ().LJIILLIIL((Aweme) this.l0, (C46367IHr) this.l1);
        } else {
            IWF.LJJLIIIIJ().LJJIZ((Aweme) this.l0, (C46367IHr) this.l1);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String c165256e9;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playUrl", JsonParseUtils.LIZLLL(((Video) this.l0).getPlayAddrBytevc1()));
            C47483IkJ.LIZIZ(jSONObject);
            IDP idp = (IDP) this.l1;
            if (idp.LLJLILLLLZIIL == null) {
                idp.LLJLILLLLZIIL = C39579Fg7.LJIIIZ(C39579Fg7.LJIIL());
            }
            File file = ((IDP) this.l1).LLJLILLLLZIIL;
            if (file == null) {
                c165256e9 = "";
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(file.getPath());
                LIZ.append("/");
                C48135Iup c48135Iup = C48135Iup.LIZ;
                String uri = ((Video) this.l0).getProperPlayAddr().getUri();
                c48135Iup.getClass();
                LIZ.append(C48135Iup.LIZ(uri));
                c165256e9 = new C165256e9(X1D.LIZIZ(LIZ)).toString();
            }
            jSONObject.put("file", c165256e9);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C09900aA.LJIIJJI("aweme_media_bytevc1_error_rate", !this.z2 ? 1 : 0, jSONObject);
    }

    public final void LIZ$2() {
        if (((SearchFeedFragment) this.l0).nm() instanceof JVQ) {
            ((SearchFeedFragment) this.l0).nm();
            ((ArrayList) ((SearchFeedFragment) this.l0).dm().LJZI()).size();
            SearchFeedFragment searchFeedFragment = (SearchFeedFragment) this.l0;
            searchFeedFragment.LLJJL.LJLL = ((ArrayList) searchFeedFragment.dm().LJZI()).size();
        }
        GlobalDoodleConfig globalDoodleConfig = ((SearchFeedFragment) this.l0).LLIIIL;
        if (globalDoodleConfig != null && o.LJ(globalDoodleConfig.getHideResults(), Boolean.TRUE)) {
            ((SearchFeedFragment) this.l0).LLJJL.J5(new ArrayList(), this.z2);
        } else {
            ((SearchFeedFragment) this.l0).LLJJL.J5((List) this.l1, this.z2);
        }
        ((SearchFeedFragment) this.l0).Ym();
        ((SearchFeedFragment) this.l0).qm().LIZ();
        ((SearchFeedFragment) this.l0).vn();
        ((SearchFeedFragment) this.l0).dn();
    }

    public final void LIZ$3() {
        ((TabletPlaybackSpeedComponent) this.l0).C3((Aweme) this.l1);
        if (((TabletPlaybackSpeedComponent) this.l0).v3((Aweme) this.l1) && LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL().LJJIJIIJIL()) {
            final float LIZIZ = IFH.LIZIZ((Aweme) this.l1);
            final Aweme aweme = (Aweme) this.l1;
            IFH.LIZ = aweme;
            IFH.LIZIZ = LIZIZ;
            IFH.LIZJ = LIZIZ;
            if (!this.z2 && LIZIZ != 1.0f && IFH.LIZ(aweme) && aweme != null && !TextUtils.isEmpty(aweme.getAid()) && !TextUtils.isEmpty("homepage_hot")) {
                C10K.LIZIZ(new Callable() { // from class: X.3tQ
                    public final /* synthetic */ String LJLILLLLZI = "homepage_hot";

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String str;
                        Integer num;
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("group_id", aweme.getAid());
                        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
                        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
                        c188727au.LJIIIZ("speed_mode", String.valueOf(LIZIZ));
                        if (C53946LFe.LIZIZ().LJFF) {
                            str = "3";
                        } else {
                            str = "1";
                        }
                        c188727au.LJIIIZ("pad_interface_orientation", str);
                        Video video = aweme.getVideo();
                        if (video != null) {
                            num = Integer.valueOf(video.getDuration());
                        } else {
                            num = null;
                        }
                        c188727au.LJFF(num, "item_duration");
                        FMX.LJIIL("video_speed_maintain", c188727au.LIZ);
                        return C76800UCe.LIZ;
                    }
                }, FMX.LIZIZ(), null);
            }
            ((TabletPlaybackSpeedComponent) this.l0).x3((Aweme) this.l1);
            ((TabletPlaybackSpeedComponent) this.l0).getClass();
            C2U8.LIZ(new C2IY(LIZIZ, "homepage_hot", false));
            ((TabletPlaybackSpeedComponent) this.l0).getContainerView().postDelayed(new IFN((TabletPlaybackSpeedComponent) this.l0, (Aweme) this.l1, LIZIZ), 100L);
        }
    }

    public static final void run$0(ARunnableS7S0210000_8 aRunnableS7S0210000_8) {
        boolean LIZ;
        try {
            if (aRunnableS7S0210000_8.z2) {
                ((IDP) aRunnableS7S0210000_8.l1).LJIIZILJ((VideoUrlModel) aRunnableS7S0210000_8.l0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S0210000_8 aRunnableS7S0210000_8) {
        boolean LIZ;
        try {
            aRunnableS7S0210000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS7S0210000_8 aRunnableS7S0210000_8) {
        boolean LIZ;
        try {
            aRunnableS7S0210000_8.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS7S0210000_8 aRunnableS7S0210000_8) {
        boolean LIZ;
        try {
            boolean z = aRunnableS7S0210000_8.z2;
            ARunnableS7S0210000_8 aRunnableS7S0210000_82 = new ARunnableS7S0210000_8((C46367IHr) aRunnableS7S0210000_8.l1, (Aweme) aRunnableS7S0210000_8.l0, z, 2);
            if (KL2.LJIILIIL()) {
                aRunnableS7S0210000_82.run();
            } else {
                C10K.LJIIIIZZ.execute(aRunnableS7S0210000_82);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS7S0210000_8 aRunnableS7S0210000_8) {
        boolean LIZ;
        try {
            aRunnableS7S0210000_8.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS7S0210000_8 aRunnableS7S0210000_8) {
        boolean LIZ;
        try {
            C46728IVo.LJIIJJI((Aweme[]) aRunnableS7S0210000_8.l0, ((PreloadTask) aRunnableS7S0210000_8.l1).getVideoPreloadSize(), aRunnableS7S0210000_8.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS7S0210000_8 aRunnableS7S0210000_8) {
        AbstractC65189PiD abstractC65189PiD = (AbstractC65189PiD) aRunnableS7S0210000_8.l0;
        Object obj = aRunnableS7S0210000_8.l1;
        boolean z = aRunnableS7S0210000_8.z2;
        abstractC65189PiD.getClass();
        try {
            abstractC65189PiD.LIZJ.LJIIIIZZ(obj);
            if (z) {
                abstractC65189PiD.LIZJ.LIZ();
            }
        } catch (Exception unused) {
            C78841Uwv.LJJI(abstractC65189PiD.LIZ);
        }
    }

    public static final void run$7(ARunnableS7S0210000_8 aRunnableS7S0210000_8) {
        boolean LIZ;
        try {
            aRunnableS7S0210000_8.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S0210000_8(C46748IWi c46748IWi, Surface surface, int i) {
        this.$t = i;
        this.l0 = c46748IWi;
        this.l1 = surface;
        this.z2 = true;
    }

    public ARunnableS7S0210000_8(C65191PiF c65191PiF, ScribeEvent scribeEvent, int i) {
        this.$t = i;
        this.l0 = c65191PiF;
        this.l1 = scribeEvent;
        this.z2 = false;
    }

    public ARunnableS7S0210000_8(Aweme[] awemeArr, PreloadTask preloadTask, int i) {
        this.$t = i;
        this.l0 = awemeArr;
        this.l1 = preloadTask;
        this.z2 = false;
    }

    public ARunnableS7S0210000_8(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
        this.z2 = z;
    }
}
