package X;

import X.C0A7;
import X.C0AC;
import Y.ACListenerS35S0100000_15;
import Y.IDCListenerS245S0100000_8;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.search.detail.shoot.ui.CreationIntentionMusicShootReusedAssem;
import com.ss.android.ugc.aweme.search.detail.shoot.ui.SearchDetailBottomMusicShootComponent;
import com.ss.android.ugc.aweme.search.detail.shoot.ui.SearchInflowMusicShootButtonTrigger;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.config.SearchUserFeedbackSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import ujb.o;

/* loaded from: classes9.dex */
public final class KJF implements InterfaceC212198Ul {
    public static final KJF LIZ = new KJF();

    @Override // X.InterfaceC212198Ul
    public final C65776Prg LJIIJJI() {
        return C65352Pkq.LIZ(SearchDetailBottomMusicShootComponent.class);
    }

    @Override // X.InterfaceC212198Ul
    public final C65776Prg LJIIL() {
        return C65352Pkq.LIZ(SearchInflowMusicShootButtonTrigger.class);
    }

    @Override // X.InterfaceC212198Ul
    public final C65776Prg LJIILIIL() {
        return C65352Pkq.LIZ(CreationIntentionMusicShootReusedAssem.class);
    }

    @Override // X.InterfaceC212198Ul
    public final boolean LIZLLL() {
        if (C51107K3z.LIZ(C51107K3z.LIZ.LIZJ("music")) && C50675Juh.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC212198Ul
    public final boolean LJFF() {
        boolean z;
        String schema;
        SearchUserFeedbackSettings.Feedback LIZ2 = SearchUserFeedbackSettings.LIZ("music");
        if (LIZ2 == null || (schema = LIZ2.getSchema()) == null || schema.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // X.InterfaceC212198Ul
    public final void LIZ(FragmentManager fragmentManager) {
        Fragment LJJJIL;
        if (fragmentManager != null && (LJJJIL = fragmentManager.LJJJIL("com.ss.android.ugc.aweme.discover.ui.SearchDialogFragment")) != null && LJJJIL.isAdded()) {
            fragmentManager.getClass();
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(LJJJIL);
            c1b3.LJI();
        }
    }

    @Override // X.InterfaceC212198Ul
    public final boolean LIZJ(Aweme aweme) {
        return KMA.LJJJI(aweme);
    }

    @Override // X.InterfaceC212198Ul
    public final boolean LJ(String str) {
        if (!KMA.LJJJ()) {
            return false;
        }
        if ((KMA.LJJIZ() != 1 && KMA.LJJIZ() != 2) || !o.LJJJJIZL(str, "general_search", false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC212198Ul
    public final C51508KJk LJIIIIZZ(C51509KJl c51509KJl) {
        return new C51508KJk(c51509KJl);
    }

    @Override // X.InterfaceC212198Ul
    public final boolean LJIIJ(String str) {
        if (!KMA.LJJJ() || KMA.LJJIZ() != 4 || !o.LJJJJIZL(str, "general_search", false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC212198Ul
    public final SpannableString LIZIZ(Context context, String str, List<? extends Position> list) {
        if (TextUtils.isEmpty(str) || C79004UzY.LJJIFFI(list)) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        for (Position position : list) {
            if (position != null) {
                AnonymousClass636.LJIJI(spannableString, position.getBegin(), position.getEnd() + 1);
            }
        }
        return spannableString;
    }

    @Override // X.InterfaceC212198Ul
    public final void LJI(RecyclerView recyclerView, List list, ACListenerS35S0100000_15 aCListenerS35S0100000_15) {
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(context, "tagContainer.context");
        recyclerView.setVisibility(0);
        if (recyclerView.getAdapter() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.utils.SearchMusicTagProcessor$addMusicTags$1$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final void LJZL(int i) {
                    super.LJZL(i);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                public final void LJFF(int i, int i2) {
                    super.LJFF(i, i2);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
                    return super.LJZI(i, c0a7, c0ac);
                }
            });
            recyclerView.setAdapter(new KJI(aCListenerS35S0100000_15, recyclerView));
            if (C90193gN.LIZIZ(context)) {
                recyclerView.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(recyclerView, 22));
            }
        }
        if (recyclerView.getAdapter() != null) {
            AbstractC029409q adapter = recyclerView.getAdapter();
            kotlin.jvm.internal.o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.utils.SearchMusicTagAdapter");
            KJI kji = (KJI) adapter;
            kji.LJLJJI = new int[2];
            ((ArrayList) kji.LJLJI).clear();
            ((ArrayList) kji.LJLJI).addAll(list);
            kji.notifyDataSetChanged();
            C0A2 layoutManager = kji.LJLILLLLZI.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.LJZL(0);
            }
        }
    }

    @Override // X.InterfaceC212198Ul
    public final void LJIIIZ(String str, String str2, String str3) {
        C50322Jp0 c50322Jp0 = (C50322Jp0) KNV.LIZ();
        KJG kjg = new KJG();
        kjg.LJIJI(str2);
        kjg.LJIIZILJ("search_id", c50322Jp0.LJLJI);
        kjg.LJIIZILJ("search_keyword", c50322Jp0.LJLJJI);
        kjg.LJIJ("search_result_id", str);
        kjg.LJIIZILJ("button_type", "shoot");
        kjg.LJIIZILJ("group_id", str);
        kjg.LJIIZILJ("author_id", str3);
        C50653JuL.LJLILLLLZI.getClass();
        java.util.Map LIZIZ = C50654JuM.LIZIZ();
        kjg.LIZLLL("is_inner", (String) LIZIZ.get("is_inner"));
        kjg.LIZLLL("inner_search_id", (String) LIZIZ.get("inner_search_id"));
        kjg.LJIILIIL();
    }

    @Override // X.InterfaceC212198Ul
    public final void LJII(ActivityC45651qj activityC45651qj, Fragment fragment, Aweme aweme, String str) {
        if (activityC45651qj != null && MSAdaptionService.LJIIL().LJI(activityC45651qj)) {
            C16880lQ.LLZILL(Toast.makeText(activityC45651qj, activityC45651qj.getString(R.string.f1i), 0));
        } else {
            MEW.LIZ(activityC45651qj, fragment, aweme, str, 2);
        }
    }
}
