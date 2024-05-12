package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.AbstractC29665Bkb;
import X.AbstractC73672Svk;
import X.B83;
import X.BZI;
import X.C06530Nl;
import X.C0JT;
import X.C113554cx;
import X.C15380j0;
import X.C16880lQ;
import X.C1A;
import X.C1EW;
import X.C25310z1;
import X.C28268B7o;
import X.C28787BRn;
import X.C28945BXp;
import X.C28954BXy;
import X.C29374Bfu;
import X.C29532BiS;
import X.C29534BiU;
import X.C29536BiW;
import X.C29563Bix;
import X.C29598BjW;
import X.C29600BjY;
import X.C29631Bk3;
import X.C29633Bk5;
import X.C29634Bk6;
import X.C29635Bk7;
import X.C29636Bk8;
import X.C29637Bk9;
import X.C29639BkB;
import X.C29640BkC;
import X.C29641BkD;
import X.C29643BkF;
import X.C29644BkG;
import X.C29646BkI;
import X.C29653BkP;
import X.C29656BkS;
import X.C29666Bkc;
import X.C30079BrH;
import X.C30868C9o;
import X.C31014CFe;
import X.C32537Cpp;
import X.C39685Fhp;
import X.C46104I7o;
import X.C47261Igj;
import X.C51029K0z;
import X.C55602Ge;
import X.C55612Gf;
import X.C5H3;
import X.C73411SrX;
import X.C73943T0h;
import X.C73969T1h;
import X.C78924UyG;
import X.C78996UzQ;
import X.C79004UzY;
import X.EnumC2323299w;
import X.EnumC30204BtI;
import X.InterfaceC29638BkA;
import X.InterfaceC29661BkX;
import X.InterfaceC92693kP;
import X.KL2;
import X.OJ4;
import X.ORZ;
import X.OSZ;
import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS17S0210000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.decoration.RoomDonationDecorationsEvent;
import com.bytedance.android.live.decoration.RoomStickerDecorationsEvent;
import com.bytedance.android.live.effect.api.RoomStickerFetchSuccessChannel;
import com.bytedance.android.live.effect.api.RoomStickerSpecialFetchSuccessChannel;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.event.DonationStickerAnchorEvent;
import com.bytedance.android.livesdk.chatroom.event.EditRoomStickerEvent;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SelectedDonationStickerChannel;
import com.bytedance.android.livesdk.dataChannel.UpdateStickerPositionEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAnchorEnableSettingNew;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAudienceEnableSetting;
import com.bytedance.android.livesdk.livesetting.decoration.StickerTstSetting;
import com.bytedance.android.livesdk.model.OrganizationModel;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class DecorationWrapperWidget extends LiveWidget implements InterfaceC29638BkA, InterfaceC29661BkX {
    public static boolean LL;
    public static boolean LLD;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public C29631Bk3 LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public Room LJLLI;
    public boolean LJLLJ;
    public C73411SrX LJLLL;
    public C73411SrX LJLLLL;
    public boolean LJLZ;
    public C29636Bk8 LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public int[] LJLJJL = new int[4];
    public int[] LJLJJLL = new int[4];
    public final List<AbstractC29665Bkb<?>> LJLJL = new ArrayList();
    public long LJLLILLLL = -1;
    public final C5H3 LJLLLLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 200));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnx;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC29661BkX
    public final void LJLL() {
        AbstractC29665Bkb<?> abstractC29665Bkb;
        Iterator<AbstractC29665Bkb<?>> it = this.LJLJL.iterator();
        while (true) {
            if (it.hasNext()) {
                abstractC29665Bkb = it.next();
                if (abstractC29665Bkb.getType() == 3) {
                    break;
                }
            } else {
                abstractC29665Bkb = null;
                break;
            }
        }
        AbstractC29665Bkb<?> abstractC29665Bkb2 = abstractC29665Bkb;
        if (abstractC29665Bkb2 != null) {
            abstractC29665Bkb2.LJLIIL(false);
        }
    }

    @Override // X.InterfaceC29661BkX
    public final void LJLLILLLL() {
        RoomSticker roomSticker;
        long j;
        DataChannel dataChannel = this.dataChannel;
        C29637Bk9 c29637Bk9 = C29598BjW.LIZLLL;
        if (c29637Bk9 != null && (roomSticker = c29637Bk9.LIZ) != null) {
            int i = !o.LJ(c29637Bk9.LIZIZ, Boolean.TRUE) ? 1 : 0;
            if (C29598BjW.LIZJ > 0) {
                j = SystemClock.elapsedRealtime() - C29598BjW.LIZJ;
            } else {
                j = 0;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_live_host_character_prop_use_time");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJIIJJI("live_take_detail");
            LIZ.LJIJJ(Integer.valueOf(roomSticker.LIZIZ ? 1 : 0), "is_remember");
            LIZ.LJJI("character", "prop_type", new AqS155S0100000_5(roomSticker, 373));
            LIZ.LJJI("picture", "prop_type", new AqS155S0100000_5(roomSticker, 374));
            LIZ.LJIJJ(C29598BjW.LIZ(Integer.valueOf(roomSticker.type)), "tab");
            LIZ.LJIJJ(Long.valueOf(roomSticker.id), "prop_id");
            LIZ.LJIJJ(roomSticker.name, "prop_name");
            C06530Nl.LIZLLL(LIZ, "video_live", "live_type", j, "use_time");
            C0JT.LIZJ(LIZ, roomSticker.LIZ, "resource_id", i, "is_origin_words");
        }
        C29598BjW.LIZJ = 0L;
        C29598BjW.LIZLLL = null;
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return DecorationWrapperWidget.class.getName();
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [X.0z1, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C29631Bk3 c29631Bk3;
        List<RoomDecoration> list;
        Long l;
        Long l2;
        List<RoomSticker> list2;
        Object obj;
        IMessage iMessage;
        C29631Bk3 c29631Bk32;
        DataChannel dataChannel;
        List<RoomSticker> roomStickerList;
        List<RoomSticker> roomStickerList2;
        User owner;
        List<RoomDecoration> decorationList;
        Context context;
        super.onCreate();
        if (isViewValid() && (context = this.context) != null) {
            int[] iArr = this.LJLJJL;
            iArr[0] = 0;
            iArr[1] = KL2.LJIIIZ(context) - C15380j0.LJFF(R.dimen.ahd);
            C15380j0.LJFF(R.dimen.aek);
            KL2.LIZJ(this.context, 10.0f);
            C15380j0.LJFF(R.dimen.a9g);
            int[] iArr2 = this.LJLJJL;
            iArr2[2] = 0;
            iArr2[3] = KL2.LJIIJJI(this.context);
            int[] iArr3 = this.LJLJJL;
            int[] copyOf = Arrays.copyOf(iArr3, iArr3.length);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            this.LJLJJLL = copyOf;
        }
        this.LJLLJ = false;
        this.LJLJLLL = o.LJ(this.dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        this.LJLLI = room;
        if (room != null) {
            c29631Bk3 = new C29631Bk3(room.getId());
        } else {
            c29631Bk3 = null;
        }
        this.LJLJLJ = c29631Bk3;
        if (c29631Bk3 != null) {
            c29631Bk3.attachView(this);
        }
        this.LJZ = new C29636Bk8(this.LJLJLLL);
        EnumC30204BtI.STICKER_DONATION.load(this.dataChannel, (C28945BXp) this.LJLLLLLL.getValue());
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, RoomStickerFetchSuccessChannel.class, C29532BiS.LJLIL);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.ov0(this, RoomStickerSpecialFetchSuccessChannel.class, C29534BiU.LJLIL);
        }
        Room room2 = this.LJLLI;
        if (room2 != null) {
            list = room2.getDecorationList();
        } else {
            list = null;
        }
        if (!C79004UzY.LJJIFFI(list)) {
            ArrayList arrayList = new ArrayList();
            Room room3 = this.LJLLI;
            if (room3 != null && (decorationList = room3.getDecorationList()) != null) {
                for (RoomDecoration decoration : decorationList) {
                    o.LJIIIIZZ(decoration, "decoration");
                    ImageModel imageModel = decoration.image;
                    long j = decoration.maxLength;
                    List<Long> inputRect = decoration.inputRect;
                    long j2 = decoration.status;
                    long j3 = decoration.kind;
                    List<Double> list3 = decoration.sit_rect;
                    o.LJIIIZ(inputRect, "inputRect");
                    RoomDecoration roomDecoration = new RoomDecoration(imageModel, j, inputRect, j2, j3, list3);
                    roomDecoration.id = decoration.id;
                    roomDecoration.LIZ = decoration.LIZ;
                    roomDecoration.type = decoration.type;
                    roomDecoration.content = decoration.content;
                    roomDecoration.textColor = decoration.textColor;
                    roomDecoration.textSize = decoration.textSize;
                    roomDecoration.x = decoration.x;
                    roomDecoration.y = decoration.y;
                    roomDecoration.screenWidth = decoration.screenWidth;
                    roomDecoration.screenHeight = decoration.screenHeight;
                    if (arrayList.add(roomDecoration)) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            View view = getView();
            if (view != null) {
                view.post(new ARunnableS24S0200000_5(arrayList, this, 64));
            }
            this.LJLL = true;
        }
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("user_id", Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        Room room4 = this.LJLLI;
        if (room4 != null) {
            l = Long.valueOf(room4.getId());
        } else {
            l = null;
        }
        oszArr[1] = new OSZ("room_id", l);
        Room room5 = this.LJLLI;
        if (room5 != null && (owner = room5.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        } else {
            l2 = null;
        }
        oszArr[2] = new OSZ("anchor_id", l2);
        oszArr[3] = new OSZ("user_type", Integer.valueOf(this.LJLJLLL ? 1 : 0));
        Map<? extends String, ? extends Object> LJJL = C113554cx.LJJL(oszArr);
        Map<String, Object> map = C29635Bk7.LIZ;
        ((LinkedHashMap) map).clear();
        map.putAll(LJJL);
        Room room6 = this.LJLLI;
        if (room6 != null) {
            list2 = room6.getRoomStickerList();
        } else {
            list2 = null;
        }
        if (!C79004UzY.LJJIFFI(list2)) {
            ArrayList arrayList2 = new ArrayList();
            Room room7 = this.LJLLI;
            if (room7 != null && (roomStickerList2 = room7.getRoomStickerList()) != null) {
                Iterator<RoomSticker> it = roomStickerList2.iterator();
                while (it.hasNext()) {
                    it.next().LIZIZ = true;
                }
            }
            Room room8 = this.LJLLI;
            if (room8 != null && (roomStickerList = room8.getRoomStickerList()) != null) {
                for (RoomSticker roomSticker : roomStickerList) {
                    o.LJIIIIZZ(roomSticker, "roomSticker");
                    RoomSticker LIZ = RoomSticker.LIZ(roomSticker);
                    LIZ.id = roomSticker.id;
                    LIZ.LIZ = roomSticker.LIZ;
                    LIZ.type = roomSticker.type;
                    LIZ.content = roomSticker.content;
                    LIZ.textColor = roomSticker.textColor;
                    LIZ.textSize = roomSticker.textSize;
                    LIZ.x = roomSticker.x;
                    LIZ.y = roomSticker.y;
                    LIZ.screenWidth = roomSticker.screenWidth;
                    LIZ.screenHeight = roomSticker.screenHeight;
                    if (arrayList2.add(LIZ)) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (this.LJLJLLL) {
                C29636Bk8 c29636Bk8 = this.LJZ;
                if (c29636Bk8 != null) {
                    c29636Bk8.LIZIZ(1, arrayList2);
                }
                RoomSticker roomSticker2 = (RoomSticker) ORZ.LJLLLL(arrayList2);
                if (roomSticker2 != null && roomSticker2.type == 4 && C46104I7o.LJJIJL(roomSticker2) && (dataChannel = this.dataChannel) != null) {
                    ((C32537Cpp) dataChannel.gv0(C55602Ge.class)).LIZ = new C25310z1(roomSticker2, roomSticker2.content);
                }
            }
            if ((!this.LJLJLLL && StickerAudienceEnableSetting.INSTANCE.getValue() == 1) || (this.LJLJLLL && StickerAnchorEnableSettingNew.INSTANCE.getValue() == 3)) {
                View view2 = getView();
                if (view2 != null) {
                    view2.post(new ARunnableS24S0200000_5(arrayList2, this, 65));
                }
                this.LJLL = true;
            }
        }
        C73943T0h.LIZ().LIZJ(this, C29563Bix.class).LIZIZ(new AfS57S0100000_5(this, 82));
        C73943T0h.LIZ().LIZJ(this, C29653BkP.class).LIZIZ(new AfS57S0100000_5(this, 80));
        DataChannel dataChannel4 = this.dataChannel;
        dataChannel4.mv0(LinkCrossRoomStateChangeEvent.class, this, new C29633Bk5(this));
        dataChannel4.ov0(this, UpdateStickerPositionEvent.class, new C29634Bk6(this));
        dataChannel4.lv0(this, RoomDonationDecorationsEvent.class, new C29640BkC(this));
        dataChannel4.lv0(this, RoomStickerDecorationsEvent.class, new C29641BkD(this));
        dataChannel4.lv0(this, SelectedDonationStickerChannel.class, new C29600BjY(this));
        if (this.LJLJLLL) {
            DataChannel dataChannel5 = this.dataChannel;
            if (dataChannel5 != null) {
                dataChannel5.ov0(this, MicRoomDisableInteractionEvent.class, new AqS171S0100000_5(this, 318));
            }
            DataChannel dataChannel6 = this.dataChannel;
            if (dataChannel6 != null) {
                dataChannel6.lv0(this, EditRoomStickerEvent.class, new AqS171S0100000_5(this, 319));
            }
        }
        if (this.LJLJLLL) {
            DataChannel dataChannel7 = this.dataChannel;
            if (dataChannel7 != null) {
                dataChannel7.lv0(this, PauseLiveChannel.class, new C29639BkB(this));
            }
        } else {
            C73943T0h.LIZ().LIZJ(this, C28268B7o.class).LIZIZ(new AfS57S0100000_5(this, 81));
        }
        Object[] objArr = this.args;
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C30079BrH) && (((obj = ((C30079BrH) obj2).LIZ) == null || (obj instanceof IMessage)) && (iMessage = (IMessage) obj) != null && (c29631Bk32 = this.LJLJLJ) != null)) {
                    c29631Bk32.onMessage(iMessage);
                }
            }
        }
    }

    public final void LLFFF() {
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS41S0100000_5(this, 137));
        }
    }

    public final void LLFII() {
        RoomDecoration roomDecoration;
        ViewGroup viewGroup;
        if (!isViewValid() || ((ArrayList) this.LJLJL).isEmpty() || getView() == null) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            AbstractC29665Bkb abstractC29665Bkb = (AbstractC29665Bkb) it.next();
            if (abstractC29665Bkb.getType() == 3) {
                View view = getView();
                if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                    C16880lQ.LJLLL(abstractC29665Bkb, viewGroup);
                }
                it.remove();
                if ((abstractC29665Bkb instanceof C29666Bkc) && (roomDecoration = (RoomDecoration) abstractC29665Bkb.getRoomDecoration()) != null) {
                    this.dataChannel.qv0(DonationStickerAnchorEvent.class, new C28954BXy(roomDecoration, false));
                }
            }
        }
    }

    public final void LLFZ() {
        ViewGroup viewGroup;
        if (!isViewValid() || ((ArrayList) this.LJLJL).isEmpty() || getView() == null) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            AbstractC29665Bkb abstractC29665Bkb = (AbstractC29665Bkb) it.next();
            if (abstractC29665Bkb.getType() == 4 || abstractC29665Bkb.getType() == 5 || abstractC29665Bkb.getType() == 6) {
                View view = getView();
                if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                    C16880lQ.LJLLL(abstractC29665Bkb, viewGroup);
                }
                it.remove();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        Object obj;
        List<RoomSticker> roomStickerList;
        super.onDestroy();
        this.LJLLJ = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        C29631Bk3 c29631Bk3 = this.LJLJLJ;
        if (c29631Bk3 != null) {
            c29631Bk3.detachView();
        }
        this.LJLLILLLL = -1L;
        LL = false;
        LLD = false;
        LLF(this.LJLLL);
        LLF(this.LJLLLL);
        if (this.LJLJLLL) {
            Room room = this.LJLLI;
            if (room != null && (roomStickerList = room.getRoomStickerList()) != null && (!roomStickerList.isEmpty())) {
                RoomSticker roomSticker = (RoomSticker) ORZ.LJLLLL(roomStickerList);
                List<AbstractC29665Bkb<?>> list = this.LJLJL;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC29665Bkb abstractC29665Bkb = (AbstractC29665Bkb) next;
                    if (roomSticker != null && abstractC29665Bkb.LJLIL.id == roomSticker.id) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    C29598BjW.LJIIIZ(this.dataChannel, roomSticker, Boolean.valueOf(!C29536BiW.LIZ(roomSticker, LLFF(roomSticker))));
                    C29598BjW.LIZ = 0L;
                    if (roomSticker != null && C46104I7o.LJJIJL(roomSticker)) {
                        C29598BjW.LJIIIIZZ(this.dataChannel, roomSticker, Boolean.valueOf(!C29536BiW.LIZ(roomSticker, LLFF(roomSticker))));
                    }
                    C29598BjW.LIZJ = 0L;
                }
            }
            DataChannel dataChannel2 = this.dataChannel;
            boolean z = this.LJLILLLLZI;
            boolean z2 = this.LJLIL;
            boolean z3 = this.LJLJJI;
            boolean z4 = this.LJLJI;
            String str = "use";
            if (z) {
                BZI LIZ = C28787BRn.LIZ("livesdk_live_character_prop_use");
                if (z3) {
                    obj = "use";
                } else {
                    obj = "unused";
                }
                LIZ.LJIJJ(obj, "use_status");
                LIZ.LJIIJJI("live_take_detail");
                LIZ.LJIIL("other");
                LIZ.LJIIIZ("live_take");
                LIZ.LJIILLIIL(dataChannel2);
                LIZ.LJJIIJZLJL();
            }
            if (z2) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_picture_prop_use");
                if (!z4) {
                    str = "unused";
                }
                LIZ2.LJIJJ(str, "use_status");
                LIZ2.LJIIJJI("live_take_detail");
                LIZ2.LJIIL("other");
                LIZ2.LJIIIZ("live_take");
                LIZ2.LJIILLIIL(dataChannel2);
                LIZ2.LJJIIJZLJL();
            }
        }
        C29635Bk7.LIZLLL = -1L;
        C29635Bk7.LJ = -1L;
        C29635Bk7.LIZIZ = -1L;
        C29635Bk7.LIZJ = -1L;
        EnumC30204BtI.STICKER_DONATION.unload(this.dataChannel);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        boolean LJ = o.LJ(Build.BRAND, "HUAWEI");
        if (this.LJLJLLL || !LJ) {
            return;
        }
        if (this.LJLL) {
            this.LJLL = false;
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        List<RoomSticker> roomStickerList;
        List<RoomDecoration> decorationList;
        super.onResume();
        boolean LJ = o.LJ(Build.BRAND, "HUAWEI");
        if (this.LJLJLLL || !LJ || this.LJLL) {
            return;
        }
        Room room = this.LJLLI;
        if (room != null && (decorationList = room.getDecorationList()) != null && (!decorationList.isEmpty())) {
            ArrayList LJII = C47261Igj.LJII(ListProtector.get(decorationList, 0));
            View view = getView();
            if (view != null) {
                view.post(new ARunnableS24S0200000_5(LJII, this, 64));
            }
        }
        Room room2 = this.LJLLI;
        if (room2 == null || (roomStickerList = room2.getRoomStickerList()) == null || !(!roomStickerList.isEmpty())) {
            return;
        }
        ArrayList LJII2 = C47261Igj.LJII(ListProtector.get(roomStickerList, 0));
        View view2 = getView();
        if (view2 == null) {
            return;
        }
        view2.post(new ARunnableS24S0200000_5(LJII2, this, 65));
    }

    @Override // X.InterfaceC29638BkA
    public final void qE() {
        if (!isViewValid() || this.LJLJLLL) {
            return;
        }
        LLFZ();
    }

    @Override // X.InterfaceC29638BkA
    public final List<AbstractC29665Bkb<?>> e90() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC29638BkA
    public final void Ap(RoomSticker roomSticker) {
        if (!isViewValid() || this.LJLJLLL || roomSticker == null) {
            return;
        }
        Room room = this.LJLLI;
        if (room != null) {
            room.setRoomStickerList(C47261Igj.LJJIJIL(roomSticker));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && o.LJ(dataChannel.kv0(PIPStatusData.class), Boolean.TRUE)) {
            return;
        }
        RoomSticker LIZ = RoomSticker.LIZ(roomSticker);
        LIZ.id = roomSticker.id;
        LIZ.LIZ = roomSticker.LIZ;
        LIZ.type = roomSticker.type;
        LIZ.content = roomSticker.content;
        LIZ.textColor = roomSticker.textColor;
        LIZ.textSize = roomSticker.textSize;
        LIZ.x = roomSticker.x;
        LIZ.y = roomSticker.y;
        LIZ.screenWidth = roomSticker.screenWidth;
        LIZ.screenHeight = roomSticker.screenHeight;
        LJZ(LIZ);
        if (this.LJLJLLL) {
            return;
        }
        C29598BjW.LIZLLL(this.dataChannel, LIZ);
    }

    @Override // X.InterfaceC29661BkX
    public final void LJJJLZIJ(RoomDecoration donationSticker) {
        o.LJIIIZ(donationSticker, "donationSticker");
        if (!isViewValid() || !this.LJLJLLL || donationSticker.type != 3) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            AbstractC29665Bkb abstractC29665Bkb = (AbstractC29665Bkb) it.next();
            if (abstractC29665Bkb.getType() == 3) {
                JSONArray jSONArray = new JSONArray();
                JSONObject decorationInfo = abstractC29665Bkb.getDecorationInfo();
                if (decorationInfo == null) {
                    return;
                }
                jSONArray.put(decorationInfo);
                C39685Fhp c39685Fhp = new C39685Fhp();
                c39685Fhp.LIZJ("deco_list", jSONArray.toString());
                HashMap map = (HashMap) c39685Fhp.LJLILLLLZI;
                C29631Bk3 c29631Bk3 = this.LJLJLJ;
                if (c29631Bk3 == null) {
                    return;
                }
                o.LJIIIIZZ(map, "map");
                c29631Bk3.LJJJJJ(abstractC29665Bkb.getType(), map);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // X.InterfaceC29661BkX
    public final void LJJLJ(boolean z) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(HideTitleLayoutEvent.class, new C29646BkI(z, EnumC2323299w.DECORATION_WRAPPER_WIDGET));
        }
    }

    @Override // X.InterfaceC29661BkX
    public final void LJLLJ(Sticker sticker) {
        boolean z;
        o.LJIIIZ(sticker, "sticker");
        if (!isViewValid()) {
            return;
        }
        LLF(this.LJLLL);
        LLF(this.LJLLLL);
        int i = sticker.type;
        if (i != 3) {
            if (i != 4 && i != 5 && i != 6) {
                return;
            }
            if (sticker instanceof RoomSticker) {
                RoomSticker roomSticker = (RoomSticker) sticker;
                z = C29536BiW.LIZ(roomSticker, LLFF(roomSticker));
            } else {
                z = false;
            }
            DataChannel dataChannel = this.dataChannel;
            RoomSticker roomSticker2 = (RoomSticker) sticker;
            Boolean valueOf = Boolean.valueOf(z);
            BZI LIZ = C28787BRn.LIZ("livesdk_live_prop_delete");
            LIZ.LJIJJ(Integer.valueOf(roomSticker2.LIZIZ ? 1 : 0), "is_remember");
            LIZ.LJIJJ(C29598BjW.LIZ(Integer.valueOf(roomSticker2.type)), "tab");
            LIZ.LJIJJ(Long.valueOf(roomSticker2.id), "prop_id");
            LIZ.LJIJJ(roomSticker2.name, "prop_name");
            LIZ.LJIJJ(roomSticker2.LIZ, "resource_id");
            LIZ.LJJI("character", "prop_type", new AqS155S0100000_5(roomSticker2, 375));
            LIZ.LJJI("picture", "prop_type", new AqS155S0100000_5(roomSticker2, 376));
            LIZ.LJIJJ(Integer.valueOf(!o.LJ(valueOf, Boolean.TRUE) ? 1 : 0), "is_origin_words");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJJIIJZLJL();
            C31014CFe.LJIIZILJ("");
            boolean z2 = !z;
            C29598BjW.LJIIIZ(this.dataChannel, roomSticker2, Boolean.valueOf(z2));
            C29598BjW.LIZ = 0L;
            if (sticker.type == 4 && C46104I7o.LJJIJL(roomSticker2)) {
                C29598BjW.LJIIIIZZ(this.dataChannel, roomSticker2, Boolean.valueOf(z2));
            }
            LLFZ();
            C29631Bk3 c29631Bk3 = this.LJLJLJ;
            if (c29631Bk3 != null) {
                C29635Bk7.LIZIZ = SystemClock.elapsedRealtime();
                C1EW.LIZ(((DecorationApi) C1A.LIZJ(DecorationApi.class)).deleteRoomStickers(roomSticker2.id, c29631Bk3.LJLIL)).LJJJLIIL(C29643BkF.LJLIL, new AfS57S0100000_5(c29631Bk3, 60));
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 == null) {
                return;
            }
            ((C32537Cpp) dataChannel2.gv0(C55612Gf.class)).LIZ = null;
            return;
        }
        LLFII();
        C29631Bk3 c29631Bk32 = this.LJLJLJ;
        if (c29631Bk32 == null) {
            return;
        }
        c29631Bk32.LJJJJJ(3, C51029K0z.LJJIIZI(new OSZ("deco_list", new JSONArray().toString())));
    }

    public final void LJLZ(RoomDecoration roomDecoration) {
        if (!isViewValid() || roomDecoration == null) {
            return;
        }
        LLFII();
        C29666Bkc c29666Bkc = new C29666Bkc(this.context, roomDecoration, this.LJLJLLL, this.LJLJJL, this, this.LJLLJ, this.dataChannel);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(DonationStickerAnchorEvent.class, new C28954BXy(roomDecoration, true));
        }
        long j = this.LJLLILLLL;
        if (j == -1 || j != roomDecoration.id) {
            OrganizationModel LIZ = roomDecoration.LIZ();
            C29598BjW.LJFF(this.dataChannel, "top_left_icon", LIZ);
            C29598BjW.LJFF(this.dataChannel, "donation_sticker", LIZ);
        }
        this.LJLLILLLL = roomDecoration.id;
        ((ArrayList) this.LJLJL).add(c29666Bkc);
        LJZI(c29666Bkc);
        if (!this.LJLJLLL) {
            return;
        }
        LL = true;
    }

    public final void LJZ(RoomSticker roomSticker) {
        if (!isViewValid() || roomSticker == null) {
            return;
        }
        LLFZ();
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        C29656BkS c29656BkS = new C29656BkS(context, roomSticker, this.LJLJLLL, this.LJLJJL, this, this.LJLLJ, this.LJZ, this.dataChannel);
        ((ArrayList) this.LJLJL).add(c29656BkS);
        LJZI(c29656BkS);
    }

    public final void LJZI(AbstractC29665Bkb abstractC29665Bkb) {
        boolean z;
        View view = getView();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (viewGroup.getChildCount() > 0 && (OJ4.LJJJJJ(C78924UyG.LIZLLL(viewGroup)) instanceof C29666Bkc) && (abstractC29665Bkb instanceof C29656BkS)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = -1;
            }
            viewGroup.addView(abstractC29665Bkb, i, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public final void LL(RoomSticker roomSticker) {
        if (roomSticker == null) {
            return;
        }
        LLF(this.LJLLLL);
        this.LJLLLL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(30L, TimeUnit.SECONDS).LJJL(C73969T1h.LIZIZ()).LJJJJZI(new AfS17S0210000_5(this, roomSticker, 2));
    }

    public final void LLF(InterfaceC92693kP interfaceC92693kP) {
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            interfaceC92693kP.dispose();
        }
    }

    public final String LLFF(RoomSticker roomSticker) {
        AbstractC29665Bkb<?> abstractC29665Bkb;
        if (roomSticker == null) {
            return null;
        }
        Iterator<AbstractC29665Bkb<?>> it = this.LJLJL.iterator();
        while (true) {
            if (it.hasNext()) {
                abstractC29665Bkb = it.next();
                if (abstractC29665Bkb.LJLIL.id == roomSticker.id) {
                    break;
                }
            } else {
                abstractC29665Bkb = null;
                break;
            }
        }
        AbstractC29665Bkb<?> abstractC29665Bkb2 = abstractC29665Bkb;
        if (abstractC29665Bkb2 == null || !(abstractC29665Bkb2 instanceof C29656BkS) || abstractC29665Bkb2.LJLIL.type != 4) {
            return null;
        }
        return ((C29656BkS) abstractC29665Bkb2).getContent();
    }

    @Override // X.InterfaceC29638BkA
    public final void nL(RoomSticker roomSticker) {
        AbstractC29665Bkb abstractC29665Bkb = (AbstractC29665Bkb) ORZ.LJLLLL(this.LJLJL);
        if (StickerTstSetting.INSTANCE.isTestEnable()) {
            if ((abstractC29665Bkb instanceof C29656BkS) && abstractC29665Bkb.getType() == 4 && roomSticker != null) {
                ((C29656BkS) abstractC29665Bkb).LJLLI(roomSticker.reviewStatus);
                return;
            }
            return;
        }
        if ((abstractC29665Bkb instanceof C29656BkS) && abstractC29665Bkb.getType() == 4 && roomSticker != null && C29536BiW.LJ(Long.valueOf(roomSticker.id))) {
            ((C29656BkS) abstractC29665Bkb).LJLLI(roomSticker.reviewStatus);
        }
    }

    public final void onEventPause(C28268B7o c28268B7o) {
        int i = c28268B7o.LIZ;
        if (i != 36) {
            if (i != 37) {
                return;
            }
            this.LJZI = false;
            LLFFF();
            return;
        }
        this.LJZI = true;
        LLFFF();
    }

    @Override // X.InterfaceC29638BkA
    public final void showToast(String str) {
        if (isViewValid() && str != null) {
            C30868C9o.LJFF(this.context, str);
        }
    }

    @Override // X.InterfaceC29638BkA
    public final void yN(List<RoomDecoration> list) {
        if (!isViewValid() || this.LJLJLLL || list == null) {
            return;
        }
        Room room = this.LJLLI;
        if (room != null) {
            room.setDecorationList(list);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && o.LJ(dataChannel.kv0(PIPStatusData.class), Boolean.TRUE)) {
            return;
        }
        LLFII();
        Iterator<RoomDecoration> it = list.iterator();
        while (it.hasNext()) {
            LJLZ(it.next());
        }
    }

    @Override // X.InterfaceC29661BkX
    public final void LJIILL(RoomSticker roomSticker, String str) {
        C29631Bk3 c29631Bk3;
        String str2;
        boolean z;
        List<String> list;
        List<String> list2;
        o.LJIIIZ(roomSticker, "roomSticker");
        if (!isViewValid() || !this.LJLJLLL || (c29631Bk3 = this.LJLJLJ) == null) {
            return;
        }
        ImageModel imageModel = roomSticker.image;
        String str3 = null;
        if (imageModel != null && (list2 = imageModel.mUrls) != null) {
            str2 = (String) ListProtector.get(list2, 0);
        } else {
            str2 = null;
        }
        String LJJJJIZL = C29631Bk3.LJJJJIZL(str2);
        ImageModel imageModel2 = roomSticker.ninePatchImage;
        if (imageModel2 != null && (list = imageModel2.mUrls) != null) {
            str3 = (String) ListProtector.get(list, 0);
        }
        String LJJJJIZL2 = C29631Bk3.LJJJJIZL(str3);
        if (roomSticker.type == 4 && C29536BiW.LJ(Long.valueOf(roomSticker.id))) {
            List list3 = C29536BiW.LIZ;
            if (list3 != null) {
                z = C29536BiW.LIZIZ(str, Long.valueOf(roomSticker.id), list3);
            } else {
                z = roomSticker.edited;
            }
            if (str == null || str.length() == 0) {
                return;
            }
            String sb = new StringBuilder(str).toString();
            o.LJIIIIZZ(sb, "StringBuilder(realUploadContent).toString()");
            if (C29536BiW.LIZJ(sb) || ujb.o.LJJJJZ(sb, " ", "", false).length() == 0) {
                return;
            }
        } else {
            str = roomSticker.content;
            z = false;
        }
        int i = roomSticker.type;
        if (i == 6) {
            i = 5;
        }
        Map<String, Object> LJJL = C113554cx.LJJL(new OSZ("room_id", Long.valueOf(c29631Bk3.LJLIL)), new OSZ("id", Long.valueOf(roomSticker.id)), new OSZ("name", roomSticker.name), new OSZ("type", Integer.valueOf(i)), new OSZ("content", str), new OSZ("content_key", roomSticker.contentKey), new OSZ("text_size", Integer.valueOf(roomSticker.textSize)), new OSZ("text_color", roomSticker.textColor), new OSZ("image_uri", LJJJJIZL), new OSZ("nine_patch_image_uri", LJJJJIZL2), new OSZ("x", Integer.valueOf(roomSticker.x)), new OSZ("y", Integer.valueOf(roomSticker.y)), new OSZ("w", Integer.valueOf(roomSticker.screenWidth)), new OSZ("h", Integer.valueOf(roomSticker.screenHeight)), new OSZ("top_left_h", Integer.valueOf(roomSticker.topLeftHeight)), new OSZ("top_left_w", Integer.valueOf(roomSticker.topLeftWidth)), new OSZ("bottom_right_h", Integer.valueOf(roomSticker.bottomRightHeight)), new OSZ("bottom_right_w", Integer.valueOf(roomSticker.bottomRightWidth)), new OSZ("edited", Boolean.valueOf(z)));
        C29635Bk7.LIZJ = SystemClock.elapsedRealtime();
        C1EW.LIZ(((DecorationApi) C1A.LIZJ(DecorationApi.class)).setRoomStickers(LJJL)).LJJJLIIL(C29644BkG.LJLIL, new AfS57S0100000_5(c29631Bk3, 62));
    }

    public final void LJZL(RoomSticker roomSticker, boolean z) {
        if (roomSticker == null) {
            return;
        }
        LLF(this.LJLLL);
        this.LJLLL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(30L, TimeUnit.SECONDS).LJJL(C73969T1h.LIZIZ()).LJJJJZI(new AfS17S0210000_5(this, roomSticker, z, 0));
    }
}
