package X;

import Y.ARunnableS38S0100000_2;
import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.e1;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.621, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass621 extends AbstractC29891Fh<InterfaceC153215zp> implements InterfaceC153215zp, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC153215zp LJLL;
    public final C5H3 LJLLI;

    static {
        TBT tbt = new TBT(AnonymousClass621.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(AnonymousClass621.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass621.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass621.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass621.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass621.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp)};
    }

    private final C6NA LJJLIIIIJ() {
        return (C6NA) this.LJLJL.LIZ(this, LJLLILLLL[3]);
    }

    private final InterfaceC147905rG LJJLIIIJILLIZJL() {
        return (InterfaceC147905rG) this.LJLLI.getValue();
    }

    private final InterfaceC153185zm LJJLIIJ() {
        return (InterfaceC153185zm) this.LJLJJI.LIZ(this, LJLLILLLL[0]);
    }

    public final Activity LJJLI() {
        return (Activity) this.LJLJLJ.LIZ(this, LJLLILLLL[4]);
    }

    public final VideoPublishEditModel LJJLIIIJJI() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLLILLLL[1]);
    }

    public final InterfaceC143655kP LJJLIIIJJIZ() {
        return (InterfaceC143655kP) this.LJLJJLL.LIZ(this, LJLLILLLL[2]);
    }

    public final AbstractC42651GoZ LJJLIIIJLLLLLLLZ() {
        return (AbstractC42651GoZ) this.LJLJLLL.LIZ(this, LJLLILLLL[5]);
    }

    @Override // X.InterfaceC153215zp
    public void an() {
        boolean z = true;
        if (!e1.LIZ(31744, "studio_story_avatar_keep_last_edit", true, true)) {
            z = false;
        }
        if (z) {
            C6NA LJJLIIIIJ = LJJLIIIIJ();
            if (LJJLIIIIJ != null) {
                LJJLIIIIJ.x8(new ARunnableS38S0100000_2(this, 64));
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            AnonymousClass626.LIZ = null;
            LJJLIIIJLLLLLLLZ().LLJJI();
            return;
        }
        AnonymousClass626.LIZ = null;
        LJJLIIIJLLLLLLLZ().LLJJI();
    }

    private final boolean LJJLJ() {
        if (LJJLIIIJJI().creativeModel.changeAvatarModel.isFromChangeAvatar && (LJJLIIIJJI().creativeModel.changeAvatarModel.isSingletonRecover || !LJJLIIIJJI().mIsFromDraft)) {
            an();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    @Override // X.AbstractC29891Fh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            r3 = this;
            super.onCreate()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJJLIIIJJI()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel r0 = r0.changeAvatarModel
            boolean r0 = r0.isFromChangeAvatar
            if (r0 == 0) goto L84
            X.5zm r2 = r3.LJJLIIJ()
            boolean r0 = X.AnonymousClass600.LIZ()
            if (r0 == 0) goto L85
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJJLIIIJJI()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r1 = r0.creativeModel
            java.lang.String r0 = "editModel.creativeModel"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel r0 = r1.changeAvatarModel
            boolean r0 = r0.isFromAiVatar
            if (r0 != 0) goto L85
            r0 = 1
        L2b:
            r2.du(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJJLIIIJJI()
            java.lang.String r0 = r0.getVideoCoverPath()
            boolean r0 = X.C39579Fg7.LIZIZ(r0)
            if (r0 != 0) goto L4d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r3.LJJLIIIJJI()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJJLIIIJJI()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel r0 = r0.changeAvatarModel
            java.lang.String r0 = r0.coverPath
            r1.setVideoCoverPath(r0)
        L4d:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJJLIIIJJI()
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L61
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJJLIIIJJI()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel r0 = r0.changeAvatarModel
            boolean r0 = r0.isSingletonRecover
            if (r0 == 0) goto L84
        L61:
            X.6nc r2 = X.C5YW.LIZIZ()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJJLIIIJJI()
            com.ss.android.ugc.aweme.creative.CreativeInfo r1 = r0.creativeInfo
            java.lang.String r0 = "editModel.creativeInfo"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r2 = r2.LIZIZ(r1)
            X.5kP r0 = r3.LJJLIIIJJIZ()
            androidx.lifecycle.LiveData r1 = r0.wf0()
            X.622 r0 = new X.622
            r0.<init>()
            r1.observe(r3, r0)
        L84:
            return
        L85:
            r0 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass621.onCreate():void");
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        if (LJJLIIIJJI().isFromCrash()) {
            AnonymousClass626.LIZ = null;
        }
    }

    @Override // X.InterfaceC153215zp
    public boolean xu0() {
        return LJJLJ();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC153215zp getApiComponent() {
        return this.LJLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC153215zp
    public void LJJIJIIJIL(int i) {
        Iterator<String> it = LJJLIIIJJI().creativeModel.changeAvatarModel.stickerIds.iterator();
        while (it.hasNext()) {
            LJJLIIIJILLIZJL().Ey(it.next(), i);
        }
    }

    @Override // X.InterfaceC153215zp
    public void tc(InterfaceC65784Pro<C76800UCe> successCallback, InterfaceC88472Yns<? super Exception, C76800UCe> failCallback) {
        String str;
        o.LJIIIZ(successCallback, "successCallback");
        o.LJIIIZ(failCallback, "failCallback");
        this.LJLJI.invoke(Boolean.TRUE);
        CreativeModel creativeModel = LJJLIIIJJI().creativeModel;
        o.LJIIIIZZ(creativeModel, "editModel.creativeModel");
        if (creativeModel.changeAvatarModel.isFromAiVatar) {
            str = "2";
        } else {
            str = "1";
        }
        AVExternalServiceImpl.LIZ().avatarService().requestUpdateAvatar(LJJLIIIJJI().creativeModel.changeAvatarModel.originPath, new AnonymousClass625(this, str, successCallback, failCallback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass621(C82622Wbi diContainer, WMH parentScene, InterfaceC88472Yns<? super Boolean, C76800UCe> showLoading) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(showLoading, "showLoading");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = showLoading;
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC153185zm.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), C6NA.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), Activity.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLL = this;
        this.LJLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 216));
    }
}
