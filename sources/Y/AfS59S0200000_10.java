package Y;

import X.A72;
import X.ActivityC45651qj;
import X.C109544Rq;
import X.C1DJ;
import X.C31F;
import X.C31G;
import X.C34B;
import X.C47261Igj;
import X.C5S1;
import X.C60106NiQ;
import X.C61752OLk;
import X.C61878OQg;
import X.C62853Old;
import X.C63164Oqe;
import X.C68322mC;
import X.C72818Shy;
import X.C76052yf;
import X.C79081V1x;
import X.C84913XUf;
import X.EF7;
import X.EnumC61085NyD;
import X.EnumC79091V2h;
import X.F15;
import X.InterfaceC60761Nsz;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC92693kP;
import X.JHI;
import X.NNT;
import X.NO3;
import X.NO4;
import X.ON8;
import X.ONW;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.log.PdpLogHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BABCRemoveMe;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.PublicResourceResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.SingleResourceRefreshResp;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AfS59S0200000_10 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            ((InterfaceC65784Pro) afS59S0200000_10.l0).invoke();
        } else {
            ((InterfaceC65784Pro) afS59S0200000_10.l1).invoke();
        }
    }

    public static final void accept$1(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        IconTypeComponent iconTypeComponent;
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent;
        IconTypeComponent iconTypeComponent2;
        ImageComponent imageComponent;
        QuotePicturePreviewComponent quotePicturePreviewComponent;
        PublicResourceResponse publicResourceResponse = (PublicResourceResponse) obj;
        C62853Old c62853Old = (C62853Old) afS59S0200000_10.l0;
        Map map = (Map) afS59S0200000_10.l1;
        c62853Old.getClass();
        ArrayList arrayList = new ArrayList();
        if (publicResourceResponse != null && publicResourceResponse.singleResourceRefreshRespList != null) {
            for (SingleResourceRefreshResp singleResourceRefreshResp : publicResourceResponse.singleResourceRefreshRespList) {
                Long l = singleResourceRefreshResp.resId;
                if (l == null || singleResourceRefreshResp.ttl == null || (singleResourceRefreshResp.urlList == null && singleResourceRefreshResp.fallbackIconType == null)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("refresh res has null value in the result , ");
                    LIZ.append(singleResourceRefreshResp);
                    C34B.LIZIZ("MessageRefreshLooper", X1D.LIZIZ(LIZ));
                } else {
                    List<C109544Rq> list = (List) map.get(l);
                    if (list != null) {
                        for (C109544Rq c109544Rq : list) {
                            Object LJIIL = C1DJ.LJIIL(c109544Rq);
                            if (LJIIL instanceof AwemeCardTemplate) {
                                Integer num = singleResourceRefreshResp.fallbackIconType;
                                if (num == null || (iconTypeComponent2 = C79081V1x.LJJIL(EnumC79091V2h.fromValue(num.intValue()))) == null) {
                                    iconTypeComponent2 = IconTypeComponent.DEFAULT;
                                }
                                AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) LJIIL;
                                ImageComponent imageComponent2 = awemeCardTemplate.baseVideoComponent.coverImage;
                                if (imageComponent2 != null) {
                                    List list2 = singleResourceRefreshResp.urlList;
                                    if (list2 == null) {
                                        list2 = C61878OQg.INSTANCE;
                                    }
                                    imageComponent = ImageComponent.LIZ(imageComponent2, list2, iconTypeComponent2, 30);
                                } else {
                                    List list3 = singleResourceRefreshResp.urlList;
                                    if (list3 == null) {
                                        list3 = C61878OQg.INSTANCE;
                                    }
                                    imageComponent = new ImageComponent(list3, (String) null, (ResolutionComponent) null, (String) null, iconTypeComponent2, 30);
                                }
                                VideoCoverComponent videoCoverComponent = awemeCardTemplate.baseVideoComponent;
                                String id = videoCoverComponent.id;
                                String str = videoCoverComponent.videoModel;
                                VideoCoverType videoCoverType = videoCoverComponent.videoCoverType;
                                ImageComponent imageComponent3 = videoCoverComponent.overlay;
                                ActionLinkComponent linkComponent = videoCoverComponent.linkComponent;
                                ResolutionComponent resolutionComponent = videoCoverComponent.resolutionComponent;
                                o.LJIIIZ(id, "id");
                                o.LJIIIZ(videoCoverType, "videoCoverType");
                                o.LJIIIZ(linkComponent, "linkComponent");
                                VideoCoverComponent videoCoverComponent2 = new VideoCoverComponent(imageComponent, id, str, videoCoverType, imageComponent3, linkComponent, resolutionComponent);
                                PreviewHintComponent LLZLL = awemeCardTemplate.LLZLL();
                                QuotePicturePreviewComponent quotePicturePreviewComponent2 = awemeCardTemplate.LLZLL().quotePicturePreview;
                                if (quotePicturePreviewComponent2 != null) {
                                    quotePicturePreviewComponent = new QuotePicturePreviewComponent(quotePicturePreviewComponent2.resourceId, quotePicturePreviewComponent2.senderUid, imageComponent, iconTypeComponent2, quotePicturePreviewComponent2.quotePreviewIcon, quotePicturePreviewComponent2.linkInfo, quotePicturePreviewComponent2.ttl);
                                } else {
                                    quotePicturePreviewComponent = null;
                                }
                                TextComponent senderPreviewText = LLZLL.senderPreviewText;
                                TextComponent receiverPreviewText = LLZLL.receiverPreviewText;
                                TextComponent quotePreviewText = LLZLL.quotePreviewText;
                                QuotePreviewTypeComponent quotePreviewTypeComponent = LLZLL.quotePreviewType;
                                o.LJIIIZ(senderPreviewText, "senderPreviewText");
                                o.LJIIIZ(receiverPreviewText, "receiverPreviewText");
                                o.LJIIIZ(quotePreviewText, "quotePreviewText");
                                PreviewHintComponent previewHintComponent = new PreviewHintComponent(senderPreviewText, receiverPreviewText, quotePreviewText, quotePreviewTypeComponent, quotePicturePreviewComponent);
                                VideoCardFallbackInfoComponent videoCardFallbackInfoComponent = awemeCardTemplate.fallbackInfo;
                                ImageComponent LIZ2 = ImageComponent.LIZ(videoCardFallbackInfoComponent.image, null, iconTypeComponent2, 31);
                                TextComponent text = videoCardFallbackInfoComponent.text;
                                ActionLinkComponent linkInfo = videoCardFallbackInfoComponent.linkInfo;
                                o.LJIIIZ(text, "text");
                                o.LJIIIZ(linkInfo, "linkInfo");
                                c109544Rq.setContentPB(AwemeCardTemplate.LIZ(awemeCardTemplate, videoCoverComponent2, new VideoCardFallbackInfoComponent(linkInfo, LIZ2, text), previewHintComponent, null, null, 52).encode());
                            } else if (LJIIL instanceof StickerTemplate) {
                                Integer num2 = singleResourceRefreshResp.fallbackIconType;
                                if (num2 == null || (iconTypeComponent = C79081V1x.LJJIL(EnumC79091V2h.fromValue(num2.intValue()))) == null) {
                                    iconTypeComponent = IconTypeComponent.DEFAULT;
                                }
                                StickerTemplate stickerTemplate = (StickerTemplate) LJIIL;
                                ImageComponent imageComponent4 = stickerTemplate.imageComponent;
                                List list4 = singleResourceRefreshResp.urlList;
                                if (list4 == null) {
                                    list4 = C61878OQg.INSTANCE;
                                }
                                ImageComponent LIZ3 = ImageComponent.LIZ(imageComponent4, list4, iconTypeComponent, 30);
                                if (singleResourceRefreshResp.urlList != null) {
                                    StickerCardFallbackInfoComponent.Companion.getClass();
                                    stickerCardFallbackInfoComponent = StickerCardFallbackInfoComponent.EMPTY_FALLBACK;
                                } else {
                                    stickerCardFallbackInfoComponent = new StickerCardFallbackInfoComponent(ImageComponent.LIZ(stickerTemplate.fallbackInfo.placeholder, null, iconTypeComponent, 31));
                                }
                                c109544Rq.setContentPB(StickerTemplate.LIZ(stickerTemplate, LIZ3, stickerCardFallbackInfoComponent, null, null, null, 60).encode());
                            }
                            c109544Rq.addLocalExt("a:refreshed_res_ttl", singleResourceRefreshResp.ttl.toString());
                            arrayList.add(c109544Rq);
                        }
                    }
                }
            }
        }
        C31F.LIZ.getClass();
        C31G.LIZ();
        C63164Oqe.LJI(arrayList);
        ((C62853Old) afS59S0200000_10.l0).LIZLLL().LIZ();
        ((C62853Old) afS59S0200000_10.l0).LJIIJ.set(false);
    }

    public static final void accept$10(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        NO4 no4;
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        if (!((Boolean) obj).booleanValue() && (no4 = (NO4) afS59S0200000_10.l0) != null) {
            Aweme LJI = NO3.LJI();
            String str2 = null;
            if (LJI == null || (awemeRawAd2 = LJI.getAwemeRawAd()) == null || (str = awemeRawAd2.getCreativeIdStr()) == null) {
                str = "";
            }
            Aweme LJI2 = NO3.LJI();
            if (LJI2 != null && (awemeRawAd = LJI2.getAwemeRawAd()) != null) {
                str2 = awemeRawAd.getLogExtra();
            }
            no4.LIZ(str, str2, NNT.LIZ(Integer.valueOf(JHI.LIZ().LJIIIIZZ)), ((NO3) afS59S0200000_10.l1).LIZLLL().LIZIZ.LIZ);
        }
    }

    public static final void accept$2(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        C62853Old c62853Old = (C62853Old) afS59S0200000_10.l0;
        List list = (List) afS59S0200000_10.l1;
        c62853Old.getClass();
        C62853Old.LJ(list, false);
        ((C62853Old) afS59S0200000_10.l0).LJIIJ.set(false);
    }

    public static final void accept$3(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        boolean z;
        String str;
        Resources resources;
        String str2;
        BABCRemoveMe bABCRemoveMe = (BABCRemoveMe) obj;
        if (bABCRemoveMe != null && bABCRemoveMe.getStatusCode() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str3 = null;
        if (!z) {
            if (bABCRemoveMe != null) {
                str2 = bABCRemoveMe.getStatusMsg();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C60106NiQ.LJ((Context) afS59S0200000_10.l0);
                C60106NiQ.LIZJ((Aweme) afS59S0200000_10.l1, false);
                return;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme aweme = (Aweme) afS59S0200000_10.l1;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        linkedHashMap.put("itemId", str);
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentThreadTimeMillis, F15.LIZLLL(linkedHashMap), "onBCVideoRemoveTag"));
        C60106NiQ.LIZJ((Aweme) afS59S0200000_10.l1, true);
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        Context context = (Context) afS59S0200000_10.l0;
        if (context != null && (resources = context.getResources()) != null) {
            str3 = resources.getString(R.string.c4o);
        }
        c5s1.LIZLLL(str3);
        c5s1.LJ();
        Activity LJFF = C60106NiQ.LJFF((Context) afS59S0200000_10.l0);
        if (LJFF == null) {
            return;
        }
        LJFF.finish();
    }

    public static final void accept$4(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        C60106NiQ.LJ((Context) afS59S0200000_10.l0);
        C60106NiQ.LIZJ((Aweme) afS59S0200000_10.l1, false);
    }

    public static final void accept$5(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        MusicModel musicModel;
        C84913XUf c84913XUf = ((MusicShootAssem) afS59S0200000_10.l0).LLIFFJFJJ;
        if (c84913XUf != null) {
            Music music = ((MusicDetail) afS59S0200000_10.l1).music;
            if (music != null) {
                musicModel = music.convertToMusicModel();
            } else {
                musicModel = null;
            }
            c84913XUf.LIZJ(musicModel, ((MusicShootAssem) afS59S0200000_10.l0).W3(), true, false, ((MusicShootAssem) afS59S0200000_10.l0).a4(), false, false);
        }
    }

    public static final void accept$6(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        EnumC61085NyD enumC61085NyD;
        Integer state = (Integer) obj;
        InterfaceC60761Nsz interfaceC60761Nsz = (InterfaceC60761Nsz) afS59S0200000_10.l0;
        PdpLogHelper pdpLogHelper = (PdpLogHelper) afS59S0200000_10.l1;
        JSONObject jSONObject = new JSONObject();
        o.LJIIIIZZ(state, "state");
        int intValue = state.intValue();
        pdpLogHelper.getClass();
        if (intValue != 3) {
            if (intValue != 4) {
                if (intValue != 5) {
                    enumC61085NyD = EnumC61085NyD.COLLAPSED;
                } else {
                    enumC61085NyD = EnumC61085NyD.HIDDEN;
                }
            } else {
                enumC61085NyD = EnumC61085NyD.COLLAPSED;
            }
        } else {
            enumC61085NyD = EnumC61085NyD.EXPANDED;
        }
        interfaceC60761Nsz.LJIIJ("onPageGlide", C47261Igj.LJJIJ(jSONObject.put("state", enumC61085NyD.getValue())));
    }

    public static final void accept$7(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        String str;
        ActivityC45651qj context;
        Resources resources;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) afS59S0200000_10.l0;
        slotViewModel.LL = 10000L;
        MutableLiveData<String> mutableLiveData = slotViewModel.LJLLJ;
        A72 a72 = ((C61752OLk) afS59S0200000_10.l1).LJLJL;
        if (a72 != null && (context = a72.getContext()) != null && (resources = context.getResources()) != null) {
            str = resources.getString(R.string.il);
        } else {
            str = null;
        }
        mutableLiveData.setValue(str);
    }

    public static final void accept$8(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        ((InterfaceC65784Pro) afS59S0200000_10.l0).invoke();
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((C68322mC) afS59S0200000_10.l1).element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static final void accept$9(AfS59S0200000_10 afS59S0200000_10, Object obj) {
        ((ON8) afS59S0200000_10.l0).LJIILLIIL((Option) afS59S0200000_10.l1);
        ONW onw = ((ON8) afS59S0200000_10.l0).LL;
        if (onw != null) {
            onw.notifyDataSetChanged();
        }
    }

    public AfS59S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
