package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS66S0200000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import Y.IDDListenerS100S0200000_2;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerState;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature.EditNatureStickerState;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature.EditNatureStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.nature.NatureStickerGuideFragment;
import com.ss.android.vesdk.VESize;
import com.tiktok.sticker.commonsticker.model.OptionsBean;
import com.tiktok.sticker.commonsticker.model.PollStickerModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.63C, reason: invalid class name */
/* loaded from: classes3.dex */
public class C63C extends WMH implements InterfaceC143795kd, InterfaceC150315v9, InterfaceC150395vH, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJJIII;
    public final C82622Wbi LJLIL;
    public final int LJLILLLLZI;
    public final C82631Wbr LJLJI;
    public final C82631Wbr LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82631Wbr LJLJLJ;
    public InterfaceC152085y0 LJLJLLL;
    public AnonymousClass655 LJLL;
    public final C82632Wbs LJLLI;
    public final C82631Wbr LJLLILLLL;
    public C67C LJLLJ;
    public C1557569j LJLLL;
    public C63R LJLLLL;
    public InterfaceC1541863i LJLLLLLL;
    public C63Q LJLZ;
    public C63L LJZ;
    public InterfaceC138265bi LJZI;
    public AnonymousClass673 LJZL;
    public C63K LL;
    public final C82631Wbr LLD;
    public final C82632Wbs LLF;
    public final C82631Wbr LLFF;
    public C6CP LLFFF;
    public C63H LLFII;
    public C63I LLFZ;
    public InterfaceC147775r3 LLI;
    public C1550766t LLIFFJFJJ;
    public EditDonationStickerViewModel LLII;
    public EditCommentStickerViewModel LLIIII;
    public EditNatureStickerViewModel LLIIIILZ;
    public final List<InteractStickerStruct> LLIIIJ;
    public FrameLayout LLIIIL;
    public FrameLayout LLIIIZ;
    public FrameLayout LLIIJI;
    public FrameLayout LLIIJLIL;
    public FrameLayout LLIIL;
    public FrameLayout LLIILII;
    public FrameLayout LLIILZL;
    public InterfaceC152145y6 LLIIZ;
    public C64F LLIL;
    public final C62822Ol8 LLILII;
    public boolean LLILIL;
    public InterfaceC138705cQ LLILL;
    public final SafeHandler LLILLIZIL;
    public InterfaceC137115Zr LLILLJJLI;
    public ProgressDialogC43239Gy3 LLILLL;
    public C82622Wbi LLILZ;
    public final C62822Ol8 LLILZIL;
    public final C62822Ol8 LLILZLL;
    public final C62822Ol8 LLIZ;
    public InterfaceC147905rG LLIZLLLIL;
    public boolean LLJ;
    public C63D LLJI;
    public InterfaceC139655dx LLJIJIL;
    public InterfaceC139045cy LLJILJIL;
    public final C62822Ol8 LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C62822Ol8 LLJJI;

    public /* synthetic */ C63C() {
        throw null;
    }

    public void LLJILJILJ(int i) {
    }

    public void LLLJ(C82621Wbh builder) {
        o.LJIIIZ(builder, "builder");
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

    static {
        TBT tbt = new TBT(C63C.class, "textToSpeechApiComponent", "getTextToSpeechApiComponent()Lcom/ss/android/ugc/gamora/editor/audio/tts/base/TextToSpeechApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLJJIII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C63C.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C63C.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C63C.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C63C.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp), C61845OOz.LIZJ(C63C.class, "editUgcTemplateApi", "getEditUgcTemplateApi()Lcom/ss/android/ugc/gamora/ugctemplate/EditUgcTemplateApi;", 0, c65351Pkp), C61845OOz.LIZJ(C63C.class, "commentAndQuestionStickerPanelApi", "getCommentAndQuestionStickerPanelApi()Lcom/ss/android/ugc/aweme/panel/CommentAndQuestionStickerPanelApi;", 0, c65351Pkp), C61845OOz.LIZJ(C63C.class, "editCanvasApi", "getEditCanvasApi()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/EditCanvasApi;", 0, c65351Pkp), C61845OOz.LIZJ(C63C.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0, c65351Pkp), C61845OOz.LIZJ(C63C.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C63C.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0, c65351Pkp), C61845OOz.LIZJ(C63C.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0, c65351Pkp)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x030f, code lost:
    
        if (r1 != null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0508, code lost:
    
        if (r5 != null) goto L175;
     */
    @Override // X.InterfaceC150315v9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63C.LJI():void");
    }

    public final InterfaceC81454Vxy LLJJIII() {
        return (InterfaceC81454Vxy) this.LJLLI.LIZ(this, LLJJIII[6]);
    }

    public final AnonymousClass655 LLJJIJI() {
        AnonymousClass655 anonymousClass655 = this.LJLL;
        if (anonymousClass655 != null) {
            return anonymousClass655;
        }
        o.LJIJI("deleteComponent");
        throw null;
    }

    public InterfaceC1541063a LLJJIJIIJIL() {
        return new InterfaceC1541063a() { // from class: X.5wA
            @Override // X.InterfaceC1541063a
            public final boolean LIZIZ() {
                return false;
            }

            @Override // X.InterfaceC1541063a
            public final boolean LIZJ() {
                return true;
            }

            @Override // X.InterfaceC1541063a
            public final OSZ<Integer, Integer> LJI() {
                return null;
            }

            @Override // X.InterfaceC1541063a
            public final InfoStickerModel LIZ() {
                return C63C.this.LLJLLL().infoStickerModel;
            }

            @Override // X.InterfaceC1541063a
            public final boolean LIZLLL() {
                return !H7R.LJJJJI(C63C.this.LLJLLL());
            }

            @Override // X.InterfaceC1541063a
            public final boolean LJ() {
                C63C c63c = C63C.this;
                InterfaceC150955wB interfaceC150955wB = (InterfaceC150955wB) c63c.LJLJLJ.LIZ(c63c, C63C.LLJJIII[5]);
                if ((interfaceC150955wB != null && !interfaceC150955wB.Pl0()) || C63C.this.LLJILJIL()) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1541063a
            public final int[] LJFF(View view) {
                o.LJIIIZ(view, "view");
                if (H7R.LJJJJI(C63C.this.LLJLLL())) {
                    Context requireSceneContext = C63C.this.requireSceneContext();
                    o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                    C6IA.LJII(requireSceneContext, view);
                    Context requireSceneContext2 = C63C.this.requireSceneContext();
                    o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
                    return new int[]{0, C6IB.LIZLLL(requireSceneContext2)};
                }
                return null;
            }
        };
    }

    public final C63H LLJJIJIL() {
        C63H c63h = this.LLFII;
        if (c63h != null) {
            return c63h;
        }
        o.LJIJI("editHashTagStickerApi");
        throw null;
    }

    public final C63I LLJJJ() {
        C63I c63i = this.LLFZ;
        if (c63i != null) {
            return c63i;
        }
        o.LJIJI("editMentionStickerApi");
        throw null;
    }

    public final InterfaceC147865rC LLJJJIL() {
        return (InterfaceC147865rC) this.LLF.LIZ(this, LLJJIII[9]);
    }

    public final InterfaceC136115Vv LLJJJJ() {
        return (InterfaceC136115Vv) this.LLFF.LIZ(this, LLJJIII[10]);
    }

    public final InterfaceC152085y0 LLJJL() {
        InterfaceC152085y0 interfaceC152085y0 = this.LJLJLLL;
        if (interfaceC152085y0 != null) {
            return interfaceC152085y0;
        }
        o.LJIJI("gestureService");
        throw null;
    }

    public final InterfaceC139535dl LLJJLIIIJLLLLLLLZ() {
        return (InterfaceC139535dl) this.LLILZLL.getValue();
    }

    public final InterfaceC147905rG LLJLIL() {
        InterfaceC147905rG interfaceC147905rG = this.LLIZLLLIL;
        if (interfaceC147905rG != null) {
            return interfaceC147905rG;
        }
        o.LJIJI("infoStickerApi");
        throw null;
    }

    public final C63Q LLJLILLLLZIIL() {
        C63Q c63q = this.LJLZ;
        if (c63q != null) {
            return c63q;
        }
        o.LJIJI("liveCDStickerApi");
        throw null;
    }

    public final InterfaceC1541563f LLJLL() {
        return (InterfaceC1541563f) this.LLILII.getValue();
    }

    public final C63R LLJLLIL() {
        C63R c63r = this.LJLLLL;
        if (c63r != null) {
            return c63r;
        }
        o.LJIJI("pollStickerApi");
        throw null;
    }

    public final VideoPublishEditModel LLJLLL() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LLJJIII[3]);
    }

    public final C63K LLJZIJLIL() {
        C63K c63k = this.LL;
        if (c63k != null) {
            return c63k;
        }
        o.LJIJI("qaStickerApi");
        throw null;
    }

    public final InterfaceC139655dx LLL() {
        InterfaceC139655dx interfaceC139655dx = this.LLJIJIL;
        if (interfaceC139655dx != null) {
            return interfaceC139655dx;
        }
        o.LJIJI("textAdapterApi");
        throw null;
    }

    public C1545664u LLLF() {
        return (C1545664u) this.LLJILJILJ.getValue();
    }

    public final boolean LLLI() {
        if (this.mParentScene != null) {
            C63R c63r = (C63R) C44384HbQ.LJJJI(this).LJ(C63R.class);
            if (c63r != null && c63r.LJIILL()) {
                c63r.LIZLLL();
            }
            C63Q c63q = (C63Q) C44384HbQ.LJJJI(this).LJ(C63Q.class);
            if (c63q != null && c63q.LJIILL()) {
                c63q.LIZLLL();
            }
        }
        C63I LLJJJ = LLJJJ();
        if (LLJJJ.LJIILL()) {
            LLJJJ.LIZLLL();
        }
        C63H LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL.LJIILL()) {
            LLJJIJIL.LIZLLL();
        }
        C1550766t c1550766t = this.LLIFFJFJJ;
        if (c1550766t != null && c1550766t.LLJILJILJ().LJIL()) {
            c1550766t.LLJILJILJ().LJIIZILJ();
        }
        return LLL().LIZLLL();
    }

    public final void LLLII() {
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            LLJLIL().show();
            getEditPreviewApi().PM().observe(this, new AObserverS70S0100000_2(this, 101));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLIIII() {
        C1550766t c1550766t;
        CaptionStruct captionStruct;
        OSZ<Integer, Integer> osz;
        InterfaceC1541863i interfaceC1541863i;
        InterfaceC139535dl LLJJLIIIJLLLLLLLZ = LLJJLIIIJLLLLLLLZ();
        if (LLJJLIIIJLLLLLLLZ != null) {
            LLJJLIIIJLLLLLLLZ.T10();
        }
        boolean LJJJJI = H7R.LJJJJI(LLJLLL());
        PollStickerModel pollStickerModel = null;
        NormalTrackTimeStamp normalTrackTimeStamp = null;
        pollStickerModel = null;
        if (this.LJLLJ == null) {
            C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI != null) {
                C67C c67c = new C67C(LJJLIIIJJI);
                this.LJLLJ = c67c;
                c67c.LJLILLLLZI = LLJJL();
                C67C c67c2 = this.LJLLJ;
                if (c67c2 != null) {
                    c67c2.LLJJI().LJLJJI = LLJJIJI();
                }
                C67C c67c3 = this.LJLLJ;
                if (c67c3 != null) {
                    InterfaceC137115Zr interfaceC137115Zr = this.LLILLJJLI;
                    if (interfaceC137115Zr != null) {
                        c67c3.LJLZ = interfaceC137115Zr;
                        c67c3.LLJJIJI(LJJJJI);
                    } else {
                        o.LJIJI("compileCallback");
                        throw null;
                    }
                }
                C67C c67c4 = this.LJLLJ;
                if ((c67c4 instanceof WM7) && c67c4 != null) {
                    add(R.id.l5d, c67c4, "EditDonationStickerScene");
                }
                C67C c67c5 = this.LJLLJ;
                if (c67c5 != null) {
                    c67c5.LJLLLL = new InterfaceC1549866k() { // from class: X.63T
                        @Override // X.InterfaceC1549866k
                        public final void accept(Object obj) {
                            KeyEvent.Callback view = (View) obj;
                            C63C.this.LLLII();
                            if (C63C.this.LJLLJ != null) {
                                o.LJIIIIZZ(view, "view");
                                if (view instanceof C1557169f) {
                                    InterfaceC147905rG LLJLIL = C63C.this.LLJLIL();
                                    o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.interact.TimeEditable<*>");
                                    LLJLIL.K2((InterfaceC1549166d) view);
                                }
                            }
                        }
                    };
                    c67c5.LLJJI().LLFII = new C6BQ() { // from class: X.63u
                        @Override // X.C6BQ
                        public final void LIZ(C156426By c156426By, C156426By newTopView) {
                            EditDonationStickerViewModel LLJILJIL;
                            EditDonationStickerState Hv0;
                            C63C c63c = C63C.this;
                            C67C c67c6 = c63c.LJLLJ;
                            if (c67c6 != null && (LLJILJIL = c67c6.LLJILJIL()) != null && (Hv0 = LLJILJIL.Hv0(c67c6)) != null && Hv0.getInTimeEditView() && c63c.LJLLJ != null) {
                                o.LJIIIIZZ(newTopView, "newTopView");
                                if (newTopView instanceof C1557269g) {
                                    InterfaceC147905rG LLJLIL = c63c.LLJLIL();
                                    KeyEvent.Callback drawView = newTopView.getDrawView();
                                    o.LJII(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.interact.TimeEditable<*>");
                                    LLJLIL.I9((InterfaceC1549166d) drawView);
                                    c63c.LLJLIL().k();
                                }
                            }
                        }
                    };
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (this.LJLLL == null && C00F.LIZ(31744, 0, "enable_nature_sticker_creation", true) == 1) {
            C82622Wbi LJJLIIIJJI2 = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI2 != null) {
                C1557569j c1557569j = new C1557569j(LJJLIIIJJI2);
                this.LJLLL = c1557569j;
                c1557569j.LJLILLLLZI = LLJJL();
                C1557569j c1557569j2 = this.LJLLL;
                if (c1557569j2 != null) {
                    c1557569j2.LLJJ().LJLJJI = LLJJIJI();
                }
                C1557569j c1557569j3 = this.LJLLL;
                if (c1557569j3 != null) {
                    InterfaceC137115Zr interfaceC137115Zr2 = this.LLILLJJLI;
                    if (interfaceC137115Zr2 != null) {
                        c1557569j3.LJLLLLLL = interfaceC137115Zr2;
                        c1557569j3.LLJJIII(LJJJJI);
                    } else {
                        o.LJIJI("compileCallback");
                        throw null;
                    }
                }
                C1557569j c1557569j4 = this.LJLLL;
                if ((c1557569j4 instanceof WM7) && c1557569j4 != null) {
                    add(R.id.l5d, c1557569j4, "EditNatureStickerScene");
                }
                C1557569j c1557569j5 = this.LJLLL;
                if (c1557569j5 != null) {
                    c1557569j5.LJLLL = new InterfaceC1549866k() { // from class: X.63U
                        @Override // X.InterfaceC1549866k
                        public final void accept(Object obj) {
                            KeyEvent.Callback view = (View) obj;
                            C63C.this.LLLII();
                            if (C63C.this.LJLLL != null) {
                                o.LJIIIIZZ(view, "view");
                                if (view instanceof C1558469s) {
                                    InterfaceC147905rG LLJLIL = C63C.this.LLJLIL();
                                    o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.interact.TimeEditable<*>");
                                    LLJLIL.K2((InterfaceC1549166d) view);
                                }
                            }
                        }
                    };
                    c1557569j5.LLJJ().LLFII = new C6BQ() { // from class: X.63v
                        @Override // X.C6BQ
                        public final void LIZ(C156426By c156426By, C156426By newTopView) {
                            EditNatureStickerViewModel LLJILJIL;
                            EditNatureStickerState Hv0;
                            C63C c63c = C63C.this;
                            C1557569j c1557569j6 = c63c.LJLLL;
                            if (c1557569j6 != null && (LLJILJIL = c1557569j6.LLJILJIL()) != null && (Hv0 = LLJILJIL.Hv0(c1557569j6)) != null && Hv0.getInTimeEditView() && c63c.LJLLL != null) {
                                o.LJIIIIZZ(newTopView, "newTopView");
                                if (newTopView instanceof C1558369r) {
                                    InterfaceC147905rG LLJLIL = c63c.LLJLIL();
                                    KeyEvent.Callback drawView = newTopView.getDrawView();
                                    o.LJII(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.interact.TimeEditable<*>");
                                    LLJLIL.I9((InterfaceC1549166d) drawView);
                                    c63c.LLJLIL().k();
                                }
                            }
                        }
                    };
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (this.LLIFFJFJJ == null) {
            C82622Wbi LJJLIIIJJI3 = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI3 != null) {
                C1550766t c1550766t2 = new C1550766t(LJJLIIIJJI3);
                this.LLIFFJFJJ = c1550766t2;
                c1550766t2.LJLJI = LLJJL();
                C1550766t c1550766t3 = this.LLIFFJFJJ;
                o.LJI(c1550766t3);
                add(R.id.dcs, c1550766t3, "CaptionStickerScene");
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C63H LLJJIJIL = LLJJIJIL();
        LLJJIJIL.LJLJL(LLJJIJI());
        LLJJIJIL.show();
        C63I LLJJJ = LLJJJ();
        LLJJJ.LJLJL(LLJJIJI());
        LLJJJ.show();
        if (this.LJZL == null) {
            C82622Wbi LJJLIIIJJI4 = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI4 != null) {
                AnonymousClass673 anonymousClass673 = new AnonymousClass673(LJJLIIIJJI4);
                this.LJZL = anonymousClass673;
                anonymousClass673.LJLILLLLZI = LLJJL();
                AnonymousClass673 anonymousClass6732 = this.LJZL;
                if (anonymousClass6732 != null) {
                    anonymousClass6732.LLJJI().LJLJJI = LLJJIJI();
                }
                AnonymousClass673 anonymousClass6733 = this.LJZL;
                if (anonymousClass6733 != null) {
                    anonymousClass6733.LLJJIII(LJJJJI);
                }
                AnonymousClass673 anonymousClass6734 = this.LJZL;
                if (anonymousClass6734 instanceof WM7) {
                    o.LJII(anonymousClass6734, "null cannot be cast to non-null type com.bytedance.scene.Scene");
                    add(R.id.l5d, anonymousClass6734, "EditCommentStickerScene");
                }
                AnonymousClass673 anonymousClass6735 = this.LJZL;
                if (anonymousClass6735 != null) {
                    anonymousClass6735.LJLLLL = new InterfaceC1549866k() { // from class: X.5yi
                        @Override // X.InterfaceC1549866k
                        public final void accept(Object obj) {
                            KeyEvent.Callback callback = (View) obj;
                            C63C.this.LLLII();
                            if (callback instanceof C156086Aq) {
                                C63C.this.LLJLIL().K2((InterfaceC1549166d) callback);
                            }
                        }
                    };
                    anonymousClass6735.LLJJI().LLFII = new C6BQ() { // from class: X.63w
                        @Override // X.C6BQ
                        public final void LIZ(C156426By c156426By, C156426By c156426By2) {
                            EditCommentStickerViewModel LLJILJILJ;
                            EditCommentStickerState Hv0;
                            C63C c63c = C63C.this;
                            AnonymousClass673 anonymousClass6736 = c63c.LJZL;
                            if (anonymousClass6736 != null && (LLJILJILJ = anonymousClass6736.LLJILJILJ()) != null && (Hv0 = LLJILJILJ.Hv0(anonymousClass6736)) != null && Hv0.getInTimeEditView() && (c156426By2 instanceof C1557369h)) {
                                InterfaceC147905rG LLJLIL = c63c.LLJLIL();
                                View drawView = c156426By2.getDrawView();
                                o.LJII(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.panel.itemview.CommentStickerView");
                                LLJLIL.I9((C156086Aq) drawView);
                                c63c.LLJLIL().k();
                            }
                        }
                    };
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LLLJL();
        if (C143125jY.LIZ()) {
            List<InteractStickerStruct> LJI = C164826dS.LJI(LLJLLL().getMainBusinessContext(), 1, EnumC164816dR.TRACK_PAGE_EDIT);
            if (LJI != null && !LJI.isEmpty()) {
                InterfaceC1541563f LLJLL = LLJLL();
                if (LLJLL != null) {
                    osz = LLJLL.Y0();
                } else {
                    osz = null;
                }
                Object obj = ListProtector.get(LJI, 0);
                o.LJIIIIZZ(obj, "pollStickerStructs[0]");
                InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
                if (interactStickerStruct.getPollStruct() != null && osz != null) {
                    List list = (List) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), interactStickerStruct.getTrackList(), new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.2T3
                    }.getType());
                    if (list != null) {
                        normalTrackTimeStamp = (NormalTrackTimeStamp) ListProtector.get(list, 0);
                    }
                    String question = interactStickerStruct.getPollStruct().getQuestion();
                    long selectOptionId = interactStickerStruct.getPollStruct().getSelectOptionId();
                    long pollId = interactStickerStruct.getPollStruct().getPollId();
                    long refId = interactStickerStruct.getPollStruct().getRefId();
                    int refType = interactStickerStruct.getPollStruct().getRefType();
                    List<PollStruct.OptionsBean> options = interactStickerStruct.getPollStruct().getOptions();
                    o.LJIIIIZZ(options, "this.pollStruct.options");
                    ArrayList arrayList = new ArrayList(C32I.LJJL(options, 10));
                    for (PollStruct.OptionsBean it : options) {
                        o.LJIIIIZZ(it, "it");
                        String optionText = it.getOptionText();
                        if (optionText == null) {
                            optionText = "";
                        }
                        long optionId = it.getOptionId();
                        long pollCount = it.getPollCount();
                        String postOption = it.getPostOption();
                        if (postOption == null) {
                            postOption = "";
                        }
                        arrayList.add(new OptionsBean(optionText, optionId, pollCount, postOption));
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    o.LJIIIIZZ(question, "question");
                    PollStickerModel pollStickerModel2 = new PollStickerModel(question, pollId, refId, refType, selectOptionId, arrayList2, null, 64, 0 == true ? 1 : 0);
                    if (normalTrackTimeStamp != null) {
                        pollStickerModel2.setCenterX(osz.getFirst().floatValue() * normalTrackTimeStamp.getX());
                        pollStickerModel2.setCenterY(osz.getSecond().floatValue() * normalTrackTimeStamp.getY());
                        float floatValue = osz.getFirst().floatValue() * normalTrackTimeStamp.getWidth();
                        Float scale = normalTrackTimeStamp.getScale();
                        o.LJIIIIZZ(scale, "location.scale");
                        pollStickerModel2.setWidth(floatValue / scale.floatValue());
                        float floatValue2 = osz.getSecond().floatValue() * normalTrackTimeStamp.getHeight();
                        Float scale2 = normalTrackTimeStamp.getScale();
                        o.LJIIIIZZ(scale2, "location.scale");
                        pollStickerModel2.setHeight(floatValue2 / scale2.floatValue());
                        pollStickerModel2.setRotation(normalTrackTimeStamp.getRotation());
                        Float scale3 = normalTrackTimeStamp.getScale();
                        o.LJIIIIZZ(scale3, "location.scale");
                        pollStickerModel2.setScale(scale3.floatValue());
                        pollStickerModel2.setStickerType(C63X.POLL.getType());
                        pollStickerModel2.setStickerContainerWidth(osz.getFirst().intValue());
                        pollStickerModel2.setStickerContainerHeight(osz.getSecond().intValue());
                    }
                    pollStickerModel = pollStickerModel2;
                }
                C82622Wbi LJJLIIIJJI5 = C44384HbQ.LJJLIIIJJI(this);
                if (LJJLIIIJJI5 != null) {
                    interfaceC1541863i = (InterfaceC1541863i) LJJLIIIJJI5.LJ(InterfaceC1541863i.class, null);
                } else {
                    interfaceC1541863i = null;
                }
                this.LJLLLLLL = interfaceC1541863i;
                if (interfaceC1541863i != null) {
                    interfaceC1541863i.l50(pollStickerModel);
                }
            }
        } else if (LLJLLL().creativeModel.draftInfoModel.isDraft) {
            C82622Wbi LJJLIIIJJI6 = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI6 != null) {
                this.LJLLLL = (C63R) LJJLIIIJJI6.LJ(C63R.class, null);
                LLJLLIL().LJJ();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            C63R c63r = (C63R) C44384HbQ.LJJJI(this).LJ(C63R.class);
            if (c63r != null) {
                c63r.LJJ();
            }
        }
        if (LLJLLL().creativeModel.draftInfoModel.isDraft) {
            C82622Wbi LJJLIIIJJI7 = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI7 != null) {
                this.LJLZ = (C63Q) LJJLIIIJJI7.LJ(C63Q.class, null);
                LLJLILLLLZIIL().LJJ();
                C82622Wbi LJJLIIIJJI8 = C44384HbQ.LJJLIIIJJI(this);
                if (LJJLIIIJJI8 != null) {
                    C63L c63l = (C63L) LJJLIIIJJI8.LJ(C63L.class, null);
                    this.LJZ = c63l;
                    c63l.LJJ();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            C63Q c63q = (C63Q) C44384HbQ.LJJJI(this).LJ(C63Q.class);
            if (c63q != null) {
                c63q.LJJ();
            }
            C63L c63l2 = (C63L) C44384HbQ.LJJJI(this).LJ(C63L.class);
            if (c63l2 != null) {
                c63l2.LJJ();
            }
        }
        AnonymousClass673 anonymousClass6736 = this.LJZL;
        if (anonymousClass6736 != null) {
            anonymousClass6736.LJJ();
        }
        C67C c67c6 = this.LJLLJ;
        if (c67c6 != null) {
            c67c6.LJJ();
        }
        LLJJJ().LJJ();
        LLJJIJIL().LJJ();
        LLJJIJIL().Ob0();
        LLJJIJIL().Dn0();
        if (LLJLLL().captionStruct != null && !H7R.LJJIIZ(LLJLLL()) && (c1550766t = this.LLIFFJFJJ) != null && (captionStruct = LLJLLL().captionStruct) != null) {
            c1550766t.LLJILJILJ().LJJIJLIJ(captionStruct.getUtterances());
            C1551366z LLJILJILJ = c1550766t.LLJILJILJ();
            int location = captionStruct.getLocation();
            C156436Bz c156436Bz = LLJILJILJ.LLII;
            if (c156436Bz != null) {
                c156436Bz.setCaptionLocation(location);
            }
            c1550766t.LJLJJI = captionStruct.getUtterances();
        }
        if (!LLJLLL().mIsFromDraft) {
            this.LLILLIZIL.removeCallbacksAndMessages(null);
            this.LLILLIZIL.postDelayed(new ARunnableS38S0100000_2(this, 107), 100L);
            if (C158166Iq.LIZIZ() && LLJLLL().qaStickerModel != null) {
                VideoPublishEditModel LLJLLL = LLJLLL();
                QAStickerModel qAStickerModel = LLJLLL().qaStickerModel;
                o.LJIIIIZZ(qAStickerModel, "publishEditModel.qaStickerModel");
                LLJLLL.qaStruct = new QaStruct(qAStickerModel.getQuestionId(), qAStickerModel.getUserId(), qAStickerModel.getItemId(), qAStickerModel.getAvatarUrl(), qAStickerModel.getUserName(), qAStickerModel.getQuestionContent(), qAStickerModel.getSecId(), qAStickerModel.getInviteUserList(), qAStickerModel.getSource(), qAStickerModel.getInviteShareInfo(), qAStickerModel.getExtra(), qAStickerModel.getExtraEventParams(), qAStickerModel.getCategory_meta(), qAStickerModel.getUserSelectedCategory(), 0, null, null, 114688, null);
            }
            if (LLJLLL().qaStruct != null) {
                C82622Wbi LJJLIIIJJI9 = C44384HbQ.LJJLIIIJJI(this);
                if (LJJLIIIJJI9 != null) {
                    this.LL = (C63K) LJJLIIIJJI9.LJ(C63K.class, null);
                    if (!LLJZIJLIL().LLLLLLL()) {
                        LLJZIJLIL().show();
                        C63K LLJZIJLIL = LLJZIJLIL();
                        QaStruct qaStruct = LLJLLL().qaStruct;
                        o.LJIIIIZZ(qaStruct, "publishEditModel.qaStruct");
                        LLJZIJLIL.I4(qaStruct);
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        } else {
            C82622Wbi LJJLIIIJJI10 = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI10 != null) {
                this.LL = (C63K) LJJLIIIJJI10.LJ(C63K.class, null);
                LLJZIJLIL().LJJ();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C1557569j c1557569j6 = this.LJLLL;
        if (c1557569j6 != null) {
            c1557569j6.LJJ();
        }
    }

    public final InterfaceC142515iZ getEditAdapterApi() {
        return (InterfaceC142515iZ) this.LJLJJI.LIZ(this, LLJJIII[1]);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJJL.LIZ(this, LLJJIII[2]);
    }

    public final InterfaceC143855kj getEditSubtitleApi() {
        return (InterfaceC143855kj) this.LLD.LIZ(this, LLJJIII[8]);
    }

    @Override // X.InterfaceC150315v9
    public final boolean LJIJ() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        AnonymousClass673 anonymousClass673;
        C67C c67c;
        C1550766t c1550766t;
        C1557569j c1557569j;
        InterfaceC1541863i interfaceC1541863i;
        C63R c63r = (C63R) C44384HbQ.LJJJI(this).LJ(C63R.class);
        if (c63r != null) {
            z = c63r.LJIJJLI();
        } else {
            z = false;
        }
        C63K c63k = (C63K) C44384HbQ.LJJJI(this).LJ(C63K.class);
        if (c63k != null) {
            z2 = c63k.LJIJJLI();
        } else {
            z2 = false;
        }
        C63Q c63q = (C63Q) C44384HbQ.LJJJI(this).LJ(C63Q.class);
        if (c63q != null) {
            z3 = c63q.LJIJJLI();
        } else {
            z3 = false;
        }
        C63L c63l = (C63L) C44384HbQ.LJJJI(this).LJ(C63L.class);
        if (c63l != null) {
            z4 = c63l.LJIJJLI();
        } else {
            z4 = false;
        }
        if (C143125jY.LIZ() && (interfaceC1541863i = this.LJLLLLLL) != null && interfaceC1541863i.E70() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z && !z3 && (((anonymousClass673 = this.LJZL) == null || !anonymousClass673.LLJJI().LJIILLIIL()) && !z2 && !z5 && (((c67c = this.LJLLJ) == null || !c67c.LLJJI().LJIILLIIL()) && !z4 && !LLJJJ().LJIJJLI() && !LLJJIJIL().LJIJJLI() && (((c1550766t = this.LLIFFJFJJ) == null || !c1550766t.LLJILJILJ().LJIILLIIL()) && ((c1557569j = this.LJLLL) == null || !c1557569j.LLJJ().LJIILLIIL()))))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC150315v9
    public final boolean LJL() {
        return LLL().LJLIL();
    }

    @Override // X.InterfaceC150315v9
    public final void LJLJJL() {
        C63R c63r = (C63R) C44384HbQ.LJJJI(this).LJ(C63R.class);
        if (c63r != null) {
            c63r.LIZLLL();
        }
        C63K c63k = (C63K) C44384HbQ.LJJJI(this).LJ(C63K.class);
        if (c63k != null) {
            c63k.LIZLLL();
        }
        C63Q c63q = (C63Q) C44384HbQ.LJJJI(this).LJ(C63Q.class);
        if (c63q != null) {
            c63q.LIZLLL();
        }
        C63L c63l = (C63L) C44384HbQ.LJJJI(this).LJ(C63L.class);
        if (c63l != null) {
            c63l.LIZLLL();
        }
        C1550766t c1550766t = this.LLIFFJFJJ;
        if (c1550766t != null) {
            c1550766t.LLJILJILJ().LJIIZILJ();
        }
        AnonymousClass673 anonymousClass673 = this.LJZL;
        if (anonymousClass673 != null) {
            anonymousClass673.LLJJI().LJIIZILJ();
        }
        C67C c67c = this.LJLLJ;
        if (c67c != null) {
            c67c.LLJJI().LJIIZILJ();
        }
        C1557569j c1557569j = this.LJLLL;
        if (c1557569j != null) {
            c1557569j.LLJJ().LJIIZILJ();
        }
        LLJJJ().LIZLLL();
        LLJJIJIL().LIZLLL();
    }

    @Override // X.InterfaceC150315v9
    public final List<TextStickerData> LJLLLL() {
        return LLL().RW();
    }

    public final boolean LLJILJIL() {
        if (LLJLLL().mIsFromDraft || !G3R.LIZ() || (!LLJLLL().isCurrentAutoCutMode() && !C44701HgX.LJIIJJI(LLJLLL().creativeModel))) {
            return false;
        }
        return true;
    }

    public C1545664u LLJJI() {
        View inflate = ((ViewStub) requireViewById(R.id.ncg)).inflate();
        o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.view.TextStickerInputLayout");
        return (C1545664u) inflate;
    }

    public final OSZ<Float, Float> LLLFF() {
        return LLL().P5(getSceneContext());
    }

    public final C67P LLLFZ() {
        C63D c63d;
        List<C67P> Va0;
        if (C42000Ge4.LJIILIIL(LLJLLL()) || (c63d = this.LLJI) == null || (Va0 = c63d.Va0()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C67P c67p : Va0) {
            C67P c67p2 = c67p;
            if (C1JI.LJJIFFI(c67p2) && (c67p2 instanceof C67Q)) {
                arrayList.add(c67p);
            }
        }
        return (C67P) ORZ.LJLLLLLL(0, arrayList);
    }

    public final void LLLIIIIL() {
        if (!C42000Ge4.LJIILIIL(LLJLLL()) && !this.LLJJ) {
            C63D c63d = this.LLJI;
            if (c63d != null) {
                c63d.show();
            }
            LLLLIIL();
            C63D c63d2 = this.LLJI;
            if (c63d2 != null) {
                c63d2.q5(new InterfaceC1542963t() { // from class: X.5dz
                    @Override // X.InterfaceC1542963t
                    public final void LIZ(C67P view) {
                        o.LJIIIZ(view, "view");
                    }

                    @Override // X.InterfaceC1542963t
                    public final void LIZIZ() {
                        C138735cT.LJFF(new ShortVideoCommonParams(C63C.this.LLJLLL().mShootWay, H7R.LJIIIIZZ(C63C.this.LLJLLL()), H7R.LJIIIZ(C63C.this.LLJLLL()), C63C.this.LLJLLL().getCreationId()));
                    }

                    @Override // X.InterfaceC1542963t
                    public final void K4(C67P view) {
                        InterfaceC138705cQ interfaceC138705cQ;
                        o.LJIIIZ(view, "view");
                        TextStickerData data = view.getData();
                        if (data != null && (interfaceC138705cQ = C63C.this.LLILL) != null) {
                            String speakerID = data.getSpeakerID();
                            if (speakerID == null) {
                                speakerID = "";
                            }
                            interfaceC138705cQ.Rl(speakerID, data);
                        }
                    }

                    @Override // X.InterfaceC1542963t
                    public final void H5(C67P c67p) {
                    }

                    @Override // X.InterfaceC1542963t
                    public final void LIZJ(C67P view, C1541163b c1541163b) {
                        o.LJIIIZ(view, "view");
                        if (c1541163b.LJLJI) {
                            if (!c1541163b.LJLJJL) {
                                C63C.this.getEditPreviewApi().U2(true, true, true);
                            }
                            C63C.this.LLILIL = false;
                            return;
                        }
                        C63C c63c = C63C.this;
                        if (!c63c.LLILIL) {
                            c63c.getEditPreviewApi().U2(false, true, false);
                            C63C.this.LLJLIL().LIZLLL();
                            C63D c63d3 = C63C.this.LLJI;
                            if (c63d3 != null) {
                                c63d3.LIZLLL();
                            }
                            C63C.this.LLLII();
                            InterfaceC147905rG LLJLIL = C63C.this.LLJLIL();
                            if (LLJLIL.V1() != null) {
                                LLJLIL.k();
                            }
                        }
                        C63C.this.LLILIL = true;
                    }
                });
            }
            C63D c63d3 = this.LLJI;
            if (c63d3 != null) {
                c63d3.LLLILZ(new AqS168S0100000_2(this, 268));
            }
            C63D c63d4 = this.LLJI;
            if (c63d4 != null) {
                c63d4.LLLLZ(new AqS184S0100000_2(this, 39));
            }
            C63D c63d5 = this.LLJI;
            if (c63d5 != null) {
                c63d5.W2(new AqS168S0100000_2(this, 269));
            }
            C63D c63d6 = this.LLJI;
            if (c63d6 != null) {
                c63d6.S9(new InterfaceC1552467k() { // from class: X.63e
                    @Override // X.InterfaceC1552467k
                    public final float LIZ(float f) {
                        return 0.0f;
                    }

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
                    public final int LJFF(C67P view, boolean z, boolean z2) {
                        o.LJIIIZ(view, "view");
                        return 0;
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
                    public final PointF LJIIIIZZ(C67P view, float f, float f2) {
                        o.LJIIIZ(view, "view");
                        return new PointF();
                    }
                });
            }
            C63D c63d7 = this.LLJI;
            if (c63d7 != null) {
                c63d7.F3(new InterfaceC1543363x() { // from class: X.5dk
                    @Override // X.InterfaceC1543363x
                    public final void LIZIZ() {
                        VideoPublishEditModel LLJLLL = C63C.this.LLJLLL();
                        C145995oB LIZ = C279017q.LIZ(LLJLLL, "model");
                        Q8U.LIZJ(LIZ, "enter_from", "video_edit_page", LLJLLL, "creation_id");
                        LIZ.LJI("enter_method", "click_text");
                        LIZ.LJI("shoot_way", LLJLLL.mShootWay);
                        LIZ.LJI("shoot_entrance", LLJLLL.mShootWay);
                        FMX.LJIIL("text_to_question_sticker", LIZ.LIZ);
                    }

                    @Override // X.InterfaceC1543363x
                    public final void LIZLLL() {
                        VideoPublishEditModel LLJLLL = C63C.this.LLJLLL();
                        C145995oB LIZ = C279017q.LIZ(LLJLLL, "model");
                        LIZ.LJI("creation_id", LLJLLL.getCreationId());
                        LIZ.LJI("shoot_way", LLJLLL.mShootWay);
                        LIZ.LJI("user_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
                        FMX.LJIIL("question_prompt_show", LIZ.LIZ);
                    }

                    @Override // X.InterfaceC1543363x
                    public final void LJFF() {
                        H8F.LJJJJZ(0, C63C.this.LLJLLL());
                    }

                    @Override // X.InterfaceC1543363x
                    public final void LJI() {
                        H8F.LJJJJL(C63C.this.LLJLLL());
                    }

                    @Override // X.InterfaceC1543363x
                    public final void LIZ(String str) {
                        H8F.LJJJJLL(C63C.this.LLJLLL(), str, 0, null, null, 24);
                    }

                    @Override // X.InterfaceC1543363x
                    public final void LIZJ(C67P textStickerView) {
                        o.LJIIIZ(textStickerView, "textStickerView");
                        if (C1JI.LJIL(textStickerView)) {
                            return;
                        }
                        H8F.LJJIIZI(C63C.this.LLJLLL(), "click_text", 0, textStickerView, 112);
                    }

                    @Override // X.InterfaceC1543363x
                    public final void LJ(int i, String str, String str2) {
                        H8F.LJJJJIZL(C63C.this.LLJLLL(), "move_to_top", 0, i, str, str2, 0, null);
                    }
                });
            }
            C63D c63d8 = this.LLJI;
            if (c63d8 != null) {
                c63d8.HQ(new C68B() { // from class: X.63q
                    @Override // X.C68B
                    public final void LIZ() {
                        H8F.LJJJJLI(C63C.this.LLJLLL(), null);
                    }

                    @Override // X.C68B
                    public final void LIZIZ() {
                        H8F.LJJJJLI(C63C.this.LLJLLL(), null);
                    }

                    @Override // X.C68B
                    public final void LIZJ() {
                        H8F.LJJJJLI(C63C.this.LLJLLL(), null);
                    }
                });
            }
        }
        this.LLJJ = true;
    }

    public final boolean LLLIIIL() {
        C63Q c63q;
        C63L c63l;
        C63K c63k;
        AnonymousClass673 anonymousClass673;
        C67C c67c;
        C1550766t c1550766t;
        C1557569j c1557569j;
        C63R c63r = (C63R) C44384HbQ.LJJJI(this).LJ(C63R.class);
        if ((c63r == null || !c63r.LJIILL()) && (((c63q = (C63Q) C44384HbQ.LJJJI(this).LJ(C63Q.class)) == null || !c63q.LJIILL()) && (((c63l = (C63L) C44384HbQ.LJJJI(this).LJ(C63L.class)) == null || !c63l.LJIILL()) && (((c63k = (C63K) C44384HbQ.LJJJI(this).LJ(C63K.class)) == null || !c63k.LJIILL()) && (((anonymousClass673 = this.LJZL) == null || !anonymousClass673.LLJJI().LJIL()) && (((c67c = this.LJLLJ) == null || !c67c.LLJJI().LJIL()) && !LLJJJ().LJIILL() && !LLJJIJIL().LJIILL() && (((c1550766t = this.LLIFFJFJJ) == null || !c1550766t.LLJILJILJ().LJIL()) && ((c1557569j = this.LJLLL) == null || !c1557569j.LLJJ().LJIL())))))))) {
            C64F c64f = this.LLIL;
            if (c64f != null) {
                C63G c63g = c64f.LJLL;
                if (c63g == null || !c63g.LJLILLLLZI) {
                    return false;
                }
            } else {
                o.LJIJI("stickerContainer");
                throw null;
            }
        }
        return true;
    }

    public final void LLLILZ() {
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        if (!C84763XOl.LJIIJJI) {
            InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
            if (value != null) {
                value.LLJILJIL(true);
            }
            InterfaceC153045zY value2 = getEditPreviewApi().Kh().getValue();
            if (value2 != null) {
                value2.play();
            }
        }
    }

    public final void LLLIZZ() {
        UrlModel urlModel;
        if (!C143125jY.LIZ()) {
            return;
        }
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        C1543864c c1543864c = new C1543864c(requireSceneContext);
        C64F c64f = this.LLIL;
        if (c64f != null) {
            c64f.addView(c1543864c);
            final C136145Vy c136145Vy = new C136145Vy(getEditPreviewApi());
            C64U c64u = new C64U(c136145Vy) { // from class: X.63c
                public final InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super Boolean, C76800UCe> LJLIL;

                @Override // X.C64U
                public final boolean LIZIZ(C64N c64n, float f) {
                    return false;
                }

                @Override // X.C64U
                public final boolean LIZLLL() {
                    return false;
                }

                @Override // X.C64U
                public final boolean LJ(C64N c64n, float f) {
                    return false;
                }

                @Override // X.C64U
                public final void LJFF() {
                }

                @Override // X.C64U
                public final void LJI(C64N c64n) {
                }

                @Override // X.C64U
                public final void LJII(C64N c64n, float f, float f2) {
                }

                {
                    this.LJLIL = c136145Vy;
                }

                @Override // X.C64U
                public final void LIZ(C64N c64n, float f, float f2) {
                    InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super Boolean, C76800UCe> interfaceC88473Ynt = this.LJLIL;
                    if (interfaceC88473Ynt != null) {
                        Boolean bool = Boolean.TRUE;
                        interfaceC88473Ynt.invoke(bool, Boolean.FALSE, bool);
                    }
                }

                @Override // X.C64U
                public final boolean LIZJ(C64N c64n, float f, float f2) {
                    InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super Boolean, C76800UCe> interfaceC88473Ynt = this.LJLIL;
                    if (interfaceC88473Ynt != null) {
                        Boolean bool = Boolean.FALSE;
                        interfaceC88473Ynt.invoke(bool, Boolean.TRUE, bool);
                        return false;
                    }
                    return false;
                }
            };
            Context requireSceneContext2 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
            C63F c63f = new C63F(requireSceneContext2);
            c63f.setFakeFeedAlpha(C6DY.LIZ());
            c63f.LJIIIZ();
            FFL.LJIIIZ().getClass();
            c63f.setAlwaysDisplayFakeFeed(FFL.LJ(31744, "tools_simulated_feed_always_display", true, false));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('@');
            C44423Hc3 LJ = C73098SmU.LJ();
            Resources resources = getResources();
            o.LJIIIIZZ(resources, "resources");
            LIZ.append(C41532GRs.LIZIZ(LJ, resources));
            String name = X1D.LIZIZ(LIZ);
            Context requireSceneContext3 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext3, "requireSceneContext()");
            String LIZ2 = C41532GRs.LIZ(requireSceneContext3, C60903NvH.LJIIJJI().getAccountService().getCurrentUser());
            C44423Hc3 LJ2 = C73098SmU.LJ();
            if (LJ2 != null) {
                urlModel = LJ2.getAvatarThumb();
            } else {
                urlModel = null;
            }
            o.LJIIIZ(name, "name");
            if (urlModel != null) {
                C164036cB c164036cB = c63f.LJLJJI;
                Context context = c63f.getContext();
                o.LJIIIIZZ(context, "context");
                int LIZIZ = (int) C74275TDb.LIZIZ(context, 49.0f);
                Context context2 = c63f.getContext();
                o.LJIIIIZZ(context2, "context");
                C78764Uvg.LJI(c164036cB, urlModel, LIZIZ, (int) C74275TDb.LIZIZ(context2, 49.0f));
            } else {
                C78764Uvg.LIZ(c63f.LJLJJI, R.drawable.b0p);
            }
            TextView textView = c63f.LJLJL;
            if (textView != null) {
                textView.setText(name);
            }
            C78764Uvg.LJI(c63f.LJLJJLL, urlModel, 27, 27);
            C78764Uvg.LIZ(c63f.LJLJJL, R.drawable.b0j);
            Drawable LIZIZ2 = C04270Et.LIZIZ(c63f.getContext(), R.drawable.b0c);
            if (LIZIZ2 != null) {
                LIZIZ2.setBounds(0, 0, LIZIZ2.getMinimumWidth(), LIZIZ2.getMinimumHeight());
            }
            TextView textView2 = c63f.LJLJLJ;
            if (textView2 != null) {
                textView2.setCompoundDrawables(LIZIZ2, null, null, null);
            }
            TextView textView3 = c63f.LJLJLJ;
            if (textView3 != null) {
                textView3.setText(LIZ2);
            }
            C64F c64f2 = this.LLIL;
            if (c64f2 != null) {
                c64f2.addView(c63f);
                Context requireSceneContext4 = requireSceneContext();
                o.LJIIIIZZ(requireSceneContext4, "requireSceneContext()");
                C1543764b c1543764b = new C1543764b(requireSceneContext4);
                C64F c64f3 = this.LLIL;
                if (c64f3 != null) {
                    c64f3.addView(c1543764b);
                    Context requireSceneContext5 = requireSceneContext();
                    o.LJIIIIZZ(requireSceneContext5, "requireSceneContext()");
                    C64E c64e = new C64E(requireSceneContext5);
                    C64F c64f4 = this.LLIL;
                    if (c64f4 != null) {
                        c64f4.addView(c64e);
                        Context requireSceneContext6 = requireSceneContext();
                        o.LJIIIIZZ(requireSceneContext6, "requireSceneContext()");
                        C63G c63g = new C63G(requireSceneContext6);
                        C64F c64f5 = this.LLIL;
                        if (c64f5 != null) {
                            c64f5.addView(c63g);
                            Context requireSceneContext7 = requireSceneContext();
                            o.LJIIIIZZ(requireSceneContext7, "requireSceneContext()");
                            ArrayList LJII = C47261Igj.LJII(c1543864c, c64u, c63f, c1543764b, new C64H(requireSceneContext7), c63g, c64e);
                            InterfaceC1541563f LLJLL = LLJLL();
                            if (LLJLL != null) {
                                int LJFF = C81184Vtc.LJFF(requireSceneContext());
                                C64F c64f6 = this.LLIL;
                                if (c64f6 != null) {
                                    LLJLL.LJI(new C64J(LJII, LJFF, null, c64f6, (ViewStub) requireViewById(R.id.h03)));
                                    c1543864c.setStickerDeleteListener(new C1541663g(LLJLL));
                                } else {
                                    o.LJIJI("stickerContainer");
                                    throw null;
                                }
                            }
                            InterfaceC152085y0 LLJJL = LLJJL();
                            C64F c64f7 = this.LLIL;
                            if (c64f7 != null) {
                                LLJJL.LIZIZ(new C6V4(LiveChatShowDelayForHotLiveSetting.DEFAULT, c64f7.getOnGestureListener()));
                                return;
                            } else {
                                o.LJIJI("stickerContainer");
                                throw null;
                            }
                        }
                        o.LJIJI("stickerContainer");
                        throw null;
                    }
                    o.LJIJI("stickerContainer");
                    throw null;
                }
                o.LJIJI("stickerContainer");
                throw null;
            }
            o.LJIJI("stickerContainer");
            throw null;
        }
        o.LJIJI("stickerContainer");
        throw null;
    }

    public final void LLLJL() {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = LLJLLL().infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                int i = next.type;
                if (i != 4) {
                    if (i != 19) {
                        if (i != 24) {
                            if (i != 8) {
                                if (i == 9) {
                                    C63H LLJJIJIL = LLJJIJIL();
                                    String str = next.path;
                                    o.LJIIIIZZ(str, "model.path");
                                    LLJJIJIL.LJJJI(str);
                                    String str2 = next.stickerId;
                                    o.LJIIIIZZ(str2, "model.stickerId");
                                    LLJJIJIL.LJIILLIIL(str2);
                                    it.remove();
                                }
                            } else {
                                C63I LLJJJ = LLJJJ();
                                String str3 = next.path;
                                o.LJIIIIZZ(str3, "model.path");
                                LLJJJ.LJJJI(str3);
                                String str4 = next.stickerId;
                                o.LJIIIIZZ(str4, "model.stickerId");
                                LLJJJ.LJIILLIIL(str4);
                                it.remove();
                            }
                        } else {
                            C63L c63l = (C63L) C44384HbQ.LJJJI(this).LJ(C63L.class);
                            if (c63l != null) {
                                String str5 = next.path;
                                o.LJIIIIZZ(str5, "model.path");
                                c63l.LJJJI(str5);
                                String str6 = next.stickerId;
                                o.LJIIIIZZ(str6, "model.stickerId");
                                c63l.LJIILLIIL(str6);
                                it.remove();
                            }
                        }
                    } else {
                        it.remove();
                    }
                } else {
                    AnonymousClass673 anonymousClass673 = this.LJZL;
                    if (anonymousClass673 != null) {
                        String str7 = next.path;
                        o.LJIIIIZZ(str7, "model.path");
                        anonymousClass673.LLJJI().LJJIJ(str7);
                        String str8 = next.stickerId;
                        o.LJIIIIZZ(str8, "model.stickerId");
                        anonymousClass673.LLJJI().LLIFFJFJJ = str8;
                        it.remove();
                    }
                }
            }
        }
    }

    public final void LLLL() {
        if (C42000Ge4.LJIILIIL(LLJLLL())) {
            InterfaceC139045cy interfaceC139045cy = this.LLJILJIL;
            if (interfaceC139045cy != null) {
                interfaceC139045cy.fl0("edit_page_entrance", AnonymousClass644.LJLIL);
                return;
            }
            return;
        }
        C63D c63d = this.LLJI;
        if (c63d != null && c63d.QZ() != null) {
            c63d.PN(c63d.QZ());
            return;
        }
        LLLLIIL();
        C63D c63d2 = this.LLJI;
        if (c63d2 != null) {
            c63d2.h9(null);
        }
        LLLF().setReadTextIcon(false);
        LLLF().LJII();
        LLLF().setCurrentClickTime(System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (LLJLLL().mSubtitleMusicChangeChecker.hasChanged(LLJLLL()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r1.musicVolume > 0.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (LLJLLL().mSubtitleMusicChangeChecker.hasChanged(LLJLLL()) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (LLJLLL().hadRecordWithVolume() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIIIILLL() {
        /*
            r5 = this;
            boolean r0 = X.C133195Kp.LIZ()
            r2 = 0
            if (r0 != 0) goto L64
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLL()
            boolean r0 = X.C44384HbQ.LJLJJLL(r0)
            if (r0 != 0) goto L1b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLL()
            boolean r0 = r0.hadRecordWithVolume()
            if (r0 == 0) goto L2c
        L1b:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLL()
            X.6B8 r1 = r0.mSubtitleMusicChangeChecker
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLL()
            boolean r0 = r1.hasChanged(r0)
            if (r0 == 0) goto L2c
        L2b:
            r2 = 1
        L2c:
            X.V8O r0 = r5.getScope()
            java.lang.String r4 = "needRecognize"
            java.lang.Object r3 = r0.LIZ(r4)
            X.5qO r3 = (X.C147365qO) r3
            java.lang.String r1 = "scope"
            if (r3 == 0) goto L50
            r3.LJLIL = r2
            X.V8O r0 = r5.getScope()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.Object, java.lang.Object> r0 = r0.LIZLLL
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r4, r3)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L63
        L50:
            X.V8O r0 = r5.getScope()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            X.5qO r1 = new X.5qO
            r1.<init>(r2)
            java.util.Map<java.lang.Object, java.lang.Object> r0 = r0.LIZLLL
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r4, r1)
        L63:
            return
        L64:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLL()
            boolean r0 = X.C44384HbQ.LJLJJLL(r0)
            if (r0 != 0) goto L8e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLL()
            boolean r0 = r0.hadRecordWithVolume()
            if (r0 != 0) goto L8e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.LLJLLL()
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            boolean r0 = r1.hasMusic()
            if (r0 == 0) goto L2c
            float r1 = r1.musicVolume
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2c
        L8e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLL()
            X.6B8 r1 = r0.mSubtitleMusicChangeChecker
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLL()
            boolean r0 = r1.hasChanged(r0)
            if (r0 == 0) goto L2c
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63C.LLLLIIIILLL():void");
    }

    public void LLLLIIL() {
        OSZ<Integer, Integer> osz;
        VESize LLILZ;
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null && (LLILZ = value.LLILZ()) != null) {
            osz = new OSZ<>(Integer.valueOf(LLILZ.width), Integer.valueOf(LLILZ.height));
        } else {
            osz = null;
        }
        C63D c63d = this.LLJI;
        if (c63d != null) {
            c63d.LLILLIZIL(osz);
        }
        C6CP c6cp = this.LLFFF;
        if (c6cp != null && osz != null) {
            int intValue = Integer.valueOf(osz.getFirst().intValue()).intValue();
            ViewGroup.LayoutParams layoutParams = c6cp.mView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = intValue;
            marginLayoutParams.setMarginStart((C81184Vtc.LJ(c6cp.mView.getContext()) - intValue) / 2);
            c6cp.mView.setLayoutParams(marginLayoutParams);
        }
    }

    public boolean LLZZ() {
        if (LLL().LJJL() || LJIJ() || C6H4.LJI(LLJLLL().creativeModel.stickerModel)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC150395vH
    public final void W3() {
        getEditPreviewApi().U2(false, false, false);
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC142515iZ editAdapterApi = getEditAdapterApi();
        if (editAdapterApi != null) {
            editAdapterApi.zp(null);
        }
        InterfaceC142515iZ editAdapterApi2 = getEditAdapterApi();
        if (editAdapterApi2 != null) {
            editAdapterApi2.cc(null);
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        LLLJL();
        if ((!H7R.LJJJJL(LLJLLL()) && !H7R.LJJLIIIJJIZ(LLJLLL())) || !this.LLJ) {
            LLL().b1(null);
            this.LLJ = true;
        }
        this.LLILIL = false;
    }

    @Override // X.InterfaceC150395vH
    public final void s1() {
        boolean z;
        C63R c63r = (C63R) C44384HbQ.LJJJI(this).LJ(C63R.class);
        if (c63r != null) {
            z = c63r.LLLLLLL();
        } else {
            z = false;
        }
        if (!z) {
            getEditPreviewApi().U2(true, false, true);
        }
        C63Q c63q = (C63Q) C44384HbQ.LJJJI(this).LJ(C63Q.class);
        if (c63q == null || !c63q.LLLLLLL()) {
            getEditPreviewApi().U2(true, false, true);
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public static final void LLLIILIL(boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(1111, ggo, EnumC42283Gid.DUAL_BALL_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    public final void LJIJJ(boolean z) {
        AnonymousClass673 anonymousClass673 = this.LJZL;
        if (anonymousClass673 != null) {
            anonymousClass673.LLJJI().LLFF = z;
        }
        C67C c67c = this.LJLLJ;
        if (c67c != null) {
            C1556769b LLJJI = c67c.LLJJI();
            LLJJI.LLFF = z;
            if (z) {
                C156426By c156426By = LLJJI.LJLL;
                if ((c156426By instanceof C1557269g) && c156426By != null) {
                    c156426By.LJIILL();
                }
            }
        }
        C63L c63l = (C63L) C44384HbQ.LJJJI(this).LJ(C63L.class);
        if (c63l != null) {
            c63l.LJIJJ(z);
        }
        LLJJJ().LJIJJ(z);
        LLJJIJIL().LJIJJ(z);
        C63R c63r = (C63R) C44384HbQ.LJJJI(this).LJ(C63R.class);
        if (c63r != null) {
            c63r.LJIJJ(z);
        }
        C63K c63k = (C63K) C44384HbQ.LJJJI(this).LJ(C63K.class);
        if (c63k != null) {
            c63k.LJIJJ(z);
        }
        C63Q c63q = (C63Q) C44384HbQ.LJJJI(this).LJ(C63Q.class);
        if (c63q != null) {
            c63q.LJIJJ(z);
        }
    }

    public final void LLJJ(C143825kg c143825kg) {
        InterfaceC1541863i interfaceC1541863i;
        C63R c63r = (C63R) C44384HbQ.LJJJI(this).LJ(C63R.class);
        if (c63r != null) {
            c63r.LJJIII();
        }
        C63K c63k = (C63K) C44384HbQ.LJJJI(this).LJ(C63K.class);
        if (c63k != null) {
            c63k.LJJIII();
        }
        C63Q c63q = (C63Q) C44384HbQ.LJJJI(this).LJ(C63Q.class);
        if (c63q != null) {
            c63q.LJJIII();
        }
        C63L c63l = (C63L) C44384HbQ.LJJJI(this).LJ(C63L.class);
        if (c63l != null) {
            c63l.LJJIII();
        }
        if (C143125jY.LIZ() && (interfaceC1541863i = this.LJLLLLLL) != null) {
            interfaceC1541863i.removeSticker();
        }
        AnonymousClass673 anonymousClass673 = this.LJZL;
        if (anonymousClass673 != null) {
            anonymousClass673.LLJJI().LJJII();
            EditCommentStickerViewModel LLJILJILJ = anonymousClass673.LLJILJILJ();
            if (LLJILJILJ != null) {
                LLJILJILJ.setState(C1546965h.LJLIL);
            }
        }
        C1550766t c1550766t = this.LLIFFJFJJ;
        if (c1550766t != null) {
            c1550766t.LLJILJILJ().LJJII();
        }
        C67C c67c = this.LJLLJ;
        if (c67c != null) {
            c67c.LLJJI().LJJII();
            EditDonationStickerViewModel LLJILJIL = c67c.LLJILJIL();
            if (LLJILJIL != null) {
                LLJILJIL.setState(C1546865g.LJLIL);
            }
        }
        C1557569j c1557569j = this.LJLLL;
        if (c1557569j != null) {
            c1557569j.LLJJ().LJJII();
        }
        LLJJJ().LJJIII();
        LLJJIJIL().LJJIII();
        if (c143825kg == null || c143825kg.LJLLI) {
            LLL().M6();
        }
        LJI();
    }

    public void LLLJIL(C275416g builder) {
        o.LJIIIZ(builder, "builder");
        if (!C42000Ge4.LJIILIIL(LLJLLL())) {
            EnumC06840Oq enumC06840Oq = EnumC06840Oq.HIDE;
            builder.LIZ.LIZIZ(C0I7.LAZY, null, InterfaceC152145y6.class, C151995xr.class, C1547665o.class, R.id.bie, enumC06840Oq, new AqS133S0200000_2(builder, new C275516h(), this, 70));
        }
    }

    @Override // X.WM7
    public void onActivityCreated(Bundle bundle) {
        LiveEvent<C76800UCe> id;
        MutableLiveData<OSZ<String, Integer>> p3;
        LiveData<C76800UCe> ga0;
        LiveData<C76800UCe> Ht0;
        MutableLiveData<Integer> E0;
        MutableLiveData<Integer> z1;
        MutableLiveData<Integer> J9;
        LiveEvent<Long> OM;
        C0IB<List<CaptionUtterance>> Wh;
        C29901Fi<C76800UCe> Tt0;
        C29901Fi<Boolean> Vy;
        C29901Fi<Boolean> o;
        C29901Fi<OSZ<Boolean, Boolean>> LLILLJJLI;
        LiveEvent<Boolean> li0;
        LiveEvent<TextStickerData> nq0;
        LiveEvent<OSZ<TextStickerData, String>> Np0;
        LiveEvent<String> AN;
        LiveEvent<Boolean> y70;
        LiveEvent<TextStickerData> Wl;
        LiveEvent<C76800UCe> b10;
        C0IB<C67P> nO;
        LiveEvent<C67P> rW;
        LiveEvent<C67P> yr0;
        C29901Fi<C76800UCe> LLZZZZ;
        super.onActivityCreated(bundle);
        H78.LIZ("EditStickerScene onActivityCreated");
        C78685UuP.LJIIJJI(this, C89478Z9u.LJLIL);
        C78688UuS.LJIIIZ(this, false, new AqS168S0100000_2(this, 266));
        C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 265));
        C44384HbQ.LJJJI(this);
        C60903NvH.LJIIJJI().LJIJJLI();
        C82622Wbi c82622Wbi = C44384HbQ.LJJJI(this).LJLLL;
        if (c82622Wbi != null) {
            this.LLJI = (C63D) c82622Wbi.LJIIIIZZ(null, C63D.class);
            this.LLJILJIL = (InterfaceC139045cy) c82622Wbi.LJIIIIZZ(null, InterfaceC139045cy.class);
            this.LLJIJIL = (InterfaceC139655dx) c82622Wbi.LJ(InterfaceC139655dx.class, null);
            InterfaceC142515iZ editAdapterApi = getEditAdapterApi();
            if (editAdapterApi != null) {
                editAdapterApi.cc((InterfaceC139045cy) c82622Wbi.LJIIIIZZ(null, InterfaceC139045cy.class));
            }
            InterfaceC142515iZ editAdapterApi2 = getEditAdapterApi();
            if (editAdapterApi2 != null) {
                editAdapterApi2.HC((InterfaceC139655dx) c82622Wbi.LJ(InterfaceC139655dx.class, null));
            }
            this.LJZI = (InterfaceC138265bi) c82622Wbi.LJ(InterfaceC138265bi.class, null);
            this.LLIZLLLIL = (InterfaceC147905rG) c82622Wbi.LJ(InterfaceC147905rG.class, null);
            this.LLFZ = (C63I) c82622Wbi.LJ(C63I.class, null);
            this.LLFII = (C63H) c82622Wbi.LJ(C63H.class, null);
            InterfaceC142515iZ editAdapterApi3 = getEditAdapterApi();
            if (editAdapterApi3 != null) {
                editAdapterApi3.zp(this.LLJI);
            }
            this.LLIIZ = (InterfaceC152145y6) c82622Wbi.LJIIIIZZ(null, InterfaceC152145y6.class);
            this.LLI = (InterfaceC147775r3) c82622Wbi.LJ(InterfaceC147775r3.class, null);
            this.LLILL = (InterfaceC138705cQ) c82622Wbi.LJIIIIZZ(null, InterfaceC138705cQ.class);
            JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(EditDonationStickerViewModel.class);
            o.LJIIIIZZ(LIZ, "SAAJediViewModelProvider…kerViewModel::class.java]");
            this.LLII = (EditDonationStickerViewModel) LIZ;
            JediViewModel LIZ2 = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(EditNatureStickerViewModel.class);
            o.LJIIIIZZ(LIZ2, "SAAJediViewModelProvider…kerViewModel::class.java]");
            this.LLIIIILZ = (EditNatureStickerViewModel) LIZ2;
            o.LJIIIZ(C165706es.LJIIIIZZ(this, null, null, 6).get(InfoStickerViewModel.class), "<set-?>");
            if (!e1.LIZ(31744, "enable_first_frame_opt_for_sticker_framework", true, false)) {
                LLLIZZ();
            }
            JediViewModel LIZ3 = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(EditCommentStickerViewModel.class);
            o.LJIIIIZZ(LIZ3, "SAAJediViewModelProvider…kerViewModel::class.java]");
            this.LLIIII = (EditCommentStickerViewModel) LIZ3;
            C82622Wbi c82622Wbi2 = C44384HbQ.LJJJI(this).LJLLL;
            o.LJI(c82622Wbi2);
            this.LLILZ = c82622Wbi2;
            if (!C42000Ge4.LJIILIIL(LLJLLL())) {
                C63D c63d = this.LLJI;
                if (c63d != null && (LLZZZZ = c63d.LLZZZZ()) != null) {
                    LLZZZZ.LIZLLL(this, new AObjectS84S0100000_2(this, 162));
                }
                C63D c63d2 = this.LLJI;
                if (c63d2 != null && (yr0 = c63d2.yr0()) != null) {
                    yr0.LIZLLL(this, new AObjectS84S0100000_2(this, 165));
                }
                C63D c63d3 = this.LLJI;
                if (c63d3 != null && (rW = c63d3.rW()) != null) {
                    rW.LIZLLL(this, new AObjectS84S0100000_2(this, 167));
                }
                C63D c63d4 = this.LLJI;
                if (c63d4 != null && (nO = c63d4.nO()) != null) {
                    nO.LIZIZ(this, new AObjectS84S0100000_2(this, 169));
                }
                C63D c63d5 = this.LLJI;
                if (c63d5 != null && (b10 = c63d5.b10()) != null) {
                    b10.LIZLLL(this, new AObjectS84S0100000_2(this, 171));
                }
                C63D c63d6 = this.LLJI;
                if (c63d6 != null && (Wl = c63d6.Wl()) != null) {
                    Wl.LIZLLL(this, new AObjectS84S0100000_2(this, 173));
                }
                C63D c63d7 = this.LLJI;
                if (c63d7 != null && (y70 = c63d7.y70()) != null) {
                    y70.LIZLLL(this, new AObjectS84S0100000_2(this, 175));
                }
                C63D c63d8 = this.LLJI;
                if (c63d8 != null && (AN = c63d8.AN()) != null) {
                    AN.LIZLLL(this, new AObjectS84S0100000_2(this, 179));
                }
                C63D c63d9 = this.LLJI;
                if (c63d9 != null && (Np0 = c63d9.Np0()) != null) {
                    Np0.LIZLLL(this, new AObjectS84S0100000_2(this, 182));
                }
                C63D c63d10 = this.LLJI;
                if (c63d10 != null && (nq0 = c63d10.nq0()) != null) {
                    nq0.LIZLLL(this, new AObjectS84S0100000_2(this, 154));
                }
                C63D c63d11 = this.LLJI;
                if (c63d11 != null && (li0 = c63d11.li0()) != null) {
                    li0.LIZLLL(this, new AObjectS84S0100000_2(this, 156));
                }
                C63D c63d12 = this.LLJI;
                if (c63d12 != null) {
                    c63d12.LJIIL(LLJJJIL().N4());
                }
                C63D c63d13 = this.LLJI;
                if (c63d13 != null && (LLILLJJLI = c63d13.LLILLJJLI()) != null) {
                    LLILLJJLI.LIZLLL(this, new AObjectS84S0100000_2(this, 158));
                }
                C63D c63d14 = this.LLJI;
                if (c63d14 != null && (o = c63d14.o()) != null) {
                    o.LIZLLL(this, new AObjectS84S0100000_2(this, 160));
                }
            }
            LLJJJIL().Ap0().LIZLLL(this, new AObjectS84S0100000_2(this, 161));
            LLJJJIL().Z40().LIZLLL(this, new AObjectS84S0100000_2(this, 185));
            LLJJJIL().E60().LIZLLL(this, new AObjectS84S0100000_2(this, 187));
            LLJJJIL().ls().LIZLLL(this, new AObjectS84S0100000_2(this, 188));
            LLJJJIL().sH().observe(this, new AObserverS70S0100000_2(this, 113));
            LLJJJIL().yf0().observe(this, new AObserverS70S0100000_2(this, 114));
            LLJJJIL().A10().observe(this, new AObserverS70S0100000_2(this, 115));
            LLJJJIL().Ak0().LIZIZ(this, new AObjectS84S0100000_2(this, 192));
            LLJJJIL().E30().LIZLLL(this, new AObjectS84S0100000_2(this, 151));
            LLJJJIL().k80().LIZLLL(this, new AObjectS84S0100000_2(this, 189));
            LLJJJIL().aV().LIZLLL(this, new AObjectS84S0100000_2(this, 190));
            LLJJJIL().Bg0().LIZLLL(this, new AObjectS84S0100000_2(this, 191));
            LLJJJIL().Fj().LIZLLL(this, new AObjectS84S0100000_2(this, 193));
            LLJJJIL().UI().LIZLLL(this, new AObjectS84S0100000_2(this, 150));
            LLJJJIL().T50().LIZLLL(this, new AObjectS84S0100000_2(this, 152));
            LLJJJIL().Xe().LIZLLL(this, new AObjectS84S0100000_2(this, 153));
            LLJJJIL().xw().LIZLLL(this, new AObjectS84S0100000_2(this, 155));
            LLJJJIL().d60().LIZLLL(this, new AObjectS84S0100000_2(this, 157));
            LLJJJIL().M90().LIZLLL(this, new AObjectS84S0100000_2(this, 159));
            LLJJJIL().v5().LIZLLL(this, new AObjectS84S0100000_2(this, 163));
            LLJJJIL().b4().LIZLLL(this, new AObjectS84S0100000_2(this, 164));
            LLJJJIL().zj().LIZLLL(this, new AObjectS84S0100000_2(this, 166));
            LLJJJIL().aj0().LIZLLL(this, new AObjectS84S0100000_2(this, 168));
            LLJJJIL().c0().LIZLLL(this, new AObjectS84S0100000_2(this, 170));
            LLJJJIL().i4().LIZLLL(this, new AObjectS84S0100000_2(this, 172));
            LLJJJIL().hl().LIZLLL(this, new AObjectS84S0100000_2(this, 174));
            LLJJJIL().N4().observe(this, new AObserverS70S0100000_2(this, 103));
            getEditPreviewApi().PM().observe(this, new AObserverS70S0100000_2(this, 105));
            LLJJIII().ab().observe(this, new AObserverS70S0100000_2(this, 107));
            getEditPreviewApi().jb().observe(this, new AObserverS66S0200000_2(new C34K(), this, 11));
            if (!C42000Ge4.LJIILIIL(LLJLLL())) {
                C63D c63d15 = this.LLJI;
                if (c63d15 != null && (Vy = c63d15.Vy()) != null) {
                    Vy.LIZLLL(this, new AObjectS84S0100000_2(this, 176));
                }
                C63D c63d16 = this.LLJI;
                if (c63d16 != null && (Tt0 = c63d16.Tt0()) != null) {
                    Tt0.LIZLLL(this, new AObjectS84S0100000_2(this, 181));
                }
                InterfaceC143855kj editSubtitleApi = getEditSubtitleApi();
                if (editSubtitleApi != null && (Wh = editSubtitleApi.Wh()) != null) {
                    Wh.LIZIZ(this, new AObjectS84S0100000_2(this, 183));
                }
                InterfaceC143855kj editSubtitleApi2 = getEditSubtitleApi();
                if (editSubtitleApi2 != null && (OM = editSubtitleApi2.OM()) != null) {
                    OM.LIZLLL(this, new AObjectS84S0100000_2(this, 184));
                }
                InterfaceC143855kj editSubtitleApi3 = getEditSubtitleApi();
                if (editSubtitleApi3 != null && (J9 = editSubtitleApi3.J9()) != null) {
                    J9.observe(this, new AObserverS70S0100000_2(this, 108));
                }
                InterfaceC143855kj editSubtitleApi4 = getEditSubtitleApi();
                if (editSubtitleApi4 != null && (z1 = editSubtitleApi4.z1()) != null) {
                    z1.observe(this, new AObserverS70S0100000_2(this, 109));
                }
                InterfaceC143855kj editSubtitleApi5 = getEditSubtitleApi();
                if (editSubtitleApi5 != null && (E0 = editSubtitleApi5.E0()) != null) {
                    E0.observe(this, new AObserverS70S0100000_2(this, 110));
                }
                InterfaceC143855kj editSubtitleApi6 = getEditSubtitleApi();
                if (editSubtitleApi6 != null && (Ht0 = editSubtitleApi6.Ht0()) != null) {
                    Ht0.observe(this, new AObserverS70S0100000_2(this, 111));
                }
                InterfaceC143855kj editSubtitleApi7 = getEditSubtitleApi();
                if (editSubtitleApi7 != null && (ga0 = editSubtitleApi7.ga0()) != null) {
                    ga0.observe(this, new AObserverS70S0100000_2(this, 112));
                }
                InterfaceC143855kj editSubtitleApi8 = getEditSubtitleApi();
                if (editSubtitleApi8 != null && (p3 = editSubtitleApi8.p3()) != null) {
                    p3.observe(this, new AObserverS70S0100000_2(this, 102));
                }
            }
            InterfaceC136115Vv LLJJJJ = LLJJJJ();
            if (LLJJJJ != null && (id = LLJJJJ.id()) != null) {
                id.LIZLLL(this, new AObjectS84S0100000_2(this, 186));
            }
            if (this.LLFFF == null) {
                C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
                if (LJJLIIIJJI != null) {
                    C6CP c6cp = new C6CP(LJJLIIIJJI);
                    this.LLFFF = c6cp;
                    add(R.id.ml_, c6cp, "StickerHintTextScene");
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (e1.LIZ(31744, "studio_back_edit_from_duration", true, false)) {
                InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this);
                if (LIZIZ == null) {
                    LIZIZ = (InterfaceC45540Hu4) this.LJLIL.LJ(InterfaceC45540Hu4.class, null);
                }
                LIZIZ.registerActivityOnKeyDownListener((C5HC) this.LLIZ.getValue());
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C63C(int i, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = i;
        this.LJLJI = UCI.LJII(diContainer, InterfaceC138185ba.class, null);
        this.LJLJJI = UCI.LJII(diContainer, InterfaceC142515iZ.class, null);
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJL = UCI.LJI(diContainer, C137965bE.class, null);
        this.LJLJLJ = UCI.LJII(diContainer, InterfaceC150955wB.class, null);
        this.LJLLI = UCI.LJI(diContainer, InterfaceC81454Vxy.class, null);
        this.LJLLILLLL = UCI.LJII(diContainer, InterfaceC1542063k.class, null);
        this.LLD = UCI.LJII(diContainer, InterfaceC143855kj.class, null);
        this.LLF = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LLFF = UCI.LJII(diContainer, InterfaceC136115Vv.class, null);
        UCI.LJII(diContainer, InterfaceC44717Hgn.class, null);
        this.LLIIIJ = new ArrayList();
        this.LLILII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 475));
        this.LLILLIZIL = new SafeHandler(this);
        this.LLILZ = new C82622Wbi(new C82621Wbh[0]);
        this.LLILZIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 467));
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 474));
        this.LLILZLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 469));
        this.LLIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 460));
        this.LLJILJILJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 464));
        this.LLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 465));
    }

    public final void LLLILZLLLI(String str, boolean z) {
        String str2;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LLJLLL().getCreationId());
        c145995oB.LJI("shoot_way", LLJLLL().mShootWay);
        c145995oB.LJI("content_type", H8F.LJII(LLJLLL()));
        c145995oB.LJI("content_source", H8F.LJI(LLJLLL()));
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("prop_id", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_new_sticker_framework", str2);
        FMX.LJIIL("poll_edit", c145995oB.LIZ);
    }

    public void O9(Effect effect, String str) {
        int i;
        int i2;
        int i3;
        InterfaceC1541863i interfaceC1541863i;
        ActivityC45651qj activityC45651qj;
        ActivityC45651qj activityC45651qj2;
        ActivityC45651qj activityC45651qj3;
        o.LJIIIZ(effect, "effect");
        LLLII();
        C63R c63r = (C63R) C44384HbQ.LJJJI(this).LJ(C63R.class);
        if (c63r != null && c63r.LJIJJLI()) {
            i = 1;
        } else {
            i = 0;
        }
        C63Q c63q = (C63Q) C44384HbQ.LJJJI(this).LJ(C63Q.class);
        if (c63q != null && c63q.LJIJJLI()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int LLJL = LLJJJ().LLJL();
        int LLJL2 = LLJJIJIL().LLJL();
        C63K c63k = (C63K) C44384HbQ.LJJJI(this).LJ(C63K.class);
        if (c63k != null && c63k.LJIJJLI()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (LLJLIL().wD(i + i2 + LLJL + LLJL2 + i3)) {
            return;
        }
        C137965bE c137965bE = (C137965bE) this.LJLJL.LIZ(this, LLJJIII[4]);
        AbstractC42651GoZ LJJIJIIJIL = C86793Y4n.LJJIJIIJIL(this);
        c137965bE.getClass();
        new C41386GMc(LJJIJIIJIL, ID0.LIZ(effect)).LIZ(new C137975bF(c137965bE, effect));
        if (effect.getTags().contains("location")) {
            Activity activity = this.mActivity;
            if ((activity instanceof ActivityC45651qj) && (activityC45651qj3 = (ActivityC45651qj) activity) != null) {
                C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
                if (LJJLIIIJJI != null) {
                    C63L c63l = (C63L) LJJLIIIJJI.LJ(C63L.class, null);
                    c63l.show();
                    c63l.LJJJI(effect.getUnzipPath());
                    c63l.LJIILLIIL(effect.getEffectId());
                    c63l.Ta0(activityC45651qj3);
                    this.LJZ = c63l;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            getEditPreviewApi().m70(false);
            return;
        }
        if (effect.getTags().contains("donation")) {
            Activity activity2 = this.mActivity;
            if (!(activity2 instanceof ActivityC45651qj) || (activityC45651qj2 = (ActivityC45651qj) activity2) == null) {
                return;
            }
            C67C c67c = this.LJLLJ;
            if (c67c != null) {
                String stickerPath = effect.getUnzipPath();
                o.LJIIIZ(stickerPath, "stickerPath");
                c67c.LLJJI().LJJIJ(stickerPath);
            }
            C67C c67c2 = this.LJLLJ;
            if (c67c2 != null) {
                String stickerId = effect.getEffectId();
                o.LJIIIZ(stickerId, "stickerId");
                c67c2.LLJJI().LLII = stickerId;
            }
            C67C c67c3 = this.LJLLJ;
            if (c67c3 != null) {
                FragmentManager supportFragmentManager = activityC45651qj2.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
                c67c3.LLJJIJIIJIL(supportFragmentManager);
            }
            C63O.LIZ(C63W.DONATION, LLJLLL(), false);
            return;
        }
        if (effect.getTags().contains("plantScanner")) {
            Activity activity3 = this.mActivity;
            if (!(activity3 instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) activity3) == null) {
                return;
            }
            C1557569j c1557569j = this.LJLLL;
            if (c1557569j != null) {
                String stickerPath2 = effect.getUnzipPath();
                o.LJIIIZ(stickerPath2, "stickerPath");
                c1557569j.LLJJ().LJLLLL = stickerPath2;
            }
            C1557569j c1557569j2 = this.LJLLL;
            if (c1557569j2 != null) {
                String stickerId2 = effect.getEffectId();
                o.LJIIIZ(stickerId2, "stickerId");
                c1557569j2.LLJJ().LLII = stickerId2;
            }
            if (!new AnonymousClass641().LIZ.getBoolean("has_shown_nature_sticker_guide", false)) {
                NatureStickerGuideFragment natureStickerGuideFragment = new NatureStickerGuideFragment();
                TuxSheet tuxSheet = new ASL().LIZ;
                tuxSheet.LJLLILLLL = natureStickerGuideFragment;
                tuxSheet.LJLILLLLZI = new IDDListenerS100S0200000_2(this, activityC45651qj, 0);
                Activity activity4 = this.mActivity;
                o.LJII(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                C1DG.LJII((ActivityC45651qj) activity4, "activity as FragmentActi…y).supportFragmentManager", tuxSheet, "NatureStickerGuideFragment");
                C145995oB c145995oB = new C145995oB();
                c145995oB.LIZLLL("enter_from", "video_edit_page");
                FMX.LJIIL("show_nature_first_info", c145995oB.LIZ);
                return;
            }
            C1557569j c1557569j3 = this.LJLLL;
            if (c1557569j3 == null) {
                return;
            }
            FragmentManager supportFragmentManager2 = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager2, "supportFragmentManager");
            c1557569j3.LLJJIJI(supportFragmentManager2);
            return;
        }
        if (effect.getTags().contains("addyours")) {
            if (C44384HbQ.LJLLI(LLJLLL())) {
                AnonymousClass643 anonymousClass643 = (AnonymousClass643) this.LLILZIL.getValue();
                if (anonymousClass643 == null) {
                    return;
                }
                anonymousClass643.Q(null);
                return;
            }
            AnonymousClass643 anonymousClass6432 = (AnonymousClass643) this.LLILZIL.getValue();
            if (anonymousClass6432 == null) {
                return;
            }
            anonymousClass6432.ft0("edit_page_sticker");
            return;
        }
        if (effect.getTags().contains("CountdownSticker")) {
            getEditPreviewApi().m70(false);
            this.LJLZ = (C63Q) this.LLILZ.LJ(C63Q.class, null);
            LLJLILLLLZIIL().show();
            LLJLILLLLZIIL().td0();
            LLJLILLLLZIIL().LJIILLIIL(effect.getEffectId());
            EffectCategoryResponse LJ = TN4.LIZIZ().LJ(effect);
            if (LJ != null) {
                LLJLILLLLZIIL().LLLLLZL(LJ.getId());
            }
            C63O.LIZ(C63W.LIVE_CD, LLJLLL(), false);
            return;
        }
        if (effect.getTags().contains("pollsticker")) {
            if (C143125jY.LIZ()) {
                C82622Wbi LJJLIIIJJI2 = C44384HbQ.LJJLIIIJJI(this);
                if (LJJLIIIJJI2 != null) {
                    interfaceC1541863i = (InterfaceC1541863i) LJJLIIIJJI2.LJ(InterfaceC1541863i.class, null);
                } else {
                    interfaceC1541863i = null;
                }
                this.LJLLLLLL = interfaceC1541863i;
                if (interfaceC1541863i != null && interfaceC1541863i.E70() != null) {
                    InterfaceC1541863i interfaceC1541863i2 = this.LJLLLLLL;
                    if (interfaceC1541863i2 != null) {
                        interfaceC1541863i2.sg0();
                        return;
                    }
                    return;
                }
                getEditPreviewApi().m70(false);
                InterfaceC1541863i interfaceC1541863i3 = this.LJLLLLLL;
                if (interfaceC1541863i3 != null) {
                    interfaceC1541863i3.F50(null);
                }
                InterfaceC1541863i interfaceC1541863i4 = this.LJLLLLLL;
                if (interfaceC1541863i4 != null) {
                    interfaceC1541863i4.LJIILLIIL(effect.getEffectId());
                }
                LLLILZLLLI(effect.getEffectId(), true);
                C63O.LIZ(C63W.POLL, LLJLLL(), true);
                return;
            }
            getEditPreviewApi().m70(false);
            if (this.LJLLLL == null) {
                C82622Wbi LJJLIIIJJI3 = C44384HbQ.LJJLIIIJJI(this);
                if (LJJLIIIJJI3 != null) {
                    this.LJLLLL = (C63R) LJJLIIIJJI3.LJ(C63R.class, null);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            LLJLLIL().show();
            LLJLLIL().WO();
            LLJLLIL().LJIILLIIL(effect.getEffectId());
            EffectCategoryResponse LJ2 = TN4.LIZIZ().LJ(effect);
            if (LJ2 != null) {
                LLJLLIL().LLLLLZL(LJ2.getId());
            }
            LLLILZLLLI(effect.getEffectId(), false);
            C63O.LIZ(C63W.POLL, LLJLLL(), false);
            return;
        }
        if (C77117UOj.LJIJJLI(effect)) {
            getEditPreviewApi().m70(false);
            C82622Wbi LJJLIIIJJI4 = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI4 != null) {
                this.LL = (C63K) LJJLIIIJJI4.LJ(C63K.class, null);
                LLJZIJLIL().show();
                LLJZIJLIL().ii0();
                LLJZIJLIL().LJIILLIIL(effect.getEffectId());
                LLJZIJLIL().C00();
                EffectCategoryResponse LJ3 = TN4.LIZIZ().LJ(effect);
                if (LJ3 != null) {
                    LLJZIJLIL().LLLLLZL(LJ3.getId());
                }
                C63O.LIZ(C63W.QA, LLJLLL(), false);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (effect.getTags().contains("commentPanel")) {
            C82622Wbi LJJLIIIJJI5 = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI5 != null) {
                this.LL = (C63K) LJJLIIIJJI5.LJ(C63K.class, null);
                LLJZIJLIL().show();
                getEditPreviewApi().m70(false);
                LLJJIII().yK();
                LLJJIII().W9();
                C63O.LIZ(C63W.COMMENT, LLJLLL(), false);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (effect.getTags().contains("mention")) {
            LLJJJ().LJJJI(effect.getUnzipPath());
            LLJJJ().LJIILLIIL(effect.getEffectId());
            LLJJJ().LLZLLLL();
            C63O.LIZ(C63W.MENTION, LLJLLL(), false);
            return;
        }
        if (effect.getTags().contains("hashtag")) {
            LLJJIJIL().LJJJI(effect.getUnzipPath());
            LLJJIJIL().LJIILLIIL(effect.getEffectId());
            LLJJIJIL().LLZLLLL();
            C63O.LIZ(C63W.HASHTAG, LLJLLL(), false);
            return;
        }
        if (C77117UOj.LJIJ(effect)) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ConcurrentHashMap<String, Object> LIZ = C63872f1.LIZ(str);
            if (LIZ != null) {
                InterfaceC147905rG LLJLIL = LLJLIL();
                Object obj = LIZ.get("stickerId");
                o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = LIZ.get("path");
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = LIZ.get("width");
                o.LJII(obj3, "null cannot be cast to non-null type kotlin.String");
                int parseInt = CastIntegerProtector.parseInt((String) obj3);
                Object obj4 = LIZ.get("height");
                o.LJII(obj4, "null cannot be cast to non-null type kotlin.String");
                int parseInt2 = CastIntegerProtector.parseInt((String) obj4);
                Object obj5 = LIZ.get("cutout");
                o.LJII(obj5, "null cannot be cast to non-null type kotlin.String");
                LLJLIL.ps((String) obj, (String) obj2, parseInt, parseInt2, Boolean.parseBoolean((String) obj5));
            }
            C63O.LIZ(C63W.CUSTOM, LLJLLL(), false);
            return;
        }
        if (effect.getTags().contains("MagnifierSticker")) {
            LLJLIL().je0(effect, "MagnifierSticker");
        } else if (TN4.LIZIZ().LJ(effect) != null && TN4.LIZIZ().LJ(effect).getKey().equals(ECommerceAnchorService.LJJJJI().LJIIL())) {
            LLJLIL().je0(effect, ECommerceAnchorService.LJJJJI().LJIIL());
        } else {
            LLJLIL().je0(effect, str);
            C63O.LIZ(C63W.INFO, LLJLLL(), false);
        }
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.l5i);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.text_sticker_layout_layer)");
        this.LLIIIL = (FrameLayout) requireViewById;
        View requireViewById2 = requireViewById(R.id.l5k);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.tex…ticker_poll_layout_layer)");
        this.LLIIIZ = (FrameLayout) requireViewById2;
        View requireViewById3 = requireViewById(R.id.l5d);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.tex…ker_comment_layout_layer)");
        this.LLIIJI = (FrameLayout) requireViewById3;
        View requireViewById4 = requireViewById(R.id.l5j);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.tex…ker_live_cd_layout_layer)");
        this.LLIIJLIL = (FrameLayout) requireViewById4;
        View requireViewById5 = requireViewById(R.id.ihb);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.qa_sticker_layout_layer)");
        this.LLIIL = (FrameLayout) requireViewById5;
        View requireViewById6 = requireViewById(R.id.dcs);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.fl_caption)");
        this.LLIILII = (FrameLayout) requireViewById6;
        View requireViewById7 = requireViewById(R.id.g9q);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.loc…ion_sticker_layout_layer)");
        this.LLIILZL = (FrameLayout) requireViewById7;
        View requireViewById8 = requireViewById(R.id.h02);
        o.LJII(requireViewById8, "null cannot be cast to non-null type com.tiktok.sticker.stickercontainer.MTStickerContainer");
        this.LLIL = (C64F) requireViewById8;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC150315v9
    public final C10K<C76800UCe> LLIIJLIL(InterfaceC153045zY interfaceC153045zY, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
        C10K<C76800UCe> LJIIIZ;
        C10K<C76800UCe> LJIIIZ2;
        C10K<C76800UCe> LJIIIZ3;
        C10K<C76800UCe> LJIIIZ4;
        o.LJIIIZ(compileCallback, "compileCallback");
        C10K[] c10kArr = new C10K[6];
        AnonymousClass673 anonymousClass673 = this.LJZL;
        if (anonymousClass673 != null) {
            LJIIIZ = anonymousClass673.LJJIJIL(interfaceC153045zY, compileCallback, interfaceC88471Ynr);
        } else {
            LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
            o.LJIIIIZZ(LJIIIZ, "forResult(Unit)");
        }
        c10kArr[0] = LJIIIZ;
        C67C c67c = this.LJLLJ;
        if (c67c != null) {
            LJIIIZ2 = c67c.LJJIJIL(interfaceC153045zY, compileCallback, interfaceC88471Ynr);
        } else {
            LJIIIZ2 = C10K.LJIIIZ(C76800UCe.LIZ);
            o.LJIIIIZZ(LJIIIZ2, "forResult(Unit)");
        }
        c10kArr[1] = LJIIIZ2;
        C63L c63l = (C63L) C44384HbQ.LJJJI(this).LJ(C63L.class);
        if (c63l == null || (LJIIIZ3 = c63l.LJJIJIL(interfaceC153045zY, compileCallback, interfaceC88471Ynr)) == null) {
            LJIIIZ3 = C10K.LJIIIZ(C76800UCe.LIZ);
            o.LJIIIIZZ(LJIIIZ3, "forResult(Unit)");
        }
        c10kArr[2] = LJIIIZ3;
        C10K<C76800UCe> LJJIJIL = LLJJJ().LJJIJIL(interfaceC153045zY, compileCallback, interfaceC88471Ynr);
        if (LJJIJIL == null) {
            LJJIJIL = C10K.LJIIIZ(C76800UCe.LIZ);
            o.LJIIIIZZ(LJJIJIL, "forResult(Unit)");
        }
        c10kArr[3] = LJJIJIL;
        C10K<C76800UCe> LJJIJIL2 = LLJJIJIL().LJJIJIL(interfaceC153045zY, compileCallback, interfaceC88471Ynr);
        if (LJJIJIL2 == null) {
            LJJIJIL2 = C10K.LJIIIZ(C76800UCe.LIZ);
            o.LJIIIIZZ(LJJIJIL2, "forResult(Unit)");
        }
        c10kArr[4] = LJJIJIL2;
        C63K c63k = (C63K) C44384HbQ.LJJJI(this).LJ(C63K.class);
        if (c63k == null || (LJIIIZ4 = c63k.LJJIJIL(interfaceC153045zY, compileCallback, interfaceC88471Ynr)) == null) {
            LJIIIZ4 = C10K.LJIIIZ(C76800UCe.LIZ);
            o.LJIIIIZZ(LJIIIZ4, "forResult(Unit)");
        }
        c10kArr[5] = LJIIIZ4;
        C10K<Void> LJIJJ = C10K.LJIJJ(C47261Igj.LJJIJIIJI(c10kArr));
        if (LJIJJ.LJIILIIL()) {
            C10K<C76800UCe> LJIIIZ5 = C10K.LJIIIZ(C76800UCe.LIZ);
            o.LJIIIIZZ(LJIIIZ5, "{\n            Task.forResult(Unit)\n        }");
            return LJIIIZ5;
        }
        C10K LIZLLL = LJIJJ.LIZLLL(new C10I() { // from class: X.63h
            @Override // X.C10I
            public final /* bridge */ /* synthetic */ Object then(C10K c10k) {
                return C76800UCe.LIZ;
            }
        });
        o.LJIIIIZZ(LIZLLL, "{\n            task.conti…p\n            }\n        }");
        return LIZLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (r2 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C10K<X.C76800UCe> LLLFFI(X.InterfaceC153045zY r12, X.InterfaceC137115Zr r13, X.InterfaceC88471Ynr<? super java.lang.String, ? super X.EnumC43649HBd, java.lang.String> r14) {
        /*
            r11 = this;
            java.lang.String r0 = "compileCallback"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            X.5dx r0 = r11.LLL()
            boolean r0 = r0.LJJL()
            if (r0 == 0) goto L8f
            if (r14 == 0) goto L1d
            java.lang.String r1 = "text_sticker"
            X.HBd r0 = X.EnumC43649HBd.TEXT_STICKER
            java.lang.Object r6 = r14.invoke(r1, r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L29
        L1d:
            X.6nc r1 = X.C5YW.LIZIZ()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r11.LLJLLL()
            java.lang.String r6 = X.C164746dK.LJIIIZ(r1, r0)
        L29:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r11.LLJLLL()
            com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel r0 = r0.infoStickerModel
            if (r0 == 0) goto L34
            r0.clearTextStickers()
        L34:
            X.5qN r0 = r13.LJLLL()
            int r7 = r0.LIZLLL()
            X.5qN r0 = r13.LJLLL()
            int r8 = r0.LJI()
            com.ss.android.vesdk.VESize r0 = r12.LLILZ()
            int r9 = r0.width
            com.ss.android.vesdk.VESize r0 = r12.LLILZ()
            int r10 = r0.height
            X.63D r4 = r11.LLJI
            if (r4 == 0) goto L72
            X.67j r5 = new X.67j
            r5.<init>(r6, r7, r8, r9, r10)
            android.widget.FrameLayout r3 = r11.LLIIIL
            r2 = 0
            if (r3 == 0) goto L9b
            X.Wbi r1 = r11.LJLIL
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel> r0 = com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel.class
            java.lang.Object r0 = r1.LJ(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            boolean r0 = X.H7R.LJJLIIIJJIZ(r0)
            X.10K r2 = r4.Ar(r5, r3, r0)
            if (r2 != 0) goto L7d
        L72:
            X.63s<V> r0 = new java.util.concurrent.Callable() { // from class: X.63s
                static {
                    /*
                        X.63s r0 = new X.63s
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.63s<V>) X.63s.LJLIL X.63s
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1542863s.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1542863s.<init>():void");
                }

                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    /*
                        r1 = this;
                        X.OQg r0 = X.C61878OQg.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1542863s.call():java.lang.Object");
                }
            }
            X.10K r2 = X.C10K.LIZ(r0)
            java.lang.String r0 = "call {\n                r…leResult>()\n            }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L7d:
            Y.AgS72S0300000_2 r1 = new Y.AgS72S0300000_2
            r0 = 3
            r1.<init>(r13, r12, r11, r0)
            X.10C r0 = X.C10K.LJIIIIZZ
            X.10K r1 = r2.LJIILLIIL(r1, r0)
            java.lang.String r0 = "override fun getTextStic…ult(Unit)\n        }\n    }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L8e:
            return r1
        L8f:
            X.UCe r0 = X.C76800UCe.LIZ
            X.10K r1 = X.C10K.LJIIIZ(r0)
            java.lang.String r0 = "{\n            Task.forResult(Unit)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L8e
        L9b:
            java.lang.String r0 = "textPStickerLayout"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63C.LLLFFI(X.5zY, X.5Zr, X.Ynr):X.10K");
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cco, viewGroup, false, "null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
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
}
