package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.3S9, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3S9 {
    LJLJJL(R.layout.b5u, 4, "SINGLE_CHAT", "im_item_session_inbox_single_chat_cell"),
    LJLJJLL(R.layout.b5w, 1, "TIK_BOT_CHAT", "im_item_session_inobx_bot_chat_cell"),
    LJLJL(R.layout.b5s, 4, "GROUP_CHAT", "im_item_session_inbox_group_chat_cell"),
    LJLJLJ(R.layout.b5t, 1, "MESSAGE_REQUEST_CELL", "im_item_session_inbox_message_request_cell");

    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;

    public static C3S9 valueOf(String str) {
        return (C3S9) V0N.LJJJ(C3S9.class, str);
    }

    C3S9(int i, int i2, String str, String str2) {
        this.LJLIL = r2;
        this.LJLILLLLZI = i;
        this.LJLJI = str2;
        this.LJLJJI = i2;
    }
}
