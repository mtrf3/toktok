package X;

import Y.ARunnableS3S1300000_5;
import Y.AfS36S0101000_5;
import android.text.TextUtils;
import com.bytedance.android.live.usermanage.BanCapabilityParams;
import com.bytedance.android.live.usermanage.ILiveBanCapabilityApi;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.api.LinkTransResult;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.live.model.LivePermissionResponse;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.ArrayList;

/* renamed from: X.CJp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31129CJp implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Comparable LJLJJI;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        long j;
        switch (this.LJLIL) {
            case 0:
                C56236M5g c56236M5g = (C56236M5g) this.LJLILLLLZI;
                InterfaceC40375Fsx interfaceC40375Fsx = (InterfaceC40375Fsx) this.LJLJI;
                android.net.Uri uri = (android.net.Uri) this.LJLJJI;
                c56236M5g.getClass();
                C56235M5f.LIZLLL = System.currentTimeMillis();
                String str = ((LinkTransResult) obj).longUrl;
                if (TextUtils.isEmpty(str)) {
                    interfaceC40375Fsx.LIZJ();
                    C56235M5f.LIZLLL(2015, uri, "short_2_long");
                    return;
                }
                c56236M5g.LIZLLL(uri, str);
                boolean z = C84763XOl.LJIIJJI;
                C56235M5f.LJ = z;
                interfaceC40375Fsx.LIZ(z);
                c56236M5g.LIZJ(uri, str);
                return;
            default:
                C31130CJq c31130CJq = (C31130CJq) this.LJLILLLLZI;
                C44 c44 = (C44) this.LJLJI;
                String str2 = (String) this.LJLJJI;
                LivePermissionResponse livePermissionResponse = (LivePermissionResponse) obj;
                c31130CJq.getClass();
                if (livePermissionResponse.data == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Data is null");
                    c44.onFailed(illegalStateException);
                    C31130CJq.LIZIZ(str2, illegalStateException);
                    C31130CJq.LIZ(0, 0, "Data is null", "smooth".equals(str2));
                    return;
                }
                ARunnableS3S1300000_5 aRunnableS3S1300000_5 = new ARunnableS3S1300000_5(c31130CJq, str2, livePermissionResponse, c44, 0);
                try {
                    j = CastLongProtector.parseLong(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getUid());
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(11);
                arrayList.add(12);
                arrayList.add(13);
                arrayList.add(14);
                arrayList.add(15);
                IRetrofit iRetrofit = c31130CJq.LIZ;
                if (iRetrofit == null) {
                    iRetrofit = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit("https://webcast.tiktokv.com");
                    c31130CJq.LIZ = iRetrofit;
                }
                ((ILiveBanCapabilityApi) iRetrofit.create(ILiveBanCapabilityApi.class)).getLiveBanCapability(new BanCapabilityParams(arrayList, 0L, j)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(2, aRunnableS3S1300000_5, 22), new AfS36S0101000_5(1, aRunnableS3S1300000_5, 26));
                return;
        }
    }

    public /* synthetic */ C31129CJp(Object obj, Object obj2, Comparable comparable, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = comparable;
    }
}
