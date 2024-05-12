package com.ss.android.ugc.aweme.viewmodel;

import X.C113554cx;
import X.C188727au;
import X.C201467vS;
import X.C203727z6;
import X.C2061187b;
import X.C2061387d;
import X.C2061887i;
import X.C221108m2;
import X.C227768wm;
import X.C36922EeM;
import X.C3A5;
import X.C40883G2t;
import X.C45804HyK;
import X.C52535Kjb;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C77123UOp;
import X.C87O;
import X.C87P;
import X.C87U;
import X.C87W;
import X.C87X;
import X.C87Y;
import X.C87Z;
import X.FMX;
import X.HG3;
import X.InterfaceC203737z7;
import X.InterfaceC74236TBo;
import X.J9P;
import X.JJ4;
import X.OSZ;
import X.RBX;
import X.TBV;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionCountAgent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PostModeFavoriteViewModel extends AssemViewModel<C2061387d> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public Aweme LJLIL;
    public C203727z6 LJLILLLLZI;
    public String LJLJL;
    public final C62822Ol8 LJLJLLL;
    public final C87X LJLJI = new C87X(this);
    public final C87W LJLJJI = new C87W(this);
    public final C87O LJLJJL = new C87O(C2061887i.LJLIL);
    public long LJLJJLL = -1;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1222));

    static {
        TBV tbv = new TBV(PostModeFavoriteViewModel.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C2061387d defaultState() {
        return new C2061387d(0);
    }

    public final void jv0() {
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            aweme.setCollectStatus(!aweme.isCollected() ? 1 : 0);
            AwemeService.LIZ().g6(aweme.getCollectStatus(), aweme.getAid());
            setState(new AqS8S0010000_3(aweme.isCollected(), 38));
            gv0(this.LJLIL);
        }
    }

    public PostModeFavoriteViewModel() {
        C221108m2.LIZIZ(C2061187b.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1221));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LIZJ(this.LJLJI);
                AwemeCollectionCountAgent.LJIILIIL().LIZJ(this.LJLJJI);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ((C87Y) this.LJLJLJ.getValue());
                AwemeCollectionCountAgent.LJIILIIL().LJIIIIZZ((C87Z) this.LJLJLLL.getValue());
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LJFF(this.LJLJI);
                AwemeCollectionCountAgent.LJIILIIL().LJFF(this.LJLJJI);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJI((C87Y) this.LJLJLJ.getValue());
                AwemeCollectionCountAgent.LJIILIIL().LJI((C87Z) this.LJLJLLL.getValue());
            }
        }
    }

    public final void gv0(Aweme aweme) {
        String str;
        if (aweme == null) {
            return;
        }
        long j = this.LJLJJLL;
        long j2 = 1;
        if (aweme.isCollected()) {
            if (j > -1) {
                j2 = 1 + j;
            }
        } else if (j <= 0) {
            j2 = 0;
        } else {
            j2 = j - 1;
        }
        this.LJLJJLL = j2;
        try {
            str = C77123UOp.LJJIIJ(j2);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            str = CardStruct.IStatusCode.DEFAULT;
        }
        setState(new AqS57S1100000_3(str, aweme, 17));
    }

    public final void hv0(View view, InterfaceC203737z7 interfaceC203737z7) {
        int i;
        String str;
        int i2 = 0;
        if (C52535Kjb.LIZ()) {
            Aweme aweme = this.LJLIL;
            if (aweme != null) {
                C201467vS.LJIILIIL(this.LJLJL, aweme);
                Boolean LIZIZ = AwemeCollectionAgent.LJIIZILJ().LIZIZ(aweme);
                AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZIZ, 1223);
                interfaceC203737z7.ix();
                if (!o.LJ(LIZIZ, Boolean.TRUE)) {
                    C87U LJIJ = AwemeCollectionAgent.LJIJ();
                    String aid = aweme.getAid();
                    Map<String, Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("privacy_setting", 0));
                    o.LJIIIIZZ(aid, "aid");
                    LJIJ.LJII(aid, LJJLIIIIJ, new AqS185S0100000_3(aqS153S0100000_3, 115), new AqS185S0100000_3(view, 116));
                    return;
                }
                C87U LJIJ2 = AwemeCollectionAgent.LJIJ();
                String aid2 = aweme.getAid();
                o.LJIIIIZZ(aid2, "it.aid");
                C87P.LIZIZ(LJIJ2, aid2, C113554cx.LJJLIIIIJ(new OSZ("privacy_setting", 0)), new AqS185S0100000_3(aqS153S0100000_3, 117), null, 8);
                return;
            }
            return;
        }
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new C203727z6();
        }
        C203727z6 c203727z6 = this.LJLILLLLZI;
        if (c203727z6 != null) {
            c203727z6.LJLJJLL = "graphic_detail";
            c203727z6.LJLILLLLZI = interfaceC203737z7;
            c203727z6.LJLLILLLL = view;
        }
        Aweme aweme2 = this.LJLIL;
        if (aweme2 != null && aweme2.isCollected()) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = i ^ 1;
        C203727z6 c203727z62 = this.LJLILLLLZI;
        if (c203727z62 != null) {
            Object[] objArr = new Object[4];
            objArr[0] = 2;
            Aweme aweme3 = this.LJLIL;
            if (aweme3 != null) {
                str = aweme3.getAid();
            } else {
                str = null;
            }
            objArr[1] = str;
            objArr[2] = Integer.valueOf(i3);
            Aweme aweme4 = this.LJLIL;
            if (aweme4 != null) {
                i2 = aweme4.getAwemeType();
            }
            objArr[3] = Integer.valueOf(i2);
            c203727z62.LJIILL(objArr);
        }
        if (i3 == 1) {
            C201467vS.LJIILIIL(this.LJLJL, this.LJLIL);
        } else {
            Aweme aweme5 = this.LJLIL;
            String str2 = this.LJLJL;
            if (aweme5 != null) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str2);
                c188727au.LJIIIZ("group_id", aweme5.getAid());
                c188727au.LJIIIZ("author_id", aweme5.getAuthorUid());
                c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(aweme5)));
                c188727au.LJIIIZ("enter_method", "actionbar");
                c188727au.LJFF(Integer.valueOf(aweme5.getAwemeType()), "aweme_type");
                c188727au.LIZLLL(C227768wm.LJIILIIL(aweme5), "pic_cnt");
                FMX.LJIIL("cancel_favourite_video", c188727au.LIZ);
            }
        }
        Aweme aweme6 = this.LJLIL;
        if (aweme6 == null) {
            return;
        }
        setState(new AqS8S0010000_3(aweme6.isCollected(), 38));
    }

    public final void iv0(final View contentView, final InterfaceC203737z7 collectActionView) {
        String str;
        Activity activity;
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(collectActionView, "collectActionView");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            Aweme aweme = this.LJLIL;
            String str2 = null;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            Context context = (Context) this.LJLJJL.LIZ(LJLL[0]);
            if (context != null) {
                activity = C45804HyK.LJIJJ(context);
            } else {
                activity = null;
            }
            o.LJI(activity);
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("group_id", str);
            Aweme aweme2 = this.LJLIL;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            c40883G2t.LIZLLL("author_id", str2);
            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(str));
            J9P.LIZIZ(activity, "graphic_detail", "click_favorite_video", (Bundle) c40883G2t.LIZ, new JJ4() { // from class: X.87f
                @Override // X.JJ4
                public final /* synthetic */ void LIZIZ() {
                }

                @Override // X.JJ4
                public final void LIZ() {
                    PostModeFavoriteViewModel.this.hv0(contentView, collectActionView);
                }
            });
            return;
        }
        hv0(contentView, collectActionView);
    }
}
