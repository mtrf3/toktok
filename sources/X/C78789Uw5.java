package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Uw5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78789Uw5 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Effect LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final EnumC78125UlN LJIIIZ;
    public boolean LJIIJ;
    public final Bitmap LJIIJJI;

    public C78789Uw5() {
        this(null, null, null, null, null, null, 0, 0, 0, null, false, null, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78789Uw5)) {
            return false;
        }
        C78789Uw5 c78789Uw5 = (C78789Uw5) obj;
        return o.LJ(this.LIZ, c78789Uw5.LIZ) && o.LJ(this.LIZIZ, c78789Uw5.LIZIZ) && o.LJ(this.LIZJ, c78789Uw5.LIZJ) && o.LJ(this.LIZLLL, c78789Uw5.LIZLLL) && o.LJ(this.LJ, c78789Uw5.LJ) && o.LJ(this.LJFF, c78789Uw5.LJFF) && this.LJI == c78789Uw5.LJI && this.LJII == c78789Uw5.LJII && this.LJIIIIZZ == c78789Uw5.LJIIIIZZ && this.LJIIIZ == c78789Uw5.LJIIIZ && this.LJIIJ == c78789Uw5.LJIIJ && o.LJ(this.LJIIJJI, c78789Uw5.LJIIJJI);
    }

    public final String toString() {
        return "AnnotationItem(tabCategory=" + this.LIZ + ", iconUrl=" + this.LIZIZ + ", key=" + this.LIZJ + ", name=" + this.LIZLLL + ", optionName=" + this.LJ + ", effect=" + this.LJFF + ", width=" + this.LJI + ", height=" + this.LJII + ", radius=" + this.LJIIIIZZ + ", type=" + this.LJIIIZ + ", selected=" + this.LJIIJ + ", thumbnail=" + this.LJIIJJI + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31);
        String str = this.LJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Effect effect = this.LJFF;
        if (effect == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = effect.hashCode();
        }
        int hashCode3 = (this.LJIIIZ.hashCode() + ((((((((i2 + hashCode2) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31)) * 31;
        boolean z = this.LJIIJ;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (hashCode3 + i3) * 31;
        Bitmap bitmap = this.LJIIJJI;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return i4 + i;
    }

    public C78789Uw5(String tabCategory, String iconUrl, String key, String str, String str2, Effect effect, int i, int i2, int i3, EnumC78125UlN enumC78125UlN, boolean z, Bitmap bitmap, int i4) {
        int i5 = i3;
        EnumC78125UlN type = enumC78125UlN;
        boolean z2 = z;
        tabCategory = (i4 & 1) != 0 ? "" : tabCategory;
        iconUrl = (i4 & 2) != 0 ? "" : iconUrl;
        key = (i4 & 4) != 0 ? "" : key;
        String name = (i4 & 8) == 0 ? str : "";
        str2 = (i4 & 16) != 0 ? null : str2;
        effect = (i4 & 32) != 0 ? null : effect;
        i = (i4 & 64) != 0 ? 62 : i;
        int i6 = (i4 & 128) == 0 ? i2 : 62;
        i5 = (i4 & 256) != 0 ? 20 : i5;
        type = (i4 & 512) != 0 ? EnumC78125UlN.REMOTE : type;
        z2 = (i4 & 1024) != 0 ? false : z2;
        Bitmap bitmap2 = (i4 & 2048) == 0 ? bitmap : null;
        o.LJIIIZ(tabCategory, "tabCategory");
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(type, "type");
        this.LIZ = tabCategory;
        this.LIZIZ = iconUrl;
        this.LIZJ = key;
        this.LIZLLL = name;
        this.LJ = str2;
        this.LJFF = effect;
        this.LJI = i;
        this.LJII = i6;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = type;
        this.LJIIJ = z2;
        this.LJIIJJI = bitmap2;
    }
}
