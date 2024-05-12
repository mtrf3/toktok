package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BFn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC28475BFn implements View.OnTouchListener {
    public final /* synthetic */ BIR LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ C41071jL LJLJI;
    public final /* synthetic */ Room LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ DataChannel LJLJJLL;

    public ViewOnTouchListenerC28475BFn(BIR bir, Context context, C41071jL c41071jL, Room room, String str, DataChannel dataChannel) {
        this.LJLIL = bir;
        this.LJLILLLLZI = context;
        this.LJLJI = c41071jL;
        this.LJLJJI = room;
        this.LJLJJL = str;
        this.LJLJJLL = dataChannel;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            BIR bir = this.LJLIL;
            if (bir.LIZ) {
                C47071t1 c47071t1 = new C47071t1(this.LJLILLLLZI);
                c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.m0a);
                c47071t1.LJII(C15380j0.LJIILJJIL(R.string.m0_));
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.m08);
                BIR bir2 = this.LJLIL;
                c47071t1.LJIILIIL(LJIILJJIL, new C28473BFl(this.LJLJI, bir2, this.LJLJJI, this.LJLJJLL, this.LJLJJL));
                c47071t1.LJIIJ(C15380j0.LJIILJJIL(R.string.m09), new C28474BFm(this.LJLJI, this.LJLIL, this.LJLJJL, this.LJLJJLL));
                c47071t1.LJIILLIIL = new DialogInterfaceOnShowListenerC28476BFo(this.LJLIL, this.LJLJJL);
                c47071t1.LJIILJJIL = false;
                LiveDialog LIZ = c47071t1.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "4549141940702445988")).LIZ) {
                    LIZ.show();
                }
            } else {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = bir.LJFF;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
            }
        }
        return true;
    }
}
