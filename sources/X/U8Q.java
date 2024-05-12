package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveLinkMicDefaultMaskSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8Q {
    public final C76665U6z LIZ;
    public final CopyOnWriteArrayList<Region> LIZIZ;
    public InterfaceC75807Tp5 LIZJ;
    public final C278417k<String, Bitmap> LIZLLL;
    public C73546Sti LJ;
    public Bitmap LJFF;

    public U8Q(C76665U6z config) {
        o.LJIIIZ(config, "config");
        this.LIZ = config;
        this.LIZIZ = new CopyOnWriteArrayList<>();
        this.LIZLLL = new C278417k<>(6);
    }

    public static OSZ LIZIZ(OSZ osz) {
        return new OSZ(Integer.valueOf((((Number) osz.getFirst()).intValue() % 2) + ((Number) osz.getFirst()).intValue()), Integer.valueOf((((Number) osz.getSecond()).intValue() % 2) + ((Number) osz.getSecond()).intValue()));
    }

    public static RectF LJ(Region region) {
        return new RectF((float) region.getX(), (float) region.getY(), (float) (region.getWidth() + region.getX()), (float) (region.getHeight() + region.getY()));
    }

    public final boolean LIZ(InterfaceC75807Tp5 interfaceC75807Tp5, List<? extends Region> list) {
        if (!o.LJ(this.LIZJ, interfaceC75807Tp5) || this.LIZIZ.size() != list.size()) {
            return false;
        }
        Iterator<Region> it = this.LIZIZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            Region next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                Region region = next;
                if (!o.LJ(region.getInteractId(), ((Region) ListProtector.get(list, i)).getInteractId()) || region.getWidth() != ((Region) ListProtector.get(list, i)).getWidth() || region.getHeight() != ((Region) ListProtector.get(list, i)).getHeight() || region.getX() != ((Region) ListProtector.get(list, i)).getX() || region.getY() != ((Region) ListProtector.get(list, i)).getY()) {
                    return false;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return true;
    }

    public final Bitmap LIZJ(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bitmap_");
        LIZ.append(i);
        LIZ.append('_');
        LIZ.append(i2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (this.LIZLLL.get(LIZIZ) == null) {
            return null;
        }
        return this.LIZLLL.get(LIZIZ);
    }

    public final AbstractC73672Svk<Bitmap> LIZLLL(int i, int i2) {
        Drawable drawable;
        Bitmap LIZJ = LIZJ(i, i2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getBitmap width = ");
        LIZ.append(i);
        LIZ.append(" height = ");
        LIZ.append(i2);
        C0NB.LIZIZ("def_mask", X1D.LIZIZ(LIZ));
        if (LIZJ != null) {
            C0NB.LIZIZ("def_mask", "getBitmap return from cache");
            return AbstractC73672Svk.LJJIJIL(LIZJ);
        }
        float f = Resources.getSystem().getDisplayMetrics().density;
        InterfaceC75807Tp5 interfaceC75807Tp5 = this.LIZJ;
        if (interfaceC75807Tp5 == null || (drawable = interfaceC75807Tp5.m5()) == null) {
            drawable = this.LIZ.LJIIIIZZ;
        }
        if (LiveLinkMicDefaultMaskSetting.INSTANCE.useDefault()) {
            return AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJIIJ(new C36694Eag(this, i, f, i2, drawable)), AbstractC73672Svk.LJIIJ(new C72923Sjf(this, f)), new C72925Sjh(this, i, i2));
        }
        return AbstractC73672Svk.LJIIJ(new C36695Eah(this, i, f, i2, drawable)).LJIJJLI(new C72926Sji(this, i, i2));
    }
}
