package X;

import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAudienceEnableSetting;
import com.bytedance.android.livesdk.model.DonationSticker;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.message.DecorationModifyMessage;
import com.bytedance.android.livesdk.model.message.RoomStickerMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Bk3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29631Bk3 extends AbstractC31497CXt<InterfaceC29638BkA> implements OnMessageListener {
    public final long LJLIL;

    public C29631Bk3(long j) {
        this.LJLIL = j;
    }

    public static final String LJJJJI(int i) {
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        if (context == null) {
            return "";
        }
        String string = context.getString(R.string.spi);
        o.LJIIIIZZ(string, "context.getString(id)");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return string;
    }

    public static String LJJJJIZL(String str) {
        if (str != null) {
            List LJLJJI = s.LJLJJI(str, new char[]{'/'}, false, 6);
            int size = LJLJJI.size();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) ListProtector.get(LJLJJI, size - 2));
            LIZ.append('/');
            LIZ.append((String) ListProtector.get(LJLJJI, size - 1));
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC29638BkA interfaceC29638BkA) {
        super.attachView((C29631Bk3) interfaceC29638BkA);
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.MODIFY_DECORATION.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.mMessageManager;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.MODIFY_STICKER.getIntType(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage message) {
        InterfaceC29638BkA interfaceC29638BkA;
        List<AbstractC29665Bkb<?>> e90;
        InterfaceC29638BkA interfaceC29638BkA2;
        o.LJIIIZ(message, "message");
        EnumC31509CYf messageType = ((BaseMessage) message).getMessageType();
        if (messageType == null) {
            return;
        }
        int i = C29642BkE.LIZ[messageType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (StickerAudienceEnableSetting.INSTANCE.getValue() == 1 && (message instanceof RoomStickerMessage)) {
                RoomStickerMessage roomStickerMessage = (RoomStickerMessage) message;
                if (C79004UzY.LJJIFFI(roomStickerMessage.stickerList)) {
                    InterfaceC29638BkA interfaceC29638BkA3 = (InterfaceC29638BkA) this.mView;
                    if (interfaceC29638BkA3 != null) {
                        interfaceC29638BkA3.qE();
                    }
                } else {
                    InterfaceC29638BkA interfaceC29638BkA4 = (InterfaceC29638BkA) this.mView;
                    if (interfaceC29638BkA4 != null) {
                        interfaceC29638BkA4.Ap((RoomSticker) ListProtector.get(roomStickerMessage.stickerList, 0));
                    }
                }
            }
            if (!(message instanceof RoomStickerMessage)) {
                return;
            }
            RoomStickerMessage roomStickerMessage2 = (RoomStickerMessage) message;
            List<RoomSticker> list = roomStickerMessage2.stickerList;
            if (list != null && !list.isEmpty()) {
                List<RoomSticker> list2 = roomStickerMessage2.stickerList;
                o.LJIIIIZZ(list2, "message.roomSticker");
                if (ORZ.LJLLLL(list2) == null) {
                    return;
                }
                if (o.LJ(this.dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE) && (interfaceC29638BkA2 = (InterfaceC29638BkA) this.mView) != null) {
                    List<RoomSticker> list3 = roomStickerMessage2.stickerList;
                    o.LJIIIIZZ(list3, "message.roomSticker");
                    interfaceC29638BkA2.nL((RoomSticker) ORZ.LJLLLL(list3));
                }
            }
            List<RoomSticker> list4 = ((RoomStickerMessage) message).stickerList;
            o.LJIIIIZZ(list4, "message.roomSticker");
            RoomSticker roomSticker = (RoomSticker) ORZ.LJLLLL(list4);
            if (roomSticker == null) {
                return;
            }
            C29598BjW.LJ(this.dataChannel, roomSticker, Boolean.TRUE, roomSticker.reviewStatus, "im");
            if (!C46104I7o.LJJIJL(roomSticker)) {
                return;
            }
            InterfaceC29638BkA interfaceC29638BkA5 = (InterfaceC29638BkA) this.mView;
            AbstractC29665Bkb<?> abstractC29665Bkb = null;
            if (interfaceC29638BkA5 != null && (e90 = interfaceC29638BkA5.e90()) != null) {
                Iterator<AbstractC29665Bkb<?>> it = e90.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC29665Bkb<?> next = it.next();
                    if (next.getType() == 4) {
                        abstractC29665Bkb = next;
                        break;
                    }
                }
                abstractC29665Bkb = abstractC29665Bkb;
            }
            if (!(abstractC29665Bkb instanceof C29656BkS)) {
                return;
            }
            C29598BjW.LJII(this.dataChannel, roomSticker, Boolean.valueOf(C29536BiW.LIZ(roomSticker, ((C29656BkS) abstractC29665Bkb).getContent())));
            C29598BjW.LIZJ = SystemClock.elapsedRealtime();
            return;
        }
        if (!(message instanceof DecorationModifyMessage) || (interfaceC29638BkA = (InterfaceC29638BkA) this.mView) == null) {
            return;
        }
        List<DonationSticker> list5 = ((DecorationModifyMessage) message).decorationList;
        ArrayList arrayList = new ArrayList();
        if (list5 != null && !list5.isEmpty()) {
            Iterator<DonationSticker> it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ());
            }
        }
        interfaceC29638BkA.yN(arrayList);
    }

    public final void LJJJJJ(int i, java.util.Map map) {
        C1EW.LIZ(((DecorationApi) C1A.LIZJ(DecorationApi.class)).setDecoration(this.LJLIL, i, map)).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Cg
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
            }
        }, new AfS57S0100000_5(this, 61));
    }
}
