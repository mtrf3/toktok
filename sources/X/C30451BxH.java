package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSchema;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BxH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30451BxH implements InterfaceC28232B6e {
    public XKQ LIZ;
    public C29701Eo LIZIZ;
    public boolean LIZLLL;
    public DataChannel LJ;
    public String LIZJ = "";
    public String LJFF = "";
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C30453BxJ.LJLIL);
    public final C30452BxI LJII = new C30452BxI();

    public static final boolean LIZIZ() {
        if (((IShortTouchService) CN1.LIZ(IShortTouchService.class)).vr(UOS.NAME, "shortTouchGamePartnershipDrops") != null) {
            return true;
        }
        return false;
    }

    public static final void LJ() {
        ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).sX(UOS.NAME, "shortTouchGamePartnershipDrops");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
    
        if (r3 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.lang.Boolean, java.lang.Boolean> LJFF() {
        /*
            r5 = this;
            X.Byw<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.LJJLIIIJLJLI
            java.lang.Object r0 = r0.LIZ()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            r4 = 1
            if (r0 != 0) goto L13
            boolean r0 = r5.LIZLLL
            if (r0 == 0) goto L5b
        L13:
            r3 = 1
            X.J0d<java.lang.Boolean> r1 = X.InterfaceC30442Bx8.LJJLIIIJL
            java.lang.Object r0 = r1.LIZJ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5c
            r1.LIZ(r2)
        L25:
            java.lang.String r0 = "livesdk_drops_icon_show"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.LJ
            r2.LJIILLIIL(r0)
            java.lang.String r1 = "icon_type"
            java.lang.String r0 = "normal"
            r2.LJIJJ(r0, r1)
            if (r4 == 0) goto L58
            java.lang.String r1 = "1"
        L3b:
            java.lang.String r0 = "is_red_dot"
            r2.LJIJJ(r1, r0)
            java.lang.String r1 = "drops_id"
            java.lang.String r0 = r5.LIZJ
            r2.LJIJJ(r0, r1)
            r2.LJJIIJZLJL()
        L4a:
            X.OSZ r2 = new X.OSZ
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.<init>(r1, r0)
            return r2
        L58:
            java.lang.String r1 = "0"
            goto L3b
        L5b:
            r3 = 0
        L5c:
            r4 = 0
            if (r3 == 0) goto L4a
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30451BxH.LJFF():X.OSZ");
    }

    public final void LIZJ(List<PartnershipGameOfflineMessage.OfflineGameInfo> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((PartnershipGameOfflineMessage.OfflineGameInfo) next).taskId, this.LIZJ)) {
                if (next != null) {
                    LJ();
                    this.LIZJ = "";
                    return;
                }
                return;
            }
        }
    }

    public final void LIZLLL(Context context, boolean z) {
        String str;
        o.LJIIIZ(context, "context");
        String str2 = GameLivePartnershipDropsSchema.INSTANCE.getConfig().dropsAudienceList;
        if (str2.length() == 0) {
            return;
        }
        C29682Bks LIZ = C29683Bkt.LIZ(str2);
        String str3 = "1";
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJJI("is_red_dot", str);
        LIZ.LJJI("drops_id", this.LIZJ);
        LIZ.LJJI("entrance_page", "icon");
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
        String uri = LIZ.LIZ().toString();
        o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
        C05590Jv.LJ((IHybridContainerService) LIZ2, context, uri);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_drops_icon_click");
        LIZ3.LJIILLIIL(this.LJ);
        LIZ3.LJIJJ("normal", "icon_type");
        if (!z) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(str3, "is_red_dot");
        LIZ3.LJIJJ(this.LIZJ, "drops_id");
        LIZ3.LJJIIJZLJL();
    }

    public final void LJI(Context context, Room room, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        if (this.LIZJ.length() > 0 || this.LIZLLL) {
            LIZ(context, this.LIZJ, room, dataChannel, "rotate");
        }
    }

    @Override // X.InterfaceC28232B6e
    public final void LIZ(Context context, String promotingDropsId, Room room, DataChannel dataChannel, String loadSource) {
        Long l;
        Long l2;
        o.LJIIIZ(promotingDropsId, "promotingDropsId");
        o.LJIIIZ(loadSource, "loadSource");
        this.LJ = dataChannel;
        boolean z = false;
        if (promotingDropsId.length() == 0) {
            return;
        }
        C72818Shy.LIZLLL("gameAudienceRewardDrops", this.LJII);
        GameLivePartnershipDropsSetting gameLivePartnershipDropsSetting = GameLivePartnershipDropsSetting.INSTANCE;
        String str = gameLivePartnershipDropsSetting.getConfig().dropsCard;
        String str2 = gameLivePartnershipDropsSetting.getConfig().previewCard;
        if (!gameLivePartnershipDropsSetting.getConfig().enable || str.length() == 0) {
            return;
        }
        this.LIZJ = promotingDropsId;
        StringBuilder LIZJ = b1.LIZJ(str, "&drops_id=");
        LIZJ.append(this.LIZJ);
        LIZJ.append("&room_id=");
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZJ.append(l);
        LIZJ.append("&load_from=");
        LIZJ.append(loadSource);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        if (str2.length() > 0) {
            StringBuilder LIZJ2 = b1.LIZJ(str2, "&drops_id=");
            LIZJ2.append(this.LIZJ);
            LIZJ2.append("&room_id=");
            if (room != null) {
                l2 = Long.valueOf(room.getId());
            } else {
                l2 = null;
            }
            LIZJ2.append(l2);
            LIZJ2.append("&load_from=");
            LIZJ2.append(loadSource);
            X1D.LIZIZ(LIZJ2);
        }
        LJ();
        android.net.Uri parse = UriProtector.parse(LIZIZ);
        o.LJIIIIZZ(parse, "parse(dropsCardSchema)");
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.LJJLJ;
        Long lastTimestamp = c48459J0d.LIZJ();
        long currentTimeMillis = System.currentTimeMillis();
        o.LJIIIIZZ(lastTimestamp, "lastTimestamp");
        if (currentTimeMillis - lastTimestamp.longValue() >= 86400000) {
            c48459J0d.LIZ(Long.valueOf(currentTimeMillis));
            InterfaceC30442Bx8.LJJLIL.LIZ(0L);
        }
        C48459J0d<Long> c48459J0d2 = InterfaceC30442Bx8.LJJLIL;
        Long showedCnt = c48459J0d2.LIZJ();
        o.LJIIIIZZ(showedCnt, "showedCnt");
        if (showedCnt.longValue() < ((Number) this.LJI.getValue()).intValue()) {
            z = true;
            c48459J0d2.LIZ(Long.valueOf(showedCnt.longValue() + 1));
        }
        C31220CNc FX = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).FX(context, parse, "shortTouchGamePartnershipDrops", true);
        if (FX != null) {
            if (z) {
                C29701Eo c29701Eo = new C29701Eo(context);
                c29701Eo.setLayoutParams(new LinearLayout.LayoutParams(C87277YNd.LJIIJJI(70), C87277YNd.LJIIJJI(70)));
                this.LIZIZ = c29701Eo;
            }
            this.LIZ = XKX.LIZLLL(C780334l.LJLIL, null, null, new C3F(z, context, this, FX, null), 3);
        }
        this.LIZLLL = true;
        if (!InterfaceC30442Bx8.LJJLIIIJL.LIZJ().booleanValue()) {
            EnumC30204BtI.SHARE.showRedDot(dataChannel);
        }
        C30588BzU.LJI("show", loadSource);
    }
}
