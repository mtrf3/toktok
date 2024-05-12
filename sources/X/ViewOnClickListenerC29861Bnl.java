package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideDialogWidget;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAdjustFollowGuideStrategySetting;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bnl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC29861Bnl extends DialogC29865Bnp implements View.OnClickListener {
    public TextView LJLJL;
    public final User LJLJLJ;
    public GuideMessage LJLJLLL;
    public C29862Bnm LJLL;

    @Override // X.DialogC29865Bnp, X.DialogC38611fN, android.app.Dialog
    public final void onStart() {
        super.onStart();
        getWindow().setLayout(-1, -1);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C29862Bnm c29862Bnm;
        if (view.getId() == R.id.djm && (c29862Bnm = this.LJLL) != null) {
            FollowGuideDialogWidget followGuideDialogWidget = c29862Bnm.LIZ;
            followGuideDialogWidget.LJLILLLLZI.removeCallbacks(followGuideDialogWidget.LJLLI);
            c29862Bnm.LIZ.LJZ();
        }
        if (view.getId() == R.id.liz) {
            cancel();
            C29862Bnm c29862Bnm2 = this.LJLL;
            if (c29862Bnm2 != null) {
                FollowGuideDialogWidget followGuideDialogWidget2 = c29862Bnm2.LIZ;
                followGuideDialogWidget2.LJLILLLLZI.removeCallbacks(followGuideDialogWidget2.LJLLI);
                c29862Bnm2.LIZIZ.dismiss();
                c29862Bnm2.LIZ.LLF("click_exit");
                c29862Bnm2.LIZ.LJLJJI = null;
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        GuideMessage guideMessage;
        super.onCreate(bundle);
        setContentView(R.layout.d0d);
        ImageView imageView = (ImageView) findViewById(R.id.abh);
        TextView textView = (TextView) findViewById(R.id.gvs);
        ((ImageView) findViewById(R.id.a2s)).setVisibility(8);
        TextView textView2 = (TextView) findViewById(R.id.c84);
        TextView textView3 = (TextView) findViewById(R.id.djm);
        this.LJLJL = textView3;
        C16880lQ.LJIJI(textView3, this);
        View findViewById = findViewById(R.id.liz);
        View findViewById2 = findViewById(R.id.o4);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJIIJ(this, findViewById2);
        C31665Cbl.LJIIIZ(imageView, this.LJLJLJ.getAvatarThumb(), R.drawable.d65);
        textView.setText(C05170If.LIZ(this.LJLJLJ));
        if (LiveAdjustFollowGuideStrategySetting.INSTANCE.getValue() && (guideMessage = this.LJLJLLL) != null) {
            String str = guideMessage.scene;
            if (TextUtils.equals(str, "rewatch")) {
                textView2.setText(R.string.jvf);
                return;
            } else if (TextUtils.equals(str, "gift") || TextUtils.equals(str, "comment")) {
                textView2.setText(R.string.jve);
                return;
            } else {
                textView2.setText(R.string.l9q);
                return;
            }
        }
        textView2.setText(R.string.l9q);
    }

    public ViewOnClickListenerC29861Bnl(Context context, boolean z, Room room) {
        super(context, z);
        this.LJLJLJ = room.getOwner();
    }
}
