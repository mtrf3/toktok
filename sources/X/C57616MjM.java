package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeCardListAssem;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.List;
import kotlin.jvm.internal.AqS97S0101000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MjM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57616MjM {
    public final /* synthetic */ RecSwipeCardListAssem LIZ;

    public C57616MjM(RecSwipeCardListAssem recSwipeCardListAssem) {
        this.LIZ = recSwipeCardListAssem;
    }

    public final void LIZ(int i) {
        LNI lni;
        Integer num;
        C57586Mis c57586Mis = this.LIZ.LL;
        if (c57586Mis != null) {
            List<RecUser> data = c57586Mis.getData();
            if (data != null) {
                RecSwipeCardListAssem recSwipeCardListAssem = this.LIZ;
                if (i >= 0 && i < data.size()) {
                    C53031Krb.LIZ.getClass();
                    Object LJLLLLLL = ORZ.LJLLLLLL(((Number) C53031Krb.LIZIZ.getValue()).intValue() + i, data);
                    if (LJLLLLLL != null) {
                        recSwipeCardListAssem.c4().ov0(C47261Igj.LJJIJ(LJLLLLLL));
                    }
                    RecUser recommendedUser = (RecUser) ListProtector.get(data, i);
                    if (recSwipeCardListAssem.LLIIII || (num = recSwipeCardListAssem.c4().getState().LJLJL) == null || i != num.intValue() || !o.LJ(recommendedUser, recSwipeCardListAssem.c4().getState().LJLJI)) {
                        recSwipeCardListAssem.LLIIII = false;
                        if (C53576L0y.LIZIZ()) {
                            RecSwipeViewModel c4 = recSwipeCardListAssem.c4();
                            User recUser = (User) ListProtector.get(data, i);
                            c4.getClass();
                            o.LJIIIZ(recUser, "recUser");
                            String eventType = c4.LJLJJLL;
                            if (!o.LJ(eventType, "homepage_hot")) {
                                eventType = "no_fyp_feed";
                            }
                            String uid = recUser.getUid();
                            o.LJIIIIZZ(uid, "recUser.uid");
                            long currentTimeMillis = System.currentTimeMillis();
                            o.LJIIIZ(eventType, "eventType");
                            Keva LIZ = C2TH.LIZ();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(eventType);
                            LIZ2.append(uid);
                            LIZ.storeLong(X1D.LIZIZ(LIZ2), currentTimeMillis);
                        }
                        RecSwipeViewModel c42 = recSwipeCardListAssem.c4();
                        c42.getClass();
                        o.LJIIIZ(recommendedUser, "recommendedUser");
                        c42.setState(new AqS97S0101000_9(i, recommendedUser, 14));
                        if (recSwipeCardListAssem.LLIIIILZ) {
                            ActivityC45651qj LIZ3 = C212428Vi.LIZ(recSwipeCardListAssem);
                            if (LIZ3 != null) {
                                RecSwipeViewModel c43 = recSwipeCardListAssem.c4();
                                c43.getClass();
                                Aweme aweme = c43.LJLIL;
                                if (aweme != null) {
                                    aweme.setAuthor(recommendedUser);
                                    ScrollSwitchStateManager LIZ4 = C84193Sd.LIZ(LIZ3);
                                    InterfaceC36571c5 jv0 = LIZ4.jv0(LIZ4.nv0("page_profile"));
                                    if ((jv0 instanceof LNI) && (lni = (LNI) jv0) != null) {
                                        lni.LJJLIIIJ(aweme);
                                    }
                                }
                            }
                            recSwipeCardListAssem.c4().sv0(EnumC57365MfJ.SHOW);
                        }
                        C54960Lhc.LIZ.LIZ(EnumC57876MnY.FEED_REC_USER_BIG_CARD.getValue(), recommendedUser.getUid());
                        if (i == 0) {
                            recSwipeCardListAssem.LLIIIILZ = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("adapter");
        throw null;
    }
}
