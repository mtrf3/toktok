package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.T3u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74034T3u implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final UrlModel LJLJI;
    public final android.net.Uri LJLJJI;
    public final C43I<EnumC46467ILn> LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74034T3u)) {
            return false;
        }
        C74034T3u c74034T3u = (C74034T3u) obj;
        return o.LJ(this.LJLIL, c74034T3u.LJLIL) && o.LJ(this.LJLILLLLZI, c74034T3u.LJLILLLLZI) && o.LJ(this.LJLJI, c74034T3u.LJLJI) && o.LJ(this.LJLJJI, c74034T3u.LJLJJI) && o.LJ(this.LJLJJL, c74034T3u.LJLJJL);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LJLJI.hashCode() + C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31)) * 31;
        android.net.Uri uri = this.LJLJJI;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        C43I<EnumC46467ILn> c43i = this.LJLJJL;
        if (c43i != null) {
            i = c43i.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectDoneState(effectName=");
        LIZ.append(this.LJLIL);
        LIZ.append(", author=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", originalEffectImage=");
        LIZ.append(this.LJLJI);
        LIZ.append(", editedImage=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", uiEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C74034T3u(String effectName, String author, UrlModel originalEffectImage, android.net.Uri uri, C43I<? extends EnumC46467ILn> c43i) {
        o.LJIIIZ(effectName, "effectName");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(originalEffectImage, "originalEffectImage");
        this.LJLIL = effectName;
        this.LJLILLLLZI = author;
        this.LJLJI = originalEffectImage;
        this.LJLJJI = uri;
        this.LJLJJL = c43i;
    }
}
