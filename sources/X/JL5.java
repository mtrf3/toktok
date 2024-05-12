package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JL5 implements InterfaceC49452Jay {
    public final /* synthetic */ JL8 LIZ;
    public final /* synthetic */ JKG LIZIZ;
    public final /* synthetic */ JL9 LIZJ;
    public final /* synthetic */ InterfaceC50036JkO LIZLLL;

    @Override // X.InterfaceC49452Jay
    public final String LIZ() {
        C50469JrN searchVideoModel;
        JKG jkg = this.LIZIZ;
        jkg.getClass();
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = jkg.itemView;
        c50651JuJ.getClass();
        C50650JuI LJI = C50651JuJ.LJI(view);
        if (LJI != null && (searchVideoModel = LJI.getSearchVideoModel()) != null) {
            return searchVideoModel.getGroupId();
        }
        return null;
    }

    @Override // X.InterfaceC49452Jay
    public final void LIZIZ(Aweme aweme) {
        Aweme aweme2;
        JQA jqa;
        SearchCardInfo searchCardInfo;
        String str;
        String str2;
        String str3;
        ActivityC45651qj LJJIFFI;
        JL8 jl8 = this.LIZ;
        if (jl8 == null || (aweme2 = jl8.LJLIL) == null) {
            aweme2 = new Aweme();
        }
        JKG jkg = this.LIZIZ;
        JL9 jl9 = this.LIZJ;
        Long l = null;
        if (jl9 != null) {
            jqa = jl9.LIZIZ;
            searchCardInfo = jl9.LIZ;
        } else {
            jqa = null;
            searchCardInfo = null;
        }
        jkg.getClass();
        if (jqa == null) {
            return;
        }
        User author = aweme2.getAuthor();
        Context context = jkg.itemView.getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            jqa.LIZ(((SearchGlobalViewModel) ViewModelProviders.of(LJJIFFI).get(SearchGlobalViewModel.class)).jv0());
        }
        JNB LIZ = JND.LIZ(jqa);
        LIZ.LJIJ("search_result_id", jqa.LJIILJJIL);
        if (searchCardInfo == null || (str3 = searchCardInfo.alasrc) == null || str3.length() == 0) {
            str = "live_card";
        } else if (searchCardInfo != null) {
            str = searchCardInfo.alasrc;
        } else {
            str = null;
        }
        LIZ.LJIIZILJ("token_type", str);
        if (author != null) {
            str2 = author.getRoomTitle();
        } else {
            str2 = null;
        }
        LIZ.LIZLLL("aladdin_words", str2);
        LIZ.LJJIII(Integer.valueOf(jkg.getLayoutPosition()));
        LIZ.LJIIZILJ("list_result_type", "live");
        if (author != null) {
            l = Long.valueOf(C78934UyQ.LJIILJJIL(author));
        }
        LIZ.LJIIZILJ("list_item_id", String.valueOf(l));
        LIZ.LJIIZILJ("aladdin_button_type", "click_live");
        LIZ.LJIIZILJ("anchor_info", jkg.U());
        LIZ.LJIIZILJ("button_type", "ec_entrance");
        LIZ.LJIILIIL();
    }

    @Override // X.InterfaceC49452Jay
    public final void LIZJ(Aweme aweme, JL9 jl9) {
        JYG X2 = this.LIZIZ.X(aweme, jl9);
        View itemView = this.LIZIZ.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C51757KSz.LIZIZ(itemView, X2);
    }

    public JL5(JL8 jl8, JKG jkg, JL9 jl9, InterfaceC50036JkO interfaceC50036JkO) {
        this.LIZ = jl8;
        this.LIZIZ = jkg;
        this.LIZJ = jl9;
        this.LIZLLL = interfaceC50036JkO;
    }

    @Override // X.InterfaceC49452Jay
    public final void LIZLLL(Aweme aweme, JL9 jl9, EnterRoomConfig enterRoomConfig, String str) {
        Aweme aweme2;
        JL8 jl8 = this.LIZ;
        if (jl8 == null || (aweme2 = jl8.LJLIL) == null) {
            aweme2 = new Aweme();
        }
        C49489JbZ c49489JbZ = C49489JbZ.LIZ;
        InterfaceC50036JkO interfaceC50036JkO = this.LIZLLL;
        Context context = this.LIZIZ.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        c49489JbZ.getClass();
        C49489JbZ.LIZIZ(aweme2, jl9, interfaceC50036JkO, enterRoomConfig, str, context);
    }
}
