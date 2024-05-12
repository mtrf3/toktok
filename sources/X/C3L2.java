package X;

import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3L2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3L2 extends C3LK {
    public static final /* synthetic */ int LLIILII = 0;
    public String LLIIJI;
    public C63120Opw LLIIJLIL;
    public String LLIIL;

    @Override // X.C3L5, X.C3L4
    public final String LJFF() {
        return "message_request_1";
    }

    @Override // X.C3LK, X.C3L3, X.C3L4
    public final int LJIIIIZZ() {
        return 2;
    }

    @Override // X.C3LK, X.C3L3, X.C3L4
    public final C3OB LIZJ() {
        return new C3OB() { // from class: X.3Og
            @Override // X.C3OB
            public final void LIZ(ActivityC45651qj activity, C3L4 session, int i, java.util.Map<String, String> map) {
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(session, "session");
                if (i != 1 && i != 2) {
                    if (i == 0) {
                        C83253On.LIZIZ(activity);
                    }
                } else {
                    C16880lQ.LIZJ(activity, new Intent(activity, (Class<?>) MessageRequestsActivity.class));
                    C3L2.this.getClass();
                    C2U8.LIZ(new C54251LQx(11, -1));
                    FMX.onEventV3("im_click_stranger_message");
                }
            }
        };
    }

    @Override // X.C3LK, X.C3L3
    /* renamed from: LJIIZILJ */
    public final C3L3 clone() {
        C3L2 c3l2 = new C3L2(LJIJI(), this.LLIIIILZ);
        LJIJ(c3l2);
        return c3l2;
    }

    @Override // X.C3L4
    /* renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final String LIZLLL() {
        String charSequence;
        String str = this.LLIIJI;
        if (str != null) {
            String valueOf = String.valueOf(C81273Gx.LIZLLL(str));
            IMUser LJIIJ = C80533Eb.LJIIJ(valueOf, this.LLIIIILZ);
            StringBuilder LIZIZ = C25620zW.LIZIZ("wrapContent: ", valueOf, ", ");
            LIZIZ.append(this.LLIIIILZ);
            C34B.LIZIZ("MessageRequestInboxSession", X1D.LIZIZ(LIZIZ));
            if (LJIIJ != null) {
                StringBuilder LIZ = X1D.LIZ();
                String displayName = LJIIJ.getDisplayName();
                o.LJIIIIZZ(displayName, "user.displayName");
                if (!TextUtils.isEmpty(displayName) && displayName.length() > 6) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    String substring = displayName.substring(0, 6);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    LIZ2.append(substring);
                    LIZ2.append("...");
                    displayName = X1D.LIZIZ(LIZ2);
                }
                LIZ.append(displayName);
                LIZ.append(' ');
                LIZ.append((Object) this.LJLJJL);
                return X1D.LIZIZ(LIZ);
            }
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("wrapContent user null: ", valueOf, ", ");
            LIZIZ2.append(this.LLIIIILZ);
            C34B.LIZJ("MessageRequestInboxSession", X1D.LIZIZ(LIZIZ2));
            CharSequence charSequence2 = this.LJLJJL;
            if (charSequence2 != null && (charSequence = charSequence2.toString()) != null) {
                return charSequence;
            }
            return "";
        }
        o.LJIJI("lastConversationId");
        throw null;
    }

    @Override // X.C3LK, X.C3L3
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // X.C3L5, X.C3L4
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.LLIIJI;
        if (str != null) {
            return str.hashCode() + hashCode;
        }
        o.LJIJI("lastConversationId");
        throw null;
    }

    @Override // X.C3LK, X.C3L4
    public final String LJ() {
        return this.LLIIL;
    }

    @Override // X.C3L3
    public final void LJIJ(C3L3 c3l3) {
        C3L2 c3l2;
        super.LJIJ(c3l3);
        if ((c3l3 instanceof C3L2) && (c3l2 = (C3L2) c3l3) != null) {
            String str = this.LLIIJI;
            if (str != null) {
                c3l2.LLIIJI = str;
                c3l2.LLIIJLIL = this.LLIIJLIL;
                c3l2.LLIIL = this.LLIIL;
                return;
            }
            o.LJIJI("lastConversationId");
            throw null;
        }
    }

    @Override // X.C3L5, X.C3L4
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3L2)) {
            return false;
        }
        String str = this.LLIIJI;
        if (str != null) {
            C3L2 c3l2 = (C3L2) obj;
            String str2 = c3l2.LLIIJI;
            if (str2 != null) {
                if (TextUtils.equals(str, str2) && TextUtils.equals(this.LJLJJI, c3l2.LJLJJI) && TextUtils.equals(this.LLIIL, c3l2.LLIIL) && TextUtils.equals(this.LJLJJL, c3l2.LJLJJL) && this.LJLJL == c3l2.LJLJL && this.LJLLILLLL == c3l2.LJLLILLLL && this.LJLLLL == c3l2.LJLLLL) {
                    return true;
                }
                return false;
            }
            o.LJIJI("lastConversationId");
            throw null;
        }
        o.LJIJI("lastConversationId");
        throw null;
    }

    public C3L2(IMUser iMUser, String str) {
        super(iMUser, str);
        this.LLIIL = C1DD.LIZLLL(R.string.i3d, "AppContextManager.getApp…ng.message_request_inbox)");
    }
}
