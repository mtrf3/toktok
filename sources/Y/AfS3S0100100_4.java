package Y;

import X.A2Z;
import X.A4N;
import X.A69;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C17280m4;
import X.C188727au;
import X.C249149qA;
import X.C25689A6j;
import X.C26059AKp;
import X.C27225AmL;
import X.C27226AmM;
import X.C27227AmN;
import X.C27739Aud;
import X.C45804HyK;
import X.C47261Igj;
import X.C64797Pbt;
import X.C79045V0n;
import X.FMX;
import X.HG3;
import X.InterfaceC64592gB;
import X.ORZ;
import X.RBX;
import X.SY4;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddSeriesToLiveViewModel;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddedSeriesViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS16S0000100_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AfS3S0100100_4 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS3S0100100_4 afS3S0100100_4, Object obj) {
        ((PaidSeriesAddSeriesToLiveViewModel) afS3S0100100_4.l0).setState(new AqS16S0000100_4(afS3S0100100_4.j1, 0));
    }

    public static final void accept$1(AfS3S0100100_4 afS3S0100100_4, Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            ((PaidSeriesAddSeriesToLiveViewModel) afS3S0100100_4.l0).setState(new AqS16S0000100_4(afS3S0100100_4.j1, 1));
        }
    }

    public static final void accept$2(AfS3S0100100_4 afS3S0100100_4, Object obj) {
        ((PaidSeriesAddSeriesToLiveViewModel) afS3S0100100_4.l0).setState(new AqS16S0000100_4(afS3S0100100_4.j1, 2));
    }

    public static final void accept$3(AfS3S0100100_4 afS3S0100100_4, Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            ((PaidSeriesAddSeriesToLiveViewModel) afS3S0100100_4.l0).setState(new AqS16S0000100_4(afS3S0100100_4.j1, 3));
        }
    }

    public static final void accept$4(AfS3S0100100_4 afS3S0100100_4, Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            ((PaidSeriesAddedSeriesViewModel) afS3S0100100_4.l0).setState(new AqS16S0000100_4(afS3S0100100_4.j1, 4));
        }
    }

    public static final void accept$5(AfS3S0100100_4 afS3S0100100_4, Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            ((PaidSeriesAddedSeriesViewModel) afS3S0100100_4.l0).setState(new AqS16S0000100_4(afS3S0100100_4.j1, 5));
        }
    }

    public static final void accept$6(AfS3S0100100_4 afS3S0100100_4, Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            ((PaidSeriesAddedSeriesViewModel) afS3S0100100_4.l0).setState(new AqS16S0000100_4(afS3S0100100_4.j1, 6));
        }
    }

    public static final void accept$7(AfS3S0100100_4 afS3S0100100_4, Object obj) {
        String str;
        Context context;
        String str2;
        int i;
        int i2;
        int i3;
        String str3;
        int i4;
        int i5;
        PriceInfo priceInfo;
        List<String> urlList;
        String str4;
        String str5;
        String str6;
        User collectionCreator;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        final CollectionDetailModel collectionDetailModel = ((PaidCollectionDetailResponse) obj).collectionDetail;
        if (collectionDetailModel != null) {
            C25689A6j c25689A6j = (C25689A6j) afS3S0100100_4.l0;
            long j = afS3S0100100_4.j1;
            IFrameSlot.SlotViewModel slotViewModel = c25689A6j.LJLJLLL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLIL) != null) {
                mutableLiveData.setValue(new Pair<>(Boolean.TRUE, "live_paid_series"));
            }
            if (c25689A6j.LJLLILLLL && !c25689A6j.LJLJI) {
                CollectionDetailModel collectionDetailModel2 = c25689A6j.LJLLI;
                if (collectionDetailModel2 != null && (collectionCreator = collectionDetailModel2.getCollectionCreator()) != null) {
                    str4 = collectionCreator.getUid();
                } else {
                    str4 = null;
                }
                CollectionDetailModel collectionDetailModel3 = c25689A6j.LJLLI;
                if (collectionDetailModel3 != null) {
                    str5 = Long.valueOf(collectionDetailModel3.getCollectionId()).toString();
                } else {
                    str5 = null;
                }
                Room room = c25689A6j.LJLJJLL;
                if (room == null || (str6 = C17280m4.LIZ(room)) == null) {
                    str6 = "";
                }
                A4N.LIZJ(0, str4, str5, str6);
            }
            final A69 LJIIIZ = c25689A6j.LJIIIZ();
            boolean z = c25689A6j.LJLJI;
            View view = LJIIIZ.LJLJI;
            if (view != null && (context = view.getContext()) != null) {
                SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.jp7);
                TextView textView = (TextView) view.findViewById(R.id.jpn);
                TextView textView2 = (TextView) view.findViewById(R.id.jpb);
                final TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.jpf);
                final TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.hdr);
                View purchasedText = view.findViewById(R.id.ig_);
                final TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.hds);
                View purchaseStatusContainer = view.findViewById(R.id.ig8);
                TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.nke);
                LJIIIZ.LJLJJI = (SY4) view.findViewById(R.id.b2j);
                UrlModel collectionCover = collectionDetailModel.getCollectionCover();
                if (collectionCover == null || (urlList = collectionCover.getUrlList()) == null || (str2 = (String) ORZ.LJLLLLLL(0, urlList)) == null) {
                    str2 = "";
                }
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
                LJIIIIZZ.LJJIIJ = smartImageView;
                C16880lQ.LLJJJ(LJIIIIZZ);
                textView.setText(collectionDetailModel.getCollectionName());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Integer LJI = C79045V0n.LJI(R.attr.gx, context);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) context.getResources().getQuantityString(R.plurals.t2, collectionDetailModel.getCollectionVideoNum(), Integer.valueOf(collectionDetailModel.getCollectionVideoNum())));
                spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                Integer LJI2 = C79045V0n.LJI(R.attr.dz, context);
                if (LJI2 != null) {
                    i2 = LJI2.intValue();
                } else {
                    i2 = 0;
                }
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i2);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) " | ");
                spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
                Integer LJI3 = C79045V0n.LJI(R.attr.gx, context);
                if (LJI3 != null) {
                    i3 = LJI3.intValue();
                } else {
                    i3 = 0;
                }
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(i3);
                int length3 = spannableStringBuilder.length();
                long collectionTotalDuration = collectionDetailModel.getCollectionTotalDuration();
                Resources resources = context.getResources();
                o.LJIIIIZZ(resources, "context.resources");
                spannableStringBuilder.append((CharSequence) C249149qA.LIZ(collectionTotalDuration, resources));
                spannableStringBuilder.setSpan(foregroundColorSpan3, length3, spannableStringBuilder.length(), 17);
                textView2.setText(spannableStringBuilder);
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                User collectionCreator2 = collectionDetailModel.getCollectionCreator();
                if (collectionCreator2 != null) {
                    str3 = collectionCreator2.getUid();
                } else {
                    str3 = null;
                }
                final boolean equals = curUserId.equals(str3);
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI != null && (priceInfo = collectionDetailModel.getPriceInfo()) != null) {
                    Object value = LJIIIZ.LJLJJL.getValue();
                    o.LJIIIIZZ(value, "<get-seriesPricingService>(...)");
                    ((ISeriesPricingService) value).LIZ(context, C47261Igj.LJJIJ(new A2Z(collectionDetailModel.getCollectionId(), priceInfo, collectionDetailModel.getDiscountedPriceInfo()))).observe(LJJIFFI, new Observer() { // from class: X.9z0
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            String str7;
                            C254739zB c254739zB = (C254739zB) ((java.util.Map) obj2).get(Long.valueOf(CollectionDetailModel.this.getCollectionId()));
                            if (c254739zB != null) {
                                TuxTextView tuxTextView4 = tuxTextView;
                                CollectionDetailModel collectionDetailModel4 = CollectionDetailModel.this;
                                boolean z2 = equals;
                                TuxTextView tuxTextView5 = tuxTextView2;
                                A69 a69 = LJIIIZ;
                                TuxTextView originalPriceOverflow = tuxTextView3;
                                if (C78685UuP.LJJJZ(c254739zB.LIZLLL)) {
                                    str7 = c254739zB.LIZLLL;
                                } else {
                                    str7 = c254739zB.LIZJ;
                                }
                                tuxTextView4.setText(str7);
                                if (!c254739zB.LJFF && C78685UuP.LJJJZ(c254739zB.LIZLLL) && !collectionDetailModel4.getHasPurchasedCollection() && !z2) {
                                    tuxTextView5.setText(c254739zB.LIZJ);
                                    tuxTextView5.setPaintFlags(tuxTextView5.getPaintFlags() | 16);
                                    SY4 sy4 = a69.LJLJJI;
                                    if (sy4 != null) {
                                        int[] iArr = new int[2];
                                        int[] iArr2 = new int[2];
                                        tuxTextView5.measure(0, 0);
                                        tuxTextView5.getLocationOnScreen(iArr);
                                        sy4.getLocationOnScreen(iArr2);
                                        int measuredWidth = tuxTextView5.getMeasuredWidth() + iArr[0];
                                        int i6 = iArr2[0];
                                        if (measuredWidth >= i6 && measuredWidth != 0 && i6 != 0) {
                                            o.LJIIIIZZ(originalPriceOverflow, "originalPriceOverflow");
                                            originalPriceOverflow.setVisibility(0);
                                            originalPriceOverflow.setText(c254739zB.LIZJ);
                                            return;
                                        }
                                    }
                                    tuxTextView5.setVisibility(0);
                                }
                            }
                        }
                    });
                }
                C16880lQ.LJJJ(tuxIconView, new ACListenerS39S0200000_4(LJIIIZ, collectionDetailModel, 89));
                if (z) {
                    o.LJIIIIZZ(purchaseStatusContainer, "purchaseStatusContainer");
                    purchaseStatusContainer.setVisibility(0);
                    o.LJIIIIZZ(purchasedText, "purchasedText");
                    if (collectionDetailModel.getHasPurchasedCollection()) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    purchasedText.setVisibility(i4);
                    SY4 sy4 = LJIIIZ.LJLJJI;
                    if (sy4 != null) {
                        if (!collectionDetailModel.getHasPurchasedCollection()) {
                            i5 = 0;
                        } else {
                            i5 = 8;
                        }
                        sy4.setVisibility(i5);
                    }
                } else {
                    o.LJIIIIZZ(purchaseStatusContainer, "purchaseStatusContainer");
                    purchaseStatusContainer.setVisibility(8);
                }
                C16880lQ.LJIIJ(new ACListenerS30S0300000_4(LJIIIZ, collectionDetailModel, context, 13), view);
            }
            c25689A6j.LJLLI = collectionDetailModel;
            c25689A6j.LJLLILLLL = true;
            if (c25689A6j.LJLJI) {
                User collectionCreator3 = collectionDetailModel.getCollectionCreator();
                if (collectionCreator3 != null) {
                    str = collectionCreator3.getUid();
                } else {
                    str = null;
                }
                String roomId = String.valueOf(j);
                String collectionId = String.valueOf(collectionDetailModel.getCollectionId());
                Object value2 = c25689A6j.LJLJJL.getValue();
                o.LJIIIIZZ(value2, "<get-userService>(...)");
                String currentUserID = ((IUserService) value2).getCurrentUserID();
                o.LJIIIZ(roomId, "roomId");
                o.LJIIIZ(collectionId, "collectionId");
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("author_id", str);
                c188727au.LJIIIZ("room_id", roomId);
                c188727au.LJIIIZ("collection_id", collectionId);
                c188727au.LJIIIZ("user_id", currentUserID);
                FMX.LJIIL("view_pinned_card_live", c188727au.LIZ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$8(AfS3S0100100_4 afS3S0100100_4, Object obj) {
        Response response = (Response) ((C64797Pbt) obj).LIZIZ;
        ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData = (ChangeOrderShippingAddressResponseData) response.data;
        long elapsedRealtime = SystemClock.elapsedRealtime() - afS3S0100100_4.j1;
        if (!response.isCodeOK() || changeOrderShippingAddressResponseData == null) {
            ((AddressEditViewModel) afS3S0100100_4.l0).setState(C27225AmL.LJLIL);
            ((AddressEditViewModel) afS3S0100100_4.l0).mw0(false, changeOrderShippingAddressResponseData, elapsedRealtime);
            C26059AKp.LIZ().LIZ("ec_change_address_on_order", C27739Aud.LJI(new ChangeOnOrderStruct(Integer.valueOf(response.code), response.message)));
            return;
        }
        Integer num = changeOrderShippingAddressResponseData.resultCode;
        if (num == null || num.intValue() != 0) {
            ((AddressEditViewModel) afS3S0100100_4.l0).setState(C27226AmM.LJLIL);
            ((AddressEditViewModel) afS3S0100100_4.l0).mw0(false, changeOrderShippingAddressResponseData, elapsedRealtime);
            C26059AKp.LIZ().LIZ("ec_change_address_on_order", C27739Aud.LJI(new ChangeOnOrderStruct(changeOrderShippingAddressResponseData.resultCode, changeOrderShippingAddressResponseData.toastMessage)));
            return;
        }
        Integer num2 = changeOrderShippingAddressResponseData.resultCode;
        if (num2 == null || num2.intValue() != 0) {
            return;
        }
        List<Error> list = changeOrderShippingAddressResponseData.errors;
        if (list != null && !list.isEmpty()) {
            return;
        }
        ((AddressEditViewModel) afS3S0100100_4.l0).setState(C27227AmN.LJLIL);
        ((AddressEditViewModel) afS3S0100100_4.l0).mw0(true, changeOrderShippingAddressResponseData, elapsedRealtime);
        C26059AKp.LIZ().LIZ("ec_change_address_on_order", C27739Aud.LJI(new ChangeOnOrderStruct(changeOrderShippingAddressResponseData.resultCode, changeOrderShippingAddressResponseData.toastMessage)));
    }

    public AfS3S0100100_4(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
