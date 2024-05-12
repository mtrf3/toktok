package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.AbstractC156316Bn;
import X.ActivityC45651qj;
import X.C10A;
import X.C124614un;
import X.C1280450u;
import X.C132005Ga;
import X.C134665Qg;
import X.C141335gf;
import X.C147095px;
import X.C147105py;
import X.C1551667c;
import X.C1554968j;
import X.C1556068u;
import X.C16880lQ;
import X.C2068389v;
import X.C29S;
import X.C3C5;
import X.C5FC;
import X.C5G0;
import X.C68M;
import X.C68W;
import X.C76800UCe;
import X.C79057V0z;
import X.C90903hW;
import X.InterfaceC127784zu;
import X.InterfaceC1549866k;
import X.InterfaceC1555668q;
import X.InterfaceC1556368x;
import X.ORY;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.editSticker.text.bean.ForegroundColorStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TypefaceStyle;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFontFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFontViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class InlineCaptionFontFragment extends TTResourcePanelFragment<InlineCaptionFontViewModel> {
    public final C132005Ga LJLZ;
    public final String LJZ;
    public final String LJZI;
    public TuxIconView LJZL;
    public TuxIconView LL;
    public C1554968j LLD;
    public C1556068u LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public int LLFZ;
    public IDlS62S0100000_2 LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public String LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public C147095px LLIIIZ;
    public final Map<Integer, View> LLIIJI;

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "inline_caption_font";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJI).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        return R.layout.asb;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        C147095px c147095px = this.LLIIIZ;
        if (c147095px != null) {
            c147095px.LIZLLL(1, this.LJZI);
        }
        if (this.LLIIIJ) {
            C124614un.LJIILJJIL(Jl());
            C79057V0z.LJIIL(Jl());
        }
        InterfaceC127784zu player = Jl().getPlayer();
        player.J9();
        player.pause();
        C79057V0z.LJJJJL(Jl(), "quit_edit_caption_font", C76800UCe.LIZ);
        Hl();
    }

    public final List<TextStickerTextWrap> lm() {
        ArrayList arrayList = new ArrayList();
        C132005Ga c132005Ga = this.LJLZ;
        if (c132005Ga != null) {
            String uuid = this.LJZ;
            o.LJIIIZ(uuid, "uuid");
            C1551667c c1551667c = (C1551667c) ((ArrayMap) c132005Ga.LJLL).get(uuid);
            if (c1551667c != null) {
                arrayList.add(C68W.LIZ(c1551667c, c1551667c.getTextStructWrapList()));
            }
        }
        return arrayList;
    }

    public final void mm() {
        int i = this.LLFII;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                TuxIconView tuxIconView = this.LL;
                if (tuxIconView != null) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_lines_right_aligned;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    tuxIconView.setTuxIcon(c2068389v);
                    return;
                }
                o.LJIJI("mAlignIcon");
                throw null;
            }
            TuxIconView tuxIconView2 = this.LL;
            if (tuxIconView2 != null) {
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_lines_center_aligned;
                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView2.setTuxIcon(c2068389v2);
                return;
            }
            o.LJIJI("mAlignIcon");
            throw null;
        }
        TuxIconView tuxIconView3 = this.LL;
        if (tuxIconView3 != null) {
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_lines_left_aligned;
            c2068389v3.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView3.setTuxIcon(c2068389v3);
            return;
        }
        o.LJIJI("mAlignIcon");
        throw null;
    }

    public final void om() {
        int i = this.LLFF;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    TuxIconView tuxIconView = this.LJZL;
                    if (tuxIconView != null) {
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_text_outline;
                        c2068389v.LJ = Integer.valueOf(R.attr.dj);
                        tuxIconView.setTuxIcon(c2068389v);
                        return;
                    }
                    o.LJIJI("mBgModeIcon");
                    throw null;
                }
                TuxIconView tuxIconView2 = this.LJZL;
                if (tuxIconView2 != null) {
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZ = R.raw.icon_color_text_transparent;
                    tuxIconView2.setTuxIcon(c2068389v2);
                    return;
                }
                o.LJIJI("mBgModeIcon");
                throw null;
            }
            TuxIconView tuxIconView3 = this.LJZL;
            if (tuxIconView3 != null) {
                C2068389v c2068389v3 = new C2068389v();
                c2068389v3.LIZ = R.raw.icon_text_background;
                c2068389v3.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView3.setTuxIcon(c2068389v3);
                return;
            }
            o.LJIJI("mBgModeIcon");
            throw null;
        }
        TuxIconView tuxIconView4 = this.LJZL;
        if (tuxIconView4 != null) {
            C2068389v c2068389v4 = new C2068389v();
            c2068389v4.LIZ = R.raw.icon_text_stroke;
            c2068389v4.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView4.setTuxIcon(c2068389v4);
            return;
        }
        o.LJIJI("mBgModeIcon");
        throw null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        String str;
        TextFontStyleData LJFF = C68M.LJIIJ().LJFF(1);
        C147095px c147095px = this.LLIIIZ;
        if (c147095px != null) {
            boolean LJIIJJI = C68W.LJIIJJI(lm());
            boolean LJIIJ = C68W.LJIIJ(lm());
            String str2 = this.LJZI;
            if (LJFF == null || (str = LJFF.title) == null) {
                str = "";
            }
            c147095px.LJII(new C147105py(LJIIJJI, LJIIJ, 1, "caption", str2, str, false, null));
        }
        InterfaceC127784zu player = Jl().getPlayer();
        player.J9();
        player.pause();
        if (this.LLIIIJ) {
            C79057V0z.LJIIL(Jl());
        }
        C79057V0z.LJJJJL(Jl(), "quit_edit_caption_font", C76800UCe.LIZ);
        Hl();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        o.LJIIIIZZ(requireActivity(), "requireActivity()");
        return C5G0.LIZ(InlineCaptionFontViewModel.class);
    }

    public final void nm(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        if (!textFontStyleData.LIZ()) {
            if (this.LLFFF == -1 || this.LLFF != 1) {
                this.LLFFF = this.LLFF;
                this.LLFF = 1;
            }
            TuxIconView tuxIconView = this.LJZL;
            if (tuxIconView != null) {
                tuxIconView.setAlpha(0.34f);
                TuxIconView tuxIconView2 = this.LJZL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setClickable(false);
                    TuxIconView tuxIconView3 = this.LJZL;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setTag(Boolean.FALSE);
                        return;
                    } else {
                        o.LJIJI("mBgModeIcon");
                        throw null;
                    }
                }
                o.LJIJI("mBgModeIcon");
                throw null;
            }
            o.LJIJI("mBgModeIcon");
            throw null;
        }
        int i = this.LLFFF;
        if (i != -1) {
            this.LLFF = i;
        }
        TuxIconView tuxIconView4 = this.LJZL;
        if (tuxIconView4 != null) {
            tuxIconView4.setAlpha(1.0f);
            TuxIconView tuxIconView5 = this.LJZL;
            if (tuxIconView5 != null) {
                tuxIconView5.setClickable(true);
                TuxIconView tuxIconView6 = this.LJZL;
                if (tuxIconView6 != null) {
                    tuxIconView6.setTag(Boolean.TRUE);
                    return;
                } else {
                    o.LJIJI("mBgModeIcon");
                    throw null;
                }
            }
            o.LJIJI("mBgModeIcon");
            throw null;
        }
        o.LJIJI("mBgModeIcon");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        C147095px c147095px;
        super.onActivityCreated(bundle);
        if (C1280450u.LIZ()) {
            C132005Ga c132005Ga = this.LJLZ;
            if (c132005Ga != null) {
                String uuid = this.LJZ;
                o.LJIIIZ(uuid, "uuid");
                C1551667c c1551667c = (C1551667c) ((ArrayMap) c132005Ga.LJLL).get(uuid);
                if (c1551667c != null) {
                    this.LLIFFJFJJ = c1551667c.getBgColorMode();
                    this.LLII = c1551667c.getAlign();
                    this.LLIIII = c1551667c.getBgColor();
                    String LJIIJJI = C68M.LJIIJ().LJIIJJI(c1551667c.getTypeface());
                    o.LJIIIIZZ(LJIIJJI, "getInstance().getTypeFontName(it.typeface)");
                    this.LLIIIILZ = LJIIJJI;
                }
            }
            VideoPublishEditModel em = em();
            if (em != null) {
                c147095px = new C147095px(new C134665Qg(em, "caption_font_edit_page"));
            } else {
                c147095px = null;
            }
            this.LLIIIZ = c147095px;
            EditorProContext Jl = Jl();
            InlineCaptionFontViewModel inlineCaptionFontViewModel = (InlineCaptionFontViewModel) Ml();
            NLEModel LJJI = C79057V0z.LJJI(Jl);
            inlineCaptionFontViewModel.getClass();
            ArrayList arrayList = new ArrayList();
            NLETrack LIZLLL = C5FC.LIZLLL(LJJI);
            if (LIZLLL != null) {
                Iterator<NLETrackSlot> it = LIZLLL.LJIILL().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getUUID());
                }
            }
            inlineCaptionFontViewModel.LJLIL = arrayList;
            this.LLFF = this.LLIFFJFJJ;
            this.LLFII = this.LLII;
            this.LLFZ = this.LLIIII;
            om();
            mm();
            if (!ORY.LJJIJ(this.LLFZ, C1556068u.LJLLILLLL)) {
                C1556068u c1556068u = this.LLF;
                if (c1556068u != null) {
                    c1556068u.LIZ(this.LLFZ);
                } else {
                    o.LJIJI("mSelectColorLayout");
                    throw null;
                }
            }
            C1556068u c1556068u2 = this.LLF;
            if (c1556068u2 != null) {
                c1556068u2.setDefault(this.LLFZ);
                C68M.LJIIJ().LJIJJLI(1, this.LLIIIILZ);
                C1554968j c1554968j = this.LLD;
                if (c1554968j != null) {
                    c1554968j.LIZJ();
                    nm(C68M.LJIIJ().LJFF(1));
                    return;
                } else {
                    o.LJIJI("mSelectFontLayout");
                    throw null;
                }
            }
            o.LJIJI("mSelectColorLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Nl();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.c55);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(4);
        }
        km();
    }

    public InlineCaptionFontFragment(C132005Ga c132005Ga, String uuid, String str) {
        o.LJIIIZ(uuid, "uuid");
        this.LLIIJI = new LinkedHashMap();
        this.LJLZ = c132005Ga;
        this.LJZ = uuid;
        this.LJZI = str;
        this.LLFF = 1;
        this.LLFFF = -1;
        this.LLFII = 2;
        this.LLFZ = -1;
        this.LLIFFJFJJ = 1;
        this.LLII = 2;
        this.LLIIII = -1;
        this.LLIIIILZ = "default";
        this.LLIIIL = true;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (onCreateView != null) {
            View findViewById = onCreateView.findViewById(R.id.faq);
            o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.iv_stroke)");
            this.LJZL = (TuxIconView) findViewById;
            View findViewById2 = onCreateView.findViewById(R.id.exk);
            o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.iv_align_txt)");
            this.LL = (TuxIconView) findViewById2;
            View findViewById3 = onCreateView.findViewById(R.id.bi_);
            o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.color_layout)");
            this.LLF = (C1556068u) findViewById3;
            View findViewById4 = onCreateView.findViewById(R.id.dln);
            o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.font_layout)");
            ViewGroup viewGroup2 = (ViewGroup) findViewById4;
            C1554968j LIZ = C1554968j.LIZ(1, getContext());
            this.LLD = LIZ;
            LIZ.LIZIZ(C68M.LJIIJ().LJIIIZ());
            C68M.LJIIJ().LJ = new InterfaceC1549866k() { // from class: X.5yZ
                @Override // X.InterfaceC1549866k
                public final void accept(Object obj) {
                    C2VQ.LIZIZ(new AqS149S0200000_2(InlineCaptionFontFragment.this, (InlineCaptionFontFragment) obj, (List<TextFontStyleData>) 51), 0L);
                }
            };
            C1554968j c1554968j = this.LLD;
            if (c1554968j != null) {
                viewGroup2.addView(c1554968j);
                IDlS62S0100000_2 iDlS62S0100000_2 = new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 31);
                this.LLI = iDlS62S0100000_2;
                TuxIconView tuxIconView = this.LJZL;
                if (tuxIconView != null) {
                    C16880lQ.LJJJ(tuxIconView, iDlS62S0100000_2);
                    TuxIconView tuxIconView2 = this.LL;
                    if (tuxIconView2 != null) {
                        IDlS62S0100000_2 iDlS62S0100000_22 = this.LLI;
                        if (iDlS62S0100000_22 != null) {
                            C16880lQ.LJJJ(tuxIconView2, iDlS62S0100000_22);
                            C1556068u c1556068u = this.LLF;
                            if (c1556068u != null) {
                                c1556068u.setColorChangeListener(new InterfaceC1556368x() { // from class: X.5yX
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // X.InterfaceC1556368x
                                    public final void LIZ(int i) {
                                        NLETrackSlot LJ;
                                        String inlineStylesStr;
                                        InlineCaptionFontFragment inlineCaptionFontFragment = InlineCaptionFontFragment.this;
                                        if (inlineCaptionFontFragment.LLIIIL) {
                                            inlineCaptionFontFragment.LLIIIL = false;
                                            return;
                                        }
                                        inlineCaptionFontFragment.LLIIIJ = true;
                                        inlineCaptionFontFragment.LLFZ = i;
                                        EditorProContext Jl = inlineCaptionFontFragment.Jl();
                                        InlineCaptionFontFragment inlineCaptionFontFragment2 = InlineCaptionFontFragment.this;
                                        InlineCaptionFontViewModel inlineCaptionFontViewModel = (InlineCaptionFontViewModel) inlineCaptionFontFragment2.Ml();
                                        C132005Ga c132005Ga = inlineCaptionFontFragment2.LJLZ;
                                        NLEModel LJJI = C79057V0z.LJJI(Jl);
                                        inlineCaptionFontViewModel.getClass();
                                        NLETrack LIZLLL = C5FC.LIZLLL(LJJI);
                                        if (LIZLLL != null) {
                                            Iterator<NLETrackSlot> it = LIZLLL.LJIILL().iterator();
                                            while (it.hasNext()) {
                                                it.next().setExtra("color", String.valueOf(i));
                                            }
                                        }
                                        if (c132005Ga != null) {
                                            List<String> uuidList = inlineCaptionFontViewModel.LJLIL;
                                            o.LJIIIZ(uuidList, "uuidList");
                                            Iterator it2 = ((ArrayList) uuidList).iterator();
                                            while (it2.hasNext()) {
                                                String str = (String) it2.next();
                                                C1551667c c1551667c = (C1551667c) ((ArrayMap) c132005Ga.LJLL).get(str);
                                                if (c1551667c != null) {
                                                    if (C138865cg.LIZ()) {
                                                        Editable editableText = c1551667c.getEditableText();
                                                        o.LJIIIIZZ(editableText, "editableText");
                                                        if (C157136Er.LIZIZ(editableText) && (LJ = C5FC.LJ(str, c132005Ga.LJLLLL)) != null && (inlineStylesStr = LJ.getExtra("text_inline_styles")) != null && inlineStylesStr.length() != 0) {
                                                            o.LJIIIIZZ(inlineStylesStr, "inlineStylesStr");
                                                            List LLJILJILJ = ORZ.LLJILJILJ(C152425yY.LIZ(inlineStylesStr));
                                                            ArrayList arrayList = (ArrayList) LLJILJILJ;
                                                            if ((!arrayList.isEmpty()) && !arrayList.isEmpty()) {
                                                                Iterator it3 = arrayList.iterator();
                                                                while (true) {
                                                                    if (!it3.hasNext()) {
                                                                        break;
                                                                    }
                                                                    if (((InlineRichTextStyleData) it3.next()).inlineStyle instanceof TypefaceStyle) {
                                                                        ListIterator listIterator = arrayList.listIterator();
                                                                        while (listIterator.hasNext()) {
                                                                            if (((InlineRichTextStyleData) listIterator.next()).inlineStyle instanceof TypefaceStyle) {
                                                                                listIterator.remove();
                                                                            }
                                                                        }
                                                                        LJ.setExtra("text_inline_styles", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), LLJILJILJ));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    c1551667c.LJIIIIZZ(c1551667c.getBgColorMode(), i);
                                                }
                                            }
                                        }
                                        InlineCaptionFontFragment inlineCaptionFontFragment3 = InlineCaptionFontFragment.this;
                                        C147095px c147095px = inlineCaptionFontFragment3.LLIIIZ;
                                        if (c147095px != null) {
                                            c147095px.LJ(i, 1, "caption", inlineCaptionFontFragment3.LJZI, false);
                                        }
                                    }
                                });
                                C1554968j c1554968j2 = this.LLD;
                                if (c1554968j2 != null) {
                                    c1554968j2.setClickFontStyleListener(new InterfaceC1555668q() { // from class: X.5yW
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // X.InterfaceC1555668q
                                        public final void LIZ(TextFontStyleData textFontStyleData) {
                                            NLETrackSlot LJ;
                                            String inlineStylesStr;
                                            if (textFontStyleData == null) {
                                                return;
                                            }
                                            InlineCaptionFontFragment inlineCaptionFontFragment = InlineCaptionFontFragment.this;
                                            inlineCaptionFontFragment.LLIIIJ = true;
                                            inlineCaptionFontFragment.nm(textFontStyleData);
                                            C68M LJIIJ = C68M.LJIIJ();
                                            String str = textFontStyleData.fileName;
                                            InlineCaptionFontFragment.this.getClass();
                                            LJIIJ.LJIJJLI(1, str);
                                            EditorProContext Jl = InlineCaptionFontFragment.this.Jl();
                                            InlineCaptionFontFragment inlineCaptionFontFragment2 = InlineCaptionFontFragment.this;
                                            InlineCaptionFontViewModel inlineCaptionFontViewModel = (InlineCaptionFontViewModel) inlineCaptionFontFragment2.Ml();
                                            Typeface LJ2 = C68M.LJIIJ().LJ(1);
                                            o.LJIIIIZZ(LJ2, "getInstance().getCurSelectTypeface(getScene())");
                                            int i = inlineCaptionFontFragment2.LLFF;
                                            String str2 = textFontStyleData.fileName;
                                            o.LJIIIIZZ(str2, "type.fileName");
                                            C132005Ga c132005Ga = inlineCaptionFontFragment2.LJLZ;
                                            NLEModel LJJI = C79057V0z.LJJI(Jl);
                                            inlineCaptionFontViewModel.getClass();
                                            NLETrack LIZLLL = C5FC.LIZLLL(LJJI);
                                            if (LIZLLL != null) {
                                                Iterator<NLETrackSlot> it = LIZLLL.LJIILL().iterator();
                                                while (it.hasNext()) {
                                                    NLETrackSlot next = it.next();
                                                    next.setExtra("font_type", str2);
                                                    next.setExtra("bg_mode", String.valueOf(i));
                                                }
                                            }
                                            if (c132005Ga != null) {
                                                List<String> uuidList = inlineCaptionFontViewModel.LJLIL;
                                                o.LJIIIZ(uuidList, "uuidList");
                                                Iterator it2 = ((ArrayList) uuidList).iterator();
                                                while (it2.hasNext()) {
                                                    String str3 = (String) it2.next();
                                                    C1551667c c1551667c = (C1551667c) ((ArrayMap) c132005Ga.LJLL).get(str3);
                                                    if (c1551667c != null) {
                                                        if (C138865cg.LIZ()) {
                                                            Editable editableText = c1551667c.getEditableText();
                                                            o.LJIIIIZZ(editableText, "editableText");
                                                            if (C157136Er.LIZJ(editableText) && (LJ = C5FC.LJ(str3, c132005Ga.LJLLLL)) != null && (inlineStylesStr = LJ.getExtra("text_inline_styles")) != null && inlineStylesStr.length() != 0) {
                                                                o.LJIIIIZZ(inlineStylesStr, "inlineStylesStr");
                                                                List LLJILJILJ = ORZ.LLJILJILJ(C152425yY.LIZ(inlineStylesStr));
                                                                ArrayList arrayList = (ArrayList) LLJILJILJ;
                                                                if ((!arrayList.isEmpty()) && !arrayList.isEmpty()) {
                                                                    Iterator it3 = arrayList.iterator();
                                                                    while (true) {
                                                                        if (!it3.hasNext()) {
                                                                            break;
                                                                        }
                                                                        if (((InlineRichTextStyleData) it3.next()).inlineStyle instanceof ForegroundColorStyle) {
                                                                            C152425yY.LIZIZ(LLJILJILJ);
                                                                            LJ.setExtra("text_inline_styles", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), LLJILJILJ));
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        c1551667c.setFontType(LJ2);
                                                        c1551667c.LJIIIIZZ(c1551667c.getBgColorMode(), c1551667c.getBgColor());
                                                    }
                                                }
                                            }
                                            InlineCaptionFontFragment inlineCaptionFontFragment3 = InlineCaptionFontFragment.this;
                                            o.LJIIIIZZ(textFontStyleData.fileName, "type.fileName");
                                            inlineCaptionFontFragment3.getClass();
                                            InlineCaptionFontFragment inlineCaptionFontFragment4 = InlineCaptionFontFragment.this;
                                            C147095px c147095px = inlineCaptionFontFragment4.LLIIIZ;
                                            if (c147095px != null) {
                                                C139685e0.LIZIZ(c147095px, textFontStyleData, 1, "caption", inlineCaptionFontFragment4.LJZI, false, 16);
                                            }
                                        }
                                    });
                                } else {
                                    o.LJIJI("mSelectFontLayout");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mSelectColorLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("debounceOnClickListener");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mAlignIcon");
                        throw null;
                    }
                } else {
                    o.LJIJI("mBgModeIcon");
                    throw null;
                }
            } else {
                o.LJIJI("mSelectFontLayout");
                throw null;
            }
        }
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return onCreateView;
    }
}
