package X;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CA0 implements C0K7 {
    public final /* synthetic */ ScreenRecordStatusWidget LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public CA0(ScreenRecordStatusWidget screenRecordStatusWidget, String str, String str2) {
        this.LJLIL = screenRecordStatusWidget;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        PackageInfo packageInfo;
        liveDialog.dismiss();
        ScreenRecordStatusWidget screenRecordStatusWidget = this.LJLIL;
        String str = this.LJLILLLLZI;
        screenRecordStatusWidget.getClass();
        Long l = null;
        int i = 0;
        try {
            packageInfo = C16880lQ.LLLLLLZ(C15380j0.LIZLLL().getPackageManager(), str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            Intent launchIntentForPackage = C15380j0.LIZLLL().getPackageManager().getLaunchIntentForPackage(this.LJLILLLLZI);
            if (launchIntentForPackage != null) {
                C16880lQ.LIZJ(C15380j0.LIZLLL(), launchIntentForPackage);
            }
            ScreenRecordStatusWidget screenRecordStatusWidget2 = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            screenRecordStatusWidget2.getClass();
            ScreenRecordStatusWidget.LJLZ(0, str2);
            BZI LIZ = C28787BRn.LIZ("livesdk_auto_switch_game_click");
            LIZ.LJIJ("screen_share");
            LIZ.LJFF(this.LJLIL.LJLILLLLZI);
            Room room = this.LJLIL.LJLIL;
            if (room != null) {
                l = Long.valueOf(room.getId());
            }
            LIZ.LJJIII(l);
            if (this.LJLIL.LJLJJI == null) {
                i = 1;
            }
            LIZ.LJIJJ(Integer.valueOf(i), "is_live");
            LIZ.LJIJJ("confirm", "position");
            LIZ.LJJIIJZLJL();
            return;
        }
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lfm);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_ga…vepage_play_toastandroid)");
        String LLLZ = C16880lQ.LLLZ(LJIILJJIL, Arrays.copyOf(new Object[]{this.LJLJI}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        C30868C9o.LJI(LLLZ);
        ScreenRecordStatusWidget screenRecordStatusWidget3 = this.LJLIL;
        String str3 = this.LJLILLLLZI;
        screenRecordStatusWidget3.getClass();
        ScreenRecordStatusWidget.LJLZ(1, str3);
    }
}
