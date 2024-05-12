package Y;

import X.C10I;
import X.C10K;
import X.C176166vk;
import X.C185517Pv;
import X.C203717z5;
import X.C213358Yx;
import X.C2U8;
import X.C58096Mr6;
import X.C76800UCe;
import X.C84942XVi;
import X.C84943XVj;
import X.C8G4;
import X.C8G5;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.ICommentFavoriteService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment;
import com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectListAdapter;
import com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectViewHolder;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.IQuestionFavoriteService;
import com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.question.QuestionFavoriteServiceImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AgS49S0201000_3 implements C10I {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS49S0201000_3 agS49S0201000_3, C10K t) {
        o.LJIIIZ(t, "t");
        if (!t.LJIILJJIL() && !t.LJIIL()) {
            CommentCollectListAdapter commentCollectListAdapter = ((CommentCollectViewHolder) agS49S0201000_3.l0).commentCollectAdapter;
            if (commentCollectListAdapter != null) {
                commentCollectListAdapter.removeItem((Comment) agS49S0201000_3.l1);
            }
            if (agS49S0201000_3.i2 == 1) {
                ((Comment) agS49S0201000_3.l1).setCollectStatus(1);
            } else {
                ((Comment) agS49S0201000_3.l1).setCollectStatus(0);
            }
            C2U8.LIZ(new C176166vk((Comment) agS49S0201000_3.l1));
            ICommentFavoriteService LIZJ = CommentFavoriteServiceImpl.LIZJ();
            String cid = ((Comment) agS49S0201000_3.l1).getCid();
            o.LJIIIIZZ(cid, "comment.cid");
            LIZJ.LIZ(agS49S0201000_3.i2, cid);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS49S0201000_3 agS49S0201000_3, C10K t) {
        IQuestionFavoriteService iQuestionFavoriteService;
        o.LJIIIZ(t, "t");
        if (!t.LJIILJJIL() && !t.LJIIL()) {
            C8G5 c8g5 = ((C8G4) agS49S0201000_3.l0).LJLJJL;
            if (c8g5 != null) {
                ForumStruct item = (ForumStruct) agS49S0201000_3.l1;
                o.LJIIIZ(item, "item");
                List<ForumStruct> data = c8g5.getData();
                if (data != null) {
                    data.remove(item);
                }
                c8g5.notifyDataSetChanged();
                List<ForumStruct> data2 = c8g5.getData();
                if (data2 != null && data2.isEmpty()) {
                    Fragment fragment = c8g5.LJLILLLLZI;
                    o.LJII(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.business.question.QuestionCollectListFragment");
                    ((BaseCollectListFragment) fragment).Ne();
                }
            }
            if (agS49S0201000_3.i2 == 1) {
                ((ForumStruct) agS49S0201000_3.l1).setCollectStatus(1);
            } else {
                ((ForumStruct) agS49S0201000_3.l1).setCollectStatus(0);
            }
            C2U8.LIZ(new C185517Pv((ForumStruct) agS49S0201000_3.l1));
            Object LIZ = C58096Mr6.LIZ(IQuestionFavoriteService.class, false);
            if (LIZ != null) {
                iQuestionFavoriteService = (IQuestionFavoriteService) LIZ;
            } else {
                if (C58096Mr6.d7 == null) {
                    synchronized (IQuestionFavoriteService.class) {
                        if (C58096Mr6.d7 == null) {
                            C58096Mr6.d7 = new QuestionFavoriteServiceImpl();
                        }
                    }
                }
                iQuestionFavoriteService = C58096Mr6.d7;
            }
            iQuestionFavoriteService.LIZ(agS49S0201000_3.i2, String.valueOf(((ForumStruct) agS49S0201000_3.l1).getId()));
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS49S0201000_3 agS49S0201000_3, C10K c10k) {
        switch (agS49S0201000_3.i2) {
            case 0:
                C203717z5 c203717z5 = (C203717z5) agS49S0201000_3.l0;
                String str = (String) ((Serializable) agS49S0201000_3.l1);
                c203717z5.getClass();
                if (c10k.LJIILJJIL() || c10k.LJIIL()) {
                    c203717z5.LJLIL.onFailed(c10k.LJIIJ());
                } else {
                    CollectMusicResponse collectMusicResponse = (CollectMusicResponse) c10k.LJIIJJI();
                    collectMusicResponse.action = c203717z5.LJLIL.LJLJJI;
                    Message message = new Message();
                    message.obj = collectMusicResponse;
                    c203717z5.handleMsg(message);
                    int i = 1;
                    if (c203717z5.LJLIL.LJLJJI != 1) {
                        i = 0;
                    }
                    C2U8.LIZ(new C213358Yx(str, i, false));
                }
                return null;
            default:
                C84943XVj c84943XVj = (C84943XVj) agS49S0201000_3.l0;
                Effect effect = (Effect) ((Serializable) agS49S0201000_3.l1);
                if (!c84943XVj.LIZJ(c10k)) {
                    C84942XVi c84942XVi = c84943XVj.LIZ;
                    c84942XVi.LIZJ(effect, c84942XVi.LJIIJJI);
                }
                return null;
        }
    }

    public AgS49S0201000_3(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
