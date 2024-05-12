package X;

import android.app.Dialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.panel.ui.helper.SharePanelSendHandler$share$1", f = "SharePanelSendHandler.kt", l = {71, SubscriptionExpireRemindHourSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.4Ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107564Ka extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C107584Kc LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C107564Ka(C107584Kc c107584Kc, InterfaceC67352kd<? super C107564Ka> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c107584Kc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C107564Ka(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        C107724Kq c107724Kq = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    this.LJLILLLLZI.LIZJ.setValue(EnumC107604Ke.SENT);
                    this.LJLILLLLZI.LIZ.setShareSuccess(true);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI.LIZJ.setValue(EnumC107604Ke.SENDING);
            C107584Kc c107584Kc = this.LJLILLLLZI;
            C4KZ.LIZLLL(c107584Kc.LIZIZ, c107584Kc.LIZ, false, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
            this.LJLIL = 1;
            if (C1JD.LIZJ(3000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        final C107584Kc c107584Kc2 = this.LJLILLLLZI;
        this.LJLIL = 2;
        c107584Kc2.getClass();
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
        C107724Kq c107724Kq2 = c107584Kc2.LJI;
        if (c107724Kq2 != null) {
            c107724Kq2.LJ = "long_press_panel";
            c107724Kq = c107724Kq2;
        }
        C78949Uyf.LJJIJLIJ(c107724Kq);
        SharePackage sharePackage = c107584Kc2.LIZIZ;
        if (sharePackage != null) {
            C101243yC.LIZJ(sharePackage, "", C47261Igj.LJJIJ(c107584Kc2.LIZ), new C4OT() { // from class: X.4Kd
                @Override // X.C4OT
                public final void LIZ(SharePackage sharePackage2) {
                    o.LJIIIZ(sharePackage2, "sharePackage");
                }

                @Override // X.C4OT
                public final void LJIIIIZZ(SharePackage sharePackage2) {
                    o.LJIIIZ(sharePackage2, "sharePackage");
                }

                @Override // X.C4OT
                public final void LJIIIZ() {
                }

                @Override // X.C4OT
                public final void LIZIZ(SharePackage sharePackage2) {
                    o.LJIIIZ(sharePackage2, "sharePackage");
                }

                @Override // X.C4OT
                public final void LIZJ(SharePackage sharePackage2) {
                    o.LJIIIZ(sharePackage2, "sharePackage");
                    C57428MgK.LJFF(sharePackage2, "", C47261Igj.LJJIJ(C107584Kc.this.LIZ), 0, 56);
                    InterfaceC67352kd<C76800UCe> interfaceC67352kd = c84654XKg;
                    C76800UCe c76800UCe = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(c76800UCe);
                    interfaceC67352kd.resumeWith(c76800UCe);
                }

                @Override // X.C4OT
                public final void LJII(SharePackage sharePackage2) {
                    o.LJIIIZ(sharePackage2, "sharePackage");
                }

                @Override // X.C4OT
                public final boolean LJIIJ(SharePackage sharePackage2) {
                    o.LJIIIZ(sharePackage2, "sharePackage");
                    return true;
                }

                @Override // X.C4OT
                public final void LIZLLL(Dialog dialog, SharePackage sharePackage2) {
                    o.LJIIIZ(dialog, "dialog");
                    o.LJIIIZ(sharePackage2, "sharePackage");
                }

                @Override // X.C4OT
                public final void LJ(Dialog dialog, SharePackage sharePackage2) {
                    o.LJIIIZ(dialog, "dialog");
                    o.LJIIIZ(sharePackage2, "sharePackage");
                }

                @Override // X.C4OT
                public final void LJI(SharePackage sharePackage2, String str) {
                    o.LJIIIZ(sharePackage2, "sharePackage");
                }
            }, null, null, null, 112);
        }
        Object LIZ = c84654XKg.LIZ();
        if (LIZ != enumC58928NAu) {
            LIZ = C76800UCe.LIZ;
        }
        if (LIZ == enumC58928NAu) {
            return enumC58928NAu;
        }
        this.LJLILLLLZI.LIZJ.setValue(EnumC107604Ke.SENT);
        this.LJLILLLLZI.LIZ.setShareSuccess(true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
