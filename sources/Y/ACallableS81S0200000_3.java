package Y;

import X.AbstractC36908Ee8;
import X.C141335gf;
import X.C16880lQ;
import X.C176416w9;
import X.C176426wA;
import X.C176436wB;
import X.C176596wR;
import X.C176616wT;
import X.C176676wZ;
import X.C178476zT;
import X.C188727au;
import X.C218998id;
import X.C221018lt;
import X.C224458rR;
import X.C3C5;
import X.C55688LtM;
import X.C76800UCe;
import X.C78939UyV;
import X.C7G8;
import X.C8IM;
import X.FMX;
import X.V0N;
import X.X1D;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.CommentPublishRequestModel;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.improve.pkg.NowInviteSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ACallableS81S0200000_3 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) aCallableS81S0200000_3.l0;
        String str3 = "";
        if (objArr.length <= 1 || (obj2 = objArr[1]) == null) {
            str = "";
        } else {
            str = (String) obj2;
        }
        if (objArr.length <= 2 || (obj = objArr[2]) == null) {
            str2 = "";
        } else {
            str2 = (String) obj;
        }
        C224458rR c224458rR = (C224458rR) aCallableS81S0200000_3.l1;
        int i = c224458rR.LJLILLLLZI;
        int min = Math.min(i + 10, ((ArrayList) c224458rR.LJLJI).size() - 1);
        if (i <= min) {
            while (true) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str3);
                str3 = q.LIZIZ(LIZ, (String) ListProtector.get(((C224458rR) aCallableS81S0200000_3.l1).LJLJI, i), ',', LIZ);
                if (i == min) {
                    break;
                }
                i++;
            }
        }
        if (str3.length() > 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[ ");
            String substring = str3.substring(0, str3.length() - 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ2.append(substring);
            LIZ2.append(']');
            str3 = X1D.LIZIZ(LIZ2);
        }
        return DetailApi.LIZLLL(0, str3, str, str2, 0, 0, null);
    }

    public static final Object call$1(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        if (TextUtils.equals("opus", ((VideoDiggVM) aCallableS81S0200000_3.l0).LJLJI)) {
            VideoDiggVM videoDiggVM = (VideoDiggVM) aCallableS81S0200000_3.l0;
            if (videoDiggVM.LJLJJI) {
                videoDiggVM.getContext();
                FMX.LJI(0L, "like", "personal_homepage", ((Aweme) aCallableS81S0200000_3.l1).getAid(), ((VideoDiggVM) aCallableS81S0200000_3.l0).getMobBaseJsonObject());
                return null;
            }
            videoDiggVM.getContext();
            FMX.LJI(0L, "like", "others_homepage", ((Aweme) aCallableS81S0200000_3.l1).getAid(), ((VideoDiggVM) aCallableS81S0200000_3.l0).getMobBaseJsonObject());
            return null;
        }
        ((VideoDiggVM) aCallableS81S0200000_3.l0).getContext();
        FMX.LJI(0L, "like", ((VideoDiggVM) aCallableS81S0200000_3.l0).LJLJI, ((Aweme) aCallableS81S0200000_3.l1).getAid(), ((VideoDiggVM) aCallableS81S0200000_3.l0).getMobBaseJsonObject());
        return null;
    }

    public static final Object call$10(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        String string = ((SharePackage) aCallableS81S0200000_3.l0).extras.getString("shareIdList");
        if (string == null) {
            string = "";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", ((NowInviteSharePackage) aCallableS81S0200000_3.l1).nowInviteShareParams.LJLIL);
        c188727au.LJIIIZ("position", ((NowInviteSharePackage) aCallableS81S0200000_3.l1).nowInviteShareParams.LJLJJI);
        c188727au.LJIIIZ("to_user_id", string);
        c188727au.LJIIIZ("card_type", "black");
        FMX.LJIIL("now_invite_through_chat", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        C176436wB c176436wB = (C176436wB) aCallableS81S0200000_3.l0;
        Object[] objArr = (Object[]) aCallableS81S0200000_3.l1;
        c176436wB.getClass();
        c176436wB.LJLJI = (String) objArr[0];
        if (objArr.length == 3) {
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            try {
                return ((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).deleteComment((String) objArr[0], intValue, intValue2, c176436wB.LJLJJL).get();
            } catch (ExecutionException e) {
                throw AbstractC36908Ee8.getCompatibleException(e);
            }
        }
        int intValue3 = ((Integer) objArr[1]).intValue();
        try {
            return ((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).deleteComment((String) objArr[0], intValue3, c176436wB.LJLJJL).get();
        } catch (ExecutionException e2) {
            throw AbstractC36908Ee8.getCompatibleException(e2);
        }
    }

    public static final Object call$3(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        C176426wA c176426wA = (C176426wA) aCallableS81S0200000_3.l0;
        Object[] objArr = (Object[]) aCallableS81S0200000_3.l1;
        c176426wA.getClass();
        String str = (String) objArr[0];
        c176426wA.LJLJI = str;
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        c176426wA.LJLJJI = str3;
        return CommentApi.LIZJ(C55688LtM.LIZ((String) objArr[3]), str, str2, str3);
    }

    public static final Object call$4(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        C176416w9 c176416w9 = (C176416w9) aCallableS81S0200000_3.l0;
        Object[] objArr = (Object[]) aCallableS81S0200000_3.l1;
        c176416w9.getClass();
        String str = (String) objArr[0];
        c176416w9.LJLJI = str;
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        c176416w9.LJLJJI = str3;
        return CommentApi.LIZJ(C55688LtM.LIZ((String) objArr[3]), str, str2, str3);
    }

    public static final Object call$5(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        String str;
        String str2;
        CommentResponse commentResponse;
        String str3;
        C176596wR c176596wR = (C176596wR) aCallableS81S0200000_3.l0;
        Object[] objArr = (Object[]) aCallableS81S0200000_3.l1;
        c176596wR.getClass();
        C176676wZ c176676wZ = (C176676wZ) objArr[0];
        if (c176676wZ.LJIIIIZZ != 0 && !V0N.LJJII(c176676wZ.LJII)) {
            str = "ttk_comment_gift_send_api_monitor";
        } else {
            str = "ttk_comment_publish_api_monitor";
        }
        C176616wT c176616wT = c176596wR.LJLILLLLZI;
        c176616wT.getClass();
        c176616wT.LIZLLL = str;
        C176616wT c176616wT2 = c176596wR.LJLILLLLZI;
        String str4 = c176676wZ.LJIILLIIL;
        if (str4 != null) {
            c176616wT2.LIZ.put("enter_from", str4);
        } else {
            c176616wT2.getClass();
        }
        String str5 = c176676wZ.LIZJ;
        if (str5 != null) {
            c176596wR.LJLILLLLZI.LIZIZ.put("cid", str5);
        }
        String str6 = c176676wZ.LIZ;
        if (str6 != null) {
            c176596wR.LJLILLLLZI.LIZIZ.put("gid", str6);
        }
        try {
            if (c176676wZ.LJIIIIZZ != 0 && !V0N.LJJII(c176676wZ.LJII)) {
                return CommentApi.LJIIIIZZ(c176676wZ);
            }
            Gson LIZ = GsonHolder.LIZLLL().LIZ();
            CommentPublishRequestModel LIZIZ = CommentApi.LIZIZ(c176676wZ);
            String str7 = "[]";
            if (c176676wZ.LJIIL != -1) {
                CommentApi.RealApi realApi = (CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class);
                String aid = LIZIZ.getAid();
                String text = LIZIZ.getText();
                String replyId = LIZIZ.getReplyId();
                if (LIZIZ.getTextExtraList() == null) {
                    str3 = "[]";
                } else {
                    str3 = GsonProtectorUtils.toJson(LIZ, LIZIZ.getTextExtraList());
                }
                if (LIZIZ.getImageList() != null) {
                    str7 = GsonProtectorUtils.toJson(LIZ, LIZIZ.getImageList());
                }
                commentResponse = realApi.publishCommentCheck(aid, text, replyId, str3, str7, LIZIZ.getIsSelfSee(), LIZIZ.getReplyToReplyId(), LIZIZ.getChannelId(), LIZIZ.getActionType(), LIZIZ.getAdInfo(), c176676wZ.LJIILJJIL, c176676wZ.LJIIL).get();
            } else {
                CommentApi.RealApi realApi2 = (CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class);
                String aid2 = LIZIZ.getAid();
                String text2 = LIZIZ.getText();
                String replyId2 = LIZIZ.getReplyId();
                if (LIZIZ.getTextExtraList() == null) {
                    str2 = "[]";
                } else {
                    str2 = GsonProtectorUtils.toJson(LIZ, LIZIZ.getTextExtraList());
                }
                if (LIZIZ.getImageList() != null) {
                    str7 = GsonProtectorUtils.toJson(LIZ, LIZIZ.getImageList());
                }
                commentResponse = realApi2.publishComment(aid2, text2, replyId2, str2, str7, LIZIZ.getIsSelfSee(), LIZIZ.getReplyToReplyId(), LIZIZ.getChannelId(), LIZIZ.getActionType(), LIZIZ.getAdInfo(), c176676wZ.LJIILJJIL).get();
            }
            commentResponse.comment.setLabelInfo(commentResponse.starFakeLabel);
            commentResponse.comment.setFakeId(c176676wZ.LJI);
            commentResponse.comment.setStoryEmojiComment(c176676wZ.LJIILIIL);
            commentResponse.comment.setPublishScenario(c176676wZ.LJIILJJIL);
            commentResponse.comment.setImageList(C78939UyV.LJFF(c176676wZ.LJIJ));
            return commentResponse;
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static final Object call$6(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        ((C7G8) aCallableS81S0200000_3.l0).addView((C8IM) aCallableS81S0200000_3.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$7(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        Long l;
        for (AnchorCommonStruct anchorCommonStruct : (List) aCallableS81S0200000_3.l0) {
            Aweme aweme = (Aweme) aCallableS81S0200000_3.l1;
            if (anchorCommonStruct != null && aweme != null) {
                C188727au c188727au = new C188727au();
                c188727au.LIZLLL(anchorCommonStruct.getAnchorState(), "anchor_state");
                c188727au.LIZLLL(anchorCommonStruct.getType(), "anchor_type");
                c188727au.LJIIIZ("group_id", aweme.getAid());
                c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
                Music music = aweme.getMusic();
                String str = null;
                if (music != null) {
                    l = Long.valueOf(music.getId());
                } else {
                    l = null;
                }
                c188727au.LJFF(l, "music_id");
                c188727au.LJIIIZ("enter_from", "homepage_hot");
                LogPbBean logPbBean = aweme.getLogPbBean();
                if (logPbBean != null) {
                    str = logPbBean.getImprId();
                }
                c188727au.LJIIIZ("impression_id", str);
                FMX.LJIIL("invalid_anchor", c188727au.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$8(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        Aweme aweme;
        Object LIZ;
        Object LLJJIII = C16880lQ.LLJJIII((Bundle) aCallableS81S0200000_3.l0, "from_aweme");
        AddYoursTopic addYoursTopic = null;
        if (LLJJIII instanceof Aweme) {
            aweme = (Aweme) LLJJIII;
        } else {
            aweme = null;
        }
        Object LLJJIII2 = C16880lQ.LLJJIII((Bundle) aCallableS81S0200000_3.l0, "topic");
        if (LLJJIII2 instanceof AddYoursTopic) {
            addYoursTopic = (AddYoursTopic) LLJJIII2;
        }
        AqS107S0300000_3 aqS107S0300000_3 = new AqS107S0300000_3((Aweme) aCallableS81S0200000_3.l1, aweme, addYoursTopic, 26);
        JSONObject jSONObject = new JSONObject();
        try {
            aqS107S0300000_3.invoke(jSONObject);
            FMX.LJIILJJIL("add_yours_client_show", jSONObject);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl == null || !C218998id.LIZ()) {
            return C76800UCe.LIZ;
        }
        C221018lt.LIZJ("AYEventTracking", "error occurs when assembling mob params", m10exceptionOrNullimpl);
        throw m10exceptionOrNullimpl;
    }

    public static final Object call$9(ACallableS81S0200000_3 aCallableS81S0200000_3) {
        C178476zT c178476zT = (C178476zT) aCallableS81S0200000_3.l0;
        Object[] objArr = (Object[]) aCallableS81S0200000_3.l1;
        c178476zT.getClass();
        HashMap hashMap = (HashMap) objArr[0];
        c178476zT.LJLIL = CastIntegerProtector.parseInt((String) hashMap.get("type"));
        return FeedActionApi.LIZJ(hashMap);
    }

    public ACallableS81S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
