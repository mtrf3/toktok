package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Cea, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31840Cea implements InterfaceC62096OYq {
    public final /* synthetic */ C31842Cec LJLIL;
    public final /* synthetic */ CompletionBlock<InterfaceC31841Ceb> LJLILLLLZI;

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void onDismiss() {
    }

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
        this.LJLIL.getClass();
        InterfaceC31841Ceb interfaceC31841Ceb = (InterfaceC31841Ceb) ED5.LIZJ(InterfaceC31841Ceb.class, null);
        interfaceC31841Ceb.setShareSuccess(Boolean.FALSE);
        this.LJLILLLLZI.onSuccess(interfaceC31841Ceb, "");
    }

    public C31840Cea(C31842Cec c31842Cec, C37356ElM c37356ElM) {
        this.LJLIL = c31842Cec;
        this.LJLILLLLZI = c37356ElM;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String str, String str2, Bundle bundle) {
        ActivityC45651qj activityC45651qj;
        Context context;
        String str3 = null;
        if (SC5.LIZIZ(str, "platform", str2, "shareType", "chat_merge", str) && o.LJ("link", str2)) {
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL.LJLIL;
            if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null) {
                activityC45651qj = C29306Beo.LIZ(context);
            } else {
                activityC45651qj = null;
            }
            C30868C9o.LIZIZ(activityC45651qj, C15380j0.LJIILJJIL(R.string.o9k));
        }
        this.LJLIL.getClass();
        InterfaceC31841Ceb interfaceC31841Ceb = (InterfaceC31841Ceb) ED5.LIZJ(InterfaceC31841Ceb.class, null);
        interfaceC31841Ceb.setShareSuccess(Boolean.TRUE);
        interfaceC31841Ceb.setSharePlatform(str);
        if (bundle != null) {
            str3 = bundle.getString("shareIdList", "");
        }
        interfaceC31841Ceb.setToUserId(str3);
        this.LJLILLLLZI.onSuccess(interfaceC31841Ceb, "");
    }
}
