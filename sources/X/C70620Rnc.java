package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.header.vh.UsHeaderVH;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rnc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70620Rnc implements InterfaceC70636Rns {
    public final /* synthetic */ UsHeaderVH LIZ;

    public C70620Rnc(UsHeaderVH usHeaderVH) {
        this.LIZ = usHeaderVH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC70636Rns
    public final void onPageSelected(int i) {
        ((C116894iL) this.LIZ._$_findCachedViewById(R.id.el4)).setSelectedIndex(i);
        List<MediaItem> list = ((C69694RWw) this.LIZ.getItem()).LJLJL;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<MediaItem> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().type == 2 && (i2 = i2 + 1) < 0) {
                C47261Igj.LJJJJIZL();
                throw null;
            }
        }
        if (i2 <= 0) {
            return;
        }
        if (i != this.LIZ.L()) {
            this.LIZ._$_findCachedViewById(R.id.n4s).setVisibility(8);
        } else {
            if (this.LIZ.L() != 0) {
                return;
            }
            this.LIZ._$_findCachedViewById(R.id.n4s).setVisibility(0);
        }
    }
}
