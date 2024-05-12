package X;

import android.content.Context;
import com.bytedance.android.livesdk.dialog.CommonBottomConfirmDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BgD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29393BgD implements InterfaceC28832BTg {
    public static void LIZLLL(Context context, EnterRoomConfig enterRoomConfig) {
        EnterRoomLinkSession.LJI(enterRoomConfig).LIZIZ(new Event("multi_live_activity_page_enter_room", 5632, EnumC28203B5b.BussinessApiCall));
        if (enterRoomConfig.mRoomsData.roomId > 0) {
            InterfaceC06390Mx LIZ = CN1.LIZ(IHostWatch.class);
            o.LJIIIIZZ(LIZ, "getService(T::class.java)");
            ((IHostWatch) LIZ).watchLiveFromSchema(context, enterRoomConfig);
        }
    }

    @Override // X.InterfaceC28832BTg
    public final boolean LIZIZ(android.net.Uri uri, EnterRoomConfig enterRoomConfig) {
        if (uri != null && UriProtector.getQueryParameter(uri, "multilive_type") != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC28832BTg
    public final boolean LIZ(Context context, android.net.Uri uri, EnterRoomConfig enterRoomConfig) {
        boolean z;
        long[] LLJIJIL;
        int i;
        int i2;
        o.LJIIIZ(context, "context");
        if (uri == null) {
            return false;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            z = true;
        } else {
            z = false;
        }
        if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            ActivityC45651qj LIZ = C29306Beo.LIZ(context);
            C29356Bfc c29356Bfc = new C29356Bfc();
            c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.syn);
            c29356Bfc.LIZLLL = "interact";
            c29356Bfc.LIZJ = 0;
            ((C29374Bfu) LIZIZ).LIZLLL(LIZ, new C29377Bfx(c29356Bfc)).LIZ(new C29355Bfb());
            return false;
        }
        if (!z || room == null || room.getOwnerUserId() == 0 || room.getOwnerUserId() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            String queryParameter = UriProtector.getQueryParameter(uri, "multilive_type");
            String str = CardStruct.IStatusCode.DEFAULT;
            if (queryParameter == null) {
                queryParameter = CardStruct.IStatusCode.DEFAULT;
            }
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            if (o.LJ(queryParameter, "1")) {
                str = "1";
            }
            roomsData.enterForMultiLive = str;
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            long[] jArr = roomsData2.roomIds;
            if (jArr == null) {
                LLJIJIL = null;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (long j : jArr) {
                    linkedHashSet.add(Long.valueOf(j));
                }
                LLJIJIL = ORZ.LLJIJIL(linkedHashSet);
            }
            roomsData2.roomIds = LLJIJIL;
            if (o.LJ(queryParameter, "1")) {
                AqS94S0300000_5 aqS94S0300000_5 = new AqS94S0300000_5(this, context, enterRoomConfig, 5);
                boolean z2 = C74838TYs.LJ().LJIIIIZZ;
                int i3 = R.string.knv;
                if (z2) {
                    if (z) {
                        if (C74740TUy.LIZLLL().LJ()) {
                            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.kny);
                            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_connecting3)");
                            C30868C9o.LJI(LJIILJJIL);
                            return false;
                        }
                        if (C74740TUy.LIZLLL().LJFF()) {
                            LIZJ(context, R.string.oje, R.string.l5j, R.string.knv, new AqS155S0100000_5(aqS94S0300000_5, 74));
                        } else {
                            LIZJ(context, R.string.ojf, R.string.ojg, R.string.knv, new AqS155S0100000_5(room, 75));
                        }
                    }
                } else if (z) {
                    i2 = R.string.l5i;
                    i3 = R.string.knu;
                    LIZJ(context, R.string.ojd, i2, i3, new AqS155S0100000_5(aqS94S0300000_5, 76));
                }
                i2 = R.string.l5k;
                LIZJ(context, R.string.ojd, i2, i3, new AqS155S0100000_5(aqS94S0300000_5, 76));
            } else {
                AqS94S0300000_5 aqS94S0300000_52 = new AqS94S0300000_5(this, context, enterRoomConfig, 6);
                if (C74838TYs.LJ().LJIIIIZZ) {
                    if (z) {
                        C30868C9o.LIZJ(R.string.nii);
                        return false;
                    }
                } else if (z) {
                    i = R.string.l5h;
                    LIZJ(context, R.string.ojc, i, R.string.knt, new AqS155S0100000_5(aqS94S0300000_52, 77));
                }
                i = R.string.l5l;
                LIZJ(context, R.string.ojc, i, R.string.knt, new AqS155S0100000_5(aqS94S0300000_52, 77));
            }
            return true;
        }
        C30868C9o.LIZJ(R.string.sx7);
        return false;
    }

    public static void LIZJ(Context context, int i, int i2, int i3, InterfaceC65784Pro interfaceC65784Pro) {
        ActivityC45651qj LIZJ = C29306Beo.LIZJ(context);
        if (LIZJ == null) {
            interfaceC65784Pro.invoke();
            return;
        }
        C29395BgF c29395BgF = new C29395BgF(i, i2, i3, interfaceC65784Pro);
        CommonBottomConfirmDialog commonBottomConfirmDialog = new CommonBottomConfirmDialog(LIZJ);
        c29395BgF.invoke(commonBottomConfirmDialog);
        C29306Beo.LJJJJIZL(commonBottomConfirmDialog);
    }
}
