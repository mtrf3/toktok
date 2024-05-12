package X;

import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import Y.IDAListenerS71S0100000_2;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6iE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167786iE extends AbstractC56012Ht<C168046ie, C167916iR> implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJLIL;
    public final C82622Wbi LJLIL;
    public final C5T9 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C82632Wbs LJLJJL;
    public boolean LJLJJLL;
    public Effect LJLJL;
    public View LJLJLJ;
    public boolean LJLJLLL;
    public InterfaceC153045zY LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public float LJLLJ;
    public final C82632Wbs LJLLL;
    public final C62822Ol8 LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public final C82632Wbs LJZ;
    public final C82632Wbs LJZI;
    public final C82631Wbr LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public View LLF;
    public TuxTextView LLFF;
    public TuxTextView LLFFF;
    public TuxTextView LLFII;
    public LinearLayout LLFZ;
    public RelativeLayout LLI;
    public boolean LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public Effect LLIIIILZ;
    public MusicBuzModel LLIIIJ;
    public List<? extends NLEModel> LLIIIL;
    public boolean LLIIIZ;
    public String LLIIJI;

    static {
        TBT tbt = new TBT(C167786iE.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIJLIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C167786iE.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C167786iE.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C167786iE.class, "aePreviewApiComponent", "getAePreviewApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/preview/AEPreviewApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C167786iE.class, "stsApi", "getStsApi()Lcom/ss/android/ugc/gamora/editor/audioservice/service/speechtosong/components/SpeechToSongApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.AbstractC56012Ht
    public final void onHide() {
        this.LLIFFJFJJ = false;
        super.onHide();
        WMH wmh = (WMH) this.mParentScene;
        if (wmh != null) {
            wmh.hide(this);
        }
    }

    public final void LLJILJILJ() {
        if (!this.LJLLILLLL) {
            float f = this.LJLLJ;
            if (f <= 0.0f) {
                return;
            }
            LinearLayout linearLayout = this.LLFZ;
            if (linearLayout != null) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout, "translationY", f, 0.0f).setDuration(300L);
                o.LJIIIIZZ(duration, "ofFloat(addRecordLayout2…        .setDuration(300)");
                duration.addListener(new IDAListenerS71S0100000_2(this, 5));
                duration.start();
                return;
            }
            o.LJIJI("addRecordLayout2");
            throw null;
        }
    }

    public final NLEEditor LLJJJ() {
        return (NLEEditor) this.LLD.getValue();
    }

    public final C167676i3 LLJJJIL() {
        return (C167676i3) this.LJLJI.getValue();
    }

    public final C42292Gim LLJJJJ() {
        return (C42292Gim) this.LJLLLL.getValue();
    }

    public final VideoPublishEditModel LLJJL() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LLIIJLIL[0]);
    }

    public final InterfaceC162426Za LLJLIL() {
        return (InterfaceC162426Za) this.LJZL.LIZ(this, LLIIJLIL[4]);
    }

    public final List<Effect> LLJLILLLLZIIL() {
        return (List) this.LLIIII.getValue();
    }

    public final C168106ik LLJLL() {
        return (C168106ik) this.LJLJJI.getValue();
    }

    public final InterfaceC166716gV LLJLLIL() {
        return (InterfaceC166716gV) this.LJZ.LIZ(this, LLIIJLIL[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.ss.ugc.effectplatform.model.Effect, com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.ugc.effectplatform.model.Effect, com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    public final Effect LLJLLL() {
        String str;
        C68322mC c68322mC = new C68322mC();
        boolean z = false;
        int i = 1;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (LLJJL().veAudioEffectParam == null && LLJJL().creativeModel.streamVoiceConversionModel.vcEffectId.length() == 0 && !C44384HbQ.LJLJL(LLJJL())) {
            c68322mC.element = null;
        } else {
            AudioEffectParam audioEffectParam = LLJJL().veAudioEffectParam;
            if (audioEffectParam != null) {
                if (audioEffectParam.getUploadId().length() == 0) {
                    c68322mC.element = null;
                } else {
                    ?? effect = new Effect(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
                    effect.setUnzipPath(audioEffectParam.getEffectPath());
                    effect.setEffectId(audioEffectParam.getUploadId());
                    c68322mC.element = effect;
                }
            }
            if (C168126im.LIZ()) {
                C62A.LIZ.getClass();
                if (C62A.LIZJ() && LLJJL().creativeModel.musicBuzModel.stsTemplateId != null) {
                    ?? effect2 = new Effect(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
                    String string = requireSceneContext().getString(R.string.ri0);
                    o.LJIIIIZZ(string, "requireSceneContext()\n  …_effectsBottomSheet_body)");
                    effect2.setName(string);
                    effect2.setEffectId("speech2song");
                    c68322mC.element = effect2;
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initDefaultSelection  selectedEffect is null ? ");
        if (c68322mC.element == 0) {
            z = true;
        }
        LIZ.append(z);
        LIZ.append(" ,id= ");
        EffectTemplate effectTemplate = (EffectTemplate) c68322mC.element;
        if (effectTemplate != null) {
            str = effectTemplate.getEffectId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", name= ");
        com.ss.ugc.effectplatform.model.Effect effect3 = (com.ss.ugc.effectplatform.model.Effect) c68322mC.element;
        if (effect3 != null) {
            str2 = effect3.getName();
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        return (Effect) c68322mC.element;
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLLL.LIZ(this, LLIIJLIL[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC56012Ht
    public final void onShow() {
        MusicBuzModel musicBuzModel;
        NLEModel nLEModel;
        final InterfaceC162426Za LLJLIL;
        Activity activity;
        FrameLayout frameLayout;
        NLEEditor nLEEditor;
        Effect effect;
        C122034qd LJJI;
        float f;
        super.onShow();
        int i = 1;
        this.LLIFFJFJJ = true;
        this.LJLL = getEditPreviewApi().Kh().getValue();
        System.nanoTime();
        com.ss.ugc.effectplatform.model.Effect effect2 = null;
        Object[] objArr = 0;
        if (C168126im.LIZ() && LLJLIL() != null) {
            MusicBuzModel objectToClone = LLJJL().creativeModel.musicBuzModel;
            o.LJIIIZ(objectToClone, "objectToClone");
            try {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeParcelable(objectToClone, 0);
                    obtain.setDataPosition(0);
                    Parcelable readParcelable = obtain.readParcelable(MusicBuzModel.class.getClassLoader());
                    obtain.recycle();
                    musicBuzModel = (MusicBuzModel) readParcelable;
                } catch (Throwable th) {
                    if (obtain != null) {
                        obtain.recycle();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            musicBuzModel = null;
        }
        this.LLIIIJ = musicBuzModel;
        InterfaceC153045zY interfaceC153045zY = this.LJLL;
        if (interfaceC153045zY != null) {
            nLEModel = C17N.LJJ(interfaceC153045zY);
        } else {
            nLEModel = null;
        }
        C166636gN.LIZ(nLEModel);
        if (this.LJLJJLL) {
            Effect LLJLLL = LLJLLL();
            if (LLJLLL == null) {
                LLJJJIL().LJIIIIZZ();
            } else {
                LLJJJIL().LJIILIIL(LLJLLL);
                LLJJJIL().LJIIJJI();
            }
            AbstractC167696i5 abstractC167696i5 = LLJJJIL().LIZIZ;
            if (abstractC167696i5 != null) {
                abstractC167696i5.LJLJL = abstractC167696i5.LJLJJLL;
            }
            LLJJ();
            LLLF((AudioRecorderParam) ((C08630Vn) getUiStates().LIZ(new TBT() { // from class: X.6ia
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C168046ie) obj).LJLJJI;
                }
            }).LIZ()).LIZIZ);
            LLLFFI();
        } else {
            this.LJLJJLL = true;
            View requireViewById = requireViewById(R.id.vx);
            o.LJIIIIZZ(requireViewById, "requireViewById(R.id.add_record_layout2)");
            LinearLayout linearLayout = (LinearLayout) requireViewById;
            this.LLFZ = linearLayout;
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = this.LLFZ;
            if (linearLayout2 != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.d5);
                c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(33));
                Context requireSceneContext = requireSceneContext();
                o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                linearLayout2.setBackground(c110614Vt.LIZ(requireSceneContext));
                LinearLayout linearLayout3 = this.LLFZ;
                if (linearLayout3 != null) {
                    C146035oF.LIZJ(linearLayout3, new AqS152S0100000_2(this, 207));
                    View requireViewById2 = requireViewById(R.id.be6);
                    o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.clear)");
                    this.LLF = requireViewById2;
                    View requireViewById3 = requireViewById(R.id.mnz);
                    o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.tv_tip)");
                    this.LLFF = (TuxTextView) requireViewById3;
                    View requireViewById4 = requireViewById(R.id.vz);
                    o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.add_record_text2)");
                    this.LLFII = (TuxTextView) requireViewById4;
                    o.LJIIIIZZ(requireViewById(R.id.eak), "requireViewById(R.id.icon_add_record2)");
                    View requireViewById5 = requireViewById(R.id.ca8);
                    o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.disable_tip_view2)");
                    TuxTextView tuxTextView = (TuxTextView) requireViewById5;
                    this.LLFFF = tuxTextView;
                    tuxTextView.setVisibility(8);
                    View requireViewById6 = requireViewById(R.id.ne1);
                    o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.volume_btn2_layout)");
                    RelativeLayout relativeLayout = (RelativeLayout) requireViewById6;
                    this.LLI = relativeLayout;
                    C146035oF.LIZJ(relativeLayout, new AqS152S0100000_2(this, 208));
                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6ig
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C168046ie) obj).LJLJI;
                        }
                    }, null, new AqS168S0100000_2(this, 136), 2, null);
                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6iY
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C168046ie) obj).LJLJJI;
                        }
                    }, null, new AqS168S0100000_2(this, 127), 2, null);
                    AudioRecorderParam audioRecorderParam = (AudioRecorderParam) ((C08630Vn) getUiStates().LIZ(new TBT() { // from class: X.6iZ
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C168046ie) obj).LJLJJI;
                        }
                    }).LIZ()).LIZIZ;
                    RelativeLayout relativeLayout2 = this.LLI;
                    if (relativeLayout2 != null) {
                        LLLFF(relativeLayout2, !audioRecorderParam.getMStack().isEmpty());
                        View requireViewById7 = requireViewById(R.id.ndo);
                        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.voice_filter_layout)");
                        requireSceneContext();
                        final GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
                        C167676i3 LLJJJIL = LLJJJIL();
                        Context context = this.mView.getContext();
                        o.LJIIIIZZ(context, "view.context");
                        RecyclerView LIZLLL = LLJJJIL.LIZLLL(context, gridLayoutManager, new AbstractC030309z() { // from class: X.5ut
                            @Override // X.AbstractC030309z
                            public final void LJFF(Canvas c, RecyclerView parent, C0AC state) {
                                o.LJIIIZ(c, "c");
                                o.LJIIIZ(parent, "parent");
                                o.LJIIIZ(state, "state");
                            }

                            @Override // X.AbstractC030309z
                            public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
                                T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
                            }
                        });
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.setMarginStart((int) (C143205jg.LJ() * 0.04d));
                        layoutParams.setMarginEnd((int) (C143205jg.LJ() * 0.04d));
                        layoutParams.topMargin = SFS.LJI(20.0d);
                        ((ViewGroup) requireViewById7).addView(LIZLLL, layoutParams);
                        C167676i3 LLJJJIL2 = LLJJJIL();
                        C168206iu c168206iu = new C168206iu();
                        C168146io block = C168146io.LJLIL;
                        o.LJIIIZ(block, "block");
                        c168206iu.LJLJLLL = block;
                        LLJJJIL2.LJFF(c168206iu);
                        final View requireViewById8 = requireViewById(R.id.dy8);
                        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.gradual_view)");
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                        gradientDrawable.setColors(new int[]{-16777216, 0});
                        requireViewById8.setBackground(gradientDrawable);
                        if (LIZLLL != null) {
                            LIZLLL.LJIIJJI(new C0A6() { // from class: X.6iK
                                @Override // X.C0A6
                                public final void LJIILL(RecyclerView recyclerView, int i2, int i3) {
                                    o.LJIIIZ(recyclerView, "recyclerView");
                                    if (GridLayoutManager.this.LLIL() > 0) {
                                        requireViewById8.setVisibility(0);
                                    } else {
                                        requireViewById8.setVisibility(8);
                                    }
                                    if (i3 > 0) {
                                        C167786iE c167786iE = this;
                                        if (!c167786iE.LJLLI) {
                                            LinearLayout linearLayout4 = c167786iE.LLFZ;
                                            if (linearLayout4 != null) {
                                                if (linearLayout4.getVisibility() == 8) {
                                                    return;
                                                }
                                                LinearLayout linearLayout5 = c167786iE.LLFZ;
                                                if (linearLayout5 != null) {
                                                    ViewGroup.LayoutParams layoutParams2 = linearLayout5.getLayoutParams();
                                                    o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                                    float f2 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                                                    if (c167786iE.LLFZ != null) {
                                                        float height = f2 + r0.getHeight();
                                                        c167786iE.LJLLJ = height;
                                                        LinearLayout linearLayout6 = c167786iE.LLFZ;
                                                        if (linearLayout6 != null) {
                                                            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout6, "translationY", 0.0f, height).setDuration(300L);
                                                            o.LJIIIIZZ(duration, "ofFloat(addRecordLayout2…        .setDuration(300)");
                                                            duration.addListener(new IDAListenerS71S0100000_2(c167786iE, 6));
                                                            duration.start();
                                                            return;
                                                        }
                                                        o.LJIJI("addRecordLayout2");
                                                        throw null;
                                                    }
                                                    o.LJIJI("addRecordLayout2");
                                                    throw null;
                                                }
                                                o.LJIJI("addRecordLayout2");
                                                throw null;
                                            }
                                            o.LJIJI("addRecordLayout2");
                                            throw null;
                                        }
                                        return;
                                    }
                                    if (i3 >= 0) {
                                        return;
                                    }
                                    this.LLJILJILJ();
                                }
                            });
                        }
                        View requireViewById9 = requireViewById(R.id.lup);
                        o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.tux_free_slider)");
                        C168266j0 c168266j0 = (C168266j0) requireViewById9;
                        final C167906iQ c167906iQ = new C167906iQ(c168266j0, this.LJLILLLLZI);
                        final AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(c168266j0, 131);
                        final AqS168S0100000_2 aqS168S0100000_22 = new AqS168S0100000_2(c168266j0, 132);
                        C5T9 c5t9 = c167906iQ.LIZIZ;
                        c5t9.getClass();
                        c5t9.LJIIJ = c167906iQ;
                        c167906iQ.LIZ.setOnSliderListener(new InterfaceC168276j1() { // from class: X.6iM
                            @Override // X.InterfaceC168276j1
                            public final void LIZ(C168266j0 slider) {
                                o.LJIIIZ(slider, "slider");
                                C167906iQ.this.LIZIZ.LJIIJJI.LIZ(slider.getIndicator() / 100, true);
                                InterfaceC88472Yns<C168266j0, C76800UCe> interfaceC88472Yns = aqS168S0100000_22;
                                if (interfaceC88472Yns != null) {
                                    interfaceC88472Yns.invoke(slider);
                                }
                            }

                            @Override // X.InterfaceC168276j1
                            public final void LIZJ(C168266j0 slider) {
                                o.LJIIIZ(slider, "slider");
                                InterfaceC88472Yns<C168266j0, C76800UCe> interfaceC88472Yns = aqS168S0100000_2;
                                if (interfaceC88472Yns != null) {
                                    interfaceC88472Yns.invoke(slider);
                                }
                            }

                            @Override // X.InterfaceC168276j1
                            public final void LIZIZ(C168266j0 slider, int i2, boolean z) {
                                o.LJIIIZ(slider, "slider");
                                if (!z) {
                                    return;
                                }
                                C167906iQ.this.LIZIZ.LIZ();
                                C167906iQ.this.LIZIZ.LJIIJJI.LIZ(i2 / 100, false);
                            }
                        });
                        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6id
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C168046ie) obj).LJLIL;
                            }
                        }, null, new AqS168S0100000_2(this, 133), 2, null);
                        C42292Gim LLJJJJ = LLJJJJ();
                        Context requireSceneContext2 = requireSceneContext();
                        o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
                        LLJJJJ.LIZIZ(requireSceneContext2, new AqS152S0100000_2(this, 204));
                        View view = this.LLF;
                        if (view != null) {
                            C146035oF.LIZJ(view, new AqS152S0100000_2(this, 206));
                            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6ih
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C168046ie) obj).LJLILLLLZI;
                                }
                            }, null, new AqS168S0100000_2(this, 135), 2, null);
                            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6ii
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C168046ie) obj).LJLJJL;
                                }
                            }, null, new AqS168S0100000_2(this, 128), 2, null);
                            LLLF((AudioRecorderParam) ((C08630Vn) getUiStates().LIZ(new TBT() { // from class: X.6ib
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C168046ie) obj).LJLJJI;
                                }
                            }).LIZ()).LIZIZ);
                            LLLFFI();
                            if (C168126im.LIZ() && (LLJLIL = LLJLIL()) != null && (activity = this.mActivity) != null && (frameLayout = (FrameLayout) activity.findViewById(R.id.dgw)) != null) {
                                C168106ik LLJLL = LLJLL();
                                LLJLL.getClass();
                                if (frameLayout.getChildCount() > 0) {
                                    frameLayout.removeAllViews();
                                }
                                LLJLL.LIZ = frameLayout;
                                Context context2 = frameLayout.getContext();
                                o.LJIIIIZZ(context2, "container.context");
                                YAB yab = new YAB(context2);
                                LLJLL.LIZIZ = yab;
                                frameLayout.addView(yab, -1, -1);
                                FrameLayout frameLayout2 = LLJLL.LIZ;
                                if (frameLayout2 != null) {
                                    frameLayout2.setVisibility(8);
                                }
                                C168106ik LLJLL2 = LLJLL();
                                YAE yae = new YAE() { // from class: X.6iL
                                    @Override // X.YAE
                                    public final void LIZ(View view2, Effect effect3, boolean z) {
                                        int LLJJIJIL;
                                        YAB yab2;
                                        o.LJIIIZ(view2, "view");
                                        o.LJIIIZ(effect3, "effect");
                                        C167786iE c167786iE = C167786iE.this;
                                        if (!c167786iE.LLIFFJFJJ) {
                                            Effect effect4 = c167786iE.LLIIIILZ;
                                            if (effect4 != null && (LLJJIJIL = C167786iE.LLJJIJIL(effect4, c167786iE.LLJLILLLLZIIL())) != -1 && (yab2 = c167786iE.LLJLL().LIZIZ) != null) {
                                                yab2.setSelectionSilent(LLJJIJIL);
                                                return;
                                            }
                                            return;
                                        }
                                        if (!z) {
                                            c167786iE.LLJJIJI(null, effect3, false, LLJLIL);
                                        }
                                    }
                                };
                                YAB yab2 = LLJLL2.LIZIZ;
                                if (yab2 != null) {
                                    yab2.setCenterSelectListener(yae);
                                }
                            }
                            LLJJJIL().LJIIJ((InterfaceC150015uf) this.LLII.getValue());
                            LLJJ();
                        } else {
                            o.LJIJI("clearView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("volumeBtn2Layout");
                        throw null;
                    }
                } else {
                    o.LJIJI("addRecordLayout2");
                    throw null;
                }
            } else {
                o.LJIJI("addRecordLayout2");
                throw null;
            }
        }
        NLEModel nleModel = LLJJJ().LJ();
        if (!LLJJL().isCurrentAutoCutMode()) {
            if (C44384HbQ.LJLJL(LLJJL())) {
                o.LJIIIIZZ(nleModel, "nleModel");
                AudioRecorderParam audioRecorderParam2 = LLJJL().veAudioRecorderParam;
                if (audioRecorderParam2 != null) {
                    f = audioRecorderParam2.getVoiceVolume();
                } else {
                    AbstractC143275jn.LLF.getClass();
                    f = AbstractC143275jn.LLFFF;
                }
                ArrayList arrayList = new ArrayList();
                NLETrack mainTrack = nleModel.getMainTrack();
                if (mainTrack != null) {
                    Iterator<NLETrackSlot> it = mainTrack.LJIILLIIL().iterator();
                    while (it.hasNext()) {
                        NLETrackSlot mainTrackSlot = it.next();
                        o.LJIIIIZZ(mainTrackSlot, "mainTrackSlot");
                        if (C124574uj.LJJIJIIJI(mainTrackSlot)) {
                            if (C124574uj.LJJIJIIJIL(mainTrackSlot)) {
                                NLETrackSlot LIZIZ = C122424rG.LIZIZ(nleModel, mainTrackSlot);
                                if (LIZIZ != null) {
                                    NLETrackSlot LIZ = NLETrackSlot.LIZ(LIZIZ.deepClone(false));
                                    NLESegment LJI = LIZ.LJI();
                                    o.LJIIIIZZ(LJI, "cloneSlot.mainSegment");
                                    C124574uj.LJJLIIIJJI(LJI, f);
                                    arrayList.add(C122424rG.LJFF(LIZ));
                                }
                            } else {
                                NLETrackSlot LIZ2 = NLETrackSlot.LIZ(mainTrackSlot.deepClone(false));
                                NLESegment LJI2 = LIZ2.LJI();
                                o.LJIIIIZZ(LJI2, "cloneSlot.mainSegment");
                                C124574uj.LJJLIIIJJI(LJI2, f);
                                arrayList.add(C122424rG.LJI(LIZ2));
                            }
                        }
                    }
                }
                this.LLIIIL = arrayList;
            } else {
                o.LJIIIIZZ(nleModel, "nleModel");
                this.LLIIIL = C122424rG.LIZ(nleModel);
            }
        }
        final ArrayList arrayList2 = new ArrayList();
        Effect effect3 = new Effect(effect2, i, objArr == true ? 1 : 0);
        Iterator<? extends NLEModel> it2 = this.LLIIIL.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C166116fX(null, it2.next(), effect3));
        }
        if (C166636gN.LIZIZ()) {
            LLJLLIL().te((C166246fk) C165346eI.LIZ.getValue());
            LLJLLIL().Ur(arrayList2, new InterfaceC165816f3() { // from class: X.6i1
                @Override // X.InterfaceC165816f3
                public final void onFailed() {
                }

                @Override // X.InterfaceC165816f3
                public final void onStart() {
                }

                @Override // X.InterfaceC165816f3
                public final void onSuccess() {
                }
            });
        }
        C5MG WS = getEditPreviewApi().WS();
        if (WS != null && (LJJI = C17N.LJJI(WS.LJIJ())) != null) {
            nLEEditor = LJJI.LJIIJ;
        } else {
            nLEEditor = null;
        }
        C167736i9 LJI3 = LLJJJIL().LJI(LLJJJIL().LIZ());
        if (LJI3 != null) {
            effect = LJI3.LIZ;
        } else {
            effect = null;
        }
        this.LJLJL = null;
        if (effect != null && !OUP.LJJIIZ(effect) && !OUP.LJJIIJ(effect) && C78857UxB.LJJJIL(effect.getEffectId())) {
            this.LJLJL = effect;
            C141425go.LIZLLL(getEditPreviewApi());
            if (nLEEditor != null) {
                nLEEditor.LIZIZ();
                nLEEditor.LIZJ();
            }
            C173376rF.LJII(LLJJL());
            C141425go.LIZ(effect, getEditPreviewApi(), new AqS184S0100000_2(this, 23));
            if (nLEEditor != null) {
                nLEEditor.LIZIZ();
            }
        }
    }

    public final void LLJILJIL() {
        Effect effect;
        if (LLJJLIIIJLLLLLLLZ() == 2 && LLJLIL() != null && (effect = this.LLIIIILZ) != null) {
            InterfaceC162426Za LLJLIL = LLJLIL();
            if (LLJLIL != null) {
                LLJJIJI(null, effect, true, LLJLIL);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLJJ() {
        boolean z;
        C168106ik LLJLL;
        YAB yab;
        C150145us LIZ = C149965ua.LIZ(LLJJL(), (AudioRecorderParam) ((C08630Vn) getUiStates().LIZ(new TBT() { // from class: X.6iX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C168046ie) obj).LJLJJI;
            }
        }).LIZ()).LIZIZ);
        if (LIZ.LIZ && LLJJIJIIJIL((AudioRecorderParam) ((C08630Vn) getUiStates().LIZ(new TBT() { // from class: X.6iW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C168046ie) obj).LJLJJI;
            }
        }).LIZ()).LIZIZ)) {
            z = true;
        } else {
            z = false;
        }
        C150145us c150145us = new C150145us(LIZ.LIZIZ, LIZ.LIZJ, z, LIZ.LIZLLL);
        Effect LLJLLL = LLJLLL();
        if ((LLJLLL == null || !OUP.LJJIIJ(LLJLLL)) && (yab = (LLJLL = LLJLL()).LIZIZ) != null) {
            yab.post(new ARunnableS38S0100000_2(LLJLL, 12));
        }
        C167676i3 LLJJJIL = LLJJJIL();
        C167816iH c167816iH = new C167816iH(this, LLJLLL, LIZ);
        LLJJJIL.getClass();
        LLJJJIL.LJIIL(true, new C150185uw(LLJJJIL, c150145us, LLJLLL, c167816iH));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r0 = new com.ss.android.ugc.effectmanager.effect.model.Effect(r4, r7, r4 == true ? 1 : 0);
        r0.setName(r1);
        r0.setEffectId(r8);
        r1 = new com.ss.android.ugc.aweme.services.audio.StsAssetModel(r0, r6, r2);
        r0 = LLJLIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        r0.t50(r1, false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        r0 = r2.stsTemplateId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r0 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r2 = r2.stsWarp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004a, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00df, code lost:
    
        if (r0.length() != 0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJI() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167786iE.LLJJI():void");
    }

    public final void LLJJIII() {
        if (C44384HbQ.LJLJL(LLJJL()) && LLJLIL() != null) {
            InterfaceC162426Za LLJLIL = LLJLIL();
            if (LLJLIL != null) {
                LLJLIL.xj(false);
            }
            C168106ik LLJLL = LLJLL();
            YAB yab = LLJLL.LIZIZ;
            if (yab != null) {
                yab.post(new ARunnableS38S0100000_2(LLJLL, 12));
            }
            this.LLIIIILZ = null;
            getUiActions().LJLJJL.invoke();
        }
    }

    public final int LLJJLIIIJLLLLLLLZ() {
        Effect effect;
        C167736i9 LJI = LLJJJIL().LJI(LLJJJIL().LIZ());
        if (LJI == null || (effect = LJI.LIZ) == null) {
            return 0;
        }
        if (OUP.LJJIIJ(effect)) {
            return 2;
        }
        return 1;
    }

    public final void LLJZIJLIL() {
        NLEEditor nLEEditor;
        C122034qd LJJI;
        C5MG WS = getEditPreviewApi().WS();
        if (WS != null && (LJJI = C17N.LJJI(WS.LJIJ())) != null) {
            nLEEditor = LJJI.LJIIJ;
        } else {
            nLEEditor = null;
        }
        Effect effect = this.LJLJL;
        if (effect != null) {
            C141425go.LIZLLL(getEditPreviewApi());
            C173376rF.LJII(LLJJL());
            C141425go.LIZ(effect, getEditPreviewApi(), new AqS184S0100000_2(this, 22));
            if (nLEEditor != null) {
                nLEEditor.LIZIZ();
                nLEEditor.LIZJ();
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFFI() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167786iE.LLLFFI():void");
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        LLJJJIL().onDestroy();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C166696gT.LIZ().getClass();
        InterfaceC84498XEg LIZIZ = C166696gT.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.destroy();
        }
        C169416kr.LIZLLL = null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final boolean LLJJIJIIJIL(AudioRecorderParam audioRecorderParam) {
        if (C149965ua.LIZ(LLJJL(), audioRecorderParam).LIZ || (!audioRecorderParam.getMStack().isEmpty()) || LLJJLIIIJLLLLLLLZ() == 2 || C44384HbQ.LJLJL(LLJJL())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLL(Effect effect) {
        NLEModel LJ;
        String str;
        String str2;
        String str3;
        List<? extends List<Float>> list;
        if (!H7R.LJJJI(LLJJL()) || (LJ = LLJJJ().LJ()) == null) {
            return;
        }
        String songCacheKey = C166726gW.LIZ(C166726gW.LIZIZ(C122794rr.LJFF(LJ)), effect.getEffectId());
        MusicBuzModel musicBuzModel = this.LLIIIJ;
        if (musicBuzModel == null || (str = musicBuzModel.musicPath) == null || (str2 = musicBuzModel.stsEffectName) == null || (str3 = musicBuzModel.stsTemplateId) == null || (list = musicBuzModel.stsWarp) == null) {
            return;
        }
        Effect effect2 = new Effect(null, 1, 0 == true ? 1 : 0);
        effect2.setName(str2);
        effect2.setEffectId(str3);
        StsAssetModel stsAssetModel = new StsAssetModel(effect2, str, list);
        o.LJIIIZ(songCacheKey, "songCacheKey");
        C166726gW.LIZJ.put(songCacheKey, stsAssetModel);
    }

    public final void LLLF(AudioRecorderParam audioRecorderParam) {
        if (getSceneContext() == null) {
            return;
        }
        this.LJLJLJ = requireViewById(R.id.ca6);
        if (LLJJIJIIJIL(audioRecorderParam)) {
            View view = this.LJLJLJ;
            if (view != null) {
                view.setVisibility(8);
            }
            LLJJJIL().LJ(new C150145us(true, false, 14));
            LLJJJIL().LJIIZILJ(0);
            LinearLayout linearLayout = this.LLFZ;
            if (linearLayout != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.d5);
                c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(33));
                Context requireSceneContext = requireSceneContext();
                o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                linearLayout.setBackground(c110614Vt.LIZ(requireSceneContext));
                LinearLayout linearLayout2 = this.LLFZ;
                if (linearLayout2 != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(72)));
                    marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(72)));
                    marginLayoutParams.width = -2;
                    LinearLayout linearLayout3 = this.LLFZ;
                    if (linearLayout3 != null) {
                        linearLayout3.setLayoutParams(marginLayoutParams);
                        return;
                    } else {
                        o.LJIJI("addRecordLayout2");
                        throw null;
                    }
                }
                o.LJIJI("addRecordLayout2");
                throw null;
            }
            o.LJIJI("addRecordLayout2");
            throw null;
        }
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        LLJJJIL().LJ(new C150145us(false, false, 14));
        LLJJJIL().LJIIZILJ(1);
        LinearLayout linearLayout4 = this.LLFZ;
        if (linearLayout4 != null) {
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.eb);
            c110614Vt2.LIZJ = Float.valueOf(C7MY.LIZIZ(33));
            Context requireSceneContext2 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
            linearLayout4.setBackground(c110614Vt2.LIZ(requireSceneContext2));
            LinearLayout linearLayout5 = this.LLFZ;
            if (linearLayout5 != null) {
                ViewGroup.LayoutParams layoutParams2 = linearLayout5.getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                marginLayoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                marginLayoutParams2.width = -1;
                LinearLayout linearLayout6 = this.LLFZ;
                if (linearLayout6 != null) {
                    linearLayout6.setLayoutParams(marginLayoutParams2);
                    return;
                } else {
                    o.LJIJI("addRecordLayout2");
                    throw null;
                }
            }
            o.LJIJI("addRecordLayout2");
            throw null;
        }
        o.LJIJI("addRecordLayout2");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getEditPreviewApi().sP().observe(this, new AObserverS70S0100000_2(this, 47));
    }

    public C167786iE(C82622Wbi diContainer, C5T9 videoProgressHelper) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(videoProgressHelper, "videoProgressHelper");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = videoProgressHelper;
        this.LJLJI = C221108m2.LIZIZ(C167886iO.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(C168096ij.LJLIL);
        this.LJLJJL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLILLLL = true;
        this.LJLLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLLLL = C221108m2.LIZIZ(C167896iP.LJLIL);
        this.LJZ = UCI.LJI(diContainer, InterfaceC166716gV.class, null);
        this.LJZI = UCI.LJI(diContainer, C5U4.class, null);
        this.LJZL = UCI.LJII(diContainer, InterfaceC162426Za.class, null);
        this.LL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 199));
        this.LLD = C221108m2.LIZIZ(new AqS152S0100000_2(this, 196));
        this.LLII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 197));
        this.LLIIII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 198));
        this.LLIIIL = C61878OQg.INSTANCE;
    }

    public static int LLJJIJIL(Effect effect, List list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (o.LJ(((EffectTemplate) obj).getEffectId(), effect.getEffectId())) {
                    return i;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return -1;
    }

    public final void LLLFF(View view, boolean z) {
        if (getSceneContext() == null) {
            return;
        }
        if (z) {
            if (C44384HbQ.LJLJL(LLJJL())) {
                TuxTextView tuxTextView = this.LLFII;
                if (tuxTextView != null) {
                    tuxTextView.setText(requireSceneContext().getString(R.string.bv9));
                } else {
                    o.LJIJI("addRecordTextView");
                    throw null;
                }
            } else {
                TuxTextView tuxTextView2 = this.LLFII;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(requireSceneContext().getString(R.string.bv7));
                    this.LLIIJI = requireSceneContext().getString(R.string.bv7);
                } else {
                    o.LJIJI("addRecordTextView");
                    throw null;
                }
            }
            view.setVisibility(0);
            return;
        }
        TuxTextView tuxTextView3 = this.LLFII;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(requireSceneContext().getString(R.string.bv9));
            this.LLIIJI = requireSceneContext().getString(R.string.bv9);
            view.setVisibility(8);
            return;
        }
        o.LJIJI("addRecordTextView");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (C81184Vtc.LIZIZ(this.mActivity) * 0.45d);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cc4, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ed, code lost:
    
        if (r21 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJI(final java.lang.Integer r20, com.ss.android.ugc.effectmanager.effect.model.Effect r21, boolean r22, final X.InterfaceC162426Za r23) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167786iE.LLJJIJI(java.lang.Integer, com.ss.android.ugc.effectmanager.effect.model.Effect, boolean, X.6Za):void");
    }
}
