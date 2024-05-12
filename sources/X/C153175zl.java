package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C153175zl extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final C82622Wbi LJLIL;
    public ConstraintLayout LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C82631Wbr LJLJJI;
    public final C82631Wbr LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82631Wbr LJLJL;
    public ImageView LJLJLJ;
    public TextView LJLJLLL;
    public final C5H3 LJLL;
    public boolean LJLLI;
    public final C82631Wbr LJLLILLLL;

    static {
        TBT tbt = new TBT(C153175zl.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C153175zl.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0, c65351Pkp), C61845OOz.LIZJ(C153175zl.class, "changeAvatarComponent", "getChangeAvatarComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/changeavatar/ChangeAvatarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C153175zl.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C153175zl.class, "editStickerScene", "getEditStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/IEditStickerScene;", 0, c65351Pkp), C61845OOz.LIZJ(C153175zl.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0, c65351Pkp)};
    }

    public final ImageView LLJILJIL() {
        ImageView imageView = this.LJLJLJ;
        if (imageView != null) {
            return imageView;
        }
        o.LJIJI("backImageView");
        throw null;
    }

    public final InterfaceC153185zm LLJILJILJ() {
        return (InterfaceC153185zm) this.LJLJI.LIZ(this, LJLLJ[0]);
    }

    public final VideoPublishEditModel LLJJ() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLLJ[3]);
    }

    public final void LLJJIII() {
        InterfaceC148865so interfaceC148865so;
        InterfaceC150315v9 interfaceC150315v9;
        if (LLJJ().isRetakeVideo()) {
            return;
        }
        if (H7R.LJJLIIIJJIZ(LLJJ()) && (interfaceC150315v9 = (InterfaceC150315v9) this.LJLJL.LIZ(this, LJLLJ[4])) != null && !interfaceC150315v9.LLZZ()) {
            C147625qo.LIZIZ(LLJJ(), "");
            AbstractC42651GoZ LJIJ = C86793Y4n.LJIJ(this);
            if (LJIJ != null) {
                LJIJ.LLJJI();
                return;
            }
            return;
        }
        if (H7R.LJJIZ(LLJJ())) {
            VideoPublishEditModel LLJJ = LLJJ();
            o.LJIIIZ(LLJJ, "<this>");
            if (LLJJ.creativeModel.changeAvatarModel.isSingletonRecover || !LLJJ().mIsFromDraft) {
                InterfaceC153215zp interfaceC153215zp = (InterfaceC153215zp) this.LJLJJL.LIZ(this, LJLLJ[2]);
                if (interfaceC153215zp != null) {
                    interfaceC153215zp.an();
                    return;
                }
                return;
            }
        }
        if (C140445fE.LIZ() && !LLJJ().isEnterFromDM() && (interfaceC148865so = (InterfaceC148865so) this.LJLLILLLL.LIZ(this, LJLLJ[5])) != null && interfaceC148865so.yV(LLJILJIL())) {
            return;
        }
        C143635kN.LIZ((InterfaceC143655kP) this.LJLL.getValue());
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C153175zl(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = UCI.LJI(diContainer, InterfaceC153185zm.class, null);
        this.LJLJJI = UCI.LJII(diContainer, InterfaceC136115Vv.class, null);
        this.LJLJJL = UCI.LJII(diContainer, InterfaceC153215zp.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJL = UCI.LJII(diContainer, InterfaceC150315v9.class, null);
        this.LJLL = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLLILLLL = UCI.LJII(diContainer, InterfaceC148865so.class, null);
    }

    public static void LLJJI(C153175zl c153175zl) {
        c153175zl.LJLLI = true;
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().getClass();
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ()) {
            if (c153175zl.LLJJ().mIsFromDraft && !C153255zt.LIZ()) {
                if (c153175zl.LLJJ().isDuet() || c153175zl.LLJJ().isUploadVideo() || ((c153175zl.LLJJ().isMvThemeVideoType() && (!c153175zl.LLJJ().isPhotoMvMode || c153175zl.LLJJ().getOriginal() != 1)) || ((c153175zl.LLJJ().isDuet() && !c153175zl.LLJJ().duetFilesExist()) || c153175zl.LLJJ().isCutSameVideoType()))) {
                    c153175zl.LLJILJILJ().V10(false);
                } else {
                    c153175zl.LLJILJILJ().V10(true);
                }
                if (C151965xo.LIZJ(c153175zl.LLJJ())) {
                    c153175zl.LLJILJILJ().V10(true);
                    c153175zl.LLJILJILJ().cm("");
                } else if (c153175zl.LLJJ().isPhotoMvMode && c153175zl.LLJJ().getOriginal() == 1) {
                    c153175zl.LLJILJILJ().V10(true);
                    InterfaceC153185zm LLJILJILJ = c153175zl.LLJILJILJ();
                    String string = c153175zl.requireSceneContext().getResources().getString(R.string.e56);
                    o.LJIIIIZZ(string, "requireSceneContext().re…g.creation_picdraft_edit)");
                    LLJILJILJ.cm(string);
                } else if (c153175zl.LLJJ().mShootMode == 2 && c153175zl.LLJJ().getOriginal() == 1) {
                    c153175zl.LLJILJILJ().V10(false);
                }
            } else if (c153175zl.LLJJ().mIsFromDraft && C153255zt.LIZ()) {
                c153175zl.LLJILJILJ().V10(false);
            }
            if (c153175zl.LLJJ().draftFromShoot) {
                c153175zl.LLJILJILJ().V10(true);
                return;
            }
            return;
        }
        c153175zl.LLJILJILJ().V10(false);
    }

    public final void LLJJIJI(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ConstraintLayout constraintLayout = this.LJLILLLLZI;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
                ConstraintLayout constraintLayout2 = this.LJLILLLLZI;
                if (constraintLayout2 != null) {
                    constraintLayout2.setLayoutParams(marginLayoutParams);
                    return;
                } else {
                    o.LJIJI("titleLayout");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("titleLayout");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.aeg);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.back)");
        this.LJLJLJ = (ImageView) requireViewById;
        if (H7R.LJJLIIIJJIZ(LLJJ()) && !LLJJ().isFromCrash() && !LLJJ().mIsFromDraft) {
            LLJILJIL().setVisibility(8);
        }
        if (LLJJ().mIsFromDraft && ((LLJJ().mOrigin == 0 || LLJJ().recordMode == 1) && LLJJ().creativeModel.forwardEditPublishData == null && C153255zt.LIZ())) {
            LLJILJIL().setImageResource(R.drawable.axr);
        } else {
            LLJILJIL().setImageResource(R.drawable.axo);
        }
        C16880lQ.LJIILLIIL(LLJILJIL(), new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 34));
        View requireViewById2 = requireViewById(R.id.m0a);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.tv_back_tip)");
        TextView textView = (TextView) requireViewById2;
        this.LJLJLLL = textView;
        C16880lQ.LJIJI(textView, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 35));
        Integer num = C151105wQ.LJI;
        if (num != null) {
            LLJJIJI(num.intValue());
        }
        LLJILJILJ().xy(this, new AqS168S0100000_2(this, 391));
        LLJILJILJ().xe(this, new AqS168S0100000_2(this, 372));
        LLJILJILJ().Mw(this, new AqS168S0100000_2(this, 373));
        LLJILJILJ().lz(this, new AqS168S0100000_2(this, 374));
        ((InterfaceC143655kP) this.LJLL.getValue()).wf0().observe(this, new AObserverS70S0100000_2(this, 199));
        LLJILJILJ().Pi().LIZLLL(this, new AObjectS84S0100000_2(this, 224));
        VideoLengthChecker.LJ().LIZLLL(LLJJ(), (InterfaceC143655kP) this.LJLL.getValue(), this);
        if (!(!C139895eL.LIZIZ)) {
            LLJJI(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (r1 == null) goto L8;
     */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "container"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            boolean r0 = X.C165126dw.LIZ()
            r3 = 2131562550(0x7f0d1036, float:1.8750532E38)
            if (r0 == 0) goto L36
            android.app.Activity r0 = r4.mActivity
            if (r0 == 0) goto L36
            android.content.Context r2 = r4.requireSceneContext()
            java.lang.String r0 = "requireSceneContext()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "editor"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            android.view.View r1 = X.V0Z.LIZJ(r2, r3, r6, r0, r5)
            if (r1 != 0) goto L3b
        L36:
            r0 = 0
            android.view.View r1 = X.C16880lQ.LLLLIILL(r5, r3, r6, r0)
        L3b:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            kotlin.jvm.internal.o.LJII(r1, r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r4.LJLILLLLZI = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153175zl.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
