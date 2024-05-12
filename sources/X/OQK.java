package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.fe.method.PushOperationMethod;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OQK implements DialogInterface.OnClickListener {
    public final /* synthetic */ PushOperationMethod LJLIL;
    public final /* synthetic */ C68322mC<JSONObject> LJLILLLLZI;
    public final /* synthetic */ InterfaceC36488ETs LJLJI;

    public OQK(PushOperationMethod pushOperationMethod, C68322mC<JSONObject> c68322mC, InterfaceC36488ETs interfaceC36488ETs) {
        this.LJLIL = pushOperationMethod;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = interfaceC36488ETs;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.LJLIL.LJLJI;
        HashMap hashMap = new HashMap();
        C67142kI.LIZ(str, hashMap);
        FMX.LJIIL("push_pre_permission_deny", hashMap);
        this.LJLILLLLZI.element.put("auth_result", 0);
        this.LJLJI.LIZIZ(this.LJLILLLLZI.element);
    }
}
