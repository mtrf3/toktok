package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC70686Rog;
import X.C35752E1k;
import X.C69947Rcl;
import X.C70677RoX;
import X.C71677SBd;
import X.C72912tb;
import X.C72949Sk5;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.RTY;
import X.S6S;
import X.TL7;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState;

/* loaded from: classes13.dex */
public class AqS16S0010000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

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
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0010000_12(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0010000_12(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        PdpMainState setState = (PdpMainState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return PdpMainState.copy$default(setState, aqS16S0010000_12.z0, null, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, -2, null);
    }

    public static final Object invoke$1(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        C71677SBd setState = (C71677SBd) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C71677SBd.LIZ(setState, null, null, null, null, false, null, null, null, null, null, null, Boolean.valueOf(aqS16S0010000_12.z0), 2047);
    }

    public static final Object invoke$10(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        ProfileNaviEditorState setStateImmediate = (ProfileNaviEditorState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviEditorState.copy$default(setStateImmediate, null, 0, null, null, null, null, null, false, false, false, false, false, false, aqS16S0010000_12.z0, 0, 24575, null);
    }

    public static final Object invoke$11(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        ProfileNaviEditorState setStateImmediate = (ProfileNaviEditorState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviEditorState.copy$default(setStateImmediate, null, 0, null, null, null, null, null, aqS16S0010000_12.z0, false, false, false, false, false, false, 0, 32639, null);
    }

    public static final Object invoke$12(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        C72949Sk5 setState = (C72949Sk5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C72949Sk5.L(setState, null, aqS16S0010000_12.z0, null, null, null, new C72912tb(new C35752E1k()), 29);
    }

    public static final Object invoke$13(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        SkuState setState = (SkuState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return SkuState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, false, null, null, null, aqS16S0010000_12.z0, null, null, null, false, null, null, null, null, 2143289343, null);
    }

    public static final Object invoke$14(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        String str;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        if (aqS16S0010000_12.z0) {
            str = "save";
        } else {
            str = "unsave";
        }
        logView.plusAssign("save_type", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        SkuState setState = (SkuState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return SkuState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, false, null, null, null, false, null, null, null, aqS16S0010000_12.z0, null, null, null, null, 2080374783, null);
    }

    public static final Object invoke$16(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        if (aqS16S0010000_12.z0) {
            str = "save";
        } else {
            str = "unsave";
        }
        logNode.plusAssign("save_type", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        C69947Rcl setState = (C69947Rcl) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C69947Rcl.L(setState, aqS16S0010000_12.z0, 0, 0, false, 0.0f, false, 126);
    }

    public static final Object invoke$18(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        S6S setStateImmediate = (S6S) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return S6S.LIZ(setStateImmediate, null, false, aqS16S0010000_12.z0, null, null, 55);
    }

    public static final Object invoke$19(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        C71677SBd setState = (C71677SBd) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C71677SBd.LIZ(setState, null, null, null, null, aqS16S0010000_12.z0, null, null, null, null, null, null, null, 4079);
    }

    public static final Object invoke$2(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        C71677SBd setState = (C71677SBd) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C71677SBd.LIZ(setState, null, null, null, null, false, null, null, null, null, null, Boolean.valueOf(aqS16S0010000_12.z0), null, 3071);
    }

    public static final Object invoke$20(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        RTY setState = (RTY) obj;
        o.LJIIIZ(setState, "$this$setState");
        return RTY.LIZ(setState, false, false, aqS16S0010000_12.z0, 251);
    }

    public static final Object invoke$21(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        RTY setState = (RTY) obj;
        o.LJIIIZ(setState, "$this$setState");
        return RTY.LIZ(setState, aqS16S0010000_12.z0, false, false, 254);
    }

    public static final Object invoke$22(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        RTY setState = (RTY) obj;
        o.LJIIIZ(setState, "$this$setState");
        return RTY.LIZ(setState, false, aqS16S0010000_12.z0, false, 253);
    }

    public static final Object invoke$23(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        int i;
        int max;
        ReviewItemStruct it = (ReviewItemStruct) obj;
        o.LJIIIZ(it, "it");
        int i2 = 0;
        if (aqS16S0010000_12.z0) {
            Integer num = it.diggCount;
            if (num != null) {
                i2 = num.intValue();
            }
            max = i2 + 1;
        } else {
            Integer num2 = it.diggCount;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            max = Math.max(i - 1, 0);
        }
        return ReviewItemStruct.LIZ(it, Integer.valueOf(max), Boolean.valueOf(aqS16S0010000_12.z0));
    }

    public static final Object invoke$24(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        ReviewItemStruct reviewItemStruct;
        int i;
        int max;
        ShopReviewItemStruct it = (ShopReviewItemStruct) obj;
        o.LJIIIZ(it, "it");
        ReviewItemStruct reviewItemStruct2 = it.reviewItemStruct;
        if (reviewItemStruct2 != null) {
            int i2 = 0;
            if (aqS16S0010000_12.z0) {
                Integer num = reviewItemStruct2.diggCount;
                if (num != null) {
                    i2 = num.intValue();
                }
                max = i2 + 1;
            } else {
                Integer num2 = reviewItemStruct2.diggCount;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                max = Math.max(i - 1, 0);
            }
            reviewItemStruct = ReviewItemStruct.LIZ(reviewItemStruct2, Integer.valueOf(max), Boolean.valueOf(aqS16S0010000_12.z0));
        } else {
            reviewItemStruct = null;
        }
        return new ShopReviewItemStruct(reviewItemStruct, it.productCard, it.daInfo);
    }

    public static final Object invoke$25(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        NaviAvatarListViewState setState = (NaviAvatarListViewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return NaviAvatarListViewState.copy$default(setState, null, 0, 0, null, null, aqS16S0010000_12.z0, 31, null);
    }

    public static final Object invoke$3(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        int i;
        int max;
        AbstractC70686Rog modifyFirst = (AbstractC70686Rog) obj;
        o.LJIIIZ(modifyFirst, "$this$modifyFirst");
        C70677RoX c70677RoX = (C70677RoX) modifyFirst;
        ReviewItemStruct reviewItemStruct = c70677RoX.LIZ;
        int i2 = 0;
        if (aqS16S0010000_12.z0) {
            Integer num = reviewItemStruct.diggCount;
            if (num != null) {
                i2 = num.intValue();
            }
            max = i2 + 1;
        } else {
            Integer num2 = reviewItemStruct.diggCount;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            max = Math.max(i - 1, 0);
        }
        return C70677RoX.LIZ(c70677RoX, ReviewItemStruct.LIZ(reviewItemStruct, Integer.valueOf(max), Boolean.valueOf(aqS16S0010000_12.z0)), false, false, false, false, 1022);
    }

    public static final Object invoke$4(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        SkuState setState = (SkuState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return SkuState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, Boolean.valueOf(aqS16S0010000_12.z0), false, null, null, null, false, null, null, null, false, null, null, null, null, 2147352575, null);
    }

    public static final Object invoke$5(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        TL7 listViewConfig = (TL7) obj;
        o.LJIIIZ(listViewConfig, "listViewConfig");
        listViewConfig.LIZ = aqS16S0010000_12.z0;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r0.length() != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AqS16S0010000_12 r9, java.lang.Object r10) {
        /*
            r3 = r10
            X.SDo r3 = (X.C71740SDo) r3
            java.lang.String r0 = "$this$postState"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            boolean r0 = r9.z0
            r4 = 0
            if (r0 == 0) goto L1e
            X.SCw r0 = r3.LJIIJ
            if (r0 == 0) goto L1e
            java.lang.CharSequence r0 = r0.LIZIZ()
            r2 = 0
            if (r0 == 0) goto L1e
            int r0 = r0.length()
            if (r0 != 0) goto L20
        L1e:
            r2 = 8
        L20:
            X.SE0 r1 = r3.LJFF
            r0 = 126(0x7e, float:1.77E-43)
            X.SE0 r6 = X.SE0.LIZ(r1, r2, r4, r0)
            r10 = 16351(0x3fdf, float:2.2913E-41)
            r5 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            X.SDo r0 = X.C71740SDo.LIZ(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS16S0010000_12.invoke$6(kotlin.jvm.internal.AqS16S0010000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        ProfileNaviOnboardingState setState = (ProfileNaviOnboardingState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ProfileNaviOnboardingState.copy$default(setState, null, null, null, null, false, false, aqS16S0010000_12.z0, 63, null);
    }

    public static final Object invoke$8(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        ProfileNaviEditorState setState = (ProfileNaviEditorState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ProfileNaviEditorState.copy$default(setState, null, 0, null, null, null, null, null, false, false, false, false, aqS16S0010000_12.z0, false, false, 0, 30719, null);
    }

    public static final Object invoke$9(AqS16S0010000_12 aqS16S0010000_12, Object obj) {
        ProfileNaviEditorState setState = (ProfileNaviEditorState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ProfileNaviEditorState.copy$default(setState, null, 0, null, null, null, null, null, false, false, false, false, false, aqS16S0010000_12.z0, false, 0, 28671, null);
    }
}
