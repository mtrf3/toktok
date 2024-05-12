package Y;

import X.B35;
import X.BZ3;
import X.BZ9;
import X.C0NB;
import X.C15070iV;
import X.C15380j0;
import X.C15650jR;
import X.C28291B8l;
import X.C30091BrT;
import X.C30760C5k;
import X.C38354F3m;
import X.C73433Srt;
import X.CDE;
import X.CDG;
import X.InterfaceC31995Ch5;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.ORZ;
import X.UW7;
import X.X1D;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EncryptedUploadMethod;
import com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefitMedia;
import com.bytedance.android.livesdk.dataChannel.UpdateGiftListEvent;
import com.bytedance.android.livesdk.effect.StickerMessageManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.service.model.GiftListExtra;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public class IDuS76S0200000_5 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Object> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            case 4:
                subscribe$4(this, interfaceC73573Su9);
                return;
            case 5:
                subscribe$5(this, interfaceC73573Su9);
                return;
            case 6:
                subscribe$6(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS76S0200000_5 iDuS76S0200000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        List list;
        if (LivePrefetchGiftImageSetting.INSTANCE.getValue() && (list = (List) iDuS76S0200000_5.l0) != null && (!list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<Gift> list2 = ((GiftPage) it.next()).gifts;
                if (list2 != null && (!list2.isEmpty())) {
                    Iterator<Gift> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C30760C5k.LJFF(it2.next().image);
                    }
                }
            }
        }
        ((TryModeBroadcastFragment) iDuS76S0200000_5.l1).LJIIL().qv0(UpdateGiftListEvent.class, (List) iDuS76S0200000_5.l0);
    }

    public static final void subscribe$1(IDuS76S0200000_5 iDuS76S0200000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        String str;
        EncryptedUploadMethod encryptedUploadMethod = (EncryptedUploadMethod) iDuS76S0200000_5.l0;
        Uri uri = (Uri) iDuS76S0200000_5.l1;
        encryptedUploadMethod.getClass();
        try {
            Context context = encryptedUploadMethod.LJLILLLLZI.getContext();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(context, uri);
            str = "";
            if (BitmapUtils.saveBitmapToSD(mediaMetadataRetriever.getFrameAtTime(), encryptedUploadMethod.LJLJI, "firstFrame.temp")) {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(encryptedUploadMethod.LJLJI);
                    LIZ.append(File.separator);
                    LIZ.append("firstFrame.temp");
                    str = X1D.LIZIZ(LIZ);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            str = null;
        }
        interfaceC73573Su9.onNext(str);
    }

    public static final void subscribe$2(IDuS76S0200000_5 iDuS76S0200000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        C30091BrT c30091BrT = (C30091BrT) iDuS76S0200000_5.l0;
        List list = (List) iDuS76S0200000_5.l1;
        c30091BrT.getClass();
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<Gift> list2 = ((GiftPage) it.next()).gifts;
                if (list2 != null && list2.size() > 0) {
                    Iterator<Gift> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ImageModel imageModel = it2.next().image;
                        if (imageModel != null) {
                            C30760C5k.LJFF(imageModel);
                        }
                    }
                    if (c30091BrT.LIZ.getView() != null) {
                        c30091BrT.LIZ.getView().post(new ARunnableS10S0101000_6(0, c30091BrT, 2));
                    }
                }
            }
        }
    }

    public static final void subscribe$3(IDuS76S0200000_5 iDuS76S0200000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        String str = ((BZ3) iDuS76S0200000_5.l0).LIZ;
        if (str == null || str.length() == 0 || C38354F3m.LIZJ(((BZ3) iDuS76S0200000_5.l0).LIZ, "ao")) {
            interfaceC73573Su9.tryOnError(new Exception("current is ao"));
            return;
        }
        C0NB.LIZIZ("SwitchResolutionHelper", "switchNormal:start");
        B35 b35 = (B35) iDuS76S0200000_5.l1;
        BZ3 bz3 = (BZ3) iDuS76S0200000_5.l0;
        b35.switchResolution(bz3.LIZ, new BZ9((C73433Srt) interfaceC73573Su9, bz3));
    }

    public static final void subscribe$4(IDuS76S0200000_5 iDuS76S0200000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        interfaceC73573Su9.onNext(StickerMessageManager.getStickerEffectMessage((GiftMessage) iDuS76S0200000_5.l0, (InterfaceC31995Ch5) iDuS76S0200000_5.l1));
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$5(IDuS76S0200000_5 iDuS76S0200000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        T t = ((BaseResponse) iDuS76S0200000_5.l0).data;
        Object value = ((UW7) iDuS76S0200000_5.l1).LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-gson>(...)");
        interfaceC73573Su9.onNext(new C15070iV(t, GsonProtectorUtils.toJson((Gson) value, ((BaseResponse) iDuS76S0200000_5.l0).data)));
    }

    public static final void subscribe$6(IDuS76S0200000_5 iDuS76S0200000_5, InterfaceC73573Su9 interfaceC73573Su9) {
        List<SubCustomizedBenefit> list;
        SubCustomizedBenefit subCustomizedBenefit;
        int LIZ;
        String str;
        ImageModel imageModel;
        ArrayList arrayList = new ArrayList();
        GetSubPrivilegeDetailResponse.Data data = ((CDG) iDuS76S0200000_5.l0).LJLJI;
        if (data != null && (list = data.customizedBenefits) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (SubCustomizedBenefit subCustomizedBenefit2 : list) {
                if (subCustomizedBenefit2.benefitType != 2) {
                    arrayList2.add(subCustomizedBenefit2);
                }
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                if (arrayList2 != null && (subCustomizedBenefit = (SubCustomizedBenefit) ORZ.LJLLLLLL(i, arrayList2)) != null) {
                    Context context = ((CDE) iDuS76S0200000_5.l1).LJLIL.getContext();
                    o.LJIIIIZZ(context, "parent.context");
                    C28291B8l c28291B8l = new C28291B8l(context, null, 6, 0);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    if (i == 0) {
                        LIZ = 0;
                    } else {
                        LIZ = C15380j0.LIZ(16.0f);
                    }
                    layoutParams.topMargin = LIZ;
                    c28291B8l.setLayoutParams(layoutParams);
                    SubCustomizedBenefitMedia subCustomizedBenefitMedia = subCustomizedBenefit.benefitMedia;
                    String str2 = "";
                    if (subCustomizedBenefitMedia == null || (str = subCustomizedBenefitMedia.title) == null) {
                        str = "";
                        if (subCustomizedBenefitMedia == null) {
                            imageModel = null;
                            c28291B8l.getTitle().setText(str);
                            c28291B8l.getSubtitle().setText(str2);
                            C15650jR.LIZ().LJIIIZ(imageModel).LJIIJJI(c28291B8l.getIcon());
                            arrayList.add(c28291B8l);
                        }
                    }
                    String str3 = subCustomizedBenefitMedia.content;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    imageModel = subCustomizedBenefitMedia.iconImg;
                    c28291B8l.getTitle().setText(str);
                    c28291B8l.getSubtitle().setText(str2);
                    C15650jR.LIZ().LJIIIZ(imageModel).LJIIJJI(c28291B8l.getIcon());
                    arrayList.add(c28291B8l);
                }
            }
        }
        interfaceC73573Su9.onNext(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDuS76S0200000_5(Object obj, BaseResponse<GiftListResult, GiftListExtra> baseResponse, UW7 uw7) {
        this.$t = uw7;
        this.l0 = obj;
        this.l1 = baseResponse;
    }
}
