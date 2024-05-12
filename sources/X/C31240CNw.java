package X;

import android.content.Intent;
import android.view.View;
import android.webkit.CookieManager;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.CNw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31240CNw extends CNX implements COJ {
    public O5Z LJLJL;
    public CON LJLJLJ;
    public C31242CNy LJLJLLL;
    public final C30882CAc LJLL;

    @Override // X.CNX
    public final void LJII(C31886CfK c31886CfK) {
    }

    @Override // X.CNX
    public final boolean LIZ() {
        O5Z o5z = this.LJLJL;
        if (o5z != null && o5z.canGoBack()) {
            return true;
        }
        return false;
    }

    @Override // X.CNX
    public final void LIZIZ() {
        O5Z LJ = this.LJLL.LJ(this.LJLIL);
        this.LJLJL = LJ;
        LJ.setVerticalScrollBarEnabled(false);
        C60408NnI c60408NnI = new C60408NnI(this.LJLIL);
        c60408NnI.LIZIZ = true;
        c60408NnI.LIZ(this.LJLJL);
        O5Z o5z = this.LJLJL;
        if (o5z != null) {
            OFH ofh = OFH.LIZLLL;
            String containerId = this.LJLILLLLZI.getContainerId();
            COL col = new COL(o5z, "web");
            ofh.getClass();
            OFH.LIZ(containerId, col);
        }
    }

    @Override // X.CNX
    public final C31886CfK LIZJ() {
        this.LJLJLJ = new CON(this);
        C31242CNy c31242CNy = new C31242CNy(this);
        this.LJLJLLL = c31242CNy;
        return C31886CfK.LIZLLL(this.LJLIL, this.LJLJL, this.LJLJLJ, c31242CNy);
    }

    @Override // X.CNX
    public final void LIZLLL() {
        O5Z o5z = this.LJLJL;
        if (o5z != null && o5z.canGoBack()) {
            o5z.goBack();
        }
    }

    @Override // X.CNX
    public final void LJFF() {
        C31949CgL.LIZ();
        ((CopyOnWriteArrayList) C30882CAc.LIZJ().LIZ).add(this);
        CO3.LIZ();
        CookieManager.getInstance().setAcceptCookie(true);
    }

    @Override // X.CNX
    public final void release() {
        super.release();
        O5Z o5z = this.LJLJL;
        if (o5z != null) {
            o5z.destroy();
        }
        this.LJLJL = null;
    }

    @Override // X.CNX
    public final /* bridge */ /* synthetic */ View re() {
        return this.LJLJL;
    }

    @Override // X.CNX
    public final void loadUrl(String url) {
        o.LJIIIZ(url, "url");
        C31947CgJ.LJFF(this.LJLJL, url, null);
    }

    @Override // X.CNX
    public final void LJI(int i, int i2, Intent intent) {
        C31242CNy c31242CNy = this.LJLJLLL;
        if (c31242CNy != null) {
            c31242CNy.LJ(i, i2, intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31240CNw(ActivityC45651qj activityC45651qj, HybridConfig config, String containerId, COW cow) {
        super(activityC45651qj, config, containerId, cow);
        o.LJIIIZ(config, "config");
        o.LJIIIZ(containerId, "containerId");
        this.LJLL = C30882CAc.LIZJ();
    }
}
