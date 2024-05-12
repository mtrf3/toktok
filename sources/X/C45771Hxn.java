package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hxn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45771Hxn {
    public static boolean LIZ;
    public static final boolean LIZIZ;

    public static int LJFF() {
        if (LIZIZ) {
            C43117Gw5.LIZ.getClass();
            return C43117Gw5.LIZIZ;
        }
        return 12;
    }

    static {
        FFL.LJIIIZ().getClass();
        boolean z = true;
        if (!FFL.LJ(31744, "enable_music_stick_point", true, false) || C1DG.LJIIIIZZ()) {
            z = false;
        }
        LIZIZ = z;
    }

    public static String LIZIZ(Context context) {
        String str;
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            str = resources.getString(R.string.rp3);
        } else {
            str = null;
        }
        o.LJI(str);
        return Q8U.LIZIZ(new Object[]{Integer.valueOf(LJFF())}, 1, str, "format(format, *args)");
    }

    public static String LIZJ(AVMusic aVMusic) {
        if (aVMusic == null) {
            return "music == null";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("music_id", aVMusic.getMusicId());
            if (aVMusic.getStickPointMusicAlg() != null) {
                jSONObject.put("AO_url", aVMusic.getStickPointMusicAlg().getVeBeatsUrl());
                jSONObject.put("C_url", aVMusic.getStickPointMusicAlg().getDownBeatsUrl());
                jSONObject.put("A1_url", aVMusic.getStickPointMusicAlg().getNoStrengthBeatsUrl());
                jSONObject.put("man_mode_url", aVMusic.getStickPointMusicAlg().getManModeBeatsUrl());
            } else {
                jSONObject.put("no_url", aVMusic.getId());
            }
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "{\n            val jsonSt…nStr.toString()\n        }");
            return jSONObject2;
        } catch (Exception unused) {
            return "exception";
        }
    }

    public static String LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String downloadDir = C60903NvH.LJIIJJI().LJJIJ().getDownloadDir();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(downloadDir);
        LIZ2.append(C38352F3k.LIZJ(UriProtector.parse(str).getPath()));
        LIZ2.append(".json");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJ(AVMusic aVMusic) {
        if (aVMusic == null || TextUtils.isEmpty(aVMusic.getPath())) {
            return null;
        }
        if (aVMusic.isLocalMusic()) {
            return aVMusic.path;
        }
        return C60903NvH.LJIIJJI().LJJIJ().LJJ(aVMusic);
    }

    public static void LJII(AVMusic aVMusic) {
        int i;
        int i2;
        if (aVMusic == null) {
            return;
        }
        StickPointMusicAlg stickPointMusicAlg = new StickPointMusicAlg();
        stickPointMusicAlg.setMusicId(aVMusic.getMusicId());
        aVMusic.setStickPointMusicAlg(stickPointMusicAlg);
        stickPointMusicAlg.setDefaultLocalUrl(aVMusic.getPath());
        stickPointMusicAlg.setDefaultLocalPath(LIZLLL(stickPointMusicAlg.getDefaultLocalUrl()));
        String str = aVMusic.extra;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("beats");
            if (optJSONObject != null) {
                stickPointMusicAlg.setVeBeatsUrl(optJSONObject.optString("audio_effect_onset"));
                stickPointMusicAlg.setDownBeatsUrl(optJSONObject.optString("merged_beats"));
                stickPointMusicAlg.setNoStrengthBeatsUrl(optJSONObject.optString("beats_tracker"));
                stickPointMusicAlg.setDownBeatsPath(LIZLLL(stickPointMusicAlg.getDownBeatsUrl()));
                stickPointMusicAlg.setVeBeatsPath(LIZLLL(stickPointMusicAlg.getVeBeatsUrl()));
                stickPointMusicAlg.setNoStrengthBeatsPath(LIZLLL(stickPointMusicAlg.getNoStrengthBeatsUrl()));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        MusicBeat musicBeat = aVMusic.getMusicBeat();
        if (musicBeat != null) {
            Integer minVideoNum = musicBeat.getMinVideoNum();
            int i3 = 0;
            if (minVideoNum != null) {
                i = minVideoNum.intValue();
            } else {
                i = 0;
            }
            stickPointMusicAlg.setMinSeg(i);
            Integer maxVideoNum = musicBeat.getMaxVideoNum();
            if (maxVideoNum != null) {
                i3 = maxVideoNum.intValue();
            }
            stickPointMusicAlg.setMaxSeg(i3);
            Integer type = musicBeat.getType();
            if (type != null) {
                i2 = type.intValue();
            } else {
                StickPointMusicAlg.Companion.getClass();
                i2 = StickPointMusicAlg.BEATES_FILE_DEFAULT;
            }
            stickPointMusicAlg.setAlgType(i2);
            stickPointMusicAlg.setManModeBeatsUrl(musicBeat.getManMadeBeats());
            stickPointMusicAlg.setManModeBeatsPath(LIZLLL(stickPointMusicAlg.getManModeBeatsUrl()));
        }
    }

    public static final boolean LJI(AVMusic aVMusic, String str) {
        if (aVMusic != null && aVMusic.musicType == MusicModel.MusicType.LOCAL_SCAN.ordinal()) {
            if (TEVideoUtils.nativeCheckAudioFile(str) == 0) {
                return true;
            }
            return false;
        }
        return C39579Fg7.LIZIZ(str);
    }

    public static Bundle LIZ(Activity activity, ArrayList arrayList, long j, CreativeInfo creativeInfo) {
        int i;
        if (C77413UZt.LJIILL(arrayList)) {
            return null;
        }
        int LJFF = LJFF();
        o.LJI(arrayList);
        int size = LJFF - arrayList.size();
        if (size <= 0) {
            C5S1 c5s1 = new C5S1(activity);
            c5s1.LIZLLL(LIZIZ(activity));
            c5s1.LJ();
            return null;
        }
        long j2 = 3600000 - j;
        Bundle bundle = new Bundle();
        C43117Gw5.LIZ.getClass();
        if (LIZIZ) {
            bundle.putInt("key_photo_select_min_count", 0);
            bundle.putInt("key_photo_select_max_count", size);
            i = 6;
        } else {
            i = 4;
        }
        bundle.putInt("key_support_flag", i);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_video_select_min_count", 0);
        bundle.putInt("key_video_select_max_count", size);
        bundle.putLong("Key_max_duration", j2);
        bundle.putLong("Key_min_duration", 1000L);
        bundle.putStringArrayList("key_selected_video_path", arrayList);
        C77412UZs.LJJIJLIJ(bundle, creativeInfo);
        return bundle;
    }
}
