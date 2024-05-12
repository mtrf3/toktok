package X;

import Y.AObserverS70S0100000_2;
import android.graphics.RectF;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5yz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152695yz extends AbstractC48231ut<InterfaceC146175oT, C152825zC, C152775z7, C73292uD> implements InterfaceC146175oT, InterfaceC135635Tz {
    public static final C139665dy LLFII;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final C5H3 LJLLILLLL;
    public final C5H3 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final AICaptionNetworkModule LJZ;
    public boolean LJZI;
    public List<String> LJZL;
    public int LL;
    public boolean LLD;
    public boolean LLF;
    public InterfaceC79150V4o LLFF;
    public final InterfaceC65784Pro<C152825zC> LLFFF;

    static {
        TBT tbt = new TBT(C152695yz.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt, new TBT(C152695yz.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new TBT(C152695yz.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C152695yz.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};
        LLFII = new C139665dy();
    }

    private final InterfaceC153275zv LLJJ() {
        return (InterfaceC153275zv) this.LJLLLL.LIZ(this, LLFZ[1]);
    }

    private final void LLJJIJIL() {
        if (this.LLD) {
            return;
        }
        this.LLD = true;
        InterfaceC139535dl Sj = Sj();
        if (Sj != null) {
            Sj.LLLILZJ(new InterfaceC160026Pu() { // from class: X.5z0
                @Override // X.InterfaceC160026Pu
                public final void LJ(int i) {
                }

                @Override // X.InterfaceC160026Pu
                public final void LJI(int i) {
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIJJLI(int i) {
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIL(int i) {
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIIJ() {
                    C152695yz.this.LLJJL();
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIJJ() {
                    C152695yz.this.LLJJL();
                }

                @Override // X.InterfaceC160026Pu
                public final void LIZIZ(StickerModel stickerModel) {
                    TextStickerModel textStickerModel;
                    InterfaceC152865zG I00;
                    o.LJIIIZ(stickerModel, "stickerModel");
                    if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && u.LJIILLIIL(textStickerModel)) {
                        C159646Oi LLILZIL = C152695yz.this.LLILZIL();
                        if (LLILZIL != null) {
                            LLILZIL.LJIIIZ(false, LLILZIL.LJIJJ());
                            LLILZIL.setVisible(false);
                        }
                        InterfaceC139535dl Sj2 = C152695yz.this.Sj();
                        if (Sj2 != null && (I00 = Sj2.I00()) != null) {
                            I00.LJIJJ();
                        }
                    }
                }

                @Override // X.InterfaceC160026Pu
                public final void LIZJ(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.InterfaceC160026Pu
                public final void LIZLLL(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.InterfaceC160026Pu
                public final void LJFF(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.InterfaceC160026Pu
                public final void LJII(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIIIIZZ(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIIIZ(StickerModel stickerModel) {
                    TextStickerModel textStickerModel;
                    InterfaceC139535dl Sj2;
                    InterfaceC152865zG I00;
                    o.LJIIIZ(stickerModel, "stickerModel");
                    if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && u.LJIILLIIL(textStickerModel) && (Sj2 = C152695yz.this.Sj()) != null && (I00 = Sj2.I00()) != null) {
                        I00.LJIIZILJ();
                    }
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIIJJI(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIIL(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIILIIL(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIILJJIL(int i) {
                    TextStickerModel LLIIZ = C152695yz.this.LLIIZ();
                    if (LLIIZ != null && LLIIZ.getId() == i) {
                        C152695yz.this.LJZI();
                        C152695yz.this.LLF();
                        C159646Oi LLILZIL = C152695yz.this.LLILZIL();
                        if (LLILZIL != null) {
                            LLILZIL.LJIIIZ(true, LLILZIL.LJIJJ());
                        }
                    }
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIILL(StickerModel stickerModel) {
                    TextStickerModel textStickerModel;
                    o.LJIIIZ(stickerModel, "stickerModel");
                    if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && u.LJIILLIIL(textStickerModel)) {
                        C152695yz.this.LJZI();
                        C152695yz.this.LLF();
                    }
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIIZILJ(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIJI(StickerModel stickerModel) {
                    TextStickerModel textStickerModel;
                    InterfaceC139535dl Sj2;
                    InterfaceC152865zG I00;
                    o.LJIIIZ(stickerModel, "stickerModel");
                    if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && u.LJIILLIIL(textStickerModel) && (Sj2 = C152695yz.this.Sj()) != null && (I00 = Sj2.I00()) != null) {
                        I00.LJIJJ();
                    }
                }

                @Override // X.InterfaceC160026Pu
                public final void LIZ(StickerModel stickerModel, boolean z) {
                    TextStickerModel textStickerModel;
                    o.LJIIIZ(stickerModel, "stickerModel");
                    if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && u.LJIILLIIL(textStickerModel)) {
                        C152695yz.this.LJZI();
                        C152695yz.this.LLF();
                        C159646Oi LLILZIL = C152695yz.this.LLILZIL();
                        if (LLILZIL != null) {
                            LLILZIL.LJIIIZ(true, LLILZIL.LJIJJ());
                            LLILZIL.setVisible(true);
                        }
                        C139665dy c139665dy = C152695yz.LLFII;
                        InterfaceC139045cy LLJI = C152695yz.this.LLJI();
                        InterfaceC139535dl Sj2 = C152695yz.this.Sj();
                        c139665dy.getClass();
                        C139665dy.LIZ(LLJI, Sj2);
                    }
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIILLIIL(StickerModel stickerModel, String str) {
                    TextStickerModel textStickerModel;
                    InterfaceC139535dl Sj2;
                    List<StickerModel> sk0;
                    StickerModel stickerModel2;
                    InterfaceC152865zG I00;
                    o.LJIIIZ(stickerModel, "stickerModel");
                    if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && u.LJIILLIIL(textStickerModel) && (Sj2 = C152695yz.this.Sj()) != null && (sk0 = Sj2.sk0(EnumC157656Gr.AI_CAPTION_TAG)) != null && (stickerModel2 = (StickerModel) ORZ.LJLLLLLL(0, sk0)) != null) {
                        InterfaceC139535dl Sj3 = C152695yz.this.Sj();
                        if (Sj3 != null) {
                            Sj3.Zp(stickerModel2.getId());
                        }
                        InterfaceC139535dl Sj4 = C152695yz.this.Sj();
                        if (Sj4 != null && (I00 = Sj4.I00()) != null) {
                            I00.LJIJJ();
                        }
                    }
                }

                @Override // X.InterfaceC160026Pu
                public final void LJIJ(StickerModel stickerModel, int i) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }
            });
        }
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C73292uD> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 67);
    }

    public final InterfaceC143655kP LLJ() {
        return (InterfaceC143655kP) this.LJLZ.LIZ(this, LLFZ[3]);
    }

    public final InterfaceC139045cy LLJI() {
        return (InterfaceC139045cy) this.LJLLILLLL.getValue();
    }

    public final VideoPublishEditModel LLJJI() {
        return (VideoPublishEditModel) this.LJLLLLLL.LIZ(this, LLFZ[2]);
    }

    public final InterfaceC153275zv LLJJIII() {
        return (InterfaceC153275zv) this.LJLLL.LIZ(this, LLFZ[0]);
    }

    public final void LLJJL() {
        if (this.LJZL.isEmpty()) {
            return;
        }
        if (this.LL >= this.LJZL.size()) {
            this.LL = 0;
        }
        LJLZ((String) ListProtector.get(this.LJZL, this.LL));
        this.LL++;
        LLLFFI();
    }

    public final void LLJLLIL() {
        List<StickerModel> sk0;
        StickerModel stickerModel;
        InterfaceC152865zG I00;
        List<C6QO> LLIIJLIL;
        InterfaceC139535dl Sj;
        TextStickerModel textStickerModel;
        InterfaceC79150V4o interfaceC79150V4o = this.LLFF;
        C6QO c6qo = null;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
        LLJZIJLIL();
        InterfaceC139535dl Sj2 = Sj();
        if (Sj2 != null && (LLIIJLIL = Sj2.LLIIJLIL(EnumC157656Gr.TEXT)) != null) {
            Iterator<C6QO> it = LLIIJLIL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6QO next = it.next();
                StickerModel LIZ = next.LIZ();
                if ((LIZ instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) LIZ) != null && u.LJIILLIIL(textStickerModel)) {
                    c6qo = next;
                    break;
                }
            }
            C6QO c6qo2 = c6qo;
            if (c6qo2 != null && (Sj = Sj()) != null) {
                Sj.Zp(c6qo2.LJJLIIIJLJLI());
            }
        }
        InterfaceC139535dl Sj3 = Sj();
        if (Sj3 != null && (sk0 = Sj3.sk0(EnumC157656Gr.AI_CAPTION_TAG)) != null && (stickerModel = (StickerModel) ORZ.LJLLLLLL(0, sk0)) != null) {
            InterfaceC139535dl Sj4 = Sj();
            if (Sj4 != null) {
                Sj4.Zp(stickerModel.getId());
            }
            InterfaceC139535dl Sj5 = Sj();
            if (Sj5 != null && (I00 = Sj5.I00()) != null) {
                I00.LJIJJ();
            }
        }
    }

    public final void LLJZIJLIL() {
        LJJZZI(C152755z5.LJLIL);
    }

    public final InterfaceC139535dl Sj() {
        return (InterfaceC139535dl) this.LJLLJ.getValue();
    }

    private final AICaptionTagStickerModel LLILZLL() {
        List<StickerModel> sk0;
        StickerModel stickerModel;
        InterfaceC139535dl Sj = Sj();
        if (Sj == null || (sk0 = Sj.sk0(EnumC157656Gr.AI_CAPTION_TAG)) == null || (stickerModel = (StickerModel) ORZ.LJLLLLLL(0, sk0)) == null || !(stickerModel instanceof AICaptionTagStickerModel)) {
            return null;
        }
        return (AICaptionTagStickerModel) stickerModel;
    }

    private final String LLIZ() {
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        CreativeInfo creativeInfo = LLJJI().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        String path = new File(LJ.LJIIJ(creativeInfo, EnumC43650HBe.SYNTHESISE, "ai_caption_local", true), C43075GvP.LIZ(".png")).getAbsolutePath();
        o.LJIIIIZZ(path, "path");
        return path;
    }

    private final void LLJJIJI() {
        LiveData<Integer> qa;
        LLJ().wf0().observe(this, new AObserverS70S0100000_2(this, 17));
        InterfaceC153275zv LLJJ = LLJJ();
        if (LLJJ != null && (qa = LLJJ.qa()) != null) {
            qa.observe(this, new AObserverS70S0100000_2(this, 18));
        }
    }

    private final void LLLFFI() {
        StickerNewEngineModel stickerNewEngineModel = LLJJI().creativeModel.stickerModel;
        List<String> list = this.LJZL;
        stickerNewEngineModel.getClass();
        o.LJIIIZ(list, "<set-?>");
        stickerNewEngineModel.aiCaptionShuffleTexts = list;
        LLJJI().creativeModel.stickerModel.aiCaptionShuffleIndex = this.LL;
    }

    private final void LLLFZ() {
        if (LLJJI().mIsFromDraft) {
            this.LJZL = LLJJI().creativeModel.stickerModel.aiCaptionShuffleTexts;
            this.LL = LLJJI().creativeModel.stickerModel.aiCaptionShuffleIndex;
        }
    }

    public final void LJZI() {
        List<C6QO> LLIIJLIL;
        TextStickerModel textStickerModel;
        List<StickerModel> sk0;
        StickerModel stickerModel;
        InterfaceC139535dl Sj = Sj();
        if (Sj != null && (LLIIJLIL = Sj.LLIIJLIL(EnumC157656Gr.TEXT)) != null) {
            for (C6QO c6qo : LLIIJLIL) {
                StickerModel LIZ = c6qo.LIZ();
                if ((LIZ instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) LIZ) != null && u.LJIILLIIL(textStickerModel)) {
                    if (c6qo == null) {
                        return;
                    }
                    InterfaceC139535dl Sj2 = Sj();
                    if (Sj2 == null || (sk0 = Sj2.sk0(EnumC157656Gr.AI_CAPTION_TAG)) == null || (stickerModel = (StickerModel) ORZ.LJLLLLLL(0, sk0)) == null) {
                        InterfaceC139535dl Sj3 = Sj();
                        if (Sj3 != null) {
                            Sj3.hG(LLIIIL(this, null, 1, null), EnumC157656Gr.AI_CAPTION_TAG);
                        }
                    } else {
                        AICaptionTagStickerModel aICaptionTagStickerModel = (AICaptionTagStickerModel) stickerModel;
                        InterfaceC139535dl Sj4 = Sj();
                        if (Sj4 != null) {
                            Sj4.N8(LLIFFJFJJ(aICaptionTagStickerModel));
                        }
                    }
                    C139665dy c139665dy = LLFII;
                    InterfaceC139045cy LLJI = LLJI();
                    InterfaceC139535dl Sj5 = Sj();
                    c139665dy.getClass();
                    C139665dy.LIZ(LLJI, Sj5);
                    return;
                }
            }
        }
    }

    public final void LLF() {
        InterfaceC152865zG I00;
        InterfaceC139535dl Sj = Sj();
        if (Sj != null && (I00 = Sj.I00()) != null) {
            I00.LJIIZILJ();
        }
    }

    public final TextStickerModel LLIIZ() {
        List<TextStickerModel> RR;
        InterfaceC139045cy LLJI = LLJI();
        TextStickerModel textStickerModel = null;
        if (LLJI == null || (RR = LLJI.RR()) == null) {
            return null;
        }
        Iterator<TextStickerModel> it = RR.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TextStickerModel next = it.next();
            if (u.LJIILLIIL(next)) {
                textStickerModel = next;
                break;
            }
        }
        return textStickerModel;
    }

    public final C159646Oi LLILZIL() {
        List<C6QO> LLIIJLIL;
        C6QO c6qo;
        InterfaceC139535dl Sj = Sj();
        if (Sj == null || (LLIIJLIL = Sj.LLIIJLIL(EnumC157656Gr.AI_CAPTION_TAG)) == null || (c6qo = (C6QO) ORZ.LJLLLLLL(0, LLIIJLIL)) == null || !(c6qo instanceof C159646Oi)) {
            return null;
        }
        return (C159646Oi) c6qo;
    }

    public final InterfaceC68342mE<String> LLJJJIL() {
        return XKX.LIZIZ(LifecycleOwnerKt.getLifecycleScope(this), C78613UtF.LIZJ, null, new C146215oX(this, null), 2);
    }

    public final void LLJLIL() {
        LLJLLIL();
        InterfaceC79150V4o interfaceC79150V4o = this.LLFF;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
        LJJZZI(C152735z3.LJLIL);
        this.LLFF = LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C152725z2(this, null));
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLLFZ();
        LLJJIJI();
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        LLJJIJIL();
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C152775z7> LJJLIIIJJI() {
        return C152765z6.LJLIL;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C152825zC> LJLJJLL() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    private final void LJLZ(final String str) {
        List<TextStickerModel> RR;
        InterfaceC139045cy LLJI = LLJI();
        TextStickerModel textStickerModel = null;
        if (LLJI != null && (RR = LLJI.RR()) != null) {
            Iterator<TextStickerModel> it = RR.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TextStickerModel next = it.next();
                if (u.LJIILLIIL(next)) {
                    textStickerModel = next;
                    break;
                }
            }
            TextStickerModel textStickerModel2 = textStickerModel;
            if (textStickerModel2 != null) {
                LLLI(textStickerModel2, str);
                LJZI();
                LLF();
                return;
            }
        }
        C68M.LJIIJ().LIZIZ("Heavy", new C68O() { // from class: X.5z1
            @Override // X.C68O
            public final void onFail() {
            }

            @Override // X.C68O
            public final void onSuccess() {
            }

            @Override // X.C68O
            public final void LIZ(Boolean bool) {
                bool.booleanValue();
                C152695yz c152695yz = C152695yz.this;
                if (!c152695yz.LJZI || c152695yz.getLifecycle().getCurrentState() != Lifecycle.State.RESUMED) {
                    return;
                }
                C152695yz.this.LLJZIJLIL();
                InterfaceC139045cy LLJI2 = C152695yz.this.LLJI();
                if (LLJI2 != null) {
                    LLJI2.fp(C152695yz.this.LLFFF(str));
                }
                C152695yz.this.LJZI();
                C152695yz.this.LLF();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d4, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel LLIFFJFJJ(com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel r44) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152695yz.LLIFFJFJJ(com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel):com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel");
    }

    private final float LLILL(C6QO c6qo) {
        BaseStickerModel LJIJJ = c6qo.LJIJJ();
        RectF stickerBoundingRect = LJIJJ.getStickerBoundingRect();
        return ((LJIJJ.getTranslateY() + stickerBoundingRect.top) - stickerBoundingRect.centerY()) - C173216qz.LIZJ(8.0d, C78688UuS.LJIJJ(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
    
        if (r7 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r3 != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel LLFFF(java.lang.String r59) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152695yz.LLFFF(java.lang.String):com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r6 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLIILZL(X.InterfaceC67352kd<? super java.lang.String> r17) {
        /*
            r16 = this;
            X.XKg r2 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r17)
            r2.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r16.LLJJI()
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r0.canvasVideoData
            r4 = 0
            r3 = 0
            if (r0 == 0) goto L21
            java.util.List r0 = r0.getSourceInfo()
            if (r0 == 0) goto L21
            java.lang.Object r6 = X.ORZ.LJLLLLLL(r3, r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L41
        L21:
            android.app.Activity r1 = X.C78688UuS.LJIJJ(r16)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r16.LLJJI()
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r0 = r0.mvCreateVideoData
            if (r0 == 0) goto L98
            java.util.ArrayList<java.lang.String> r0 = r0.selectMediaList
            if (r0 == 0) goto L98
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r3, r0)
            java.lang.String r0 = (java.lang.String) r0
        L37:
            android.net.Uri r0 = X.C44694HgQ.LJIIIIZZ(r0)
            java.lang.String r6 = X.C00S.LIZIZ(r1, r0)
            if (r6 == 0) goto L47
        L41:
            int r0 = r6.length()
            if (r0 != 0) goto L4f
        L47:
            X.C78966Uyw.LJJL(r4, r2)
        L4a:
            java.lang.Object r0 = r2.LIZ()
            return r0
        L4f:
            X.5q7 r1 = new X.5q7
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r16.LLJJI()
            r1.<init>(r0)
            int r5 = r1.LIZLLL
            int r4 = r1.LJ
            java.lang.String r11 = r16.LLIZ()
            r3 = 320(0x140, float:4.48E-43)
            float r1 = (float) r3
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            int r1 = (int) r1
            X.5zN r7 = new X.5zN
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r16.LLJJI()
            r7.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = r16.LLJJI()
            com.ss.android.ugc.aweme.image.model.SrcImageInfo r9 = new com.ss.android.ugc.aweme.image.model.SrcImageInfo
            java.lang.String r0 = "imagePath"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            r9.<init>(r6, r4, r5)
            android.util.Size r10 = new android.util.Size
            r10.<init>(r3, r1)
            kotlin.jvm.internal.AqS184S0100000_2 r12 = new kotlin.jvm.internal.AqS184S0100000_2
            r0 = 14
            r12.<init>(r2, r0)
            kotlin.jvm.internal.IDqS427S0100000_2 r13 = new kotlin.jvm.internal.IDqS427S0100000_2
            r0 = 0
            r13.<init>(r2, r0)
            X.5z8 r14 = X.C152785z8.LJLIL
            X.5oc r15 = X.C146265oc.LJLIL
            r7.LJFF(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L4a
        L98:
            r0 = r4
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152695yz.LLIILZL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C152695yz(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 65));
        this.LJLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 66));
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJZ = new AICaptionNetworkModule();
        this.LJZL = C61878OQg.INSTANCE;
        this.LLF = LLJJI().mIsFromDraft;
        this.LLFFF = C152795z9.LJLIL;
    }

    private final void LLLI(TextStickerModel textStickerModel, String str) {
        C138655cL aw;
        TextStickerModel copy$default = TextStickerModel.copy$default(textStickerModel, null, null, str, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 131067, null);
        InterfaceC139535dl Sj = Sj();
        if (Sj != null) {
            Sj.N8(copy$default);
        }
        InterfaceC139045cy LLJI = LLJI();
        if (LLJI != null && (aw = LLJI.aw()) != null && C138655cL.LJ(copy$default)) {
            aw.LJIIJ(copy$default);
        }
    }

    public static /* synthetic */ AICaptionTagStickerModel LLIIIL(C152695yz c152695yz, AICaptionTagStickerModel aICaptionTagStickerModel, int i, Object obj) {
        if ((i & 1) != 0) {
            aICaptionTagStickerModel = null;
        }
        return c152695yz.LLIFFJFJJ(aICaptionTagStickerModel);
    }
}
