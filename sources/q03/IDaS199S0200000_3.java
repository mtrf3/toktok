package q03;

import X.ASQ;
import X.ActivityC45651qj;
import X.C05040Hs;
import X.C1046948z;
import X.C113554cx;
import X.C185427Pm;
import X.C192047gG;
import X.C196157mt;
import X.C197927pk;
import X.C26045AKb;
import X.C51029K0z;
import X.C65352Pkq;
import X.C7RN;
import X.C8C9;
import X.C8VC;
import X.C98T;
import X.EnumC228948yg;
import X.FMX;
import X.IWF;
import X.IWH;
import X.InterfaceC192297gf;
import X.InterfaceC207558Cp;
import X.InterfaceC46645ISj;
import X.OSZ;
import X.SY4;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentManageAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameAssem;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.topic.book.detail.BookDescAssem;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import com.ss.android.ugc.aweme.topic.movie.detail.MovieDescAssem;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDaS199S0200000_3 extends C98T {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(IDaS199S0200000_3 iDaS199S0200000_3, View view) {
        if (view != null) {
            C192047gG c192047gG = (C192047gG) ((CollectionContentManageAssem) iDaS199S0200000_3.l0).LJLILLLLZI.getValue();
            if (c192047gG != null && c192047gG.LJLIL) {
                ((InterfaceC192297gf) ((CollectionContentManageAssem) iDaS199S0200000_3.l0).LJLJJI.getValue()).O5();
                return;
            }
            C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) iDaS199S0200000_3.l1);
            c26045AKb.LJIIIIZZ(R.string.gbs);
            c26045AKb.LJIIJ();
        }
    }

    public static final void LIZ$1(IDaS199S0200000_3 iDaS199S0200000_3, View view) {
        if (view != null) {
            C05040Hs.LJ(SmartRouter.buildRoute((ActivityC45651qj) iDaS199S0200000_3.l0, "aweme://favorite/videos/collections/add/video"), "collectionId", ((CollectionContentManageAssem) iDaS199S0200000_3.l1).x3().id, "enterMethod", "click_add_videos");
        }
    }

    public static final void LIZ$2(IDaS199S0200000_3 iDaS199S0200000_3, View view) {
        String str;
        if (view != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(((TuxTextView) iDaS199S0200000_3.l0).getContext(), "//topic/book/info");
            buildRoute.withParam("book_id", ((BookDetailVM) ((BookDescAssem) iDaS199S0200000_3.l1).LJLJLLL.getValue()).gv0());
            buildRoute.open();
            OSZ[] oszArr = new OSZ[2];
            oszArr[0] = new OSZ("book_id", ((BookDetailVM) ((BookDescAssem) iDaS199S0200000_3.l1).LJLJLLL.getValue()).gv0());
            BookDetail LIZ = ((C185427Pm) ((AssemViewModel) ((BookDescAssem) iDaS199S0200000_3.l1).LJLJLLL.getValue()).getState()).LJLIL.LIZ();
            if (LIZ != null) {
                str = LIZ.title;
            } else {
                str = null;
            }
            oszArr[1] = new OSZ("book_title", str);
            FMX.LJIIL("click_book_detail_more", C113554cx.LJJL(oszArr));
        }
    }

    public static final void LIZ$3(IDaS199S0200000_3 iDaS199S0200000_3, View view) {
        String str;
        if (view != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(((TuxTextView) iDaS199S0200000_3.l0).getContext(), "//topic/movie/info");
            buildRoute.withParam("movie_id", ((MovieDetailVM) ((MovieDescAssem) iDaS199S0200000_3.l1).LJLJLLL.getValue()).gv0());
            buildRoute.open();
            OSZ[] oszArr = new OSZ[2];
            oszArr[0] = new OSZ("movie_id", ((MovieDetailVM) ((MovieDescAssem) iDaS199S0200000_3.l1).LJLJLLL.getValue()).gv0());
            MovieDetail LIZ = ((C7RN) ((AssemViewModel) ((MovieDescAssem) iDaS199S0200000_3.l1).LJLJLLL.getValue()).getState()).LJLIL.LIZ();
            if (LIZ != null) {
                str = LIZ.title;
            } else {
                str = null;
            }
            oszArr[1] = new OSZ("movie_title", str);
            FMX.LJIIL("click_movie_detail_more", C113554cx.LJJL(oszArr));
        }
    }

    public static final void LIZ$4(IDaS199S0200000_3 iDaS199S0200000_3, View view) {
        Integer valueOf;
        String str;
        if (view != null) {
            SY4 sy4 = ((EditPlayListNameAssem) iDaS199S0200000_3.l0).LJLJL;
            if (sy4 != null) {
                if (sy4.isEnabled()) {
                    EditPlayListNameAssem editPlayListNameAssem = (EditPlayListNameAssem) iDaS199S0200000_3.l0;
                    SY4 sy42 = editPlayListNameAssem.LJLJL;
                    if (sy42 != null) {
                        if (!sy42.LLI) {
                            InputMethodManager inputMethodManager = (InputMethodManager) iDaS199S0200000_3.l1;
                            if (inputMethodManager != null) {
                                EditText editText = editPlayListNameAssem.LJLILLLLZI;
                                if (editText != null) {
                                    inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                                } else {
                                    o.LJIJI("editText");
                                    throw null;
                                }
                            }
                            C8C9 c8c9 = (C8C9) C8VC.LJIIIIZZ((EditPlayListNameAssem) iDaS199S0200000_3.l0, C65352Pkq.LIZ(InterfaceC207558Cp.class));
                            if (c8c9 == null || (valueOf = Integer.valueOf(c8c9.LIZ)) == null) {
                                return;
                            }
                            if (valueOf.intValue() == 1) {
                                MixCreateViewModel v3 = ((EditPlayListNameAssem) iDaS199S0200000_3.l0).v3();
                                EditText editText2 = ((EditPlayListNameAssem) iDaS199S0200000_3.l0).LJLILLLLZI;
                                if (editText2 != null) {
                                    String C3 = EditPlayListNameAssem.C3(editText2.getText().toString());
                                    v3.getClass();
                                    v3.setStateImmediate(new AqS28S1000000_3(C3, 21));
                                    MixCreateViewModel v32 = ((EditPlayListNameAssem) iDaS199S0200000_3.l0).v3();
                                    EnumC228948yg enumC228948yg = EnumC228948yg.MULTI_VIDEO;
                                    v32.getClass();
                                    o.LJIIIZ(enumC228948yg, "enum");
                                    v32.setState(new AqS167S0100000_1(enumC228948yg, 414));
                                    return;
                                }
                                o.LJIJI("editText");
                                throw null;
                            }
                            if (valueOf.intValue() == 2) {
                                C8C9 c8c92 = (C8C9) C8VC.LJIIIIZZ((EditPlayListNameAssem) iDaS199S0200000_3.l0, C65352Pkq.LIZ(InterfaceC207558Cp.class));
                                if (c8c92 == null || (str = c8c92.LIZJ) == null) {
                                    str = "";
                                }
                                EditPlayListNameEditTextVM editPlayListNameEditTextVM = (EditPlayListNameEditTextVM) ((EditPlayListNameAssem) iDaS199S0200000_3.l0).LJLLI.getValue();
                                EditText editText3 = ((EditPlayListNameAssem) iDaS199S0200000_3.l0).LJLILLLLZI;
                                if (editText3 != null) {
                                    editPlayListNameEditTextVM.withState(new AqS13S2100000_3(editPlayListNameEditTextVM, str, EditPlayListNameAssem.C3(editText3.getText().toString()), 11));
                                    return;
                                } else {
                                    o.LJIJI("editText");
                                    throw null;
                                }
                            }
                            if (valueOf.intValue() != 3) {
                                return;
                            }
                            MixCreateViewModel v33 = ((EditPlayListNameAssem) iDaS199S0200000_3.l0).v3();
                            EditText editText4 = ((EditPlayListNameAssem) iDaS199S0200000_3.l0).LJLILLLLZI;
                            if (editText4 != null) {
                                String C32 = EditPlayListNameAssem.C3(editText4.getText().toString());
                                v33.getClass();
                                v33.setStateImmediate(new AqS28S1000000_3(C32, 21));
                                MixCreateViewModel v34 = ((EditPlayListNameAssem) iDaS199S0200000_3.l0).v3();
                                v34.getClass();
                                v34.withState(new AqS169S0100000_3(v34, 874));
                                return;
                            }
                            o.LJIJI("editText");
                            throw null;
                        }
                        return;
                    }
                    o.LJIJI("button");
                    throw null;
                }
                return;
            }
            o.LJIJI("button");
            throw null;
        }
    }

    public static final void LIZ$5(IDaS199S0200000_3 iDaS199S0200000_3, View view) {
        if (view != null) {
            C196157mt.LJFF("shortcut", "add");
            IAppWidgetService LJIJI = AppWidgetServiceImpl.LJIJI();
            Context context = ((SY4) iDaS199S0200000_3.l0).getContext();
            o.LJIIIIZZ(context, "context");
            LJIJI.LJIILIIL(context);
            View view2 = (View) iDaS199S0200000_3.l1;
            o.LJIIIIZZ(view2, "view");
            ASQ.LIZLLL((View) iDaS199S0200000_3.l1, C197927pk.LIZ);
        }
    }

    public static final void LIZ$6(IDaS199S0200000_3 iDaS199S0200000_3, View view) {
        PlayListInfo playListInfo;
        String mixId;
        String str;
        float f;
        InterfaceC46645ISj LIZJ;
        if (view == null || (playListInfo = ((VideoItemParams) C51029K0z.LJIILLIIL((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0)).getAweme().playlist_info) == null || (mixId = playListInfo.getMixId()) == null) {
            return;
        }
        AbsMixBottomBarVM I4 = ((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0).I4();
        String aid = ((VideoItemParams) C51029K0z.LJIILLIIL((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0)).getAweme().getAid();
        o.LJIIIIZZ(aid, "item.aweme.aid");
        if (I4.gv0(mixId, aid)) {
            AbsMixBottomBarVM I42 = ((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0).I4();
            Context context = ((SY4) iDaS199S0200000_3.l1).getContext();
            o.LJIIIIZZ(context, "context");
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0)).getAweme();
            o.LJIIIIZZ(aweme, "item.aweme");
            String str2 = ((VideoItemParams) C51029K0z.LJIILLIIL((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0)).mEventType;
            o.LJIIIIZZ(str2, "item.eventType");
            I42.hv0(context, aweme, str2, true);
        } else {
            ((SY4) iDaS199S0200000_3.l1).setLoading(true);
            InteractPlayListBottomBarAssem interactPlayListBottomBarAssem = (InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0;
            interactPlayListBottomBarAssem.LLIIL = true;
            AbsMixBottomBarVM I43 = interactPlayListBottomBarAssem.I4();
            Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0)).getAweme();
            o.LJIIIIZZ(aweme2, "item.aweme");
            I43.iv0(aweme2);
        }
        IMixFeedService LJJIJIIJIL = MixFeedService.LJJIJIIJIL();
        o.LJIIIIZZ(LJJIJIIJIL, "get().getService(IMixFeedService::class.java)");
        String str3 = ((VideoItemParams) C51029K0z.LJIILLIIL((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0)).mEventType;
        PlayListInfo playListInfo2 = ((VideoItemParams) C51029K0z.LJIILLIIL((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0)).getAweme().playlist_info;
        if (playListInfo2 != null) {
            str = playListInfo2.getMixId();
        } else {
            str = null;
        }
        String groupId = ((VideoItemParams) C51029K0z.LJIILLIIL((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0)).getAweme().getGroupId();
        String authorUid = ((VideoItemParams) C51029K0z.LJIILLIIL((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0)).getAweme().getAuthorUid();
        IWH LJJIJIL = IWF.LJJLIIIIJ().LJJIJIL();
        if (LJJIJIL != null && (LIZJ = LJJIJIL.LIZJ()) != null) {
            f = (float) LIZJ.getCurrentPosition();
        } else {
            f = 0.0f;
        }
        C1046948z.LIZIZ(LJJIJIIJIL, str3, str, groupId, authorUid, f, "click_banner_playnext", Integer.valueOf(((VideoItemParams) C51029K0z.LJIILLIIL((InteractPlayListBottomBarAssem) iDaS199S0200000_3.l0)).getAweme().getVideo().getDuration()), 64);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDaS199S0200000_3(X.ActivityC45651qj r4, com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentManageAssem r5, int r6) {
        /*
            r3 = this;
            r3.$t = r6
            switch(r6) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r2.l1 = r5
            r0 = 300(0x12c, double:1.48E-321)
        Lc:
            r2.<init>(r0)
            return
        L10:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r0 = 300(0x12c, double:1.48E-321)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.IDaS199S0200000_3.<init>(X.1qj, com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentManageAssem, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS199S0200000_3(Object obj, Object obj2, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS199S0200000_3(Object obj, Object obj2, int i, int i2) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
