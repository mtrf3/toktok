package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS62S1200000_7;
import kotlin.jvm.internal.AqS70S0201000_7;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.GZl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41733GZl extends GUX {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ PublishService LJLILLLLZI;
    public final /* synthetic */ Bitmap LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // X.GUX
    public final void onProgress(int i, Object obj) {
        String publishId = this.LJLIL;
        o.LJIIIZ(publishId, "publishId");
        java.util.Map<String, Integer> map = C35748E1g.LIZ;
        Integer num = (Integer) ((LinkedHashMap) map).get(publishId);
        if (num != null) {
            map.put(publishId, Integer.valueOf(num.intValue() + 1));
        }
        try {
            PublishService publishService = this.LJLILLLLZI;
            publishService.LJ(1, new AqS70S0201000_7(publishService, i, this.LJLJI, 0));
        } catch (Exception e) {
            H78.LIZLLL("PublishForegroundService", e);
        }
    }

    @Override // X.GUX
    public final void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFinish result:");
        LIZ.append(result);
        C41732GZk.LIZLLL(X1D.LIZIZ(LIZ));
        int LJIIZILJ = GUH.LJIIZILJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("remain task count: ");
        LIZ2.append(LJIIZILJ);
        C41732GZk.LIZLLL(X1D.LIZIZ(LIZ2));
        if (LJIIZILJ <= 0) {
            PublishService publishService = this.LJLILLLLZI;
            publishService.stopSelf(publishService.LJLIL);
        }
        GUH.LJIL(this.LJLIL, this);
        if (result instanceof C41505GQr) {
            int hashCode = this.LJLJJI.hashCode();
            PublishService publishService2 = this.LJLILLLLZI;
            publishService2.LJ(hashCode, new AqS154S0200000_7(publishService2, this.LJLJI, 24));
            ((ArrayList) PublishService.LJLILLLLZI).add(Integer.valueOf(hashCode));
            return;
        }
        if (!(result instanceof C41478GPq)) {
            return;
        }
        if (!a.LJ().LJ(1)) {
            int hashCode2 = this.LJLJJI.hashCode();
            PublishService publishService3 = this.LJLILLLLZI;
            publishService3.LJ(hashCode2, new AqS62S1200000_7(publishService3, this.LJLJJI, this.LJLJI, 1));
            ((ArrayList) PublishService.LJLILLLLZI).add(Integer.valueOf(hashCode2));
            return;
        }
        new AnonymousClass078(this.LJLILLLLZI).LIZJ(1, null);
    }

    public C41733GZl(String str, PublishService publishService, Bitmap bitmap, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = publishService;
        this.LJLJI = bitmap;
        this.LJLJJI = str2;
    }
}
