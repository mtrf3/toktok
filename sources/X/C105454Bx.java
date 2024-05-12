package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;

/* renamed from: X.4Bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C105454Bx {
    public int LIZ;
    public String LIZIZ;
    public Emoji LIZJ;
    public Integer LIZLLL;
    public SetSticker LJ;
    public VideoSticker LJFF;
    public CommentPersonalizedEmoji LJI;
    public Boolean LJII = Boolean.FALSE;

    public final boolean LIZ() {
        if (this.LIZJ != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        Emoji emoji;
        if (!(obj instanceof C105454Bx)) {
            return false;
        }
        C105454Bx c105454Bx = (C105454Bx) obj;
        if (((c105454Bx.LIZ <= 0 && TextUtils.isEmpty(null)) || c105454Bx.LIZ != this.LIZ || !TextUtils.equals(null, null) || !TextUtils.equals(c105454Bx.LIZIZ, this.LIZIZ)) && ((emoji = c105454Bx.LIZJ) == null || !emoji.equals(this.LIZJ))) {
            return false;
        }
        return true;
    }
}
