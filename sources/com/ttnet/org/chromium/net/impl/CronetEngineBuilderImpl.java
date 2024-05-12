package com.ttnet.org.chromium.net.impl;

import X.AbstractC66651QDv;
import X.C16880lQ;
import X.C61856OPk;
import X.C66652QDw;
import X.C66671QEp;
import X.EnumC66657QEb;
import X.QE3;
import X.QE4;
import X.QE6;
import X.QF1;
import android.content.Context;
import android.util.Pair;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class CronetEngineBuilderImpl extends AbstractC66651QDv {
    public final Context LIZ;
    public boolean LIZLLL;
    public String LJ;
    public String LJFF;
    public EnumC66657QEb LJIIIZ;
    public long LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public TTAppInfoProvider LJIILL;
    public QE6 LJIILLIIL;
    public C66652QDw LJIIZILJ;
    public String LJIJ;
    public ArrayList<byte[]> LJIJI;
    public Map<String[], Pair<byte[], byte[]>> LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public long LJJII;
    public String LJJIII;
    public boolean LJJIIJ;
    public int LJJIIJZLJL;
    public final List<C66671QEp> LIZIZ = new LinkedList();
    public final List<QF1> LIZJ = new LinkedList();
    public int LJIIL = 20;
    public boolean LJI = true;
    public boolean LJII = true;
    public boolean LJIIIIZZ = false;

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LIZJ() {
        this.LJJI = true;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LIZLLL() {
        this.LJIIIIZZ = true;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJII() {
        this.LJIIJJI = true;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIIIZ() {
        this.LJJIFFI = true;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIIJ() {
        this.LJIILJJIL = true;
        return this;
    }

    public QE4 LJJIIJZLJL() {
        return null;
    }

    public CronetEngineBuilderImpl LJJIIZ(QE3 qe3) {
        return this;
    }

    static {
        PatternProtector.compile("^[0-9\\.]*$");
        C16880lQ.LJLLJ(CronetEngineBuilderImpl.class);
    }

    public CronetEngineBuilderImpl(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
        LJJIIJ(0, 0L);
        this.LJIIJJI = false;
        this.LIZLLL = true;
        this.LJIILIIL = false;
        this.LJJIIJ = false;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJ(boolean z) {
        this.LJII = z;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJI(boolean z) {
        this.LJIILIIL = z;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIIIIZZ(boolean z) {
        this.LJI = z;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIIJJI(boolean z) {
        this.LJJIIJ = z;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIIL(long j) {
        this.LJJII = j;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIILIIL(C61856OPk c61856OPk) {
        this.LJIILL = c61856OPk;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIILJJIL(QE6 qe6) {
        this.LJIILLIIL = qe6;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIILL(int i) {
        this.LJJIIJZLJL = i;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIILLIIL(String str) {
        this.LJIJJLI = str;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIIZILJ(Map map) {
        this.LJIJJ = map;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIJ(C66652QDw c66652QDw) {
        this.LJIIZILJ = c66652QDw;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIJI(String str) {
        this.LJIJ = str;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public /* bridge */ /* synthetic */ AbstractC66651QDv LJIJJ(QE3 qe3) {
        LJJIIZ(qe3);
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIJJLI(ArrayList arrayList) {
        this.LJIJI = arrayList;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJIL(String str) {
        this.LJJ = str;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public /* bridge */ /* synthetic */ AbstractC66651QDv LJJ(String str) {
        LJJIIZI(str);
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJJI(String str) {
        this.LJIL = str;
        return this;
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJJIFFI(int i) {
        if (i <= 19 && i >= -20) {
            this.LJIIL = i;
            return this;
        }
        throw new IllegalArgumentException("Thread priority invalid");
    }

    @Override // X.AbstractC66651QDv
    public AbstractC66651QDv LJJII(String str) {
        this.LJ = str;
        return this;
    }

    public final void LJJIIZI(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            if (file.isDirectory()) {
                this.LJFF = str;
                return;
            }
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        throw new IllegalArgumentException("create Storage path failed");
    }

    @Override // X.AbstractC66651QDv
    public /* bridge */ /* synthetic */ AbstractC66651QDv LJFF(int i, long j) {
        LJJIIJ(i, j);
        return this;
    }

    public final void LJJIIJ(int i, long j) {
        EnumC66657QEb enumC66657QEb;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC66657QEb = EnumC66657QEb.DISK;
                    } else {
                        throw new IllegalArgumentException("Unknown public builder cache mode");
                    }
                } else {
                    enumC66657QEb = EnumC66657QEb.DISK_NO_HTTP;
                }
            } else {
                enumC66657QEb = EnumC66657QEb.MEMORY;
            }
        } else {
            enumC66657QEb = EnumC66657QEb.DISABLED;
        }
        if (enumC66657QEb.LJLIL != 1 || this.LJFF != null) {
            this.LJIIIZ = enumC66657QEb;
            this.LJIIJ = j;
            return;
        }
        throw new IllegalArgumentException("Storage path must be set");
    }

    @Override // X.AbstractC66651QDv
    public /* bridge */ /* synthetic */ AbstractC66651QDv LIZ(int i, int i2, String str) {
        LJJIII(i, i2, str);
        return this;
    }

    public final void LJJIII(int i, int i2, String str) {
        if (!str.contains("/")) {
            ((LinkedList) this.LIZIZ).add(new C66671QEp(str, i, i2));
            return;
        }
        throw new IllegalArgumentException(i0.LJFF("Illegal QUIC Hint Host: ", str));
    }
}
