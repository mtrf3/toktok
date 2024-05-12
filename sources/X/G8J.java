package X;

import Y.AObjectS52S0101000_7;
import Y.AObserverS75S0100000_7;
import Y.IDCListenerS283S0100000_7;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS77S0400000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G8J extends AbstractC157016Ef {
    public final VideoPublishEditModel LJII;
    public final WM7 LJIIIIZZ;
    public final InterfaceC65784Pro<Boolean> LJIIIZ;
    public final MutableLiveData<Boolean> LJIIJ;
    public final AqS157S0100000_7 LJIIJJI;

    @Override // X.AbstractC157016Ef
    public final int LIZ() {
        return EnumC139485dg.ECOMMERCE.getScene();
    }

    @Override // X.AbstractC157016Ef
    public final boolean LJFF() {
        if ((this.LJIIIZ.invoke().booleanValue() && LJ()) || C78983UzD.LJJJJJL(this.LJII)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC157016Ef
    public final boolean LJ() {
        return ECommerceAnchorService.LJJJJI().LJJIIZI();
    }

    @Override // X.AbstractC157016Ef
    public final VideoPublishEditModel LIZIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC157016Ef
    public final void LIZJ(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        LIZLLL(new G7Z(aObjectS52S0101000_7), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // X.AbstractC157016Ef
    public final void LIZLLL(G7X nextStep, AbstractC42152GgW<?> abstractC42152GgW) {
        o.LJIIIZ(nextStep, "nextStep");
        if (this.LJIIIZ.invoke().booleanValue() || C78983UzD.LJJJJJL(this.LJII)) {
            String creationId = this.LJII.getCreationId();
            o.LJIIIIZZ(creationId, "model.creationId");
            String str = this.LJII.mShootWay;
            o.LJIIIIZZ(str, "model.mShootWay");
            String valueOf = String.valueOf(this.LJII.draftId);
            String contentType = H7R.LJIIIZ(this.LJII);
            String contentSource = H7R.LJIIIIZZ(this.LJII);
            String musicId = this.LJII.getMusicId();
            boolean LJJJJJL = C78983UzD.LJJJJJL(this.LJII);
            o.LJIIIZ(contentType, "contentType");
            o.LJIIIZ(contentSource, "contentSource");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("creation_id", creationId);
            c188727au.LJIIIZ("shoot_way", str);
            c188727au.LJIIIZ("draft_id", valueOf);
            c188727au.LJIIIZ("enter_from", "video_edit_page");
            c188727au.LJIIIZ("content_type", contentType);
            c188727au.LJIIIZ("content_source", contentSource);
            c188727au.LJIIIZ("music_id", musicId);
            c188727au.LIZLLL(LJJJJJL ? 1 : 0, "is_sub_only_video");
            FMX.LJIIL("sound_copyright_check_post_notice_show", c188727au.LIZ);
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = 102;
            FragmentManager supportFragmentManager = this.LIZJ.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            Context LLLLLILLIL = C16880lQ.LLLLLILLIL(this.LIZJ);
            o.LJIIIIZZ(LLLLLILLIL, "activity.applicationContext");
            EnumC136925Yy checkProcess = EnumC136925Yy.LOADING;
            AqS77S0400000_7 aqS77S0400000_7 = new AqS77S0400000_7(nextStep, (G7X) abstractC42152GgW, (AbstractC42152GgW<?>) this, (G8J) c76732zl, (C76732zl) 4);
            AqS96S0300000_7 aqS96S0300000_7 = new AqS96S0300000_7(this, (G8J) nextStep, (G7X) abstractC42152GgW, (AbstractC42152GgW<?>) 16);
            AqS154S0200000_7 aqS154S0200000_7 = new AqS154S0200000_7(nextStep, (G7X) abstractC42152GgW, (AbstractC42152GgW<?>) 77);
            o.LJIIIZ(checkProcess, "checkProcess");
            C68322mC c68322mC = new C68322mC();
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS154S0200000_7(aqS154S0200000_7, c68322mC, 54));
            c235119Kp.LIZIZ(LIZJ);
            C245569kO c245569kO = new C245569kO(LLLLLILLIL, checkProcess);
            ASL asl = new ASL();
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLL = c235119Kp;
            tuxSheet.LJLLI = c245569kO;
            asl.LJI(1);
            IDCListenerS283S0100000_7 iDCListenerS283S0100000_7 = new IDCListenerS283S0100000_7(aqS154S0200000_7, 2);
            ?? r0 = asl.LIZ;
            r0.LJLIL = iDCListenerS283S0100000_7;
            r0.LJLLJ = true;
            c68322mC.element = r0;
            c245569kO.setCallback(new AqS154S0200000_7(aqS96S0300000_7, c68322mC, 53));
            aqS77S0400000_7.invoke(c245569kO, c68322mC.element);
            ((DialogFragment) c68322mC.element).show(supportFragmentManager, "showCopyRightLoadingDialog");
            return;
        }
        nextStep.LIZIZ(abstractC42152GgW);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G8J(VideoPublishEditModel model, WM7 rootScene, VideoPublishViewModel viewModel, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        super(model, rootScene, viewModel);
        o.LJIIIZ(model, "model");
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJII = model;
        this.LJIIIIZZ = rootScene;
        this.LJIIIZ = interfaceC65784Pro;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.LJIIJ = mutableLiveData;
        this.LJIIJJI = new AqS157S0100000_7(this, 470);
        mutableLiveData.observe(rootScene, new AObserverS75S0100000_7(this, 62));
    }
}
