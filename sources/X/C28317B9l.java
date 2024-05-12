package X;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.B9l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28317B9l extends ConstraintLayout implements InterfaceC28316B9k {
    public C28312B9g LJLIL;
    public C0YL LJLILLLLZI;
    public int LJLJI;
    public DataChannel LJLJJI;

    private int getLayoutResource() {
        return R.layout.djw;
    }

    public C28317B9l(Context context) {
        super(context);
        C16880lQ.LLLZIIL(getLayoutResource(), C16880lQ.LLZIL(context), this);
    }

    @Override // X.InterfaceC28316B9k
    public final void LJIIJJI(C31061Ju c31061Ju) {
        C0YL c0yl;
        if (c31061Ju == null || (c0yl = this.LJLILLLLZI) == null) {
            return;
        }
        c0yl.LIZJ(c31061Ju);
        DataChannel dataChannel = this.LJLJJI;
        BZI LIZ = C28787BRn.LIZ("livesdk_emoji_click");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ("emoji_panel", "position");
        LIZ.LJJIIJZLJL();
    }

    public void setDataChannel(DataChannel dataChannel) {
        this.LJLJJI = dataChannel;
    }

    public void setOnEmojiSelectListener(C0YL c0yl) {
        this.LJLILLLLZI = c0yl;
    }
}
