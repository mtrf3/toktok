package X;

import Y.AUListenerS97S0100000_9;
import Y.IDAListenerS81S0100000_14;
import Y.IDaS223S0100000_14;
import Y.IDuS319S0100000_7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerState;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.aweme.views.IDlS63S0100000_7;
import com.ss.android.ugc.aweme.views.IDlS65S0100000_14;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wav, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82573Wav extends WM7 implements InterfaceC143795kd {
    public final MediaModel LJLIL;
    public final Effect LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final CreativeInfo LJLJJLL;
    public ImageView LJLJL;
    public SmartImageView LJLJLJ;
    public SmartImageView LJLJLLL;
    public RelativeLayout LJLL;
    public ARV LJLLI;
    public TextView LJLLILLLL;
    public View LJLLJ;
    public TextView LJLLL;
    public LDJ LJLLLL;
    public LDJ LJLLLLLL;
    public EditPreviewStickerViewModel LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public String LLFFF;
    public String LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public float LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public int LLIILZL;
    public ValueAnimator LLIIZ;
    public ValueAnimator LLIL;
    public final ArrayList<ArrayList<Coordinate>> LLILII;
    public final C73318Sq2 LLILIL;

    public final void LLJJIII() {
        this.LLIIJLIL = true;
        LDJ ldj = this.LJLLLL;
        if (ldj != null) {
            ldj.setCompleteListener(null);
            LDJ ldj2 = this.LJLLLL;
            if (ldj2 != null) {
                ldj2.setShowAnimation(false);
                LDJ ldj3 = this.LJLLLL;
                if (ldj3 != null) {
                    ldj3.setVisibility(4);
                    LLJJI(false);
                    if (this.LLIL == null) {
                        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(500L);
                        this.LLIL = duration;
                        o.LJI(duration);
                        duration.setRepeatCount(0);
                        duration.addUpdateListener(new AUListenerS97S0100000_9(this, 39));
                    }
                    ValueAnimator valueAnimator = this.LLIL;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        return;
                    }
                    ValueAnimator valueAnimator2 = this.LLIL;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                    ValueAnimator valueAnimator3 = this.LLIL;
                    if (valueAnimator3 != null) {
                        valueAnimator3.addListener(new IDAListenerS81S0100000_14(this, 11));
                        return;
                    }
                    return;
                }
                o.LJIJI("reactView");
                throw null;
            }
            o.LJIJI("reactView");
            throw null;
        }
        o.LJIJI("reactView");
        throw null;
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final void LLJILJILJ() {
        boolean z;
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        String str3 = this.LJLJJL;
        String creationId = this.LJLJJLL.getCreationId();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", str);
        c145995oB.LJI("content_source", str2);
        c145995oB.LJI("content_type", str3);
        c145995oB.LJI("creation_id", creationId);
        FMX.LJIIL("click_remove_background", c145995oB.LIZ);
        if (this.LLFZ || this.LLIILZL == 1 || this.LLIIJLIL) {
            return;
        }
        ARV arv = this.LJLLI;
        if (arv != null) {
            arv.setAlpha(1.0f);
            TextView textView = this.LJLLILLLL;
            if (textView != null) {
                textView.setAlpha(1.0f);
                int i = this.LLIILZL;
                if (i == 3 || i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (i == 1) {
                        return;
                    }
                    this.LLIIL = false;
                    this.LLIILZL = 1;
                    ARV arv2 = this.LJLLI;
                    if (arv2 != null) {
                        arv2.setAlpha(0.4f);
                        TextView textView2 = this.LJLLILLLL;
                        if (textView2 != null) {
                            textView2.setAlpha(0.4f);
                            TextView textView3 = this.LJLLL;
                            if (textView3 != null) {
                                textView3.setAlpha(0.4f);
                                TextView textView4 = this.LJLLL;
                                if (textView4 != null) {
                                    textView4.setEnabled(false);
                                    TextView textView5 = this.LJLLILLLL;
                                    if (textView5 != null) {
                                        textView5.setText(R.string.e3r);
                                        if (this.LLIIZ == null) {
                                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
                                            this.LLIIZ = duration;
                                            o.LJI(duration);
                                            duration.setRepeatCount(0);
                                            duration.addUpdateListener(new AUListenerS97S0100000_9(this, 40));
                                        }
                                        ValueAnimator valueAnimator = this.LLIIZ;
                                        if (valueAnimator == null) {
                                            return;
                                        }
                                        valueAnimator.start();
                                        valueAnimator.addListener(new IDAListenerS81S0100000_14(this, 12));
                                        return;
                                    }
                                    o.LJIJI("cutoutTv");
                                    throw null;
                                }
                                o.LJIJI("useStickerView");
                                throw null;
                            }
                            o.LJIJI("useStickerView");
                            throw null;
                        }
                        o.LJIJI("cutoutTv");
                        throw null;
                    }
                    o.LJIJI("cutoutIV");
                    throw null;
                }
                if (i != 2) {
                    return;
                }
                boolean z2 = !this.LLIIIL;
                this.LLIIIL = z2;
                if (z2) {
                    ARV arv3 = this.LJLLI;
                    if (arv3 != null) {
                        arv3.setChecked(true);
                        TextView textView6 = this.LJLLILLLL;
                        if (textView6 != null) {
                            textView6.setText(R.string.e3s);
                            SmartImageView smartImageView = this.LJLJLLL;
                            if (smartImageView != null) {
                                SmartImageView smartImageView2 = this.LJLJLJ;
                                if (smartImageView2 != null) {
                                    smartImageView.setVisibility(0);
                                    smartImageView2.setVisibility(4);
                                    return;
                                } else {
                                    o.LJIJI("originalView");
                                    throw null;
                                }
                            }
                            o.LJIJI("cutoutView");
                            throw null;
                        }
                        o.LJIJI("cutoutTv");
                        throw null;
                    }
                    o.LJIJI("cutoutIV");
                    throw null;
                }
                ARV arv4 = this.LJLLI;
                if (arv4 != null) {
                    arv4.setChecked(false);
                    TextView textView7 = this.LJLLILLLL;
                    if (textView7 != null) {
                        textView7.setText(R.string.e3s);
                        SmartImageView smartImageView3 = this.LJLJLJ;
                        if (smartImageView3 != null) {
                            SmartImageView smartImageView4 = this.LJLJLLL;
                            if (smartImageView4 != null) {
                                smartImageView3.setVisibility(0);
                                smartImageView4.setVisibility(4);
                                return;
                            } else {
                                o.LJIJI("cutoutView");
                                throw null;
                            }
                        }
                        o.LJIJI("originalView");
                        throw null;
                    }
                    o.LJIJI("cutoutTv");
                    throw null;
                }
                o.LJIJI("cutoutIV");
                throw null;
            }
            o.LJIJI("cutoutTv");
            throw null;
        }
        o.LJIJI("cutoutIV");
        throw null;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILIL.dispose();
    }

    public final void LLJILJIL(boolean z) {
        this.LLIIIL = false;
        if (z) {
            LLJJIII();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditPreviewStickerScene#cancelCutout : ");
        LDJ ldj = this.LJLLLL;
        if (ldj != null) {
            LIZ.append(ldj.LIZ());
            H78.LJI(X1D.LIZIZ(LIZ));
            LDJ ldj2 = this.LJLLLL;
            if (ldj2 != null) {
                if (ldj2.LIZ()) {
                    LDJ ldj3 = this.LJLLLL;
                    if (ldj3 != null) {
                        ldj3.setCompleteListener(new C82576Way(this));
                        return;
                    } else {
                        o.LJIJI("reactView");
                        throw null;
                    }
                }
                LLJJIII();
                return;
            }
            o.LJIJI("reactView");
            throw null;
        }
        o.LJIJI("reactView");
        throw null;
    }

    public final void LLJJ(String str) {
        C43882HKc.LIZLLL(1, "custom_sticker_imageclip_rate", null, true);
        if (str != null) {
            C5S1 c5s1 = new C5S1(getSceneContext());
            c5s1.LIZLLL(str);
            c5s1.LJ();
        }
        LLJILJIL(false);
    }

    public final void LLJJI(boolean z) {
        ARV arv = this.LJLLI;
        if (arv != null) {
            arv.setAlpha(1.0f);
            ARV arv2 = this.LJLLI;
            if (arv2 != null) {
                arv2.setChecked(z);
                TextView textView = this.LJLLILLLL;
                if (textView != null) {
                    textView.setAlpha(1.0f);
                    TextView textView2 = this.LJLLILLLL;
                    if (textView2 != null) {
                        textView2.setText(R.string.e3s);
                        TextView textView3 = this.LJLLL;
                        if (textView3 != null) {
                            textView3.setAlpha(1.0f);
                            TextView textView4 = this.LJLLL;
                            if (textView4 != null) {
                                textView4.setEnabled(true);
                                return;
                            } else {
                                o.LJIJI("useStickerView");
                                throw null;
                            }
                        }
                        o.LJIJI("useStickerView");
                        throw null;
                    }
                    o.LJIJI("cutoutTv");
                    throw null;
                }
                o.LJIJI("cutoutTv");
                throw null;
            }
            o.LJIJI("cutoutIV");
            throw null;
        }
        o.LJIJI("cutoutIV");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.aeg);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.back)");
        this.LJLJL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.cpq);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.edit_sticker_preview)");
        this.LJLJLJ = (SmartImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.cpr);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.edit_sticker_preview_mask)");
        this.LJLJLLL = (SmartImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.gem);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.mask_container)");
        this.LJLL = (RelativeLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.eb8);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.icon_cutout)");
        this.LJLLI = (ARV) findViewById5;
        View findViewById6 = view.findViewById(R.id.m46);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.tv_cutout)");
        this.LJLLILLLL = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.bey);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.click_hot_zone)");
        this.LJLLJ = findViewById7;
        View findViewById8 = view.findViewById(R.id.awq);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.btn_import_sticker)");
        this.LJLLL = (TextView) findViewById8;
        if (C58B.LIZ()) {
            TextView textView = this.LJLLL;
            if (textView != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
                c110614Vt.LIZJ = C61328O5c.LIZJ(6);
                TextView textView2 = this.LJLLL;
                if (textView2 != null) {
                    Context context = textView2.getContext();
                    o.LJIIIIZZ(context, "useStickerView.context");
                    textView.setBackground(c110614Vt.LIZ(context));
                } else {
                    o.LJIJI("useStickerView");
                    throw null;
                }
            } else {
                o.LJIJI("useStickerView");
                throw null;
            }
        }
        View findViewById9 = view.findViewById(R.id.a5f);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.animation_path_view)");
        LDJ ldj = (LDJ) findViewById9;
        this.LJLLLL = ldj;
        ldj.setRepeatCount(-1);
        View findViewById10 = view.findViewById(R.id.gek);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.mask_animation_path_view)");
        LDJ ldj2 = (LDJ) findViewById10;
        this.LJLLLLLL = ldj2;
        ldj2.setDynamicLength(true);
        LDJ ldj3 = this.LJLLLLLL;
        if (ldj3 != null) {
            ldj3.setRatio(0.8f);
            TextView textView3 = this.LJLLL;
            if (textView3 != null) {
                C16880lQ.LJIJI(textView3, new IDlS63S0100000_7(this, 19));
                ARV arv = this.LJLLI;
                if (arv != null) {
                    arv.setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS65S0100000_14(this, 6)));
                    TextView textView4 = this.LJLLILLLL;
                    if (textView4 != null) {
                        C16880lQ.LJIJI(textView4, new IDlS65S0100000_14(this, 7));
                        View view2 = this.LJLLJ;
                        if (view2 != null) {
                            C16880lQ.LJIIJ(new IDlS65S0100000_14(this, 8), view2);
                            ImageView imageView = this.LJLJL;
                            if (imageView != null) {
                                C16880lQ.LJIILLIIL(imageView, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 51));
                                this.LLILIL.LIZ(AbstractC73672Svk.LJIIJ(new IDuS319S0100000_7(this, 4)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new InterfaceC64592gB() { // from class: X.9Ez
                                    @Override // X.InterfaceC64592gB
                                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                    }
                                }, new InterfaceC64592gB() { // from class: X.9F0
                                    @Override // X.InterfaceC64592gB
                                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                    }
                                }, new IDaS223S0100000_14(this, 1)));
                                Activity activity = this.mActivity;
                                o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) C0JT.LIZIZ((ActivityC45651qj) activity, EditPreviewStickerViewModel.class, "of(activity as FragmentA…kerViewModel::class.java)");
                                this.LJLZ = editPreviewStickerViewModel;
                                C73156SnQ.LJIIIIZZ(this, editPreviewStickerViewModel, new TBT() { // from class: X.Wb0
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return ((EditPreviewStickerState) obj).getCutoutData();
                                    }
                                }, new AqS196S0100000_14(this, 42));
                                EditPreviewStickerViewModel editPreviewStickerViewModel2 = this.LJLZ;
                                if (editPreviewStickerViewModel2 == null) {
                                    o.LJIJI("viewModel");
                                    throw null;
                                }
                                subscribeEvent(editPreviewStickerViewModel2, new TBT() { // from class: X.Wb3
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return ((EditPreviewStickerState) obj).getCompressBitmapEvent();
                                    }
                                }, new C73165SnZ<>(), new AqS196S0100000_14(this, 43));
                                EditPreviewStickerViewModel editPreviewStickerViewModel3 = this.LJLZ;
                                if (editPreviewStickerViewModel3 != null) {
                                    C73156SnQ.LJIIIIZZ(this, editPreviewStickerViewModel3, new TBT() { // from class: X.Wb1
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return ((EditPreviewStickerState) obj).getCutoutError();
                                        }
                                    }, new AqS196S0100000_14(this, 44));
                                    EditPreviewStickerViewModel editPreviewStickerViewModel4 = this.LJLZ;
                                    if (editPreviewStickerViewModel4 != null) {
                                        C73156SnQ.LJIIIIZZ(this, editPreviewStickerViewModel4, new TBT() { // from class: X.Waz
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((EditPreviewStickerState) obj).getCancel();
                                            }
                                        }, new AqS196S0100000_14(this, 45));
                                        return;
                                    } else {
                                        o.LJIJI("viewModel");
                                        throw null;
                                    }
                                }
                                o.LJIJI("viewModel");
                                throw null;
                            }
                            o.LJIJI("back");
                            throw null;
                        }
                        o.LJIJI("cutoutHotZone");
                        throw null;
                    }
                    o.LJIJI("cutoutTv");
                    throw null;
                }
                o.LJIJI("cutoutIV");
                throw null;
            }
            o.LJIJI("useStickerView");
            throw null;
        }
        o.LJIJI("maskPathView");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public final void LLJJIJI(File file, List list, Location old) {
        LDJ ldj = this.LJLLLL;
        if (ldj != null) {
            ldj.setCompleteListener(null);
            this.LLFII = file.getAbsolutePath();
            float f = this.LLIFFJFJJ;
            o.LJIIIZ(old, "old");
            Location location = new Location((int) (old.getLeft() / f), (int) (old.getTop() / f), (int) (old.getWidth() / f), (int) (old.getHeight() / f));
            this.LLIIIILZ = location.getLeft() + this.LLIIIILZ;
            this.LLIIIJ = location.getTop() + this.LLIIIJ;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(location.getWidth(), location.getHeight());
            layoutParams.addRule(9);
            layoutParams.setMargins(this.LLIIIILZ, this.LLIIIJ, 0, 0);
            SmartImageView smartImageView = this.LJLJLLL;
            if (smartImageView != null) {
                smartImageView.setLayoutParams(layoutParams);
                SmartImageView smartImageView2 = this.LJLJLLL;
                if (smartImageView2 != null) {
                    smartImageView2.setAlpha(0.0f);
                    SmartImageView smartImageView3 = this.LJLJLLL;
                    if (smartImageView3 != null) {
                        smartImageView3.setVisibility(0);
                        W5F LJI = W5U.LJI(file);
                        LJI.LJIJJ = EnumC72807Shn.FIT_CENTER;
                        SmartImageView smartImageView4 = this.LJLJLLL;
                        if (smartImageView4 != null) {
                            LJI.LJJIIJ = smartImageView4;
                            LJI.LIZLLL(new LDL(this, list));
                            return;
                        } else {
                            o.LJIJI("cutoutView");
                            throw null;
                        }
                    }
                    o.LJIJI("cutoutView");
                    throw null;
                }
                o.LJIJI("cutoutView");
                throw null;
            }
            o.LJIJI("cutoutView");
            throw null;
        }
        o.LJIJI("reactView");
        throw null;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ccm, viewGroup, false, "inflater.inflate(R.layou…ticker, container, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    public C82573Wav(MediaModel mediaModel, Effect effect, String str, String str2, String str3, CreativeInfo creativeInfo) {
        o.LJIIIZ(mediaModel, "mediaModel");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LJLIL = mediaModel;
        this.LJLILLLLZI = effect;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = creativeInfo;
        this.LLIFFJFJJ = 1.0f;
        this.LLILII = new ArrayList<>();
        this.LLILIL = new C73318Sq2();
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
