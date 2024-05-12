package X;

import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3UseTimeFixSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveSlardarTagSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.BTw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28848BTw implements BZJ {
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(BU7.LJLIL);
    public static final java.util.Map<Class<? extends Object>, BU3<? extends Object>> LJIIJJI = C113554cx.LJJL(new OSZ(C78126UlO.class, new C32815CuJ()), new OSZ(BU6.class, new BU0()), new OSZ(BU8.class, new C28850BTy()), new OSZ(C32041Chp.class, new C32040Cho()), new OSZ(C32039Chn.class, new C32038Chm()), new OSZ(C28837BTl.class, new C28836BTk()), new OSZ(C28246B6s.class, new BJK()), new OSZ(C28649BMf.class, new C28651BMh()));
    public static final BU5 LJIIL = new BU5();
    public static final LinkedBlockingQueue<java.util.Map<String, String>> LJIILIIL = new LinkedBlockingQueue<>(128);
    public static boolean LJIILJJIL;
    public String LIZIZ;
    public final boolean LIZJ;
    public final List<Object> LIZLLL;
    public final java.util.Map<String, String> LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final List<String> LJIIIZ;

    @Override // X.BZJ
    public final C28848BTw LIZIZ() {
        this.LJI = true;
        this.LJII = false;
        this.LJIIIIZZ = false;
        return this;
    }

    @Override // X.BZJ
    public final void LIZJ() {
        this.LJFF = true;
        LJIIJ();
    }

    @Override // X.BZJ
    public final C28848BTw LJIILIIL() {
        this.LJII = true;
        return this;
    }

    @Override // X.BZJ
    public final java.util.Map<String, String> LJ() {
        LIZLLL(DataChannelGlobal.LJLJJI.mv0(C29049Baf.class));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILLIIL(linkedHashMap);
        return linkedHashMap;
    }

    @Override // X.BZJ
    public final C28848BTw LJI() {
        boolean z;
        String str;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        LJIILL(BJM.LJFF(), "enter_from_merge");
        LJIILL(BJM.LJIIIIZZ(), "enter_method");
        LJIILL(String.valueOf(BJM.LJIILJJIL()), "room_id");
        LJIILL(String.valueOf(BJM.LJ()), "anchor_id");
        LJIILL(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        LJIILL(str, "user_type");
        return this;
    }

    @Override // X.BZJ
    public final void LJIIJ() {
        String key;
        if (o.LJ(DataChannelGlobal.LJLJJI.mv0(C29032BaO.class), Boolean.TRUE) && !this.LJIIIZ.contains(this.LIZIZ)) {
            if (ujb.o.LJJJLIIL(this.LIZIZ, "livesdk_trymode_", false)) {
                key = this.LIZIZ;
            } else if (ujb.o.LJJJLIIL(this.LIZIZ, "livesdk_", false)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("livesdk_trymode_");
                LIZ.append(s.LJJLL("livesdk_", this.LIZIZ));
                key = X1D.LIZIZ(LIZ);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("livesdk_trymode_");
                LIZ2.append(this.LIZIZ);
                key = X1D.LIZIZ(LIZ2);
            }
        } else if (!this.LIZJ || ujb.o.LJJJLIIL(this.LIZIZ, "livesdk_", false)) {
            key = this.LIZIZ;
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("livesdk_");
            LIZ3.append(this.LIZIZ);
            key = X1D.LIZIZ(LIZ3);
        }
        this.LIZIZ = key;
        o.LJIIIZ(key, "key");
        if (LiveSlardarTagSetting.INSTANCE.getCurrentValue().enable) {
            ((C65816PsK) C29121Bbp.LIZJ.getValue()).LIZ(key);
        }
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            C39202Fa2.LIZJ().submit(new ARunnableS41S0100000_5(this, 201));
        } else {
            ((Handler) LJIIJ.getValue()).post(new ARunnableS41S0100000_5(this, 202));
        }
    }

    @Override // X.BZJ
    public final C28848BTw LJIIJJI() {
        String str = BU2.LIZIZ;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJIILL(str, "sticker_id");
        String str3 = BU2.LIZJ;
        if (str3 == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIILL(str3, "sticker_resource_id");
        String str4 = BU2.LJFF;
        if (str4 == null) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIILL(str4, "filter_id");
        String str5 = BU2.LJI;
        if (str5 == null) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIILL(str5, "filter_resource_id");
        if (BU2.LJII) {
            str2 = "1";
        }
        LJIILL(str2, "beauty_use_status");
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x032d, code lost:
    
        if (X.C28848BTw.LJIILIIL.offer(r6) == false) goto L178;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.BTw] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ() {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28848BTw.LJIIZILJ():void");
    }

    @Override // X.BZJ
    public final String getEventName() {
        if (!this.LIZJ || ujb.o.LJJJLIIL(this.LIZIZ, "livesdk_", false)) {
            return this.LIZIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("livesdk_");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.BZJ
    public final C28848BTw LIZ(java.util.Map map) {
        if (map != null) {
            this.LJ.putAll(map);
        }
        return this;
    }

    @Override // X.BZJ
    public final void LIZLLL(Object obj) {
        if (obj != null) {
            ((ArrayList) this.LIZLLL).add(obj);
        }
    }

    @Override // X.BZJ
    public final C28848BTw LJFF(boolean z) {
        String str;
        String str2;
        String invoke;
        String invoke2;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        if (z) {
            InterfaceC65784Pro<String> interfaceC65784Pro = BU9.LJ;
            if (interfaceC65784Pro == null || (str5 = interfaceC65784Pro.invoke()) == null) {
                str5 = "";
            }
            LJIILL(str5, "guest_event_page");
        }
        InterfaceC65784Pro<String> interfaceC65784Pro2 = BU9.LIZ;
        if (interfaceC65784Pro2 != null && (invoke2 = interfaceC65784Pro2.invoke()) != null && invoke2.length() > 0) {
            InterfaceC65784Pro<String> interfaceC65784Pro3 = BU9.LJ;
            if (interfaceC65784Pro3 == null || (str3 = interfaceC65784Pro3.invoke()) == null) {
                str3 = "";
            }
            if (o.LJ(str3, "connection_status")) {
                InterfaceC65784Pro<String> interfaceC65784Pro4 = BU9.LIZ;
                if (interfaceC65784Pro4 == null || (str4 = interfaceC65784Pro4.invoke()) == null) {
                    str4 = "";
                }
                LJIILL(str4, "guest_invite_type");
            }
        }
        InterfaceC65784Pro<String> interfaceC65784Pro5 = BU9.LIZIZ;
        if (interfaceC65784Pro5 == null || (str = interfaceC65784Pro5.invoke()) == null) {
            str = "";
        }
        LJIILL(str, "link_id");
        InterfaceC65784Pro<String> interfaceC65784Pro6 = BU9.LIZJ;
        if (interfaceC65784Pro6 == null || (str2 = interfaceC65784Pro6.invoke()) == null) {
            str2 = "";
        }
        LJIILL(str2, "window_setting");
        InterfaceC65784Pro<String> interfaceC65784Pro7 = BU9.LIZLLL;
        if (interfaceC65784Pro7 != null && (invoke = interfaceC65784Pro7.invoke()) != null) {
            str6 = invoke;
        }
        LJIILL(str6, "layout_setting");
        return this;
    }

    @Override // X.BZJ
    public final C28848BTw LJII(InterfaceC88472Yns callBack) {
        boolean z;
        o.LJIIIZ(callBack, "callBack");
        if (LinkMicMultiGuestV3UseTimeFixSetting.INSTANCE.getValue()) {
            String LJIIIZ = LJIIIZ("link_id");
            if (LJIIIZ == null || LJIIIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            callBack.invoke(Boolean.valueOf(z));
        }
        return this;
    }

    @Override // X.BZJ
    public final String LJIIIZ(String str) {
        return (String) ((LinkedHashMap) this.LJ).get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r4 != null) goto L6;
     */
    @Override // X.BZJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C28848BTw LJIILJJIL(com.bytedance.ies.sdk.datachannel.DataChannel r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L39
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel> r0 = com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel.class
            java.lang.Object r0 = r4.kv0(r0)
            com.bytedance.android.livesdk.model.Hashtag r0 = (com.bytedance.android.livesdk.model.Hashtag) r0
            if (r0 == 0) goto L39
            java.lang.String r2 = r0.title
        Le:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel> r0 = com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel.class
            java.lang.Object r0 = r4.kv0(r0)
            com.bytedance.android.livesdk.model.Hashtag r0 = (com.bytedance.android.livesdk.model.Hashtag) r0
            if (r0 == 0) goto L3d
            java.lang.Long r0 = r0.id
            if (r0 == 0) goto L3d
            long r0 = r0.longValue()
        L20:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "choose_hashtag_id"
            r3.LJIILL(r1, r0)
            if (r2 == 0) goto L31
            int r0 = r2.length()
            if (r0 != 0) goto L33
        L31:
            java.lang.String r2 = "none"
        L33:
            java.lang.String r0 = "choose_hashtag_name"
            r3.LJIILL(r2, r0)
            return r3
        L39:
            r2 = 0
            if (r4 == 0) goto L3d
            goto Le
        L3d:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28848BTw.LJIILJJIL(com.bytedance.ies.sdk.datachannel.DataChannel):X.BTw");
    }

    public final void LJIILLIIL(java.util.Map<String, String> map) {
        BU3<? extends Object> bu3;
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            BU3<? extends Object> bu32 = LJIIJJI.get(next.getClass());
            if ((bu32 instanceof BU3) && (bu3 = bu32) != null) {
                bu3.LIZ(next, map);
            }
        }
    }

    public C28848BTw(String eventName, boolean z) {
        o.LJIIIZ(eventName, "eventName");
        this.LIZIZ = eventName;
        this.LIZJ = z;
        this.LIZLLL = new ArrayList();
        this.LJ = new LinkedHashMap();
        this.LJII = true;
        this.LJIIIIZZ = true;
        this.LJIIIZ = C47261Igj.LJJIJIIJI("live_action", "livesdk_live_action", "live_take", "livesdk_live_take");
    }

    @Override // X.BZJ
    public final /* bridge */ /* synthetic */ C28848BTw LJIIIIZZ(Object obj, String str) {
        LJIILL(obj, str);
        return this;
    }

    public final void LJIILL(Object obj, String key) {
        o.LJIIIZ(key, "key");
        if (obj != null) {
            this.LJ.put(key, obj.toString());
        }
    }

    @Override // X.BZJ
    public final C28848BTw LJIIL(Object obj, String str, InterfaceC65784Pro predicate) {
        o.LJIIIZ(predicate, "predicate");
        if (((Boolean) predicate.invoke()).booleanValue()) {
            LJIILL(obj, str);
        }
        return this;
    }
}
