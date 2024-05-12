package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeUserCardViewHolder;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.Mj5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57599Mj5 implements InterfaceC55143LkZ {
    public static final C57599Mj5 LIZ = new C57599Mj5();

    @Override // X.InterfaceC55143LkZ
    public final void LJIIJ() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (com.bytedance.ies.abmock.SettingsManager.LIZ("tt_social_big_card_refresh_current_vh", true) != false) goto L5;
     */
    @Override // X.InterfaceC55143LkZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(X.C2MA r4) {
        /*
            r3 = this;
            r2 = 1
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = "tt_social_big_card_refresh_current_vh"
            r1.getClass()     // Catch: java.lang.Throwable -> L10
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r2)     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L15
        L10:
            boolean r0 = r4 instanceof X.C57598Mj4
            if (r0 == 0) goto L15
        L14:
            return r2
        L15:
            r2 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57599Mj5.LIZJ(X.2MA):boolean");
    }

    @Override // X.InterfaceC55143LkZ
    public final C57596Mj2 LJ(Context context) {
        o.LJIIIZ(context, "context");
        return new C57596Mj2(context);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2Nq] */
    @Override // X.InterfaceC55143LkZ
    public final C57542Nq LJFF(Context context) {
        o.LJIIIZ(context, "context");
        return new FrameLayout(context) { // from class: X.2Nq
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, null, 0);
                a1.LJFF(context, "context");
                C16880lQ.LLLZIIL(R.layout.cpm, C16880lQ.LLZIL(context), this);
            }
        };
    }

    @Override // X.InterfaceC55143LkZ
    public final C57598Mj4 LJI(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        if (params instanceof C222588oQ) {
            return new C57598Mj4((C222588oQ) params);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.8Y5] */
    @Override // X.InterfaceC55143LkZ
    public final RecSwipeUserCardViewHolder LJII(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        if (params instanceof C222588oQ) {
            C222588oQ c222588oQ = (C222588oQ) params;
            return new RecSwipeUserCardViewHolder(c222588oQ, new AbstractC213068Xu<RecSwipeUserCardViewHolder, C8Y6>(c222588oQ) { // from class: X.8Y5
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    /*
                        r2 = this;
                        java.lang.String r0 = "params"
                        kotlin.jvm.internal.o.LJIIIZ(r3, r0)
                        X.8Xb<com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.feed.model.VideoItemParams> r1 = r3.LJIILL
                        java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.assem.BaseProxyer<com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.feed.model.VideoItemParams>"
                        kotlin.jvm.internal.o.LJII(r1, r0)
                        X.8Xu r1 = (X.AbstractC213068Xu) r1
                        X.LjG r0 = r1.LIZ
                        r2.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C8Y5.<init>(X.8oQ):void");
                }

                @Override // X.AbstractC213068Xu
                public final String LJ(C8Y6 c8y6, RecSwipeUserCardViewHolder recSwipeUserCardViewHolder, int i) {
                    C8Y6 item = c8y6;
                    o.LJIIIZ(item, "item");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(item);
                    LIZ2.append(", position: ");
                    LIZ2.append(i);
                    LIZ2.append(", aweme: ");
                    return C770830u.LIZ(LIZ2, item.LJLIL, '.', LIZ2);
                }
            });
        }
        return null;
    }

    @Override // X.InterfaceC55143LkZ
    public final boolean LJIIIIZZ(Aweme aweme) {
        User author;
        if (aweme == null || !C188587ag.LJ(aweme) || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55143LkZ
    public final C57618MjO LJIIIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C65776Prg LIZ2 = C65352Pkq.LIZ(RecSwipeViewModel.class);
        return new C57618MjO((RecSwipeViewModel) new C214298b3(LIZ2, new AqS153S0100000_3(LIZ2, 1621), C214528bQ.LJLIL, C78926UyI.LJJII(activity, false), C78926UyI.LJJIIJZLJL(activity, false), C184077Kh.LJLIL, C57606MjC.INSTANCE, (InterfaceC65784Pro) null, 384).getValue());
    }

    @Override // X.InterfaceC55143LkZ
    public final void LIZ(Aweme aweme, String eventType) {
        o.LJIIIZ(eventType, "eventType");
        if (!LJIIIIZZ(aweme)) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[RecUserServiceImpl] updateNextInsertTimeAfterMafFeedImpression eventType = ");
        LIZ2.append(eventType);
        C221018lt.LIZ("TTRecUser", X1D.LIZIZ(LIZ2));
        if (o.LJ(eventType, "homepage_hot")) {
            C60952aJ.LIZ().storeLong("timestamp_of_maf_video_impression", System.currentTimeMillis());
        }
    }

    @Override // X.InterfaceC55143LkZ
    public final C57620MjQ LIZIZ(ActivityC45651qj activity, String eventType) {
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(activity, "activity");
        TTRecUserBigCardViewModel viewModel = (TTRecUserBigCardViewModel) new ViewModelProvider(activity).get(TTRecUserBigCardViewModel.class);
        C65776Prg LIZ2 = C65352Pkq.LIZ(RecSwipeViewModel.class);
        RecSwipeViewModel recSwipeViewModel = (RecSwipeViewModel) new C214298b3(LIZ2, new AqS153S0100000_3(LIZ2, 1623), C214528bQ.LJLIL, C78926UyI.LJJII(activity, false), C78926UyI.LJJIIJZLJL(activity, false), C184077Kh.LJLIL, C57608MjE.INSTANCE, (InterfaceC65784Pro) null, 384).getValue();
        o.LJIIIZ(viewModel, "viewModel");
        C221018lt.LJFF("RecSwipeViewModel", "[newInstance]");
        return new C57620MjQ(eventType, viewModel, recSwipeViewModel);
    }

    @Override // X.InterfaceC55143LkZ
    public final C57619MjP LIZLLL(ActivityC45651qj activityC45651qj, String str) {
        TTRecUserBigCardViewModel viewModel = (TTRecUserBigCardViewModel) new ViewModelProvider(activityC45651qj).get(TTRecUserBigCardViewModel.class);
        C65776Prg LIZ2 = C65352Pkq.LIZ(RecSwipeViewModel.class);
        RecSwipeViewModel recSwipeViewModel = (RecSwipeViewModel) new C214298b3(LIZ2, new AqS153S0100000_3(LIZ2, 1622), C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C78926UyI.LJJIIJZLJL(activityC45651qj, false), C184077Kh.LJLIL, C57607MjD.INSTANCE, (InterfaceC65784Pro) null, 384).getValue();
        o.LJIIIZ(viewModel, "viewModel");
        C221018lt.LJFF("TTRecUserFriendsTabController", "[newInstance]");
        return new C57619MjP(str, viewModel, recSwipeViewModel);
    }
}
