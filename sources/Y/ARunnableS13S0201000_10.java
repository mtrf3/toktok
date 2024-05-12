package Y;

import X.AXU;
import X.C227368w8;
import X.C235239Lb;
import X.C3C5;
import X.C57362MfG;
import X.C61548ODo;
import X.C61555ODv;
import X.C63120Opw;
import X.C63143OqJ;
import X.C63217OrV;
import X.C63267OsJ;
import X.C63275OsR;
import X.C63276OsS;
import X.C63322OtC;
import X.C63337OtR;
import X.C63480Ovk;
import X.C76800UCe;
import X.C78685UuP;
import X.C78847Ux1;
import X.C78983UzD;
import X.C89453Z8v;
import X.C9NP;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.EnumC63136OqC;
import X.InterfaceC63132Oq8;
import X.InterfaceC72447Sbz;
import X.O5G;
import X.OC6;
import X.ODN;
import X.OXB;
import X.P1G;
import X.P1H;
import X.V0N;
import X.X1D;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.MessageBody;
import com.lynx.animax.UIAnimaX;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.showcase.EcommerceStoreBizLogServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment;
import com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ARunnableS13S0201000_10 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        boolean LIZIZ;
        boolean z4;
        boolean z5;
        boolean z6;
        User user = ((FollowerRelationFragment) this.l0).LJLJI;
        P1H p1h = new P1H();
        p1h.LIZLLL = ((FollowerRelationFragment) this.l0).getEnterFrom();
        String requestId = ((User) this.l1).getRequestId();
        String str3 = "";
        if (requestId == null) {
            requestId = "";
        }
        p1h.LJIILLIIL = requestId;
        String uid = ((User) this.l1).getUid();
        if (uid != null) {
            str3 = uid;
        }
        p1h.LJIIZILJ = str3;
        p1h.LJIILL = this.i2;
        if (((User) this.l1).getMatchedFriendStruct() != null) {
            z = true;
        } else {
            z = false;
        }
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        p1h.LJIJ = str;
        if (AXU.LIZIZ((User) this.l1)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        p1h.LJIJI = str2;
        if (user != null) {
            ((FollowerRelationFragment) this.l0).getClass();
            if (C9NP.LIZIZ() || C9NP.LIZJ()) {
                if (user.getFollowerCount() < 1000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 & (!user.isAccuratePrivateAccount());
                LIZIZ = C235239Lb.LIZ().LIZIZ();
            } else {
                if (user.getFollowerCount() < 1000) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z7 = z5 & (!user.isAccuratePrivateAccount());
                if (user.getFriendCount() <= 60) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z3 = z7 & z6;
                LIZIZ = C235239Lb.LIZ().LIZIZ();
            }
            boolean z8 = z3 & LIZIZ;
            if (user.getNewFollowerCount() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 & z8) {
                SocialDataStruct socialData = ((User) this.l1).getSocialData();
                if (socialData != null && socialData.isNewFollower()) {
                    str4 = "1";
                }
                p1h.LJIILJJIL = str4;
            }
        }
        if (o.LJ(((LinkedHashMap) ((FollowerRelationFragment) this.l0).Ml().LJLLILLLL).get(((User) this.l1).getUid()), Boolean.TRUE)) {
            p1h.LJIILJJIL = "1";
        }
        p1h.LJIILIIL();
        if (((User) this.l1).getMatchedFriendStruct() != null) {
            FollowerRelationFragment followerRelationFragment = (FollowerRelationFragment) this.l0;
            User user2 = (User) this.l1;
            int i = this.i2;
            C57362MfG c57362MfG = new C57362MfG();
            c57362MfG.LJJIIZI(followerRelationFragment.getEnterFrom());
            c57362MfG.LJJJI(followerRelationFragment.Gl());
            c57362MfG.LJJLI = EnumC57366MfK.CARD;
            c57362MfG.LJJJJI();
            c57362MfG.LJJLIIIIJ = EnumC57365MfJ.SHOW;
            c57362MfG.LJJJJIZL(user2);
            c57362MfG.LJJJJ(user2.getRequestId());
            c57362MfG.LJIILIIL();
            String str5 = null;
            new C227368w8(followerRelationFragment.getEnterFrom(), user2, str5, followerRelationFragment.Gl(), str5, Integer.valueOf(i), 84).LIZLLL(null);
        }
        InterfaceC72447Sbz Nl = ((FollowerRelationFragment) this.l0).Nl();
        if (Nl != null) {
            Nl.Dc();
        }
    }

    public final void LIZ$1() {
        boolean z;
        String str;
        P1G p1g = new P1G();
        p1g.LIZLLL = ((FollowingRelationFragment) this.l0).getEnterFrom();
        p1g.LJIILJJIL = this.i2;
        String requestId = ((User) this.l1).getRequestId();
        String str2 = "";
        if (requestId == null) {
            requestId = "";
        }
        p1g.LJIILL = requestId;
        String uid = ((User) this.l1).getUid();
        if (uid != null) {
            str2 = uid;
        }
        p1g.LJIILLIIL = str2;
        if (((User) this.l1).getMatchedFriendStruct() != null) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "1";
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        p1g.LJIIZILJ = str;
        if (!AXU.LIZIZ((User) this.l1)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        p1g.LJIJ = str3;
        p1g.LJIILIIL();
        if (((User) this.l1).getMatchedFriendStruct() != null) {
            FollowingRelationFragment followingRelationFragment = (FollowingRelationFragment) this.l0;
            User user = (User) this.l1;
            int i = this.i2;
            C57362MfG c57362MfG = new C57362MfG();
            c57362MfG.LJJIIZI(followingRelationFragment.getEnterFrom());
            c57362MfG.LJJJI(followingRelationFragment.Gl());
            c57362MfG.LJJLI = EnumC57366MfK.CARD;
            c57362MfG.LJJJJI();
            c57362MfG.LJJLIIIIJ = EnumC57365MfJ.SHOW;
            c57362MfG.LJJJJIZL(user);
            c57362MfG.LJJJJ(user.getRequestId());
            c57362MfG.LJIILIIL();
            String str4 = null;
            new C227368w8(followingRelationFragment.getEnterFrom(), user, str4, followingRelationFragment.Gl(), str4, Integer.valueOf(i), 84).LIZLLL(null);
        }
        User user2 = (User) this.l1;
        o.LJIIIZ(user2, "<this>");
        if (C78685UuP.LJJJZ(V0N.LJJIJIIJIL(user2))) {
            User user3 = (User) this.l1;
            String enterFrom = ((FollowingRelationFragment) this.l0).getEnterFrom();
            o.LJIIIZ(user3, "user");
            EcommerceStoreBizLogServiceImpl.LJI().LIZ(user3, V0N.LJJIJIIJI(user3), "follow", Integer.valueOf(C78983UzD.LJJJJJ(user3) ? 1 : 0), enterFrom, null, null, null, null, null, "");
            return;
        }
        User user4 = (User) this.l1;
        o.LJIIIZ(user4, "<this>");
        if (!C78685UuP.LJJJZ(V0N.LJJIJIL(user4))) {
            return;
        }
        User user5 = (User) this.l1;
        String enterFrom2 = ((FollowingRelationFragment) this.l0).getEnterFrom();
        String previousPage = ((FollowingRelationFragment) this.l0).Gl();
        o.LJIIIZ(user5, "user");
        o.LJIIIZ(previousPage, "previousPage");
        EcommerceStoreBizLogServiceImpl.LJI().LIZJ(user5, C78983UzD.LJJJJJ(user5), enterFrom2, previousPage);
    }

    public final void LIZ$3() {
        ((C63267OsJ) this.l1).LIZLLL = new ArrayList();
        Iterator it = ((Map) this.l0).values().iterator();
        while (it.hasNext()) {
            C63120Opw LJIJ = C63217OrV.LJIJ(this.i2, (MessageBody) it.next());
            if (LJIJ != null) {
                ((C63267OsJ) this.l1).LIZLLL.add(LJIJ);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (MessageBody messageBody : ((Map) this.l0).values()) {
            C63480Ovk c63480Ovk = new C63480Ovk();
            c63480Ovk.LIZLLL = messageBody.conversation_id;
            c63480Ovk.LJ = messageBody.conversation_short_id;
            c63480Ovk.LJFF = messageBody.conversation_type;
            arrayList.add(c63480Ovk.build());
        }
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIJJ = new GetConversationInfoListV2RequestBody(arrayList);
        ((C63267OsJ) this.l1).LJIIJJI(this.i2, c89453Z8v.build(), null, (Map) this.l0);
    }

    public final void LIZ$4() {
        try {
            C61548ODo LJIIIIZZ = ODN.LJIIIIZZ(((C61555ODv) this.l1).LIZ, null);
            LJIIIIZZ.LIZLLL(4, "req_type");
            LJIIIIZZ.LIZLLL(Integer.valueOf(this.i2), "sync_task_id");
            LJIIIIZZ.LJ((List) this.l0);
        } catch (Exception e) {
            OC6.LIZ("gecko-debug-tag", "sync download CDN channel err", e);
        }
    }

    public final void LIZ$2() {
        ArrayList arrayList;
        InterfaceC63132Oq8 interfaceC63132Oq8;
        long currentTimeMillis = System.currentTimeMillis();
        C63322OtC.LIZJ("IMConversationDao getAllConversationId");
        long currentTimeMillis2 = System.currentTimeMillis();
        InterfaceC63132Oq8 interfaceC63132Oq82 = null;
        r8 = null;
        ArrayList arrayList2 = null;
        interfaceC63132Oq82 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select ");
                LIZ.append(EnumC63136OqC.COLUMN_ID.key);
                LIZ.append(" from ");
                LIZ.append("conversation_list");
                LIZ.append(" where ");
                LIZ.append(EnumC63136OqC.COLUMN_STRANGER.key);
                LIZ.append("=");
                LIZ.append(0);
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), null);
                if (interfaceC63132Oq8 != null) {
                    try {
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            while (interfaceC63132Oq8.moveToNext()) {
                                try {
                                    arrayList3.add(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63136OqC.COLUMN_ID.key)));
                                } catch (Exception e) {
                                    e = e;
                                    arrayList2 = arrayList3;
                                    arrayList = arrayList2;
                                    interfaceC63132Oq82 = interfaceC63132Oq8;
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("IMConversationDao getAllConversationId ");
                                    LIZ2.append(e);
                                    C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
                                    C63337OtR.LJFF(e);
                                    C63143OqJ.LIZ(interfaceC63132Oq82);
                                    arrayList2 = arrayList;
                                    if (arrayList2 != null) {
                                    }
                                    C63276OsS c63276OsS = (C63276OsS) this.l1;
                                    int i = this.i2;
                                    List list = (List) this.l0;
                                    c63276OsS.getClass();
                                    C63276OsS.LJIILIIL(i, list, currentTimeMillis);
                                    return;
                                }
                            }
                            arrayList2 = arrayList3;
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        throw th;
                    }
                }
                C63275OsR.LIZIZ().LJI(currentTimeMillis2, "getAllConversationId");
                C63143OqJ.LIZ(interfaceC63132Oq8);
            } catch (Throwable th2) {
                th = th2;
                interfaceC63132Oq8 = interfaceC63132Oq82;
            }
        } catch (Exception e3) {
            e = e3;
            arrayList = null;
        }
        if (arrayList2 != null || arrayList2.isEmpty()) {
            C63276OsS c63276OsS2 = (C63276OsS) this.l1;
            int i2 = this.i2;
            List list2 = (List) this.l0;
            c63276OsS2.getClass();
            C63276OsS.LJIILIIL(i2, list2, currentTimeMillis);
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        for (ConversationCheckInfo conversationCheckInfo : (List) this.l0) {
            if (conversationCheckInfo != null && !TextUtils.isEmpty(conversationCheckInfo.conversation_id)) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (conversationCheckInfo.conversation_id.equals(it.next())) {
                            break;
                        }
                    } else {
                        arrayList4.add(conversationCheckInfo);
                        break;
                    }
                }
            }
        }
        C63276OsS c63276OsS3 = (C63276OsS) this.l1;
        int i3 = this.i2;
        c63276OsS3.getClass();
        C63276OsS.LJIILIIL(i3, arrayList4, currentTimeMillis);
    }

    public static final void run$0(ARunnableS13S0201000_10 aRunnableS13S0201000_10) {
        boolean LIZ;
        try {
            ((UIAnimaX) aRunnableS13S0201000_10.l1).LJIJJLI(aRunnableS13S0201000_10.i2, (Map) aRunnableS13S0201000_10.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS13S0201000_10 aRunnableS13S0201000_10) {
        boolean LIZ;
        try {
            ((AdPopUpWebBottomSheetBehavior) aRunnableS13S0201000_10.l1).LIZIZ(aRunnableS13S0201000_10.i2, (View) aRunnableS13S0201000_10.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS13S0201000_10 aRunnableS13S0201000_10) {
        boolean LIZ;
        try {
            aRunnableS13S0201000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS13S0201000_10 aRunnableS13S0201000_10) {
        boolean LIZ;
        try {
            aRunnableS13S0201000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS13S0201000_10 aRunnableS13S0201000_10) {
        boolean LIZ;
        try {
            ((View) aRunnableS13S0201000_10.l0).setVisibility(4);
            ((View) aRunnableS13S0201000_10.l0).setAlpha(1.0f);
            ((OXB) aRunnableS13S0201000_10.l1).notifyItemChanged(aRunnableS13S0201000_10.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS13S0201000_10 aRunnableS13S0201000_10) {
        boolean LIZ;
        try {
            O5G o5g = (O5G) aRunnableS13S0201000_10.l0;
            byte[] bArr = (byte[]) aRunnableS13S0201000_10.l1;
            o5g.LJI(bArr.length, bArr, aRunnableS13S0201000_10.i2 - bArr.length);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } finally {
            try {
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public static final void run$6(ARunnableS13S0201000_10 aRunnableS13S0201000_10) {
        boolean LIZ;
        try {
            aRunnableS13S0201000_10.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS13S0201000_10 aRunnableS13S0201000_10) {
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aRunnableS13S0201000_10.l0;
        Aweme aweme = (Aweme) aRunnableS13S0201000_10.l1;
        profilePageFragment.LJLILLLLZI.bg(aweme.getAuthor(), aRunnableS13S0201000_10.i2);
    }

    public static final void run$8(ARunnableS13S0201000_10 aRunnableS13S0201000_10) {
        boolean LIZ;
        try {
            aRunnableS13S0201000_10.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS13S0201000_10 aRunnableS13S0201000_10) {
        boolean LIZ;
        try {
            aRunnableS13S0201000_10.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS13S0201000_10(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
