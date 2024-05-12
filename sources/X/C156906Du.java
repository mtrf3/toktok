package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156906Du implements InterfaceC65784Pro<C82622Wbi> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final ActivityC45651qj LJLIL;
    public final VideoPublishEditModel LJLILLLLZI;
    public final InterfaceC65784Pro<C82622Wbi> LJLJI;
    public final String LJLJJI;
    public final C156926Dw LJLJJL;
    public final C156936Dx LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;

    static {
        TBT tbt = new TBT(C156906Du.class, "toolbarViewModel", "getToolbarViewModel()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C156906Du.class, "privacySettingApi", "getPrivacySettingApi()Lcom/ss/android/ugc/aweme/shortvideo/privacy/PrivacySettingApi;", 0, c65351Pkp)};
    }

    public final C156916Dv LIZ() {
        if (C132385Hm.LJII == null) {
            ActivityC45651qj activityC45651qj = this.LJLIL;
            if ((activityC45651qj instanceof ActivityC45651qj) && activityC45651qj != null) {
                C132385Hm.LJII = new C156916Dv(this.LJLIL, this.LJLILLLLZI, LIZIZ());
                String LIZJ = C77339UWx.LIZJ();
                C156916Dv c156916Dv = C132385Hm.LJII;
                if (c156916Dv != null) {
                    c156916Dv.LJ = Boolean.valueOf(!C135125Sa.LIZJ(LIZJ));
                }
            }
        }
        return C132385Hm.LJII;
    }

    public final InterfaceC153275zv LIZIZ() {
        return (InterfaceC153275zv) this.LJLJJL.LIZ(this, LJLJLLL[0]);
    }

    @Override // X.InterfaceC65784Pro
    public final C82622Wbi invoke() {
        return this.LJLJI.invoke();
    }

    public final boolean LIZLLL() {
        if (!C138645cK.LIZ() || C165016dl.LIZ().getBoolean("guide_shown", false) || H7R.LJJLIIIJJIZ(this.LJLILLLLZI)) {
            return false;
        }
        return true;
    }

    public static boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        if (G9P.LIZLLL() && G9D.LJFF() && !H92.LJ() && (videoPublishEditModel == null || !C44720Hgq.LIZ() || !C44701HgX.LJIIJJI(videoPublishEditModel.creativeModel) || videoPublishEditModel.isCurrentAutoCutMode())) {
            return true;
        }
        return false;
    }

    public final void LIZJ(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        boolean z;
        if (C1DG.LJIIIIZZ()) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
            return;
        }
        boolean z2 = true;
        if (o.LJ("editor_pro_h5", this.LJLILLLLZI.mShootWay) && !C135125Sa.LIZ().getBoolean("guideShownH5", false)) {
            z = true;
        } else {
            z = false;
            if (this.LJLJLJ) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
                return;
            }
        }
        if (this.LJLILLLLZI.isEnterFromDM() || H7R.LJJLIIIJJIZ(this.LJLILLLLZI)) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
            return;
        }
        if ((C44701HgX.LIZJ(this.LJLILLLLZI) && this.LJLILLLLZI.editMusicSyncMode) || C44701HgX.LJIIJJI(this.LJLILLLLZI.creativeModel)) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
            return;
        }
        if (C44384HbQ.LJJIIZI(this.LJLILLLLZI) && z) {
            this.LJLJL = true;
            interfaceC88472Yns.invoke(Boolean.TRUE);
            return;
        }
        if (C44384HbQ.LJJIIZI(this.LJLILLLLZI)) {
            C156916Dv LIZ = LIZ();
            if (LIZ != null) {
                AqS133S0200000_2 aqS133S0200000_2 = new AqS133S0200000_2(this, (C156906Du) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 82);
                if (LIZ.LJIIIIZZ) {
                    aqS133S0200000_2.invoke(Boolean.valueOf(!C135125Sa.LIZ().getBoolean("guideShown", false)));
                    return;
                }
                if (LIZ.LJIIIZ) {
                    aqS133S0200000_2.invoke(Boolean.FALSE);
                    return;
                }
                if (LIZ.LJIIJJI) {
                    String LIZJ = C77339UWx.LIZJ();
                    if (C135125Sa.LIZJ(LIZJ) || o.LJ(LIZJ, CardStruct.IStatusCode.DEFAULT)) {
                        z2 = false;
                    }
                    aqS133S0200000_2.invoke(Boolean.valueOf(z2));
                    return;
                }
                if (!LIZ.LJIIJ && !LIZ.LJIIL) {
                    return;
                }
                String LIZJ2 = C77339UWx.LIZJ();
                if (C135125Sa.LIZJ(LIZJ2) || o.LJ(LIZJ2, CardStruct.IStatusCode.DEFAULT)) {
                    aqS133S0200000_2.invoke(Boolean.FALSE);
                    return;
                }
                Boolean bool = LIZ.LIZLLL;
                if (bool != null) {
                    aqS133S0200000_2.invoke(Boolean.valueOf(bool.booleanValue()));
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                LIZ.LIZ(new AqS133S0200000_2(LIZ, aqS133S0200000_2, 118));
                return;
            }
            return;
        }
        interfaceC88472Yns.invoke(Boolean.FALSE);
    }

    public final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        boolean LJ = LJ(videoPublishEditModel);
        if (LJ) {
            this.LJLJL = true;
            this.LJLJLJ = true;
            ((C6E7) this.LJLJJLL.LIZ(this, LJLJLLL[1])).WQ();
        }
        return LJ;
    }

    public C156906Du(ActivityC45651qj activity, VideoPublishEditModel mModel, InterfaceC65784Pro<C82622Wbi> interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(mModel, "mModel");
        this.LJLIL = activity;
        this.LJLILLLLZI = mModel;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = "star_lottie.json";
        this.LJLJJL = new C156926Dw(this);
        this.LJLJJLL = new C156936Dx(this);
    }
}
