package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.TraceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceLiveDegradeExp;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rwn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71189Rwn extends AbstractC71170RwU<AbstractC71212RxA> implements InterfaceC71446S2g {
    public final java.util.Map<String, String> LJLJLLL;
    public final C71195Rwt LJLL;

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC31687Cc7 LIZ() {
        return null;
    }

    public abstract boolean LJIJ();

    public void LJIJI(PopupCardVO popupCardVO, C48502J1u c48502J1u, Context context) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    @Override // X.AbstractC71170RwU
    public final void LJIIIIZZ() {
        AbstractC71212RxA abstractC71212RxA = (AbstractC71212RxA) this.LJLJI;
        if (abstractC71212RxA != null) {
            abstractC71212RxA.LJLILLLLZI = null;
            abstractC71212RxA.LJLJI.LIZ();
            abstractC71212RxA.LJLJI.LIZ.clear();
        }
        this.LJLJI = null;
    }

    @Override // X.AbstractC71170RwU
    public final java.util.Map<String, String> LJIIL() {
        java.util.Map<String, String> eventParamForContentShow;
        AbstractC71212RxA abstractC71212RxA = (AbstractC71212RxA) this.LJLJI;
        if (abstractC71212RxA == null || (eventParamForContentShow = abstractC71212RxA.getEventParamForContentShow()) == null) {
            return C113554cx.LJJJLIIL();
        }
        return eventParamForContentShow;
    }

    @Override // X.AbstractC71170RwU
    public final java.util.Map LJIILIIL() {
        AbstractC71212RxA abstractC71212RxA = (AbstractC71212RxA) this.LJLJI;
        if (abstractC71212RxA != null) {
            return abstractC71212RxA.getPromotionLogoDaInfo();
        }
        return null;
    }

    @Override // X.AbstractC71170RwU
    public final void LJIILLIIL() {
        AbstractC71212RxA abstractC71212RxA = (AbstractC71212RxA) this.LJLJI;
        if (abstractC71212RxA != null) {
            LJIJJ(abstractC71212RxA, false);
        }
    }

    @Override // X.AbstractC71170RwU
    public final boolean LJIIIZ() {
        return EcommerceLiveDegradeExp.LIZJ().LIZIZ();
    }

    @Override // X.AbstractC71170RwU
    public final AbstractC71212RxA LJIILL(Context context) {
        AbstractC71212RxA s2l;
        boolean z;
        String str;
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        PopupCardVO popupCardVO;
        String str4;
        String str5;
        ECommerceMessage sourceMessage;
        TraceInfo traceInfo;
        long j;
        long j2;
        String str6;
        ECommerceMessage sourceMessage2;
        TraceInfo traceInfo2;
        o.LJIIIZ(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        layoutParams.leftMargin = C17N.LJIILL(12.0d);
        int i = this.LJLILLLLZI;
        String str7 = null;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        s2l = new S2L(context, null, 0);
                        C78948Uye.LJIJJLI(s2l, this);
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.pr));
                        layoutParams.gravity = 16;
                        layoutParams.leftMargin = C17N.LJIILL(12.0d);
                        s2l = new S2M(context, null, 0);
                        C78948Uye.LJIJJLI(s2l, this);
                    }
                } else {
                    layoutParams = new FrameLayout.LayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.pr));
                    layoutParams.gravity = 16;
                    layoutParams.leftMargin = C17N.LJIILL(12.0d);
                    s2l = new S2N(context, null, 0);
                    C78948Uye.LJIJJLI(s2l, this);
                }
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                s2l = new S2K(context, null, 0);
                C78948Uye.LJIJJLI(s2l, this);
            }
        } else {
            s2l = new S2L(context, null, 0);
            C78948Uye.LJIJJLI(s2l, this);
        }
        LJIJJ(s2l, true);
        s2l.setLayoutParams(layoutParams);
        s2l.LJLILLLLZI = this;
        PopupCardVO popupCardVO2 = this.LJLIL;
        if (popupCardVO2 != null && popupCardVO2.isFromMessage()) {
            z = true;
        } else {
            z = false;
        }
        if (z && ((popupCardVO = this.LJLIL) == null || (sourceMessage2 = popupCardVO.getSourceMessage()) == null || (traceInfo2 = sourceMessage2.traceInfo) == null || traceInfo2.operateTime != 0)) {
            PopupCardVO popupCardVO3 = this.LJLIL;
            if (popupCardVO3 != null) {
                str4 = Long.valueOf(popupCardVO3.getProductId()).toString();
            } else {
                str4 = null;
            }
            C48502J1u c48502J1u = this.LJLJJLL;
            if (c48502J1u != null) {
                str5 = c48502J1u.LIZJ("room_id");
            } else {
                str5 = null;
            }
            PopupCardVO popupCardVO4 = this.LJLIL;
            if (popupCardVO4 != null) {
                str7 = popupCardVO4.getFromMessageId();
            }
            PopupCardVO popupCardVO5 = this.LJLIL;
            if (popupCardVO5 != null && (sourceMessage = popupCardVO5.getSourceMessage()) != null && (traceInfo = sourceMessage.traceInfo) != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = traceInfo.operateTime;
                long j4 = currentTimeMillis - j3;
                long j5 = traceInfo.arrivalTime;
                long j6 = j5 - j3;
                long j7 = traceInfo.sendTime - j5;
                C48502J1u c48502J1u2 = this.LJLJJLL;
                if (c48502J1u2 != null) {
                    j = c48502J1u2.LIZ("client_received_time");
                } else {
                    j = 0;
                }
                long j8 = j - traceInfo.sendTime;
                long currentTimeMillis2 = System.currentTimeMillis();
                C48502J1u c48502J1u3 = this.LJLJJLL;
                if (c48502J1u3 != null) {
                    j2 = c48502J1u3.LIZ("client_received_time");
                } else {
                    j2 = 0;
                }
                long j9 = currentTimeMillis2 - j2;
                C48502J1u c48502J1u4 = this.LJLJJLL;
                if (c48502J1u4 != null) {
                    str6 = c48502J1u4.LIZJ("live_role");
                } else {
                    str6 = null;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("product_id", str4);
                    jSONObject.put("room_id", str5);
                    jSONObject.put("message_id", str7);
                    jSONObject.put("total_duration", j4);
                    jSONObject.put("introduce_duration", j6);
                    jSONObject.put("introduce_server_duration", j7);
                    jSONObject.put("live_msg_duration", j8);
                    jSONObject.put("client_show_pin_duration", j9);
                    jSONObject.put("live_role", str6);
                    C48658J7u.LIZIZ("rd_tiktokec_pin_duration", jSONObject);
                } catch (Exception unused) {
                }
            }
        }
        EnumC71173RwX enumC71173RwX = EnumC71173RwX.ON_VIEW_CREATED;
        C48502J1u c48502J1u5 = this.LJLJJLL;
        if (c48502J1u5 == null || (str = c48502J1u5.LIZJ("live_role")) == null) {
            str = "";
        }
        C48502J1u c48502J1u6 = this.LJLJJLL;
        if (c48502J1u6 != null) {
            str2 = c48502J1u6.LIZJ("room_id");
        } else {
            str2 = null;
        }
        PopupCardVO popupCardVO6 = this.LJLIL;
        if (popupCardVO6 != null) {
            str3 = Long.valueOf(popupCardVO6.getProductId()).toString();
        } else {
            str3 = null;
        }
        C48502J1u c48502J1u7 = this.LJLJJLL;
        if (c48502J1u7 != null) {
            z2 = c48502J1u7.LIZLLL("is_page_visible");
        } else {
            z2 = false;
        }
        C48502J1u c48502J1u8 = this.LJLJJLL;
        if (c48502J1u8 != null) {
            z3 = c48502J1u8.LIZLLL("is_keyboard_showing");
        } else {
            z3 = false;
        }
        C48502J1u c48502J1u9 = this.LJLJJLL;
        if (c48502J1u9 != null) {
            z4 = c48502J1u9.LIZLLL("has_permission");
        } else {
            z4 = false;
        }
        PopupCardVO popupCardVO7 = this.LJLIL;
        if (popupCardVO7 != null) {
            z5 = popupCardVO7.isFromMessage();
        } else {
            z5 = false;
        }
        C71161RwL.LIZ(enumC71173RwX, str, str2, str3, z2, z3, z4, z5);
        return s2l;
    }

    @Override // X.InterfaceC71247Rxj
    public final void LJJLIIIIJ(boolean z) {
        InterfaceC71247Rxj interfaceC71247Rxj;
        T t = this.LJLJI;
        if ((t instanceof InterfaceC71247Rxj) && (interfaceC71247Rxj = (InterfaceC71247Rxj) t) != null) {
            interfaceC71247Rxj.LJJLIIIIJ(z);
        }
    }

    public AbstractC71189Rwn(java.util.Map<String, String> showParams, C71195Rwt explainCardLoggerHelper) {
        o.LJIIIZ(showParams, "showParams");
        o.LJIIIZ(explainCardLoggerHelper, "explainCardLoggerHelper");
        this.LJLJLLL = showParams;
        this.LJLL = explainCardLoggerHelper;
    }

    @Override // X.AbstractC71170RwU
    public final void LJIILJJIL(int i, AtmosphereTag atmosphereTag) {
        AbstractC71212RxA abstractC71212RxA = (AbstractC71212RxA) this.LJLJI;
        if (abstractC71212RxA != null) {
            abstractC71212RxA.LJJIL(i, atmosphereTag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Pro, X.Prl] */
    public final void LJIJJ(AbstractC71212RxA abstractC71212RxA, boolean z) {
        PopupCardVO popupCardVO = this.LJLIL;
        if (popupCardVO != null) {
            C48502J1u c48502J1u = this.LJLJJLL;
            Context context = abstractC71212RxA.getContext();
            o.LJIIIIZZ(context, "contentView.context");
            LJIJI(popupCardVO, c48502J1u, context);
            abstractC71212RxA.LJJLJLI(popupCardVO, this.LJLJJLL, this.LJLJLJ, z, LJIJ(), this.LJLILLLLZI);
        }
    }

    @Override // X.InterfaceC71247Rxj
    public final void LJJJJZ(String str, com.bytedance.android.livesdk.model.message.Img img) {
        InterfaceC71247Rxj interfaceC71247Rxj;
        T t = this.LJLJI;
        if ((t instanceof InterfaceC71247Rxj) && (interfaceC71247Rxj = (InterfaceC71247Rxj) t) != null) {
            interfaceC71247Rxj.LJJJJZ(str, img);
        }
    }

    @Override // X.InterfaceC71446S2g
    public final void LJ(PopupCardVO product, boolean z, boolean z2, boolean z3, long j) {
        String str;
        String str2;
        String str3;
        long j2;
        String str4;
        o.LJIIIZ(product, "product");
        C48502J1u c48502J1u = this.LJLJJLL;
        String str5 = null;
        if (c48502J1u != null) {
            str = c48502J1u.LIZJ("room_id");
        } else {
            str = null;
        }
        C48502J1u c48502J1u2 = this.LJLJJLL;
        if (c48502J1u2 != null) {
            str2 = c48502J1u2.LIZJ("author_id");
        } else {
            str2 = null;
        }
        C48502J1u c48502J1u3 = this.LJLJJLL;
        if (c48502J1u3 != null) {
            str3 = c48502J1u3.LIZJ("page_name");
        } else {
            str3 = null;
        }
        C48502J1u c48502J1u4 = this.LJLJJLL;
        if (c48502J1u4 != null) {
            j2 = c48502J1u4.LIZ("api_end_time");
        } else {
            j2 = 0;
        }
        C48502J1u c48502J1u5 = this.LJLJJLL;
        if (c48502J1u5 != null) {
            str5 = c48502J1u5.LIZJ("live_role");
        }
        String str6 = "message";
        if (z3) {
            C71195Rwt c71195Rwt = this.LJLL;
            String valueOf = String.valueOf(product.getProductId());
            String imageUrl = product.getImageUrl();
            String fromMessageId = product.getFromMessageId();
            if (!product.isFromMessage()) {
                str6 = "pop";
            }
            c71195Rwt.LIZJ(valueOf, str, imageUrl, fromMessageId, str6, j, str3, str2, "1", System.currentTimeMillis() - j2, z2, z, str5);
            return;
        }
        C71195Rwt c71195Rwt2 = this.LJLL;
        String valueOf2 = String.valueOf(product.getProductId());
        String imageUrl2 = product.getImageUrl();
        String fromMessageId2 = product.getFromMessageId();
        if (product.isFromMessage()) {
            str4 = "message";
        } else {
            str4 = "pop";
        }
        c71195Rwt2.LIZJ(valueOf2, str, imageUrl2, fromMessageId2, str4, j, str3, str2, CardStruct.IStatusCode.DEFAULT, System.currentTimeMillis() - j2, z2, z, str5);
        String valueOf3 = String.valueOf(product.getProductId());
        String imageUrl3 = product.getImageUrl();
        String fromMessageId3 = product.getFromMessageId();
        if (!product.isFromMessage()) {
            str6 = "pop";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", valueOf3);
            jSONObject.put("room_id", str);
            jSONObject.put("image_url", imageUrl3);
            jSONObject.put("message_id", fromMessageId3);
            jSONObject.put("from", str6);
            C48658J7u.LIZIZ("rd_tiktokec_pin_image_show_fail", jSONObject);
        } catch (Exception unused) {
        }
    }
}
