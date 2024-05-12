package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.MEi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC56472MEi {
    public Aweme LIZ;
    public final ImageView LIZIZ;
    public Bitmap LIZJ;

    public final boolean LIZ() {
        Aweme aweme = this.LIZ;
        if (aweme == null || aweme.getVideo() == null || aweme.getVideo().getBigThumbs() == null || aweme.getVideo().getBigThumbs().size() <= 0) {
            return false;
        }
        return true;
    }

    public AbstractC56472MEi(Context context, Aweme aweme, ImageView imageView) {
        o.LJIIIZ(imageView, "imageView");
        this.LIZ = aweme;
        this.LIZIZ = imageView;
    }
}
