package X;

import Y.ACallableS81S0200000_3;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: X.6wW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176646wW extends C8BR<C176596wR, InterfaceC176716wd> {
    public List<Object> LJLJJI;
    public Y88 LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ = 1;
    public Comment LJLJLLL;

    @Override // X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
    }

    public final void LJJIIJ() {
        Comment comment;
        String awemeId;
        List<CommentImageModel> list;
        K k = this.LJLILLLLZI;
        if (k == 0) {
            return;
        }
        if (this.LJLJL == 1 && (comment = this.LJLJLLL) != null) {
            if (comment.getAwemeId() == null) {
                awemeId = "";
            } else {
                awemeId = this.LJLJLLL.getAwemeId();
            }
            InterfaceC175126u4 LJIILJJIL = C7HV.LIZIZ.LJIILJJIL();
            String text = this.LJLJLLL.getText();
            List<TextExtraStruct> textExtra = this.LJLJLLL.getTextExtra();
            AbstractC176686wa LIZJ = C174446sy.LIZJ(this.LJLJLLL);
            if (LIZJ instanceof C176676wZ) {
                list = ((C176676wZ) LIZJ).LJIJ;
            } else {
                list = null;
            }
            LJIILJJIL.LJFF(awemeId, text, false, textExtra, list);
            ((InterfaceC176716wd) this.LJLILLLLZI).Nl0(LJJIII(awemeId));
            return;
        }
        ((InterfaceC176716wd) k).Nl0(this.LJLJLLL);
    }

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t;
        T t2;
        T t3;
        C176096vd.LIZIZ.LJ = System.currentTimeMillis();
        if (C78886Uxe.LJJIIJ(this.LJLJLLL)) {
            Y89.LIZLLL(1, this.LJLJLLL.getFakeId());
        }
        this.LJLJJI = null;
        if (this.LJLILLLLZI != 0 && (t3 = this.LJLIL) != 0 && t3.getData() != null && ((CommentResponse) this.LJLIL.getData()).upvote != null) {
            UpvoteStruct upvoteStruct = ((CommentResponse) this.LJLIL.getData()).upvote;
            C7HV.LIZIZ.LJIILJJIL().LIZLLL(upvoteStruct.getItemId(), upvoteStruct);
            C223688qC LJJLIIIJLJLI = V16.LJJLIIIJLJLI(upvoteStruct);
            LJJLIIIJLJLI.setFakeIsFromGiftBag(this.LJLJLLL.getFakeIsFromGiftBag());
            LJJLIIIJLJLI.setFakeId(this.LJLJLLL.getFakeId());
            if (!TextUtils.isEmpty(LJJLIIIJLJLI.getText())) {
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_comment", LJJLIIIJLJLI.getAwemeId());
                AwemeService.LIZ().e6(LJJLIIIJLJLI.getAwemeId());
            }
            ((InterfaceC176716wd) this.LJLILLLLZI).Td0(LJJLIIIJLJLI);
            return;
        }
        if (this.LJLILLLLZI != 0 && (t2 = this.LJLIL) != 0 && t2.getData() != null && ((CommentResponse) this.LJLIL.getData()).comment != null) {
            Comment comment = ((CommentResponse) this.LJLIL.getData()).comment;
            comment.parentCommentType = this.LJLJLJ;
            comment.setFakeIsFromGiftBag(this.LJLJLLL.getFakeIsFromGiftBag());
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_comment", comment.getAwemeId());
            AwemeService.LIZ().e6(comment.getAwemeId());
            if (this.LJLJJLL == 1 && !C79004UzY.LJJIFFI(comment.getReplyComments())) {
                Comment comment2 = (Comment) ListProtector.get(comment.getReplyComments(), 0);
                comment2.setCommentType(1);
                ArrayList arrayList = new ArrayList();
                comment.setReplyComments(null);
                comment.setCommentType(2);
                arrayList.add(comment);
                comment2.setReplyComments(arrayList);
                ((InterfaceC176716wd) this.LJLILLLLZI).Td0(comment2);
                return;
            }
            if (this.LJLJJLL == 2 && !C79004UzY.LJJIFFI(comment.getReplyComments())) {
                Comment comment3 = (Comment) ListProtector.get(comment.getReplyComments(), 0);
                comment.setReplyToReplyId(comment3.getCid());
                if (!TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                    comment.setReplyToNickName(comment3.getUser().getNickname());
                    comment.setReplyToUserName(comment3.getUser().getUniqueId());
                } else {
                    comment.setReplyToReplyId(CardStruct.IStatusCode.DEFAULT);
                }
                comment.setReplyComments(null);
                comment.setCommentType(2);
                ((InterfaceC176716wd) this.LJLILLLLZI).Td0(comment);
                return;
            }
            comment.setCommentType(this.LJLJJLL);
            if (comment.getReplyComments() == null) {
                comment.setReplyComments(new ArrayList());
            }
            ((InterfaceC176716wd) this.LJLILLLLZI).Td0(comment);
            return;
        }
        Comment comment4 = this.LJLJLLL;
        if (comment4 != null && comment4.getFakeGiftId() != 0 && this.LJLILLLLZI != 0 && (t = this.LJLIL) != 0 && t.getData() != null && ((CommentResponse) this.LJLIL.getData()).comment == null) {
            ((InterfaceC176716wd) this.LJLILLLLZI).He(this.LJLJLLL);
        }
    }

    public C176646wW() {
        LJJ(new AbstractC176586wQ<CommentResponse>() { // from class: X.6wR
            @Override // X.AbstractC176586wQ
            public final void LJIIIZ(CommentResponse commentResponse) {
                Comment comment;
                CommentResponse commentResponse2 = commentResponse;
                if (commentResponse2 != null && (comment = commentResponse2.comment) != null) {
                    this.LJLILLLLZI.LIZJ(comment.getCid(), "cid");
                }
                this.LJLILLLLZI.LJFF();
            }

            @Override // X.C8BS
            public final boolean checkParams(Object... objArr) {
                if (objArr != null && objArr.length == 1) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC176586wQ, X.C8BS
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                FGR.LIZIZ().LIZ(this.mHandler, new ACallableS81S0200000_3(this, objArr, 5), 0);
                return true;
            }
        });
    }

    @Override // X.C8BR
    public final void LIZIZ() {
        super.LIZIZ();
        Y88 y88 = this.LJLJJL;
        if (y88 != null) {
            y88.LIZ();
        }
    }

    @Override // X.C8BR
    public final boolean LJIILL(Object... objArr) {
        this.LJLJJI = new ArrayList();
        for (Object obj : objArr) {
            ((ArrayList) this.LJLJJI).add(obj);
        }
        C176096vd.LIZ(objArr);
        return super.LJIILL(objArr);
    }

    public final C223688qC LJJIII(String str) {
        UpvoteStruct LJIIIIZZ = V16.LJIIIIZZ(C7HV.LIZIZ.LJIIIZ(str));
        if (LJIIIIZZ != null) {
            C223688qC LJJLIIIJLJLI = V16.LJJLIIIJLJLI(LJIIIIZZ);
            Comment comment = this.LJLJLLL;
            if (comment != null && comment.getFakeGiftId() != 0) {
                LJJLIIIJLJLI.setFakeGiftId(this.LJLJLLL.getFakeGiftId());
                LJJLIIIJLJLI.setGiftEffectPath(this.LJLJLLL.getGiftEffectPath());
                LJJLIIIJLJLI.setFakeIsFromGiftBag(this.LJLJLLL.getFakeIsFromGiftBag());
            }
            Comment comment2 = this.LJLJLLL;
            if (comment2 != null) {
                LJJLIIIJLJLI.setFakeId(comment2.getFakeId());
                return LJJLIIIJLJLI;
            }
            return LJJLIIIJLJLI;
        }
        return null;
    }

    public final boolean LJJIIJZLJL(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        this.LJLJJI = arrayList;
        arrayList.addAll(Arrays.asList(objArr));
        if (this.LJLIL == 0 || LJJIFFI()) {
            return false;
        }
        return this.LJLIL.sendRequest(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJJIIZI(C176676wZ c176676wZ) {
        List<CommentImageModel> list;
        int i;
        this.LJLJL = c176676wZ.LJIILL;
        Comment comment = new Comment();
        this.LJLJLLL = comment;
        int i2 = c176676wZ.LJIIZILJ;
        comment.parentCommentType = i2;
        this.LJLJLJ = i2;
        comment.setStoryEmojiComment(c176676wZ.LJIILIIL);
        this.LJLJLLL.setPublishScenario(c176676wZ.LJIILJJIL);
        String str = c176676wZ.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        this.LJLJLLL.setAwemeId(str);
        String str3 = c176676wZ.LJIJI;
        if (TextUtils.isEmpty(str3)) {
            Aweme i6 = AwemeService.LIZ().i6(str);
            if (i6 != null) {
                str2 = i6.getAuthorUid();
            }
            str3 = str2;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (TextUtils.equals(str3, curUser.getUid())) {
            Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null) {
                LJIIIIZZ = EF7.LIZIZ();
            }
            this.LJLJLLL.setLabelText(LJIIIIZZ.getString(R.string.bwk));
            this.LJLJLLL.setLabelType(1);
        }
        curUser.setUserDisplayName(C1799274i.LJ(curUser, c176676wZ.LJIILLIIL));
        this.LJLJLLL.setUser(curUser);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(System.currentTimeMillis());
        LIZ.append(UUID.randomUUID());
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.LJLJLLL.setFakeId(LIZIZ);
        this.LJLJLLL.setText(c176676wZ.LIZIZ);
        this.LJLJLLL.setCommentType(this.LJLJJLL);
        this.LJLJLLL.setReplyComments(new ArrayList());
        this.LJLJLLL.setShouldDisplayFakeComment(true);
        if (!TextUtils.isEmpty(c176676wZ.LJ)) {
            this.LJLJLLL.setReplyId(c176676wZ.LIZJ);
            this.LJLJLLL.setTextExtra(c176676wZ.LIZLLL);
            this.LJLJLLL.setReplyToReplyId(c176676wZ.LJ);
            C174446sy.LJIIIZ(this.LJLJLLL, 2);
        } else if (!TextUtils.isEmpty(c176676wZ.LIZJ)) {
            this.LJLJLLL.setReplyId(c176676wZ.LIZJ);
            this.LJLJLLL.setTextExtra(c176676wZ.LIZLLL);
            this.LJLJLLL.setReplyToReplyId(c176676wZ.LIZJ);
            C174446sy.LJIIIZ(this.LJLJLLL, 2);
        } else {
            this.LJLJLLL.setReplyId(c176676wZ.LIZJ);
            this.LJLJLLL.setTextExtra(c176676wZ.LIZLLL);
            this.LJLJLLL.setReplyToReplyId(null);
            if (c176676wZ.LJIIIIZZ != 0 && !V0N.LJJII(c176676wZ.LJII)) {
                this.LJLJLLL.setFakeGiftId(c176676wZ.LJIIIIZZ);
                this.LJLJLLL.setGiftEffectPath(c176676wZ.LJIIJ);
                if (V0N.LJJII(c176676wZ.LIZIZ) && ((list = c176676wZ.LJIJ) == null || list.isEmpty())) {
                    this.LJLJLLL.setShouldDisplayFakeComment(false);
                }
            }
            C174446sy.LJIIIZ(this.LJLJLLL, 1);
        }
        this.LJLJLLL.setFakeIsFromGiftBag(c176676wZ.LJIIIZ);
        Comment comment2 = this.LJLJLLL;
        if (c176676wZ.LJIIJJI == 0) {
            i = 0;
        } else {
            i = 1;
        }
        comment2.setCommentStructType(i);
        this.LJLJLLL.setImageList(C78939UyV.LJFF(c176676wZ.LJIJ));
        c176676wZ.LJI = LIZIZ;
        C174446sy.LJ(this.LJLJLLL);
        C174446sy.LJIIIIZZ(this.LJLJLLL, c176676wZ);
        C176096vd.LIZ(c176676wZ);
        return LJJIIZ(this.LJLJLLL, c176676wZ);
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        Comment comment;
        String awemeId;
        C176096vd.LIZIZ.LJ = System.currentTimeMillis();
        if (C78886Uxe.LJJIIJ(this.LJLJLLL)) {
            Y89.LIZLLL(-1, this.LJLJLLL.getFakeId());
        }
        K k = this.LJLILLLLZI;
        if (k == 0) {
            return;
        }
        if (this.LJLJL == 1 && (comment = this.LJLJLLL) != null) {
            if (comment.getAwemeId() == null) {
                awemeId = "";
            } else {
                awemeId = this.LJLJLLL.getAwemeId();
            }
            C7HV.LIZIZ.LJIILJJIL().LIZ(awemeId);
            C223688qC LJJIII = LJJIII(awemeId);
            if (LJJIII != null) {
                ((InterfaceC176716wd) this.LJLILLLLZI).cj0(exc, LJJIII);
            } else {
                ((InterfaceC176716wd) this.LJLILLLLZI).cj0(exc, this.LJLJLLL);
            }
        } else {
            ((InterfaceC176716wd) k).cj0(exc, this.LJLJLLL);
        }
        T t = this.LJLIL;
        if (t != 0) {
            ((AbstractC176586wQ) t).LJLILLLLZI.LJI(C64920Pds.LIZ(EF7.LIZIZ(), exc));
        }
    }

    public final boolean LJJIIZ(final Comment comment, final C176676wZ c176676wZ) {
        List<CommentImageStruct> imageList;
        List<CommentImageStruct> imageList2;
        CommentImageStruct commentImageStruct;
        UrlModel originUrl;
        String uri;
        List<CommentImageModel> list;
        if (this.LJLJLLL == null) {
            this.LJLJLLL = comment;
        }
        LJJIIJ();
        final String fakeId = comment.getFakeId();
        if (comment.getImageList() == null || (((imageList = comment.getImageList()) != null && imageList.isEmpty()) || (imageList2 = comment.getImageList()) == null || (commentImageStruct = (CommentImageStruct) ListProtector.get(imageList2, 0)) == null || (originUrl = commentImageStruct.getOriginUrl()) == null || (((uri = originUrl.getUri()) != null && uri.length() != 0) || (list = c176676wZ.LJIJ) == null || list.isEmpty()))) {
            return super.LJIILL(c176676wZ);
        }
        final CommentImageModel commentImageModel = (CommentImageModel) ListProtector.get(c176676wZ.LJIJ, 0);
        if (this.LJLJJL == null) {
            this.LJLJJL = new Y88();
        }
        Y89.LJIIIZ(commentImageModel, fakeId);
        this.LJLJJL.LIZJ(commentImageModel, new SH7() { // from class: X.6wX
            @Override // X.SH7
            public final void onError() {
                C174446sy.LJFF(comment);
                K k = C176646wW.this.LJLILLLLZI;
                if (k != 0) {
                    ((InterfaceC176716wd) k).onImageUploadProgress(fakeId, -1);
                }
                Y89.LIZLLL(-1, fakeId);
            }

            @Override // X.SH7
            public final void onComplete(String str) {
                commentImageModel.setUri(str);
                C176646wW.this.LJIILL(c176676wZ);
            }

            @Override // X.SH7
            public final void onProgress(long j) {
                K k = C176646wW.this.LJLILLLLZI;
                if (k != 0) {
                    ((InterfaceC176716wd) k).onImageUploadProgress(fakeId, (int) j);
                }
            }
        });
        return true;
    }
}
