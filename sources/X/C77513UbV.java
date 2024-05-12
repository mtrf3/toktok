package X;

import Y.ARunnableS49S0100000_13;
import Y.IDCListenerS287S0100000_13;
import Y.IDcS172S0100000_13;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import defpackage.l0;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.UbV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77513UbV implements InterfaceC77512UbU {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC77524Ubg LIZIZ(int i, UI8 ui8) {
        switch (i) {
            case 4005189:
            case 4005272:
                return new UIB(ui8);
            case 4005284:
            case 4005285:
                return new C76913UGn(ui8);
            default:
                if (UII.LIZ(i)) {
                    return new UI2(i, ui8);
                }
                return null;
        }
    }

    @Override // X.InterfaceC77512UbU
    public final InterfaceC77501UbJ LIZ(Context context, InterfaceC77503UbL interfaceC77503UbL) {
        InterfaceC77524Ubg interfaceC77524Ubg = null;
        boolean z = false;
        if (interfaceC77503UbL instanceof C77518Uba) {
            C77518Uba c77518Uba = (C77518Uba) interfaceC77503UbL;
            if (context == null) {
                return C77526Ubi.LIZ();
            }
            UI8 ui8 = c77518Uba.LJ;
            if (ui8 != null && ui8.LIZ == -1) {
                return new C77525Ubh(true, true);
            }
            Exception exc = c77518Uba.LIZ;
            if (!(exc instanceof C29401Dk)) {
                return C77526Ubi.LIZ();
            }
            CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
            Exception exc2 = c77518Uba.LIZ;
            o.LJII(exc2, "null cannot be cast to non-null type com.bytedance.android.live.api.exceptions.server.ApiServerException");
            C276516r c276516r = (C276516r) exc2;
            Exception exc3 = c77518Uba.LIZ;
            o.LJII(exc3, "null cannot be cast to non-null type com.bytedance.android.live.api.exceptions.server.ApiServerException");
            String extra = ((C29401Dk) exc3).getExtra();
            o.LJIIIIZZ(extra, "rechargeException.except…ApiServerException).extra");
            if (extra.length() == 0 || customErrorExtra == null) {
                return C77526Ubi.LIZ();
            }
            int errorCode = c276516r.getErrorCode();
            UI8 ui82 = c77518Uba.LJ;
            if (ui82 != null) {
                interfaceC77524Ubg = LIZIZ(errorCode, ui82);
            }
            return LIZJ(context, customErrorExtra, interfaceC77524Ubg, c77518Uba.LIZLLL, c77518Uba.LIZJ, c77518Uba.LJ);
        }
        if (interfaceC77503UbL instanceof C77489Ub7) {
            C77489Ub7 c77489Ub7 = (C77489Ub7) interfaceC77503UbL;
            if (context == null) {
                return C77526Ubi.LIZ();
            }
            UI8 ui83 = c77489Ub7.LJ;
            if (ui83 != null && ui83.LIZ == -1) {
                return new C77525Ubh(true, true);
            }
            Exception exc4 = c77489Ub7.LIZIZ;
            if (!(exc4 instanceof C29401Dk)) {
                return C77526Ubi.LIZ();
            }
            CustomErrorExtra customErrorExtra2 = CustomErrorExtra.getCustomErrorExtra(exc4);
            Exception exc5 = c77489Ub7.LIZIZ;
            o.LJII(exc5, "null cannot be cast to non-null type com.bytedance.android.live.api.exceptions.server.ApiServerException");
            String extra2 = ((C29401Dk) exc5).getExtra();
            o.LJIIIIZZ(extra2, "exchangeException.except…ApiServerException).extra");
            if (extra2.length() == 0) {
                z = true;
            }
            boolean z2 = !z;
            Exception exc6 = c77489Ub7.LIZIZ;
            o.LJII(exc6, "null cannot be cast to non-null type com.bytedance.android.live.api.exceptions.server.ApiServerException");
            C276516r c276516r2 = (C276516r) exc6;
            if (!z2 || customErrorExtra2 == null) {
                return C77526Ubi.LIZ();
            }
            int errorCode2 = c276516r2.getErrorCode();
            UI8 ui84 = c77489Ub7.LJ;
            if (ui84 != null) {
                interfaceC77524Ubg = LIZIZ(errorCode2, ui84);
            }
            return LIZJ(context, customErrorExtra2, interfaceC77524Ubg, c77489Ub7.LIZLLL, c77489Ub7.LIZJ, c77489Ub7.LJ);
        }
        return UIG.LIZ();
    }

    public static C77525Ubh LIZJ(Context context, CustomErrorExtra customErrorExtra, InterfaceC77524Ubg interfaceC77524Ubg, Runnable runnable, Runnable runnable2, UI8 ui8) {
        CustomErrorExtra.ExtraEntity extraEntity;
        String str;
        int i;
        BNS bns;
        java.util.Map<String, String> map;
        o.LJIIIZ(context, "context");
        int promptType = customErrorExtra.getPromptType();
        if (promptType == 2) {
            C77522Ube c77522Ube = new C77522Ube(customErrorExtra, interfaceC77524Ubg, ui8);
            if (c77522Ube.LIZ != null) {
                C46529INx.LIZ.post(new ARunnableS49S0100000_13(c77522Ube, 258));
                return new C77525Ubh(true, true);
            }
        } else {
            String str2 = "send_gift";
            String str3 = "exchange";
            if (promptType == 1) {
                C77520Ubc c77520Ubc = new C77520Ubc(context, customErrorExtra, interfaceC77524Ubg, ui8);
                if (!o.LJ(c77520Ubc.LJ, "") && (!o.LJ(c77520Ubc.LJI, "") || !o.LJ(c77520Ubc.LJFF, ""))) {
                    c77520Ubc.LJIIJJI = runnable;
                    c77520Ubc.LJIIL = runnable2;
                    Context context2 = c77520Ubc.LIZ;
                    o.LJIIIIZZ(context2, "ensureLiveDesign(context)");
                    c77520Ubc.LIZ = context2;
                    InterfaceC77521Ubd interfaceC77521Ubd = c77520Ubc.LJIILJJIL;
                    CustomErrorExtra customErrorExtra2 = null;
                    if (interfaceC77521Ubd != null) {
                        c77520Ubc.LIZJ = interfaceC77521Ubd.LIZIZ(context2, c77520Ubc.LJ, c77520Ubc.LJIIIIZZ, c77520Ubc);
                        C47071t1 c47071t1 = new C47071t1(c77520Ubc.LIZ);
                        IDcS172S0100000_13 iDcS172S0100000_13 = new IDcS172S0100000_13(c77520Ubc, 36);
                        IDcS172S0100000_13 iDcS172S0100000_132 = new IDcS172S0100000_13(c77520Ubc, 37);
                        c47071t1.LJIJ = new IDCListenerS287S0100000_13(c77520Ubc, 3);
                        InterfaceC77521Ubd interfaceC77521Ubd2 = c77520Ubc.LJIILJJIL;
                        if (interfaceC77521Ubd2 != null) {
                            C77523Ubf icon = interfaceC77521Ubd2.getIcon();
                            if (icon != null) {
                                C0NG c0ng = icon.LJLIL;
                                c47071t1.LIZIZ();
                                c0ng.LIZJ = 1;
                                c47071t1.LJFF = c0ng;
                                c47071t1.LJIIIIZZ = C15380j0.LIZ(icon.LJLJI);
                                c47071t1.LJII = C15380j0.LIZ(icon.LJLILLLLZI);
                            }
                            c47071t1.LJIILL = false;
                            c47071t1.LIZJ = c77520Ubc.LIZLLL;
                            SpannableStringBuilder spannableStringBuilder = c77520Ubc.LIZJ;
                            if (spannableStringBuilder != null) {
                                c47071t1.LJII(spannableStringBuilder);
                                InterfaceC77521Ubd interfaceC77521Ubd3 = c77520Ubc.LJIILJJIL;
                                if (interfaceC77521Ubd3 != null) {
                                    C006800y LIZ2 = interfaceC77521Ubd3.LIZ(c77520Ubc.LJI, iDcS172S0100000_13, c77520Ubc.LJFF, iDcS172S0100000_132);
                                    if (LIZ2 != null) {
                                        c47071t1.LJIJJLI = LIZ2;
                                        c47071t1.LJIJJ = null;
                                    } else {
                                        c47071t1.LJIIJ(c77520Ubc.LJFF, iDcS172S0100000_132);
                                        c47071t1.LJIILIIL(c77520Ubc.LJI, iDcS172S0100000_13);
                                    }
                                    LiveDialog LIZ3 = c47071t1.LIZ();
                                    if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ3, new Object[0], "void", new C65300Pk0(false, "()V", "-7030210794037891429")).LIZ) {
                                        LIZ3.show();
                                    }
                                    InterfaceC77524Ubg interfaceC77524Ubg2 = c77520Ubc.LIZIZ;
                                    if (interfaceC77524Ubg2 != null) {
                                        interfaceC77524Ubg2.onShow();
                                    }
                                    UI8 ui82 = c77520Ubc.LJIILIIL;
                                    if (ui82 != null) {
                                        if (ui82.LJIILIIL) {
                                            str3 = "recharge";
                                        } else if (ui82.LJIIJJI == 11) {
                                            str3 = "send_gift";
                                        }
                                        Exception exc = ui82.LIZLLL;
                                        if (exc instanceof C29401Dk) {
                                            o.LJII(exc, "null cannot be cast to non-null type com.bytedance.android.live.api.exceptions.server.ApiServerException");
                                            C276516r c276516r = (C276516r) exc;
                                            i = c276516r.getErrorCode();
                                            customErrorExtra2 = CustomErrorExtra.getCustomErrorExtra(c276516r);
                                        } else {
                                            i = -1;
                                        }
                                        String LIZ4 = C76828UDg.LIZ(ui82.LJIIIIZZ.get("gift_enter_from"));
                                        BZI LIZ5 = C28787BRn.LIZ("livesdk_wallet_limit_popup_show");
                                        LIZ5.LJIIZILJ();
                                        LIZ5.LJIJJ(Integer.valueOf(i), "error_code");
                                        LIZ5.LJIJJ(str3, "entry_type");
                                        if (o.LJ(str3, "send_gift")) {
                                            LIZ5.LJIJJ(LIZ4, "gift_enter_from");
                                        } else {
                                            LIZ5.LJIJJ(C77541Ubx.LJII(ui82), "hit_entry");
                                        }
                                        if (customErrorExtra2 != null && (bns = customErrorExtra2.extraMap) != null && (map = bns.LIZIZ) != null) {
                                            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                                                Object key = entry.getKey();
                                                o.LJIIIIZZ(key, "entry.key");
                                                LIZ5.LJIJJ(entry.getValue(), (String) key);
                                            }
                                        }
                                        C77541Ubx.LIZIZ(LIZ5);
                                        LIZ5.LJJIIJZLJL();
                                    }
                                    return new C77525Ubh(true, false);
                                }
                                o.LJIJI("popUpStyle");
                                throw null;
                            }
                            o.LJIJI("contentBuilder");
                            throw null;
                        }
                        o.LJIJI("popUpStyle");
                        throw null;
                    }
                    o.LJIJI("popUpStyle");
                    throw null;
                }
            } else if (promptType == CustomErrorExtra.PROMPT_TYPE_FE) {
                C45922I0o c45922I0o = new C45922I0o(context, customErrorExtra, ui8);
                CustomErrorExtra customErrorExtra3 = (CustomErrorExtra) c45922I0o.LIZIZ;
                if (customErrorExtra3 != null && (extraEntity = customErrorExtra3.getExtraEntity()) != null && (str = extraEntity.linkToJump) != null) {
                    l0 l0Var = new l0(str);
                    UI8 ui83 = (UI8) c45922I0o.LIZJ;
                    if (ui83 != null) {
                        if (ui83.LJIILIIL) {
                            str2 = "recharge";
                        } else if (ui83.LJIIJJI != 11) {
                            str2 = "exchange";
                        }
                        l0Var.LIZ.LIZJ("entry_type", str2);
                        l0Var.LIZ.LIZJ("hit_entry", C77541Ubx.LJII((UI8) c45922I0o.LIZJ));
                        String rawJson = ((CustomErrorExtra) c45922I0o.LIZIZ).getRawJson();
                        o.LJIIIIZZ(rawJson, "customErrorExtra.rawJson");
                        l0Var.LIZ.LIZJ("custom_error", rawJson);
                    }
                    ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(c45922I0o.LIZ, l0Var.LIZ.LIZLLL());
                }
                return new C77525Ubh(true, false);
            }
        }
        return C77526Ubi.LIZ();
    }
}
