package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C118914lb extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C118914lb(QnaAskQuestionFragment qnaAskQuestionFragment) {
        super(0, qnaAskQuestionFragment, QnaAskQuestionFragment.class, "onClickRecordQuestion", "onClickRecordQuestion()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ArrayList arrayList;
        QnaAskQuestionFragment qnaAskQuestionFragment = (QnaAskQuestionFragment) this.receiver;
        qnaAskQuestionFragment.wl();
        C19K c19k = (C19K) qnaAskQuestionFragment._$_findCachedViewById(R.id.a8v);
        if (c19k != null) {
            String creatorId = ((RBX) HG3.LJIILL()).getCurUserId();
            String LJI = AV1.LJI(((RBX) HG3.LJIILL()).getCurUser());
            String avatarUrl = ((RBX) HG3.LJIILL()).getAvatarUrl();
            String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
            List<? extends User> list = qnaAskQuestionFragment.LJLJJL;
            if (list != null) {
                arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<? extends User> it = list.iterator();
                while (it.hasNext()) {
                    String uid = it.next().getUid();
                    o.LJIIIIZZ(uid, "it.uid");
                    arrayList.add(Long.valueOf(CastLongProtector.parseLong(uid)));
                }
            } else {
                arrayList = null;
            }
            Context context = c19k.getContext();
            if (context != null) {
                qnaAskQuestionFragment.Hl(0, false);
                CommentService LJJL = CommentServiceImpl.LJJL();
                o.LJIIIIZZ(LJJL, "get().getService(CommentService::class.java)");
                o.LJIIIIZZ(creatorId, "creatorId");
                long parseLong = CastLongProtector.parseLong(creatorId);
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(avatarUrl);
                urlModel.setUrlList(C47261Igj.LJJIJ(avatarUrl));
                String charSequence = s.LJZI(String.valueOf(c19k.getText())).toString();
                List list2 = arrayList;
                if (arrayList == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                LJJL.LJIJI(context, new QaStruct(0L, parseLong, 0L, urlModel, LJI, charSequence, curSecUserId, list2, null, null, null, null, null, qnaAskQuestionFragment.Dl(), 0, null, null, 122629, null), qnaAskQuestionFragment.xl().getEnterFrom(), "ask_textual_question", "question", qnaAskQuestionFragment.xl().getQaOrigin(), null, null);
            }
        }
        return C76800UCe.LIZ;
    }
}
