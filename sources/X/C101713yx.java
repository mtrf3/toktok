package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS44S1200000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101713yx {
    public final Context LIZ;
    public final InterfaceC101733yz LIZIZ;
    public C26231ARf LIZJ;

    public C101713yx(Context context, InterfaceC101733yz interfaceC101733yz) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = interfaceC101733yz;
    }

    public final void LIZ(EnumC101493yb privacy, final String enterMethod, final InterfaceC101763z2 callback) {
        boolean z;
        String LIZIZ;
        String string;
        String string2;
        int i;
        o.LJIIIZ(privacy, "privacy");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(callback, "callback");
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(EnumC101493yb.EVERYONE_CREATORS, EnumC101493yb.FRIENDS, EnumC101493yb.FRIENDS_BEFORE_SEND);
        if (!(LJJIJIIJI instanceof Collection) || !LJJIJIIJI.isEmpty()) {
            Iterator it = LJJIJIIJI.iterator();
            while (it.hasNext()) {
                if (it.next() == privacy) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            String string3 = this.LIZ.getString(R.string.et1);
            o.LJIIIIZZ(string3, "context.getString(R.stri…n_v1_modal_learnmore_btn)");
            int[] iArr = C101523ye.LIZ;
            switch (iArr[privacy.ordinal()]) {
                case 1:
                    String string4 = this.LIZ.getString(R.string.erd);
                    o.LJIIIIZZ(string4, "context.getString(R.stri…pup_everyone_header_desc)");
                    LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(((RBX) HG3.LJIILL()).getCurUser().getFollowerCount()), string3}, 2, string4, "format(format, *args)");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    String string5 = this.LIZ.getString(R.string.esp);
                    o.LJIIIIZZ(string5, "context.getString(R.stri…mindon_friends_will_body)");
                    LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(((RBX) HG3.LJIILL()).getCurUser().getFriendCount()), string3}, 2, string5, "format(format, *args)");
                    break;
                case 6:
                    "permission NO_ONE is not supported by this popup".toString();
                    throw new IllegalStateException("permission NO_ONE is not supported by this popup");
                default:
                    throw new C162476Zf();
            }
            SpannableString spannableString = new SpannableString(LIZIZ);
            int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, string3, 0, false, 6);
            int length = string3.length() + LJJLIIIJL;
            if (LJJLIIIJL >= 0 && length >= 0) {
                spannableString.setSpan(new ClickableSpan() { // from class: X.3yy
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View widget) {
                        o.LJIIIZ(widget, "widget");
                        C59895Nf1.LIZLLL(C101713yx.this.LIZ, "//webview/", "url", "https://support.tiktok.com/en/using-tiktok/messaging-and-notifications/direct-message-settings");
                        EnumC101633yp enumC101633yp = EnumC101633yp.CLICK_LEARN_MORE;
                        C101713yx c101713yx = C101713yx.this;
                        String str = enterMethod;
                        InterfaceC101763z2 interfaceC101763z2 = callback;
                        c101713yx.LIZIZ.LIZ(enumC101633yp, str);
                        interfaceC101763z2.LIZ(enumC101633yp);
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint ds) {
                        o.LJIIIZ(ds, "ds");
                        ds.setUnderlineText(false);
                    }
                }, LJJLIIIJL, length, 33);
                spannableString.setSpan(new T5U(42, false), LJJLIIIJL, length, 33);
                Integer LJI = C79045V0n.LJI(R.attr.go, this.LIZ);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                spannableString.setSpan(new ForegroundColorSpan(i), LJJLIIIJL, length, 33);
            }
            int i2 = iArr[privacy.ordinal()];
            if (i2 != 1) {
                if (i2 == 3 || i2 == 4) {
                    string = this.LIZ.getString(R.string.et0);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("permission ");
                    LIZ.append(privacy);
                    LIZ.append(" is not supported");
                    String LIZIZ2 = X1D.LIZIZ(LIZ);
                    LIZIZ2.toString();
                    throw new IllegalStateException(LIZIZ2);
                }
            } else {
                string = this.LIZ.getString(R.string.erc);
            }
            o.LJIIIIZZ(string, "when (privacy) {\n       …not supported\")\n        }");
            int i3 = iArr[privacy.ordinal()];
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        string2 = this.LIZ.getString(R.string.esz);
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("permission ");
                        LIZ2.append(privacy);
                        LIZ2.append(" is not supported");
                        String LIZIZ3 = X1D.LIZIZ(LIZ2);
                        LIZIZ3.toString();
                        throw new IllegalStateException(LIZIZ3);
                    }
                } else {
                    string2 = this.LIZ.getString(R.string.erx);
                }
            } else {
                string2 = this.LIZ.getString(R.string.er_);
            }
            o.LJIIIIZZ(string2, "when (privacy) {\n       …not supported\")\n        }");
            C26227ARb c26227ARb = new C26227ARb(this.LIZ);
            c26227ARb.LJFF(string);
            c26227ARb.LIZIZ(spannableString);
            C77123UOp.LJIILL(c26227ARb, new AqS44S1200000_1(string2, this, privacy, 6));
            c26227ARb.LJIIIIZZ = true;
            c26227ARb.LJII = true;
            c26227ARb.LIZJ(new AqS44S1200000_1(this, enterMethod, callback, 7));
            C26231ARf LJI2 = c26227ARb.LJI();
            this.LIZJ = LJI2;
            LJI2.LIZLLL();
            this.LIZIZ.LIZIZ(enterMethod);
            return;
        }
        String str = "permission " + privacy + " is not supported";
        str.toString();
        throw new IllegalStateException(str);
    }
}
