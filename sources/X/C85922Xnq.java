package X;

import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingFragmentDynamicUIVersion;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85922Xnq implements InterfaceC85953XoL {
    public final /* synthetic */ PushSettingFragmentDynamicUIVersion LJLIL;

    public C85922Xnq(PushSettingFragmentDynamicUIVersion pushSettingFragmentDynamicUIVersion) {
        this.LJLIL = pushSettingFragmentDynamicUIVersion;
    }

    @Override // X.InterfaceC85953XoL
    public final void LIZ(int i, String itemId) {
        o.LJIIIZ(itemId, "itemId");
        if (i == 0) {
            PushSettingFragmentDynamicUIVersion pushSettingFragmentDynamicUIVersion = this.LJLIL;
            pushSettingFragmentDynamicUIVersion.getClass();
            if (!AV1.LJIILLIIL() && C19N.LJ("show_feedback_dlg_4_push_off_reasons", false)) {
                C85948XoG c85948XoG = pushSettingFragmentDynamicUIVersion.LJLJL;
                c85948XoG.getClass();
                if (System.currentTimeMillis() >= c85948XoG.LIZ.getLong("key_next_push_off_dialog_showtime", 0L)) {
                    PushSettingFragmentDynamicUIVersion pushSettingFragmentDynamicUIVersion2 = this.LJLIL;
                    pushSettingFragmentDynamicUIVersion2.LJLJLJ = itemId;
                    pushSettingFragmentDynamicUIVersion2.LJLJJL.LJIILL(new Object[0]);
                }
            }
        }
        C85940Xo8.LIZIZ.LIZ(i, itemId);
        Iterator<InterfaceC85949XoH> it = this.LJLIL.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(i, itemId);
        }
        C85934Xo2.LIZIZ(i, itemId);
        this.LJLIL.LJLJJI.LJIILL(itemId, Integer.valueOf(i));
    }
}
