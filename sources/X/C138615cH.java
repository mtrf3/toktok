package X;

import Y.AfS0S1100100_1;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.MusicCopyrightApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.5cH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138615cH {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C139015cv.LJLIL);
    public static final C73318Sq2 LIZIZ = new C73318Sq2();
    public static final java.util.Map<String, Integer> LIZJ = new LinkedHashMap();

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        String musicId;
        Integer num;
        if (videoPublishEditModel == null || (musicId = videoPublishEditModel.getMusicId()) == null || musicId.length() == 0) {
            return false;
        }
        java.util.Map<String, Integer> map = LIZJ;
        if (!map.containsKey(videoPublishEditModel.getMusicId())) {
            return false;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Integer num2 = (Integer) linkedHashMap.get(videoPublishEditModel.getMusicId());
        if ((num2 == null || num2.intValue() != 1) && ((num = (Integer) linkedHashMap.get(videoPublishEditModel.getMusicId())) == null || num.intValue() != 2)) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        String musicId;
        Integer num;
        if (!C133195Kp.LIZ() || videoPublishEditModel == null || !videoPublishEditModel.hasMusic() || (musicId = videoPublishEditModel.getMusicId()) == null || musicId.length() == 0) {
            return false;
        }
        if (nLEModel != null) {
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            String str = "";
            if (tracks != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    NLETrack nLETrack = next;
                    if (C124574uj.LJJIL(nLETrack) || C124574uj.LJJJ(nLETrack)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                boolean z = true;
                while (it2.hasNext()) {
                    NLETrack nLETrack2 = (NLETrack) it2.next();
                    if (nLETrack2 != null) {
                        Iterator<NLETrackSlot> it3 = nLETrack2.LJIILL().iterator();
                        while (it3.hasNext()) {
                            NLETrackSlot slot = it3.next();
                            o.LJIIIIZZ(slot, "slot");
                            if (!AnonymousClass636.LJIIJJI(slot)) {
                                z = false;
                            }
                            str = slot.getExtra("d_bgmId");
                            o.LJIIIIZZ(str, "slot.getExtra(AudioTag.BGM_ID)");
                        }
                    }
                }
                if (z || !o.LJ(str, videoPublishEditModel.getMusicId())) {
                    return false;
                }
            }
            return false;
        }
        if (videoPublishEditModel.musicVolume == 0.0f) {
            return false;
        }
        java.util.Map<String, Integer> map = LIZJ;
        if (!map.containsKey(videoPublishEditModel.getMusicId())) {
            return false;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Integer num2 = (Integer) linkedHashMap.get(videoPublishEditModel.getMusicId());
        if ((num2 == null || num2.intValue() != 1) && ((num = (Integer) linkedHashMap.get(videoPublishEditModel.getMusicId())) == null || num.intValue() != 2)) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(String str, InterfaceC88472Yns callback) {
        o.LJIIIZ(callback, "callback");
        if (LIZJ.containsKey(str)) {
            C2VQ.LIZIZ(new AqS151S0100000_1(callback, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 796), 0L);
            return;
        }
        LIZIZ.LIZ(((MusicCopyrightApi) LIZ.getValue()).checkMusicCopyright(str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S1100100_1(System.currentTimeMillis(), callback, str, 0), new InterfaceC64592gB() { // from class: X.4ip
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("checkMusicCopyright ");
                LIZ2.append(C76800UCe.LIZ);
                H78.LIZJ(X1D.LIZIZ(LIZ2));
                C43882HKc.LIZLLL(1, "music_lyric_copyright_request_info", null, true);
            }
        }));
    }
}
