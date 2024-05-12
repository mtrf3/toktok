package X;

import android.content.res.Resources;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public enum GT2 {
    PHOTO_MODE(null),
    CREATOR_ALLOW_AUTOCAPTIONS_OLD(Integer.valueOf(R.string.eb2)),
    CREATOR_ALLOW_AUTOCAPTIONS_PUBLIC(Integer.valueOf(R.string.eb4)),
    CREATOR_ALLOW_AUTOCAPTIONS_ORIGINAL(Integer.valueOf(R.string.eb3)),
    CREATOR_ALLOW_AUTOCAPTIONS_PGC(Integer.valueOf(R.string.tqn));

    public final Integer LJLIL;

    public static GT2 valueOf(String str) {
        return (GT2) V0N.LJJJ(GT2.class, str);
    }

    public final Integer getResourceString() {
        return this.LJLIL;
    }

    public final String getReason(Resources resources) {
        o.LJIIIZ(resources, "resources");
        Integer num = this.LJLIL;
        if (num != null) {
            String string = resources.getString(num.intValue());
            o.LJIIIIZZ(string, "resources.getString(resourceString)");
            return string;
        }
        return "";
    }

    GT2(Integer num) {
        this.LJLIL = num;
    }
}
