package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OfS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62470OfS extends AbstractC62520OgG {
    public final /* synthetic */ DialogC62475OfX LJLJI;

    @Override // X.AbstractC62520OgG
    public final void LIZ(InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        this.LJLJI.LJLJJL.LJIIJ.extras.putString("share_action_key", action.key());
        DialogC62475OfX dialogC62475OfX = this.LJLJI;
        if (!dialogC62475OfX.LJLJJL.LJIIJ.LJIIIIZZ(action, dialogC62475OfX.LJLJJI)) {
            C62477OfZ share_panel_action_bar = (C62477OfZ) this.LJLJI.findViewById(R.id.ju4);
            o.LJIIIIZZ(share_panel_action_bar, "share_panel_action_bar");
            action.LIZIZ(share_panel_action_bar, this.LJLJI.LJLJJL.LJIIJ);
        }
        DialogC62475OfX dialogC62475OfX2 = this.LJLJI;
        C62387Oe7 c62387Oe7 = dialogC62475OfX2.LJLJJL;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LIZIZ(dialogC62475OfX2.LJLJJI, c62387Oe7.LJIIJ, action);
        }
        if (action.enable() && action.LJJI()) {
            this.LJLJI.dismiss();
        } else {
            if (!action.LJJIIJZLJL()) {
                return;
            }
            this.LJLJI.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62470OfS(DialogC62475OfX dialogC62475OfX, Context context, BaseSharePackage baseSharePackage) {
        super(context, baseSharePackage);
        this.LJLJI = dialogC62475OfX;
    }
}
