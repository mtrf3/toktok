package X;

import Y.IDDListenerS140S0100000;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.broadcast.dialog.GameFloatWindowTipsDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.bgbroadcast.game.permission.OverlayPermissionController$initToolbarButton$1$onClick$1", f = "OverlayPermissionController.kt", l = {135}, m = "invokeSuspend")
/* renamed from: X.2Ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54242Ay extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C30381He LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54242Ay(C30381He c30381He, InterfaceC67352kd<? super C54242Ay> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c30381He;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54242Ay(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager supportFragmentManager;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            final C30381He c30381He = this.LJLILLLLZI;
            this.LJLIL = 1;
            c30381He.getClass();
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            if (C40210FqI.LJ(c30381He.LIZ.mo49getActivity())) {
                Boolean bool = Boolean.TRUE;
                C3C5.m7constructorimpl(bool);
                c84654XKg.resumeWith(bool);
            } else {
                ActivityC45651qj mo49getActivity = c30381He.LIZ.mo49getActivity();
                if (mo49getActivity == null || (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) == null) {
                    Boolean bool2 = Boolean.FALSE;
                    C3C5.m7constructorimpl(bool2);
                    c84654XKg.resumeWith(bool2);
                } else {
                    C73521StJ c73521StJ = new C73521StJ();
                    final GameFloatWindowTipsDialog Co = ((IGameService) CN1.LIZ(IGameService.class)).Co("in_live");
                    if (Co != null) {
                        Co.setOnDismissListener(new IDDListenerS140S0100000(c73521StJ, 1));
                    }
                    final C34K c34k = new C34K();
                    c34k.element = true;
                    final C73411SrX LIZIZ = ((InterfaceC29856Bng) new C73931Szv(c30381He.LIZ.getLifecycle(), C73931Szv.LIZJ).LIZIZ.LIZJ(C73933Szx.LIZLLL(c30381He.LIZ))).LIZIZ(new InterfaceC64592gB() { // from class: X.1Hg
                        @Override // X.InterfaceC64592gB
                        public final void accept(Object obj2) {
                            LiveDialogFragment liveDialogFragment;
                            if (obj2 == Lifecycle.Event.ON_RESUME) {
                                boolean LJ = C40210FqI.LJ(C30381He.this.LIZ.mo49getActivity());
                                if (LJ && (liveDialogFragment = Co) != null && liveDialogFragment.isShowing()) {
                                    Co.dismiss();
                                }
                                if (!c34k.element && !LJ) {
                                    C30381He c30381He2 = C30381He.this;
                                    c30381He2.LIZLLL = "back_from_overlay";
                                    c30381He2.LJIIJ();
                                }
                                c34k.element = false;
                            }
                        }
                    });
                    ((InterfaceC29205BdB) new C73469SsT(c73521StJ, new InterfaceC29937Boz() { // from class: X.1Hf
                        @Override // X.InterfaceC29937Boz
                        public final void run() {
                            String str;
                            InterfaceC92693kP interfaceC92693kP = InterfaceC92693kP.this;
                            if (interfaceC92693kP != null) {
                                interfaceC92693kP.dispose();
                            }
                            boolean LJ = C40210FqI.LJ(c30381He.LIZ.mo49getActivity());
                            C30381He c30381He2 = c30381He;
                            c30381He2.getClass();
                            if (LJ) {
                                str = "setting_success";
                            } else {
                                str = "cancel_setting";
                            }
                            BZI LIZ = C28787BRn.LIZ("livesdk_overlay_permission_banner_left");
                            LIZ.LJIJJ(c30381He2.LJII.getValue(), "anchor_id");
                            LIZ.LJIJJ(c30381He2.LIZLLL, "enter_from");
                            C78895Uxn.LIZIZ(LIZ, str, "action_type", LJ ? 1 : 0, "is_success");
                            LIZ.LJIJJ("in_live", "scene_type");
                            LIZ.LJJIIJZLJL();
                            Boolean valueOf = Boolean.valueOf(LJ);
                            InterfaceC67352kd<Boolean> interfaceC67352kd = c84654XKg;
                            C3C5.m7constructorimpl(valueOf);
                            interfaceC67352kd.resumeWith(valueOf);
                        }
                    }).LIZLLL(C73933Szx.LIZLLL(c30381He.LIZ))).LIZ();
                    if (Co != null) {
                        Co.show(supportFragmentManager, "GameFloatWindowTipsDialog");
                    }
                    c30381He.LJIIJ();
                }
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LJLILLLLZI.LIZJ.LIZJ("in_app", "full");
        }
        this.LJLILLLLZI.LIZIZ.pv0(RefreshMoreRedDotEvent.class);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
