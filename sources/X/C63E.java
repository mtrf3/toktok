package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import Y.ARunnableS5S0201000_2;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.63E, reason: invalid class name */
/* loaded from: classes3.dex */
public class C63E implements InterfaceC143795kd, InterfaceC83564Wqu {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC152085y0 LJLILLLLZI;
    public final InterfaceC143655kP LJLJI;
    public final FrameLayout LJLJJI;
    public final C1545664u LJLJJL;
    public final AnonymousClass655 LJLJJLL;
    public final LiveData<InterfaceC153045zY> LJLJL;
    public final InterfaceC1541063a LJLJLJ;
    public final int LJLJLLL;
    public Rect LJLL;
    public AnonymousClass671 LJLLI;
    public final boolean LJLLILLLL;
    public final EnumC139385dW LJLLJ;
    public final AnonymousClass642 LJLLL;
    public final TTSVoiceModel LJLLLL;
    public final InterfaceC65784Pro<C76800UCe> LJLLLLLL;
    public final C82622Wbi LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public StickerHintTextViewModel LJZL;
    public String LL;
    public TuxTextView LLD;
    public C67P LLF;
    public InterfaceC1542963t LLFF;
    public AnonymousClass688 LLFFF;
    public C1542163l LLFII;
    public InterfaceC88472Yns<? super C67P, C76800UCe> LLFZ;
    public InterfaceC88472Yns<? super C67P, C76800UCe> LLI;
    public AnonymousClass645 LLIFFJFJJ;
    public InterfaceC1543363x LLII;
    public InterfaceC88471Ynr<? super C67P, ? super C67P, C76800UCe> LLIIII;
    public InterfaceC1552467k LLIIIILZ;
    public boolean LLIIIJ;
    public SafeHandler LLIIIL;
    public ARunnableS5S0201000_2 LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public long LLIIL;
    public boolean LLIILII;
    public OSZ<Integer, Integer> LLIILZL;
    public final C139355dT LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public final int LLILIL;
    public boolean LLILL;
    public MutableLiveData<C5MM> LLILLIZIL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    public void LJIJ() {
    }

    public void LJJIIZ() {
    }

    public void LJJIJIL(TextStickerData textStickerData) {
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

    public final void LJII() {
        TextStickerData data;
        TextStickerData Mf0;
        C67P c67p = this.LLF;
        if (c67p == null || (data = c67p.getData()) == null || (Mf0 = LJIIL().Mf0()) == null) {
            return;
        }
        data.setAudioTrackDuration(Mf0.getAudioTrackDuration());
        data.setAudioTrackFilePath(Mf0.getAudioTrackFilePath());
        data.getAudioPathList().addAll(Mf0.getAudioPathList());
        data.setAudioText(Mf0.getAudioText());
        data.setAudioTrackDuration(Mf0.getAudioTrackDuration());
        data.setSpeakerID(Mf0.getSpeakerID());
        data.setAudioTrackIndex(Mf0.getAudioTrackIndex());
        data.setNleUuid(Mf0.getNleUuid());
        data.setHasReadTextAudio(Mf0.getHasReadTextAudio());
        data.setVoiceEffectId(Mf0.getVoiceEffectId());
        data.setVoiceEffectResourceId(Mf0.getVoiceEffectResourceId());
        data.setVoiceAnchorName(Mf0.getVoiceAnchorName());
        data.setVoiceEffectIconUrl(Mf0.getVoiceEffectIconUrl());
        data.setTtsVoiceModel(Mf0.getTtsVoiceModel());
        data.setSpeakerName(Mf0.getSpeakerName());
        data.setVoiceCreatorUserName(Mf0.getVoiceCreatorUserName());
        data.setVoiceCreatorUserId(Mf0.getVoiceCreatorUserId());
        data.setCreatorVoice(Mf0.isCreatorVoice());
        data.setTtsAnchorReleaseDate(Mf0.getTtsAnchorReleaseDate());
        data.setTtsReleaseDate(Mf0.getTtsReleaseDate());
        data.getTtsExtraMap().clear();
        data.getTtsExtraMap().putAll(Mf0.getTtsExtraMap());
    }

    public final SafeHandler LJIIJJI() {
        SafeHandler safeHandler = this.LLIIIL;
        if (safeHandler != null) {
            return safeHandler;
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    public final C63D LJIIL() {
        return (C63D) this.LJZ.getValue();
    }

    public final List<TextStickerTextWrap> LJIILIIL() {
        List<TextStickerTextWrap> textWrapList = this.LJLJJL.getTextWrapList();
        o.LJIIIIZZ(textWrapList, "inputLayout.textWrapList");
        return textWrapList;
    }

    public void LJIILJJIL() {
        final C63D textStickerApi = LJIIL();
        o.LJIIIIZZ(textStickerApi, "textStickerApi");
        this.LJLILLLLZI.LIZIZ(new C6V4(200, new WXC(textStickerApi) { // from class: X.63S
            public final C63D LIZ;

            {
                this.LIZ = textStickerApi;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJJIIZI(MotionEvent event) {
                o.LJIIIZ(event, "event");
                return this.LIZ.LJJIIZI(event);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJJIZ(float f) {
                return this.LIZ.LJJIZ(f);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJLI(C82537WaL detector) {
                o.LJIIIZ(detector, "detector");
                return this.LIZ.LJLI(detector);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJLJI(float f) {
                return this.LIZ.LJLJI(f);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LLLLLLLZIL(C82536WaK detector) {
                o.LJIIIZ(detector, "detector");
                return this.LIZ.LLLLLLLZIL(detector);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onDown(MotionEvent event) {
                o.LJIIIZ(event, "event");
                return this.LIZ.onDown(event);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onScale(ScaleGestureDetector scaleFactor) {
                o.LJIIIZ(scaleFactor, "scaleFactor");
                return this.LIZ.onScale(scaleFactor);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onScaleBegin(ScaleGestureDetector scaleFactor) {
                o.LJIIIZ(scaleFactor, "scaleFactor");
                return this.LIZ.onScaleBegin(scaleFactor);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onSingleTapConfirmed(MotionEvent e) {
                o.LJIIIZ(e, "e");
                return this.LIZ.onSingleTapConfirmed(e);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJJLIL(C82537WaL detector, float f, float f2) {
                o.LJIIIZ(detector, "detector");
                return this.LIZ.LJJLIL(detector, f, f2);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
                o.LJIIIZ(e1, "e1");
                o.LJIIIZ(e2, "e2");
                return this.LIZ.onFling(e1, e2, f, f2);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
                o.LJIIIZ(e1, "e1");
                o.LJIIIZ(e2, "e2");
                return this.LIZ.onScroll(e1, e2, f, f2);
            }
        }));
    }

    public void LJIILL() {
        this.LLIFFJFJJ = new AnonymousClass645() { // from class: X.63j
            @Override // X.AnonymousClass645
            public final void dismiss() {
                TextStickerData data;
                TextStickerData data2;
                C63E c63e = C63E.this;
                C67P c67p = c63e.LLF;
                if (c67p != null) {
                    AnonymousClass642 anonymousClass642 = c63e.LJLLL;
                    if (anonymousClass642 != null) {
                        boolean gY = c63e.LJIIL().gY();
                        if (anonymousClass642.LIZJ) {
                            if (!gY) {
                                c67p.setCenterY(anonymousClass642.LIZ);
                                c67p.setCenterX(anonymousClass642.LIZIZ);
                                float f = anonymousClass642.LIZIZ;
                                float f2 = anonymousClass642.LIZ;
                                C67Z c67z = c67p.LJZ;
                                c67z.LJIIIIZZ = f;
                                c67z.LJIIIZ = f2;
                                anonymousClass642.LIZ = 0.0f;
                                anonymousClass642.LIZIZ = 0.0f;
                                anonymousClass642.LIZJ = false;
                            } else {
                                TextStickerData data3 = c67p.getData();
                                if (data3 != null) {
                                    c67p.post(new ARunnableS21S0200000_2(data3, c67p, 36));
                                }
                            }
                        }
                    }
                    if (c63e.LLILLL && (data2 = c67p.getData()) != null && data2.getHasReadTextAudio()) {
                        c63e.LLILLL = false;
                    }
                    if (!(c67p instanceof C67Q) && c63e.LLILLL && !c63e.LJIIL().gY() && !c63e.LJIIL().K60() && (((data = c67p.getData()) == null || !data.getHasReadTextAudio()) && AnonymousClass699.LIZIZ().LIZIZ.LJLJL && (AnonymousClass699.LIZIZ().LIZIZ.LJLILLLLZI || AnonymousClass699.LIZIZ().LIZIZ.LJLJI))) {
                        c63e.LLILLL = false;
                        c67p.postDelayed(new ARunnableS38S0100000_2(c67p, 128), 200L);
                    }
                }
                if (!C63E.this.LJIIL().gY() && !C63E.this.LJIIL().K60()) {
                    C63E.this.LJIIL().LLILLJJLI().LJII(new OSZ<>(Boolean.TRUE, Boolean.FALSE));
                }
                C63E.this.LJJIII();
                C63E.this.LJIIL().xS(false, C63E.this.LLF);
            }

            @Override // X.AnonymousClass645
            public final void show() {
                AnonymousClass642 anonymousClass642;
                TextStickerData data;
                C63E c63e = C63E.this;
                C67P c67p = c63e.LLF;
                if (c67p != null && (anonymousClass642 = c63e.LJLLL) != null) {
                    c63e.LJIIL().gY();
                    if (!anonymousClass642.LIZJ && (data = c67p.getData()) != null) {
                        anonymousClass642.LIZ = c67p.getCenterY();
                        anonymousClass642.LIZIZ = c67p.getCenterX();
                        c67p.setCenterY(c67p.LJII(data.getEditCenterPoint().x, data.getEditCenterPoint().y).y);
                        c67p.setCenterX(c67p.LJII(data.getEditCenterPoint().x, data.getEditCenterPoint().y).x);
                        anonymousClass642.LIZJ = true;
                    }
                }
                C63E c63e2 = C63E.this;
                if (c63e2.LLF == null) {
                    c63e2.LJLJJL.LJIJ();
                }
                C29901Fi<OSZ<Boolean, Boolean>> LLILLJJLI = C63E.this.LJIIL().LLILLJJLI();
                Boolean bool = Boolean.FALSE;
                LLILLJJLI.LJII(new OSZ<>(bool, bool));
                C63E.this.LJJIIJ(false);
                C63E.this.LJIIL().xS(true, C63E.this.LLF);
            }
        };
        this.LLFII = new C1542163l(this);
        final C1545664u c1545664u = this.LJLJJL;
        c1545664u.setInputLayoutShowListener(new AnonymousClass645() { // from class: X.63M
            @Override // X.AnonymousClass645
            public final void dismiss() {
                TextStickerData data;
                MutableLiveData<Integer> fc0;
                C67P c67p = C63E.this.LLF;
                if (c67p != null) {
                    c67p.LJI();
                }
                c1545664u.LJIILIIL();
                InterfaceC143655kP interfaceC143655kP = C63E.this.LJLJI;
                if (interfaceC143655kP != null && (fc0 = interfaceC143655kP.fc0()) != null) {
                    fc0.setValue(-1);
                }
                C67P c67p2 = C63E.this.LLF;
                if (c67p2 != null && (data = c67p2.getData()) != null) {
                    C63E c63e = C63E.this;
                    C1545664u c1545664u2 = c1545664u;
                    c63e.getClass();
                    if (!C63E.LJFF(c1545664u2, data)) {
                        if (data.getTtsVoiceModel() != null) {
                            TTSVoiceModel ttsVoiceModel = data.getTtsVoiceModel();
                            o.LJI(ttsVoiceModel);
                            if (TextUtils.isEmpty(ttsVoiceModel.getEffectId()) || data.getAutoAddTtsFlag()) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    c63e.LJIJI(c1545664u2, data, C68W.LJII(c1545664u2.getTextWrapList()));
                }
            }

            @Override // X.AnonymousClass645
            public final void show() {
                MutableLiveData<Integer> fc0;
                AnonymousClass645 anonymousClass645 = C63E.this.LLIFFJFJJ;
                if (anonymousClass645 != null) {
                    anonymousClass645.show();
                }
                InterfaceC143655kP interfaceC143655kP = C63E.this.LJLJI;
                if (interfaceC143655kP == null || (fc0 = interfaceC143655kP.fc0()) == null) {
                    return;
                }
                fc0.setValue(3);
            }
        });
        c1545664u.setTextStickerUpdateListener(new InterfaceC1546465c() { // from class: X.63y
            @Override // X.InterfaceC1546465c
            public final void LIZ() {
                C1545664u.this.LJIILIIL();
            }
        });
        c1545664u.setVisibleController(new InterfaceC156716Db() { // from class: X.63m
            @Override // X.InterfaceC156716Db
            public final void LIZ() {
                c1545664u.LJIILIIL();
            }

            @Override // X.InterfaceC156716Db
            public final void LIZIZ() {
                C63E c63e = C63E.this;
                c63e.LJJIJ(c63e.LLF, null);
            }
        });
    }

    public final void LJJIJIIJIL() {
        int[] LJJIJLIJ;
        Rect rect;
        boolean z;
        View contentView;
        OSZ<Integer, Integer> osz = this.LLIILZL;
        if (osz == null || osz.getFirst().intValue() == 0 || osz.getSecond().intValue() == 0) {
            return;
        }
        InterfaceC1541063a interfaceC1541063a = this.LJLJLJ;
        if (interfaceC1541063a != null && !interfaceC1541063a.LIZJ()) {
            LJJIJLIJ = new int[]{0, 0};
        } else {
            InterfaceC1541063a interfaceC1541063a2 = this.LJLJLJ;
            if (interfaceC1541063a2 == null || (LJJIJLIJ = interfaceC1541063a2.LJFF(this.LJLJJI)) == null) {
                LJJIJLIJ = V3N.LJJIJLIJ(osz.getFirst().intValue(), osz.getSecond().intValue(), this.LJLJJI);
            }
        }
        this.LLIIJI = LJJIJLIJ[0];
        this.LLIIJLIL = LJJIJLIJ[1];
        ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
        InterfaceC1541063a interfaceC1541063a3 = this.LJLJLJ;
        if (interfaceC1541063a3 != null && !interfaceC1541063a3.LIZJ()) {
            rect = new Rect(0, 0, osz.getFirst().intValue(), osz.getSecond().intValue());
        } else {
            rect = new Rect(0, 0, layoutParams.width, layoutParams.height);
        }
        this.LJLL = rect;
        InterfaceC1541063a interfaceC1541063a4 = this.LJLJLJ;
        if (interfaceC1541063a4 != null && !interfaceC1541063a4.LIZLLL()) {
            z = true;
        } else {
            z = false;
        }
        AnonymousClass671 anonymousClass671 = null;
        if (z) {
            this.LJLLI = null;
            return;
        }
        InterfaceC1541063a interfaceC1541063a5 = this.LJLJLJ;
        if (interfaceC1541063a5 != null && !interfaceC1541063a5.LIZJ()) {
            return;
        }
        AnonymousClass671 anonymousClass6712 = this.LJLLI;
        if (anonymousClass6712 != null && (contentView = anonymousClass6712.getContentView()) != null && contentView.getParent() != null) {
            ViewParent parent = contentView.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(contentView, (ViewGroup) parent);
        }
        InterfaceC150675vj interfaceC150675vj = C6PB.LIZLLL().LIZLLL;
        if (interfaceC150675vj != null) {
            anonymousClass671 = interfaceC150675vj.LIZLLL(this.LLIIJI, this.LJLIL);
        }
        this.LJLLI = anonymousClass671;
        if (anonymousClass671 == null) {
            return;
        }
        this.LJLJJI.addView(anonymousClass671.getContentView());
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle bindLifecycle = (Lifecycle) this.LJZI.getValue();
        o.LJIIIIZZ(bindLifecycle, "bindLifecycle");
        return bindLifecycle;
    }

    public int LJIIJ() {
        if (C68M.LJIIJ().LIZJ() > 0) {
            return C68M.LJIIJ().LIZJ();
        }
        return 28;
    }

    public void LJIIZILJ() {
        StickerHintTextViewModel stickerHintTextViewModel;
        MutableLiveData<C5MM> mutableLiveData;
        InterfaceC1541063a interfaceC1541063a;
        LiveData<C76800UCe> kn0;
        C68M.LJIIJ().LJIJ(this.LJLJJI.getContext());
        WM7 LJI = C78598Ut0.LJI(this.LJLJJI);
        ActivityC45651qj activityC45651qj = this.LJLIL;
        LJIIL().h6(this.LJLLILLLL);
        if (this.LL != null) {
            if (LJI != null) {
                ViewModelProvider LJIIIIZZ = C165706es.LJIIIIZZ(LJI, null, null, 6);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LL);
                LIZ.append('-');
                LIZ.append(C16880lQ.LJLLILLLL(StickerHintTextViewModel.class));
                stickerHintTextViewModel = (StickerHintTextViewModel) LJIIIIZZ.get(X1D.LIZIZ(LIZ), StickerHintTextViewModel.class);
            } else {
                ViewModelProvider of = ViewModelProviders.of(activityC45651qj);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.LL);
                LIZ2.append('-');
                LIZ2.append(C16880lQ.LJLLILLLL(StickerHintTextViewModel.class));
                stickerHintTextViewModel = (StickerHintTextViewModel) of.get(X1D.LIZIZ(LIZ2), StickerHintTextViewModel.class);
            }
        } else if (LJI != null) {
            stickerHintTextViewModel = (StickerHintTextViewModel) C165706es.LJIIIIZZ(LJI, null, null, 6).get(StickerHintTextViewModel.class);
        } else {
            stickerHintTextViewModel = (StickerHintTextViewModel) ViewModelProviders.of(activityC45651qj).get(StickerHintTextViewModel.class);
        }
        this.LJZL = stickerHintTextViewModel;
        this.LLIIIL = new SafeHandler(this);
        LJIILJJIL();
        new C83547Wqd(this.LJLIL, null).LIZIZ(this);
        AnonymousClass655 anonymousClass655 = this.LJLJJLL;
        if (anonymousClass655 != null) {
            anonymousClass655.LJJJJJ();
        }
        InterfaceC143655kP interfaceC143655kP = this.LJLJI;
        if (interfaceC143655kP != null) {
            mutableLiveData = interfaceC143655kP.DM();
        } else {
            mutableLiveData = null;
        }
        this.LLILLIZIL = mutableLiveData;
        LJIIL().Jy().observe(this, new AObserverS70S0100000_2(this, 214));
        LJIIL().ou().LIZLLL(this, new AObjectS84S0100000_2(this, 231));
        LJIIL().Bd0().LIZLLL(this, new AObjectS84S0100000_2(this, 244));
        LJIIL().hK().LIZLLL(this, new AObjectS84S0100000_2(this, LiveCoverMinSizeSetting.DEFAULT));
        LJIIL().Ba0().LIZLLL(this, new AObjectS84S0100000_2(this, 252));
        LJIIL().ud().LIZLLL(this, new AObjectS84S0100000_2(this, 254));
        LJIIL().Ua().LIZLLL(this, new AObjectS84S0100000_2(this, 255));
        LJIIL().eC().LIZLLL(this, new AObjectS84S0100000_2(this, 257));
        LJIIL().Vh0().LIZLLL(this, new AObjectS84S0100000_2(this, 259));
        LJIIL().fh0().LIZLLL(this, new AObjectS84S0100000_2(this, 237));
        LJIIL().tE().LIZLLL(this, new AObjectS84S0100000_2(this, 238));
        LJIIL().T30().LIZLLL(this, new AObjectS84S0100000_2(this, 239));
        LJIIL().eM().LIZLLL(this, new AObjectS84S0100000_2(this, 241));
        LJIIL().Od().LIZLLL(this, new AObjectS84S0100000_2(this, 243));
        LJIIL().pk0().LIZLLL(this, new AObjectS84S0100000_2(this, 245));
        LJIIL().QH().LIZLLL(this, new AObjectS84S0100000_2(this, 247));
        LJIIL().Gj0().LIZLLL(this, new AObjectS84S0100000_2(this, 249));
        LJIIL().AM().LIZLLL(this, new AObjectS84S0100000_2(this, 251));
        LJIIL().l00().LIZLLL(this, new AObjectS84S0100000_2(this, 253));
        LJIIL().cb().LIZLLL(this, new AObjectS84S0100000_2(this, 256));
        LJIIL().iX().LIZLLL(this, new AObjectS84S0100000_2(this, 258));
        LJIIL().ae0().LIZLLL(this, new AObjectS84S0100000_2(this, 260));
        LJIIL().q20().LIZLLL(this, new AObjectS84S0100000_2(this, 261));
        LJIIL().Yi0().LIZLLL(this, new AObjectS84S0100000_2(this, 262));
        LJIIL().wa0().LIZLLL(this, new AObjectS84S0100000_2(this, 263));
        LJIIL().ol().LIZLLL(this, new AObjectS84S0100000_2(this, 264));
        LJIIL().Jo().LIZLLL(this, new AObjectS84S0100000_2(this, 265));
        LJIIL().b4().LIZLLL(this, new AObjectS84S0100000_2(this, 266));
        LJIIL().ev0().LIZLLL(this, new AObjectS84S0100000_2(this, 267));
        LJIIL().nV().LIZLLL(this, new AObjectS84S0100000_2(this, 232));
        LJIIL().fZ().LIZLLL(this, new AObjectS84S0100000_2(this, 233));
        LJIIL().mp().LIZLLL(this, new AObjectS84S0100000_2(this, 234));
        LJIIL().cl0().LIZLLL(this, new AObjectS84S0100000_2(this, 235));
        LJIIL().un().LIZLLL(this, new AObjectS84S0100000_2(this, 236));
        InterfaceC143655kP interfaceC143655kP2 = this.LJLJI;
        if (interfaceC143655kP2 != null && (kn0 = interfaceC143655kP2.kn0()) != null) {
            kn0.observe(this, new AObserverS70S0100000_2(this, 212));
        }
        LJIIL().Qc().observe(this, new AObserverS70S0100000_2(this, 213));
        TextWatcher RB = LJIIL().RB();
        if (RB != null) {
            this.LJLJJL.LJLJI.addTextChangedListener(RB);
        }
        LJIIL().c0().LIZLLL(this, new AObjectS84S0100000_2(this, 240));
        LJIIL().i4().LIZLLL(this, new AObjectS84S0100000_2(this, 242));
        LJIIL().fF().LIZLLL(this, new AObjectS84S0100000_2(this, 246));
        LJIIL().kk0().LIZLLL(this, new AObjectS84S0100000_2(this, 248));
        LJIILL();
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && ((interfaceC1541063a = this.LJLJLJ) == null || interfaceC1541063a.LJ())) {
            LJIL(null);
        }
        this.LLIIIZ = new ARunnableS5S0201000_2(this, 2);
    }

    public boolean LJIJJ() {
        return C138575cD.LIZ();
    }

    public final void LJJ() {
        LJIIL().gp();
        boolean z = false;
        if (C00F.LIZ(31744, 0, "studio_use_thread_save_list_for_sticker", true) == 1) {
            z = true;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (C67P c67p : LJIIL().Va0()) {
                if (C1JI.LJIL(c67p)) {
                    arrayList.add(c67p);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C67P c67p2 = (C67P) it.next();
                if (LJIIL().Hi().contains(c67p2)) {
                    LJJI(c67p2);
                    LJIIL().Hi().remove(c67p2);
                }
            }
            if (LJIIL().Hi().size() <= 0) {
                this.LLF = null;
                return;
            }
            return;
        }
        Iterator<C67P> kM = LJIIL().kM();
        while (kM.hasNext()) {
            C67P next = kM.next();
            if (C1JI.LJIL(next)) {
                kM.remove();
                LJJI(next);
            }
        }
        if (!kM.hasNext()) {
            this.LLF = null;
        }
    }

    public final void LJJIII() {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        if (LJIIL().Zu0() && (tuxTextView2 = this.LLD) != null && tuxTextView2.getVisibility() == 8) {
            TuxTextView tuxTextView3 = this.LLD;
            if (tuxTextView3 == null) {
                return;
            }
            tuxTextView3.setVisibility(0);
            return;
        }
        TuxTextView tuxTextView4 = this.LLD;
        if (tuxTextView4 == null || tuxTextView4.getVisibility() != 0 || (tuxTextView = this.LLD) == null) {
            return;
        }
        tuxTextView.setVisibility(8);
    }

    public boolean LJJIIZI() {
        return this.LLIL;
    }

    public final void LIZLLL(C67P c67p) {
        if (c67p == null) {
            return;
        }
        if (this.LJLJJI.getChildCount() > 1) {
            FrameLayout frameLayout = this.LJLJJI;
            if (frameLayout.getChildAt(frameLayout.getChildCount() - 1) != c67p) {
                C16880lQ.LJLLLL(c67p, this.LJLJJI);
                this.LJLJJI.addView(c67p);
            }
        }
        C67P mS = LJIIL().mS();
        if (mS != c67p) {
            LJIIL().f80(c67p);
            if (mS == null) {
                return;
            }
        }
        InterfaceC88471Ynr<? super C67P, ? super C67P, C76800UCe> interfaceC88471Ynr = this.LLIIII;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(mS, c67p);
        }
    }

    public final void LJI(C67P c67p) {
        if (c67p != null) {
            TextStickerData data = c67p.getData();
            if (data != null && data.getHasReadTextAudio() && !o.LJ(data.getAudioText(), C68W.LJII(data.getTextWrapList())) && AnonymousClass699.LIZIZ().LIZIZ.LJLJI) {
                LJIJI(this.LJLJJL, data, C68W.LJII(data.getTextWrapList()));
                return;
            }
            return;
        }
        TextStickerData Mf0 = LJIIL().Mf0();
        if (Mf0 == null) {
            return;
        }
        LJJIFFI(Mf0);
    }

    public C67P LJIIIZ(TextStickerData textStickerData) {
        boolean z = false;
        if (textStickerData != null && textStickerData.isCaption()) {
            z = true;
        }
        C67P c67p = new C67P(this.LJLIL, LJIIJJI(), textStickerData, !z, new C68K() { // from class: X.63z
            @Override // X.C68K
            public final boolean LIZ() {
                return C63E.this.LJIIL().LJIIIIZZ();
            }
        }, Boolean.TRUE, this.LJLZ);
        c67p.LLIFFJFJJ = this.LLII;
        c67p.LLII = LJIIL().LLLLILI();
        return c67p;
    }

    public boolean LJIILLIIL(List<TextStickerTextWrap> list) {
        return C68W.LJIILIIL(list);
    }

    public void LJIJJLI(TTSVoiceModel tTSVoiceModel) {
        String placeholderSlotId;
        LiveData<InterfaceC153045zY> liveData;
        InterfaceC153045zY value;
        List<TextStickerTextWrap> LJIILIIL = LJIILIIL();
        if (LJIILLIIL(LJIILIIL)) {
            LIZJ(LJIILIIL, tTSVoiceModel);
            LJII();
            LJI(this.LLF);
        } else {
            C67P c67p = this.LLF;
            if (c67p != null) {
                C16880lQ.LJLLLL(c67p, this.LJLJJI);
                TextStickerData data = c67p.getData();
                if (data != null && (placeholderSlotId = data.getPlaceholderSlotId()) != null && !ujb.o.LJJJJJL(placeholderSlotId) && (liveData = this.LJLJL) != null && (value = liveData.getValue()) != null) {
                    C122034qd LJJI = C17N.LJJI(value);
                    if (LJJI != null) {
                        LJJI.LJIIIIZZ().LJIL(placeholderSlotId);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                LJIIL().K4(c67p);
            }
            LJII();
            LJI(this.LLF);
            this.LLF = null;
        }
        this.LLIILII = false;
    }

    public final void LJIL(InfoStickerModel infoStickerModel) {
        List<StickerItemModel> list;
        InterfaceC153045zY value;
        VESize LLILZ;
        OSZ<Integer, Integer> osz;
        List<StickerItemModel> list2;
        this.LLILLJJLI = true;
        boolean z = !LJIIL().LJJL();
        if (z) {
            LJIIL().gp();
        }
        Integer num = null;
        if (infoStickerModel == null) {
            InterfaceC1541063a interfaceC1541063a = this.LJLJLJ;
            if (interfaceC1541063a != null) {
                infoStickerModel = interfaceC1541063a.LIZ();
            } else {
                infoStickerModel = null;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditTextStickerScene -> reloadTextStickerDatatargetInfoStickerModel?.stickers.size = ");
        if (infoStickerModel != null && (list2 = infoStickerModel.stickers) != null) {
            num = Integer.valueOf(list2.size());
        }
        LIZ.append(num);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            Iterator it = new ArrayList(list).iterator();
            o.LJIIIIZZ(it, "ArrayList<StickerItemModel>(stickers).iterator()");
            boolean z2 = false;
            while (it.hasNext()) {
                Object next = it.next();
                o.LJIIIIZZ(next, "it.next()");
                StickerItemModel stickerItemModel = (StickerItemModel) next;
                if (stickerItemModel.type == 2) {
                    if (z) {
                        if (!z2) {
                            InterfaceC1541063a interfaceC1541063a2 = this.LJLJLJ;
                            if (interfaceC1541063a2 == null || (osz = interfaceC1541063a2.LJI()) == null) {
                                LiveData<InterfaceC153045zY> liveData = this.LJLJL;
                                if (liveData != null && (value = liveData.getValue()) != null && (LLILZ = value.LLILZ()) != null) {
                                    osz = new OSZ<>(Integer.valueOf(LLILZ.width), Integer.valueOf(LLILZ.height));
                                }
                                z2 = true;
                            }
                            if (this.LLIILZL == null) {
                                this.LLIILZL = osz;
                                LJJIJIIJIL();
                            }
                            z2 = true;
                        }
                        TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C6PB.LIZIZ(), stickerItemModel.extra, TextStickerData.class);
                        if (textStickerData != null) {
                            LJIIL().AZ(textStickerData);
                            if (o.LJ(textStickerData.getType(), "type_inline_caption")) {
                                textStickerData.setAddToLayout(false);
                                LJIIL().vX(textStickerData);
                            } else {
                                LJIIL().c8(textStickerData, true);
                            }
                        }
                    }
                    infoStickerModel.removeSticker(stickerItemModel);
                }
            }
            LJIIL().ao(false);
            LJIIL().py().LJII(Boolean.valueOf(z));
            if (!z) {
                LJIIL().T3();
            }
        }
    }

    public final void LJJI(C67P c67p) {
        InterfaceC153045zY value;
        C16880lQ.LJLLLL(c67p, this.LJLJJI);
        InterfaceC1542963t interfaceC1542963t = this.LLFF;
        if (interfaceC1542963t != null) {
            interfaceC1542963t.K4(c67p);
        }
        TextStickerData data = c67p.getData();
        if (data != null && data.getNleUuid().length() > 0) {
            LiveData<InterfaceC153045zY> liveData = this.LJLJL;
            if (liveData != null && (value = liveData.getValue()) != null) {
                C122034qd LJJI = C17N.LJJI(value);
                if (LJJI != null) {
                    InterfaceC123794tT LJFF = LJJI.LJFF();
                    C122004qa c122004qa = new C122004qa(EnumC122254qz.TEXT_SPEAK);
                    c122004qa.LIZIZ = data.getNleUuid();
                    LJFF.LJFF(c122004qa);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            data.setNleUuid("");
            data.setHasReadTextAudio(false);
        }
    }

    public final void LJJIFFI(TextStickerData textStickerData) {
        InterfaceC153045zY value;
        LiveData<InterfaceC153045zY> liveData = this.LJLJL;
        if (liveData != null && (value = liveData.getValue()) != null && textStickerData.getHasReadTextAudio() && textStickerData.getNleUuid().length() > 0) {
            C122034qd LJJI = C17N.LJJI(value);
            if (LJJI != null) {
                InterfaceC123794tT LJFF = LJJI.LJFF();
                C122004qa c122004qa = new C122004qa(EnumC122254qz.TEXT_SPEAK);
                c122004qa.LIZIZ = textStickerData.getNleUuid();
                LJFF.LJFF(c122004qa);
                textStickerData.setHasReadTextAudio(false);
                textStickerData.setNleUuid("");
                textStickerData.setAudioTrackFilePath(null);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LJJII(C67P c67p) {
        Integer num;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        InterfaceC153045zY value;
        boolean z;
        LiveData<InterfaceC153045zY> liveData;
        InterfaceC153045zY value2;
        InterfaceC153045zY value3;
        InterfaceC153045zY value4;
        if (c67p == null) {
            return;
        }
        LiveData<InterfaceC153045zY> liveData2 = this.LJLJL;
        Integer num2 = null;
        if (liveData2 != null && (value4 = liveData2.getValue()) != null) {
            num = Integer.valueOf(value4.getDuration());
        } else {
            num = null;
        }
        C16880lQ.LJLLLL(c67p, this.LJLJJI);
        LJIIL().K4(c67p);
        this.LLF = null;
        InterfaceC1542963t interfaceC1542963t = this.LLFF;
        if (interfaceC1542963t != null) {
            interfaceC1542963t.K4(c67p);
        }
        TextStickerData data = c67p.getData();
        if (data != null) {
            if (data.getNleUuid().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LiveData<InterfaceC153045zY> liveData3 = this.LJLJL;
                if (liveData3 != null && (value3 = liveData3.getValue()) != null) {
                    C122034qd LJJI = C17N.LJJI(value3);
                    if (LJJI != null) {
                        InterfaceC123794tT LJFF = LJJI.LJFF();
                        C122004qa c122004qa = new C122004qa(EnumC122254qz.TEXT_SPEAK);
                        c122004qa.LIZIZ = data.getNleUuid();
                        LJFF.LJFF(c122004qa);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                data.setNleUuid("");
                data.setHasReadTextAudio(false);
            }
            String placeholderSlotId = data.getPlaceholderSlotId();
            if (placeholderSlotId != null && !ujb.o.LJJJJJL(placeholderSlotId) && (liveData = this.LJLJL) != null && (value2 = liveData.getValue()) != null) {
                C122034qd LJJI2 = C17N.LJJI(value2);
                if (LJJI2 != null) {
                    LJJI2.LJIIIIZZ().LJIL(placeholderSlotId);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        LiveData<InterfaceC153045zY> liveData4 = this.LJLJL;
        if (liveData4 != null && (value = liveData4.getValue()) != null) {
            num2 = Integer.valueOf(value.getDuration());
        }
        if (!o.LJ(num2, num) && (interfaceC65784Pro = this.LJLLLLLL) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public final void LJJIIJ(boolean z) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        if (z) {
            TuxTextView tuxTextView3 = this.LLD;
            if (tuxTextView3 == null || tuxTextView3.getVisibility() != 8 || (tuxTextView2 = this.LLD) == null) {
                return;
            }
            tuxTextView2.setVisibility(0);
            return;
        }
        TuxTextView tuxTextView4 = this.LLD;
        if (tuxTextView4 == null || tuxTextView4.getVisibility() != 0 || (tuxTextView = this.LLD) == null) {
            return;
        }
        tuxTextView.setVisibility(8);
    }

    public void LJJIIJZLJL(C67P c67p) {
        c67p.setOnEditClickListener(new InterfaceC1552467k() { // from class: X.63N
            @Override // X.InterfaceC1552467k
            public final float LIZ(float f) {
                AnonymousClass671 anonymousClass671 = C63E.this.LJLLI;
                if (anonymousClass671 != null) {
                    return anonymousClass671.LJIIJ(f);
                }
                return f;
            }

            @Override // X.InterfaceC1552467k
            public final void LIZIZ(C67P textStickerView) {
                o.LJIIIZ(textStickerView, "textStickerView");
                C63E.this.LLIIZ.LIZIZ(true);
                C63E.this.LJIIL().LIZLLL();
                InterfaceC88472Yns<? super C67P, C76800UCe> interfaceC88472Yns = C63E.this.LLI;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(textStickerView);
                }
            }

            @Override // X.InterfaceC1552467k
            public final void LJ(C67P textStickerView) {
                String str;
                o.LJIIIZ(textStickerView, "textStickerView");
                if (C1JI.LJIL(textStickerView)) {
                    C63E.this.LJJ();
                    C63E.this.LJIIL().Vy().LJII(Boolean.FALSE);
                    C63E.this.LJIIL().yi0();
                    return;
                }
                TextStickerData data = textStickerView.getData();
                if (data != null && data.getTtsVoiceModel() != null) {
                    str = "auto";
                } else {
                    str = "user_click";
                }
                C63E.this.LJJII(textStickerView);
                InterfaceC1543363x interfaceC1543363x = C63E.this.LLII;
                if (interfaceC1543363x != null) {
                    interfaceC1543363x.LJ(textStickerView.LJLLILLLL ? 1 : 0, "click_cross", str);
                }
                StickerHintTextViewModel stickerHintTextViewModel = C63E.this.LJZL;
                if (stickerHintTextViewModel != null) {
                    stickerHintTextViewModel.gv0().postValue(Boolean.TRUE);
                } else {
                    o.LJIJI("hintTextViewModel");
                    throw null;
                }
            }

            @Override // X.InterfaceC1552467k
            public final void LJI(C67P view) {
                o.LJIIIZ(view, "view");
                InterfaceC1543363x interfaceC1543363x = C63E.this.LLII;
                if (interfaceC1543363x != null) {
                    interfaceC1543363x.LIZIZ();
                }
            }

            @Override // X.InterfaceC1552467k
            public final void LJII(C67P textStickerView) {
                o.LJIIIZ(textStickerView, "textStickerView");
                C63E.this.LJIIL().LIZLLL();
                InterfaceC88472Yns<? super C67P, C76800UCe> interfaceC88472Yns = C63E.this.LLFZ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(textStickerView);
                }
            }

            @Override // X.InterfaceC1552467k
            public final void LJIIIZ(C67P stickerView) {
                InterfaceC143655kP interfaceC143655kP;
                MutableLiveData<C5MM> DM;
                o.LJIIIZ(stickerView, "stickerView");
                C63E.this.LLILL = false;
                if (C1JI.LJIL(stickerView) && (interfaceC143655kP = C63E.this.LJLJI) != null && (DM = interfaceC143655kP.DM()) != null) {
                    DM.setValue(C5MM.LIZJ());
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
            
                if (r5 != 4) goto L28;
             */
            @Override // X.InterfaceC1552467k
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(X.C67P r8, android.graphics.RectF r9, X.C1541163b r10) {
                /*
                    Method dump skipped, instructions count: 257
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C63N.LIZJ(X.67P, android.graphics.RectF, X.63b):void");
            }

            @Override // X.InterfaceC1552467k
            public final void LIZLLL(C67P textStickerView, boolean z, Integer num) {
                o.LJIIIZ(textStickerView, "textStickerView");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("EditTextStickerScene -> Bubble onEditClick -> isDouble = ");
                LIZ.append(z);
                H7B.LIZ(X1D.LIZIZ(LIZ));
                InterfaceC1552467k interfaceC1552467k = C63E.this.LLIIIILZ;
                if (interfaceC1552467k != null) {
                    interfaceC1552467k.LIZLLL(textStickerView, z, null);
                }
                if (z && !C63E.this.LJIIL().N4().LIZ().booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C63E c63e = C63E.this;
                    if (currentTimeMillis - c63e.LLIIL > 500) {
                        c63e.LJIIIIZZ(textStickerView, num);
                        return;
                    }
                    return;
                }
                if (C1JI.LJIL(textStickerView)) {
                    C1553867y c1553867y = textStickerView.LJLJJI;
                    boolean z2 = textStickerView.LJZI.LJIIIIZZ;
                    c1553867y.LJI = z2;
                    if (z2) {
                        C63E.this.LJIIL().Tt0().LJII(C76800UCe.LIZ);
                        return;
                    }
                }
                C63E c63e2 = C63E.this;
                C1542163l c1542163l = c63e2.LLFII;
                if (c1542163l != null) {
                    c1542163l.LIZ();
                    c63e2.LLF = textStickerView;
                    c63e2.LIZLLL(textStickerView);
                }
                C63E.this.LJIIL().LIZLLL();
            }

            @Override // X.InterfaceC1552467k
            public final int LJFF(C67P view, boolean z, boolean z2) {
                o.LJIIIZ(view, "view");
                AnonymousClass671 anonymousClass671 = C63E.this.LJLLI;
                if (anonymousClass671 == null) {
                    return -1;
                }
                if (z) {
                    anonymousClass671.LJIIJJI();
                    return -1;
                }
                return anonymousClass671.LJI(view.getAnglePointListForBlock(), z2);
            }

            @Override // X.InterfaceC1552467k
            public final PointF LJIIIIZZ(C67P view, float f, float f2) {
                o.LJIIIZ(view, "view");
                AnonymousClass671 anonymousClass671 = C63E.this.LJLLI;
                if (anonymousClass671 != null) {
                    PointF[] pointFS = view.getAnglePointList();
                    o.LJIIIIZZ(pointFS, "pointFS");
                    for (PointF pointF : pointFS) {
                        pointF.x += f;
                        pointF.y += f2;
                    }
                    return anonymousClass671.LIZLLL(pointFS, f, f2);
                }
                return new PointF(0.0f, 0.0f);
            }
        });
    }

    public final void LJJIJIIJI(C67P c67p) {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
        if (!c67p.LJLLJ) {
            List LJJIJ = C47261Igj.LJJIJ(C68W.LIZIZ("", false));
            TextStickerData data = c67p.getData();
            if (data != null) {
                innerEffectTextLayoutConfig = data.getEffectTextLayoutConfig();
            } else {
                innerEffectTextLayoutConfig = null;
            }
            c67p.LJJIII(innerEffectTextLayoutConfig, LJJIJ);
        }
        c67p.setIsGuidanceSticker(false);
        c67p.setWasGuidanceSticker(true);
        TextStickerData data2 = c67p.getData();
        if (data2 != null) {
            data2.setGuidanceSticker(false);
        }
        TextStickerData data3 = c67p.getData();
        if (data3 != null) {
            data3.setTtsVoiceModel(this.LJLLLL);
        }
        C67P QZ = LJIIL().QZ();
        if (QZ != null) {
            QZ.setIsGuidanceSticker(false);
            TextStickerData data4 = QZ.getData();
            if (data4 == null) {
                return;
            }
            data4.setGuidanceSticker(false);
        }
    }

    @Override // X.InterfaceC83564Wqu
    public void keyBoardHide(int i) {
        TTSVoiceModel tTSVoiceModel;
        boolean z;
        TextStickerData data;
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || !this.LLIILII) {
            return;
        }
        this.LJLJJL.LJIIIIZZ();
        C67P c67p = this.LLF;
        if (c67p != null && (data = c67p.getData()) != null) {
            tTSVoiceModel = data.getTtsVoiceModel();
        } else {
            tTSVoiceModel = null;
        }
        LJIJJLI(tTSVoiceModel);
        AnonymousClass645 anonymousClass645 = this.LLIFFJFJJ;
        if (anonymousClass645 != null) {
            anonymousClass645.dismiss();
        }
        if (LJIIL().X1()) {
            LJIIL().Rm0();
        }
        if (LJIIL().gY()) {
            C67P c67p2 = this.LLF;
            if (c67p2 != null) {
                LJIIL().wR(c67p2);
            }
        } else if (LJIIL().K60()) {
            LJIIJJI().postDelayed(new ARunnableS38S0100000_2(this, 129), 50L);
        } else {
            C67P c67p3 = this.LLF;
            if (c67p3 != null) {
                TextStickerData data2 = c67p3.getData();
                if (data2 != null && data2.getHasReadTextAudio()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && AnonymousClass699.LIZIZ().LIZIZ.LJLJI && this.LLIIZ.LIZ.getInt("change_text_toast_shown", 0) < 3 && !c67p3.LJLLL) {
                    c67p3.postDelayed(new ARunnableS21S0200000_2(c67p3, this, 37), 500L);
                }
                TextStickerData data3 = c67p3.getData();
                if (data3 != null && !data3.getHasReadTextAudio() && !AnonymousClass699.LIZIZ().LIZIZ.LJLJL && AnonymousClass699.LIZIZ().LIZIZ.LJLILLLLZI && this.LLIIZ.LIZ.getInt("read_text_toast_shown", 0) < 3 && !c67p3.LJLLL && !C1JI.LJIL(c67p3) && LJJIIZI()) {
                    c67p3.postDelayed(new ARunnableS21S0200000_2(c67p3, this, 38), 500L);
                }
            }
        }
        if (this.LLF == null && o.LJ(LJIIL().fF().LIZJ(), Boolean.FALSE) && !LJIIL().K60()) {
            LJIIL().WI(true);
        }
        C67P c67p4 = this.LLF;
        if (c67p4 != null && C1JI.LJIL(c67p4) && !LJIIL().K60()) {
            LJIIL().WI(true);
            LJIIL().Vy().LJII(Boolean.TRUE);
            if (!this.LJLJJL.LLILZIL) {
                return;
            }
            H7B.LIZ("EditTextStickerScene -> need update all caption sticker's font");
            LJIIL().S10(this.LLF, this.LJLIL);
        }
        C67P c67p5 = this.LLF;
        if ((c67p5 != null && C1JI.LJIL(c67p5)) || !LJIJJ() || LJIIL().K60()) {
            return;
        }
        LJIIL().WI(true);
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardModify(int i) {
        C1545664u c1545664u = this.LJLJJL;
        if (!c1545664u.LJLZ) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c1545664u.LL.getLayoutParams();
            layoutParams.bottomMargin += i;
            c1545664u.LL.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        if (!this.LLIILII) {
            return;
        }
        C67P c67p = this.LLF;
        if (c67p != null) {
            c67p.LJFF();
        }
        this.LJLJJL.LJIL();
        C1545664u c1545664u = this.LJLJJL;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c1545664u.LL.getLayoutParams();
        layoutParams.bottomMargin = i;
        c1545664u.LL.setLayoutParams(layoutParams);
    }

    public static boolean LJFF(C1545664u c1545664u, TextStickerData textStickerData) {
        if (!textStickerData.getHasReadTextAudio() || TextUtils.isEmpty(textStickerData.getAudioText()) || o.LJ(textStickerData.getAudioText(), C68W.LJII(c1545664u.getTextWrapList()))) {
            return false;
        }
        if (textStickerData.getAudioTrackIndex() < 0 && textStickerData.getNleUuid().length() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c8, code lost:
    
        if (r7.LIZLLL(X.FFL.LJIIJ(31744, 5, "highlight_guide_show_count", true), r8) != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63E.LIZ(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData, boolean):void");
    }

    public final void LIZIZ(TextStickerData data, boolean z) {
        o.LJIIIZ(data, "data");
        if (data.isCaption()) {
            data.setEditCenterPoint(new Point(C170576mj.LIZJ(this.LJLIL) / 2, C170576mj.LIZIZ(this.LJLIL) / 2));
            LIZ(data, z);
        } else {
            LIZ(data, z);
        }
    }

    public final void LIZJ(List<TextStickerTextWrap> list, TTSVoiceModel tTSVoiceModel) {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
        C67P c67p = this.LLF;
        if (c67p != null) {
            LJJIJIL(c67p.getData());
            c67p.LJJI(this.LJLJJL.getCurTxtMode(), this.LJLJJL.getCurColor(), this.LJLJJL.getAlignTxt(), C68M.LJIIJ().LIZJ);
            TextStickerData data = c67p.getData();
            if (data != null) {
                List<InlineRichTextStyleData> inlineTextStyleDatas = this.LJLJJL.getInlineTextStyleDatas();
                if (inlineTextStyleDatas == null) {
                    inlineTextStyleDatas = C61878OQg.INSTANCE;
                }
                data.setInlineTextStyles(inlineTextStyleDatas);
            }
            c67p.setFontSize(this.LJLJJL.LJIIJ(LJIIJ()));
            TextStickerData data2 = c67p.getData();
            if (data2 != null) {
                innerEffectTextLayoutConfig = data2.getEffectTextLayoutConfig();
            } else {
                innerEffectTextLayoutConfig = null;
            }
            c67p.LJJIII(innerEffectTextLayoutConfig, list);
            TextStickerData data3 = c67p.getData();
            if (data3 != null) {
                data3.setUseAutoTextSize(this.LJLJJL.LJLJI.LLFZ);
            }
            TextStickerData data4 = c67p.getData();
            if (data4 != null) {
                data4.setHasChangedFontSize(this.LJLJJL.getHasFontSizeChanged());
            }
            TextStickerData data5 = c67p.getData();
            if (data5 != null) {
                data5.setUseColorDropper(this.LJLJJL.LLIIJLIL);
            }
            TextStickerData data6 = c67p.getData();
            if (data6 != null) {
                data6.setAdjustTextRollbar(this.LJLJJL.LLIIL);
            }
            AnonymousClass688 anonymousClass688 = this.LLFFF;
            if (anonymousClass688 != null) {
                anonymousClass688.LIZ(c67p);
                return;
            }
            return;
        }
        if (LJIIL().qV() >= this.LJLJLLL) {
            C6PB.LJ().LIZIZ(R.string.hhd, this.LJLIL);
            return;
        }
        TextStickerData textStickerData = new TextStickerData("", this.LJLJJL.getCurTxtMode(), this.LJLJJL.getCurColor(), this.LJLJJL.getAlignTxt(), C68M.LJIIJ().LIZJ, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32, -1, 1048575, null);
        Point editInputScreenCenterPoint = this.LJLJJL.getEditInputScreenCenterPoint();
        o.LJIIIIZZ(editInputScreenCenterPoint, "inputLayout.editInputScreenCenterPoint");
        textStickerData.setEditCenterPoint(editInputScreenCenterPoint);
        textStickerData.setTextWrapList(list);
        LJJIJIL(textStickerData);
        textStickerData.setFontSize(this.LJLJJL.LJIIJ(LJIIJ()));
        textStickerData.setUseAutoTextSize(this.LJLJJL.LJLJI.LLFZ);
        textStickerData.setHasChangedFontSize(this.LJLJJL.getHasFontSizeChanged());
        textStickerData.setTtsVoiceModel(tTSVoiceModel);
        textStickerData.setUseColorDropper(this.LJLJJL.LLIIJLIL);
        textStickerData.setAdjustTextRollbar(this.LJLJJL.LLIIL);
        List<InlineRichTextStyleData> inlineTextStyleDatas2 = this.LJLJJL.getInlineTextStyleDatas();
        if (inlineTextStyleDatas2 == null) {
            inlineTextStyleDatas2 = C61878OQg.INSTANCE;
        }
        textStickerData.setInlineTextStyles(inlineTextStyleDatas2);
        LIZIZ(textStickerData, false);
    }

    public final void LJIIIIZZ(C67P textStickerView, Integer num) {
        o.LJIIIZ(textStickerView, "textStickerView");
        if (C1JI.LJIL(textStickerView)) {
            H7B.LIZ("EditTextStickerScene -> editTextSticker -> pause video");
            LJIIL().WI(false);
        } else if (LJIJJ()) {
            LJIIL().WI(false);
        }
        LJIIL().o().LJII(Boolean.FALSE);
        this.LLF = textStickerView;
        LJJIJ(textStickerView, num);
        InterfaceC1542963t interfaceC1542963t = this.LLFF;
        if (interfaceC1542963t != null) {
            interfaceC1542963t.LIZ(textStickerView);
        }
        this.LLIIL = System.currentTimeMillis();
        InterfaceC1543363x interfaceC1543363x = this.LLII;
        if (interfaceC1543363x != null) {
            interfaceC1543363x.LIZJ(textStickerView);
        }
    }

    public final void LJJIJ(C67P c67p, Integer num) {
        boolean z;
        String str;
        List<InlineRichTextStyleData> list;
        boolean z2;
        TextStickerData data;
        boolean z3 = false;
        if (LJIJJ()) {
            LJIIL().WI(false);
        }
        this.LLIILII = true;
        if (c67p != null && c67p.LJLLILLLL) {
            LJJIJIIJI(c67p);
            z = true;
        } else {
            z = false;
        }
        InterfaceC1541063a interfaceC1541063a = this.LJLJLJ;
        if (interfaceC1541063a != null && interfaceC1541063a.LIZIZ()) {
            LJIILL();
        }
        this.LJLJJL.setTextStickerView(c67p);
        LJIIL().wC(null);
        if (c67p != null && (data = c67p.getData()) != null && data.getTtsVoiceModel() != null) {
            str = "auto";
        } else {
            str = "user_click";
        }
        if (C138525c8.LIZ()) {
            this.LJLJJL.setColorPickerClickListener(new AnonymousClass656() { // from class: X.63Z
                @Override // X.AnonymousClass656
                public final void LIZ() {
                    C63E.this.LJIIL().uY(true);
                    C63E c63e = C63E.this;
                    if (c63e.LJLIL.isFinishing()) {
                        return;
                    }
                    c63e.LJLJJL.LJIILIIL();
                }
            });
        }
        if (c67p == null) {
            this.LJLJJL.LJJI(LJIIL().Wz(), str, num);
            this.LLF = null;
        } else {
            C1545664u c1545664u = this.LJLJJL;
            List<TextStickerTextWrap> textWrapList = c67p.getTextWrapList();
            TextStickerData data2 = c67p.getData();
            if (data2 == null || (list = data2.getInlineTextStyles()) == null) {
                list = C61878OQg.INSTANCE;
            }
            int curMode = c67p.getCurMode();
            int curColor = c67p.getCurColor();
            int curAlignTxt = c67p.getCurAlignTxt();
            String curFontType = c67p.getCurFontType();
            TextStickerData data3 = c67p.getData();
            o.LJI(data3);
            int fontSize = data3.getFontSize();
            int Wz = LJIIL().Wz();
            TextStickerData data4 = c67p.getData();
            if (data4 != null) {
                z2 = data4.isUseColorDropper();
            } else {
                z2 = false;
            }
            TextStickerData data5 = c67p.getData();
            if (data5 != null) {
                z3 = data5.isAdjustTextRollbar();
            }
            c1545664u.LJJIFFI(textWrapList, list, curMode, curColor, curAlignTxt, curFontType, false, fontSize, Wz, str, num, z2, z3);
        }
        if (z) {
            this.LJLJJL.LJII();
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public final void LJIJI(C1545664u c1545664u, TextStickerData textStickerData, String str) {
        InterfaceC153045zY value;
        InterfaceC153045zY value2;
        if (LJIIL().gY()) {
            return;
        }
        if (!LJFF(c1545664u, textStickerData) && textStickerData.getTtsVoiceModel() != null) {
            LiveData<InterfaceC153045zY> liveData = this.LJLJL;
            if (liveData != null && (value2 = liveData.getValue()) != null) {
                textStickerData.setHasReadTextAudio(false);
                textStickerData.setAutoAddTtsFlag(true);
                textStickerData.setAudioText(null);
                textStickerData.setNleUuid("");
                textStickerData.setAudioTrackIndex(-1);
                textStickerData.setAudioTrackFilePath(null);
                if (AnonymousClass699.LIZIZ().LIZIZ.LJLJI && str.length() > 0) {
                    LJIIL().wk(textStickerData, str);
                    LJIIL().cs0(textStickerData);
                }
                value2.LLJJJIL(textStickerData.getStartTime(), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                value2.play();
                return;
            }
            return;
        }
        LiveData<InterfaceC153045zY> liveData2 = this.LJLJL;
        if (liveData2 == null || (value = liveData2.getValue()) == null) {
            return;
        }
        if (textStickerData.getNleUuid().length() > 0) {
            C122034qd LJJI = C17N.LJJI(value);
            if (LJJI != null) {
                InterfaceC123794tT LJFF = LJJI.LJFF();
                C122004qa c122004qa = new C122004qa(EnumC122254qz.TEXT_SPEAK);
                c122004qa.LIZIZ = textStickerData.getNleUuid();
                LJFF.LJFF(c122004qa);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        textStickerData.setHasReadTextAudio(false);
        textStickerData.setAudioText(null);
        textStickerData.setNleUuid("");
        textStickerData.setAudioTrackIndex(-1);
        textStickerData.setAudioTrackFilePath(null);
        if (AnonymousClass699.LIZIZ().LIZIZ.LJLJI) {
            if (!ujb.o.LJJJJJL(str)) {
                LJIIL().wk(textStickerData, str);
            }
        } else if (C68W.LJII(c1545664u.getTextWrapList()).length() > 0 && this.LLIIZ.LIZ.getInt("read_text_change_toast", 0) < 3) {
            TMB tmb = C82890Wg2.LJFF;
            Context context = c1545664u.getContext();
            tmb.getClass();
            TMB.LIZJ(R.string.e4_, 0, context).LIZ();
            C19N.LIZJ(this.LLIIZ.LIZ, "read_text_change_toast", 0, 1, "read_text_change_toast");
        }
        value.LLJJJIL(textStickerData.getStartTime(), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        value.play();
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

    public C63E(ActivityC45651qj activity, InterfaceC152085y0 interfaceC152085y0, InterfaceC143655kP interfaceC143655kP, FrameLayout previewLayout, C1545664u inputLayout, AnonymousClass655 anonymousClass655, LiveData liveData, InterfaceC1541063a interfaceC1541063a, int i, AnonymousClass671 anonymousClass671, boolean z, EnumC139385dW enumC139385dW, AnonymousClass642 anonymousClass642, TTSVoiceModel tTSVoiceModel, InterfaceC65784Pro interfaceC65784Pro, C82622Wbi c82622Wbi, int i2) {
        Rect rect;
        int i3 = i;
        InterfaceC1541063a interfaceC1541063a2 = interfaceC1541063a;
        AnonymousClass655 anonymousClass6552 = anonymousClass655;
        LiveData liveData2 = liveData;
        AnonymousClass642 anonymousClass6422 = anonymousClass642;
        EnumC139385dW textStickerGuidanceType = enumC139385dW;
        AnonymousClass671 anonymousClass6712 = anonymousClass671;
        boolean z2 = z;
        C82622Wbi c82622Wbi2 = c82622Wbi;
        TTSVoiceModel tTSVoiceModel2 = tTSVoiceModel;
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        InterfaceC143655kP interfaceC143655kP2 = (i2 & 4) != 0 ? null : interfaceC143655kP;
        anonymousClass6552 = (i2 & 32) != 0 ? null : anonymousClass6552;
        liveData2 = (i2 & 64) != 0 ? null : liveData2;
        interfaceC1541063a2 = (i2 & 128) != 0 ? null : interfaceC1541063a2;
        i3 = (i2 & 256) != 0 ? 30 : i3;
        if ((i2 & 512) != 0) {
            rect = new Rect();
        } else {
            rect = null;
        }
        anonymousClass6712 = (i2 & 1024) != 0 ? null : anonymousClass6712;
        z2 = (i2 & 2048) != 0 ? false : z2;
        textStickerGuidanceType = (i2 & 4096) != 0 ? EnumC139385dW.NONE : textStickerGuidanceType;
        anonymousClass6422 = (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : anonymousClass6422;
        tTSVoiceModel2 = (i2 & 16384) != 0 ? null : tTSVoiceModel2;
        interfaceC65784Pro2 = (32768 & i2) != 0 ? null : interfaceC65784Pro2;
        c82622Wbi2 = (i2 & 65536) != 0 ? null : c82622Wbi2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(previewLayout, "previewLayout");
        o.LJIIIZ(inputLayout, "inputLayout");
        o.LJIIIZ(textStickerGuidanceType, "textStickerGuidanceType");
        this.LJLIL = activity;
        this.LJLILLLLZI = interfaceC152085y0;
        this.LJLJI = interfaceC143655kP2;
        this.LJLJJI = previewLayout;
        this.LJLJJL = inputLayout;
        this.LJLJJLL = anonymousClass6552;
        this.LJLJL = liveData2;
        this.LJLJLJ = interfaceC1541063a2;
        this.LJLJLLL = i3;
        this.LJLL = rect;
        this.LJLLI = anonymousClass6712;
        this.LJLLILLLL = z2;
        this.LJLLJ = textStickerGuidanceType;
        this.LJLLL = anonymousClass6422;
        this.LJLLLL = tTSVoiceModel2;
        this.LJLLLLLL = interfaceC65784Pro2;
        this.LJLZ = c82622Wbi2;
        this.LJZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 664));
        this.LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 663));
        this.LLIIZ = new C139355dT();
        this.LLIL = true;
        this.LLILIL = 1000;
        this.LLILLL = true;
    }
}
