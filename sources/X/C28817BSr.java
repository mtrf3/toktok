package X;

import Y.AfS1S0200100_5;
import android.content.Context;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.impl.revenue.portal.request.PortalApi;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import webcast.api.envelope.PortalListResponse;

/* renamed from: X.BSr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28817BSr extends AbstractC32579CqV {
    public static final /* synthetic */ int LJLZ = 0;
    public final DataChannel LJLJL;
    public final java.util.Set<Integer> LJLJLJ;
    public boolean LJLJLLL;
    public final String LJLL;
    public final List<Long> LJLLI;
    public final ReentrantLock LJLLILLLL;
    public boolean LJLLJ;
    public String LJLLL;
    public final C28818BSs LJLLLL;
    public final C28816BSq LJLLLLLL;

    @Override // X.AbstractC32579CqV
    public final void LJIILL() {
        String str;
        long j;
        boolean z;
        Boolean bool;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        IMessageManager iMessageManager;
        this.LJLLJ = false;
        C72818Shy.LIZLLL("LIVE_PORTAL_CREATE", this.LJLLLL);
        C72818Shy.LIZLLL("LIVE_PORTAL_CLOSE_ALL", this.LJLLLL);
        C72818Shy.LIZLLL("EVENT_OPEN_PORTAL_DETAIL", this.LJLLLL);
        DataChannel dataChannel = this.LJLJL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.ENVELOPE_PORTAL_MESSAGE.getIntType(), this.LJLLLLLL);
        }
        ArrayList arrayList = new ArrayList();
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        long currentTimeMillis = System.currentTimeMillis();
        boolean LJJI = LJJI();
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        if (LJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str);
        B83 LIZ = B83.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_portal_list_request");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIJJI("live_detail");
        LIZ2.LJIIL("click");
        LIZ2.LJIIIZ("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZI();
        }
        C0K2.LJFF("ttlive_portal_list_request", hashMap, new HashMap(), new HashMap());
        C65814PsI.LIZ().getClass();
        PortalApi portalApi = (PortalApi) C65814PsI.LIZJ(PortalApi.class);
        long LJJIZ = C29306Beo.LJJIZ(this.LJLJL);
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(this.LJLJL);
        if (LJJIJLIJ != null) {
            j = LJJIJLIJ.getOwnerUserId();
        } else {
            j = 0;
        }
        AbstractC73638SvC<C28467BFf<PortalListResponse.ResponseData>> portalList = portalApi.getPortalList(LJJIZ, j);
        if (portalList != null) {
            c73318Sq2.LIZ(T28.LIZLLL(portalList).LJJII(new AfS1S0200100_5(currentTimeMillis, this, arrayList, 6), new InterfaceC64592gB() { // from class: X.9DU
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }));
        }
        DataChannel dataChannel2 = this.LJLJL;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(BCW.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.LJLJLLL = z;
    }

    public final boolean LJJI() {
        Boolean bool;
        DataChannel dataChannel = this.LJLJL;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.AbstractC32579CqV
    public final void LJIJJ() {
        IMessageManager iMessageManager;
        super.LJIJJ();
        this.LJLLJ = true;
        C72818Shy.LJII("LIVE_PORTAL_CREATE", this.LJLLLL);
        C72818Shy.LJII("LIVE_PORTAL_CLOSE_ALL", this.LJLLLL);
        C72818Shy.LJII("EVENT_OPEN_PORTAL_DETAIL", this.LJLLLL);
        DataChannel dataChannel = this.LJLJL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.ENVELOPE_PORTAL_MESSAGE.getIntType(), this.LJLLLLLL);
        }
        this.LJLLI.clear();
    }

    public C28817BSr(Context context, DataChannel dataChannel) {
        super(context, EnumC28819BSt.PORTAL_LEAF.getZIndex());
        this.LJLJL = dataChannel;
        this.LJLJLJ = new LinkedHashSet();
        this.LJLJLLL = true;
        this.LJLL = "portal_door";
        this.LJLLI = C47261Igj.LJJIJIL(20L);
        this.LJLLILLLL = new ReentrantLock();
        this.LJLLLL = new C28818BSs(this);
        this.LJLLLLLL = new C28816BSq(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x025b, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cf, code lost:
    
        r0 = "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch_people%2Ftemplate.js";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0148, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ae, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b0, code lost:
    
        r0 = "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch_portal%2Ftemplate.js";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, android.animation.Animator, android.animation.ValueAnimator] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, X.1Eo, android.view.View, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIFFI(X.C28817BSr r32, X.InterfaceC28808BSi r33, com.bytedance.android.live.base.model.ImageModel r34, int r35, int r36, com.bytedance.android.livesdk.model.EnvelopePortalMessage r37, int r38) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28817BSr.LJJIFFI(X.BSr, X.BSi, com.bytedance.android.live.base.model.ImageModel, int, int, com.bytedance.android.livesdk.model.EnvelopePortalMessage, int):void");
    }
}
