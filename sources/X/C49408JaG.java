package X;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.discover.model.SearchHorCommonData;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserHorizontalData;
import com.ss.android.ugc.aweme.discover.model.SearchUserHorizontalLoadMoreData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JaG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49408JaG implements InterfaceC73463SsN<String> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ SearchUser LJLILLLLZI;
    public final /* synthetic */ ObjectAnimator LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ C68322mC<Rect> LJLJJL;
    public final /* synthetic */ View LJLJJLL;
    public final /* synthetic */ InterfaceC88471Ynr<List<? extends Aweme>, Integer, C76800UCe> LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ View LJLJLLL;

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLJI.cancel();
        C49421JaT.LIZJ = false;
        C49421JaT.LIZIZ(0, this.LJLIL);
        this.LJLJJI.setVisibility(0);
        View view = this.LJLJLLL;
        if (view != null) {
            view.setVisibility(8);
        }
        this.LJLJJI.getLocalVisibleRect(this.LJLJJL.element);
        C49421JaT.LIZ = true;
        if (this.LJLJJL.element.left < 0) {
            C5S1 c5s1 = new C5S1(GlobalContext.getContext());
            c5s1.LIZJ(R.string.g5k);
            c5s1.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    @Override // X.InterfaceC73463SsN
    public final void onSuccess(String str) {
        SearchUserHorizontalData searchUserHorizontalData;
        SearchHorCommonData commonData;
        String t = str;
        o.LJIIIZ(t, "t");
        C49421JaT.LIZIZ(1, this.LJLIL);
        C49421JaT.LIZIZ = -1L;
        C49421JaT.LIZ = false;
        SearchUser searchUser = this.LJLILLLLZI;
        if (searchUser != null && (searchUserHorizontalData = searchUser.searchUserHorizontalData) != null && (commonData = searchUserHorizontalData.getCommonData()) != null) {
            commonData.setHasMoreHorizontalData(false);
        }
        try {
            C68322mC c68322mC = new C68322mC();
            ?? fromJson = GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), t, new C49413JaL().getType());
            c68322mC.element = fromJson;
            SearchUserHorizontalLoadMoreData searchUserHorizontalLoadMoreData = (SearchUserHorizontalLoadMoreData) fromJson;
            if (searchUserHorizontalLoadMoreData != null && searchUserHorizontalLoadMoreData.awemeList != null) {
                C1DH.LJJIJIIJI(new RunnableC49414JaM(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, c68322mC, this.LJLJLJ, this.LJLJLLL));
            }
        } catch (C38333F2r unused) {
        }
    }

    public C49408JaG(String str, SearchUser searchUser, ObjectAnimator objectAnimator, View view, C68322mC c68322mC, C80001VaX c80001VaX, AqS190S0100000_8 aqS190S0100000_8, int i, View view2) {
        this.LJLIL = str;
        this.LJLILLLLZI = searchUser;
        this.LJLJI = objectAnimator;
        this.LJLJJI = view;
        this.LJLJJL = c68322mC;
        this.LJLJJLL = c80001VaX;
        this.LJLJL = aqS190S0100000_8;
        this.LJLJLJ = i;
        this.LJLJLLL = view2;
    }
}
