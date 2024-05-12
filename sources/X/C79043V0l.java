package X;

import Y.ACListenerS27S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaMetadataRetriever;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LeadMessage;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.im.message.template.card.InfoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardContentComponent;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardTitleBarComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.V0l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79043V0l implements IDownloadSdkMonitorDepend, F22, InterfaceC59829Ndx, TNX {
    public static String LJLIL;

    @Override // X.TNX
    public void LIZLLL(Effect effect) {
    }

    @Override // X.F22
    public String getName() {
        return "viewAppeared";
    }

    @Override // X.F22
    public /* bridge */ /* synthetic */ Object getParams() {
        return null;
    }

    public static void LJJIIJZLJL() {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
        } else {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
    public String getAid() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(EF7.LJIIIZ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
    public String getAppVersionName() {
        return EF7.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
    public Context getContext() {
        return EF7.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
    public String getDeviceId() {
        return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
    public String getPackageName() {
        return EF7.LIZIZ().getPackageName();
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
    public long getUpdateVersionCode() {
        return EF7.LJFF();
    }

    public /* synthetic */ C79043V0l() {
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
    public String getChannel() {
        return EF7.LJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
    public String[] getMonitorHosts() {
        return C79044V0m.LIZ;
    }

    public static String LJFF(android.net.Uri getCDN) {
        o.LJIIJ(getCDN, "$this$getCDN");
        String LJIJJ = LJIJJ(getCDN, "surl");
        if (LJIJJ != null) {
            return LJIJJ;
        }
        return LJIJJ(getCDN, "url");
    }

    public static final Activity LJI(AbstractC37594EpC abstractC37594EpC) {
        Context context;
        o.LJIIIZ(abstractC37594EpC, "<this>");
        InterfaceC38263Ezz interfaceC38263Ezz = abstractC37594EpC.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        return C37925EuX.LIZ(context);
    }

    public static final long LJII(double d) {
        return LJIJ((float) d, 4294967296L);
    }

    public static final long LJIIIIZZ(int i) {
        return LJIJ(i, 4294967296L);
    }

    public static final WebKitView LJIIIZ(SparkContext sparkContext) {
        C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
        String str = sparkContext.containerId;
        c31999Ch9.getClass();
        InterfaceC60761Nsz LIZIZ = C31999Ch9.LIZIZ(str);
        if (LIZIZ != null && (LIZIZ instanceof WebKitView)) {
            return (WebKitView) LIZIZ;
        }
        return null;
    }

    public static final void LJIIJ(View view) {
        if (view != null && view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    public static final boolean LJIIJJI(User user) {
        AvatarMetaInfo avatarMeta;
        if (!C26356AWa.LIZ() || user == null || (avatarMeta = user.getAvatarMeta()) == null || avatarMeta.getAvatarSource() != EnumC26153AOf.AIGC_PROFILE.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILIIL(DMMediaModel dMMediaModel) {
        if (dMMediaModel.type == 2) {
            return true;
        }
        return false;
    }

    public static boolean LJIILJJIL(String str) {
        if (TextUtils.equals("from_follow_page", str) || TextUtils.equals("from_chat", str) || TextUtils.equals("from_chat_inner_cell", str) || TextUtils.equals("from_auto_message", str) || TextUtils.equals("from_launch_forward", str) || TextUtils.equals("from_forward_push", str) || TextUtils.equals("from_familiar_tab", str)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(long j) {
        if ((j & 1095216660480L) == 0) {
            return true;
        }
        return false;
    }

    public static final Long LJIJJLI(String safeToLong) {
        boolean z;
        o.LJIIJ(safeToLong, "$this$safeToLong");
        if (safeToLong.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return Long.valueOf(CastLongProtector.parseLong(safeToLong));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0006 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJIFFI(java.io.InputStream r7) {
        /*
            r6 = 0
            if (r7 != 0) goto Ld
        L3:
            r0 = r6
        L4:
            if (r0 != 0) goto L7
        L6:
            return r6
        L7:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            goto L6
        Ld:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r4]
        L16:
            r2 = 0
            int r1 = r7.read(r3, r2, r4)     // Catch: java.io.IOException -> L3
            r0 = -1
            if (r1 == r0) goto L22
            r5.write(r3, r2, r1)     // Catch: java.io.IOException -> L3
            goto L16
        L22:
            byte[] r0 = r5.toByteArray()     // Catch: java.io.IOException -> L3
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79043V0l.LJJIFFI(java.io.InputStream):java.lang.String");
    }

    public static boolean LJJII(String str) {
        if (TextUtils.equals("from_follow_page", str) || TextUtils.equals("from_search_mix", str) || TextUtils.equals("from_special_topic", str) || TextUtils.equals("from_commerce_banner", str) || TextUtils.equals("from_familiar_tab", str) || TextUtils.equals("from_search_compilation", str) || TextUtils.equals("from_search_ad_no_request", str) || TextUtils.equals("from_mix_video", str) || TextUtils.equals("from_search_jedi", str) || TextUtils.equals("from_trending_inflow", str) || TextUtils.equals("from_search_continuous_play_card", str) || TextUtils.equals("from_search", str) || TextUtils.equals("from_search_playlist", str) || TextUtils.equals("from_search_official_card", str) || TextUtils.equals("from_search_activity", str)) {
            return true;
        }
        return false;
    }

    public static final InfoCardTemplate LJJIII(C79132V3w c79132V3w) {
        TextComponent LIZ;
        TextComponent LIZ2;
        ImageComponent LIZ3;
        InfoCardContentComponent infoCardContentComponent;
        VideoCoverComponent videoCoverComponent;
        ActionLinkComponent actionLinkComponent;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        CardButtonType cardButtonType;
        RUF ruf;
        V4Z v4z = c79132V3w.title;
        if (v4z == null || (ruf = v4z.title) == null || (LIZ = C17N.LJJL(ruf)) == null) {
            TextComponent.Companion.getClass();
            LIZ = C79109V2z.LIZ();
        }
        V4Z title = c79132V3w.title;
        o.LJIIIIZZ(title, "title");
        RUF ruf2 = title.title;
        if (ruf2 == null || (LIZ2 = C17N.LJJL(ruf2)) == null) {
            TextComponent.Companion.getClass();
            LIZ2 = C79109V2z.LIZ();
        }
        C79135V3z c79135V3z = title.image;
        if (c79135V3z != null) {
            LIZ3 = C79081V1x.LJJIZ(c79135V3z);
        } else {
            ImageComponent.Companion.getClass();
            LIZ3 = C79095V2l.LIZ();
        }
        InfoCardTitleBarComponent infoCardTitleBarComponent = new InfoCardTitleBarComponent(LIZ2, LIZ3);
        RUV ruv = c79132V3w.content;
        if (ruv != null) {
            RUF description = ruv.description;
            o.LJIIIIZZ(description, "description");
            TextComponent LJJL = C17N.LJJL(description);
            if (LJJL == null) {
                TextComponent.Companion.getClass();
                LJJL = C79109V2z.LIZ();
            }
            List<RUF> contents = ruv.contents;
            o.LJIIIIZZ(contents, "contents");
            ArrayList arrayList = new ArrayList(C32I.LJJL(contents, 10));
            for (RUF it : contents) {
                o.LJIIIIZZ(it, "it");
                TextComponent LJJL2 = C17N.LJJL(it);
                if (LJJL2 == null) {
                    TextComponent.Companion.getClass();
                    LJJL2 = C79109V2z.LIZ();
                }
                arrayList.add(LJJL2);
            }
            infoCardContentComponent = new InfoCardContentComponent(LJJL, arrayList);
        } else {
            infoCardContentComponent = null;
        }
        V43 v43 = c79132V3w.video;
        if (v43 != null) {
            videoCoverComponent = V3N.LJJIJIIJIL(v43);
        } else {
            videoCoverComponent = null;
        }
        List<V4N> buttons = c79132V3w.buttons;
        o.LJIIIIZZ(buttons, "buttons");
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(buttons, 10));
        for (V4N it2 : buttons) {
            o.LJIIIIZZ(it2, "it");
            RUF text = it2.text;
            o.LJIIIIZZ(text, "text");
            TextComponent LJJL3 = C17N.LJJL(text);
            if (LJJL3 == null) {
                TextComponent.Companion.getClass();
                LJJL3 = C79109V2z.LIZ();
            }
            C63714OzW link = it2.link;
            o.LJIIIIZZ(link, "link");
            ActionLinkComponent LJJIIZI = C62814Ol0.LJJIIZI(link);
            V3D v3d = it2.type;
            if (v3d != null) {
                CardButtonType[] values = CardButtonType.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        cardButtonType = values[i];
                        if (cardButtonType.getValue() == v3d.getValue()) {
                            break;
                        }
                        i++;
                    } else {
                        cardButtonType = CardButtonType.DEFAULT;
                        if (cardButtonType != null) {
                        }
                    }
                }
            }
            cardButtonType = CardButtonType.DEFAULT;
            arrayList2.add(new InfoCardButtonComponent(LJJL3, LJJIIZI, cardButtonType, 2));
        }
        C63714OzW c63714OzW = c79132V3w.link_info;
        if (c63714OzW != null) {
            actionLinkComponent = C62814Ol0.LJJIIZI(c63714OzW);
        } else {
            actionLinkComponent = null;
        }
        PreviewHintComponent previewHintComponent = new PreviewHintComponent(LIZ, LIZ, LIZ);
        RU2 ru2 = c79132V3w.req_base;
        if (ru2 != null) {
            baseRequestComponent = C62819Ol5.LJJIIJZLJL(ru2);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        RUB rub = c79132V3w.resp_base;
        if (rub != null) {
            baseResponseComponent = C69648RVc.LIZJ(rub);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        return new InfoCardTemplate(infoCardTitleBarComponent, infoCardContentComponent, videoCoverComponent, arrayList2, actionLinkComponent, previewHintComponent, baseResponseComponent, baseRequestComponent);
    }

    public static final C70357RjN LJJIIJ(LogisticDTO logisticDTO) {
        String str;
        String str2;
        String str3;
        float f;
        Float LJJIJLIJ;
        Float LJJIJLIJ2;
        LeadMessage leadMessage;
        LogisticTextDTO logisticTextDTO = logisticDTO.logisticText;
        String str4 = null;
        if (logisticTextDTO != null && (leadMessage = logisticTextDTO.leadMessage) != null) {
            str = leadMessage.fromOverseas;
        } else {
            str = null;
        }
        if (str != null && str.length() > 0) {
            str2 = "overseas";
        } else {
            str2 = "local";
        }
        java.util.Map<String, String> map = logisticDTO.eventTrackInfo;
        if (map != null) {
            str3 = map.get("shipping_type");
        } else {
            str3 = null;
        }
        Object obj = logisticDTO.deliveryMinDays;
        if (obj == null) {
            java.util.Map<String, String> map2 = logisticDTO.eventTrackInfo;
            if (map2 != null) {
                obj = map2.get("est_delivery_day_min");
            } else {
                obj = null;
            }
        }
        Object obj2 = logisticDTO.deliveryMaxDays;
        if (obj2 == null) {
            java.util.Map<String, String> map3 = logisticDTO.eventTrackInfo;
            if (map3 != null) {
                obj2 = map3.get("est_delivery_day_max");
            } else {
                obj2 = null;
            }
        }
        String str5 = logisticDTO.originShippingVal;
        Price price = logisticDTO.shippingFee;
        if (price != null) {
            str4 = price.getPriceVal();
        }
        String LJI = C27739Aud.LJI(C113554cx.LJJL(new OSZ("shipping_from", str2), new OSZ("shipping_type", str3), new OSZ("est_delivery_day_min", obj), new OSZ("est_delivery_day_max", obj2)));
        float f2 = 0.0f;
        if (str5 != null && (LJJIJLIJ2 = C38350F3i.LJJIJLIJ(str5)) != null) {
            f = LJJIJLIJ2.floatValue();
        } else {
            f = 0.0f;
        }
        Float valueOf = Float.valueOf(f);
        if (str4 != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(str4)) != null) {
            f2 = LJJIJLIJ.floatValue();
        }
        return new C70357RjN(valueOf, Float.valueOf(f2), LJI);
    }

    public static final void LJJIIZI(View view) {
        if (view != null && view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public static final C0SX LIZ(float f, long j) {
        return new C0SX(f, new C32691Qb(j));
    }

    public static final float LIZIZ(Context context, float f) {
        o.LJIIIZ(context, "context");
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static final void LIZJ(LifecycleOwner lifecycleOwner, InterfaceC88472Yns assemBuilder) {
        ActivityC45651qj activity;
        C8W0 c8w0;
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(assemBuilder, "assemBuilder");
        if (lifecycleOwner instanceof C8W0) {
            activity = C212428Vi.LIZ(lifecycleOwner);
            if (activity == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("can not find activity for ");
                LIZ.append(lifecycleOwner);
                String LIZIZ = X1D.LIZIZ(LIZ);
                LIZIZ.toString();
                throw new IllegalArgumentException(LIZIZ);
            }
        } else if (lifecycleOwner instanceof Fragment) {
            activity = ((Fragment) lifecycleOwner).requireActivity();
            o.LJIIIIZZ(activity, "requireActivity()");
        } else if (lifecycleOwner instanceof ActivityC45651qj) {
            activity = (ActivityC45651qj) lifecycleOwner;
        } else if (lifecycleOwner instanceof C8VZ) {
            activity = ((C8VZ) lifecycleOwner).getActivity();
            if (activity == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("can not find activity for ");
                LIZ2.append(lifecycleOwner);
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                LIZIZ2.toString();
                throw new IllegalArgumentException(LIZIZ2);
            }
        } else {
            throw new IllegalArgumentException();
        }
        AssemSupervisor lv0 = C7EG.LIZ(activity).lv0(lifecycleOwner);
        if (lv0 != null) {
            C7TM c7tm = new C7TM();
            assemBuilder.invoke(c7tm);
            Iterator<C8W0> it = lv0.LJLLI.iterator();
            while (true) {
                if (it.hasNext()) {
                    c8w0 = it.next();
                    C8W0 c8w02 = c8w0;
                    if ((c8w02 instanceof DynamicAssem) && o.LJ(C65352Pkq.LIZ(c8w02.getClass()), c7tm.LIZJ()) && ((UISlotAssem) c8w02).LJLIL == c7tm.LJI) {
                        break;
                    }
                } else {
                    c8w0 = null;
                    break;
                }
            }
            DynamicAssem dynamicAssem = (DynamicAssem) c8w0;
            if (dynamicAssem == null) {
                lv0.LJI(c7tm.build(), null);
                lv0.LIZ(null);
            } else {
                C8VL config = dynamicAssem.getConfig();
                dynamicAssem.setConfig(c7tm);
                dynamicAssem.didUpdateConfig(config);
            }
        }
    }

    public static final Object LJ(String key, List list) {
        Object obj;
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(key, "key");
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((C27021Aj3) obj).LIZ.key, key)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C27021Aj3 c27021Aj3 = (C27021Aj3) obj;
        if (c27021Aj3 == null) {
            return null;
        }
        return c27021Aj3.LIZIZ;
    }

    public static final int LJIIL(Context context, String str) {
        o.LJIIIZ(context, "context");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        C152275yJ.LIZ.getClass();
        if (!C152275yJ.LJFF(context, str)) {
            return 0;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C152275yJ.LIZIZ(context, options, str);
        return options.outWidth * options.outHeight;
    }

    public static final C1HY LJIIZILJ(InterfaceC88472Yns restore, InterfaceC88471Ynr save) {
        o.LJIIIZ(save, "save");
        o.LJIIIZ(restore, "restore");
        IDqS443S0100000 iDqS443S0100000 = new IDqS443S0100000(save, (InterfaceC88471Ynr<? super C0MK, Object, ? extends List<Object>>) 11);
        C65777Prh.LJ(1, restore);
        return C0MJ.LIZ(restore, iDqS443S0100000);
    }

    public static final long LJIJ(float f, long j) {
        return j | (Float.floatToIntBits(f) & 4294967295L);
    }

    public static final String LJIJJ(android.net.Uri safeGetQueryParameter, String key) {
        o.LJIIJ(safeGetQueryParameter, "$this$safeGetQueryParameter");
        o.LJIIJ(key, "key");
        try {
            return UriProtector.getQueryParameter(safeGetQueryParameter, key);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void LJIL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = i;
        }
        view.requestLayout();
    }

    public static final void LJJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final boolean LJJI(User user, UrlModel urlModel) {
        List<String> list;
        o.LJIIIZ(user, "<this>");
        if (urlModel != null) {
            list = urlModel.getUrlList();
        } else {
            list = null;
        }
        if (list == null || list.isEmpty() || !LJIIJJI(user)) {
            return false;
        }
        return true;
    }

    public static final int LJJIIZ(Context context, String str) {
        int parseInt;
        o.LJIIIZ(context, "context");
        int i = 0;
        if (str != null && !TextUtils.isEmpty(str)) {
            C152275yJ.LIZ.getClass();
            MediaMetadataRetriever LJ = C152275yJ.LJ(context, str);
            try {
                try {
                    if (C152275yJ.LJI(str)) {
                        LJ.setDataSource(context, android.net.Uri.parse(str));
                    } else {
                        LJ.setDataSource(str);
                    }
                    String extractMetadata = LJ.extractMetadata(18);
                    String extractMetadata2 = LJ.extractMetadata(19);
                    if (extractMetadata != null) {
                        parseInt = Integer.parseInt(extractMetadata);
                    } else {
                        parseInt = 0;
                    }
                    if (extractMetadata2 != null) {
                        i = Integer.parseInt(extractMetadata2);
                    }
                    int i2 = parseInt * i;
                    try {
                        LJ.release();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    return i2;
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            } catch (Exception unused) {
                LJ.release();
            } catch (Throwable th) {
                try {
                    LJ.release();
                } catch (Exception e3) {
                    C16880lQ.LLLLIIL(e3);
                }
                throw th;
            }
        }
        return i;
    }

    public static final long LJIILLIIL(float f, long j, long j2) {
        if (!LJIILL(j) && !LJIILL(j2)) {
            if (C23540wA.LIZ(C23520w8.LIZIZ(j), C23520w8.LIZIZ(j2))) {
                return LJIJ(C79146V4k.LJJJJLI(C23520w8.LIZJ(j), C23520w8.LIZJ(j2), f), 1095216660480L & j);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Cannot perform operation for ");
            LIZ.append((Object) C23540wA.LIZIZ(C23520w8.LIZIZ(j)));
            LIZ.append(" and ");
            LIZ.append((Object) C23540wA.LIZIZ(C23520w8.LIZIZ(j2)));
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
        "Cannot perform operation for Unspecified type.".toString();
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
    }

    public static void LJIJI(View view, float f, float f2, float f3, float f4) {
        GradientDrawable gradientDrawable;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        Drawable drawable = null;
        if (background != null) {
            drawable = background.mutate();
        }
        if (!(drawable instanceof GradientDrawable) || (gradientDrawable = (GradientDrawable) drawable) == null) {
            return;
        }
        gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
    }

    public /* synthetic */ C79043V0l(ACListenerS27S0100000_7 aCListenerS27S0100000_7, ActivityC45651qj activityC45651qj, InterfaceC82086WJm cameraApi, I3X i3x, ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr, AqS163S0100000_13 aqS163S0100000_13) {
        o.LJIIIZ(cameraApi, "cameraApi");
        viewOnTouchListenerC82377WUr.setRecordListener(new C82381WUv(aCListenerS27S0100000_7, activityC45651qj, cameraApi, i3x, viewOnTouchListenerC82377WUr, aqS163S0100000_13));
    }
}
