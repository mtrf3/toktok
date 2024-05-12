package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4Gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106624Gk extends C72462ss {
    public final C110154Tz LIZIZ = C4VN.LIZ();
    public int LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC105334Bl
    public final int LJ() {
        return 5;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final int LJFF() {
        return -1;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final String LJII() {
        return String.valueOf(5);
    }

    @Override // X.C72462ss
    public final int LJIIL() {
        return 20;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final int LIZIZ() {
        int i;
        if (this.LIZJ == 0) {
            C110154Tz c110154Tz = this.LIZIZ;
            int i2 = this.LIZLLL;
            c110154Tz.getClass();
            C4ZV.LIZ.LIZIZ(i2);
            List list = (List) ((LinkedHashMap) C4ZV.LJ).get(Integer.valueOf(i2));
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            this.LIZJ = i;
        }
        int i3 = this.LIZJ;
        if (i3 == 0) {
            return 1;
        }
        return AnonymousClass030.LIZJ(i3, 1, 20, 1);
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final String LJIIIZ() {
        String previewEmoji;
        C110154Tz c110154Tz = this.LIZIZ;
        int i = this.LIZLLL;
        c110154Tz.getClass();
        C4ZV.LIZ.LIZIZ(i);
        List list = (List) ((LinkedHashMap) C4ZV.LJ).get(Integer.valueOf(i));
        if (list == null || list.size() <= 0 || (previewEmoji = ((ImSysEmojiModel) ListProtector.get(list, 0)).getPreviewEmoji()) == null) {
            return "😃";
        }
        return previewEmoji;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final List<C105454Bx> LJIIJJI() {
        ArrayList arrayList = new ArrayList();
        C110154Tz c110154Tz = this.LIZIZ;
        int i = this.LIZLLL;
        c110154Tz.getClass();
        List<ImSysEmojiModel> LIZIZ = C110154Tz.LIZIZ(i);
        if (LIZIZ == null) {
            return arrayList;
        }
        for (ImSysEmojiModel imSysEmojiModel : LIZIZ) {
            C105454Bx c105454Bx = new C105454Bx();
            c105454Bx.LIZIZ = imSysEmojiModel.getPreviewEmoji();
            c105454Bx.LIZJ = imSysEmojiModel;
            if (this.LIZLLL == 2) {
                c105454Bx.LJI = new CommentPersonalizedEmoji(imSysEmojiModel.getPreviewEmoji(), 0, "", "emoji_board");
            }
            arrayList.add(c105454Bx);
        }
        return arrayList;
    }

    public C106624Gk(int i) {
        this.LIZLLL = i;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final List<C105454Bx> LIZJ(int i) {
        ArrayList arrayList = new ArrayList();
        C110154Tz c110154Tz = this.LIZIZ;
        int i2 = this.LIZLLL;
        int i3 = i * 20;
        c110154Tz.getClass();
        if (!C110154Tz.LIZ(i2)) {
            return arrayList;
        }
        List<ImSysEmojiModel> LIZIZ = C4ZV.LIZ.LIZIZ(i2);
        ArrayList arrayList2 = new ArrayList();
        if (i3 < LIZIZ.size()) {
            int i4 = 0;
            for (ImSysEmojiModel imSysEmojiModel : LIZIZ) {
                if (i4 >= i3 && i4 < i3 + 20) {
                    arrayList2.add(imSysEmojiModel);
                }
                i4++;
                if (i4 >= i3 + 20) {
                    break;
                }
            }
            int size = 20 - arrayList2.size();
            if (size > 0) {
                int i5 = 0;
                do {
                    arrayList2.add(new ImSysEmojiModel());
                    i5++;
                } while (i5 < size);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ImSysEmojiModel imSysEmojiModel2 = (ImSysEmojiModel) it.next();
            C105454Bx c105454Bx = new C105454Bx();
            c105454Bx.LIZIZ = imSysEmojiModel2.getPreviewEmoji();
            c105454Bx.LIZJ = imSysEmojiModel2;
            if (this.LIZLLL == 2) {
                c105454Bx.LJI = new CommentPersonalizedEmoji(imSysEmojiModel2.getPreviewEmoji(), 0, "", "emoji_board");
            }
            arrayList.add(c105454Bx);
        }
        C105454Bx c105454Bx2 = new C105454Bx();
        c105454Bx2.LIZ = R.drawable.asl;
        arrayList.add(c105454Bx2);
        return arrayList;
    }
}
