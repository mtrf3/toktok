package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UFh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76881UFh {
    public final LiveSubMediaModel LIZ;
    public final Bitmap LIZIZ;
    public final Bitmap LIZJ;
    public final Object LIZLLL;

    public C76881UFh() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76881UFh)) {
            return false;
        }
        C76881UFh c76881UFh = (C76881UFh) obj;
        return o.LJ(this.LIZ, c76881UFh.LIZ) && o.LJ(this.LIZIZ, c76881UFh.LIZIZ) && o.LJ(this.LIZJ, c76881UFh.LIZJ) && o.LJ(this.LIZLLL, c76881UFh.LIZLLL);
    }

    public final int hashCode() {
        LiveSubMediaModel liveSubMediaModel = this.LIZ;
        int hashCode = (liveSubMediaModel == null ? 0 : liveSubMediaModel.hashCode()) * 31;
        Bitmap bitmap = this.LIZIZ;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        Object obj = this.LIZLLL;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EmoteEditFinishParams(imageBitmapMediaModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", imageBitmap=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", previewImageBitmap=");
        LIZ.append(this.LIZJ);
        LIZ.append(", textStickerView=");
        return U26.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C76881UFh(LiveSubMediaModel liveSubMediaModel, Bitmap bitmap, Bitmap bitmap2, Object obj) {
        this.LIZ = liveSubMediaModel;
        this.LIZIZ = bitmap;
        this.LIZJ = bitmap2;
        this.LIZLLL = obj;
    }
}
