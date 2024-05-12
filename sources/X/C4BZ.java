package X;

import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4BZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4BZ extends C72462ss {
    public List<Emoji> LIZIZ;
    public Resources LIZJ;

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final Drawable LIZ() {
        return null;
    }

    @Override // X.InterfaceC105334Bl
    public final int LJ() {
        return 2;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final int LJFF() {
        return R.drawable.asr;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final boolean LIZLLL() {
        List<Emoji> list = this.LIZIZ;
        if (list != null && list.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final String LJIIIIZZ() {
        return this.LIZJ.getIconUrl();
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final List<C105454Bx> LJIIJJI() {
        Emoji emoji;
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            C105454Bx c105454Bx = new C105454Bx();
            if (i >= 0 && i < this.LIZIZ.size() && (emoji = (Emoji) ListProtector.get(this.LIZIZ, i)) != null) {
                c105454Bx.LIZIZ = C1GE.LJ(emoji);
                c105454Bx.LIZJ = emoji;
            }
            arrayList.add(c105454Bx);
        }
        return arrayList;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final String getName() {
        return this.LIZJ.getDisplayName();
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final int LIZIZ() {
        if (!LIZLLL()) {
            return 1;
        }
        return ((this.LIZIZ.size() - 1) / 8) + 1;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final String LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(2);
        LIZ.append("-");
        LIZ.append(this.LIZJ.getId());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C72462ss
    public final int LJIIL() {
        if (LIZLLL()) {
            return 8;
        }
        return 1;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final List<C105454Bx> LIZJ(int i) {
        Emoji emoji;
        ArrayList arrayList = new ArrayList(8);
        for (int i2 = i * 8; i2 < (i + 1) * 8; i2++) {
            C105454Bx c105454Bx = new C105454Bx();
            if (i2 >= 0 && i2 < this.LIZIZ.size() && (emoji = (Emoji) ListProtector.get(this.LIZIZ, i2)) != null) {
                c105454Bx.LIZIZ = C1GE.LJ(emoji);
                c105454Bx.LIZJ = emoji;
            }
            arrayList.add(c105454Bx);
        }
        return arrayList;
    }
}
