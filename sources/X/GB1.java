package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GB1<METADATA> {
    public final InterfaceC41097GAz<METADATA> LIZ;
    public final GQF<METADATA> LIZIZ;
    public final String LIZJ;
    public final C62822Ol8 LIZLLL;
    public final List<AbstractC41507GQt<METADATA>> LJ;

    public final C0UE LIZ() {
        CharSequence charSequence;
        String legacyTextMetada = "UNABLE_OBTAIN";
        try {
            CharSequence LIZ = this.LIZ.LJ().LIZ();
            if (LIZ == null) {
                LIZ = "";
            }
            ORV LIZ2 = this.LIZIZ.LIZIZ(LIZ, GQ6.LIZ(this.LIZ.LIZ(), this.LIZJ)).LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("block size: ");
            LIZ3.append(LIZ2.size());
            LIZIZ(X1D.LIZIZ(LIZ3));
            return new C0UE(LIZ, LIZ2);
        } catch (Exception e) {
            LIZIZ("lexical editor state generation failed.");
            try {
                charSequence = this.LIZ.LJ().LIZ();
                if (charSequence == null) {
                    charSequence = "EMPTY";
                }
            } catch (Exception unused) {
                charSequence = "UNABLE_OBTAIN";
            }
            LIZIZ(charSequence.toString());
            try {
                legacyTextMetada = C60903NvH.LJIIJJI().LIZ().LJIILL(GQ6.LIZ(this.LIZ.LIZ(), this.LIZJ));
            } catch (Exception unused2) {
            }
            o.LJIIIIZZ(legacyTextMetada, "legacyTextMetada");
            LIZIZ(legacyTextMetada);
            GB5.Companion.getClass();
            throw new GB5("construct lexical editor state error", e);
        }
    }

    public static void LIZIZ(String str) {
        I9A.LIZJ("LexicalEditor", str);
    }

    public GB1(InterfaceC41097GAz<METADATA> platformEditor, GQF<METADATA> textBlockFactory) {
        o.LJIIIZ(platformEditor, "platformEditor");
        o.LJIIIZ(textBlockFactory, "textBlockFactory");
        this.LIZ = platformEditor;
        this.LIZIZ = textBlockFactory;
        this.LIZJ = C77339UWx.LIZJ();
        this.LIZLLL = C221108m2.LIZIZ(GB2.LJLIL);
        this.LJ = new ArrayList();
    }
}
