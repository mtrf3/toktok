package X;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.67S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67S extends C63E {
    public final ActivityC45651qj LLILZ;
    public final C1555068k LLILZIL;
    public final C1554768h LLILZLL;
    public AnonymousClass684 LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public TextFontStyleData LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public InnerEffectTextLayoutConfig LLJILLL;
    public C1552667m LLJJ;
    public C142485iW LLJJI;
    public int LLJJIII;

    @Override // X.C63E
    public final void LJJIIZ() {
        C67P c67p = this.LLF;
        if (c67p != null) {
            c67p.setOnEffectTextGestureListener(new C68C() { // from class: X.67a
                @Override // X.C68C
                public final void LIZ() {
                    C67R c67r = (C67R) C67S.this.LLF;
                    if (c67r != null) {
                        c67r.LJJIIZI(false);
                    }
                }

                @Override // X.C68C
                public final void LIZIZ() {
                    InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
                    TextStickerData data;
                    C67S c67s = C67S.this;
                    C1555068k c1555068k = c67s.LLILZIL;
                    C67P c67p2 = c67s.LLF;
                    if (c67p2 != null && (data = c67p2.getData()) != null) {
                        innerEffectTextLayoutConfig = data.getEffectTextLayoutConfig();
                    } else {
                        innerEffectTextLayoutConfig = null;
                    }
                    c1555068k.setInnerLayoutConfig(innerEffectTextLayoutConfig);
                    c67s.LJJIJ(c67s.LLF, null);
                    AnonymousClass684 anonymousClass684 = c67s.LLIZ;
                    if (anonymousClass684 != null) {
                        String str = c67s.LLJILJILJ;
                        if (str == null) {
                            str = "";
                        }
                        anonymousClass684.LIZ(new C6VN(false, str, null, null, null, null, 0, 0, 0, null, 1021));
                    }
                }

                @Override // X.C68C
                public final void LIZJ() {
                    C67R c67r = (C67R) C67S.this.LLF;
                    if (c67r != null) {
                        c67r.LJJIIZI(true);
                    }
                }

                @Override // X.C68C
                public final void LIZLLL() {
                    C67R c67r = (C67R) C67S.this.LLF;
                    if (c67r != null) {
                        c67r.LJJIIZI(true);
                    }
                }
            });
        }
    }

    @Override // X.C63E
    public final int LJIIJ() {
        int i;
        if (C68M.LJIIJ().LIZJ() > 0) {
            i = C68M.LJIIJ().LIZJ();
        } else {
            i = 28;
        }
        return (int) (this.LLJJ.L() * i);
    }

    @Override // X.C63E
    public final void LJIILL() {
        super.LJIILL();
        this.LLILZIL.setTextStickerInputMobListener(new InterfaceC139695e1() { // from class: X.67b
            @Override // X.InterfaceC139695e1
            public final void LIZ() {
            }

            @Override // X.InterfaceC139695e1
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC139695e1
            public final void LIZLLL(int i, String str) {
            }

            @Override // X.InterfaceC139695e1
            public final void LJI() {
            }

            @Override // X.InterfaceC139695e1
            public final void LJII(C147105py c147105py) {
            }

            @Override // X.InterfaceC139695e1
            public final void LJFF(int i, String alignStr, String str, String str2) {
                o.LJIIIZ(alignStr, "alignStr");
                AnonymousClass684 anonymousClass684 = C67S.this.LLIZ;
                if (anonymousClass684 != null) {
                    anonymousClass684.LJ(alignStr);
                }
            }

            @Override // X.InterfaceC139695e1
            public final void LJIIIIZZ(int i, int i2, String str, String str2) {
                C67S.this.LLIZLLLIL = String.valueOf(i);
                AnonymousClass684 anonymousClass684 = C67S.this.LLIZ;
                if (anonymousClass684 != null) {
                    anonymousClass684.LJIIIIZZ(i);
                }
            }

            @Override // X.InterfaceC139695e1
            public final void LIZJ(TextFontStyleData type, int i, String str, String str2, boolean z) {
                o.LJIIIZ(type, "type");
                C67S.this.LLJIJIL = type.LIZJ.getEffectId();
                C67S c67s = C67S.this;
                String str3 = type.title;
                o.LJIIIIZZ(str3, "type.title");
                c67s.LLJILJIL = str3;
                AnonymousClass684 anonymousClass684 = C67S.this.LLIZ;
                if (anonymousClass684 != null) {
                    String str4 = type.title;
                    o.LJIIIIZZ(str4, "type.title");
                    anonymousClass684.LIZJ(str4);
                }
            }

            @Override // X.InterfaceC139695e1
            public final void LJ(int i, int i2, String str, String str2, boolean z) {
                C67S c67s = C67S.this;
                String hexString = Integer.toHexString(i);
                o.LJIIIIZZ(hexString, "toHexString(color)");
                c67s.LLJ = hexString;
                AnonymousClass684 anonymousClass684 = C67S.this.LLIZ;
                if (anonymousClass684 != null) {
                    anonymousClass684.LIZLLL(i);
                }
            }
        });
    }

    @Override // X.C63E
    public final void LJIIZILJ() {
        String str;
        String str2;
        Effect effect;
        super.LJIIZILJ();
        TextFontStyleData LJFF = C68M.LJIIJ().LJFF(0);
        this.LLJI = LJFF;
        String str3 = "";
        if (LJFF == null || (effect = LJFF.LIZJ) == null || (str = effect.getEffectId()) == null) {
            str = "";
        }
        this.LLJIJIL = str;
        TextFontStyleData textFontStyleData = this.LLJI;
        if (textFontStyleData != null && (str2 = textFontStyleData.title) != null) {
            str3 = str2;
        }
        this.LLJILJIL = str3;
    }

    @Override // X.C63E
    public final void LJIJ() {
        AnonymousClass671 anonymousClass671;
        InterfaceC150675vj interfaceC150675vj = C6PB.LIZLLL().LIZLLL;
        if (interfaceC150675vj != null) {
            anonymousClass671 = interfaceC150675vj.LIZLLL(0, this.LLILZ);
        } else {
            anonymousClass671 = null;
        }
        this.LJLLI = anonymousClass671;
        if (anonymousClass671 != null) {
            anonymousClass671.setEnableFakeFeedView(false);
        }
        AnonymousClass671 anonymousClass6712 = this.LJLLI;
        if (anonymousClass6712 != null) {
            this.LJLJJI.addView(anonymousClass6712.getContentView());
            C16360ka.LJJ(anonymousClass6712.getContentView(), Float.MAX_VALUE);
        }
    }

    public final boolean LJJIJLIJ() {
        Iterator<TextStickerTextWrap> it = LJIILIIL().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TextStickerTextWrap next = it.next();
            String text = next.getText();
            if (text != null && text.length() != 0) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C63E
    public final C67P LJIIIZ(TextStickerData textStickerData) {
        Object parent = this.LJLJJI.getParent();
        if (parent != null) {
            View view = (View) parent;
            if (view.getTag() instanceof C1552667m) {
                Object tag = view.getTag();
                o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextScaleInfo");
                C1552667m c1552667m = (C1552667m) tag;
                if (!o.LJ(this.LLJJ, c1552667m)) {
                    this.LLJJ = c1552667m;
                    this.LLILZIL.setScaleInfo(c1552667m);
                }
            }
        }
        C67R c67r = new C67R(this.LLILZ, LJIIJJI(), textStickerData, this.LLJJ, this.LLILZLL);
        c67r.setVisibility(this.LLJJIII);
        return c67r;
    }

    @Override // X.C63E
    public final void LJIJJLI(TTSVoiceModel tTSVoiceModel) {
        LIZJ(LJIILIIL(), tTSVoiceModel);
        this.LLIILII = false;
        String str = "";
        if (this.LLILZIL.getInnerLayoutConfig() == null) {
            AnonymousClass684 anonymousClass684 = this.LLIZ;
            if (anonymousClass684 != null) {
                String str2 = this.LLJILJILJ;
                if (str2 != null) {
                    str = str2;
                }
                anonymousClass684.LIZIZ(new C6VN(false, str, this.LLJIJIL, this.LLJILJIL, this.LLJ, this.LLIZLLLIL, 0, 0, 0, null, 961));
                return;
            }
            return;
        }
        AnonymousClass684 anonymousClass6842 = this.LLIZ;
        if (anonymousClass6842 == null) {
            return;
        }
        String str3 = this.LLJILJILJ;
        if (str3 != null) {
            str = str3;
        }
        anonymousClass6842.LIZIZ(new C6VN(false, str, null, null, null, null, 0, 0, 0, null, 1021));
    }

    @Override // X.C63E
    public final void LJJIIJZLJL(C67P c67p) {
        C67P c67p2 = this.LLF;
        if (c67p2 != null) {
            c67p2.setOnEditClickListener(new InterfaceC1552467k() { // from class: X.64t
                @Override // X.InterfaceC1552467k
                public final void LIZIZ(C67P textStickerView) {
                    o.LJIIIZ(textStickerView, "textStickerView");
                }

                @Override // X.InterfaceC1552467k
                public final void LIZJ(C67P textStickerView, RectF rectF, C1541163b c1541163b) {
                    o.LJIIIZ(textStickerView, "textStickerView");
                }

                @Override // X.InterfaceC1552467k
                public final void LIZLLL(C67P textStickerView, boolean z, Integer num) {
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
                public final void LJII(C67P textStickerView) {
                    o.LJIIIZ(textStickerView, "textStickerView");
                }

                @Override // X.InterfaceC1552467k
                public final void LJIIIZ(C67P stickerView) {
                    o.LJIIIZ(stickerView, "stickerView");
                }

                @Override // X.InterfaceC1552467k
                public final float LIZ(float f) {
                    AnonymousClass671 anonymousClass671 = C67S.this.LJLLI;
                    if (anonymousClass671 != null) {
                        return anonymousClass671.LJIIJ(f);
                    }
                    return 0.0f;
                }

                @Override // X.InterfaceC1552467k
                public final int LJFF(C67P view, boolean z, boolean z2) {
                    o.LJIIIZ(view, "view");
                    if (z) {
                        AnonymousClass671 anonymousClass671 = C67S.this.LJLLI;
                        if (anonymousClass671 != null) {
                            anonymousClass671.LJIIJJI();
                        }
                        return -1;
                    }
                    AnonymousClass671 anonymousClass6712 = C67S.this.LJLLI;
                    if (anonymousClass6712 == null) {
                        return -1;
                    }
                    return anonymousClass6712.LJI(view.getAnglePointListForBlock(), z2);
                }

                @Override // X.InterfaceC1552467k
                public final PointF LJIIIIZZ(C67P view, float f, float f2) {
                    PointF LIZLLL;
                    o.LJIIIZ(view, "view");
                    PointF[] pointFS = view.getAnglePointList();
                    o.LJIIIIZZ(pointFS, "pointFS");
                    for (PointF pointF : pointFS) {
                        pointF.x += f;
                        pointF.y += f2;
                    }
                    AnonymousClass671 anonymousClass671 = C67S.this.LJLLI;
                    if (anonymousClass671 == null || (LIZLLL = anonymousClass671.LIZLLL(pointFS, f, f2)) == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    return LIZLLL;
                }
            });
        }
    }

    @Override // X.C63E
    public final void LJJIJIL(TextStickerData textStickerData) {
        if (textStickerData == null) {
            return;
        }
        textStickerData.setEffectTextLayoutConfig(this.LLILZIL.getInnerLayoutConfig());
    }

    public final void LJJIJL(boolean z) {
        AnonymousClass684 anonymousClass684 = this.LLIZ;
        if (anonymousClass684 != null) {
            anonymousClass684.LJFF(new C6VN(false, null, null, null, null, null, 0, 0, z ? 1 : 0, null, 767));
        }
    }

    public final void LJJIL(C157776Hd bean) {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
        List<InnerEffectTextConfig> textConfigs;
        o.LJIIIZ(bean, "bean");
        this.LLJILJILJ = bean.effect.getEffectId();
        this.LLJILLL = bean.LJLIL;
        float L = this.LLJJ.L();
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig2 = bean.LJLIL;
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig3 = null;
        if (innerEffectTextLayoutConfig2 != null) {
            if (L == 0.0f) {
                L = 1.0f;
            }
            innerEffectTextLayoutConfig = C78939UyV.LJJJJJL(innerEffectTextLayoutConfig2, L);
        } else {
            innerEffectTextLayoutConfig = null;
        }
        C67P c67p = this.LLF;
        if (c67p != null) {
            TextStickerData data = c67p.getData();
            if (data != null) {
                data.setEffectTextLayoutConfig(innerEffectTextLayoutConfig);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(LJIILIIL());
            if (innerEffectTextLayoutConfig != null) {
                int size = innerEffectTextLayoutConfig.getTextConfigs().size();
                for (int size2 = arrayList.size(); size2 < size; size2++) {
                    arrayList.add(C68W.LIZIZ("", false));
                }
            }
            c67p.LJJI(this.LLILZIL.getCurTxtMode(), this.LLILZIL.getCurColor(), this.LLILZIL.getAlignTxt(), C68M.LJIIJ().LIZJ);
            c67p.setFontSize(LJIIJ());
            TextStickerData data2 = c67p.getData();
            if (data2 != null) {
                innerEffectTextLayoutConfig3 = data2.getEffectTextLayoutConfig();
            }
            c67p.LJJIII(innerEffectTextLayoutConfig3, arrayList);
            return;
        }
        TextStickerData textStickerData = new TextStickerData("", this.LLILZIL.getCurTxtMode(), this.LLILZIL.getCurColor(), this.LLILZIL.getAlignTxt(), C68M.LJIIJ().LIZJ, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32, -1, 1048575, null);
        textStickerData.setEffectTextLayoutConfig(innerEffectTextLayoutConfig);
        Point editInputScreenCenterPoint = this.LLILZIL.getEditInputScreenCenterPoint();
        o.LJIIIIZZ(editInputScreenCenterPoint, "effectInputLayout.editInputScreenCenterPoint");
        textStickerData.setEditCenterPoint(editInputScreenCenterPoint);
        ArrayList arrayList2 = new ArrayList();
        InnerEffectTextLayoutConfig effectTextLayoutConfig = textStickerData.getEffectTextLayoutConfig();
        if (effectTextLayoutConfig != null && (textConfigs = effectTextLayoutConfig.getTextConfigs()) != null) {
            Iterator<InnerEffectTextConfig> it = textConfigs.iterator();
            while (it.hasNext()) {
                it.next();
                arrayList2.add(C68W.LIZIZ("", false));
            }
        } else {
            arrayList2.add(C68W.LIZIZ("", false));
        }
        textStickerData.setTextWrapList(arrayList2);
        textStickerData.setFontSize(LJIIJ());
        LIZIZ(textStickerData, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67S(ActivityC45651qj activity, C6VC c6vc, C1555068k effectInputLayout, C1554768h textStickerInitConfig) {
        super(activity, c6vc, null, c6vc.LIZJ, effectInputLayout, null, null, null, 1, null, false, null, null, null, null, null, 130788);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(effectInputLayout, "effectInputLayout");
        o.LJIIIZ(textStickerInitConfig, "textStickerInitConfig");
        this.LLILZ = activity;
        this.LLILZIL = effectInputLayout;
        this.LLILZLL = textStickerInitConfig;
        this.LLIZLLLIL = CardStruct.IStatusCode.DEFAULT;
        String hexString = Integer.toHexString(-1);
        o.LJIIIIZZ(hexString, "toHexString(TextStickerEditText.DEFAULT_TEXTCOLOR)");
        this.LLJ = hexString;
        this.LLJIJIL = "";
        this.LLJILJIL = "";
        this.LLJJ = new C1552667m(0);
        new OSZ(null, null);
    }
}
