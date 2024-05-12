package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.ODl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61545ODl extends AbstractC61536ODc<UpdatePackage, Pair<android.net.Uri, UpdatePackage>> {
    public int LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC61536ODc
    public final Pair<android.net.Uri, UpdatePackage> LIZJ() {
        UpdatePackage updatePackage = (UpdatePackage) this.LJI;
        List<String> urlList = updatePackage.getPackage().getUrlList();
        int i = this.LJIIIIZZ;
        this.LJIIIIZZ = i + 1;
        return new Pair<>(UriProtector.parse((String) ListProtector.get(urlList, i)), updatePackage);
    }
}
