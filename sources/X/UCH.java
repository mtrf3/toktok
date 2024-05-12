package X;

import a04.IDfS0S0100000_11;
import android.app.Application;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.widget.EditText;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class UCH implements BTW, O0Z, RTU, FFO, QMF, InterfaceC40796Fzk {
    public static volatile boolean LJLIL = false;
    public static int LJLILLLLZI = 3;
    public static int LJLJI;
    public static final UCH LJLJJI = new UCH();
    public static String LJLJJL;
    public static String LJLJJLL;

    public void LIZLLL(float f, float f2, C80423VhL c80423VhL) {
        throw null;
    }

    @Override // X.O0Z
    public void onComplete() {
    }

    public static final long LJ() {
        long j = C28652BMi.LIZLLL;
        if (1 <= j && j < 17) {
            return j;
        }
        return 999L;
    }

    @Override // X.QME
    public /* synthetic */ Object a() {
        return new C67554QfG("IntegrityService");
    }

    public static boolean LIZIZ(String str) {
        return FHE.LIZLLL.LJIIIZ().contains(str);
    }

    public static void LJFF(IDfS0S0100000_11 iDfS0S0100000_11) {
        PC5.LJLJJL = iDfS0S0100000_11;
        Context context = (Context) iDfS0S0100000_11.l0;
        if (context != null) {
            if (!(context instanceof Application)) {
                context = C16880lQ.LLLLL(context);
            }
            C78248UnM.LJLJJI = (Application) context;
        }
        PC5.LJLLL = System.currentTimeMillis();
        PC5.LJLLLL = System.currentTimeMillis();
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("APM init start in process ");
            LIZ.append(C09970aH.LIZIZ());
            C64028PAy.LIZ("APM-Hub", X1D.LIZIZ(LIZ));
        }
        C64028PAy.LIZ = new C64037PBh();
        PGH.LIZ.put(PG9.class, new C64216PIe());
    }

    public static String[] LJIIL(String str) {
        return FHE.LIZLLL.LIZLLL(str);
    }

    public String LJIILIIL(String str) {
        return FHE.LIZLLL.LJI(str, "_");
    }

    @Override // X.BTW
    public boolean canHandle(android.net.Uri uri) {
        String str;
        String str2 = null;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (!TextUtils.equals("webcast_gift_dialog", str)) {
            if (uri != null) {
                str2 = uri.getHost();
            }
            if (!TextUtils.equals("webcast_inroom_giftpanel", str2)) {
                return false;
            }
        }
        return true;
    }

    public static final int LJI(long j, DataChannel dataChannel) {
        if (C29306Beo.LJIIJ(dataChannel)) {
            return 0;
        }
        long j2 = C28652BMi.LIZLLL;
        long j3 = C28652BMi.LJ;
        int i = OnlineAudienceDisplayStrategySetting.INSTANCE.getValue().displayNumberN;
        if (j2 > 0 && j3 != 0) {
            long j4 = i;
            if (j2 <= j4 || j >= j2 - j4) {
                return 0;
            }
        }
        return 1;
    }

    public static final void LJIIIIZZ(long j, long j2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("to_user_id", String.valueOf(j));
        linkedHashMap.put("show_user_position", "top_active_user_rank");
        linkedHashMap.put("rank_position", "top_right");
        linkedHashMap.put("age_level", String.valueOf(j2));
        BZI LIZ = C28787BRn.LIZ("livesdk_l1_audience_show");
        LIZ.LJJIFFI(linkedHashMap);
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
    }

    public static boolean LJIIIZ(String str, boolean z) {
        return FHE.LIZLLL.LJII(str, z);
    }

    public static final void LJIILJJIL(EditText editText, double d) {
        if (editText == null) {
            return;
        }
        if (TextUtils.isEmpty(editText.getText().toString()) && editText.getHint() != null) {
            Paint paint = new Paint();
            paint.setTextSize(editText.getTextSize());
            paint.setTypeface(editText.getTypeface());
            int measureText = (int) ((editText.getLayoutParams().width - paint.measureText(editText.getHint().toString())) / 2);
            if (measureText < 0) {
                editText.setPaddingRelative(0, 0, 0, 0);
                editText.setGravity(8388659);
                return;
            } else {
                editText.setPaddingRelative(measureText, 0, 0, 0);
                editText.setGravity(8388627);
                return;
            }
        }
        editText.setGravity(17);
        editText.setPaddingRelative(C17N.LJIILL(d), 0, C17N.LJIILL(d), 0);
    }

    public Object LJIIJ(Class cls, String str) {
        return FHE.LIZLLL.LIZIZ(str, cls);
    }

    public int LJIIJJI(int i, String str) {
        return FHE.LIZLLL.LIZ(str, i);
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        return new OSZ(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r7 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = new X.C29428Bgm();
        r2.LIZIZ = r3;
        r2.LIZ = X.EnumC29607Bjf.GIFT;
        r2.LIZJ = r1;
        r2.LJI = true;
        ((com.bytedance.android.live.gift.IGiftService) X.CN1.LIZ(com.bytedance.android.live.gift.IGiftService.class)).openGiftDialogFromJSB(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        return true;
     */
    @Override // X.BTW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handle(android.content.Context r6, android.net.Uri r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L34
            java.lang.String r0 = "gift_id"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r7, r0)
            if (r0 == 0) goto L34
            long r3 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
        Le:
            java.lang.String r0 = "gift_enter_from"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r7, r0)
            if (r1 != 0) goto L18
        L16:
            java.lang.String r1 = ""
        L18:
            X.Bgm r2 = new X.Bgm
            r2.<init>()
            r2.LIZIZ = r3
            X.Bjf r0 = X.EnumC29607Bjf.GIFT
            r2.LIZ = r0
            r2.LIZJ = r1
            r1 = 1
            r2.LJI = r1
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
            r0.openGiftDialogFromJSB(r2)
            return r1
        L34:
            r3 = 0
            if (r7 == 0) goto L16
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UCH.handle(android.content.Context, android.net.Uri):boolean");
    }

    public static final void LJII(int i, CV6 item, DataChannel dataChannel) {
        long j;
        long j2;
        String str;
        String str2;
        LiveMode streamType;
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(item, "item");
        if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_top2_audience_slot_show")) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_top2_audience_slot_show");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        LIZ.LJIJJ(Long.valueOf(j), "anchor_id");
        Room room2 = (Room) dataChannel.kv0(RoomChannel.class);
        if (room2 != null) {
            j2 = room2.getId();
        } else {
            j2 = 0;
        }
        LIZ.LJIJJ(Long.valueOf(j2), "room_id");
        Room room3 = (Room) dataChannel.kv0(RoomChannel.class);
        if (room3 != null && (streamType = room3.getStreamType()) != null) {
            str = C28509BGv.LIZ(streamType);
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "live_type");
        LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
        if (C29306Beo.LJIIJ(dataChannel)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ.LJIJJ(str2, "user_type");
        if (C29306Beo.LJIIJ(dataChannel)) {
            LIZ.LJIJJ("null", "user_rank");
        } else {
            LIZ.LJIJJ(Long.valueOf(LJ()), "user_rank");
        }
        long j3 = item.LIZJ;
        if (j3 <= 0) {
            LIZ.LJIJJ("null", "to_user_rank");
            LIZ.LJIJJ("null", "to_user_coins");
            C78895Uxn.LIZIZ(LIZ, "null", "is_vague", 1, "is_empty");
        } else {
            LIZ.LJIJJ(Long.valueOf(j3), "to_user_rank");
            LIZ.LJIJJ(Long.valueOf(item.LIZIZ), "to_user_coins");
            LIZ.LJIJJ(Integer.valueOf(LJI(item.LIZJ, dataChannel)), "is_vague");
            LIZ.LJIJJ(0, "is_empty");
        }
        LIZ.LJIJJ(Integer.valueOf(i + 1), "slot_rank");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
    
        r10 = r8 - 1;
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0155, code lost:
    
        if (r12 > r10) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0157, code lost:
    
        r4 = r6.iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0161, code lost:
    
        if (r4.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0177, code lost:
    
        if (((X.G1A) r4.next()).type() != ((X.G1A) com.bytedance.mt.protector.impl.collections.ListProtector.get(r13, r10)).type()) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0181, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0179, code lost:
    
        if (r3 == (-1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017c, code lost:
    
        if (r10 == r12) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
    
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r6, r5 + 1, r7);
     */
    @Override // X.InterfaceC40796Fzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List LIZ(int r12, java.util.List r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UCH.LIZ(int, java.util.List, java.util.List):java.util.List");
    }

    @Override // X.BTW
    public boolean LIZJ(Context context, android.net.Uri uri, java.util.Map map) {
        handle(context, uri);
        return true;
    }
}
