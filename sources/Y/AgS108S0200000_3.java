package Y;

import X.A2F;
import X.A2G;
import X.A2H;
import X.A2I;
import X.A2V;
import X.C10I;
import X.C10K;
import X.C217808gi;
import X.C217918gt;
import X.C218048h6;
import X.C223658q9;
import X.C32I;
import X.C3C5;
import X.C76800UCe;
import X.C82544WaS;
import X.C84942XVi;
import X.C84943XVj;
import X.InterfaceC67352kd;
import X.Y9G;
import com.ss.android.ugc.aweme.comment.ICommentFavoriteService;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionStickerRecommendViewModel;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionStickerSearchViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AgS108S0200000_3 implements C10I {
    public final int $t;
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
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS108S0200000_3 agS108S0200000_3, C10K c10k) {
        if (C82544WaS.LJ(c10k)) {
            MentionStickerRecommendViewModel mentionStickerRecommendViewModel = (MentionStickerRecommendViewModel) agS108S0200000_3.l0;
            mentionStickerRecommendViewModel.getClass();
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) agS108S0200000_3.l1;
            A2F a2f = A2G.LIZ;
            MentionStickerRecommendViewModel mentionStickerRecommendViewModel2 = (MentionStickerRecommendViewModel) agS108S0200000_3.l0;
            List<Y9G> list = ((C217808gi) c10k.LJIIJJI()).LJLILLLLZI;
            mentionStickerRecommendViewModel2.getClass();
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Y9G> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C218048h6(it.next()));
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (hashSet.add(((C218048h6) next).LJLIL.LIZ)) {
                    arrayList2.add(next);
                }
            }
            a2f.getClass();
            A2H LIZ = A2F.LIZ(arrayList2);
            C3C5.m7constructorimpl(LIZ);
            interfaceC67352kd.resumeWith(LIZ);
        } else {
            InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) agS108S0200000_3.l1;
            A2F a2f2 = A2G.LIZ;
            Exception exc = new Exception("Sticker data fetch failed");
            a2f2.getClass();
            A2I LIZJ = A2F.LIZJ(exc);
            C3C5.m7constructorimpl(LIZJ);
            interfaceC67352kd2.resumeWith(LIZJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS108S0200000_3 agS108S0200000_3, C10K c10k) {
        if (C82544WaS.LJ(c10k)) {
            if (((C217808gi) c10k.LJIIJJI()).LJLIL.LIZJ) {
                InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) agS108S0200000_3.l0;
                A2V LJ = A2F.LJ(A2G.LIZ, null, Boolean.TRUE, ((MentionStickerSearchViewModel) agS108S0200000_3.l1).gv0(((C217808gi) c10k.LJIIJJI()).LJLILLLLZI), 1);
                C3C5.m7constructorimpl(LJ);
                interfaceC67352kd.resumeWith(LJ);
            } else {
                InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) agS108S0200000_3.l0;
                A2F a2f = A2G.LIZ;
                List<C217918gt> gv0 = ((MentionStickerSearchViewModel) agS108S0200000_3.l1).gv0(((C217808gi) c10k.LJIIJJI()).LJLILLLLZI);
                a2f.getClass();
                A2H LIZ = A2F.LIZ(gv0);
                C3C5.m7constructorimpl(LIZ);
                interfaceC67352kd2.resumeWith(LIZ);
            }
        } else {
            InterfaceC67352kd interfaceC67352kd3 = (InterfaceC67352kd) agS108S0200000_3.l0;
            A2F a2f2 = A2G.LIZ;
            Exception exc = new Exception("Mention sticker search fail");
            a2f2.getClass();
            A2I LIZJ = A2F.LIZJ(exc);
            C3C5.m7constructorimpl(LIZJ);
            interfaceC67352kd3.resumeWith(LIZJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS108S0200000_3 agS108S0200000_3, C10K c10k) {
        if (C82544WaS.LJ(c10k)) {
            if (((C217808gi) c10k.LJIIJJI()).LJLIL.LIZJ) {
                InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) agS108S0200000_3.l0;
                A2V LJ = A2F.LJ(A2G.LIZ, null, Boolean.TRUE, ((MentionStickerSearchViewModel) agS108S0200000_3.l1).gv0(((C217808gi) c10k.LJIIJJI()).LJLILLLLZI), 1);
                C3C5.m7constructorimpl(LJ);
                interfaceC67352kd.resumeWith(LJ);
            } else {
                InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) agS108S0200000_3.l0;
                A2F a2f = A2G.LIZ;
                List<C217918gt> gv0 = ((MentionStickerSearchViewModel) agS108S0200000_3.l1).gv0(((C217808gi) c10k.LJIIJJI()).LJLILLLLZI);
                a2f.getClass();
                A2H LIZ = A2F.LIZ(gv0);
                C3C5.m7constructorimpl(LIZ);
                interfaceC67352kd2.resumeWith(LIZ);
            }
        } else {
            InterfaceC67352kd interfaceC67352kd3 = (InterfaceC67352kd) agS108S0200000_3.l0;
            A2F a2f2 = A2G.LIZ;
            Exception exc = new Exception("Mention sticker search fail");
            a2f2.getClass();
            A2I LIZJ = A2F.LIZJ(exc);
            C3C5.m7constructorimpl(LIZJ);
            interfaceC67352kd3.resumeWith(LIZJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS108S0200000_3 agS108S0200000_3, C10K t) {
        int i;
        o.LJIIIZ(t, "t");
        if (!t.LJIILJJIL() && !t.LJIIL()) {
            ((VideoReplyStruct) agS108S0200000_3.l0).setCollectStat(0);
            ICommentFavoriteService LIZJ = CommentFavoriteServiceImpl.LIZJ();
            String valueOf = String.valueOf(((VideoReplyStruct) agS108S0200000_3.l0).getCommentId());
            Integer collectStat = ((VideoReplyStruct) agS108S0200000_3.l0).getCollectStat();
            if (collectStat != null) {
                i = collectStat.intValue();
            } else {
                i = -1;
            }
            LIZJ.LIZ(i, valueOf);
            ((C223658q9) agS108S0200000_3.l1).LJJIII(R.string.ga6, 0, 0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS108S0200000_3 agS108S0200000_3, C10K t) {
        int i;
        o.LJIIIZ(t, "t");
        if (!t.LJIILJJIL() && !t.LJIIL()) {
            ((VideoReplyStruct) agS108S0200000_3.l0).setCollectStat(1);
            ICommentFavoriteService LIZJ = CommentFavoriteServiceImpl.LIZJ();
            String valueOf = String.valueOf(((VideoReplyStruct) agS108S0200000_3.l0).getCommentId());
            Integer collectStat = ((VideoReplyStruct) agS108S0200000_3.l0).getCollectStat();
            if (collectStat != null) {
                i = collectStat.intValue();
            } else {
                i = -1;
            }
            LIZJ.LIZ(i, valueOf);
            ((C223658q9) agS108S0200000_3.l1).LJJIII(R.string.ga4, R.raw.icon_tick_fill, R.attr.e8);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$5(AgS108S0200000_3 agS108S0200000_3, C10K c10k) {
        C84943XVj c84943XVj = (C84943XVj) agS108S0200000_3.l0;
        Effect effect = (Effect) agS108S0200000_3.l1;
        if (!c84943XVj.LIZJ(c10k)) {
            C84942XVi c84942XVi = c84943XVj.LIZ;
            c84942XVi.LIZJ(effect, c84942XVi.LJIIJJI);
            return null;
        }
        return null;
    }

    public AgS108S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
