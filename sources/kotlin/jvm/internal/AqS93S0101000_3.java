package kotlin.jvm.internal;

import X.AbstractC177926ya;
import X.AbstractC221978nR;
import X.AbstractC65781Prl;
import X.AnonymousClass720;
import X.AnonymousClass724;
import X.AnonymousClass727;
import X.AnonymousClass818;
import X.AnonymousClass852;
import X.C177906yY;
import X.C177916yZ;
import X.C178336zF;
import X.C186157Sh;
import X.C188027Zm;
import X.C188067Zq;
import X.C189487c8;
import X.C189717cV;
import X.C197377or;
import X.C203127y8;
import X.C2045481a;
import X.C2046781n;
import X.C212988Xm;
import X.C2U8;
import X.C43I;
import X.C54840Lfg;
import X.C71Y;
import X.C72912tb;
import X.C76800UCe;
import X.C77123UOp;
import X.C7AH;
import X.C7ML;
import X.C81Z;
import X.C82N;
import X.C85M;
import X.C86036Xpg;
import X.C86037Xph;
import X.C8SO;
import X.C8V1;
import X.EnumC197497p3;
import X.EnumC42934Gt8;
import X.InterfaceC197607pE;
import X.InterfaceC212978Xl;
import X.InterfaceC65350Pko;
import X.InterfaceC88472Yns;
import X.M7C;
import X.MNV;
import X.ORZ;
import X.SU4;
import X.V16;
import X.X1D;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.input.DanmakuInputVM;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowLikeViewModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes4.dex */
public class AqS93S0101000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS93S0101000_3(androidx.fragment.app.Fragment r3, int r4) {
        /*
            r2 = this;
            r2.$t = r4
            switch(r4) {
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r0 = 2131364583(0x7f0a0ae7, float:1.8349007E38)
            r1.i1 = r0
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r3
            r0 = 2131364582(0x7f0a0ae6, float:1.8349005E38)
            r1.i1 = r0
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0101000_3.<init>(androidx.fragment.app.Fragment, int):void");
    }

    public static final Object invoke$0(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        AnonymousClass852 it = (AnonymousClass852) obj;
        o.LJIIIZ(it, "it");
        C85M c85m = it.LJI;
        if (c85m != null && c85m.LIZ()) {
            TextExtraStruct textExtraStruct = c85m.LIZ;
            int type = textExtraStruct.getType();
            int i = 42;
            if (type != 0 && type != 1 && type != 2 && type != 3 && type != 5) {
                if (type != 6) {
                    if (type == 65282) {
                        int color = textExtraStruct.getColor();
                        if (!textExtraStruct.isBoldText()) {
                            i = 41;
                        }
                        C54840Lfg.LJLIIIL(it, color, i, (InterfaceC88472Yns) aqS93S0101000_3.l0);
                    }
                } else {
                    C54840Lfg.LJLIIIL(it, 0, 42, (InterfaceC88472Yns) aqS93S0101000_3.l0);
                }
            } else {
                C54840Lfg.LJLIIIL(it, aqS93S0101000_3.i1, 42, (InterfaceC88472Yns) aqS93S0101000_3.l0);
            }
        }
        return it;
    }

    public static final Object invoke$1(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.xv0((Fragment) aqS93S0101000_3.l0, new AqS28S0001000_3(aqS93S0101000_3.i1, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        boolean z;
        List<AnchorCommonStruct> anchors;
        List<AnchorCommonStruct> anchors2;
        AnchorCommonStruct anchorCommonStruct;
        String str;
        String str2;
        C203127y8 state = (C203127y8) obj;
        o.LJIIIZ(state, "state");
        int i = state.LJLIL;
        int i2 = aqS93S0101000_3.i1;
        if (i != i2) {
            PhotoViewModelV2 photoViewModelV2 = (PhotoViewModelV2) aqS93S0101000_3.l0;
            photoViewModelV2.getClass();
            photoViewModelV2.setState(new AqS93S0101000_3(i2, photoViewModelV2, 19));
        }
        C81Z c81z = ((PhotoViewModelV2) aqS93S0101000_3.l0).LJLJLLL;
        int i3 = aqS93S0101000_3.i1;
        boolean z2 = state.LJLJJI;
        boolean z3 = state.LJLJJL;
        if (z2 && i3 != c81z.LJFF) {
            z = true;
        } else {
            z = false;
        }
        Aweme aweme = c81z.LJ;
        if (aweme != null && z3) {
            String str3 = c81z.LIZLLL;
            if (!z) {
                str = "auto";
            } else {
                str = "manual_click";
                if (i3 <= c81z.LJFF) {
                    str2 = "left";
                    C2045481a.LIZIZ(str3, str, aweme, i3, str2, c81z.LIZ, V16.LJJIFFI(aweme), null, c81z.LJII, 256);
                }
            }
            str2 = "right";
            C2045481a.LIZIZ(str3, str, aweme, i3, str2, c81z.LIZ, V16.LJJIFFI(aweme), null, c81z.LJII, 256);
        }
        if (z) {
            c81z.LJI.Z0("manual");
            c81z.LJFF = -1;
        } else {
            c81z.LJI.Z0("auto");
        }
        c81z.LJI.a1(i3);
        Aweme aweme2 = c81z.LJ;
        if (aweme2 != null && (anchors = aweme2.getAnchors()) != null && (!anchors.isEmpty()) && (anchors2 = aweme2.getAnchors()) != null && (anchorCommonStruct = (AnchorCommonStruct) ListProtector.get(anchors2, 0)) != null && anchorCommonStruct.getType() == EnumC42934Gt8.AD_PHOTO_CAROUSEL_ANCHOR.getTYPE()) {
            String aid = aweme2.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            C2U8.LIZ(new C2046781n(aid));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        C186157Sh setState = (C186157Sh) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C186157Sh.L(setState, (((setState.LJLIL * ((float) setState.LJLILLLLZI)) - ((TopicReview) aqS93S0101000_3.l0).getTopicRating()) + aqS93S0101000_3.i1) / ((float) setState.LJLILLLLZI), 0L, 0L, false, false, null, 62);
    }

    public static final Object invoke$12(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        AbstractC221978nR invokeSection = (AbstractC221978nR) obj;
        o.LJIIIZ(invokeSection, "$this$invokeSection");
        invokeSection.LIZJ(aqS93S0101000_3.i1, (Aweme) aqS93S0101000_3.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        AnonymousClass724 it = (AnonymousClass724) obj;
        o.LJIIIZ(it, "it");
        if (it.LJLIL == AnonymousClass720.SOFT_KEYBOARD) {
            ((DanmakuInputVM) aqS93S0101000_3.l0).setState(AnonymousClass727.LJLIL);
        } else {
            ((DanmakuInputVM) aqS93S0101000_3.l0).setState(new AqS28S0001000_3(aqS93S0101000_3.i1, 19));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        long j;
        String LIZJ;
        C188067Zq c188067Zq;
        C188027Zm it = (C188027Zm) obj;
        o.LJIIIZ(it, "it");
        List<C188067Zq> list = it.LJLJLLL.LJLJJI;
        int i = aqS93S0101000_3.i1;
        if (i >= 0 && list != null && i < list.size()) {
            if (list != null && (c188067Zq = (C188067Zq) ListProtector.get(list, aqS93S0101000_3.i1)) != null) {
                j = c188067Zq.LJLILLLLZI;
            } else {
                j = 0;
            }
            if (SU4.LIZLLL(j)) {
                LIZJ = BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIILL.getValue(), j);
            } else if (SU4.LJ(j)) {
                LIZJ = BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIILLIIL.getValue(), j);
            } else if (C86036Xpg.LJIIIIZZ(j)) {
                LIZJ = BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIILJJIL.getValue(), j);
            } else {
                LIZJ = BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIILIIL.getValue(), j);
            }
            ((WatchHistoryListViewModel) aqS93S0101000_3.l0).setState(new AqS28S1000000_3(LIZJ, 15));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS93S0101000_3 aqS93S0101000_3, Object newItem) {
        o.LJIIIZ(newItem, "newItem");
        C212988Xm c212988Xm = (C212988Xm) aqS93S0101000_3.l0;
        int i = aqS93S0101000_3.i1;
        InterfaceC212978Xl<R, ITEM> interfaceC212978Xl = c212988Xm.LIZIZ;
        if (interfaceC212978Xl != 0) {
            interfaceC212978Xl.LIZLLL(i, newItem);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS93S0101000_3 aqS93S0101000_3, Object it) {
        o.LJIIIZ(it, "it");
        Resources resources = ((MNV) aqS93S0101000_3.l0).itemView.getContext().getResources();
        int i = aqS93S0101000_3.i1;
        String quantityString = resources.getQuantityString(R.plurals.jo, i, it, C77123UOp.LJJIIJ(i));
        o.LJIIIIZZ(quantityString, "itemView.context.resourc…                        )");
        return quantityString;
    }

    public static final Object invoke$17(AqS93S0101000_3 aqS93S0101000_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        int i = 1;
        if (aqS93S0101000_3.i1 != 1) {
            i = 0;
        }
        return new C8SO(new C72912tb(Integer.valueOf(i)), (CollectMusicResponse) aqS93S0101000_3.l0);
    }

    public static final Object invoke$18(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        C212988Xm c212988Xm = (C212988Xm) aqS93S0101000_3.l0;
        int i = aqS93S0101000_3.i1;
        InterfaceC212978Xl<R, ITEM> interfaceC212978Xl = c212988Xm.LIZIZ;
        if (interfaceC212978Xl != 0) {
            interfaceC212978Xl.LIZLLL(i, obj);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        C203127y8 setState = (C203127y8) obj;
        o.LJIIIZ(setState, "$this$setState");
        ((PhotoViewModelV2) aqS93S0101000_3.l0).LLF = false;
        return C203127y8.LIZ(setState, aqS93S0101000_3.i1, false, false, false, false, null, false, null, null, false, 0, null, null, false, 16382);
    }

    public static final Object invoke$2(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.xv0((Fragment) aqS93S0101000_3.l0, new AqS28S0001000_3(aqS93S0101000_3.i1, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        Aweme aweme;
        C189487c8 setState = (C189487c8) obj;
        o.LJIIIZ(setState, "$this$setState");
        StoryGalleryListViewModel storyGalleryListViewModel = (StoryGalleryListViewModel) aqS93S0101000_3.l0;
        int i = aqS93S0101000_3.i1;
        C189717cV c189717cV = (C189717cV) ORZ.LJLLLLLL(i, setState.LJLIL);
        if (c189717cV != null) {
            aweme = c189717cV.LJLIL;
        } else {
            aweme = null;
        }
        C189487c8 LIZ = C189487c8.LIZ(setState, null, i, aweme, null, null, 25);
        storyGalleryListViewModel.gv0(LIZ);
        return LIZ;
    }

    public static final Object invoke$4(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        C178336zF it = (C178336zF) obj;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSoftKeyboardState ");
        AbstractC177926ya abstractC177926ya = it.LJLJJI;
        C177906yY c177906yY = C177906yY.LIZ;
        LIZ.append(o.LJ(abstractC177926ya, c177906yY));
        C71Y.LIZLLL("xjccccc", X1D.LIZIZ(LIZ));
        if (o.LJ(it.LJLJJI, c177906yY) || o.LJ(it.LJLJJI, C177916yZ.LIZ)) {
            ((NowKeyboardVM) aqS93S0101000_3.l0).iv0(C177916yZ.LIZ, true);
            ((NowKeyboardVM) aqS93S0101000_3.l0).setState(new AqS28S0001000_3(aqS93S0101000_3.i1, 5));
        } else {
            ((NowKeyboardVM) aqS93S0101000_3.l0).setState(new AqS28S0001000_3(aqS93S0101000_3.i1, 6));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        M7C setState = (M7C) obj;
        o.LJIIIZ(setState, "$this$setState");
        return M7C.LIZ(setState, (List) aqS93S0101000_3.l0, null, null, aqS93S0101000_3.i1, false, 0, null, null, null, 1014);
    }

    public static final Object invoke$6(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        long j;
        Aweme aweme;
        AwemeStatistics statistics;
        C7AH setState = (C7AH) obj;
        o.LJIIIZ(setState, "$this$setState");
        boolean z = true;
        if (aqS93S0101000_3.i1 != 1) {
            z = false;
        }
        C43I c43i = new C43I(Boolean.valueOf(z));
        C7ML gv0 = ((NowLikeViewModel) aqS93S0101000_3.l0).gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && (statistics = aweme.getStatistics()) != null) {
            j = statistics.getDiggCount();
        } else {
            j = 0;
        }
        return C7AH.LIZ(setState, null, c43i, new C43I(Long.valueOf(j)), null, null, 0, 57);
    }

    public static final Object invoke$7(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        String str;
        InterfaceC197607pE it = (InterfaceC197607pE) obj;
        o.LJIIIZ(it, "it");
        EnumC197497p3 enumC197497p3 = C197377or.LJIIIIZZ;
        EnumC197497p3 enumC197497p32 = EnumC197497p3.UPLOADING;
        if (enumC197497p3 != enumC197497p32) {
            C197377or.LJFF(enumC197497p32);
        }
        PublishModel publishModel = (PublishModel) aqS93S0101000_3.l0;
        if (publishModel == null || (str = publishModel.creationId) == null) {
            str = "";
        }
        it.LIZLLL(aqS93S0101000_3.i1, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        C8V1 c8v1 = (C8V1) obj;
        o.LJIIIZ(c8v1, "$this$null");
        c8v1.LIZLLL((InterfaceC65350Pko) ListProtector.get((List) aqS93S0101000_3.l0, aqS93S0101000_3.i1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS93S0101000_3 aqS93S0101000_3, Object obj) {
        C203127y8 it = (C203127y8) obj;
        o.LJIIIZ(it, "it");
        C82N r4 = ((FeedPhotoSlideAssem) aqS93S0101000_3.l0).r4();
        if (r4 != null) {
            r4.LJI();
        }
        AnonymousClass818 anonymousClass818 = ((FeedPhotoSlideAssem) aqS93S0101000_3.l0).LLIIZ;
        if (anonymousClass818 != null) {
            anonymousClass818.Jt(aqS93S0101000_3.i1, it.LJLJJI);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS93S0101000_3(int r3, com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 10: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0101000_3.<init>(int, com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(int i, Aweme aweme, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(int i, CollectMusicResponse collectMusicResponse, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = collectMusicResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(int i, NowLikeViewModel nowLikeViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = nowLikeViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(int i, PublishModel publishModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = publishModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(int i, WatchHistoryListViewModel watchHistoryListViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = watchHistoryListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS93S0101000_3(C212988Xm c212988Xm, C212988Xm<R, ITEM> c212988Xm2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c212988Xm;
        this.i1 = c212988Xm2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(MNV mnv, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = mnv;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(NowKeyboardVM nowKeyboardVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = nowKeyboardVM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(DanmakuInputVM danmakuInputVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = danmakuInputVM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(StoryGalleryListViewModel storyGalleryListViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = storyGalleryListViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(TopicReview topicReview, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = topicReview;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(FeedPhotoSlideAssem feedPhotoSlideAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = feedPhotoSlideAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS93S0101000_3(List list, List<? extends Aweme> list2, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0101000_3(AqS134S0200000_3 aqS134S0200000_3, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aqS134S0200000_3;
        this.i1 = i;
    }
}
