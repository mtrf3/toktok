package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity$onResume$1$1", f = "BaAutoReplyListActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9Z4, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Z4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaAutoReplyListActivity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Z4(BaAutoReplyListActivity baAutoReplyListActivity, String str, InterfaceC67352kd<? super C9Z4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baAutoReplyListActivity;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9Z4(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C141335gf.LIZJ(obj);
        C252709vu c252709vu = (C252709vu) this.LJLIL._$_findCachedViewById(R.id.la4);
        C9KF c9kf = new C9KF();
        c9kf.LIZ(this.LJLILLLLZI);
        c252709vu.LJIILLIIL(c9kf);
        View _$_findCachedViewById = this.LJLIL._$_findCachedViewById(R.id.b1v);
        boolean z = false;
        if (this.LJLIL.LJLJJI.size() < 4) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        View _$_findCachedViewById2 = this.LJLIL._$_findCachedViewById(R.id.b1v);
        if (this.LJLIL.LJLJJI.size() < 4) {
            z = true;
        }
        _$_findCachedViewById2.setActivated(z);
        ((SY4) this.LJLIL._$_findCachedViewById(R.id.b1v)).setEnabled(true);
        this.LJLIL.LJLJI.notifyDataSetChanged();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
