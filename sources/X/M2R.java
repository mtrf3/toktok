package X;

import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyVideoCardModel;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M2R extends C222898ov {
    public final /* synthetic */ M2Q LJLIL;

    public M2R(M2Q m2q) {
        this.LJLIL = m2q;
    }

    @Override // X.C222898ov, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        String str2;
        String str3;
        M2Q m2q = this.LJLIL;
        C68395Qsp c68395Qsp = m2q.LJLILLLLZI;
        NearbyVideoCardModel nearbyVideoCardModel = m2q.LJLLLL;
        String str4 = null;
        if (nearbyVideoCardModel != null && (str3 = nearbyVideoCardModel.groupId) != null) {
            Boolean bool = (Boolean) ((java.util.Map) c68395Qsp.LJLILLLLZI).get(str3);
            if (bool != null && bool.booleanValue()) {
                return;
            }
        } else {
            c68395Qsp.getClass();
        }
        NearbyVideoCardModel nearbyVideoCardModel2 = this.LJLIL.LJLLLL;
        if (nearbyVideoCardModel2 != null) {
            str4 = nearbyVideoCardModel2.groupId;
        }
        AqS32S1000000_9 aqS32S1000000_9 = new AqS32S1000000_9(str4, 12);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        aqS32S1000000_9.invoke(linkedHashMap);
        FMX.LJIIL("nearby_educational_video_play_finish", linkedHashMap);
        M2Q m2q2 = this.LJLIL;
        C68395Qsp c68395Qsp2 = m2q2.LJLILLLLZI;
        NearbyVideoCardModel nearbyVideoCardModel3 = m2q2.LJLLLL;
        if (nearbyVideoCardModel3 != null && (str2 = nearbyVideoCardModel3.groupId) != null) {
            ((java.util.Map) c68395Qsp2.LJLILLLLZI).put(str2, Boolean.TRUE);
        } else {
            c68395Qsp2.getClass();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        this.LJLIL.M();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        String str;
        String str2;
        M2Q m2q = this.LJLIL;
        m2q.LJLJI = true;
        int adapterPosition = m2q.getAdapterPosition();
        M2Q m2q2 = this.LJLIL;
        String str3 = null;
        if (adapterPosition != m2q2.LJLIL.LLI) {
            VideoViewComponent videoViewComponent = m2q2.LJZL;
            if (videoViewComponent != null) {
                videoViewComponent.pause();
                this.LJLIL.M();
                return;
            } else {
                o.LJIJI("videoView");
                throw null;
            }
        }
        m2q2.L();
        this.LJLIL.LJLLL = Long.valueOf(System.currentTimeMillis());
        M2Q m2q3 = this.LJLIL;
        C68395Qsp c68395Qsp = m2q3.LJLILLLLZI;
        NearbyVideoCardModel nearbyVideoCardModel = m2q3.LJLLLL;
        if (nearbyVideoCardModel != null && (str2 = nearbyVideoCardModel.groupId) != null) {
            Boolean bool = (Boolean) ((java.util.Map) c68395Qsp.LJLIL).get(str2);
            if (bool != null && bool.booleanValue()) {
                return;
            }
        } else {
            c68395Qsp.getClass();
        }
        NearbyVideoCardModel nearbyVideoCardModel2 = this.LJLIL.LJLLLL;
        if (nearbyVideoCardModel2 != null) {
            str3 = nearbyVideoCardModel2.groupId;
        }
        AqS32S1000000_9 aqS32S1000000_9 = new AqS32S1000000_9(str3, 11);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        aqS32S1000000_9.invoke(linkedHashMap);
        FMX.LJIIL("nearby_educational_video_play", linkedHashMap);
        M2Q m2q4 = this.LJLIL;
        C68395Qsp c68395Qsp2 = m2q4.LJLILLLLZI;
        NearbyVideoCardModel nearbyVideoCardModel3 = m2q4.LJLLLL;
        if (nearbyVideoCardModel3 != null && (str = nearbyVideoCardModel3.groupId) != null) {
            ((java.util.Map) c68395Qsp2.LJLIL).put(str, Boolean.TRUE);
        } else {
            c68395Qsp2.getClass();
        }
    }

    @Override // X.C222898ov, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, IPH iph) {
        String str2;
        String str3;
        C222688oa.LJIIZILJ(this, str, iph);
        M2Q m2q = this.LJLIL;
        C68395Qsp c68395Qsp = m2q.LJLILLLLZI;
        NearbyVideoCardModel nearbyVideoCardModel = m2q.LJLLLL;
        String str4 = null;
        if (nearbyVideoCardModel != null && (str3 = nearbyVideoCardModel.groupId) != null) {
            Boolean bool = (Boolean) ((java.util.Map) c68395Qsp.LJLILLLLZI).get(str3);
            if (bool != null && bool.booleanValue()) {
                return;
            }
        } else {
            c68395Qsp.getClass();
        }
        NearbyVideoCardModel nearbyVideoCardModel2 = this.LJLIL.LJLLLL;
        if (nearbyVideoCardModel2 != null) {
            str4 = nearbyVideoCardModel2.groupId;
        }
        AqS32S1000000_9 aqS32S1000000_9 = new AqS32S1000000_9(str4, 12);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        aqS32S1000000_9.invoke(linkedHashMap);
        FMX.LJIIL("nearby_educational_video_play_finish", linkedHashMap);
        M2Q m2q2 = this.LJLIL;
        C68395Qsp c68395Qsp2 = m2q2.LJLILLLLZI;
        NearbyVideoCardModel nearbyVideoCardModel3 = m2q2.LJLLLL;
        if (nearbyVideoCardModel3 != null && (str2 = nearbyVideoCardModel3.groupId) != null) {
            ((java.util.Map) c68395Qsp2.LJLILLLLZI).put(str2, Boolean.TRUE);
        } else {
            c68395Qsp2.getClass();
        }
    }
}
