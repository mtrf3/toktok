package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.dataChannel.BroadcastNetworkStatusChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import ujb.o;

/* loaded from: classes14.dex */
public final class UEE extends UED {
    public final ImageView LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final C47121t6 LJLJI;
    public int LJLJJI;
    public final /* synthetic */ UEF LJLJJL;

    @Override // X.UED
    public final void L(int i) {
        String str;
        if (C29306Beo.LJJII(this.LJLJJL.LJLIL.LJLIL)) {
            C47121t6 c47121t6 = this.LJLJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C15380j0.LJIILJJIL(R.string.oof));
            LIZ.append(": -");
            c47121t6.setText(X1D.LIZIZ(LIZ));
            C29306Beo.LJI(this.LJLIL);
            C29306Beo.LJI(this.LJLILLLLZI);
            return;
        }
        long broadcastDuration = this.LJLJJL.LJLIL.getBroadcastDuration();
        long j = 3600;
        long j2 = broadcastDuration / j;
        long j3 = (broadcastDuration - (j * j2)) / 60;
        if (j2 > 0) {
            C47121t6 c47121t62 = this.LJLJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C15380j0.LJIILJJIL(R.string.oof));
            LIZ2.append(": ");
            LIZ2.append(C15380j0.LJIIIIZZ(R.plurals.na, (int) j2, String.valueOf(j2), Long.valueOf(j3)));
            c47121t62.setText(X1D.LIZIZ(LIZ2));
            return;
        }
        C47121t6 c47121t63 = this.LJLJI;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mpx);
        if (LJIILJJIL != null) {
            str = o.LJJJJZ(LJIILJJIL, "{n}", String.valueOf(j3), false);
        } else {
            str = null;
        }
        c47121t63.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UEE(UEF uef, View view) {
        super(view);
        this.LJLJJL = uef;
        this.LJLIL = (ImageView) view.findViewById(R.id.kez);
        this.LJLILLLLZI = (C47121t6) view.findViewById(R.id.ket);
        this.LJLJI = (C47121t6) view.findViewById(R.id.fwe);
        this.LJLJJI = -1;
        DataChannel dataChannel = uef.LJLIL.LJLIL;
        if (dataChannel != null) {
            dataChannel.ov0(null, BroadcastNetworkStatusChannel.class, new AqS179S0100000_13(this, 274));
        }
    }
}
