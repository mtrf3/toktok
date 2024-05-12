package X;

import Y.AfS65S0100000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.relation.fragment.ContactsInvitePanelFragment;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.P2i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63804P2i implements InterfaceC62585OhJ {
    public final Context LIZ;
    public final Bundle LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;
    public final InterfaceC65784Pro<C76800UCe> LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final ContactsInvitePanelFragment LJIIL;
    public final C62822Ol8 LJIILIIL;

    public final void LIZ() {
        C221018lt.LJFF("Invite Panel", "popup");
        C67942QlW c67942QlW = new C67942QlW((String) this.LJII.getValue());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", (String) c67942QlW.LJLIL);
        FMX.LJIIL("invite_friend_show", c188727au.LIZ);
        FragmentManager fragmentManager = (FragmentManager) this.LJIIIIZZ.getValue();
        if (fragmentManager != null) {
            ((DialogFragment) this.LJIILIIL.getValue()).show(fragmentManager, "Invite Panel");
        }
        ((P1W) ((AbstractC63778P1i) this.LJIIJJI.getValue())).LJFF();
    }

    @Override // X.InterfaceC62585OhJ
    public final void show() {
        LifecycleCoroutineScope lifecycleScope;
        if (UPZ.LIZ.LIZJ()) {
            C221018lt.LJFF("Invite Panel", "has permission");
            LIZ();
        } else {
            if (C52926Kpu.LIZ()) {
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LIZ);
                if (LJJIFFI == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) == null) {
                    return;
                }
                XKX.LIZLLL(lifecycleScope, null, null, new C77158UPy(this, null), 3);
                return;
            }
            ((C73318Sq2) this.LJIIIZ.getValue()).LIZ(T3Q.LIZIZ(this.LIZ, ContactUFR.class, ((RBX) HG3.LJIILL()).getCurUserId(), (String) this.LJII.getValue(), "", true, null).LJJJLIIL(new AfS65S0100000_13(this, 185), new InterfaceC64592gB() { // from class: X.4kC
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("UFR error! ");
                    LIZ.append(th.getCause());
                    LIZ.append(' ');
                    LIZ.append(th.getMessage());
                    C221018lt.LIZIZ("Invite Panel", X1D.LIZIZ(LIZ));
                }
            }));
        }
    }

    public C63804P2i(Context context, Bundle bundle, String str, String str2, AqS157S0200000_10 aqS157S0200000_10, AqS157S0200000_10 aqS157S0200000_102) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = bundle;
        this.LIZJ = str;
        this.LIZLLL = "";
        this.LJ = str2;
        this.LJFF = aqS157S0200000_10;
        this.LJI = aqS157S0200000_102;
        this.LJII = C221108m2.LIZIZ(new AqS163S0100000_13(this, 464));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 622));
        this.LJIIIZ = C221108m2.LIZIZ(SLC.LJLIL);
        this.LJIIJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 518));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 519));
        this.LJIIJJI = LIZIZ;
        Fragment instantiate = Fragment.instantiate(context, ContactsInvitePanelFragment.class.getName(), (Bundle) C221108m2.LIZIZ(new AqS163S0100000_13(this, 465)).getValue());
        o.LJII(instantiate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.fragment.ContactsInvitePanelFragment");
        ContactsInvitePanelFragment contactsInvitePanelFragment = (ContactsInvitePanelFragment) instantiate;
        AbstractC63778P1i widget = (AbstractC63778P1i) LIZIZ.getValue();
        o.LJIIIZ(widget, "widget");
        contactsInvitePanelFragment.LJLIL = widget;
        this.LJIIL = contactsInvitePanelFragment;
        this.LJIILIIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 623));
    }
}
