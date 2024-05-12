package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BB3 implements View.OnTouchListener {
    public final /* synthetic */ BIR LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ C41071jL LJLJI;
    public final /* synthetic */ C41071jL LJLJJI;
    public final /* synthetic */ ViewGroup LJLJJL;
    public final /* synthetic */ ViewGroup LJLJJLL;
    public final /* synthetic */ ViewGroup LJLJL;
    public final /* synthetic */ DataChannel LJLJLJ;
    public final /* synthetic */ Room LJLJLLL;
    public final /* synthetic */ String LJLL;

    public BB3(BIR bir, Context context, C41071jL c41071jL, C41071jL c41071jL2, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, DataChannel dataChannel, Room room, String str) {
        this.LJLIL = bir;
        this.LJLILLLLZI = context;
        this.LJLJI = c41071jL;
        this.LJLJJI = c41071jL2;
        this.LJLJJL = viewGroup;
        this.LJLJJLL = viewGroup2;
        this.LJLJL = viewGroup3;
        this.LJLJLJ = dataChannel;
        this.LJLJLLL = room;
        this.LJLL = str;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.LJLIL.LJIILIIL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL);
        }
        return true;
    }
}
