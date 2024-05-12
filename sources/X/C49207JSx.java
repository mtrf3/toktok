package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.JSx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49207JSx implements InterfaceC49417JaP {
    public final /* synthetic */ C49206JSw LIZ;

    @Override // X.InterfaceC49417JaP
    public final void LIZ() {
    }

    public C49207JSx(C49206JSw c49206JSw) {
        this.LIZ = c49206JSw;
    }

    @Override // X.InterfaceC49417JaP
    public final void LIZIZ(SearchUser searchUser) {
        User user;
        boolean z;
        User user2;
        boolean z2;
        List<SearchUser> list;
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility;
        if (searchUser == null || (user = searchUser.user) == null || user.getSecUid() == null || searchUser.user.getFollowStatus() != 0) {
            return;
        }
        C49209JSz c49209JSz = C49209JSz.LIZ;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LIZ.getContext());
        if (LJJIFFI != null) {
            z = ((SearchStateViewModel) ViewModelProviders.of(LJJIFFI).get(SearchStateViewModel.class)).isShowSearchRelationCard;
        } else {
            z = true;
        }
        Context context = this.LIZ.getContext();
        c49209JSz.getClass();
        if (((Number) C34106Da2.LJLJLJ.getValue()).intValue() != 1 || !C46442IKo.LIZ() || !((RBX) HG3.LJIILL()).isLogin() || !C48203Ivv.LJ(context) || z || (user2 = searchUser.user) == null || user2.getSecUid() == null || searchUser.user.getFollowerCount() >= ((Number) C34104Da0.LJLJLJ.getValue()).intValue()) {
            return;
        }
        if (((Boolean) C34102DZy.LIZ.getValue()).booleanValue()) {
            Keva keva = C49209JSz.LIZIZ;
            keva.storeInt("close_user_relation_card_count", 0);
            keva.storeLong("close_user_relation_card_time", 0L);
        }
        Keva keva2 = C49209JSz.LIZIZ;
        int i = keva2.getInt("close_user_relation_card_count", 0);
        long currentTimeMillis = System.currentTimeMillis() - keva2.getLong("close_user_relation_card_time", System.currentTimeMillis());
        StringBuilder LIZLLL = C1FJ.LIZLLL("Current count: ", i, " Close time: ", currentTimeMillis);
        LIZLLL.append(" Is within 14 days: ");
        if (currentTimeMillis < 1209600000) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZLLL.append(z2);
        X1D.LIZIZ(LIZLLL);
        if (i >= 3) {
            if (currentTimeMillis < 1209600000) {
                return;
            }
            keva2.storeInt("close_user_relation_card_count", 0);
            keva2.storeLong("close_user_relation_card_time", 0L);
        }
        if (a.LJFF().LJJJJI()) {
            return;
        }
        C49206JSw c49206JSw = this.LIZ;
        c49206JSw.getClass();
        String uid = searchUser.user.getUid();
        C49268JVg c49268JVg = c49206JSw.LJLLILLLL;
        if (c49268JVg != null) {
            list = c49268JVg.LIZIZ;
        } else {
            list = null;
        }
        o.LJIIIIZZ(uid, "uid");
        C49331JXr c49331JXr = new C49331JXr(searchUser, list, uid);
        Fragment LJIIIZ = C79234V7u.LJIIIZ(c49206JSw.itemView);
        if (LJIIIZ != null && (searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ, null), SearchServiceCenter$AdapterControlAbility.class, null)) != null) {
            searchServiceCenter$AdapterControlAbility.Yx(c49206JSw.getBindingAdapterPosition() + 1, c49331JXr);
        }
    }
}
