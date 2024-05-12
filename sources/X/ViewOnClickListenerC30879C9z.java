package X;

import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.C9z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC30879C9z implements View.OnClickListener {
    public final /* synthetic */ ScreenRecordStatusWidget LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public ViewOnClickListenerC30879C9z(ScreenRecordStatusWidget screenRecordStatusWidget, String str, String str2) {
        this.LJLIL = screenRecordStatusWidget;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l;
        ScreenRecordStatusWidget screenRecordStatusWidget = this.LJLIL;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        screenRecordStatusWidget.getClass();
        C47071t1 c47071t1 = new C47071t1(screenRecordStatusWidget.context);
        c47071t1.LIZIZ = screenRecordStatusWidget;
        String string = screenRecordStatusWidget.context.getString(R.string.lfj);
        o.LJIIIIZZ(string, "context.getString(R.stri…m_gamelive_livepage_play)");
        int i = 1;
        c47071t1.LIZJ = Q8U.LIZIZ(new Object[]{str2}, 1, string, "format(format, *args)");
        String string2 = screenRecordStatusWidget.context.getString(R.string.lfk);
        o.LJIIIIZZ(string2, "context.getString(R.stri…ve_livepage_play_content)");
        String LLLZ = C16880lQ.LLLZ(string2, Arrays.copyOf(new Object[]{str2}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        c47071t1.LJII(LLLZ);
        c47071t1.LJIIIZ(R.string.kg7, new CA1(screenRecordStatusWidget, str));
        c47071t1.LJIIL(R.string.mp0, new CA0(screenRecordStatusWidget, str, str2));
        LiveDialog LIZ = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "2503886920606173941")).LIZ) {
            LIZ.show();
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_auto_switch_game_click");
        LIZ2.LJIJ("screen_share");
        LIZ2.LJFF(this.LJLIL.LJLILLLLZI);
        Room room = this.LJLIL.LJLIL;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ2.LJJIII(l);
        if (this.LJLIL.LJLJJI != null) {
            i = 0;
        }
        LIZ2.LJIJJ(Integer.valueOf(i), "is_live");
        LIZ2.LJIJJ("entrance", "position");
        LIZ2.LJJIIJZLJL();
    }
}
