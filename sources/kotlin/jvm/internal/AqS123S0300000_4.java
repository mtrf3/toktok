package kotlin.jvm.internal;

import X.AML;
import X.AbstractC65781Prl;
import X.AnonymousClass636;
import X.C110614Vt;
import X.C16880lQ;
import X.C2RP;
import X.C34K;
import X.C61328O5c;
import X.C68322mC;
import X.C70759Rpr;
import X.C70941Rsn;
import X.C76800UCe;
import X.C78946Uyc;
import X.C7MY;
import X.EnumC57435MgR;
import X.InterfaceC88471Ynr;
import X.ORZ;
import X.OUP;
import X.S3I;
import X.S3L;
import X.W5F;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS123S0300000_4 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [X.2RP] */
    public final void invoke$0(AML selectSubscribe, SellerInfo sellerInfo) {
        String str;
        StoreOfficialLabel storeOfficialLabel;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (sellerInfo != null) {
            String str2 = sellerInfo.name;
            final int i = 0;
            if (str2 == null || str2.length() == 0 || (str = sellerInfo.sellerId) == null || str.length() == 0) {
                return;
            }
            PdpHeadNavBarWidget pdpHeadNavBarWidget = (PdpHeadNavBarWidget) this.l0;
            if (pdpHeadNavBarWidget.headerShopInfoView == null) {
                final Context context = (Context) this.l1;
                final AttributeSet attributeSet = null;
                pdpHeadNavBarWidget.headerShopInfoView = new ConstraintLayout(context, attributeSet, i) { // from class: X.2RP
                    public final java.util.Map<Integer, View> LJLIL;

                    public final View _$_findCachedViewById(int i2) {
                        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
                        View view = (View) linkedHashMap.get(Integer.valueOf(i2));
                        if (view != null) {
                            return view;
                        }
                        View findViewById = findViewById(i2);
                        if (findViewById == null) {
                            return null;
                        }
                        linkedHashMap.put(Integer.valueOf(i2), findViewById);
                        return findViewById;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(context, attributeSet, i);
                        this.LJLIL = C62850Ola.LJFF(context, "context");
                        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.zi, this, true);
                    }
                };
                ((ViewGroup) ((PdpHeadNavBarWidget) this.l0)._$_findCachedViewById(R.id.jxz)).addView(((PdpHeadNavBarWidget) this.l0).headerShopInfoView);
            }
            C2RP c2rp = ((PdpHeadNavBarWidget) this.l0).headerShopInfoView;
            if (c2rp != null) {
                Image image = sellerInfo.avatar;
                if (image != null) {
                    W5F LIZLLL = C70759Rpr.LIZLLL(image.toThumbFirstImageUrlModel());
                    S3I s3i = new S3I();
                    Context context2 = c2rp.getContext();
                    o.LJIIIIZZ(context2, "context");
                    int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dz, context2);
                    float LIZIZ = C7MY.LIZIZ(1);
                    s3i.LIZJ = LJIIIIZZ;
                    s3i.LIZIZ = LIZIZ;
                    s3i.LIZLLL = C7MY.LIZIZ(16);
                    LIZLLL.LJIJJLI = new S3L(s3i);
                    LIZLLL.LJJIIJ = (SmartImageView) c2rp._$_findCachedViewById(R.id.abh);
                    C16880lQ.LLJJJ(LIZLLL);
                }
                StoreLabel storeLabel = sellerInfo.storeLabel;
                if (storeLabel != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                    Context context3 = c2rp.getContext();
                    o.LJIIIIZZ(context3, "context");
                    Image LIZ = storeOfficialLabel.LIZ(context3);
                    if (LIZ != null) {
                        SmartImageView official_label = (SmartImageView) c2rp._$_findCachedViewById(R.id.h9z);
                        o.LJIIIIZZ(official_label, "official_label");
                        OUP.LJJJI(official_label, LIZ);
                        ImageView official_label2 = (ImageView) c2rp._$_findCachedViewById(R.id.h9z);
                        o.LJIIIIZZ(official_label2, "official_label");
                        official_label2.setVisibility(0);
                        Integer width = LIZ.getWidth(12.0f);
                        if (width != null) {
                            int intValue = width.intValue();
                            SmartImageView official_label3 = (SmartImageView) c2rp._$_findCachedViewById(R.id.h9z);
                            o.LJIIIIZZ(official_label3, "official_label");
                            OUP.LJJJIL(intValue, official_label3);
                        }
                        TuxTextView tv_name = (TuxTextView) c2rp._$_findCachedViewById(R.id.mby);
                        o.LJIIIIZZ(tv_name, "tv_name");
                        SmartImageView official_label4 = (SmartImageView) c2rp._$_findCachedViewById(R.id.h9z);
                        o.LJIIIIZZ(official_label4, "official_label");
                        OUP.LJIIZILJ(tv_name, official_label4);
                    }
                }
                ((TextView) c2rp._$_findCachedViewById(R.id.mby)).setText(sellerInfo.name);
            }
            C34K c34k = (C34K) this.l2;
            if (!c34k.element) {
                c34k.element = true;
                C78946Uyc.LJJII(((PdpHeadNavBarWidget) this.l0).getFragment(), new C70941Rsn(), new AqS170S0100000_4(sellerInfo, 314));
            }
            PdpHeadNavBarWidget pdpHeadNavBarWidget2 = (PdpHeadNavBarWidget) this.l0;
            C2RP c2rp2 = pdpHeadNavBarWidget2.headerShopInfoView;
            if (c2rp2 == null) {
                return;
            }
            C16880lQ.LJIIJ(new Au2S10S0300000_4(sellerInfo, pdpHeadNavBarWidget2, (Context) this.l1, 3), c2rp2);
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS123S0300000_4 aqS123S0300000_4, Object obj, Object obj2) {
        aqS123S0300000_4.invoke$0((AML) obj, (SellerInfo) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS123S0300000_4 aqS123S0300000_4, Object status, Object obj) {
        INoticeService LJJJJJ;
        String str;
        List<String> urlList;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(status, "status");
        if (booleanValue) {
            IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIIZILJ(IMUser.fromUser(((UserState) aqS123S0300000_4.l0).getUser()));
            if ((status == EnumC57435MgR.FOLLOWED || status == EnumC57435MgR.FOLLOW_MUTUAL || status == EnumC57435MgR.FOLLOW_REQUESTED) && (LJJJJJ = NoticeServiceImpl.LJJJJJ()) != null) {
                Context context = ((FollowListAdapter.FollowItemViewHolder) aqS123S0300000_4.l1).LJLLJ;
                o.LJIIIIZZ(context, "context");
                String LL = ((FollowListAdapter) aqS123S0300000_4.l2).LL();
                UrlModel avatarThumb = ((UserState) aqS123S0300000_4.l0).getUser().getAvatarThumb();
                if (avatarThumb != null && (urlList = avatarThumb.getUrlList()) != null) {
                    str = (String) ORZ.LJLLLL(urlList);
                } else {
                    str = null;
                }
                LJJJJJ.LJJJJI(context, new GuideOutPushParam(LL, (String) null, "follow", str, 5));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS123S0300000_4 aqS123S0300000_4, Object selectSubscribe, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        int i = R.attr.cv;
        int i2 = R.attr.gx;
        int i3 = R.attr.ce;
        int i4 = R.attr.go;
        if (intValue == 0) {
            ((C68322mC) aqS123S0300000_4.l0).element = "upload_date";
        } else {
            ((C68322mC) aqS123S0300000_4.l0).element = "most_watched";
            i = R.attr.ce;
            i2 = R.attr.go;
            i3 = R.attr.cv;
            i4 = R.attr.gx;
        }
        TuxTextView tuxTextView = (TuxTextView) aqS123S0300000_4.l1;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(i);
        c110614Vt.LIZJ = C61328O5c.LIZJ(200);
        Context context = tuxTextView.getContext();
        o.LJIIIIZZ(context, "context");
        tuxTextView.setBackground(c110614Vt.LIZ(context));
        tuxTextView.setTextColorRes(i2);
        TuxTextView tuxTextView2 = (TuxTextView) aqS123S0300000_4.l2;
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(i3);
        c110614Vt2.LIZJ = C61328O5c.LIZJ(200);
        Context context2 = tuxTextView2.getContext();
        o.LJIIIIZZ(context2, "context");
        tuxTextView2.setBackground(c110614Vt2.LIZ(context2));
        tuxTextView2.setTextColorRes(i4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS123S0300000_4 aqS123S0300000_4, Object selectSubscribe, Object obj) {
        int i;
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        TuxIconView tuxIconView = (TuxIconView) aqS123S0300000_4.l0;
        int i2 = 8;
        if (intValue == 0) {
            ((C68322mC) aqS123S0300000_4.l1).element = "upload_date";
            i = 0;
        } else {
            ((C68322mC) aqS123S0300000_4.l1).element = "most_watched";
            i = 8;
        }
        tuxIconView.setVisibility(i);
        TuxIconView tuxIconView2 = (TuxIconView) aqS123S0300000_4.l2;
        if (intValue == 1) {
            i2 = 0;
        }
        tuxIconView2.setVisibility(i2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS123S0300000_4(C68322mC c68322mC, C68322mC<String> c68322mC2, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        super(2);
        this.$t = tuxTextView2;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.l2 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS123S0300000_4(TuxIconView tuxIconView, TuxIconView tuxIconView2, C68322mC<String> c68322mC, TuxIconView tuxIconView3) {
        super(2);
        this.$t = tuxIconView3;
        this.l0 = tuxIconView;
        this.l1 = tuxIconView2;
        this.l2 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS123S0300000_4(PdpHeadNavBarWidget pdpHeadNavBarWidget, Context context, C34K c34k, int i) {
        super(2);
        this.$t = i;
        this.l0 = pdpHeadNavBarWidget;
        this.l1 = context;
        this.l2 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS123S0300000_4(UserState userState, FollowListAdapter.FollowItemViewHolder followItemViewHolder, FollowListAdapter followListAdapter, int i) {
        super(2);
        this.$t = i;
        this.l0 = userState;
        this.l1 = followItemViewHolder;
        this.l2 = followListAdapter;
    }
}
