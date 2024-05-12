package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;

/* loaded from: classes11.dex */
public final class ODH extends AbstractC61551ODr<Pair<UpdatePackage, Long>, Pair<UpdatePackage, Long>> {
    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        Pair pair = (Pair) obj;
        OC6.LIZ("gecko-debug-tag", "update success:", ((UpdatePackage) pair.first).toString());
        try {
            return c61548ODo.LJ(pair);
        } finally {
            UpdatePackage updatePackage = (UpdatePackage) pair.first;
            String accessKey = updatePackage.getAccessKey();
            String channel = updatePackage.getChannel();
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            OAH.LIZLLL((Long) pair.second, new File(new File(c61532OCy.LJ.getRootDirectory(), accessKey), channel).getAbsolutePath(), true, true);
            if (C61511OCd.LJIIIZ(accessKey, channel)) {
                OD6.LJI(4, accessKey, 50, channel);
            }
        }
    }
}
