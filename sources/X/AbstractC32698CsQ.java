package X;

import X.C30896CAq;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;

/* renamed from: X.CsQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32698CsQ<T extends C30896CAq> {
    public final int LIZ;
    public T LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public ImageModel LJ;
    public ImageModel LJFF;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public boolean LJI = true;
    public String LJII = "";
    public long LJIIL = -1;

    public abstract String LIZ();

    public abstract long LIZJ();

    public abstract ImageModel LIZLLL();

    public ImageModel LJ() {
        return null;
    }

    public abstract String LJFF();

    public boolean LJIIL() {
        return this instanceof C32774Cte;
    }

    public final int LIZIZ() {
        T t = this.LIZIZ;
        if (t != null && (t instanceof Gift)) {
            return ((Gift) t).diamondCount;
        }
        return 0;
    }

    public boolean LJI() {
        ImageModel imageModel;
        List<String> list;
        T t = this.LIZIZ;
        if (!(t instanceof Gift) || (imageModel = ((Gift) t).previewImage) == null || (list = imageModel.mUrls) == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean LJII() {
        T t = this.LIZIZ;
        if (t != null && (t instanceof Gift) && ((Gift) t).giftSubInfo != null && ((((Gift) t).giftSubInfo.mLockType == 3 || ((Gift) t).giftSubInfo.mLockType == 4) && ((Gift) t).giftSubInfo.mLock)) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ() {
        T t = this.LIZIZ;
        if (t != null && (t instanceof Gift) && ((Gift) t).giftSubInfo != null && ((Gift) t).giftSubInfo.mLock) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ() {
        T t = this.LIZIZ;
        if (t != null && (t instanceof Gift) && ((Gift) t).giftSubInfo != null && ((Gift) t).giftSubInfo.mLockType == 1 && ((Gift) t).giftSubInfo.mLock) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ() {
        T t = this.LIZIZ;
        if (t != null && (t instanceof Gift) && ((Gift) t).giftSubInfo != null && ((Gift) t).giftSubInfo.mLockType == 3 && ((Gift) t).giftSubInfo.mLock) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJJI() {
        T t = this.LIZIZ;
        if (t != null && (t instanceof Gift) && ((Gift) t).giftSubInfo != null && ((Gift) t).giftSubInfo.mLockType == 3 && !((Gift) t).giftSubInfo.mLock) {
            return true;
        }
        return false;
    }

    public AbstractC32698CsQ(int i, T t) {
        this.LIZ = i;
        this.LIZIZ = t;
    }
}
