package X;

import Y.ACallableS104S0100000_1;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.ASm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26264ASm extends ASB implements InterfaceC26267ASp {
    public final C62435Oet LJLJJI;
    public final AS3 LJLJJL;

    @Override // X.ASG
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
    }

    @Override // X.InterfaceC26267ASp
    public final void Vq0(Exception e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC26267ASp
    public final void w70(String str) {
        Aweme aweme;
        if (o.LJ("homepage_explore", this.LJLJJI.LJLILLLLZI) && (aweme = this.LJLJJI.LJLIL) != null && aweme.isPhotoMode()) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.te_);
            c5s1.LJ();
            C62435Oet c62435Oet = this.LJLJJI;
            C2U8.LIZ(new C55045Liz(c62435Oet.LJLIL, c62435Oet.LJLILLLLZI));
            return;
        }
        if (a.LJFF().LJIIIZ() == 1 && this.LJLJJI.LJLIL != null) {
            IComplianceBusinessService LJFF = a.LJFF();
            C62435Oet c62435Oet2 = this.LJLJJI;
            LJFF.LJIIL(c62435Oet2.LJLJJL, c62435Oet2.LJLIL);
        } else {
            Activity LIZ = C27740Aue.LIZ(this.LJLJJI.LJLJJL);
            o.LJIIIIZZ(LIZ, "getActivity(actionManager.context)");
            C26045AKb c26045AKb = new C26045AKb(LIZ);
            c26045AKb.LJIIIIZZ(R.string.te_);
            c26045AKb.LJIIJ();
        }
        if (C62483Off.LIZJ() == EnumC62492Ofo.VERTICAL) {
            C62435Oet c62435Oet3 = this.LJLJJI;
            C2U8.LIZ(new C55045Liz(c62435Oet3.LJLIL, c62435Oet3.LJLILLLLZI));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26264ASm(C62435Oet actionManager, AS3 as3) {
        super(actionManager, as3);
        o.LJIIIZ(actionManager, "actionManager");
        this.LJLJJI = actionManager;
        this.LJLJJL = as3;
        o.LJIIIIZZ(actionManager.LJLJJL.getString(R.string.te8), "actionManager.context.ge…ing.unifiedpanel_toast_a)");
    }

    public final void LJ(View v, AS8 dislikeReasonVO) {
        String str;
        String str2;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(dislikeReasonVO, "dislikeReasonVO");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLJJI.LJLILLLLZI);
        Aweme aweme = this.LJLJJI.LJLIL;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        Aweme aweme2 = this.LJLJJI.LJLIL;
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(this.LJLJJI.LJLIL)));
        c188727au.LJIIIZ("reason_id", dislikeReasonVO.LIZ);
        c188727au.LJIIIZ("reason_text", dislikeReasonVO.LIZIZ);
        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(this.LJLJJI.LJLIL));
        c188727au.LJIIIZ("enter_method", "long_press");
        c188727au.LJIIIZ("click_method", "button");
        FMX.LJIIL("block_videos", c188727au.LIZ);
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C7ZW c7zw = new C7ZW();
        C62435Oet c62435Oet = this.LJLJJI;
        c7zw.LIZLLL = c62435Oet.LJLILLLLZI;
        c7zw.LJJIIZ(c62435Oet.LJLIL);
        c7zw.LJJLI = C227768wm.LIZIZ(this.LJLJJI.LJLIL);
        c7zw.LJJLIIIIJ = C227768wm.LIZJ(this.LJLJJI.LJLIL);
        c7zw.LJJLIIIJ = "long_press";
        c7zw.LJJLIIIJJI = C227768wm.LJIIZILJ(this.LJLJJI.LJLIL);
        if (C224888s8.LJ(this.LJLJJI.LJLILLLLZI)) {
            c7zw.LJJJJIZL = C224888s8.LIZJ();
        }
        if (!o.LJ(this.LJLJI, "from_music")) {
            c7zw.LJJZ = CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(v.getContext(), this.LJLILLLLZI);
        }
        Object LJII = c220488l2.LJII(this.LJLJJI.LJLIL, c7zw);
        C222578oP.LIZJ(LJII, this.LJLJJI.LJLIL, null, null, 14);
        ((JHM) LJII).LJIILIIL();
        if (!TextUtils.isEmpty(this.LJLJJI.LJLILLLLZI)) {
            Aweme aweme3 = this.LJLJJI.LJLIL;
            if (aweme3 != null) {
                str3 = aweme3.getAid();
            }
            if (!TextUtils.isEmpty(str3)) {
                Aweme aweme4 = this.LJLJJI.LJLIL;
                o.LJI(aweme4);
                String aid = aweme4.getAid();
                o.LJIIIIZZ(aid, "actionManager.aweme!!.aid");
                C48229IwL.LIZ(new C48231IwN(2, aid, this.LJLJJI.LJLILLLLZI, System.currentTimeMillis()));
                Aweme aweme5 = this.LJLJJI.LJLIL;
                o.LJI(aweme5);
                String aid2 = aweme5.getAid();
                o.LJIIIIZZ(aid2, "actionManager.aweme!!.aid");
                C48229IwL.LIZ(new C48231IwN(3, aid2, this.LJLJJI.LJLILLLLZI, System.currentTimeMillis()));
            }
        }
        C26266ASo c26266ASo = new C26266ASo();
        c26266ASo.LJJ(new C8BS<String>() { // from class: X.3I0
            @Override // X.C8BS
            public final boolean checkParams(Object... params) {
                o.LJIIIZ(params, "params");
                if (params.length == 2) {
                    return true;
                }
                return false;
            }

            @Override // X.C8BS
            public final boolean sendRequest(Object... params) {
                o.LJIIIZ(params, "params");
                if (!super.sendRequest(Arrays.copyOf(params, params.length))) {
                    return false;
                }
                FGR.LIZIZ().LIZ(this.mHandler, new ACallableS104S0100000_1(params, 9), 0);
                return true;
            }
        });
        c26266ASo.LJLILLLLZI = this;
        c26266ASo.LJIILL(this.LJLJJI.LJLIL, dislikeReasonVO.LIZ);
        AS3 as3 = this.LJLJJL;
        if (as3 != null) {
            as3.dismiss();
        }
    }
}
