package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.41E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41E extends C42Q<C41D, C3WX> {
    public final C99033ud LJ;
    public final String LJFF;
    public final InterfaceC71762rk<C3FJ> LJI;
    public final InterfaceC65784Pro<C76800UCe> LJII;
    public final InterfaceC88472Yns<String, C76800UCe> LJIIIIZZ;

    @Override // X.AbstractC1036945d
    public final void LIZIZ() {
        this.LJII.invoke();
    }

    @Override // X.AbstractC1036945d
    public final Object LJ(C1023940d c1023940d, InterfaceC67352kd interfaceC67352kd) {
        final C41D c41d = (C41D) c1023940d;
        final C3WX c3wx = (C3WX) this.LIZLLL;
        if (c3wx != null) {
            C99033ud c99033ud = this.LJ;
            String noticeCode = c41d.LIZIZ.getNoticeCode();
            if (noticeCode == null) {
                noticeCode = "";
            }
            c3wx.LIZJ(c99033ud, noticeCode, new C3PD() { // from class: X.41F
                @Override // X.C3PD
                public final void LLLL() {
                    Context context = C3WX.this.getContext();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("aweme://im/enter_sticker_store?conversation_id=");
                    LIZ.append(this.LJFF);
                    SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ));
                    buildRoute.withParam("enter_from", "suggested_sticker");
                    buildRoute.withParam("enter_method", "more_suggested_stickers");
                    buildRoute.open();
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
                
                    if (r3.equals("no_message_suggested_stickers") == false) goto L7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
                
                    r2 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
                
                    if (r3.equals("no_sticker_suggested_stickers") == false) goto L7;
                 */
                @Override // X.C3PD
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LLLLIIIILLL() {
                    /*
                        r5 = this;
                        X.41E r1 = r2
                        X.Yns<java.lang.String, X.UCe> r4 = r1.LJIIIIZZ
                        X.41D r0 = r3
                        com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct r0 = r0.LIZIZ
                        java.lang.String r3 = r0.getNoticeCode()
                        java.lang.String r2 = ""
                        if (r3 != 0) goto L11
                        r3 = r2
                    L11:
                        r1.getClass()
                        int r0 = r3.hashCode()
                        switch(r0) {
                            case -1596243243: goto L26;
                            case -1240669851: goto L32;
                            case 109197544: goto L3e;
                            case 164884774: goto L47;
                            case 1082443762: goto L53;
                            default: goto L1b;
                        }
                    L1b:
                        r4.invoke(r2)
                        X.41E r0 = r2
                        X.Pro<X.UCe> r0 = r0.LJII
                        r0.invoke()
                        return
                    L26:
                        java.lang.String r0 = "recommended_chat_suggested_stickers"
                        boolean r0 = r3.equals(r0)
                        if (r0 != 0) goto L2f
                        goto L1b
                    L2f:
                        java.lang.String r2 = "recommended_chat"
                        goto L1b
                    L32:
                        java.lang.String r0 = "sayhi_suggested_stickers"
                        boolean r0 = r3.equals(r0)
                        if (r0 != 0) goto L3b
                        goto L1b
                    L3b:
                        java.lang.String r2 = "ice_breaking_say_hi"
                        goto L1b
                    L3e:
                        java.lang.String r1 = "no_message_suggested_stickers"
                        boolean r0 = r3.equals(r1)
                        if (r0 != 0) goto L5c
                        goto L1b
                    L47:
                        java.lang.String r0 = "sayhi_followback_suggested_stickers"
                        boolean r0 = r3.equals(r0)
                        if (r0 != 0) goto L50
                        goto L1b
                    L50:
                        java.lang.String r2 = "ice_breaking_say_hi_follow_back"
                        goto L1b
                    L53:
                        java.lang.String r1 = "no_sticker_suggested_stickers"
                        boolean r0 = r3.equals(r1)
                        if (r0 != 0) goto L5c
                        goto L1b
                    L5c:
                        r2 = r1
                        goto L1b
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C41F.LLLLIIIILLL():void");
                }

                @Override // X.C3PD
                public final void LLLLII(VideoSticker sticker) {
                    o.LJIIIZ(sticker, "sticker");
                    Context context = C3WX.this.getContext();
                    o.LJIIIIZZ(context, "context");
                    new C61996OUu(context).LIZ(0);
                    C88873eF.LIZ.LJIIIIZZ(sticker, this.LJFF, EnumC88973eP.SUGGESTED_STICKER, C113554cx.LJJLIIIIJ(new OSZ("enter_from", "chat"), new OSZ("enter_method", "suggested_sticker")), C88903eI.LIZ(), EF7.LIZIZ());
                }

                @Override // X.C3PD
                public final void LLLLIIL(SetSticker sticker) {
                    o.LJIIIZ(sticker, "sticker");
                    Context context = C3WX.this.getContext();
                    o.LJIIIIZZ(context, "context");
                    new C61996OUu(context).LIZ(0);
                    C88873eF.LJII(sticker, this.LJFF, EnumC88973eP.SUGGESTED_STICKER, C113554cx.LJJLIIIIJ(new OSZ("enter_from", "chat"), new OSZ("enter_method", "suggested_sticker")), 48);
                }
            }, this.LJI);
            return c3wx;
        }
        return null;
    }

    @Override // X.AbstractC1036945d
    public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd interfaceC67352kd) {
        boolean z;
        if (this.LIZ.isDebugMode() || this.LJI.getValue() != C3FJ.HIDDEN_PERMANENTLY) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41E(ViewGroup viewGroup, C99033ud sessionInfo, String conversationId, InterfaceC71762rk interfaceC71762rk, AqS151S0100000_1 aqS151S0100000_1, AqS167S0100000_1 aqS167S0100000_1) {
        super(C41X.SUGGESTED_STICKERS, viewGroup, R.layout.b_f);
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(conversationId, "conversationId");
        this.LJ = sessionInfo;
        this.LJFF = conversationId;
        this.LJI = interfaceC71762rk;
        this.LJII = aqS151S0100000_1;
        this.LJIIIIZZ = aqS167S0100000_1;
    }
}
