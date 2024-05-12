package X;

import Y.ALAdapterS0S0300000_1;
import Y.AUListenerS90S0100000_1;
import Y.IDObjectS0S0101000;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS69S1100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3Wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC85343Wo extends AbstractC779033y<UserRecommendationContent> implements View.OnClickListener, InterfaceC68952nD {
    public final ViewGroup LLIIIJ;
    public final TuxTextView LLIIIL;
    public final List<AnonymousClass357> LLIIIZ;

    public final void o0() {
        String str;
        Resources resources;
        TuxTextView tuxTextView = this.LLIIIL;
        if (tuxTextView == null) {
            return;
        }
        List<AnonymousClass357> list = this.LLIIIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((AnonymousClass357) next).LIZ.getVisibility() == 0) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        if (size <= 0) {
            tuxTextView.setVisibility(8);
            return;
        }
        tuxTextView.setVisibility(0);
        Context context = tuxTextView.getContext();
        if (context != null && (resources = context.getResources()) != null) {
            str = resources.getQuantityString(R.plurals.fi, size);
        } else {
            str = null;
        }
        tuxTextView.setText(str);
    }

    @Override // X.AbstractC1041546x
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FakeMessageViewModel fakeMessageViewModel = this.LLIIIILZ;
        if (fakeMessageViewModel != null) {
            fakeMessageViewModel.LJLJJI = this;
        }
    }

    @Override // X.AbstractC1041546x
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FakeMessageViewModel fakeMessageViewModel = this.LLIIIILZ;
        if (fakeMessageViewModel != null) {
            fakeMessageViewModel.LJLJJI = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        AnonymousClass357 anonymousClass357;
        User user;
        String str = null;
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof AnonymousClass357) || (anonymousClass357 = (AnonymousClass357) obj) == null) {
            return;
        }
        if (o.LJ(view, anonymousClass357.LJ)) {
            n0(anonymousClass357, true, new AqS148S0200000_1(this, anonymousClass357, 37));
            return;
        }
        if (!o.LJ(view, anonymousClass357.LIZ) || this.LLIIIILZ == null) {
            return;
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "v.context");
        UserRecommendationContent.RecUserInfo recUserInfo = anonymousClass357.LJIIIZ;
        if (recUserInfo == null || (user = recUserInfo.getUser()) == null) {
            return;
        }
        String userId = recUserInfo.getUserId();
        if (userId != null) {
            C7ZV c7zv = new C7ZV();
            c7zv.LIZLLL = "chat";
            c7zv.LJJLI = "click_card";
            c7zv.LJJLJLI = "chat";
            c7zv.LJJLIIIJJIZ = userId;
            c7zv.LJIILIIL();
            C7ZH.LIZIZ(EnumC57365MfJ.ENTER_PROFILE, recUserInfo.getUser(), recUserInfo.getMatchedFriends());
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        buildRoute.withParam("uid", user.getUid());
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.withParam("enter_from_request_id", user.getRequestId());
        buildRoute.withParam("need_track_compare_recommend_reason", 1);
        String recommendReason = user.getRecommendReason();
        if (recommendReason == null) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                str = matchedFriendStruct.getRecommendReason();
            }
        } else {
            str = recommendReason;
        }
        buildRoute.withParam("previous_recommend_reason", str);
        buildRoute.withParam("recommend_enter_profile_params", C7ZH.LIZ(user));
        buildRoute.withParam("recommend_from_type", "card");
        buildRoute.open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC85343Wo(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLIIIL = (TuxTextView) itemView.findViewById(R.id.ipj);
        ViewGroup viewGroup = (ViewGroup) itemView.findViewById(R.id.myr);
        this.LLIIIJ = viewGroup;
        this.LLIIIZ = new ArrayList();
        if (viewGroup != null) {
            Iterator<View> it = C78924UyG.LIZLLL(viewGroup).iterator();
            int i = 0;
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (iDObjectS0S0101000.hasNext()) {
                    Object next = iDObjectS0S0101000.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        View view = (View) next;
                        if (view instanceof C2UZ) {
                            ((ArrayList) this.LLIIIZ).add(new AnonymousClass357((C2UZ) view, this, new C76272z1(this), new C76282z2(this)));
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e3, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L53;
     */
    @Override // X.AbstractC779033y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage r29, com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent r30) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC85343Wo.m0(com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage, com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent):void");
    }

    public final void n0(AnonymousClass357 anonymousClass357, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (anonymousClass357.LIZ.getVisibility() == 0) {
            if (!z) {
                anonymousClass357.LIZ.setVisibility(8);
                o0();
                interfaceC65784Pro.invoke();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.setDuration(100L);
                ofFloat.setRepeatCount(0);
                ofFloat.addUpdateListener(new AUListenerS90S0100000_1(anonymousClass357, 62));
                ofFloat.addListener(new ALAdapterS0S0300000_1(anonymousClass357, this, interfaceC65784Pro, 1));
                ofFloat.start();
            }
        }
    }

    @Override // X.InterfaceC68952nD
    public final void w(String userId, boolean z, boolean z2) {
        Object obj;
        o.LJIIIZ(userId, "userId");
        Iterator it = ((ArrayList) this.LLIIIZ).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            UserRecommendationContent.RecUserInfo recUserInfo = ((AnonymousClass357) next).LJIIIZ;
            if (recUserInfo != null) {
                obj = recUserInfo.getUserId();
            }
            if (o.LJ(obj, userId)) {
                obj = next;
                break;
            }
        }
        AnonymousClass357 anonymousClass357 = (AnonymousClass357) obj;
        if (anonymousClass357 != null) {
            if (!z) {
                n0(anonymousClass357, z2, new AqS69S1100000_1(this, userId, 3));
            } else {
                anonymousClass357.LIZ.setVisibility(0);
                o0();
            }
        }
    }
}
