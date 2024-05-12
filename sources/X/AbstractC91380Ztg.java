package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ztg, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public abstract class AbstractC91380Ztg implements InterfaceC91297ZsL {
    public final CopyOnWriteArrayList<InterfaceC91296ZsK> LJLIL = new CopyOnWriteArrayList<>();
    public int LJLILLLLZI;

    public abstract AbstractC91187ZqZ LJ();

    public boolean LJI(InterfaceC91296ZsK dataSource) {
        o.LJIIIZ(dataSource, "dataSource");
        return false;
    }

    @Override // X.InterfaceC91297ZsL
    public void onAttach() {
    }

    @Override // X.InterfaceC91297ZsL
    public void onDetach() {
    }

    public final List<InterfaceC91296ZsK> LIZIZ(BaseDspFeedResponse response) {
        o.LJIIIZ(response, "response");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (DspStruct dspStruct : response.getDspList()) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = response.extra.logid;
                o.LJIIIIZZ(str, "response.extra.logid");
                arrayList.add(LIZLLL(dspStruct, str, false));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }

    public final void LIZJ(DspDetailListResponse dspDetailListResponse) {
        int i = 0;
        for (DspStruct dspStruct : dspDetailListResponse.getDspList()) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = dspDetailListResponse.extra.logid;
                o.LJIIIIZZ(str, "response.extra.logid");
                this.LJLIL.add(LIZLLL(dspStruct, str, true));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final int LJFF(InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
        Iterator<InterfaceC91296ZsK> it = this.LJLIL.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(playable.getId(), it.next().getId())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final C91472ZvA LIZLLL(DspStruct dspStruct, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String l;
        MatchedSoundInfo matchedSongInfo;
        C91472ZvA c91472ZvA = new C91472ZvA(dspStruct);
        C91301ZsP c91301ZsP = c91472ZvA.LJI;
        Music music = dspStruct.getDspMusic().getMusic();
        if (music != null) {
            str2 = music.getMid();
        } else {
            str2 = null;
        }
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        c91301ZsP.getClass();
        c91301ZsP.LIZ = str2;
        com.ss.android.ugc.aweme.music.model.Dsp musicDspInfo = dspStruct.getDspMusic().getMusicDspInfo();
        if (musicDspInfo == null || (str3 = musicDspInfo.getFullClipId()) == null) {
            str3 = "";
        }
        c91301ZsP.LIZIZ = str3;
        Music music2 = dspStruct.getDspMusic().getMusic();
        if (music2 == null || (matchedSongInfo = music2.getMatchedSongInfo()) == null || (str4 = matchedSongInfo.getId()) == null) {
            str4 = "";
        }
        c91301ZsP.LIZJ = str4;
        String str6 = LIZ().LJLJI;
        o.LJIIIZ(str6, "<set-?>");
        c91301ZsP.LIZLLL = str6;
        String str7 = LIZ().LJLJJL;
        o.LJIIIZ(str7, "<set-?>");
        c91301ZsP.LJ = str7;
        String str8 = LIZ().LJLJJI;
        o.LJIIIZ(str8, "<set-?>");
        c91301ZsP.LJFF = str8;
        com.ss.android.ugc.aweme.music.model.Dsp musicDspInfo2 = dspStruct.getDspMusic().getMusicDspInfo();
        if (musicDspInfo2 != null && (l = Long.valueOf(musicDspInfo2.getMvId()).toString()) != null) {
            str5 = l;
        }
        c91301ZsP.LJII = str5;
        c91301ZsP.LJI = str;
        String valueOf = String.valueOf(dspStruct.getMediaType());
        o.LJIIIZ(valueOf, "<set-?>");
        c91301ZsP.LJIIIIZZ = valueOf;
        String mediaId = dspStruct.getMediaId();
        o.LJIIIZ(mediaId, "<set-?>");
        c91301ZsP.LJIIIZ = mediaId;
        c91301ZsP.LJIIJ = dspStruct.getDspMusic().getChorusOnly();
        c91472ZvA.LIZJ = z;
        return c91472ZvA;
    }

    public final void LJII(BaseDspFeedResponse response, long j, String str) {
        String str2;
        o.LJIIIZ(response, "response");
        C91467Zv5 eventData = LIZ();
        String str3 = response.extra.logid;
        o.LJIIIIZZ(str3, "response.extra.logid");
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        boolean isEmpty = response.getDspList().isEmpty();
        o.LJIIIZ(eventData, "eventData");
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("scene_name", eventData.LJLJI);
        oszArr[1] = new OSZ("enter_method", eventData.LJLJJL);
        oszArr[2] = new OSZ("request_id", str3);
        oszArr[3] = new OSZ("duration", String.valueOf(elapsedRealtime));
        if (isEmpty) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        oszArr[4] = new OSZ("is_information", str2);
        oszArr[5] = new OSZ("path", str);
        FMX.LJIIL("dsp_request_receive", C113554cx.LJJL(oszArr));
    }
}
