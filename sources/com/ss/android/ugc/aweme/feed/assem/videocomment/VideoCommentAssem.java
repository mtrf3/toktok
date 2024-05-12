package com.ss.android.ugc.aweme.feed.assem.videocomment;

import X.AV1;
import X.AnonymousClass030;
import X.AnonymousClass806;
import X.AnonymousClass843;
import X.C05L;
import X.C16880lQ;
import X.C188727au;
import X.C1DH;
import X.C201837w3;
import X.C201847w4;
import X.C201857w5;
import X.C201867w6;
import X.C201887w8;
import X.C201907wA;
import X.C201917wB;
import X.C201927wC;
import X.C201937wD;
import X.C201947wE;
import X.C201957wF;
import X.C201997wJ;
import X.C202057wP;
import X.C208078Ep;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C227768wm;
import X.C241249dQ;
import X.C26045AKb;
import X.C2U8;
import X.C2WN;
import X.C33903DSh;
import X.C33911DSp;
import X.C36089EEj;
import X.C36093EEn;
import X.C51029K0z;
import X.C56852Kz;
import X.C58655N0h;
import X.C58704N2e;
import X.C59127NIl;
import X.C59128NIm;
import X.C5H3;
import X.C5S1;
import X.C61845OOz;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72U;
import X.C73340SqO;
import X.C79004UzY;
import X.C7OK;
import X.C7OL;
import X.C7OM;
import X.C7ON;
import X.C7OO;
import X.C7OP;
import X.C7OQ;
import X.C7OZ;
import X.C86V;
import X.C8MM;
import X.C8T7;
import X.C8YN;
import X.EnumC178426zO;
import X.FFL;
import X.FMX;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.KUK;
import X.LO7;
import X.LPX;
import X.NN1;
import X.ORY;
import X.OSZ;
import X.RBX;
import X.TBT;
import X.WM7;
import X.Z9N;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentRefactorPreloadTask;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import o3.IDaS89S0000000_3;
import o3.h0;

/* loaded from: classes4.dex */
public class VideoCommentAssem extends BaseCellSlotComponent<VideoCommentAssem> implements ComponentPriorityProtocol, KUK {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILII;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final C5H3 LLI;
    public final C5H3 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public final InterfaceC115514g7 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public boolean LLIIIL;
    public TuxTextView LLIIIZ;
    public View LLIIJI;
    public ImageView LLIIJLIL;
    public ImageView LLIIL;
    public TuxTextView LLIILII;
    public View LLIILZL;
    public C201887w8 LLIIZ;
    public C201847w4 LLIL;

    static {
        TBT tbt = new TBT(VideoCommentAssem.class, "commentVM", "getCommentVM()Lcom/ss/android/ugc/aweme/feed/assem/videocomment/VideoCommentVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLILII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(VideoCommentAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0, c65351Pkp)};
    }

    public void B4() {
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.LIZ(this, LLILII[1]), new TBT() { // from class: X.7wR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C203457yf) obj).LJLIL;
            }
        }, null, C202057wP.LJLIL, 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int W3() {
        return R.layout.ad5;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "right_container_comment";
    }

    public VideoCommentAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 392));
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCommentVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 393), null, C201907wA.INSTANCE, null, null);
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C201917wB.INSTANCE);
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C201927wC.INSTANCE);
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C201937wD.INSTANCE);
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoQuickCommentVM.class), C201947wE.INSTANCE);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(RightAreaContainerVM.class);
        this.LLIIIILZ = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 394), null, C201957wF.INSTANCE, null, null);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 391));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 77));
    }

    public final TuxTextView q4() {
        TuxTextView tuxTextView = this.LLIIIZ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("commentCountView");
        throw null;
    }

    public final View r4() {
        View view = this.LLIIJI;
        if (view != null) {
            return view;
        }
        o.LJIJI("commentLayout");
        throw null;
    }

    public final VideoCommentVM u4() {
        return (VideoCommentVM) this.LLFZ.LIZ(this, LLILII[0]);
    }

    public final void C4() {
        View Y3 = Y3();
        String LJFF = C86V.LJFF(R.string.ac3);
        o.LJIIIIZZ(LJFF, "getString(R.string.acces…abels_forYou_btn_comment)");
        Y3.setContentDescription(C208078Ep.LIZ(LJFF, C51029K0z.LJJIIZI(new OSZ("number", q4().getText().toString()))));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Y3().setVisibility(0);
        C4();
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_component_clickable", new AqS169S0100000_3(this, 217));
        c8mm.LIZ("event_component_hint_text", new AqS169S0100000_3(this, 218));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.bk2);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.comment_count)");
        this.LLIIIZ = (TuxTextView) findViewById;
        C33903DSh.LJLIL.LJLIL(q4());
        View findViewById2 = view.findViewById(R.id.bjz);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.comment_container)");
        this.LLIIJI = findViewById2;
        View findViewById3 = view.findViewById(R.id.bkm);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.comment_inner_container)");
        this.LLIILZL = findViewById3;
        View findViewById4 = view.findViewById(R.id.bki);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.comment_image)");
        ImageView imageView = (ImageView) findViewById4;
        this.LLIIL = imageView;
        C33911DSp.LJLIL.LJLIL(imageView);
        View findViewById5 = view.findViewById(R.id.bkd);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.comment_gift_image)");
        this.LLIIJLIL = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bk8);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.comment_emoji)");
        TuxTextView tuxTextView = (TuxTextView) findViewById6;
        this.LLIILII = tuxTextView;
        tuxTextView.LJJJ(36.0f);
        C201887w8 c201887w8 = new C201887w8();
        c201887w8.LIZIZ = getContainerView();
        c201887w8.LIZJ = view.findViewById(R.id.bmh);
        c201887w8.LIZLLL = r4();
        c201887w8.LJI = q4();
        ImageView imageView2 = this.LLIIL;
        if (imageView2 != null) {
            c201887w8.LJFF = imageView2;
            TuxTextView tuxTextView2 = this.LLIILII;
            if (tuxTextView2 != null) {
                c201887w8.LJII = tuxTextView2;
                Context context = getContext();
                if (context != null && !C79004UzY.LJJIJIIJI(context)) {
                    z = true;
                } else {
                    z = false;
                }
                c201887w8.LIZ = z;
                ImageView imageView3 = this.LLIIJLIL;
                if (imageView3 != null) {
                    c201887w8.LJ = imageView3;
                    this.LLIIZ = c201887w8;
                    this.LLIL = new C201847w4();
                    r4().setOnTouchListener(new AnonymousClass806(0.6f));
                    C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 80), getContainerView());
                    C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 76), r4());
                    C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 77), Y3());
                    C16880lQ.LJJJJI(q4(), new ACListenerS23S0100000_3(this, 78));
                    TuxTextView tuxTextView3 = this.LLIILII;
                    if (tuxTextView3 != null) {
                        C16880lQ.LJJJJI(tuxTextView3, new ACListenerS23S0100000_3(this, 79));
                        h0.LJIJI(Y3(), new IDaS89S0000000_3(2));
                        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.7NU
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C82B) obj).LJLJI;
                            }
                        }, C213688a4.LIZLLL(), C7OO.LJLIL, 4);
                        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.7NT
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C82B) obj).LJLJJI;
                            }
                        }, C213688a4.LIZLLL(), C7OQ.LJLIL, 4);
                        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.7wN
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C82B) obj).LJLIL;
                            }
                        }, C213688a4.LIZLLL(), C7OP.LJLIL, 4);
                        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.7wG
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C82B) obj).LJLLLLLL;
                            }
                        }, C213688a4.LIZLLL(), C7OK.LJLIL, 4);
                        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.7wH
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C212208Um) obj).LJLLL;
                            }
                        }, null, C7OZ.LJLIL, 6);
                        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.7w9
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C8UB) obj).LJLIL;
                            }
                        }, null, C7OM.LJLIL, 6);
                        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.7KF
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C8UB) obj).LJLILLLLZI;
                            }
                        }, null, C7ON.LJLIL, 6);
                        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.7KG
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C7AV) obj).LJLIL;
                            }
                        }, C213688a4.LIZLLL(), C201837w3.LJLIL, 4);
                        C8YN.LJII(this, u4(), new TBT() { // from class: X.7OS
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Integer.valueOf(((C7OR) obj).LJLJJLL);
                            }
                        }, null, C7OL.LJLIL, 6);
                        C8YN.LJII(this, u4(), new TBT() { // from class: X.7OU
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C7OR) obj).LJLIL;
                            }
                        }, null, C201857w5.LJLIL, 6);
                        C8YN.LJIIJ(this, u4(), new TBT() { // from class: X.7OV
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C7OR) obj).LJLJJI;
                            }
                        }, new TBT() { // from class: X.7OT
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Integer.valueOf(((C7OR) obj).LJLJJL);
                            }
                        }, null, C201867w6.LJLIL, 12);
                        B4();
                        if (AnonymousClass843.LIZ()) {
                            C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 76));
                        }
                        CommentService.LIZ.getClass();
                        CommentRefactorPreloadTask LJJJLL = CommentServiceImpl.LJJL().LJJJLL();
                        if (LJJJLL != null) {
                            C36093EEn.LIZ.getClass();
                            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                            LJIIIZ.LIZIZ(LJJJLL, true);
                            LJIIIZ.LIZJ();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("commentEmojiView");
                    throw null;
                }
                o.LJIJI("commentGiftIconView");
                throw null;
            }
            o.LJIJI("commentEmojiView");
            throw null;
        }
        o.LJIJI("commentImageView");
        throw null;
    }

    public final void z4(View view) {
        Aweme aweme;
        int i;
        int i2;
        LPX.LIZLLL(getContainerView(), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "comment");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, "enter_comment");
        FMX.LJIIL("verify_precise_exp", c188727au.LIZ);
        FFL LJIIIZ = FFL.LJIIIZ();
        int[] iArr = C201997wJ.LIZ;
        LJIIIZ.getClass();
        int[] iArr2 = (int[]) FFL.LJIJI(true, "hybrid_test_experiment_int_array", 31744, int[].class, iArr, 1);
        if (iArr2 != null) {
            ORY.LJJZ(iArr2);
        }
        Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        o.LJIIIIZZ(aweme2, "item.aweme");
        PublishPreviewInfo previewData = aweme2.getPreviewData();
        if (previewData != null && previewData.getInPublishing()) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.tfy);
            c5s1.LJ();
            return;
        }
        aweme2.setCommentClicked(true);
        DataCenter dataCenter = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).dataCenter;
        if (dataCenter != null) {
            dataCenter.jv0(aweme2.getAid(), "VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR");
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        EnumC178426zO LJJ = CommentServiceImpl.LJJL().LJJ(aweme2);
        if (LJJ == EnumC178426zO.FTC) {
            C26045AKb c26045AKb = new C26045AKb(view);
            c26045AKb.LJIIIZ(C63081OpJ.LJJIL(R.string.tob, aweme2));
            c26045AKb.LJIIJ();
            return;
        }
        if (LJJ == EnumC178426zO.UNAVAILABLE || LJJ == EnumC178426zO.DELETED) {
            aweme2.isDelete();
            if (aweme2.isImage()) {
                AnonymousClass030.LJ(view, R.string.h_y);
                return;
            } else {
                AnonymousClass030.LJ(view, R.string.tob);
                return;
            }
        }
        CommentService.LIZ.getClass();
        CommentServiceImpl.LJJL().LJJJJLL();
        C2WN LIZ = C2WN.LIZ();
        ImageView imageView = this.LLIIL;
        if (imageView != null) {
            String str = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType;
            String LIZIZ = C227768wm.LIZIZ(aweme2);
            String LIZJ = C227768wm.LIZJ(aweme2);
            LIZ.getClass();
            C2WN.LIZIZ(imageView, 1, str, LIZIZ, LIZJ, null);
            C2U8.LIZ(new C56852Kz());
            if (LJJ == EnumC178426zO.PRIVATE) {
                AnonymousClass030.LJ(view, R.string.pbf);
                return;
            }
            if (LJJ == EnumC178426zO.THIRD_PARTY) {
                AnonymousClass030.LJ(view, R.string.txs);
                return;
            }
            if (LJJ == EnumC178426zO.UNPUBLISHED) {
                return;
            }
            if (LJJ == EnumC178426zO.ADVERTISEMENT) {
                C05L.LIZLLL(context, R.string.dkl);
                return;
            }
            if (LJJ == EnumC178426zO.FORBIDDEN) {
                AnonymousClass030.LJ(view, R.string.dkl);
                return;
            }
            if (LJJ == EnumC178426zO.NO_PERMISSION) {
                C26045AKb c26045AKb2 = new C26045AKb(view);
                if (AV1.LJIJI(aweme2.getAuthorUid())) {
                    i2 = R.string.dks;
                } else {
                    i2 = R.string.dkt;
                }
                c26045AKb2.LJIIIIZZ(i2);
                c26045AKb2.LJIIJ();
                return;
            }
            if (LJJ == EnumC178426zO.ALLOW_COMMENT) {
                DataCenter dataCenter2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).dataCenter;
                if (dataCenter2 != null) {
                    dataCenter2.jv0(7, "video_comment_list");
                }
                if (FMX.LIZJ("show_gift_icon") && (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) != null) {
                    String aid = aweme.getAid();
                    o.LJIIIIZZ(aid, "it.aid");
                    if (C72U.LIZ.contains(aid)) {
                        C188727au c188727au2 = new C188727au();
                        c188727au2.LJIIIZ("enter_from", ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType);
                        c188727au2.LJIIIZ("group_id", C227768wm.LIZIZ(aweme));
                        c188727au2.LJIIIZ("author_id", C227768wm.LIZJ(aweme));
                        c188727au2.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
                        if (aweme.getFollowStatus() == 1) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c188727au2.LIZLLL(i, "is_follow");
                        c188727au2.LIZLLL(aweme.isLike() ? 1 : 0, "is_like");
                        c188727au2.LJIIIZ("action_type", "click");
                        FMX.LJIIL("show_gift_icon", c188727au2.LIZ);
                    }
                }
            } else if (LJJ == EnumC178426zO.NOT_ADX_AD) {
                AnonymousClass030.LJ(view, R.string.cg5);
            }
            if (("homepage_hot".equals(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType) || TextUtils.equals(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "general_search") || TextUtils.equals(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "homepage_popular") || LO7.LIZIZ.J1(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType) || TextUtils.equals(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "homepage_follow")) && aweme2.isAd()) {
                C73340SqO.LJIL().getClass();
                C59127NIl LIZ2 = C59128NIm.LIZ();
                LIZ2.LIZ = "draw_ad";
                LIZ2.LIZIZ = "otherclick";
                LIZ2.LJ(aweme2);
                LIZ2.LJIIIIZZ("comment_sign");
                LIZ2.LIZ(NN1.LJIILL());
                LIZ2.LJIIIZ(context);
                C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", aweme2.getAwemeRawAd());
                LIZLLL.LIZJ("comment_sign", "refer");
                LIZLLL.LIZ(NN1.LJIILL());
                LIZLLL.LJII();
            }
            Z9N z9n = Z9N.LIZIZ;
            z9n.LLJJJ(aweme2.getAid(), false);
            z9n.LLIIIZ(aweme2.getAid());
            C201847w4 c201847w4 = this.LLIL;
            if (c201847w4 != null && c201847w4.LIZIZ) {
                ((Keva) c201847w4.LIZLLL.getValue()).storeInt(C201847w4.LIZ(), 3);
                return;
            }
            return;
        }
        o.LJIJI("commentImageView");
        throw null;
    }

    public void A4(int i, String text) {
        AqS169S0100000_3 aqS169S0100000_3;
        o.LJIIIZ(text, "text");
        q4().setVisibility(i);
        q4().setText(text);
        C4();
        C201887w8 c201887w8 = this.LLIIZ;
        if (c201887w8 != null && (aqS169S0100000_3 = c201887w8.LJIIIIZZ) != null) {
            aqS169S0100000_3.invoke(Integer.valueOf(i));
        }
    }
}
