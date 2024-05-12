package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeDialog;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeModel;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sgc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72734Sgc extends AbstractC029409q<C72733Sgb> {
    public final InterfaceC72738Sgg LJLIL;
    public final List<EditProfileBadgeModel> LJLILLLLZI;
    public final User LJLJI;
    public Integer LJLJJI;
    public final String LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<EditProfileBadgeModel> list = this.LJLILLLLZI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, r0) != false) goto L19;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C72733Sgb r4, int r5) {
        /*
            r3 = this;
            X.Sgb r4 = (X.C72733Sgb) r4
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.util.List<com.ss.android.ugc.aweme.badge.EditProfileBadgeModel> r0 = r3.LJLILLLLZI     // Catch: java.lang.ClassCastException -> L6c
            if (r0 == 0) goto L18
            java.lang.Object r1 = X.ORZ.LJLLLLLL(r5, r0)     // Catch: java.lang.ClassCastException -> L6c
            com.ss.android.ugc.aweme.badge.EditProfileBadgeModel r1 = (com.ss.android.ugc.aweme.badge.EditProfileBadgeModel) r1     // Catch: java.lang.ClassCastException -> L6c
            if (r1 == 0) goto L18
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.LJLJI     // Catch: java.lang.ClassCastException -> L6c
            r4.L(r1, r0)     // Catch: java.lang.ClassCastException -> L6c
        L18:
            android.view.View r2 = r4.itemView     // Catch: java.lang.ClassCastException -> L6c
            Y.ACListenerS29S0101000_12 r1 = new Y.ACListenerS29S0101000_12     // Catch: java.lang.ClassCastException -> L6c
            r0 = 1
            r1.<init>(r5, r3, r0)     // Catch: java.lang.ClassCastException -> L6c
            X.C16880lQ.LJIIJ(r1, r2)     // Catch: java.lang.ClassCastException -> L6c
            java.lang.Integer r0 = r3.LJLJJI     // Catch: java.lang.ClassCastException -> L6c
            r1 = 0
            if (r0 != 0) goto L5e
        L28:
            java.lang.Integer r0 = r3.LJLJJI     // Catch: java.lang.ClassCastException -> L6c
            if (r0 != 0) goto L65
            java.lang.String r2 = r3.LJLJJL     // Catch: java.lang.ClassCastException -> L6c
            java.util.List<com.ss.android.ugc.aweme.badge.EditProfileBadgeModel> r0 = r3.LJLILLLLZI     // Catch: java.lang.ClassCastException -> L6c
            if (r0 == 0) goto L5c
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r5, r0)     // Catch: java.lang.ClassCastException -> L6c
            com.ss.android.ugc.aweme.badge.EditProfileBadgeModel r0 = (com.ss.android.ugc.aweme.badge.EditProfileBadgeModel) r0     // Catch: java.lang.ClassCastException -> L6c
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.getUrl()     // Catch: java.lang.ClassCastException -> L6c
        L3e:
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)     // Catch: java.lang.ClassCastException -> L6c
            if (r0 == 0) goto L65
        L44:
            android.view.View r2 = r4.itemView     // Catch: java.lang.ClassCastException -> L6c
            r0 = 2131234199(0x7f080d97, float:1.8084557E38)
            r2.setBackgroundResource(r0)     // Catch: java.lang.ClassCastException -> L6c
            X.Sgg r2 = r3.LJLIL     // Catch: java.lang.ClassCastException -> L6c
            java.util.List<com.ss.android.ugc.aweme.badge.EditProfileBadgeModel> r0 = r3.LJLILLLLZI     // Catch: java.lang.ClassCastException -> L6c
            if (r0 == 0) goto L58
            java.lang.Object r1 = X.ORZ.LJLLLLLL(r5, r0)     // Catch: java.lang.ClassCastException -> L6c
            com.ss.android.ugc.aweme.badge.EditProfileBadgeModel r1 = (com.ss.android.ugc.aweme.badge.EditProfileBadgeModel) r1     // Catch: java.lang.ClassCastException -> L6c
        L58:
            r2.Ob(r1)     // Catch: java.lang.ClassCastException -> L6c
            goto L70
        L5c:
            r0 = r1
            goto L3e
        L5e:
            int r0 = r0.intValue()     // Catch: java.lang.ClassCastException -> L6c
            if (r0 == r5) goto L44
            goto L28
        L65:
            android.view.View r1 = r4.itemView     // Catch: java.lang.ClassCastException -> L6c
            r0 = 0
            r1.setBackgroundResource(r0)     // Catch: java.lang.ClassCastException -> L6c
            goto L70
        L6c:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72734Sgc.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C72733Sgb com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.clu, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C72733Sgb c72733Sgb = new C72733Sgb(view);
        C0AX.LIZ(viewGroup, c72733Sgb.itemView, R.id.lj7);
        View view2 = c72733Sgb.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c72733Sgb.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C72733Sgb.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c72733Sgb.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c72733Sgb.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C72733Sgb.class.getName();
        return c72733Sgb;
    }

    public C72734Sgc(EditProfileBadgeDialog editProfileBadgeDialog, List list, User user) {
        ProfileBadgeStruct profileBadge;
        Boolean bool;
        o.LJIIIZ(user, "user");
        this.LJLIL = editProfileBadgeDialog;
        this.LJLILLLLZI = list;
        this.LJLJI = user;
        ProfileBadgeStruct profileBadge2 = user.getProfileBadge();
        if (profileBadge2 != null && profileBadge2.getUrl() != null && (profileBadge = user.getProfileBadge()) != null && Boolean.valueOf(profileBadge.getShouldShow()) != null) {
            ProfileBadgeStruct profileBadge3 = user.getProfileBadge();
            if (profileBadge3 != null) {
                bool = Boolean.valueOf(profileBadge3.getShouldShow());
            } else {
                bool = null;
            }
            o.LJI(bool);
            if (bool.booleanValue()) {
                ProfileBadgeStruct profileBadge4 = user.getProfileBadge();
                this.LJLJJL = profileBadge4 != null ? profileBadge4.getUrl() : null;
                return;
            }
        }
        this.LJLJJI = 0;
        this.LJLJJL = null;
    }
}
