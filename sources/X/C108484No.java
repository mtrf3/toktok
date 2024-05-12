package X;

import Y.ACListenerS21S0100000_1;
import Y.AUListenerS90S0100000_1;
import android.animation.AnimatorSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4No, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108484No {
    public final C108434Nj LIZ;
    public final SharePackage LIZIZ;
    public final InterfaceC108594Nz LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public final C62822Ol8 LJFF;
    public final AUListenerS90S0100000_1 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public boolean LJIIL;

    public final C4O5 LIZIZ() {
        return (C4O5) this.LJIIJJI.getValue();
    }

    public final void LIZJ() {
        boolean z;
        if (C00F.LIZ(31744, 0, "im_group_chat_creation_share_panel_optimization", false) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SY4 sy4 = this.LIZ.LIZJ;
            if (sy4 != null) {
                sy4.setVisibility(8);
            }
            this.LJ = false;
            this.LIZJ.ua(false);
            return;
        }
        if (this.LIZ.LIZ.getVisibility() != 8) {
            LJ(false);
            ((AnimatorSet) this.LJIIIIZZ.getValue()).start();
        }
    }

    public final void LIZLLL() {
        boolean z = this.LIZLLL;
        if (z) {
            LJ(z);
        }
        SY4 sy4 = this.LIZ.LIZJ;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 274));
        }
    }

    public final void LJFF() {
        SharePackage sharePackage = this.LIZIZ;
        if (C92333jp.LIZIZ() && !C84283Sm.LJIIJ(sharePackage)) {
            java.util.Set<IMContact> LIZJ = LIZIZ().LIZJ();
            if (!(LIZJ instanceof Collection) || !LIZJ.isEmpty()) {
                Iterator<IMContact> it = LIZJ.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof MAFIMUser) {
                        break;
                    }
                }
            }
            if (!LIZIZ().LJ()) {
                C4O5 LIZIZ = LIZIZ();
                if (LIZIZ.LIZIZ().isEmpty() && LIZIZ.LIZJ().isEmpty()) {
                    if (C00F.LIZ(31744, 0, "im_group_chat_creation_share_panel_optimization", false) == 2) {
                        if (!this.LJ) {
                            SY4 sy4 = this.LIZ.LIZJ;
                            if (sy4 != null) {
                                sy4.setVisibility(0);
                            }
                            C107234It.LIZJ(this.LIZIZ, CardStruct.IStatusCode.DEFAULT);
                        }
                    } else {
                        LinearLayout linearLayout = this.LIZ.LIZ;
                        if (linearLayout.getVisibility() != 0) {
                            linearLayout.setVisibility(0);
                            ((AnimatorSet) this.LJII.getValue()).start();
                        }
                    }
                    this.LIZJ.YX(true);
                    return;
                }
            }
        }
        LIZJ();
        this.LIZJ.YX(false);
    }

    public final boolean LIZ(InterfaceC88472Yns<? super C63120Opw, C76800UCe> interfaceC88472Yns) {
        String str;
        if (!C92333jp.LIZIZ()) {
            C34B.LJI("CreateGroupChatWidget", "group chat not supported");
            LIZJ();
        } else if (this.LJIIJ) {
            C34B.LJI("CreateGroupChatWidget", "is requesting");
        } else {
            C4O5 LIZIZ = LIZIZ();
            if (LIZIZ.LIZIZ().isEmpty() && LIZIZ.LIZ().isEmpty() && LIZIZ.LIZJ().isEmpty()) {
                C34B.LJI("CreateGroupChatWidget", "empty contact list");
            } else if (LIZIZ().LJ()) {
                C34B.LJI("CreateGroupChatWidget", "contact list size is less than 2");
            } else {
                C4O5 LIZIZ2 = LIZIZ();
                if (LIZIZ2.LIZIZ().isEmpty() && LIZIZ2.LIZJ().isEmpty()) {
                    this.LJIIJ = true;
                    if (C00F.LIZ(31744, 0, "im_group_chat_creation_share_panel_optimization", false) == 1) {
                        if (this.LJIIL) {
                            str = CardStruct.IStatusCode.DEFAULT;
                        } else {
                            if (C108514Nr.LIZ()) {
                                str = "3";
                            }
                            str = null;
                        }
                    } else {
                        if (C00F.LIZ(31744, 0, "im_group_chat_creation_share_panel_optimization", false) == 2) {
                            str = "1";
                        }
                        str = null;
                    }
                    C3IY LIZ = C81093Gf.LIZ();
                    C4O5 LIZIZ3 = LIZIZ();
                    LIZIZ3.getClass();
                    C3IY.LIZ(LIZ, C92333jp.LIZ(ORZ.LLJI(LIZIZ3.LIZ())), "share_panel", null, str, interfaceC88472Yns, 4);
                    C4O5 LIZIZ4 = LIZIZ();
                    LIZIZ4.getClass();
                    C90643h6.LJII(C92333jp.LIZ(ORZ.LLJI(LIZIZ4.LIZ())));
                    return true;
                }
                C34B.LJI("CreateGroupChatWidget", "contact list contains group chat or single-follow user");
            }
        }
        return false;
    }

    public final void LJ(boolean z) {
        if (this.LJIIIZ == z) {
            return;
        }
        this.LJIIIZ = z;
        this.LIZ.LIZIZ.setChecked(z);
        this.LIZJ.gD(this.LJIIIZ);
    }

    public /* synthetic */ C108484No(C108434Nj c108434Nj, SharePackage sharePackage, InterfaceC108594Nz interfaceC108594Nz) {
        this(c108434Nj, sharePackage, interfaceC108594Nz, false, false);
    }

    public C108484No(C108434Nj c108434Nj, SharePackage sharePackage, InterfaceC108594Nz callback, boolean z, boolean z2) {
        o.LJIIIZ(callback, "callback");
        this.LIZ = c108434Nj;
        this.LIZIZ = sharePackage;
        this.LIZJ = callback;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = C221108m2.LIZIZ(C108524Ns.LJLIL);
        this.LJI = new AUListenerS90S0100000_1(this, 98);
        this.LJII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1057));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1058));
        this.LJIIJJI = C221108m2.LIZIZ(C108564Nw.LJLIL);
        C101073xv.LIZIZ(c108434Nj.LIZ);
        c108434Nj.LIZIZ.setClickable(false);
        C16880lQ.LJIIZILJ(c108434Nj.LIZ, new ACListenerS21S0100000_1(this, 273));
        C90643h6.LIZIZ = "share";
    }
}
