package X;

import Y.IDDListenerS102S0200000_7;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.G7x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41017G7x {
    public InterfaceC30795C6t LIZ;

    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet, androidx.fragment.app.DialogFragment] */
    public final void LIZ(PermissionConfigure config, Fragment parent, G84 g84, DialogInterface.OnDismissListener onDismissListener) {
        Integer num;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(parent, "parent");
        C68322mC c68322mC = new C68322mC();
        PublishDefaultPermissionFragment LIZ = G9F.LIZ(config, new AqS173S0100000_7(new C41016G7w(this, g84, c68322mC), 149), new AqS157S0100000_7(g84, 288), false);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = LIZ;
        Context context = parent.getContext();
        if (context != null) {
            num = C79045V0n.LJI(R.attr.c9, context);
        } else {
            num = null;
        }
        asl.LIZ.LJLJL = num;
        asl.LJI(1);
        IDDListenerS102S0200000_7 iDDListenerS102S0200000_7 = new IDDListenerS102S0200000_7(LIZ, onDismissListener, 1);
        ?? r2 = asl.LIZ;
        r2.LJLILLLLZI = iDDListenerS102S0200000_7;
        c68322mC.element = r2;
        FragmentManager childFragmentManager = parent.getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "parent.childFragmentManager");
        r2.show(childFragmentManager, "PublishPermissionSheet");
        C116484hg.LIZ("enter_method", config.getEnterMethod(), "video_privacy_setting_viewer_range_click");
    }
}
