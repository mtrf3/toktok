package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem;
import com.zhiliaoapp.musically.R;

/* renamed from: X.KDw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51364KDw implements KEV {
    public final /* synthetic */ EcSearchResultContainerAssem LIZ;

    public C51364KDw(EcSearchResultContainerAssem ecSearchResultContainerAssem) {
        this.LIZ = ecSearchResultContainerAssem;
    }

    @Override // X.KEV
    public final void LIZ(KEI kei, int i) {
        String str;
        Context context;
        EcSearchResultContainerAssem ecSearchResultContainerAssem = this.LIZ;
        C51360KDs c51360KDs = ecSearchResultContainerAssem.LJLLI;
        if (c51360KDs != null && (context = ecSearchResultContainerAssem.getContext()) != null) {
            int i2 = KE5.LIZ[((KAK) ListProtector.get(c51360KDs.LIZ, i)).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        str = "LIVE";
                    }
                } else {
                    str = context.getString(R.string.fdh);
                }
            } else {
                str = context.getString(R.string.fdg);
            }
            kei.LIZIZ(str);
        }
        str = null;
        kei.LIZIZ(str);
    }
}
