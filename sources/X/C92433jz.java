package X;

import Y.IDDListenerS141S0100000_1;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.privacy.data.model.ChatUserSetting;
import com.ss.android.ugc.aweme.im.sdk.privacy.ui.fragment.MessagingPrivacyFragment;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* renamed from: X.3jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92433jz implements InterfaceC116514hj {
    public static final C92433jz LIZ = new C92433jz();

    @Override // X.InterfaceC116514hj
    public final void LIZIZ() {
        Keva LIZIZ = C92343jq.LIZ.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_last_user_set_time");
        LIZ2.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        LIZIZ.storeLong(X1D.LIZIZ(LIZ2), System.currentTimeMillis());
    }

    @Override // X.InterfaceC116514hj
    public final boolean LIZJ() {
        return C92343jq.LIZ.LIZ("personal_homepage");
    }

    @Override // X.InterfaceC116514hj
    public final boolean LIZ() {
        return C53332KwS.LIZ();
    }

    @Override // X.InterfaceC116514hj
    public final void LJ(int i) {
        ChatUserSetting chatUserSetting;
        C80993Fv LIZ2 = C80993Fv.LIZ();
        ChatUserSetting LIZIZ = LIZ2.LIZIZ();
        if (LIZIZ != null) {
            chatUserSetting = ChatUserSetting.copy$default(LIZIZ, i, 0, 0, 4, null);
        } else {
            chatUserSetting = null;
        }
        LIZ2.LIZJ(chatUserSetting);
    }

    @Override // X.InterfaceC116514hj
    public final Object LIZLLL(String str, InterfaceC67352kd interfaceC67352kd) {
        return C80753Ex.LIZ(C30U.LIZ(), "msg_read_status_notice", "dm_chat", 2, str, null, interfaceC67352kd, 16);
    }

    @Override // X.InterfaceC116514hj
    public final void LJFF(int i, int i2, int i3) {
        C80993Fv.LIZ().LIZJ(new ChatUserSetting(i, i2, i3));
    }

    @Override // X.InterfaceC116514hj
    public final void LJI(final Context context, final String str, final InterfaceC56322M8o interfaceC56322M8o) {
        final FragmentManager supportFragmentManager;
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            if (!o.LJ(str, "notification_page")) {
                if (o.LJ(str, "personal_homepage")) {
                    if (C85753Yd.LIZ() != 0 && C85753Yd.LIZ() != 2) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (interfaceC56322M8o != null) {
                PopupManager.LJIIL(new AbstractC56327M8t<DialogFragment>(context, supportFragmentManager, str, interfaceC56322M8o) { // from class: X.3ju
                    public final Context LJLIL;
                    public final FragmentManager LJLILLLLZI;
                    public final String LJLJI;
                    public final int LJLJJI;

                    @Override // X.M74
                    public final boolean canShow() {
                        return C92343jq.LIZ.LIZ(this.LJLJI);
                    }

                    @Override // X.InterfaceC56321M8n
                    public final int getPriority() {
                        return this.LJLJJI;
                    }

                    @Override // com.bytedance.poplayer.IPopupTask
                    public final Object showPopup(C54082LKk popupContext) {
                        o.LJIIIZ(popupContext, "popupContext");
                        C92403jw c92403jw = new C92403jw(this.LJLIL);
                        FragmentManager fm = this.LJLILLLLZI;
                        final String enterFrom = this.LJLJI;
                        o.LJIIIZ(fm, "fm");
                        o.LJIIIZ(enterFrom, "enterFrom");
                        ASL asl = new ASL();
                        C92233jf c92233jf = new C92233jf(c92403jw.LIZ);
                        TuxSheet tuxSheet = asl.LIZ;
                        tuxSheet.LJLLI = c92233jf;
                        tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.3ji
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                if (dialogInterface == null) {
                                    return;
                                }
                                AST LJIIIIZZ = ASQ.LJIIIIZZ(dialogInterface);
                                if (LJIIIIZZ instanceof C92253jh) {
                                    C92253jh c92253jh = (C92253jh) LJIIIIZZ;
                                    C92293jl.LIZ(enterFrom, c92253jh.LIZ, c92253jh.LIZIZ, 8);
                                } else {
                                    C92293jl.LIZ(enterFrom, 0, 0, 12);
                                }
                            }
                        };
                        tuxSheet.show(fm, "EveryonePopupSheet");
                        C85323Wm LIZ2 = C772831o.LIZ();
                        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", enterFrom, WM7.SCENE_SERVICE, "prompt_dm_upgrade");
                        LIZ3.put("banner_type", "everyone_permission");
                        LIZ2.LIZIZ("show_expanded_dm_permission_pop_up", LIZ3);
                        C92343jq c92343jq = C92343jq.LIZ;
                        Keva LIZIZ = c92343jq.LIZIZ();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("key_everyone_popup_show_count");
                        LIZ4.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
                        int i = LIZIZ.getInt(X1D.LIZIZ(LIZ4), 0);
                        long L = ((C71202qq) C92343jq.LIZIZ.getValue()).L(i);
                        Keva LIZIZ2 = c92343jq.LIZIZ();
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("key_everyone_popup_next_timestamp");
                        LIZ5.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
                        LIZIZ2.storeLong(X1D.LIZIZ(LIZ5), System.currentTimeMillis() + L);
                        Keva LIZIZ3 = c92343jq.LIZIZ();
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("key_everyone_popup_show_count");
                        LIZ6.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
                        LIZIZ3.storeInt(X1D.LIZIZ(LIZ6), i + 1);
                        return tuxSheet;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(interfaceC56322M8o);
                        o.LJIIIZ(context, "context");
                        o.LJIIIZ(interfaceC56322M8o, "popupScene");
                        this.LJLIL = context;
                        this.LJLILLLLZI = supportFragmentManager;
                        this.LJLJI = str;
                        o.LJ(str, "personal_homepage");
                        this.LJLJJI = 489;
                    }
                });
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet, androidx.fragment.app.DialogFragment] */
    @Override // X.InterfaceC116514hj
    public final void LJII(String str, FragmentManager fragmentManager, C96453qT c96453qT) {
        C80993Fv LIZ2;
        ChatUserSetting LIZIZ;
        long j;
        if (!o.LJ(str, "notification_page") && (LIZIZ = (LIZ2 = C80993Fv.LIZ()).LIZIZ()) != null) {
            Integer valueOf = Integer.valueOf(LIZIZ.getChatSettingsPanel());
            if (valueOf.intValue() == 1 && 1 != 0) {
                valueOf.intValue();
                long j2 = LIZ2.LIZ.getLong("chat_user_setting_last_open", 0L);
                long currentTimeMillis = System.currentTimeMillis();
                if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
                    j = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getDebugDayTimeDuration();
                } else {
                    j = 86400000;
                }
                if (j2 < currentTimeMillis - j && LIZ2.LIZ.getInt("chat_user_setting_open_count", 0) < 3) {
                    valueOf.intValue();
                    LIZ2.LIZ.edit().putLong("chat_user_setting_last_open", System.currentTimeMillis()).commit();
                    LIZ2.LIZ.edit().putInt("chat_user_setting_open_count", LIZ2.LIZ.getInt("chat_user_setting_open_count", 0) + 1).commit();
                    C68322mC c68322mC = new C68322mC();
                    ASL asl = new ASL();
                    MessagingPrivacyFragment messagingPrivacyFragment = new MessagingPrivacyFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("chat_set_extra", LIZIZ.getChatSet());
                    bundle.putString("enter_from_extra", str);
                    bundle.putInt("user_type_extra", LIZIZ.getChatUserType());
                    bundle.putInt("open_count_extra", LIZ2.LIZ.getInt("chat_user_setting_open_count", 0));
                    messagingPrivacyFragment.setArguments(bundle);
                    messagingPrivacyFragment.LJLIL = new C92523k8(messagingPrivacyFragment, c68322mC);
                    asl.LIZ.LJLLILLLL = messagingPrivacyFragment;
                    asl.LJI(1);
                    IDDListenerS141S0100000_1 iDDListenerS141S0100000_1 = new IDDListenerS141S0100000_1(c96453qT, 12);
                    ?? r1 = asl.LIZ;
                    r1.LJLILLLLZI = iDDListenerS141S0100000_1;
                    c68322mC.element = r1;
                    r1.show(fragmentManager, "Chat Privacy Panel");
                }
            }
        }
    }
}
