package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.viewmodel;

import X.AbstractC65590Pog;
import X.C106624Gk;
import X.C32I;
import X.C47261Igj;
import X.C71572rR;
import X.C71882rw;
import X.C72422so;
import X.C89123ee;
import X.C89133ef;
import X.OJD;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class VideoStickerCreationViewModel extends ViewModel {
    public static final C89123ee LJLJJLL = new C89123ee();
    public static final OJD LJLJL = new OJD("[0-9\"#$%&!'()*+,-./:;\\\\<=>?@\\[\\]^_`{|}~εφ⌐¬αßΓπΣσµτΦΘΩδ⌐¬ªº¿¡«»·‚„…†‡ˆ‹‘’“”–—›¦¨¯´¸▬⌂░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀■$¢£¥₧€¤%+<=>~½¼∞∩≡±≥≤⌠⌡÷≈°∙√ⁿ²‰³¹¾×☺☻♥♦♣♠•◘○◙♂♀♪♫☼™©®►◄↕↨↑↓→←∟↔▲▼‼¶§]");
    public static final OJD LJLJLJ = new OJD("[\\n\\s]+");
    public long LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public AbstractC65590Pog<String> LJLJJL;

    public static List gv0() {
        C71882rw LJIIL;
        List LJJIJIL = C47261Igj.LJJIJIL(new C106624Gk(7));
        LJJIJIL.add(new C89133ef());
        LJIIL = r0.LJIIL(C71572rR.LJII.LJ());
        List<StickerSetInfo> list = (List) LJIIL.LIZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (StickerSetInfo stickerSetInfo : list) {
                C72422so c72422so = new C72422so();
                c72422so.LIZIZ = stickerSetInfo;
                arrayList.add(c72422so);
            }
            if (arrayList.size() >= 2) {
                LJJIJIL.addAll(arrayList.subList(0, 2));
            } else {
                LJJIJIL.addAll(arrayList);
            }
        }
        return LJJIJIL;
    }

    public VideoStickerCreationViewModel(ArrayList<String> arrayList) {
        LJLJJLL.getClass();
        this.LJLJJL = C89123ee.LIZ(arrayList);
    }
}
