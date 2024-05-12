package X;

import android.content.Context;
import com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl;
import com.ttnet.org.chromium.net.impl.CronetUrlRequestContext;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class QEL extends CronetEngineBuilderImpl {
    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LIZJ() {
        this.LJJI = true;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LIZLLL() {
        this.LJIIIIZZ = true;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJII() {
        this.LJIIJJI = true;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIIIZ() {
        this.LJJIFFI = true;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIIJ() {
        this.LJIILJJIL = true;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public final CronetUrlRequestContext LIZIZ() {
        if (this.LJ == null) {
            this.LJ = F32.LIZ(this.LIZ);
        }
        return new CronetUrlRequestContext(this);
    }

    public QEL(Context context) {
        super(context);
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJ(boolean z) {
        this.LJII = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJI(boolean z) {
        this.LJIILIIL = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIIIIZZ(boolean z) {
        this.LJI = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIIJJI(boolean z) {
        this.LJJIIJ = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIIL(long j) {
        this.LJJII = j;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIILIIL(C61856OPk c61856OPk) {
        this.LJIILL = c61856OPk;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIILJJIL(QE6 qe6) {
        this.LJIILLIIL = qe6;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIILL(int i) {
        this.LJJIIJZLJL = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIILLIIL(String str) {
        this.LJIJJLI = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIIZILJ(java.util.Map map) {
        this.LJIJJ = map;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIJ(C66652QDw c66652QDw) {
        this.LJIIZILJ = c66652QDw;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIJI(String str) {
        this.LJIJ = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIJJLI(ArrayList arrayList) {
        this.LJIJI = arrayList;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJIL(String str) {
        this.LJJ = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final /* bridge */ /* synthetic */ AbstractC66651QDv LJJ(String str) {
        LJJIIZI(str);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJJI(String str) {
        this.LJIL = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJJIFFI(int i) {
        if (i <= 19 && i >= -20) {
            this.LJIIL = i;
            return this;
        }
        throw new IllegalArgumentException("Thread priority invalid");
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final AbstractC66651QDv LJJII(String str) {
        this.LJ = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final /* bridge */ /* synthetic */ AbstractC66651QDv LJFF(int i, long j) {
        LJJIIJ(i, j);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC66651QDv
    public final /* bridge */ /* synthetic */ AbstractC66651QDv LIZ(int i, int i2, String str) {
        LJJIII(i, i2, str);
        return this;
    }
}
