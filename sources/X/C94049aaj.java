package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aaj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94049aaj extends AbstractC03120Ai {
    public final List<C94054aao> LIZ;
    public final List<C94054aao> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C94049aaj(List list, List list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        String str;
        C94054aao c94054aao = (C94054aao) ListProtector.get(this.LIZ, i);
        C94054aao c94054aao2 = (C94054aao) ListProtector.get(this.LIZIZ, i2);
        ProviderEffect.StickerBean sticker_info = c94054aao.LJLIL.getSticker_info();
        String str2 = null;
        if (sticker_info != null) {
            str = sticker_info.getUrl();
        } else {
            str = null;
        }
        ProviderEffect.StickerBean sticker_info2 = c94054aao2.LJLIL.getSticker_info();
        if (sticker_info2 != null) {
            str2 = sticker_info2.getUrl();
        }
        if (o.LJ(str, str2) && c94054aao.LJLILLLLZI == c94054aao2.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(((C94054aao) ListProtector.get(this.LIZ, i)).LJLIL.getId(), ((C94054aao) ListProtector.get(this.LIZIZ, i2)).LJLIL.getId());
    }

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        if (((C94054aao) ListProtector.get(this.LIZ, i)).LJLILLLLZI != ((C94054aao) ListProtector.get(this.LIZIZ, i2)).LJLILLLLZI) {
            return 1;
        }
        return null;
    }
}
