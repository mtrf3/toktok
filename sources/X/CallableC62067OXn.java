package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.OXn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC62067OXn<V> implements Callable {
    public final /* synthetic */ BaseSharePackage LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public CallableC62067OXn(BaseSharePackage baseSharePackage, String str) {
        this.LJLIL = baseSharePackage;
        this.LJLILLLLZI = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        BaseSharePackage baseSharePackage = this.LJLIL;
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        String str = this.LJLILLLLZI;
        String LJIIJJI = C78866UxK.LJIIJJI(baseSharePackage.itemType, baseSharePackage.url, str);
        if (!AV1.LJIIJJI()) {
            String str2 = baseSharePackage.itemType;
            baseSharePackage.extras.getBoolean("bool_persist");
            if (!TextUtils.isEmpty(LJIIJJI)) {
                LJIIJJI = C4LD.LIZIZ.LJJLIIIJLLLLLLLZ(str2, str, LJIIJJI).LIZLLL();
            }
            return "";
        }
        if (LJIIJJI == null) {
            return "";
        }
        return LJIIJJI;
    }
}
