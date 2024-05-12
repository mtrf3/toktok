package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget$showIndicator$2$1", f = "LiveGoalsWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BpM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29960BpM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LiveGoalsWidget LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29960BpM(LiveGoalsWidget liveGoalsWidget, InterfaceC67352kd<? super C29960BpM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = liveGoalsWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29960BpM(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Resources resources;
        C141335gf.LIZJ(obj);
        LiveGoalsWidget liveGoalsWidget = this.LJLIL;
        Context context = liveGoalsWidget.context;
        if (context != null && (resources = context.getResources()) != null) {
            int color = resources.getColor(R.color.yi);
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = liveGoalsWidget.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setBackgroundColor(color);
            }
        }
        ViewGroup viewGroup = liveGoalsWidget.LJLIL;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = liveGoalsWidget.LJLIL;
        if (viewGroup2 != null) {
            viewGroup2.addView(liveGoalsWidget.LJLJI, -1, -1);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
