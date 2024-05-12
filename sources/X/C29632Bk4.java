package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.chatroom.event.EditRoomStickerEvent;
import com.bytedance.android.livesdk.chatroom.view.StickerEditFragment;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdk.model.StickersSetResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Bk4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29632Bk4 implements InterfaceC29538BiY {
    public final /* synthetic */ StickerEditFragment LIZ;
    public final /* synthetic */ Sticker LIZIZ;

    @Override // X.InterfaceC29538BiY
    public final void LIZ(StickersSetResponse stickersSetResponse) {
        String str;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LIZ.LJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        C29656BkS c29656BkS = this.LIZ.LJLJJL;
        if (c29656BkS != null) {
            c29656BkS.LJLLI(stickersSetResponse.status);
        }
        if (stickersSetResponse.status == 1) {
            C29598BjW.LIZIZ = SystemClock.elapsedRealtime();
        }
        Sticker sticker = this.LIZIZ;
        StickerEditFragment stickerEditFragment = this.LIZ;
        RoomSticker roomSticker = (RoomSticker) sticker;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(stickerEditFragment);
        C29656BkS c29656BkS2 = stickerEditFragment.LJLJJL;
        String str2 = null;
        if (c29656BkS2 != null) {
            str = c29656BkS2.getContent();
        } else {
            str = null;
        }
        C29598BjW.LJ(LJIILIIL, roomSticker, Boolean.valueOf(C29536BiW.LIZ(roomSticker, str)), stickersSetResponse.status, "api");
        this.LIZ.getClass();
        int i = stickersSetResponse.status;
        if (i == 2 || i == 5 || i == 0) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ.LJLLI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            StickerEditFragment stickerEditFragment2 = this.LIZ;
            DataChannel dataChannel = stickerEditFragment2.LJLJLJ;
            RoomSticker roomSticker2 = (RoomSticker) this.LIZIZ;
            C29656BkS c29656BkS3 = stickerEditFragment2.LJLJJL;
            if (c29656BkS3 != null) {
                str2 = c29656BkS3.getContent();
            }
            C29598BjW.LJII(dataChannel, roomSticker2, Boolean.valueOf(C29536BiW.LIZ(roomSticker2, str2)));
            C29598BjW.LIZJ = SystemClock.elapsedRealtime();
        }
        this.LIZ.vl();
        StickerEditFragment stickerEditFragment3 = this.LIZ;
        int i2 = stickersSetResponse.status;
        RoomSticker roomSticker3 = (RoomSticker) this.LIZIZ;
        if (roomSticker3 != null) {
            DataChannel dataChannel2 = stickerEditFragment3.LJLJLJ;
            if (dataChannel2 != null) {
                dataChannel2.qv0(EditRoomStickerEvent.class, new C29645BkH(1, i2, roomSticker3));
                return;
            }
            return;
        }
        stickerEditFragment3.getClass();
    }

    @Override // X.InterfaceC29538BiY
    public final void onFailed(Throwable th) {
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LIZ.LJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        StickerEditFragment stickerEditFragment = this.LIZ;
        RoomSticker roomSticker = stickerEditFragment.LJLJLLL;
        if (roomSticker != null) {
            C29598BjW.LJIIJ(stickerEditFragment.LJLJLJ, roomSticker, C29536BiW.LIZLLL(Long.valueOf(roomSticker.id)));
        }
        try {
            this.LIZ.wl(th);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
        this.LIZ.vl();
        StickerEditFragment stickerEditFragment2 = this.LIZ;
        RoomSticker roomSticker2 = (RoomSticker) this.LIZIZ;
        if (roomSticker2 != null) {
            DataChannel dataChannel = stickerEditFragment2.LJLJLJ;
            if (dataChannel != null) {
                dataChannel.qv0(EditRoomStickerEvent.class, new C29645BkH(0, 0, roomSticker2));
                return;
            }
            return;
        }
        stickerEditFragment2.getClass();
    }

    public C29632Bk4(StickerEditFragment stickerEditFragment, Sticker sticker) {
        this.LIZ = stickerEditFragment;
        this.LIZIZ = sticker;
    }
}
