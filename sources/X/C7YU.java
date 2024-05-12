package X;

import android.content.Context;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.7YU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YU {
    public static String LIZ(Music music, Context context, boolean z, boolean z2) {
        String musicName = music.getMusicName();
        if (musicName == null) {
            musicName = "";
        }
        if (!z2) {
            if (z) {
                if (!music.isMatchMetadata() && o.LJJJLIIL(musicName, "@", false)) {
                    String substring = musicName.substring(1);
                    kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                    return substring;
                }
            } else {
                return musicName;
            }
        } else if (!z) {
            return musicName;
        }
        if (!C78857UxB.LJJJIL(music.getExtra()) || new JSONObject(music.getExtra()).optInt("has_edited") == 1) {
            return musicName;
        }
        String string = context.getString(R.string.jdn);
        kotlin.jvm.internal.o.LJIIIIZZ(string, "context.getString(R.string.original_music)");
        return string;
    }
}
