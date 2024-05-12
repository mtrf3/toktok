package X;

import Y.ARunnableS8S0110000_2;
import android.content.Intent;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS35S0210000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6N7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6N7 {
    public final AbstractC42651GoZ LIZ;
    public View LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final C6NA LIZLLL;
    public final InterfaceC142545ic LJ;
    public final InterfaceC140385f8 LJFF;
    public final int LJI;
    public final ArrayList<C6NK> LJII;
    public final C29S LJIIIIZZ;
    public final C6N9 LJIIIZ;
    public C6NJ LJIIJ;

    public final void LIZIZ() {
        String str;
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        InterfaceC140385f8 interfaceC140385f8 = this.LJFF;
        if (interfaceC140385f8 == null || (str = interfaceC140385f8.tj0()) == null) {
            str = "";
        }
        C147625qo.LIZIZ(videoPublishEditModel, str);
        C6NA c6na = this.LIZLLL;
        if (c6na != null) {
            c6na.LJIJJLI();
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LIZJ;
        o.LJIIIZ(videoPublishEditModel2, "<this>");
        if (HHD.LJI(videoPublishEditModel2) == 1) {
            ((HE2) C78934UyQ.LJLIL.getBridgeService()).LIZJ(this.LJIIIIZZ, this.LIZJ, C45828Hyi.LJIILJJIL);
        } else {
            C41384GMa.LJII(new C41355GKx(this.LIZ));
        }
    }

    public final void LIZ(boolean z) {
        C42562Gn8.LIZIZ.LIZ(this.LIZJ.getCreationId());
        C6NA c6na = this.LIZLLL;
        if (c6na != null) {
            c6na.LJIJJLI();
        }
        Intent intent = new Intent();
        if (!C1DG.LJIIIIZZ() && this.LIZJ.mDraftToEditFrom != 3) {
            HZV.LIZ().LIZ(this.LJIIIIZZ, intent, z, this.LIZJ.creativeModel.draftInfoModel.isConvertToNormalDraft);
        }
        C41384GMa.LJII(new C41355GKx(this.LIZ));
    }

    public final void LIZJ(boolean z) {
        C127004ye c127004ye = C147295qH.LLJLILLLLZIIL;
        InterfaceC142545ic interfaceC142545ic = this.LJ;
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        c127004ye.getClass();
        C127004ye.LIZ(interfaceC142545ic, videoPublishEditModel);
        H8H.LIZIZ(this.LIZJ, "video_shoot_page", false, 60);
        VideoPublishEditModel videoPublishEditModel2 = this.LIZJ;
        videoPublishEditModel2.creativeModel.draftInfoModel.fromDraftPopup = z;
        C44384HbQ.LLJ(videoPublishEditModel2);
        H7R.LIZIZ(this.LIZJ.creativeModel.draftInfoModel);
        C60903NvH.LJIIJJI().getPublishService().LJIJI();
        GSL.LJIILJJIL(new C41021G8b(this.LIZJ, new GLI("VEVideoPublishEditActivity", 5)), new GI1() { // from class: X.6NG
            @Override // X.GI1
            public final InterfaceC88472Yns<AwemeDraft, C76800UCe> LIZ() {
                return null;
            }

            @Override // X.GI1
            public final void LIZIZ(C142535ib c142535ib) {
                C5S1 c5s1 = new C5S1(C83739Wtj.LIZ());
                c5s1.LIZJ(R.string.e36);
                c5s1.LJ();
                H8H.LIZLLL(C6N7.this.LIZJ, "video_edit_page", 1, true, false, 16);
                VideoPublishEditModel videoPublishEditModel3 = C6N7.this.LIZJ;
                if (videoPublishEditModel3.creativeModel.draftInfoModel.isDraft && !videoPublishEditModel3.isFromCrash()) {
                    C6N7.this.LIZ(true);
                    return;
                }
                if (C6N7.this.LIZJ.creativeModel.searchCreateModel.isFromSearch()) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(C6N7.this.LJIIIIZZ, "aweme://search/");
                    buildRoute.withParam("intent_from_publish", true);
                    buildRoute.addFlags(603979776);
                    buildRoute.open();
                    return;
                }
                VideoPublishEditModel videoPublishEditModel4 = C6N7.this.LIZJ;
                o.LJIIIZ(videoPublishEditModel4, "<this>");
                if (HHD.LJI(videoPublishEditModel4) == 1) {
                    C6N7 c6n7 = C6N7.this;
                    C45828Hyi c45828Hyi = C45828Hyi.LJIILL;
                    c6n7.getClass();
                    ((HE2) C78934UyQ.LJLIL.getBridgeService()).LIZJ(c6n7.LJIIIIZZ, c6n7.LIZJ, c45828Hyi);
                    return;
                }
                if (C78685UuP.LJJJZ(C6N7.this.LIZJ.creativeModel.initialModel.highLightVideoParametersModel.fragmentId)) {
                    Intent intent = new Intent();
                    C29S c29s = C6N7.this.LJIIIIZZ;
                    AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().getClass();
                    intent.setClass(c29s, SplashActivity.class);
                    IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
                    C6N7 c6n72 = C6N7.this;
                    publishService.changeIntentToHighlightIfNeed(c6n72.LJIIIIZZ, intent, c6n72.LIZJ);
                    intent.addFlags(603979776);
                    C29S c29s2 = C6N7.this.LJIIIIZZ;
                    C78598Ut0.LJIJJ(intent, c29s2);
                    c29s2.startActivity(intent);
                    return;
                }
                if (C51029K0z.LJIIIZ(C6N7.this.LIZJ.creativeModel.postLandingModel)) {
                    AVExternalServiceImpl.LIZ().publishService().finishAllCreativeActivity(C6N7.this.LJIIIIZZ);
                    return;
                }
                C6N7 c6n73 = C6N7.this;
                c6n73.getClass();
                Intent intent2 = new Intent();
                intent2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
                intent2.putExtra("shoot_way", c6n73.LIZJ.mShootWay);
                intent2.putExtra("creation_id", c6n73.LIZJ.getCreationId());
                if (o.LJ(c6n73.LIZJ.mShootWay, "camera_shortcut")) {
                    AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService();
                    if (C45039Hlz.LIZIZ(c6n73.LJIIIIZZ, false) == null) {
                        intent2.addFlags(268468224);
                        C29S c29s3 = c6n73.LJIIIIZZ;
                        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().getClass();
                        intent2.setClass(c29s3, SplashActivity.class);
                        H78.LIZ("SaveDraft to Feed page");
                        C29S c29s4 = c6n73.LJIIIIZZ;
                        C78598Ut0.LJIJJ(intent2, c29s4);
                        c29s4.startActivity(intent2);
                    }
                }
                intent2.addFlags(335544320);
                C29S c29s32 = c6n73.LJIIIIZZ;
                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().getClass();
                intent2.setClass(c29s32, SplashActivity.class);
                H78.LIZ("SaveDraft to Feed page");
                C29S c29s42 = c6n73.LJIIIIZZ;
                C78598Ut0.LJIJJ(intent2, c29s42);
                c29s42.startActivity(intent2);
            }

            @Override // X.GI1
            public final void LIZJ(C142535ib c142535ib) {
                C5S1 c5s1 = new C5S1(C83739Wtj.LIZ());
                c5s1.LIZJ(R.string.e34);
                c5s1.LJ();
                H8H.LIZLLL(C6N7.this.LIZJ, "video_edit_page", 0, true, false, 16);
            }
        });
    }

    public final void LIZLLL(boolean z, String saveScene) {
        o.LJIIIZ(saveScene, "saveScene");
        DraftInfoModel draftInfoModel = this.LIZJ.creativeModel.draftInfoModel;
        draftInfoModel.fromDraftPopup = z;
        draftInfoModel.getClass();
        draftInfoModel.saveDraftScene = saveScene;
        C6NA c6na = this.LIZLLL;
        if (c6na != null) {
            c6na.x8(new ARunnableS8S0110000_2(this, z, 0));
        }
    }

    public final void LJ(int i, int i2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i3;
        C6NJ c6nj;
        int i4;
        int i5;
        float f;
        C6NJ c6nj2;
        C6NJ c6nj3 = this.LJIIJ;
        if (c6nj3 != null && c6nj3.LIZIZ() && (c6nj2 = this.LJIIJ) != null) {
            c6nj2.LIZ();
        }
        this.LJII.clear();
        ArrayList<C6NK> arrayList = this.LJII;
        int i6 = this.LJI;
        arrayList.add(new C6NK(i, i2, i6, i6, new AqS152S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 370), 176));
        boolean LJJJJI = H7R.LJJJJI(this.LIZJ);
        if (LJJJJI) {
            i3 = R.attr.dj;
        } else {
            i3 = R.attr.go;
        }
        this.LJII.add(new C6NK(R.raw.icon_draft, R.string.e38, i3, i3, new AqS152S0100000_2(this, 371), 176));
        View view = this.LIZIZ;
        if (view != null) {
            ArrayList<C6NK> arrayList2 = this.LJII;
            C6N9 c6n9 = this.LJIIIZ;
            if (LJJJJI) {
                i4 = R.attr.cb;
                i5 = R.attr.dg;
                f = 1.0f;
            } else {
                i4 = R.attr.dk;
                i5 = R.attr.dv;
                f = 0.4f;
            }
            c6nj = new C6NJ(view, arrayList2, c6n9, i4, i5, f);
        } else {
            c6nj = null;
        }
        this.LJIIJ = c6nj;
        if (c6nj != null) {
            c6nj.LIZJ();
        }
    }

    public final void LJFF(int i, int i2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        C6NJ c6nj;
        C6NJ c6nj2;
        C6NJ c6nj3 = this.LJIIJ;
        if (c6nj3 != null && c6nj3.LIZIZ() && (c6nj2 = this.LJIIJ) != null) {
            c6nj2.LIZ();
        }
        this.LJII.clear();
        ArrayList<C6NK> arrayList = this.LJII;
        int i3 = this.LJI;
        arrayList.add(new C6NK(i, i2, i3, i3, new AqS152S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 372), 176));
        this.LJII.add(new C6NK(R.raw.icon_draft, R.string.e38, 0, 0, new AqS152S0100000_2(interfaceC65784Pro2, (InterfaceC65784Pro<C76800UCe>) 373), 188));
        View view = this.LIZIZ;
        if (view != null) {
            c6nj = new C6NJ(view, this.LJII, this.LJIIIZ);
        } else {
            c6nj = null;
        }
        this.LJIIJ = c6nj;
        if (c6nj != null) {
            c6nj.LIZJ();
        }
    }

    public final void LJI(int i, int i2, InterfaceC65784Pro needSaveTrackTask, boolean z) {
        C6NJ c6nj;
        C6NJ c6nj2;
        o.LJIIIZ(needSaveTrackTask, "needSaveTrackTask");
        C6NJ c6nj3 = this.LJIIJ;
        if (c6nj3 != null && c6nj3.LIZIZ() && (c6nj2 = this.LJIIJ) != null) {
            c6nj2.LIZ();
        }
        this.LJII.clear();
        ArrayList<C6NK> arrayList = this.LJII;
        int i3 = this.LJI;
        arrayList.add(new C6NK(R.raw.icon_x_mark_circle, R.string.e2v, i3, i3, new AqS152S0100000_2(this, 375), 176));
        this.LJII.add(new C6NK(i2, i, 0, 0, new AqS35S0210000_2(z, (boolean) needSaveTrackTask, (InterfaceC65784Pro<C76800UCe>) this, (C6N7) 0), 188));
        View view = this.LIZIZ;
        if (view != null) {
            c6nj = new C6NJ(view, this.LJII, this.LJIIIZ);
        } else {
            c6nj = null;
        }
        this.LJIIJ = c6nj;
        if (c6nj != null) {
            c6nj.LIZJ();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.6NL, X.6N9] */
    public C6N7(AbstractC42651GoZ rootScene, VideoPublishEditModel editModel, C6NA c6na, InterfaceC142545ic interfaceC142545ic, InterfaceC140385f8 interfaceC140385f8, int i) {
        c6na = (i & 8) != 0 ? null : c6na;
        interfaceC142545ic = (i & 16) != 0 ? null : interfaceC142545ic;
        interfaceC140385f8 = (i & 32) != 0 ? null : interfaceC140385f8;
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = rootScene;
        this.LIZIZ = null;
        this.LIZJ = editModel;
        this.LIZLLL = c6na;
        this.LJ = interfaceC142545ic;
        this.LJFF = interfaceC140385f8;
        this.LJI = R.attr.e7;
        ArrayList<C6NK> arrayList = new ArrayList<>();
        this.LJII = arrayList;
        this.LJIIIIZZ = rootScene.requireAppCompatActivity();
        ?? r1 = new C6NL() { // from class: X.6N9
            @Override // X.C6NL
            public final void onCancel() {
                HHD.LJIIIIZZ(C6N7.this.LIZJ, "cancel");
            }

            @Override // X.C6NL
            public final void onShow() {
                HHD.LJIIIZ(C6N7.this.LIZJ);
            }

            @Override // X.C6NL
            public final void LIZ(int i2) {
                HHD.LJIIIIZZ(C6N7.this.LIZJ, HHD.LIZLLL(i2));
            }
        };
        this.LJIIIZ = r1;
        View view = this.LIZIZ;
        this.LJIIJ = view != null ? new C6NJ(view, arrayList, r1) : null;
    }
}
