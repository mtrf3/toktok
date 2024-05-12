package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchrelation.core.ui.SearchRelationUserAssem;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JlK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50094JlK implements InterfaceC57910Mo6 {
    public final /* synthetic */ SearchRelationUserAssem LJLIL;

    public C50094JlK(SearchRelationUserAssem searchRelationUserAssem) {
        this.LJLIL = searchRelationUserAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        JYG jyg;
        int i;
        String str;
        AbstractC50059Jkl<C49587Jd9> ut0;
        C49587Jd9 LIZJ;
        if (abstractC57828Mmm instanceof C57824Mmi) {
            SearchRelationUserAssem searchRelationUserAssem = this.LJLIL;
            C25770A9m c25770A9m = searchRelationUserAssem.LLFF;
            if (c25770A9m != null) {
                User user = (User) abstractC57828Mmm.LIZ;
                int i2 = abstractC57828Mmm.LIZIZ;
                if (user != null) {
                    jyg = r10;
                    JYG jyg2 = new JYG("recommend_user", null, null, null, null, null, null, 126, null);
                    jyg.setImgCover(user.getAvatarThumb());
                    jyg.setTitle(user.getNickname());
                    C50409JqP c50409JqP = C50409JqP.LIZ;
                    String feedbackType = jyg.getFeedbackType();
                    c50409JqP.getClass();
                    jyg.setMultipleChoices(C50409JqP.LIZ(feedbackType));
                    OSZ[] oszArr = new OSZ[11];
                    oszArr[0] = new OSZ("search_id", searchRelationUserAssem.n4());
                    oszArr[1] = new OSZ("enter_from", searchRelationUserAssem.getEnterFrom());
                    oszArr[2] = new OSZ("search_result_id", searchRelationUserAssem.LLFII);
                    ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(searchRelationUserAssem), ISearchContextAbility.class, null);
                    if (iSearchContextAbility != null && (ut0 = iSearchContextAbility.ut0()) != null && (LIZJ = ut0.LIZJ()) != null) {
                        i = LIZJ.LJLJJI;
                    } else {
                        i = -1;
                    }
                    oszArr[3] = new OSZ("rank", String.valueOf(i));
                    String uid = user.getUid();
                    String str2 = "";
                    if (uid == null) {
                        uid = "";
                    }
                    oszArr[4] = new OSZ("list_item_id", uid);
                    oszArr[5] = new OSZ("item_rank", String.valueOf(i2));
                    oszArr[6] = new OSZ("token_type", "suggest_person");
                    String uniqueId = user.getUniqueId();
                    if (uniqueId == null) {
                        uniqueId = "";
                    }
                    oszArr[7] = new OSZ("unique_id", uniqueId);
                    if (user.isBlocked()) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    oszArr[8] = new OSZ("is_blocked", str);
                    String secUid = user.getSecUid();
                    if (secUid != null) {
                        str2 = secUid;
                    }
                    oszArr[9] = new OSZ("sec_user_id", str2);
                    oszArr[10] = new OSZ("list_result_type", "user");
                    jyg.setLogParams(C113554cx.LJJLIIIIJ(oszArr));
                } else {
                    jyg = null;
                }
                C51757KSz.LIZIZ(c25770A9m, jyg);
                return;
            }
            o.LJIJI("horizontalUserCardLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility;
        o.LJIIIZ(state, "state");
        AbstractC72932td<C223208pQ> abstractC72932td = state.LIZ;
        if (abstractC72932td instanceof C72912tb) {
            SearchRelationUserAssem searchRelationUserAssem = this.LJLIL;
            searchRelationUserAssem.getClass();
            List<InterfaceC57784Mm4> LIZ = state.LIZJ.LIZ();
            if (LIZ == null) {
                return;
            }
            if (LIZ.isEmpty()) {
                C25770A9m c25770A9m = searchRelationUserAssem.LLFF;
                if (c25770A9m != null) {
                    if (c25770A9m.getHeight() > 0) {
                        searchRelationUserAssem.m4(C50093JlJ.LJLIL, new AqS158S0100000_8(searchRelationUserAssem, 578), false);
                        return;
                    }
                } else {
                    o.LJIJI("horizontalUserCardLayout");
                    throw null;
                }
            }
            if (LIZ.size() < 3) {
                searchRelationUserAssem.q4(false);
                return;
            }
            C25770A9m c25770A9m2 = searchRelationUserAssem.LLFF;
            if (c25770A9m2 != null) {
                if (c25770A9m2.getHeight() > 0) {
                    return;
                }
                searchRelationUserAssem.m4(C50097JlN.LJLIL, new AqS158S0100000_8(searchRelationUserAssem, 579), true);
                return;
            }
            o.LJIJI("horizontalUserCardLayout");
            throw null;
        }
        if (!(abstractC72932td instanceof C3C1)) {
            return;
        }
        SearchRelationUserAssem searchRelationUserAssem2 = this.LJLIL;
        C49331JXr c49331JXr = searchRelationUserAssem2.LLFFF;
        if (c49331JXr != null && (searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(searchRelationUserAssem2), SearchServiceCenter$AdapterControlAbility.class, null)) != null) {
            searchServiceCenter$AdapterControlAbility.c10(c49331JXr);
        }
        this.LJLIL.q4(false);
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}
