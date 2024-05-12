package kotlin.jvm.internal;

import X.A44;
import X.A4T;
import X.AbstractC65781Prl;
import X.AnonymousClass057;
import X.AnonymousClass886;
import X.C09290Yb;
import X.C0NP;
import X.C10370av;
import X.C11P;
import X.C1E5;
import X.C2315596x;
import X.C24490xh;
import X.C24500xi;
import X.C24610xt;
import X.C25578A2c;
import X.C25580A2e;
import X.C2S9;
import X.C32444CoK;
import X.C32541Pm;
import X.C61878OQg;
import X.C74631TQt;
import X.C76800UCe;
import X.C78200Uma;
import X.C78216Umq;
import X.C78966Uyw;
import X.C79181V5t;
import X.C81091Vs7;
import X.C86442XwE;
import X.EHJ;
import X.EnumC57435MgR;
import X.InterfaceC07790Sh;
import X.InterfaceC20340r0;
import X.InterfaceC24520xk;
import X.InterfaceC35811ar;
import X.InterfaceC78981UzB;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.TQV;
import X.TRU;
import X.TS2;
import X.UGS;
import X.V50;
import X.V53;
import X.V5E;
import X.V5J;
import X.V5R;
import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftAdvanceVoucherPriceAssem;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes14.dex */
public class AqS175S0200000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final List<String> LIZ$0(InterfaceC35811ar<List<String>> interfaceC35811ar) {
        return interfaceC35811ar.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(C2S9 c2s9, C2315596x c2315596x, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2s9;
        this.l1 = c2315596x;
    }

    public static final Object invoke$0(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        int intValue = ((Number) obj2).intValue();
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment = (SpotlightImageListPreviewDialogFragment) aqS175S0200000_13.l0;
        List<Matrix> list = spotlightImageListPreviewDialogFragment.LJLLI;
        if (list != null) {
            int i = spotlightImageListPreviewDialogFragment.LJLJLJ;
            C81091Vs7 c81091Vs7 = (C81091Vs7) spotlightImageListPreviewDialogFragment._$_findCachedViewById(R.id.f12);
            c81091Vs7.getClass();
            ListProtector.set(list, i, new Matrix(c81091Vs7.LJLJLJ));
            SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment2 = (SpotlightImageListPreviewDialogFragment) aqS175S0200000_13.l0;
            spotlightImageListPreviewDialogFragment2.LJLJLJ = intValue;
            List<Matrix> list2 = spotlightImageListPreviewDialogFragment2.LJLLI;
            if (list2 != null) {
                if (ListProtector.get(list2, intValue) != null) {
                    C81091Vs7 c81091Vs72 = (C81091Vs7) ((SpotlightImageListPreviewDialogFragment) aqS175S0200000_13.l0)._$_findCachedViewById(R.id.f12);
                    List<Matrix> list3 = ((SpotlightImageListPreviewDialogFragment) aqS175S0200000_13.l0).LJLLI;
                    if (list3 != null) {
                        c81091Vs72.LJI((Matrix) ListProtector.get(list3, intValue));
                        ((SpotlightImageListPreviewDialogFragment) aqS175S0200000_13.l0)._$_findCachedViewById(R.id.i24).removeCallbacks((Runnable) aqS175S0200000_13.l1);
                        ((UGS) ((SpotlightImageListPreviewDialogFragment) aqS175S0200000_13.l0)._$_findCachedViewById(R.id.i24)).LIZIZ();
                        ((SpotlightImageListPreviewDialogFragment) aqS175S0200000_13.l0)._$_findCachedViewById(R.id.i24).postDelayed((Runnable) aqS175S0200000_13.l1, 2000L);
                    } else {
                        o.LJIJI("imageMatrixList");
                        throw null;
                    }
                }
                ((SpotlightImageListPreviewDialogFragment) aqS175S0200000_13.l0).Al(bitmap);
                return C76800UCe.LIZ;
            }
            o.LJIJI("imageMatrixList");
            throw null;
        }
        o.LJIJI("imageMatrixList");
        throw null;
    }

    public static final Object invoke$1(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = ((MultiGuestV3GuestPresenter) aqS175S0200000_13.l0).getMultiGuestDataHolder().LJJIJLIJ;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS175S0200000_13.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            ((PlaylistCollectionCell) aqS175S0200000_13.l0).L(((AnonymousClass886) aqS175S0200000_13.l1).LJLIL, interfaceC24520xk, 72);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        C11P change = (C11P) obj;
        o.LJIIIZ(change, "change");
        V50.LIZJ((V53) aqS175S0200000_13.l0, (InterfaceC35811ar) aqS175S0200000_13.l1, true, C10370av.LIZLLL(change.LIZJ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        Integer num;
        int i;
        ((Number) obj2).intValue();
        MultiGuestDataHolder multiGuestDataHolder = ((TRU) aqS175S0200000_13.l0).getMultiGuestDataHolder();
        if (multiGuestDataHolder != null) {
            num = Integer.valueOf(multiGuestDataHolder.LJJIJLIJ);
        } else {
            num = null;
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS175S0200000_13.l1;
        if (interfaceC88472Yns != null) {
            if (num != null) {
                i = num.intValue();
            } else {
                i = 2;
            }
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AqS175S0200000_13 r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            r11 = r13
            X.0xk r11 = (X.InterfaceC24520xk) r11
            java.lang.Number r14 = (java.lang.Number) r14
            int r0 = r14.intValue()
            r1 = r0 & 11
            r0 = 2
            if (r1 != r0) goto L14
            boolean r0 = r11.LIZ()
            if (r0 != 0) goto L6b
        L14:
            java.lang.Object r1 = r12.l0
            X.V5J r1 = (X.V5J) r1
            r0 = 1281285315(0x4c5edcc3, float:5.8422028E7)
            r11.LJJIIJ(r0)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r11.LJJIIJ(r0)
            boolean r0 = r11.LJIJJ(r1)
            java.lang.Object r4 = r11.LJIILL()
            if (r0 != 0) goto L37
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r4 != r0) goto L3f
        L37:
            X.V5K r4 = new X.V5K
            r4.<init>(r1)
            r11.LJJIII(r4)
        L3f:
            r11.LJJIJIIJIL()
            X.V5K r4 = (X.V5K) r4
            r11.LJJIJIIJIL()
            r5 = 0
            kotlin.jvm.internal.AqS129S0300000_13 r3 = new kotlin.jvm.internal.AqS129S0300000_13
            java.lang.Object r2 = r12.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.lang.Object r1 = r12.l0
            X.V5J r1 = (X.V5J) r1
            r0 = 4
            r3.<init>(r2, r4, r1, r0)
            r0 = 1081038947(0x406f5863, float:3.7397697)
            X.1iJ r10 = X.C1DJ.LJ(r11, r0, r3)
            r12 = 196608(0x30000, float:2.75506E-40)
            r13 = 31
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            X.V66.LIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L68:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L6b:
            r11.LIZLLL()
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS175S0200000_13.invoke$13(kotlin.jvm.internal.AqS175S0200000_13, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$14(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        C32444CoK.LIZLLL(null, "LynxCall, firstFrameTimeoutCallback, downgrade");
        C78216Umq c78216Umq = (C78216Umq) aqS175S0200000_13.l0;
        C78200Uma c78200Uma = (C78200Uma) aqS175S0200000_13.l1;
        if (intValue == 0) {
            intValue = 10003;
        }
        if (str == null) {
            str = "";
        }
        c78216Umq.LIZJ(c78200Uma, intValue, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String errorMsg = (String) obj2;
        o.LJIIIZ(errorMsg, "errorMsg");
        C32444CoK.LIZLLL(null, "LynxCall, runTimeErrorTimeoutCallback, downgrade");
        ((C78216Umq) aqS175S0200000_13.l0).LIZJ((C78200Uma) aqS175S0200000_13.l1, intValue, errorMsg);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r3 == X.C24500xi.LIZIZ) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$16(kotlin.jvm.internal.AqS175S0200000_13 r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            r1 = r22
            r0 = r23
            X.0xk r1 = (X.InterfaceC24520xk) r1
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = r0 & 11
            r0 = 2
            if (r2 != r0) goto L17
            boolean r0 = r1.LIZ()
            if (r0 != 0) goto L7d
        L17:
            r3 = r21
            java.lang.Object r0 = r3.l0
            android.view.View r0 = (android.view.View) r0
            android.content.Context r2 = r0.getContext()
            r0 = 2131843529(0x7f1159c9, float:1.9320425E38)
            java.lang.String r4 = r2.getString(r0)
            X.V6i r15 = X.EnumC79196V6i.SECONDARY
            X.V6h r14 = X.EnumC79195V6h.LARGE
            java.lang.Object r2 = r3.l1
            com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM r2 = (com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM) r2
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.LJJIIJ(r0)
            boolean r0 = r1.LJIJJ(r2)
            java.lang.Object r3 = r1.LJIILL()
            if (r0 != 0) goto L49
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r3 != r0) goto L53
        L49:
            kotlin.jvm.internal.AqS163S0100000_13 r3 = new kotlin.jvm.internal.AqS163S0100000_13
            r0 = 597(0x255, float:8.37E-43)
            r3.<init>(r2, r0)
            r1.LJJIII(r3)
        L53:
            r1.LJJIJIIJIL()
            X.Pro r3 = (X.InterfaceC65784Pro) r3
            java.lang.String r0 = "getString(com.bytedance.tux.R.string.refresh_str)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            r5 = 0
            r6 = 0
            r8 = 0
            r22 = 54
            r23 = 62460(0xf3fc, float:8.7525E-41)
            r7 = r6
            r10 = r6
            r11 = r5
            r12 = r5
            r13 = r5
            r16 = r5
            r17 = r5
            r18 = r6
            r19 = r5
            r20 = r1
            r21 = r6
            X.C79169V5h.LIZIZ(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L7a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L7d:
            r1.LIZLLL()
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS175S0200000_13.invoke$16(kotlin.jvm.internal.AqS175S0200000_13, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        DataChannel dataChannel = ((MultiGuestV3GuestPresenter) aqS175S0200000_13.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(MicClickableEvent.class, new TS2(((C74631TQt) aqS175S0200000_13.l1).LJLIL, "business_mute_source_audio_mute_punish"));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = ((GameLinkGuestPresenter) aqS175S0200000_13.l0).getMultiGuestDataHolder().LJIIZILJ;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS175S0200000_13.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        String action = (String) obj;
        String clickType = (String) obj2;
        o.LJIIIZ(action, "action");
        o.LJIIIZ(clickType, "clickType");
        PunishEventInfo punishEventInfo = ((PerceptionMessage) aqS175S0200000_13.l0).publicEventInfo;
        if (punishEventInfo != null) {
            C0NP.LIZ(punishEventInfo, action, clickType, false, false, ((PerceptionMessage) ((IMessage) aqS175S0200000_13.l1)).dialog);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            PaidContentReviewDetailsFragment paidContentReviewDetailsFragment = (PaidContentReviewDetailsFragment) aqS175S0200000_13.l0;
            CollectionDetailModel collectionDetailModel = paidContentReviewDetailsFragment.LJLIL;
            if (collectionDetailModel != null) {
                ComposeView composeView = (ComposeView) aqS175S0200000_13.l1;
                interfaceC24520xk.LJJIIJ(-492369756);
                Object LJIILL = interfaceC24520xk.LJIILL();
                InterfaceC24520xk.LIZ.getClass();
                C24490xh c24490xh = C24500xi.LIZIZ;
                if (LJIILL == c24490xh) {
                    LJIILL = C78966Uyw.LJJJIL(C61878OQg.INSTANCE);
                    interfaceC24520xk.LJJIII(LJIILL);
                }
                interfaceC24520xk.LJJIJIIJIL();
                InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
                interfaceC24520xk.LJJIIJ(-492369756);
                Object LJIILL2 = interfaceC24520xk.LJIILL();
                if (LJIILL2 == c24490xh) {
                    LJIILL2 = C78966Uyw.LJJJIL(Boolean.TRUE);
                    interfaceC24520xk.LJJIII(LJIILL2);
                }
                interfaceC24520xk.LJJIJIIJIL();
                InterfaceC35811ar interfaceC35811ar2 = (InterfaceC35811ar) LJIILL2;
                interfaceC24520xk.LJJIIJ(-492369756);
                Object LJIILL3 = interfaceC24520xk.LJIILL();
                if (LJIILL3 == c24490xh) {
                    LJIILL3 = C78966Uyw.LJJJIL(Boolean.FALSE);
                    interfaceC24520xk.LJJIII(LJIILL3);
                }
                interfaceC24520xk.LJJIJIIJIL();
                C24610xt.LJ(C76800UCe.LIZ, new C25578A2c(collectionDetailModel, paidContentReviewDetailsFragment, (InterfaceC35811ar) LJIILL3, null), interfaceC24520xk);
                C86442XwE c86442XwE = new C86442XwE(new C25580A2e(interfaceC35811ar, collectionDetailModel, interfaceC35811ar2, paidContentReviewDetailsFragment, composeView), collectionDetailModel.getCollectionId());
                C32541Pm LJIIIZ = C1E5.LJIIIZ(0, interfaceC24520xk, 3);
                InterfaceC20340r0 interfaceC20340r0 = (InterfaceC20340r0) interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIIIIZZ);
                interfaceC20340r0.LIZ(0);
                C24610xt.LJ(paidContentReviewDetailsFragment.LJLIL, new EHJ(c86442XwE, null), interfaceC24520xk);
                if (!((List) interfaceC35811ar.getValue()).isEmpty()) {
                    interfaceC24520xk.LJJIIJ(191468289);
                    V5R.LIZIZ(LJIIIZ, new A4T(collectionDetailModel.getCollectionId(), (List) interfaceC35811ar.getValue(), collectionDetailModel.getCollectionRating(), collectionDetailModel.getCollectionRatingNum(), collectionDetailModel.getCanReviewCollection()), false, true, false, false, null, ((Boolean) interfaceC35811ar2.getValue()).booleanValue(), new A44(paidContentReviewDetailsFragment, collectionDetailModel, interfaceC20340r0, composeView), interfaceC24520xk, 224640, 64);
                    interfaceC24520xk.LJJIJIIJIL();
                } else {
                    interfaceC24520xk.LJJIIJ(191473963);
                    V5E.LIZ(C09290Yb.LJFF(C09290Yb.LJII(InterfaceC07790Sh.LJJJI)), interfaceC24520xk, 6, 0);
                    interfaceC24520xk.LJJIJIIJIL();
                }
                C79181V5t.LIZ(LJIIIZ, 0, new AqS156S0100000_6(c86442XwE, 64), interfaceC24520xk, 0, 2);
            }
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ed, code lost:
    
        if (r28 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x045b, code lost:
    
        if (r40 == null) goto L216;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AqS175S0200000_13 r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS175S0200000_13.invoke$6(kotlin.jvm.internal.AqS175S0200000_13, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0213, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0238, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AqS175S0200000_13 r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS175S0200000_13.invoke$7(kotlin.jvm.internal.AqS175S0200000_13, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AqS175S0200000_13 aqS175S0200000_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = ((TQV) aqS175S0200000_13.l0).getMultiGuestDataHolder().LJJIJLIJ;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS175S0200000_13.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS175S0200000_13 aqS175S0200000_13, Object it, Object obj) {
        ((Boolean) obj).booleanValue();
        o.LJIIIZ(it, "it");
        if (it == EnumC57435MgR.FOLLOW_REQUESTED) {
            ((C2S9) aqS175S0200000_13.l0).postDelayed(new ARunnableS49S0100000_13((InterfaceC78981UzB) aqS175S0200000_13.l1, 185), 500L);
        } else {
            ((C2S9) aqS175S0200000_13.l0).postDelayed(new ARunnableS49S0100000_13((InterfaceC78981UzB) aqS175S0200000_13.l1, 186), 200L);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(TQV tqv, AqS179S0100000_13 aqS179S0100000_13, int i) {
        super(2);
        this.$t = i;
        this.l0 = tqv;
        this.l1 = aqS179S0100000_13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(TRU tru, AqS9S0111000_13 aqS9S0111000_13, int i) {
        super(2);
        this.$t = i;
        this.l0 = tru;
        this.l1 = aqS9S0111000_13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(C78216Umq c78216Umq, C78200Uma c78200Uma, int i) {
        super(2);
        this.$t = i;
        this.l0 = c78216Umq;
        this.l1 = c78200Uma;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS175S0200000_13(V53 v53, V53 v532, InterfaceC35811ar<Integer> interfaceC35811ar) {
        super(2);
        this.$t = interfaceC35811ar;
        this.l0 = v53;
        this.l1 = v532;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(V5J v5j, Aweme aweme, int i) {
        super(2);
        this.$t = i;
        this.l0 = v5j;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, C74631TQt c74631TQt, int i) {
        super(2);
        this.$t = i;
        this.l0 = multiGuestV3GuestPresenter;
        this.l1 = c74631TQt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS175S0200000_13(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(2);
        this.$t = interfaceC88472Yns;
        this.l0 = multiGuestV3GuestPresenter;
        this.l1 = multiGuestV3GuestPresenter2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS175S0200000_13(GameLinkGuestPresenter gameLinkGuestPresenter, GameLinkGuestPresenter gameLinkGuestPresenter2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(2);
        this.$t = interfaceC88472Yns;
        this.l0 = gameLinkGuestPresenter;
        this.l1 = gameLinkGuestPresenter2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(PerceptionMessage perceptionMessage, IMessage iMessage, int i) {
        super(2);
        this.$t = i;
        this.l0 = perceptionMessage;
        this.l1 = iMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(PlaylistCollectionCell playlistCollectionCell, AnonymousClass886 anonymousClass886, int i) {
        super(2);
        this.$t = i;
        this.l0 = playlistCollectionCell;
        this.l1 = anonymousClass886;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment, ARunnableS49S0100000_13 aRunnableS49S0100000_13, int i) {
        super(2);
        this.$t = i;
        this.l0 = spotlightImageListPreviewDialogFragment;
        this.l1 = aRunnableS49S0100000_13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(PaidContentReviewDetailsFragment paidContentReviewDetailsFragment, ComposeView composeView, int i) {
        super(2);
        this.$t = i;
        this.l0 = paidContentReviewDetailsFragment;
        this.l1 = composeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = seriesDraftAdvanceVoucherPriceAssem;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(DoNotTranslateSettingPage doNotTranslateSettingPage, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = doNotTranslateSettingPage;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS175S0200000_13(View view, MentionFavoriteVideoVM mentionFavoriteVideoVM, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = view;
        this.l1 = mentionFavoriteVideoVM;
    }
}
