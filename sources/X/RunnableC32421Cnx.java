package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cnx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32421Cnx implements Runnable {
    public final /* synthetic */ C32420Cnw LJLIL;
    public final /* synthetic */ C32423Cnz LJLILLLLZI;
    public final /* synthetic */ AssetsModel LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    public RunnableC32421Cnx(C32420Cnw c32420Cnw, C32423Cnz c32423Cnz, AssetsModel assetsModel, long j, long j2, int i) {
        this.LJLIL = c32420Cnw;
        this.LJLILLLLZI = c32423Cnz;
        this.LJLJI = assetsModel;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = i;
    }

    public final void LIZ() {
        String str;
        C32420Cnw c32420Cnw = this.LJLIL;
        String[] strArr = c32420Cnw.LIZJ;
        String str2 = null;
        if (strArr == null || (str = strArr[0]) == null) {
            str = "";
        }
        Long l = (Long) ((LinkedHashMap) this.LJLILLLLZI.LIZ).get(c32420Cnw.LIZ);
        Long l2 = (Long) ((LinkedHashMap) this.LJLILLLLZI.LIZIZ).get(this.LJLIL.LIZ);
        String resourceFormat = this.LJLJI.getResourceFormat(this.LJLIL.LJ);
        ResourceModel resourceModel = this.LJLJI.resourceByteVC1Model;
        if (resourceModel != null) {
            str2 = resourceModel.uri;
        }
        C32420Cnw c32420Cnw2 = this.LJLIL;
        String md5 = c32420Cnw2.LJ;
        long LJ = C32366Cn4.LJ(c32420Cnw2);
        long j = this.LJLJI.size;
        java.util.Map map = this.LJLIL.LJIIIIZZ;
        if (map == null) {
            map = new LinkedHashMap();
        }
        int i = this.LJLIL.LJII;
        long j2 = this.LJLJJI;
        long j3 = this.LJLJJL;
        int i2 = this.LJLJJLL;
        o.LJIIIIZZ(md5, "md5");
        C32710Csc.LIZLLL(j2, j3, l, l2, resourceFormat, str2, str, 0, null, i2, md5, md5, Long.valueOf(LJ), j, map, i, 384);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
