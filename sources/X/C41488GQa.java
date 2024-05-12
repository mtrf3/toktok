package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GQa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41488GQa {
    public final void LIZ(VideoPublishEditModel editModel, Collection collection) {
        o.LJIIIZ(editModel, "editModel");
        if (C40982G6o.LIZ() && (!collection.isEmpty())) {
            CaptionModel captionModel = editModel.creativeModel.postPageModel.captionModel;
            String str = captionModel.markupText;
            List<AVTextExtraStruct> list = captionModel.markupExtra;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            C45322HqY c45322HqY = new C45322HqY((CharSequence) str, (List) list);
            CharSequence charSequence = c45322HqY.LJLJI;
            List list2 = c45322HqY.LJLILLLLZI;
            if (charSequence != null && charSequence.length() != 0 && !collection.isEmpty()) {
                List LLJILJILJ = ORZ.LLJILJILJ(new C41495GQh(new GQU(true, GA9.LIZ())).LIZJ(charSequence, list2));
                Iterator it = collection.iterator();
                while (true) {
                    Object obj = null;
                    if (it.hasNext()) {
                        AVChallenge aVChallenge = (AVChallenge) it.next();
                        Iterator it2 = ((ArrayList) LLJILJILJ).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                AbstractC41507GQt abstractC41507GQt = (AbstractC41507GQt) it2.next();
                                if (abstractC41507GQt instanceof GR9) {
                                    String str3 = ((GR9) abstractC41507GQt).LJIIIZ;
                                    if (str3 != null) {
                                        if (o.LJ(str3, aVChallenge.getChallengeName())) {
                                            it2.remove();
                                            if (it2.hasNext()) {
                                                Object next = it2.next();
                                                o.LJII(next, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lexical.platform.textblock.TikTokLexicalTextBlock");
                                                AbstractC41508GQu abstractC41508GQu = (AbstractC41508GQu) next;
                                                if (OAC.LJIIIZ(abstractC41508GQu)) {
                                                    C41503GQp c41503GQp = (C41503GQp) abstractC41508GQu;
                                                    C41490GQc textMapper = C41490GQc.LJLIL;
                                                    o.LJIIIZ(textMapper, "textMapper");
                                                    c41503GQp.LJIIIZ = (String) textMapper.invoke(c41503GQp.LJIIIZ);
                                                }
                                                if ((abstractC41508GQu instanceof C41503GQp) && abstractC41508GQu.LJIILL().length() == 0) {
                                                    it2.remove();
                                                }
                                            }
                                        }
                                    } else {
                                        o.LJIJI("hashtagName");
                                        throw null;
                                    }
                                }
                            }
                        }
                    } else {
                        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJILJILJ, 10));
                        ArrayList arrayList2 = (ArrayList) LLJILJILJ;
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((AbstractC41507GQt) it3.next()).LJIILLIIL(""));
                        }
                        Iterator it4 = arrayList.iterator();
                        if (it4.hasNext()) {
                            obj = it4.next();
                            while (it4.hasNext()) {
                                obj = i0.LJFF((String) obj, (String) it4.next());
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            ORS.LJJLIIIJILLIZJL(((AbstractC41507GQt) it5.next()).LJI(), arrayList3);
                        }
                        c45322HqY = new C45322HqY((CharSequence) str2, (List) arrayList3);
                    }
                }
            }
            CharSequence charSequence2 = c45322HqY.LJLJI;
            List<AVTextExtraStruct> list3 = c45322HqY.LJLILLLLZI;
            editModel.creativeModel.postPageModel.captionModel.markupText = charSequence2.toString();
            CaptionModel captionModel2 = editModel.creativeModel.postPageModel.captionModel;
            captionModel2.getClass();
            o.LJIIIZ(list3, "<set-?>");
            captionModel2.markupExtra = list3;
        }
    }
}
