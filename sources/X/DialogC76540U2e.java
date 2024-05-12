package X;

import Y.ACListenerS33S0100000_13;
import android.content.Context;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.U2e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogC76540U2e extends U2M {
    public final InterfaceC76546U2k LJLJJL;
    public LiveIconView LJLJJLL;
    public RunnableC31065CHd LJLJL;
    public final C31413CUn LJLJLJ;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.cz5;
    }

    @Override // X.U2M
    public final void LJJIIJZLJL() {
        this.LJLJJI = findViewById(R.id.fyw);
        this.LJLJJLL = (LiveIconView) findViewById(R.id.fyx);
        this.LJLJL = (RunnableC31065CHd) findViewById(R.id.c8e);
        LiveIconView liveIconView = this.LJLJJLL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS33S0100000_13(this, 180));
        }
        this.LJLJLJ.LJLZ(C76545U2j.class, new C76543U2h());
        this.LJLJLJ.LJLZ(C124324uK.class, new C76539U2d());
        RunnableC31065CHd runnableC31065CHd = this.LJLJL;
        if (runnableC31065CHd != null) {
            getContext();
            SSLinearLayoutManager sSLinearLayoutManager = new SSLinearLayoutManager();
            sSLinearLayoutManager.LLJJIII(1);
            runnableC31065CHd.setLayoutManager(sSLinearLayoutManager);
        }
        RunnableC31065CHd runnableC31065CHd2 = this.LJLJL;
        if (runnableC31065CHd2 != null) {
            runnableC31065CHd2.setAdapter(this.LJLJLJ);
        }
        C31413CUn c31413CUn = this.LJLJLJ;
        CJ2 cj2 = new CJ2();
        cj2.add(new C76545U2j(1, R.string.nd9, 14, 0));
        cj2.add(new C76545U2j(2, R.string.nd3, 10, 0));
        cj2.add(new C76545U2j(2, R.string.nd4, 12, 0));
        cj2.add(new C76545U2j(2, R.string.nd5, 12, 0));
        cj2.add(new F9E() { // from class: X.4uK
            public final int LJLIL = 0;

            @Override // X.F9E
            public final Object[] getObjects() {
                return new Object[]{Integer.valueOf(this.LJLIL)};
            }
        });
        cj2.add(new C76545U2j(2, R.string.nd6, 12, 0));
        cj2.add(new C76545U2j(2, R.string.nd7, 12, 50));
        c31413CUn.LJLIL = cj2;
        C31413CUn c31413CUn2 = this.LJLJLJ;
        if (c31413CUn2 != null) {
            c31413CUn2.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC76540U2e(Context context, InterfaceC76546U2k clicker) {
        super(context, 4);
        o.LJIIIZ(clicker, "clicker");
        this.LJLJJL = clicker;
        this.LJLJLJ = new C31413CUn();
    }
}
