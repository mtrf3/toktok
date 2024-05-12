package X;

import Y.AfS36S0101000_5;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsHelpPageSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BdS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC29222BdS extends AbstractDialogC29234Bde implements View.OnClickListener {
    public String LJLJI;
    public final String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public TextView LJLJL;
    public TextView LJLJLJ;
    public TextView LJLJLLL;
    public TextView LJLL;
    public TextView LJLLI;
    public TextView LJLLILLLL;
    public final Room LJLLJ;
    public boolean LJLLL;
    public String LJLLLL;
    public TextView LJLLLLLL;
    public C73411SrX LJLZ;
    public final Context LJZ;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.cw3;
    }

    @Override // X.DialogC38611fN, android.app.Dialog
    public final void show() {
        LJJIIZI();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "2970678373688856853")).LIZ) {
            return;
        }
        super.show();
    }

    public final void LJJIIZI() {
        if (this.LJLLLLLL == null || TextUtils.isEmpty(this.LJLLLL) || TextUtils.equals(this.LJLLLLLL.getText(), this.LJLLLL)) {
            return;
        }
        this.LJLLLLLL.setText(this.LJLLLL);
    }

    public final void LJJIIZ(boolean z) {
        String str;
        String idStr;
        String str2;
        if (z) {
            str = "livesdk_server_url_copy";
        } else {
            str = "livesdk_stream_key_copy";
        }
        BZI LIZ = C28787BRn.LIZ(str);
        Room room = this.LJLLJ;
        if (room == null) {
            idStr = "";
        } else {
            idStr = room.getIdStr();
        }
        LIZ.LJIJJ(idStr, "room_id");
        if (this.LJLLL) {
            str2 = "live_start";
        } else {
            str2 = "live_room";
        }
        LIZ.LJIJJ(str2, "request_page");
        LIZ.LJJIIJZLJL();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.e52) {
            C7N.LJFF().Lu();
            Context context = getContext();
            C28871BUt c28871BUt = new C28871BUt(this.LJLJI);
            c28871BUt.LIZIZ = C15380j0.LJIILJJIL(R.string.sv7);
            C30882CAc.LJII(context, c28871BUt);
            BZI LIZ = C28787BRn.LIZ("thirdparty_take_guide");
            LIZ.LJIIZILJ();
            LIZ.LJIIIZ("live");
            LIZ.LJIIL("click");
            LIZ.LJIJJ("live_room", "request_page");
            LIZ.LJJIIJZLJL();
            return;
        }
        if (id == R.id.jq3) {
            LJJIIJZLJL(true, C78857UxB.LJJIIJ(1476399121, "bpea-211"), this.LJLJJL);
        } else {
            if (id != R.id.jpy) {
                return;
            }
            LJJIIJZLJL(false, C78857UxB.LJJIIJ(1476399122, "bpea-212"), this.LJLJJLL);
        }
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJI = LiveObsHelpPageSetting.INSTANCE.getValue();
        int lastIndexOf = this.LJLJJI.lastIndexOf("/");
        if (lastIndexOf == -1) {
            String str = this.LJLJJI;
            this.LJLJJLL = str;
            this.LJLJJL = str;
        } else {
            int i = lastIndexOf + 1;
            this.LJLJJL = this.LJLJJI.substring(0, i);
            this.LJLJJLL = this.LJLJJI.substring(i);
        }
        findViewById(R.id.lao);
        this.LJLJL = (TextView) findViewById(R.id.e52);
        this.LJLJLJ = (TextView) findViewById(R.id.jq4);
        this.LJLJLLL = (TextView) findViewById(R.id.jpz);
        this.LJLL = (TextView) findViewById(R.id.jq3);
        this.LJLLI = (TextView) findViewById(R.id.jpy);
        findViewById(R.id.jpu);
        findViewById(R.id.jpv);
        findViewById(R.id.jpw);
        this.LJLLILLLL = (TextView) findViewById(R.id.jpx);
        findViewById(R.id.jq1);
        this.LJLLLLLL = (TextView) findViewById(R.id.jq2);
        C16880lQ.LJIJI(this.LJLJL, this);
        C16880lQ.LJIJI(this.LJLL, this);
        C16880lQ.LJIJI(this.LJLLI, this);
        this.LJLJLJ.setText(this.LJLJJL);
        this.LJLJLLL.setText(this.LJLJJLL);
        this.LJLLILLLL.setVisibility(0);
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(this.LJZ);
        if (LIZIZ != null) {
            this.LJLLLL = C16880lQ.LLJJIJIIJIL(LIZIZ.getIntent(), "live.intent.extra.LIVE_PC_TIPS");
        }
        if (TextUtils.isEmpty(this.LJLLLL)) {
            this.LJLLLL = getContext().getString(R.string.oo8);
            LJJIIZI();
            this.LJLZ = (C73411SrX) C28718BOw.LIZ().LIZ().getPreviewRoomCreateInfo(0L).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(0, this, 68), new AfS36S0101000_5(0, this, 69));
            return;
        }
        LJJIIZI();
    }

    public ViewOnClickListenerC29222BdS(ActivityC45651qj activityC45651qj, Room room, String str) {
        super(activityC45651qj);
        this.LJZ = activityC45651qj;
        this.LJLJJI = str;
        this.LJLLJ = room;
    }

    public final void LJJIIJZLJL(boolean z, C78862UxG c78862UxG, String str) {
        int i;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) C16880lQ.LLILL(C15380j0.LIZLLL(), "clipboard");
            ClipData newPlainText = ClipData.newPlainText(str, str);
            C252609vk.LIZ.getClass();
            OHS.LIZIZ(clipboardManager, newPlainText, c78862UxG);
            if (z) {
                i = R.string.o1r;
            } else {
                i = R.string.o7l;
            }
            C30868C9o.LIZJ(i);
            LJJIIZ(z);
        } catch (Exception unused) {
            C30868C9o.LIZJ(R.string.ss9);
        }
    }
}
