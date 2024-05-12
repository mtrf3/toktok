package X;

import com.ss.android.ugc.aweme.sticker.model.PropInfoData;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.THh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74385THh extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;
    public final C53048Krs LJLJL;
    public final boolean LJLJLJ;
    public final PropInfoData LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final InterfaceC88472Yns<Effect, C76800UCe> LJLLILLLL;
    public final InterfaceC88471Ynr<Boolean, Effect, C76800UCe> LJLLJ;
    public final InterfaceC88471Ynr<String, Effect, C76800UCe> LJLLL;
    public final boolean LJLLLL;
    public final String LJLLLLLL;
    public final boolean LJLZ;

    public C74385THh() {
        throw null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), this.LJLJJLL, this.LJLJL, Boolean.valueOf(this.LJLJLJ), this.LJLJLLL, Boolean.valueOf(this.LJLL), Boolean.valueOf(this.LJLLI), this.LJLLILLLL, this.LJLLJ, this.LJLLL, Boolean.valueOf(this.LJLLLL), this.LJLLLLLL, Boolean.valueOf(this.LJLZ)};
    }

    public C74385THh(String panel, boolean z, boolean z2, int i, String str, C53048Krs c53048Krs, int i2) {
        boolean z3;
        C74386THi downloadStart;
        E8W downloadEnd;
        L4D applyProp;
        boolean z4 = z;
        String str2 = str;
        boolean z5 = z2;
        C53048Krs paginationConfigure = c53048Krs;
        if ((i2 & 2) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        z4 = (i2 & 4) != 0 ? true : z4;
        z5 = (i2 & 8) != 0 ? true : z5;
        int i3 = (i2 & 16) == 0 ? i : 1;
        str2 = (i2 & 32) != 0 ? null : str2;
        paginationConfigure = (i2 & 64) != 0 ? new C53048Krs(false, 0, 0, 0, 0) : paginationConfigure;
        if ((i2 & 2048) != 0) {
            downloadStart = C74386THi.LJLIL;
        } else {
            downloadStart = null;
        }
        if ((i2 & 4096) != 0) {
            downloadEnd = E8W.LJLIL;
        } else {
            downloadEnd = null;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            applyProp = L4D.LJLIL;
        } else {
            applyProp = null;
        }
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(paginationConfigure, "paginationConfigure");
        o.LJIIIZ(downloadStart, "downloadStart");
        o.LJIIIZ(downloadEnd, "downloadEnd");
        o.LJIIIZ(applyProp, "applyProp");
        this.LJLIL = panel;
        this.LJLILLLLZI = z3;
        this.LJLJI = z4;
        this.LJLJJI = z5;
        this.LJLJJL = i3;
        this.LJLJJLL = str2;
        this.LJLJL = paginationConfigure;
        this.LJLJLJ = false;
        this.LJLJLLL = null;
        this.LJLL = false;
        this.LJLLI = false;
        this.LJLLILLLL = downloadStart;
        this.LJLLJ = downloadEnd;
        this.LJLLL = applyProp;
        this.LJLLLL = false;
        this.LJLLLLLL = null;
        this.LJLZ = false;
    }
}
