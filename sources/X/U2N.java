package X;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public abstract class U2N extends U2M {
    public LiveIconView LJLJJL;
    public LiveIconView LJLJJLL;
    public RunnableC31065CHd LJLJL;
    public ConstraintLayout LJLJLJ;
    public final C73129Smz LJLJLLL;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.cz7;
    }

    public abstract void LJJIIZ();

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        C73129Smz c73129Smz = this.LJLJLLL;
        C73411SrX c73411SrX = c73129Smz.LJLJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        c73129Smz.LJLJJI = null;
        super.onDetachedFromWindow();
    }

    @Override // X.U2M
    public void LJJIIJZLJL() {
        this.LJLJJI = findViewById(R.id.jzt);
        this.LJLJJL = (LiveIconView) findViewById(R.id.jzy);
        this.LJLJJLL = (LiveIconView) findViewById(R.id.k00);
        this.LJLJL = (RunnableC31065CHd) findViewById(R.id.jzw);
        this.LJLJLJ = (ConstraintLayout) findViewById(R.id.jzu);
        C15490jB.LJ(findViewById(R.id.jzs), "tiktok_live_liveshow_resource_demand", "ttlive_multi_guest_live_show_list_dialog_bg.png");
        RunnableC31065CHd runnableC31065CHd = this.LJLJL;
        if (runnableC31065CHd != null) {
            getContext();
            SSLinearLayoutManager sSLinearLayoutManager = new SSLinearLayoutManager();
            sSLinearLayoutManager.LLJJIII(1);
            runnableC31065CHd.setLayoutManager(sSLinearLayoutManager);
        }
        LJJIIZ();
        RunnableC31065CHd runnableC31065CHd2 = this.LJLJL;
        if (runnableC31065CHd2 == null) {
            return;
        }
        runnableC31065CHd2.setAdapter(this.LJLJLLL);
    }

    public U2N(Context context, int i) {
        super(context, i);
        this.LJLJLLL = new C73129Smz();
    }
}
