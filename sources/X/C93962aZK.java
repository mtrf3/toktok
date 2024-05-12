package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.aZK, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93962aZK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AKT toast, TT2DSPSongInfo dspSongInfo, Fragment fragment, DspAuthParam authParam, String songId, boolean z, boolean z2, boolean z3) {
        C2068389v c2068389v;
        String LLLZ;
        String str;
        o.LJIIIZ(toast, "toast");
        o.LJIIIZ(dspSongInfo, "dspSongInfo");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(authParam, "authParam");
        o.LJIIIZ(songId, "songId");
        DspPlatform.Companion companion = DspPlatform.Companion;
        int i = C93958aZG.LIZ[companion.from(dspSongInfo.getDspPlatform()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_color_spotify_icon;
            } else {
                c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_color_amazon_music;
            }
        } else {
            c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_apple_music;
        }
        DspPlatform from = companion.from(dspSongInfo.getDspPlatform());
        DspPlatform dspPlatform = DspPlatform.SPOTIFY;
        if (from == dspPlatform) {
            LLLZ = fragment.getString(R.string.ba7);
        } else {
            String string = fragment.getString(R.string.bab);
            o.LJIIIIZZ(string, "fragment.getString(R.str…DSP_fyp_bottomToastTitle)");
            LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{fragment.getString(R.string.bac)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
        }
        o.LJIIIIZZ(LLLZ, "if (DspPlatform.from(dsp…,\n            )\n        }");
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        toast.LJ(R.style.ux);
        toast.LIZ.LJLILLLLZI = 4;
        toast.LJIIIIZZ(c2068389v);
        toast.LJI(LLLZ);
        toast.LIZJ(3000L);
        if (C93876aXw.LIZ(companion.from(dspSongInfo.getDspPlatform()))) {
            toast.LIZ.LJLJJI = 3;
            toast.LIZ.LJLJJL = new C94706alK(toast, songId, fragment, z2, str);
        } else if (companion.from(dspSongInfo.getDspPlatform()) == dspPlatform) {
            C208158Ex c208158Ex = toast.LIZ;
            c208158Ex.LJLJJI = 3;
            c208158Ex.LJLJLJ = ViewOnClickListenerC93960aZI.LJLIL;
        } else {
            toast.LIZ.LJLJJI = 2;
            toast.LIZLLL(R.string.fgu);
            toast.LIZ.LJLJLJ = new ViewOnClickListenerC93961aZJ(authParam, fragment, dspSongInfo, z3);
        }
    }
}
