package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JWt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49307JWt implements JT7 {
    public final /* synthetic */ JTS LJLIL;
    public final /* synthetic */ JX8 LJLILLLLZI;

    @Override // X.JT7
    public final List<Aweme> LJI() {
        return null;
    }

    @Override // X.JT7
    public final List<Aweme> getAwemeList() {
        return null;
    }

    @Override // X.JT7
    public final Object LJJIII() {
        DynamicPatch dynamicPatch = this.LJLIL.LJII;
        if (dynamicPatch != null) {
            return dynamicPatch.getKey();
        }
        return null;
    }

    @Override // X.JT7
    public final int LJFF() {
        return JX8.LJLJJL;
    }

    @Override // X.JT7
    public final boolean LIZ(Aweme awemeScrollTo) {
        o.LJIIIZ(awemeScrollTo, "awemeScrollTo");
        if (((ArrayList) this.LJLILLLLZI.LJLILLLLZI).isEmpty()) {
            return true;
        }
        Iterator it = ((ArrayList) this.LJLILLLLZI.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(awemeScrollTo.getAid(), (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public C49307JWt(JTS jts, JX8 jx8) {
        this.LJLIL = jts;
        this.LJLILLLLZI = jx8;
    }
}
