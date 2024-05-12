package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rpu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC70762Rpu implements Runnable {
    public final /* synthetic */ C70765Rpx LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Image LJLJI;
    public final /* synthetic */ long LJLJJI;

    public RunnableC70762Rpu(C70765Rpx c70765Rpx, boolean z, Image image, long j) {
        this.LJLIL = c70765Rpx;
        this.LJLILLLLZI = z;
        this.LJLJI = image;
        this.LJLJJI = j;
    }

    public final void LIZ() {
        String str;
        boolean z;
        List<String> urls;
        C70765Rpx c70765Rpx = this.LJLIL;
        boolean z2 = this.LJLILLLLZI;
        Image image = this.LJLJI;
        if (image != null && (urls = image.getUrls()) != null) {
            str = (String) ORZ.LJLLLL(urls);
        } else {
            str = null;
        }
        long j = this.LJLJJI;
        long j2 = j - this.LJLIL.LJII;
        c70765Rpx.getClass();
        try {
            z = o.LJ(UriProtector.parse(str).getPath(), UriProtector.parse(HeaderDisplayImageOpt.LIZJ).getPath());
        } catch (Exception unused) {
            z = false;
        }
        C70414RkI c70414RkI = c70765Rpx.LIZ.LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJLIIIJJIZ(c70765Rpx.LIZJ, c70765Rpx.LIZLLL, 1, j2, j, c70765Rpx.LIZIZ, z2, c70765Rpx.LJFF, c70765Rpx.LJI, z);
        }
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
