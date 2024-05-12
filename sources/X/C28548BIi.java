package X;

import com.bytedance.android.live.design.app.LiveDialog;
import java.util.HashMap;

/* renamed from: X.BIi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28548BIi implements C0K7 {
    public static final C28548BIi LJLIL = new C28548BIi();

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        HashMap hashMap = new HashMap();
        hashMap.put("choose_type", "dismiss");
        BZI LIZ = C28787BRn.LIZ("guest_connection_underage_popup");
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(hashMap);
        LIZ.LIZJ("click");
        LIZ.LJJIIJZLJL();
    }
}
