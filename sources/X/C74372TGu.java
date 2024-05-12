package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS173S0100000_7;

/* renamed from: X.TGu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74372TGu extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final OSZ<Integer, Integer> LJLJJI;
    public final OSZ<Integer, Integer> LJLJJL;
    public final boolean LJLJJLL;
    public final InterfaceC88472Yns<? super View, C76800UCe> LJLJL;
    public final InterfaceC88471Ynr<? super Context, ? super InterfaceC65784Pro<C76800UCe>, C76800UCe> LJLJLJ;
    public final InterfaceC88472Yns<? super Boolean, Boolean> LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final InterfaceC88472Yns<? super C74373TGv, C76800UCe> LJLLILLLL;
    public final boolean LJLLJ;
    public final Drawable LJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL, Boolean.valueOf(this.LJLJJLL), this.LJLJL, this.LJLJLJ, this.LJLJLLL, Integer.valueOf(this.LJLL), Integer.valueOf(this.LJLLI), this.LJLLILLLL, Boolean.valueOf(this.LJLLJ), this.LJLLL};
    }

    public C74372TGu(int i, boolean z, AqS145S0200000_14 aqS145S0200000_14, AqS173S0100000_7 aqS173S0100000_7, int i2, C74374TGw c74374TGw, SY9 sy9, int i3) {
        int i4;
        int i5;
        if ((i3 & 1) != 0) {
            i4 = (int) C74275TDb.LIZ(32.0f);
        } else {
            i4 = 0;
        }
        if ((i3 & 2) != 0) {
            i5 = (int) C74275TDb.LIZ(10.0f);
        } else {
            i5 = 0;
        }
        i = (i3 & 4) != 0 ? -2 : i;
        z = (i3 & 32) != 0 ? true : z;
        aqS145S0200000_14 = (i3 & 64) != 0 ? null : aqS145S0200000_14;
        aqS173S0100000_7 = (i3 & 256) != 0 ? null : aqS173S0100000_7;
        i2 = (i3 & 512) != 0 ? R.drawable.b71 : i2;
        c74374TGw = (i3 & 2048) != 0 ? null : c74374TGw;
        sy9 = (i3 & FileUtils.BUFFER_SIZE) != 0 ? null : sy9;
        this.LJLIL = i4;
        this.LJLILLLLZI = i5;
        this.LJLJI = i;
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = z;
        this.LJLJL = aqS145S0200000_14;
        this.LJLJLJ = null;
        this.LJLJLLL = aqS173S0100000_7;
        this.LJLL = i2;
        this.LJLLI = 0;
        this.LJLLILLLL = c74374TGw;
        this.LJLLJ = false;
        this.LJLLL = sy9;
    }
}
