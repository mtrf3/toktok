package X;

import Y.IDCListenerS159S0100000_5;
import android.content.Context;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.BEs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogC28454BEs extends DialogC77438UaI implements InterfaceC28459BEx {
    public final long LLJIJIL;
    public final long LLJILJIL;
    public final long LLJILJILJ;
    public final Context LLJILLL;
    public final InterfaceC28453BEr LLJJ;

    @Override // X.InterfaceC28459BEx
    public final void K() {
    }

    @Override // X.InterfaceC28459BEx
    public final void LJLIIL(C28465BFd c28465BFd, Exception exc) {
    }

    public final java.util.Map<String, String> LJJIIZ() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.LLJILJIL));
        hashMap.put("room_id", String.valueOf(this.LLJIJIL));
        hashMap.put("user_id", String.valueOf(this.LLJILJILJ));
        if (B83.LIZ().LIZIZ().getCurrentUserId() == this.LLJILJIL) {
            str = "anchor";
        } else {
            str = "admin";
        }
        hashMap.put("admin_type", str);
        return hashMap;
    }

    @Override // X.InterfaceC28459BEx
    public final void l(boolean z) {
        InterfaceC28453BEr interfaceC28453BEr;
        if (z && (interfaceC28453BEr = this.LLJJ) != null) {
            interfaceC28453BEr.LIZIZ();
        }
        if (isShowing()) {
            dismiss();
            C73943T0h.LIZ().LIZIZ(new C28455BEt(0));
        }
    }

    @Override // X.DialogC77438UaI, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJLLL = getContext().getString(R.string.src);
        String string = getContext().getString(R.string.t1j);
        IDCListenerS159S0100000_5 iDCListenerS159S0100000_5 = new IDCListenerS159S0100000_5(this, 7);
        this.LLFFF = string;
        this.LLIIII = iDCListenerS159S0100000_5;
        String string2 = getContext().getString(R.string.t1i);
        IDCListenerS159S0100000_5 iDCListenerS159S0100000_52 = new IDCListenerS159S0100000_5(this, 8);
        this.LLFII = string2;
        this.LLIIIILZ = iDCListenerS159S0100000_52;
    }

    @Override // X.InterfaceC28459BEx
    public final void b(Exception exc, boolean z) {
        BPP.LIZJ(getContext(), exc);
        if (isShowing()) {
            dismiss();
            C73943T0h.LIZ().LIZIZ(new C28455BEt(0));
        }
    }

    public DialogC28454BEs(Context context, long j, long j2, long j3, InterfaceC28453BEr interfaceC28453BEr) {
        super(context);
        this.LLJILLL = context;
        this.LLJIJIL = j;
        this.LLJILJIL = j2;
        this.LLJILJILJ = j3;
        this.LLJJ = interfaceC28453BEr;
    }
}
