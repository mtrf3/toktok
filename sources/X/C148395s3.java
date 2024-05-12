package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5s3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148395s3 extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C148195rj LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C5H3 LJLL;
    public final C62822Ol8 LJLLI;
    public final C148405s4 LJLLILLLL;

    static {
        TBT tbt = new TBT(C148395s3.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C148395s3.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp), C61845OOz.LIZJ(C148395s3.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C148395s3.class, "editAutoEnhanceApi", "getEditAutoEnhanceApi()Lcom/ss/android/ugc/gamora/editor/enhance/EditAutoEnhanceApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        ((InterfaceC153275zv) this.LJLJLJ.LIZ(this, LJLLJ[2])).ic0(this.LJLJI, new AqS168S0100000_2(this, 396));
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        C148585sM.LIZ.getClass();
        if (((CreativeToolsEntranceReversalConfig) C148585sM.LIZJ.getValue()).getHideAutoEnhanceOnEditPage()) {
            return false;
        }
        if ((!LJIIIZ().isAutoEnhanceEnable() || H7R.LJJJJL(LJIIIZ()) || C79004UzY.LJJIJL(LJIIIZ().canvasVideoData)) && (!H7R.LJJJJL(LJIIIZ()) || !LJIIIZ().isAutoEnhanceEnable() || LJIIIZ().isGifMaterialOnly())) {
            return false;
        }
        return true;
    }

    public final VideoPublishEditModel LJIIIZ() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLLJ[0]);
    }

    @Override // X.WJB
    public final void LJFF() {
        boolean z;
        ImageAlbumData imageAlbumData;
        if (!H7R.LJJJJL(LJIIIZ()) ? !LJIIIZ().autoEnhanceOn : !((imageAlbumData = (ImageAlbumData) this.LJLLI.getValue()) == null || imageAlbumData.getAutoEnhanceOn())) {
            z = true;
        } else {
            z = false;
        }
        if (!H7R.LJJJJL(LJIIIZ())) {
            C148605sO.LIZJ(Boolean.valueOf(z));
        }
        C82632Wbs c82632Wbs = this.LJLJLJ;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLJ;
        ((InterfaceC153275zv) c82632Wbs.LIZ(this, interfaceC74236TBoArr[2])).rb(new C148455s9(z, true));
        ((InterfaceC146675pH) this.LJLJLLL.LIZ(this, interfaceC74236TBoArr[3])).a00(z, false);
        ((InterfaceC153275zv) this.LJLJLJ.LIZ(this, interfaceC74236TBoArr[2])).r3();
        VideoPublishEditModel LJIIIZ = LJIIIZ();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIIZ.getCreationId());
        c145995oB.LJI("shoot_way", LJIIIZ.mShootWay);
        c145995oB.LJI("content_source", LJIIIZ.getAvetParameter().getContentSource());
        c145995oB.LJI("content_type", LJIIIZ.getAvetParameter().getContentType());
        c145995oB.LIZ(H7R.LJFF(LJIIIZ) ? 1 : 0, "status");
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LIZ(H8F.LJIIL(LJIIIZ), "is_multi_content");
        c145995oB.LJI("enter_type", H8F.LJIIIZ(LJIIIZ));
        FMX.LJIIL("click_quality_improve", c145995oB.LIZ);
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C148395s3(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = config;
        this.LJLJJLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJL = UCI.LJI(diContainer, Activity.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, InterfaceC146675pH.class, null);
        this.LJLL = C269113v.LIZ(this, InterfaceC143655kP.class);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 687));
        this.LJLLI = LIZIZ;
        this.LJLLILLLL = new C148405s4(LJIIIZ(), (ImageAlbumData) LIZIZ.getValue());
    }
}
