package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* renamed from: X.Bdn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29243Bdn implements InterfaceC29961BpN {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Room LIZJ;

    public C29243Bdn(Context context, Room room, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = room;
    }

    @Override // X.InterfaceC29961BpN
    public final void LIZ() {
        FragmentManager supportFragmentManager;
        if (C45804HyK.LJJIFFI(this.LIZ) != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_manage_feeds_click");
            LIZ.LJIJJ("long_press_panel", "source");
            LIZ.LJIJJ(this.LIZIZ, "enter_from_merge");
            LIZ.LJIJJ("live_cell", "enter_method");
            LIZ.LJIJJ("click", "action_type");
            LIZ.LJIJJ(String.valueOf(this.LIZJ.getId()), "room_id");
            User owner = this.LIZJ.getOwner();
            Long l = null;
            if (owner != null) {
                l = Long.valueOf(owner.getId());
            }
            LIZ.LJIJJ(String.valueOf(l), "anchor_id");
            LIZ.LJJIIJZLJL();
            BOT.LIZ = "long_press_panel";
            BOT.LIZIZ = "feed";
            DialogFragment LJ = LiveOuterService.LJJJLL().LJJIZ().LJIILL().LJ();
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LIZ);
            if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                if (LJ != null) {
                    LJ.show(c1b3, "LiveNonPersonalizedDialog");
                }
            }
        }
    }
}
