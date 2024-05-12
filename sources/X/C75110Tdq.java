package X;

import Y.ACListenerS33S0100000_13;
import android.view.View;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75110Tdq extends AbstractC76218Tvi<C75069TdB> {
    public InterfaceC75134TeE LJLIL;
    public final DataChannel LJLILLLLZI;
    public final boolean LJLJI;
    public InterfaceC75135TeF LJLJJI;
    public final C47121t6 LJLJJL;
    public final C47121t6 LJLJJLL;
    public final C47121t6 LJLJL;
    public final View LJLJLJ;

    @Override // X.AbstractC76218Tvi
    public final void LJJJJIZL() {
        this.LJLIL = null;
        this.LJLJJI = null;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    public final void M(C75069TdB c75069TdB) {
        String LJIILJJIL;
        String LJIILJJIL2;
        String LJIILJJIL3;
        int i = c75069TdB.LJLIL;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LJLJJL.setText(C15380j0.LJIILJJIL(R.string.kiz));
            C47121t6 c47121t6 = this.LJLJJLL;
            if (C29232Bdc.LJIIL()) {
                LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.og1);
            } else {
                LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.kiy);
            }
            c47121t6.setText(LJIILJJIL3);
            C87277YNd.LJJIIZ(this.LJLJL);
            return;
        }
        this.LJLJJL.setText(C15380j0.LJIILJJIL(R.string.nbf));
        C47121t6 c47121t62 = this.LJLJJLL;
        if (C29232Bdc.LJIIL()) {
            LJIILJJIL = C15380j0.LJIILJJIL(R.string.og1);
        } else if (this.LJLJI) {
            LJIILJJIL = C15380j0.LJIILJJIL(R.string.lum);
        } else {
            LJIILJJIL = C15380j0.LJIILJJIL(R.string.lzp);
        }
        c47121t62.setText(LJIILJJIL);
        C47121t6 c47121t63 = this.LJLJL;
        if (C29232Bdc.LJIIL() || ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
            z = false;
        }
        C29306Beo.LJJLIIIJJI(c47121t63, z);
        if (this.LJLJI) {
            LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lul);
        } else {
            LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lzq);
        }
        c47121t63.setText(LJIILJJIL2);
        C16880lQ.LJJIIZ(c47121t63, new ACListenerS33S0100000_13(this, 133));
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        C75069TdB data = (C75069TdB) obj;
        o.LJIIIZ(data, "data");
        M(data);
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.mv0(MicRoomDisableInteractionEvent.class, this, new AqS144S0200000_13(this, data, 29));
        }
    }

    public C75110Tdq(View view, InterfaceC75134TeE interfaceC75134TeE, DataChannel dataChannel, boolean z, InterfaceC75135TeF interfaceC75135TeF) {
        super(view);
        this.LJLIL = interfaceC75134TeE;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = z;
        this.LJLJJI = interfaceC75135TeF;
        View findViewById = view.findViewById(R.id.h1q);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.no_guest_title)");
        this.LJLJJL = (C47121t6) findViewById;
        View findViewById2 = view.findViewById(R.id.ghd);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.message)");
        this.LJLJJLL = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.awu);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.btn_invite)");
        this.LJLJL = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.lg6);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.top_shadow)");
        this.LJLJLJ = findViewById4;
    }
}
