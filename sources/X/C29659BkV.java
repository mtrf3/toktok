package X;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.chatroom.view.StickerEditFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BkV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29659BkV implements TextWatcher {
    public boolean LJLIL;
    public String LJLILLLLZI;
    public final /* synthetic */ StickerEditFragment LJLJI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
    }

    public C29659BkV(StickerEditFragment stickerEditFragment) {
        this.LJLJI = stickerEditFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s) {
        String str;
        int i;
        boolean z;
        Editable text;
        C2A8 decorationText;
        Room room;
        Long l;
        long j;
        User owner;
        Editable text2;
        o.LJIIIZ(s, "s");
        StickerEditFragment stickerEditFragment = this.LJLJI;
        LiveEditText liveEditText = stickerEditFragment.LJLIL;
        if (liveEditText == null || (text2 = liveEditText.getText()) == null || (str = text2.toString()) == null) {
            str = "";
        }
        stickerEditFragment.LJLJJLL = str;
        StickerEditFragment stickerEditFragment2 = this.LJLJI;
        RoomSticker roomSticker = stickerEditFragment2.LJLJLLL;
        TextPaint textPaint = null;
        if (roomSticker != null && !o.LJ(stickerEditFragment2.LJLJJLL, stickerEditFragment2.LJLLJ) && !this.LJLIL) {
            this.LJLIL = true;
            DataChannel dataChannel = stickerEditFragment2.LJLJLJ;
            String LIZLLL = C29536BiW.LIZLLL(Long.valueOf(roomSticker.id));
            if (dataChannel != null) {
                room = (Room) dataChannel.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_live_character_edit_input");
            LIZ.LJIILLIIL(dataChannel);
            if (room != null && (owner = room.getOwner()) != null) {
                l = Long.valueOf(owner.getId());
            } else {
                l = null;
            }
            LIZ.LJIJJ(String.valueOf(l), "anchor_id");
            LIZ.LJIJJ("video_live", "live_type");
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            LIZ.LJIJJ(Long.valueOf(j), "room_id");
            LIZ.LJIJJ(Long.valueOf(roomSticker.id), "prop_id");
            LIZ.LJIJJ(LIZLLL, "resource_id");
            LIZ.LJIIJJI("live_take_detail");
            LIZ.LJIJJ(roomSticker.name, "prop_name");
            LIZ.LJJIIJZLJL();
        }
        StickerEditFragment stickerEditFragment3 = this.LJLJI;
        String str2 = stickerEditFragment3.LJLJJLL;
        if (str2 == null) {
            str2 = "";
        }
        C2A3 c2a3 = stickerEditFragment3.LJLILLLLZI;
        if (c2a3 != null) {
            int i2 = 0;
            if (str2.length() == 0) {
                i = 0;
            } else {
                i = 8;
            }
            c2a3.setVisibility(i);
            if (ujb.o.LJJJJZ(str2, " ", "", false).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            stickerEditFragment3.xl(z);
            StickerEditFragment stickerEditFragment4 = this.LJLJI;
            String str3 = stickerEditFragment4.LJLJJLL;
            C29656BkS c29656BkS = stickerEditFragment4.LJLJJL;
            if (c29656BkS != null && (decorationText = c29656BkS.getDecorationText()) != null) {
                textPaint = decorationText.getPaint();
            }
            if (str3 != null && str3.length() != 0 && textPaint != null) {
                i2 = (int) textPaint.measureText(str3, 0, str3.length());
            }
            if (i2 <= C15380j0.LJFF(R.dimen.a9h)) {
                StickerEditFragment stickerEditFragment5 = this.LJLJI;
                String str4 = stickerEditFragment5.LJLJJLL;
                this.LJLILLLLZI = str4;
                C29656BkS c29656BkS2 = stickerEditFragment5.LJLJJL;
                if (c29656BkS2 != null && c29656BkS2.getType() == 4 && str4 != null) {
                    TextView textView = (TextView) c29656BkS2._$_findCachedViewById(R.id.j6l);
                    if (textView != null) {
                        textView.setText(str4);
                    }
                    c29656BkS2.LJLLILLLL();
                }
                C29656BkS c29656BkS3 = this.LJLJI.LJLJJL;
                if (c29656BkS3 != null) {
                    c29656BkS3.LJLLILLLL();
                    return;
                }
                return;
            }
            LiveEditText liveEditText2 = this.LJLJI.LJLIL;
            if (liveEditText2 != null) {
                liveEditText2.setText(this.LJLILLLLZI);
            }
            LiveEditText liveEditText3 = this.LJLJI.LJLIL;
            if (liveEditText3 == null || (text = liveEditText3.getText()) == null) {
                return;
            }
            Selection.setSelection(text, text.length());
            return;
        }
        o.LJIJI("mMessageEditViewHint");
        throw null;
    }
}
