package X;

import Y.AfS17S0001000_5;
import Y.AfS36S0101000_5;
import android.util.Pair;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.List;

/* renamed from: X.BLr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28635BLr implements InterfaceC09740Zu<FeedItem> {
    public final String LIZ;
    public final FeedApi LIZIZ;
    public String LIZJ;
    public String LIZLLL = "feed_loadmore";
    public boolean LJ = true;
    public final BMC LJFF;
    public final C73893SzJ<String> LJI;
    public final C73893SzJ<String> LJII;
    public final InterfaceC28631BLn LJIIIIZZ;
    public final C73893SzJ<List<ImageModel>> LJIIIZ;
    public final C73318Sq2 LJIIJ;

    public C28635BLr(String str, FeedApi feedApi, BMC bmc, C73893SzJ<Pair<String, String>> c73893SzJ, InterfaceC28631BLn interfaceC28631BLn, C73893SzJ<String> c73893SzJ2, C73893SzJ<String> c73893SzJ3, String str2, C73893SzJ<List<ImageModel>> c73893SzJ4) {
        this.LIZJ = "enter_auto";
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJIIJ = c73318Sq2;
        this.LIZ = str;
        this.LIZIZ = feedApi;
        this.LJFF = bmc;
        this.LJI = c73893SzJ2;
        this.LJIIIIZZ = interfaceC28631BLn;
        this.LJII = c73893SzJ3;
        this.LIZJ = str2;
        c73318Sq2.LIZ(c73893SzJ.LJJJLIIL(new AfS36S0101000_5(0, this, 26), new AfS17S0001000_5(0, 8)));
        this.LJIIIZ = c73893SzJ4;
    }
}
