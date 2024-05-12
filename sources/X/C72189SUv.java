package X;

import Y.AfS51S0300000_12;
import android.app.Activity;
import android.app.Dialog;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.music.model.NewReleaseAnchorExtra;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.SUv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72189SUv extends HSS {
    public static final C5H3<Gson> LJLLJ = C221108m2.LIZ(EnumC221088m0.NONE, SV1.LJLIL);
    public NewReleaseAnchorExtra LJLJLJ;
    public String LJLJLLL;
    public C73318Sq2 LJLL = new C73318Sq2();
    public boolean LJLLI;
    public boolean LJLLILLLL;

    public final NewReleaseAnchorExtra LJJJJJ() {
        String str;
        try {
            Gson value = LJLLJ.getValue();
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getExtra();
            } else {
                str = null;
            }
            return (NewReleaseAnchorExtra) value.LJI(str, NewReleaseAnchorExtra.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void LJJJJJL() {
        String str;
        if (this.LJLJLLL == null) {
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getLogExtra();
            } else {
                str = null;
            }
            this.LJLJLLL = C72178SUk.LIZ(str);
        }
    }

    public final void LJJJJL() {
        String aid;
        if (this.LJLJLJ == null) {
            this.LJLJLJ = LJJJJJ();
        }
        NewReleaseAnchorExtra newReleaseAnchorExtra = this.LJLJLJ;
        if (newReleaseAnchorExtra == null || (aid = LJIIIZ().LJJLL().getAid()) == null) {
            return;
        }
        if (newReleaseAnchorExtra.isNewRelease()) {
            FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
            String str = newReleaseAnchorExtra.ttmTrackId;
            if (str == null) {
                return;
            }
            LJJIJLIJ.LJJIJL(1, 1, str, aid);
            return;
        }
        if (!newReleaseAnchorExtra.isPreRelease()) {
            return;
        }
        FeedCommonService LJJIJLIJ2 = CommonFeedServiceImpl.LJJIJLIJ();
        String str2 = newReleaseAnchorExtra.ttmTrackId;
        if (str2 == null) {
            return;
        }
        LJJIJLIJ2.LJJIJL(2, 1, str2, aid);
    }

    @Override // X.S1E
    public final S1E clone() {
        return new C72189SUv();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.MUSIC_NEW_RELEASE.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        super.LJ(eventMapBuilder);
        LJJJJL();
        LJJJJLI(EnumC72191SUx.NEW_RELEASE_ANCHOR_MAJOR);
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        EnumC26289ATl LJFF = super.LJFF(list);
        EnumC26289ATl enumC26289ATl = EnumC26289ATl.NOT_FOUND;
        if (LJFF != enumC26289ATl) {
            IAccountUserService LJIILL = HG3.LJIILL();
            if (!o.LJ("homepage_hot", LJIIIZ().LJJLJLI()) || ((RBY) LJIILL).isChildrenMode()) {
                return enumC26289ATl;
            }
        }
        return LJFF;
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String aid;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        HSS.LJJIZ(this, eventMapBuilder, 6);
        if (this.LJLJLJ == null) {
            this.LJLJLJ = LJJJJJ();
        }
        NewReleaseAnchorExtra newReleaseAnchorExtra = this.LJLJLJ;
        if (newReleaseAnchorExtra != null && (aid = LJIIIZ().LJJLL().getAid()) != null) {
            if (newReleaseAnchorExtra.isNewRelease()) {
                FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
                String str = newReleaseAnchorExtra.ttmTrackId;
                if (str != null) {
                    LJJIJLIJ.LJJIJL(1, 2, str, aid);
                }
            } else if (newReleaseAnchorExtra.isPreRelease()) {
                FeedCommonService LJJIJLIJ2 = CommonFeedServiceImpl.LJJIJLIJ();
                String str2 = newReleaseAnchorExtra.ttmTrackId;
                if (str2 != null) {
                    LJJIJLIJ2.LJJIJL(2, 2, str2, aid);
                }
            }
        }
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            C72178SUk.LIZIZ(anchorCommonStruct, LJIIIZ(), this.LJLJLJ);
        }
    }

    @Override // X.HSS, X.S1E
    public final void LJIJJ(Aweme aweme) {
        this.LJLL.dispose();
    }

    @Override // X.HSS
    public final void LJJJ(C188727au c188727au) {
        LJJJJJL();
        c188727au.LJI("ttm_track_id", this.LJLJLLL);
        super.LJJJ(c188727au);
    }

    @Override // X.HSS
    public final void LJJJI(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJJL();
        eventMapBuilder.LJI("ttm_track_id", this.LJLJLLL);
        super.LJJJI(eventMapBuilder);
    }

    public final void LJJJJLI(EnumC72191SUx enumC72191SUx) {
        NewReleaseAnchorExtra newReleaseAnchorExtra;
        TTMStoreLink tTMStoreLink;
        if (!LJIIIZ().LJJLJ() && (newReleaseAnchorExtra = this.LJLJLJ) != null && newReleaseAnchorExtra.isTtm()) {
            SV7.LIZ.getClass();
            if (SV7.LJFF(false)) {
                SVA sva = SVA.TIKTOK_MUSIC;
                String aid = LJIIIZ().LJJLL().getAid();
                o.LJIIIIZZ(aid, "getAnchorContext().aweme().aid");
                SV6.LIZIZ(sva, aid, enumC72191SUx);
                Activity LIZ = LJIIIZ().LIZ();
                NewReleaseAnchorExtra newReleaseAnchorExtra2 = this.LJLJLJ;
                if (newReleaseAnchorExtra2 == null || (tTMStoreLink = newReleaseAnchorExtra2.store) == null) {
                    return;
                }
                String aid2 = LJIIIZ().LJJLL().getAid();
                o.LJIIIIZZ(aid2, "aid");
                SV3 LIZ2 = new C72192SUy(enumC72191SUx, LIZ, tTMStoreLink, aid2).LIZ();
                C73565Su1 LJJIJIL = AbstractC73672Svk.LJJIJIL(1);
                SV9.LIZ.getClass();
                this.LJLL.LIZ(LJJIJIL.LJIIL(SV9.LIZ(), TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJLIIL(new AfS51S0300000_12(this, sva, LIZ2, 1), new InterfaceC64592gB() { // from class: X.9F2
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }));
            }
        }
    }

    @Override // X.HSW, X.S1E
    public final void LJIJ(Activity activity, Dialog dialog) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dialog, "dialog");
        if (!this.LJLLI) {
            this.LJLL.dispose();
            this.LJLL = new C73318Sq2();
        }
    }

    @Override // X.HSS
    public final void LJJIL(C188727au eventMapBuilder, boolean z, boolean z2) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJJL();
        eventMapBuilder.LJI("ttm_track_id", this.LJLJLLL);
        super.LJJIL(eventMapBuilder, z, z2);
    }

    @Override // X.HSW, X.S1E
    public final void LJIILIIL(C7F9 chain, Dialog dialog, boolean z, boolean z2) {
        o.LJIIIZ(chain, "chain");
        boolean z3 = true;
        if (chain.LIZIZ() > 1) {
            z3 = o.LJ(this, chain.LIZLLL());
        }
        this.LJLLI = z3;
        if (!z3) {
            LJJJJL();
            LJJJJLI(EnumC72191SUx.NEW_RELEASE_ANCHOR_MINOR);
        }
    }
}
