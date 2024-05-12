package com.ss.android.ugc.aweme.utils;

import X.C0JU;
import X.C113724dE;
import X.C27474AqM;
import X.C27722AuM;
import X.C27739Aud;
import X.C36576EXc;
import X.C51029K0z;
import X.C61995OUt;
import X.C63081OpJ;
import X.C69698RXa;
import X.C70085Rez;
import X.C70179RgV;
import X.C70479RlL;
import X.C70656RoC;
import X.C70677RoX;
import X.C70691Rol;
import X.C70819Rqp;
import X.C70836Rr6;
import X.C70884Rrs;
import X.C70889Rrx;
import X.C70912RsK;
import X.C70917RsP;
import X.C70919RsR;
import X.C71066Ruo;
import X.C71072Ruu;
import X.C71075Rux;
import X.C71271Ry7;
import X.C76542zS;
import X.C77125UOr;
import X.C77857Uh3;
import X.C78685UuP;
import X.C78946Uyc;
import X.E94;
import X.EnumC70477RlJ;
import X.InterfaceC70181RgX;
import X.InterfaceC71003Rtn;
import X.ORZ;
import X.OSZ;
import X.S5F;
import X.S7P;
import X.TAT;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.TopTabListViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.settings.MessageCenterTabListEntranceSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.PdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpCouponsViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleAddButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.Option;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionPickerDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewProductCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewCellViewHolder;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationTitle;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.BaseTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS128S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.IDqS186S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Au2S11S0300000_12 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.TAT
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
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZ$11(this, view);
                return;
            case 12:
                LIZ$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LIZ$13(this, view);
                return;
            case 14:
                LIZ$14(this, view);
                return;
            case 15:
                LIZ$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LIZ$16(this, view);
                return;
            case 17:
                LIZ$17(this, view);
                return;
            case 18:
                LIZ$18(this, view);
                return;
            case 19:
                LIZ$19(this, view);
                return;
            case 20:
                LIZ$20(this, view);
                return;
            case 21:
                LIZ$21(this, view);
                return;
            case 22:
                LIZ$22(this, view);
                return;
            case 23:
                LIZ$23(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            InterfaceC70181RgX interfaceC70181RgX = ((C70179RgV) au2S11S0300000_12.l0).LJLILLLLZI;
            if (interfaceC70181RgX != null) {
                interfaceC70181RgX.LIZ((C113724dE) au2S11S0300000_12.l1, (PdpButton) au2S11S0300000_12.l2);
            }
            if (((C70179RgV) au2S11S0300000_12.l0).getEnableButtonVibration()) {
                Context context = ((C113724dE) au2S11S0300000_12.l1).getContext();
                o.LJIIIIZZ(context, "this.context");
                new C61995OUt(context).LIZIZ(50, LiveTryModeCountDownThresholdSetting.DEFAULT);
            }
        }
    }

    public static final void LIZ$1(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        String str;
        if (view != null) {
            String str2 = ((MessageCenterTabListEntranceSettings.TabEntranceItem) au2S11S0300000_12.l0).schema;
            if (str2 != null) {
                E94 LLL = C63081OpJ.LLL(str2);
                C27474AqM c27474AqM = ((MessageCenterViewModel) ((TopTabListViewHolder) au2S11S0300000_12.l1).LJLIL.getValue()).LJLJJLL;
                if (c27474AqM == null || (str = c27474AqM.LJLILLLLZI) == null) {
                    str = "notification_page";
                }
                LLL.LJI(3, "enter_from", str);
                Integer num = ((MessageCenterTabListEntranceSettings.TabEntranceItem) au2S11S0300000_12.l0).type;
                if (num != null && num.intValue() == 1) {
                    String value = String.valueOf(System.currentTimeMillis());
                    o.LJIIIZ(value, "value");
                    LLL.LJFF(3, 3, C51029K0z.LJJIIZI(new OSZ("start_click_time", value)));
                }
                SmartRouter.buildRoute(((View) au2S11S0300000_12.l2).getContext(), LLL.LIZ()).open();
                ((MessageCenterViewModel) ((TopTabListViewHolder) au2S11S0300000_12.l1).LJLIL.getValue()).LJLJL = "next";
            }
            C27474AqM c27474AqM2 = ((MessageCenterViewModel) ((TopTabListViewHolder) au2S11S0300000_12.l1).LJLIL.getValue()).LJLJJLL;
            if (c27474AqM2 != null) {
                Integer num2 = ((MessageCenterTabListEntranceSettings.TabEntranceItem) au2S11S0300000_12.l0).type;
                if (num2 != null && num2.intValue() == 3) {
                    Map<String, String> LIZ = c27474AqM2.LIZ();
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(LIZ);
                    C76542zS.LIZ("tiktokec_cart_entrance_click", hashMap);
                }
                Integer num3 = ((MessageCenterTabListEntranceSettings.TabEntranceItem) au2S11S0300000_12.l0).type;
                if (num3 != null && num3.intValue() == 2) {
                    Map<String, String> LIZ2 = c27474AqM2.LIZ();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(LIZ2);
                    C76542zS.LIZ("tiktokec_couponlist_entrance_click", hashMap2);
                }
                Integer num4 = ((MessageCenterTabListEntranceSettings.TabEntranceItem) au2S11S0300000_12.l0).type;
                if (num4 == null || num4.intValue() != 1) {
                    return;
                }
                Map<String, String> LIZ3 = c27474AqM2.LIZ();
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(LIZ3);
                C76542zS.LIZ("tiktokec_ecommerce_centre_entry_click", hashMap3);
            }
        }
    }

    public static final void LIZ$10(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            C70085Rez c70085Rez = (C70085Rez) au2S11S0300000_12.l0;
            PdpViewModel pdpViewModel = (PdpViewModel) au2S11S0300000_12.l1;
            ProductUnavailableInfo productUnavailableInfo = (ProductUnavailableInfo) au2S11S0300000_12.l2;
            c70085Rez.getClass();
            C70085Rez.LIZLLL(pdpViewModel, view, productUnavailableInfo);
        }
    }

    public static final void LIZ$11(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            C70085Rez c70085Rez = (C70085Rez) au2S11S0300000_12.l0;
            PdpViewModel pdpViewModel = (PdpViewModel) au2S11S0300000_12.l1;
            ProductUnavailableInfo productUnavailableInfo = (ProductUnavailableInfo) au2S11S0300000_12.l2;
            c70085Rez.getClass();
            C70085Rez.LIZLLL(pdpViewModel, view, productUnavailableInfo);
        }
    }

    public static final void LIZ$12(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (view != null) {
            TemplateListViewModel N = ((BaseTemplateCell) au2S11S0300000_12.l0).N();
            ViewGroup cellPreviewContainer = (ViewGroup) au2S11S0300000_12.l1;
            TemplateItem item = (TemplateItem) au2S11S0300000_12.l2;
            N.getClass();
            o.LJIIIZ(cellPreviewContainer, "cellPreviewContainer");
            o.LJIIIZ(item, "item");
            String str = null;
            XKX.LIZLLL(ViewModelKt.getViewModelScope(N), C36576EXc.LIZJ, null, new S7P(N, item, cellPreviewContainer, null), 2);
            RootData rootData = ((BaseTemplateCell) au2S11S0300000_12.l0).M().getState().LJLILLLLZI;
            String str2 = rootData.roomId;
            String str3 = rootData.authorId;
            boolean z = rootData.isNewUser;
            String templateId = ((TemplateItem) au2S11S0300000_12.l2).getTemplateId();
            int type = ((TemplateItem) au2S11S0300000_12.l2).getType();
            boolean LJJJLZIJ = ((TemplateItem) au2S11S0300000_12.l2).LJJJLZIJ();
            String L = rootData.L();
            int i = rootData.templateEntryType;
            List<TemplateDecoration> LLILIL = ((TemplateItem) au2S11S0300000_12.l2).LLILIL();
            if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
                str = templateDecorationTitle.text;
            }
            S5F.LJ(type, i, str2, str3, "template_display", templateId, L, z, LJJJLZIJ, C78685UuP.LJJJZ(str));
        }
    }

    public static final void LIZ$13(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        C70691Rol c70691Rol;
        if (view != null && (c70691Rol = ((ReviewFragmentV1) au2S11S0300000_12.l0).Al().LJLLILLLL) != null) {
            ViewGroup viewGroup = (ViewGroup) au2S11S0300000_12.l1;
            String sb = ((StringBuilder) au2S11S0300000_12.l2).toString();
            o.LJIIIIZZ(sb, "fitnessInfoStr.toString()");
            c70691Rol.LJJIIZ(viewGroup, sb, Float.valueOf(((ReviewFragmentV1) au2S11S0300000_12.l0).Dl()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Ynr, X.Prl] */
    public static final void LIZ$14(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            Option option = (Option) au2S11S0300000_12.l0;
            if (option.isEnabled) {
                C70819Rqp c70819Rqp = (C70819Rqp) au2S11S0300000_12.l1;
                c70819Rqp.LJLILLLLZI = option.key;
                c70819Rqp.LJLJI = option;
                ?? r0 = ((OptionPickerDialogFragment) au2S11S0300000_12.l2).LJLJJLL;
                if (r0 != 0) {
                    r0.invoke(view, option);
                }
                ((C70819Rqp) au2S11S0300000_12.l1).notifyDataSetChanged();
                return;
            }
            AqS178S0100000_12 aqS178S0100000_12 = ((OptionPickerDialogFragment) au2S11S0300000_12.l2).LJLJLJ;
            if (aqS178S0100000_12 == null) {
                return;
            }
            aqS178S0100000_12.invoke(option);
        }
    }

    public static final void LIZ$15(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        C70691Rol c70691Rol;
        if (view != null && (c70691Rol = ((ProductReviewFragment) au2S11S0300000_12.l0).Hl().LJLLILLLL) != null) {
            View findViewById = ((View) au2S11S0300000_12.l1).findViewById(R.id.k1u);
            o.LJIIIIZZ(findViewById, "container.size_progress_bar_item");
            String sb = ((StringBuilder) au2S11S0300000_12.l2).toString();
            o.LJIIIIZZ(sb, "fitnessInfoStr.toString()");
            c70691Rol.LJJIIZ(findViewById, sb, Float.valueOf(((ProductReviewFragment) au2S11S0300000_12.l0).Il()));
        }
    }

    public static final void LIZ$16(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        Object obj;
        if (view != null) {
            C70691Rol c70691Rol = ((ReviewFragment) au2S11S0300000_12.l0).xl().LJLLILLLL;
            if (c70691Rol != null) {
                ReviewFragment node = (ReviewFragment) au2S11S0300000_12.l0;
                o.LJIIIZ(node, "node");
                C78946Uyc.LJJII(node, new C70917RsP(), new AqS178S0100000_12(c70691Rol, 619));
            }
            ReviewFragment reviewFragment = (ReviewFragment) au2S11S0300000_12.l0;
            Option option = (Option) reviewFragment.withState(reviewFragment.xl(), new AqS178S0100000_12((ArrayList) au2S11S0300000_12.l1, (ArrayList<C71271Ry7>) 620));
            String str = null;
            if (option == null) {
                Iterator it = ((ArrayList) au2S11S0300000_12.l1).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Option) obj).isEnabled) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                option = (Option) obj;
            }
            FragmentManager fragmentManager = ((ReviewFragment) au2S11S0300000_12.l0).getFragmentManager();
            if (fragmentManager != null) {
                String string = ((ReviewFragment) au2S11S0300000_12.l0).getString(R.string.f_t);
                ArrayList arrayList = (ArrayList) au2S11S0300000_12.l1;
                if (option != null) {
                    str = option.key;
                }
                OptionPickerDialogFragment LIZ = C70836Rr6.LIZ(fragmentManager, string, arrayList, str, false);
                LIZ.LJLJL = new AqS128S0300000_12((List) au2S11S0300000_12.l2, (List<ReviewFilterStruct>) au2S11S0300000_12.l0, (ReviewFragment) option, (Option) 10);
                LIZ.LJLJJLL = new AqS174S0200000_12((ReviewFragment) au2S11S0300000_12.l0, option, 23);
                LIZ.LJLJLJ = new AqS178S0100000_12((ReviewFragment) au2S11S0300000_12.l0, 618);
                LIZ.LJLJLLL = new AqS143S0200000_12((ReviewFragment) au2S11S0300000_12.l0, option, 138);
                LIZ.LJLL = new IDqS186S0200000_12((ReviewFragment) au2S11S0300000_12.l0, option, 3);
            }
        }
    }

    public static final void LIZ$17(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        C70691Rol c70691Rol;
        if (view != null && (c70691Rol = ((ReviewFragment) au2S11S0300000_12.l0).xl().LJLLILLLL) != null) {
            ViewGroup viewGroup = (ViewGroup) au2S11S0300000_12.l1;
            String sb = ((StringBuilder) au2S11S0300000_12.l2).toString();
            o.LJIIIIZZ(sb, "fitnessInfoStr.toString()");
            c70691Rol.LJJIIZ(viewGroup, sb, Float.valueOf(((ReviewFragment) au2S11S0300000_12.l0).Al()));
        }
    }

    public static final void LIZ$18(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            Context context = (Context) au2S11S0300000_12.l0;
            o.LJIIIIZZ(context, "context");
            Context context2 = (Context) au2S11S0300000_12.l0;
            EcUgProduct ecUgProduct = (EcUgProduct) au2S11S0300000_12.l1;
            C71075Rux c71075Rux = (C71075Rux) au2S11S0300000_12.l2;
            C71066Ruo.LIZ(context2, ecUgProduct, c71075Rux.LIZIZ, c71075Rux.LIZJ, c71075Rux.LIZLLL, c71075Rux.LJ);
        }
    }

    public static final void LIZ$19(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            Context context = (Context) au2S11S0300000_12.l0;
            o.LJIIIIZZ(context, "context");
            Context context2 = (Context) au2S11S0300000_12.l0;
            EcUgProduct ecUgProduct = (EcUgProduct) au2S11S0300000_12.l1;
            C71072Ruu c71072Ruu = (C71072Ruu) au2S11S0300000_12.l2;
            C71066Ruo.LIZ(context2, ecUgProduct, c71072Ruu.LIZIZ, c71072Ruu.LIZJ, c71072Ruu.LIZLLL, c71072Ruu.LJ);
        }
    }

    public static final void LIZ$2(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            ((PdpBundleDealVH) au2S11S0300000_12.l0).getLogger().LIZLLL(view, (BundleInfo) au2S11S0300000_12.l1, "add_to_cart_button");
            ((PdpBundleDealVH) au2S11S0300000_12.l0).addCart(view, (BundleInfo) au2S11S0300000_12.l1, (BundleAddButton) au2S11S0300000_12.l2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:78|79|(1:81)(1:122)|82|(1:84)|85|(10:92|93|(1:99)|100|101|102|(1:106)|107|(1:111)|112)|121|93|(3:95|97|99)|100|101|102|(2:104|106)|107|(2:109|111)|112) */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02df A[Catch: all -> 0x0428, TryCatch #2 {all -> 0x0428, blocks: (B:123:0x0234, B:125:0x0244, B:126:0x0248, B:131:0x0270, B:133:0x02b7, B:134:0x0276, B:136:0x0284, B:138:0x028c, B:139:0x0290, B:140:0x029f, B:142:0x02a5, B:145:0x02b1, B:150:0x02bb, B:153:0x02d5, B:155:0x02df, B:156:0x02e3, B:158:0x02f6, B:159:0x02fa, B:161:0x0311, B:162:0x0315, B:164:0x032c, B:166:0x034f, B:167:0x0332, B:169:0x0338, B:171:0x034b, B:172:0x033e, B:79:0x035d, B:81:0x036d, B:82:0x0371, B:84:0x038c, B:85:0x038f, B:87:0x0398, B:89:0x03a1, B:93:0x03ab, B:95:0x03cc, B:97:0x03d0, B:99:0x03f0, B:100:0x03d6, B:104:0x0402, B:106:0x0424, B:107:0x0408, B:109:0x040e, B:111:0x0420, B:112:0x0414), top: B:76:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f6 A[Catch: all -> 0x0428, TryCatch #2 {all -> 0x0428, blocks: (B:123:0x0234, B:125:0x0244, B:126:0x0248, B:131:0x0270, B:133:0x02b7, B:134:0x0276, B:136:0x0284, B:138:0x028c, B:139:0x0290, B:140:0x029f, B:142:0x02a5, B:145:0x02b1, B:150:0x02bb, B:153:0x02d5, B:155:0x02df, B:156:0x02e3, B:158:0x02f6, B:159:0x02fa, B:161:0x0311, B:162:0x0315, B:164:0x032c, B:166:0x034f, B:167:0x0332, B:169:0x0338, B:171:0x034b, B:172:0x033e, B:79:0x035d, B:81:0x036d, B:82:0x0371, B:84:0x038c, B:85:0x038f, B:87:0x0398, B:89:0x03a1, B:93:0x03ab, B:95:0x03cc, B:97:0x03d0, B:99:0x03f0, B:100:0x03d6, B:104:0x0402, B:106:0x0424, B:107:0x0408, B:109:0x040e, B:111:0x0420, B:112:0x0414), top: B:76:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0311 A[Catch: all -> 0x0428, TryCatch #2 {all -> 0x0428, blocks: (B:123:0x0234, B:125:0x0244, B:126:0x0248, B:131:0x0270, B:133:0x02b7, B:134:0x0276, B:136:0x0284, B:138:0x028c, B:139:0x0290, B:140:0x029f, B:142:0x02a5, B:145:0x02b1, B:150:0x02bb, B:153:0x02d5, B:155:0x02df, B:156:0x02e3, B:158:0x02f6, B:159:0x02fa, B:161:0x0311, B:162:0x0315, B:164:0x032c, B:166:0x034f, B:167:0x0332, B:169:0x0338, B:171:0x034b, B:172:0x033e, B:79:0x035d, B:81:0x036d, B:82:0x0371, B:84:0x038c, B:85:0x038f, B:87:0x0398, B:89:0x03a1, B:93:0x03ab, B:95:0x03cc, B:97:0x03d0, B:99:0x03f0, B:100:0x03d6, B:104:0x0402, B:106:0x0424, B:107:0x0408, B:109:0x040e, B:111:0x0420, B:112:0x0414), top: B:76:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0359  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$20(com.ss.android.ugc.aweme.utils.Au2S11S0300000_12 r28, android.view.View r29) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S11S0300000_12.LIZ$20(com.ss.android.ugc.aweme.utils.Au2S11S0300000_12, android.view.View):void");
    }

    public static final void LIZ$21(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ((ReviewGalleryFragment) au2S11S0300000_12.l0), new AqS72S0400000_12((ReviewGalleryFragment) au2S11S0300000_12.l0, view, (C69698RXa) au2S11S0300000_12.l1, (C69698RXa) au2S11S0300000_12.l2, 28));
        }
    }

    public static final void LIZ$22(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ((ReviewGalleryFragment) au2S11S0300000_12.l0), new AqS72S0400000_12((ReviewGalleryFragment) au2S11S0300000_12.l0, view, (C69698RXa) au2S11S0300000_12.l1, (C69698RXa) au2S11S0300000_12.l2, 29));
        }
    }

    public static final void LIZ$23(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        if (view != null) {
            if (((ReviewCellViewHolder) au2S11S0300000_12.l0).Q().LJLLILLLL != null) {
                int i = ((ReviewCellViewHolder) au2S11S0300000_12.l0).latestItemPositionInternal + 1;
                C70677RoX c70677RoX = (C70677RoX) au2S11S0300000_12.l1;
                ReviewItemStruct reviewItemStruct = c70677RoX.LIZ;
                String str2 = c70677RoX.LIZJ;
                o.LJIIIZ(reviewItemStruct, "reviewItemStruct");
                C78946Uyc.LJJIIJ(view, new C70912RsK(), new AqS61S0201000_12(i, (int) reviewItemStruct, (ReviewItemStruct) C27739Aud.LJII(str2), (HashMap<String, Object>) 13));
            }
            String str3 = ((ShopReviewProductCard) au2S11S0300000_12.l2).pdpSchema;
            ReviewCellViewHolder reviewCellViewHolder = (ReviewCellViewHolder) au2S11S0300000_12.l0;
            HashMap<String, Object> hashMap = reviewCellViewHolder.LJLILLLLZI;
            C70677RoX c70677RoX2 = (C70677RoX) au2S11S0300000_12.l1;
            ReviewItemStruct.MainReview mainReview = c70677RoX2.LIZ.review;
            Integer num = null;
            if (mainReview != null) {
                str = mainReview.reviewId;
            } else {
                str = null;
            }
            int i2 = reviewCellViewHolder.latestItemPositionInternal + 1;
            HashMap<String, Object> LJII = C27739Aud.LJII(c70677RoX2.LIZJ);
            LinkedHashMap LIZ = C0JU.LIZ("entrance_form", "review_goods_card");
            if (hashMap != null) {
                obj = hashMap.get("enter_from_info");
            } else {
                obj = null;
            }
            LIZ.put("entrance_from_info", obj);
            LIZ.put("source_page_type", "shop_review");
            if (hashMap != null) {
                obj2 = hashMap.get("follow_status");
            } else {
                obj2 = null;
            }
            LIZ.put("follow_status", obj2);
            if (hashMap != null) {
                obj3 = hashMap.get("product_source");
            } else {
                obj3 = null;
            }
            LIZ.put("product_source", obj3);
            if (LJII != null) {
                obj4 = LJII.get("product_id");
            } else {
                obj4 = null;
            }
            LIZ.put("product_id", obj4);
            if (hashMap != null) {
                obj5 = hashMap.get("source");
            } else {
                obj5 = null;
            }
            LIZ.put("source", obj5);
            if (hashMap != null) {
                obj6 = hashMap.get("source_from");
            } else {
                obj6 = null;
            }
            LIZ.put("source_from", obj6);
            if (LJII != null) {
                obj7 = LJII.get("origin_price");
            } else {
                obj7 = null;
            }
            LIZ.put("original_price", obj7);
            if (LJII != null) {
                obj8 = LJII.get("real_price");
            } else {
                obj8 = null;
            }
            LIZ.put("sale_price", obj8);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append('_');
            if (LJII != null) {
                obj9 = LJII.get("log_id");
            } else {
                obj9 = null;
            }
            LIZ2.append(obj9);
            LIZ2.append('_');
            LIZ2.append(i2);
            LIZ.put("track_id", X1D.LIZIZ(LIZ2));
            if (hashMap != null) {
                obj10 = hashMap.get("traffic_source");
            } else {
                obj10 = null;
            }
            if (obj10 instanceof Integer) {
                num = (Integer) obj10;
            }
            Map LIZ3 = C27722AuM.LIZ(hashMap, num, LIZ);
            StringBuilder LIZJ = b1.LIZJ(str3, "&trackParams=");
            LIZJ.append(Uri.encode(C27739Aud.LJI(LIZ3)));
            SmartRouter.buildRoute(view.getContext(), X1D.LIZIZ(LIZJ)).open();
        }
    }

    public static final void LIZ$3(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            ((PdpCouponsViewHolder) au2S11S0300000_12.l0).onButtonClick((Voucher) au2S11S0300000_12.l1, (EnumC70477RlJ) au2S11S0300000_12.l2);
            Integer costType = ((Voucher) au2S11S0300000_12.l1).getCostType();
            if (costType == null || costType.intValue() != 3 || ((EnumC70477RlJ) au2S11S0300000_12.l2) != EnumC70477RlJ.USE) {
                return;
            }
            View itemView = ((PdpCouponsViewHolder) au2S11S0300000_12.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70884Rrs(), C70479RlL.LJLIL);
        }
    }

    public static final void LIZ$4(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            ReviewCellViewHolder reviewCellViewHolder = (ReviewCellViewHolder) au2S11S0300000_12.l0;
            reviewCellViewHolder.withState(reviewCellViewHolder.Q(), new AqS116S0300000_12((ReviewCellViewHolder) au2S11S0300000_12.l0, (ReviewItemStruct) au2S11S0300000_12.l1, (C70677RoX) au2S11S0300000_12.l2, 6));
        }
    }

    public static final void LIZ$5(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ((ReviewCellViewHolder) au2S11S0300000_12.l0), new AqS101S0300000_12((ReviewCellViewHolder) au2S11S0300000_12.l0, (ReviewItemStruct) au2S11S0300000_12.l1, (C70677RoX) au2S11S0300000_12.l2, 1));
        }
    }

    public static final void LIZ$6(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ((ReviewCellViewHolder) au2S11S0300000_12.l0), new AqS101S0300000_12((ReviewCellViewHolder) au2S11S0300000_12.l0, (ReviewItemStruct) au2S11S0300000_12.l1, (C70677RoX) au2S11S0300000_12.l2, 2));
        }
    }

    public static final void LIZ$7(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            PdpFragment pdpFragment = (PdpFragment) au2S11S0300000_12.l0;
            if ((pdpFragment instanceof InterfaceC71003Rtn) && pdpFragment != null) {
                C78946Uyc.LJJII(pdpFragment, new C70889Rrx(), new AqS178S0100000_12((Announcement) au2S11S0300000_12.l1, 339));
            }
            FragmentManager fragmentManager = ((PdpFragment) au2S11S0300000_12.l0).getFragmentManager();
            if (fragmentManager != null) {
                C77857Uh3.LIZLLL(fragmentManager, ((Announcement) au2S11S0300000_12.l1).getText(), ((C70085Rez) au2S11S0300000_12.l2).getResources().getString(R.string.f82));
            }
        }
    }

    public static final void LIZ$8(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        String str;
        if (view != null) {
            Announcement announcement = (Announcement) au2S11S0300000_12.l0;
            String str2 = null;
            if (announcement != null) {
                str = announcement.getDaInfo();
            } else {
                str = null;
            }
            HashMap<String, Object> LJII = C27739Aud.LJII(str);
            PdpViewModel pdpViewModel = (PdpViewModel) au2S11S0300000_12.l1;
            Announcement announcement2 = (Announcement) au2S11S0300000_12.l0;
            if (announcement2 != null) {
                str2 = announcement2.getDaInfo();
            }
            PdpViewModel.Tw0(5, 12, view, pdpViewModel, str2);
            PdpFragment pdpFragment = (PdpFragment) au2S11S0300000_12.l2;
            if ((pdpFragment instanceof InterfaceC71003Rtn) && pdpFragment != null) {
                C78946Uyc.LJJII(pdpFragment, new C70919RsR(), new AqS178S0100000_12((HashMap) LJII, (HashMap<String, Object>) 342));
            }
        }
    }

    public static final void LIZ$9(Au2S11S0300000_12 au2S11S0300000_12, View view) {
        if (view != null) {
            View remind_notice_container = ((C70085Rez) au2S11S0300000_12.l0).LIZ(R.id.iv8);
            o.LJIIIIZZ(remind_notice_container, "remind_notice_container");
            remind_notice_container.setVisibility(8);
            PdpFragment pdpFragment = (PdpFragment) au2S11S0300000_12.l1;
            if ((pdpFragment instanceof InterfaceC71003Rtn) && pdpFragment != null) {
                C78946Uyc.LJJII(pdpFragment, new C70919RsR(), new AqS178S0100000_12((HashMap) au2S11S0300000_12.l2, (HashMap<String, Object>) 340));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S11S0300000_12(Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S11S0300000_12(C70179RgV c70179RgV, C113724dE c113724dE, PdpButton pdpButton, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = c70179RgV;
        this.l1 = c113724dE;
        this.l2 = pdpButton;
    }
}
