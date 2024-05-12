package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3GC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GC implements InterfaceC86093Zl {
    public static final C3GC LIZ = new C3GC();

    @Override // X.InterfaceC86093Zl
    public final List<IMUser> LIZJ() {
        return C785836o.LIZ().LIZ();
    }

    @Override // X.InterfaceC86093Zl
    public final void LJFF() {
        Keva LJFF = C92353jr.LIZ.LJFF();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_dm_maf_setting");
        LIZ2.append(C92353jr.LIZJ());
        LJFF.storeBoolean(X1D.LIZIZ(LIZ2), true);
    }

    @Override // X.InterfaceC86093Zl
    public final boolean LJII() {
        return C92353jr.LIZ.LIZIZ("personal_homepage");
    }

    @Override // X.InterfaceC86093Zl
    public final void LJIIIIZZ() {
        C92353jr.LIZ.LJFF().storeLong(C92353jr.LJ(), System.currentTimeMillis() + 86400000);
    }

    @Override // X.InterfaceC86093Zl
    public final MAFIMUser LIZLLL(String str) {
        C785836o.LIZ().getClass();
        return C3FW.LIZIZ(str);
    }

    @Override // X.InterfaceC86093Zl
    public final void LJ(IMUser newUser) {
        o.LJIIIZ(newUser, "newUser");
        C785836o.LIZ().getClass();
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C80783Fa(newUser, null), 2);
    }

    @Override // X.InterfaceC86093Zl
    public final boolean LJI(String str) {
        C785836o.LIZ().getClass();
        return C3FW.LIZJ(str);
    }

    @Override // X.InterfaceC86093Zl
    public final void LIZ(int i, String str) {
        if (i == 1) {
        }
    }

    @Override // X.InterfaceC86093Zl
    public final void LIZIZ(final Context context, final String str, final InterfaceC56322M8o interfaceC56322M8o) {
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
                PopupManager.LJIIL(new AbstractC56327M8t<DialogFragment>(context, supportFragmentManager, str, interfaceC56322M8o) { // from class: X.3jv
                    public final Context LJLIL;
                    public final FragmentManager LJLILLLLZI;
                    public final String LJLJI;
                    public final int LJLJJI;

                    @Override // X.M74
                    public final boolean canShow() {
                        return C92353jr.LIZ.LIZIZ(this.LJLJI);
                    }

                    @Override // X.InterfaceC56321M8n
                    public final int getPriority() {
                        return this.LJLJJI;
                    }

                    @Override // com.bytedance.poplayer.IPopupTask
                    public final Object showPopup(C54082LKk popupContext) {
                        boolean z;
                        o.LJIIIZ(popupContext, "popupContext");
                        C92413jx c92413jx = new C92413jx(this.LJLIL);
                        FragmentManager fm = this.LJLILLLLZI;
                        final String enterFrom = this.LJLJI;
                        o.LJIIIZ(fm, "fm");
                        o.LJIIIZ(enterFrom, "enterFrom");
                        ASL asl = new ASL();
                        C92463k2 c92463k2 = new C92463k2(c92413jx.LIZ);
                        TuxSheet tuxSheet = asl.LIZ;
                        tuxSheet.LJLLI = c92463k2;
                        tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.3k0
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                if (dialogInterface == null) {
                                    return;
                                }
                                AST LJIIIIZZ = ASQ.LJIIIIZZ(dialogInterface);
                                if (LJIIIIZZ instanceof C92453k1) {
                                    if (((Number) C92493k5.LIZ.getValue()).intValue() > 0) {
                                        C92453k1 c92453k1 = (C92453k1) LJIIIIZZ;
                                        C102303zu.LIZIZ(c92453k1.LIZ, c92453k1.LIZIZ, enterFrom);
                                        return;
                                    } else {
                                        C102303zu.LIZJ(((C92453k1) LJIIIIZZ).LIZ, enterFrom);
                                        return;
                                    }
                                }
                                if (((Number) C92493k5.LIZ.getValue()).intValue() > 0) {
                                    C102303zu.LIZIZ(0, 1, enterFrom);
                                } else {
                                    C102303zu.LIZJ(0, enterFrom);
                                }
                            }
                        };
                        tuxSheet.show(fm, "MatchedFriendsSheet");
                        if (((Number) C92493k5.LIZ.getValue()).intValue() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("enter_from", enterFrom);
                            c188727au.LJIIIZ(WM7.SCENE_SERVICE, "reshow_simplification");
                            c188727au.LJIIIZ("banner_type", "suggested_friends_permission");
                            FMX.LJIIL("show_expanded_dm_permission_pop_up", c188727au.LIZ);
                        } else {
                            C188727au c188727au2 = new C188727au();
                            c188727au2.LJIIIZ("enter_from", enterFrom);
                            c188727au2.LJIIIZ(WM7.SCENE_SERVICE, "matched_friends");
                            FMX.LJIIL("show_recommended_dm_permission_pop_up", c188727au2.LIZ);
                        }
                        C92353jr c92353jr = C92353jr.LIZ;
                        Keva LJFF = c92353jr.LJFF();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("key_maf_intro_panel_show_num");
                        LIZ2.append(C92353jr.LIZJ());
                        int i = LJFF.getInt(X1D.LIZIZ(LIZ2), 0);
                        c92353jr.LJFF().storeLong(C92353jr.LJ(), System.currentTimeMillis() + ((C71202qq) C92353jr.LIZIZ.getValue()).L(i));
                        Keva LJFF2 = c92353jr.LJFF();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("key_maf_intro_panel_show_num");
                        LIZ3.append(C92353jr.LIZJ());
                        LJFF2.storeInt(X1D.LIZIZ(LIZ3), i + 1);
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
                        this.LJLJJI = 490;
                    }
                });
            }
        }
    }
}
