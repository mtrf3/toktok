package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.storage.model.RelationUser;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Moy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57964Moy implements TTLSSladarBugReportUtils.BugReportListener, EJS, InterfaceC73592SuS {
    public static File LJLILLLLZI;
    public static File LJLJI;
    public static File LJLJJI;
    public static File LJLJJL;
    public static boolean LJLJJLL;
    public static InterfaceC58024Mpw LJLJLJ;
    public static final char[] LJLIL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[][] LJLJL = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, 511, LiveChatShowDelayForHotLiveSetting.DEFAULT, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, LiveChatShowDelayForHotLiveSetting.DEFAULT, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, LiveCoverMinSizeSetting.DEFAULT, 905, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, BuildConfig.VERSION_CODE, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, 409, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 268, 794, 534, 539, 781, 408, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT, 644, 102, 476, 499, BuildConfig.VERSION_CODE, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, BuildConfig.VERSION_CODE, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, 305, 441, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, 263}};
    public static final C57964Moy LJLJLLL = new C57964Moy();

    @Override // X.EJS
    public void LIZ(Exception exc) {
    }

    public static final List LIZIZ(AbstractC57774Mlu abstractC57774Mlu) {
        o.LJIIIZ(abstractC57774Mlu, "<this>");
        if (abstractC57774Mlu instanceof C57983MpH) {
            return ((C57983MpH) abstractC57774Mlu).LIZLLL;
        }
        if (abstractC57774Mlu instanceof C57776Mlw) {
            return ((C57776Mlw) abstractC57774Mlu).LIZIZ;
        }
        if (abstractC57774Mlu instanceof C57777Mlx) {
            return null;
        }
        throw new C162476Zf();
    }

    public static final List LIZJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC57927MoN interfaceC57927MoN = (InterfaceC57927MoN) next;
            if ((interfaceC57927MoN instanceof RecUser) && C46104I7o.LJJIJIL((RecUser) interfaceC57927MoN)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final A2G LJFF(AbstractC57774Mlu abstractC57774Mlu) {
        o.LJIIIZ(abstractC57774Mlu, "<this>");
        if (abstractC57774Mlu instanceof C57776Mlw) {
            return A2F.LIZIZ(A2G.LIZ);
        }
        if (abstractC57774Mlu instanceof C57777Mlx) {
            A2F a2f = A2G.LIZ;
            Exception exc = new Exception(((C57777Mlx) abstractC57774Mlu).LIZIZ);
            a2f.getClass();
            return A2F.LIZJ(exc);
        }
        if (abstractC57774Mlu instanceof C57983MpH) {
            A2F a2f2 = A2G.LIZ;
            Object obj = ((C57983MpH) abstractC57774Mlu).LIZJ;
            if (obj == null) {
                obj = null;
            }
            return A2F.LJ(a2f2, null, obj, null, 5);
        }
        throw new C162476Zf();
    }

    public static final String LJI(List list) {
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((EnumC58046MqI) it.next()).getValue()));
        }
        return ORZ.LLD(arrayList, ",", "[", "]", null, 56);
    }

    public static final RelationUser LJII(RecUser recUser) {
        o.LJIIIZ(recUser, "<this>");
        RelationUser relationUser = new RelationUser();
        String uid = recUser.getUid();
        if (uid == null) {
            uid = "";
        }
        relationUser.setUid(uid);
        relationUser.setNickname(recUser.getNickname());
        relationUser.setAvatar168(recUser.getAvatar168());
        relationUser.setAvatar300(recUser.getAvatar300());
        relationUser.setFollowStatus(recUser.getFollowStatus());
        relationUser.setFollowerStatus(recUser.getFollowerStatus());
        relationUser.setMatchedFriendStruct(recUser.getMatchedFriendStruct());
        relationUser.isBlock = recUser.isBlock;
        relationUser.setPrivateAccount(recUser.isAccuratePrivateAccount());
        return relationUser;
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIZ(it, "it");
        return it.booleanValue();
    }

    public static void LIZLLL(int i, String str) {
        InterfaceC58024Mpw interfaceC58024Mpw = LJLJLJ;
        if (interfaceC58024Mpw != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[VESDK]");
            LIZ.append(str);
            interfaceC58024Mpw.LIZ(i, X1D.LIZIZ(LIZ));
        }
    }

    public static void LJ(String str, String str2, java.util.Map map) {
        C188727au LIZLLL = KNV.LIZLLL(str2, "actionType");
        LIZLLL.LJIIIZ("creation_id", XVF.LJ);
        LIZLLL.LJIIIZ("search_entrance", XVF.LIZ);
        LIZLLL.LJIIIZ("search_position", str);
        LIZLLL.LJIIIZ("action_type", str2);
        if (map != null) {
            LIZLLL.LJIIIIZZ(map);
        }
        FMX.LJIIL("music_search_history", LIZLLL.LIZ);
    }

    @Override // com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils.BugReportListener
    public void report(Throwable throwable, String message, java.util.Map map) {
        o.LJIIIZ(throwable, "throwable");
        o.LJIIIZ(message, "message");
        C0K2.LIZIZ(throwable, message, map);
    }

    public static final List LJIIIIZZ(List list, java.util.Set uidSet, String str, int i) {
        o.LJIIIZ(uidSet, "uidSet");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                RecUser recUser = (RecUser) obj;
                if (!uidSet.contains(recUser.getUid())) {
                    String uid = recUser.getUid();
                    o.LJIIIIZZ(uid, "user.uid");
                    uidSet.add(uid);
                    recUser.setRequestId(str);
                    recUser.setImprOrder(i2 + i);
                    arrayList.add(recUser);
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }
}
