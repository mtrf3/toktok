package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.GetStrangerMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SendMessageP2PRequestBody;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.bytedance.im.core.proto.StrangerConversation;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.creative.model.audio.TTSExtraModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoCropData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BillingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1A7, reason: invalid class name */
/* loaded from: classes.dex */
public class C1A7 implements InterfaceC66992k3, F3J, InterfaceC73592SuS, InterfaceC60553Npd, InterfaceC170926nI, InterfaceC48038ItG, O0Z {
    public static boolean LJLIL = false;
    public static long LJLJJI = Long.MIN_VALUE;
    public static long LJLJJL = Long.MIN_VALUE;
    public static int LJLJJLL = 8;
    public static final C1A7 LJLILLLLZI = new C1A7();
    public static final C1A7 LJLJI = new C1A7();
    public static final C1A7 LJLJL = new C1A7();

    public static final float LJIILL(float f) {
        double d = f;
        if (d > 1.0d) {
            return 1.0f;
        }
        if (d < -1.0d) {
            return -1.0f;
        }
        return f;
    }

    @Override // X.O0Z
    public void onComplete() {
    }

    public static KUN LJIIL() {
        return LJIILLIIL(InterfaceC117094if.LIZ);
    }

    public static KUN LJIILIIL() {
        return LJIILLIIL("guide");
    }

    public static KUN LJIILJJIL() {
        return LJIILLIIL("music_sp");
    }

    public static KUN LJIIZILJ() {
        return LJIILLIIL("search");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f2, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.FileInputStream, java.io.File[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIZI() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A7.LJJIIZI():void");
    }

    @Override // X.F3J
    public void onSuccess() {
        File file = F3O.LIZ;
        if (file != null && file.exists()) {
            C16880lQ.LLLZZIL(F3O.LIZ);
        }
    }

    public static Throwable LJ(Throwable th) {
        if (th instanceof ExecutionException) {
            return th.getCause();
        }
        return th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final BillingAddressData LJFF(List list) {
        String str = null;
        BillingAddressData billingAddressData = new BillingAddressData(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PaymentElement paymentElement = (PaymentElement) it.next();
                String element = paymentElement.getElement();
                if (element != null) {
                    switch (element.hashCode()) {
                        case -1675358935:
                            if (!element.equals("eg_ccdc_global_billing_address_state")) {
                                break;
                            } else {
                                str = null;
                                billingAddressData = BillingAddressData.copy$default(billingAddressData, null, null, null, null, null, paymentElement.getParamValue(), null, 95, null);
                                break;
                            }
                        case -437890200:
                            if (!element.equals("eg_ccdc_global_billing_address_country_regin")) {
                                break;
                            } else {
                                billingAddressData = BillingAddressData.copy$default(billingAddressData, str, str, str, paymentElement.getParamValue(), str, str, str, 119, str);
                                break;
                            }
                        case -396027285:
                            if (!element.equals("eg_ccdc_global_billing_address_street")) {
                                break;
                            } else {
                                billingAddressData = BillingAddressData.copy$default(billingAddressData, paymentElement.getParamValue(), str, str, str, str, str, str, 126, str);
                                break;
                            }
                        case -304863367:
                            if (!element.equals("eg_ccdc_global_billing_address_postal_code")) {
                                break;
                            } else {
                                billingAddressData = BillingAddressData.copy$default(billingAddressData, str, str, str, str, paymentElement.getParamValue(), str, str, 111, str);
                                break;
                            }
                        case -193077805:
                            if (!element.equals("eg_ccdc_global_billing_address_city")) {
                                break;
                            } else {
                                billingAddressData = BillingAddressData.copy$default(billingAddressData, str, paymentElement.getParamValue(), str, str, str, str, str, 125, str);
                                break;
                            }
                    }
                }
            }
        }
        return billingAddressData;
    }

    public static final String LJI(TTSExtraModel tTSExtraModel) {
        try {
            String str = tTSExtraModel.extra;
            if (str != null) {
                String optString = new JSONObject(str).optString("creator_user_id", "");
                o.LJIIIIZZ(optString, "jsonObj.optString(\"creator_user_id\", \"\")");
                return optString;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String LJIIIIZZ(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i > 0 && '\n' == sb.charAt(sb.length() - 1)) {
                StringBuilder sb2 = new StringBuilder();
                int i3 = 0;
                do {
                    sb2.append("\t");
                    i3++;
                } while (i3 < i);
                sb.append(sb2.toString());
            }
            if (charAt != ',') {
                if (charAt != '[') {
                    if (charAt != ']') {
                        if (charAt != '{') {
                            if (charAt != '}') {
                                sb.append(charAt);
                            }
                        }
                    }
                    sb.append("\n");
                    i--;
                    StringBuilder sb3 = new StringBuilder();
                    for (int i4 = 0; i4 < i; i4++) {
                        sb3.append("\t");
                    }
                    sb.append(sb3.toString());
                    sb.append(charAt);
                }
                sb.append(charAt);
                sb.append("\n");
                i++;
            } else {
                sb.append(charAt);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static final String LJIIIZ(TTSExtraModel tTSExtraModel) {
        try {
            String str = tTSExtraModel.extra;
            if (str != null) {
                String optString = new JSONObject(str).optString("from_tag");
                o.LJIIIIZZ(optString, "jsonObj.optString(\"from_tag\")");
                return optString;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static C38333F2r LJIIJ(Exception exc) {
        if (exc instanceof C38333F2r) {
            return (C38333F2r) exc;
        }
        Throwable cause = exc.getCause();
        if (cause instanceof C38333F2r) {
            return (C38333F2r) cause;
        }
        return null;
    }

    public static final float LJIIJJI(Video2StickerModel video2StickerModel) {
        o.LJIIIZ(video2StickerModel, "<this>");
        return C144025l0.LIZJ(video2StickerModel.videoCropData.cropRatioMode);
    }

    public static KUN LJIILLIIL(String str) {
        return C9NH.LIZ(EF7.LIZIZ(), str);
    }

    public static void LJIL(m mVar) {
        m LJJIJIL;
        try {
            if (mVar.LJJIJLIJ("reference_info") && (LJJIJIL = mVar.LJJIJIL("reference_info")) != null) {
                LJJIJIL.LJJIIZ("hint", "");
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static Object LJJ(Object obj) {
        Response response;
        ResponseBody responseBody;
        MessageInfo messageInfo;
        List<MessageInfo> list;
        List<ConversationRecentMessage> list2;
        List<StrangerConversation> list3;
        List<MessageBody> list4;
        g LJJIJIIJI;
        List<MessageBody> list5;
        List<MessageBody> list6;
        List<MessageBody> list7;
        MessageBody messageBody;
        m LJJIJIL;
        if (obj == null) {
            return "";
        }
        Gson gson = C63682Oz0.LIZ;
        String json = GsonProtectorUtils.toJson(gson, obj);
        if (!C63308Osy.LJI().LIZLLL().LIZLLL) {
            return json;
        }
        if (obj instanceof Request) {
            Request request = (Request) obj;
            m mVar = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
            mVar.LJJJ("channel");
            mVar.LJJJ("device_id");
            mVar.LJJJ("device_platform");
            mVar.LJJJ("device_type");
            mVar.LJJJ("os_version");
            mVar.LJJJ("token");
            m LJJIJIL2 = mVar.LJJIJIL("token_info");
            if (LJJIJIL2 != null) {
                LJJIJIL2.LJJJ("app_id");
            }
            RequestBody requestBody = request.body;
            if (requestBody != null) {
                SendMessageRequestBody sendMessageRequestBody = requestBody.send_message_body;
                if (sendMessageRequestBody != null && !TextUtils.isEmpty(sendMessageRequestBody.content)) {
                    m LJJIJIL3 = mVar.LJJIJIL("body").LJJIJIL("send_message_body");
                    LJJIJIL3.LJJIIZ("content", "");
                    ReferencedMessageInfo referencedMessageInfo = request.body.send_message_body.ref_msg_info;
                    if (referencedMessageInfo != null && !TextUtils.isEmpty(referencedMessageInfo.hint) && (LJJIJIL = LJJIJIL3.LJJIJIL("ref_msg_info")) != null) {
                        LJJIJIL.LJJIIZ("hint", "");
                    }
                    LJJIJIL3.LJJIIZ("content", "");
                    return mVar;
                }
                if (request.body.getExtension(EnumC63625Oy5.BROADCAST_SEND_MESSAGE.getValue()) != null) {
                    m LJJIJIL4 = mVar.LJJIJIL("body").LJJIJIL("extensionMsgs");
                    if (LJJIJIL4.LJJIJLIJ("BroadcastSendMessageRequestBody")) {
                        m LJJIJIL5 = LJJIJIL4.LJJIJIL("BroadcastSendMessageRequestBody");
                        if (LJJIJIL5.LJJIJLIJ("content")) {
                            LJJIJIL5.LJJIIZ("content", "");
                            return mVar;
                        }
                    }
                }
                SendMessageP2PRequestBody sendMessageP2PRequestBody = request.body.send_message_p2p_body;
                if (sendMessageP2PRequestBody != null && !TextUtils.isEmpty(sendMessageP2PRequestBody.content)) {
                    mVar.LJJIJIL("body").LJJIJIL("send_message_p2p_body").LJJIIZ("content", "");
                }
            }
            return mVar;
        }
        if ((obj instanceof Response) && (responseBody = (response = (Response) obj).body) != null) {
            NewMessageNotify newMessageNotify = responseBody.has_new_message_notify;
            if (newMessageNotify != null && (messageBody = newMessageNotify.message) != null && !TextUtils.isEmpty(messageBody.content)) {
                m mVar2 = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
                m LJJIJIL6 = mVar2.LJJIJIL("body").LJJIJIL("has_new_message_notify").LJJIJIL("message");
                LJJIJIL6.LJJIIZ("content", "");
                LJIL(LJJIJIL6);
                return mVar2;
            }
            MessagesPerUserResponseBody messagesPerUserResponseBody = response.body.messages_per_user_body;
            if (messagesPerUserResponseBody != null && (list7 = messagesPerUserResponseBody.messages) != null && !list7.isEmpty()) {
                m mVar3 = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
                Iterator<j> it = mVar3.LJJIJIL("body").LJJIJIL("messages_per_user_body").LJJIJIIJI("messages").iterator();
                while (it.hasNext()) {
                    m mVar4 = (m) it.next();
                    mVar4.LJJIIZ("content", "");
                    LJIL(mVar4);
                }
                return mVar3;
            }
            MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody = response.body.messages_per_user_init_v2_body;
            if (messagesPerUserInitV2ResponseBody != null && (list6 = messagesPerUserInitV2ResponseBody.messages) != null && !list6.isEmpty()) {
                m mVar5 = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
                Iterator<j> it2 = mVar5.LJJIJIL("body").LJJIJIL("messages_per_user_init_v2_body").LJJIJIIJI("messages").iterator();
                while (it2.hasNext()) {
                    m mVar6 = (m) it2.next();
                    mVar6.LJJIIZ("content", "");
                    LJIL(mVar6);
                }
                return mVar5;
            }
            MessagesInConversationResponseBody messagesInConversationResponseBody = response.body.messages_in_conversation_body;
            if (messagesInConversationResponseBody != null && (list5 = messagesInConversationResponseBody.messages) != null && !list5.isEmpty()) {
                m mVar7 = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
                Iterator<j> it3 = mVar7.LJJIJIL("body").LJJIJIL("messages_in_conversation_body").LJJIJIIJI("messages").iterator();
                while (it3.hasNext()) {
                    m mVar8 = (m) it3.next();
                    mVar8.LJJIIZ("content", "");
                    LJIL(mVar8);
                }
                return mVar7;
            }
            if (response.body.getExtension(EnumC63625Oy5.BROADCAST_SEND_MESSAGE.getValue()) != null) {
                m mVar9 = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
                m LJJIJIL7 = mVar9.LJJIJIL("body").LJJIJIL("extensionMsgs");
                if (LJJIJIL7.LJJIJLIJ("BroadcastSendMessageResponseBody")) {
                    m LJJIJIL8 = LJJIJIL7.LJJIJIL("BroadcastSendMessageResponseBody");
                    if (LJJIJIL8.LJJIJLIJ("messages") && (LJJIJIIJI = LJJIJIL8.LJJIJIIJI("messages")) != null) {
                        Iterator<j> it4 = LJJIJIIJI.iterator();
                        while (it4.hasNext()) {
                            m mVar10 = (m) it4.next();
                            if (mVar10.LJJIJLIJ("content")) {
                                mVar10.LJJIIZ("content", "");
                            }
                            LJIL(mVar10);
                        }
                        return mVar9;
                    }
                }
            }
            GetStrangerMessagesResponseBody getStrangerMessagesResponseBody = response.body.get_stranger_messages_body;
            if (getStrangerMessagesResponseBody != null && (list4 = getStrangerMessagesResponseBody.messages) != null && !list4.isEmpty()) {
                m mVar11 = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
                Iterator<j> it5 = mVar11.LJJIJIL("body").LJJIJIL("get_stranger_messages_body").LJJIJIIJI("messages").iterator();
                while (it5.hasNext()) {
                    m mVar12 = (m) it5.next();
                    mVar12.LJJIIZ("content", "");
                    LJIL(mVar12);
                }
                return mVar11;
            }
            GetStrangerConversationListResponseBody getStrangerConversationListResponseBody = response.body.get_stranger_conversation_body;
            if (getStrangerConversationListResponseBody != null && (list3 = getStrangerConversationListResponseBody.conversation_list) != null && !list3.isEmpty()) {
                m mVar13 = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
                Iterator<j> it6 = mVar13.LJJIJIL("body").LJJIJIL("get_stranger_conversation_body").LJJIJIIJI("conversation_list").iterator();
                while (it6.hasNext()) {
                    m LJJIJIL9 = ((m) it6.next()).LJJIJIL("last_message");
                    LJJIJIL9.LJJIIZ("content", "");
                    LJIL(LJJIJIL9);
                }
                return mVar13;
            }
            GetRecentMessageRespBody getRecentMessageRespBody = response.body.get_recent_message_body;
            if (getRecentMessageRespBody != null && (list2 = getRecentMessageRespBody.messages) != null && !list2.isEmpty()) {
                m mVar14 = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
                Iterator<j> it7 = mVar14.LJJIJIL("body").LJJIJIL("get_recent_message_body").LJJIJIIJI("messages").iterator();
                while (it7.hasNext()) {
                    g LJJIJIIJI2 = ((m) it7.next()).LJJIJIIJI("messages");
                    if (LJJIJIIJI2 != null) {
                        Iterator<j> it8 = LJJIJIIJI2.iterator();
                        while (it8.hasNext()) {
                            m mVar15 = (m) it8.next();
                            if (mVar15 != null) {
                                mVar15.LJJIIZ("content", "");
                                LJIL(mVar15);
                            }
                        }
                    }
                }
                return mVar14;
            }
            GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody = response.body.get_message_info_by_index_v2_range_body;
            if (getMessageInfoByIndexV2RangeResponseBody != null && (list = getMessageInfoByIndexV2RangeResponseBody.infos) != null && !list.isEmpty()) {
                m mVar16 = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
                Iterator<j> it9 = mVar16.LJJIJIL("body").LJJIJIL("get_message_info_by_index_v2_range_body").LJJIJIIJI("infos").iterator();
                while (it9.hasNext()) {
                    m LJJIJIL10 = ((m) it9.next()).LJJIJIL("body");
                    if (LJJIJIL10 != null) {
                        LJJIJIL10.LJJIIZ("content", "");
                        LJIL(LJJIJIL10);
                    }
                }
                return mVar16;
            }
            GetMessageByIdResponseBody getMessageByIdResponseBody = response.body.get_message_by_id_body;
            if (getMessageByIdResponseBody != null && (messageInfo = getMessageByIdResponseBody.msg_info) != null && messageInfo.body != null) {
                m mVar17 = (m) GsonProtectorUtils.fromJson(gson, json, m.class);
                m LJJIJIL11 = mVar17.LJJIJIL("body").LJJIJIL("get_message_by_id_body").LJJIJIL("msg_info").LJJIJIL("body");
                LJJIJIL11.LJJIIZ("content", "");
                LJIL(LJJIJIL11);
                return mVar17;
            }
            return obj;
        }
        return obj;
    }

    public static final boolean LJJI(Video2StickerModel video2StickerModel) {
        o.LJIIIZ(video2StickerModel, "<this>");
        VideoCropData videoCropData = video2StickerModel.videoCropData;
        if (videoCropData.scaleAfterCrop != null || videoCropData.cropRatioMode != 1 || videoCropData.transformY != 0.0f || videoCropData.transformX != 0.0f) {
            return true;
        }
        return false;
    }

    public static int LJJIIZ(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static void LJJIJIIJI(String str) {
        android.net.Uri parse;
        List<String> pathSegments;
        if (!TextUtils.isEmpty(str) && str.startsWith("aweme://user/profile/") && (pathSegments = (parse = UriProtector.parse(str)).getPathSegments()) != null && pathSegments.size() >= 2) {
            String str2 = (String) ListProtector.get(pathSegments, 1);
            String queryParameter = UriProtector.getQueryParameter(parse, "sec_uid");
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(queryParameter)) {
                C40515FvD.LIZJ().LJIIIIZZ(str2, queryParameter);
            }
        }
    }

    public static final void LJJIJL(Window window) {
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                View decorView = window.getDecorView();
                o.LJIIIIZZ(decorView, "window.decorView");
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | FileUtils.BUFFER_SIZE);
            }
            if (JF4.LIZLLL()) {
                try {
                    Class<?> cls = window.getClass();
                    Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                    int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                    Class<?> cls3 = Integer.TYPE;
                    cls.getMethod("setExtraFlags", cls3, cls3).invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                } catch (Throwable unused) {
                }
            }
            if (JF4.LIZJ()) {
                C48293IxN.LIZIZ(window, true);
            }
        }
    }

    @Override // X.F3J
    public void LIZ(String str) {
        File file = F3O.LIZ;
        if (file != null && file.exists()) {
            C16880lQ.LLLZZIL(F3O.LIZ);
        }
    }

    @Override // X.InterfaceC60553Npd
    public void LIZIZ(JSONObject jSONObject) {
        C86393XvR LJJIJIL;
        InterfaceC31203CMl interfaceC31203CMl;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL == null || (LJJIJIL = LJJJLL.LJJIJIL()) == null || LJJIJIL.LJJZ() == null || (interfaceC31203CMl = C0K2.LIZ) == null) {
            return;
        }
        interfaceC31203CMl.LJIJ(jSONObject);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        java.util.Map it = (java.util.Map) obj;
        o.LJIIIZ(it, "it");
        return TemplateData.LJ(it);
    }

    @Override // X.InterfaceC66992k3
    public void subscribe(InterfaceC65052gv interfaceC65052gv) {
        ((C73578SuE) interfaceC65052gv).onSuccess(SettingServiceImpl.LIZ().setPushPrivateSettingItem("other_channel", 1));
        C85940Xo8.LIZIZ.LIZ(1, "other_channel");
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        return !it.isEmpty();
    }

    public static final Handler LIZLLL(Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                Handler createAsync = Handler.createAsync(looper);
                o.LJIIIIZZ(createAsync, "createAsync(this)");
                return createAsync;
            }
            try {
                Constructor declaredConstructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
                o.LJIIIIZZ(declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
                Object newInstance = declaredConstructor.newInstance(looper, null, Boolean.TRUE);
                o.LJIIIIZZ(newInstance, "constructor.newInstance(this, null, true)");
                return (Handler) newInstance;
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    public static void LJIJI(Context context, C38333F2r c38333F2r) {
        if (!TextUtils.isEmpty(c38333F2r.getResponse())) {
            try {
                JSONObject jSONObject = new JSONObject(c38333F2r.getResponse());
                if (!TextUtils.isEmpty(jSONObject.optString("status_msg"))) {
                    c38333F2r.setErrorMsg(jSONObject.optString("status_msg"));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        LJIJJLI(context, c38333F2r, R.string.rjy);
    }

    public static boolean LJIJJ(Context context, Throwable th) {
        return LJIJJLI(context, th, R.string.rjy);
    }

    public static final boolean LJJIFFI(List list, List list2) {
        if (list != null) {
            if (list2 != null && list.size() == list2.size()) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VoucherInfoNew) it.next()).voucherId);
                }
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((VoucherInfoNew) it2.next()).voucherId);
                }
                if (arrayList.containsAll(arrayList2)) {
                    return false;
                }
            }
        } else if (list2 == null) {
            return false;
        }
        return true;
    }

    public static String LJJIJ(String str, JSONObject jSONObject) {
        if (jSONObject == null || C38354F3m.LJ(str) || !jSONObject.has(str)) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    public static final List LJJIJIIJIL(Address address, List list) {
        String str;
        if (address == null || list == null || list.isEmpty()) {
            return null;
        }
        java.util.Map LJJIJIL = LJJIJIL(address, C2W1.LJLIL);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ElementDTO elementDTO = (ElementDTO) it.next();
            PaymentElement LIZ = elementDTO.LIZ();
            if (LJJIJIL != null) {
                str = (String) ((LinkedHashMap) LJJIJIL).get(elementDTO.id);
            } else {
                str = null;
            }
            LIZ.setParamValue(str);
            arrayList.add(LIZ);
        }
        return arrayList;
    }

    public static final java.util.Map LJJIJIL(Address address, InterfaceC88472Yns filter) {
        Region region;
        Region region2;
        String str;
        String str2;
        o.LJIIIZ(filter, "filter");
        if (address == null) {
            return null;
        }
        List<Region> list = address.districts;
        if (list != null) {
            region = (Region) ORZ.LLFII(list);
        } else {
            region = null;
        }
        List<Region> list2 = address.districts;
        if (list2 != null) {
            region2 = (Region) ORZ.LJLLLL(list2);
        } else {
            region2 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : C47261Igj.LJJIJIIJI("eg_ccdc_global_billing_address_city", "eg_ccdc_global_billing_address_state", "eg_ccdc_global_billing_address_postal_code", "eg_ccdc_global_billing_address_street", "eg_ccdc_global_billing_address_country_regin")) {
            if (!((Boolean) filter.invoke(str3)).booleanValue()) {
                switch (str3.hashCode()) {
                    case -1675358935:
                        if (str3.equals("eg_ccdc_global_billing_address_state") && region2 != null) {
                            str = region2.name;
                            break;
                        }
                        break;
                    case -437890200:
                        if (str3.equals("eg_ccdc_global_billing_address_country_regin")) {
                            Region region3 = address.region;
                            if (region3 != null) {
                                str2 = region3.geoNameId;
                            } else {
                                str2 = null;
                            }
                            str = C26826Afu.LIZ(str2);
                            break;
                        } else {
                            break;
                        }
                    case -396027285:
                        if (str3.equals("eg_ccdc_global_billing_address_street")) {
                            str = address.LIZ();
                            break;
                        } else {
                            break;
                        }
                    case -304863367:
                        if (str3.equals("eg_ccdc_global_billing_address_postal_code")) {
                            str = address.LIZLLL("zipcode");
                            break;
                        } else {
                            break;
                        }
                    case -193077805:
                        if (str3.equals("eg_ccdc_global_billing_address_city") && region != null) {
                            str = region.name;
                            break;
                        }
                        break;
                }
                if (str != null) {
                    linkedHashMap.put(str3, str);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(SearchResultParam searchResultParam, JSONObject jsbParams, String str) {
        o.LJIIIZ(jsbParams, "jsbParams");
        JSONObject LJJIIZ = C78983UzD.LJJIIZ("ecomSearchParams", jsbParams);
        if (LJJIIZ != null) {
            try {
                for (Map.Entry<String, Object> entry : JsonExtKt.toMap(LJJIIZ).entrySet()) {
                    java.util.Map<String, Object> ecomRecomSearchParamMap = searchResultParam.getEcomRecomSearchParamMap();
                    o.LJIIIIZZ(ecomRecomSearchParamMap, "ecomRecomSearchParamMap");
                    ecomRecomSearchParamMap.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
            String optString = LJJIIZ.optString("attach_products");
            if (C78857UxB.LJJJIL(optString)) {
                searchResultParam.setResultAttachCard(new C51244K9g(KBE.PRODUCT_CARD, optString, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0));
            }
            if (o.LJ(str, "recom_search") || o.LJ(str, "recom_search_pic")) {
                String optString2 = jsbParams.optString("searchSourcePage");
                if (C78857UxB.LJJJIL(optString2) && o.LJ(optString2, "ecom_search_transfer")) {
                    String optString3 = LJJIIZ.optString("sug_query_state");
                    String optString4 = LJJIIZ.optString("sug_creator_id");
                    if (C78857UxB.LJJJIL(optString3)) {
                        searchResultParam.setQueryState(optString3);
                    }
                    if (C78857UxB.LJJJIL(optString4)) {
                        searchResultParam.setSugUserId(optString4);
                    }
                }
            }
        }
    }

    public static final Spanned LJIJ(Context context, int i, Spannable... args) {
        o.LJIIIZ(context, "<this>");
        o.LJIIIZ(args, "args");
        Spannable[] args2 = (Spannable[]) Arrays.copyOf(args, args.length);
        o.LJIIIZ(args2, "args");
        String string = context.getString(i);
        o.LJIIIIZZ(string, "ctx.getString(resId)");
        return C8G2.LIZ(string, (Spannable[]) Arrays.copyOf(args2, args2.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIJJLI(android.content.Context r6, java.lang.Throwable r7, int r8) {
        /*
            r5 = 0
            if (r7 != 0) goto L4
            return r5
        L4:
            boolean r0 = r7 instanceof X.C38333F2r
            r4 = 0
            if (r0 == 0) goto L17
            X.F2r r7 = (X.C38333F2r) r7
        Lb:
            if (r7 == 0) goto L68
            int r1 = r7.getErrorCode()
            r0 = 2155(0x86b, float:3.02E-42)
            r3 = 1
            if (r1 != r0) goto L22
            return r3
        L17:
            java.lang.Throwable r7 = r7.getCause()
            boolean r0 = r7 instanceof X.C38333F2r
            if (r0 == 0) goto L68
            X.F2r r7 = (X.C38333F2r) r7
            goto Lb
        L22:
            int r2 = r7.getErrorCode()
            r0 = 3070(0xbfe, float:4.302E-42)
            if (r2 == r0) goto L32
            r0 = 3071(0xbff, float:4.303E-42)
            if (r2 == r0) goto L32
            r0 = 3072(0xc00, float:4.305E-42)
            if (r2 != r0) goto L33
        L32:
            return r3
        L33:
            r0 = 8
            if (r2 != r0) goto L3a
            if (r6 == 0) goto L8a
            return r3
        L3a:
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r2 != r0) goto L3f
            goto L48
        L3f:
            r0 = 2003(0x7d3, float:2.807E-42)
            if (r2 == r0) goto L32
            r0 = 2004(0x7d4, float:2.808E-42)
            if (r2 != r0) goto L6e
            goto L32
        L48:
            X.ARI r2 = new X.ARI     // Catch: java.lang.Exception -> L67
            r2.<init>(r6)     // Catch: java.lang.Exception -> L67
            r0 = 2131834222(0x7f11356e, float:1.9301548E38)
            r2.LJI(r0, r4)     // Catch: java.lang.Exception -> L67
            X.ARb r1 = X.C3AW.LIZ(r6)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = r7.getErrorMsg()     // Catch: java.lang.Exception -> L67
            r1.LIZIZ(r0)     // Catch: java.lang.Exception -> L67
            r1.LJIIL = r2     // Catch: java.lang.Exception -> L67
            X.ARf r0 = r1.LJI()     // Catch: java.lang.Exception -> L67
            r0.LIZLLL()     // Catch: java.lang.Exception -> L67
        L67:
            return r3
        L68:
            if (r6 == 0) goto L8a
            X.C05L.LIZLLL(r6, r8)
            goto L8a
        L6e:
            if (r6 == 0) goto L8a
            java.lang.String r0 = r7.getPrompt()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8c
            X.HG3.LJIIL()
            com.ss.android.ugc.aweme.IAccountService r0 = X.HG3.LJLJL
            com.ss.android.ugc.aweme.services.InterceptorService r1 = r0.LJ()
            java.lang.String r0 = r7.getPrompt()
            r1.promptIfNeededOrToast(r6, r0, r2)
        L8a:
            return r5
        L8c:
            java.lang.String r0 = r7.getErrorMsg()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La7
            X.HG3.LJIIL()
            com.ss.android.ugc.aweme.IAccountService r0 = X.HG3.LJLJL
            com.ss.android.ugc.aweme.services.InterceptorService r1 = r0.LJ()
            java.lang.String r0 = r7.getErrorMsg()
            r1.promptIfNeededOrToast(r6, r0, r2)
            goto L8a
        La7:
            int r1 = r7.getErrorCode()
            r0 = 100
            if (r1 != r0) goto Lb6
            r0 = 2131826404(0x7f1116e4, float:1.9285691E38)
            X.C05L.LIZLLL(r6, r0)
            goto L8a
        Lb6:
            int r1 = r7.getErrorCode()
            r0 = 3004008(0x2dd668, float:4.209512E-39)
            if (r1 != r0) goto Lc6
            r0 = 2131831193(0x7f112999, float:1.9295405E38)
            X.C05L.LIZLLL(r6, r0)
            goto L8a
        Lc6:
            X.C05L.LIZLLL(r6, r8)
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A7.LJIJJLI(android.content.Context, java.lang.Throwable, int):boolean");
    }

    public static final boolean LJJII(InterfaceC11610cv interfaceC11610cv, float f, float f2) {
        C10390ax c10390ax = new C10390ax(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        C1QX LIZ = C1JI.LIZ();
        LIZ.LJIIL(c10390ax);
        C1QX LIZ2 = C1JI.LIZ();
        LIZ2.LJIIIZ(interfaceC11610cv, LIZ, 1);
        boolean LJIILIIL = LIZ2.LJIILIIL();
        LIZ2.reset();
        LIZ.reset();
        return !LJIILIIL;
    }

    public static void LJJIIJZLJL(Integer num, String str, Object obj) {
        int i;
        int i2;
        try {
            if (C63312Ot2.LIZIZ(num)) {
                return;
            }
            Object LJJ = LJJ(obj);
            if (!TextUtils.isEmpty(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PBLogUtils ");
                LIZ.append(str);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            }
            if (C63308Osy.LJI().LIZLLL().LIZIZ == 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("PBLogUtils ");
                LIZ2.append(C16880lQ.LJLLJ(obj.getClass()));
                LIZ2.append(" : ");
                LIZ2.append(LJJ.toString());
                C63322OtC.LJII(X1D.LIZIZ(LIZ2));
                return;
            }
            String LJIILL = C63682Oz0.LIZ.LJIILL(LJJ);
            if (C63308Osy.LJI().LIZLLL().LIZIZ == 2) {
                int length = LJIILL.length();
                StringBuilder sb = new StringBuilder(length);
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    char charAt = LJIILL.charAt(i3);
                    if (charAt == '\\') {
                        i3 = i4 + 1;
                        char charAt2 = LJIILL.charAt(i4);
                        if (charAt2 == 'u') {
                            int i5 = 0;
                            int i6 = 0;
                            do {
                                int i7 = i3 + 1;
                                char charAt3 = LJIILL.charAt(i3);
                                switch (charAt3) {
                                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                                    case C61447O9r.LJIIJ:
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        i6 = ((i6 << 4) + charAt3) - 48;
                                        break;
                                    default:
                                        switch (charAt3) {
                                            case 'A':
                                            case 'B':
                                            case 'C':
                                            case 'D':
                                            case 'E':
                                            case 'F':
                                                i = i6 << 4;
                                                i2 = -65;
                                                break;
                                            default:
                                                switch (charAt3) {
                                                    case 'a':
                                                    case 'b':
                                                    case 'c':
                                                    case 'd':
                                                    case 'e':
                                                    case 'f':
                                                        i = i6 << 4;
                                                        i2 = -97;
                                                        break;
                                                    default:
                                                        throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
                                                }
                                        }
                                        i6 = AnonymousClass036.LIZIZ(i, 10, charAt3, i2);
                                        break;
                                }
                                i5++;
                                i3 = i7;
                            } while (i5 < 4);
                            sb.append((char) i6);
                        } else {
                            if (charAt2 == 't') {
                                charAt2 = '\t';
                            } else if (charAt2 == 'r') {
                                charAt2 = '\r';
                            } else if (charAt2 == 'n') {
                                charAt2 = '\n';
                            } else if (charAt2 == 'f') {
                                charAt2 = '\f';
                            }
                            sb.append(charAt2);
                        }
                    } else {
                        sb.append(charAt);
                        i3 = i4;
                    }
                }
                LJIILL = LJIIIIZZ(sb.toString());
            }
            if (LJIILL.length() < 1996) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("PBLogUtils ");
                LIZ3.append(C16880lQ.LJLLJ(obj.getClass()));
                LIZ3.append(" : ");
                LIZ3.append(LJIILL);
                C63322OtC.LJII(X1D.LIZIZ(LIZ3));
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("PBLogUtils ");
            LIZ4.append(C16880lQ.LJLLJ(obj.getClass()));
            LIZ4.append(" : ");
            C63322OtC.LJII(X1D.LIZIZ(LIZ4));
            while (LJIILL.length() > 1996) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("PBLogUtils ");
                LIZ5.append(LJIILL.substring(0, 1996));
                C63322OtC.LJFF(X1D.LIZIZ(LIZ5));
                LJIILL = LJIILL.substring(1996);
            }
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("PBLogUtils ");
            LIZ6.append(LJIILL);
            C63322OtC.LJII(X1D.LIZIZ(LIZ6));
        } catch (Throwable th) {
            C63322OtC.LJ("PBLogUtils", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015e  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C69694RWw LJJIL(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r15, java.lang.Boolean r16, boolean r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A7.LJJIL(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, java.lang.Boolean, boolean, java.util.List):X.RWw");
    }

    public static final boolean LJJIII(long j, float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float LIZIZ = C10340as.LIZIZ(j);
        float LIZJ = C10340as.LIZJ(j);
        if (((f6 * f6) / (LIZJ * LIZJ)) + ((f5 * f5) / (LIZIZ * LIZIZ)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final StaticLayout LJJIIJ(TextView textView, CharSequence content, TextPaint paint, int i, Float f) {
        o.LJIIIZ(textView, "<this>");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(paint, "paint");
        if (!o.LJ(paint, textView.getPaint())) {
            paint.reset();
            paint.set(textView.getPaint());
            if (f != null) {
                paint.setTextSize(f.floatValue());
            }
            Layout.Alignment alignment = (Layout.Alignment) C74066T5a.LIZIZ(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment");
            if (Build.VERSION.SDK_INT >= 23) {
                int maxLines = textView.getMaxLines();
                TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) C74066T5a.LIZIZ(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic");
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(content, 0, content.length(), paint, i);
                o.LJIIIIZZ(obtain, "obtain(\n                …ilableWidth\n            )");
                StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
                if (maxLines == -1) {
                    maxLines = Integer.MAX_VALUE;
                }
                StaticLayout build = hyphenationFrequency.setMaxLines(maxLines).setTextDirection(textDirectionHeuristic).build();
                o.LJIIIIZZ(build, "layoutBuilder.setAlignme…\n                .build()");
                return build;
            }
            return new StaticLayout(content, paint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }
        throw new IllegalArgumentException("paint should be a new instance different from current TextView's paint!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static C69638RUs LJJIJLIJ(ProductPackStruct productPackStruct, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        int i2;
        C69638RUs c69638RUs = null;
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        if ((i & 4) != 0) {
            bool3 = null;
        }
        o.LJIIIZ(productPackStruct, "<this>");
        List<PromotionDiscount> list = productPackStruct.promotionDiscounts;
        if (list != null) {
            Iterator<PromotionDiscount> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PromotionDiscount next = it.next();
                Integer num = next.scene;
                if (num != null && num.intValue() == 1) {
                    List<Voucher> list2 = next.discounts;
                    ?? r10 = list2;
                    if (list2 == null) {
                        r10 = new ArrayList();
                    }
                    if (next.defaultVoucherTypeIds != null) {
                        r10 = new ArrayList();
                        for (String str : next.defaultVoucherTypeIds) {
                            List<Voucher> list3 = next.discounts;
                            if (list3 != null) {
                                Iterator<Voucher> it2 = list3.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Voucher next2 = it2.next();
                                        if (o.LJ(next2.getVoucherTypeID(), str)) {
                                            if (next2 != null) {
                                                r10.add(next2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Integer num2 = next.style;
                    if (num2 != null) {
                        i2 = num2.intValue();
                    } else {
                        i2 = 0;
                    }
                    String str2 = next.title;
                    if (str2 == null) {
                        str2 = "Coupons";
                    }
                    String str3 = next.schema;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str5 = next.discountPrice;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    c69638RUs = new C69638RUs(i2, str2, str3, str4, r10, bool, bool2, bool3);
                }
            }
        }
        return c69638RUs;
    }

    public static final void LJII(Canvas canvas, String text, float f, float f2, T5S paint, Rect tmpRect) {
        o.LJIIIZ(canvas, "<this>");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(tmpRect, "tmpRect");
        paint.getTextBounds(text, 0, text.length(), tmpRect);
        canvas.drawText(text, (f - (tmpRect.width() / 2.0f)) - tmpRect.left, ((tmpRect.height() / 2.0f) + f2) - tmpRect.bottom, paint);
    }
}
