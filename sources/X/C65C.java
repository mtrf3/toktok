package X;

import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import Y.ARunnableS5S0201000_2;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewState;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.65C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C65C implements InterfaceC143795kd, InterfaceC83564Wqu, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final C82622Wbi LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final InterfaceC152085y0 LJLJI;
    public final FrameLayout LJLJJI;
    public final C1545664u LJLJJL;
    public final AnonymousClass655 LJLJJLL;
    public final LiveData<InterfaceC153045zY> LJLJL;
    public final InterfaceC1546365b LJLJLJ;
    public final int LJLJLLL;
    public Rect LJLL;
    public AnonymousClass671 LJLLI;
    public FTCEditTextStickerViewModel LJLLILLLL;
    public FTCStickerHintTextViewModel LJLLJ;
    public final C82632Wbs LJLLL;
    public final C82632Wbs LJLLLL;
    public C67P LJLLLLLL;
    public InterfaceC1542963t LJLZ;
    public C65G LJZ;
    public InterfaceC88472Yns<? super C67P, C76800UCe> LJZI;
    public C65D LJZL;
    public InterfaceC1543363x LL;
    public final C146915pf LLD;
    public final C62822Ol8 LLF;
    public InterfaceC88471Ynr<? super C67P, ? super C67P, C76800UCe> LLFF;
    public InterfaceC1552467k LLFFF;
    public SafeHandler LLFII;
    public ARunnableS5S0201000_2 LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public long LLII;
    public boolean LLIIII;
    public OSZ<Integer, Integer> LLIIIILZ;

    static {
        TBT tbt = new TBT(C65C.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C65C.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp)};
    }

    public C65C() {
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

    public final FTCEditTextStickerViewModel LIZJ() {
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.LJLLILLLL;
        if (fTCEditTextStickerViewModel != null) {
            return fTCEditTextStickerViewModel;
        }
        o.LJIJI("textStickerViewModel");
        throw null;
    }

    public final void LJI() {
        AnonymousClass671 anonymousClass671;
        View contentView;
        OSZ<Integer, Integer> osz = this.LLIIIILZ;
        if (osz == null || osz.getFirst().intValue() == 0 || osz.getSecond().intValue() == 0) {
            return;
        }
        int[] LJJIJLIJ = V3N.LJJIJLIJ(osz.getFirst().intValue(), osz.getSecond().intValue(), this.LJLJJI);
        this.LLI = LJJIJLIJ[0];
        this.LLIFFJFJJ = LJJIJLIJ[1];
        ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
        this.LJLL = new Rect(0, 0, layoutParams.width, layoutParams.height);
        AnonymousClass671 anonymousClass6712 = this.LJLLI;
        if (anonymousClass6712 != null && (contentView = anonymousClass6712.getContentView()) != null && contentView.getParent() != null) {
            ViewParent parent = contentView.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(contentView, (ViewGroup) parent);
        }
        InterfaceC150675vj interfaceC150675vj = C6PB.LIZLLL().LIZLLL;
        if (interfaceC150675vj != null) {
            anonymousClass671 = interfaceC150675vj.LIZLLL(this.LLI, this.LJLILLLLZI);
        } else {
            anonymousClass671 = null;
        }
        this.LJLLI = anonymousClass671;
        if (anonymousClass671 == null) {
            return;
        }
        this.LJLJJI.addView(anonymousClass671.getContentView());
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle bindLifecycle = (Lifecycle) this.LLF.getValue();
        o.LJIIIIZZ(bindLifecycle, "bindLifecycle");
        return bindLifecycle;
    }

    public final void LIZLLL() {
        InfoStickerModel LIZ;
        List<StickerItemModel> list;
        InterfaceC153045zY value;
        VESize LLILZ;
        boolean z = !LIZJ().LJJL();
        InterfaceC1546365b interfaceC1546365b = this.LJLJLJ;
        if (interfaceC1546365b != null && (LIZ = interfaceC1546365b.LIZ()) != null && (list = LIZ.stickers) != null) {
            Iterator<StickerItemModel> it = list.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                if (next.type == 2) {
                    if (z) {
                        if (!z2) {
                            LiveData<InterfaceC153045zY> liveData = this.LJLJL;
                            if (liveData != null && (value = liveData.getValue()) != null && (LLILZ = value.LLILZ()) != null) {
                                OSZ<Integer, Integer> osz = new OSZ<>(Integer.valueOf(LLILZ.width), Integer.valueOf(LLILZ.height));
                                if (this.LLIIIILZ == null) {
                                    this.LLIIIILZ = osz;
                                    LJI();
                                }
                            }
                            z2 = true;
                        }
                        TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C6PB.LIZIZ(), next.extra, TextStickerData.class);
                        if (textStickerData != null) {
                            LIZJ().c8(textStickerData, true);
                        }
                    }
                    it.remove();
                }
            }
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LIZIZ(C67P c67p) {
        if (c67p == null || this.LJLLI == null) {
            return;
        }
        if (this.LJLJJI.getChildCount() > 1) {
            FrameLayout frameLayout = this.LJLJJI;
            if (frameLayout.getChildAt(frameLayout.getChildCount() - 1) != c67p) {
                C16880lQ.LJLLLL(c67p, this.LJLJJI);
                this.LJLJJI.addView(c67p);
            }
        }
        C67P mS = LIZJ().mS();
        if (mS != c67p) {
            LIZJ().f80(c67p);
            if (mS == null) {
                return;
            }
        }
        InterfaceC88471Ynr<? super C67P, ? super C67P, C76800UCe> interfaceC88471Ynr = this.LLFF;
        if (interfaceC88471Ynr == null) {
            return;
        }
        interfaceC88471Ynr.invoke(mS, c67p);
    }

    public final void LJFF(C67P c67p) {
        String str;
        List<InlineRichTextStyleData> list;
        boolean z;
        boolean z2;
        TextStickerData data;
        this.LLIIII = true;
        if (c67p != null && (data = c67p.getData()) != null && data.getTtsVoiceModel() != null) {
            str = "auto";
        } else {
            str = "user_click";
        }
        if (c67p == null) {
            this.LJLJJL.LJJI(LIZJ().Wz(), str, null);
            this.LJLLLLLL = null;
            return;
        }
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
        int Wz = LIZJ().Wz();
        TextStickerData data4 = c67p.getData();
        if (data4 != null) {
            z = data4.isUseColorDropper();
        } else {
            z = false;
        }
        TextStickerData data5 = c67p.getData();
        if (data5 != null) {
            z2 = data5.isAdjustTextRollbar();
        } else {
            z2 = false;
        }
        c1545664u.LJJIFFI(textWrapList, list, curMode, curColor, curAlignTxt, curFontType, false, fontSize, Wz, str, null, z, z2);
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        if (!this.LLIIII) {
            return;
        }
        this.LJLJJL.LJIIIIZZ();
        List<TextStickerTextWrap> textWrapList = this.LJLJJL.getTextWrapList();
        o.LJIIIIZZ(textWrapList, "inputLayout.textWrapList");
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = null;
        if (C68W.LJIILIIL(textWrapList)) {
            C67P c67p = this.LJLLLLLL;
            int i2 = 28;
            if (c67p != null) {
                c67p.getData();
                c67p.LJJI(this.LJLJJL.getCurTxtMode(), this.LJLJJL.getCurColor(), this.LJLJJL.getAlignTxt(), C68M.LJIIJ().LIZJ);
                if (C68M.LJIIJ().LIZJ() > 0) {
                    i2 = C68M.LJIIJ().LIZJ();
                }
                c67p.setFontSize(i2);
                TextStickerData data = c67p.getData();
                if (data != null) {
                    innerEffectTextLayoutConfig = data.getEffectTextLayoutConfig();
                }
                c67p.LJJIII(innerEffectTextLayoutConfig, textWrapList);
            } else if (LIZJ().qV() >= this.LJLJLLL) {
                C6PB.LJ().LIZIZ(R.string.hhd, this.LJLILLLLZI);
            } else {
                TextStickerData textStickerData = new TextStickerData("", this.LJLJJL.getCurTxtMode(), this.LJLJJL.getCurColor(), this.LJLJJL.getAlignTxt(), C68M.LJIIJ().LIZJ, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32, -1, 1048575, null);
                Point editInputScreenCenterPoint = this.LJLJJL.getEditInputScreenCenterPoint();
                o.LJIIIIZZ(editInputScreenCenterPoint, "inputLayout.editInputScreenCenterPoint");
                textStickerData.setEditCenterPoint(editInputScreenCenterPoint);
                textStickerData.setTextWrapList(textWrapList);
                if (C68M.LJIIJ().LIZJ() > 0) {
                    i2 = C68M.LJIIJ().LIZJ();
                }
                textStickerData.setFontSize(i2);
                LIZ(textStickerData, false);
            }
        } else {
            C67P c67p2 = this.LJLLLLLL;
            if (c67p2 != null) {
                C16880lQ.LJLLLL(c67p2, this.LJLJJI);
                LIZJ().K4(c67p2);
            }
            this.LJLLLLLL = null;
        }
        this.LLIIII = false;
        C65D c65d = this.LJZL;
        if (c65d != null) {
            c65d.dismiss();
        }
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
        if (!this.LLIIII) {
            return;
        }
        C67P c67p = this.LJLLLLLL;
        if (c67p != null) {
            c67p.LJFF();
        }
        this.LJLJJL.LJIL();
        C1545664u c1545664u = this.LJLJJL;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c1545664u.LL.getLayoutParams();
        layoutParams.bottomMargin = i;
        c1545664u.LL.setLayoutParams(layoutParams);
    }

    public final void LIZ(TextStickerData textStickerData, boolean z) {
        this.LJLJJL.setData(textStickerData);
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        SafeHandler safeHandler = this.LLFII;
        if (safeHandler != null) {
            C67P c67p = new C67P(activityC45651qj, safeHandler, textStickerData, true, new C68K() { // from class: X.65L
                @Override // X.C68K
                public final boolean LIZ() {
                    return C65C.this.LIZJ().LJIIIIZZ();
                }
            }, Boolean.TRUE);
            c67p.LLIFFJFJJ = this.LL;
            LIZJ().H5(c67p);
            c67p.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.LJLJJI.addView(c67p);
            InterfaceC1542963t interfaceC1542963t = this.LJLZ;
            if (interfaceC1542963t != null) {
                interfaceC1542963t.H5(c67p);
            }
            this.LJLLLLLL = c67p;
            c67p.setOnEditClickListener(new InterfaceC1552467k() { // from class: X.65B
                @Override // X.InterfaceC1552467k
                public final void LIZIZ(C67P textStickerView) {
                    o.LJIIIZ(textStickerView, "textStickerView");
                }

                @Override // X.InterfaceC1552467k
                public final void LJ(C67P textStickerView) {
                    o.LJIIIZ(textStickerView, "textStickerView");
                }

                @Override // X.InterfaceC1552467k
                public final void LJI(C67P view) {
                    o.LJIIIZ(view, "view");
                }

                @Override // X.InterfaceC1552467k
                public final void LJIIIZ(C67P stickerView) {
                    o.LJIIIZ(stickerView, "stickerView");
                }

                @Override // X.InterfaceC1552467k
                public final float LIZ(float f) {
                    AnonymousClass671 anonymousClass671 = C65C.this.LJLLI;
                    if (anonymousClass671 != null) {
                        return anonymousClass671.LJIIJ(f);
                    }
                    return f;
                }

                @Override // X.InterfaceC1552467k
                public final void LJII(C67P textStickerView) {
                    o.LJIIIZ(textStickerView, "textStickerView");
                    C65C.this.LIZJ().LJIILIIL(true);
                    C65C.this.LIZJ().LIZLLL();
                    InterfaceC88472Yns<? super C67P, C76800UCe> interfaceC88472Yns = C65C.this.LJZI;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(textStickerView);
                    }
                    InterfaceC1543363x interfaceC1543363x = C65C.this.LL;
                    if (interfaceC1543363x != null) {
                        interfaceC1543363x.LJFF();
                    }
                }

                @Override // X.InterfaceC1552467k
                public final void LIZJ(C67P textStickerView, RectF rectF, C1541163b c1541163b) {
                    o.LJIIIZ(textStickerView, "textStickerView");
                    if (!c1541163b.LJLJI) {
                        C65C.this.LIZIZ(textStickerView);
                    }
                    if (!c1541163b.LJLJJI && !c1541163b.LJLJJL) {
                        boolean LJIIIZ = C1E4.LJIIIZ(C65C.this.LJLL, textStickerView.getAnglePointList());
                        C65C c65c = C65C.this;
                        AnonymousClass655 anonymousClass655 = c65c.LJLJJLL;
                        if (anonymousClass655 != null) {
                            int LJLILLLLZI = anonymousClass655.LJLILLLLZI(c1541163b.LJLIL, c1541163b.LJLILLLLZI, c1541163b.LJLJI, LJIIIZ);
                            if (LJLILLLLZI != 1) {
                                if (LJLILLLLZI != 3) {
                                    if (LJLILLLLZI == 4) {
                                        textStickerView.LJJ(0.3137255f, true);
                                    }
                                } else {
                                    C16880lQ.LJLLLL(textStickerView, c65c.LJLJJI);
                                    c65c.LIZJ().K4(textStickerView);
                                    c65c.LJLLLLLL = null;
                                    InterfaceC1542963t interfaceC1542963t2 = c65c.LJLZ;
                                    if (interfaceC1542963t2 != null) {
                                        interfaceC1542963t2.K4(textStickerView);
                                    }
                                }
                            } else {
                                textStickerView.LJJ(0.3137255f, false);
                            }
                        }
                    }
                    if (C65C.this.LJLJJLL != null) {
                        textStickerView.setAlpha(1.0f);
                    }
                    InterfaceC1542963t interfaceC1542963t3 = C65C.this.LJLZ;
                    if (interfaceC1542963t3 != null) {
                        interfaceC1542963t3.LIZJ(textStickerView, new C1541163b(c1541163b.LJLJI, c1541163b.LJLJJI, c1541163b.LJLIL, c1541163b.LJLILLLLZI, c1541163b.LJLJJL));
                    }
                }

                @Override // X.InterfaceC1552467k
                public final void LIZLLL(C67P textStickerView, boolean z2, Integer num) {
                    o.LJIIIZ(textStickerView, "textStickerView");
                    InterfaceC1552467k interfaceC1552467k = C65C.this.LLFFF;
                    if (interfaceC1552467k != null) {
                        interfaceC1552467k.LIZLLL(textStickerView, z2, null);
                    }
                    if (z2) {
                        C65C c65c = C65C.this;
                        if (!((FTCEditTextStickerViewState) C73297Sph.LIZIZ(c65c, c65c.LIZJ())).getInTimeEditView()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            C65C c65c2 = C65C.this;
                            if (currentTimeMillis - c65c2.LLII > 500) {
                                c65c2.LIZJ().o().LJII(Boolean.FALSE);
                                C65C c65c3 = C65C.this;
                                c65c3.LJLLLLLL = textStickerView;
                                c65c3.LJFF(textStickerView);
                                InterfaceC1542963t interfaceC1542963t2 = C65C.this.LJLZ;
                                if (interfaceC1542963t2 != null) {
                                    interfaceC1542963t2.LIZ(textStickerView);
                                }
                                C65C.this.LLII = System.currentTimeMillis();
                                InterfaceC1543363x interfaceC1543363x = C65C.this.LL;
                                if (interfaceC1543363x != null) {
                                    interfaceC1543363x.LIZJ(textStickerView);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    C65G c65g = C65C.this.LJZ;
                    if (c65g != null) {
                        c65g.LIZ();
                        C65C c65c4 = C65C.this;
                        C67P c67p2 = c65c4.LJLLLLLL;
                        if (c67p2 != null) {
                            c65c4.LIZIZ(c67p2);
                        }
                    }
                    C65C.this.LIZJ().LIZLLL();
                }

                @Override // X.InterfaceC1552467k
                public final int LJFF(C67P view, boolean z2, boolean z3) {
                    o.LJIIIZ(view, "view");
                    AnonymousClass671 anonymousClass671 = C65C.this.LJLLI;
                    if (anonymousClass671 == null) {
                        return -1;
                    }
                    if (z2) {
                        anonymousClass671.LJIIJJI();
                        return -1;
                    }
                    return anonymousClass671.LJI(view.getAnglePointListForBlock(), z3);
                }

                @Override // X.InterfaceC1552467k
                public final PointF LJIIIIZZ(C67P view, float f, float f2) {
                    o.LJIIIZ(view, "view");
                    AnonymousClass671 anonymousClass671 = C65C.this.LJLLI;
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
            int i = this.LLI;
            int i2 = this.LLIFFJFJJ;
            c67p.LJLLLLLL = i2;
            C67T c67t = c67p.LJZI;
            c67t.LJIIJJI = i;
            c67t.LJIIL = i2;
            TextStickerData textStickerData2 = c67p.LJZL;
            if (textStickerData2 != null && textStickerData2.getEditCenterPoint() != null) {
                c67p.setAnimXY(c67p.LJZL.getEditCenterPoint());
            }
            this.LJLJJL.LJ();
            if (!z) {
                c67p.postDelayed(new ARunnableS21S0200000_2(c67p, this, 75), 500L);
            }
            if (textStickerData.getAutoSelect()) {
                c67p.post(new ARunnableS38S0100000_2(c67p, 211));
                return;
            }
            return;
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
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

    public C65C(C82622Wbi diContainer, ActivityC45651qj activityC45651qj, InterfaceC152085y0 interfaceC152085y0, FrameLayout previewLayout, C1545664u c1545664u, AnonymousClass655 anonymousClass655, LiveData liveData, InterfaceC1546365b interfaceC1546365b, int i) {
        Rect rect = new Rect();
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(previewLayout, "previewLayout");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = interfaceC152085y0;
        this.LJLJJI = previewLayout;
        this.LJLJJL = c1545664u;
        this.LJLJJLL = anonymousClass655;
        this.LJLJL = liveData;
        this.LJLJLJ = interfaceC1546365b;
        this.LJLJLLL = i;
        this.LJLL = rect;
        this.LJLLI = null;
        this.LJLLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLLL = UCI.LJI(diContainer, AbstractC42651GoZ.class, null);
        this.LLD = C146915pf.LIZ;
        this.LLF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1083));
    }
}
