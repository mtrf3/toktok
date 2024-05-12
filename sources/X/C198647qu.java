package X;

import android.content.res.Resources;
import android.view.View;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198647qu extends C218978ib {
    @Override // X.C218978ib, X.InterfaceC218828iM
    public void onSelectionChange(List<UserInvitee> userInvitee, View inviteBtn) {
        SY4 sy4;
        o.LJIIIZ(userInvitee, "userInvitee");
        o.LJIIIZ(inviteBtn, "inviteBtn");
        CharSequence charSequence = null;
        if (inviteBtn instanceof SY4) {
            sy4 = (SY4) inviteBtn;
        } else {
            sy4 = null;
        }
        if (userInvitee.isEmpty()) {
            if (sy4 == null) {
                return;
            }
            Resources resources = sy4.getResources();
            if (resources != null) {
                charSequence = resources.getText(R.string.hiw);
            }
            sy4.setText(charSequence);
            sy4.setEnabled(false);
            return;
        }
        int size = userInvitee.size();
        if (sy4 == null) {
            return;
        }
        Resources resources2 = sy4.getResources();
        if (resources2 != null) {
            charSequence = resources2.getString(R.string.bcz, Integer.valueOf(size));
        }
        sy4.setText(charSequence);
        sy4.setEnabled(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.C218978ib, X.InterfaceC218828iM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onSelected(androidx.fragment.app.Fragment r13, java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee> r14, java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee> r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            r12 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C198657qv
            if (r0 == 0) goto L9e
            r11 = r3
            X.7qv r11 = (X.C198657qv) r11
            int r2 = r11.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r11.LJLJJI = r2
        L14:
            java.lang.Object r1 = r11.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJJI
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L3b
            if (r0 != r4) goto La5
            java.lang.Object r14 = r11.LJLIL
            java.util.List r14 = (java.util.List) r14
            X.C141335gf.LIZJ(r1)
        L27:
            int r0 = r14.size()
            X.34l r4 = X.C780334l.LJLIL
            X.XIF r3 = X.EXV.LIZ
            X.7qt r1 = new X.7qt
            r1.<init>(r0, r2)
            r0 = 2
            X.XKX.LIZLLL(r4, r3, r2, r1, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3b:
            X.C141335gf.LIZJ(r1)
            java.util.Map r1 = r12.LIZ()
            java.lang.String r0 = "topic_id"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto Lad
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto Lad
            long r8 = r1.longValue()
            java.util.Map r1 = r12.LIZ()
            java.lang.String r0 = "aweme"
            java.lang.Object r5 = r1.get(r0)
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.feed.model.Aweme
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
        L64:
            X.8l2 r6 = X.C220488l2.LIZIZ
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r14.iterator()
        L6f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.addyours.model.UserInvitee r0 = (com.ss.android.ugc.aweme.addyours.model.UserInvitee) r0
            java.lang.String r0 = r0.getUid()
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 == 0) goto L6f
            r7.add(r0)
            goto L6f
        L89:
            r5 = r2
            goto L64
        L8b:
            if (r5 == 0) goto L9c
            java.lang.String r10 = r5.getAid()
        L91:
            r11.LJLIL = r14
            r11.LJLJJI = r4
            java.lang.Object r0 = r6.LJ(r7, r8, r10, r11)
            if (r0 != r3) goto L27
            return r3
        L9c:
            r10 = r2
            goto L91
        L9e:
            X.7qv r11 = new X.7qv
            r11.<init>(r12, r3)
            goto L14
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lad:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198647qu.onSelected(androidx.fragment.app.Fragment, java.util.List, java.util.List, X.2kd):java.lang.Object");
    }
}
