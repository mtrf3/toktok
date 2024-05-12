package Y;

import X.AI8;
import X.AbstractC46244ICy;
import X.C149985uc;
import X.C1549666i;
import X.C164106cI;
import X.C40871j1;
import X.C40984G6q;
import X.C44225HXh;
import X.C46067I6d;
import X.C46127I8l;
import X.C46133I8r;
import X.C53558L0g;
import X.C5NP;
import X.C68322mC;
import X.C78764Uvg;
import X.C78934UyQ;
import X.C81184Vtc;
import X.C82891Wg3;
import X.ET3;
import X.H78;
import X.H7R;
import X.HCC;
import X.HJY;
import X.HWY;
import X.HYI;
import X.HYK;
import X.HYN;
import X.I0N;
import X.I3X;
import X.I9L;
import X.I9X;
import X.ID0;
import X.InterfaceC29911Fj;
import X.MEX;
import X.TEZ;
import X.WK2;
import X.X1D;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryParams;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS117S0200000_7 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$0(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        List<String> list;
        List<String> list2;
        SavePhotoStickerInfo savePhotoStickerInfo;
        I9L i9l = (I9L) obj;
        Effect effect = (Effect) ((AbstractC46244ICy) ((AqS173S0100000_7) aObjectS117S0200000_7.l1).l0).LLLLL().LJIIIIZZ().LJIILL().getValue();
        if (i9l != null) {
            HCC hcc = null;
            if (ID0.LIZLLL(effect)) {
                list = ((AbstractC46244ICy) ((AqS173S0100000_7) aObjectS117S0200000_7.l1).l0).LLIIIILZ;
            } else {
                list = null;
            }
            if (ID0.LIZJ(effect)) {
                list2 = ((AbstractC46244ICy) ((AqS173S0100000_7) aObjectS117S0200000_7.l1).l0).LLIIIILZ;
            } else {
                list2 = null;
            }
            if (ID0.LJIJI(effect)) {
                savePhotoStickerInfo = ((AbstractC46244ICy) ((AqS173S0100000_7) aObjectS117S0200000_7.l1).l0).LJLJI.Ea0();
            } else {
                savePhotoStickerInfo = null;
            }
            AbstractC46244ICy abstractC46244ICy = (AbstractC46244ICy) ((AqS173S0100000_7) aObjectS117S0200000_7.l1).l0;
            if (abstractC46244ICy.LJLJL.LJIIL) {
                hcc = abstractC46244ICy.LLIIZ();
            }
            i9l.LIZJ = new HJY(list, list2, savePhotoStickerInfo, hcc);
        }
        if (effect != null && ID0.LJJIII(effect)) {
            ((I3X) aObjectS117S0200000_7.l0).Pk(false);
        }
    }

    public static final void onChanged$1(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        C44225HXh c44225HXh = (C44225HXh) obj;
        if (c44225HXh != null) {
            Bundle bundle = (Bundle) aObjectS117S0200000_7.l0;
            C46067I6d c46067I6d = (C46067I6d) aObjectS117S0200000_7.l1;
            LibraryParams libraryParams = (LibraryParams) bundle.getParcelable("library_params");
            LibraryMaterialInfoSv libraryMaterialInfoSv = (LibraryMaterialInfoSv) bundle.getParcelable("library_material_info");
            if (libraryParams != null && libraryMaterialInfoSv != null) {
                c46067I6d.Hf0(c46067I6d.getShortVideoContext(), libraryParams, libraryMaterialInfoSv, c44225HXh.LJLILLLLZI);
            }
        }
    }

    public static final void onChanged$10(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        int i;
        Boolean it = (Boolean) obj;
        ViewGroup.LayoutParams layoutParams = ((View) aObjectS117S0200000_7.l0).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C78934UyQ.LJLIL.LIZLLL();
        if (MEX.LIZLLL()) {
            o.LJIIIIZZ(it, "it");
            marginLayoutParams.bottomMargin = C1549666i.LIZ(it.booleanValue());
            ((View) aObjectS117S0200000_7.l0).setLayoutParams(marginLayoutParams);
        } else {
            if (!HWY.LIZ()) {
                return;
            }
            o.LJIIIIZZ(it, "it");
            if (it.booleanValue()) {
                i = C1549666i.LIZ(it.booleanValue()) + ((WK2) aObjectS117S0200000_7.l1).LJLJLLL;
            } else {
                i = ((WK2) aObjectS117S0200000_7.l1).LJLJLLL;
            }
            marginLayoutParams.bottomMargin = i;
            ((View) aObjectS117S0200000_7.l0).setLayoutParams(marginLayoutParams);
        }
    }

    public static final void onChanged$2(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startRecording StopPrePlayState:");
        LIZ.append(booleanValue);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        if (booleanValue) {
            ((I9X) aObjectS117S0200000_7.l0).LLLJIL((HYN) aObjectS117S0200000_7.l1);
            ((I9X) aObjectS117S0200000_7.l0).getCameraApi().e8().getMediaController().R8().removeObserver(aObjectS117S0200000_7);
        }
    }

    public static final void onChanged$3(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((I9X) aObjectS117S0200000_7.l0).getCameraApi().bh().LJFF(aObjectS117S0200000_7);
            ((I9X) aObjectS117S0200000_7.l0).LLIZ().LIZ(((HYK) ((HYI) aObjectS117S0200000_7.l1)).LIZ);
        }
    }

    public static final void onChanged$4(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        C40984G6q c40984G6q;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS117S0200000_7.l0;
        C40871j1 c40871j1 = (C40871j1) aObjectS117S0200000_7.l1;
        Boolean bool = (Boolean) obj;
        videoPublishContainerScene.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoPublishContainerScene -> onResume: fromPublishSettingPanel = ");
        LIZ.append(bool);
        H78.LIZ(X1D.LIZIZ(LIZ));
        if (bool.booleanValue()) {
            if (!H7R.LJJJJL(videoPublishContainerScene.LLILZLL) && (c40984G6q = videoPublishContainerScene.LLILZ) != null && c40984G6q.LJIIJJI) {
                AI8 ai8 = c40984G6q.LJIILJJIL;
                if (ai8 != null) {
                    ai8.setSubtitle(null);
                }
                c40984G6q.LJIIJJI = false;
                c40984G6q.LJIILLIIL();
            }
            c40871j1.LJI(Boolean.FALSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$5(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        Boolean show = (Boolean) obj;
        C68322mC c68322mC = new C68322mC();
        o.LJIIIIZZ(show, "show");
        if (show.booleanValue()) {
            ((C46127I8l) aObjectS117S0200000_7.l0).LJLJLJ = true;
            FrameLayout frameLayout = (FrameLayout) aObjectS117S0200000_7.l1;
            if (frameLayout != null) {
                ImageView imageView = (ImageView) frameLayout.findViewById(R.id.fbl);
                imageView.setImageResource(R.drawable.b45);
                imageView.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
                ofFloat.setRepeatCount(-1);
                ofFloat.setDuration(1000L);
                C149985uc.LIZ(ofFloat);
                ofFloat.start();
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) aObjectS117S0200000_7.l1;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        Animator animator = (Animator) c68322mC.element;
        if (animator == null) {
            return;
        }
        animator.cancel();
    }

    public static final void onChanged$6(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        I0N i0n;
        boolean z;
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            I0N i0n2 = ((C46127I8l) aObjectS117S0200000_7.l0).LJLIL;
            if (i0n2 != null) {
                i0n2.Sl(false, false);
            }
        } else if (C53558L0g.LIZ() && C53558L0g.LIZIZ().supportHoldEffectOnExit && (i0n = ((C46127I8l) aObjectS117S0200000_7.l0).LJLIL) != null) {
            if (i0n.LLLLL().LLJJIJIIJIL() != null) {
                z = true;
            } else {
                z = false;
            }
            i0n.Sl(z, false);
        }
        C164106cI c164106cI = (C164106cI) aObjectS117S0200000_7.l1;
        if (c164106cI != null && c164106cI.getVisibility() == 0) {
            c164106cI.setVisibility(8);
        }
    }

    public static final void onChanged$7(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        float f;
        I0N i0n;
        TEZ LLLLL;
        Boolean enable = (Boolean) obj;
        C164106cI c164106cI = (C164106cI) aObjectS117S0200000_7.l0;
        if (c164106cI != null) {
            C46127I8l c46127I8l = (C46127I8l) aObjectS117S0200000_7.l1;
            o.LJIIIIZZ(enable, "enable");
            c164106cI.setEnabled(enable.booleanValue());
            if (enable.booleanValue() && !c46127I8l.LJLLILLLL) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            c164106cI.setAlpha(f);
            if (C53558L0g.LIZ() && C53558L0g.LIZIZ().supportHoldEffectOnExit && (i0n = c46127I8l.LJLIL) != null && (LLLLL = i0n.LLLLL()) != null && LLLLL.LLJJIJIIJIL() != null) {
                c46127I8l.LJLIL.Sl(true, false);
            }
        }
    }

    public static final void onChanged$8(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        Effect effect = (Effect) obj;
        if (effect == null) {
            return;
        }
        String LIZ = ET3.LIZ(effect, "effect_gif_icon");
        if (!C46133I8r.LIZ() || LIZ == null || LIZ.length() == 0) {
            ((C46127I8l) aObjectS117S0200000_7.l1).LIZ((C164106cI) aObjectS117S0200000_7.l0, effect);
        } else {
            C78764Uvg.LIZIZ((C164106cI) aObjectS117S0200000_7.l0, LIZ, -1, -1);
        }
    }

    public static final void onChanged$9(AObjectS117S0200000_7 aObjectS117S0200000_7, Object obj) {
        if (obj == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((View) aObjectS117S0200000_7.l0).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = C81184Vtc.LJFF(((WK2) aObjectS117S0200000_7.l1).requireActivity());
        ((View) aObjectS117S0200000_7.l0).setLayoutParams(layoutParams2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive topMarginUpdate in RecordToolbarScene,now margin is:");
        LIZ.append(layoutParams2.topMargin);
        LIZ.append(",top is:");
        RecyclerView recyclerView = ((WK2) aObjectS117S0200000_7.l1).LJLJL;
        if (recyclerView != null) {
            LIZ.append(recyclerView.getTop());
            H78.LIZ(X1D.LIZIZ(LIZ));
        } else {
            o.LJIJI("toolbarRecyclerView");
            throw null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS117S0200000_7(X.C164106cI r2, X.C46127I8l r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 6: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS117S0200000_7.<init>(X.6cI, X.I8l, int):void");
    }

    public AObjectS117S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
