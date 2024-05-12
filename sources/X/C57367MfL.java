package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MfL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57367MfL extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public SharePanelViewModel LJLIL;
    public MAFIMUser LJLILLLLZI;
    public final C4OA LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final MWY LJLJLLL;
    public final C57363MfH LJLL;
    public final C62822Ol8 LJLLI;

    public final C239329aK M() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-followButton>(...)");
        return (C239329aK) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57367MfL(View view, SharePanelViewModel viewModel, C4OT c4ot) {
        super(view);
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLJI = new C4OA(viewModel, c4ot);
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(view, 1031));
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(view, 1035));
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(view, 1036));
        this.LJLJL = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(view, 1034));
        this.LJLJLJ = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(view, 1032));
        this.LJLJLLL = new MWY();
        this.LJLL = new C57363MfH(this);
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1033));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0091, code lost:
    
        if (r1 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(com.ss.android.ugc.aweme.social.model.MAFIMUser r8, int r9, com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r10) {
        /*
            r7 = this;
            java.lang.String r0 = "newViewModel"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r7.LJLIL = r10
            r7.LJLILLLLZI = r8
            com.ss.android.ugc.aweme.profile.model.User r3 = X.C78983UzD.LJJLIIIJILLIZJL(r8)
            X.5H3 r0 = r7.LJLJJI
            java.lang.Object r6 = r0.getValue()
            java.lang.String r0 = "<get-avatarImageView>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            X.AP9 r6 = (X.AP9) r6
            com.ss.android.ugc.aweme.utils.UserVerify r5 = new com.ss.android.ugc.aweme.utils.UserVerify
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r3.getAvatarThumb()
            java.lang.String r2 = r3.getCustomVerify()
            java.lang.String r1 = r3.getEnterpriseVerifyReason()
            int r0 = r3.getVerificationType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.<init>(r4, r2, r1, r0)
            r6.setUserData(r5)
            r6.LIZ()
            X.5H3 r0 = r7.LJLJL
            java.lang.Object r6 = r0.getValue()
            java.lang.String r0 = "<get-mutualRelationView>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            X.7ak r6 = (X.C188627ak) r6
            X.5H3 r0 = r7.LJLJJLL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-reasonTextView>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 8
            r6.setVisibility(r0)
            r1.setVisibility(r0)
            com.ss.android.ugc.aweme.friends.model.MutualStruct r0 = r3.getMutualStruct()
            r5 = 0
            if (r0 == 0) goto Le2
            r6.setVisibility(r5)
            r0 = 4
            r1.setVisibility(r0)
            android.view.View r0 = r7.itemView
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "itemView.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 2130968764(0x7f0400bc, float:1.754619E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r1)
            r6.setTextColor(r0)
            com.ss.android.ugc.aweme.friends.model.MutualStruct r4 = r3.getMutualStruct()
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "display_mutual_connections"
            r2 = 1
            int r1 = X.C00F.LIZ(r1, r5, r0, r2)
            r0 = 2
            if (r1 == r2) goto Le0
            if (r1 == r0) goto Lde
            r0 = 3
            if (r1 == r0) goto Le0
        L93:
            r6.LIZ(r4, r5)
        L96:
            X.5H3 r0 = r7.LJLJJL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-nameTextView>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.getNickname()
            r1.setText(r0)
            X.Ol8 r0 = r7.LJLLI
            java.lang.Object r0 = r0.getValue()
            X.KQs r0 = (X.C51698KQs) r0
            r0.LIZ(r3)
            android.view.View r2 = r7.itemView
            Y.ACListenerS44S0200000_9 r1 = new Y.ACListenerS44S0200000_9
            r0 = 48
            r1.<init>(r3, r7, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            X.9aK r2 = r7.M()
            Y.ACListenerS44S0200000_9 r1 = new Y.ACListenerS44S0200000_9
            r0 = 48
            r1.<init>(r3, r7, r0)
            X.0ga r0 = new X.0ga
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            X.4OA r0 = r7.LJLJI
            r0.getClass()
            r0.LJ = r8
            r0.LIZLLL = r9
            return
        Lde:
            r5 = 4
            goto L93
        Le0:
            r5 = 2
            goto L93
        Le2:
            java.lang.String r0 = r3.getRecommendReason()
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L96
            r1.setVisibility(r5)
            java.lang.String r0 = r3.getRecommendReason()
            r1.setText(r0)
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57367MfL.L(com.ss.android.ugc.aweme.social.model.MAFIMUser, int, com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel):void");
    }
}
