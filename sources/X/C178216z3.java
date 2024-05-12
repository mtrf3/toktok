package X;

import Y.AfS55S0100000_3;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.translation.CommentMultiTranslationApi$RealApi;
import com.ss.android.ugc.aweme.comment.translation.MultiTranslationBody;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6z3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178216z3 {
    public static final C178216z3 LIZ = new C178216z3();
    public static final java.util.Set<String> LJ = new HashSet();
    public static final java.util.Set<String> LIZIZ = new HashSet();
    public static final HashMap<String, Comment> LIZJ = new HashMap<>();
    public static final HashMap<String, Comment> LIZLLL = new HashMap<>();

    public static void LIZ(Comment comment) {
        Comment m103clone = comment.m103clone();
        o.LJIIIIZZ(m103clone, "comment.clone()");
        HashMap<String, Comment> hashMap = LIZJ;
        String cid = comment.getCid();
        o.LJIIIIZZ(cid, "comment.cid");
        hashMap.put(cid, m103clone);
        if (comment.getCommentType() == 0 && !C79004UzY.LJJIFFI(m103clone.getReplyComments())) {
            Comment comment2 = (Comment) ListProtector.get(m103clone.getReplyComments(), 0);
            String cid2 = comment2.getCid();
            o.LJIIIIZZ(cid2, "replyComment.cid");
            hashMap.put(cid2, comment2);
        }
    }

    public static NextLiveData LIZIZ(String str) {
        if (str == null) {
            str = "";
        }
        ((HashSet) LJ).add(str);
        NextLiveData LIZIZ2 = C57082Lw.LIZ.LIZIZ(str);
        o.LJIIIIZZ(LIZIZ2, "get().with(finalCid, TranslationEvent::class.java)");
        return LIZIZ2;
    }

    public static Comment LIZJ(String str) {
        if (str == null) {
            return null;
        }
        return LIZJ.get(str);
    }

    public static boolean LIZLLL(Comment comment) {
        if (comment == null) {
            return false;
        }
        return ((HashSet) LIZIZ).contains(comment.getCid());
    }

    public static void LJ(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Comment comment = (Comment) it.next();
            if (LIZJ(comment.getCid()) != null) {
                LJII(comment, LIZLLL.get(comment.getCid()), false);
                LIZIZ(comment.getCid()).setValue(new C176206vo(comment, 0));
            }
        }
    }

    public static void LJFF(Comment comment, boolean z) {
        if (comment == null) {
            return;
        }
        if (z) {
            java.util.Set<String> set = LIZIZ;
            String cid = comment.getCid();
            o.LJIIIIZZ(cid, "comment.cid");
            ((HashSet) set).add(cid);
            return;
        }
        ((HashSet) LIZIZ).remove(comment.getCid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    public static void LJI(List list, C74D c74d, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Comment comment = (Comment) it.next();
            Comment LIZJ2 = LIZJ(comment.getCid());
            if (LIZJ2 != null) {
                LJII(comment, LIZJ2, true);
                LIZIZ(comment.getCid()).setValue(new C176206vo(comment, 0));
            } else if (!AnonymousClass710.LIZIZ(comment, z)) {
                LJFF(comment, true);
                HashMap<String, Comment> hashMap = LIZLLL;
                String cid = comment.getCid();
                o.LJIIIIZZ(cid, "comment.cid");
                Comment m103clone = comment.m103clone();
                o.LJIIIIZZ(m103clone, "comment.clone()");
                hashMap.put(cid, m103clone);
                LIZIZ(comment.getCid()).setValue(new C176206vo(comment, 1));
                arrayList.add(comment);
            }
        }
        if (c74d != null) {
            c74d.LJFF = System.currentTimeMillis();
        }
        final C178206z2 c178206z2 = new C178206z2(arrayList, c74d);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = arrayList;
        while (true) {
            int min = Math.min(arrayList3.size(), 20);
            if (min <= 0) {
                break;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.subList(0, min).iterator();
            while (it2.hasNext()) {
                arrayList4.add(it2.next());
            }
            String str = c178206z2.LIZJ;
            MultiTranslationBody multiTranslationBody = new MultiTranslationBody();
            multiTranslationBody.trgLang = str;
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                multiTranslationBody.translationInfos.add(new MultiTranslationBody.TranslationContent(multiTranslationBody, AnonymousClass710.LIZJ((Comment) it3.next())));
            }
            String content = GsonProtectorUtils.toJson(new Gson(), multiTranslationBody.translationInfos);
            String str2 = c178206z2.LIZJ;
            o.LJIIIIZZ(content, "content");
            AbstractC73672Svk<MultiTranslationResult> multiTranslation = ((CommentMultiTranslationApi$RealApi) C46104I7o.LJIIZILJ(EFJ.LIZJ, CommentMultiTranslationApi$RealApi.class)).getMultiTranslation(str2, content, 2);
            o.LJIIIIZZ(multiTranslation, "getMultiTranslations(tarLanguage, content, scene)");
            arrayList2.add(multiTranslation.LJJL(T16.LIZ()));
            if (min == arrayList3.size()) {
                break;
            } else {
                arrayList3 = arrayList3.subList(min, arrayList3.size());
            }
        }
        final ArrayList arrayList5 = new ArrayList();
        AbstractC73672Svk.LJIIIZ(arrayList2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS55S0100000_3(arrayList5, 82), new AfS55S0100000_3(c178206z2, 83), new InterfaceC29937Boz() { // from class: X.6z1
            @Override // X.InterfaceC29937Boz
            public final void run() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("MultiCommentTranslationTask startTranslate onComplete ");
                LIZ2.append(arrayList5.size());
                LIZ2.append('}');
                C36922EeM.LJ(X1D.LIZIZ(LIZ2));
                if (arrayList5.size() == c178206z2.LIZ.size()) {
                    List<? extends Comment> list2 = c178206z2.LIZ;
                    List<TranslationResult> list3 = arrayList5;
                    int i = 0;
                    for (Comment comment2 : list2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            Comment comment3 = comment2;
                            String str3 = ((TranslationResult) ListProtector.get(list3, i)).translatedContent;
                            o.LJIIIIZZ(str3, "combinedTranslationRespo…[index].translatedContent");
                            AnonymousClass710.LIZ(comment3, str3);
                            comment3.setTranslated(true);
                            C178216z3.LJFF(comment3, false);
                            C178216z3.LIZ(comment3);
                            C178216z3.LIZIZ(comment3.getCid()).setValue(new C176206vo(comment3, true));
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                C74Z.LJJIJIIJI(true, c178206z2.LIZIZ);
            }
        });
    }

    public static void LJII(Comment comment, Comment comment2, boolean z) {
        if (comment != null && comment2 != null) {
            comment.setTranslated(z);
            comment.setText(comment2.getText());
            comment.setTextExtra(comment2.getTextExtra());
            if (comment.getCommentType() == 0 && !C79004UzY.LJJIFFI(comment.getReplyComments()) && !C79004UzY.LJJIFFI(comment2.getReplyComments())) {
                LJII((Comment) ListProtector.get(comment.getReplyComments(), 0), (Comment) ListProtector.get(comment2.getReplyComments(), 0), z);
            }
        }
    }
}
