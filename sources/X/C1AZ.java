package X;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1AZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AZ extends AnonymousClass070 {
    public final List<C022506z> LJ = new ArrayList();
    public final List<C022506z> LJFF = new ArrayList();
    public final C06V LJI;
    public CharSequence LJII;
    public Boolean LJIIIIZZ;

    @Override // X.AnonymousClass070
    public final String LJ() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public C1AZ() {
        C06U c06u = new C06U();
        c06u.LIZ = "";
        this.LJI = new C06V(c06u);
    }

    @Override // X.AnonymousClass070
    public final void LIZ(Bundle bundle) {
        super.LIZ(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.LJI.LIZ);
        bundle.putBundle("android.messagingStyleUser", this.LJI.LIZ());
        bundle.putCharSequence("android.hiddenConversationTitle", this.LJII);
        if (this.LJII != null && this.LJIIIIZZ.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.LJII);
        }
        if (!((ArrayList) this.LJ).isEmpty()) {
            bundle.putParcelableArray("android.messages", C022506z.LIZ(this.LJ));
        }
        if (!((ArrayList) this.LJFF).isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C022506z.LIZ(this.LJFF));
        }
        Boolean bool = this.LJIIIIZZ;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fd  */
    @Override // X.AnonymousClass070
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.AnonymousClass071 r9) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZ.LIZIZ(X.071):void");
    }

    public final CharSequence LJIIIZ(C022506z c022506z) {
        CharSequence charSequence;
        C13670gF LIZJ = C13670gF.LIZJ();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C06V c06v = c022506z.LIZJ;
        CharSequence charSequence2 = "";
        if (c06v == null) {
            charSequence = "";
        } else {
            charSequence = c06v.LIZ;
        }
        int i = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.LJI.LIZ;
            int i2 = this.LIZ.LJIL;
            if (i2 != 0) {
                i = i2;
            }
        }
        CharSequence LJ = LIZJ.LJ(charSequence, LIZJ.LIZJ);
        spannableStringBuilder.append(LJ);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null), spannableStringBuilder.length() - ((SpannableStringBuilder) LJ).length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = c022506z.LIZ;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append(LIZJ.LJ(charSequence2, LIZJ.LIZJ));
        return spannableStringBuilder;
    }
}
