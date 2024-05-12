package X;

import Y.AfS20S1300000_1;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.business.tcm.CheckTCMOrderDeleteStatusResp;
import com.ss.android.ugc.aweme.share.business.tcm.TCMOrderDeleteApi;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.NowSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS92S0300000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.39m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C793439m implements InterfaceC62486Ofi {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final InterfaceC72642tA<C50420Jqa> LJLJJI;
    public final TCMOrderDeleteApi LJLJJL;
    public final WeakReference<InterfaceC72642tA<C50420Jqa>> LJLJJLL;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_trash_bin;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_trash_bin_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.efd;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "delete";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        Aweme aweme = this.LJLIL;
        boolean z = false;
        if (C54838Lfe.LJIILL(aweme) && (aweme == null || !C54838Lfe.LJIILJJIL(aweme))) {
            z = true;
        }
        return !z;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        Aweme aweme;
        boolean z;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (!enable()) {
            return;
        }
        if (sharePackage instanceof AwemeSharePackage) {
            aweme = ((AwemeSharePackage) sharePackage).LJIILLIIL();
        } else if (!(sharePackage instanceof NowSharePackage)) {
            return;
        } else {
            aweme = ((NowSharePackage) sharePackage).nowShareParams.LIZJ;
        }
        if (aweme != null) {
            String tabName = sharePackage.extras.getString("tab_name", "");
            String imprId = sharePackage.extras.getString("impr_id", "");
            if (C78996UzQ.LJJIIZI(aweme) && aweme.getStarAtlasOrderId() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                o.LJIIIIZZ(tabName, "tabName");
                TCMOrderDeleteApi tCMOrderDeleteApi = this.LJLJJL;
                if (tCMOrderDeleteApi != null) {
                    String valueOf = String.valueOf(aweme.getStarAtlasOrderId());
                    String aid = aweme.getAid();
                    o.LJIIIIZZ(aid, "aweme.aid");
                    AbstractC73672Svk<CheckTCMOrderDeleteStatusResp> checkTCMOrderDeleteStatus = tCMOrderDeleteApi.checkTCMOrderDeleteStatus(valueOf, aid);
                    if (checkTCMOrderDeleteStatus != null) {
                        checkTCMOrderDeleteStatus.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS20S1300000_1(aweme, context, this, tabName, 0), new InterfaceC64592gB() { // from class: X.39n
                            @Override // X.InterfaceC64592gB
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIIIIZZ(tabName, "tabName");
            o.LJIIIIZZ(imprId, "imprId");
            if (C793339l.LIZ(aweme) && C78996UzQ.LJJIIZI(aweme)) {
                C227738wj.LJIIIIZZ(context, aweme, this.LJLJJLL.get(), tabName, this.LJLILLLLZI, null, this.LJLJI, new AqS92S0300000_3(context, aweme, this, 12), 32);
            } else {
                C227738wj.LJFF(aweme);
            }
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }

    public C793439m(InterfaceC72642tA interfaceC72642tA, Aweme aweme, String enterFrom, String panelSource) {
        TCMOrderDeleteApi tCMOrderDeleteApi;
        IRetrofit createNewRetrofit;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(panelSource, "panelSource");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = panelSource;
        this.LJLJJI = interfaceC72642tA;
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        if (createIRetrofitServicebyMonsterPlugin != null && (createNewRetrofit = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(str)) != null) {
            tCMOrderDeleteApi = (TCMOrderDeleteApi) createNewRetrofit.create(TCMOrderDeleteApi.class);
        } else {
            tCMOrderDeleteApi = null;
        }
        this.LJLJJL = tCMOrderDeleteApi;
        this.LJLJJLL = new WeakReference<>(interfaceC72642tA);
    }
}
