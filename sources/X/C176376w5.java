package X;

import Y.AObjectS27S0000000_3;
import Y.AObjectS9S0001000_3;
import Y.AgS86S0101000_3;
import Y.AgS87S0101000_15;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6w5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C176376w5 extends AbstractC176576wP<Comment, CommentItemList> {
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public C174386ss LJLJLLL;
    public long LJLL;
    public boolean LJLLILLLL;
    public int LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public String LJLLJ = "";
    public final List<String> LJZI = new ArrayList();
    public final ArrayList<Comment> LJZL = new ArrayList<>();
    public final boolean LJLLI = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);

    /* JADX WARN: Multi-variable type inference failed */
    public final long LJIILIIL() {
        T t = this.mData;
        if (t == 0) {
            return 0L;
        }
        return ((CommentItemList) t).total;
    }

    public final boolean LJIILLIIL() {
        return !this.LJZL.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public List<Comment> getItems() {
        C174386ss c174386ss;
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        if (((CommentItemList) t).replyStyle == 2 && (c174386ss = this.LJLJLLL) != null) {
            return c174386ss.LIZIZ;
        }
        return ((CommentItemList) t).items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((CommentItemList) t).hasMore && !LJIILLIIL()) {
            return true;
        }
        return false;
    }

    public static int LJIIL(int i) {
        int intValue;
        if (i == 1000) {
            intValue = ((Number) C176516wJ.LIZ.getValue()).intValue();
        } else {
            if (i == 2000) {
                intValue = ((Number) C176486wG.LIZ.getValue()).intValue();
            }
            return ((Number) C176456wD.LIZIZ.getValue()).intValue();
        }
        if (intValue > 0) {
            return intValue;
        }
        return ((Number) C176456wD.LIZIZ.getValue()).intValue();
    }

    public static void LJIJ(CommentItemList commentItemList) {
        List<Comment> list = commentItemList.items;
        if (!C79004UzY.LJJIFFI(list) && commentItemList.logPd != null) {
            Iterator<Comment> it = list.iterator();
            while (it.hasNext()) {
                it.next().setLogPb(commentItemList.logPd);
            }
        }
    }

    public void LJIIJ(List<Comment> list) {
        LJIIIZ(this.mListQueryType, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    /* renamed from: LJIILJJIL, reason: merged with bridge method [inline-methods] */
    public final void handleData(CommentItemList commentItemList) {
        boolean z;
        String str;
        int size;
        boolean z2;
        int size2;
        boolean z3;
        long j;
        int i;
        List<Comment> arrayList;
        if (this.mListQueryType == 1) {
            C1800774x.LIZ(this.LJLJI, this.LJLJJL);
        }
        C176566wO c176566wO = this.LJLIL;
        c176566wO.LIZ.put("Duration", String.valueOf(System.currentTimeMillis() - c176566wO.LIZIZ));
        this.LJLILLLLZI.LIZ();
        if (commentItemList != 0) {
            if (this.LJLLILLLL) {
                List<Comment> list = commentItemList.items;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Comment comment : list) {
                        if (V16.LJJIZ(comment)) {
                            arrayList2.add(comment);
                        }
                    }
                    arrayList = ORZ.LLJILJILJ(arrayList2);
                } else {
                    arrayList = new ArrayList<>();
                }
                commentItemList.items = arrayList;
                commentItemList.total = 0L;
            }
            String str2 = commentItemList.newInsertIds;
            if (str2 != null) {
                this.LJLJJL = str2;
            }
            this.LJLIL.LIZ(commentItemList);
            this.LJLILLLLZI.LIZLLL(commentItemList);
            List<Comment> list2 = commentItemList.items;
            if (list2 != null) {
                for (Comment comment2 : list2) {
                    if (comment2 != null && comment2.getTextExtra() != null) {
                        for (TextExtraStruct textExtraStruct : comment2.getTextExtra()) {
                            if (textExtraStruct != null && textExtraStruct.getType() == 6) {
                                ((ArrayList) this.LJZI).add(textExtraStruct.getSearchKeyword());
                            }
                        }
                    }
                }
            }
            int i2 = this.LJLJJLL;
            if ((i2 == 1 || i2 == 2) && this.mListQueryType == 1) {
                UpvoteList upvoteList = commentItemList.upvoteList;
                if (upvoteList == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C7HV c7hv = C7HV.LIZIZ;
                UpvoteList LJIIIZ = c7hv.LJIIIZ(this.LJLJI);
                if (upvoteList != null && LJIIIZ != null) {
                    long total = upvoteList.getTotal();
                    long total2 = LJIIIZ.getTotal();
                    if (total != total2) {
                        JSONObject jSONObject = new JSONObject();
                        if (total > total2) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        jSONObject.put("status", i);
                        jSONObject.put("comment_total", total);
                        jSONObject.put("cached_total", total2);
                        FMX.LJIILJJIL("repost_count_inconsistency", jSONObject);
                    }
                }
                c7hv.LJJI(upvoteList, LJIIIZ);
                if (upvoteList != null) {
                    c7hv.LJIILJJIL().LJIIIIZZ(this.LJLJI, upvoteList, true, 0);
                } else if (LJIIIZ != null && commentItemList.replyStyle == 0) {
                    commentItemList.replyStyle = 2;
                }
                UpvoteList LJIIIZ2 = c7hv.LJIIIZ(this.LJLJI);
                if (LJIIIZ2 != null) {
                    List<UpvoteStruct> upvotes = LJIIIZ2.getUpvotes();
                    if (z3) {
                        InterfaceC175126u4 LJIILJJIL = c7hv.LJIILJJIL();
                        j = 0;
                        for (UpvoteStruct upvoteStruct : upvotes) {
                            if (upvoteStruct != null && LJIILJJIL.LIZIZ(upvoteStruct)) {
                                j++;
                            }
                        }
                    } else {
                        j = 0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int min = Math.min(2, upvotes.size());
                    for (int i3 = 0; i3 < min; i3++) {
                        UpvoteStruct upvoteStruct2 = (UpvoteStruct) ListProtector.get(upvotes, i3);
                        arrayList3.add(V16.LJJLIIIJLJLI(upvoteStruct2));
                        if (upvoteStruct2.getReplyComments() != null && upvoteStruct2.getReplyComments().size() > 0) {
                            break;
                        }
                    }
                    if (commentItemList.items == null) {
                        commentItemList.items = new ArrayList();
                    }
                    commentItemList.items.addAll(0, arrayList3);
                    commentItemList.total += j;
                }
            }
        }
        String str3 = this.LJLJI;
        if (str3 != null) {
            C176566wO c176566wO2 = this.LJLIL;
            c176566wO2.getClass();
            c176566wO2.LIZ.put("GroupId", str3);
        }
        C176566wO c176566wO3 = this.LJLIL;
        String methodName = this.LJLJJI;
        c176566wO3.getClass();
        o.LJIIIZ(methodName, "methodName");
        c176566wO3.LIZ.put("MethodName", methodName);
        if (commentItemList != 0) {
            this.LJLIL.LIZ.put("TotalCount", String.valueOf(commentItemList.total));
            C176566wO c176566wO4 = this.LJLIL;
            List<Comment> list3 = commentItemList.items;
            if (list3 == null) {
                size2 = 0;
            } else {
                size2 = list3.size();
            }
            c176566wO4.LIZ.put("ActualReturnCount", String.valueOf(size2));
            this.LJLIL.LIZ.put("Offset", String.valueOf(commentItemList.cursor));
        }
        C176566wO c176566wO5 = this.LJLIL;
        if (!c176566wO5.LIZ.containsKey("UserId") && ((RBX) HG3.LJIILL()).isLogin()) {
            ConcurrentHashMap<String, String> concurrentHashMap = c176566wO5.LIZ;
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            concurrentHashMap.put("UserId", curUserId);
        }
        if (!c176566wO5.LIZ.containsKey("DeviceId")) {
            ConcurrentHashMap<String, String> concurrentHashMap2 = c176566wO5.LIZ;
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
            concurrentHashMap2.put("DeviceId", com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        }
        try {
            FUA.LIZJ("aweme_comment_list_api_monitor_log", new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(c176566wO5.LIZ)));
        } catch (Throwable unused) {
        }
        String str4 = this.LJLJI;
        if (str4 != null) {
            this.LJLILLLLZI.LIZIZ.put("gid", str4);
        }
        List<Comment> list4 = commentItemList.items;
        if (list4 == null || list4.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C176616wT c176616wT = this.LJLILLLLZI;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c176616wT.LIZ.put("is_empty", str);
        C176616wT c176616wT2 = this.LJLILLLLZI;
        Long valueOf = Long.valueOf(commentItemList.total);
        if (valueOf != null) {
            c176616wT2.LIZIZ.put("rsp_total", valueOf);
        } else {
            c176616wT2.getClass();
        }
        C176616wT c176616wT3 = this.LJLILLLLZI;
        List<Comment> list5 = commentItemList.items;
        if (list5 == null) {
            size = 0;
        } else {
            size = list5.size();
        }
        Integer valueOf2 = Integer.valueOf(size);
        if (valueOf2 != null) {
            c176616wT3.LIZIZ.put("rsp_count", valueOf2);
        } else {
            c176616wT3.getClass();
        }
        this.LJLILLLLZI.LJFF();
        if ((TextUtils.equals(this.LJLJJI, "v1") || TextUtils.equals(this.LJLJJI, "v2")) && this.LJLL != 0 && C79004UzY.LJJIFFI(commentItemList.items)) {
            C176546wM.LIZ(101, this.LJLJJI, this.LJLJI, this.LJLL, "", "");
        }
        if (C79004UzY.LJJIFFI(commentItemList.items) && this.mListQueryType == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mIsNewDataEmpty = z2;
        if (!z2) {
            int i4 = this.mListQueryType;
            if (i4 != 1) {
                if (i4 == 4) {
                    int LJIIL = LJIIL(this.LJLLL);
                    LJIJ(commentItemList);
                    List<Comment> list6 = commentItemList.items;
                    if (this.LJLZ && list6 != null) {
                        if (list6.size() + this.LJZ > LJIIL) {
                            this.LJLZ = false;
                            int i5 = LJIIL - this.LJZ;
                            this.LJZL.addAll(list6.subList(i5, list6.size()));
                            list6 = list6.subList(0, i5);
                        } else {
                            this.LJZ = list6.size() + this.LJZ;
                        }
                    }
                    LJIIJ(list6);
                    CommentItemList commentItemList2 = (CommentItemList) this.mData;
                    commentItemList2.total = commentItemList.total;
                    boolean z4 = commentItemList.hasMore;
                    commentItemList2.hasMore = z4;
                    boolean z5 = commentItemList.hasFoldComment;
                    commentItemList2.hasFoldComment = z5;
                    if (z5 && !z4) {
                        commentItemList2.cursor = commentItemList.foldCommentCursor;
                    } else {
                        commentItemList2.cursor = commentItemList.cursor;
                    }
                }
            } else {
                LJIJ(commentItemList);
                List<Comment> list7 = commentItemList.items;
                this.mData = commentItemList;
                commentItemList.items = new ArrayList();
                CommentItemList commentItemList3 = (CommentItemList) this.mData;
                if (commentItemList3.hasFoldComment && !commentItemList3.hasMore) {
                    commentItemList3.cursor = commentItemList.foldCommentCursor;
                }
                this.LJZL.clear();
                if (this.LJLLLLLL) {
                    int LJIIL2 = LJIIL(this.LJLLL);
                    if (list7 != null) {
                        if (list7.size() > LJIIL2) {
                            this.LJZL.addAll(list7.subList(LJIIL2, list7.size()));
                            list7 = list7.subList(0, LJIIL2);
                        } else {
                            this.LJLZ = true;
                            this.LJZ = list7.size();
                        }
                        this.LJLLLLLL = false;
                    }
                }
                LJIIJ(list7);
            }
        } else if (this.mData != 0) {
            if (this.mListQueryType == 1) {
                List<Comment> list8 = commentItemList.items;
                this.mData = commentItemList;
                commentItemList.items = new ArrayList();
                LJIIJ(list8);
            }
            CommentItemList commentItemList4 = (CommentItemList) this.mData;
            commentItemList4.hasFoldComment = commentItemList.hasFoldComment;
            commentItemList4.hasMore = false;
        }
        L6F.LIZIZ.LIZLLL(L61.STORY, EnumC53719L6l.COMMENT, commentItemList.items, new AObjectS27S0000000_3(0));
    }

    public final void LJIILL(CommentItemList commentItemList) {
        if (C176536wL.LIZ().LIZ && commentItemList != null) {
            List<Comment> list = commentItemList.items;
            L6F.LIZIZ.LIZLLL(L61.STORY, EnumC53719L6l.COMMENT, list, new AObjectS9S0001000_3(0, 0));
            if (list != null && list.size() != 0) {
                for (int i = 0; i < list.size(); i++) {
                    LJIIZILJ((Comment) ListProtector.get(list, i));
                    List<Comment> replyComments = ((Comment) ListProtector.get(list, i)).getReplyComments();
                    if (replyComments != null) {
                        for (int i2 = 0; i2 < replyComments.size(); i2++) {
                            LJIIZILJ((Comment) ListProtector.get(replyComments, i2));
                        }
                    }
                }
            }
        }
    }

    public final void LJIIZILJ(Comment comment) {
        comment.setTimeFormat(C1799274i.LJII(comment));
        User user = comment.getUser();
        if (user != null) {
            user.setUserDisplayName(C1799274i.LJ(user, this.LJLLJ));
        }
        C118824lS.LIZLLL(null, comment.getText());
    }

    @Override // X.C8BS
    public boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 9) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public void loadMoreList(Object... objArr) {
        long j;
        this.LJLJL = false;
        int LIZ = C177126xI.LIZ();
        int LIZ2 = C176306vy.LIZ();
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((CommentItemList) this.mData).cursor;
        }
        LJIIJJI(str, j, 20, (String) objArr[2], (Long) objArr[3], ((Integer) objArr[4]).intValue(), ((Integer) objArr[5]).intValue(), LIZ, LIZ2, (C76F) objArr[6], (String) objArr[7], (String) objArr[8]);
    }

    @Override // X.AbstractC51036K1g
    public void refreshList(Object... objArr) {
        int LIZ = C176746wg.LIZ();
        int LIZ2 = C177126xI.LIZ();
        int LIZ3 = C176306vy.LIZ();
        ((ArrayList) this.LJZI).clear();
        LJIIJJI((String) objArr[1], 0L, LIZ, (String) objArr[2], (Long) objArr[3], ((Integer) objArr[4]).intValue(), ((Integer) objArr[5]).intValue(), LIZ2, LIZ3, (C76F) objArr[6], (String) objArr[7], (String) objArr[8]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ(int i, List list) {
        C174386ss c174386ss;
        Comment comment;
        int size;
        int i2;
        String awemeId;
        int i3;
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        if (((CommentItemList) this.mData).replyStyle == 2 && (c174386ss = this.LJLJLLL) != null) {
            c174386ss.LIZJ();
            C174386ss c174386ss2 = this.LJLJLLL;
            String str = this.LJLJJL;
            c174386ss2.getClass();
            if (str == null) {
                str = "";
            }
            c174386ss2.LIZLLL = str;
            this.LJLJLLL.getClass();
            if (i == 1) {
                this.LJLJLLL.LIZIZ();
            }
            C174386ss c174386ss3 = this.LJLJLLL;
            int i4 = this.LJLLLL;
            if (list != null) {
                if (c174386ss3.LIZ == null || c174386ss3.LIZIZ == null) {
                    return;
                }
                String str2 = (String) ListProtector.get(Arrays.asList(c174386ss3.LIZLLL.split(",")), 0);
                for (int i5 = 0; i5 < list.size(); i5++) {
                    Comment comment2 = (Comment) ListProtector.get(list, i5);
                    CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
                    boolean LJJIZ = V16.LJJIZ(comment2);
                    int i6 = 5;
                    if (comment2.getCommentType() == 0) {
                        if (i4 == 5) {
                            i3 = 225;
                        } else {
                            i3 = 1;
                        }
                        comment2.setCommentType(i3);
                    }
                    comment2.setNeedHint(TextUtils.equals(str2, comment2.getCid()));
                    if (TextUtils.equals(c174386ss3.LIZLLL, comment2.getCid())) {
                        c174386ss3.LJ = comment2;
                    }
                    commentReplyListItem.mComment = comment2;
                    if (!((ArrayList) c174386ss3.LIZ).contains(commentReplyListItem)) {
                        ((ArrayList) c174386ss3.LIZ).add(commentReplyListItem);
                        c174386ss3.LIZIZ.add(comment2);
                        if (LJJIZ && c174386ss3.LIZJ != null) {
                            int size2 = ((ArrayList) c174386ss3.LIZ).size() - 1;
                            if (c174386ss3.LIZJ.LIZ() == 0) {
                                c174386ss3.LIZJ.LIZ = size2;
                            }
                            c174386ss3.LIZJ.LIZIZ = size2;
                        }
                        List<Comment> replyComments = comment2.getReplyComments();
                        if (replyComments == null) {
                            size = 0;
                        } else {
                            size = replyComments.size();
                            if (size > 0) {
                                for (Comment comment3 : comment2.getReplyComments()) {
                                    if (i4 == i6) {
                                        i2 = 225;
                                    } else {
                                        i2 = 2;
                                    }
                                    comment3.setCommentType(i2);
                                    comment3.parentCommentId = comment2.getCid();
                                    comment3.parentCommentType = comment2.getCommentType();
                                    comment3.setNeedHint(TextUtils.equals(str2, comment3.getCid()));
                                    if (TextUtils.equals(c174386ss3.LIZLLL, comment3.getCid())) {
                                        c174386ss3.LJ = comment3;
                                    }
                                    if (!commentReplyListItem.mReplyComments.contains(comment3)) {
                                        commentReplyListItem.mReplyComments.add(comment3);
                                        c174386ss3.LIZIZ.add(comment3);
                                    }
                                    i6 = 5;
                                }
                            }
                        }
                        long replyCommentTotal = comment2.getReplyCommentTotal() - size;
                        long j = 0;
                        if (replyCommentTotal > 0) {
                            CommentReplyButtonStruct commentReplyButtonStruct = new CommentReplyButtonStruct(comment2, ((ArrayList) c174386ss3.LIZ).size() - 1);
                            commentReplyListItem.mButtonStruct = commentReplyButtonStruct;
                            c174386ss3.LIZIZ.add(commentReplyButtonStruct);
                        }
                        if (LJJIZ && ((i5 == list.size() - 1 || !V16.LJJIZ((Comment) ListProtector.get(list, i5 + 1))) && c174386ss3.LIZJ != null)) {
                            if (comment2.getAwemeId() == null) {
                                awemeId = "";
                            } else {
                                awemeId = comment2.getAwemeId();
                            }
                            UpvoteList LJIIIZ = C7HV.LIZIZ.LJIIIZ(awemeId);
                            if (LJIIIZ != null) {
                                j = LJIIIZ.getTotal();
                            }
                            C174496t3 c174496t3 = c174386ss3.LIZJ.LIZJ;
                            if (c174496t3 == null) {
                                c174496t3 = new C174496t3();
                                c174386ss3.LIZJ.LIZJ = c174496t3;
                                Aweme aweme = c174386ss3.LJFF;
                                if (aweme != null) {
                                    c174496t3.setAweme(aweme);
                                }
                            }
                            c174496t3.setRemainCount(j - c174386ss3.LIZJ.LIZ());
                            c174386ss3.LIZIZ.add(c174496t3);
                        }
                    }
                }
                if (TextUtils.isEmpty(c174386ss3.LIZLLL) || (comment = c174386ss3.LJ) == null) {
                    return;
                }
                CommentListFragment commentListFragment = c174386ss3.LJIIIIZZ.LIZ;
                commentListFragment.LLLLIIIILLL = comment;
                if (c174386ss3.LJI) {
                    commentListFragment.Uo();
                }
                if (!c174386ss3.LJII) {
                    return;
                }
                C174136sT c174136sT = c174386ss3.LJIIIIZZ;
                Comment comment4 = c174386ss3.LJ;
                c174136sT.getClass();
                if (comment4.getUserDigged() != 0) {
                    return;
                }
                C2U8.LIZ(new C176406w8(comment4));
                return;
            }
            c174386ss3.getClass();
            return;
        }
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Comment comment5 = (Comment) it.next();
            if (!C79004UzY.LJJIFFI(comment5.getReplyComments())) {
                Comment comment6 = (Comment) ListProtector.get(comment5.getReplyComments(), 0);
                ArrayList arrayList = new ArrayList();
                comment5.setReplyComments(null);
                arrayList.add(comment5);
                comment6.setReplyComments(arrayList);
                comment5 = comment6;
            }
            comment5.setNeedHint(TextUtils.equals(this.LJLJJL, comment5.getCid()));
            if (!((CommentItemList) this.mData).items.contains(comment5)) {
                if (comment5.getCommentType() == 0) {
                    comment5.setCommentType(1);
                }
                ((CommentItemList) this.mData).items.add(comment5);
            }
        }
    }

    public final void LJIIJJI(String str, final long j, final int i, final String str2, final Long l, final int i2, final int i3, final int i4, final int i5, final C76F c76f, final String str3, final String str4) {
        boolean z;
        String str5;
        String str6;
        this.LJLJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = i3;
        this.LJLJL = false;
        if (!((ArrayList) this.LJZI).isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray((Collection) this.LJZI);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pre_comment_entity_words", jSONArray);
                str6 = jSONObject.toString();
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                str6 = null;
            }
            this.LJLJLJ = str6;
        }
        CommentItemList LIZ = C1800874y.LIZ(new C176556wN(i3, this.LJLJI, str2, j));
        if (CommentPreloadExperiment.LIZ().getUseLocalCache() && LIZ != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("hit local cache, aid: ");
            YE1.LIZLLL(LIZ2, this.LJLJI, ", cid: ", str2, ", loadType: ");
            LIZ2.append(i3);
            C71Y.LIZLLL("InboxCommentPreload", X1D.LIZIZ(LIZ2));
            this.LJLJL = true;
            C188727au LIZLLL = KNV.LIZLLL(str3, "enterFrom");
            LIZLLL.LJIIIZ("enter_from", str3);
            FMX.LJIIL("hit_comment_preload", LIZLLL.LIZ);
            this.LJLJJI = "v2";
            this.mIsLoading = false;
            handleData(LIZ);
            List<C8BT> list = this.mNotifyListeners;
            if (list != null) {
                Iterator<C8BT> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess();
                }
                return;
            }
            return;
        }
        C176616wT c176616wT = this.LJLILLLLZI;
        c176616wT.getClass();
        c176616wT.LIZLLL = "ttk_comment_list_api_monitor";
        C176616wT c176616wT2 = this.LJLILLLLZI;
        if (str3 != null) {
            c176616wT2.LIZ.put("enter_from", str3);
        } else {
            c176616wT2.getClass();
        }
        C176616wT c176616wT3 = this.LJLILLLLZI;
        if (j == 0) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c176616wT3.LIZ.put("is_first_page", str5);
        C176616wT c176616wT4 = this.LJLILLLLZI;
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            c176616wT4.LIZIZ.put("req_count", valueOf);
        } else {
            c176616wT4.getClass();
        }
        C176616wT c176616wT5 = this.LJLILLLLZI;
        Long valueOf2 = Long.valueOf(j);
        if (valueOf2 != null) {
            c176616wT5.LIZIZ.put("req_offset", valueOf2);
        } else {
            c176616wT5.getClass();
        }
        if (this.LJLLI) {
            C10K.LIZIZ(new Callable() { // from class: X.6w7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C176376w5 c176376w5 = C176376w5.this;
                    String str7 = str2;
                    long j2 = j;
                    int i6 = i;
                    Long l2 = l;
                    int i7 = i2;
                    int i8 = i3;
                    int i9 = i4;
                    int i10 = i5;
                    C76F c76f2 = c76f;
                    String str8 = str3;
                    String str9 = str4;
                    c176376w5.getClass();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("CommentFetchModel: fetchList task call: aid = ");
                    LIZ3.append(c176376w5.LJLJI);
                    LIZ3.append(" insertCids = ");
                    LIZ3.append(str7);
                    C176186vm.LIZ(X1D.LIZIZ(LIZ3));
                    c176376w5.LJLJJI = "v2";
                    if (C176536wL.LIZ().LIZ) {
                        CommentApi.LIZLLL(c176376w5.LJLJI, j2, i6, str7, l2, i7, i8, i9, i10, c76f2, c176376w5.LJLLLL, str8, c176376w5.LJLJLJ, str9).LIZLLL(new AgS86S0101000_3(0, c176376w5, 0)).LIZLLL(new C182587Eo(c176376w5.mHandler));
                        return null;
                    }
                    CommentApi.LIZLLL(c176376w5.LJLJI, j2, i6, str7, l2, i7, i8, i9, i10, c76f2, c176376w5.LJLLLL, str8, c176376w5.LJLJLJ, str9).LIZLLL(new C182587Eo(c176376w5.mHandler));
                    return null;
                }
            }, C38995FSd.LIZLLL(), null);
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("CommentFetchModel: fetchList: aid = ");
        LIZ3.append(this.LJLJI);
        LIZ3.append(" insertCids = ");
        LIZ3.append(str2);
        C176186vm.LIZ(X1D.LIZIZ(LIZ3));
        this.LJLJJI = "v2";
        if (C176536wL.LIZ().LIZ) {
            CommentApi.LIZLLL(this.LJLJI, j, i, str2, l, i2, i3, i4, i5, c76f, this.LJLLLL, str3, this.LJLJLJ, str4).LIZLLL(new AgS87S0101000_15(1, this, 0)).LIZLLL(new C182587Eo(this.mHandler));
        } else {
            CommentApi.LIZLLL(this.LJLJI, j, i, str2, l, i2, i3, i4, i5, c76f, this.LJLLLL, str3, this.LJLJLJ, str4).LIZLLL(new C182587Eo(this.mHandler));
        }
    }
}
