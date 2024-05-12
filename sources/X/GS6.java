package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GS6 implements InputFilter {
    public final /* synthetic */ GS5 LJLIL;

    public GS6(GS5 gs5) {
        this.LJLIL = gs5;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String string;
        if (o.LJ(charSequence.toString(), "\n")) {
            GSR gsr = this.LJLIL.LJIIL;
            if (gsr != null) {
                gsr.requestFocus();
            }
            GSR gsr2 = this.LJLIL.LJIIL;
            if (gsr2 != null) {
                gsr2.setSelection(0);
            }
            return "";
        }
        int length = this.LJLIL.LJIJJLI - (spanned.length() - (i4 - i3));
        if (C00F.LIZ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) == 1 || C00F.LIZ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) == 2 || C00F.LIZ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) == 3) {
            string = C60903NvH.LJ.getResources().getString(R.string.jk9, Integer.valueOf(this.LJLIL.LJIJJLI));
        } else {
            string = C60903NvH.LJ.getResources().getString(R.string.qim, Integer.valueOf(this.LJLIL.LJIJJLI));
        }
        o.LJIIIIZZ(string, "if (ExpandCharacterLimit…titleMaxLength)\n        }");
        if (length >= i2 - i) {
            return null;
        }
        if (length <= 0) {
            C164236cV.LIZLLL(this.LJLIL.LIZ);
            C5S1 c5s1 = new C5S1(C60903NvH.LJ);
            c5s1.LIZLLL(string);
            c5s1.LJ();
            return "";
        }
        C164236cV.LIZLLL(this.LJLIL.LIZ);
        int i5 = length + i;
        int i6 = i5 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i6))) {
            if (i6 == i) {
                C5S1 c5s12 = new C5S1(C60903NvH.LJ);
                c5s12.LIZLLL(string);
                c5s12.LJ();
                return "";
            }
            i5 = i6;
        }
        C5S1 c5s13 = new C5S1(C60903NvH.LJ);
        c5s13.LIZLLL(string);
        c5s13.LJ();
        return charSequence.subSequence(i, i5);
    }
}
