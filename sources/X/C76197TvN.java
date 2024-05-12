package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TvN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76197TvN extends AbstractC76212Tvc {
    public final InterfaceC75964Trc LIZJ;
    public final InterfaceC75963Trb LIZLLL;
    public final DataChannel LJ;

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d86, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…erve_card, parent, false)");
        return new C76198TvO(this, LLLLIILL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76197TvN(InterfaceC75964Trc inviteListener, InterfaceC75963Trb applyListener, DataChannel dataChannel) {
        super(0);
        o.LJIIIZ(inviteListener, "inviteListener");
        o.LJIIIZ(applyListener, "applyListener");
        this.LIZJ = inviteListener;
        this.LIZLLL = applyListener;
        this.LJ = dataChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.C76198TvO r14, X.C76009TsL r15, int r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76197TvN.LJI(X.TvO, X.TsL, int, boolean):void");
    }
}
