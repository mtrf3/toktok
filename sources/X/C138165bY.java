package X;

import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.5bY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138165bY extends AbstractC65781Prl implements InterfaceC88472Yns<C139135d7, C139135d7> {
    public static final C138165bY LJLIL = new C138165bY();

    public C138165bY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C139135d7 invoke(C139135d7 c139135d7) {
        C139135d7 setState = c139135d7;
        o.LJIIIZ(setState, "$this$setState");
        String string = SpeakerCenter.LIZ.getString("setCheckText", "");
        o.LJIIIIZZ(string, "keva.getString(\"setCheckText\", \"\")");
        return C139135d7.LIZ(setState, false, false, false, string, false, null, null, 119);
    }
}
