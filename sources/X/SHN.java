package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.batchdelete.BatchDeleteAdapterConfigs;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS143S0200000_12;

/* loaded from: classes13.dex */
public final class SHN extends SLJ {
    public final BatchDeleteAdapterConfigs LJLL;

    public SHN(Context context, BatchDeleteAdapterConfigs batchDeleteAdapterConfigs) {
        super(context);
        this.LJLL = batchDeleteAdapterConfigs;
        int i = batchDeleteAdapterConfigs.extraTopMargin;
        if (i != 0) {
            C71909SKb.LIZ.getClass();
            LJLLLLLL(C71909SKb.LIZLLL().LIZLLL(i));
        }
        SK9 sk9 = new SK9();
        AbstractC71913SKf.LIZJ(sk9, R.string.i7a);
        sk9.LJ = Integer.valueOf(R.string.i7_);
        sk9.LJIIIIZZ = new AqS143S0200000_12(context, this, 141);
        LJLLLLLL(sk9.LIZ());
    }
}
