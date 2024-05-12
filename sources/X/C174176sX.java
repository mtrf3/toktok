package X;

import Y.AgS121S0100000_3;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6sX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174176sX extends C51031K1b<C176386w6> implements InterfaceC223218pR<Comment> {
    public static java.util.Map<String, C174096sP> LJLLILLLL;
    public InterfaceC174336sn LJLJJL;
    public InterfaceC174326sm LJLJJLL;
    public CommentReplyButtonStruct LJLJL;
    public C174386ss LJLJLJ;
    public String LJLJLLL;
    public final String LJLL;
    public final String LJLLI;

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<Comment> list, boolean z) {
    }

    @Override // X.C51031K1b, X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        InterfaceC174326sm interfaceC174326sm = this.LJLJJLL;
        if (interfaceC174326sm != null) {
            ((C174836tb) interfaceC174326sm).L(3);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        if (this.LJLJL != null && this.LJLIL.getData() != null) {
            this.LJLJL.setCursor(((CommentItemList) this.LJLIL.getData()).cursor);
            this.LJLJL.setHasMore(((AbstractC51036K1g) this.LJLIL).isHasMore());
        }
        if (this.LJLJJLL != null) {
            if (((AbstractC51036K1g) this.LJLIL).isHasMore()) {
                ((C174836tb) this.LJLJJLL).L(1);
            } else {
                ((C174836tb) this.LJLJJLL).L(2);
            }
        }
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        InterfaceC174326sm interfaceC174326sm = this.LJLJJLL;
        if (interfaceC174326sm != null) {
            ((C174836tb) interfaceC174326sm).L(3);
        }
    }

    public static C174096sP LJJIJ(String str) {
        if (LJLLILLLL == null) {
            LJLLILLLL = new HashMap();
        }
        C174096sP c174096sP = (C174096sP) ((HashMap) LJLLILLLL).get(str);
        if (c174096sP != null || ((HashMap) LJLLILLLL).containsKey(str)) {
            return c174096sP;
        }
        return new C174096sP();
    }

    public final boolean LJJIJIIJI(int i) {
        C174386ss c174386ss;
        List<Comment> LJI;
        String str;
        CommentReplyButtonStruct commentReplyButtonStruct = this.LJLJL;
        if (commentReplyButtonStruct == null || (c174386ss = this.LJLJLJ) == null || (LJI = c174386ss.LJI(commentReplyButtonStruct.getCid())) == null || this.LJLJL.getExpandSize() >= LJI.size()) {
            return true;
        }
        int min = Math.min(this.LJLJL.getExpandSize() + i, LJI.size());
        InterfaceC174336sn interfaceC174336sn = this.LJLJJL;
        if (interfaceC174336sn != null) {
            CommentReplyButtonStruct commentReplyButtonStruct2 = this.LJLJL;
            if (commentReplyButtonStruct2 != null) {
                str = commentReplyButtonStruct2.getCid();
            } else {
                str = "";
            }
            ((CommentListFragment) interfaceC174336sn).Mn(str, LJI.subList(this.LJLJL.getExpandSize(), min));
        }
        this.LJLJL.setExpandSize(min);
        if (this.LJLJJLL != null) {
            if (this.LJLJL.getExpandSize() >= this.LJLJL.getReplyCommentTotal()) {
                ((C174836tb) this.LJLJJLL).L(2);
                return false;
            }
            ((C174836tb) this.LJLJJLL).L(1);
            return false;
        }
        return false;
    }

    public final void LJJIJIIJIL(List<Comment> list) {
        C174386ss c174386ss;
        List<Comment> LJI;
        CommentReplyButtonStruct commentReplyButtonStruct = this.LJLJL;
        if (commentReplyButtonStruct != null && (c174386ss = this.LJLJLJ) != null && (LJI = c174386ss.LJI(commentReplyButtonStruct.getCid())) != null) {
            Iterator<Comment> it = list.iterator();
            while (it.hasNext()) {
                Comment next = it.next();
                if (next != null && LJI.contains(next)) {
                    it.remove();
                }
            }
        }
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        T t = this.LJLIL;
        if (t != 0) {
            ((AbstractC176576wP) t).LJLILLLLZI.LJI(C64920Pds.LIZ(EF7.LIZIZ(), exc));
        }
        C1A7.LJIJJ(C84763XOl.LJIIIIZZ(), exc);
        InterfaceC174326sm interfaceC174326sm = this.LJLJJLL;
        if (interfaceC174326sm != null) {
            ((C174836tb) interfaceC174326sm).L(0);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        T t = this.LJLIL;
        if (t != 0) {
            ((AbstractC176576wP) t).LJLILLLLZI.LJI(C64920Pds.LIZ(EF7.LIZIZ(), exc));
        }
        C1A7.LJIJJ(C84763XOl.LJIIIIZZ(), exc);
        InterfaceC174326sm interfaceC174326sm = this.LJLJJLL;
        if (interfaceC174326sm != null) {
            ((C174836tb) interfaceC174326sm).L(1);
        }
    }

    public C174176sX(String str, String str2) {
        LJJ(new C176376w5() { // from class: X.6w6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C176376w5, X.AbstractC51036K1g
            public final List<Comment> getItems() {
                T t = this.mData;
                if (t == 0) {
                    return null;
                }
                return ((CommentItemList) t).items;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C176376w5
            public final void LJIIJ(List<Comment> list) {
                if (C79004UzY.LJJIFFI(list)) {
                    return;
                }
                CommentItemList commentItemList = (CommentItemList) this.mData;
                commentItemList.replyStyle = 2;
                if (this.mListQueryType == 4) {
                    commentItemList.items = new ArrayList();
                }
                for (Comment comment : list) {
                    comment.setCommentType(2);
                    if (comment.getTransBtnStyle() == 1 && !TextUtils.isEmpty(comment.getTranslatedText())) {
                        Comment m103clone = comment.m103clone();
                        o.LJIIIIZZ(m103clone, "comment.clone()");
                        HashMap<String, Comment> hashMap = C178216z3.LIZLLL;
                        String cid = comment.getCid();
                        o.LJIIIIZZ(cid, "comment.cid");
                        hashMap.put(cid, m103clone);
                        AnonymousClass710.LIZ(comment, comment.getTranslatedText());
                        comment.setTranslated(true);
                        C178216z3.LIZ(comment);
                    }
                    ((CommentItemList) this.mData).items.add(comment);
                }
            }

            @Override // X.C176376w5, X.C8BS
            public final boolean checkParams(Object... objArr) {
                if (objArr != null && objArr.length == 11) {
                    return true;
                }
                return false;
            }

            @Override // X.C176376w5, X.AbstractC51036K1g
            public final void loadMoreList(Object... objArr) {
                String valueOf;
                int i;
                Object obj = objArr[5];
                if (obj == null) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(obj);
                }
                String valueOf2 = String.valueOf(objArr[1]);
                long longValue = ((Long) objArr[3]).longValue();
                C174096sP LJJIJ = C174176sX.LJJIJ(String.valueOf(objArr[1]));
                if (LJJIJ != null) {
                    i = LJJIJ.LIZ;
                } else {
                    i = 3;
                }
                String valueOf3 = String.valueOf(objArr[2]);
                String valueOf4 = String.valueOf(objArr[4]);
                int intValue = ((Integer) objArr[6]).intValue();
                boolean booleanValue = ((Boolean) objArr[7]).booleanValue();
                LJIJI(i, intValue, longValue, (C76F) objArr[9], valueOf2, valueOf3, valueOf4, valueOf, String.valueOf(objArr[8]), String.valueOf(objArr[10]), booleanValue);
            }

            @Override // X.C176376w5, X.AbstractC51036K1g
            public final void refreshList(Object... objArr) {
                String valueOf;
                int i;
                Object obj = objArr[5];
                if (obj == null) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(obj);
                }
                String valueOf2 = String.valueOf(objArr[1]);
                long longValue = ((Long) objArr[3]).longValue();
                C174096sP LJJIJ = C174176sX.LJJIJ(String.valueOf(objArr[1]));
                if (LJJIJ != null) {
                    i = LJJIJ.LIZ;
                } else {
                    i = 3;
                }
                String valueOf3 = String.valueOf(objArr[2]);
                String valueOf4 = String.valueOf(objArr[4]);
                int intValue = ((Integer) objArr[6]).intValue();
                boolean booleanValue = ((Boolean) objArr[7]).booleanValue();
                LJIJI(i, intValue, longValue, (C76F) objArr[9], valueOf2, valueOf3, valueOf4, valueOf, String.valueOf(objArr[8]), String.valueOf(objArr[10]), booleanValue);
            }

            public final void LJIJI(int i, int i2, long j, C76F c76f, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
                String str9;
                String str10;
                this.LJLJI = str5;
                this.LJLJJI = "reply";
                if (!((ArrayList) this.LJZI).isEmpty()) {
                    try {
                        JSONArray jSONArray = new JSONArray((Collection) this.LJZI);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("pre_comment_entity_words", jSONArray);
                        str10 = jSONObject.toString();
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                        str10 = null;
                    }
                    this.LJLJLJ = str10;
                }
                C176616wT c176616wT = this.LJLILLLLZI;
                c176616wT.getClass();
                c176616wT.LIZLLL = "ttk_comment_list_reply_api_monitor";
                this.LJLILLLLZI.LIZ.put("enter_from", str8);
                C176616wT c176616wT2 = this.LJLILLLLZI;
                if (j == 0) {
                    str9 = "1";
                } else {
                    str9 = CardStruct.IStatusCode.DEFAULT;
                }
                c176616wT2.LIZ.put("is_first_page", str9);
                C176616wT c176616wT3 = this.LJLILLLLZI;
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    c176616wT3.LIZIZ.put("req_count", valueOf);
                } else {
                    c176616wT3.getClass();
                }
                C176616wT c176616wT4 = this.LJLILLLLZI;
                Long valueOf2 = Long.valueOf(j);
                if (valueOf2 != null) {
                    c176616wT4.LIZIZ.put("req_offset", valueOf2);
                } else {
                    c176616wT4.getClass();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CommentReplyListModel: fetchList: aid = ");
                LIZ.append(this.LJLJI);
                LIZ.append(" commentId = ");
                LIZ.append(str3);
                C176186vm.LIZ(X1D.LIZIZ(LIZ));
                int LIZ2 = C177126xI.LIZ();
                if (C176536wL.LIZ().LIZ) {
                    CommentApi.LJIIIZ(str3, j, i, str4, str5, str6, i2, z, LIZ2, str7, c76f, str8, this.LJLJLJ).LIZLLL(new AgS121S0100000_3(this, 1)).LIZLLL(new C182587Eo(this.mHandler));
                } else {
                    CommentApi.LJIIIZ(str3, j, i, str4, str5, str6, i2, z, LIZ2, str7, c76f, str8, this.LJLJLJ).LIZLLL(new C182587Eo(this.mHandler));
                }
            }
        });
        this.LJLILLLLZI = this;
        this.LJLL = str2;
        this.LJLLI = str;
        LJLLILLLL = new HashMap();
    }

    public static void LJJIIZ(int i, String str) {
        if (str == null) {
            return;
        }
        ((HashMap) LJLLILLLL).put(str, LJJIJ(str));
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<Comment> list, boolean z) {
        String str;
        C174156sV.LIZ.LJ = System.currentTimeMillis();
        boolean isHasMore = ((AbstractC51036K1g) this.LJLIL).isHasMore();
        if (this.LJLJL != null) {
            LJJIJIIJIL(list);
            this.LJLJL.setReplyCommentTotal(((C176376w5) this.LJLIL).LJIILIIL());
            this.LJLJL.setCursor(((CommentItemList) this.LJLIL.getData()).cursor);
            this.LJLJL.addExpandSize(list.size());
            if (isHasMore && ((C176376w5) this.LJLIL).LJIILIIL() > this.LJLJL.getExpandSize()) {
                isHasMore = true;
            } else {
                isHasMore = false;
            }
            this.LJLJL.setHasMore(isHasMore);
        }
        InterfaceC174336sn interfaceC174336sn = this.LJLJJL;
        if (interfaceC174336sn != null) {
            CommentReplyButtonStruct commentReplyButtonStruct = this.LJLJL;
            if (commentReplyButtonStruct != null) {
                str = commentReplyButtonStruct.getCid();
            } else {
                str = "";
            }
            ((CommentListFragment) interfaceC174336sn).Mn(str, list);
        }
        InterfaceC174326sm interfaceC174326sm = this.LJLJJLL;
        if (interfaceC174326sm != null) {
            if (isHasMore) {
                ((C174836tb) interfaceC174326sm).L(1);
            } else {
                ((C174836tb) interfaceC174326sm).L(2);
            }
        }
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<Comment> list, boolean z) {
        String str;
        C174156sV.LIZ.LJ = System.currentTimeMillis();
        boolean isHasMore = ((AbstractC51036K1g) this.LJLIL).isHasMore();
        if (this.LJLJL != null) {
            LJJIJIIJIL(list);
            this.LJLJL.setReplyCommentTotal(((C176376w5) this.LJLIL).LJIILIIL());
            this.LJLJL.setCursor(((CommentItemList) this.LJLIL.getData()).cursor);
            this.LJLJL.addExpandSize(list.size());
            if (isHasMore && ((C176376w5) this.LJLIL).LJIILIIL() > this.LJLJL.getExpandSize()) {
                isHasMore = true;
            } else {
                isHasMore = false;
            }
            this.LJLJL.setHasMore(isHasMore);
        }
        InterfaceC174336sn interfaceC174336sn = this.LJLJJL;
        if (interfaceC174336sn != null) {
            CommentReplyButtonStruct commentReplyButtonStruct = this.LJLJL;
            if (commentReplyButtonStruct != null) {
                str = commentReplyButtonStruct.getCid();
            } else {
                str = "";
            }
            ((CommentListFragment) interfaceC174336sn).Mn(str, list);
        }
        InterfaceC174326sm interfaceC174326sm = this.LJLJJLL;
        if (interfaceC174326sm != null) {
            if (isHasMore) {
                ((C174836tb) interfaceC174326sm).L(1);
            } else {
                ((C174836tb) interfaceC174326sm).L(2);
            }
        }
    }

    public final void LJJIIZI(int i, CommentReplyButtonStruct commentReplyButtonStruct, long j, String str, int i2, boolean z, String str2) {
        LJIILL(Integer.valueOf(i), commentReplyButtonStruct.getCommentId(), commentReplyButtonStruct.getTopIds(), Long.valueOf(j), this.LJLLI, str, Integer.valueOf(i2), Boolean.valueOf(z), str2, C76D.LIZ(commentReplyButtonStruct.getAwemeAuthor(), this.LJLL), this.LJLL);
    }
}
