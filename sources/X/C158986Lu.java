package X;

import Y.ARunnableS4S0210000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158986Lu extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLLLL;
    public final C82622Wbi LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C82632Wbs LJLJJI;
    public final C73318Sq2 LJLJJL;
    public C5F4 LJLJJLL;
    public C5F3 LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public float LJLLJ;
    public int LJLLL;
    public float LJLLLL;

    static {
        TBT tbt = new TBT(C158986Lu.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLLLL = new InterfaceC74236TBo[]{tbt};
    }

    public final ImageView LLJILJIL() {
        return (ImageView) this.LJLILLLLZI.getValue();
    }

    public final ShortVideoContext LLJILJILJ() {
        return (ShortVideoContext) this.LJLJJI.LIZ(this, LJLLLLLL[0]);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJJL.LIZLLL();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C158986Lu(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 109));
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 110));
        this.LJLJJI = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJJL = new C73318Sq2();
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.lec);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.top_camera_mask_view)");
        this.LJLJJLL = (C5F4) requireViewById;
        View requireViewById2 = requireViewById(R.id.ap5);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.bottom_camera_mask_view)");
        this.LJLJL = (C5F3) requireViewById2;
    }

    public final void LLJJ(Bitmap bitmap, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(bitmap, "bitmap");
        if (!this.LJLJLJ) {
            int LIZIZ = C81184Vtc.LIZIZ(requireSceneContext()) - C81184Vtc.LIZJ(requireSceneContext());
            int LJ = C81184Vtc.LJ(requireSceneContext());
            ViewGroup.LayoutParams layoutParams = ((View) this.LJLJI.getValue()).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            this.LJLJLLL = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            ViewGroup.LayoutParams layoutParams2 = LLJILJIL().getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            this.LJLL = i;
            float f = LJ;
            float f2 = f / 0.75f;
            this.LJLLI = (LIZIZ - this.LJLJLLL) - ((int) f2);
            this.LJLLILLLL = (LIZIZ - i) - LLJILJIL().getLayoutParams().height;
            this.LJLLJ = f * 0.08f;
            this.LJLLLL = LLJILJIL().getLayoutParams().height / f2;
            this.LJLLL = ((LLJILJIL().getLayoutParams().height / 2) + this.LJLL) - ((((View) this.LJLJI.getValue()).getLayoutParams().height / 2) + this.LJLJLLL);
            this.LJLJLJ = true;
        }
        LLJILJIL().setVisibility(0);
        LLJILJIL().setScaleY(1.0f);
        LLJILJIL().setScaleX(1.0f);
        LLJILJIL().setTranslationY(0.0f);
        if (z) {
            ViewGroup.LayoutParams layoutParams3 = LLJILJIL().getLayoutParams();
            if (layoutParams3 != null) {
                int LJ2 = C81184Vtc.LJ(requireSceneContext());
                layoutParams3.width = LJ2;
                layoutParams3.height = (int) (LJ2 / 0.75f);
                LLJILJIL().setLayoutParams(layoutParams3);
            }
            ImageView LLJILJIL = LLJILJIL();
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            C6IA.LJII(requireSceneContext, LLJILJIL);
        } else {
            AnonymousClass668.LIZIZ().LJII(LLJILJILJ().cameraComponentModel.mVideoWidth, LLJILJILJ().cameraComponentModel.mVideoHeight, LLJILJIL());
        }
        LLJILJIL().setImageBitmap(bitmap);
        LLJILJIL().post(new ARunnableS4S0210000_2(this, z, interfaceC65784Pro, 0));
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdw, viewGroup, false, "inflater.inflate(R.layou…itcher, container, false)");
    }
}
