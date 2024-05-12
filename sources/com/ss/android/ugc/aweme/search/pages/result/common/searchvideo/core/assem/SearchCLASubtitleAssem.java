package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C214298b3;
import X.C214348b8;
import X.C2317697s;
import X.C26015AIx;
import X.C2K0;
import X.C34110Da6;
import X.C34263DcZ;
import X.C48743JBb;
import X.C48881JGj;
import X.C49080JOa;
import X.C49081JOb;
import X.C49082JOc;
import X.C49083JOd;
import X.C49084JOe;
import X.C49085JOf;
import X.C49087JOh;
import X.C49088JOi;
import X.C49092JOm;
import X.C49105JOz;
import X.C49581Jd3;
import X.C50560Jsq;
import X.C55096Ljo;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C86670Xzu;
import X.C8XO;
import X.C8YN;
import X.C9B0;
import X.C9B1;
import X.C9BD;
import X.EnumC48742JBa;
import X.InterfaceC49103JOx;
import X.InterfaceC55102Lju;
import X.JGN;
import X.JJR;
import X.JOT;
import X.JOU;
import X.JP5;
import X.JQA;
import X.LFH;
import X.TB5;
import X.TB7;
import X.TBT;
import X.X1D;
import X.Y04;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel.SearchEllipsisVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchTranslationVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.ss.android.ugc.aweme.translation.service.TranslationKevaServiceImpl;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS32S0001000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCLASubtitleAssem extends ReusedUIContentAssem implements ISearchCLASubtitleAbility, C8XO, InterfaceC55102Lju {
    public final C5H3 LJZL;
    public final C5H3 LL;
    public final C5H3 LLD;
    public final C214298b3 LLF;
    public JJR LLFF;
    public Aweme LLFFF;
    public long LLFII;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1141746704) {
            return null;
        }
        return this;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchCLASubtitleAssem() {
        new LinkedHashMap();
        this.LJZL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchCLASubtitleVM.class), C49087JOh.INSTANCE);
        this.LL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchTranslationVM.class), C9B1.INSTANCE);
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchVideoHolderVM.class), C49088JOi.INSTANCE);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchEllipsisVM.class);
        this.LLF = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 788), C2317697s.INSTANCE, null);
        this.LLFII = Long.MAX_VALUE;
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new JP5(this, null));
    }

    public final SearchCLASubtitleVM Z3() {
        return (SearchCLASubtitleVM) this.LJZL.getValue();
    }

    public final SearchTranslationVM a4() {
        return (SearchTranslationVM) this.LL.getValue();
    }

    public final SearchVideoHolderVM b4() {
        return (SearchVideoHolderVM) this.LLD.getValue();
    }

    public final void c4() {
        JJR jjr = this.LLFF;
        if (jjr != null) {
            jjr.setVisibility(8);
        } else {
            o.LJIJI("subtitleView");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.ISearchCLASubtitleAbility
    public final Integer d50() {
        if (this.LLFFF == null) {
            return null;
        }
        if (a4().LJLILLLLZI && !TranslationKevaServiceImpl.LJIIL().LIZ() && !C50560Jsq.LIZLLL()) {
            return Integer.valueOf(C50560Jsq.LIZIZ(this.LLFFF));
        }
        if (!C50560Jsq.LIZLLL()) {
            return null;
        }
        return Integer.valueOf(Y04.LJ(this.LLFFF));
    }

    public final void g4() {
        C48881JGj yv;
        ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVideoHolderAbility.class, null);
        if (iSearchVideoHolderAbility == null || (yv = iSearchVideoHolderAbility.yv()) == null) {
            return;
        }
        yv.LJJIII = true;
        yv.LJJII = a4().LJLILLLLZI;
        yv.LJJIIJ = a4().LJLILLLLZI;
    }

    public final void k4() {
        Aweme aweme;
        Video video;
        CaptionModel captionModel;
        if ((!a4().LJLILLLLZI && (aweme = this.LLFFF) != null && (video = aweme.getVideo()) != null && (captionModel = video.getCaptionModel()) != null && o.LJ(captionModel.getHideOriginalCaption(), Boolean.TRUE)) || b4().LJLILLLLZI) {
            return;
        }
        C48743JBb c48743JBb = EnumC48742JBa.Companion;
        int LIZIZ = C49581Jd3.LIZIZ();
        c48743JBb.getClass();
        EnumC48742JBa enumC48742JBa = EnumC48742JBa.stateValueMap.get(Integer.valueOf(LIZIZ));
        if (enumC48742JBa != null) {
            Z3().iv0(enumC48742JBa);
        }
        JJR jjr = this.LLFF;
        if (jjr != null) {
            jjr.setVisibility(0);
        } else {
            o.LJIJI("subtitleView");
            throw null;
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    public final void F0(Object obj) {
        C49105JOz item = (C49105JOz) obj;
        o.LJIIIZ(item, "item");
        this.LLFFF = item.LJLIL;
        a4().LJLILLLLZI = false;
        C48743JBb c48743JBb = EnumC48742JBa.Companion;
        int LIZIZ = C49581Jd3.LIZIZ();
        c48743JBb.getClass();
        EnumC48742JBa enumC48742JBa = EnumC48742JBa.stateValueMap.get(Integer.valueOf(LIZIZ));
        if (enumC48742JBa != null) {
            Z3().iv0(enumC48742JBa);
        }
        JJR jjr = this.LLFF;
        if (jjr != null) {
            jjr.setText("");
            c4();
            JJR jjr2 = this.LLFF;
            if (jjr2 != null) {
                jjr2.setMaxLine(((Number) C34110Da6.LIZ.getValue()).intValue());
                e4(item.LJLIL);
                this.LLFII = Long.MAX_VALUE;
                g4();
                return;
            }
            o.LJIJI("subtitleView");
            throw null;
        }
        o.LJIJI("subtitleView");
        throw null;
    }

    @Override // X.C8XO
    public final boolean c2(Object obj) {
        C49105JOz item = (C49105JOz) obj;
        o.LJIIIZ(item, "item");
        return C49092JOm.LIZIZ(item.LJLIL, b4().LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.9B2] */
    public final void e4(Aweme aweme) {
        boolean z;
        String str;
        Integer num;
        String str2;
        CaptionModel captionModel;
        CaptionLanguage originalCaptionLanguage;
        if (((Number) C34263DcZ.LIZ.getValue()).intValue() == 2 && LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean LIZLLL = C26015AIx.LIZLLL();
        boolean LJI = TranslationKevaServiceImpl.LJIIL().LJI(C26015AIx.LIZ());
        if (!z ? !(!LIZLLL || !LJI) : !(LIZLLL && !LJI)) {
            CaptionLanguage LIZ = C50560Jsq.LIZ(aweme);
            String str3 = null;
            if (LIZ != null) {
                str = LIZ.getLanguageCode();
            } else {
                str = null;
            }
            if (!C50560Jsq.LJ(str)) {
                a4().LJLILLLLZI = false;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getAwemeSubtitleLanguage:");
                CaptionLanguage LIZ3 = C50560Jsq.LIZ(aweme);
                if (LIZ3 != null) {
                    str3 = LIZ3.getLanguageCode();
                }
                LIZ2.append(str3);
                LIZ2.append(" TargetLanguage: ");
                LIZ2.append(C50560Jsq.LIZJ());
                LIZ2.append(" aid:");
                LIZ2.append(aweme.getAid());
                X1D.LIZIZ(LIZ2);
                SearchVideoHolderVM b4 = b4();
                int LIZIZ = C50560Jsq.LIZIZ(aweme);
                b4.getClass();
                b4.setState(new AqS32S0001000_8(LIZIZ, 6));
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("captionList.size:");
            List<CaptionItemModel> captionList = aweme.getVideo().getCaptionModel().getCaptionList();
            if (captionList != null) {
                num = Integer.valueOf(captionList.size());
            } else {
                num = null;
            }
            LIZ4.append(num);
            LIZ4.append(" aid:");
            LIZ4.append(aweme.getAid());
            X1D.LIZIZ(LIZ4);
            List<CaptionItemModel> captionList2 = aweme.getVideo().getCaptionModel().getCaptionList();
            if (captionList2 != null) {
                Iterator<CaptionItemModel> it = captionList2.iterator();
                while (it.hasNext()) {
                    if (o.LJ(it.next().getLanguageCode(), C50560Jsq.LIZJ())) {
                        SearchVideoHolderVM b42 = b4();
                        int LJ = Y04.LJ(aweme);
                        b42.getClass();
                        b42.setState(new AqS32S0001000_8(LJ, 6));
                        a4().LJLILLLLZI = true;
                        return;
                    }
                }
            }
            a4().getClass();
            Long LJIIJ = C86670Xzu.LJIIJ(aweme);
            String LIZJ = C50560Jsq.LIZJ();
            if (LJIIJ != null) {
                LJIIJ.longValue();
                if (TranslationServiceImpl.LJJIJ().LJJIIJ().LIZ(LJIIJ.longValue(), LIZJ)) {
                    int LIZIZ2 = TranslationServiceImpl.LJJIJ().LJJIIJ().LIZIZ(LJIIJ.longValue(), LIZJ);
                    TB5 LIZLLL2 = TranslationServiceImpl.LJJIJ().LJJIIJ().LIZLLL(LJIIJ.longValue(), LIZJ, false);
                    if (LIZLLL2 != null) {
                        JGN jgn = new JGN(LIZIZ2, SearchTranslationVM.hv0(LIZIZ2, aweme, LIZLLL2));
                        SearchVideoHolderVM b43 = b4();
                        b43.getClass();
                        b43.setState(new AqS174S0100000_8(jgn, 254));
                        SearchVideoHolderVM b44 = b4();
                        int i = jgn.LJLIL;
                        b44.getClass();
                        b44.setState(new AqS32S0001000_8(i, 6));
                        a4().LJLILLLLZI = true;
                        return;
                    }
                    "Translation Cache must exist".toString();
                    throw new IllegalArgumentException("Translation Cache must exist");
                }
            }
            a4().LJLILLLLZI = true;
            final SearchTranslationVM a4 = a4();
            JQA jqa = b4().LJLJI;
            if (jqa != null) {
                str2 = jqa.LJFF;
            } else {
                str2 = null;
            }
            a4.getClass();
            a4.setState(C9B0.LJLIL);
            Long LJIIJ2 = C86670Xzu.LJIIJ(aweme);
            Video video = aweme.getVideo();
            if (video != null && (captionModel = video.getCaptionModel()) != null && (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) != null) {
                str3 = originalCaptionLanguage.getLanguageCode();
            }
            if (LJIIJ2 != null) {
                LJIIJ2.longValue();
                if (str3 == null) {
                    return;
                }
                InterfaceC49103JOx LJJIIJ = TranslationServiceImpl.LJJIJ().LJJIIJ();
                long longValue = LJIIJ2.longValue();
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                LJJIIJ.LIZJ(longValue, aid, str3, C50560Jsq.LIZJ(), str2, new TB7() { // from class: X.9B2
                    @Override // X.TB7
                    public final void LIZ(Throwable throwable) {
                        o.LJIIIZ(throwable, "throwable");
                        SearchTranslationVM.this.setState(new AqS170S0100000_4(throwable, 1426));
                    }

                    @Override // X.TB7
                    public final void LIZIZ(TB5 tb5) {
                        SearchTranslationVM.this.setState(new AqS170S0100000_4(tb5, 1427));
                    }
                });
                return;
            }
            return;
        }
        SearchVideoHolderVM b45 = b4();
        int LIZIZ3 = C50560Jsq.LIZIZ(aweme);
        b45.getClass();
        b45.setState(new AqS32S0001000_8(LIZIZ3, 6));
        a4().LJLILLLLZI = false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (!(view instanceof JJR)) {
            return;
        }
        JJR jjr = (JJR) view;
        this.LLFF = jjr;
        jjr.setDelegate(new JOT(jjr, this));
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.JOW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((JOV) obj).LJLILLLLZI;
            }
        }, null, JOU.LJLIL, 6);
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.JOY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((JOV) obj).LJLJI;
            }
        }, null, C49080JOa.LJLIL, 6);
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.JOl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((JOV) obj).LJLJJI;
            }
        }, null, C49085JOf.LJLIL, 6);
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.JOX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((JOV) obj).LJLJJL;
            }
        }, null, C49084JOe.LJLIL, 6);
        AssemViewModel.asyncSubscribe$default(a4(), new TBT() { // from class: X.9Az
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C232609Ay) obj).LJLIL;
            }
        }, null, new AqS174S0100000_8(this, 87), null, new AqS174S0100000_8(this, 88), 10, null);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.JOj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C49052JMy) obj).LJLIL;
            }
        }, null, C49081JOb.LJLIL, 6);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.JOk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C49052JMy) obj).LJLILLLLZI;
            }
        }, null, C49082JOc.LJLIL, 6);
        C8YN.LJII(this, this.LLF.getValue(), new TBT() { // from class: X.93h
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92S) obj).LJLIL;
            }
        }, null, C49083JOd.LJLIL, 6);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
    }
}
